// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;
import kotlinx.coroutines.internal.g0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013" }, d2 = { "Lkotlinx/coroutines/z3;", "U", "T", "Lkotlinx/coroutines/internal/g0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlin/j2;", "run", "", "T0", "()Ljava/lang/String;", "", "K", "J", "time", "Lkotlin/coroutines/d;", "uCont", "<init>", "(JLkotlin/coroutines/d;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class z3<U, T extends U> extends g0<T> implements Runnable
{
    @d
    public final long K;
    
    public z3(final long k, @e final kotlin.coroutines.d<? super U> d) {
        super(d.getContext(), d);
        this.K = k;
    }
    
    @e
    @Override
    public String T0() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.T0());
        sb.append("(timeMillis=");
        sb.append(this.K);
        sb.append(')');
        return sb.toString();
    }
    
    @Override
    public void run() {
        this.i0(a4.a(this.K, this));
    }
}
