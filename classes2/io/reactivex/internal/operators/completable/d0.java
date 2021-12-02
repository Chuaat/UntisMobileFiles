// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.Iterator;
import io.reactivex.disposables.b;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.c;

public final class d0 extends c
{
    final Iterable<? extends i> G;
    
    public d0(final Iterable<? extends i> g) {
        this.G = g;
    }
    
    public void L0(final f f) {
        final b b = new b();
        f.l(b);
        try {
            final Iterator<? extends i> iterator = io.reactivex.internal.functions.b.g(this.G.iterator(), "The source iterator returned is null");
            final AtomicInteger atomicInteger = new AtomicInteger(1);
            final io.reactivex.internal.util.c c = new io.reactivex.internal.util.c();
            while (!b.i()) {
                try {
                    if (iterator.hasNext()) {
                        if (b.i()) {
                            return;
                        }
                        final i i = io.reactivex.internal.functions.b.g((i)iterator.next(), "The iterator returned a null CompletableSource");
                        if (b.i()) {
                            return;
                        }
                        atomicInteger.getAndIncrement();
                        i.c(new c0.a(f, b, c, atomicInteger));
                        continue;
                    }
                }
                finally {
                    io.reactivex.exceptions.b.b((Throwable)b);
                    c.a((Throwable)b);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    final Throwable c2 = c.c();
                    if (c2 == null) {
                        f.f();
                    }
                    else {
                        f.b(c2);
                    }
                }
            }
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            f.b(t);
        }
    }
}
