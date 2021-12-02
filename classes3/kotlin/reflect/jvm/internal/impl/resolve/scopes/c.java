// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import org.jetbrains.annotations.e;

public abstract class c
{
    public abstract int a();
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    public static final class a extends c
    {
        @e
        public static final a a;
        private static final int b;
        
        static {
            a = new a();
            final d.a c = d.c;
            b = (~(c.k() | c.e()) & c.b());
        }
        
        private a() {
        }
        
        @Override
        public int a() {
            return c.a.b;
        }
    }
    
    public static final class b extends c
    {
        @e
        public static final b a;
        
        static {
            a = new b();
        }
        
        private b() {
        }
        
        @Override
        public int a() {
            return 0;
        }
    }
}
