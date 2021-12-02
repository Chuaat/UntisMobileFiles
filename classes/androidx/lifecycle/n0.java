// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import kotlinx.coroutines.z1;
import kotlin.jvm.internal.k0;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;
import kotlinx.coroutines.m0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0017R\u0016\u0010\u000b\u001a\u00020\t8\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000e" }, d2 = { "Landroidx/lifecycle/n0;", "Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/j2;", "H", "Landroidx/lifecycle/k;", "Landroidx/lifecycle/k;", "dispatchQueue", "<init>", "()V", "lifecycle-runtime-ktx_release" }, k = 1, mv = { 1, 4, 0 })
public final class n0 extends m0
{
    @d
    @e
    public final k H;
    
    public n0() {
        this.H = new k();
    }
    
    @z1
    public void H(@e final g g, @e final Runnable runnable) {
        k0.q((Object)g, "context");
        k0.q((Object)runnable, "block");
        this.H.h(runnable);
    }
}
