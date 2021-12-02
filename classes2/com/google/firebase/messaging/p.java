// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import com.google.android.gms.tasks.c;
import java.util.concurrent.Callable;
import android.util.Base64;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.util.v;
import android.util.Log;
import com.google.android.gms.tasks.m;
import android.content.Intent;
import java.util.concurrent.ExecutorService;
import androidx.annotation.j0;
import java.util.concurrent.Executor;
import android.content.Context;
import f2.a;

@a
public class p
{
    private static final Object c;
    @d6.a("lock")
    private static k1 d;
    private final Context a;
    private final Executor b;
    
    static {
        c = new Object();
    }
    
    public p(@j0 final Context a) {
        this.a = a;
        this.b = i.G;
    }
    
    public p(@j0 final Context a, @j0 final ExecutorService b) {
        this.a = a;
        this.b = b;
    }
    
    private static m<Integer> a(final Context context, final Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        return (m<Integer>)b(context, "com.google.firebase.MESSAGING_EVENT").c(intent).n(l.G, com.google.firebase.messaging.m.a);
    }
    
    private static k1 b(final Context context, final String s) {
        synchronized (p.c) {
            if (p.d == null) {
                p.d = new k1(context, "com.google.firebase.MESSAGING_EVENT");
            }
            return p.d;
        }
    }
    
    @d0
    public static void h() {
        synchronized (p.c) {
            p.d = null;
        }
    }
    
    @j0
    @a
    public m<Integer> g(@j0 final Intent intent) {
        final String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return this.i(this.a, intent);
    }
    
    @SuppressLint({ "InlinedApi" })
    @j0
    public m<Integer> i(@j0 final Context context, @j0 final Intent intent) {
        final boolean n = v.n();
        int n2 = 0;
        if (n) {
            n2 = n2;
            if (context.getApplicationInfo().targetSdkVersion >= 26) {
                n2 = 1;
            }
        }
        final int flags = intent.getFlags();
        if (n2 != 0 && (flags & 0x10000000) == 0x0) {
            return a(context, intent);
        }
        return (m<Integer>)com.google.android.gms.tasks.p.d(this.b, (Callable)new j(context, intent)).p(this.b, (c)new k(context, intent));
    }
}
