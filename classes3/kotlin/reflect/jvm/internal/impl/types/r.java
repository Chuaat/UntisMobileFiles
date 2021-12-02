// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.typeUtil.a;
import kotlin.reflect.jvm.internal.impl.renderer.c;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.types.model.f;

public final class r extends w implements f
{
    @e
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g J;
    
    public r(@e final KotlinBuiltIns kotlinBuiltIns, @e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g j) {
        k0.p((Object)kotlinBuiltIns, "builtIns");
        k0.p((Object)j, "annotations");
        final kotlin.reflect.jvm.internal.impl.types.k0 nothingType = kotlinBuiltIns.getNothingType();
        k0.o((Object)nothingType, "builtIns.nothingType");
        final kotlin.reflect.jvm.internal.impl.types.k0 nullableAnyType = kotlinBuiltIns.getNullableAnyType();
        k0.o((Object)nullableAnyType, "builtIns.nullableAnyType");
        super(nothingType, nullableAnyType);
        this.J = j;
    }
    
    @Override
    public boolean O0() {
        return false;
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.types.k0 U0() {
        return this.W0();
    }
    
    @e
    @Override
    public String X0(@e final c c, @e final kotlin.reflect.jvm.internal.impl.renderer.f f) {
        k0.p((Object)c, "renderer");
        k0.p((Object)f, "options");
        return "dynamic";
    }
    
    @e
    public r Y0(final boolean b) {
        return this;
    }
    
    @e
    public r Z0(@e final kotlin.reflect.jvm.internal.impl.types.checker.g g) {
        k0.p((Object)g, "kotlinTypeRefiner");
        return this;
    }
    
    @e
    public r a1(@e final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g g) {
        k0.p((Object)g, "newAnnotations");
        return new r(a.e(this.U0()), g);
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.J;
    }
}
