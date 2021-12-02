// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.g0;
import com.google.android.gms.common.internal.x;
import android.app.Activity;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.g;
import androidx.collection.c;

public class p3 extends c3
{
    private final c<com.google.android.gms.common.api.internal.c<?>> L;
    private final i M;
    
    private p3(final m m, final i i) {
        this(m, i, g.y());
    }
    
    @d0
    private p3(final m m, final i i, final g g) {
        super(m, g);
        this.L = new c<com.google.android.gms.common.api.internal.c<?>>();
        this.M = i;
        super.G.b("ConnectionlessLifecycleHelper", this);
    }
    
    @g0
    public static void r(final Activity activity, final i i, final com.google.android.gms.common.api.internal.c<?> c) {
        final m c2 = LifecycleCallback.c(activity);
        p3 p3;
        if ((p3 = c2.e("ConnectionlessLifecycleHelper", p3.class)) == null) {
            p3 = new p3(c2, i);
        }
        x.l(c, "ApiKey cannot be null");
        p3.L.add(c);
        i.l(p3);
    }
    
    private final void t() {
        if (!this.L.isEmpty()) {
            this.M.l(this);
        }
    }
    
    @Override
    public void i() {
        super.i();
        this.t();
    }
    
    @Override
    public void k() {
        super.k();
        this.t();
    }
    
    @Override
    public void l() {
        super.l();
        this.M.s(this);
    }
    
    @Override
    protected final void n() {
        this.M.v();
    }
    
    @Override
    protected final void o(final com.google.android.gms.common.c c, final int n) {
        this.M.r(c, n);
    }
    
    final c<com.google.android.gms.common.api.internal.c<?>> s() {
        return this.L;
    }
}
