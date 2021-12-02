// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.producers;

import java.util.ArrayList;
import java.util.Iterator;
import rx.internal.operators.a;
import rx.exceptions.c;
import java.util.List;
import rx.n;
import rx.h;
import rx.i;

public final class b<T> implements i, h<T>
{
    static final i P;
    final n<? super T> G;
    boolean H;
    List<T> I;
    i J;
    long K;
    long L;
    i M;
    Object N;
    volatile boolean O;
    
    static {
        P = new i() {
            @Override
            public void v(final long n) {
            }
        };
    }
    
    public b(final n<? super T> g) {
        this.G = g;
    }
    
    @Override
    public void b(final Throwable n) {
        synchronized (this) {
            boolean b;
            if (this.H) {
                this.N = n;
                b = false;
            }
            else {
                this.H = true;
                b = true;
            }
            // monitorexit(this)
            if (b) {
                this.G.b(n);
            }
            else {
                this.O = true;
            }
        }
    }
    
    @Override
    public void c() {
        synchronized (this) {
            if (this.H) {
                this.N = Boolean.TRUE;
                return;
            }
            this.H = true;
            // monitorexit(this)
            this.G.c();
        }
    }
    
    void h() {
        final n<? super T> g = this.G;
        final i i = null;
        long n = 0L;
    Label_0009:
        while (true) {
            synchronized (this) {
                final long l = this.L;
                final i m = this.M;
                final Object n2 = this.N;
                final List<T> j = this.I;
                final boolean b = true;
                final long n3 = lcmp(l, 0L);
                boolean b2;
                if (n3 == 0 && m == null && j == null && n2 == null) {
                    this.H = false;
                    b2 = true;
                }
                else {
                    this.L = 0L;
                    this.M = null;
                    this.I = null;
                    this.N = null;
                    b2 = false;
                }
                // monitorexit(this)
                if (b2) {
                    if (n != 0L && i != null) {
                        i.v(n);
                    }
                    return;
                }
                int n4 = b ? 1 : 0;
                if (j != null) {
                    if (j.isEmpty()) {
                        n4 = (b ? 1 : 0);
                    }
                    else {
                        n4 = 0;
                    }
                }
                if (n2 != null) {
                    if (n2 != Boolean.TRUE) {
                        g.b((Throwable)n2);
                        return;
                    }
                    if (n4 != 0) {
                        g.c();
                        return;
                    }
                }
                long n5;
                if (j != null) {
                    for (final T next : j) {
                        if (g.g()) {
                            return;
                        }
                        if (this.O) {
                            continue Label_0009;
                        }
                        try {
                            g.m(next);
                            continue;
                        }
                        finally {
                            final Throwable t;
                            c.g(t, g, next);
                            return;
                        }
                        break;
                    }
                    n5 = j.size() + 0L;
                }
                else {
                    n5 = 0L;
                }
                long k;
                final long n6 = k = this.K;
                if (n6 != Long.MAX_VALUE) {
                    long n7 = n6;
                    if (n3 != 0 && (n7 = n6 + l) < 0L) {
                        n7 = Long.MAX_VALUE;
                    }
                    long k2 = n7;
                    if (n5 != 0L) {
                        k2 = n7;
                        if (n7 != Long.MAX_VALUE) {
                            k2 = n7 - n5;
                            if (k2 < 0L) {
                                throw new IllegalStateException("More produced than requested");
                            }
                        }
                    }
                    this.K = k2;
                    k = k2;
                }
                long n8;
                if (m != null) {
                    if (m == rx.internal.producers.b.P) {
                        this.J = null;
                        continue;
                    }
                    this.J = m;
                    if (k == 0L) {
                        continue;
                    }
                    n8 = a.a(n, k);
                }
                else {
                    if (this.J == null || n3 == 0) {
                        continue;
                    }
                    n8 = a.a(n, l);
                }
                n = n8;
            }
        }
    }
    
    @Override
    public void m(final T t) {
        synchronized (this) {
            if (this.H) {
                List<T> i;
                if ((i = this.I) == null) {
                    i = new ArrayList<T>(4);
                    this.I = i;
                }
                i.add(t);
                return;
            }
            this.H = true;
            // monitorexit(this)
            try {
                this.G.m((Object)t);
                final long k = this.K;
                if (k != Long.MAX_VALUE) {
                    this.K = k - 1L;
                }
                this.h();
            }
            finally {
                synchronized (this) {
                    this.H = false;
                }
            }
        }
    }
    
    public void s0(i p) {
        synchronized (this) {
            if (this.H) {
                if (p == null) {
                    p = b.P;
                }
                this.M = p;
                return;
            }
            this.H = true;
            // monitorexit(this)
            this.J = p;
            final long k = this.K;
            try {
                this.h();
                if (p != null && k != 0L) {
                    p.v(k);
                }
            }
            finally {
                synchronized (this) {
                    this.H = false;
                }
            }
        }
    }
    
    @Override
    public void v(final long n) {
        final long n2 = lcmp(n, 0L);
        if (n2 >= 0) {
            if (n2 == 0) {
                return;
            }
            synchronized (this) {
                if (this.H) {
                    this.L += n;
                    return;
                }
                this.H = true;
                // monitorexit(this)
                final i j = this.J;
                try {
                    long k;
                    if ((k = this.K + n) < 0L) {
                        k = Long.MAX_VALUE;
                    }
                    this.K = k;
                    this.h();
                    if (j != null) {
                        j.v(n);
                    }
                    return;
                }
                finally {
                    synchronized (this) {
                        this.H = false;
                    }
                }
            }
        }
        throw new IllegalArgumentException("n >= 0 required");
    }
}
