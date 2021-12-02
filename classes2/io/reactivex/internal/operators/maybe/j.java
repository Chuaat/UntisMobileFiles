// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import x5.f;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.exceptions.b;
import io.reactivex.u;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.s;

public final class j<T> extends s<T>
{
    final w<T> G;
    
    public j(final w<T> g) {
        this.G = g;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        final a<T> a = new a<T>(v);
        v.l(a);
        try {
            this.G.a(a);
        }
        finally {
            final Throwable t;
            b.b(t);
            a.b(t);
        }
    }
    
    static final class a<T> extends AtomicReference<c> implements u<T>, c
    {
        private static final long H = -2467358622224974244L;
        final v<? super T> G;
        
        a(final v<? super T> g) {
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
            final d value = this.get();
            final d g = d.G;
            if (value != g) {
                final d d = this.getAndSet(g);
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
            d.b(this);
        }
        
        @Override
        public boolean e(Throwable t) {
            Throwable t2 = t;
            if (t == null) {
                t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            final d value = this.get();
            final d g = d.G;
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
        public void f() {
            final d value = this.get();
            final d g = d.G;
            if (value != g) {
                final d d = this.getAndSet(g);
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
        public void j(final c c) {
            d.h(this, c);
        }
        
        @Override
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }
}
