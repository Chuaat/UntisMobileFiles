// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import java.util.List;
import org.jetbrains.annotations.e;

public interface r extends q, z
{
    boolean K();
    
    @e
    x getReturnType();
    
    @e
    List<a0> m();
    
    @f
    b q();
    
    public static final class a
    {
        public static boolean a(@e final r r) {
            k0.p((Object)r, "this");
            return r.q() != null;
        }
    }
}
