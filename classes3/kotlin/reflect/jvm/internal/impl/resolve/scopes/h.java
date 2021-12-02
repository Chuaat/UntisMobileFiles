// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.collections.j1;
import n6.l;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import org.jetbrains.annotations.e;

public interface h extends k
{
    @e
    public static final a a = h.a.a;
    
    @e
    Collection<? extends v0> a(@e final kotlin.reflect.jvm.internal.impl.name.e p0, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b p1);
    
    @e
    Set<kotlin.reflect.jvm.internal.impl.name.e> b();
    
    @e
    Collection<? extends q0> c(@e final kotlin.reflect.jvm.internal.impl.name.e p0, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b p1);
    
    @e
    Set<kotlin.reflect.jvm.internal.impl.name.e> d();
    
    @f
    Set<kotlin.reflect.jvm.internal.impl.name.e> f();
    
    public static final class a
    {
        static final /* synthetic */ a a;
        @e
        private static final l<kotlin.reflect.jvm.internal.impl.name.e, Boolean> b;
        
        static {
            a = new a();
            b = (l)h$a$a.G;
        }
        
        private a() {
        }
        
        @e
        public final l<kotlin.reflect.jvm.internal.impl.name.e, Boolean> a() {
            return h.a.b;
        }
    }
    
    public static final class b
    {
        public static void a(@e final h h, @e final kotlin.reflect.jvm.internal.impl.name.e e, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
            k.a.b(h, e, b);
        }
    }
    
    public static final class c extends i
    {
        @e
        public static final c b;
        
        static {
            b = new c();
        }
        
        private c() {
        }
        
        @e
        @Override
        public Set<kotlin.reflect.jvm.internal.impl.name.e> b() {
            return (Set<kotlin.reflect.jvm.internal.impl.name.e>)j1.k();
        }
        
        @e
        @Override
        public Set<kotlin.reflect.jvm.internal.impl.name.e> d() {
            return (Set<kotlin.reflect.jvm.internal.impl.name.e>)j1.k();
        }
        
        @e
        @Override
        public Set<kotlin.reflect.jvm.internal.impl.name.e> f() {
            return (Set<kotlin.reflect.jvm.internal.impl.name.e>)j1.k();
        }
    }
}
