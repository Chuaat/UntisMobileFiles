// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import n6.l;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import java.util.Set;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.name.e;

public abstract class a implements h
{
    @org.jetbrains.annotations.e
    @Override
    public Collection<v0> a(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        return (Collection<v0>)this.j().a(e, b);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Set<e> b() {
        return this.j().b();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Collection<q0> c(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        return (Collection<q0>)this.j().c(e, b);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Set<e> d() {
        return this.j().d();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Collection<m> e(@org.jetbrains.annotations.e final d d, @org.jetbrains.annotations.e final l<? super e, Boolean> l) {
        k0.p((Object)d, "kindFilter");
        k0.p((Object)l, "nameFilter");
        return this.j().e(d, l);
    }
    
    @f
    @Override
    public Set<e> f() {
        return this.j().f();
    }
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.descriptors.h g(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        return this.j().g(e, b);
    }
    
    @Override
    public void h(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.incremental.components.b b) {
        k0.p((Object)e, "name");
        k0.p((Object)b, "location");
        this.j().h(e, b);
    }
    
    @org.jetbrains.annotations.e
    public final h i() {
        h h;
        if (this.j() instanceof a) {
            h = ((a)this.j()).i();
        }
        else {
            h = this.j();
        }
        return h;
    }
    
    @org.jetbrains.annotations.e
    protected abstract h j();
}
