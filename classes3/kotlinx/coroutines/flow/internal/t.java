// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.channels.n;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlinx.coroutines.f2;
import kotlin.Metadata;
import kotlinx.coroutines.flow.i;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J,\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¨\u0006\n" }, d2 = { "Lkotlinx/coroutines/flow/internal/t;", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "d", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@f2
public interface t<T> extends i<T>
{
    @e
    i<T> d(@e final g p0, final int p1, @e final n p2);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 2 })
    public static final class a
    {
    }
}
