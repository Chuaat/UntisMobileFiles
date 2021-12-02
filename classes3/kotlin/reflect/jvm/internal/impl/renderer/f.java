// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.name.b;
import java.util.Set;

public interface f
{
    void a(@e final Set<b> p0);
    
    void b(final boolean p0);
    
    void c(@e final Set<? extends kotlin.reflect.jvm.internal.impl.renderer.e> p0);
    
    void d(@e final k p0);
    
    void e(final boolean p0);
    
    void f(final boolean p0);
    
    boolean g();
    
    void h(@e final kotlin.reflect.jvm.internal.impl.renderer.b p0);
    
    void i(final boolean p0);
    
    void j(final boolean p0);
    
    void k(final boolean p0);
    
    void l(final boolean p0);
    
    void m(@e final m p0);
    
    void n(@e final kotlin.reflect.jvm.internal.impl.renderer.a p0);
    
    @e
    Set<b> o();
    
    boolean p();
    
    @e
    kotlin.reflect.jvm.internal.impl.renderer.a q();
    
    void r(final boolean p0);
    
    public static final class a
    {
        public static boolean a(@e final f f) {
            k0.p((Object)f, "this");
            return f.q().b();
        }
        
        public static boolean b(@e final f f) {
            k0.p((Object)f, "this");
            return f.q().d();
        }
    }
}
