// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import androidx.annotation.g0;
import androidx.annotation.b1;
import androidx.annotation.j0;
import android.content.pm.ServiceInfo;
import android.content.pm.ResolveInfo;
import android.content.ComponentName;
import android.util.Log;
import android.content.Context;
import java.util.ArrayDeque;
import android.content.Intent;
import java.util.Queue;
import androidx.annotation.k0;
import f2.a;

@a
public class u0
{
    public static final int e = -1;
    @a
    public static final int f = 500;
    private static u0 g;
    @k0
    @d6.a("this")
    private String a;
    private Boolean b;
    private Boolean c;
    private final Queue<Intent> d;
    
    private u0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = new ArrayDeque<Intent>();
    }
    
    private int a(final Context context, final Intent intent) {
        final String f = this.f(context, intent);
        if (f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String concat;
                if (f.length() != 0) {
                    concat = "Restricting intent to a specific service: ".concat(f);
                }
                else {
                    concat = new String("Restricting intent to a specific service: ");
                }
                Log.d("FirebaseMessaging", concat);
            }
            intent.setClassName(context.getPackageName(), f);
        }
        try {
            ComponentName componentName;
            if (this.e(context)) {
                componentName = e1.e(context, intent);
            }
            else {
                componentName = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                return 404;
            }
            return -1;
        }
        catch (IllegalStateException obj) {
            final String value = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(value.length() + 45);
            sb.append("Failed to start service while in background: ");
            sb.append(value);
            Log.e("FirebaseMessaging", sb.toString());
            return 402;
        }
        catch (SecurityException ex) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", (Throwable)ex);
            return 401;
        }
    }
    
    static u0 b() {
        synchronized (u0.class) {
            if (u0.g == null) {
                u0.g = new u0();
            }
            return u0.g;
        }
    }
    
    @k0
    private String f(final Context context, final Intent intent) {
        synchronized (this) {
            final String a = this.a;
            if (a != null) {
                return a;
            }
            final ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null) {
                final ServiceInfo serviceInfo = resolveService.serviceInfo;
                if (serviceInfo != null) {
                    if (context.getPackageName().equals(serviceInfo.packageName)) {
                        final String name = serviceInfo.name;
                        if (name != null) {
                            String a2;
                            if (name.startsWith(".")) {
                                final String value = String.valueOf(context.getPackageName());
                                final String value2 = String.valueOf(serviceInfo.name);
                                if (value2.length() != 0) {
                                    a2 = value.concat(value2);
                                }
                                else {
                                    a2 = new String(value);
                                }
                            }
                            else {
                                a2 = serviceInfo.name;
                            }
                            return this.a = a2;
                        }
                    }
                    final String packageName = serviceInfo.packageName;
                    final String name2 = serviceInfo.name;
                    final StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 94 + String.valueOf(name2).length());
                    sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                    sb.append(packageName);
                    sb.append("/");
                    sb.append(name2);
                    Log.e("FirebaseMessaging", sb.toString());
                    return null;
                }
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        }
    }
    
    @b1
    public static void g(@j0 final u0 g) {
        u0.g = g;
    }
    
    @g0
    Intent c() {
        return this.d.poll();
    }
    
    boolean d(final Context context) {
        if (this.c == null) {
            this.c = (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.b && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.c;
    }
    
    boolean e(final Context context) {
        if (this.b == null) {
            this.b = (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.b && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.b;
    }
    
    @g0
    public int h(@j0 final Context context, @j0 Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.d.offer(intent);
        intent = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent.setPackage(context.getPackageName());
        return this.a(context, intent);
    }
}
