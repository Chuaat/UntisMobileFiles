// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import java.util.Iterator;
import kotlin.collections.v;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import n6.l;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.d;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.a;

public abstract class o extends n
{
    @e
    private final a M;
    @f
    private final g N;
    @e
    private final d O;
    @e
    private final w P;
    @f
    private kotlin.reflect.jvm.internal.impl.metadata.a.m Q;
    private h R;
    
    public o(@e final b b, @e final kotlin.reflect.jvm.internal.impl.storage.n n, @e final e0 e0, @e final kotlin.reflect.jvm.internal.impl.metadata.a.m q, @e final a m, @f final g n2) {
        k0.p((Object)b, "fqName");
        k0.p((Object)n, "storageManager");
        k0.p((Object)e0, "module");
        k0.p((Object)q, "proto");
        k0.p((Object)m, "metadataVersion");
        super(b, n, e0);
        this.M = m;
        this.N = n2;
        final kotlin.reflect.jvm.internal.impl.metadata.a.p q2 = q.Q();
        k0.o((Object)q2, "proto.strings");
        final kotlin.reflect.jvm.internal.impl.metadata.a.o p6 = q.P();
        k0.o((Object)p6, "proto.qualifiedNames");
        final d o = new d(q2, p6);
        this.O = o;
        this.P = new w(q, o, m, (l<? super kotlin.reflect.jvm.internal.impl.name.a, ? extends w0>)new l<kotlin.reflect.jvm.internal.impl.name.a, w0>() {
            final /* synthetic */ o G;
            
            @e
            public final w0 a(@e final kotlin.reflect.jvm.internal.impl.name.a a) {
                k0.p((Object)a, "it");
                Object o;
                if ((o = kotlin.reflect.jvm.internal.impl.serialization.deserialization.o.N0(this.G)) == null) {
                    o = w0.a;
                    k0.o(o, "NO_SOURCE");
                }
                return (w0)o;
            }
        });
        this.Q = q;
    }
    
    public static final /* synthetic */ g N0(final o o) {
        return o.N;
    }
    
    @Override
    public void M0(@e final j j) {
        k0.p((Object)j, "components");
        final kotlin.reflect.jvm.internal.impl.metadata.a.m q = this.Q;
        if (q != null) {
            this.Q = null;
            final kotlin.reflect.jvm.internal.impl.metadata.a.l o = q.O();
            k0.o((Object)o, "proto.`package`");
            this.R = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.j((h0)this, o, this.O, this.M, this.N, j, (n6.a<? extends Collection<kotlin.reflect.jvm.internal.impl.name.e>>)new n6.a<Collection<? extends kotlin.reflect.jvm.internal.impl.name.e>>() {
                final /* synthetic */ o G;
                
                @e
                public final Collection<kotlin.reflect.jvm.internal.impl.name.e> a() {
                    final Collection<kotlin.reflect.jvm.internal.impl.name.a> b = this.G.O0().b();
                    final ArrayList<kotlin.reflect.jvm.internal.impl.name.a> list = new ArrayList<kotlin.reflect.jvm.internal.impl.name.a>();
                    for (final kotlin.reflect.jvm.internal.impl.name.a next : b) {
                        final kotlin.reflect.jvm.internal.impl.name.a a = next;
                        if (!a.l() && !kotlin.reflect.jvm.internal.impl.serialization.deserialization.h.c.a().contains(a)) {
                            list.add(next);
                        }
                    }
                    final ArrayList list2 = new ArrayList<kotlin.reflect.jvm.internal.impl.name.e>(v.Y((Iterable)list, 10));
                    final Iterator<Object> iterator2 = list.iterator();
                    while (iterator2.hasNext()) {
                        list2.add(iterator2.next().j());
                    }
                    return (Collection<kotlin.reflect.jvm.internal.impl.name.e>)list2;
                }
            });
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }
    
    @e
    public w O0() {
        return this.P;
    }
    
    @e
    public h x() {
        final h r = this.R;
        if (r != null) {
            return r;
        }
        k0.S("_memberScope");
        throw null;
    }
}
