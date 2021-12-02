// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.n;
import kotlin.jvm.internal.k0;
import s6.a;
import kotlin.reflect.jvm.internal.impl.load.java.structure.l;
import org.jetbrains.annotations.e;
import s6.b;

public final class m implements b
{
    @e
    public static final m a;
    
    static {
        a = new m();
    }
    
    private m() {
    }
    
    @e
    @Override
    public s6.a a(@e final l l) {
        k0.p((Object)l, "javaElement");
        return new a((n)l);
    }
    
    public static final class a implements s6.a
    {
        @e
        private final n b;
        
        public a(@e final n b) {
            k0.p((Object)b, "javaElement");
            this.b = b;
        }
        
        @e
        public x0 a() {
            final x0 a = x0.a;
            k0.o((Object)a, "NO_SOURCE_FILE");
            return a;
        }
        
        @e
        public n d() {
            return this.b;
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(a.class.getName());
            sb.append(": ");
            sb.append(this.d());
            return sb.toString();
        }
    }
}
