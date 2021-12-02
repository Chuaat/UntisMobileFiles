// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.j;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.b;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.k;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.c1;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.h0;
import java.util.Collection;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.i;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.g;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.d;

public final class m extends d implements h
{
    @e
    private final n N;
    @e
    private final kotlin.reflect.jvm.internal.impl.metadata.a.r O;
    @e
    private final c P;
    @e
    private final g Q;
    @e
    private final i R;
    @f
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g S;
    private Collection<? extends h0> T;
    private k0 U;
    private k0 V;
    private List<? extends b1> W;
    private k0 X;
    @e
    private a Y;
    
    public m(@e final n n, @e final kotlin.reflect.jvm.internal.impl.descriptors.m m, @e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g, @e final kotlin.reflect.jvm.internal.impl.name.e e, @e final u u, @e final kotlin.reflect.jvm.internal.impl.metadata.a.r o, @e final c p10, @e final g q, @e final i r, @f final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g s) {
        kotlin.jvm.internal.k0.p((Object)n, "storageManager");
        kotlin.jvm.internal.k0.p((Object)m, "containingDeclaration");
        kotlin.jvm.internal.k0.p((Object)g, "annotations");
        kotlin.jvm.internal.k0.p((Object)e, "name");
        kotlin.jvm.internal.k0.p((Object)u, "visibility");
        kotlin.jvm.internal.k0.p((Object)o, "proto");
        kotlin.jvm.internal.k0.p((Object)p10, "nameResolver");
        kotlin.jvm.internal.k0.p((Object)q, "typeTable");
        kotlin.jvm.internal.k0.p((Object)r, "versionRequirementTable");
        final w0 a = w0.a;
        kotlin.jvm.internal.k0.o((Object)a, "NO_SOURCE");
        super(m, g, e, a, u);
        this.N = n;
        this.O = o;
        this.P = p10;
        this.Q = q;
        this.R = r;
        this.S = s;
        this.Y = h.a.G;
    }
    
    @e
    public k0 A() {
        final k0 x = this.X;
        if (x != null) {
            return x;
        }
        kotlin.jvm.internal.k0.S("defaultTypeImpl");
        throw null;
    }
    
    @e
    public List<kotlin.reflect.jvm.internal.impl.metadata.deserialization.h> J0() {
        return b.a(this);
    }
    
    @e
    protected List<b1> N0() {
        final List<? extends b1> w = this.W;
        if (w != null) {
            return (List<b1>)w;
        }
        kotlin.jvm.internal.k0.S("typeConstructorParameters");
        throw null;
    }
    
    @e
    public a P0() {
        return this.Y;
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.metadata.a.r Q0() {
        return this.O;
    }
    
    public final void R0(@e final List<? extends b1> list, @e final k0 u, @e final k0 v, @e final a y) {
        kotlin.jvm.internal.k0.p((Object)list, "declaredTypeParameters");
        kotlin.jvm.internal.k0.p((Object)u, "underlyingType");
        kotlin.jvm.internal.k0.p((Object)v, "expandedType");
        kotlin.jvm.internal.k0.p((Object)y, "isExperimentalCoroutineInReleaseEnvironment");
        this.O0((List)list);
        this.U = u;
        this.V = v;
        this.W = (List<? extends b1>)c1.d((kotlin.reflect.jvm.internal.impl.descriptors.i)this);
        this.X = this.G0();
        this.T = (Collection<? extends h0>)this.M0();
        this.Y = y;
    }
    
    @e
    public a1 S0(@e final d1 d1) {
        kotlin.jvm.internal.k0.p((Object)d1, "substitutor");
        if (d1.k()) {
            return (a1)this;
        }
        final n l0 = this.l0();
        final kotlin.reflect.jvm.internal.impl.descriptors.m c = ((k)this).c();
        kotlin.jvm.internal.k0.o((Object)c, "containingDeclaration");
        final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.b)this).getAnnotations();
        kotlin.jvm.internal.k0.o((Object)annotations, "annotations");
        final kotlin.reflect.jvm.internal.impl.name.e name = ((j)this).getName();
        kotlin.jvm.internal.k0.o((Object)name, "name");
        final m m = new m(l0, c, annotations, name, this.getVisibility(), this.Q0(), this.d0(), this.W(), this.c0(), this.g0());
        final List c2 = this.C();
        final k0 k0 = this.k0();
        final k1 i = k1.K;
        final c0 n = d1.n(k0, i);
        kotlin.jvm.internal.k0.o((Object)n, "substitutor.safeSubstitute(underlyingType, Variance.INVARIANT)");
        final k0 a = kotlin.reflect.jvm.internal.impl.types.c1.a(n);
        final c0 n2 = d1.n(this.Z(), i);
        kotlin.jvm.internal.k0.o((Object)n2, "substitutor.safeSubstitute(expandedType, Variance.INVARIANT)");
        m.R0(c2, a, kotlin.reflect.jvm.internal.impl.types.c1.a(n2), this.P0());
        return (a1)m;
    }
    
    @e
    public g W() {
        return this.Q;
    }
    
    @e
    public k0 Z() {
        final k0 v = this.V;
        if (v != null) {
            return v;
        }
        kotlin.jvm.internal.k0.S("expandedType");
        throw null;
    }
    
    @e
    public i c0() {
        return this.R;
    }
    
    @e
    public c d0() {
        return this.P;
    }
    
    @f
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g g0() {
        return this.S;
    }
    
    @e
    public k0 k0() {
        final k0 u = this.U;
        if (u != null) {
            return u;
        }
        kotlin.jvm.internal.k0.S("underlyingType");
        throw null;
    }
    
    @e
    protected n l0() {
        return this.N;
    }
    
    @f
    public kotlin.reflect.jvm.internal.impl.descriptors.e y() {
        final boolean a = e0.a(this.Z());
        kotlin.reflect.jvm.internal.impl.descriptors.e e = null;
        if (!a) {
            final kotlin.reflect.jvm.internal.impl.descriptors.h c = this.Z().N0().c();
            if (c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                e = (kotlin.reflect.jvm.internal.impl.descriptors.e)c;
            }
        }
        return e;
    }
}
