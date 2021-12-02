// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.common;

import android.os.Build$VERSION;
import androidx.annotation.p0;
import android.annotation.TargetApi;
import android.content.Context;
import androidx.annotation.w;

public final class l
{
    private static volatile boolean a;
    @w("DirectBootUtils.class")
    private static boolean b;
    
    static {
        l.a = (b() ^ true);
        l.b = false;
    }
    
    @TargetApi(24)
    @p0(24)
    public static Context a(final Context context) {
        if (context.isDeviceProtectedStorage()) {
            return context;
        }
        return context.createDeviceProtectedStorageContext();
    }
    
    public static boolean b() {
        return Build$VERSION.SDK_INT >= 24;
    }
}
