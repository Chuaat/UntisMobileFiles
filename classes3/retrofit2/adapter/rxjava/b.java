// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2.adapter.rxjava;

import rx.exceptions.c;
import rx.exceptions.e;
import rx.exceptions.f;
import rx.exceptions.g;
import retrofit2.t;
import rx.n;
import rx.i;
import rx.o;
import java.util.concurrent.atomic.AtomicInteger;

final class b<T> extends AtomicInteger implements o, i
{
    private static final int K = 0;
    private static final int L = 1;
    private static final int M = 2;
    private static final int N = 3;
    private final retrofit2.b<T> G;
    private final n<? super t<T>> H;
    private volatile boolean I;
    private volatile t<T> J;
    
    b(final retrofit2.b<T> g, final n<? super t<T>> h) {
        super(0);
        this.G = g;
        this.H = h;
    }
    
    private void a(t<T> b) {
        try {
            if (!this.g()) {
                this.H.m((Object)b);
            }
            try {
                if (!this.g()) {
                    this.H.c();
                }
                return;
            }
            catch (g b) {}
            catch (f b) {}
            catch (e e) {}
            finally {
                c.e(b);
            }
            rx.plugins.f.c().b().a(b);
            return;
        }
        catch (g b) {}
        catch (f b) {}
        catch (e e2) {}
        finally {
            final Throwable t;
            c.e(t);
            try {
                this.H.b(t);
                return;
            }
            catch (g g) {}
            catch (f f) {}
            catch (e e3) {}
            finally {
                final Throwable t2;
                c.e(t2);
                b = new rx.exceptions.b(new Throwable[] { t, t2 });
                rx.plugins.f.c().b().a(b);
                return;
            }
            rx.plugins.f.c().b().a(b);
            return;
        }
        rx.plugins.f.c().b().a(b);
    }
    
    void b(Throwable g) {
        this.set(3);
        if (!this.g()) {
            try {
                this.H.b(g);
                return;
            }
            catch (g g) {}
            catch (f g) {}
            catch (e e) {}
            finally {
                final Throwable t;
                c.e(t);
                g = (g)new rx.exceptions.b(new Throwable[] { g, t });
                rx.plugins.f.c().b().a(g);
                return;
            }
            rx.plugins.f.c().b().a(g);
        }
    }
    
    void c(final t<T> j) {
        while (true) {
            final int value = this.get();
            if (value != 0) {
                if (value != 1) {
                    if (value != 2 && value != 3) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unknown state: ");
                        sb.append(value);
                        throw new IllegalStateException(sb.toString());
                    }
                    throw new AssertionError();
                }
                else {
                    if (this.compareAndSet(1, 3)) {
                        this.a(j);
                        return;
                    }
                    continue;
                }
            }
            else {
                this.J = j;
                if (this.compareAndSet(0, 2)) {
                    return;
                }
                continue;
            }
        }
    }
    
    @Override
    public boolean g() {
        return this.I;
    }
    
    @Override
    public void i() {
        this.I = true;
        this.G.cancel();
    }
    
    @Override
    public void v(final long n) {
        if (n == 0L) {
            return;
        }
        while (true) {
            final int value = this.get();
            if (value != 0) {
                if (value == 1) {
                    break;
                }
                if (value != 2) {
                    if (value == 3) {
                        break;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown state: ");
                    sb.append(value);
                    throw new IllegalStateException(sb.toString());
                }
                else {
                    if (this.compareAndSet(2, 3)) {
                        this.a(this.J);
                        break;
                    }
                    continue;
                }
            }
            else {
                if (this.compareAndSet(0, 1)) {
                    return;
                }
                continue;
            }
        }
    }
}
