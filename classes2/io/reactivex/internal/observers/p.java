// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.observers;

import io.reactivex.internal.disposables.d;
import io.reactivex.exceptions.b;
import x5.a;
import x5.g;
import x5.r;
import io.reactivex.i0;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;

public final class p<T> extends AtomicReference<c> implements i0<T>, c
{
    private static final long K = -4403180040475402120L;
    final r<? super T> G;
    final g<? super Throwable> H;
    final a I;
    boolean J;
    
    public p(final r<? super T> g, final g<? super Throwable> h, final a i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public void b(final Throwable t) {
        if (this.J) {
            io.reactivex.plugins.a.Y(t);
            return;
        }
        this.J = true;
        try {
            this.H.accept(t);
        }
        finally {
            final Throwable t2;
            b.b(t2);
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(new Throwable[] { t, t2 }));
        }
    }
    
    @Override
    public void dispose() {
        d.b(this);
    }
    
    @Override
    public void f() {
        if (this.J) {
            return;
        }
        this.J = true;
        try {
            this.I.run();
        }
        finally {
            final Throwable t;
            b.b(t);
            io.reactivex.plugins.a.Y(t);
        }
    }
    
    @Override
    public boolean i() {
        return d.d(this.get());
    }
    
    @Override
    public void l(final c c) {
        d.j(this, c);
    }
    
    @Override
    public void m(final T t) {
        if (this.J) {
            return;
        }
        try {
            if (!this.G.a((Object)t)) {
                this.dispose();
                this.f();
            }
        }
        finally {
            final Throwable t2;
            b.b(t2);
            this.dispose();
            this.b(t2);
        }
    }
}
