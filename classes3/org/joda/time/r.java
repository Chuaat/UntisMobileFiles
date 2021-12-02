// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import org.joda.time.format.q;
import org.joda.time.format.b;
import org.joda.time.format.k;
import org.joda.time.format.j;
import org.joda.time.chrono.x;
import java.io.Serializable;
import org.joda.time.base.i;

public final class r extends i implements m0, Serializable
{
    private static final long K = 4922451897541386752L;
    
    public r(final long n, final long n2) {
        super(n, n2, null);
    }
    
    public r(final long n, final long n2, final a a) {
        super(n, n2, a);
    }
    
    public r(final long n, final long n2, final org.joda.time.i i) {
        super(n, n2, x.d0(i));
    }
    
    public r(final Object o) {
        super(o, null);
    }
    
    public r(final Object o, final a a) {
        super(o, a);
    }
    
    public r(final k0 k0, final l0 l0) {
        super(k0, l0);
    }
    
    public r(final l0 l0, final k0 k0) {
        super(l0, k0);
    }
    
    public r(final l0 l0, final l0 l2) {
        super(l0, l2);
    }
    
    public r(final l0 l0, final o0 o0) {
        super(l0, o0);
    }
    
    public r(final o0 o0, final l0 l0) {
        super(o0, l0);
    }
    
    public static r Z(final String s) {
        return new r(s);
    }
    
    public static r a0(final String s) {
        final int index = s.indexOf(47);
        if (index < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Format requires a '/' separator: ");
            sb.append(s);
            throw new IllegalArgumentException(sb.toString());
        }
        final String substring = s.substring(0, index);
        if (substring.length() <= 0) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Format invalid: ");
            sb2.append(s);
            throw new IllegalArgumentException(sb2.toString());
        }
        final String substring2 = s.substring(index + 1);
        if (substring2.length() <= 0) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Format invalid: ");
            sb3.append(s);
            throw new IllegalArgumentException(sb3.toString());
        }
        final b q = j.D().Q();
        final q e = k.e();
        final char char1 = substring.charAt(0);
        o0 l = null;
        c n;
        if (char1 != 'P' && char1 != 'p') {
            n = q.n(substring);
        }
        else {
            l = e.q(e0.q()).l(substring);
            n = null;
        }
        final char char2 = substring2.charAt(0);
        if (char2 != 'P' && char2 != 'p') {
            final c n2 = q.n(substring2);
            if (l != null) {
                return new r(l, n2);
            }
            return new r(n, n2);
        }
        else {
            if (l == null) {
                return new r(n, e.q(e0.q()).l(substring2));
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Interval composed of two durations: ");
            sb4.append(s);
            throw new IllegalArgumentException(sb4.toString());
        }
    }
    
    public boolean W(final m0 m0) {
        final boolean b = false;
        boolean b2 = false;
        if (m0 == null) {
            final long c = h.c();
            if (this.n() == c || this.I() == c) {
                b2 = true;
            }
            return b2;
        }
        if (m0.I() != this.n()) {
            final boolean b3 = b;
            if (this.I() != m0.n()) {
                return b3;
            }
        }
        return true;
    }
    
    public r X(m0 n) {
        n = h.n(n);
        final long n2 = n.n();
        final long i = n.I();
        final long n3 = this.n();
        final long j = this.I();
        if (n3 > i) {
            return new r(i, n3, this.t());
        }
        if (n2 > j) {
            return new r(j, n2, this.t());
        }
        return null;
    }
    
    public r Y(m0 n) {
        n = h.n(n);
        if (!this.F(n)) {
            return null;
        }
        return new r(Math.max(this.n(), n.n()), Math.min(this.I(), n.I()), this.t());
    }
    
    public r b0(final a a) {
        if (this.t() == a) {
            return this;
        }
        return new r(this.n(), this.I(), a);
    }
    
    public r c0(final k0 k0) {
        final long h = org.joda.time.h.h(k0);
        if (h == this.d()) {
            return this;
        }
        final a t = this.t();
        final long n = this.n();
        return new r(n, t.a(n, h, 1), t);
    }
    
    public r d0(final k0 k0) {
        final long h = org.joda.time.h.h(k0);
        if (h == this.d()) {
            return this;
        }
        final a t = this.t();
        final long i = this.I();
        return new r(t.a(i, h, -1), i, t);
    }
    
    public r e0(final l0 l0) {
        return this.f0(h.j(l0));
    }
    
    public r f0(final long n) {
        if (n == this.I()) {
            return this;
        }
        return new r(this.n(), n, this.t());
    }
    
    public r g0(final o0 o0) {
        if (o0 == null) {
            return this.c0(null);
        }
        final a t = this.t();
        final long n = this.n();
        return new r(n, t.b(o0, n, 1), t);
    }
    
    public r h0(final o0 o0) {
        if (o0 == null) {
            return this.d0(null);
        }
        final a t = this.t();
        final long i = this.I();
        return new r(t.b(o0, i, -1), i, t);
    }
    
    public r i0(final l0 l0) {
        return this.j0(h.j(l0));
    }
    
    public r j0(final long n) {
        if (n == this.n()) {
            return this;
        }
        return new r(n, this.I(), this.t());
    }
    
    @Override
    public r v() {
        return this;
    }
}
