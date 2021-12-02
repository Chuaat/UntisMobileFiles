// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import androidx.annotation.j0;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.common.internal.e;

public final class j3 extends e<d3>
{
    public j3(final Context context, final Looper looper, final a a, final b b) {
        super(context, looper, 93, a, b, null);
    }
    
    @j0
    @Override
    protected final String L() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }
    
    @j0
    @Override
    protected final String M() {
        return "com.google.android.gms.measurement.START";
    }
    
    @Override
    public final int s() {
        return 12451000;
    }
}
