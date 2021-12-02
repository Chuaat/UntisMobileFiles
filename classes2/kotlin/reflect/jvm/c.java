// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm;

import kotlin.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.b0;
import kotlin.reflect.jvm.internal.x;
import java.util.Objects;
import kotlin.jvm.internal.k1;
import java.util.List;
import kotlin.collections.v;
import kotlin.reflect.s;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.t;
import kotlin.jvm.internal.k0;
import kotlin.reflect.d;
import org.jetbrains.annotations.e;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001e\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00008@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"$\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00058F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n" }, d2 = { "Lkotlin/reflect/g;", "Lkotlin/reflect/d;", "a", "(Lkotlin/reflect/g;)Lkotlin/reflect/d;", "jvmErasure", "Lkotlin/reflect/s;", "b", "(Lkotlin/reflect/s;)Lkotlin/reflect/d;", "getJvmErasure$annotations", "(Lkotlin/reflect/s;)V", "kotlin-reflection" }, k = 2, mv = { 1, 4, 1 })
@g(name = "KTypesJvm")
public final class c
{
    @e
    public static final d<?> a(@e final kotlin.reflect.g obj) {
        k0.p(obj, "$this$jvmErasure");
        d<?> d;
        if (obj instanceof d) {
            d = (d<?>)obj;
        }
        else {
            if (obj instanceof t) {
                final List<s> upperBounds = ((t)obj).getUpperBounds();
                final Iterator<Object> iterator = upperBounds.iterator();
                while (true) {
                    kotlin.reflect.jvm.internal.impl.descriptors.e e;
                    s next;
                    do {
                        final boolean hasNext = iterator.hasNext();
                        final s s = null;
                        final kotlin.reflect.jvm.internal.impl.descriptors.e e2 = null;
                        if (!hasNext) {
                            s s2 = s;
                            if (s2 == null) {
                                s2 = v.t2((List<? extends s>)upperBounds);
                            }
                            if (s2 != null) {
                                d = b(s2);
                                if (d != null) {
                                    return d;
                                }
                            }
                            d = (d<?>)k1.d(Object.class);
                            return d;
                        }
                        next = iterator.next();
                        final s obj2 = next;
                        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                        h c = ((x)obj2).v().N0().c();
                        if (!(c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                            c = e2;
                        }
                        e = (kotlin.reflect.jvm.internal.impl.descriptors.e)c;
                    } while (e == null || e.n() == f.H || e.n() == f.K);
                    final s s = next;
                    continue;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot calculate JVM erasure for type: ");
            sb.append(obj);
            throw new b0(sb.toString());
        }
        return d;
    }
    
    @e
    public static final d<?> b(@e final s obj) {
        k0.p(obj, "$this$jvmErasure");
        final kotlin.reflect.g b = obj.b();
        if (b != null) {
            final d<?> a = a(b);
            if (a != null) {
                return a;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot calculate JVM erasure for type: ");
        sb.append(obj);
        throw new b0(sb.toString());
    }
}
