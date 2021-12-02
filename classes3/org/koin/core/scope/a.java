// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.scope;

import kotlin.collections.v;
import kotlin.s0;
import java.util.HashSet;
import java.util.Set;
import kotlin.j2;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Collection;
import n6.p;
import java.util.List;
import kotlin.d0;
import kotlin.jvm.internal.m0;
import kotlin.b0;
import kotlin.reflect.d;
import kotlin.jvm.internal.k1;
import m6.h;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import java.util.ArrayList;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\u0010B\u001a\u00060'j\u0002`(\u0012\b\b\u0002\u0010C\u001a\u00020>\u0012\u0006\u0010D\u001a\u00020%¢\u0006\u0004\bc\u0010dJ;\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\n\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0087\bJ=\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\n\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0087\bJ<\u0010\u000b\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\n\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0087\b¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\n\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0087\b¢\u0006\u0004\b\r\u0010\fJA\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002JB\u0010\u0018\u001a\u00020\u0017\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0014\u001a\u00028\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0018\u00010\u0015H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\bJ8\u0010\u001c\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u001b\u0018\u0001\"\u0006\b\u0001\u0010\n\u0018\u00012\u0016\b\n\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0086\b¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\u001e\u0010\u001fJE\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030 2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0017H\u0000¢\u0006\u0004\b#\u0010$J\u0006\u0010&\u001a\u00020%J\u0012\u0010*\u001a\u00020\u00002\n\u0010)\u001a\u00060'j\u0002`(J\u000e\u0010-\u001a\u00020\u00172\u0006\u0010,\u001a\u00020+J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00022\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eJA\u00101\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\n\u0010/\u001a\u0006\u0012\u0002\b\u00030\u000e2\n\u00100\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b1\u00102J#\u00105\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u00103\u001a\u00020'2\u0006\u00104\u001a\u00028\u0000¢\u0006\u0004\b5\u00106J\u001d\u00107\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u00103\u001a\u00020'¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u00103\u001a\u00020'¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\u0017H\u0000¢\u0006\u0004\b:\u0010$J\u0006\u0010;\u001a\u00020\u0017J\b\u0010<\u001a\u00020'H\u0016J\r\u0010=\u001a\u00060'j\u0002`(H\u00c6\u0003J\t\u0010?\u001a\u00020>H\u00c6\u0003J\u0010\u0010@\u001a\u00020%H\u00c0\u0003¢\u0006\u0004\b@\u0010AJ+\u0010E\u001a\u00020\u00002\f\b\u0002\u0010B\u001a\u00060'j\u0002`(2\b\b\u0002\u0010C\u001a\u00020>2\b\b\u0002\u0010D\u001a\u00020%H\u00c6\u0001J\t\u0010G\u001a\u00020FH\u00d6\u0001J\u0013\u0010I\u001a\u00020>2\b\u0010H\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010K\u001a\u00020J8\u0006@\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR&\u0010R\u001a\u0012\u0012\u0004\u0012\u00020+0Oj\b\u0012\u0004\u0012\u00020+`P8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010QR$\u0010Y\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0019\u0010C\u001a\u00020>8\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010Z\u001a\u0004\b[\u0010\\R\u001c\u0010D\u001a\u00020%8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010]\u001a\u0004\b^\u0010AR\u001d\u0010B\u001a\u00060'j\u0002`(8\u0006@\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b¨\u0006e" }, d2 = { "Lorg/koin/core/scope/a;", "", "T", "Ll7/a;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/core/parameter/a;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/b0;", "P", "v", "(Ll7/a;Ln6/a;)Ljava/lang/Object;", "F", "Lkotlin/reflect/d;", "clazz", "X", "(Ll7/a;Lkotlin/reflect/d;Ln6/a;)Ljava/lang/Object;", "Lorg/koin/core/definition/b;", "o", "instance", "", "secondaryTypes", "Lkotlin/j2;", "l", "(Ljava/lang/Object;Ll7/a;Ljava/util/List;)V", "y", "S", "c", "(Ln6/a;)Ljava/lang/Object;", "t", "(Lkotlin/reflect/d;Ll7/a;Ln6/a;)Ljava/lang/Object;", "Ljava/lang/Class;", "s", "(Ljava/lang/Class;Ll7/a;Ln6/a;)Ljava/lang/Object;", "k", "()V", "Lorg/koin/core/a;", "C", "", "Lorg/koin/core/scope/ScopeID;", "scopeID", "K", "Lorg/koin/core/scope/b;", "callback", "W", "z", "primaryType", "secondaryType", "b", "(Lkotlin/reflect/d;Lkotlin/reflect/d;Ln6/a;)Ljava/lang/Object;", "key", "defaultValue", "I", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "J", "(Ljava/lang/String;)Ljava/lang/Object;", "H", "n", "e", "toString", "f", "", "g", "h", "()Lorg/koin/core/a;", "id", "isRoot", "_koin", "i", "", "hashCode", "other", "equals", "Lm7/a;", "beanRegistry", "Lm7/a;", "A", "()Lm7/a;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "callbacks", "Lorg/koin/core/scope/c;", "Lorg/koin/core/scope/c;", "L", "()Lorg/koin/core/scope/c;", "Y", "(Lorg/koin/core/scope/c;)V", "scopeDefinition", "Z", "V", "()Z", "Lorg/koin/core/a;", "M", "d", "Ljava/lang/String;", "B", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ZLorg/koin/core/a;)V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class a
{
    @e
    private final m7.a a;
    @f
    private c b;
    private final ArrayList<b> c;
    @e
    private final String d;
    private final boolean e;
    @e
    private final org.koin.core.a f;
    
    public a(@e final String d, final boolean e, @e final org.koin.core.a f) {
        k0.q((Object)d, "id");
        k0.q((Object)f, "_koin");
        this.d = d;
        this.e = e;
        this.f = f;
        this.a = new m7.a();
        this.c = new ArrayList<b>();
    }
    
    @h
    private final <T> T D() {
        return (T)G(this, null, null, 3, null);
    }
    
    @h
    private final <T> T E(final l7.a a) {
        return (T)G(this, a, null, 2, null);
    }
    
    @h
    private final <T> T F(final l7.a a, final n6.a<org.koin.core.parameter.a> a2) {
        T t;
        try {
            k0.y(4, "T");
            t = this.t((d<?>)k1.d((Class)Object.class), a, a2);
        }
        catch (Exception ex) {
            final org.koin.core.logger.c b = org.koin.core.b.c.b();
            final StringBuilder sb = new StringBuilder();
            sb.append("Can't get instance for ");
            k0.y(4, "T");
            sb.append(org.koin.ext.a.a((d<?>)k1.d((Class)Object.class)));
            b.b(sb.toString());
            t = null;
        }
        return t;
    }
    
    @h
    static /* synthetic */ Object G(final a a, l7.a a2, n6.a a3, final int n, Object o) {
        o = null;
        if ((n & 0x1) != 0x0) {
            a2 = null;
        }
        if ((n & 0x2) != 0x0) {
            a3 = null;
        }
        Object t;
        try {
            k0.y(4, "T");
            t = a.t((d<?>)k1.d((Class)Object.class), a2, (n6.a<org.koin.core.parameter.a>)a3);
        }
        catch (Exception ex) {
            final org.koin.core.logger.c b = org.koin.core.b.c.b();
            final StringBuilder sb = new StringBuilder();
            sb.append("Can't get instance for ");
            k0.y(4, "T");
            sb.append(org.koin.ext.a.a((d<?>)k1.d((Class)Object.class)));
            b.b(sb.toString());
            t = o;
        }
        return t;
    }
    
    @h
    private final <T> b0<T> N() {
        return (b0<T>)Q(this, null, null, 3, null);
    }
    
    @h
    private final <T> b0<T> O(final l7.a a) {
        return (b0<T>)Q(this, a, null, 2, null);
    }
    
    @h
    private final <T> b0<T> P(final l7.a a, final n6.a<org.koin.core.parameter.a> a2) {
        k0.w();
        return (b0<T>)d0.c((n6.a)new n6.a<T>() {
            final /* synthetic */ a G;
            final /* synthetic */ l7.a H;
            final /* synthetic */ n6.a I;
            
            public final T invoke() {
                final a g = this.G;
                final l7.a h = this.H;
                final n6.a i = this.I;
                k0.y(4, "T");
                return (T)g.t((d<?>)k1.d((Class)Object.class), h, (n6.a<org.koin.core.parameter.a>)i);
            }
        });
    }
    
    @h
    static /* synthetic */ b0 Q(final a a, l7.a a2, n6.a a3, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            a2 = null;
        }
        if ((n & 0x2) != 0x0) {
            a3 = null;
        }
        k0.w();
        return d0.c((n6.a)new n6.a<T>(a3) {
            final /* synthetic */ a G;
            final /* synthetic */ l7.a H;
            final /* synthetic */ n6.a I;
            
            public final T invoke() {
                final a g = this.G;
                final l7.a h = a;
                final n6.a i = a2;
                k0.y(4, "T");
                return (T)g.t((d<?>)k1.d((Class)Object.class), h, (n6.a<org.koin.core.parameter.a>)i);
            }
        });
    }
    
    @h
    private final <T> b0<T> R() {
        return (b0<T>)U(this, null, null, 3, null);
    }
    
    @h
    private final <T> b0<T> S(final l7.a a) {
        return (b0<T>)U(this, a, null, 2, null);
    }
    
    @h
    private final <T> b0<T> T(final l7.a a, final n6.a<org.koin.core.parameter.a> a2) {
        k0.w();
        return (b0<T>)d0.c((n6.a)new n6.a<T>() {
            final /* synthetic */ a G;
            final /* synthetic */ l7.a H;
            final /* synthetic */ n6.a I;
            
            @f
            public final T invoke() {
                final a g = this.G;
                final l7.a h = this.H;
                final n6.a i = this.I;
                Object t;
                try {
                    k0.y(4, "T");
                    t = g.t((d<?>)k1.d((Class)Object.class), h, (n6.a<org.koin.core.parameter.a>)i);
                }
                catch (Exception ex) {
                    final org.koin.core.logger.c b = org.koin.core.b.c.b();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't get instance for ");
                    k0.y(4, "T");
                    sb.append(org.koin.ext.a.a((d<?>)k1.d((Class)Object.class)));
                    b.b(sb.toString());
                    t = null;
                }
                return (T)t;
            }
        });
    }
    
    @h
    static /* synthetic */ b0 U(final a a, l7.a a2, n6.a a3, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            a2 = null;
        }
        if ((n & 0x2) != 0x0) {
            a3 = null;
        }
        k0.w();
        return d0.c((n6.a)new n6.a<T>(a3) {
            final /* synthetic */ a G;
            final /* synthetic */ l7.a H;
            final /* synthetic */ n6.a I;
            
            @f
            public final T invoke() {
                final a g = this.G;
                final l7.a h = a;
                final n6.a i = a2;
                Object t;
                try {
                    k0.y(4, "T");
                    t = g.t((d<?>)k1.d((Class)Object.class), h, (n6.a<org.koin.core.parameter.a>)i);
                }
                catch (Exception ex) {
                    final org.koin.core.logger.c b = org.koin.core.b.c.b();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't get instance for ");
                    k0.y(4, "T");
                    sb.append(org.koin.ext.a.a((d<?>)k1.d((Class)Object.class)));
                    b.b(sb.toString());
                    t = null;
                }
                return (T)t;
            }
        });
    }
    
    private final <T> T X(final l7.a a, final d<?> d, final n6.a<org.koin.core.parameter.a> a2) {
        return this.o(a, d).o(new org.koin.core.instance.c(this.f, this, a2));
    }
    
    private final <S, P> S c(final n6.a<org.koin.core.parameter.a> a) {
        k0.y(4, "S");
        final d d = k1.d((Class)Object.class);
        k0.y(4, "P");
        return (S)this.b((d<?>)k1.d((Class)Object.class), (d<?>)d, a);
    }
    
    private final <T> void l(final T t, final l7.a a, final List<? extends d<?>> c) {
        final boolean v = this.V();
        l7.a e = null;
        Object o;
        org.koin.core.definition.e e2;
        org.koin.core.definition.b<?> b2;
        if (v) {
            final org.koin.core.definition.d a2 = org.koin.core.definition.d.a;
            o = new p<a, org.koin.core.parameter.a, T>() {
                final /* synthetic */ Object G;
                
                public final T a(@e final a a, @e final org.koin.core.parameter.a a2) {
                    k0.q((Object)a, "$this$createSingle");
                    k0.q((Object)a2, "it");
                    return (T)this.G;
                }
            };
            final org.koin.core.definition.e g = org.koin.core.definition.e.G;
            k0.y(4, "T");
            final org.koin.core.definition.b<Object> b = new org.koin.core.definition.b<Object>(a, null, (d<?>)k1.d((Class)Object.class));
            e2 = g;
            b2 = b;
        }
        else {
            final org.koin.core.definition.d a3 = org.koin.core.definition.d.a;
            final c l = this.L();
            if (l != null) {
                e = l.e();
            }
            final p<a, org.koin.core.parameter.a, T> p3 = (p<a, org.koin.core.parameter.a, T>)new p<a, org.koin.core.parameter.a, T>() {
                final /* synthetic */ Object G;
                
                public final T a(@e final a a, @e final org.koin.core.parameter.a a2) {
                    k0.q((Object)a, "$this$createScoped");
                    k0.q((Object)a2, "it");
                    return (T)this.G;
                }
            };
            final org.koin.core.definition.e i = org.koin.core.definition.e.I;
            k0.y(4, "T");
            final org.koin.core.definition.b b3 = new org.koin.core.definition.b<Object>(a, e, (d<?>)k1.d((Class)Object.class));
            o = p3;
            b2 = b3;
            e2 = i;
        }
        b2.p((n6.p<? super a, ? super org.koin.core.parameter.a, ?>)o);
        b2.r(e2);
        if (c != null) {
            b2.m().addAll(c);
        }
        this.A().t(b2);
    }
    
    private final org.koin.core.definition.b<?> o(final l7.a a, final d<?> d) {
        final org.koin.core.definition.b<?> e = this.a.e(a, d);
        org.koin.core.definition.b<?> o;
        if (e != null) {
            o = e;
        }
        else {
            if (this.e) {
                final StringBuilder sb = new StringBuilder();
                sb.append("No definition found for '");
                sb.append(org.koin.ext.a.a(d));
                sb.append("' has been found. Check your module definitions.");
                throw new k7.f(sb.toString());
            }
            o = this.f.y().o(a, d);
        }
        return o;
    }
    
    @h
    private final <T> T p() {
        return (T)x(this, null, null, 3, null);
    }
    
    @h
    private final <T> T u(final l7.a a) {
        return (T)x(this, a, null, 2, null);
    }
    
    @h
    private final <T> T v(final l7.a a, final n6.a<org.koin.core.parameter.a> a2) {
        k0.y(4, "T");
        return this.t((d<?>)k1.d((Class)Object.class), a, a2);
    }
    
    @h
    public static /* synthetic */ Object w(final a a, final Class clazz, l7.a a2, n6.a a3, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            a2 = null;
        }
        if ((n & 0x4) != 0x0) {
            a3 = null;
        }
        return a.s(clazz, a2, (n6.a<org.koin.core.parameter.a>)a3);
    }
    
    @h
    static /* synthetic */ Object x(final a a, l7.a a2, n6.a a3, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            a2 = null;
        }
        if ((n & 0x2) != 0x0) {
            a3 = null;
        }
        k0.y(4, "T");
        return a.t((d<?>)k1.d((Class)Object.class), a2, (n6.a<org.koin.core.parameter.a>)a3);
    }
    
    private final <T> List<T> y() {
        k0.y(4, "T");
        return this.z((d<?>)k1.d((Class)Object.class));
    }
    
    @e
    public final m7.a A() {
        return this.a;
    }
    
    @e
    public final String B() {
        return this.d;
    }
    
    @e
    public final org.koin.core.a C() {
        return this.f;
    }
    
    public final <T> T H(@e final String str) {
        k0.q((Object)str, "key");
        final T v = this.f.v(str);
        if (v != null) {
            return v;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Property '");
        sb.append(str);
        sb.append("' not found");
        throw new k7.e(sb.toString());
    }
    
    public final <T> T I(@e final String s, final T t) {
        k0.q((Object)s, "key");
        return this.f.w(s, t);
    }
    
    @f
    public final <T> T J(@e final String s) {
        k0.q((Object)s, "key");
        return this.f.v(s);
    }
    
    @e
    public final a K(@e final String s) {
        k0.q((Object)s, "scopeID");
        return this.C().z(s);
    }
    
    @f
    public final c L() {
        return this.b;
    }
    
    @e
    public final org.koin.core.a M() {
        return this.f;
    }
    
    public final boolean V() {
        return this.e;
    }
    
    public final void W(@e final b b) {
        k0.q((Object)b, "callback");
        this.c.add(b);
    }
    
    public final void Y(@f final c b) {
        this.b = b;
    }
    
    public final <S> S b(@e final d<?> d, @e final d<?> o, @f final n6.a<org.koin.core.parameter.a> a) {
        k0.q((Object)d, "primaryType");
        k0.q((Object)o, "secondaryType");
        for (final org.koin.core.definition.b b : this.a.j()) {
            if (k0.g((Object)b.i(), (Object)d) && b.m().contains(o)) {
                final org.koin.core.instance.a d2 = b.d();
                if (d2 == null) {
                    k0.L();
                }
                return (S)d2.c(new org.koin.core.instance.c(this.C(), this, a));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
    
    public final void e() {
        synchronized (this) {
            final org.koin.core.b.a c = org.koin.core.b.c;
            if (c.b().e(org.koin.core.logger.b.G)) {
                final org.koin.core.logger.c b = c.b();
                final StringBuilder sb = new StringBuilder();
                sb.append("closing scope:'");
                sb.append(this.d);
                sb.append('\'');
                b.d(sb.toString());
            }
            final Iterator<b> iterator = (Iterator<b>)this.c.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(this);
            }
            this.c.clear();
            final c b2 = this.b;
            if (b2 != null) {
                b2.f(this);
            }
            this.a.b();
            this.f.j(this.d);
            final j2 a = j2.a;
        }
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof a) {
                final a a = (a)o;
                if (k0.g((Object)this.d, (Object)a.d) && this.e == a.e && k0.g((Object)this.f, (Object)a.f)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @e
    public final String f() {
        return this.d;
    }
    
    public final boolean g() {
        return this.e;
    }
    
    @e
    public final org.koin.core.a h() {
        return this.f;
    }
    
    @Override
    public int hashCode() {
        final String d = this.d;
        int hashCode = 0;
        int hashCode2;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        final org.koin.core.a f = this.f;
        if (f != null) {
            hashCode = f.hashCode();
        }
        return (hashCode2 * 31 + e) * 31 + hashCode;
    }
    
    @e
    public final a i(@e final String s, final boolean b, @e final org.koin.core.a a) {
        k0.q((Object)s, "id");
        k0.q((Object)a, "_koin");
        return new a(s, b, a);
    }
    
    public final void k() {
        if (this.e) {
            final Set<org.koin.core.definition.b<?>> d = this.a.d();
            if (d.isEmpty() ^ true) {
                final Iterator<org.koin.core.definition.b> iterator = d.iterator();
                while (iterator.hasNext()) {
                    iterator.next().o(new org.koin.core.instance.c(this.f, this, null, 4, null));
                }
            }
        }
    }
    
    public final void n() {
        final c b = this.b;
        if (b != null) {
            final HashSet<org.koin.core.definition.b<?>> d = b.d();
            if (d != null) {
                for (final org.koin.core.definition.b<?> b2 : d) {
                    this.a.t(b2);
                    b2.b();
                }
            }
        }
    }
    
    @h
    public final <T> T q(@e final Class<?> clazz) {
        return (T)w(this, clazz, null, null, 6, null);
    }
    
    @h
    public final <T> T r(@e final Class<?> clazz, @f final l7.a a) {
        return (T)w(this, clazz, a, null, 4, null);
    }
    
    @h
    public final <T> T s(@e final Class<?> clazz, @f final l7.a a, @f final n6.a<org.koin.core.parameter.a> a2) {
        k0.q((Object)clazz, "clazz");
        synchronized (this) {
            final d g = m6.a.g((Class)clazz);
            final org.koin.core.b.a c = org.koin.core.b.c;
            if (c.b().e(org.koin.core.logger.b.G)) {
                final org.koin.core.logger.c b = c.b();
                final StringBuilder sb = new StringBuilder();
                sb.append("+- get '");
                sb.append(org.koin.ext.a.a((d<?>)g));
                sb.append('\'');
                b.a(sb.toString());
                final kotlin.s0<Object, Double> a3 = n7.a.a((n6.a<?>)new n6.a<T>() {
                    public final T invoke() {
                        return (T)org.koin.core.scope.a.this.X(a, (d<?>)g, a2);
                    }
                });
                final Object a4 = a3.a();
                final double doubleValue = ((Number)a3.b()).doubleValue();
                final org.koin.core.logger.c b2 = c.b();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("+- got '");
                sb2.append(org.koin.ext.a.a((d<?>)g));
                sb2.append("' in ");
                sb2.append(doubleValue);
                sb2.append(" ms");
                b2.a(sb2.toString());
                return (T)a4;
            }
            return (T)this.X(a, (d<?>)g, a2);
        }
    }
    
    public final <T> T t(@e final d<?> d, @f final l7.a a, @f final n6.a<org.koin.core.parameter.a> a2) {
        k0.q((Object)d, "clazz");
        synchronized (this) {
            final org.koin.core.b.a c = org.koin.core.b.c;
            if (c.b().e(org.koin.core.logger.b.G)) {
                final org.koin.core.logger.c b = c.b();
                final StringBuilder sb = new StringBuilder();
                sb.append("+- get '");
                sb.append(org.koin.ext.a.a(d));
                sb.append('\'');
                b.a(sb.toString());
                final kotlin.s0<Object, Double> a3 = n7.a.a((n6.a<?>)new n6.a<T>() {
                    public final T invoke() {
                        return (T)org.koin.core.scope.a.this.X(a, d, a2);
                    }
                });
                final Object a4 = a3.a();
                final double doubleValue = ((Number)a3.b()).doubleValue();
                final org.koin.core.logger.c b2 = c.b();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("+- got '");
                sb2.append(org.koin.ext.a.a(d));
                sb2.append("' in ");
                sb2.append(doubleValue);
                sb2.append(" ms");
                b2.a(sb2.toString());
                return (T)a4;
            }
            return this.X(a, d, a2);
        }
    }
    
    @e
    @Override
    public String toString() {
        final c b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append(",set:'");
        l7.a e;
        if (b != null) {
            e = b.e();
        }
        else {
            e = null;
        }
        sb.append(e);
        sb.append('\'');
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Scope[id:'");
        sb2.append(this.d);
        sb2.append('\'');
        sb2.append(string);
        sb2.append(']');
        return sb2.toString();
    }
    
    @e
    public final <T> List<T> z(@e final d<?> d) {
        k0.q((Object)d, "clazz");
        final List<org.koin.core.definition.b<?>> l = this.a.l(d);
        final ArrayList list = new ArrayList<T>(v.Y((Iterable)l, 10));
        final Iterator<org.koin.core.definition.b> iterator = l.iterator();
        while (iterator.hasNext()) {
            final org.koin.core.instance.a d2 = iterator.next().d();
            if (d2 == null) {
                k0.L();
            }
            list.add((T)d2.c(new org.koin.core.instance.c(this.f, this, null, 4, null)));
        }
        return (List<T>)list;
    }
}
