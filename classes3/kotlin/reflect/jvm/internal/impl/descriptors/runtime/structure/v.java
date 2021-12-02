// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.d;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import java.util.Collection;
import org.jetbrains.annotations.e;

public final class v extends w implements kotlin.reflect.jvm.internal.impl.load.java.structure.v
{
    @e
    private final Class<?> b;
    @e
    private final Collection<a> c;
    private final boolean d;
    
    public v(@e final Class<?> b) {
        k0.p((Object)b, "reflectType");
        this.b = b;
        this.c = (Collection<a>)kotlin.collections.v.E();
    }
    
    @e
    protected Class<?> R() {
        return this.b;
    }
    
    @f
    @Override
    public PrimitiveType a() {
        PrimitiveType i;
        if (k0.g((Object)this.R(), (Object)Void.TYPE)) {
            i = null;
        }
        else {
            i = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.d(this.R().getName()).i();
        }
        return i;
    }
    
    @e
    @Override
    public Collection<a> getAnnotations() {
        return this.c;
    }
    
    @Override
    public boolean i() {
        return this.d;
    }
}
