// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.plugins.a;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.f;
import io.reactivex.y;
import io.reactivex.c;

public final class q0<T> extends c implements y5.c<T>
{
    final y<T> G;
    
    public q0(final y<T> g) {
        this.G = g;
    }
    
    @Override
    protected void L0(final f f) {
        this.G.c(new a<Object>(f));
    }
    
    @Override
    public s<T> e() {
        return io.reactivex.plugins.a.Q(new p0((y<Object>)this.G));
    }
    
    static final class a<T> implements v<T>, io.reactivex.disposables.c
    {
        final f G;
        io.reactivex.disposables.c H;
        
        a(final f g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.H = d.G;
            this.G.b(t);
        }
        
        @Override
        public void d(final T t) {
            this.H = d.G;
            this.G.f();
        }
        
        @Override
        public void dispose() {
            this.H.dispose();
            this.H = d.G;
        }
        
        @Override
        public void f() {
            this.H = d.G;
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.H.i();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c h) {
            if (d.l(this.H, h)) {
                this.H = h;
                this.G.l(this);
            }
        }
    }
}
