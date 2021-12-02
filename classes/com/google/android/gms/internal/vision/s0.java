// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import java.util.Iterator;
import android.content.Context;
import java.util.ArrayList;
import androidx.collection.a;
import java.util.List;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import androidx.annotation.w;
import java.util.Map;

public final class s0 implements z
{
    @w("SharedPreferencesLoader.class")
    private static final Map<String, s0> f;
    private final SharedPreferences a;
    private final SharedPreferences$OnSharedPreferenceChangeListener b;
    private final Object c;
    private volatile Map<String, ?> d;
    @w("this")
    private final List<a0> e;
    
    static {
        f = new a<String, s0>();
    }
    
    private s0(final SharedPreferences a) {
        final v0 b = new v0(this);
        this.b = (SharedPreferences$OnSharedPreferenceChangeListener)b;
        this.c = new Object();
        this.e = new ArrayList<a0>();
        (this.a = a).registerOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)b);
    }
    
    static s0 b(final Context context, final String s) {
        if (t.a() && !s.startsWith("direct_boot:") && !t.b(context)) {
            return null;
        }
        synchronized (s0.class) {
            final Map<String, s0> f = s0.f;
            s0 s2;
            if ((s2 = f.get(s)) == null) {
                s2 = new s0(e(context, s));
                f.put(s, s2);
            }
            return s2;
        }
    }
    
    static void c() {
        synchronized (s0.class) {
            for (final s0 s0 : s0.f.values()) {
                s0.a.unregisterOnSharedPreferenceChangeListener(s0.b);
            }
            s0.f.clear();
        }
    }
    
    private static SharedPreferences e(final Context context, final String s) {
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (s.startsWith("direct_boot:")) {
                Context deviceProtectedStorageContext = context;
                if (t.a()) {
                    deviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                }
                return deviceProtectedStorageContext.getSharedPreferences(s.substring(12), 0);
            }
            return context.getSharedPreferences(s, 0);
        }
        finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
    
    @Override
    public final Object a(final String s) {
        Map<String, ?> d;
        if ((d = this.d) == null) {
            synchronized (this.c) {
                if ((d = this.d) == null) {
                    final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        d = (Map<String, ?>)this.a.getAll();
                        this.d = d;
                    }
                    finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
            }
        }
        if (d != null) {
            return d.get(s);
        }
        return null;
    }
}
