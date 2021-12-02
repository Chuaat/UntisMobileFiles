// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.storage.f;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

final class b extends KotlinBuiltIns
{
    @org.jetbrains.annotations.e
    public static final a g;
    @org.jetbrains.annotations.e
    private static final KotlinBuiltIns h;
    
    static {
        g = new a(null);
        h = new b();
    }
    
    private b() {
        super((n)new f("FallbackBuiltIns"));
        this.f(true);
    }
    
    public static final /* synthetic */ KotlinBuiltIns r() {
        return b.h;
    }
    
    @org.jetbrains.annotations.e
    protected c.a s() {
        return kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c.a.a;
    }
    
    public static final class a
    {
        private a() {
        }
        
        @org.jetbrains.annotations.e
        public final KotlinBuiltIns a() {
            return b.r();
        }
    }
}
