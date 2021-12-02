// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.e;
import java.util.List;

public interface m0 extends m
{
    @e
    List<h0> N();
    
    @e
    b f();
    
    boolean isEmpty();
    
    @e
    h x();
    
    @e
    e0 y0();
    
    public static final class a
    {
        public static boolean a(@e final m0 m0) {
            k0.p(m0, "this");
            return m0.N().isEmpty();
        }
    }
}
