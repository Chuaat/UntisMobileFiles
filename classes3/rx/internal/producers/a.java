// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.producers;

import rx.i;

public final class a implements i
{
    static final i M;
    long G;
    i H;
    boolean I;
    long J;
    long K;
    i L;
    
    static {
        M = new i() {
            @Override
            public void v(final long n) {
            }
        };
    }
    
    public void a() {
        while (true) {
            synchronized (this) {
                final long j = this.J;
                final long k = this.K;
                final i l = this.L;
                final long n = lcmp(j, 0L);
                if (n == 0 && k == 0L && l == null) {
                    this.I = false;
                    return;
                }
                this.J = 0L;
                this.K = 0L;
                this.L = null;
                // monitorexit(this)
                long g;
                final long n2 = g = this.G;
                if (n2 != Long.MAX_VALUE) {
                    final long n3 = n2 + j;
                    if (n3 >= 0L && n3 != Long.MAX_VALUE) {
                        g = n3 - k;
                        if (g < 0L) {
                            throw new IllegalStateException("more produced than requested");
                        }
                        this.G = g;
                    }
                    else {
                        this.G = Long.MAX_VALUE;
                        g = Long.MAX_VALUE;
                    }
                }
                if (l != null) {
                    if (l == a.M) {
                        this.H = null;
                    }
                    else {
                        (this.H = l).v(g);
                    }
                }
                else {
                    final i h = this.H;
                    if (h == null || n == 0) {
                        continue;
                    }
                    h.v(j);
                }
            }
        }
    }
    
    public void b(long g) {
        if (g > 0L) {
            synchronized (this) {
                if (this.I) {
                    this.K += g;
                    return;
                }
                this.I = true;
                // monitorexit(this)
                try {
                    final long g2 = this.G;
                    if (g2 != Long.MAX_VALUE) {
                        g = g2 - g;
                        if (g < 0L) {
                            throw new IllegalStateException("more items arrived than were requested");
                        }
                        this.G = g;
                    }
                    this.a();
                    return;
                }
                finally {
                    synchronized (this) {
                        this.I = false;
                    }
                }
            }
        }
        throw new IllegalArgumentException("n > 0 required");
    }
    
    public void c(final i h) {
        synchronized (this) {
            if (this.I) {
                i m;
                if ((m = h) == null) {
                    m = a.M;
                }
                this.L = m;
                return;
            }
            this.I = true;
            // monitorexit(this)
            try {
                this.H = h;
                if (h != null) {
                    h.v(this.G);
                }
                this.a();
            }
            finally {
                synchronized (this) {
                    this.I = false;
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
                if (this.I) {
                    this.J += n;
                    return;
                }
                this.I = true;
                // monitorexit(this)
                try {
                    long g;
                    if ((g = this.G + n) < 0L) {
                        g = Long.MAX_VALUE;
                    }
                    this.G = g;
                    final i h = this.H;
                    if (h != null) {
                        h.v(n);
                    }
                    this.a();
                    return;
                }
                finally {
                    synchronized (this) {
                        this.I = false;
                    }
                }
            }
        }
        throw new IllegalArgumentException("n >= 0 required");
    }
}
