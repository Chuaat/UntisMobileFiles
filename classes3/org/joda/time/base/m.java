// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.base;

import org.joda.time.d0;
import org.joda.time.b0;
import org.joda.time.e0;
import org.joda.time.n0;
import org.joda.time.h;
import org.joda.time.l0;
import org.joda.time.l;
import org.joda.time.field.j;
import org.joda.time.a;
import org.joda.time.chrono.x;
import java.io.Serializable;
import org.joda.time.o0;

public abstract class m implements o0, Comparable<m>, Serializable
{
    private static final long H = 9386874258972L;
    private static final long I = 63072000000L;
    private volatile int G;
    
    protected m(final int g) {
        this.G = g;
    }
    
    protected static int M(final o0 obj, final long n) {
        int i = 0;
        if (obj == null) {
            return 0;
        }
        final x e0 = x.e0();
        long n2 = 0L;
        while (i < obj.size()) {
            final int e2 = obj.e0(i);
            long e3 = n2;
            if (e2 != 0) {
                final l d = obj.N(i).d(e0);
                if (!d.y()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Cannot convert period to duration as ");
                    sb.append(d.l());
                    sb.append(" is not precise in the period ");
                    sb.append(obj);
                    throw new IllegalArgumentException(sb.toString());
                }
                e3 = j.e(n2, j.i(d.o(), e2));
            }
            ++i;
            n2 = e3;
        }
        return j.n(n2 / n);
    }
    
    protected static int h(final l0 l0, final l0 l2, final org.joda.time.m m) {
        if (l0 != null && l2 != null) {
            return m.d(h.i(l0)).f(l2.n(), l0.n());
        }
        throw new IllegalArgumentException("ReadableInstant objects must not be null");
    }
    
    protected static int k(final n0 n0, final n0 n2, final o0 o0) {
        if (n0 == null || n2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        }
        if (n0.size() != n2.size()) {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
        for (int size = n0.size(), i = 0; i < size; ++i) {
            if (n0.N(i) != n2.N(i)) {
                throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
            }
        }
        if (h.p(n0)) {
            final a r = h.e(n0.t()).R();
            return r.o(o0, r.K(n0, 63072000000L), r.K(n2, 63072000000L))[0];
        }
        throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
    }
    
    @Override
    public boolean B(final org.joda.time.m m) {
        return m == this.p();
    }
    
    protected int G() {
        return this.G;
    }
    
    @Override
    public abstract e0 I();
    
    protected void K(final int g) {
        this.G = g;
    }
    
    @Override
    public org.joda.time.m N(final int i) {
        if (i == 0) {
            return this.p();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }
    
    @Override
    public b0 O() {
        final b0 b0 = new b0();
        b0.D(this);
        return b0;
    }
    
    @Override
    public int e0(final int i) {
        if (i == 0) {
            return this.G();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof o0)) {
            return false;
        }
        final o0 o2 = (o0)o;
        if (o2.I() != this.I() || o2.e0(0) != this.G()) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return (459 + this.G()) * 27 + this.p().hashCode();
    }
    
    public int o(final m m) {
        if (m.getClass() != this.getClass()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getClass());
            sb.append(" cannot be compared to ");
            sb.append(m.getClass());
            throw new ClassCastException(sb.toString());
        }
        final int g = m.G();
        final int g2 = this.G();
        if (g2 > g) {
            return 1;
        }
        if (g2 < g) {
            return -1;
        }
        return 0;
    }
    
    public abstract org.joda.time.m p();
    
    @Override
    public d0 r() {
        return d0.K.h1(this);
    }
    
    @Override
    public int size() {
        return 1;
    }
    
    @Override
    public int y(final org.joda.time.m m) {
        if (m == this.p()) {
            return this.G();
        }
        return 0;
    }
}
