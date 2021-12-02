// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import androidx.annotation.k0;
import g.a;
import androidx.annotation.g0;
import androidx.annotation.j0;

public class u0
{
    private u0() {
    }
    
    @g0
    @j0
    public static <X> LiveData<X> a(@j0 final LiveData<X> liveData) {
        final i0<X> i0 = new i0<X>();
        i0.r(liveData, new l0<X>() {
            boolean G = true;
            
            @Override
            public void a(final X obj) {
                final Object f = i0.f();
                if (this.G || (f == null && obj != null) || (f != null && !f.equals(obj))) {
                    this.G = false;
                    i0.q(obj);
                }
            }
        });
        return i0;
    }
    
    @g0
    @j0
    public static <X, Y> LiveData<Y> b(@j0 final LiveData<X> liveData, @j0 final a<X, Y> a) {
        final i0<Y> i0 = new i0<Y>();
        i0.r(liveData, new l0<X>() {
            @Override
            public void a(@k0 final X x) {
                i0.q(a.apply(x));
            }
        });
        return i0;
    }
    
    @g0
    @j0
    public static <X, Y> LiveData<Y> c(@j0 final LiveData<X> liveData, @j0 final a<X, LiveData<Y>> a) {
        final i0<Y> i0 = new i0<Y>();
        i0.r(liveData, new l0<X>() {
            LiveData<Y> G;
            
            @Override
            public void a(@k0 final X x) {
                final LiveData<Y> g = a.apply(x);
                final LiveData<Y> g2 = this.G;
                if (g2 == g) {
                    return;
                }
                if (g2 != null) {
                    i0.s(g2);
                }
                if ((this.G = g) != null) {
                    i0.r(g, new l0<Y>() {
                        @Override
                        public void a(@k0 final Y y) {
                            i0.q(y);
                        }
                    });
                }
            }
        });
        return i0;
    }
}
