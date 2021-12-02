// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class d0<T>
{
    @e
    private final String a;
    
    public d0(@e final String a) {
        k0.p(a, "name");
        this.a = a;
    }
    
    @e
    @Override
    public String toString() {
        return this.a;
    }
}
