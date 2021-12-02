// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Collection;
import org.jetbrains.annotations.e;

public interface e1 extends n0, g1
{
    @e
    e1 H0(@e final kotlin.reflect.jvm.internal.impl.descriptors.a p0, @e final kotlin.reflect.jvm.internal.impl.name.e p1, final int p2);
    
    @e
    e1 b();
    
    boolean b0();
    
    @e
    kotlin.reflect.jvm.internal.impl.descriptors.a c();
    
    boolean f0();
    
    @e
    Collection<e1> g();
    
    int i();
    
    @f
    c0 p0();
    
    boolean x0();
    
    public static final class a
    {
        public static boolean a(@e final e1 e1) {
            k0.p(e1, "this");
            return false;
        }
    }
}
