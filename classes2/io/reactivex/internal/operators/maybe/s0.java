// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.v;
import io.reactivex.n0;
import io.reactivex.plugins.a;
import io.reactivex.s;
import io.reactivex.y;
import y5.c;
import y5.f;
import io.reactivex.k0;

public final class s0<T> extends k0<Boolean> implements f<T>, c<Boolean>
{
    final y<T> G;
    
    public s0(final y<T> g) {
        this.G = g;
    }
    
    @Override
    public s<Boolean> e() {
        return io.reactivex.plugins.a.Q(new r0((y<Object>)this.G));
    }
    
    @Override
    protected void e1(final n0<? super Boolean> n0) {
        this.G.c(new a<Object>(n0));
    }
    
    @Override
    public y<T> source() {
        return this.G;
    }
    
    static final class a<T> implements v<T>, io.reactivex.disposables.c
    {
        final n0<? super Boolean> G;
        io.reactivex.disposables.c H;
        
        a(final n0<? super Boolean> g) {
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
            this.G.d(Boolean.FALSE);
        }
        
        @Override
        public void dispose() {
            this.H.dispose();
            this.H = d.G;
        }
        
        @Override
        public void f() {
            this.H = d.G;
            this.G.d(Boolean.TRUE);
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
