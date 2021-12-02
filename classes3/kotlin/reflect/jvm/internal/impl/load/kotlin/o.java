// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;

public interface o
{
    @org.jetbrains.annotations.e
    kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a();
    
    @org.jetbrains.annotations.e
    String b();
    
    @org.jetbrains.annotations.e
    kotlin.reflect.jvm.internal.impl.name.a c();
    
    void d(@org.jetbrains.annotations.e final c p0, @f final byte[] p1);
    
    void e(@org.jetbrains.annotations.e final d p0, @f final byte[] p1);
    
    public interface a
    {
        void a();
        
        void b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e p0, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.constants.f p1);
        
        void c(@f final kotlin.reflect.jvm.internal.impl.name.e p0, @f final Object p1);
        
        void d(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e p0, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a p1, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e p2);
        
        @f
        a e(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e p0, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a p1);
        
        @f
        b f(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e p0);
    }
    
    public interface b
    {
        void a();
        
        void b(@f final Object p0);
        
        void c(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a p0, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e p1);
        
        void d(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.resolve.constants.f p0);
    }
    
    public interface c
    {
        void a();
        
        @f
        a b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a p0, @org.jetbrains.annotations.e final w0 p1);
    }
    
    public interface d
    {
        @f
        c a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e p0, @org.jetbrains.annotations.e final String p1, @f final Object p2);
        
        @f
        e b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e p0, @org.jetbrains.annotations.e final String p1);
    }
    
    public interface e extends c
    {
        @f
        a c(final int p0, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a p1, @org.jetbrains.annotations.e final w0 p2);
    }
}
