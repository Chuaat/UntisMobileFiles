// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.y0;
import java.util.List;
import org.jetbrains.annotations.e;

public final class o0
{
    @e
    private final i a;
    @e
    private final List<y0> b;
    @f
    private final o0 c;
    
    public o0(@e final i a, @e final List<? extends y0> b, @f final o0 c) {
        k0.p(a, "classifierDescriptor");
        k0.p(b, "arguments");
        this.a = a;
        this.b = (List<y0>)b;
        this.c = c;
    }
    
    @e
    public final List<y0> a() {
        return this.b;
    }
    
    @e
    public final i b() {
        return this.a;
    }
    
    @f
    public final o0 c() {
        return this.c;
    }
}
