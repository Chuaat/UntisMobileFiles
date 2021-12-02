// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.collections.v;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.e$a;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c$a;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.a$a;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.checker.l;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.a;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.storage.n;

public final class j
{
    @e
    private final n a;
    @e
    private final e0 b;
    @e
    private final k c;
    @e
    private final g d;
    @e
    private final c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> e;
    @e
    private final i0 f;
    @e
    private final t g;
    @e
    private final p h;
    @e
    private final kotlin.reflect.jvm.internal.impl.incremental.components.c i;
    @e
    private final q j;
    @e
    private final Iterable<b> k;
    @e
    private final g0 l;
    @e
    private final i m;
    @e
    private final a n;
    @e
    private final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c o;
    @e
    private final kotlin.reflect.jvm.internal.impl.protobuf.g p;
    @e
    private final l q;
    @e
    private final u6.a r;
    @e
    private final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.e s;
    @e
    private final h t;
    
    public j(@e final n a, @e final e0 b, @e final k c, @e final g d, @e final c<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> e, @e final i0 f, @e final t g, @e final p h, @e final kotlin.reflect.jvm.internal.impl.incremental.components.c i, @e final q j, @e final Iterable<? extends b> k, @e final g0 l, @e final i m, @e final a n, @e final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c o, @e final kotlin.reflect.jvm.internal.impl.protobuf.g p19, @e final l q, @e final u6.a r, @e final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.e s) {
        k0.p((Object)a, "storageManager");
        k0.p((Object)b, "moduleDescriptor");
        k0.p((Object)c, "configuration");
        k0.p((Object)d, "classDataFinder");
        k0.p((Object)e, "annotationAndConstantLoader");
        k0.p((Object)f, "packageFragmentProvider");
        k0.p((Object)g, "localClassifierTypeSettings");
        k0.p((Object)h, "errorReporter");
        k0.p((Object)i, "lookupTracker");
        k0.p((Object)j, "flexibleTypeDeserializer");
        k0.p((Object)k, "fictitiousClassDescriptorFactories");
        k0.p((Object)l, "notFoundClasses");
        k0.p((Object)m, "contractDeserializer");
        k0.p((Object)n, "additionalClassPartsProvider");
        k0.p((Object)o, "platformDependentDeclarationFilter");
        k0.p((Object)p19, "extensionRegistryLite");
        k0.p((Object)q, "kotlinTypeChecker");
        k0.p((Object)r, "samConversionResolver");
        k0.p((Object)s, "platformDependentTypeTransformer");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>)e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = (Iterable<b>)k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p19;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = new h(this);
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.l a(@e final h0 h0, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c c, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g g, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.i i, @e final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a a, @f final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g g2) {
        k0.p((Object)h0, "descriptor");
        k0.p((Object)c, "nameResolver");
        k0.p((Object)g, "typeTable");
        k0.p((Object)i, "versionRequirementTable");
        k0.p((Object)a, "metadataVersion");
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.l(this, c, (m)h0, g, i, a, g2, null, v.E());
    }
    
    @f
    public final kotlin.reflect.jvm.internal.impl.descriptors.e b(@e final kotlin.reflect.jvm.internal.impl.name.a a) {
        k0.p((Object)a, "classId");
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.h.e(this.t, a, null, 2, null);
    }
    
    @e
    public final a c() {
        return this.n;
    }
    
    @e
    public final c<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> d() {
        return this.e;
    }
    
    @e
    public final g e() {
        return this.d;
    }
    
    @e
    public final h f() {
        return this.t;
    }
    
    @e
    public final k g() {
        return this.c;
    }
    
    @e
    public final i h() {
        return this.m;
    }
    
    @e
    public final p i() {
        return this.h;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.protobuf.g j() {
        return this.p;
    }
    
    @e
    public final Iterable<b> k() {
        return this.k;
    }
    
    @e
    public final q l() {
        return this.j;
    }
    
    @e
    public final l m() {
        return this.q;
    }
    
    @e
    public final t n() {
        return this.g;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.incremental.components.c o() {
        return this.i;
    }
    
    @e
    public final e0 p() {
        return this.b;
    }
    
    @e
    public final g0 q() {
        return this.l;
    }
    
    @e
    public final i0 r() {
        return this.f;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c s() {
        return this.o;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.e t() {
        return this.s;
    }
    
    @e
    public final n u() {
        return this.a;
    }
}
