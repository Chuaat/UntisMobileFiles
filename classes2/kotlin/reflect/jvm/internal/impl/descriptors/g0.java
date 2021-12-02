// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h$c;
import java.util.Iterator;
import kotlin.ranges.k;
import java.util.Collection;
import kotlin.collections.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.j0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.collections.t0;
import java.util.ArrayList;
import kotlin.ranges.o;
import kotlin.reflect.jvm.internal.impl.types.j;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.name.a;
import java.util.List;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.m;
import kotlin.jvm.internal.m0;
import n6.l;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.storage.g;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.storage.n;

public final class g0
{
    @e
    private final n a;
    @e
    private final e0 b;
    @e
    private final g<kotlin.reflect.jvm.internal.impl.name.b, h0> c;
    @e
    private final g<a, kotlin.reflect.jvm.internal.impl.descriptors.e> d;
    
    public g0(@e final n a, @e final e0 b) {
        k0.p(a, "storageManager");
        k0.p(b, "module");
        this.a = a;
        this.b = b;
        this.c = (g<kotlin.reflect.jvm.internal.impl.name.b, h0>)a.b((l)new l<kotlin.reflect.jvm.internal.impl.name.b, h0>() {
            final /* synthetic */ g0 G;
            
            @e
            public final h0 a(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
                k0.p(b, "fqName");
                return new m(g0.a(this.G), b);
            }
        });
        this.d = (g<a, kotlin.reflect.jvm.internal.impl.descriptors.e>)a.b((l)new l<a, kotlin.reflect.jvm.internal.impl.descriptors.e>() {
            final /* synthetic */ g0 G;
            
            @e
            public final kotlin.reflect.jvm.internal.impl.descriptors.e a(@e final a a) {
                k0.p(a, "$dstr$classId$typeParametersCount");
                final kotlin.reflect.jvm.internal.impl.name.a a2 = a.a();
                final List<Integer> b = a.b();
                if (!a2.k()) {
                    final kotlin.reflect.jvm.internal.impl.name.a g = a2.g();
                    kotlin.reflect.jvm.internal.impl.descriptors.e d;
                    if (g == null) {
                        d = null;
                    }
                    else {
                        d = this.G.d(g, v.P1((Iterable<? extends Integer>)b, 1));
                    }
                    kotlin.reflect.jvm.internal.impl.descriptors.g g2 = d;
                    if (d == null) {
                        final g b2 = g0.b(this.G);
                        final kotlin.reflect.jvm.internal.impl.name.b h = a2.h();
                        k0.o(h, "classId.packageFqName");
                        g2 = ((l<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.descriptors.g>)b2).invoke(h);
                    }
                    final boolean l = a2.l();
                    final n c = g0.c(this.G);
                    final kotlin.reflect.jvm.internal.impl.name.e j = a2.j();
                    k0.o(j, "classId.shortClassName");
                    final Integer n = v.t2((List<? extends Integer>)b);
                    int intValue;
                    if (n == null) {
                        intValue = 0;
                    }
                    else {
                        intValue = n;
                    }
                    return new b(c, g2, j, l, intValue);
                }
                throw new UnsupportedOperationException(k0.C("Unresolved local class: ", a2));
            }
        });
    }
    
    public static final /* synthetic */ e0 a(final g0 g0) {
        return g0.b;
    }
    
    public static final /* synthetic */ g b(final g0 g0) {
        return g0.c;
    }
    
    public static final /* synthetic */ n c(final g0 g0) {
        return g0.a;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.descriptors.e d(@e final kotlin.reflect.jvm.internal.impl.name.a a, @e final List<Integer> list) {
        k0.p(a, "classId");
        k0.p(list, "typeParametersCount");
        return ((l<a, kotlin.reflect.jvm.internal.impl.descriptors.e>)this.d).invoke(new a(a, list));
    }
    
    private static final class a
    {
        @e
        private final kotlin.reflect.jvm.internal.impl.name.a a;
        @e
        private final List<Integer> b;
        
        public a(@e final kotlin.reflect.jvm.internal.impl.name.a a, @e final List<Integer> b) {
            k0.p(a, "classId");
            k0.p(b, "typeParametersCount");
            this.a = a;
            this.b = b;
        }
        
        @e
        public final kotlin.reflect.jvm.internal.impl.name.a a() {
            return this.a;
        }
        
        @e
        public final List<Integer> b() {
            return this.b;
        }
        
        @Override
        public boolean equals(@f final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return k0.g(this.a, a.a) && k0.g(this.b, a.b);
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode() * 31 + this.b.hashCode();
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ClassRequest(classId=");
            sb.append(this.a);
            sb.append(", typeParametersCount=");
            sb.append(this.b);
            sb.append(')');
            return sb.toString();
        }
    }
    
    public static final class b extends g
    {
        private final boolean P;
        @org.jetbrains.annotations.e
        private final List<b1> Q;
        @org.jetbrains.annotations.e
        private final j R;
        
        public b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.storage.n n, @org.jetbrains.annotations.e final m m, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, final boolean p5, int b) {
            k0.p(n, "storageManager");
            k0.p(m, "container");
            k0.p(e, "name");
            super(n, m, e, w0.a, false);
            this.P = p5;
            final k n2 = o.n1(0, b);
            final ArrayList q = new ArrayList<b1>(v.Y((Iterable<?>)n2, 10));
            final Iterator<? extends T> iterator = ((Iterable<? extends T>)n2).iterator();
            while (iterator.hasNext()) {
                b = ((t0)iterator).b();
                q.add(j0.S0(this, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b(), false, k1.K, kotlin.reflect.jvm.internal.impl.name.e.i(k0.C("T", b)), b, n));
            }
            this.Q = (List<b1>)q;
            this.R = new j((e)this, (List)c1.d(this), (Collection)j1.f(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.l((m)this).w().getAnyType()), n);
        }
        
        @org.jetbrains.annotations.e
        @Override
        public List<b1> C() {
            return this.Q;
        }
        
        @Override
        public boolean D() {
            return false;
        }
        
        @Override
        public boolean F0() {
            return false;
        }
        
        @Override
        public boolean G() {
            return false;
        }
        
        @org.jetbrains.annotations.e
        public h$c L0() {
            return h$c.b;
        }
        
        @org.jetbrains.annotations.e
        public j M0() {
            return this.R;
        }
        
        @org.jetbrains.annotations.e
        protected h$c N0(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
            k0.p(g, "kotlinTypeRefiner");
            return h$c.b;
        }
        
        @Override
        public boolean Q() {
            return false;
        }
        
        @f
        @Override
        public d U() {
            return null;
        }
        
        @f
        @Override
        public e X() {
            return null;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public u getVisibility() {
            final u e = kotlin.reflect.jvm.internal.impl.descriptors.t.e;
            k0.o(e, "PUBLIC");
            return e;
        }
        
        @Override
        public boolean isExternal() {
            return false;
        }
        
        @Override
        public boolean isInline() {
            return false;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Collection<d> j() {
            return (Collection<d>)j1.k();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public kotlin.reflect.jvm.internal.impl.descriptors.f n() {
            return kotlin.reflect.jvm.internal.impl.descriptors.f.G;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public b0 o() {
            return b0.H;
        }
        
        @Override
        public boolean q() {
            return false;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Collection<e> s() {
            return (Collection<e>)v.E();
        }
        
        @Override
        public boolean t() {
            return false;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("class ");
            sb.append(this.getName());
            sb.append(" (not found)");
            return sb.toString();
        }
        
        @Override
        public boolean u() {
            return this.P;
        }
    }
}
