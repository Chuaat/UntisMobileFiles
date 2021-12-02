// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.c0;

public final class l
{
    @e
    private final c0 a;
    private final boolean b;
    
    public l(@e final c0 a, final boolean b) {
        k0.p((Object)a, "type");
        this.a = a;
        this.b = b;
    }
    
    public final boolean a() {
        return this.b;
    }
    
    @e
    public final c0 b() {
        return this.a;
    }
}
