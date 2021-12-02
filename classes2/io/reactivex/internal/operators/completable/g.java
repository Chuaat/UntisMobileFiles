// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.d;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.exceptions.b;
import io.reactivex.e;
import io.reactivex.f;
import io.reactivex.c;

public final class g extends c
{
    final io.reactivex.g G;
    
    public g(final io.reactivex.g g) {
        this.G = g;
    }
    
    @Override
    protected void L0(final f f) {
        final a a = new a(f);
        f.l(a);
        try {
            this.G.a(a);
        }
        finally {
            final Throwable t;
            b.b(t);
            a.b(t);
        }
    }
    
    static final class a extends AtomicReference<io.reactivex.disposables.c> implements e, io.reactivex.disposables.c
    {
        private static final long H = -2467358622224974244L;
        final f G;
        
        a(final f g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            if (!this.e(t)) {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void c(final x5.f f) {
            this.j(new io.reactivex.internal.disposables.b(f));
        }
        
        @Override
        public void dispose() {
            d.b(this);
        }
        
        @Override
        public boolean e(final Throwable t) {
            Throwable t2 = t;
            if (t == null) {
                t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            final d value = ((AtomicReference<d>)this).get();
            final d g = d.G;
            if (value != g) {
                final d d = ((AtomicReference<d>)this).getAndSet(g);
                if (d != g) {
                    try {
                        this.G.b(t2);
                        return true;
                    }
                    finally {
                        if (d != null) {
                            d.dispose();
                        }
                    }
                }
            }
            return false;
        }
        
        @Override
        public void f() {
            final d value = ((AtomicReference<d>)this).get();
            final d g = d.G;
            if (value != g) {
                final d d = ((AtomicReference<d>)this).getAndSet(g);
                if (d != g) {
                    try {
                        this.G.f();
                    }
                    finally {
                        if (d != null) {
                            d.dispose();
                        }
                    }
                }
            }
        }
        
        @Override
        public boolean i() {
            return d.d(this.get());
        }
        
        @Override
        public void j(final io.reactivex.disposables.c c) {
            d.h(this, c);
        }
        
        @Override
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }
}
