// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import androidx.annotation.j0;

class ReflectiveGenericLifecycleObserver implements v
{
    private final Object G;
    private final d.a H;
    
    ReflectiveGenericLifecycleObserver(final Object g) {
        this.G = g;
        this.H = d.c.c(g.getClass());
    }
    
    @Override
    public void h(@j0 final y y, @j0 final s.b b) {
        this.H.a(y, b, this.G);
    }
}
