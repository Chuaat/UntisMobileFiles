// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import kotlin.collections.m;
import java.util.Set;
import kotlin.collections.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.o;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import n6.a;
import n6.l;
import kotlin.reflect.jvm.internal.impl.types.checker.p;
import kotlin.collections.y0;
import m6.h;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import kotlin.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.storage.g;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import java.util.Map;
import org.jetbrains.annotations.f;
import t6.c;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;

public final class x extends j implements e0
{
    @e
    private final n I;
    @e
    private final KotlinBuiltIns J;
    @f
    private final c K;
    @f
    private final kotlin.reflect.jvm.internal.impl.name.e L;
    @e
    private final Map<d0<?>, Object> M;
    @f
    private v N;
    @f
    private i0 O;
    private boolean P;
    @e
    private final g<kotlin.reflect.jvm.internal.impl.name.b, m0> Q;
    @e
    private final b0 R;
    
    @h
    public x(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final n n, @e final KotlinBuiltIns kotlinBuiltIns, @f final c c) {
        k0.p(e, "moduleName");
        k0.p(n, "storageManager");
        k0.p(kotlinBuiltIns, "builtIns");
        this(e, n, kotlinBuiltIns, c, null, null, 48, null);
    }
    
    @h
    public x(@e final kotlin.reflect.jvm.internal.impl.name.e e, @e final n i, @e final KotlinBuiltIns j, @f final c k, @e final Map<d0<?>, ?> map, @f final kotlin.reflect.jvm.internal.impl.name.e l) {
        k0.p(e, "moduleName");
        k0.p(i, "storageManager");
        k0.p(j, "builtIns");
        k0.p(map, "capabilities");
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b(), e);
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        if (e.j()) {
            (this.M = y0.J0((Map<? extends d0<?>, ?>)map)).put(kotlin.reflect.jvm.internal.impl.types.checker.h.a(), new p((Object)null));
            this.P = true;
            this.Q = (g<kotlin.reflect.jvm.internal.impl.name.b, m0>)i.b((l)new l<kotlin.reflect.jvm.internal.impl.name.b, m0>() {
                final /* synthetic */ x G;
                
                @e
                public final kotlin.reflect.jvm.internal.impl.descriptors.m0 a(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
                    k0.p(b, "fqName");
                    final x g = this.G;
                    return new r(g, b, x.M0(g));
                }
            });
            this.R = kotlin.d0.c((a<?>)new a<i>() {
                final /* synthetic */ x G;
                
                @e
                public final i a() {
                    final v o = x.O(this.G);
                    final x g = this.G;
                    if (o != null) {
                        final List<x> a = o.a();
                        a.contains(this.G);
                        final Iterator<Object> iterator = a.iterator();
                        while (iterator.hasNext()) {
                            iterator.next().T0();
                        }
                        final ArrayList list = new ArrayList<i0>(kotlin.collections.v.Y((Iterable<?>)a, 10));
                        final Iterator<Object> iterator2 = a.iterator();
                        while (iterator2.hasNext()) {
                            final i0 l0 = x.L0(iterator2.next());
                            k0.m(l0);
                            list.add(l0);
                        }
                        return new i((List<? extends i0>)list);
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Dependencies of module ");
                    sb.append(g.P0());
                    sb.append(" were not set before querying module content");
                    throw new AssertionError((Object)sb.toString());
                }
            });
            return;
        }
        throw new IllegalArgumentException(k0.C("Module name must be special: ", e));
    }
    
    public static final /* synthetic */ i0 L0(final x x) {
        return x.O;
    }
    
    public static final /* synthetic */ n M0(final x x) {
        return x.I;
    }
    
    public static final /* synthetic */ v O(final x x) {
        return x.N;
    }
    
    private final String P0() {
        final String string = this.getName().toString();
        k0.o(string, "name.toString()");
        return string;
    }
    
    private final i R0() {
        return this.R.getValue();
    }
    
    private final boolean T0() {
        return this.O != null;
    }
    
    @f
    @Override
    public <T> T I0(@e final d0<T> d0) {
        k0.p(d0, "capability");
        return (T)this.M.get(d0);
    }
    
    public void O0() {
        if (this.U0()) {
            return;
        }
        throw new z(k0.C("Accessing invalid module descriptor ", this));
    }
    
    @Override
    public <R, D> R P(@e final o<R, D> o, final D n) {
        return e0.a.a(this, o, n);
    }
    
    @e
    public final i0 Q0() {
        this.O0();
        return this.R0();
    }
    
    @e
    @Override
    public m0 R(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
        k0.p(b, "fqName");
        this.O0();
        return ((l<kotlin.reflect.jvm.internal.impl.name.b, m0>)this.Q).invoke(b);
    }
    
    public final void S0(@e final i0 o) {
        k0.p(o, "providerForModuleContent");
        this.T0();
        this.O = o;
    }
    
    public boolean U0() {
        return this.P;
    }
    
    public final void V0(@e final List<x> list) {
        k0.p(list, "descriptors");
        this.W0(list, j1.k());
    }
    
    public final void W0(@e final List<x> list, @e final Set<x> set) {
        k0.p(list, "descriptors");
        k0.p(set, "friends");
        this.X0(new kotlin.reflect.jvm.internal.impl.descriptors.impl.w(list, set, kotlin.collections.v.E(), j1.k()));
    }
    
    public final void X0(@e final v n) {
        k0.p(n, "dependencies");
        this.N = n;
    }
    
    public final void Y0(@e final x... array) {
        k0.p(array, "descriptors");
        this.V0(kotlin.collections.m.ey(array));
    }
    
    @f
    @Override
    public m c() {
        return e0.a.b(this);
    }
    
    @Override
    public boolean i0(@e final e0 e0) {
        k0.p(e0, "targetModule");
        if (k0.g(this, e0)) {
            return true;
        }
        final v n = this.N;
        k0.m(n);
        return kotlin.collections.v.J1(n.b(), e0) || this.w0().contains(e0) || e0.w0().contains(this);
    }
    
    @e
    @Override
    public KotlinBuiltIns w() {
        return this.J;
    }
    
    @e
    @Override
    public List<e0> w0() {
        final v n = this.N;
        if (n != null) {
            return (List<e0>)n.c();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Dependencies of module ");
        sb.append(this.P0());
        sb.append(" were not set");
        throw new AssertionError((Object)sb.toString());
    }
    
    @e
    @Override
    public Collection<kotlin.reflect.jvm.internal.impl.name.b> z(@e final kotlin.reflect.jvm.internal.impl.name.b b, @e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p(b, "fqName");
        k0.p(l, "nameFilter");
        this.O0();
        return this.Q0().z(b, l);
    }
}
