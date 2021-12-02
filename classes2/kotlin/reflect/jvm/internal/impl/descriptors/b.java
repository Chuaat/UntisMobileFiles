// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.e;
import java.util.Collection;

public interface b extends kotlin.reflect.jvm.internal.impl.descriptors.a, a0
{
    void A0(@e final Collection<? extends b> p0);
    
    @e
    b b();
    
    @e
    Collection<? extends b> g();
    
    @e
    a n();
    
    @e
    b o0(final m p0, final b0 p1, final u p2, final a p3, final boolean p4);
    
    public enum a
    {
        G, 
        H, 
        I, 
        J;
        
        public boolean b() {
            return this != a.H;
        }
    }
}
