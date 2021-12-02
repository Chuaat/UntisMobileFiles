// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.h;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.y;
import io.reactivex.j0;

public final class e1<T> extends io.reactivex.internal.operators.maybe.a<T, T>
{
    final j0 H;
    
    public e1(final y<T> y, final j0 h) {
        super(y);
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        final a<Object> a = new a<Object>((v<? super Object>)v);
        v.l(a);
        a.G.a(this.H.e(new b<Object>(a, super.G)));
    }
    
    static final class a<T> extends AtomicReference<c> implements v<T>, c
    {
        private static final long I = 8571289934935992137L;
        final h G;
        final v<? super T> H;
        
        a(final v<? super T> h) {
            this.H = h;
            this.G = new h();
        }
        
        @Override
        public void b(final Throwable t) {
            this.H.b(t);
        }
        
        @Override
        public void d(final T t) {
            this.H.d((Object)t);
        }
        
        @Override
        public void dispose() {
            d.b(this);
            this.G.dispose();
        }
        
        @Override
        public void f() {
            this.H.f();
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final c c) {
            d.j(this, c);
        }
    }
    
    static final class b<T> implements Runnable
    {
        final v<? super T> G;
        final y<T> H;
        
        b(final v<? super T> g, final y<T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void run() {
            this.H.c(this.G);
        }
    }
}
