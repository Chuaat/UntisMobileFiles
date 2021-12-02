// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.c;
import kotlin.reflect.jvm.internal.impl.load.java.w;
import kotlin.b0;
import org.jetbrains.annotations.e;

public final class g
{
    @e
    private final b a;
    @e
    private final k b;
    @e
    private final b0<w> c;
    @e
    private final b0 d;
    @e
    private final c e;
    
    public g(@e final b a, @e final k b, @e final b0<w> b2) {
        k0.p((Object)a, "components");
        k0.p((Object)b, "typeParameterResolver");
        k0.p((Object)b2, "delegateForDefaultTypeQualifiers");
        this.a = a;
        this.b = b;
        this.c = b2;
        this.d = b2;
        this.e = new c(this, b);
    }
    
    @e
    public final b a() {
        return this.a;
    }
    
    @f
    public final w b() {
        return (w)this.d.getValue();
    }
    
    @e
    public final b0<w> c() {
        return this.c;
    }
    
    @e
    public final e0 d() {
        return this.a.l();
    }
    
    @e
    public final n e() {
        return this.a.t();
    }
    
    @e
    public final k f() {
        return this.b;
    }
    
    @e
    public final c g() {
        return this.e;
    }
}
