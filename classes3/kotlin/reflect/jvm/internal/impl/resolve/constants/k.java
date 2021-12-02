// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.types.u;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.j2;

public abstract class k extends g<j2>
{
    @e
    public static final a b;
    
    static {
        b = new a(null);
    }
    
    public k() {
        super(j2.a);
    }
    
    @e
    public j2 c() {
        throw new UnsupportedOperationException();
    }
    
    public static final class a
    {
        private a() {
        }
        
        @e
        public final k a(@e final String s) {
            k0.p((Object)s, "message");
            return new b(s);
        }
    }
    
    public static final class b extends k
    {
        @e
        private final String c;
        
        public b(@e final String c) {
            k0.p((Object)c, "message");
            this.c = c;
        }
        
        @e
        public kotlin.reflect.jvm.internal.impl.types.k0 d(@e final e0 e0) {
            k0.p((Object)e0, "module");
            final kotlin.reflect.jvm.internal.impl.types.k0 j = u.j(this.c);
            k0.o((Object)j, "createErrorType(message)");
            return j;
        }
        
        @e
        @Override
        public String toString() {
            return this.c;
        }
    }
}
