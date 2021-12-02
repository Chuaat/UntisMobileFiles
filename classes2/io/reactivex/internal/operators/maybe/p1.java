// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import java.util.NoSuchElementException;
import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.n0;
import io.reactivex.y;
import y5.f;
import io.reactivex.k0;

public final class p1<T> extends k0<T> implements f<T>
{
    final y<T> G;
    final T H;
    
    public p1(final y<T> g, final T h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        this.G.c(new a<Object>(n0, (Object)this.H));
    }
    
    @Override
    public y<T> source() {
        return this.G;
    }
    
    static final class a<T> implements v<T>, c
    {
        final n0<? super T> G;
        final T H;
        c I;
        
        a(final n0<? super T> g, final T h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.I = d.G;
            this.G.b(t);
        }
        
        @Override
        public void d(final T t) {
            this.I = d.G;
            this.G.d((Object)t);
        }
        
        @Override
        public void dispose() {
            this.I.dispose();
            this.I = d.G;
        }
        
        @Override
        public void f() {
            this.I = d.G;
            final T h = this.H;
            if (h != null) {
                this.G.d((Object)h);
            }
            else {
                this.G.b(new NoSuchElementException("The MaybeSource is empty"));
            }
        }
        
        @Override
        public boolean i() {
            return this.I.i();
        }
        
        @Override
        public void l(final c i) {
            if (d.l(this.I, i)) {
                this.I = i;
                this.G.l(this);
            }
        }
    }
}
