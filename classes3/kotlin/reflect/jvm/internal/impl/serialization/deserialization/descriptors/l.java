// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.j;
import kotlin.reflect.jvm.internal.impl.descriptors.a$a;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.p;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.b$a;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.i;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.g;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.f0;

public final class l extends f0 implements c
{
    @e
    private final kotlin.reflect.jvm.internal.impl.metadata.a.i j0;
    @e
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c k0;
    @e
    private final g l0;
    @e
    private final i m0;
    @f
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g n0;
    @e
    private h.a o0;
    
    public l(@e final m m, @f final v0 v0, @e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, @e final kotlin.reflect.jvm.internal.impl.name.e e, @e final b$a b$a, @e final kotlin.reflect.jvm.internal.impl.metadata.a.i j0, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c k0, @e final g l0, @e final i m2, @f final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g n0, @f w0 a) {
        kotlin.jvm.internal.k0.p((Object)m, "containingDeclaration");
        kotlin.jvm.internal.k0.p((Object)g, "annotations");
        kotlin.jvm.internal.k0.p((Object)e, "name");
        kotlin.jvm.internal.k0.p((Object)b$a, "kind");
        kotlin.jvm.internal.k0.p((Object)j0, "proto");
        kotlin.jvm.internal.k0.p((Object)k0, "nameResolver");
        kotlin.jvm.internal.k0.p((Object)l0, "typeTable");
        kotlin.jvm.internal.k0.p((Object)m2, "versionRequirementTable");
        if (a == null) {
            a = w0.a;
        }
        super(m, v0, g, e, b$a, a);
        this.j0 = j0;
        this.k0 = k0;
        this.l0 = l0;
        this.m0 = m2;
        this.n0 = n0;
        this.o0 = h.a.G;
    }
    
    @e
    public List<kotlin.reflect.jvm.internal.impl.metadata.deserialization.h> J0() {
        return a.a(this);
    }
    
    @e
    protected p M0(@e final m m, @f final y y, @e final b$a b$a, @f final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, @e final w0 w0) {
        kotlin.jvm.internal.k0.p((Object)m, "newOwner");
        kotlin.jvm.internal.k0.p((Object)b$a, "kind");
        kotlin.jvm.internal.k0.p((Object)g, "annotations");
        kotlin.jvm.internal.k0.p((Object)w0, "source");
        final v0 v0 = (v0)y;
        kotlin.reflect.jvm.internal.impl.name.e name;
        if (e == null) {
            name = ((j)this).getName();
            kotlin.jvm.internal.k0.o((Object)name, "name");
        }
        else {
            name = e;
        }
        final l l = new l(m, v0, g, name, b$a, this.r1(), this.d0(), this.W(), this.c0(), this.g0(), w0);
        ((p)l).Z0(((p)this).R0());
        l.o0 = this.q1();
        return (p)l;
    }
    
    @e
    public g W() {
        return this.l0;
    }
    
    @e
    public i c0() {
        return this.m0;
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.c d0() {
        return this.k0;
    }
    
    @f
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g g0() {
        return this.n0;
    }
    
    @e
    public h.a q1() {
        return this.o0;
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.metadata.a.i r1() {
        return this.j0;
    }
    
    @e
    public final f0 s1(@f final t0 t0, @f final t0 t2, @e final List<? extends b1> list, @e final List<? extends e1> list2, @f final c0 c0, @f final b0 b0, @e final u u, @e final Map<? extends a$a<?>, ?> map, @e final h.a o0) {
        kotlin.jvm.internal.k0.p((Object)list, "typeParameters");
        kotlin.jvm.internal.k0.p((Object)list2, "unsubstitutedValueParameters");
        kotlin.jvm.internal.k0.p((Object)u, "visibility");
        kotlin.jvm.internal.k0.p((Object)map, "userDataMap");
        kotlin.jvm.internal.k0.p((Object)o0, "isExperimentalCoroutineInReleaseEnvironment");
        final f0 p9 = super.p1(t0, t2, (List)list, (List)list2, c0, b0, u, (Map)map);
        kotlin.jvm.internal.k0.o((Object)p9, "super.initialize(\n            extensionReceiverParameter,\n            dispatchReceiverParameter,\n            typeParameters,\n            unsubstitutedValueParameters,\n            unsubstitutedReturnType,\n            modality,\n            visibility,\n            userDataMap\n        )");
        this.o0 = o0;
        return p9;
    }
}
