// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.types.model.i;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.d;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.k;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import java.util.List;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.y;
import org.jetbrains.annotations.e;

public final class t
{
    @e
    private static final b a;
    @e
    private static final b b;
    
    static {
        final kotlin.reflect.jvm.internal.impl.name.b q = y.q;
        k0.o((Object)q, "ENHANCED_NULLABILITY_ANNOTATION");
        a = new b(q);
        final kotlin.reflect.jvm.internal.impl.name.b r = y.r;
        k0.o((Object)r, "ENHANCED_MUTABILITY_ANNOTATION");
        b = new b(r);
    }
    
    private static final g d(final List<? extends g> list) {
        final int size = list.size();
        if (size != 0) {
            Object o;
            if (size != 1) {
                o = new k(v.I5((Iterable)list));
            }
            else {
                o = v.U4((List)list);
            }
            return (g)o;
        }
        throw new IllegalStateException("At least one Annotations object expected".toString());
    }
    
    private static final c<h> e(final h h, final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e e, final p p3) {
        if (!q.a(p3)) {
            return j(h);
        }
        if (!(h instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
            return j(h);
        }
        final d a = d.a;
        final f b = e.b();
        int n;
        if (b == null) {
            n = -1;
        }
        else {
            n = t.a.a[b.ordinal()];
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e e3;
        if (n != 1) {
            if (n != 2) {
                return j(h);
            }
            if (p3 != p.H) {
                return j(h);
            }
            final kotlin.reflect.jvm.internal.impl.descriptors.e e2 = (kotlin.reflect.jvm.internal.impl.descriptors.e)h;
            if (!a.e(e2)) {
                return j(h);
            }
            e3 = a.b(e2);
        }
        else {
            if (p3 != p.G) {
                return j(h);
            }
            final kotlin.reflect.jvm.internal.impl.descriptors.e e4 = (kotlin.reflect.jvm.internal.impl.descriptors.e)h;
            if (!a.c(e4)) {
                return j(h);
            }
            e3 = a.a(e4);
        }
        return f((h)e3);
    }
    
    private static final <T> c<T> f(final T t) {
        return new c<T>(t, (g)t.b);
    }
    
    private static final <T> c<T> g(final T t) {
        return new c<T>(t, (g)t.a);
    }
    
    private static final c<Boolean> h(final c0 c0, final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e e, final p p3) {
        if (!q.a(p3)) {
            return j(c0.O0());
        }
        final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h c2 = e.c();
        int n;
        if (c2 == null) {
            n = -1;
        }
        else {
            n = t.a.b[c2.ordinal()];
        }
        Boolean b;
        if (n != 1) {
            if (n != 2) {
                return j(c0.O0());
            }
            b = Boolean.FALSE;
        }
        else {
            b = Boolean.TRUE;
        }
        return g(b);
    }
    
    public static final boolean i(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        return r.b(kotlin.reflect.jvm.internal.impl.types.checker.q.a, c0);
    }
    
    private static final <T> c<T> j(final T t) {
        return new c<T>(t, null);
    }
}
