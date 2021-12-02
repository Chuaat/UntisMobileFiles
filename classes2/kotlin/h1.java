// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.internal.f;
import kotlin.jvm.internal.h0;
import n6.a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007" }, d2 = { "R", "", "lock", "Lkotlin/Function0;", "block", "l", "(Ljava/lang/Object;Ln6/a;)Ljava/lang/Object;", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/StandardKt")
class h1 extends g1
{
    public h1() {
    }
    
    @f
    private static final <R> R l(final Object o, final a<? extends R> a) {
        // monitorenter(o)
        try {
            return (R)a.invoke();
        }
        finally {
            h0.d(1);
            // monitorexit(o)
            h0.c(1);
        }
    }
}
