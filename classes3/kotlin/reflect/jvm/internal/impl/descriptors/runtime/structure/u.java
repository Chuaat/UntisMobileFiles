// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import java.util.Collection;
import n6.l;
import org.jetbrains.annotations.f;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import java.util.List;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.name.b;

public final class u extends n implements kotlin.reflect.jvm.internal.impl.load.java.structure.u
{
    @e
    private final b a;
    
    public u(@e final b a) {
        k0.p((Object)a, "fqName");
        this.a = a;
    }
    
    @e
    public List<a> Q() {
        return (List<a>)v.E();
    }
    
    @f
    @Override
    public a a0(@e final b b) {
        k0.p((Object)b, "fqName");
        return null;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o instanceof u && k0.g((Object)this.f(), (Object)((u)o).f());
    }
    
    @e
    @Override
    public b f() {
        return this.a;
    }
    
    @e
    @Override
    public Collection<g> g(@e final n6.l<? super kotlin.reflect.jvm.internal.impl.name.e, Boolean> l) {
        k0.p((Object)l, "nameFilter");
        return (Collection<g>)v.E();
    }
    
    @Override
    public int hashCode() {
        return this.f().hashCode();
    }
    
    @Override
    public boolean i() {
        return false;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(u.class.getName());
        sb.append(": ");
        sb.append(this.f());
        return sb.toString();
    }
    
    @e
    @Override
    public Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.u> z() {
        return (Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.u>)v.E();
    }
}
