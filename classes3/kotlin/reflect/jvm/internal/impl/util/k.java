// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import n6.l;
import org.jetbrains.annotations.e;

public abstract class k implements kotlin.reflect.jvm.internal.impl.util.b
{
    @e
    private final String a;
    @e
    private final l<KotlinBuiltIns, c0> b;
    @e
    private final String c;
    
    private k(final String a, final l<? super KotlinBuiltIns, ? extends c0> b) {
        this.a = a;
        this.b = (l<KotlinBuiltIns, c0>)b;
        this.c = k0.C("must return ", (Object)a);
    }
    
    @f
    @Override
    public String a(@e final y y) {
        return kotlin.reflect.jvm.internal.impl.util.b.a.a(this, y);
    }
    
    @Override
    public boolean b(@e final y y) {
        k0.p((Object)y, "functionDescriptor");
        return k0.g((Object)((kotlin.reflect.jvm.internal.impl.descriptors.a)y).getReturnType(), this.b.invoke((Object)kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.g((m)y)));
    }
    
    @e
    @Override
    public String getDescription() {
        return this.c;
    }
    
    public static final class a extends k
    {
        @e
        public static final a d;
        
        static {
            d = new a();
        }
        
        private a() {
            super("Boolean", (l)k$a$a.G, null);
        }
    }
    
    public static final class b extends k
    {
        @e
        public static final b d;
        
        static {
            d = new b();
        }
        
        private b() {
            super("Int", (l)k$b$a.G, null);
        }
    }
    
    public static final class c extends k
    {
        @e
        public static final c d;
        
        static {
            d = new c();
        }
        
        private c() {
            super("Unit", (l)k$c$a.G, null);
        }
    }
}
