// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement;

import android.content.BroadcastReceiver$PendingResult;
import androidx.annotation.g0;
import android.content.Intent;
import androidx.annotation.j0;
import android.content.Context;
import com.google.android.gms.measurement.internal.i4;
import com.google.android.gms.measurement.internal.h4;
import androidx.legacy.content.a;

public final class AppMeasurementReceiver extends a implements h4
{
    private i4 J;
    
    @g0
    @Override
    public void a(@j0 final Context context, @j0 final Intent intent) {
        a.c(context, intent);
    }
    
    @j0
    public BroadcastReceiver$PendingResult d() {
        return this.goAsync();
    }
    
    @g0
    public void onReceive(@j0 final Context context, @j0 final Intent intent) {
        if (this.J == null) {
            this.J = new i4(this);
        }
        this.J.a(context, intent);
    }
}
