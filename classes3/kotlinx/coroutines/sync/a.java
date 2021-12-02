// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.sync;

import kotlin.j2;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlinx.coroutines.m;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012" }, d2 = { "Lkotlinx/coroutines/sync/a;", "Lkotlinx/coroutines/m;", "", "cause", "Lkotlin/j2;", "a", "", "toString", "", "H", "I", "index", "Lkotlinx/coroutines/sync/i;", "G", "Lkotlinx/coroutines/sync/i;", "segment", "<init>", "(Lkotlinx/coroutines/sync/i;I)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class a extends m
{
    private final i G;
    private final int H;
    
    public a(@e final i g, final int h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public void a(@f final Throwable t) {
        this.G.s(this.H);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CancelSemaphoreAcquisitionHandler[");
        sb.append(this.G);
        sb.append(", ");
        sb.append(this.H);
        sb.append(']');
        return sb.toString();
    }
}
