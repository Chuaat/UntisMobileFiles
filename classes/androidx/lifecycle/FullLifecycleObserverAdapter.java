// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import androidx.annotation.j0;

class FullLifecycleObserverAdapter implements v
{
    private final o G;
    private final v H;
    
    FullLifecycleObserverAdapter(final o g, final v h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public void h(@j0 final y y, @j0 final s.b b) {
        switch (FullLifecycleObserverAdapter$a.a[b.ordinal()]) {
            case 7: {
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            }
            case 6: {
                this.G.f(y);
                break;
            }
            case 5: {
                this.G.d(y);
                break;
            }
            case 4: {
                this.G.c(y);
                break;
            }
            case 3: {
                this.G.a(y);
                break;
            }
            case 2: {
                this.G.g(y);
                break;
            }
            case 1: {
                this.G.b(y);
                break;
            }
        }
        final v h = this.H;
        if (h != null) {
            h.h(y, b);
        }
    }
}
