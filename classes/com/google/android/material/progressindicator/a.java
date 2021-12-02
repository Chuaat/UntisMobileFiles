// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.progressindicator;

import android.provider.Settings$System;
import android.provider.Settings$Global;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.content.ContentResolver;
import androidx.annotation.b1;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class a
{
    private static float a = 1.0f;
    
    @b1
    public static void b(final float a) {
        a.a = a;
    }
    
    public float a(@j0 final ContentResolver contentResolver) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 17) {
            return Settings$Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        }
        if (sdk_INT == 16) {
            return Settings$System.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        }
        return com.google.android.material.progressindicator.a.a;
    }
}
