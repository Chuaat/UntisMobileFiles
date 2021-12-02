// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.descriptors.m;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a$c;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a$d;
import kotlin.reflect.jvm.internal.calls.i;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.calls.h;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.resolve.f;
import java.lang.reflect.Modifier;
import kotlin.reflect.jvm.internal.calls.e;
import java.lang.reflect.Field;
import n6.l;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.reflect.jvm.internal.calls.j;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.calls.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0002\"$\u0010\n\u001a\u0004\u0018\u00010\u0007*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b" }, d2 = { "Lkotlin/reflect/jvm/internal/u$a;", "", "isGetter", "Lkotlin/reflect/jvm/internal/calls/d;", "c", "Lkotlin/reflect/jvm/internal/impl/descriptors/q0;", "e", "", "d", "(Lkotlin/reflect/jvm/internal/u$a;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection" }, k = 2, mv = { 1, 4, 1 })
public final class v
{
    private static final d<?> c(final u.a<?, ?> a, final boolean b) {
        if (k.I.a().i((CharSequence)a.p0().v0())) {
            return (d<?>)j.a;
        }
        final a<Boolean> a2 = new a<Boolean>() {
            public final boolean a() {
                return a.p0().s0().getAnnotations().B4(k0.h());
            }
        };
        final l<Field, e<? extends Field>> l = new l<Field, e<? extends Field>>() {
            final /* synthetic */ v$b I = new a<Boolean>(a) {
                final /* synthetic */ u.a G;
                
                public final boolean a() {
                    return f1.l(this.G.p0().s0().a()) ^ true;
                }
            };
            
            @org.jetbrains.annotations.e
            public final e<Field> a(@org.jetbrains.annotations.e final Field field) {
                kotlin.jvm.internal.k0.p(field, "field");
                e<Field> e;
                if (!e(a.p0().s0()) && Modifier.isStatic(field.getModifiers())) {
                    if (a2.a()) {
                        if (b) {
                            if (a.n0()) {
                                e = new e.f.b(field);
                            }
                            else {
                                e = new e.f.d(field);
                            }
                        }
                        else if (a.n0()) {
                            e = new e.g.b(field, this.I.a());
                        }
                        else {
                            e = new e.g.d(field, this.I.a());
                        }
                    }
                    else if (b) {
                        e = new e.f.e(field);
                    }
                    else {
                        e = new e.g.e(field, this.I.a());
                    }
                }
                else if (b) {
                    if (a.n0()) {
                        e = new e.f.a(field, v.d(a));
                    }
                    else {
                        e = new e.f.c(field);
                    }
                }
                else if (a.n0()) {
                    e = new e.g.a(field, this.I.a(), v.d(a));
                }
                else {
                    e = new e.g.c(field, this.I.a());
                }
                return e;
            }
        };
        final kotlin.reflect.jvm.internal.e f = h0.b.f(a.p0().s0());
        Field field;
        if (f instanceof kotlin.reflect.jvm.internal.e.c) {
            final kotlin.reflect.jvm.internal.e.c c = (kotlin.reflect.jvm.internal.e.c)f;
            final a$d f2 = c.f();
            a$c c2;
            if (b ? f2.G() : f2.H()) {
                c2 = f2.C();
            }
            else {
                c2 = null;
            }
            Method i;
            if (c2 != null) {
                i = a.p0().j0().L(c.d().getString(c2.z()), c.d().getString(c2.y()));
            }
            else {
                i = null;
            }
            if (i == null) {
                if (kotlin.reflect.jvm.internal.impl.resolve.f.d((g1)a.p0().s0()) && kotlin.jvm.internal.k0.g(a.p0().s0().getVisibility(), t.d)) {
                    final Class<?> h = kotlin.reflect.jvm.internal.calls.h.h(a.p0().s0().c());
                    if (h != null) {
                        final Method f3 = kotlin.reflect.jvm.internal.calls.h.f(h, a.p0().s0());
                        if (f3 != null) {
                            if (a.n0()) {
                                final Object a3 = new i.a(f3, d(a));
                                return (d<?>)kotlin.reflect.jvm.internal.calls.h.c((d)a3, a.o0(), false, 2, null);
                            }
                            final Object a3 = new i.b(f3);
                            return (d<?>)kotlin.reflect.jvm.internal.calls.h.c((d)a3, a.o0(), false, 2, null);
                        }
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Underlying property of inline class ");
                    sb.append(a.p0());
                    sb.append(" should have a field");
                    throw new b0(sb.toString());
                }
                field = a.p0().u0();
                if (field == null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("No accessors or field is found for property ");
                    sb2.append(a.p0());
                    throw new b0(sb2.toString());
                }
            }
            else if (!Modifier.isStatic(i.getModifiers())) {
                if (a.n0()) {
                    final Object a3 = new e.h.a(i, d(a));
                    return (d<?>)h.c((d)a3, a.o0(), false, 2, null);
                }
                final Object a3 = new e.h.d(i);
                return (d<?>)h.c((d)a3, a.o0(), false, 2, null);
            }
            else if (a2.a()) {
                if (a.n0()) {
                    final Object a3 = new e.h.b(i);
                    return (d<?>)h.c((d)a3, a.o0(), false, 2, null);
                }
                final Object a3 = new e.h.e(i);
                return (d<?>)h.c((d)a3, a.o0(), false, 2, null);
            }
            else {
                if (a.n0()) {
                    final Object a3 = new e.h.c(i, d(a));
                    return (d<?>)h.c((d)a3, a.o0(), false, 2, null);
                }
                final Object a3 = new e.h.f(i);
                return (d<?>)h.c((d)a3, a.o0(), false, 2, null);
            }
        }
        else if (f instanceof kotlin.reflect.jvm.internal.e.a) {
            field = ((kotlin.reflect.jvm.internal.e.a)f).b();
        }
        else if (f instanceof kotlin.reflect.jvm.internal.e.b) {
            final kotlin.reflect.jvm.internal.e.b b2 = (kotlin.reflect.jvm.internal.e.b)f;
            Method method;
            if (b) {
                method = b2.b();
            }
            else {
                method = b2.c();
                if (method == null) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("No source found for setter of Java method property: ");
                    sb3.append(b2.b());
                    throw new b0(sb3.toString());
                }
            }
            if (a.n0()) {
                final Object a3 = new e.h.a(method, d(a));
                return (d<?>)h.c((d)a3, a.o0(), false, 2, null);
            }
            final Object a3 = new e.h.d(method);
            return (d<?>)h.c((d)a3, a.o0(), false, 2, null);
        }
        else {
            if (!(f instanceof kotlin.reflect.jvm.internal.e.d)) {
                throw new kotlin.h0();
            }
            final kotlin.reflect.jvm.internal.e.d d = (kotlin.reflect.jvm.internal.e.d)f;
            kotlin.reflect.jvm.internal.d.e e;
            if (b) {
                e = d.b();
            }
            else {
                e = d.c();
                if (e == null) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("No setter found for property ");
                    sb4.append(a.p0());
                    throw new b0(sb4.toString());
                }
            }
            final Method j = a.p0().j0().L(e.c(), e.b());
            if (j != null) {
                Modifier.isStatic(j.getModifiers());
                e.h h2;
                if (a.n0()) {
                    h2 = new e.h.a(j, d(a));
                }
                else {
                    h2 = new e.h.d(j);
                }
                return h2;
            }
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("No accessor found for property ");
            sb5.append(a.p0());
            throw new b0(sb5.toString());
        }
        final Object a3 = l.a(field);
        return (d<?>)h.c((d)a3, a.o0(), false, 2, null);
    }
    
    @org.jetbrains.annotations.f
    public static final Object d(@org.jetbrains.annotations.e final u.a<?, ?> a) {
        kotlin.jvm.internal.k0.p(a, "$this$boundReceiver");
        return a.p0().q0();
    }
    
    private static final boolean e(final q0 q0) {
        final m c = q0.c();
        kotlin.jvm.internal.k0.o(c, "containingDeclaration");
        final boolean x = kotlin.reflect.jvm.internal.impl.resolve.d.x(c);
        final boolean b = false;
        if (!x) {
            return false;
        }
        final m c2 = c.c();
        if (kotlin.reflect.jvm.internal.impl.resolve.d.C(c2) || kotlin.reflect.jvm.internal.impl.resolve.d.t(c2)) {
            boolean b2 = b;
            if (!(q0 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k)) {
                return b2;
            }
            b2 = b;
            if (!kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h.f(((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k)q0).d1())) {
                return b2;
            }
        }
        return true;
    }
}
