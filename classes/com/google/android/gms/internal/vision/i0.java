// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.content.pm.ProviderInfo;
import android.util.Log;
import android.net.Uri;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;

public final class i0
{
    private static volatile d1<Boolean> a;
    private static final Object b;
    
    static {
        i0.a = d1.d();
        b = new Object();
    }
    
    private static boolean a(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        try {
            if ((packageManager.getApplicationInfo("com.google.android.gms", 0).flags & 0x81) != 0x0) {
                return true;
            }
            return false;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    public static boolean b(final Context context, final Uri uri) {
        final String authority = uri.getAuthority();
        final boolean equals = "com.google.android.gms.phenotype".equals(authority);
        final boolean b = false;
        if (!equals) {
            final StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        }
        if (!i0.a.b()) {
            synchronized (i0.b) {
                if (i0.a.b()) {
                    return i0.a.c();
                }
                boolean b2 = false;
                Label_0169: {
                    if (!"com.google.android.gms".equals(context.getPackageName())) {
                        final ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0);
                        if (resolveContentProvider == null || !"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                            b2 = false;
                            break Label_0169;
                        }
                    }
                    b2 = true;
                }
                boolean b3 = b;
                if (b2) {
                    b3 = b;
                    if (a(context)) {
                        b3 = true;
                    }
                }
                i0.a = d1.a(b3);
            }
        }
        return i0.a.c();
    }
}
