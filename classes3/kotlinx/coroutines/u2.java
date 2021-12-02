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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\n\u001a\u00020\t\u0012'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b¢\u0006\u0002\b\u000e\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0014R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012" }, d2 = { "Lkotlinx/coroutines/u2;", "T", "Lkotlinx/coroutines/b1;", "Lkotlin/j2;", "w1", "Lkotlin/coroutines/d;", "J", "Lkotlin/coroutines/d;", "continuation", "Lkotlin/coroutines/g;", "parentContext", "Lkotlin/Function2;", "Lkotlinx/coroutines/r0;", "", "Lkotlin/s;", "block", "<init>", "(Lkotlin/coroutines/g;Ln6/p;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class u2<T> extends b1<T>
{
    private final kotlin.coroutines.d<j2> J;
    
    public u2(@e final g g, @e final p<? super r0, ? super kotlin.coroutines.d<? super T>, ?> p2) {
        super(g, false);
        this.J = (kotlin.coroutines.d<j2>)b.c((p)p2, (Object)this, (kotlin.coroutines.d)this);
    }
    
    @Override
    protected void w1() {
        a.b(this.J, (kotlin.coroutines.d<?>)this);
    }
}
