// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

public abstract class y0
{
    y0() {
    }
    
    private void V0(final w0 w0) {
        if (this.t0() == w0) {
            return;
        }
        throw new g0(String.format("Value expected to be of type %s is of unexpected type %s", w0, this.t0()));
    }
    
    public boolean A0() {
        return this instanceof v;
    }
    
    public v B() {
        this.V0(w0.Q);
        return (v)this;
    }
    
    public boolean B0() {
        return this instanceof x;
    }
    
    public boolean C0() {
        return this instanceof y;
    }
    
    public x E() {
        this.V0(w0.a0);
        return (x)this;
    }
    
    public boolean E0() {
        return this instanceof c0;
    }
    
    public boolean F0() {
        return this instanceof e0;
    }
    
    public y I() {
        this.V0(w0.K);
        return (y)this;
    }
    
    public boolean I0() {
        return this instanceof f0;
    }
    
    public boolean J0() {
        return this instanceof h0;
    }
    
    public boolean K0() {
        return this instanceof i0;
    }
    
    public boolean N0() {
        return this instanceof m0;
    }
    
    public c0 O() {
        this.V0(w0.I);
        return (c0)this;
    }
    
    public boolean O0() {
        return this.F0() || this.I0() || this.E0();
    }
    
    public e0 P() {
        this.V0(w0.X);
        return (e0)this;
    }
    
    public boolean P0() {
        return this instanceof o0;
    }
    
    public boolean R0() {
        return this instanceof r0;
    }
    
    public boolean S0() {
        return this instanceof t0;
    }
    
    public boolean T0() {
        return this instanceof u0;
    }
    
    public f0 U() {
        this.V0(w0.Z);
        return (f0)this;
    }
    
    public boolean U0() {
        return this instanceof v0;
    }
    
    public h0 b0() {
        this.V0(w0.U);
        return (h0)this;
    }
    
    public i0 c0() {
        this.V0(w0.W);
        return (i0)this;
    }
    
    public n f() {
        this.V0(w0.L);
        return (n)this;
    }
    
    public o i() {
        this.V0(w0.M);
        return (o)this;
    }
    
    public n0 k0() {
        if (this.t0() != w0.X && this.t0() != w0.Z && this.t0() != w0.I) {
            throw new g0(String.format("Value expected to be of a numerical BSON type is of unexpected type %s", this.t0()));
        }
        return (n0)this;
    }
    
    public o0 l0() {
        this.V0(w0.O);
        return (o0)this;
    }
    
    public r0 n0() {
        this.V0(w0.S);
        return (r0)this;
    }
    
    public t0 o0() {
        this.V0(w0.J);
        return (t0)this;
    }
    
    public u0 q0() {
        this.V0(w0.V);
        return (u0)this;
    }
    
    public v0 r0() {
        this.V0(w0.Y);
        return (v0)this;
    }
    
    public abstract w0 t0();
    
    public boolean u0() {
        return this instanceof n;
    }
    
    public t v() {
        this.V0(w0.P);
        return (t)this;
    }
    
    public boolean v0() {
        return this instanceof o;
    }
    
    public boolean x0() {
        return this instanceof t;
    }
    
    public w z() {
        this.V0(w0.T);
        return (w)this;
    }
    
    public boolean z0() {
        return this instanceof w;
    }
}
