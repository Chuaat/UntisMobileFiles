// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.util.q;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import io.reactivex.internal.util.k;
import java.util.concurrent.CountDownLatch;
import io.reactivex.internal.util.e;
import o7.c;
import o7.d;
import x5.g;
import io.reactivex.internal.subscribers.m;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.util.f;
import o7.b;

public final class l
{
    private l() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T> void a(final b<? extends T> b) {
        final f f = new f();
        final m m = new m<Object>(a.h(), f, f, a.l);
        b.e((c)m);
        e.a(f, m);
        final Throwable g = f.G;
        if (g == null) {
            return;
        }
        throw k.f(g);
    }
    
    public static <T> void b(final b<? extends T> b, final c<? super T> c) {
        final LinkedBlockingQueue<Object> linkedBlockingQueue = new LinkedBlockingQueue<Object>();
        final io.reactivex.internal.subscribers.f f = new io.reactivex.internal.subscribers.f(linkedBlockingQueue);
        b.e((c)f);
        try {
            while (!f.a()) {
                Object o;
                if ((o = linkedBlockingQueue.poll()) == null) {
                    if (f.a()) {
                        break;
                    }
                    e.b();
                    o = linkedBlockingQueue.take();
                }
                if (f.a()) {
                    break;
                }
                if (o == io.reactivex.internal.subscribers.f.I) {
                    break;
                }
                if (q.g(o, (o7.c<? super Object>)c)) {
                    break;
                }
            }
        }
        catch (InterruptedException ex) {
            f.cancel();
            c.b((Throwable)ex);
        }
    }
    
    public static <T> void c(final b<? extends T> b, final g<? super T> g, final g<? super Throwable> g2, final x5.a a) {
        io.reactivex.internal.functions.b.g(g, "onNext is null");
        io.reactivex.internal.functions.b.g(g2, "onError is null");
        io.reactivex.internal.functions.b.g(a, "onComplete is null");
        b((o7.b<?>)b, (o7.c<? super Object>)new m((g<? super Object>)g, g2, a, a.l));
    }
    
    public static <T> void d(final b<? extends T> b, final g<? super T> g, final g<? super Throwable> g2, final x5.a a, final int n) {
        io.reactivex.internal.functions.b.g(g, "onNext is null");
        io.reactivex.internal.functions.b.g(g2, "onError is null");
        io.reactivex.internal.functions.b.g(a, "onComplete is null");
        io.reactivex.internal.functions.b.h(n, "number > 0 required");
        b((o7.b<?>)b, (o7.c<? super Object>)new io.reactivex.internal.subscribers.g((g<? super Object>)g, g2, a, a.d(n), n));
    }
}
