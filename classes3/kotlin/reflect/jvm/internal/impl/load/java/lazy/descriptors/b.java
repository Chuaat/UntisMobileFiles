// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.collections.v;
import java.util.List;
import kotlin.jvm.internal.k0;
import kotlin.collections.j1;
import kotlin.reflect.jvm.internal.impl.load.java.structure.r;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.load.java.structure.n;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.load.java.structure.w;
import kotlin.reflect.jvm.internal.impl.name.e;
import java.util.Set;

public interface b
{
    @org.jetbrains.annotations.e
    Set<e> a();
    
    @f
    w b(@org.jetbrains.annotations.e final e p0);
    
    @f
    n c(@org.jetbrains.annotations.e final e p0);
    
    @org.jetbrains.annotations.e
    Set<e> d();
    
    @org.jetbrains.annotations.e
    Set<e> e();
    
    @org.jetbrains.annotations.e
    Collection<r> f(@org.jetbrains.annotations.e final e p0);
    
    public static final class a implements b
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
        public Set<e> a() {
            return (Set<e>)j1.k();
        }
        
        @f
        @Override
        public w b(@org.jetbrains.annotations.e final e e) {
            k0.p((Object)e, "name");
            return null;
        }
        
        @f
        @Override
        public n c(@org.jetbrains.annotations.e final e e) {
            k0.p((Object)e, "name");
            return null;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Set<e> d() {
            return (Set<e>)j1.k();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public Set<e> e() {
            return (Set<e>)j1.k();
        }
        
        @org.jetbrains.annotations.e
        public List<r> g(@org.jetbrains.annotations.e final e e) {
            k0.p((Object)e, "name");
            return (List<r>)v.E();
        }
    }
}
