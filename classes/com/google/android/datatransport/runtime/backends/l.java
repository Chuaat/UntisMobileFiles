// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.backends;

import java.lang.reflect.InvocationTargetException;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import java.util.Iterator;
import android.os.Bundle;
import java.util.Collections;
import android.util.Log;
import androidx.annotation.k0;
import java.util.HashMap;
import e6.a;
import android.content.Context;
import java.util.Map;
import e6.f;

@f
class l implements e
{
    private static final String d = "BackendRegistry";
    private static final String e = "backend:";
    private final a a;
    private final j b;
    private final Map<String, n> c;
    
    @e6.a
    l(final Context context, final j j) {
        this(new a(context), j);
    }
    
    l(final a a, final j b) {
        this.c = new HashMap<String, n>();
        this.a = a;
        this.b = b;
    }
    
    @k0
    @Override
    public n j(final String s) {
        synchronized (this) {
            if (this.c.containsKey(s)) {
                return this.c.get(s);
            }
            final d b = this.a.b(s);
            if (b == null) {
                return null;
            }
            final n create = b.create(this.b.a(s));
            this.c.put(s, create);
            return create;
        }
    }
    
    static class a
    {
        private final Context a;
        private Map<String, String> b;
        
        a(final Context a) {
            this.b = null;
            this.a = a;
        }
        
        private Map<String, String> a(final Context context) {
            final Bundle d = d(context);
            if (d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            for (final String s : d.keySet()) {
                final Object value = d.get(s);
                if (value instanceof String && s.startsWith("backend:")) {
                    final String[] split = ((String)value).split(",", -1);
                    for (int length = split.length, i = 0; i < length; ++i) {
                        final String trim = split[i].trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, s.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }
        
        private Map<String, String> c() {
            if (this.b == null) {
                this.b = this.a(this.a);
            }
            return this.b;
        }
        
        private static Bundle d(final Context context) {
            try {
                final PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                final ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class)TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            }
            catch (PackageManager$NameNotFoundException ex) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }
        
        @k0
        d b(final String s) {
            final String className = this.c().get(s);
            if (className == null) {
                return null;
            }
            String s2 = null;
            try {
                return (d)Class.forName(className).asSubclass(d.class).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            }
            catch (InvocationTargetException ex2) {
                String.format("Could not instantiate %s", className);
                goto Label_0082;
            }
            catch (NoSuchMethodException ex2) {
                String.format("Could not instantiate %s", className);
            }
            catch (InstantiationException ex) {
                s2 = String.format("Could not instantiate %s.", className);
            }
            catch (IllegalAccessException ex) {
                s2 = String.format("Could not instantiate %s.", className);
            }
            catch (ClassNotFoundException ex) {
                s2 = String.format("Class %s is not found.", className);
            }
            final InstantiationException ex;
            Log.w("BackendRegistry", s2, (Throwable)ex);
            return null;
        }
    }
}
