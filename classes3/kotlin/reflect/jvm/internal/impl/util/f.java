// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;

public abstract class f implements kotlin.reflect.jvm.internal.impl.util.b
{
    @e
    private final String a;
    
    private f(final String a) {
        this.a = a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public String a(@e final y y) {
        return kotlin.reflect.jvm.internal.impl.util.b.a.a(this, y);
    }
    
    @e
    @Override
    public String getDescription() {
        return this.a;
    }
    
    public static final class a extends f
    {
        @e
        public static final a b;
        
        static {
            b = new a();
        }
        
        private a() {
            super("must be a member function", null);
        }
        
        @Override
        public boolean b(@e final y y) {
            k0.p((Object)y, "functionDescriptor");
            return ((kotlin.reflect.jvm.internal.impl.descriptors.a)y).j0() != null;
        }
    }
    
    public static final class b extends f
    {
        @e
        public static final b b;
        
        static {
            b = new b();
        }
        
        private b() {
            super("must be a member or an extension function", null);
        }
        
        @Override
        public boolean b(@e final y y) {
            k0.p((Object)y, "functionDescriptor");
            return ((kotlin.reflect.jvm.internal.impl.descriptors.a)y).j0() != null || ((kotlin.reflect.jvm.internal.impl.descriptors.a)y).q0() != null;
        }
    }
}
