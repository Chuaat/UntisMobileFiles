// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.q0;
import io.reactivex.n0;
import io.reactivex.k0;

public final class b<T> extends k0<T> implements n0<T>
{
    static final a[] L;
    static final a[] M;
    final q0<? extends T> G;
    final AtomicInteger H;
    final AtomicReference<a<T>[]> I;
    T J;
    Throwable K;
    
    static {
        L = new a[0];
        M = new a[0];
    }
    
    public b(final q0<? extends T> g) {
        this.G = g;
        this.H = new AtomicInteger();
        this.I = new AtomicReference<a<T>[]>(b.L);
    }
    
    boolean Q1(final a<T> a) {
        a<T>[] expectedValue;
        a[] newValue;
        do {
            expectedValue = this.I.get();
            if (expectedValue == b.M) {
                return false;
            }
            final int length = expectedValue.length;
            newValue = new a[length + 1];
            System.arraycopy(expectedValue, 0, newValue, 0, length);
            newValue[length] = a;
        } while (!this.I.compareAndSet(expectedValue, newValue));
        return true;
    }
    
    void R1(final a<T> a) {
        a<T>[] expectedValue;
        a[] l;
        do {
            expectedValue = this.I.get();
            final int length = expectedValue.length;
            if (length == 0) {
                return;
            }
            final int n = -1;
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n;
                if (n2 >= length) {
                    break;
                }
                if (expectedValue[n2] == a) {
                    n3 = n2;
                    break;
                }
                ++n2;
            }
            if (n3 < 0) {
                return;
            }
            if (length == 1) {
                l = b.L;
            }
            else {
                l = new a[length - 1];
                System.arraycopy(expectedValue, 0, l, 0, n3);
                System.arraycopy(expectedValue, n3 + 1, l, n3, length - n3 - 1);
            }
        } while (!this.I.compareAndSet(expectedValue, l));
    }
    
    @Override
    public void b(final Throwable k) {
        this.K = k;
        for (final a<T> a : this.I.getAndSet(b.M)) {
            if (!a.i()) {
                a.G.b(k);
            }
        }
    }
    
    @Override
    public void d(final T j) {
        this.J = j;
        for (final a<T> a : this.I.getAndSet(b.M)) {
            if (!a.i()) {
                a.G.d((Object)j);
            }
        }
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        final a<T> a = new a<T>(n0, this);
        n0.l(a);
        if (this.Q1(a)) {
            if (a.i()) {
                this.R1(a);
            }
            if (this.H.getAndIncrement() == 0) {
                this.G.c(this);
            }
            return;
        }
        final Throwable k = this.K;
        if (k != null) {
            n0.b(k);
        }
        else {
            n0.d(this.J);
        }
    }
    
    @Override
    public void l(final c c) {
    }
    
    static final class a<T> extends AtomicBoolean implements c
    {
        private static final long I = 7514387411091976596L;
        final n0<? super T> G;
        final b<T> H;
        
        a(final n0<? super T> g, final b<T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void dispose() {
            if (this.compareAndSet(false, true)) {
                this.H.R1(this);
            }
        }
        
        @Override
        public boolean i() {
            return this.get();
        }
    }
}
