// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.o;

public final class q extends d implements o
{
    @e
    private final Object c;
    
    public q(@f final kotlin.reflect.jvm.internal.impl.name.e e, @e final Object c) {
        k0.p(c, "value");
        super(e);
        this.c = c;
    }
    
    @e
    @Override
    public Object getValue() {
        return this.c;
    }
}
