// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.k2$a;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.e;
import androidx.annotation.g0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082\bJ\b\u0010\u0006\u001a\u00020\u0004H\u0007R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018" }, d2 = { "Landroidx/lifecycle/LifecycleController;", "", "Lkotlinx/coroutines/k2;", "parentJob", "Lkotlin/j2;", "e", "d", "Landroidx/lifecycle/s;", "b", "Landroidx/lifecycle/s;", "lifecycle", "Landroidx/lifecycle/v;", "a", "Landroidx/lifecycle/v;", "observer", "Landroidx/lifecycle/k;", "Landroidx/lifecycle/k;", "dispatchQueue", "Landroidx/lifecycle/s$c;", "c", "Landroidx/lifecycle/s$c;", "minState", "<init>", "(Landroidx/lifecycle/s;Landroidx/lifecycle/s$c;Landroidx/lifecycle/k;Lkotlinx/coroutines/k2;)V", "lifecycle-runtime-ktx_release" }, k = 1, mv = { 1, 4, 0 })
@g0
public final class LifecycleController
{
    private final v a;
    private final s b;
    private final s.c c;
    private final k d;
    
    public LifecycleController(@e final s b, @e final s.c c, @e final k d, @e final k2 k2) {
        k0.q((Object)b, "lifecycle");
        k0.q((Object)c, "minState");
        k0.q((Object)d, "dispatchQueue");
        k0.q((Object)k2, "parentJob");
        this.b = b;
        this.c = c;
        this.d = d;
        final LifecycleController$observer.LifecycleController$observer$1 a = new LifecycleController$observer.LifecycleController$observer$1(this, k2);
        this.a = (v)a;
        if (b.b() == s.c.G) {
            k2$a.b(k2, (CancellationException)null, 1, (Object)null);
            this.d();
        }
        else {
            b.a((x)a);
        }
    }
    
    private final void e(final k2 k2) {
        k2$a.b(k2, (CancellationException)null, 1, (Object)null);
        this.d();
    }
    
    @g0
    public final void d() {
        this.b.c(this.a);
        this.d.e();
    }
}
