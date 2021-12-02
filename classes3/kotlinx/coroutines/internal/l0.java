// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import kotlin.jvm.internal.h0;
import n6.a;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.f2;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007*\u0010\b\u0007\u0010\t\"\u00020\u00012\u00020\u0001B\u0002\b\b¨\u0006\n" }, d2 = { "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "lock", "Lkotlin/Function0;", "block", "b", "(Ljava/lang/Object;Ln6/a;)Ljava/lang/Object;", "Lkotlinx/coroutines/f2;", "SynchronizedObject", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class l0
{
    @f2
    public static final <T> T b(@e final Object o, @e final a<? extends T> a) {
        // monitorenter(o)
        try {
            return (T)a.invoke();
        }
        finally {
            h0.d(1);
            // monitorexit(o)
            h0.c(1);
        }
    }
}
