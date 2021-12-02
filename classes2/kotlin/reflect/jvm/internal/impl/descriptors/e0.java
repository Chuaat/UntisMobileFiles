// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.k0;
import java.util.Collection;
import n6.l;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;

public interface e0 extends m
{
    @f
     <T> T I0(@e final d0<T> p0);
    
    @e
    m0 R(@e final b p0);
    
    boolean i0(@e final e0 p0);
    
    @e
    KotlinBuiltIns w();
    
    @e
    List<e0> w0();
    
    @e
    Collection<b> z(@e final b p0, @e final l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> p1);
    
    public static final class a
    {
        public static <R, D> R a(@e final e0 e0, @e final o<R, D> o, final D n) {
            k0.p(e0, "this");
            k0.p(o, "visitor");
            return o.j(e0, n);
        }
        
        @f
        public static m b(@e final e0 e0) {
            k0.p(e0, "this");
            return null;
        }
    }
}
