// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.j;
import o7.c;
import o7.d;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicLong;

public abstract class t<T, R> extends AtomicLong implements q<T>, d
{
    private static final long K = 7917814472626990048L;
    static final long L = Long.MIN_VALUE;
    static final long M = Long.MAX_VALUE;
    protected final c<? super R> G;
    protected d H;
    protected R I;
    protected long J;
    
    public t(final c<? super R> g) {
        this.G = g;
    }
    
    protected final void a(final R i) {
        final long j = this.J;
        if (j != 0L) {
            io.reactivex.internal.util.d.e(this, j);
        }
        while (true) {
            final long value = this.get();
            if ((value & Long.MIN_VALUE) != 0x0L) {
                this.c(i);
                return;
            }
            if ((value & Long.MAX_VALUE) != 0x0L) {
                this.lazySet(-9223372036854775807L);
                this.G.m((Object)i);
                this.G.f();
                return;
            }
            this.I = i;
            if (this.compareAndSet(0L, Long.MIN_VALUE)) {
                return;
            }
            this.I = null;
        }
    }
    
    protected void c(final R r) {
    }
    
    public void cancel() {
        this.H.cancel();
    }
    
    public final void v(final long n) {
        if (j.m(n)) {
            long value;
            do {
                value = this.get();
                if ((value & Long.MIN_VALUE) != 0x0L) {
                    if (this.compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.G.m((Object)this.I);
                        this.G.f();
                    }
                    return;
                }
            } while (!this.compareAndSet(value, io.reactivex.internal.util.d.c(value, n)));
            this.H.v(n);
        }
    }
    
    @Override
    public void z(final d h) {
        if (j.o(this.H, h)) {
            this.H = h;
            this.G.z((d)this);
        }
    }
}
