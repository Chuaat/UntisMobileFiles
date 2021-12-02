// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class g
{
    private static volatile boolean b = false;
    private static final g c;
    private final Map<a, i.g<?, ?>> a;
    
    static {
        c = new g(true);
    }
    
    g() {
        this.a = new HashMap<a, i.g<?, ?>>();
    }
    
    private g(final boolean b) {
        this.a = Collections.emptyMap();
    }
    
    public static g c() {
        return g.c;
    }
    
    public static g d() {
        return new g();
    }
    
    public final void a(final i.g<?, ?> g) {
        this.a.put(new a(g.b(), g.d()), g);
    }
    
    public <ContainingType extends q> i.g<ContainingType, ?> b(final ContainingType containingType, final int n) {
        return (i.g<ContainingType, ?>)(i.g)this.a.get(new a(containingType, n));
    }
    
    private static final class a
    {
        private final Object a;
        private final int b;
        
        a(final Object a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public boolean equals(final Object o) {
            final boolean b = o instanceof a;
            final boolean b2 = false;
            if (!b) {
                return false;
            }
            final a a = (a)o;
            boolean b3 = b2;
            if (this.a == a.a) {
                b3 = b2;
                if (this.b == a.b) {
                    b3 = true;
                }
            }
            return b3;
        }
        
        @Override
        public int hashCode() {
            return System.identityHashCode(this.a) * 65535 + this.b;
        }
    }
}
