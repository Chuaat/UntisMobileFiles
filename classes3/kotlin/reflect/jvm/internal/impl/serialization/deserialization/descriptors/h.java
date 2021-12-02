// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.i;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.g;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.protobuf.q;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.v;

public interface h extends v, a0, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.a
{
    @e
    q J();
    
    @e
    List<kotlin.reflect.jvm.internal.impl.metadata.deserialization.h> J0();
    
    @e
    g W();
    
    @e
    i c0();
    
    @e
    c d0();
    
    @f
    kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g g0();
    
    public enum a
    {
        G, 
        H, 
        I;
    }
    
    public static final class b
    {
        @e
        public static List<kotlin.reflect.jvm.internal.impl.metadata.deserialization.h> a(@e final h h) {
            k0.p((Object)h, "this");
            return h.f.a(h.J(), h.d0(), h.c0());
        }
    }
}
