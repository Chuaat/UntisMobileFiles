// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.plugins.a;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.c;

public final class l0 extends c
{
    final c G;
    final i H;
    
    public l0(final c g, final i h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void L0(final f f) {
        final a a = new a(f);
        f.l(a);
        this.H.c(a.H);
        this.G.c(a);
    }
    
    static final class a extends AtomicReference<io.reactivex.disposables.c> implements f, io.reactivex.disposables.c
    {
        private static final long J = 3533011714830024923L;
        final f G;
        final l0.a.a H;
        final AtomicBoolean I;
        
        a(final f g) {
            this.G = g;
            this.H = new l0.a.a(this);
            this.I = new AtomicBoolean();
        }
        
        void a() {
            if (this.I.compareAndSet(false, true)) {
                d.b(this);
                this.G.f();
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.I.compareAndSet(false, true)) {
                d.b(this.H);
                this.G.b(t);
            }
            else {
                a.Y(t);
            }
        }
        
        void c(final Throwable t) {
            if (this.I.compareAndSet(false, true)) {
                d.b(this);
                this.G.b(t);
            }
            else {
                a.Y(t);
            }
        }
        
        @Override
        public void dispose() {
            if (this.I.compareAndSet(false, true)) {
                d.b(this);
                d.b(this.H);
            }
        }
        
        @Override
        public void f() {
            if (this.I.compareAndSet(false, true)) {
                d.b(this.H);
                this.G.f();
            }
        }
        
        @Override
        public boolean i() {
            return this.I.get();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            d.j(this, c);
        }
        
        static final class a extends AtomicReference<io.reactivex.disposables.c> implements f
        {
            private static final long H = 5176264485428790318L;
            final l0.a G;
            
            a(final l0.a g) {
                this.G = g;
            }
            
            @Override
            public void b(final Throwable t) {
                this.G.c(t);
            }
            
            @Override
            public void f() {
                this.G.a();
            }
            
            @Override
            public void l(final io.reactivex.disposables.c c) {
                d.j(this, c);
            }
        }
    }
}
