// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.h;
import rx.exceptions.c;
import rx.i;
import java.util.Iterator;
import rx.n;
import java.util.Objects;
import rx.g;

public final class q0<T> implements g.a<T>
{
    final Iterable<? extends T> G;
    
    public q0(final Iterable<? extends T> iterable) {
        Objects.requireNonNull(iterable, "iterable must not be null");
        this.G = iterable;
    }
    
    public void a(final n<? super T> n) {
        try {
            final Iterator<? extends T> iterator = this.G.iterator();
            final boolean hasNext = iterator.hasNext();
            if (!n.g()) {
                if (!hasNext) {
                    n.c();
                }
                else {
                    n.s0(new a<Object>((n<? super Object>)n, iterator));
                }
            }
        }
        finally {
            final Throwable t;
            rx.exceptions.c.f(t, n);
        }
    }
    
    static final class a<T> extends AtomicLong implements i
    {
        private static final long I = -8730475647105475802L;
        private final n<? super T> G;
        private final Iterator<? extends T> H;
        
        a(final n<? super T> g, final Iterator<? extends T> h) {
            this.G = g;
            this.H = h;
        }
        
        void a() {
            final n<? super T> g = this.G;
            final Iterator<? extends T> h = this.H;
            while (!g.g()) {
                try {
                    g.m((T)h.next());
                    if (g.g()) {
                        return;
                    }
                    try {
                        if (!h.hasNext()) {
                            if (!g.g()) {
                                g.c();
                            }
                            return;
                        }
                        continue;
                    }
                    finally {
                        final Throwable t;
                        rx.exceptions.c.f(t, g);
                    }
                }
                finally {
                    final Throwable t2;
                    rx.exceptions.c.f(t2, g);
                }
            }
        }
        
        void b(long n) {
            final n<? super T> g = this.G;
            final Iterator<? extends T> h = this.H;
            long n2;
            do {
                n2 = 0L;
                while (true) {
                    if (n2 != n) {
                        if (g.g()) {
                            return;
                        }
                        try {
                            g.m((Object)h.next());
                            if (g.g()) {
                                return;
                            }
                            try {
                                if (!h.hasNext()) {
                                    if (!g.g()) {
                                        g.c();
                                    }
                                    return;
                                }
                                ++n2;
                                continue;
                            }
                            finally {
                                final Throwable t;
                                rx.exceptions.c.f(t, g);
                                return;
                            }
                        }
                        finally {
                            rx.exceptions.c.f((Throwable)h, g);
                            return;
                        }
                    }
                    if (n2 == (n = this.get())) {
                        break;
                    }
                }
            } while ((n = rx.internal.operators.a.i(this, n2)) != 0L);
        }
        
        @Override
        public void v(final long n) {
            if (this.get() == Long.MAX_VALUE) {
                return;
            }
            if (n == Long.MAX_VALUE && this.compareAndSet(0L, Long.MAX_VALUE)) {
                this.a();
            }
            else if (n > 0L && rx.internal.operators.a.b(this, n) == 0L) {
                this.b(n);
            }
        }
    }
}
