// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.collections.v;
import kotlin.collections.j1;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.e;

public final class d
{
    @e
    public static final d a;
    
    static {
        a = new d();
    }
    
    private d() {
    }
    
    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.e h(final d d, final b b, final KotlinBuiltIns kotlinBuiltIns, Integer n, final int n2, final Object o) {
        if ((n2 & 0x4) != 0x0) {
            n = null;
        }
        return d.g(b, kotlinBuiltIns, n);
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.descriptors.e a(@e kotlin.reflect.jvm.internal.impl.descriptors.e builtInClassByFqName) {
        k0.p(builtInClassByFqName, "mutable");
        final b p = c.a.p(kotlin.reflect.jvm.internal.impl.resolve.d.m((m)builtInClassByFqName));
        if (p != null) {
            builtInClassByFqName = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.g((m)builtInClassByFqName).getBuiltInClassByFqName(p);
            k0.o(builtInClassByFqName, "descriptor.builtIns.getBuiltInClassByFqName(oppositeClassFqName)");
            return builtInClassByFqName;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Given class ");
        sb.append(builtInClassByFqName);
        sb.append(" is not a ");
        sb.append("mutable");
        sb.append(" collection");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.descriptors.e b(@e kotlin.reflect.jvm.internal.impl.descriptors.e builtInClassByFqName) {
        k0.p(builtInClassByFqName, "readOnly");
        final b q = c.a.q(kotlin.reflect.jvm.internal.impl.resolve.d.m((m)builtInClassByFqName));
        if (q != null) {
            builtInClassByFqName = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.g((m)builtInClassByFqName).getBuiltInClassByFqName(q);
            k0.o(builtInClassByFqName, "descriptor.builtIns.getBuiltInClassByFqName(oppositeClassFqName)");
            return builtInClassByFqName;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Given class ");
        sb.append(builtInClassByFqName);
        sb.append(" is not a ");
        sb.append("read-only");
        sb.append(" collection");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final boolean c(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        k0.p(e, "mutable");
        return c.a.l(kotlin.reflect.jvm.internal.impl.resolve.d.m((m)e));
    }
    
    public final boolean d(@e final c0 c0) {
        k0.p(c0, "type");
        final kotlin.reflect.jvm.internal.impl.descriptors.e f = f1.f(c0);
        return f != null && this.c(f);
    }
    
    public final boolean e(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        k0.p(e, "readOnly");
        return c.a.m(kotlin.reflect.jvm.internal.impl.resolve.d.m((m)e));
    }
    
    public final boolean f(@e final c0 c0) {
        k0.p(c0, "type");
        final kotlin.reflect.jvm.internal.impl.descriptors.e f = f1.f(c0);
        return f != null && this.e(f);
    }
    
    @f
    public final kotlin.reflect.jvm.internal.impl.descriptors.e g(@e final b b, @e final KotlinBuiltIns kotlinBuiltIns, @f final Integer n) {
        k0.p(b, "fqName");
        k0.p(kotlinBuiltIns, "builtIns");
        kotlin.reflect.jvm.internal.impl.name.a a;
        if (n != null && k0.g(b, c.a.i())) {
            final StandardNames instance = StandardNames.INSTANCE;
            a = StandardNames.getFunctionClassId(n);
        }
        else {
            a = c.a.n(b);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e builtInClassByFqName;
        if (a != null) {
            builtInClassByFqName = kotlinBuiltIns.getBuiltInClassByFqName(a.b());
        }
        else {
            builtInClassByFqName = null;
        }
        return builtInClassByFqName;
    }
    
    @e
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> i(@e final b b, @e final KotlinBuiltIns kotlinBuiltIns) {
        k0.p(b, "fqName");
        k0.p(kotlinBuiltIns, "builtIns");
        final kotlin.reflect.jvm.internal.impl.descriptors.e h = h(this, b, kotlinBuiltIns, null, 4, null);
        if (h == null) {
            return (Collection<kotlin.reflect.jvm.internal.impl.descriptors.e>)j1.k();
        }
        final b q = c.a.q(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.j((m)h));
        if (q == null) {
            return j1.f(h);
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.e builtInClassByFqName = kotlinBuiltIns.getBuiltInClassByFqName(q);
        k0.o(builtInClassByFqName, "builtIns.getBuiltInClassByFqName(kotlinMutableAnalogFqName)");
        return v.L(h, builtInClassByFqName);
    }
}
