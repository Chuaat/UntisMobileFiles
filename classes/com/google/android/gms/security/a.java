// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.security;

import android.content.Intent;
import android.content.res.Resources$NotFoundException;
import com.google.android.gms.common.l;
import androidx.annotation.k0;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.common.j;
import com.google.android.gms.common.i;
import android.util.Log;
import com.google.android.gms.common.internal.x;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import java.lang.reflect.Method;
import com.google.android.gms.common.h;

public class a
{
    private static final h a;
    private static final Object b;
    private static Method c;
    @RecentlyNonNull
    public static final String d = "GmsCore_OpenSSL";
    
    static {
        a = h.i();
        b = new Object();
        com.google.android.gms.security.a.c = null;
    }
    
    public static void a(@RecentlyNonNull final Context context) throws j, i {
        x.l(context, "Context must not be null");
        com.google.android.gms.security.a.a.p(context, 11925000);
        Context context2;
        if ((context2 = c(context)) == null) {
            context2 = e(context);
        }
        if (context2 != null) {
            final Object b = com.google.android.gms.security.a.b;
            // monitorenter(b)
            try {
                try {
                    if (com.google.android.gms.security.a.c == null) {
                        com.google.android.gms.security.a.c = context2.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", Context.class);
                    }
                    com.google.android.gms.security.a.c.invoke(null, context2);
                    // monitorexit(b)
                    return;
                }
                finally {
                    // monitorexit(b)
                    // iftrue(Label_0125:, t != null)
                    String obj = null;
                    Label_0130: {
                        String concat = null;
                        Label_0162: {
                            Block_10: {
                                break Block_10;
                                Label_0125: {
                                    final Throwable t;
                                    obj = t.getMessage();
                                }
                                break Label_0130;
                                final String value;
                                concat = "Failed to install provider: ".concat(value);
                                break Label_0162;
                            }
                            final Exception ex;
                            obj = ex.getMessage();
                            break Label_0130;
                            Label_0152: {
                                concat = new String("Failed to install provider: ");
                            }
                        }
                        Log.e("ProviderInstaller", concat);
                        throw new i(8);
                    }
                    final String value = String.valueOf(obj);
                }
                // iftrue(Label_0152:, value.length() == 0)
            }
            catch (Exception ex2) {}
        }
        Log.e("ProviderInstaller", "Failed to get remote context");
        throw new i(8);
    }
    
    public static void b(@RecentlyNonNull final Context context, @RecentlyNonNull final a a) {
        x.l(context, "Context must not be null");
        x.l(a, "Listener must not be null");
        x.f("Must be called on the UI thread");
        new b(context, a).execute((Object[])new Void[0]);
    }
    
    @k0
    private static Context c(Context b) {
        try {
            b = DynamiteModule.e(b, DynamiteModule.m, "com.google.android.gms.providerinstaller").b();
            return b;
        }
        catch (DynamiteModule.a a) {
            final String value = String.valueOf(a.getMessage());
            String concat;
            if (value.length() != 0) {
                concat = "Failed to load providerinstaller module: ".concat(value);
            }
            else {
                concat = new String("Failed to load providerinstaller module: ");
            }
            Log.w("ProviderInstaller", concat);
            return null;
        }
    }
    
    @k0
    private static Context e(final Context context) {
        try {
            return l.i(context);
        }
        catch (Resources$NotFoundException ex) {
            final String value = String.valueOf(ex.getMessage());
            String concat;
            if (value.length() != 0) {
                concat = "Failed to load GMS Core context for providerinstaller: ".concat(value);
            }
            else {
                concat = new String("Failed to load GMS Core context for providerinstaller: ");
            }
            Log.w("ProviderInstaller", concat);
            com.google.android.gms.common.util.i.a(context, (Throwable)ex);
            return null;
        }
    }
    
    public interface a
    {
        void a();
        
        void b(@RecentlyNonNull final int p0, @RecentlyNonNull final Intent p1);
    }
}
