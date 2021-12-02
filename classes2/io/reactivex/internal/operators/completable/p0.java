// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.observers.c;
import io.reactivex.f;
import io.reactivex.i0;
import io.reactivex.i;
import io.reactivex.b0;

public final class p0<T> extends b0<T>
{
    final i G;
    
    public p0(final i g) {
        this.G = g;
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        this.G.c(new a(i0));
    }
    
    static final class a extends c<Void> implements f
    {
        final i0<?> G;
        io.reactivex.disposables.c H;
        
        a(final i0<?> g) {
            this.G = g;
        }
        
        @Override
        public int E(final int n) {
            return n & 0x2;
        }
        
        public Void a() throws Exception {
            return null;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void clear() {
        }
        
        @Override
        public void dispose() {
            this.H.dispose();
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.H.i();
        }
        
        @Override
        public boolean isEmpty() {
            return true;
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
