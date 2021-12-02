// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.lang.annotation.Annotation;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;

public final class b implements w0
{
    @e
    private final Annotation b;
    
    public b(@e final Annotation b) {
        k0.p((Object)b, "annotation");
        this.b = b;
    }
    
    @e
    public x0 a() {
        final x0 a = x0.a;
        k0.o((Object)a, "NO_SOURCE_FILE");
        return a;
    }
    
    @e
    public final Annotation d() {
        return this.b;
    }
}
