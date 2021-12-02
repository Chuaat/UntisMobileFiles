// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.y;

public interface k
{
    @f
    b1 a(@e final y p0);
    
    public static final class a implements k
    {
        @e
        public static final a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
        
        @f
        @Override
        public b1 a(@e final y y) {
            k0.p((Object)y, "javaTypeParameter");
            return null;
        }
    }
}
