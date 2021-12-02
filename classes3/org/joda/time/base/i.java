// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.base;

import org.joda.time.o0;
import org.joda.time.chrono.x;
import org.joda.time.field.j;
import org.joda.time.l0;
import org.joda.time.k0;
import org.joda.time.a0;
import org.joda.time.h0;
import org.joda.time.h;
import org.joda.time.a;
import java.io.Serializable;
import org.joda.time.m0;

public abstract class i extends d implements m0, Serializable
{
    private static final long J = 576586928732749278L;
    private volatile a G;
    private volatile long H;
    private volatile long I;
    
    protected i(final long h, final long i, final a a) {
        this.G = h.e(a);
        this.L(h, i);
        this.H = h;
        this.I = i;
    }
    
    protected i(final Object o, a t) {
        final org.joda.time.convert.i p2 = org.joda.time.convert.d.m().p(o);
        Label_0140: {
            long i;
            if (p2.c(o, t)) {
                final m0 m0 = (m0)o;
                if (t == null) {
                    t = m0.t();
                }
                this.G = t;
                this.H = m0.n();
                i = m0.I();
            }
            else {
                if (this instanceof h0) {
                    p2.k((h0)this, o, t);
                    break Label_0140;
                }
                final a0 a0 = new a0();
                p2.k(a0, o, t);
                this.G = a0.t();
                this.H = a0.n();
                i = a0.I();
            }
            this.I = i;
        }
        this.L(this.H, this.I);
    }
    
    protected i(final k0 k0, final l0 l0) {
        this.G = h.i(l0);
        this.I = h.j(l0);
        this.L(this.H = j.e(this.I, -h.h(k0)), this.I);
    }
    
    protected i(final l0 l0, final k0 k0) {
        this.G = h.i(l0);
        this.H = h.j(l0);
        this.I = j.e(this.H, h.h(k0));
        this.L(this.H, this.I);
    }
    
    protected i(final l0 l0, final l0 l2) {
        if (l0 == null && l2 == null) {
            final long c = h.c();
            this.I = c;
            this.H = c;
            this.G = x.c0();
        }
        else {
            this.G = h.i(l0);
            this.H = h.j(l0);
            this.I = h.j(l2);
            this.L(this.H, this.I);
        }
    }
    
    protected i(final l0 l0, final o0 o0) {
        final a i = h.i(l0);
        this.G = i;
        this.H = h.j(l0);
        long j;
        if (o0 == null) {
            j = this.H;
        }
        else {
            j = i.b(o0, this.H, 1);
        }
        this.I = j;
        this.L(this.H, this.I);
    }
    
    protected i(final o0 o0, final l0 l0) {
        final a i = h.i(l0);
        this.G = i;
        this.I = h.j(l0);
        long h;
        if (o0 == null) {
            h = this.I;
        }
        else {
            h = i.b(o0, this.I, -1);
        }
        this.L(this.H = h, this.I);
    }
    
    @Override
    public long I() {
        return this.I;
    }
    
    protected void V(final long h, final long i, final a a) {
        this.L(h, i);
        this.H = h;
        this.I = i;
        this.G = h.e(a);
    }
    
    @Override
    public long n() {
        return this.H;
    }
    
    @Override
    public a t() {
        return this.G;
    }
}
