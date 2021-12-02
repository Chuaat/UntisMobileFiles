// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.n;
import java.util.Iterator;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.types.checker.p;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.resolve.d;
import kotlin.reflect.jvm.internal.impl.descriptors.i;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.jvm.internal.j1$h;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import n6.l;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.utils.b;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.e;

public final class a
{
    @org.jetbrains.annotations.e
    private static final e a;
    
    static {
        final e i = e.i("value");
        k0.o((Object)i, "identifier(\"value\")");
        a = i;
    }
    
    public static final boolean a(@org.jetbrains.annotations.e final e1 e1) {
        k0.p((Object)e1, "<this>");
        final Boolean e2 = b.e(v.k((Object)e1), (b.d<Object>)a$a.a, (n6.l<Object, Boolean>)a$b.G);
        k0.o((Object)e2, "ifAny(\n        listOf(this),\n        { current -> current.overriddenDescriptors.map(ValueParameterDescriptor::getOriginal) },\n        ValueParameterDescriptor::declaresDefaultValue\n    )");
        return e2;
    }
    
    @f
    public static final g<?> b(@org.jetbrains.annotations.e final c c) {
        k0.p((Object)c, "<this>");
        return (g<?>)v.r2((Iterable)c.b().values());
    }
    
    @f
    public static final kotlin.reflect.jvm.internal.impl.descriptors.b c(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.b b, final boolean b2, @org.jetbrains.annotations.e final l<? super kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> l) {
        k0.p((Object)b, "<this>");
        k0.p((Object)l, "predicate");
        return b.b(v.k((Object)b), (b.d<Object>)new b.d<kotlin.reflect.jvm.internal.impl.descriptors.b>() {
            @org.jetbrains.annotations.e
            public final Iterable<kotlin.reflect.jvm.internal.impl.descriptors.b> b(final kotlin.reflect.jvm.internal.impl.descriptors.b b) {
                final boolean a = b2;
                final Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> collection = null;
                kotlin.reflect.jvm.internal.impl.descriptors.b b2 = b;
                if (a) {
                    if (b == null) {
                        b2 = null;
                    }
                    else {
                        b2 = b.b();
                    }
                }
                Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> g;
                if (b2 == null) {
                    g = collection;
                }
                else {
                    g = (Collection<kotlin.reflect.jvm.internal.impl.descriptors.b>)b2.g();
                }
                Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> e = g;
                if (g == null) {
                    e = (Collection<kotlin.reflect.jvm.internal.impl.descriptors.b>)v.E();
                }
                return e;
            }
        }, (b.e<Object, kotlin.reflect.jvm.internal.impl.descriptors.b>)new b.b<kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.b>() {
            final /* synthetic */ j1$h<kotlin.reflect.jvm.internal.impl.descriptors.b> a = new j1$h();
            
            public void d(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.b g) {
                k0.p((Object)g, "current");
                if (this.a.G == null && (boolean)l.invoke((Object)g)) {
                    this.a.G = g;
                }
            }
            
            public boolean e(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.b b) {
                k0.p((Object)b, "current");
                return this.a.G == null;
            }
            
            @org.jetbrains.annotations.f
            public kotlin.reflect.jvm.internal.impl.descriptors.b f() {
                return (kotlin.reflect.jvm.internal.impl.descriptors.b)this.a.G;
            }
        });
    }
    
    @f
    public static final kotlin.reflect.jvm.internal.impl.name.b e(@org.jetbrains.annotations.e final m m) {
        k0.p((Object)m, "<this>");
        kotlin.reflect.jvm.internal.impl.name.c j = j(m);
        final boolean f = j.f();
        final kotlin.reflect.jvm.internal.impl.name.b b = null;
        if (!f) {
            j = null;
        }
        kotlin.reflect.jvm.internal.impl.name.b l;
        if (j == null) {
            l = b;
        }
        else {
            l = j.l();
        }
        return l;
    }
    
    @f
    public static final kotlin.reflect.jvm.internal.impl.descriptors.e f(@org.jetbrains.annotations.e final c c) {
        k0.p((Object)c, "<this>");
        final h c2 = c.a().N0().c();
        kotlin.reflect.jvm.internal.impl.descriptors.e e;
        if (c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            e = (kotlin.reflect.jvm.internal.impl.descriptors.e)c2;
        }
        else {
            e = null;
        }
        return e;
    }
    
    @org.jetbrains.annotations.e
    public static final KotlinBuiltIns g(@org.jetbrains.annotations.e final m m) {
        k0.p((Object)m, "<this>");
        return l(m).w();
    }
    
    @f
    public static final kotlin.reflect.jvm.internal.impl.name.a h(@f final h h) {
        final kotlin.reflect.jvm.internal.impl.name.a a = null;
        kotlin.reflect.jvm.internal.impl.name.a d;
        if (h == null) {
            d = a;
        }
        else {
            final m c = ((n)h).c();
            if (c == null) {
                d = a;
            }
            else if (c instanceof h0) {
                d = new kotlin.reflect.jvm.internal.impl.name.a(((h0)c).f(), ((f0)h).getName());
            }
            else {
                d = a;
                if (c instanceof i) {
                    final kotlin.reflect.jvm.internal.impl.name.a h2 = h((h)c);
                    if (h2 == null) {
                        d = a;
                    }
                    else {
                        d = h2.d(((f0)h).getName());
                    }
                }
            }
        }
        return d;
    }
    
    @org.jetbrains.annotations.e
    public static final kotlin.reflect.jvm.internal.impl.name.b i(@org.jetbrains.annotations.e final m m) {
        k0.p((Object)m, "<this>");
        final kotlin.reflect.jvm.internal.impl.name.b n = d.n(m);
        k0.o((Object)n, "getFqNameSafe(this)");
        return n;
    }
    
    @org.jetbrains.annotations.e
    public static final kotlin.reflect.jvm.internal.impl.name.c j(@org.jetbrains.annotations.e final m m) {
        k0.p((Object)m, "<this>");
        final kotlin.reflect.jvm.internal.impl.name.c i = d.m(m);
        k0.o((Object)i, "getFqName(this)");
        return i;
    }
    
    @org.jetbrains.annotations.e
    public static final kotlin.reflect.jvm.internal.impl.types.checker.g k(@org.jetbrains.annotations.e final e0 e0) {
        k0.p((Object)e0, "<this>");
        final p p = (p)e0.I0((d0)kotlin.reflect.jvm.internal.impl.types.checker.h.a());
        kotlin.reflect.jvm.internal.impl.types.checker.g g;
        if (p == null) {
            g = null;
        }
        else {
            g = p.a();
        }
        kotlin.reflect.jvm.internal.impl.types.checker.g a = g;
        if (g == null) {
            a = kotlin.reflect.jvm.internal.impl.types.checker.g.a.a;
        }
        return a;
    }
    
    @org.jetbrains.annotations.e
    public static final e0 l(@org.jetbrains.annotations.e final m m) {
        k0.p((Object)m, "<this>");
        final e0 g = d.g(m);
        k0.o((Object)g, "getContainingModule(this)");
        return g;
    }
    
    @org.jetbrains.annotations.e
    public static final kotlin.sequences.m<m> m(@org.jetbrains.annotations.e final m m) {
        k0.p((Object)m, "<this>");
        return kotlin.sequences.p.d0((kotlin.sequences.m<? extends m>)n(m), 1);
    }
    
    @org.jetbrains.annotations.e
    public static final kotlin.sequences.m<m> n(@org.jetbrains.annotations.e final m m) {
        k0.p((Object)m, "<this>");
        return kotlin.sequences.p.o(m, (n6.l<? super m, ? extends m>)a$e.G);
    }
    
    @org.jetbrains.annotations.e
    public static final kotlin.reflect.jvm.internal.impl.descriptors.b o(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.b b) {
        k0.p((Object)b, "<this>");
        Object c0 = b;
        if (b instanceof p0) {
            c0 = ((p0)b).C0();
            k0.o(c0, "correspondingProperty");
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.b)c0;
    }
    
    @f
    public static final kotlin.reflect.jvm.internal.impl.descriptors.e p(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        k0.p((Object)e, "<this>");
        for (final c0 c0 : e.A().N0().k()) {
            if (!KotlinBuiltIns.isAnyOrNullableAny(c0)) {
                final h c2 = c0.N0().c();
                if (d.w((m)c2)) {
                    Objects.requireNonNull((m)c2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (kotlin.reflect.jvm.internal.impl.descriptors.e)c2;
                }
                continue;
            }
        }
        return null;
    }
    
    public static final boolean q(@org.jetbrains.annotations.e final e0 e0) {
        k0.p((Object)e0, "<this>");
        final p p = (p)e0.I0((d0)kotlin.reflect.jvm.internal.impl.types.checker.h.a());
        kotlin.reflect.jvm.internal.impl.types.checker.g g;
        if (p == null) {
            g = null;
        }
        else {
            g = p.a();
        }
        return g != null;
    }
    
    @f
    public static final kotlin.reflect.jvm.internal.impl.descriptors.e r(@org.jetbrains.annotations.e final e0 e0, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.b b, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b2) {
        k0.p((Object)e0, "<this>");
        k0.p((Object)b, "topLevelClassFqName");
        k0.p((Object)b2, "location");
        b.d();
        final kotlin.reflect.jvm.internal.impl.name.b e2 = b.e();
        k0.o((Object)e2, "topLevelClassFqName.parent()");
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h x = e0.R(e2).x();
        final e g = b.g();
        k0.o((Object)g, "topLevelClassFqName.shortName()");
        final h g2 = x.g(g, b2);
        kotlin.reflect.jvm.internal.impl.descriptors.e e3;
        if (g2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            e3 = (kotlin.reflect.jvm.internal.impl.descriptors.e)g2;
        }
        else {
            e3 = null;
        }
        return e3;
    }
}
