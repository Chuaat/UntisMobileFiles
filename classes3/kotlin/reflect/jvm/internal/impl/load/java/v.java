// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.p;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import java.util.Iterator;
import kotlin.s0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.j;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.d;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.resolve.e;

public final class v implements e
{
    @org.jetbrains.annotations.e
    public static final a a;
    
    static {
        a = new a(null);
    }
    
    private final boolean c(final kotlin.reflect.jvm.internal.impl.descriptors.a a, final kotlin.reflect.jvm.internal.impl.descriptors.a a2, final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        if (a instanceof kotlin.reflect.jvm.internal.impl.descriptors.b && a2 instanceof y) {
            if (!KotlinBuiltIns.isBuiltIn((m)a2)) {
                final f n = f.n;
                final y y = (y)a2;
                final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)y).getName();
                k0.o((Object)name, "subDescriptor.name");
                if (!n.l(name)) {
                    final kotlin.reflect.jvm.internal.impl.load.java.e n2 = e.n;
                    final kotlin.reflect.jvm.internal.impl.name.e name2 = ((f0)y).getName();
                    k0.o((Object)name2, "subDescriptor.name");
                    if (!n2.k(name2)) {
                        return false;
                    }
                }
                final kotlin.reflect.jvm.internal.impl.descriptors.b e2 = b0.e((kotlin.reflect.jvm.internal.impl.descriptors.b)a);
                final boolean z0 = y.z0();
                final boolean b = a instanceof y;
                y y2;
                if (b) {
                    y2 = (y)a;
                }
                else {
                    y2 = null;
                }
                Object value;
                if (y2 == null) {
                    value = null;
                }
                else {
                    value = y2.z0();
                }
                if ((k0.g((Object)z0, value) ^ true) && (e2 == null || !y.z0())) {
                    return true;
                }
                if (e instanceof d) {
                    if (y.h0() == null) {
                        if (e2 != null) {
                            if (!b0.f(e, (kotlin.reflect.jvm.internal.impl.descriptors.a)e2)) {
                                if (e2 instanceof y && b && f.k((y)e2) != null) {
                                    final String c = t.c(y, false, false, 2, null);
                                    final y b2 = ((y)a).b();
                                    k0.o((Object)b2, "superDescriptor.original");
                                    if (k0.g((Object)c, (Object)t.c(b2, false, false, 2, null))) {
                                        return false;
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public e.a a() {
        return e.a.G;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public b b(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a2, @org.jetbrains.annotations.f final kotlin.reflect.jvm.internal.impl.descriptors.e e) {
        k0.p((Object)a, "superDescriptor");
        k0.p((Object)a2, "subDescriptor");
        if (this.c(a, a2, e)) {
            return b.I;
        }
        if (v.a.a(a, a2)) {
            return b.I;
        }
        return b.J;
    }
    
    public static final class a
    {
        private a() {
        }
        
        private final boolean b(final y y) {
            final int size = ((kotlin.reflect.jvm.internal.impl.descriptors.a)y).m().size();
            boolean b = true;
            if (size != 1) {
                return false;
            }
            final m c = y.c();
            final boolean b2 = c instanceof kotlin.reflect.jvm.internal.impl.descriptors.e;
            final m m = null;
            kotlin.reflect.jvm.internal.impl.descriptors.e e;
            if (b2) {
                e = (kotlin.reflect.jvm.internal.impl.descriptors.e)c;
            }
            else {
                e = null;
            }
            if (e == null) {
                return false;
            }
            final List i = ((kotlin.reflect.jvm.internal.impl.descriptors.a)y).m();
            k0.o((Object)i, "f.valueParameters");
            final h c2 = ((d1)kotlin.collections.v.U4(i)).a().N0().c();
            Object o = m;
            if (c2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                o = c2;
            }
            if (o == null) {
                return false;
            }
            if (!KotlinBuiltIns.isPrimitiveClass(e) || !k0.g((Object)kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.i((m)e), (Object)kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.i((m)o))) {
                b = false;
            }
            return b;
        }
        
        private final j c(final y y, final e1 e1) {
            c0 c0;
            if (!t.e((kotlin.reflect.jvm.internal.impl.descriptors.a)y) && !this.b(y)) {
                c0 = ((d1)e1).a();
                k0.o((Object)c0, "valueParameterDescriptor.type");
            }
            else {
                final c0 a = ((d1)e1).a();
                k0.o((Object)a, "valueParameterDescriptor.type");
                c0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.k(a);
            }
            return t.g(c0);
        }
        
        public final boolean a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a, @org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.a a2) {
            k0.p((Object)a, "superDescriptor");
            k0.p((Object)a2, "subDescriptor");
            if (a2 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.f) {
                if (a instanceof y) {
                    final kotlin.reflect.jvm.internal.impl.load.java.descriptors.f f = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.f)a2;
                    ((p)f).m().size();
                    final y y = (y)a;
                    ((kotlin.reflect.jvm.internal.impl.descriptors.a)y).m().size();
                    final List m = ((kotlin.reflect.jvm.internal.impl.descriptors.a)f.n1()).m();
                    k0.o((Object)m, "subDescriptor.original.valueParameters");
                    final List i = ((kotlin.reflect.jvm.internal.impl.descriptors.a)y.b()).m();
                    k0.o((Object)i, "superDescriptor.original.valueParameters");
                    for (final s0 s0 : kotlin.collections.v.V5((Iterable)m, (Iterable)i)) {
                        final e1 e1 = (e1)s0.a();
                        final e1 e2 = (e1)s0.b();
                        final y y2 = (y)a2;
                        k0.o((Object)e1, "subParameter");
                        final boolean b = this.c(y2, e1) instanceof j.d;
                        k0.o((Object)e2, "superParameter");
                        if (b != this.c(y, e2) instanceof j.d) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
}
