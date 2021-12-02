// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.m0;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.b;
import kotlin.j2;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.b$a;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.i;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.g;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b0;

public final class k extends b0 implements c
{
    @e
    private final kotlin.reflect.jvm.internal.impl.metadata.a.n i0;
    @e
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c j0;
    @e
    private final g k0;
    @e
    private final i l0;
    @f
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g m0;
    @e
    private h.a n0;
    
    public k(@e final m m, @f final q0 q0, @e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, @e final kotlin.reflect.jvm.internal.impl.descriptors.b0 b0, @e final u u, final boolean b2, @e final kotlin.reflect.jvm.internal.impl.name.e e, @e final b$a b$a, final boolean b3, final boolean b4, final boolean b5, final boolean b6, final boolean b7, @e final kotlin.reflect.jvm.internal.impl.metadata.a.n i0, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c j0, @e final g k0, @e final i l0, @f final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g m2) {
        kotlin.jvm.internal.k0.p((Object)m, "containingDeclaration");
        kotlin.jvm.internal.k0.p((Object)g, "annotations");
        kotlin.jvm.internal.k0.p((Object)b0, "modality");
        kotlin.jvm.internal.k0.p((Object)u, "visibility");
        kotlin.jvm.internal.k0.p((Object)e, "name");
        kotlin.jvm.internal.k0.p((Object)b$a, "kind");
        kotlin.jvm.internal.k0.p((Object)i0, "proto");
        kotlin.jvm.internal.k0.p((Object)j0, "nameResolver");
        kotlin.jvm.internal.k0.p((Object)k0, "typeTable");
        kotlin.jvm.internal.k0.p((Object)l0, "versionRequirementTable");
        super(m, q0, g, b0, u, b2, e, b$a, w0.a, b3, b4, b7, false, b5, b6);
        this.i0 = i0;
        this.j0 = j0;
        this.k0 = k0;
        this.l0 = l0;
        this.m0 = m2;
        this.n0 = h.a.G;
    }
    
    @e
    public List<kotlin.reflect.jvm.internal.impl.metadata.deserialization.h> J0() {
        return a.a(this);
    }
    
    @e
    protected b0 Q0(@e final m m, @e final kotlin.reflect.jvm.internal.impl.descriptors.b0 b0, @e final u u, @f final q0 q0, @e final b$a b$a, @e final kotlin.reflect.jvm.internal.impl.name.e e, @e final w0 w0) {
        kotlin.jvm.internal.k0.p((Object)m, "newOwner");
        kotlin.jvm.internal.k0.p((Object)b0, "newModality");
        kotlin.jvm.internal.k0.p((Object)u, "newVisibility");
        kotlin.jvm.internal.k0.p((Object)b$a, "kind");
        kotlin.jvm.internal.k0.p((Object)e, "newName");
        kotlin.jvm.internal.k0.p((Object)w0, "source");
        return new k(m, q0, ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.b)this).getAnnotations(), b0, u, ((m0)this).n0(), e, b$a, this.v0(), this.p(), this.isExternal(), this.S(), this.Q(), this.d1(), this.d0(), this.W(), this.c0(), this.g0());
    }
    
    @e
    public g W() {
        return this.k0;
    }
    
    @e
    public i c0() {
        return this.l0;
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.c d0() {
        return this.j0;
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.metadata.a.n d1() {
        return this.i0;
    }
    
    public final void e1(@f final c0 c0, @f final s0 s0, @f final w w, @f final w w2, @e final h.a n0) {
        kotlin.jvm.internal.k0.p((Object)n0, "isExperimentalCoroutineInReleaseEnvironment");
        super.W0(c0, s0, w, w2);
        final j2 a = j2.a;
        this.n0 = n0;
    }
    
    @f
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g g0() {
        return this.m0;
    }
    
    public boolean isExternal() {
        final Boolean g = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.C.g(this.d1().U());
        kotlin.jvm.internal.k0.o((Object)g, "IS_EXTERNAL_PROPERTY.get(proto.flags)");
        return g;
    }
}
