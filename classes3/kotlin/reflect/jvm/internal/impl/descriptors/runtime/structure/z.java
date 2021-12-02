// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import org.jetbrains.annotations.f;
import java.lang.reflect.Type;
import kotlin.collections.m;
import kotlin.reflect.jvm.internal.impl.load.java.structure.x;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import java.util.Collection;
import org.jetbrains.annotations.e;
import java.lang.reflect.WildcardType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.b0;

public final class z extends w implements b0
{
    @e
    private final WildcardType b;
    @e
    private final Collection<a> c;
    private final boolean d;
    
    public z(@e final WildcardType b) {
        k0.p((Object)b, "reflectType");
        this.b = b;
        this.c = (Collection<a>)v.E();
    }
    
    @Override
    public boolean I() {
        final Type[] upperBounds = this.S().getUpperBounds();
        k0.o((Object)upperBounds, "reflectType.upperBounds");
        return k0.g(m.Kb((Object[])upperBounds), (Object)Object.class) ^ true;
    }
    
    @f
    public w R() {
        final Type[] upperBounds = this.S().getUpperBounds();
        final Type[] lowerBounds = this.S().getLowerBounds();
        if (upperBounds.length <= 1 && lowerBounds.length <= 1) {
            final int length = lowerBounds.length;
            final w w = null;
            w w2;
            if (length == 1) {
                final w.a a = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.w.a;
                k0.o((Object)lowerBounds, "lowerBounds");
                final Object cs = m.Cs((Object[])lowerBounds);
                k0.o(cs, "lowerBounds.single()");
                w2 = a.a((Type)cs);
            }
            else {
                w2 = w;
                if (upperBounds.length == 1) {
                    k0.o((Object)upperBounds, "upperBounds");
                    final Type type = (Type)m.Cs((Object[])upperBounds);
                    w2 = w;
                    if (!k0.g((Object)type, (Object)Object.class)) {
                        final w.a a2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.w.a;
                        k0.o((Object)type, "ub");
                        w2 = a2.a(type);
                    }
                }
            }
            return w2;
        }
        throw new UnsupportedOperationException(k0.C("Wildcard types with many bounds are not yet supported: ", (Object)this.S()));
    }
    
    @e
    protected WildcardType S() {
        return this.b;
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
