// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import java.util.List;
import org.jetbrains.annotations.f;

public final class k
{
    @f
    private final s a;
    @e
    private final List<s> b;
    
    public k() {
        this(null, null, 3, null);
    }
    
    public k(@f final s a, @e final List<s> b) {
        k0.p((Object)b, "parametersInfo");
        this.a = a;
        this.b = b;
    }
    
    @e
    public final List<s> a() {
        return this.b;
    }
    
    @f
    public final s b() {
        return this.a;
    }
}
