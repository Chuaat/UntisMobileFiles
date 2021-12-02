// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.state;

import java.util.Collection;
import java.util.Collections;
import androidx.constraintlayout.core.widgets.j;
import java.util.ArrayList;
import androidx.constraintlayout.core.state.helpers.e;

public class c extends a implements e
{
    protected final g d0;
    final g.e e0;
    protected ArrayList<Object> f0;
    private j g0;
    
    public c(final g d0, final g.e e0) {
        super(d0);
        this.f0 = new ArrayList<Object>();
        this.d0 = d0;
        this.e0 = e0;
    }
    
    public c F0(final Object... elements) {
        Collections.addAll(this.f0, elements);
        return this;
    }
    
    public j G0() {
        return this.g0;
    }
    
    public g.e H0() {
        return this.e0;
    }
    
    public void I0(final j g0) {
        this.g0 = g0;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public androidx.constraintlayout.core.widgets.e b() {
        return this.G0();
    }
}
