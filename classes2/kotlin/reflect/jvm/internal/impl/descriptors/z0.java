// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.l;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Collection;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.types.w0;

public interface z0
{
    @e
    Collection<c0> a(@e final w0 p0, @e final Collection<? extends c0> p1, @e final l<? super w0, ? extends Iterable<? extends c0>> p2, @e final l<? super c0, j2> p3);
    
    public static final class a implements z0
    {
        @e
        public static final a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
        
        @e
        @Override
        public Collection<c0> a(@e final w0 w0, @e final Collection<? extends c0> collection, @e final l<? super w0, ? extends Iterable<? extends c0>> l, @e final l<? super c0, j2> i) {
            k0.p(w0, "currentTypeConstructor");
            k0.p(collection, "superTypes");
            k0.p(l, "neighbors");
            k0.p(i, "reportLoop");
            return (Collection<c0>)collection;
        }
    }
}
