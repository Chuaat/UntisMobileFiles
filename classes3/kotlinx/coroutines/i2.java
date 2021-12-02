// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.j2;
import n6.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B0\u0012'\u0010\u000b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0007j\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000e" }, d2 = { "Lkotlinx/coroutines/i2;", "Lkotlinx/coroutines/m2;", "", "cause", "Lkotlin/j2;", "J0", "(Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "<init>", "(Ln6/l;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class i2 extends m2
{
    private static final /* synthetic */ AtomicIntegerFieldUpdater L;
    private final l<Throwable, j2> K;
    private volatile /* synthetic */ int _invoked;
    
    static {
        L = AtomicIntegerFieldUpdater.newUpdater(i2.class, "_invoked");
    }
    
    public i2(@org.jetbrains.annotations.e final l<? super Throwable, j2> k) {
        this.K = (l<Throwable, j2>)k;
        this._invoked = 0;
    }
    
    @Override
    public void J0(@f final Throwable t) {
        if (i2.L.compareAndSet(this, 0, 1)) {
            this.K.invoke((Object)t);
        }
    }
}
