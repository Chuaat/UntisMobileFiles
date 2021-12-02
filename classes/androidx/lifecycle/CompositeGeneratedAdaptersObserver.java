// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import androidx.annotation.j0;

class CompositeGeneratedAdaptersObserver implements v
{
    private final p[] G;
    
    CompositeGeneratedAdaptersObserver(final p[] g) {
        this.G = g;
    }
    
    @Override
    public void h(@j0 final y y, @j0 final s.b b) {
        final androidx.lifecycle.j0 j0 = new androidx.lifecycle.j0();
        final p[] g = this.G;
        final int length = g.length;
        final int n = 0;
        for (int i = 0; i < length; ++i) {
            g[i].a(y, b, false, j0);
        }
        final p[] g2 = this.G;
        for (int length2 = g2.length, k = n; k < length2; ++k) {
            g2[k].a(y, b, true, j0);
        }
    }
}
