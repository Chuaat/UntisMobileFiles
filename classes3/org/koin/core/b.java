// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core;

import kotlin.collections.m;
import java.util.Map;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.List;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import m6.h;
import m6.k;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import org.koin.core.logger.c;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b%\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000f\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003J\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\nJ\u001a\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\fJ\u0010\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0012\u001a\u00020\u0000J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013J\u0012\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007J\u0006\u0010\u0019\u001a\u00020\u0000J\u0006\u0010\u001a\u001a\u00020\u0005J!\u0010\u001c\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u001b\"\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\nR\u0019\u0010$\u001a\u00020\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'" }, d2 = { "Lorg/koin/core/b;", "", "", "Lorg/koin/core/module/a;", "modules", "Lkotlin/j2;", "l", "k", "()V", "o", "", "n", "", "", "values", "s", "fileName", "h", "g", "Lorg/koin/core/logger/c;", "logger", "m", "Lorg/koin/core/logger/b;", "level", "q", "f", "d", "", "u", "([Lorg/koin/core/module/a;)Lorg/koin/core/b;", "t", "Lorg/koin/core/a;", "a", "Lorg/koin/core/a;", "j", "()Lorg/koin/core/a;", "koin", "<init>", "c", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class b
{
    @e
    private static c b;
    public static final a c;
    @e
    private final org.koin.core.a a;
    
    static {
        c = new a(null);
        org.koin.core.b.b = new org.koin.core.logger.a();
    }
    
    private b() {
        this.a = new org.koin.core.a();
    }
    
    public static final /* synthetic */ c a() {
        return org.koin.core.b.b;
    }
    
    public static final /* synthetic */ void c(final c b) {
        b.b = b;
    }
    
    @k
    @e
    public static final b e() {
        return org.koin.core.b.c.a();
    }
    
    private final void l(final Iterable<org.koin.core.module.a> iterable) {
        this.a.y().A().m(iterable);
        this.a.B().l(iterable);
    }
    
    @h
    @e
    public static /* synthetic */ b r(final b b, org.koin.core.logger.b h, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            h = b.H;
        }
        return b.q(h);
    }
    
    public final void d() {
        synchronized (this) {
            this.a.e();
            if (org.koin.core.b.b.e(org.koin.core.logger.b.H)) {
                org.koin.core.b.b.d("stopped");
            }
            final j2 a = j2.a;
        }
    }
    
    @e
    public final b f() {
        if (org.koin.core.b.b.e(org.koin.core.logger.b.G)) {
            final double b = n7.a.b((n6.a<j2>)new n6.a<j2>() {
                final /* synthetic */ b G;
                
                public final void invoke() {
                    this.G.j().f();
                }
            });
            final c b2 = org.koin.core.b.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("instances started in ");
            sb.append(b);
            sb.append(" ms");
            b2.a(sb.toString());
        }
        else {
            this.a.f();
        }
        return this;
    }
    
    @e
    public final b g() {
        this.a.x().c();
        return this;
    }
    
    @e
    public final b h(@e final String s) {
        k0.q((Object)s, "fileName");
        this.a.x().d(s);
        return this;
    }
    
    @e
    public final org.koin.core.a j() {
        return this.a;
    }
    
    public final void k() {
        this.a.B().k(this.a);
    }
    
    @e
    public final b m(@e final c b) {
        k0.q((Object)b, "logger");
        b.b = b;
        return this;
    }
    
    @e
    public final b n(@e final List<org.koin.core.module.a> list) {
        k0.q((Object)list, "modules");
        if (org.koin.core.b.b.e(org.koin.core.logger.b.H)) {
            final double b = n7.a.b((n6.a<j2>)new n6.a<j2>() {
                public final void invoke() {
                    org.koin.core.b.this.l(list);
                }
            });
            final int size = this.a.y().A().j().size();
            final Collection<org.koin.core.scope.c> j = this.a.B().j();
            final ArrayList list2 = new ArrayList<Integer>(v.Y((Iterable)j, 10));
            final Iterator<Object> iterator = j.iterator();
            while (iterator.hasNext()) {
                list2.add(Integer.valueOf(iterator.next().d().size()));
            }
            final int p = v.p5((Iterable)list2);
            final c b2 = org.koin.core.b.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("total ");
            sb.append(size + p);
            sb.append(" registered definitions");
            b2.d(sb.toString());
            final c b3 = org.koin.core.b.b;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("load modules in ");
            sb2.append(b);
            sb2.append(" ms");
            b3.d(sb2.toString());
        }
        else {
            this.l(list);
        }
        return this;
    }
    
    @e
    public final b o(@e final org.koin.core.module.a a) {
        k0.q((Object)a, "modules");
        return this.n(v.k((Object)a));
    }
    
    @h
    @e
    public final b p() {
        return r(this, null, 1, null);
    }
    
    @h
    @e
    public final b q(@e final org.koin.core.logger.b b) {
        k0.q((Object)b, "level");
        return this.m(new org.koin.core.logger.e(b));
    }
    
    @e
    public final b s(@e final Map<String, ?> map) {
        k0.q((Object)map, "values");
        this.a.x().f(map);
        return this;
    }
    
    @e
    public final b t(@e final List<org.koin.core.module.a> list) {
        k0.q((Object)list, "modules");
        this.a.y().A().C(list);
        this.a.B().q(list);
        return this;
    }
    
    @e
    public final b u(@e final org.koin.core.module.a... array) {
        k0.q((Object)array, "modules");
        return this.t(m.ey((Object[])array));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "org/koin/core/b$a", "", "Lorg/koin/core/b;", "a", "Lorg/koin/core/logger/c;", "logger", "Lorg/koin/core/logger/c;", "b", "()Lorg/koin/core/logger/c;", "c", "(Lorg/koin/core/logger/c;)V", "<init>", "()V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final b a() {
            final b b = new b(null);
            b.k();
            return b;
        }
        
        @e
        public final c b() {
            return org.koin.core.b.a();
        }
        
        public final void c(@e final c c) {
            k0.q((Object)c, "<set-?>");
            org.koin.core.b.c(c);
        }
    }
}
