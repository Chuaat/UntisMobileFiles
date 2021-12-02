// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.intrinsics;

import kotlin.internal.f;
import kotlin.i0;
import n6.l;
import kotlin.e1;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\u001aD\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001c\b\u0004\u0010\u0004\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0087H\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u001c\u0010\u000b\u001a\u00020\u00038F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f" }, d2 = { "T", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "j", "(Ln6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "getCOROUTINE_SUSPENDED$annotations", "()V", "COROUTINE_SUSPENDED", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
class d extends c
{
    public d() {
    }
    
    @e
    public static Object h() {
        return a.G;
    }
    
    @e1(version = "1.3")
    @f
    private static final <T> Object j(final l<? super kotlin.coroutines.d<? super T>, ?> l, final kotlin.coroutines.d<? super T> d) {
        throw new i0("Implementation of suspendCoroutineUninterceptedOrReturn is intrinsic");
    }
}
