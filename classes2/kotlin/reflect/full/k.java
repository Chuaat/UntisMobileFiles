// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.full;

import kotlin.e1;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.a;
import kotlin.reflect.jvm.internal.x;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.s;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007¨\u0006\u0007" }, d2 = { "Lkotlin/reflect/s;", "", "nullable", "c", "other", "a", "b", "kotlin-reflection" }, k = 2, mv = { 1, 4, 1 })
@g(name = "KTypes")
public final class k
{
    @e1(version = "1.1")
    public static final boolean a(@e final s s, @e final s s2) {
        k0.p(s, "$this$isSubtypeOf");
        k0.p(s2, "other");
        return a.g(((x)s).v(), ((x)s2).v());
    }
    
    @e1(version = "1.1")
    public static final boolean b(@e final s s, @e final s s2) {
        k0.p(s, "$this$isSupertypeOf");
        k0.p(s2, "other");
        return a(s2, s);
    }
    
    @e1(version = "1.1")
    @e
    public static final s c(@e final s s, final boolean b) {
        k0.p(s, "$this$withNullability");
        return ((x)s).z(b);
    }
}
