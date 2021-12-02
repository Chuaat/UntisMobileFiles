// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.b$a;
import java.util.Iterator;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h$c;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import java.util.List;
import n6.a;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.storage.i;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.e;
import kotlin.reflect.o;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;

public final class r extends j implements m0
{
    static final /* synthetic */ o<Object>[] M;
    @e
    private final x I;
    @e
    private final kotlin.reflect.jvm.internal.impl.name.b J;
    @e
    private final i K;
    @e
    private final h L;
    
    static {
        M = new o[] { k1.r(new f1(k1.d(r.class), "fragments", "getFragments()Ljava/util/List;")) };
    }
    
    public r(@e final x i, @e final kotlin.reflect.jvm.internal.impl.name.b j, @e final n n) {
        k0.p(i, "module");
        k0.p(j, "fqName");
        k0.p(n, "storageManager");
        super(g.r.b(), j.h());
        this.I = i;
        this.J = j;
        this.K = n.g((a)new a<List<? extends h0>>() {
            final /* synthetic */ r G;
            
            @e
            public final List<h0> a() {
                return kotlin.reflect.jvm.internal.impl.descriptors.k0.b(this.G.G0().Q0(), this.G.f());
            }
        });
        this.L = (h)new kotlin.reflect.jvm.internal.impl.resolve.scopes.g(n, (a)new a<h>() {
            final /* synthetic */ r G;
            
            @e
            public final h a() {
                Object o;
                if (this.G.N().isEmpty()) {
                    o = h$c.b;
                }
                else {
                    final List<h0> n = this.G.N();
                    final ArrayList list = new ArrayList<g0>(v.Y((Iterable<?>)n, 10));
                    final Iterator<Object> iterator = n.iterator();
                    while (iterator.hasNext()) {
                        list.add(iterator.next().x());
                    }
                    final List<g0> r4 = v.r4((Collection<? extends g0>)list, new g0(this.G.G0(), this.G.f()));
                    final b$a d = kotlin.reflect.jvm.internal.impl.resolve.scopes.b.d;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("package view scope for ");
                    sb.append(this.G.f());
                    sb.append(" in ");
                    sb.append(this.G.G0().getName());
                    o = d.a(sb.toString(), (Iterable)r4);
                }
                return (h)o;
            }
        });
    }
    
    @e
    public x G0() {
        return this.I;
    }
    
    @e
    @Override
    public List<h0> N() {
        return (List<h0>)kotlin.reflect.jvm.internal.impl.storage.m.a(this.K, (Object)this, (o)r.M[0]);
    }
    
    @f
    public m0 O() {
        m0 r;
        if (this.f().d()) {
            r = null;
        }
        else {
            final x g0 = this.G0();
            final kotlin.reflect.jvm.internal.impl.name.b e = this.f().e();
            k0.o(e, "fqName.parent()");
            r = g0.R(e);
        }
        return r;
    }
    
    @Override
    public <R, D> R P(@e final kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> o, final D n) {
        k0.p(o, "visitor");
        return o.c(this, n);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        m0 m0;
        if (o instanceof m0) {
            m0 = (m0)o;
        }
        else {
            m0 = null;
        }
        final boolean b = false;
        if (m0 == null) {
            return false;
        }
        boolean b2 = b;
        if (k0.g(this.f(), m0.f())) {
            b2 = b;
            if (k0.g(this.G0(), m0.y0())) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.name.b f() {
        return this.J;
    }
    
    @Override
    public int hashCode() {
        return this.G0().hashCode() * 31 + this.f().hashCode();
    }
    
    @Override
    public boolean isEmpty() {
        return m0.a.a(this);
    }
    
    @e
    @Override
    public h x() {
        return this.L;
    }
}
