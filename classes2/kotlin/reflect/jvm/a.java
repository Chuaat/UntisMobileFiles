// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm;

import java.lang.reflect.Constructor;
import kotlin.reflect.jvm.internal.calls.d;
import kotlin.reflect.jvm.internal.f;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import kotlin.reflect.i;
import kotlin.reflect.o;
import kotlin.reflect.j;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.c;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\",\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b" }, d2 = { "Lkotlin/reflect/c;", "", "value", "a", "(Lkotlin/reflect/c;)Z", "b", "(Lkotlin/reflect/c;Z)V", "isAccessible", "kotlin-reflection" }, k = 2, mv = { 1, 4, 1 })
@g(name = "KCallablesJvm")
public final class a
{
    public static final boolean a(@e final c<?> obj) {
        k0.p(obj, "$this$isAccessible");
        final boolean b = obj instanceof j;
        final boolean b2 = false;
        if (b) {
            final j<?> j = (j<?>)obj;
            final Field c = kotlin.reflect.jvm.e.c(j);
            final boolean b3 = c == null || c.isAccessible();
            boolean b4 = b2;
            if (!b3) {
                return b4;
            }
            final Method d = kotlin.reflect.jvm.e.d(j);
            final boolean b5 = d == null || d.isAccessible();
            b4 = b2;
            if (!b5) {
                return b4;
            }
            final Method f = kotlin.reflect.jvm.e.f((j<?>)obj);
            final boolean b6 = f == null || f.isAccessible();
            b4 = b2;
            if (!b6) {
                return b4;
            }
        }
        else if (obj instanceof o) {
            final j<?> i = (j<?>)obj;
            final Field c2 = kotlin.reflect.jvm.e.c(i);
            final boolean b7 = c2 == null || c2.isAccessible();
            boolean b4 = b2;
            if (!b7) {
                return b4;
            }
            final Method d2 = kotlin.reflect.jvm.e.d(i);
            final boolean b8 = d2 == null || d2.isAccessible();
            b4 = b2;
            if (!b8) {
                return b4;
            }
        }
        else if (obj instanceof o.c) {
            final Field c3 = kotlin.reflect.jvm.e.c(((o.c<?>)obj).A());
            final boolean b9 = c3 == null || c3.isAccessible();
            boolean b4 = b2;
            if (!b9) {
                return b4;
            }
            final Method e = kotlin.reflect.jvm.e.e((i<?>)obj);
            final boolean b10 = e == null || e.isAccessible();
            b4 = b2;
            if (!b10) {
                return b4;
            }
        }
        else if (obj instanceof j.a) {
            final Field c4 = kotlin.reflect.jvm.e.c(((j.a<?>)obj).A());
            final boolean b11 = c4 == null || c4.isAccessible();
            boolean b4 = b2;
            if (!b11) {
                return b4;
            }
            final Method e2 = kotlin.reflect.jvm.e.e((i<?>)obj);
            final boolean b12 = e2 == null || e2.isAccessible();
            b4 = b2;
            if (!b12) {
                return b4;
            }
        }
        else {
            if (!(obj instanceof i)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown callable: ");
                sb.append(obj);
                sb.append(" (");
                sb.append(((j<?>)obj).getClass());
                sb.append(')');
                throw new UnsupportedOperationException(sb.toString());
            }
            final j.a<?> a = (j.a<?>)obj;
            final Method e3 = kotlin.reflect.jvm.e.e(a);
            final boolean b13 = e3 == null || e3.isAccessible();
            boolean b4 = b2;
            if (!b13) {
                return b4;
            }
            final f<?> a2 = kotlin.reflect.jvm.internal.k0.a(obj);
            final AccessibleObject accessibleObject = null;
            Object b14 = null;
            Label_0430: {
                if (a2 != null) {
                    final d k0 = a2.k0();
                    if (k0 != null) {
                        b14 = k0.b();
                        break Label_0430;
                    }
                }
                b14 = null;
            }
            if (!(b14 instanceof AccessibleObject)) {
                b14 = accessibleObject;
            }
            final AccessibleObject accessibleObject2 = (AccessibleObject)b14;
            final boolean b15 = accessibleObject2 == null || accessibleObject2.isAccessible();
            b4 = b2;
            if (!b15) {
                return b4;
            }
            final Constructor<Object> a3 = kotlin.reflect.jvm.e.a((i<?>)a);
            final boolean b16 = a3 == null || a3.isAccessible();
            b4 = b2;
            if (!b16) {
                return b4;
            }
        }
        return true;
    }
    
    public static final void b(@e final c<?> obj, final boolean b) {
        k0.p(obj, "$this$isAccessible");
        Method method;
        if (obj instanceof j) {
            final j<?> j = (j<?>)obj;
            final Field c = kotlin.reflect.jvm.e.c(j);
            if (c != null) {
                c.setAccessible(b);
            }
            final Method d = kotlin.reflect.jvm.e.d(j);
            if (d != null) {
                d.setAccessible(b);
            }
            method = kotlin.reflect.jvm.e.f((j<?>)obj);
            if (method == null) {
                return;
            }
        }
        else if (obj instanceof o) {
            final j<?> i = (j<?>)obj;
            final Field c2 = kotlin.reflect.jvm.e.c(i);
            if (c2 != null) {
                c2.setAccessible(b);
            }
            method = kotlin.reflect.jvm.e.d(i);
            if (method == null) {
                return;
            }
        }
        else if (obj instanceof o.c) {
            final Field c3 = kotlin.reflect.jvm.e.c(((o.c<?>)obj).A());
            if (c3 != null) {
                c3.setAccessible(b);
            }
            method = kotlin.reflect.jvm.e.e((i<?>)obj);
            if (method == null) {
                return;
            }
        }
        else if (obj instanceof j.a) {
            final Field c4 = kotlin.reflect.jvm.e.c(((j.a<?>)obj).A());
            if (c4 != null) {
                c4.setAccessible(b);
            }
            method = kotlin.reflect.jvm.e.e((i<?>)obj);
            if (method == null) {
                return;
            }
        }
        else {
            if (!(obj instanceof i)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown callable: ");
                sb.append(obj);
                sb.append(" (");
                sb.append(((j<?>)obj).getClass());
                sb.append(')');
                throw new UnsupportedOperationException(sb.toString());
            }
            final j.a<?> a = (j.a<?>)obj;
            final Method e = kotlin.reflect.jvm.e.e(a);
            if (e != null) {
                e.setAccessible(b);
            }
            final f<?> a2 = kotlin.reflect.jvm.internal.k0.a(obj);
            final AccessibleObject accessibleObject = null;
            Object b2 = null;
            Label_0250: {
                if (a2 != null) {
                    final d k0 = a2.k0();
                    if (k0 != null) {
                        b2 = k0.b();
                        break Label_0250;
                    }
                }
                b2 = null;
            }
            if (!(b2 instanceof AccessibleObject)) {
                b2 = accessibleObject;
            }
            final AccessibleObject accessibleObject2 = (AccessibleObject)b2;
            if (accessibleObject2 != null) {
                accessibleObject2.setAccessible(true);
            }
            final Constructor<Object> a3 = kotlin.reflect.jvm.e.a((i<?>)a);
            if (a3 != null) {
                a3.setAccessible(b);
            }
            return;
        }
        method.setAccessible(b);
    }
}
