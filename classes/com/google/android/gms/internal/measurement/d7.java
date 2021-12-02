// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import android.content.Context;
import androidx.collection.a;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import androidx.annotation.w;
import java.util.Map;

public final class d7 implements m6
{
    @w("SharedPreferencesLoader.class")
    private static final Map<String, d7> c;
    private final SharedPreferences a;
    private final SharedPreferences$OnSharedPreferenceChangeListener b;
    
    static {
        c = new a<String, d7>();
    }
    
    static d7 b(Context allowThreadDiskReads, final String s) {
        if (!d6.a()) {
            synchronized (d7.class) {
                final d7 d7 = com.google.android.gms.internal.measurement.d7.c.get(null);
                if (d7 != null) {
                    return d7;
                }
                allowThreadDiskReads = (Context)StrictMode.allowThreadDiskReads();
                try {
                    throw null;
                }
                finally {
                    StrictMode.setThreadPolicy((StrictMode$ThreadPolicy)allowThreadDiskReads);
                }
            }
        }
        throw null;
    }
    
    static void c() {
        synchronized (d7.class) {
            final Map<String, d7> c = d7.c;
            final Iterator<d7> iterator = c.values().iterator();
            if (!iterator.hasNext()) {
                c.clear();
                return;
            }
            final SharedPreferences a = iterator.next().a;
            throw null;
        }
    }
    
    @Override
    public final Object a(final String s) {
        throw null;
    }
}
