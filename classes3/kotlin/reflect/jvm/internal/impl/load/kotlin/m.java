// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.name.a;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.s;

public interface m extends s
{
    @f
    a a(@e final g p0);
    
    @f
    a c(@e final kotlin.reflect.jvm.internal.impl.name.a p0);
    
    public abstract static class a
    {
        private a() {
        }
        
        @f
        public final o a() {
            final boolean b = this instanceof b;
            final o o = null;
            b b2;
            if (b) {
                b2 = (b)this;
            }
            else {
                b2 = null;
            }
            o b3;
            if (b2 == null) {
                b3 = o;
            }
            else {
                b3 = b2.b();
            }
            return b3;
        }
        
        public static final class a extends m.a
        {
            @e
            private final byte[] a;
            
            @e
            public final byte[] b() {
                return this.a;
            }
        }
        
        public static final class b extends m.a
        {
            @e
            private final o a;
            @f
            private final byte[] b;
            
            public b(@e final o a, @f final byte[] b) {
                k0.p((Object)a, "kotlinJvmBinaryClass");
                super(null);
                this.a = a;
                this.b = b;
            }
            
            @e
            public final o b() {
                return this.a;
            }
        }
    }
}
