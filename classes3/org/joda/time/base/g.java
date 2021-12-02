// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.base;

import org.joda.time.convert.d;
import org.joda.time.i;
import org.joda.time.chrono.x;
import org.joda.time.h;
import java.io.Serializable;
import org.joda.time.j0;

public abstract class g extends a implements j0, Serializable
{
    private static final long I = -6728882245981L;
    private volatile long G;
    private volatile org.joda.time.a H;
    
    public g() {
        this(h.c(), x.c0());
    }
    
    public g(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        this(n, n2, n3, n4, n5, n6, n7, x.c0());
    }
    
    public g(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final org.joda.time.a a) {
        this.H = this.T(a);
        this.G = this.U(this.H.q(n, n2, n3, n4, n5, n6, n7), this.H);
        this.Q();
    }
    
    public g(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final i i) {
        this(n, n2, n3, n4, n5, n6, n7, x.d0(i));
    }
    
    public g(final long n) {
        this(n, x.c0());
    }
    
    public g(final long n, final org.joda.time.a a) {
        this.H = this.T(a);
        this.G = this.U(n, this.H);
        this.Q();
    }
    
    public g(final long n, final i i) {
        this(n, x.d0(i));
    }
    
    public g(final Object o, final org.joda.time.a a) {
        final org.joda.time.convert.h n = d.m().n(o);
        this.H = this.T(n.a(o, a));
        this.G = this.U(n.d(o, a), this.H);
        this.Q();
    }
    
    public g(final Object o, final i i) {
        final org.joda.time.convert.h n = d.m().n(o);
        final org.joda.time.a t = this.T(n.b(o, i));
        this.H = t;
        this.G = this.U(n.d(o, t), t);
        this.Q();
    }
    
    public g(final org.joda.time.a a) {
        this(h.c(), a);
    }
    
    public g(final i i) {
        this(h.c(), x.d0(i));
    }
    
    private void Q() {
        if (this.G == Long.MIN_VALUE || this.G == Long.MAX_VALUE) {
            this.H = this.H.R();
        }
    }
    
    protected void J(final org.joda.time.a a) {
        this.H = this.T(a);
    }
    
    protected void N3(final long n) {
        this.G = this.U(n, this.H);
    }
    
    protected org.joda.time.a T(final org.joda.time.a a) {
        return h.e(a);
    }
    
    protected long U(final long n, final org.joda.time.a a) {
        return n;
    }
    
    @Override
    public long n() {
        return this.G;
    }
    
    @Override
    public org.joda.time.a t() {
        return this.H;
    }
}
