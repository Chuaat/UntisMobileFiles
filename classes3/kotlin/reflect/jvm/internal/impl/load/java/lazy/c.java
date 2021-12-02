// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import org.jetbrains.annotations.e;

public interface c
{
    @e
    public static final a a = c.a.a;
    
    boolean a();
    
    boolean b();
    
    boolean c();
    
    public static final class a
    {
        static final /* synthetic */ a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
    }
    
    public static final class b implements c
    {
        @e
        public static final b b;
        
        static {
            b = new b();
        }
        
        private b() {
        }
        
        @Override
        public boolean a() {
            return false;
        }
        
        @Override
        public boolean b() {
            return false;
        }
        
        @Override
        public boolean c() {
            return false;
        }
    }
}
