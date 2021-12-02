// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.functions.b;
import io.reactivex.internal.util.q;
import java.util.Queue;
import io.reactivex.internal.observers.i;
import java.util.concurrent.LinkedBlockingQueue;
import io.reactivex.internal.util.k;
import io.reactivex.disposables.c;
import java.util.concurrent.CountDownLatch;
import io.reactivex.internal.util.e;
import io.reactivex.i0;
import x5.g;
import io.reactivex.internal.observers.u;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.util.f;
import io.reactivex.g0;

public final class l
{
    private l() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T> void a(final g0<? extends T> g0) {
        final f f = new f();
        final u u = new u<Object>(a.h(), f, f, a.h());
        g0.c((i0<? super T>)u);
        e.a(f, u);
        final Throwable g2 = f.G;
        if (g2 == null) {
            return;
        }
        throw k.f(g2);
    }
    
    public static <T> void b(final g0<? extends T> g0, final i0<? super T> i0) {
        final LinkedBlockingQueue<Object> linkedBlockingQueue = new LinkedBlockingQueue<Object>();
        final i j = new i<Object>(linkedBlockingQueue);
        i0.l(j);
        g0.c((i0<? super T>)j);
        while (!j.i()) {
            Object o;
            if ((o = linkedBlockingQueue.poll()) == null) {
                try {
                    o = linkedBlockingQueue.take();
                }
                catch (InterruptedException ex) {
                    j.dispose();
                    i0.b(ex);
                    return;
                }
            }
            if (j.i() || g0 == i.I || q.f(o, (i0<? super Object>)i0)) {
                return;
            }
        }
    }
    
    public static <T> void c(final g0<? extends T> g0, final g<? super T> g2, final g<? super Throwable> g3, final x5.a a) {
        b.g(g2, "onNext is null");
        b.g(g3, "onError is null");
        b.g(a, "onComplete is null");
        b((g0<?>)g0, (i0<? super Object>)new u<Object>((g<? super Object>)g2, g3, a, a.h()));
    }
}
