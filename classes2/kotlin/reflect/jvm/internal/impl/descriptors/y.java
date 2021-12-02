// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.types.b1;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.List;
import java.util.Collection;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.d1;
import org.jetbrains.annotations.e;

public interface y extends b
{
    @e
    a<? extends y> B();
    
    boolean D0();
    
    boolean T();
    
    @e
    y b();
    
    @e
    m c();
    
    @f
    y d(@e final d1 p0);
    
    @e
    Collection<? extends y> g();
    
    @f
    y h0();
    
    boolean isInfix();
    
    boolean isInline();
    
    boolean isOperator();
    
    boolean isSuspend();
    
    boolean z0();
    
    public interface a<D extends y>
    {
        @e
        a<D> a();
        
        @e
        a<D> b(@e final List<e1> p0);
        
        @e
        a<D> c(@e final b0 p0);
        
        @e
        a<D> d(@f final t0 p0);
        
        @e
        a<D> e();
        
        @e
        a<D> f(@e final c0 p0);
        
        @e
        a<D> g(@f final b p0);
        
        @f
        D h();
        
        @e
        a<D> i();
        
        @e
        a<D> j(final boolean p0);
        
        @e
        a<D> k(@f final t0 p0);
        
        @e
        a<D> l(@e final b1 p0);
        
        @e
        a<D> m(@e final List<kotlin.reflect.jvm.internal.impl.descriptors.b1> p0);
        
        @e
        a<D> n(@e final u p0);
        
        @e
        a<D> o(@e final m p0);
        
        @e
        a<D> p();
        
        @e
        a<D> q(@e final b.a p0);
        
        @e
        a<D> r(@e final g p0);
        
        @e
        a<D> s(@e final kotlin.reflect.jvm.internal.impl.name.e p0);
        
        @e
        a<D> t();
    }
}
