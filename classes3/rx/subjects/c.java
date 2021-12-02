// 
// Decompiled by Procyon v0.5.36
// 

package rx.subjects;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.operators.a;
import rx.exceptions.d;
import rx.n;
import rx.h;
import rx.o;
import rx.i;
import java.util.concurrent.atomic.AtomicLong;
import rx.g;

public final class c<T> extends f<T, T>
{
    final b<T> H;
    
    protected c(final b<T> h) {
        super(h);
        this.H = h;
    }
    
    public static <T> c<T> G7() {
        return new c<T>(new b<T>());
    }
    
    @Override
    public boolean E7() {
        return ((a[])this.H.get()).length != 0;
    }
    
    public Throwable H7() {
        if (this.H.get() == b.J) {
            return this.H.G;
        }
        return null;
    }
    
    public boolean I7() {
        return this.H.get() == b.J && this.H.G == null;
    }
    
    public boolean J7() {
        return this.H.get() == b.J && this.H.G != null;
    }
    
    @Override
    public void b(final Throwable t) {
        this.H.b(t);
    }
    
    @Override
    public void c() {
        this.H.c();
    }
    
    @Override
    public void m(final T t) {
        this.H.m(t);
    }
    
    static final class a<T> extends AtomicLong implements i, o, h<T>
    {
        private static final long J = 6451806817170721536L;
        final b<T> G;
        final n<? super T> H;
        long I;
        
        public a(final b<T> g, final n<? super T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.get() != Long.MIN_VALUE) {
                this.H.b(t);
            }
        }
        
        @Override
        public void c() {
            if (this.get() != Long.MIN_VALUE) {
                this.H.c();
            }
        }
        
        @Override
        public boolean g() {
            return this.get() == Long.MIN_VALUE;
        }
        
        @Override
        public void i() {
            if (this.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.G.r(this);
            }
        }
        
        @Override
        public void m(final T t) {
            final long value = this.get();
            if (value != Long.MIN_VALUE) {
                final long i = this.I;
                if (value != i) {
                    this.I = i + 1L;
                    this.H.m((Object)t);
                }
                else {
                    this.i();
                    this.H.b(new d("PublishSubject: could not emit value due to lack of requests"));
                }
            }
        }
        
        @Override
        public void v(final long n) {
            if (rx.internal.operators.a.j(n)) {
                long value;
                do {
                    value = this.get();
                    if (value == Long.MIN_VALUE) {
                        return;
                    }
                } while (!this.compareAndSet(value, rx.internal.operators.a.a(value, n)));
            }
        }
    }
    
    static final class b<T> extends AtomicReference<a<T>[]> implements g.a<T>, h<T>
    {
        private static final long H = -7568940796666027140L;
        static final a[] I;
        static final a[] J;
        Throwable G;
        
        static {
            I = new a[0];
            J = new a[0];
        }
        
        public b() {
            this.lazySet(b.I);
        }
        
        @Override
        public void b(final Throwable g) {
            this.G = g;
            final a[] array = this.getAndSet(b.J);
            final int length = array.length;
            List<Throwable> list = null;
            for (final a a : array) {
                try {
                    a.b(g);
                }
                finally {
                    List<Throwable> list2 = list;
                    if (list == null) {
                        list2 = new ArrayList<Throwable>(1);
                    }
                    final Throwable t;
                    list2.add(t);
                    list = list2;
                }
            }
            c.d(list);
        }
        
        @Override
        public void c() {
            final a[] array = this.getAndSet(b.J);
            for (int length = array.length, i = 0; i < length; ++i) {
                array[i].c();
            }
        }
        
        @Override
        public void m(final T t) {
            final a[] array = this.get();
            for (int length = array.length, i = 0; i < length; ++i) {
                array[i].m(t);
            }
        }
        
        boolean n(final a<T> a) {
            a[] expectedValue;
            a[] newValue;
            do {
                expectedValue = (a[])this.get();
                if (expectedValue == b.J) {
                    return false;
                }
                final int length = expectedValue.length;
                newValue = new a[length + 1];
                System.arraycopy(expectedValue, 0, newValue, 0, length);
                newValue[length] = a;
            } while (!this.compareAndSet(expectedValue, newValue));
            return true;
        }
        
        public void q(final n<? super T> n) {
            final a a = new a((b)this, n);
            n.r(a);
            n.s0(a);
            if (this.n((a<T>)a)) {
                if (a.g()) {
                    this.r((a<T>)a);
                }
            }
            else {
                final Throwable g = this.G;
                if (g != null) {
                    n.b(g);
                }
                else {
                    n.c();
                }
            }
        }
        
        void r(final a<T> a) {
            a[] expectedValue;
            a[] i;
            do {
                expectedValue = (a[])this.get();
                if (expectedValue == b.J) {
                    break;
                }
                if (expectedValue == b.I) {
                    break;
                }
                final int length = expectedValue.length;
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
                    i = b.I;
                }
                else {
                    i = new a[length - 1];
                    System.arraycopy(expectedValue, 0, i, 0, n3);
                    System.arraycopy(expectedValue, n3 + 1, i, n3, length - n3 - 1);
                }
            } while (!this.compareAndSet(expectedValue, i));
        }
    }
}
