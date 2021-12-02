// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import android.os.RemoteException;
import java.util.concurrent.Callable;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.common.internal.t1;
import com.google.android.gms.dynamite.DynamiteModule;
import android.util.Log;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import android.content.Context;
import com.google.android.gms.common.internal.u1;
import c6.c;

@c
final class w
{
    private static volatile u1 a;
    private static final Object b;
    private static Context c;
    
    static {
        b = new Object();
    }
    
    static f0 a(final String s, final x x, final boolean b, final boolean b2) {
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return d(s, x, b, b2);
        }
        finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
    
    static void c(final Context context) {
        synchronized (w.class) {
            if (w.c == null) {
                if (context != null) {
                    w.c = context.getApplicationContext();
                }
            }
            else {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            }
        }
    }
    
    private static f0 d(String str, final x x, final boolean b, final boolean b2) {
        try {
            if (w.a == null) {
                com.google.android.gms.common.internal.x.k(w.c);
                synchronized (w.b) {
                    if (w.a == null) {
                        w.a = t1.x2(DynamiteModule.e(w.c, DynamiteModule.m, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            com.google.android.gms.common.internal.x.k(w.c);
            final d0 d0 = new d0(str, x, b, b2);
            try {
                if (w.a.d2(d0, f.z2(w.c.getPackageManager()))) {
                    return f0.a();
                }
                return f0.d(new y(b, str, x));
            }
            catch (RemoteException ex) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)ex);
                return f0.c("module call", (Throwable)ex);
            }
        }
        catch (DynamiteModule.a a) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)a);
            str = String.valueOf(a.getMessage());
            if (str.length() != 0) {
                str = "module init: ".concat(str);
            }
            else {
                str = new String("module init: ");
            }
            return f0.c(str, a);
        }
    }
}
