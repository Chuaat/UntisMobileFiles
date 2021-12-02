// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.r;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.l;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.incremental.components.c;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.u;
import u6.a;
import kotlin.reflect.jvm.internal.impl.load.java.components.f;
import kotlin.reflect.jvm.internal.impl.load.java.components.g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.p;
import kotlin.reflect.jvm.internal.impl.load.java.components.j;
import kotlin.reflect.jvm.internal.impl.load.kotlin.m;
import kotlin.reflect.jvm.internal.impl.load.java.q;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.storage.n;

public final class b
{
    @e
    private final n a;
    @e
    private final q b;
    @e
    private final m c;
    @e
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.e d;
    @e
    private final j e;
    @e
    private final p f;
    @e
    private final g g;
    @e
    private final f h;
    @e
    private final a i;
    @e
    private final s6.b j;
    @e
    private final i k;
    @e
    private final u l;
    @e
    private final z0 m;
    @e
    private final c n;
    @e
    private final e0 o;
    @e
    private final ReflectionTypes p;
    @e
    private final kotlin.reflect.jvm.internal.impl.load.java.c q;
    @e
    private final l r;
    @e
    private final r s;
    @e
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.c t;
    @e
    private final kotlin.reflect.jvm.internal.impl.types.checker.l u;
    @e
    private final kotlin.reflect.jvm.internal.impl.utils.e v;
    
    public b(@e final n a, @e final q b, @e final m c, @e final kotlin.reflect.jvm.internal.impl.load.kotlin.e d, @e final j e, @e final p f, @e final g g, @e final f h, @e final a i, @e final s6.b j, @e final i k, @e final u l, @e final z0 m, @e final c n, @e final e0 o, @e final ReflectionTypes p22, @e final kotlin.reflect.jvm.internal.impl.load.java.c q, @e final l r, @e final r s, @e final kotlin.reflect.jvm.internal.impl.load.java.lazy.c t, @e final kotlin.reflect.jvm.internal.impl.types.checker.l u, @e final kotlin.reflect.jvm.internal.impl.utils.e v) {
        k0.p((Object)a, "storageManager");
        k0.p((Object)b, "finder");
        k0.p((Object)c, "kotlinClassFinder");
        k0.p((Object)d, "deserializedDescriptorResolver");
        k0.p((Object)e, "signaturePropagator");
        k0.p((Object)f, "errorReporter");
        k0.p((Object)g, "javaResolverCache");
        k0.p((Object)h, "javaPropertyInitializerEvaluator");
        k0.p((Object)i, "samConversionResolver");
        k0.p((Object)j, "sourceElementFactory");
        k0.p((Object)k, "moduleClassResolver");
        k0.p((Object)l, "packagePartProvider");
        k0.p((Object)m, "supertypeLoopChecker");
        k0.p((Object)n, "lookupTracker");
        k0.p((Object)o, "module");
        k0.p((Object)p22, "reflectionTypes");
        k0.p((Object)q, "annotationTypeQualifierResolver");
        k0.p((Object)r, "signatureEnhancement");
        k0.p((Object)s, "javaClassesTracker");
        k0.p((Object)t, "settings");
        k0.p((Object)u, "kotlinTypeChecker");
        k0.p((Object)v, "javaTypeEnhancementState");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p22;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.load.java.c a() {
        return this.q;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.e b() {
        return this.d;
    }
    
    @e
    public final p c() {
        return this.f;
    }
    
    @e
    public final q d() {
        return this.b;
    }
    
    @e
    public final r e() {
        return this.s;
    }
    
    @e
    public final f f() {
        return this.h;
    }
    
    @e
    public final g g() {
        return this.g;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.utils.e h() {
        return this.v;
    }
    
    @e
    public final m i() {
        return this.c;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.types.checker.l j() {
        return this.u;
    }
    
    @e
    public final c k() {
        return this.n;
    }
    
    @e
    public final e0 l() {
        return this.o;
    }
    
    @e
    public final i m() {
        return this.k;
    }
    
    @e
    public final u n() {
        return this.l;
    }
    
    @e
    public final ReflectionTypes o() {
        return this.p;
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.c p() {
        return this.t;
    }
    
    @e
    public final l q() {
        return this.r;
    }
    
    @e
    public final j r() {
        return this.e;
    }
    
    @e
    public final s6.b s() {
        return this.j;
    }
    
    @e
    public final n t() {
        return this.a;
    }
    
    @e
    public final z0 u() {
        return this.m;
    }
    
    @e
    public final b v(@e final g g) {
        k0.p((Object)g, "javaResolverCache");
        return new b(this.a, this.b, this.c, this.d, this.e, this.f, g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v);
    }
}
