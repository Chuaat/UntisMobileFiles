// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.e;
import io.reactivex.internal.disposables.d;
import io.reactivex.exceptions.b;
import io.reactivex.f;
import x5.a;
import x5.g;
import io.reactivex.i;
import io.reactivex.c;

public final class i0 extends c
{
    final i G;
    final g<? super io.reactivex.disposables.c> H;
    final g<? super Throwable> I;
    final x5.a J;
    final x5.a K;
    final x5.a L;
    final x5.a M;
    
    public i0(final i g, final g<? super io.reactivex.disposables.c> h, final g<? super Throwable> i, final x5.a j, final x5.a k, final x5.a l, final x5.a m) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
    }
    
    @Override
    protected void L0(final f f) {
        this.G.c(new a(f));
    }
    
    final class a implements f, io.reactivex.disposables.c
    {
        final f G;
        io.reactivex.disposables.c H;
        
        a(final f g) {
            this.G = g;
        }
        
        void a() {
            try {
                i0.this.L.run();
            }
            finally {
                final Throwable t;
                b.b(t);
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.H == d.G) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            io.reactivex.exceptions.a a = null;
            try {
                i0.this.I.accept(t);
                i0.this.K.run();
            }
            finally {
                final Throwable t2;
                b.b(t2);
                a = new io.reactivex.exceptions.a(new Throwable[] { t, t2 });
            }
            this.G.b(a);
            this.a();
        }
        
        @Override
        public void dispose() {
            try {
                i0.this.M.run();
            }
            finally {
                final Throwable t;
                b.b(t);
                io.reactivex.plugins.a.Y(t);
            }
            this.H.dispose();
        }
        
        @Override
        public void f() {
            if (this.H == d.G) {
                return;
            }
            try {
                i0.this.J.run();
                i0.this.K.run();
                this.G.f();
                this.a();
            }
            finally {
                final Throwable t;
                b.b(t);
                this.G.b(t);
            }
        }
        
        @Override
        public boolean i() {
            return this.H.i();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c h) {
            try {
                i0.this.H.accept(h);
                if (d.l(this.H, h)) {
                    this.H = h;
                    this.G.l(this);
                }
            }
            finally {
                final Throwable t;
                b.b(t);
                h.dispose();
                this.H = d.G;
                e.g(t, this.G);
            }
        }
    }
}
