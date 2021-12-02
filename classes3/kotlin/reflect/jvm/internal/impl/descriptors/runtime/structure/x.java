// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.AnnotatedElement;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import java.lang.reflect.Type;
import kotlin.collections.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.lang.reflect.TypeVariable;
import kotlin.reflect.jvm.internal.impl.load.java.structure.y;

public final class x extends n implements f, y
{
    @e
    private final TypeVariable<?> a;
    
    public x(@e final TypeVariable<?> a) {
        k0.p((Object)a, "typeVariable");
        this.a = a;
    }
    
    @org.jetbrains.annotations.f
    public c Q(@e final b b) {
        return f.a.a(this, b);
    }
    
    @e
    public List<c> R() {
        return f.a.b(this);
    }
    
    @e
    public List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l> S() {
        final Type[] bounds = this.a.getBounds();
        k0.o((Object)bounds, "typeVariable.bounds");
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l>(bounds.length);
        for (int length = bounds.length, i = 0; i < length; ++i) {
            list.add(new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l(bounds[i]));
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l l = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l)v.X4((List)list);
        Object q;
        if (l == null) {
            q = null;
        }
        else {
            q = l.Q();
        }
        if (k0.g(q, (Object)Object.class)) {
            return (List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l>)v.E();
        }
        return (List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l>)list;
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        return o instanceof x && k0.g((Object)this.a, (Object)((x)o).a);
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.name.e getName() {
        final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.name.e.i(this.a.getName());
        k0.o((Object)i, "identifier(typeVariable.name)");
        return i;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public boolean i() {
        return f.a.c(this);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(x.class.getName());
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public AnnotatedElement u() {
        final TypeVariable<?> a = this.a;
        AnnotatedElement annotatedElement;
        if (a instanceof AnnotatedElement) {
            annotatedElement = a;
        }
        else {
            annotatedElement = null;
        }
        return annotatedElement;
    }
}
