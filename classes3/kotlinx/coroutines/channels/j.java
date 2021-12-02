// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import org.jetbrains.annotations.f;
import java.util.concurrent.CancellationException;
import kotlin.k;
import kotlin.i;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.z1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&J\u0014\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\nH'¨\u0006\r" }, d2 = { "Lkotlinx/coroutines/channels/j;", "E", "Lkotlinx/coroutines/channels/l0;", "Lkotlinx/coroutines/channels/h0;", "L", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/j2;", "d", "", "", "c", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@z1
public interface j<E> extends l0<E>
{
    @e
    h0<E> L();
    
    void d(@f final CancellationException p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 2 })
    public static final class a
    {
    }
}
