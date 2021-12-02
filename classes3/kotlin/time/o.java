// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0003\u001a\u00020\u0002H&\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\t\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u000e" }, d2 = { "Lkotlin/time/o;", "", "Lkotlin/time/d;", "a", "()J", "duration", "e", "(J)Lkotlin/time/o;", "d", "", "c", "b", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
@j
public abstract class o
{
    public abstract long a();
    
    public final boolean b() {
        return d.R0(this.a());
    }
    
    public final boolean c() {
        return d.R0(this.a()) ^ true;
    }
    
    @e
    public o d(final long n) {
        return this.e(d.o1(n));
    }
    
    @e
    public o e(final long n) {
        return new c(this, n, null);
    }
}
