// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.m;

public final class o extends d implements m
{
    @e
    private final Enum<?> c;
    
    public o(@f final kotlin.reflect.jvm.internal.impl.name.e e, @e final Enum<?> c) {
        k0.p((Object)c, "value");
        super(e);
        this.c = c;
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.name.a b() {
        Class<?> clazz = this.c.getClass();
        if (!clazz.isEnum()) {
            clazz = clazz.getEnclosingClass();
        }
        k0.o((Object)clazz, "enumClass");
        return b.b(clazz);
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.name.e d() {
        return kotlin.reflect.jvm.internal.impl.name.e.i(this.c.name());
    }
}
