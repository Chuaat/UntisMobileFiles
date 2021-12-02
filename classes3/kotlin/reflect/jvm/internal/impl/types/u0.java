// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import org.jetbrains.annotations.e;

public interface u0
{
    void a(@e final c0 p0, @e final c0 p1, @e final c0 p2, @e final b1 p3);
    
    void b(@e final c p0);
    
    void c(@e final a1 p0, @f final b1 p1, @e final c0 p2);
    
    void d(@e final a1 p0);
    
    public static final class a implements u0
    {
        @e
        public static final a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
        
        @Override
        public void a(@e final c0 c0, @e final c0 c2, @e final c0 c3, @e final b1 b1) {
            k0.p((Object)c0, "bound");
            k0.p((Object)c2, "unsubstitutedArgument");
            k0.p((Object)c3, "argument");
            k0.p((Object)b1, "typeParameter");
        }
        
        @Override
        public void b(@e final c c) {
            k0.p((Object)c, "annotation");
        }
        
        @Override
        public void c(@e final a1 a1, @f final b1 b1, @e final c0 c0) {
            k0.p((Object)a1, "typeAlias");
            k0.p((Object)c0, "substitutedArgument");
        }
        
        @Override
        public void d(@e final a1 a1) {
            k0.p((Object)a1, "typeAlias");
        }
    }
}
