// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.b;

public final class j implements i
{
    public b a;
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.e a(@e final g g) {
        k0.p((Object)g, "javaClass");
        return this.b().b(g);
    }
    
    @e
    public final b b() {
        final b a = this.a;
        if (a != null) {
            return a;
        }
        k0.S("resolver");
        throw null;
    }
    
    public final void c(@e final b a) {
        k0.p((Object)a, "<set-?>");
        this.a = a;
    }
}
