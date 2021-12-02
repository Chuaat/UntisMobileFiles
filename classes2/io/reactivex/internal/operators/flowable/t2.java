// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.annotations.g;
import o7.d;
import y5.a;
import o7.c;
import io.reactivex.l;

public final class t2 extends l<Integer>
{
    final int H;
    final int I;
    
    public t2(final int h, final int n) {
        this.H = h;
        this.I = h + n;
    }
    
    public void n6(final o7.c<? super Integer> c) {
        a a;
        if (c instanceof y5.a) {
            a = new b((y5.a<? super Integer>)c, this.H, this.I);
        }
        else {
            a = new c(c, this.H, this.I);
        }
        c.z((d)a);
    }
    
    abstract static class a extends d<Integer>
    {
        private static final long K = -2252972430506210021L;
        final int H;
        int I;
        volatile boolean J;
        
        a(final int i, final int h) {
            this.I = i;
            this.H = h;
        }
        
        @Override
        public final int E(final int n) {
            return n & 0x1;
        }
        
        abstract void a();
        
        @g
        public final Integer b() {
            final int i = this.I;
            if (i == this.H) {
                return null;
            }
            this.I = i + 1;
            return i;
        }
        
        abstract void c(final long p0);
        
        public final void cancel() {
            this.J = true;
        }
        
        public final void clear() {
            this.I = this.H;
        }
        
        public final boolean isEmpty() {
            return this.I == this.H;
        }
        
        public final void v(final long n) {
            if (j.m(n) && io.reactivex.internal.util.d.a(this, n) == 0L) {
                if (n == Long.MAX_VALUE) {
                    this.a();
                }
                else {
                    this.c(n);
                }
            }
        }
    }
    
    static final class b extends a
    {
        private static final long M = 2587302975077663557L;
        final y5.a<? super Integer> L;
        
        b(final y5.a<? super Integer> l, final int n, final int n2) {
            super(n, n2);
            this.L = l;
        }
        
        @Override
        void a() {
            final int h = super.H;
            final y5.a<? super Integer> l = this.L;
            for (int i = super.I; i != h; ++i) {
                if (super.J) {
                    return;
                }
                l.B(i);
            }
            if (super.J) {
                return;
            }
            ((o7.c)l).f();
        }
        
        @Override
        void c(long n) {
            final int h = super.H;
            int i = super.I;
            final y5.a<? super Integer> l = this.L;
            long n2;
            do {
                n2 = 0L;
                while (true) {
                    if (n2 != n && i != h) {
                        if (super.J) {
                            return;
                        }
                        long n3 = n2;
                        if (l.B(i)) {
                            n3 = n2 + 1L;
                        }
                        ++i;
                        n2 = n3;
                    }
                    else {
                        if (i == h) {
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
    
    static final class c extends a
    {
        private static final long M = 2587302975077663557L;
        final o7.c<? super Integer> L;
        
        c(final o7.c<? super Integer> l, final int n, final int n2) {
            super(n, n2);
            this.L = l;
        }
        
        @Override
        void a() {
            final int h = super.H;
            final o7.c<? super Integer> l = this.L;
            for (int i = super.I; i != h; ++i) {
                if (super.J) {
                    return;
                }
                l.m((Object)i);
            }
            if (super.J) {
                return;
            }
            l.f();
        }
        
        @Override
        void c(long n) {
            final int h = super.H;
            int i = super.I;
            final o7.c<? super Integer> l = this.L;
            long n2;
            do {
                n2 = 0L;
                while (true) {
                    if (n2 != n && i != h) {
                        if (super.J) {
                            return;
                        }
                        l.m((Object)i);
                        ++n2;
                        ++i;
                    }
                    else {
                        if (i == h) {
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
}
