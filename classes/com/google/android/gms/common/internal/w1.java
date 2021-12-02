// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.wrappers.b;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.wrappers.c;
import android.content.Context;
import androidx.annotation.k0;
import d6.a;

public final class w1
{
    private static Object a;
    @a("sLock")
    private static boolean b;
    @k0
    private static String c;
    private static int d;
    
    static {
        w1.a = new Object();
    }
    
    @k0
    public static String a(final Context context) {
        c(context);
        return w1.c;
    }
    
    public static int b(final Context context) {
        c(context);
        return w1.d;
    }
    
    private static void c(final Context context) {
        synchronized (w1.a) {
            if (w1.b) {
                return;
            }
            w1.b = true;
            final String packageName = context.getPackageName();
            final b a = com.google.android.gms.common.wrappers.c.a(context);
            try {
                final Bundle metaData = a.c(packageName, 128).metaData;
                if (metaData == null) {
                    return;
                }
                w1.c = metaData.getString("com.google.app.id");
                w1.d = metaData.getInt("com.google.android.gms.version");
            }
            catch (PackageManager$NameNotFoundException ex) {
                Log.wtf("MetadataValueReader", "This should never happen.", (Throwable)ex);
            }
        }
    }
}
