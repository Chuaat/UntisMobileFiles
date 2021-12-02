// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.o2;
import kotlin.jvm.internal.k0;
import kotlin.coroutines.g;
import kotlin.Metadata;
import kotlinx.coroutines.r0;
import java.io.Closeable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001c\u0010\n\u001a\u00020\u00058\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000e" }, d2 = { "Landroidx/lifecycle/e;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/r0;", "Lkotlin/j2;", "close", "Lkotlin/coroutines/g;", "G", "Lkotlin/coroutines/g;", "J", "()Lkotlin/coroutines/g;", "coroutineContext", "context", "<init>", "(Lkotlin/coroutines/g;)V", "lifecycle-viewmodel-ktx_release" }, k = 1, mv = { 1, 4, 0 })
public final class e implements Closeable, r0
{
    @org.jetbrains.annotations.e
    private final g G;
    
    public e(@org.jetbrains.annotations.e final g g) {
        k0.q((Object)g, "context");
        this.G = g;
    }
    
    @org.jetbrains.annotations.e
    public g J() {
        return this.G;
    }
    
    @Override
    public void close() {
        o2.j(this.J(), (CancellationException)null, 1, (Object)null);
    }
}
