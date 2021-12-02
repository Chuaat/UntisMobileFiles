// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.c;
import android.content.Context;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;
import androidx.annotation.j0;
import android.app.Activity;
import com.google.android.gms.tasks.n;

public class t1 extends c3
{
    private n<Void> L;
    
    private t1(final m m) {
        super(m);
        this.L = new n<Void>();
        super.G.b("GmsAvailabilityHelper", this);
    }
    
    public static t1 r(@j0 final Activity activity) {
        final m c = LifecycleCallback.c(activity);
        final t1 t1 = c.e("GmsAvailabilityHelper", t1.class);
        if (t1 != null) {
            if (t1.L.a().u()) {
                t1.L = new n<Void>();
            }
            return t1;
        }
        return new t1(c);
    }
    
    @Override
    public void h() {
        super.h();
        this.L.d(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }
    
    @Override
    protected final void n() {
        final Activity f = super.G.f();
        if (f == null) {
            this.L.d(new b(new Status(8)));
            return;
        }
        final int j = super.K.j((Context)f);
        if (j == 0) {
            this.L.e(null);
            return;
        }
        if (!this.L.a().u()) {
            this.q(new c(j, null), 0);
        }
    }
    
    @Override
    protected final void o(final c c, final int n) {
        String g1;
        if ((g1 = c.g1()) == null) {
            g1 = "Error connecting to Google Play services";
        }
        this.L.b(new b(new Status(c, g1, c.M())));
    }
    
    public final com.google.android.gms.tasks.m<Void> s() {
        return this.L.a();
    }
}
