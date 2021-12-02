// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import android.os.Looper;

public final class g0
{
    public static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
