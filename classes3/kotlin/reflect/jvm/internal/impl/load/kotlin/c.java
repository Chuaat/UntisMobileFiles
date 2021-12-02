// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.utils.d;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.types.v;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.y0;
import kotlin.reflect.jvm.internal.impl.types.u;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.types.model.i;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.j2;
import n6.q;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.text.s;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.name.g;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.e;

public final class c
{
    @org.jetbrains.annotations.e
    public static final String a(@org.jetbrains.annotations.e final e obj, @org.jetbrains.annotations.e final w<?> w) {
        k0.p((Object)obj, "klass");
        k0.p((Object)w, "typeMappingConfiguration");
        final String b = w.b(obj);
        if (b != null) {
            return b;
        }
        final m c = obj.c();
        k0.o((Object)c, "klass.containingDeclaration");
        final String g = kotlin.reflect.jvm.internal.impl.name.g.c(((f0)obj).getName()).g();
        k0.o((Object)g, "safeIdentifier(klass.name).identifier");
        if (c instanceof h0) {
            final b f = ((h0)c).f();
            String string;
            if (f.d()) {
                string = g;
            }
            else {
                final StringBuilder sb = new StringBuilder();
                final String b2 = f.b();
                k0.o((Object)b2, "fqName.asString()");
                sb.append(s.j2(b2, '.', '/', false, 4, null));
                sb.append('/');
                sb.append(g);
                string = sb.toString();
            }
            return string;
        }
        e e;
        if (c instanceof e) {
            e = (e)c;
        }
        else {
            e = null;
        }
        if (e != null) {
            String str;
            if ((str = w.d(e)) == null) {
                str = a(e, w);
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append('$');
            sb2.append(g);
            return sb2.toString();
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("Unexpected container: ");
        sb3.append(c);
        sb3.append(" for ");
        sb3.append(obj);
        throw new IllegalArgumentException(sb3.toString());
    }
    
    public static final boolean c(@org.jetbrains.annotations.e final a a) {
        k0.p((Object)a, "descriptor");
        final boolean b = a instanceof l;
        boolean b2 = true;
        if (b) {
            return true;
        }
        final c0 returnType = a.getReturnType();
        k0.m((Object)returnType);
        if (KotlinBuiltIns.isUnit(returnType)) {
            final c0 returnType2 = a.getReturnType();
            k0.m((Object)returnType2);
            if (!f1.l(returnType2) && !(a instanceof r0)) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    @org.jetbrains.annotations.e
    public static final <T> T d(@org.jetbrains.annotations.e c0 c0, @org.jetbrains.annotations.e final k<T> k, @org.jetbrains.annotations.e final y y, @org.jetbrains.annotations.e final w<? extends T> w, @f final h<T> h, @org.jetbrains.annotations.e final q<? super c0, ? super T, ? super y, j2> q) {
        k0.p((Object)c0, "kotlinType");
        k0.p((Object)k, "factory");
        k0.p((Object)y, "mode");
        k0.p((Object)w, "typeMappingConfiguration");
        k0.p((Object)q, "writeGenericType");
        final c0 e = w.e(c0);
        if (e == null) {
            if (FunctionTypesKt.isSuspendFunctionType(c0)) {
                return (T)d(SuspendFunctionTypesKt.transformSuspendFunctionToRuntimeFunctionType(c0, w.f()), (k<Object>)k, y, w, (h<Object>)h, (n6.q<? super c0, ? super Object, ? super y, j2>)q);
            }
            final kotlin.reflect.jvm.internal.impl.types.checker.q a = kotlin.reflect.jvm.internal.impl.types.checker.q.a;
            final T b = z.b(a, c0, k, y);
            if (b != null) {
                final T a2 = z.a(k, b, y.d());
                q.invoke((Object)c0, (Object)a2, (Object)y);
                return a2;
            }
            final w0 n0 = c0.N0();
            if (n0 instanceof b0) {
                final b0 b2 = (b0)n0;
                if ((c0 = b2.g()) == null) {
                    c0 = w.c(b2.k());
                }
                return (T)d(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.m(c0), (k<Object>)k, y, w, (h<Object>)h, (n6.q<? super c0, ? super Object, ? super y, j2>)q);
            }
            final kotlin.reflect.jvm.internal.impl.descriptors.h c2 = n0.c();
            if (c2 == null) {
                throw new UnsupportedOperationException(k0.C("no descriptor for type constructor of ", (Object)c0));
            }
            if (u.r((m)c2)) {
                final T c3 = k.c("error/NonExistentClass");
                w.g(c0, (e)c2);
                if (h != null) {
                    h.c(c3);
                }
                return c3;
            }
            final boolean b3 = c2 instanceof e;
            if (b3 && KotlinBuiltIns.isArray(c0)) {
                if (c0.M0().size() == 1) {
                    final y0 y2 = c0.M0().get(0);
                    c0 = y2.a();
                    k0.o((Object)c0, "memberProjection.type");
                    Object o;
                    if (y2.c() == k1.L) {
                        o = k.c("java/lang/Object");
                        if (h == null) {
                            return k.b(k0.C("[", (Object)k.a((T)o)));
                        }
                        h.b();
                        h.c((T)o);
                    }
                    else {
                        if (h != null) {
                            h.b();
                        }
                        final k1 c4 = y2.c();
                        k0.o((Object)c4, "memberProjection.projectionKind");
                        final Object o2 = o = d(c0, (k<Object>)k, y.f(c4, (boolean)(1 != 0)), w, (h<Object>)h, (n6.q<? super c0, ? super Object, ? super y, j2>)q);
                        if (h == null) {
                            o = o2;
                            return k.b(k0.C("[", (Object)k.a((T)o)));
                        }
                    }
                    h.a();
                    return k.b(k0.C("[", (Object)k.a((T)o)));
                }
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            else {
                if (b3) {
                    if (kotlin.reflect.jvm.internal.impl.resolve.f.b((m)c2) && !y.c()) {
                        final c0 c5 = (c0)v.a(a, c0);
                        if (c5 != null) {
                            return (T)d(c5, (k<Object>)k, y.g(), w, (h<Object>)h, (n6.q<? super c0, ? super Object, ? super y, j2>)q);
                        }
                    }
                    T t;
                    if (y.e() && KotlinBuiltIns.isKClass((e)c2)) {
                        t = k.e();
                    }
                    else {
                        final e e2 = (e)c2;
                        final e b4 = e2.b();
                        k0.o((Object)b4, "descriptor.original");
                        final T a3 = (T)w.a(b4);
                        if (a3 == null) {
                            e e3 = e2;
                            if (e2.n() == kotlin.reflect.jvm.internal.impl.descriptors.f.J) {
                                e3 = (e)e2.c();
                            }
                            final e b5 = e3.b();
                            k0.o((Object)b5, "enumClassIfEnumEntry.original");
                            t = k.c(a(b5, w));
                        }
                        else {
                            t = a3;
                        }
                    }
                    q.invoke((Object)c0, (Object)t, (Object)y);
                    return t;
                }
                if (c2 instanceof b1) {
                    final Object d = d(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.f((b1)c2), (k<Object>)k, y, w, null, kotlin.reflect.jvm.internal.impl.utils.d.b());
                    if (h != null) {
                        final kotlin.reflect.jvm.internal.impl.name.e name = ((f0)c2).getName();
                        k0.o((Object)name, "descriptor.getName()");
                        h.e(name, (T)d);
                    }
                    return (T)d;
                }
                if (c2 instanceof a1 && y.b()) {
                    return (T)d(((a1)c2).Z(), (k<Object>)k, y, w, (h<Object>)h, (n6.q<? super c0, ? super Object, ? super y, j2>)q);
                }
                throw new UnsupportedOperationException(k0.C("Unknown type ", (Object)c0));
            }
        }
        else {
            try {
                return (T)d(e, (k<Object>)k, y, w, (h<Object>)h, (n6.q<? super c0, ? super Object, ? super y, j2>)q);
            }
            finally {}
        }
    }
}
