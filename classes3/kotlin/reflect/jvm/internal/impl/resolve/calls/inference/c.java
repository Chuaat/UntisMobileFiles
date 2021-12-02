// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Collection;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.checker.j;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.y0;

public final class c implements b
{
    @e
    private final y0 a;
    @f
    private j b;
    
    public c(@e final y0 a) {
        k0.p((Object)a, "projection");
        this.a = a;
        this.a().c();
        final k1 k = k1.K;
    }
    
    @e
    @Override
    public y0 a() {
        return this.a;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @f
    public Void e() {
        return null;
    }
    
    @f
    public final j f() {
        return this.b;
    }
    
    @e
    public c g(@e final g g) {
        k0.p((Object)g, "kotlinTypeRefiner");
        final y0 b = this.a().b(g);
        k0.o((Object)b, "projection.refine(kotlinTypeRefiner)");
        return new c(b);
    }
    
    @e
    @Override
    public List<b1> getParameters() {
        return (List<b1>)v.E();
    }
    
    public final void h(@f final j b) {
        this.b = b;
    }
    
    @e
    @Override
    public Collection<c0> k() {
        c0 c0;
        if (this.a().c() == k1.M) {
            c0 = this.a().a();
        }
        else {
            c0 = this.w().getNullableAnyType();
        }
        k0.o((Object)c0, "if (projection.projectionKind == Variance.OUT_VARIANCE)\n            projection.type\n        else\n            builtIns.nullableAnyType");
        return (Collection<c0>)v.k((Object)c0);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CapturedTypeConstructor(");
        sb.append(this.a());
        sb.append(')');
        return sb.toString();
    }
    
    @e
    @Override
    public KotlinBuiltIns w() {
        final KotlinBuiltIns w = this.a().a().N0().w();
        k0.o((Object)w, "projection.type.constructor.builtIns");
        return w;
    }
}
