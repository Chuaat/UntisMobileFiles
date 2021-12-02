// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.Collection;
import java.util.Arrays;
import rx.exceptions.c;
import rx.m;
import rx.functions.b;
import rx.functions.p;
import rx.functions.o;
import rx.k;

public final class z4<T, Resource> implements t<T>
{
    final o<Resource> G;
    final p<? super Resource, ? extends k<? extends T>> H;
    final b<? super Resource> I;
    final boolean J;
    
    public z4(final o<Resource> g, final p<? super Resource, ? extends k<? extends T>> h, final b<? super Resource> i, final boolean j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void a(final m<? super T> m) {
        try {
            Object call = this.G.call();
            try {
                final k k = (k)this.H.h((Object)call);
                if (k == null) {
                    this.b(m, (Resource)call, new NullPointerException("The single"));
                    return;
                }
                call = new m<T>() {
                    @Override
                    public void b(final Throwable t) {
                        z4.this.b(m, call, t);
                    }
                    
                    @Override
                    public void e(final T t) {
                        final z4 j = z4.this;
                        if (j.J) {
                            try {
                                j.I.h((Object)call);
                            }
                            finally {
                                c.e((Throwable)t);
                                m.b((Throwable)t);
                                return;
                            }
                        }
                        m.e(t);
                        final z4 i = z4.this;
                        if (!i.J) {
                            try {
                                i.I.h((Object)call);
                            }
                            finally {
                                final Throwable t2;
                                c.e(t2);
                                rx.plugins.c.I(t2);
                            }
                        }
                    }
                };
                m.d((rx.o)call);
                k.j0((m)call);
            }
            finally {
                final Throwable t;
                this.b(m, (Resource)call, t);
            }
        }
        finally {
            final Throwable t2;
            c.e(t2);
            m.b(t2);
        }
    }
    
    void b(final m<? super T> m, final Resource resource, final Throwable t) {
        c.e(t);
        Throwable t2 = t;
        if (this.J) {
            try {
                this.I.h((Object)resource);
            }
            finally {
                final Throwable t3;
                c.e(t3);
                t2 = new rx.exceptions.b(Arrays.asList(t, t3));
            }
        }
        m.b(t2);
        if (!this.J) {
            try {
                this.I.h((Object)resource);
            }
            finally {
                final Throwable t4;
                c.e(t4);
                rx.plugins.c.I(t4);
            }
        }
    }
}
