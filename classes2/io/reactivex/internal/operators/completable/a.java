// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.e;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.c;

public final class a extends c
{
    private final i[] G;
    private final Iterable<? extends i> H;
    
    public a(final i[] g, final Iterable<? extends i> h) {
        this.G = g;
        this.H = h;
    }
    
    public void L0(final f f) {
        i[] g = this.G;
        int length = 0;
        Label_0136: {
            if (g == null) {
                i[] array = new i[8];
                try {
                    final Iterator<? extends i> iterator = this.H.iterator();
                    int n = 0;
                    while (true) {
                        g = array;
                        length = n;
                        if (!iterator.hasNext()) {
                            break Label_0136;
                        }
                        final i i = (i)iterator.next();
                        if (i == null) {
                            break;
                        }
                        g = array;
                        if (n == array.length) {
                            g = new i[(n >> 2) + n];
                            System.arraycopy(array, 0, g, 0, n);
                        }
                        g[n] = i;
                        ++n;
                        array = g;
                    }
                    e.g(new NullPointerException("One of the sources is null"), f);
                    return;
                }
                finally {
                    final Throwable t;
                    b.b(t);
                    e.g(t, f);
                    return;
                }
            }
            length = g.length;
        }
        final io.reactivex.disposables.b b = new io.reactivex.disposables.b();
        f.l(b);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (final i k : g) {
            if (b.i()) {
                return;
            }
            if (k == null) {
                final NullPointerException ex = new NullPointerException("One of the sources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    b.dispose();
                    f.b(ex);
                }
                else {
                    a.Y(ex);
                }
                return;
            }
            k.c(new a(atomicBoolean, b, f));
        }
        if (length == 0) {
            f.f();
        }
    }
    
    static final class a implements f
    {
        final AtomicBoolean G;
        final io.reactivex.disposables.b H;
        final f I;
        io.reactivex.disposables.c J;
        
        a(final AtomicBoolean g, final io.reactivex.disposables.b h, final f i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.G.compareAndSet(false, true)) {
                this.H.c(this.J);
                this.H.dispose();
                this.I.b(t);
            }
            else {
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void f() {
            if (this.G.compareAndSet(false, true)) {
                this.H.c(this.J);
                this.H.dispose();
                this.I.f();
            }
        }
        
        @Override
        public void l(final io.reactivex.disposables.c j) {
            this.J = j;
            this.H.b(j);
        }
    }
}
