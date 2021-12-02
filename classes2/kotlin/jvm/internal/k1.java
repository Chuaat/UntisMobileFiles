// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.reflect.r;
import kotlin.reflect.q;
import kotlin.reflect.p;
import java.util.Arrays;
import kotlin.reflect.l;
import kotlin.reflect.k;
import kotlin.reflect.h;
import kotlin.reflect.i;
import kotlin.reflect.t;
import kotlin.reflect.w;
import java.util.Collections;
import kotlin.e1;
import kotlin.reflect.g;
import kotlin.collections.m;
import kotlin.reflect.s;
import kotlin.reflect.u;
import kotlin.reflect.jvm.internal.e0;
import kotlin.reflect.d;

public class k1
{
    private static final l1 a;
    static final String b = " (Kotlin reflection is not available)";
    private static final d[] c;
    
    static {
        l1 a2 = null;
        try {
            a2 = e0.class.newInstance();
        }
        catch (ClassCastException ex) {}
        catch (ClassNotFoundException ex2) {}
        catch (InstantiationException ex3) {}
        catch (IllegalAccessException ex4) {}
        if (a2 == null) {
            a2 = new l1();
        }
        a = a2;
        c = new d[0];
    }
    
    @e1(version = "1.4")
    public static s A(final Class clazz, final u... array) {
        return k1.a.p(d(clazz), m.ey(array), false);
    }
    
    @e1(version = "1.4")
    public static s B(final g g) {
        return k1.a.p(g, Collections.emptyList(), false);
    }
    
    @e1(version = "1.4")
    public static t C(final Object o, final String s, final w w, final boolean b) {
        return k1.a.q(o, s, w, b);
    }
    
    public static d a(final Class clazz) {
        return k1.a.a(clazz);
    }
    
    public static d b(final Class clazz, final String s) {
        return k1.a.b(clazz, s);
    }
    
    public static i c(final f0 f0) {
        return k1.a.c(f0);
    }
    
    public static d d(final Class clazz) {
        return k1.a.d(clazz);
    }
    
    public static d e(final Class clazz, final String s) {
        return k1.a.e(clazz, s);
    }
    
    public static d[] f(final Class[] array) {
        final int length = array.length;
        if (length == 0) {
            return k1.c;
        }
        final d[] array2 = new d[length];
        for (int i = 0; i < length; ++i) {
            array2[i] = d(array[i]);
        }
        return array2;
    }
    
    @e1(version = "1.4")
    public static h g(final Class clazz) {
        return k1.a.f(clazz, "");
    }
    
    public static h h(final Class clazz, final String s) {
        return k1.a.f(clazz, s);
    }
    
    public static k i(final t0 t0) {
        return k1.a.g(t0);
    }
    
    public static l j(final v0 v0) {
        return k1.a.h(v0);
    }
    
    public static kotlin.reflect.m k(final x0 x0) {
        return k1.a.i(x0);
    }
    
    @e1(version = "1.4")
    public static s l(final Class clazz) {
        return k1.a.p(d(clazz), Collections.emptyList(), true);
    }
    
    @e1(version = "1.4")
    public static s m(final Class clazz, final u o) {
        return k1.a.p(d(clazz), Collections.singletonList(o), true);
    }
    
    @e1(version = "1.4")
    public static s n(final Class clazz, final u u, final u u2) {
        return k1.a.p(d(clazz), Arrays.asList(u, u2), true);
    }
    
    @e1(version = "1.4")
    public static s o(final Class clazz, final u... array) {
        return k1.a.p(d(clazz), m.ey(array), true);
    }
    
    @e1(version = "1.4")
    public static s p(final g g) {
        return k1.a.p(g, Collections.emptyList(), true);
    }
    
    public static p q(final c1 c1) {
        return k1.a.j(c1);
    }
    
    public static q r(final kotlin.jvm.internal.e1 e1) {
        return k1.a.k(e1);
    }
    
    public static r s(final g1 g1) {
        return k1.a.l(g1);
    }
    
    @e1(version = "1.3")
    public static String t(final d0 d0) {
        return k1.a.m(d0);
    }
    
    @e1(version = "1.1")
    public static String u(final m0 m0) {
        return k1.a.n(m0);
    }
    
    @e1(version = "1.4")
    public static void v(final t t, final s o) {
        k1.a.o(t, Collections.singletonList(o));
    }
    
    @e1(version = "1.4")
    public static void w(final t t, final s... array) {
        k1.a.o(t, m.ey(array));
    }
    
    @e1(version = "1.4")
    public static s x(final Class clazz) {
        return k1.a.p(d(clazz), Collections.emptyList(), false);
    }
    
    @e1(version = "1.4")
    public static s y(final Class clazz, final u o) {
        return k1.a.p(d(clazz), Collections.singletonList(o), false);
    }
    
    @e1(version = "1.4")
    public static s z(final Class clazz, final u u, final u u2) {
        return k1.a.p(d(clazz), Arrays.asList(u, u2), false);
    }
}
