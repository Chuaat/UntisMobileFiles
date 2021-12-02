// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.h0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import n6.l;
import java.util.Iterator;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.types.a1;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.jvm.internal.m0;
import java.util.List;
import n6.a;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.jvm.internal.w;
import kotlin.b0;
import kotlin.reflect.jvm.internal.impl.types.k0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.w0;

public final class n implements w0
{
    @e
    public static final a f;
    private final long a;
    @e
    private final e0 b;
    @e
    private final Set<c0> c;
    @e
    private final k0 d;
    @e
    private final b0 e;
    
    static {
        f = new a(null);
    }
    
    private n(final long a, final e0 b, final Set<? extends c0> c) {
        final d0 a2 = d0.a;
        this.d = d0.e(g.r.b(), this, false);
        this.e = kotlin.d0.c((n6.a)new n6.a<List<k0>>() {
            final /* synthetic */ n G;
            
            @e
            public final List<k0> a() {
                final k0 a = this.G.w().getComparable().A();
                kotlin.jvm.internal.k0.o((Object)a, "builtIns.comparable.defaultType");
                final List p = v.P((Object[])new k0[] { c1.f(a, v.k((Object)new a1(k1.L, n.f(this.G))), null, 2, null) });
                if (!n.this.m()) {
                    p.add(this.G.w().getNumberType());
                }
                return (List<k0>)p;
            }
        });
        this.a = a;
        this.b = b;
        this.c = (Set<c0>)c;
    }
    
    public static final /* synthetic */ e0 e(final n n) {
        return n.b;
    }
    
    public static final /* synthetic */ k0 f(final n n) {
        return n.d;
    }
    
    public static final /* synthetic */ long g(final n n) {
        return n.a;
    }
    
    private final List<c0> l() {
        return (List<c0>)this.e.getValue();
    }
    
    private final boolean m() {
        final Collection<c0> a = t.a(this.b);
        final boolean b = a instanceof Collection;
        final boolean b2 = true;
        boolean b3;
        if (b && a.isEmpty()) {
            b3 = b2;
        }
        else {
            final Iterator<Object> iterator = a.iterator();
            do {
                b3 = b2;
                if (iterator.hasNext()) {
                    continue;
                }
                return b3;
            } while (this.j().contains(iterator.next()) ^ true);
            b3 = false;
        }
        return b3;
    }
    
    private final String n() {
        final StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(v.Z2((Iterable)this.c, (CharSequence)",", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)n$c.G, 30, (Object)null));
        sb.append(']');
        return sb.toString();
    }
    
    @e
    @Override
    public w0 b(@e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
        kotlin.jvm.internal.k0.p((Object)g, "kotlinTypeRefiner");
        return this;
    }
    
    @f
    @Override
    public h c() {
        return null;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @e
    @Override
    public List<b1> getParameters() {
        return (List<b1>)v.E();
    }
    
    public final boolean i(@e final w0 w0) {
        kotlin.jvm.internal.k0.p((Object)w0, "constructor");
        final Set<c0> c = this.c;
        final boolean b = c instanceof Collection;
        final boolean b2 = false;
        boolean b3;
        if (b && c.isEmpty()) {
            b3 = b2;
        }
        else {
            final Iterator<Object> iterator = c.iterator();
            do {
                b3 = b2;
                if (iterator.hasNext()) {
                    continue;
                }
                return b3;
            } while (!kotlin.jvm.internal.k0.g((Object)iterator.next().N0(), (Object)w0));
            b3 = true;
        }
        return b3;
    }
    
    @e
    public final Set<c0> j() {
        return this.c;
    }
    
    @e
    @Override
    public Collection<c0> k() {
        return this.l();
    }
    
    @e
    @Override
    public String toString() {
        return kotlin.jvm.internal.k0.C("IntegerLiteralType", (Object)this.n());
    }
    
    @e
    @Override
    public KotlinBuiltIns w() {
        return this.b.w();
    }
    
    public static final class a
    {
        private a() {
        }
        
        private final k0 a(final Collection<? extends k0> collection, final n.a.a a) {
            if (collection.isEmpty()) {
                return null;
            }
            final Iterator<k0> iterator = collection.iterator();
            if (iterator.hasNext()) {
                k0 k0 = iterator.next();
                while (iterator.hasNext()) {
                    k0 = this.e(k0, iterator.next(), a);
                }
                return k0;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        
        private final k0 c(final n n, final n n2, final n.a.a a) {
            final int n3 = b.a[a.ordinal()];
            Set set;
            if (n3 != 1) {
                if (n3 != 2) {
                    throw new h0();
                }
                set = v.P5((Iterable)n.j(), (Iterable)n2.j());
            }
            else {
                set = v.V2((Iterable)n.j(), (Iterable)n2.j());
            }
            final n n4 = new n(n.g(n), n.e(n), set, null);
            final d0 a2 = d0.a;
            return d0.e(g.r.b(), n4, false);
        }
        
        private final k0 d(final n n, k0 k0) {
            if (!n.j().contains(k0)) {
                k0 = null;
            }
            return k0;
        }
        
        private final k0 e(final k0 k0, final k0 k2, final n.a.a a) {
            k0 k4;
            final k0 k3 = k4 = null;
            if (k0 != null) {
                if (k2 == null) {
                    k4 = k3;
                }
                else {
                    final w0 n0 = k0.N0();
                    final w0 n2 = k2.N0();
                    final boolean b = n0 instanceof n;
                    if (b && n2 instanceof n) {
                        k4 = this.c((n)n0, (n)n2, a);
                    }
                    else if (b) {
                        k4 = this.d((n)n0, k2);
                    }
                    else {
                        k4 = k3;
                        if (n2 instanceof n) {
                            k4 = this.d((n)n2, k0);
                        }
                    }
                }
            }
            return k4;
        }
        
        @f
        public final k0 b(@e final Collection<? extends k0> collection) {
            kotlin.jvm.internal.k0.p((Object)collection, "types");
            return this.a(collection, n.a.a.H);
        }
        
        private enum a
        {
            G, 
            H;
        }
    }
}
