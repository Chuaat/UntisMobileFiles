// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.d;
import io.reactivex.exceptions.a;
import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.f;
import x5.o;
import io.reactivex.i;
import io.reactivex.c;

public final class j0 extends c
{
    final i G;
    final o<? super Throwable, ? extends i> H;
    
    public j0(final i g, final o<? super Throwable, ? extends i> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void L0(final f f) {
        final a a = new a(f, this.H);
        f.l(a);
        this.G.c(a);
    }
    
    static final class a extends AtomicReference<io.reactivex.disposables.c> implements f, io.reactivex.disposables.c
    {
        private static final long J = 5018523762564524046L;
        final f G;
        final o<? super Throwable, ? extends i> H;
        boolean I;
        
        a(final f g, final o<? super Throwable, ? extends i> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.I) {
                this.G.b(t);
                return;
            }
            this.I = true;
            try {
                b.g((i)this.H.apply(t), "The errorMapper returned a null CompletableSource").c(this);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.G.b(new io.reactivex.exceptions.a(new Throwable[] { t, t2 }));
            }
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            d.f(this, c);
        }
    }
}
