// 
// Decompiled by Procyon v0.5.36
// 

package rx.schedulers;

import rx.internal.schedulers.k;
import rx.internal.schedulers.n;
import rx.internal.schedulers.d;
import java.util.concurrent.Executor;
import rx.plugins.g;
import rx.plugins.f;
import rx.j;
import java.util.concurrent.atomic.AtomicReference;

public final class c
{
    private static final AtomicReference<c> d;
    private final j a;
    private final j b;
    private final j c;
    
    static {
        d = new AtomicReference<c>();
    }
    
    private c() {
        final g f = rx.plugins.f.c().f();
        j a = f.g();
        if (a == null) {
            a = g.a();
        }
        this.a = a;
        j b = f.i();
        if (b == null) {
            b = g.c();
        }
        this.b = b;
        j c = f.j();
        if (c == null) {
            c = g.e();
        }
        this.c = c;
    }
    
    public static j a() {
        return rx.plugins.c.E(c().a);
    }
    
    public static j b(final Executor executor) {
        return new rx.internal.schedulers.c(executor);
    }
    
    private static c c() {
        while (true) {
            final AtomicReference<c> d = c.d;
            final c c = d.get();
            if (c != null) {
                return c;
            }
            final c newValue = new c();
            if (d.compareAndSet(null, newValue)) {
                return newValue;
            }
            newValue.i();
        }
    }
    
    public static j d() {
        return rx.internal.schedulers.f.a;
    }
    
    public static j e() {
        return rx.plugins.c.J(c().b);
    }
    
    public static j f() {
        return rx.plugins.c.K(c().c);
    }
    
    public static void g() {
        final c c = rx.schedulers.c.d.getAndSet(null);
        if (c != null) {
            c.i();
        }
    }
    
    public static void h() {
        final c c = c();
        c.i();
        synchronized (c) {
            rx.internal.schedulers.d.J.shutdown();
        }
    }
    
    public static void j() {
        final c c = c();
        c.k();
        synchronized (c) {
            rx.internal.schedulers.d.J.start();
        }
    }
    
    public static rx.schedulers.d l() {
        return new rx.schedulers.d();
    }
    
    public static j m() {
        return n.a;
    }
    
    void i() {
        synchronized (this) {
            final j a = this.a;
            if (a instanceof k) {
                ((k)a).shutdown();
            }
            final j b = this.b;
            if (b instanceof k) {
                ((k)b).shutdown();
            }
            final j c = this.c;
            if (c instanceof k) {
                ((k)c).shutdown();
            }
        }
    }
    
    void k() {
        synchronized (this) {
            final j a = this.a;
            if (a instanceof k) {
                ((k)a).start();
            }
            final j b = this.b;
            if (b instanceof k) {
                ((k)b).start();
            }
            final j c = this.c;
            if (c instanceof k) {
                ((k)c).start();
            }
        }
    }
}
