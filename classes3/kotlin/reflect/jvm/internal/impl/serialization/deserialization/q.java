// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.types.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.metadata.a;

public interface q
{
    @e
    c0 a(@e final kotlin.reflect.jvm.internal.impl.metadata.a.q p0, @e final String p1, @e final k0 p2, @e final k0 p3);
    
    public static final class a implements q
    {
        @e
        public static final a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
        
        @e
        @Override
        public c0 a(@e final kotlin.reflect.jvm.internal.impl.metadata.a.q q, @e final String s, @e final k0 k0, @e final k0 k2) {
            kotlin.jvm.internal.k0.p((Object)q, "proto");
            kotlin.jvm.internal.k0.p((Object)s, "flexibleId");
            kotlin.jvm.internal.k0.p((Object)k0, "lowerBound");
            kotlin.jvm.internal.k0.p((Object)k2, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }
}
