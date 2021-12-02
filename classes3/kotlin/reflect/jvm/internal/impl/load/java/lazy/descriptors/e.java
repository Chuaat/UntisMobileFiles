// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.load.java.components.k;
import kotlin.reflect.jvm.internal.impl.resolve.constants.q;
import kotlin.reflect.jvm.internal.impl.resolve.constants.s;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.structure.m;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.jvm.internal.w;
import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.y0;
import kotlin.n1;
import kotlin.reflect.jvm.internal.impl.load.java.y;
import kotlin.s0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.java.structure.l;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.d;
import kotlin.reflect.jvm.internal.impl.types.u;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.e1;
import kotlin.reflect.h;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import kotlin.reflect.jvm.internal.impl.storage.j;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;
import kotlin.reflect.o;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;

public final class e implements c, i
{
    static final /* synthetic */ o<Object>[] i;
    @org.jetbrains.annotations.e
    private final g a;
    @org.jetbrains.annotations.e
    private final a b;
    @org.jetbrains.annotations.e
    private final j c;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.storage.i d;
    @org.jetbrains.annotations.e
    private final s6.a e;
    @org.jetbrains.annotations.e
    private final kotlin.reflect.jvm.internal.impl.storage.i f;
    private final boolean g;
    private final boolean h;
    
    static {
        i = new o[] { (o)k1.r((e1)new f1((h)k1.d((Class)e.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), (o)k1.r((e1)new f1((h)k1.d((Class)e.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), (o)k1.r((e1)new f1((h)k1.d((Class)e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;")) };
    }
    
    public e(@org.jetbrains.annotations.e final g a, @org.jetbrains.annotations.e final a b, final boolean b2) {
        k0.p((Object)a, "c");
        k0.p((Object)b, "javaAnnotation");
        this.a = a;
        this.b = b;
        this.c = a.e().e((n6.a<?>)new n6.a<b>() {
            final /* synthetic */ e G;
            
            @f
            public final b a() {
                final kotlin.reflect.jvm.internal.impl.name.a c = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e.g(this.G).c();
                b b;
                if (c == null) {
                    b = null;
                }
                else {
                    b = c.b();
                }
                return b;
            }
        });
        this.d = a.e().g((n6.a<?>)new n6.a<kotlin.reflect.jvm.internal.impl.types.k0>() {
            final /* synthetic */ e G;
            
            @org.jetbrains.annotations.e
            public final kotlin.reflect.jvm.internal.impl.types.k0 a() {
                final b f = this.G.f();
                if (f == null) {
                    return u.j(k0.C("No fqName: ", (Object)kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e.g(this.G)));
                }
                kotlin.reflect.jvm.internal.impl.descriptors.e e;
                if ((e = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.h(kotlin.reflect.jvm.internal.impl.builtins.jvm.d.a, f, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e.e(this.G).d().w(), (Integer)null, 4, (Object)null)) == null) {
                    final kotlin.reflect.jvm.internal.impl.load.java.structure.g y = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e.g(this.G).y();
                    kotlin.reflect.jvm.internal.impl.descriptors.e a;
                    if (y == null) {
                        a = null;
                    }
                    else {
                        a = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e.e(this.G).a().m().a(y);
                    }
                    e = a;
                    if (a == null) {
                        e = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e.this.i(f);
                    }
                }
                return e.A();
            }
        });
        this.e = a.a().s().a(b);
        this.f = a.e().g((n6.a<?>)new n6.a<Map<kotlin.reflect.jvm.internal.impl.name.e, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>>() {
            final /* synthetic */ e G;
            
            @org.jetbrains.annotations.e
            public final Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
                final Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.b> arguments = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e.g(this.G).getArguments();
                final e g = this.G;
                final ArrayList<s0> list = new ArrayList<s0>();
                for (final kotlin.reflect.jvm.internal.impl.load.java.structure.b b : arguments) {
                    kotlin.reflect.jvm.internal.impl.name.e e;
                    if ((e = b.getName()) == null) {
                        e = y.c;
                    }
                    final kotlin.reflect.jvm.internal.impl.resolve.constants.g h = g.n(b);
                    s0 a;
                    if (h == null) {
                        a = null;
                    }
                    else {
                        a = n1.a((Object)e, (Object)h);
                    }
                    if (a != null) {
                        list.add(a);
                    }
                }
                return (Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>)y0.B0((Iterable)list);
            }
        });
        this.g = b.d();
        this.h = (b.t() || b2);
    }
    
    public static final /* synthetic */ g e(final e e) {
        return e.a;
    }
    
    public static final /* synthetic */ a g(final e e) {
        return e.b;
    }
    
    private final kotlin.reflect.jvm.internal.impl.descriptors.e i(final b b) {
        final e0 d = this.a.d();
        final kotlin.reflect.jvm.internal.impl.name.a m = kotlin.reflect.jvm.internal.impl.name.a.m(b);
        k0.o((Object)m, "topLevel(fqName)");
        return x.c(d, m, this.a.a().b().f().q());
    }
    
    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> n(final kotlin.reflect.jvm.internal.impl.load.java.structure.b b) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> g;
        if (b instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.o) {
            g = kotlin.reflect.jvm.internal.impl.resolve.constants.h.a.c(((kotlin.reflect.jvm.internal.impl.load.java.structure.o)b).getValue());
        }
        else if (b instanceof m) {
            final m m = (m)b;
            g = this.q(m.b(), m.d());
        }
        else if (b instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.e) {
            kotlin.reflect.jvm.internal.impl.name.e e;
            if ((e = b.getName()) == null) {
                e = y.c;
            }
            k0.o((Object)e, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            g = this.p(e, ((kotlin.reflect.jvm.internal.impl.load.java.structure.e)b).e());
        }
        else if (b instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.c) {
            g = this.o(((kotlin.reflect.jvm.internal.impl.load.java.structure.c)b).a());
        }
        else if (b instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.h) {
            g = this.r(((kotlin.reflect.jvm.internal.impl.load.java.structure.h)b).c());
        }
        else {
            g = null;
        }
        return g;
    }
    
    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> o(final a a) {
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.a((c)new e(this.a, a, false, 4, null));
    }
    
    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> p(final kotlin.reflect.jvm.internal.impl.name.e e, final List<? extends kotlin.reflect.jvm.internal.impl.load.java.structure.b> list) {
        final kotlin.reflect.jvm.internal.impl.types.k0 l = this.l();
        k0.o((Object)l, "type");
        final boolean a = kotlin.reflect.jvm.internal.impl.types.e0.a(l);
        final c0 c0 = null;
        if (a) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.e f = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.f((c)this);
        k0.m((Object)f);
        final kotlin.reflect.jvm.internal.impl.descriptors.e1 b = kotlin.reflect.jvm.internal.impl.load.java.components.a.b(e, f);
        c0 a2;
        if (b == null) {
            a2 = c0;
        }
        else {
            a2 = ((d1)b).a();
        }
        c0 arrayType = a2;
        if (a2 == null) {
            arrayType = this.a.a().l().w().getArrayType(kotlin.reflect.jvm.internal.impl.types.k1.K, (c0)u.j("Unknown array element type"));
        }
        k0.o((Object)arrayType, "DescriptorResolverUtils.getAnnotationParameterByName(argumentName, annotationClass!!)?.type\n            // Try to load annotation arguments even if the annotation class is not found\n                ?: c.components.module.builtIns.getArrayType(\n                    Variance.INVARIANT,\n                    ErrorUtils.createErrorType(\"Unknown array element type\")\n                )");
        final ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> list2 = new ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>(v.Y((Iterable)list, 10));
        final Iterator<kotlin.reflect.jvm.internal.impl.load.java.structure.b> iterator = list.iterator();
        while (iterator.hasNext()) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> n;
            if ((n = this.n(iterator.next())) == null) {
                n = new s();
            }
            list2.add(n);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.constants.h.a.b(list2, arrayType);
    }
    
    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> q(final kotlin.reflect.jvm.internal.impl.name.a a, final kotlin.reflect.jvm.internal.impl.name.e e) {
        if (a != null && e != null) {
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.j(a, e);
        }
        return null;
    }
    
    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> r(final kotlin.reflect.jvm.internal.impl.load.java.structure.x x) {
        return q.b.a(this.a.g().n(x, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.f(k.H, false, null, 3, null)));
    }
    
    @org.jetbrains.annotations.e
    public Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> b() {
        return kotlin.reflect.jvm.internal.impl.storage.m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>>)this.f, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e.i[2]);
    }
    
    public boolean d() {
        return this.g;
    }
    
    @f
    public b f() {
        return kotlin.reflect.jvm.internal.impl.storage.m.b((j<? extends b>)this.c, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e.i[0]);
    }
    
    @org.jetbrains.annotations.e
    public s6.a j() {
        return this.e;
    }
    
    @org.jetbrains.annotations.e
    public kotlin.reflect.jvm.internal.impl.types.k0 l() {
        return kotlin.reflect.jvm.internal.impl.storage.m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends kotlin.reflect.jvm.internal.impl.types.k0>)this.d, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e.i[1]);
    }
    
    public final boolean m() {
        return this.h;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.c.u(kotlin.reflect.jvm.internal.impl.renderer.c.g, (c)this, null, 2, null);
    }
}
