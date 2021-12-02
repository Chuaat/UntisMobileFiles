// 
// Decompiled by Procyon v0.5.36
// 

package rx.observers;

import rx.exceptions.g;
import java.util.Collection;
import rx.exceptions.b;
import java.util.Arrays;
import rx.plugins.f;
import rx.h;
import rx.exceptions.i;
import rx.exceptions.c;
import rx.n;

public class e<T> extends n<T>
{
    private final n<? super T> L;
    boolean M;
    
    public e(final n<? super T> l) {
        super(l);
        this.L = l;
    }
    
    @Override
    public void b(final Throwable t) {
        c.e(t);
        if (!this.M) {
            this.M = true;
            this.w(t);
        }
    }
    
    @Override
    public void c() {
        if (!this.M) {
            this.M = true;
            try {
                this.L.c();
                try {
                    this.i();
                }
                finally {
                    final Throwable t;
                    rx.plugins.c.I(t);
                    throw new i(t.getMessage(), t);
                }
            }
            finally {
                try {
                    final Throwable t2;
                    c.e(t2);
                    rx.plugins.c.I(t2);
                    throw new rx.exceptions.e(t2.getMessage(), t2);
                }
                finally {
                    try {
                        this.i();
                    }
                    finally {
                        final Throwable t3;
                        rx.plugins.c.I(t3);
                        throw new i(t3.getMessage(), t3);
                    }
                }
            }
        }
    }
    
    @Override
    public void m(final T t) {
        try {
            if (!this.M) {
                this.L.m((Object)t);
            }
        }
        finally {
            final Throwable t2;
            c.f(t2, this);
        }
    }
    
    protected void w(final Throwable t) {
        f.c().b().a(t);
        try {
            this.L.b(t);
            try {
                this.i();
            }
            finally {
                rx.plugins.c.I(t);
                throw new rx.exceptions.f(t);
            }
        }
        catch (g g) {
            try {
                this.i();
                throw g;
            }
            finally {
                final Throwable t2;
                rx.plugins.c.I(t2);
                throw new g("Observer.onError not implemented and error while unsubscribing.", new b(Arrays.asList(t, t2)));
            }
        }
        finally {
            final Throwable t3;
            rx.plugins.c.I(t3);
            try {
                this.i();
                throw new rx.exceptions.f("Error occurred when trying to propagate error to Observer.onError", new b(Arrays.asList(t, t3)));
            }
            finally {
                final Throwable t4;
                rx.plugins.c.I(t4);
                throw new rx.exceptions.f("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new b(Arrays.asList(t, t3, t4)));
            }
        }
    }
    
    public n<? super T> x() {
        return this.L;
    }
}
