// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import kotlin.reflect.jvm.internal.impl.load.java.structure.x;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.h;

public final class k extends d implements h
{
    @e
    private final Class<?> c;
    
    public k(@f final kotlin.reflect.jvm.internal.impl.name.e e, @e final Class<?> c) {
        k0.p((Object)c, "klass");
        super(e);
        this.c = c;
    }
    
    @e
    @Override
    public x c() {
        return w.a.a(this.c);
    }
}
