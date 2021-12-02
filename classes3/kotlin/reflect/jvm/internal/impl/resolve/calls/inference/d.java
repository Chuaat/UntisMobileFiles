// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import java.util.Objects;
import kotlin.s0;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.collections.m;
import kotlin.reflect.jvm.internal.impl.types.a0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.types.a1;
import kotlin.reflect.jvm.internal.impl.types.f0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import n6.a;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.storage.f;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.types.y0;

public final class d
{
    private static final y0 b(final y0 y0, final b1 b1) {
        if (b1 == null || y0.c() == k1.K) {
            return y0;
        }
        if (b1.v() == y0.c()) {
            a1 a1;
            if (y0.d()) {
                final n e = f.e;
                k0.o((Object)e, "NO_LOCKS");
                a1 = new a1(new f0(e, (a<? extends c0>)new a<c0>() {
                    @e
                    public final c0 a() {
                        final c0 a = y0.a();
                        k0.o((Object)a, "this@createCapturedIfNeeded.type");
                        return a;
                    }
                }));
            }
            else {
                a1 = new a1(y0.a());
            }
            return a1;
        }
        return new a1(c(y0));
    }
    
    @e
    public static final c0 c(@e final y0 y0) {
        k0.p((Object)y0, "typeProjection");
        return new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a(y0, null, false, null, 14, null);
    }
    
    public static final boolean d(@e final c0 c0) {
        k0.p((Object)c0, "<this>");
        return c0.N0() instanceof b;
    }
    
    @e
    public static final kotlin.reflect.jvm.internal.impl.types.b1 e(@e final kotlin.reflect.jvm.internal.impl.types.b1 b1, final boolean b2) {
        k0.p((Object)b1, "<this>");
        kotlin.reflect.jvm.internal.impl.types.b1 b3;
        if (b1 instanceof a0) {
            final a0 a0 = (a0)b1;
            final b1[] i = a0.i();
            final List oz = m.Oz((Object[])a0.h(), (Object[])a0.i());
            final ArrayList list = new ArrayList<y0>(v.Y((Iterable)oz, 10));
            for (final s0 s0 : oz) {
                list.add(b((y0)s0.e(), (b1)s0.f()));
            }
            final y0[] array = list.toArray(new y0[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            b3 = new a0(i, array, b2);
        }
        else {
            b3 = new kotlin.reflect.jvm.internal.impl.types.m() {
                @Override
                public boolean b() {
                    return b2;
                }
                
                @org.jetbrains.annotations.f
                @Override
                public y0 e(@e final c0 c0) {
                    k0.p((Object)c0, "key");
                    final y0 e = super.e(c0);
                    final y0 y0 = null;
                    final kotlin.reflect.jvm.internal.impl.descriptors.b1 b1 = null;
                    y0 a;
                    if (e == null) {
                        a = y0;
                    }
                    else {
                        final h c2 = c0.N0().c();
                        kotlin.reflect.jvm.internal.impl.descriptors.b1 b2 = b1;
                        if (c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b1) {
                            b2 = (kotlin.reflect.jvm.internal.impl.descriptors.b1)c2;
                        }
                        a = b(e, b2);
                    }
                    return a;
                }
            };
        }
        return b3;
    }
}
