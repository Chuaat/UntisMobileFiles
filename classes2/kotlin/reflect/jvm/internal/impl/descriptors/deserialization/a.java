// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.e;

public interface a
{
    @org.jetbrains.annotations.e
    Collection<d> a(@org.jetbrains.annotations.e final e p0);
    
    @org.jetbrains.annotations.e
    Collection<v0> b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e p0, @org.jetbrains.annotations.e final e p1);
    
    @org.jetbrains.annotations.e
    Collection<c0> d(@org.jetbrains.annotations.e final e p0);
    
    @org.jetbrains.annotations.e
    Collection<kotlin.reflect.jvm.internal.impl.name.e> e(@org.jetbrains.annotations.e final e p0);
    
    public static final class a implements kotlin.reflect.jvm.internal.impl.descriptors.deserialization.a
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
        public Collection<d> a(@org.jetbrains.annotations.e final e e) {
            k0.p(e, "classDescriptor");
            return (Collection<d>)v.E();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Collection<v0> b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e, @org.jetbrains.annotations.e final e e2) {
            k0.p(e, "name");
            k0.p(e2, "classDescriptor");
            return (Collection<v0>)v.E();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Collection<c0> d(@org.jetbrains.annotations.e final e e) {
            k0.p(e, "classDescriptor");
            return (Collection<c0>)v.E();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Collection<kotlin.reflect.jvm.internal.impl.name.e> e(@org.jetbrains.annotations.e final e e) {
            k0.p(e, "classDescriptor");
            return (Collection<kotlin.reflect.jvm.internal.impl.name.e>)v.E();
        }
    }
}
