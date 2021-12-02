// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import org.jetbrains.annotations.f;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.model.o;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.c$a;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.c;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.d;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.r;
import kotlin.reflect.jvm.internal.impl.types.model.i;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class z
{
    @e
    public static final <T> T a(@e final k<T> k, @e final T t, final boolean b) {
        k0.p((Object)k, "<this>");
        k0.p((Object)t, "possiblyPrimitiveType");
        T d = t;
        if (b) {
            d = k.d(t);
        }
        return d;
    }
    
    @f
    public static final <T> T b(@e final e1 e1, @e final i i, @e final k<T> k, @e final y y) {
        k0.p((Object)e1, "<this>");
        k0.p((Object)i, "type");
        k0.p((Object)k, "typeFactory");
        k0.p((Object)y, "mode");
        final o q = e1.q(i);
        if (!e1.H(q)) {
            return null;
        }
        final PrimitiveType r = e1.R(q);
        boolean b = true;
        final boolean b2 = true;
        if (r != null) {
            final T f = k.f(r);
            boolean b3 = b2;
            if (!e1.X(i)) {
                b3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.r.b(e1, i) && b2);
            }
            return a(k, f, b3);
        }
        final PrimitiveType j = e1.j(q);
        if (j != null) {
            return k.b(k0.C("[", (Object)d.f(j).g()));
        }
        if (e1.g(q)) {
            final kotlin.reflect.jvm.internal.impl.name.c x = e1.x(q);
            a o;
            if (x == null) {
                o = null;
            }
            else {
                o = c.a.o(x);
            }
            if (o != null) {
                if (!y.a()) {
                    final List l = c.a.j();
                    Label_0260: {
                        if (!(l instanceof Collection) || !l.isEmpty()) {
                            final Iterator<c$a> iterator = l.iterator();
                            while (iterator.hasNext()) {
                                if (k0.g((Object)iterator.next().d(), (Object)o)) {
                                    break Label_0260;
                                }
                            }
                        }
                        b = false;
                    }
                    if (b) {
                        return null;
                    }
                }
                final String f2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.c.b(o).f();
                k0.o((Object)f2, "byClassId(classId).internalName");
                return k.c(f2);
            }
        }
        return null;
    }
}
