// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.wrappers;

import com.google.android.gms.common.util.v;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.k0;
import android.content.Context;

@f2.a
public class a
{
    private static Context a;
    @k0
    private static Boolean b;
    
    @RecentlyNonNull
    @f2.a
    public static boolean a(@RecentlyNonNull final Context context) {
        synchronized (a.class) {
            final Context applicationContext = context.getApplicationContext();
            final Context a = com.google.android.gms.common.wrappers.a.a;
            if (a != null) {
                final Boolean b = com.google.android.gms.common.wrappers.a.b;
                if (b != null && a == applicationContext) {
                    return b;
                }
            }
            com.google.android.gms.common.wrappers.a.b = null;
            Label_0096: {
                Boolean b2 = null;
                Label_0062: {
                    if (!v.n()) {
                        try {
                            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                            com.google.android.gms.common.wrappers.a.b = Boolean.TRUE;
                        }
                        catch (ClassNotFoundException ex) {
                            b2 = Boolean.FALSE;
                            break Label_0062;
                        }
                        break Label_0096;
                    }
                    b2 = applicationContext.getPackageManager().isInstantApp();
                }
                com.google.android.gms.common.wrappers.a.b = b2;
            }
            com.google.android.gms.common.wrappers.a.a = applicationContext;
            return com.google.android.gms.common.wrappers.a.b;
        }
    }
}
