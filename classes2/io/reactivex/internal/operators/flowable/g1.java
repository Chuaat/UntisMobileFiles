// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.annotations.g;
import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicLong;
import o7.d;
import y5.a;
import o7.c;
import io.reactivex.l;

public final class g1<T> extends l<T>
{
    final T[] H;
    
    public g1(final T[] h) {
        this.H = h;
    }
    
    public void n6(final o7.c<? super T> c) {
        AtomicLong atomicLong;
        if (c instanceof y5.a) {
            atomicLong = new a<Object>((y5.a<? super Object>)c, this.H);
        }
        else {
            atomicLong = new b<Object>((o7.c<?>)c, (Object[])this.H);
        }
        c.z((d)atomicLong);
    }
    
    static final class a<T> extends c<T>
    {
        private static final long M = 2587302975077663557L;
        final y5.a<? super T> L;
        
        a(final y5.a<? super T> l, final T[] array) {
            super(array);
            this.L = l;
        }
        
        @Override
        void a() {
            final T[] h = (T[])super.H;
            final int length = h.length;
            final y5.a<? super T> l = this.L;
            for (int i = super.I; i != length; ++i) {
                if (super.J) {
                    return;
                }
                final T t = h[i];
                if (t == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("The element at index ");
                    sb.append(i);
                    sb.append(" is null");
                    ((o7.c)l).b((Throwable)new NullPointerException(sb.toString()));
                    return;
                }
                l.B(t);
            }
            if (super.J) {
                return;
            }
            ((o7.c)l).f();
        }
        
        @Override
        void b(long n) {
            final T[] h = (T[])super.H;
            final int length = h.length;
            int i = super.I;
            final y5.a<? super T> l = this.L;
            long n2;
            do {
                n2 = 0L;
                while (true) {
                    if (n2 != n && i != length) {
                        if (super.J) {
                            return;
                        }
                        final T t = h[i];
                        if (t == null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("The element at index ");
                            sb.append(i);
                            sb.append(" is null");
                            ((o7.c)l).b((Throwable)new NullPointerException(sb.toString()));
                            return;
                        }
                        long n3 = n2;
                        if (l.B(t)) {
                            n3 = n2 + 1L;
                        }
                        ++i;
                        n2 = n3;
                    }
                    else {
                        if (i == length) {
                            if (!super.J) {
                                ((o7.c)l).f();
                            }
                            return;
                        }
                        if (n2 == (n = this.get())) {
                            super.I = i;
                            break;
                        }
                        continue;
                    }
                }
            } while ((n = this.addAndGet(-n2)) != 0L);
        }
    }
    
    static final class b<T> extends c<T>
    {
        private static final long M = 2587302975077663557L;
        final o7.c<? super T> L;
        
        b(final o7.c<? super T> l, final T[] array) {
            super(array);
            this.L = l;
        }
        
        @Override
        void a() {
            final T[] h = (T[])super.H;
            final int length = h.length;
            final o7.c<? super T> l = this.L;
            for (int i = super.I; i != length; ++i) {
                if (super.J) {
                    return;
                }
                final T t = h[i];
                if (t == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("The element at index ");
                    sb.append(i);
                    sb.append(" is null");
                    l.b((Throwable)new NullPointerException(sb.toString()));
                    return;
                }
                l.m((Object)t);
            }
            if (super.J) {
                return;
            }
            l.f();
        }
        
        @Override
        void b(long n) {
            final T[] h = (T[])super.H;
            final int length = h.length;
            int i = super.I;
            final o7.c<? super T> l = this.L;
            long n2;
            do {
                n2 = 0L;
                while (true) {
                    if (n2 != n && i != length) {
                        if (super.J) {
                            return;
                        }
                        final T t = h[i];
                        if (t == null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("The element at index ");
                            sb.append(i);
                            sb.append(" is null");
                            l.b((Throwable)new NullPointerException(sb.toString()));
                            return;
                        }
                        l.m((Object)t);
                        ++n2;
                        ++i;
                    }
                    else {
                        if (i == length) {
                            if (!super.J) {
                                l.f();
                            }
                            return;
                        }
                        if (n2 == (n = this.get())) {
                            super.I = i;
                            break;
                        }
                        continue;
                    }
                }
            } while ((n = this.addAndGet(-n2)) != 0L);
        }
    }
    
    abstract static class c<T> extends d<T>
    {
        private static final long K = -2252972430506210021L;
        final T[] H;
        int I;
        volatile boolean J;
        
        c(final T[] h) {
            this.H = h;
        }
        
        @Override
        public final int E(final int n) {
            return n & 0x1;
        }
        
        abstract void a();
        
        abstract void b(final long p0);
        
        public final void cancel() {
            this.J = true;
        }
        
        public final void clear() {
            this.I = this.H.length;
        }
        
        public final boolean isEmpty() {
            return this.I == this.H.length;
        }
        
        @g
        public final T poll() {
            final int i = this.I;
            final T[] h = this.H;
            if (i == h.length) {
                return null;
            }
            this.I = i + 1;
            return io.reactivex.internal.functions.b.g(h[i], "array element is null");
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
}
