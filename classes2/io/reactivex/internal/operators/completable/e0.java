// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Iterator;
import io.reactivex.disposables.b;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.c;

public final class e0 extends c
{
    final Iterable<? extends i> G;
    
    public e0(final Iterable<? extends i> g) {
        this.G = g;
    }
    
    public void L0(f f) {
        final b b = new b();
        f.l(b);
        try {
            final Iterator<? extends i> iterator = io.reactivex.internal.functions.b.g(this.G.iterator(), "The source iterator returned is null");
            final AtomicInteger atomicInteger = new AtomicInteger(1);
            f = new a(f, b, atomicInteger);
            while (!b.i()) {
                try {
                    if (!iterator.hasNext()) {
                        ((a)f).f();
                        return;
                    }
                    if (b.i()) {
                        return;
                    }
                    try {
                        final i i = io.reactivex.internal.functions.b.g((i)iterator.next(), "The iterator returned a null CompletableSource");
                        if (b.i()) {
                            return;
                        }
                        atomicInteger.getAndIncrement();
                        i.c(f);
                        continue;
                    }
                    finally {
                        final Throwable t;
                        io.reactivex.exceptions.b.b(t);
                        b.dispose();
                        ((a)f).b(t);
                    }
                }
                finally {
                    io.reactivex.exceptions.b.b((Throwable)atomicInteger);
                    b.dispose();
                    ((a)f).b((Throwable)atomicInteger);
                }
            }
        }
        finally {
            final Throwable t2;
            io.reactivex.exceptions.b.b(t2);
            f.b(t2);
        }
    }
    
    static final class a extends AtomicBoolean implements f
    {
        private static final long J = -7730517613164279224L;
        final b G;
        final f H;
        final AtomicInteger I;
        
        a(final f h, final b g, final AtomicInteger i) {
            this.H = h;
            this.G = g;
            this.I = i;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.dispose();
            if (this.compareAndSet(false, true)) {
                this.H.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void f() {
            if (this.I.decrementAndGet() == 0 && this.compareAndSet(false, true)) {
                this.H.f();
            }
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            this.G.b(c);
        }
    }
}
