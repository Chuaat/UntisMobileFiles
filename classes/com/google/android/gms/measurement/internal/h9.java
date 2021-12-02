// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.wd;
import androidx.annotation.c1;
import com.google.android.gms.common.util.d0;

final class h9
{
    @d0
    protected long a;
    @d0
    protected long b;
    private final n c;
    final /* synthetic */ j9 d;
    
    public h9(final j9 d) {
        this.d = d;
        this.c = new g9(this, d.a);
        final long d2 = d.a.F().d();
        this.a = d2;
        this.b = d2;
    }
    
    final void a() {
        this.c.b();
        this.a = 0L;
        this.b = 0L;
    }
    
    @c1
    final void b(final long n) {
        this.c.b();
    }
    
    @c1
    final void c(final long n) {
        this.d.e();
        this.c.b();
        this.a = n;
        this.b = n;
    }
    
    @c1
    public final boolean d(final boolean b, final boolean b2, final long n) {
        this.d.e();
        this.d.f();
        wd.b();
        if (!this.d.a.w().y(null, a3.l0) || this.d.a.l()) {
            this.d.a.C().o.b(this.d.a.F().a());
        }
        long n2 = n - this.a;
        if (!b && n2 < 1000L) {
            this.d.a.c().s().b("Screen exposed for less than 1000 ms. Event not sent. time", n2);
            return false;
        }
        if (!b2) {
            n2 = n - this.b;
            this.b = n;
        }
        this.d.a.c().s().b("Recording user engagement, ms", n2);
        final Bundle bundle = new Bundle();
        bundle.putLong("_et", n2);
        ga.u(this.d.a.I().q(this.d.a.w().A() ^ true), bundle, true);
        final g w = this.d.a.w();
        final z2<Boolean> v = a3.V;
        if (!w.y(null, v) && b2) {
            bundle.putLong("_fr", 1L);
        }
        if (!this.d.a.w().y(null, v) || !b2) {
            this.d.a.G().q("auto", "_e", bundle);
        }
        this.a = n;
        this.c.b();
        this.c.d(3600000L);
        return true;
    }
}
