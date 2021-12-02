// 
// Decompiled by Procyon v0.5.36
// 

package rx.observables;

import java.util.concurrent.Future;
import rx.functions.m;
import rx.functions.a;
import rx.i;
import rx.o;
import rx.internal.operators.x;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import rx.h;
import rx.internal.operators.d;
import rx.internal.operators.f;
import rx.internal.util.s;
import rx.functions.p;
import java.util.Iterator;
import rx.exceptions.c;
import rx.internal.util.e;
import rx.n;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import rx.g;

public final class b<T>
{
    static final Object b;
    static final Object c;
    static final Object d;
    private final g<? extends T> a;
    
    static {
        b = new Object();
        c = new Object();
        d = new Object();
    }
    
    private b(final g<? extends T> a) {
        this.a = a;
    }
    
    private T a(final g<? extends T> g) {
        final AtomicReference<T> atomicReference = new AtomicReference<T>();
        final AtomicReference<Throwable> atomicReference2 = new AtomicReference<Throwable>();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        e.a(countDownLatch, g.z5(new n<T>() {
            @Override
            public void b(final Throwable newValue) {
                atomicReference2.set(newValue);
                countDownLatch.countDown();
            }
            
            @Override
            public void c() {
                countDownLatch.countDown();
            }
            
            @Override
            public void m(final T newValue) {
                atomicReference.set(newValue);
            }
        }));
        if (atomicReference2.get() != null) {
            rx.exceptions.c.c(atomicReference2.get());
        }
        return atomicReference.get();
    }
    
    public static <T> b<T> g(final g<? extends T> g) {
        return new b<T>(g);
    }
    
    public Iterable<T> A() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return rx.observables.b.this.h();
            }
        };
    }
    
    public T b() {
        return this.a(this.a.f2());
    }
    
    public T c(final p<? super T, Boolean> p) {
        return this.a(this.a.g2(p));
    }
    
    public T d(final T t) {
        return this.a((g<? extends T>)this.a.k3((p<? super T, ? extends T>)s.c()).h2(t));
    }
    
    public T e(final T t, final p<? super T, Boolean> p2) {
        return this.a((g<? extends T>)this.a.d2(p2).k3((p<? super T, ? extends T>)s.c()).h2(t));
    }
    
    public void f(final rx.functions.b<? super T> b) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference<Throwable> atomicReference = new AtomicReference<Throwable>();
        e.a(countDownLatch, this.a.z5(new n<T>() {
            @Override
            public void b(final Throwable newValue) {
                atomicReference.set(newValue);
                countDownLatch.countDown();
            }
            
            @Override
            public void c() {
                countDownLatch.countDown();
            }
            
            @Override
            public void m(final T t) {
                b.h(t);
            }
        }));
        if (atomicReference.get() != null) {
            rx.exceptions.c.c(atomicReference.get());
        }
    }
    
    public Iterator<T> h() {
        return f.a(this.a);
    }
    
    public T i() {
        return this.a(this.a.e3());
    }
    
    public T j(final p<? super T, Boolean> p) {
        return this.a(this.a.f3(p));
    }
    
    public T k(final T t) {
        return this.a((g<? extends T>)this.a.k3((p<? super T, ? extends T>)s.c()).g3(t));
    }
    
    public T l(final T t, final p<? super T, Boolean> p2) {
        return this.a((g<? extends T>)this.a.d2(p2).k3((p<? super T, ? extends T>)s.c()).g3(t));
    }
    
    public Iterable<T> m() {
        return rx.internal.operators.b.a(this.a);
    }
    
    public Iterable<T> n(final T t) {
        return rx.internal.operators.c.a(this.a, t);
    }
    
    public Iterable<T> o() {
        return rx.internal.operators.d.a(this.a);
    }
    
    public T p() {
        return this.a(this.a.Y4());
    }
    
    public T q(final p<? super T, Boolean> p) {
        return this.a(this.a.Z4(p));
    }
    
    public T r(final T t) {
        return this.a((g<? extends T>)this.a.k3((p<? super T, ? extends T>)s.c()).a5(t));
    }
    
    public T s(final T t, final p<? super T, Boolean> p2) {
        return this.a((g<? extends T>)this.a.d2(p2).k3((p<? super T, ? extends T>)s.c()).a5(t));
    }
    
    public void t() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Throwable[] array = { null };
        e.a(countDownLatch, this.a.z5(new n<T>() {
            @Override
            public void b(final Throwable t) {
                array[0] = t;
                countDownLatch.countDown();
            }
            
            @Override
            public void c() {
                countDownLatch.countDown();
            }
            
            @Override
            public void m(final T t) {
            }
        }));
        final Throwable t = array[0];
        if (t != null) {
            rx.exceptions.c.c(t);
        }
    }
    
    public void u(final h<? super T> h) {
        final LinkedBlockingQueue<Object> linkedBlockingQueue = new LinkedBlockingQueue<Object>();
        final o z5 = this.a.z5(new n<T>() {
            @Override
            public void b(final Throwable t) {
                linkedBlockingQueue.offer(x.c(t));
            }
            
            @Override
            public void c() {
                linkedBlockingQueue.offer(x.b());
            }
            
            @Override
            public void m(final T t) {
                linkedBlockingQueue.offer(x.j(t));
            }
        });
        try {
            try {
                Object o;
                do {
                    if ((o = linkedBlockingQueue.poll()) == null) {
                        o = linkedBlockingQueue.take();
                    }
                } while (!x.a(h, o));
                z5.i();
                return;
            }
            finally {}
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            h.b(ex);
            z5.i();
            return;
        }
        z5.i();
    }
    
    public void v(final n<? super T> n) {
        final LinkedBlockingQueue<Object> linkedBlockingQueue = new LinkedBlockingQueue<Object>();
        final i[] array = { null };
        final n<T> n2 = new n<T>() {
            @Override
            public void b(final Throwable t) {
                linkedBlockingQueue.offer(x.c(t));
            }
            
            @Override
            public void c() {
                linkedBlockingQueue.offer(x.b());
            }
            
            @Override
            public void f() {
                linkedBlockingQueue.offer(rx.observables.b.b);
            }
            
            @Override
            public void m(final T t) {
                linkedBlockingQueue.offer(x.j(t));
            }
            
            @Override
            public void s0(final i i) {
                array[0] = i;
                linkedBlockingQueue.offer(rx.observables.b.c);
            }
        };
        n.r(n2);
        n.r(rx.subscriptions.f.a(new a() {
            @Override
            public void call() {
                linkedBlockingQueue.offer(rx.observables.b.d);
            }
        }));
        this.a.z5(n2);
        while (true) {
            try {
                try {
                    while (!n.g()) {
                        Object o;
                        if ((o = linkedBlockingQueue.poll()) == null) {
                            o = linkedBlockingQueue.take();
                        }
                        if (!n.g()) {
                            if (o != rx.observables.b.d) {
                                if (o == rx.observables.b.b) {
                                    n.f();
                                    continue;
                                }
                                if (o == rx.observables.b.c) {
                                    n.s0(array[0]);
                                    continue;
                                }
                                if (x.a(n, o)) {
                                    n2.i();
                                    return;
                                }
                                continue;
                            }
                        }
                        n2.i();
                        return;
                    }
                }
                finally {}
            }
            catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                n.b(ex);
                continue;
            }
            break;
        }
        return;
        n2.i();
    }
    
    public void w(final rx.functions.b<? super T> b) {
        this.y(b, new rx.functions.b<Throwable>() {
            public void a(final Throwable t) {
                throw new rx.exceptions.g(t);
            }
        }, m.a());
    }
    
    public void x(final rx.functions.b<? super T> b, final rx.functions.b<? super Throwable> b2) {
        this.y(b, b2, m.a());
    }
    
    public void y(final rx.functions.b<? super T> b, final rx.functions.b<? super Throwable> b2, final a a) {
        this.u(new h<T>() {
            @Override
            public void b(final Throwable t) {
                b2.h(t);
            }
            
            @Override
            public void c() {
                a.call();
            }
            
            @Override
            public void m(final T t) {
                b.h(t);
            }
        });
    }
    
    public Future<T> z() {
        return rx.internal.operators.e.a(this.a);
    }
}
