// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.m0;
import kotlin.d0;
import kotlin.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.n;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.p;
import m6.k;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.c0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;

public class k0 extends l0 implements e1
{
    @e
    public static final a S;
    private final int M;
    private final boolean N;
    private final boolean O;
    private final boolean P;
    @f
    private final c0 Q;
    @e
    private final e1 R;
    
    static {
        S = new a(null);
    }
    
    public k0(@e final kotlin.reflect.jvm.internal.impl.descriptors.a a, @f final e1 e1, final int m, @e final g g, @e final kotlin.reflect.jvm.internal.impl.name.e e2, @e final c0 c0, final boolean n, final boolean o, final boolean p11, @f final c0 q, @e final w0 w0) {
        kotlin.jvm.internal.k0.p(a, "containingDeclaration");
        kotlin.jvm.internal.k0.p(g, "annotations");
        kotlin.jvm.internal.k0.p(e2, "name");
        kotlin.jvm.internal.k0.p(c0, "outType");
        kotlin.jvm.internal.k0.p(w0, "source");
        super(a, g, e2, c0, w0);
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p11;
        this.Q = q;
        e1 r;
        if (e1 == null) {
            r = this;
        }
        else {
            r = e1;
        }
        this.R = r;
    }
    
    @m6.k
    @e
    public static final k0 M0(@e final kotlin.reflect.jvm.internal.impl.descriptors.a a, @f final e1 e1, final int n, @e final g g, @e final kotlin.reflect.jvm.internal.impl.name.e e2, @e final c0 c0, final boolean b, final boolean b2, final boolean b3, @f final c0 c2, @e final w0 w0, @f final n6.a<? extends List<? extends g1>> a2) {
        return k0.S.a(a, e1, n, g, e2, c0, b, b2, b3, c2, w0, a2);
    }
    
    @e
    @Override
    public e1 H0(@e final kotlin.reflect.jvm.internal.impl.descriptors.a a, @e final kotlin.reflect.jvm.internal.impl.name.e e, final int n) {
        kotlin.jvm.internal.k0.p(a, "newOwner");
        kotlin.jvm.internal.k0.p(e, "newName");
        final g annotations = this.getAnnotations();
        kotlin.jvm.internal.k0.o(annotations, "annotations");
        final c0 a2 = this.a();
        kotlin.jvm.internal.k0.o(a2, "type");
        final boolean x0 = this.x0();
        final boolean f0 = this.f0();
        final boolean b0 = this.b0();
        final c0 p3 = this.p0();
        final w0 a3 = w0.a;
        kotlin.jvm.internal.k0.o(a3, "NO_SOURCE");
        return new k0(a, null, n, annotations, e, a2, x0, f0, b0, p3, a3);
    }
    
    @f
    public Void N0() {
        return null;
    }
    
    @e
    public e1 O0(@e final kotlin.reflect.jvm.internal.impl.types.d1 d1) {
        kotlin.jvm.internal.k0.p(d1, "substitutor");
        if (d1.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public <R, D> R P(@e final o<R, D> o, final D n) {
        kotlin.jvm.internal.k0.p(o, "visitor");
        return o.k(this, n);
    }
    
    @e
    @Override
    public e1 b() {
        final e1 r = this.R;
        e1 b;
        if (r == this) {
            b = this;
        }
        else {
            b = r.b();
        }
        return b;
    }
    
    @Override
    public boolean b0() {
        return this.P;
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.a c() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.a)super.c();
    }
    
    @Override
    public boolean f0() {
        return this.O;
    }
    
    @e
    @Override
    public Collection<e1> g() {
        final Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> g = this.c().g();
        kotlin.jvm.internal.k0.o(g, "containingDeclaration.overriddenDescriptors");
        final ArrayList list = new ArrayList<e1>(v.Y((Iterable<?>)g, 10));
        final Iterator<kotlin.reflect.jvm.internal.impl.descriptors.a> iterator = g.iterator();
        while (iterator.hasNext()) {
            list.add((e1)iterator.next().m().get(this.i()));
        }
        return (Collection<e1>)list;
    }
    
    @e
    @Override
    public u getVisibility() {
        final u f = t.f;
        kotlin.jvm.internal.k0.o(f, "LOCAL");
        return f;
    }
    
    @Override
    public int i() {
        return this.M;
    }
    
    @Override
    public boolean n0() {
        return false;
    }
    
    @f
    @Override
    public c0 p0() {
        return this.Q;
    }
    
    @Override
    public boolean v0() {
        return e1.a.a(this);
    }
    
    @Override
    public boolean x0() {
        return this.N && ((kotlin.reflect.jvm.internal.impl.descriptors.b)this.c()).n().b();
    }
    
    public static final class a
    {
        private a() {
        }
        
        @m6.k
        @e
        public final k0 a(@e final kotlin.reflect.jvm.internal.impl.descriptors.a a, @f final e1 e1, final int n, @e final g g, @e final kotlin.reflect.jvm.internal.impl.name.e e2, @e final c0 c0, final boolean b, final boolean b2, final boolean b3, @f final c0 c2, @e final w0 w0, @f final n6.a<? extends List<? extends g1>> a2) {
            kotlin.jvm.internal.k0.p(a, "containingDeclaration");
            kotlin.jvm.internal.k0.p(g, "annotations");
            kotlin.jvm.internal.k0.p(e2, "name");
            kotlin.jvm.internal.k0.p(c0, "outType");
            kotlin.jvm.internal.k0.p(w0, "source");
            k0 k0;
            if (a2 == null) {
                k0 = new k0(a, e1, n, g, e2, c0, b, b2, b3, c2, w0);
            }
            else {
                k0 = new b(a, e1, n, g, e2, c0, b, b2, b3, c2, w0, a2);
            }
            return k0;
        }
    }
    
    public static final class b extends k0
    {
        @e
        private final b0 T;
        
        public b(@e final kotlin.reflect.jvm.internal.impl.descriptors.a a, @f final e1 e1, final int n, @e final g g, @e final kotlin.reflect.jvm.internal.impl.name.e e2, @e final c0 c0, final boolean b, final boolean b2, final boolean b3, @f final c0 c2, @e final w0 w0, @e final n6.a<? extends List<? extends g1>> a2) {
            kotlin.jvm.internal.k0.p(a, "containingDeclaration");
            kotlin.jvm.internal.k0.p(g, "annotations");
            kotlin.jvm.internal.k0.p(e2, "name");
            kotlin.jvm.internal.k0.p(c0, "outType");
            kotlin.jvm.internal.k0.p(w0, "source");
            kotlin.jvm.internal.k0.p(a2, "destructuringVariables");
            super(a, e1, n, g, e2, c0, b, b2, b3, c2, w0);
            this.T = d0.c((n6.a<?>)a2);
        }
        
        @e
        @Override
        public e1 H0(@e final kotlin.reflect.jvm.internal.impl.descriptors.a a, @e final kotlin.reflect.jvm.internal.impl.name.e e, final int n) {
            kotlin.jvm.internal.k0.p(a, "newOwner");
            kotlin.jvm.internal.k0.p(e, "newName");
            final g annotations = this.getAnnotations();
            kotlin.jvm.internal.k0.o(annotations, "annotations");
            final c0 a2 = this.a();
            kotlin.jvm.internal.k0.o(a2, "type");
            final boolean x0 = this.x0();
            final boolean f0 = this.f0();
            final boolean b0 = this.b0();
            final c0 p3 = this.p0();
            final w0 a3 = w0.a;
            kotlin.jvm.internal.k0.o(a3, "NO_SOURCE");
            return new b(a, null, n, annotations, e, a2, x0, f0, b0, p3, a3, new n6.a<List<? extends g1>>() {
                final /* synthetic */ b G;
                
                @e
                public final List<g1> a() {
                    return this.G.P0();
                }
            });
        }
        
        @e
        public final List<g1> P0() {
            return this.T.getValue();
        }
    }
}
