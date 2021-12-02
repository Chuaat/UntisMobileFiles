// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm;

import kotlin.reflect.jvm.internal.h;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.d;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u001b\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005" }, d2 = { "Lkotlin/reflect/d;", "", "a", "(Lkotlin/reflect/d;)Ljava/lang/String;", "jvmName", "kotlin-reflection" }, k = 2, mv = { 1, 4, 1 })
@g(name = "KClassesJvm")
public final class b
{
    @e
    public static final String a(@e final d<?> d) {
        k0.p(d, "$this$jvmName");
        final String name = ((h)d).m().getName();
        k0.o(name, "(this as KClassImpl).jClass.name");
        return name;
    }
}
