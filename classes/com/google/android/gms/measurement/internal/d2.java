// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import androidx.annotation.c1;
import android.os.Bundle;
import com.google.android.gms.common.internal.x;
import androidx.collection.a;
import java.util.Map;

public final class d2 extends e3
{
    private final Map<String, Long> b;
    private final Map<String, Integer> c;
    private long d;
    
    public d2(final z4 z4) {
        super(z4);
        this.c = new a<String, Integer>();
        this.b = new a<String, Long>();
    }
    
    @c1
    private final void l(final long l, final m7 m7) {
        if (m7 == null) {
            super.a.c().s().a("Not logging ad exposure. No active activity");
            return;
        }
        if (l < 1000L) {
            super.a.c().s().b("Not logging ad exposure. Less than 1000 ms. exposure", l);
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putLong("_xt", l);
        ga.u(m7, bundle, true);
        super.a.G().q("am", "_xa", bundle);
    }
    
    @c1
    private final void m(final String s, final long l, final m7 m7) {
        if (m7 == null) {
            super.a.c().s().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (l < 1000L) {
            super.a.c().s().b("Not logging ad unit exposure. Less than 1000 ms. exposure", l);
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putString("_ai", s);
        bundle.putLong("_xt", l);
        ga.u(m7, bundle, true);
        super.a.G().q("am", "_xu", bundle);
    }
    
    @c1
    private final void n(final long n) {
        final Iterator<String> iterator = this.b.keySet().iterator();
        while (iterator.hasNext()) {
            this.b.put(iterator.next(), n);
        }
        if (!this.b.isEmpty()) {
            this.d = n;
        }
    }
    
    public final void i(final String s, final long n) {
        if (s != null && s.length() != 0) {
            super.a.b().w(new com.google.android.gms.measurement.internal.a(this, s, n));
            return;
        }
        super.a.c().o().a("Ad unit id must be a non-empty string");
    }
    
    public final void j(final String s, final long n) {
        if (s != null && s.length() != 0) {
            super.a.b().w(new b0(this, s, n));
            return;
        }
        super.a.c().o().a("Ad unit id must be a non-empty string");
    }
    
    @c1
    public final void k(final long n) {
        final m7 q = super.a.I().q(false);
        for (final String s : this.b.keySet()) {
            this.m(s, n - this.b.get(s), q);
        }
        if (!this.b.isEmpty()) {
            this.l(n - this.d, q);
        }
        this.n(n);
    }
}
