// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.v;
import o7.c;
import io.reactivex.y;
import y5.f;
import io.reactivex.l;

public final class m1<T> extends l<T> implements f<T>
{
    final y<T> H;
    
    public m1(final y<T> h) {
        this.H = h;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        this.H.c(new a<Object>(c));
    }
    
    @Override
    public y<T> source() {
        return this.H;
    }
    
    static final class a<T> extends io.reactivex.internal.subscriptions.f<T> implements v<T>
    {
        private static final long T = 7603343402964826922L;
        io.reactivex.disposables.c S;
        
        a(final o7.c<? super T> c) {
            super(c);
        }
        
        @Override
        public void b(final Throwable t) {
            super.H.b(t);
        }
        
        @Override
        public void cancel() {
            super.cancel();
            this.S.dispose();
        }
        
        @Override
        public void d(final T t) {
            this.g(t);
        }
        
        @Override
        public void f() {
            super.H.f();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c s) {
            if (d.l(this.S, s)) {
                this.S = s;
                super.H.z((o7.d)this);
            }
        }
    }
}
