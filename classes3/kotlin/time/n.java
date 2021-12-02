// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0014J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e" }, d2 = { "Lkotlin/time/n;", "Lkotlin/time/b;", "Lkotlin/time/d;", "duration", "Lkotlin/j2;", "d", "(J)V", "", "c", "e", "J", "reading", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
@j
public final class n extends b
{
    private long c;
    
    public n() {
        super(TimeUnit.NANOSECONDS);
    }
    
    private final void d(final long n) {
        final StringBuilder sb = new StringBuilder();
        sb.append("TestTimeSource will overflow if its reading ");
        sb.append(this.c);
        sb.append("ns is advanced by ");
        sb.append(d.l1(n));
        sb.append('.');
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    protected long c() {
        return this.c;
    }
    
    public final void e(final long n) {
        final long h1 = d.h1(n, this.b());
        long c2;
        if (h1 != Long.MIN_VALUE && h1 != Long.MAX_VALUE) {
            final long c = this.c;
            final long n2 = c2 = c + h1;
            if ((h1 ^ c) >= 0L) {
                c2 = n2;
                if ((c ^ n2) < 0L) {
                    this.d(n);
                    c2 = n2;
                }
            }
        }
        else {
            final double n3 = this.c + d.e1(n, this.b());
            if (n3 > Long.MAX_VALUE || n3 < Long.MIN_VALUE) {
                this.d(n);
            }
            c2 = (long)n3;
        }
        this.c = c2;
    }
}
