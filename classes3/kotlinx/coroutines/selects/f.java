// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.selects;

import kotlin.coroutines.d;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.internal.b;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.f2;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H&J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H&R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00038&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a" }, d2 = { "Lkotlinx/coroutines/selects/f;", "R", "", "", "l", "Lkotlinx/coroutines/internal/t$d;", "Lkotlinx/coroutines/internal/PrepareOp;", "otherOp", "i", "Lkotlinx/coroutines/internal/b;", "desc", "M", "", "exception", "Lkotlin/j2;", "J", "Lkotlinx/coroutines/l1;", "handle", "d0", "Lkotlin/coroutines/d;", "w", "()Lkotlin/coroutines/d;", "completion", "s", "()Z", "isSelected", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@f2
public interface f<R>
{
    void J(@e final Throwable p0);
    
    @org.jetbrains.annotations.f
    Object M(@e final b p0);
    
    void d0(@e final l1 p0);
    
    @org.jetbrains.annotations.f
    Object i(@org.jetbrains.annotations.f final t.d p0);
    
    boolean l();
    
    boolean s();
    
    @e
    d<R> w();
}
