// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Collection;
import org.jetbrains.annotations.e;

public interface a extends n, q, y0<a>
{
    boolean K();
    
    @e
    a b();
    
    @e
    Collection<? extends a> g();
    
    @f
    c0 getReturnType();
    
    @e
    List<b1> getTypeParameters();
    
    @f
    t0 j0();
    
    @e
    List<e1> m();
    
    @f
     <V> V m0(final a<V> p0);
    
    @f
    t0 q0();
    
    public interface a<V>
    {
    }
}
