// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets.analyzer;

import java.util.Iterator;

class g extends f
{
    public int m;
    
    public g(final p p) {
        super(p);
        a e;
        if (p instanceof l) {
            e = androidx.constraintlayout.core.widgets.analyzer.f.a.H;
        }
        else {
            e = androidx.constraintlayout.core.widgets.analyzer.f.a.I;
        }
        super.e = e;
    }
    
    @Override
    public void e(final int g) {
        if (super.j) {
            return;
        }
        super.j = true;
        super.g = g;
        for (final d d : super.k) {
            d.a(d);
        }
    }
}
