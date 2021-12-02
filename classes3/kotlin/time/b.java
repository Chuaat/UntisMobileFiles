// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.concurrent.TimeUnit;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001:\u0001\u0005B\u0013\u0012\n\u0010\u000b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H$J\b\u0010\u0005\u001a\u00020\u0004H\u0016R \u0010\u000b\u001a\u00060\u0006j\u0002`\u00078\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e" }, d2 = { "Lkotlin/time/b;", "Lkotlin/time/p;", "", "c", "Lkotlin/time/o;", "a", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "b", "Ljava/util/concurrent/TimeUnit;", "()Ljava/util/concurrent/TimeUnit;", "unit", "<init>", "(Ljava/util/concurrent/TimeUnit;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
@j
public abstract class b implements p
{
    @e
    private final TimeUnit b;
    
    public b(@e final TimeUnit b) {
        k0.p((Object)b, "unit");
        this.b = b;
    }
    
    @e
    @Override
    public o a() {
        return new a(this.c(), this, d.K.g(), null);
    }
    
    @e
    protected final TimeUnit b() {
        return this.b;
    }
    
    protected abstract long c();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\n\u001a\u00020\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0003\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0013" }, d2 = { "kotlin/time/b$a", "Lkotlin/time/o;", "Lkotlin/time/d;", "a", "()J", "duration", "e", "(J)Lkotlin/time/o;", "c", "J", "offset", "", "startedAt", "Lkotlin/time/b;", "b", "Lkotlin/time/b;", "timeSource", "<init>", "(JLkotlin/time/b;JLkotlin/jvm/internal/w;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    private static final class a extends o
    {
        private final long a;
        private final b b;
        private final long c;
        
        private a(final long a, final b b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public long a() {
            return d.T0(kotlin.time.e.i0(this.b.c() - this.a, this.b.b()), this.c);
        }
        
        @e
        @Override
        public o e(final long n) {
            return new a(this.a, this.b, d.U0(this.c, n));
        }
    }
}
