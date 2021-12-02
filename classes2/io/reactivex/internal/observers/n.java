// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import io.reactivex.internal.disposables.e;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import x5.a;
import x5.g;
import io.reactivex.disposables.c;
import io.reactivex.i0;

public final class n<T> implements i0<T>, c
{
    final i0<? super T> G;
    final g<? super c> H;
    final a I;
    c J;
    
    public n(final i0<? super T> g, final g<? super c> h, final a i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public void b(final Throwable t) {
        final c j = this.J;
        final d g = d.G;
        if (j != g) {
            this.J = g;
            this.G.b(t);
        }
        else {
            io.reactivex.plugins.a.Y(t);
        }
    }
    
    @Override
    public void dispose() {
        final c j = this.J;
        final d g = d.G;
        if (j != g) {
            this.J = g;
            try {
                this.I.run();
            }
            finally {
                final Throwable t;
                b.b(t);
                io.reactivex.plugins.a.Y(t);
            }
            j.dispose();
        }
    }
    
    @Override
    public void f() {
        final c j = this.J;
        final d g = d.G;
        if (j != g) {
            this.J = g;
            this.G.f();
        }
    }
    
    @Override
    public boolean i() {
        return this.J.i();
    }
    
    @Override
    public void l(final c j) {
        try {
            this.H.accept(j);
            if (d.l(this.J, j)) {
                this.J = j;
                this.G.l(this);
            }
        }
        finally {
            final Throwable t;
            b.b(t);
            j.dispose();
            this.J = d.G;
            e.l(t, this.G);
        }
    }
    
    @Override
    public void m(final T t) {
        this.G.m((Object)t);
    }
}
