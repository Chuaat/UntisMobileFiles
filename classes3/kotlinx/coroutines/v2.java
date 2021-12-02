// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import c7.a;
import kotlin.coroutines.intrinsics.b;
import n6.p;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\t\u001a\u00020\b\u0012'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\r\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011" }, d2 = { "Lkotlinx/coroutines/v2;", "Lkotlinx/coroutines/m3;", "Lkotlin/j2;", "w1", "Lkotlin/coroutines/d;", "J", "Lkotlin/coroutines/d;", "continuation", "Lkotlin/coroutines/g;", "parentContext", "Lkotlin/Function2;", "Lkotlinx/coroutines/r0;", "", "Lkotlin/s;", "block", "<init>", "(Lkotlin/coroutines/g;Ln6/p;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class v2 extends m3
{
    private final d<j2> J;
    
    public v2(@e final g g, @e final p<? super r0, ? super d<? super j2>, ?> p2) {
        super(g, false);
        this.J = (d<j2>)b.c((p)p2, (Object)this, (d)this);
    }
    
    @Override
    protected void w1() {
        c7.a.b(this.J, (d<?>)this);
    }
}
