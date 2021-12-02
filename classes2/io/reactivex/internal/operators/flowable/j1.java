// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.exceptions.b;
import o7.d;
import y5.a;
import io.reactivex.internal.subscriptions.g;
import java.util.Iterator;
import o7.c;
import io.reactivex.l;

public final class j1<T> extends l<T>
{
    final Iterable<? extends T> H;
    
    public j1(final Iterable<? extends T> h) {
        this.H = h;
    }
    
    public static <T> void P8(final o7.c<? super T> c, final Iterator<? extends T> iterator) {
        try {
            if (!iterator.hasNext()) {
                g.b(c);
                return;
            }
            AtomicLong atomicLong;
            if (c instanceof y5.a) {
                atomicLong = new b<Object>((y5.a<?>)c, iterator);
            }
            else {
                atomicLong = new c<Object>(c, iterator);
            }
            c.z((d)atomicLong);
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            g.d(t, c);
        }
    }
    
    public void n6(final o7.c<? super T> c) {
        try {
            P8((o7.c<? super Object>)c, (Iterator<?>)this.H.iterator());
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            g.d(t, c);
        }
    }
    
    abstract static class a<T> extends d<T>
    {
        private static final long K = -2252972430506210021L;
        Iterator<? extends T> H;
        volatile boolean I;
        boolean J;
        
        a(final Iterator<? extends T> h) {
            this.H = h;
        }
        
        @Override
        public final int E(final int n) {
            return n & 0x1;
        }
        
        abstract void a();
        
        abstract void b(final long p0);
        
        public final void cancel() {
            this.I = true;
        }
        
        public final void clear() {
            this.H = null;
        }
        
        public final boolean isEmpty() {
            final Iterator<? extends T> h = this.H;
            return h == null || !h.hasNext();
        }
        
        @io.reactivex.annotations.g
        public final T poll() {
            final Iterator<? extends T> h = this.H;
            if (h == null) {
                return null;
            }
            if (!this.J) {
                this.J = true;
            }
            else if (!h.hasNext()) {
                return null;
            }
            return io.reactivex.internal.functions.b.g((T)this.H.next(), "Iterator.next() returned a null value");
        }
        
        public final void v(final long n) {
            if (j.m(n) && io.reactivex.internal.util.d.a(this, n) == 0L) {
                if (n == Long.MAX_VALUE) {
                    this.a();
                }
                else {
                    this.b(n);
                }
            }
        }
    }
    
    static final class b<T> extends a<T>
    {
        private static final long M = -6022804456014692607L;
        final y5.a<? super T> L;
        
        b(final y5.a<? super T> l, final Iterator<? extends T> iterator) {
            super(iterator);
            this.L = l;
        }
        
        @Override
        void a() {
            final Iterator<? extends T> h = (Iterator<? extends T>)super.H;
            final y5.a<? super T> l = this.L;
        Label_0047_Outer:
            while (!super.I) {
                while (true) {
                    try {
                        final T next = (T)h.next();
                        if (super.I) {
                            return;
                        }
                        if (next == null) {
                            final NullPointerException ex = new NullPointerException("Iterator.next() returned a null value");
                            ((o7.c)l).b((Throwable)ex);
                            return;
                        }
                        l.B(next);
                        if (super.I) {
                            return;
                        }
                        if (!h.hasNext()) {
                            if (!super.I) {
                                ((o7.c)l).f();
                            }
                            return;
                        }
                        continue Label_0047_Outer;
                    }
                    finally {
                        final NullPointerException ex;
                        io.reactivex.exceptions.b.b(ex);
                        continue;
                    }
                    break;
                }
            }
        }
        
        @Override
        void b(long n) {
            final Iterator<? extends T> h = (Iterator<? extends T>)super.H;
            final y5.a<? super T> l = this.L;
            long n2;
            do {
                n2 = 0L;
            Label_0061_Outer:
                while (true) {
                    if (n2 != n) {
                        if (super.I) {
                            return;
                        }
                        while (true) {
                            try {
                                final T next = (T)h.next();
                                if (super.I) {
                                    return;
                                }
                                if (next == null) {
                                    final NullPointerException ex = new NullPointerException("Iterator.next() returned a null value");
                                    ((o7.c)l).b((Throwable)ex);
                                    return;
                                }
                                final boolean b = l.B(next);
                                if (super.I) {
                                    return;
                                }
                                if (!h.hasNext()) {
                                    if (!super.I) {
                                        ((o7.c)l).f();
                                    }
                                    return;
                                }
                                if (b) {
                                    ++n2;
                                    continue Label_0061_Outer;
                                }
                                continue Label_0061_Outer;
                            }
                            finally {
                                final NullPointerException ex;
                                io.reactivex.exceptions.b.b(ex);
                                continue;
                            }
                            break;
                        }
                    }
                    if (n2 == (n = this.get())) {
                        break;
                    }
                }
            } while ((n = this.addAndGet(-n2)) != 0L);
        }
    }
    
    static final class c<T> extends a<T>
    {
        private static final long M = -6022804456014692607L;
        final o7.c<? super T> L;
        
        c(final o7.c<? super T> l, final Iterator<? extends T> iterator) {
            super(iterator);
            this.L = l;
        }
        
        @Override
        void a() {
            final Iterator<? extends T> h = (Iterator<? extends T>)super.H;
            final o7.c<? super T> l = this.L;
        Label_0047_Outer:
            while (!super.I) {
                while (true) {
                    try {
                        final T next = (T)h.next();
                        if (super.I) {
                            return;
                        }
                        if (next == null) {
                            final NullPointerException ex = new NullPointerException("Iterator.next() returned a null value");
                            l.b((Throwable)ex);
                            return;
                        }
                        l.m((Object)next);
                        if (super.I) {
                            return;
                        }
                        if (!h.hasNext()) {
                            if (!super.I) {
                                l.f();
                            }
                            return;
                        }
                        continue Label_0047_Outer;
                    }
                    finally {
                        final NullPointerException ex;
                        io.reactivex.exceptions.b.b(ex);
                        continue;
                    }
                    break;
                }
            }
        }
        
        @Override
        void b(long n) {
            final Iterator<? extends T> h = (Iterator<? extends T>)super.H;
            final o7.c<? super T> l = this.L;
            long n2;
            do {
                n2 = 0L;
            Label_0061_Outer:
                while (true) {
                    if (n2 != n) {
                        if (super.I) {
                            return;
                        }
                        while (true) {
                            try {
                                final T next = (T)h.next();
                                if (super.I) {
                                    return;
                                }
                                if (next == null) {
                                    final NullPointerException ex = new NullPointerException("Iterator.next() returned a null value");
                                    l.b((Throwable)ex);
                                    return;
                                }
                                l.m((Object)next);
                                if (super.I) {
                                    return;
                                }
                                if (!h.hasNext()) {
                                    if (!super.I) {
                                        l.f();
                                    }
                                    return;
                                }
                                ++n2;
                                continue Label_0061_Outer;
                            }
                            finally {
                                final NullPointerException ex;
                                io.reactivex.exceptions.b.b(ex);
                                continue;
                            }
                            break;
                        }
                    }
                    if (n2 == (n = this.get())) {
                        break;
                    }
                }
            } while ((n = this.addAndGet(-n2)) != 0L);
        }
    }
}
