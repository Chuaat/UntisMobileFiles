// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import org.jetbrains.annotations.e;
import kotlin.internal.f;
import kotlin.jvm.internal.k0;
import kotlin.reflect.o;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a6\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0087\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b" }, d2 = { "T", "value", "Lkotlin/b0;", "e", "(Ljava/lang/Object;)Lkotlin/b0;", "", "thisRef", "Lkotlin/reflect/o;", "property", "d", "(Lkotlin/b0;Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/LazyKt")
class f0 extends e0
{
    public f0() {
    }
    
    @f
    private static final <T> T d(final b0<? extends T> b0, final Object o, final o<?> o2) {
        k0.p(b0, "$this$getValue");
        return (T)b0.getValue();
    }
    
    @e
    public static <T> b0<T> e(final T t) {
        return new v<T>(t);
    }
}
