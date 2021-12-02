// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.c0;

final class s
{
    @e
    private final c0 a;
    @f
    private final s b;
    
    public s(@e final c0 a, @f final s b) {
        k0.p((Object)a, "type");
        this.a = a;
        this.b = b;
    }
    
    @f
    public final s a() {
        return this.b;
    }
    
    @e
    public final c0 b() {
        return this.a;
    }
}
