// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.p;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.b$a;
import kotlin.reflect.jvm.internal.impl.descriptors.l;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.i;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.g;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.f;

public final class d extends f implements c
{
    @e
    private final kotlin.reflect.jvm.internal.impl.metadata.a.d m0;
    @e
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c n0;
    @e
    private final g o0;
    @e
    private final i p0;
    @org.jetbrains.annotations.f
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g q0;
    @e
    private h.a r0;
    
    public d(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @org.jetbrains.annotations.f final l l, @e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, final boolean b, @e final b$a b$a, @e final kotlin.reflect.jvm.internal.impl.metadata.a.d m0, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c n0, @e final g o0, @e final i p11, @org.jetbrains.annotations.f final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g q0, @org.jetbrains.annotations.f w0 a) {
        k0.p((Object)e, "containingDeclaration");
        k0.p((Object)g, "annotations");
        k0.p((Object)b$a, "kind");
        k0.p((Object)m0, "proto");
        k0.p((Object)n0, "nameResolver");
        k0.p((Object)o0, "typeTable");
        k0.p((Object)p11, "versionRequirementTable");
        if (a == null) {
            a = w0.a;
        }
        super(e, l, g, b, b$a, a);
        this.m0 = m0;
        this.n0 = n0;
        this.o0 = o0;
        this.p0 = p11;
        this.q0 = q0;
        this.r0 = h.a.G;
    }
    
    @e
    public List<kotlin.reflect.jvm.internal.impl.metadata.deserialization.h> J0() {
        return a.a(this);
    }
    
    public boolean T() {
        return false;
    }
    
    @e
    public g W() {
        return this.o0;
    }
    
    @e
    public i c0() {
        return this.p0;
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.metadata.deserialization.c d0() {
        return this.n0;
    }
    
    @org.jetbrains.annotations.f
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g g0() {
        return this.q0;
    }
    
    public boolean isExternal() {
        return false;
    }
    
    public boolean isInline() {
        return false;
    }
    
    public boolean isSuspend() {
        return false;
    }
    
    @e
    protected d s1(@e final m m, @org.jetbrains.annotations.f final y y, @e final b$a b$a, @org.jetbrains.annotations.f final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, @e final w0 w0) {
        k0.p((Object)m, "newOwner");
        k0.p((Object)b$a, "kind");
        k0.p((Object)g, "annotations");
        k0.p((Object)w0, "source");
        final d d = new d((kotlin.reflect.jvm.internal.impl.descriptors.e)m, (l)y, g, super.j0, b$a, this.u1(), this.d0(), this.W(), this.c0(), this.g0(), w0);
        ((p)d).Z0(((p)this).R0());
        d.v1(this.t1());
        return d;
    }
    
    @e
    public h.a t1() {
        return this.r0;
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.metadata.a.d u1() {
        return this.m0;
    }
    
    public void v1(@e final h.a r0) {
        k0.p((Object)r0, "<set-?>");
        this.r0 = r0;
    }
}
