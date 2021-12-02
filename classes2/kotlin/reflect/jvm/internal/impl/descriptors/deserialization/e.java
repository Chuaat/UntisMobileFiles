// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.reflect.jvm.internal.impl.types.k0;
import kotlin.reflect.jvm.internal.impl.name.a;

public interface e
{
    @org.jetbrains.annotations.e
    k0 a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a p0, @org.jetbrains.annotations.e final k0 p1);
    
    public static final class a implements e
    {
        @org.jetbrains.annotations.e
        public static final a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
        
        @org.jetbrains.annotations.e
        @Override
        public k0 a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.a a, @org.jetbrains.annotations.e final k0 k0) {
            kotlin.jvm.internal.k0.p(a, "classId");
            kotlin.jvm.internal.k0.p(k0, "computedType");
            return k0;
        }
    }
}
