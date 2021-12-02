// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.Looper;
import android.content.Context;

public final class b
{
    b(final Context context) {
    }
    
    public static final boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
