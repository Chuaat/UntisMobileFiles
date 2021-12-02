// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.a$a;
import kotlin.s0;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.g;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import org.jetbrains.annotations.e;

public interface i
{
    @e
    public static final a a = i.a.a;
    
    @f
    s0<a$a<?>, Object> a(@e final kotlin.reflect.jvm.internal.impl.metadata.a.i p0, @e final y p1, @e final g p2, @e final b0 p3);
    
    public static final class a
    {
        static final /* synthetic */ a a;
        @e
        private static final i b;
        
        static {
            a = new a();
            b = new i() {
                @f
                @Override
                public s0 a(@e final kotlin.reflect.jvm.internal.impl.metadata.a.i i, @e final y y, @e final g g, @e final b0 b0) {
                    k0.p((Object)i, "proto");
                    k0.p((Object)y, "ownerFunction");
                    k0.p((Object)g, "typeTable");
                    k0.p((Object)b0, "typeDeserializer");
                    return null;
                }
            };
        }
        
        private a() {
        }
        
        @e
        public final i a() {
            return i.a.b;
        }
    }
}
