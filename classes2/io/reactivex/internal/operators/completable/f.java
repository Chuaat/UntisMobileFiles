// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.h;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import java.util.Iterator;
import io.reactivex.i;
import io.reactivex.c;

public final class f extends c
{
    final Iterable<? extends i> G;
    
    public f(final Iterable<? extends i> g) {
        this.G = g;
    }
    
    public void L0(final io.reactivex.f f) {
        try {
            final a a = new a(f, b.g(this.G.iterator(), "The iterator returned is null"));
            f.l(a.I);
            a.a();
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            e.g(t, f);
        }
    }
    
    static final class a extends AtomicInteger implements f
    {
        private static final long J = -7965400327305809232L;
        final f G;
        final Iterator<? extends i> H;
        final h I;
        
        a(final f g, final Iterator<? extends i> h) {
            this.G = g;
            this.H = h;
            this.I = new h();
        }
        
        void a() {
            if (this.I.i()) {
                return;
            }
            if (this.getAndIncrement() != 0) {
                return;
            }
            final Iterator<? extends i> h = this.H;
            while (!this.I.i()) {
                try {
                    if (!h.hasNext()) {
                        this.G.f();
                        return;
                    }
                    try {
                        b.g((i)h.next(), "The CompletableSource returned is null").c(this);
                        if (this.decrementAndGet() == 0) {
                            return;
                        }
                        continue;
                    }
                    finally {
                        final Throwable t;
                        io.reactivex.exceptions.b.b(t);
                        this.G.b(t);
                    }
                }
                finally {
                    io.reactivex.exceptions.b.b((Throwable)h);
                    this.G.b((Throwable)h);
                }
            }
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void f() {
            this.a();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c c) {
            this.I.a(c);
        }
    }
}
