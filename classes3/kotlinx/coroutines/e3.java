// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.j2;
import org.jetbrains.annotations.f;
import kotlinx.coroutines.internal.t;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e" }, d2 = { "Lkotlinx/coroutines/e3;", "Lkotlinx/coroutines/e;", "", "cause", "Lkotlin/j2;", "a", "", "toString", "Lkotlinx/coroutines/internal/t;", "G", "Lkotlinx/coroutines/internal/t;", "node", "<init>", "(Lkotlinx/coroutines/internal/t;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class e3 extends e
{
    private final t G;
    
    public e3(@org.jetbrains.annotations.e final t g) {
        this.G = g;
    }
    
    @Override
    public void a(@f final Throwable t) {
        this.G.C0();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("RemoveOnCancel[");
        sb.append(this.G);
        sb.append(']');
        return sb.toString();
    }
}
