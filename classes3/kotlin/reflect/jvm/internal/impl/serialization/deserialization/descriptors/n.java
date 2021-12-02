// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.b0;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.f;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0$a;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.y;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.v;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.l;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b;

public final class n extends b
{
    @e
    private final l Q;
    @e
    private final a.s R;
    @e
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b S;
    
    public n(@e final l q, @e final a.s r, final int n) {
        k0.p((Object)q, "c");
        k0.p((Object)r, "proto");
        final kotlin.reflect.jvm.internal.impl.storage.n h = q.h();
        final m e = q.e();
        final kotlin.reflect.jvm.internal.impl.name.e b = v.b(q.g(), r.P());
        final y a = y.a;
        final a.s.c v = r.V();
        k0.o((Object)v, "proto.variance");
        super(h, e, b, a.d(v), r.Q(), n, w0.a, (z0)z0$a.a);
        this.Q = q;
        this.R = r;
        this.S = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b(q.h(), (n6.a<? extends List<? extends c>>)new n6.a<List<? extends c>>() {
            final /* synthetic */ n G;
            
            @e
            public final List<c> a() {
                return (List<c>)kotlin.collections.v.I5((Iterable)n.N0(this.G).c().d().a(this.G.P0(), n.N0(this.G).g()));
            }
        });
    }
    
    public static final /* synthetic */ l N0(final n n) {
        return n.Q;
    }
    
    @e
    protected List<c0> M0() {
        final List<a.q> o = f.o(this.R, this.Q.j());
        if (o.isEmpty()) {
            return (List<c0>)kotlin.collections.v.k((Object)kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.g((m)this).getDefaultBound());
        }
        final b0 i = this.Q.i();
        final ArrayList list = new ArrayList<c0>(kotlin.collections.v.Y((Iterable)o, 10));
        final Iterator<Object> iterator = o.iterator();
        while (iterator.hasNext()) {
            list.add(i.p(iterator.next()));
        }
        return (List<c0>)list;
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b O0() {
        return this.S;
    }
    
    @e
    public final a.s P0() {
        return this.R;
    }
    
    @e
    protected Void Q0(@e final c0 c0) {
        k0.p((Object)c0, "type");
        throw new IllegalStateException(k0.C("There should be no cycles for deserialized type parameters, but found for: ", (Object)this));
    }
}
