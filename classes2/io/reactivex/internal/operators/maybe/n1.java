// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import io.reactivex.internal.observers.l;
import io.reactivex.v;
import io.reactivex.i0;
import io.reactivex.y;
import y5.f;
import io.reactivex.b0;

public final class n1<T> extends b0<T> implements f<T>
{
    final y<T> G;
    
    public n1(final y<T> g) {
        this.G = g;
    }
    
    public static <T> v<T> l8(final i0<? super T> i0) {
        return new a<T>(i0);
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        this.G.c(l8(i0));
    }
    
    @Override
    public y<T> source() {
        return this.G;
    }
    
    static final class a<T> extends l<T> implements v<T>
    {
        private static final long Q = 7603343402964826922L;
        c P;
        
        a(final i0<? super T> i0) {
            super(i0);
        }
        
        @Override
        public void b(final Throwable t) {
            this.e(t);
        }
        
        @Override
        public void d(final T t) {
            this.c(t);
        }
        
        @Override
        public void dispose() {
            super.dispose();
            this.P.dispose();
        }
        
        @Override
        public void f() {
            this.a();
        }
        
        @Override
        public void l(final c p) {
            if (d.l(this.P, p)) {
                this.P = p;
                super.H.l(this);
            }
        }
    }
}
