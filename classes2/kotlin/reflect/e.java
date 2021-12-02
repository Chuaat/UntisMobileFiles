// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect;

import kotlin.q;
import kotlin.o2;
import kotlin.e1;
import java.util.Objects;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007" }, d2 = { "", "T", "Lkotlin/reflect/d;", "value", "a", "(Lkotlin/reflect/d;Ljava/lang/Object;)Ljava/lang/Object;", "b", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@g(name = "KClasses")
public final class e
{
    @e1(version = "1.4")
    @kotlin.internal.g
    @o2(markerClass = { q.class })
    @org.jetbrains.annotations.e
    public static final <T> T a(@org.jetbrains.annotations.e final d<T> d, @f final Object obj) {
        k0.p(d, "$this$cast");
        if (d.S(obj)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type T");
            return (T)obj;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Value cannot be cast to ");
        sb.append(d.E());
        throw new ClassCastException(sb.toString());
    }
    
    @e1(version = "1.4")
    @kotlin.internal.g
    @o2(markerClass = { q.class })
    @f
    public static final <T> T b(@org.jetbrains.annotations.e final d<T> d, @f Object obj) {
        k0.p(d, "$this$safeCast");
        if (d.S(obj)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type T");
        }
        else {
            obj = null;
        }
        return (T)obj;
    }
}
