// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.f;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.text.s;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.b;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.x;
import kotlin.jvm.internal.m0;
import n6.l;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.storage.g;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.c;

public abstract class a<A, C> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.c<A, C>
{
    @e
    private final m a;
    @e
    private final g<o, b<A, C>> b;
    
    public a(@e final n n, @e final m a) {
        k0.p((Object)n, "storageManager");
        k0.p((Object)a, "kotlinClassFinder");
        this.a = a;
        this.b = n.b((n6.l<? super o, ? extends b<A, C>>)new l<o, b<? extends A, ? extends C>>() {
            @e
            public final b<A, C> a(@e final o o) {
                k0.p((Object)o, "kotlinClass");
                return (b<A, C>)kotlin.reflect.jvm.internal.impl.load.kotlin.a.this.y(o);
            }
        });
    }
    
    private final List<A> A(final x x, final kotlin.reflect.jvm.internal.impl.metadata.a.n n, final a a) {
        final Boolean g = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.z.g(n.U());
        k0.o((Object)g, "IS_CONST.get(proto.flags)");
        final boolean booleanValue = g;
        final h a2 = h.a;
        final boolean f = h.f(n);
        final a g2 = a.G;
        final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c b = x.b();
        final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g d = x.d();
        if (a == g2) {
            final r u = u(this, n, b, d, false, true, false, 40, null);
            if (u == null) {
                return (List<A>)v.E();
            }
            return (List<A>)o(this, x, u, true, false, booleanValue, f, 8, null);
        }
        else {
            final r u2 = u(this, n, b, d, true, false, false, 48, null);
            if (u2 == null) {
                return (List<A>)v.E();
            }
            final String a3 = u2.a();
            int n2 = false ? 1 : 0;
            final boolean v2 = s.V2(a3, "$delegate", false, 2, null);
            if (a == a.I) {
                n2 = (true ? 1 : 0);
            }
            if ((v2 ? 1 : 0) != n2) {
                return (List<A>)v.E();
            }
            return this.n(x, u2, true, true, booleanValue, f);
        }
    }
    
    private final o C(final x.a a) {
        final w0 c = a.c();
        final boolean b = c instanceof q;
        final o o = null;
        q q;
        if (b) {
            q = (q)c;
        }
        else {
            q = null;
        }
        o d;
        if (q == null) {
            d = o;
        }
        else {
            d = q.d();
        }
        return d;
    }
    
    private final int m(final x x, final kotlin.reflect.jvm.internal.impl.protobuf.q q) {
        final boolean b = q instanceof kotlin.reflect.jvm.internal.impl.metadata.a.i;
        int n = 1;
        if (b) {
            if (f.d((kotlin.reflect.jvm.internal.impl.metadata.a.i)q)) {
                return n;
            }
        }
        else if (q instanceof kotlin.reflect.jvm.internal.impl.metadata.a.n) {
            if (f.e((kotlin.reflect.jvm.internal.impl.metadata.a.n)q)) {
                return n;
            }
        }
        else {
            if (!(q instanceof a.d)) {
                throw new UnsupportedOperationException(k0.C("Unsupported message: ", (Object)q.getClass()));
            }
            final x.a a = (x.a)x;
            if (a.g() == kotlin.reflect.jvm.internal.impl.metadata.a.c.c.J) {
                n = 2;
                return n;
            }
            if (a.i()) {
                return n;
            }
        }
        n = 0;
        return n;
    }
    
    private final List<A> n(final x x, final r r, final boolean b, final boolean b2, final Boolean b3, final boolean b4) {
        final o p6 = this.p(x, this.v(x, b, b2, b3, b4));
        if (p6 == null) {
            return (List<A>)v.E();
        }
        List<A> e;
        if ((e = ((b)((l)this.b).invoke((Object)p6)).a().get(r)) == null) {
            e = (List<A>)v.E();
        }
        return e;
    }
    
    static /* synthetic */ List o(final a a, final x x, final r r, boolean b, boolean b2, Boolean b3, boolean b4, final int n, final Object o) {
        if (o == null) {
            if ((n & 0x4) != 0x0) {
                b = false;
            }
            if ((n & 0x8) != 0x0) {
                b2 = false;
            }
            if ((n & 0x10) != 0x0) {
                b3 = null;
            }
            if ((n & 0x20) != 0x0) {
                b4 = false;
            }
            return a.n(x, r, b, b2, b3, b4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }
    
    private final o p(final x x, o c) {
        if (c == null) {
            if (x instanceof x.a) {
                c = this.C((x.a)x);
            }
            else {
                c = null;
            }
        }
        return c;
    }
    
    private final r r(final kotlin.reflect.jvm.internal.impl.protobuf.q q, final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c c, final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g g, final kotlin.reflect.jvm.internal.impl.serialization.deserialization.b b, final boolean b2) {
        final boolean b3 = q instanceof a.d;
        final r r = null;
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e.b b5;
        Object o;
        if (b3) {
            final r.a b4 = kotlin.reflect.jvm.internal.impl.load.kotlin.r.b;
            b5 = h.a.b((a.d)q, c, g);
            o = b4;
            if (b5 == null) {
                return null;
            }
        }
        else if (q instanceof kotlin.reflect.jvm.internal.impl.metadata.a.i) {
            final r.a b6 = kotlin.reflect.jvm.internal.impl.load.kotlin.r.b;
            final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e.b b7 = b5 = h.a.e((kotlin.reflect.jvm.internal.impl.metadata.a.i)q, c, g);
            o = b6;
            if (b7 == null) {
                return null;
            }
        }
        else {
            r r2 = r;
            if (!(q instanceof kotlin.reflect.jvm.internal.impl.metadata.a.n)) {
                return r2;
            }
            final i.d d = (i.d)q;
            final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.n, a.d> d2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.d;
            k0.o((Object)d2, "propertySignature");
            final a.d d3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(d, (i.g<i.d, a.d>)d2);
            if (d3 == null) {
                return null;
            }
            final int n = kotlin.reflect.jvm.internal.impl.load.kotlin.a.c.a[b.ordinal()];
            r.a a;
            kotlin.reflect.jvm.internal.impl.metadata.jvm.a.c c2;
            String s;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        r2 = r;
                        return r2;
                    }
                    r2 = this.t((kotlin.reflect.jvm.internal.impl.metadata.a.n)q, c, g, true, true, b2);
                    return r2;
                }
                else {
                    r2 = r;
                    if (!d3.H()) {
                        return r2;
                    }
                    a = kotlin.reflect.jvm.internal.impl.load.kotlin.r.b;
                    c2 = d3.D();
                    s = "signature.setter";
                }
            }
            else {
                r2 = r;
                if (!d3.G()) {
                    return r2;
                }
                a = kotlin.reflect.jvm.internal.impl.load.kotlin.r.b;
                c2 = d3.C();
                s = "signature.getter";
            }
            k0.o((Object)c2, s);
            r2 = a.c(c, c2);
            return r2;
        }
        return ((r.a)o).b(b5);
    }
    
    static /* synthetic */ r s(final a a, final kotlin.reflect.jvm.internal.impl.protobuf.q q, final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c c, final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g g, final kotlin.reflect.jvm.internal.impl.serialization.deserialization.b b, boolean b2, final int n, final Object o) {
        if (o == null) {
            if ((n & 0x10) != 0x0) {
                b2 = false;
            }
            return a.r(q, c, g, b, b2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }
    
    private final r t(final kotlin.reflect.jvm.internal.impl.metadata.a.n n, final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c c, final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g g, final boolean b, final boolean b2, final boolean b3) {
        final i.g<kotlin.reflect.jvm.internal.impl.metadata.a.n, a.d> d = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.d;
        k0.o((Object)d, "propertySignature");
        final a.d d2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a((i.d<i.d>)n, (i.g<i.d, a.d>)d);
        if (d2 == null) {
            return null;
        }
        if (b) {
            final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e.a c2 = h.a.c(n, c, g, b3);
            if (c2 == null) {
                return null;
            }
            return r.b.b(c2);
        }
        else {
            if (b2 && d2.I()) {
                final r.a b4 = r.b;
                final kotlin.reflect.jvm.internal.impl.metadata.jvm.a.c e = d2.E();
                k0.o((Object)e, "signature.syntheticMethod");
                return b4.c(c, e);
            }
            return null;
        }
    }
    
    static /* synthetic */ r u(final a a, final kotlin.reflect.jvm.internal.impl.metadata.a.n n, final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c c, final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g g, boolean b, boolean b2, boolean b3, final int n2, final Object o) {
        if (o == null) {
            if ((n2 & 0x8) != 0x0) {
                b = false;
            }
            if ((n2 & 0x10) != 0x0) {
                b2 = false;
            }
            if ((n2 & 0x20) != 0x0) {
                b3 = true;
            }
            return a.t(n, c, g, b, b2, b3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPropertySignature");
    }
    
    private final o v(final x obj, final boolean b, final boolean b2, final Boolean b3, final boolean b4) {
        if (b) {
            if (b3 == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("isConst should not be null for property (container=");
                sb.append(obj);
                sb.append(')');
                throw new IllegalStateException(sb.toString().toString());
            }
            while (true) {
                Label_0073: {
                    if (!(obj instanceof x.a)) {
                        break Label_0073;
                    }
                    final x.a a = (x.a)obj;
                    if (a.g() != kotlin.reflect.jvm.internal.impl.metadata.a.c.c.I) {
                        break Label_0073;
                    }
                    final m m = this.a;
                    final kotlin.reflect.jvm.internal.impl.name.a a2 = a.e().d(kotlin.reflect.jvm.internal.impl.name.e.i("DefaultImpls"));
                    final String s = "container.classId.createNestedClassId(Name.identifier(JvmAbi.DEFAULT_IMPLS_CLASS_NAME))";
                    k0.o((Object)a2, s);
                    return kotlin.reflect.jvm.internal.impl.load.kotlin.n.b(m, a2);
                }
                if (b3 && obj instanceof x.b) {
                    final w0 c = obj.c();
                    kotlin.reflect.jvm.internal.impl.load.kotlin.i i;
                    if (c instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.i) {
                        i = (kotlin.reflect.jvm.internal.impl.load.kotlin.i)c;
                    }
                    else {
                        i = null;
                    }
                    kotlin.reflect.jvm.internal.impl.resolve.jvm.c e;
                    if (i == null) {
                        e = null;
                    }
                    else {
                        e = i.e();
                    }
                    if (e != null) {
                        final m m = this.a;
                        final String f = e.f();
                        k0.o((Object)f, "facadeClassName.internalName");
                        final kotlin.reflect.jvm.internal.impl.name.a a2 = kotlin.reflect.jvm.internal.impl.name.a.m(new kotlin.reflect.jvm.internal.impl.name.b(s.j2(f, '/', '.', false, 4, null)));
                        final String s = "topLevel(FqName(facadeClassName.internalName.replace('/', '.')))";
                        continue;
                    }
                }
                break;
            }
        }
        if (b2 && obj instanceof x.a) {
            final x.a a3 = (x.a)obj;
            if (a3.g() == kotlin.reflect.jvm.internal.impl.metadata.a.c.c.N) {
                final x.a h = a3.h();
                if (h != null && (h.g() == kotlin.reflect.jvm.internal.impl.metadata.a.c.c.H || h.g() == kotlin.reflect.jvm.internal.impl.metadata.a.c.c.J || (b4 && (h.g() == kotlin.reflect.jvm.internal.impl.metadata.a.c.c.I || h.g() == kotlin.reflect.jvm.internal.impl.metadata.a.c.c.L)))) {
                    return this.C(h);
                }
            }
        }
        if (obj instanceof x.b && obj.c() instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.i) {
            final w0 c2 = obj.c();
            Objects.requireNonNull(c2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            final kotlin.reflect.jvm.internal.impl.load.kotlin.i j = (kotlin.reflect.jvm.internal.impl.load.kotlin.i)c2;
            o o;
            if ((o = j.f()) == null) {
                o = kotlin.reflect.jvm.internal.impl.load.kotlin.n.b(this.a, j.d());
            }
            return o;
        }
        return null;
    }
    
    private final o.a x(final kotlin.reflect.jvm.internal.impl.name.a a, final w0 w0, final List<A> list) {
        if (kotlin.reflect.jvm.internal.impl.a.a.a().contains(a)) {
            return null;
        }
        return this.w(a, w0, list);
    }
    
    private final b<A, C> y(final o o) {
        final HashMap<r, List<? extends A>> hashMap = new HashMap<r, List<? extends A>>();
        final HashMap<r, C> hashMap2 = new HashMap<r, C>();
        o.e((o.d)new o.d() {
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.a<A, C> a;
            
            @org.jetbrains.annotations.f
            @Override
            public o.c a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.f final Object o) {
                k0.p((Object)e, "name");
                k0.p((Object)s, "desc");
                final r.a b = r.b;
                final String d = e.d();
                k0.o((Object)d, "name.asString()");
                final r a = b.a(d, s);
                if (o != null) {
                    final C z = this.a.z(s, o);
                    if (z != null) {
                        hashMap2.put(a, z);
                    }
                }
                return new b(a);
            }
            
            @org.jetbrains.annotations.f
            @Override
            public e b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final String s) {
                k0.p((Object)e, "name");
                k0.p((Object)s, "desc");
                final r.a b = r.b;
                final String d = e.d();
                k0.o((Object)d, "name.asString()");
                return new a(b.d(d, s));
            }
            
            public final class a extends a$d.b implements e
            {
                public a() {
                    k0.p((Object)o.d.this, "this$0");
                    k0.p((Object)r, "signature");
                    super(r);
                }
                
                @org.jetbrains.annotations.f
                @Override
                public o.a c(final int n, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a a, @org.jetbrains.annotations.e final w0 w0) {
                    k0.p((Object)a, "classId");
                    k0.p((Object)w0, "source");
                    final r e = r.b.e(((a$d.b)this).d(), n);
                    List<A> list;
                    if ((list = hashMap.get(e)) == null) {
                        list = new ArrayList<A>();
                        hashMap.put(e, list);
                    }
                    return a.this.x(a, w0, list);
                }
            }
            
            public class b implements o.c
            {
                @org.jetbrains.annotations.e
                private final r a = hashMap2;
                @org.jetbrains.annotations.e
                private final ArrayList<A> b;
                
                public b() {
                    k0.p((Object)d.this, "this$0");
                    k0.p((Object)a, "signature");
                    this.b = new ArrayList<A>();
                }
                
                @Override
                public void a() {
                    if (this.b.isEmpty() ^ true) {
                        hashMap.put(this.a, this.b);
                    }
                }
                
                @org.jetbrains.annotations.f
                @Override
                public o.a b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a a, @org.jetbrains.annotations.e final w0 w0) {
                    k0.p((Object)a, "classId");
                    k0.p((Object)w0, "source");
                    return a.this.x(a, w0, this.b);
                }
                
                @org.jetbrains.annotations.e
                protected final r d() {
                    return this.a;
                }
            }
        }, this.q(o));
        return new b<A, C>(hashMap, hashMap2);
    }
    
    @e
    protected abstract A B(@e final kotlin.reflect.jvm.internal.impl.metadata.a.b p0, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c p1);
    
    @org.jetbrains.annotations.f
    protected abstract C D(@e final C p0);
    
    @e
    @Override
    public List<A> a(@e final kotlin.reflect.jvm.internal.impl.metadata.a.s s, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c c) {
        k0.p((Object)s, "proto");
        k0.p((Object)c, "nameResolver");
        final List<kotlin.reflect.jvm.internal.impl.metadata.a.b> v = ((i.d<kotlin.reflect.jvm.internal.impl.metadata.a.s>)s).v(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.h);
        k0.o((Object)v, "proto.getExtension(JvmProtoBuf.typeParameterAnnotation)");
        final List<kotlin.reflect.jvm.internal.impl.metadata.a.b> list = v;
        final ArrayList list2 = new ArrayList<A>(kotlin.collections.v.Y((Iterable)list, 10));
        for (final kotlin.reflect.jvm.internal.impl.metadata.a.b b : list) {
            k0.o((Object)b, "it");
            list2.add(this.B(b, c));
        }
        return (List<A>)list2;
    }
    
    @e
    @Override
    public List<A> b(@e final x x, @e final kotlin.reflect.jvm.internal.impl.protobuf.q q, @e final kotlin.reflect.jvm.internal.impl.serialization.deserialization.b b, final int n, @e final a.u u) {
        k0.p((Object)x, "container");
        k0.p((Object)q, "callableProto");
        k0.p((Object)b, "kind");
        k0.p((Object)u, "proto");
        final r s = s(this, q, x.b(), x.d(), b, false, 16, null);
        if (s != null) {
            return (List<A>)o(this, x, r.b.e(s, n + this.m(x, q)), false, false, null, false, 60, null);
        }
        return (List<A>)v.E();
    }
    
    @e
    @Override
    public List<A> c(@e final x.a a) {
        k0.p((Object)a, "container");
        final o c = this.C(a);
        if (c != null) {
            final ArrayList<A> list = new ArrayList<A>(1);
            c.d((o.c)new o.c() {
                @Override
                public void a() {
                }
                
                @org.jetbrains.annotations.f
                @Override
                public o.a b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a a, @org.jetbrains.annotations.e final w0 w0) {
                    k0.p((Object)a, "classId");
                    k0.p((Object)w0, "source");
                    return a.this.x(a, w0, list);
                }
            }, this.q(c));
            return list;
        }
        throw new IllegalStateException(k0.C("Class for loading annotations is not found: ", (Object)a.a()).toString());
    }
    
    @e
    @Override
    public List<A> d(@e final kotlin.reflect.jvm.internal.impl.metadata.a.q q, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c c) {
        k0.p((Object)q, "proto");
        k0.p((Object)c, "nameResolver");
        final List<kotlin.reflect.jvm.internal.impl.metadata.a.b> v = ((i.d<kotlin.reflect.jvm.internal.impl.metadata.a.q>)q).v(kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f);
        k0.o((Object)v, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        final List<kotlin.reflect.jvm.internal.impl.metadata.a.b> list = v;
        final ArrayList list2 = new ArrayList<A>(kotlin.collections.v.Y((Iterable)list, 10));
        for (final kotlin.reflect.jvm.internal.impl.metadata.a.b b : list) {
            k0.o((Object)b, "it");
            list2.add(this.B(b, c));
        }
        return (List<A>)list2;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public C e(@e final x x, @e final kotlin.reflect.jvm.internal.impl.metadata.a.n n, @e final c0 c0) {
        k0.p((Object)x, "container");
        k0.p((Object)n, "proto");
        k0.p((Object)c0, "expectedType");
        final Boolean g = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.z.g(n.U());
        final h a = h.a;
        final o p3 = this.p(x, this.v(x, true, true, g, h.f(n)));
        if (p3 == null) {
            return null;
        }
        final r r = this.r(n, x.b(), x.d(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.H, p3.a().d().d(kotlin.reflect.jvm.internal.impl.load.kotlin.e.b.a()));
        if (r == null) {
            return null;
        }
        final C value = ((b)((l)this.b).invoke((Object)p3)).b().get(r);
        if (value == null) {
            return null;
        }
        final UnsignedTypes instance = UnsignedTypes.INSTANCE;
        Object d = value;
        if (UnsignedTypes.isUnsignedType(c0)) {
            d = this.D(value);
        }
        return (C)d;
    }
    
    @e
    @Override
    public List<A> f(@e final x x, @e final kotlin.reflect.jvm.internal.impl.metadata.a.g g) {
        k0.p((Object)x, "container");
        k0.p((Object)g, "proto");
        final r.a b = r.b;
        final String string = x.b().getString(g.H());
        final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b a = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.a;
        final String c = ((x.a)x).e().c();
        k0.o((Object)c, "container as ProtoContainer.Class).classId.asString()");
        return (List<A>)o(this, x, b.a(string, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.b.b(c)), false, false, null, false, 60, null);
    }
    
    @e
    @Override
    public List<A> g(@e final x x, @e final kotlin.reflect.jvm.internal.impl.metadata.a.n n) {
        k0.p((Object)x, "container");
        k0.p((Object)n, "proto");
        return this.A(x, n, kotlin.reflect.jvm.internal.impl.load.kotlin.a.a.H);
    }
    
    @e
    @Override
    public List<A> h(@e final x x, @e final kotlin.reflect.jvm.internal.impl.protobuf.q q, @e final kotlin.reflect.jvm.internal.impl.serialization.deserialization.b b) {
        k0.p((Object)x, "container");
        k0.p((Object)q, "proto");
        k0.p((Object)b, "kind");
        final r s = s(this, q, x.b(), x.d(), b, false, 16, null);
        if (s != null) {
            return (List<A>)o(this, x, r.b.e(s, 0), false, false, null, false, 60, null);
        }
        return (List<A>)v.E();
    }
    
    @e
    @Override
    public List<A> i(@e final x x, @e final kotlin.reflect.jvm.internal.impl.metadata.a.n n) {
        k0.p((Object)x, "container");
        k0.p((Object)n, "proto");
        return this.A(x, n, kotlin.reflect.jvm.internal.impl.load.kotlin.a.a.I);
    }
    
    @e
    @Override
    public List<A> j(@e final x x, @e final kotlin.reflect.jvm.internal.impl.protobuf.q q, @e final kotlin.reflect.jvm.internal.impl.serialization.deserialization.b b) {
        k0.p((Object)x, "container");
        k0.p((Object)q, "proto");
        k0.p((Object)b, "kind");
        if (b == kotlin.reflect.jvm.internal.impl.serialization.deserialization.b.H) {
            return this.A(x, (kotlin.reflect.jvm.internal.impl.metadata.a.n)q, kotlin.reflect.jvm.internal.impl.load.kotlin.a.a.G);
        }
        final r s = s(this, q, x.b(), x.d(), b, false, 16, null);
        if (s == null) {
            return (List<A>)v.E();
        }
        return (List<A>)o(this, x, s, false, false, null, false, 60, null);
    }
    
    @org.jetbrains.annotations.f
    protected byte[] q(@e final o o) {
        k0.p((Object)o, "kotlinClass");
        return null;
    }
    
    @org.jetbrains.annotations.f
    protected abstract o.a w(@e final kotlin.reflect.jvm.internal.impl.name.a p0, @e final w0 p1, @e final List<A> p2);
    
    @org.jetbrains.annotations.f
    protected abstract C z(@e final String p0, @e final Object p1);
    
    private enum a
    {
        G, 
        H, 
        I;
    }
    
    private static final class b<A, C>
    {
        @e
        private final Map<r, List<A>> a;
        @e
        private final Map<r, C> b;
        
        public b(@e final Map<r, ? extends List<? extends A>> a, @e final Map<r, ? extends C> b) {
            k0.p((Object)a, "memberAnnotations");
            k0.p((Object)b, "propertyConstants");
            this.a = (Map<r, List<A>>)a;
            this.b = (Map<r, C>)b;
        }
        
        @e
        public final Map<r, List<A>> a() {
            return this.a;
        }
        
        @e
        public final Map<r, C> b() {
            return this.b;
        }
    }
}
