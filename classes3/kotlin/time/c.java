// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0003\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001f\u0010\u000f\u001a\u00020\u00028\u0006@\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0012" }, d2 = { "Lkotlin/time/c;", "Lkotlin/time/o;", "Lkotlin/time/d;", "a", "()J", "duration", "e", "(J)Lkotlin/time/o;", "Lkotlin/time/o;", "g", "()Lkotlin/time/o;", "mark", "b", "J", "f", "adjustment", "<init>", "(Lkotlin/time/o;JLkotlin/jvm/internal/w;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@j
final class c extends o
{
    @e
    private final o a;
    private final long b;
    
    private c(final o a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public long a() {
        return d.T0(this.a.a(), this.b);
    }
    
    @e
    @Override
    public o e(final long n) {
        return new c(this.a, d.U0(this.b, n));
    }
    
    public final long f() {
        return this.b;
    }
    
    @e
    public final o g() {
        return this.a;
    }
}
