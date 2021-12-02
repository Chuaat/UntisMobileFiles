// 
// Decompiled by Procyon v0.5.36
// 

package rx;

import rx.internal.util.q;

public abstract class n<T> implements h<T>, o
{
    private static final long K = Long.MIN_VALUE;
    private final q G;
    private final n<?> H;
    private i I;
    private long J;
    
    protected n() {
        this(null, false);
    }
    
    protected n(final n<?> n) {
        this(n, true);
    }
    
    protected n(final n<?> h, final boolean b) {
        this.J = Long.MIN_VALUE;
        this.H = h;
        q g;
        if (b && h != null) {
            g = h.G;
        }
        else {
            g = new q();
        }
        this.G = g;
    }
    
    private void t(long n) {
        final long j = this.J;
        if (j != Long.MIN_VALUE) {
            n += j;
            if (n >= 0L) {
                this.J = n;
                return;
            }
            n = Long.MAX_VALUE;
        }
        this.J = n;
    }
    
    public void f() {
    }
    
    @Override
    public final boolean g() {
        return this.G.g();
    }
    
    @Override
    public final void i() {
        this.G.i();
    }
    
    public final void r(final o o) {
        this.G.a(o);
    }
    
    public void s0(final i i) {
        synchronized (this) {
            final long j = this.J;
            this.I = i;
            final n<?> h = this.H;
            final boolean b = h != null && j == Long.MIN_VALUE;
            // monitorexit(this)
            if (b) {
                h.s0(i);
            }
            else {
                long n = j;
                if (j == Long.MIN_VALUE) {
                    n = Long.MAX_VALUE;
                }
                i.v(n);
            }
        }
    }
    
    protected final void v(final long lng) {
        if (lng >= 0L) {
            synchronized (this) {
                final i i = this.I;
                if (i != null) {
                    // monitorexit(this)
                    i.v(lng);
                    return;
                }
                this.t(lng);
                return;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("number requested cannot be negative: ");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString());
    }
}
