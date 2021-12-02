// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.internal.util.k;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.g0;
import y5.g;
import io.reactivex.observables.a;

public final class g2<T> extends io.reactivex.observables.a<T> implements g<T>
{
    final g0<T> G;
    final AtomicReference<b<T>> H;
    final g0<T> I;
    
    private g2(final g0<T> i, final g0<T> g, final AtomicReference<b<T>> h) {
        this.I = i;
        this.G = g;
        this.H = h;
    }
    
    public static <T> io.reactivex.observables.a<T> w8(final g0<T> g0) {
        final AtomicReference<b<T>> atomicReference = (AtomicReference<b<T>>)new AtomicReference<b<Object>>();
        return io.reactivex.plugins.a.U(new g2<T>(new c<Object>((AtomicReference<b<Object>>)atomicReference), (g0<Object>)g0, (AtomicReference<b<Object>>)atomicReference));
    }
    
    @Override
    protected void L5(final i0<? super T> i0) {
        this.I.c(i0);
    }
    
    @Override
    public void p8(final x5.g<? super io.reactivex.disposables.c> g) {
        b<T> expectedValue;
        b<T> newValue;
        do {
            expectedValue = this.H.get();
            if (expectedValue != null) {
                newValue = expectedValue;
                if (!expectedValue.i()) {
                    break;
                }
            }
            newValue = new b<T>(this.H);
        } while (!this.H.compareAndSet(expectedValue, newValue));
        final boolean value = newValue.I.get();
        boolean b = true;
        if (value || !newValue.I.compareAndSet(false, true)) {
            b = false;
        }
        try {
            g.accept(newValue);
            if (b) {
                this.G.c(newValue);
            }
        }
        finally {
            final Throwable t;
            io.reactivex.exceptions.b.b(t);
            throw k.f(t);
        }
    }
    
    @Override
    public g0<T> source() {
        return this.G;
    }
    
    static final class a<T> extends AtomicReference<Object> implements c
    {
        private static final long H = -1100270633763673112L;
        final i0<? super T> G;
        
        a(final i0<? super T> g) {
            this.G = g;
        }
        
        void a(final b<T> newValue) {
            if (!this.compareAndSet(null, newValue)) {
                newValue.c(this);
            }
        }
        
        @Override
        public void dispose() {
            final a andSet = this.getAndSet(this);
            if (andSet != null && andSet != this) {
                ((b)andSet).c((a)this);
            }
        }
        
        @Override
        public boolean i() {
            return this.get() == this;
        }
    }
    
    static final class b<T> implements i0<T>, c
    {
        static final a[] K;
        static final a[] L;
        final AtomicReference<b<T>> G;
        final AtomicReference<a<T>[]> H;
        final AtomicBoolean I;
        final AtomicReference<c> J;
        
        static {
            K = new a[0];
            L = new a[0];
        }
        
        b(final AtomicReference<b<T>> g) {
            this.J = new AtomicReference<c>();
            this.H = new AtomicReference<a<T>[]>(b.K);
            this.G = g;
            this.I = new AtomicBoolean();
        }
        
        boolean a(final a<T> a) {
            a[] expectedValue;
            a[] newValue;
            do {
                expectedValue = this.H.get();
                if (expectedValue == b.L) {
                    return false;
                }
                final int length = expectedValue.length;
                newValue = new a[length + 1];
                System.arraycopy(expectedValue, 0, newValue, 0, length);
                newValue[length] = a;
            } while (!this.H.compareAndSet(expectedValue, newValue));
            return true;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.compareAndSet(this, null);
            final a[] array = this.H.getAndSet(b.L);
            if (array.length != 0) {
                for (int length = array.length, i = 0; i < length; ++i) {
                    array[i].G.b(t);
                }
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        void c(final a<T> obj) {
            a[] expectedValue;
            a[] k;
            do {
                expectedValue = this.H.get();
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
                    if (expectedValue[n2].equals(obj)) {
                        n3 = n2;
                        break;
                    }
                    ++n2;
                }
                if (n3 < 0) {
                    return;
                }
                if (length == 1) {
                    k = b.K;
                }
                else {
                    k = new a[length - 1];
                    System.arraycopy(expectedValue, 0, k, 0, n3);
                    System.arraycopy(expectedValue, n3 + 1, k, n3, length - n3 - 1);
                }
            } while (!this.H.compareAndSet(expectedValue, k));
        }
        
        @Override
        public void dispose() {
            final AtomicReference<a<T>[]> h = this.H;
            final a[] l = b.L;
            if (h.getAndSet(l) != l) {
                this.G.compareAndSet(this, null);
                d.b(this.J);
            }
        }
        
        @Override
        public void f() {
            this.G.compareAndSet(this, null);
            final a[] array = this.H.getAndSet(b.L);
            for (int length = array.length, i = 0; i < length; ++i) {
                array[i].G.f();
            }
        }
        
        @Override
        public boolean i() {
            return this.H.get() == b.L;
        }
        
        @Override
        public void l(final c c) {
            d.j(this.J, c);
        }
        
        @Override
        public void m(final T t) {
            final a[] array = this.H.get();
            for (int length = array.length, i = 0; i < length; ++i) {
                array[i].G.m((Object)t);
            }
        }
    }
    
    static final class c<T> implements g0<T>
    {
        private final AtomicReference<b<T>> G;
        
        c(final AtomicReference<b<T>> g) {
            this.G = g;
        }
        
        @Override
        public void c(final i0<? super T> i0) {
            final a a = new a(i0);
            i0.l(a);
            i0<T> newValue = null;
            while (true) {
                final b expectedValue = this.G.get();
                Label_0067: {
                    if (expectedValue != null) {
                        newValue = (i0<T>)expectedValue;
                        if (!expectedValue.i()) {
                            break Label_0067;
                        }
                    }
                    newValue = new b((AtomicReference<b<Object>>)this.G);
                    if (!this.G.compareAndSet(expectedValue, (b<T>)newValue)) {
                        continue;
                    }
                }
                if (((b<T>)newValue).a((a<T>)a)) {
                    break;
                }
            }
            a.a((b<T>)newValue);
        }
    }
}
