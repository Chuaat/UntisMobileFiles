// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.e;

public interface c
{
    boolean c(@org.jetbrains.annotations.e final e p0, @org.jetbrains.annotations.e final v0 p1);
    
    public static final class a implements c
    {
        @org.jetbrains.annotations.e
        public static final a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
        
        @Override
        public boolean c(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final v0 v0) {
            k0.p(e, "classDescriptor");
            k0.p(v0, "functionDescriptor");
            return true;
        }
    }
    
    public static final class b implements c
    {
        @org.jetbrains.annotations.e
        public static final b a;
        
        static {
            a = new b();
        }
        
        private b() {
        }
        
        @Override
        public boolean c(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final v0 v0) {
            k0.p(e, "classDescriptor");
            k0.p(v0, "functionDescriptor");
            return v0.getAnnotations().B4(d.a()) ^ true;
        }
    }
}
