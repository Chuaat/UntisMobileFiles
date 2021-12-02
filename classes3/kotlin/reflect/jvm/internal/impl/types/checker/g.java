// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.name.a;

public abstract class g
{
    @f
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.e a(@e final kotlin.reflect.jvm.internal.impl.name.a p0);
    
    @e
    public abstract <S extends h> S b(@e final kotlin.reflect.jvm.internal.impl.descriptors.e p0, @e final n6.a<? extends S> p1);
    
    public abstract boolean c(@e final e0 p0);
    
    public abstract boolean d(@e final w0 p0);
    
    @f
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.h e(@e final m p0);
    
    @e
    public abstract Collection<c0> f(@e final kotlin.reflect.jvm.internal.impl.descriptors.e p0);
    
    @e
    public abstract c0 g(@e final c0 p0);
    
    public static final class a extends g
    {
        @e
        public static final a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
        
        @f
        @Override
        public kotlin.reflect.jvm.internal.impl.descriptors.e a(@e final kotlin.reflect.jvm.internal.impl.name.a a) {
            k0.p((Object)a, "classId");
            return null;
        }
        
        @e
        @Override
        public <S extends h> S b(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @e final n6.a<? extends S> a) {
            k0.p((Object)e, "classDescriptor");
            k0.p((Object)a, "compute");
            return (S)a.invoke();
        }
        
        @Override
        public boolean c(@e final e0 e0) {
            k0.p((Object)e0, "moduleDescriptor");
            return false;
        }
        
        @Override
        public boolean d(@e final w0 w0) {
            k0.p((Object)w0, "typeConstructor");
            return false;
        }
        
        @e
        @Override
        public Collection<c0> f(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
            k0.p((Object)e, "classDescriptor");
            final Collection<c0> k = ((kotlin.reflect.jvm.internal.impl.descriptors.h)e).l().k();
            k0.o((Object)k, "classDescriptor.typeConstructor.supertypes");
            return k;
        }
        
        @e
        @Override
        public c0 g(@e final c0 c0) {
            k0.p((Object)c0, "type");
            return c0;
        }
        
        @f
        public kotlin.reflect.jvm.internal.impl.descriptors.e h(@e final m m) {
            k0.p((Object)m, "descriptor");
            return null;
        }
    }
}
