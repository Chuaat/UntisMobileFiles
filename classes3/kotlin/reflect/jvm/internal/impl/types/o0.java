// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import org.jetbrains.annotations.e;

public final class o0 extends z0
{
    @e
    private final c0 a;
    
    public o0(@e final KotlinBuiltIns kotlinBuiltIns) {
        k0.p((Object)kotlinBuiltIns, "kotlinBuiltIns");
        final kotlin.reflect.jvm.internal.impl.types.k0 nullableAnyType = kotlinBuiltIns.getNullableAnyType();
        k0.o((Object)nullableAnyType, "kotlinBuiltIns.nullableAnyType");
        this.a = nullableAnyType;
    }
    
    @e
    @Override
    public c0 a() {
        return this.a;
    }
    
    @e
    @Override
    public y0 b(@e final g g) {
        k0.p((Object)g, "kotlinTypeRefiner");
        return this;
    }
    
    @e
    @Override
    public k1 c() {
        return k1.M;
    }
    
    @Override
    public boolean d() {
        return true;
    }
}
