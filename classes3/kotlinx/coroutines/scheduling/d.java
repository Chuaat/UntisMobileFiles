// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.f2;
import kotlin.jvm.internal.w;
import kotlin.ranges.o;
import kotlinx.coroutines.m0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0007R\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f" }, d2 = { "Lkotlinx/coroutines/scheduling/d;", "Lkotlinx/coroutines/scheduling/e;", "Lkotlin/j2;", "close", "", "toString", "i0", "Lkotlinx/coroutines/m0;", "N", "Lkotlinx/coroutines/m0;", "h0", "()Lkotlinx/coroutines/m0;", "IO", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class d extends e
{
    @org.jetbrains.annotations.e
    private static final m0 N;
    @org.jetbrains.annotations.e
    public static final d O;
    
    static {
        N = new g(O = new d(), kotlinx.coroutines.internal.m0.f("kotlinx.coroutines.io.parallelism", o.n(64, kotlinx.coroutines.internal.m0.a()), 0, 0, 12, null), "Dispatchers.IO", 1);
    }
    
    private d() {
        super(0, 0, null, 7, null);
    }
    
    @Override
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }
    
    @org.jetbrains.annotations.e
    public final m0 h0() {
        return d.N;
    }
    
    @f2
    @org.jetbrains.annotations.e
    public final String i0() {
        return super.toString();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        return "Dispatchers.Default";
    }
}
