// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.s0;
import kotlin.text.s;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h$c;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import kotlin.reflect.o;
import kotlin.reflect.jvm.internal.impl.metadata.a$t;
import kotlin.reflect.jvm.internal.impl.protobuf.i$g;
import kotlin.m1;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.u;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;
import kotlin.reflect.jvm.internal.impl.protobuf.i$d;
import kotlin.reflect.jvm.internal.impl.metadata.a$n;
import kotlin.reflect.jvm.internal.impl.metadata.a$l;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.incremental.components.d;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.l;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u00013B\u001f\u0012\n\u0010)\u001a\u0006\u0012\u0002\b\u00030\u001e\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b1\u00102J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R,\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012 \u0015*\b\u0018\u00010\u0014R\u00020\u00000\u0014R\u00020\u00000\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u0006\u0012\u0002\b\u00030\u001e8T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R \u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0\u00048V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R \u0010)\u001a\u0006\u0012\u0002\b\u00030\u001e8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010 R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u00048V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010$R\u0016\u00100\u001a\u00020-8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00064" }, d2 = { "Lkotlin/reflect/jvm/internal/p;", "Lkotlin/reflect/jvm/internal/k;", "Lkotlin/reflect/jvm/internal/impl/name/e;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "U", "Lkotlin/reflect/jvm/internal/impl/descriptors/y;", "P", "", "index", "Q", "", "other", "", "equals", "hashCode", "", "toString", "Lkotlin/reflect/jvm/internal/d0$b;", "Lkotlin/reflect/jvm/internal/p$a;", "kotlin.jvm.PlatformType", "J", "Lkotlin/reflect/jvm/internal/d0$b;", "data", "L", "Ljava/lang/String;", "getUsageModuleName", "()Ljava/lang/String;", "usageModuleName", "Ljava/lang/Class;", "T", "()Ljava/lang/Class;", "methodOwner", "Lkotlin/reflect/c;", "x", "()Ljava/util/Collection;", "members", "K", "Ljava/lang/Class;", "m", "jClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/l;", "O", "constructorDescriptors", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "a", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
public final class p extends k
{
    private final d0.b<a> J;
    @e
    private final Class<?> K;
    @f
    private final String L;
    
    public p(@e final Class<?> k, @f final String l) {
        k0.p(k, "jClass");
        this.K = k;
        this.L = l;
        final d0.b<a> b = d0.b((n6.a<a>)new n6.a<a>() {
            public final p.a a() {
                return new p.a();
            }
        });
        k0.o(b, "ReflectProperties.lazy { Data() }");
        this.J = b;
    }
    
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h f0() {
        return this.J.invoke().g();
    }
    
    @e
    @Override
    public Collection<l> O() {
        return (Collection<l>)v.E();
    }
    
    @e
    @Override
    public Collection<y> P(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p(e, "name");
        return (Collection<y>)this.f0().a(e, (kotlin.reflect.jvm.internal.impl.incremental.components.b)d.N);
    }
    
    @f
    @Override
    public q0 Q(final int n) {
        final m1<g, a$l, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f> e = this.J.invoke().e();
        q0 q0 = null;
        if (e != null) {
            final g g = e.a();
            final a$l a$l = e.b();
            final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f f = e.c();
            final i$g n2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.n;
            k0.o(n2, "JvmProtoBuf.packageLocalVariable");
            final a$n a$n = (a$n)kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.b((i$d)a$l, n2, n);
            q0 = q0;
            if (a$n != null) {
                final Class<?> m = this.m();
                final a$t x = a$l.X();
                k0.o(x, "packageProto.typeTable");
                q0 = (q0)kotlin.reflect.jvm.internal.k0.f(m, a$n, (kotlin.reflect.jvm.internal.impl.metadata.deserialization.c)g, new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g(x), (kotlin.reflect.jvm.internal.impl.metadata.deserialization.a)f, (n6.p<? super u, ? super a$n, ? extends kotlin.reflect.jvm.internal.impl.descriptors.a>)p$c.G);
            }
        }
        return q0;
    }
    
    @e
    @Override
    protected Class<?> T() {
        Class<?> clazz = this.J.invoke().f();
        if (clazz == null) {
            clazz = this.m();
        }
        return clazz;
    }
    
    @e
    @Override
    public Collection<q0> U(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p(e, "name");
        return (Collection<q0>)this.f0().c(e, (kotlin.reflect.jvm.internal.impl.incremental.components.b)d.N);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o instanceof p && k0.g(this.m(), ((p)o).m());
    }
    
    @Override
    public int hashCode() {
        return this.m().hashCode();
    }
    
    @e
    @Override
    public Class<?> m() {
        return this.K;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("file class ");
        sb.append(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.b((Class)this.m()).b());
        return sb.toString();
    }
    
    @e
    @Override
    public Collection<kotlin.reflect.c<?>> x() {
        return (Collection<kotlin.reflect.c<?>>)this.J.invoke().d();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u001f\u0010 R1\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0011\u001a\u0004\u0018\u00010\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R'\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00128F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\r\u0010\u0015R#\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00178F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001e\u001a\u00020\u001b8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u001c\u0010\u001d¨\u0006!" }, d2 = { "kotlin/reflect/jvm/internal/p$a", "Lkotlin/reflect/jvm/internal/k$b;", "Lkotlin/reflect/jvm/internal/k;", "Lkotlin/m1;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/g;", "Lkotlin/reflect/jvm/internal/impl/metadata/a$l;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/f;", "g", "Lkotlin/reflect/jvm/internal/d0$b;", "e", "()Lkotlin/m1;", "metadata", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/f;", "d", "Lkotlin/reflect/jvm/internal/d0$a;", "getKotlinClass", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", "kotlinClass", "", "Lkotlin/reflect/jvm/internal/f;", "h", "()Ljava/util/Collection;", "members", "Ljava/lang/Class;", "f", "()Ljava/lang/Class;", "multifileFacade", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "<init>", "(Lkotlin/reflect/jvm/internal/p;)V", "kotlin-reflection" }, k = 1, mv = { 1, 4, 1 })
    private final class a extends b
    {
        static final /* synthetic */ o[] j;
        private final d0.a d;
        @e
        private final d0.a e;
        @f
        private final d0.b f;
        @f
        private final d0.b g;
        @e
        private final d0.a h;
        final /* synthetic */ p i;
        
        static {
            j = new o[] { k1.r(new f1(k1.d(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), k1.r(new f1(k1.d(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), k1.r(new f1(k1.d(a.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), k1.r(new f1(k1.d(a.class), "metadata", "getMetadata()Lkotlin/Triple;")), k1.r(new f1(k1.d(a.class), "members", "getMembers()Ljava/util/Collection;")) };
        }
        
        public a() {
            this.d = (d0.a)d0.d((n6.a<Object>)new n6.a<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f>() {
                final /* synthetic */ p.a G;
                
                @f
                public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f a() {
                    return kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f.c.a((Class)this.G.i.m());
                }
            });
            this.e = (d0.a)d0.d((n6.a<Object>)new n6.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.h>() {
                final /* synthetic */ p.a G;
                
                public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h a() {
                    final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f b = p.a.this.c();
                    Object o;
                    if (b != null) {
                        o = ((b)this.G).a().c().a(b);
                    }
                    else {
                        o = h$c.b;
                    }
                    return (kotlin.reflect.jvm.internal.impl.resolve.scopes.h)o;
                }
            });
            this.f = (d0.b)d0.b((n6.a<Object>)new n6.a<Class<?>>() {
                final /* synthetic */ p.a G;
                
                @f
                public final Class<?> a() {
                    final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f b = p.a.this.c();
                    final Class<?> clazz = null;
                    String e = null;
                    Label_0033: {
                        if (b != null) {
                            final kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a = b.a();
                            if (a != null) {
                                e = a.e();
                                break Label_0033;
                            }
                        }
                        e = null;
                    }
                    Class<?> loadClass = clazz;
                    if (e != null) {
                        final boolean b2 = e.length() > 0;
                        loadClass = clazz;
                        if (b2) {
                            loadClass = this.G.i.m().getClassLoader().loadClass(s.j2(e, '/', '.', false, 4, (Object)null));
                        }
                    }
                    return loadClass;
                }
            });
            this.g = (d0.b)d0.b((n6.a<Object>)new n6.a<m1<? extends g, ? extends a$l, ? extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f>>() {
                @f
                public final m1<g, a$l, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f> a() {
                    final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f b = p.a.this.c();
                    m1<g, a$l, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f> m2;
                    final m1<g, a$l, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f> m1 = m2 = null;
                    if (b != null) {
                        final kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a = b.a();
                        m2 = m1;
                        if (a != null) {
                            final String[] a2 = a.a();
                            final String[] g = a.g();
                            m2 = m1;
                            if (a2 != null) {
                                m2 = m1;
                                if (g != null) {
                                    final s0 i = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.m(a2, g);
                                    m2 = new m1<g, a$l, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f>(i.a(), i.b(), a.d());
                                }
                            }
                        }
                    }
                    return m2;
                }
            });
            this.h = (d0.a)d0.d((n6.a<Object>)new n6.a<Collection<? extends kotlin.reflect.jvm.internal.f<?>>>() {
                final /* synthetic */ p.a G;
                
                public final Collection<kotlin.reflect.jvm.internal.f<?>> a() {
                    final p.a g = this.G;
                    return g.i.R(g.g(), k.c.G);
                }
            });
        }
        
        private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f c() {
            return (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f)((d0.c)this.d).b(this, a.j[0]);
        }
        
        @e
        public final Collection<kotlin.reflect.jvm.internal.f<?>> d() {
            return (Collection<kotlin.reflect.jvm.internal.f<?>>)((d0.c)this.h).b(this, a.j[4]);
        }
        
        @f
        public final m1<g, a$l, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f> e() {
            return (m1<g, a$l, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f>)((d0.c)this.g).b(this, a.j[3]);
        }
        
        @f
        public final Class<?> f() {
            return (Class<?>)((d0.c)this.f).b(this, a.j[2]);
        }
        
        @e
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h g() {
            return (kotlin.reflect.jvm.internal.impl.resolve.scopes.h)((d0.c)this.e).b(this, a.j[1]);
        }
    }
}
