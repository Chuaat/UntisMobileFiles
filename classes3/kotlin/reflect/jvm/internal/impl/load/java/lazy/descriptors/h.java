// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.load.kotlin.p;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.storage.m;
import org.jetbrains.annotations.f;
import java.util.HashMap;
import java.util.Collection;
import kotlin.collections.v;
import java.util.Iterator;
import kotlin.collections.y0;
import kotlin.n1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.n;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.c;
import kotlin.s0;
import java.util.ArrayList;
import kotlin.jvm.internal.m0;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.a;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import kotlin.reflect.jvm.internal.impl.name.b;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.storage.i;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.u;
import kotlin.reflect.o;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.z;

public final class h extends z
{
    static final /* synthetic */ o<Object>[] S;
    @e
    private final u L;
    @e
    private final g M;
    @e
    private final i N;
    @e
    private final d O;
    @e
    private final i<List<b>> P;
    @e
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g Q;
    @e
    private final i R;
    
    static {
        S = new o[] { (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)h.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), (o)k1.r((e1)new f1((kotlin.reflect.h)k1.d((Class)h.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;")) };
    }
    
    public h(@e final g g, @e final u l) {
        k0.p((Object)g, "outerContext");
        k0.p((Object)l, "jPackage");
        super(g.d(), l.f());
        this.L = l;
        final g d = kotlin.reflect.jvm.internal.impl.load.java.lazy.a.d(g, (kotlin.reflect.jvm.internal.impl.descriptors.g)this, null, 0, 6, null);
        this.M = d;
        this.N = d.e().g((n6.a<?>)new n6.a<Map<String, ? extends kotlin.reflect.jvm.internal.impl.load.kotlin.o>>() {
            final /* synthetic */ h G;
            
            @e
            public final Map<String, kotlin.reflect.jvm.internal.impl.load.kotlin.o> a() {
                final kotlin.reflect.jvm.internal.impl.load.kotlin.u n = h.G0(this.G).a().n();
                final String b = this.G.f().b();
                k0.o((Object)b, "fqName.asString()");
                final List<String> a = n.a(b);
                final h g = this.G;
                final ArrayList<s0> list = new ArrayList<s0>();
                for (final String s : a) {
                    final kotlin.reflect.jvm.internal.impl.name.a m = kotlin.reflect.jvm.internal.impl.name.a.m(c.d(s).e());
                    k0.o((Object)m, "topLevel(JvmClassName.byInternalName(partName).fqNameForTopLevelClassMaybeWithDollars)");
                    final kotlin.reflect.jvm.internal.impl.load.kotlin.o b2 = kotlin.reflect.jvm.internal.impl.load.kotlin.n.b(h.G0(g).a().i(), m);
                    s0 a2;
                    if (b2 == null) {
                        a2 = null;
                    }
                    else {
                        a2 = n1.a((Object)s, (Object)b2);
                    }
                    if (a2 != null) {
                        list.add(a2);
                    }
                }
                return (Map<String, kotlin.reflect.jvm.internal.impl.load.kotlin.o>)y0.B0((Iterable)list);
            }
        });
        this.O = new d(d, l, this);
        this.P = d.e().a((n6.a<? extends List<b>>)new n6.a<List<? extends b>>() {
            final /* synthetic */ h G;
            
            @e
            public final List<b> a() {
                final Collection<u> z = h.L0(this.G).z();
                final ArrayList list = new ArrayList<b>(v.Y((Iterable)z, 10));
                final Iterator<Object> iterator = z.iterator();
                while (iterator.hasNext()) {
                    list.add(iterator.next().f());
                }
                return (List<b>)list;
            }
        }, v.E());
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g q;
        if (d.a().h().a()) {
            q = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b();
        }
        else {
            q = kotlin.reflect.jvm.internal.impl.load.java.lazy.e.a(d, l);
        }
        this.Q = q;
        this.R = d.e().g((n6.a<?>)new n6.a<HashMap<c, c>>() {
            final /* synthetic */ h G;
            
            @e
            public final HashMap<c, c> a() {
                final HashMap<c, c> hashMap = new HashMap<c, c>();
                for (final Map.Entry<String, kotlin.reflect.jvm.internal.impl.load.kotlin.o> entry : this.G.N0().entrySet()) {
                    final String s = entry.getKey();
                    final kotlin.reflect.jvm.internal.impl.load.kotlin.o o = entry.getValue();
                    final c d = c.d(s);
                    k0.o((Object)d, "byInternalName(partInternalName)");
                    final kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a = o.a();
                    final int n = h$b.a.a[a.c().ordinal()];
                    if (n != 1) {
                        if (n != 2) {
                            continue;
                        }
                        hashMap.put(d, d);
                    }
                    else {
                        final String e = a.e();
                        if (e == null) {
                            continue;
                        }
                        final c d2 = c.d(e);
                        k0.o((Object)d2, "byInternalName(header.multifileClassName ?: continue@kotlinClasses)");
                        hashMap.put(d, d2);
                    }
                }
                return hashMap;
            }
        });
    }
    
    public static final /* synthetic */ g G0(final h h) {
        return h.M;
    }
    
    public static final /* synthetic */ u L0(final h h) {
        return h.L;
    }
    
    @f
    public final kotlin.reflect.jvm.internal.impl.descriptors.e M0(@e final kotlin.reflect.jvm.internal.impl.load.java.structure.g g) {
        k0.p((Object)g, "jClass");
        return this.O.k().P(g);
    }
    
    @e
    public final Map<String, kotlin.reflect.jvm.internal.impl.load.kotlin.o> N0() {
        return m.a((i<? extends Map<String, kotlin.reflect.jvm.internal.impl.load.kotlin.o>>)this.N, (Object)this, (o<?>)h.S[0]);
    }
    
    @e
    public d O0() {
        return this.O;
    }
    
    @e
    public final List<b> P0() {
        return (List<b>)((n6.a)this.P).invoke();
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.Q;
    }
    
    @e
    public w0 k() {
        return (w0)new p(this);
    }
    
    @e
    public String toString() {
        return k0.C("Lazy Java package fragment: ", (Object)this.f());
    }
}
