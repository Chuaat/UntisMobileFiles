// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.phenotype;

import android.os.Build$VERSION;
import android.annotation.SuppressLint;
import android.content.Context;

public final class h<T>
{
    private static final Object a;
    @SuppressLint({ "StaticFieldLeak" })
    private static Context b;
    private static boolean c = false;
    private static volatile Boolean d;
    private static volatile Boolean e;
    
    static {
        a = new Object();
    }
    
    public static void a(Context b) {
        synchronized (h.a) {
            if (Build$VERSION.SDK_INT < 24 || !b.isDeviceProtectedStorage()) {
                final Context applicationContext = b.getApplicationContext();
                if (applicationContext != null) {
                    b = applicationContext;
                }
            }
            if (h.b != b) {
                h.d = null;
            }
            h.b = b;
            // monitorexit(h.a)
            h.c = false;
        }
    }
    
    public static void b(final Context context) {
        if (h.b == null) {
            a(context);
        }
    }
}
