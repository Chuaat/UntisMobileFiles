// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.exceptions.a;
import io.reactivex.exceptions.b;
import io.reactivex.f;
import x5.g;
import io.reactivex.i;
import io.reactivex.c;

public final class m extends c
{
    final i G;
    final g<? super Throwable> H;
    
    public m(final i g, final g<? super Throwable> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void L0(final f f) {
        this.G.c(new a(f));
    }
    
    final class a implements f
    {
        private final f G;
        
        a(final f g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            io.reactivex.exceptions.a a = null;
            try {
                m.this.H.accept(t);
            }
            finally {
                final Throwable t2;
                b.b(t2);
                a = new io.reactivex.exceptions.a(new Throwable[] { t, t2 });
            }
            this.G.b(a);
        }
        
        @Override
        public void f() {
            try {
                m.this.H.accept((Object)null);
                this.G.f();
            }
            finally {
                final Throwable t;
                b.b(t);
                this.G.b(t);
            }
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            this.G.l(c);
        }
    }
}
