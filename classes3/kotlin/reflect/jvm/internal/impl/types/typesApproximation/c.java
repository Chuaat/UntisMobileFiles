// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;

final class c
{
    @e
    private final b1 a;
    @e
    private final c0 b;
    @e
    private final c0 c;
    
    public c(@e final b1 a, @e final c0 b, @e final c0 c) {
        k0.p((Object)a, "typeParameter");
        k0.p((Object)b, "inProjection");
        k0.p((Object)c, "outProjection");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @e
    public final c0 a() {
        return this.b;
    }
    
    @e
    public final c0 b() {
        return this.c;
    }
    
    @e
    public final b1 c() {
        return this.a;
    }
    
    public final boolean d() {
        return f.a.d(this.b, this.c);
    }
}
