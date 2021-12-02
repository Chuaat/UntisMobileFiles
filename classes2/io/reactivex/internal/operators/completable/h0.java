// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.exceptions.a;
import io.reactivex.exceptions.b;
import io.reactivex.f;
import x5.r;
import io.reactivex.i;
import io.reactivex.c;

public final class h0 extends c
{
    final i G;
    final r<? super Throwable> H;
    
    public h0(final i g, final r<? super Throwable> h) {
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
            try {
                if (h0.this.H.a(t)) {
                    this.G.f();
                }
                else {
                    this.G.b(t);
                }
            }
            finally {
                final Throwable t2;
                b.b(t2);
                this.G.b(new io.reactivex.exceptions.a(new Throwable[] { t, t2 }));
            }
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            this.G.l(c);
        }
    }
}
