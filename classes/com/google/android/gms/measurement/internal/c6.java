// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.measurement.o1;
import androidx.annotation.k0;
import android.content.Context;
import com.google.android.gms.common.util.d0;

@d0
public final class c6
{
    final Context a;
    @k0
    String b;
    @k0
    String c;
    @k0
    String d;
    @k0
    Boolean e;
    long f;
    @k0
    o1 g;
    boolean h;
    @k0
    final Long i;
    @k0
    String j;
    
    @d0
    public c6(Context applicationContext, @k0 final o1 g, @k0 final Long i) {
        this.h = true;
        x.k(applicationContext);
        applicationContext = applicationContext.getApplicationContext();
        x.k(applicationContext);
        this.a = applicationContext;
        this.i = i;
        if (g != null) {
            this.g = g;
            this.b = g.L;
            this.c = g.K;
            this.d = g.J;
            this.h = g.I;
            this.f = g.H;
            this.j = g.N;
            final Bundle m = g.M;
            if (m != null) {
                this.e = m.getBoolean("dataCollectionDefaultEnabled", true);
            }
        }
    }
}
