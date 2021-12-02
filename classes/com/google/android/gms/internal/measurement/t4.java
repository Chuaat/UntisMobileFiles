// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class t4 extends f9<u4, t4> implements ta
{
    private t4() {
        super(u4.zza);
    }
    
    public final t4 A(final x4 x4) {
        if (super.I) {
            this.r();
            super.I = false;
        }
        u4.G((u4)super.H, ((f9<y4, BuilderType>)x4).n());
        return this;
    }
    
    public final t4 B(final y4 y4) {
        if (super.I) {
            this.r();
            super.I = false;
        }
        u4.G((u4)super.H, y4);
        return this;
    }
    
    public final t4 C() {
        if (super.I) {
            this.r();
            super.I = false;
        }
        u4.I((u4)super.H);
        return this;
    }
    
    public final t4 D(final int n) {
        if (super.I) {
            this.r();
            super.I = false;
        }
        u4.J((u4)super.H, n);
        return this;
    }
    
    public final t4 E(final String s) {
        if (super.I) {
            this.r();
            super.I = false;
        }
        u4.K((u4)super.H, s);
        return this;
    }
    
    public final t4 F(final int n, final x4 x4) {
        if (super.I) {
            this.r();
            super.I = false;
        }
        u4.F((u4)super.H, n, ((f9<y4, BuilderType>)x4).n());
        return this;
    }
    
    public final t4 H(final int n, final y4 y4) {
        if (super.I) {
            this.r();
            super.I = false;
        }
        u4.F((u4)super.H, n, y4);
        return this;
    }
    
    public final t4 I(final long n) {
        if (super.I) {
            this.r();
            super.I = false;
        }
        u4.M((u4)super.H, n);
        return this;
    }
    
    public final t4 J(final long n) {
        if (super.I) {
            this.r();
            super.I = false;
        }
        u4.L((u4)super.H, n);
        return this;
    }
    
    public final y4 L(final int n) {
        return ((u4)super.H).C(n);
    }
    
    public final String N() {
        return ((u4)super.H).D();
    }
    
    public final List<y4> O() {
        return Collections.unmodifiableList((List<? extends y4>)((u4)super.H).E());
    }
    
    public final boolean P() {
        return ((u4)super.H).P();
    }
    
    public final int v() {
        return ((u4)super.H).w();
    }
    
    public final long w() {
        return ((u4)super.H).x();
    }
    
    public final long x() {
        return ((u4)super.H).z();
    }
    
    public final t4 z(final Iterable<? extends y4> iterable) {
        if (super.I) {
            this.r();
            super.I = false;
        }
        u4.H((u4)super.H, iterable);
        return this;
    }
}
