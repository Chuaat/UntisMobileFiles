// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.n;

public interface f
{
    @org.jetbrains.annotations.f
    g<?> a(@e final n p0, @e final q0 p1);
    
    public static final class a implements f
    {
        @e
        public static final a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
        
        @org.jetbrains.annotations.f
        @Override
        public g<?> a(@e final n n, @e final q0 q0) {
            k0.p((Object)n, "field");
            k0.p((Object)q0, "descriptor");
            return null;
        }
    }
}
