// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.n;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import java.util.Collection;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.b$a;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import n6.p;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import org.jetbrains.annotations.e;

public final class b
{
    @e
    public static final b a;
    
    static {
        a = new b();
    }
    
    private b() {
    }
    
    public static /* synthetic */ boolean c(final b b, final a a, final a a2, final boolean b2, boolean b3, boolean b4, final g g, final int n, final Object o) {
        if ((n & 0x8) != 0x0) {
            b3 = true;
        }
        if ((n & 0x10) != 0x0) {
            b4 = false;
        }
        return b.b(a, a2, b2, b3, b4, g);
    }
    
    private final boolean d(final kotlin.reflect.jvm.internal.impl.descriptors.e e, final kotlin.reflect.jvm.internal.impl.descriptors.e e2) {
        return k0.g((Object)((h)e).l(), (Object)((h)e2).l());
    }
    
    public static /* synthetic */ boolean f(final b b, final m m, final m i, final boolean b2, boolean b3, final int n, final Object o) {
        if ((n & 0x8) != 0x0) {
            b3 = true;
        }
        return b.e(m, i, b2, b3);
    }
    
    private final boolean g(final b1 b1, final b1 b2, final boolean b3, final p<? super m, ? super m, Boolean> p4) {
        final boolean g = k0.g((Object)b1, (Object)b2);
        final boolean b4 = true;
        return g || (!k0.g((Object)((n)b1).c(), (Object)((n)b2).c()) && this.i((m)b1, (m)b2, p4, b3) && b1.i() == b2.i() && b4);
    }
    
    static /* synthetic */ boolean h(final b b, final b1 b2, final b1 b3, final boolean b4, p g, final int n, final Object o) {
        if ((n & 0x8) != 0x0) {
            g = (p)b$c.G;
        }
        return b.g(b2, b3, b4, (p<? super m, ? super m, Boolean>)g);
    }
    
    private final boolean i(m c, m c2, final p<? super m, ? super m, Boolean> p4, final boolean b) {
        c = c.c();
        c2 = c2.c();
        boolean b2;
        if (!(c instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) && !(c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b)) {
            b2 = f(this, c, c2, b, false, 8, null);
        }
        else {
            b2 = (boolean)p4.invoke((Object)c, (Object)c2);
        }
        return b2;
    }
    
    private final w0 j(a a) {
        while (a instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
            final kotlin.reflect.jvm.internal.impl.descriptors.b b = (kotlin.reflect.jvm.internal.impl.descriptors.b)a;
            if (b.n() != kotlin.reflect.jvm.internal.impl.descriptors.b$a.H) {
                break;
            }
            final Collection g = b.g();
            k0.o((Object)g, "overriddenDescriptors");
            if ((a = (a)v.V4((Iterable)g)) == null) {
                return null;
            }
        }
        return ((kotlin.reflect.jvm.internal.impl.descriptors.p)a).k();
    }
    
    public final boolean b(@e final a a, @e final a a2, final boolean b, final boolean b2, final boolean b3, @e final g g) {
        k0.p((Object)a, "a");
        k0.p((Object)a2, "b");
        k0.p((Object)g, "kotlinTypeRefiner");
        final boolean g2 = k0.g((Object)a, (Object)a2);
        final boolean b4 = true;
        if (g2) {
            return true;
        }
        if (!k0.g((Object)((f0)a).getName(), (Object)((f0)a2).getName())) {
            return false;
        }
        if (b2 && a instanceof a0 && a2 instanceof a0 && ((a0)a).Q() != ((a0)a2).Q()) {
            return false;
        }
        if (k0.g((Object)((n)a).c(), (Object)((n)a2).c())) {
            if (!b) {
                return false;
            }
            if (!k0.g((Object)this.j(a), (Object)this.j(a2))) {
                return false;
            }
        }
        if (d.E((m)a) || d.E((m)a2)) {
            return false;
        }
        if (!this.i((m)a, (m)a2, (p<? super m, ? super m, Boolean>)b$a.G, b)) {
            return false;
        }
        final j k = j.k(g, new f.a() {
            @Override
            public final boolean a(@e final kotlin.reflect.jvm.internal.impl.types.w0 w0, @e final kotlin.reflect.jvm.internal.impl.types.w0 w2) {
                k0.p((Object)w0, "c1");
                k0.p((Object)w2, "c2");
                if (k0.g((Object)w0, (Object)w2)) {
                    return true;
                }
                final h c = w0.c();
                final h c2 = w2.c();
                return c instanceof b1 && c2 instanceof b1 && kotlin.reflect.jvm.internal.impl.resolve.b.this.g((b1)c, (b1)c2, b, (p<? super m, ? super m, Boolean>)new p<m, m, Boolean>() {
                    public final boolean a(@org.jetbrains.annotations.f final m m, @org.jetbrains.annotations.f final m i) {
                        return k0.g((Object)m, (Object)a) && k0.g((Object)i, (Object)a2);
                    }
                });
            }
        });
        k0.o((Object)k, "fun areCallableDescriptorsEquivalent(\n        a: CallableDescriptor,\n        b: CallableDescriptor,\n        allowCopiesFromTheSameDeclaration: Boolean,\n        distinguishExpectsAndNonExpects: Boolean = true,\n        ignoreReturnType: Boolean = false,\n        kotlinTypeRefiner: KotlinTypeRefiner\n    ): Boolean {\n        if (a == b) return true\n        if (a.name != b.name) return false\n        if (distinguishExpectsAndNonExpects && a is MemberDescriptor && b is MemberDescriptor && a.isExpect != b.isExpect) return false\n        if (a.containingDeclaration == b.containingDeclaration) {\n            if (!allowCopiesFromTheSameDeclaration) return false\n            if (a.singleSource() != b.singleSource()) return false\n        }\n\n        // Distinct locals are not equivalent\n        if (DescriptorUtils.isLocal(a) || DescriptorUtils.isLocal(b)) return false\n\n        if (!ownersEquivalent(a, b, { _, _ -> false }, allowCopiesFromTheSameDeclaration)) return false\n\n        val overridingUtil = OverridingUtil.create(kotlinTypeRefiner) eq@{ c1, c2 ->\n            if (c1 == c2) return@eq true\n\n            val d1 = c1.declarationDescriptor\n            val d2 = c2.declarationDescriptor\n\n            if (d1 !is TypeParameterDescriptor || d2 !is TypeParameterDescriptor) return@eq false\n\n            areTypeParametersEquivalent(d1, d2, allowCopiesFromTheSameDeclaration) { x, y -> x == a && y == b }\n        }\n\n        return overridingUtil.isOverridableBy(a, b, null, !ignoreReturnType).result == OverrideCompatibilityInfo.Result.OVERRIDABLE\n                && overridingUtil.isOverridableBy(b, a, null, !ignoreReturnType).result == OverrideCompatibilityInfo.Result.OVERRIDABLE\n\n    }");
        final j.i.a c = k.H(a, a2, null, b3 ^ true).c();
        final j.i.a g3 = j.i.a.G;
        return c == g3 && k.H(a2, a, null, b3 ^ true).c() == g3 && b4;
    }
    
    public final boolean e(@org.jetbrains.annotations.f final m m, @org.jetbrains.annotations.f final m i, final boolean b, final boolean b2) {
        boolean b3;
        if (m instanceof kotlin.reflect.jvm.internal.impl.descriptors.e && i instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            b3 = this.d((kotlin.reflect.jvm.internal.impl.descriptors.e)m, (kotlin.reflect.jvm.internal.impl.descriptors.e)i);
        }
        else if (m instanceof b1 && i instanceof b1) {
            b3 = h(this, (b1)m, (b1)i, b, null, 8, null);
        }
        else if (m instanceof a && i instanceof a) {
            b3 = c(this, (a)m, (a)i, b, b2, false, g.a.a, 16, null);
        }
        else {
            Object f = m;
            Object f2 = i;
            if (m instanceof h0) {
                f = m;
                f2 = i;
                if (i instanceof h0) {
                    f = ((h0)m).f();
                    f2 = ((h0)i).f();
                }
            }
            b3 = k0.g(f, f2);
        }
        return b3;
    }
}
