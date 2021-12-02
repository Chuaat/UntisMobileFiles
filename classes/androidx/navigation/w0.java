// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import org.jetbrains.annotations.f;
import m6.a;
import kotlin.reflect.d;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0006\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0007\u001a4\u0010\n\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\n¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\u000e\u001a\u0014\u0012\u000e\b\u0001\u0012\n \r*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u0086\n\u001a\u001d\u0010\u0010\u001a\u00020\u000f*\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u0086\n¨\u0006\u0011" }, d2 = { "Landroidx/navigation/u0;", "Landroidx/navigation/a0;", "T", "Landroidx/navigation/v0;", "", "name", "a", "(Landroidx/navigation/v0;Ljava/lang/String;)Landroidx/navigation/u0;", "Lkotlin/reflect/d;", "clazz", "b", "(Landroidx/navigation/v0;Lkotlin/reflect/d;)Landroidx/navigation/u0;", "navigator", "kotlin.jvm.PlatformType", "d", "Lkotlin/j2;", "c", "navigation-common-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class w0
{
    @e
    public static final <T extends u0<? extends a0>> T a(@e final v0 v0, @e final String s) {
        k0.q((Object)v0, "$this$get");
        k0.q((Object)s, "name");
        final u0<? extends a0> e = v0.e(s);
        k0.h((Object)e, "getNavigator(name)");
        return (T)e;
    }
    
    @e
    public static final <T extends u0<? extends a0>> T b(@e final v0 v0, @e final d<T> d) {
        k0.q((Object)v0, "$this$get");
        k0.q((Object)d, "clazz");
        final u0<? extends a0> d2 = v0.d((Class<T>)a.c((d)d));
        k0.h((Object)d2, "getNavigator(clazz.java)");
        return (T)d2;
    }
    
    public static final void c(@e final v0 v0, @e final u0<? extends a0> u0) {
        k0.q((Object)v0, "$this$plusAssign");
        k0.q((Object)u0, "navigator");
        v0.a(u0);
    }
    
    @f
    public static final u0<? extends a0> d(@e final v0 v0, @e final String s, @e final u0<? extends a0> u0) {
        k0.q((Object)v0, "$this$set");
        k0.q((Object)s, "name");
        k0.q((Object)u0, "navigator");
        return v0.b(s, u0);
    }
}
