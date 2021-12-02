// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.types.b1;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.metadata.a$i;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.utils.b$e;
import kotlin.reflect.jvm.internal.impl.utils.b$b;
import kotlin.reflect.jvm.internal.impl.utils.b$d;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.resolve.j$i$a;
import kotlin.reflect.jvm.internal.impl.types.d1;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.utils.j$b;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.utils.j;
import n6.l;
import kotlin.collections.j1;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.types.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h$c;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import java.util.List;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.jvm.internal.e1;
import kotlin.reflect.h;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.storage.i;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.o;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.a;

public final class g implements kotlin.reflect.jvm.internal.impl.descriptors.deserialization.a, c
{
    static final /* synthetic */ o<Object>[] h;
    @e
    private final e0 a;
    @e
    private final d b;
    @e
    private final i c;
    @e
    private final c0 d;
    @e
    private final i e;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.a<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.descriptors.e> f;
    @e
    private final i g;
    
    static {
        h = new o[] { k1.r(new f1(k1.d(g.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), k1.r(new f1(k1.d(g.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), k1.r(new f1(k1.d(g.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;")) };
    }
    
    public g(@e final e0 a, @e final n n, @e final n6.a<f.b> a2) {
        k0.p(a, "moduleDescriptor");
        k0.p(n, "storageManager");
        k0.p(a2, "settingsComputation");
        this.a = a;
        this.b = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.a;
        this.c = n.g((n6.a)a2);
        this.d = this.k(n);
        this.e = n.g((n6.a)new n6.a<kotlin.reflect.jvm.internal.impl.types.k0>() {
            @e
            public final kotlin.reflect.jvm.internal.impl.types.k0 a() {
                return x.c(kotlin.reflect.jvm.internal.impl.builtins.jvm.g.this.s().a(), kotlin.reflect.jvm.internal.impl.builtins.jvm.e.d.a(), new g0(n, kotlin.reflect.jvm.internal.impl.builtins.jvm.g.this.s().a())).A();
            }
        });
        this.f = (kotlin.reflect.jvm.internal.impl.storage.a<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.descriptors.e>)n.d();
        this.g = n.g((n6.a)new n6.a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.g>() {
            final /* synthetic */ g G;
            
            @e
            public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a() {
                return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.a(v.k(kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.b(kotlin.reflect.jvm.internal.impl.builtins.jvm.g.h(this.G).w(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, 6, null)));
            }
        });
    }
    
    public static final /* synthetic */ d f(final g g) {
        return g.b;
    }
    
    public static final /* synthetic */ e0 h(final g g) {
        return g.a;
    }
    
    private final v0 j(final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e e, final v0 v0) {
        final y.a<? extends v0> b = v0.B();
        b.o((m)e);
        b.n(t.e);
        b.f((c0)((kotlin.reflect.jvm.internal.impl.descriptors.impl.a)e).A());
        b.d(((kotlin.reflect.jvm.internal.impl.descriptors.impl.a)e).K0());
        final v0 v2 = (v0)b.h();
        k0.m(v2);
        return v2;
    }
    
    private final c0 k(final n n) {
        final kotlin.reflect.jvm.internal.impl.descriptors.impl.h h = new kotlin.reflect.jvm.internal.impl.descriptors.impl.h(new z(this.a, new kotlin.reflect.jvm.internal.impl.name.b("java.io")) {
            @e
            public h$c G0() {
                return h$c.b;
            }
        }, kotlin.reflect.jvm.internal.impl.name.e.i("Serializable"), b0.K, kotlin.reflect.jvm.internal.impl.descriptors.f.H, (Collection<c0>)v.k(new f0(n, (n6.a)new n6.a<c0>() {
            final /* synthetic */ g G;
            
            @e
            public final c0 a() {
                final kotlin.reflect.jvm.internal.impl.types.k0 anyType = kotlin.reflect.jvm.internal.impl.builtins.jvm.g.h(this.G).w().getAnyType();
                k0.o(anyType, "moduleDescriptor.builtIns.anyType");
                return (c0)anyType;
            }
        })), w0.a, false, n);
        h.L0((kotlin.reflect.jvm.internal.impl.resolve.scopes.h)h$c.b, j1.k(), null);
        final kotlin.reflect.jvm.internal.impl.types.k0 a = h.A();
        k0.o(a, "mockSerializableClass.defaultType");
        return (c0)a;
    }
    
    private final Collection<v0> l(final kotlin.reflect.jvm.internal.impl.descriptors.e e, final l<? super kotlin.reflect.jvm.internal.impl.resolve.scopes.h, ? extends Collection<? extends v0>> l) {
        final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f p2 = this.p(e);
        if (p2 == null) {
            return (Collection<v0>)v.E();
        }
        final Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> i = this.b.i(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.i((m)p2), kotlin.reflect.jvm.internal.impl.builtins.jvm.b.g.a());
        final kotlin.reflect.jvm.internal.impl.descriptors.e e2 = v.g3((Iterable<? extends kotlin.reflect.jvm.internal.impl.descriptors.e>)i);
        if (e2 == null) {
            return (Collection<v0>)v.E();
        }
        final j$b j = kotlin.reflect.jvm.internal.impl.utils.j.I;
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.name.b>(v.Y((Iterable<?>)i, 10));
        final Iterator<Object> iterator = i.iterator();
        while (iterator.hasNext()) {
            list.add(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.i((m)iterator.next()));
        }
        final j b = j.b((Collection)list);
        final boolean c = this.b.c(e);
        final kotlin.reflect.jvm.internal.impl.resolve.scopes.h e3 = ((kotlin.reflect.jvm.internal.impl.descriptors.e)this.f.a((Object)kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.i((m)p2), (n6.a)new n6.a<kotlin.reflect.jvm.internal.impl.descriptors.e>() {
            @e
            public final kotlin.reflect.jvm.internal.impl.descriptors.e a() {
                final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f g = p2;
                final kotlin.reflect.jvm.internal.impl.load.java.components.g a = kotlin.reflect.jvm.internal.impl.load.java.components.g.a;
                k0.o(a, "EMPTY");
                return (kotlin.reflect.jvm.internal.impl.descriptors.e)g.O0(a, e2);
            }
        })).E0();
        k0.o(e3, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
        final Iterable iterable = (Iterable)l.invoke(e3);
        final ArrayList<v0> list2 = new ArrayList<v0>();
        for (final v0 next : iterable) {
            final v0 v0 = next;
            final kotlin.reflect.jvm.internal.impl.descriptors.b.a n = v0.n();
            final kotlin.reflect.jvm.internal.impl.descriptors.b.a g = kotlin.reflect.jvm.internal.impl.descriptors.b.a.G;
            final int n2 = 1;
            int n3 = 0;
            Label_0395: {
                if (n == g) {
                    if (v0.getVisibility().d()) {
                        if (!KotlinBuiltIns.isDeprecated(v0)) {
                            final Collection<? extends y> g2 = v0.g();
                            k0.o(g2, "analogueMember.overriddenDescriptors");
                            boolean b2 = false;
                            Label_0372: {
                                if (!g2.isEmpty()) {
                                    final Iterator<y> iterator3 = g2.iterator();
                                    while (iterator3.hasNext()) {
                                        final m c2 = iterator3.next().c();
                                        k0.o(c2, "it.containingDeclaration");
                                        if (b.contains((Object)kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.i(c2))) {
                                            b2 = true;
                                            break Label_0372;
                                        }
                                    }
                                }
                                b2 = false;
                            }
                            if (!b2) {
                                if (!this.t(v0, c)) {
                                    n3 = n2;
                                    break Label_0395;
                                }
                            }
                        }
                    }
                }
                n3 = 0;
            }
            if (n3 != 0) {
                list2.add(next);
            }
        }
        return list2;
    }
    
    private final kotlin.reflect.jvm.internal.impl.types.k0 m() {
        return (kotlin.reflect.jvm.internal.impl.types.k0)kotlin.reflect.jvm.internal.impl.storage.m.a(this.e, (Object)this, (o)kotlin.reflect.jvm.internal.impl.builtins.jvm.g.h[1]);
    }
    
    private static final boolean n(final kotlin.reflect.jvm.internal.impl.descriptors.l l, final d1 d1, final kotlin.reflect.jvm.internal.impl.descriptors.l i) {
        return kotlin.reflect.jvm.internal.impl.resolve.j.A((kotlin.reflect.jvm.internal.impl.descriptors.a)l, (kotlin.reflect.jvm.internal.impl.descriptors.a)i.d(d1)) == j$i$a.G;
    }
    
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f p(final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        final boolean any = KotlinBuiltIns.isAny(e);
        final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f f = null;
        if (any) {
            return null;
        }
        if (!KotlinBuiltIns.isUnderKotlinPackage(e)) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.name.c j = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.j((m)e);
        if (!j.f()) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.name.a o = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a.o(j);
        kotlin.reflect.jvm.internal.impl.name.b b;
        if (o == null) {
            b = null;
        }
        else {
            b = o.b();
        }
        if (b == null) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.e a = s.a(this.s().a(), b, (kotlin.reflect.jvm.internal.impl.incremental.components.b)kotlin.reflect.jvm.internal.impl.incremental.components.d.J);
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f f2 = f;
        if (a instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f) {
            f2 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f)a;
        }
        return f2;
    }
    
    private final a q(final y y) {
        final Object b = kotlin.reflect.jvm.internal.impl.utils.b.b((Collection)v.k(y.c()), (b$d)new b$d<kotlin.reflect.jvm.internal.impl.descriptors.e>() {
            final /* synthetic */ g a;
            
            @e
            public final Iterable<kotlin.reflect.jvm.internal.impl.descriptors.e> b(kotlin.reflect.jvm.internal.impl.descriptors.e e) {
                final Collection k = e.l().k();
                k0.o(k, "it.typeConstructor.supertypes");
                final g a = this.a;
                final ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.e> list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.e>();
                final Iterator<c0> iterator = (Iterator<c0>)k.iterator();
                while (iterator.hasNext()) {
                    final kotlin.reflect.jvm.internal.impl.descriptors.h c = iterator.next().N0().c();
                    final kotlin.reflect.jvm.internal.impl.descriptors.e e2 = null;
                    kotlin.reflect.jvm.internal.impl.descriptors.h b;
                    if (c == null) {
                        b = null;
                    }
                    else {
                        b = c.b();
                    }
                    if (b instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                        e = (kotlin.reflect.jvm.internal.impl.descriptors.e)b;
                    }
                    else {
                        e = null;
                    }
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f g;
                    if (e == null) {
                        g = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f)e2;
                    }
                    else {
                        g = a.p(e);
                    }
                    if (g != null) {
                        list.add(g);
                    }
                }
                return list;
            }
        }, (b$e)new b$b<kotlin.reflect.jvm.internal.impl.descriptors.e, a>() {
            final /* synthetic */ String a = kotlin.reflect.jvm.internal.impl.load.kotlin.t.c(y, false, false, 3, (Object)null);
            final /* synthetic */ kotlin.jvm.internal.j1.h<a> b = new kotlin.jvm.internal.j1.h();
            
            public boolean d(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
                k0.p(e, "javaClassDescriptor");
                final String a = kotlin.reflect.jvm.internal.impl.load.kotlin.s.a(kotlin.reflect.jvm.internal.impl.load.kotlin.v.a, e, this.a);
                final kotlin.reflect.jvm.internal.impl.builtins.jvm.i a2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.i.a;
                kotlin.jvm.internal.j1.h<a> h;
                a g;
                if (a2.e().contains(a)) {
                    h = this.b;
                    g = kotlin.reflect.jvm.internal.impl.builtins.jvm.g.a.G;
                }
                else if (a2.h().contains(a)) {
                    h = this.b;
                    g = kotlin.reflect.jvm.internal.impl.builtins.jvm.g.a.H;
                }
                else {
                    if (!a2.c().contains(a)) {
                        return this.b.G == null;
                    }
                    h = this.b;
                    g = kotlin.reflect.jvm.internal.impl.builtins.jvm.g.a.J;
                }
                h.G = g;
                return this.b.G == null;
            }
            
            @e
            public a e() {
                Enum<a> i;
                if ((i = this.b.G) == null) {
                    i = kotlin.reflect.jvm.internal.impl.builtins.jvm.g.a.I;
                }
                return (a)i;
            }
        });
        k0.o(b, "private fun FunctionDescriptor.getJdkMethodStatus(): JDKMemberStatus {\n        val owner = containingDeclaration as ClassDescriptor\n        val jvmDescriptor = computeJvmDescriptor()\n        var result: JDKMemberStatus? = null\n        return DFS.dfs<ClassDescriptor, JDKMemberStatus>(\n            listOf(owner),\n            {\n                // Search through mapped supertypes to determine that Set.toArray should be invisible, while we have only\n                // Collection.toArray there explicitly\n                // Note, that we can't find j.u.Collection.toArray within overriddenDescriptors of j.u.Set.toArray\n                it.typeConstructor.supertypes.mapNotNull {\n                    (it.constructor.declarationDescriptor?.original as? ClassDescriptor)?.getJavaAnalogue()\n                }\n            },\n            object : DFS.AbstractNodeHandler<ClassDescriptor, JDKMemberStatus>() {\n                override fun beforeChildren(javaClassDescriptor: ClassDescriptor): Boolean {\n                    val signature = SignatureBuildingComponents.signature(javaClassDescriptor, jvmDescriptor)\n                    when (signature) {\n                        in HIDDEN_METHOD_SIGNATURES -> result = JDKMemberStatus.HIDDEN\n                        in VISIBLE_METHOD_SIGNATURES -> result = JDKMemberStatus.VISIBLE\n                        in DROP_LIST_METHOD_SIGNATURES -> result = JDKMemberStatus.DROP\n                    }\n\n                    return result == null\n                }\n\n                override fun result() = result ?: JDKMemberStatus.NOT_CONSIDERED\n            })\n    }");
        return (a)b;
    }
    
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.g)kotlin.reflect.jvm.internal.impl.storage.m.a(this.g, (Object)this, (o)kotlin.reflect.jvm.internal.impl.builtins.jvm.g.h[2]);
    }
    
    private final f.b s() {
        return (f.b)kotlin.reflect.jvm.internal.impl.storage.m.a(this.c, (Object)this, (o)kotlin.reflect.jvm.internal.impl.builtins.jvm.g.h[0]);
    }
    
    private final boolean t(final v0 v0, final boolean b) {
        if (b ^ kotlin.reflect.jvm.internal.impl.builtins.jvm.i.a.f().contains(kotlin.reflect.jvm.internal.impl.load.kotlin.s.a(kotlin.reflect.jvm.internal.impl.load.kotlin.v.a, (kotlin.reflect.jvm.internal.impl.descriptors.e)v0.c(), kotlin.reflect.jvm.internal.impl.load.kotlin.t.c((y)v0, false, false, 3, (Object)null)))) {
            return true;
        }
        final Boolean e = kotlin.reflect.jvm.internal.impl.utils.b.e((Collection)v.k(v0), (b$d)g$j.a, (l)new l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean>() {
            final /* synthetic */ g G;
            
            public final Boolean a(final kotlin.reflect.jvm.internal.impl.descriptors.b b) {
                return b.n() == kotlin.reflect.jvm.internal.impl.descriptors.b.a.G && kotlin.reflect.jvm.internal.impl.builtins.jvm.g.f(this.G).c((kotlin.reflect.jvm.internal.impl.descriptors.e)b.c());
            }
        });
        k0.o(e, "private fun SimpleFunctionDescriptor.isMutabilityViolation(isMutable: Boolean): Boolean {\n        val owner = containingDeclaration as ClassDescriptor\n        val jvmDescriptor = computeJvmDescriptor()\n\n        if ((SignatureBuildingComponents.signature(owner, jvmDescriptor) in MUTABLE_METHOD_SIGNATURES) xor isMutable) return true\n\n        return DFS.ifAny<CallableMemberDescriptor>(\n            listOf(this),\n            { it.original.overriddenDescriptors }\n        ) { overridden ->\n            overridden.kind == CallableMemberDescriptor.Kind.DECLARATION &&\n                    j2kClassMapper.isMutable(overridden.containingDeclaration as ClassDescriptor)\n        }\n    }");
        return e;
    }
    
    private final boolean u(final kotlin.reflect.jvm.internal.impl.descriptors.l l, final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        final int size = l.m().size();
        boolean b = true;
        if (size == 1) {
            final List<kotlin.reflect.jvm.internal.impl.descriptors.e1> m = l.m();
            k0.o(m, "valueParameters");
            final kotlin.reflect.jvm.internal.impl.descriptors.h c = v.U4((List<? extends kotlin.reflect.jvm.internal.impl.descriptors.e1>)m).a().N0().c();
            Object j;
            if (c == null) {
                j = null;
            }
            else {
                j = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.j((m)c);
            }
            if (k0.g(j, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.j((m)e))) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    @e
    @Override
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> a(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        k0.p(e, "classDescriptor");
        if (e.n() != kotlin.reflect.jvm.internal.impl.descriptors.f.G || !this.s().b()) {
            return (Collection<kotlin.reflect.jvm.internal.impl.descriptors.d>)v.E();
        }
        final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f p = this.p(e);
        if (p == null) {
            return (Collection<kotlin.reflect.jvm.internal.impl.descriptors.d>)v.E();
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.e h = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.h(this.b, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.i((m)p), kotlin.reflect.jvm.internal.impl.builtins.jvm.b.g.a(), null, 4, null);
        if (h == null) {
            return (Collection<kotlin.reflect.jvm.internal.impl.descriptors.d>)v.E();
        }
        final d1 c = ((b1)kotlin.reflect.jvm.internal.impl.builtins.jvm.j.a(h, (kotlin.reflect.jvm.internal.impl.descriptors.e)p)).c();
        final List p2 = p.P0();
        final ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.d> list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.d>();
        final Iterator<kotlin.reflect.jvm.internal.impl.descriptors.d> iterator = p2.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            final boolean b = false;
            if (!hasNext) {
                break;
            }
            final kotlin.reflect.jvm.internal.impl.descriptors.d next = iterator.next();
            final kotlin.reflect.jvm.internal.impl.descriptors.d d = next;
            int n = b ? 1 : 0;
            if (d.getVisibility().d()) {
                final Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> j = h.j();
                k0.o(j, "defaultKotlinVersion.constructors");
                boolean b2 = false;
                Label_0245: {
                    if (!j.isEmpty()) {
                        for (final kotlin.reflect.jvm.internal.impl.descriptors.d d2 : j) {
                            k0.o(d2, "it");
                            if (n(d2, c, d)) {
                                b2 = false;
                                break Label_0245;
                            }
                        }
                    }
                    b2 = true;
                }
                n = (b ? 1 : 0);
                if (b2) {
                    n = (b ? 1 : 0);
                    if (!this.u(d, e)) {
                        n = (b ? 1 : 0);
                        if (!KotlinBuiltIns.isDeprecated(d)) {
                            n = (b ? 1 : 0);
                            if (!kotlin.reflect.jvm.internal.impl.builtins.jvm.i.a.d().contains(kotlin.reflect.jvm.internal.impl.load.kotlin.s.a(kotlin.reflect.jvm.internal.impl.load.kotlin.v.a, (kotlin.reflect.jvm.internal.impl.descriptors.e)p, kotlin.reflect.jvm.internal.impl.load.kotlin.t.c((y)d, false, false, 3, (Object)null)))) {
                                n = 1;
                            }
                        }
                    }
                }
            }
            if (n == 0) {
                continue;
            }
            list.add(next);
        }
        final ArrayList list2 = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.d>(v.Y((Iterable<?>)list, 10));
        for (final kotlin.reflect.jvm.internal.impl.descriptors.d d3 : list) {
            final y.a<? extends y> b3 = d3.B();
            b3.o(e);
            b3.f((c0)e.A());
            b3.e();
            b3.l(c.j());
            if (!kotlin.reflect.jvm.internal.impl.builtins.jvm.i.a.g().contains(kotlin.reflect.jvm.internal.impl.load.kotlin.s.a(kotlin.reflect.jvm.internal.impl.load.kotlin.v.a, (kotlin.reflect.jvm.internal.impl.descriptors.e)p, kotlin.reflect.jvm.internal.impl.load.kotlin.t.c((y)d3, false, false, 3, (Object)null)))) {
                b3.r(this.r());
            }
            final y h2 = (y)b3.h();
            Objects.requireNonNull(h2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            list2.add((kotlin.reflect.jvm.internal.impl.descriptors.d)h2);
        }
        return (Collection<kotlin.reflect.jvm.internal.impl.descriptors.d>)list2;
    }
    
    @e
    @Override
    public Collection<v0> b(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.descriptors.e e2) {
        k0.p(e, "name");
        k0.p(e2, "classDescriptor");
        final boolean g = k0.g(e, kotlin.reflect.jvm.internal.impl.builtins.jvm.a.e.a());
        boolean b = true;
        if (g && e2 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e && KotlinBuiltIns.isArrayOrPrimitiveArray(e2)) {
            final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e e3 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e)e2;
            final List s0 = e3.Y0().s0();
            k0.o(s0, "classDescriptor.classProto.functionList");
            Label_0150: {
                if (!(s0 instanceof Collection) || !s0.isEmpty()) {
                    final Iterator<a$i> iterator = s0.iterator();
                    while (iterator.hasNext()) {
                        if (k0.g(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.b(e3.X0().g(), iterator.next().X()), kotlin.reflect.jvm.internal.impl.builtins.jvm.a.e.a())) {
                            break Label_0150;
                        }
                    }
                }
                b = false;
            }
            if (b) {
                return (Collection<v0>)v.E();
            }
            return v.k(this.j(e3, v.S4((Iterable<? extends v0>)((c0)this.m()).x().a(e, (kotlin.reflect.jvm.internal.impl.incremental.components.b)kotlin.reflect.jvm.internal.impl.incremental.components.d.J))));
        }
        else {
            if (!this.s().b()) {
                return (Collection<v0>)v.E();
            }
            final Collection<v0> l = this.l(e2, new l<kotlin.reflect.jvm.internal.impl.resolve.scopes.h, Collection<? extends v0>>() {
                @e
                public final Collection<v0> a(@e final kotlin.reflect.jvm.internal.impl.resolve.scopes.h h) {
                    k0.p(h, "it");
                    return (Collection<v0>)h.a(e, (kotlin.reflect.jvm.internal.impl.incremental.components.b)kotlin.reflect.jvm.internal.impl.incremental.components.d.J);
                }
            });
            final ArrayList<v0> list = new ArrayList<v0>();
            for (final v0 v0 : l) {
                final y d = v0.d(((b1)kotlin.reflect.jvm.internal.impl.builtins.jvm.j.a((kotlin.reflect.jvm.internal.impl.descriptors.e)v0.c(), e2)).c());
                Objects.requireNonNull(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
                final y.a<? extends v0> b2 = ((v0)d).B();
                b2.o(e2);
                b2.d(e2.K0());
                b2.e();
                final int n = kotlin.reflect.jvm.internal.impl.builtins.jvm.g.b.a[this.q(v0).ordinal()];
                v0 v2 = null;
                Label_0419: {
                    if (n != 1) {
                        if (n != 2) {
                            if (n == 3) {
                                break Label_0419;
                            }
                        }
                        else {
                            b2.r(this.r());
                        }
                    }
                    else {
                        if (kotlin.reflect.jvm.internal.impl.descriptors.c0.a(e2)) {
                            break Label_0419;
                        }
                        b2.i();
                    }
                    v2 = (v0)b2.h();
                    k0.m(v2);
                }
                if (v2 != null) {
                    list.add(v2);
                }
            }
            return list;
        }
    }
    
    @Override
    public boolean c(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @e final v0 v0) {
        k0.p(e, "classDescriptor");
        k0.p(v0, "functionDescriptor");
        final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f p2 = this.p(e);
        boolean b = true;
        if (p2 == null) {
            return true;
        }
        if (!v0.getAnnotations().B4(kotlin.reflect.jvm.internal.impl.descriptors.deserialization.d.a())) {
            return true;
        }
        if (!this.s().b()) {
            return false;
        }
        final String c = kotlin.reflect.jvm.internal.impl.load.kotlin.t.c((y)v0, false, false, 3, (Object)null);
        final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g r0 = p2.R0();
        final kotlin.reflect.jvm.internal.impl.name.e name = v0.getName();
        k0.o(name, "functionDescriptor.name");
        final Collection a = r0.a(name, (kotlin.reflect.jvm.internal.impl.incremental.components.b)kotlin.reflect.jvm.internal.impl.incremental.components.d.J);
        if (!(a instanceof Collection) || !a.isEmpty()) {
            final Iterator<v0> iterator = (Iterator<v0>)a.iterator();
            while (iterator.hasNext()) {
                if (k0.g(kotlin.reflect.jvm.internal.impl.load.kotlin.t.c((y)iterator.next(), false, false, 3, (Object)null), c)) {
                    return b;
                }
            }
        }
        b = false;
        return b;
    }
    
    @e
    @Override
    public Collection<c0> d(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        k0.p(e, "classDescriptor");
        final kotlin.reflect.jvm.internal.impl.name.c j = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.j((m)e);
        final kotlin.reflect.jvm.internal.impl.builtins.jvm.i a = kotlin.reflect.jvm.internal.impl.builtins.jvm.i.a;
        List<c0> list;
        if (a.i(j)) {
            final kotlin.reflect.jvm.internal.impl.types.k0 m = this.m();
            k0.o(m, "cloneableType");
            list = v.L((c0)m, this.d);
        }
        else if (a.j(j)) {
            list = v.k(this.d);
        }
        else {
            list = v.E();
        }
        return list;
    }
    
    @e
    public Set<kotlin.reflect.jvm.internal.impl.name.e> o(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        k0.p(e, "classDescriptor");
        if (!this.s().b()) {
            return j1.k();
        }
        final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f p = this.p(e);
        Set<kotlin.reflect.jvm.internal.impl.name.e> b = null;
        if (p != null) {
            final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g r0 = p.R0();
            if (r0 != null) {
                b = (Set<kotlin.reflect.jvm.internal.impl.name.e>)((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j)r0).b();
            }
        }
        Set<kotlin.reflect.jvm.internal.impl.name.e> k = b;
        if (b == null) {
            k = j1.k();
        }
        return k;
    }
    
    private enum a
    {
        G, 
        H, 
        I, 
        J;
    }
}
