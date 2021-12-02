// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.List;
import kotlin.collections.v;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.e;
import o6.a;

public interface g extends Iterable<c>, o6.a
{
    @e
    public static final a r = a.a;
    
    boolean B4(@e final kotlin.reflect.jvm.internal.impl.name.b p0);
    
    @f
    c a0(@e final kotlin.reflect.jvm.internal.impl.name.b p0);
    
    boolean isEmpty();
    
    public static final class a
    {
        static final /* synthetic */ a a;
        @e
        private static final g b;
        
        static {
            a = new a();
            b = new g() {
                @Override
                public boolean B4(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
                    return g.b.b(this, b);
                }
                
                @f
                public Void b(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
                    k0.p(b, "fqName");
                    return null;
                }
                
                @Override
                public boolean isEmpty() {
                    return true;
                }
                
                @e
                @Override
                public Iterator<c> iterator() {
                    return v.E().iterator();
                }
                
                @e
                @Override
                public String toString() {
                    return "EMPTY";
                }
            };
        }
        
        private a() {
        }
        
        @e
        public final g a(@e final List<? extends c> list) {
            k0.p(list, "annotations");
            g b;
            if (list.isEmpty()) {
                b = g.a.b;
            }
            else {
                b = new h(list);
            }
            return b;
        }
        
        @e
        public final g b() {
            return g.a.b;
        }
    }
    
    public static final class b
    {
        @f
        public static c a(@e final g g, @e final kotlin.reflect.jvm.internal.impl.name.b b) {
            k0.p(g, "this");
            k0.p(b, "fqName");
            for (final c next : g) {
                if (k0.g(next.f(), b)) {
                    return next;
                }
            }
            return null;
        }
        
        public static boolean b(@e final g g, @e final kotlin.reflect.jvm.internal.impl.name.b b) {
            k0.p(g, "this");
            k0.p(b, "fqName");
            return g.a0(b) != null;
        }
    }
}
