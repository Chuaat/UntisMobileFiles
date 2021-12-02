// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import androidx.annotation.g0;
import com.google.android.gms.internal.measurement.o1;
import android.content.Intent;
import android.content.Context;
import com.google.android.gms.common.internal.x;

public final class i4
{
    private final h4 a;
    
    public i4(final h4 a) {
        x.k(a);
        this.a = a;
    }
    
    @g0
    public final void a(final Context context, Intent setClassName) {
        final z4 e = z4.E(context, null, null);
        final n3 c = e.c();
        if (setClassName == null) {
            c.t().a("Receiver called with null intent");
            return;
        }
        e.L();
        final String action = setClassName.getAction();
        c.s().b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            setClassName = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            setClassName.setAction("com.google.android.gms.measurement.UPLOAD");
            c.s().a("Starting wakeful intent.");
            this.a.a(context, setClassName);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            c.t().a("Install Referrer Broadcasts are deprecated");
        }
    }
}
