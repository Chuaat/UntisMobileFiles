// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.e;

public final class s
{
    @f
    public static final kotlin.reflect.jvm.internal.impl.descriptors.e a(@e final e0 e0, @e final b b, @e final kotlin.reflect.jvm.internal.impl.incremental.components.b b2) {
        k0.p(e0, "<this>");
        k0.p(b, "fqName");
        k0.p(b2, "lookupLocation");
        final boolean d = b.d();
        final kotlin.reflect.jvm.internal.impl.descriptors.e e2 = null;
        if (d) {
            return null;
        }
        final b e3 = b.e();
        k0.o(e3, "fqName.parent()");
        final h x = e0.R(e3).x();
        final kotlin.reflect.jvm.internal.impl.name.e g = b.g();
        k0.o(g, "fqName.shortName()");
        final kotlin.reflect.jvm.internal.impl.descriptors.h g2 = ((k)x).g(g, b2);
        kotlin.reflect.jvm.internal.impl.descriptors.e e4;
        if (g2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            e4 = (kotlin.reflect.jvm.internal.impl.descriptors.e)g2;
        }
        else {
            e4 = null;
        }
        if (e4 == null) {
            final b e5 = b.e();
            k0.o(e5, "fqName.parent()");
            final kotlin.reflect.jvm.internal.impl.descriptors.e a = a(e0, e5, b2);
            kotlin.reflect.jvm.internal.impl.descriptors.h g4 = null;
            Label_0175: {
                if (a != null) {
                    final h b3 = a.B0();
                    if (b3 != null) {
                        final kotlin.reflect.jvm.internal.impl.name.e g3 = b.g();
                        k0.o(g3, "fqName.shortName()");
                        g4 = ((k)b3).g(g3, b2);
                        break Label_0175;
                    }
                }
                g4 = null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.e e6 = e2;
            if (g4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                e6 = (kotlin.reflect.jvm.internal.impl.descriptors.e)g4;
            }
            return e6;
        }
        return e4;
    }
}
