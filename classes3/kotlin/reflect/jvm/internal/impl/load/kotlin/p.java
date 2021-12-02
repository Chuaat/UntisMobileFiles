// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;

public final class p implements w0
{
    @e
    private final h b;
    
    public p(@e final h b) {
        k0.p((Object)b, "packageFragment");
        this.b = b;
    }
    
    @e
    public x0 a() {
        final x0 a = x0.a;
        k0.o((Object)a, "NO_SOURCE_FILE");
        return a;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(": ");
        sb.append(this.b.N0().keySet());
        return sb.toString();
    }
}
