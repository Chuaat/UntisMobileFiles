// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.widgets.j;
import androidx.constraintlayout.core.widgets.a;
import androidx.constraintlayout.core.state.g;

public class c extends androidx.constraintlayout.core.state.c
{
    private g.d h0;
    private int i0;
    private androidx.constraintlayout.core.widgets.a j0;
    
    public c(final g g) {
        super(g, androidx.constraintlayout.core.state.g.e.K);
    }
    
    @Override
    public j G0() {
        if (this.j0 == null) {
            this.j0 = new androidx.constraintlayout.core.widgets.a();
        }
        return this.j0;
    }
    
    public void J0(final g.d h0) {
        this.h0 = h0;
    }
    
    @Override
    public a Y(final int i0) {
        this.i0 = i0;
        return this;
    }
    
    @Override
    public a Z(final Object o) {
        this.Y(super.d0.f(o));
        return this;
    }
    
    @Override
    public void a() {
        this.G0();
        final int n = c$a.a[this.h0.ordinal()];
        int n2 = 3;
        if (n != 3 && n != 4) {
            if (n != 5) {
                if (n != 6) {
                    n2 = 0;
                }
            }
            else {
                n2 = 2;
            }
        }
        else {
            n2 = 1;
        }
        this.j0.o2(n2);
        this.j0.p2(this.i0);
    }
}
