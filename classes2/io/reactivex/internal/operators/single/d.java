// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import x5.f;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.exceptions.b;
import io.reactivex.m0;
import io.reactivex.disposables.c;
import io.reactivex.n0;
import io.reactivex.o0;
import io.reactivex.k0;

public final class d<T> extends k0<T>
{
    final o0<T> G;
    
    public d(final o0<T> g) {
        this.G = g;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        final a<T> a = new a<T>(n0);
        n0.l(a);
        try {
            this.G.a(a);
        }
        finally {
            final Throwable t;
            b.b(t);
            a.b(t);
        }
    }
    
    static final class a<T> extends AtomicReference<c> implements m0<T>, c
    {
        private static final long H = -2467358622224974244L;
        final n0<? super T> G;
        
        a(final n0<? super T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            if (!this.e(t)) {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void c(final f f) {
            this.j(new io.reactivex.internal.disposables.b(f));
        }
        
        @Override
        public void d(final T t) {
            final io.reactivex.internal.disposables.d value = this.get();
            final io.reactivex.internal.disposables.d g = io.reactivex.internal.disposables.d.G;
            if (value != g) {
                final io.reactivex.internal.disposables.d d = this.getAndSet(g);
                if (d != g) {
                    Label_0057: {
                        if (t != null) {
                            break Label_0057;
                        }
                        try {
                            this.G.b(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                            return;
                            this.G.d((Object)t);
                        }
                        finally {
                            if (d != null) {
                                d.dispose();
                            }
                        }
                    }
                }
            }
        }
        
        @Override
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }
        
        @Override
        public boolean e(Throwable t) {
            Throwable t2 = t;
            if (t == null) {
                t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            final io.reactivex.internal.disposables.d value = this.get();
            final io.reactivex.internal.disposables.d g = io.reactivex.internal.disposables.d.G;
            if (value != g) {
                t = (Throwable)this.getAndSet(g);
                if (t != g) {
                    try {
                        this.G.b(t2);
                        return true;
                    }
                    finally {
                        if (t != null) {
                            ((c)t).dispose();
                        }
                    }
                }
            }
            return false;
        }
        
        @Override
        public boolean i() {
            return io.reactivex.internal.disposables.d.d(this.get());
        }
        
        @Override
        public void j(final c c) {
            io.reactivex.internal.disposables.d.h(this, c);
        }
        
        @Override
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }
}
