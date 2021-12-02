// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g;

public final class q implements g
{
    @e
    private final o b;
    @org.jetbrains.annotations.f
    private final r<f> c;
    private final boolean d;
    @e
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f e;
    
    public q(@e final o b, @org.jetbrains.annotations.f final r<f> c, final boolean d, @e final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f e) {
        k0.p((Object)b, "binaryClass");
        k0.p((Object)e, "abiStability");
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @e
    public x0 a() {
        final x0 a = x0.a;
        k0.o((Object)a, "NO_SOURCE_FILE");
        return a;
    }
    
    @e
    @Override
    public String c() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Class '");
        sb.append(this.b.c().b().b());
        sb.append('\'');
        return sb.toString();
    }
    
    @e
    public final o d() {
        return this.b;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)q.class.getSimpleName());
        sb.append(": ");
        sb.append(this.b);
        return sb.toString();
    }
}
