// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;

public abstract class c
{
    private final boolean a;
    
    private c(final boolean a) {
        this.a = a;
    }
    
    public final boolean a() {
        return this.a;
    }
    
    public static final class a extends c
    {
        @e
        public static final a b;
        
        static {
            b = new a();
        }
        
        private a() {
            super(false, null);
        }
    }
    
    public static final class b extends c
    {
        @e
        private final String b;
        
        public b(@e final String b) {
            k0.p((Object)b, "error");
            super(false, null);
            this.b = b;
        }
    }
    
    public static final class c extends kotlin.reflect.jvm.internal.impl.util.c
    {
        @e
        public static final c b;
        
        static {
            b = new c();
        }
        
        private c() {
            super(true, null);
        }
    }
}
