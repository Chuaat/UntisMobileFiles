// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.schedulers;

import rx.internal.subscriptions.b;
import rx.o;
import rx.functions.a;
import rx.j;
import java.util.concurrent.TimeUnit;

public final class i
{
    public static final long a;
    
    static {
        a = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15L));
    }
    
    private i() {
        throw new IllegalStateException("No instances!");
    }
    
    public static o a(final j.a a, final a a2, final long duration, long duration2, final TimeUnit timeUnit, final b b) {
        final long nanos = timeUnit.toNanos(duration2);
        if (b != null) {
            duration2 = b.a();
        }
        else {
            duration2 = TimeUnit.MILLISECONDS.toNanos(a.b());
        }
        final long nanos2 = timeUnit.toNanos(duration);
        final rx.internal.subscriptions.b b2 = new rx.internal.subscriptions.b();
        final rx.internal.subscriptions.b b3 = new rx.internal.subscriptions.b(b2);
        b2.b(a.d(new a() {
            long G;
            long H = n;
            long I = n2;
            final /* synthetic */ long K = nanos2 + duration2;
            
            @Override
            public void call() {
                a2.call();
                if (!b3.g()) {
                    final b n = b;
                    long h;
                    if (n != null) {
                        h = n.a();
                    }
                    else {
                        h = TimeUnit.MILLISECONDS.toNanos(a.b());
                    }
                    final long a = i.a;
                    final long h2 = this.H;
                    long n2 = 0L;
                    Label_0166: {
                        if (h + a >= h2) {
                            final long p = nanos;
                            if (h < h2 + p + a) {
                                final long i = this.I;
                                final long g = this.G + 1L;
                                this.G = g;
                                n2 = i + g * p;
                                break Label_0166;
                            }
                        }
                        final long p2 = nanos;
                        n2 = h + p2;
                        final long g2 = this.G + 1L;
                        this.G = g2;
                        this.I = n2 - p2 * g2;
                    }
                    this.H = h;
                    b3.b(a.d(this, n2 - h, TimeUnit.NANOSECONDS));
                }
            }
        }, duration, timeUnit));
        return b3;
    }
    
    public interface b
    {
        long a();
    }
}
