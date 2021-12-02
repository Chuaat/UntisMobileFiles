// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import kotlinx.coroutines.w0;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import kotlin.j2;
import kotlin.Metadata;
import kotlinx.coroutines.flow.internal.d;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J)\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014" }, d2 = { "Lkotlinx/coroutines/flow/n0;", "Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/flow/k0;", "flow", "", "c", "", "Lkotlin/coroutines/d;", "Lkotlin/j2;", "d", "(Lkotlinx/coroutines/flow/k0;)[Lkotlin/coroutines/d;", "b", "Lkotlin/coroutines/d;", "cont", "", "a", "J", "index", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class n0 extends d<k0<?>>
{
    @m6.d
    public long a;
    @m6.d
    @f
    public kotlin.coroutines.d<? super j2> b;
    
    public n0() {
        this.a = -1L;
    }
    
    public boolean c(@e final k0<?> k0) {
        if (this.a >= 0L) {
            return false;
        }
        this.a = k0.a0();
        return true;
    }
    
    @e
    public kotlin.coroutines.d<j2>[] d(@e final k0<?> k0) {
        if (w0.b() && this.a < 0L) {
            throw new AssertionError();
        }
        final long a = this.a;
        this.a = -1L;
        this.b = null;
        return (kotlin.coroutines.d<j2>[])k0.Z(a);
    }
}
