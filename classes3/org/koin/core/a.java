// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core;

import java.util.Collection;
import n6.p;
import java.util.List;
import org.jetbrains.annotations.f;
import kotlin.d0;
import kotlin.reflect.d;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.k0;
import m6.h;
import kotlin.b0;
import m7.b;
import org.jetbrains.annotations.e;
import m7.c;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bF\u0010#J;\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\n\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0087\bJ=\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\n\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0087\bJ<\u0010\f\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\n\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0087\b¢\u0006\u0004\b\f\u0010\rJ>\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\n\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0087\b¢\u0006\u0004\b\u000e\u0010\rJB\u0010\u0014\u001a\u00020\u0013\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0018\u00010\u0010H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\bJ8\u0010\u0019\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0017\u0018\u0001\"\u0006\b\u0001\u0010\u0018\u0018\u00012\u0016\b\n\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0086\b¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\u001c\u0010\u001dJC\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u00112\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u00112\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010(\u001a\u00020'2\n\u0010&\u001a\u00060$j\u0002`%2\u0006\u0010\u0004\u001a\u00020\u0003J\u001a\u0010)\u001a\u00020'2\n\u0010&\u001a\u00060$j\u0002`%2\u0006\u0010\u0004\u001a\u00020\u0003J\u0012\u0010*\u001a\u00020'2\n\u0010&\u001a\u00060$j\u0002`%J\u0014\u0010+\u001a\u0004\u0018\u00010'2\n\u0010&\u001a\u00060$j\u0002`%J\u0012\u0010,\u001a\u00020\u00132\n\u0010&\u001a\u00060$j\u0002`%J#\u0010/\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00028\u0000¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010-\u001a\u00020$¢\u0006\u0004\b1\u00102J'\u00104\u001a\u00020\u0013\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010-\u001a\u00020$2\u0006\u00103\u001a\u00028\u0000¢\u0006\u0004\b4\u00105J\u0006\u00106\u001a\u00020\u0013R\u0019\u0010;\u001a\u00020'8\u0006@\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010=\u001a\u00020<8\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010B\u001a\u00020A8\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006G" }, d2 = { "Lorg/koin/core/a;", "", "T", "Ll7/a;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/core/parameter/a;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/b0;", "E", "I", "n", "(Ll7/a;Ln6/a;)Ljava/lang/Object;", "t", "instance", "", "Lkotlin/reflect/d;", "secondaryTypes", "Lkotlin/j2;", "h", "(Ljava/lang/Object;Ll7/a;Ljava/util/List;)V", "p", "S", "P", "b", "(Ln6/a;)Ljava/lang/Object;", "clazz", "l", "(Lkotlin/reflect/d;Ll7/a;Ln6/a;)Ljava/lang/Object;", "primaryType", "secondaryType", "a", "(Lkotlin/reflect/d;Lkotlin/reflect/d;Ln6/a;)Ljava/lang/Object;", "f", "()V", "", "Lorg/koin/core/scope/ScopeID;", "scopeId", "Lorg/koin/core/scope/a;", "g", "q", "z", "A", "j", "key", "defaultValue", "w", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "v", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "K", "(Ljava/lang/String;Ljava/lang/Object;)V", "e", "c", "Lorg/koin/core/scope/a;", "y", "()Lorg/koin/core/scope/a;", "rootScope", "Lm7/c;", "scopeRegistry", "Lm7/c;", "B", "()Lm7/c;", "Lm7/b;", "propertyRegistry", "Lm7/b;", "x", "()Lm7/b;", "<init>", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class a
{
    @e
    private final c a;
    @e
    private final b b;
    @e
    private final org.koin.core.scope.a c;
    
    public a() {
        this.a = new c();
        this.b = new b();
        this.c = new org.koin.core.scope.a("-Root-", true, this);
    }
    
    @h
    private final <T> b0<T> C() {
        return (b0<T>)F(this, null, null, 3, null);
    }
    
    @h
    private final <T> b0<T> D(final l7.a a) {
        return (b0<T>)F(this, a, null, 2, null);
    }
    
    @h
    private final <T> b0<T> E(final l7.a a, final n6.a<org.koin.core.parameter.a> a2) {
        final org.koin.core.scope.a y = this.y();
        k0.w();
        return (b0<T>)d0.c((n6.a)new n6.a<T>() {
            public final T invoke() {
                final org.koin.core.scope.a g = y;
                final l7.a h = a;
                final n6.a i = a2;
                k0.y(4, "T");
                return (T)g.t((d<?>)k1.d((Class)Object.class), h, (n6.a<org.koin.core.parameter.a>)i);
            }
        });
    }
    
    @h
    static /* synthetic */ b0 F(final a a, l7.a a2, n6.a a3, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            a2 = null;
        }
        if ((n & 0x2) != 0x0) {
            a3 = null;
        }
        final org.koin.core.scope.a y = a.y();
        k0.w();
        return d0.c((n6.a)new n6.a<T>() {
            public final T invoke() {
                final org.koin.core.scope.a g = y;
                final l7.a h = a2;
                final n6.a i = a3;
                k0.y(4, "T");
                return (T)g.t((d<?>)k1.d((Class)Object.class), h, (n6.a<org.koin.core.parameter.a>)i);
            }
        });
    }
    
    @h
    private final <T> b0<T> G() {
        return (b0<T>)J(this, null, null, 3, null);
    }
    
    @h
    private final <T> b0<T> H(final l7.a a) {
        return (b0<T>)J(this, a, null, 2, null);
    }
    
    @h
    private final <T> b0<T> I(final l7.a a, final n6.a<org.koin.core.parameter.a> a2) {
        final org.koin.core.scope.a y = this.y();
        k0.w();
        return (b0<T>)d0.c((n6.a)new n6.a<T>() {
            @f
            public final T invoke() {
                final org.koin.core.scope.a g = y;
                final l7.a h = a;
                final n6.a i = a2;
                Object t;
                try {
                    k0.y(4, "T?");
                    t = g.t((d<?>)k1.d((Class)Object.class), h, (n6.a<org.koin.core.parameter.a>)i);
                }
                catch (Exception ex) {
                    final org.koin.core.logger.c b = org.koin.core.b.c.b();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't get instance for ");
                    k0.y(4, "T?");
                    sb.append(org.koin.ext.a.a((d<?>)k1.d((Class)Object.class)));
                    b.b(sb.toString());
                    t = null;
                }
                return (T)t;
            }
        });
    }
    
    @h
    static /* synthetic */ b0 J(final a a, l7.a a2, n6.a a3, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            a2 = null;
        }
        if ((n & 0x2) != 0x0) {
            a3 = null;
        }
        final org.koin.core.scope.a y = a.y();
        k0.w();
        return d0.c((n6.a)new n6.a<T>() {
            @f
            public final T invoke() {
                final org.koin.core.scope.a g = y;
                final l7.a h = a2;
                final n6.a i = a3;
                Object t;
                try {
                    k0.y(4, "T?");
                    t = g.t((d<?>)k1.d((Class)Object.class), h, (n6.a<org.koin.core.parameter.a>)i);
                }
                catch (Exception ex) {
                    final org.koin.core.logger.c b = org.koin.core.b.c.b();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't get instance for ");
                    k0.y(4, "T?");
                    sb.append(org.koin.ext.a.a((d<?>)k1.d((Class)Object.class)));
                    b.b(sb.toString());
                    t = null;
                }
                return (T)t;
            }
        });
    }
    
    private final <S, P> S b(final n6.a<org.koin.core.parameter.a> a) {
        final org.koin.core.scope.a y = this.y();
        k0.y(4, "S");
        final d d = k1.d((Class)Object.class);
        k0.y(4, "P");
        return (S)y.b((d<?>)k1.d((Class)Object.class), (d<?>)d, a);
    }
    
    private final <T> void h(final T t, final l7.a a, final List<? extends d<?>> c) {
        final org.koin.core.scope.a y = this.y();
        final boolean v = y.V();
        l7.a e = null;
        m0 m0;
        org.koin.core.definition.b<Object> b;
        org.koin.core.definition.e e2;
        if (v) {
            final org.koin.core.definition.d a2 = org.koin.core.definition.d.a;
            m0 = new p<org.koin.core.scope.a, org.koin.core.parameter.a, T>() {
                final /* synthetic */ Object G;
                
                public final T a(@e final a a, @e final org.koin.core.parameter.a a2) {
                    k0.q((Object)a, "$this$createSingle");
                    k0.q((Object)a2, "it");
                    return (T)this.G;
                }
            };
            final org.koin.core.definition.e g = org.koin.core.definition.e.G;
            k0.y(4, "T");
            b = new org.koin.core.definition.b<Object>(a, null, (d<?>)k1.d((Class)Object.class));
            e2 = g;
        }
        else {
            final org.koin.core.definition.d a3 = org.koin.core.definition.d.a;
            final org.koin.core.scope.c l = y.L();
            if (l != null) {
                e = l.e();
            }
            m0 = new p<org.koin.core.scope.a, org.koin.core.parameter.a, T>() {
                final /* synthetic */ Object G;
                
                public final T a(@e final a a, @e final org.koin.core.parameter.a a2) {
                    k0.q((Object)a, "$this$createScoped");
                    k0.q((Object)a2, "it");
                    return (T)this.G;
                }
            };
            final org.koin.core.definition.e i = org.koin.core.definition.e.I;
            k0.y(4, "T");
            b = new org.koin.core.definition.b<Object>(a, e, (d<?>)k1.d((Class)Object.class));
            e2 = i;
        }
        b.p((n6.p<? super org.koin.core.scope.a, ? super org.koin.core.parameter.a, ?>)m0);
        b.r(e2);
        if (c != null) {
            b.m().addAll(c);
        }
        y.A().t(b);
    }
    
    @h
    private final <T> T k() {
        return (T)o(this, null, null, 3, null);
    }
    
    @h
    private final <T> T m(final l7.a a) {
        return (T)o(this, a, null, 2, null);
    }
    
    @h
    private final <T> T n(final l7.a a, final n6.a<org.koin.core.parameter.a> a2) {
        final org.koin.core.scope.a y = this.y();
        k0.y(4, "T");
        return (T)y.t((d<?>)k1.d((Class)Object.class), a, a2);
    }
    
    @h
    static /* synthetic */ Object o(final a a, l7.a a2, n6.a a3, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            a2 = null;
        }
        if ((n & 0x2) != 0x0) {
            a3 = null;
        }
        final org.koin.core.scope.a y = a.y();
        k0.y(4, "T");
        return y.t((d<?>)k1.d((Class)Object.class), a2, (n6.a<org.koin.core.parameter.a>)a3);
    }
    
    private final <T> List<T> p() {
        final org.koin.core.scope.a y = this.y();
        k0.y(4, "T");
        return (List<T>)y.z((d<?>)k1.d((Class)Object.class));
    }
    
    @h
    private final <T> T r() {
        return (T)u(this, null, null, 3, null);
    }
    
    @h
    private final <T> T s(final l7.a a) {
        return (T)u(this, a, null, 2, null);
    }
    
    @h
    private final <T> T t(final l7.a a, final n6.a<org.koin.core.parameter.a> a2) {
        final org.koin.core.scope.a y = this.y();
        Object t;
        try {
            k0.y(4, "T?");
            t = y.t((d<?>)k1.d((Class)Object.class), a, a2);
        }
        catch (Exception ex) {
            final org.koin.core.logger.c b = org.koin.core.b.c.b();
            final StringBuilder sb = new StringBuilder();
            sb.append("Can't get instance for ");
            k0.y(4, "T?");
            sb.append(org.koin.ext.a.a((d<?>)k1.d((Class)Object.class)));
            b.b(sb.toString());
            t = null;
        }
        return (T)t;
    }
    
    @h
    static /* synthetic */ Object u(final a a, l7.a a2, n6.a a3, final int n, Object o) {
        o = null;
        if ((n & 0x1) != 0x0) {
            a2 = null;
        }
        if ((n & 0x2) != 0x0) {
            a3 = null;
        }
        final org.koin.core.scope.a y = a.y();
        Object t;
        try {
            k0.y(4, "T?");
            t = y.t((d<?>)k1.d((Class)Object.class), a2, (n6.a<org.koin.core.parameter.a>)a3);
        }
        catch (Exception ex) {
            final org.koin.core.logger.c b = org.koin.core.b.c.b();
            final StringBuilder sb = new StringBuilder();
            sb.append("Can't get instance for ");
            k0.y(4, "T?");
            sb.append(org.koin.ext.a.a((d<?>)k1.d((Class)Object.class)));
            b.b(sb.toString());
            t = o;
        }
        return t;
    }
    
    @f
    public final org.koin.core.scope.a A(@e final String s) {
        k0.q((Object)s, "scopeId");
        return this.a.i(s);
    }
    
    @e
    public final c B() {
        return this.a;
    }
    
    public final <T> void K(@e final String s, @e final T t) {
        k0.q((Object)s, "key");
        k0.q((Object)t, "value");
        this.b.h(s, t);
    }
    
    public final <S> S a(@e final d<?> d, @e final d<?> d2, @f final n6.a<org.koin.core.parameter.a> a) {
        k0.q((Object)d, "primaryType");
        k0.q((Object)d2, "secondaryType");
        return this.c.b(d, d2, a);
    }
    
    public final void e() {
        this.a.a();
        this.c.e();
        this.b.a();
    }
    
    public final void f() {
        this.c.k();
    }
    
    @e
    public final org.koin.core.scope.a g(@e final String str, @e final l7.a obj) {
        k0.q((Object)str, "scopeId");
        k0.q((Object)obj, "qualifier");
        final org.koin.core.b.a c = org.koin.core.b.c;
        if (c.b().e(org.koin.core.logger.b.G)) {
            final org.koin.core.logger.c b = c.b();
            final StringBuilder sb = new StringBuilder();
            sb.append("!- create scope - id:");
            sb.append(str);
            sb.append(" q:");
            sb.append(obj);
            b.a(sb.toString());
        }
        return this.a.c(this, str, obj);
    }
    
    public final void j(@e final String s) {
        k0.q((Object)s, "scopeId");
        this.a.e(s);
    }
    
    public final <T> T l(@e final d<?> d, @f final l7.a a, @f final n6.a<org.koin.core.parameter.a> a2) {
        k0.q((Object)d, "clazz");
        return this.c.t(d, a, a2);
    }
    
    @e
    public final org.koin.core.scope.a q(@e final String s, @e final l7.a a) {
        k0.q((Object)s, "scopeId");
        k0.q((Object)a, "qualifier");
        final org.koin.core.scope.a i = this.a.i(s);
        org.koin.core.scope.a g;
        if (i != null) {
            g = i;
        }
        else {
            g = this.g(s, a);
        }
        return g;
    }
    
    @f
    public final <T> T v(@e final String s) {
        k0.q((Object)s, "key");
        return this.b.b(s);
    }
    
    public final <T> T w(@e final String s, T t) {
        k0.q((Object)s, "key");
        final T b = this.b.b(s);
        if (b != null) {
            t = b;
        }
        return t;
    }
    
    @e
    public final b x() {
        return this.b;
    }
    
    @e
    public final org.koin.core.scope.a y() {
        return this.c;
    }
    
    @e
    public final org.koin.core.scope.a z(@e final String s) {
        k0.q((Object)s, "scopeId");
        return this.a.h(s);
    }
}
