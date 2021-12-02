// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.a;
import androidx.constraintlayout.core.state.g;
import androidx.constraintlayout.core.state.c;

public class d extends c
{
    protected float h0;
    protected g.b i0;
    
    public d(final g g, final g.e e) {
        super(g, e);
        this.h0 = 0.5f;
        this.i0 = androidx.constraintlayout.core.state.g.b.G;
    }
    
    public d J0(final float h0) {
        this.h0 = h0;
        return this;
    }
    
    public float K0() {
        return this.h0;
    }
    
    public g.b L0() {
        return androidx.constraintlayout.core.state.g.b.G;
    }
    
    public d M0(final g.b i0) {
        this.i0 = i0;
        return this;
    }
}
