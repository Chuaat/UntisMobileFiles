// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Collection;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.e;

public interface w<T>
{
    @f
    T a(@org.jetbrains.annotations.e final e p0);
    
    @f
    String b(@org.jetbrains.annotations.e final e p0);
    
    @org.jetbrains.annotations.e
    c0 c(@org.jetbrains.annotations.e final Collection<c0> p0);
    
    @f
    String d(@org.jetbrains.annotations.e final e p0);
    
    @f
    c0 e(@org.jetbrains.annotations.e final c0 p0);
    
    boolean f();
    
    void g(@org.jetbrains.annotations.e final c0 p0, @org.jetbrains.annotations.e final e p1);
    
    public static final class a
    {
        @f
        public static <T> String a(@org.jetbrains.annotations.e final w<? extends T> w, @org.jetbrains.annotations.e final e e) {
            k0.p((Object)w, "this");
            k0.p((Object)e, "classDescriptor");
            return null;
        }
        
        @f
        public static <T> c0 b(@org.jetbrains.annotations.e final w<? extends T> w, @org.jetbrains.annotations.e final c0 c0) {
            k0.p((Object)w, "this");
            k0.p((Object)c0, "kotlinType");
            return null;
        }
        
        public static <T> boolean c(@org.jetbrains.annotations.e final w<? extends T> w) {
            k0.p((Object)w, "this");
            return true;
        }
    }
}
