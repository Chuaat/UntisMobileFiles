// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import java.util.Set;
import java.util.Map;
import java.util.ListIterator;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import n6.o;
import n6.n;
import n6.m;
import n6.k;
import n6.j;
import n6.i;
import n6.h;
import n6.g;
import n6.f;
import n6.e;
import n6.d;
import n6.c;
import n6.b;
import n6.w;
import n6.v;
import n6.u;
import n6.t;
import n6.s;
import n6.r;
import n6.q;
import n6.p;
import n6.l;
import n6.a;

public class q1
{
    public static int A(final Object o) {
        if (o instanceof d0) {
            return ((d0)o).getArity();
        }
        if (o instanceof a) {
            return 0;
        }
        if (o instanceof l) {
            return 1;
        }
        if (o instanceof p) {
            return 2;
        }
        if (o instanceof q) {
            return 3;
        }
        if (o instanceof r) {
            return 4;
        }
        if (o instanceof s) {
            return 5;
        }
        if (o instanceof t) {
            return 6;
        }
        if (o instanceof u) {
            return 7;
        }
        if (o instanceof v) {
            return 8;
        }
        if (o instanceof w) {
            return 9;
        }
        if (o instanceof b) {
            return 10;
        }
        if (o instanceof c) {
            return 11;
        }
        if (o instanceof d) {
            return 12;
        }
        if (o instanceof e) {
            return 13;
        }
        if (o instanceof f) {
            return 14;
        }
        if (o instanceof g) {
            return 15;
        }
        if (o instanceof h) {
            return 16;
        }
        if (o instanceof i) {
            return 17;
        }
        if (o instanceof j) {
            return 18;
        }
        if (o instanceof k) {
            return 19;
        }
        if (o instanceof m) {
            return 20;
        }
        if (o instanceof n) {
            return 21;
        }
        if (o instanceof o) {
            return 22;
        }
        return -1;
    }
    
    public static boolean B(final Object o, final int n) {
        return o instanceof kotlin.t && A(o) == n;
    }
    
    public static boolean C(final Object o) {
        return o instanceof Collection && (!(o instanceof o6.a) || o instanceof o6.b);
    }
    
    public static boolean D(final Object o) {
        return o instanceof Iterable && (!(o instanceof o6.a) || o instanceof o6.c);
    }
    
    public static boolean E(final Object o) {
        return o instanceof Iterator && (!(o instanceof o6.a) || o instanceof o6.d);
    }
    
    public static boolean F(final Object o) {
        return o instanceof List && (!(o instanceof o6.a) || o instanceof o6.e);
    }
    
    public static boolean G(final Object o) {
        return o instanceof ListIterator && (!(o instanceof o6.a) || o instanceof o6.f);
    }
    
    public static boolean H(final Object o) {
        return o instanceof Map && (!(o instanceof o6.a) || o instanceof o6.g);
    }
    
    public static boolean I(final Object o) {
        return o instanceof Map.Entry && (!(o instanceof o6.a) || o instanceof o6.g.a);
    }
    
    public static boolean J(final Object o) {
        return o instanceof Set && (!(o instanceof o6.a) || o instanceof o6.h);
    }
    
    private static <T extends Throwable> T K(final T t) {
        return k0.B(t, q1.class.getName());
    }
    
    public static ClassCastException L(final ClassCastException ex) {
        throw K(ex);
    }
    
    public static void M(final Object o, final String str) {
        String name;
        if (o == null) {
            name = "null";
        }
        else {
            name = o.getClass().getName();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" cannot be cast to ");
        sb.append(str);
        N(sb.toString());
    }
    
    public static void N(final String s) {
        throw L(new ClassCastException(s));
    }
    
    public static Collection a(final Object o) {
        if (o instanceof o6.a && !(o instanceof o6.b)) {
            M(o, "kotlin.collections.MutableCollection");
        }
        return s(o);
    }
    
    public static Collection b(final Object o, final String s) {
        if (o instanceof o6.a && !(o instanceof o6.b)) {
            N(s);
        }
        return s(o);
    }
    
    public static Iterable c(final Object o) {
        if (o instanceof o6.a && !(o instanceof o6.c)) {
            M(o, "kotlin.collections.MutableIterable");
        }
        return t(o);
    }
    
    public static Iterable d(final Object o, final String s) {
        if (o instanceof o6.a && !(o instanceof o6.c)) {
            N(s);
        }
        return t(o);
    }
    
    public static Iterator e(final Object o) {
        if (o instanceof o6.a && !(o instanceof o6.d)) {
            M(o, "kotlin.collections.MutableIterator");
        }
        return u(o);
    }
    
    public static Iterator f(final Object o, final String s) {
        if (o instanceof o6.a && !(o instanceof o6.d)) {
            N(s);
        }
        return u(o);
    }
    
    public static List g(final Object o) {
        if (o instanceof o6.a && !(o instanceof o6.e)) {
            M(o, "kotlin.collections.MutableList");
        }
        return v(o);
    }
    
    public static List h(final Object o, final String s) {
        if (o instanceof o6.a && !(o instanceof o6.e)) {
            N(s);
        }
        return v(o);
    }
    
    public static ListIterator i(final Object o) {
        if (o instanceof o6.a && !(o instanceof o6.f)) {
            M(o, "kotlin.collections.MutableListIterator");
        }
        return w(o);
    }
    
    public static ListIterator j(final Object o, final String s) {
        if (o instanceof o6.a && !(o instanceof o6.f)) {
            N(s);
        }
        return w(o);
    }
    
    public static Map k(final Object o) {
        if (o instanceof o6.a && !(o instanceof o6.g)) {
            M(o, "kotlin.collections.MutableMap");
        }
        return x(o);
    }
    
    public static Map l(final Object o, final String s) {
        if (o instanceof o6.a && !(o instanceof o6.g)) {
            N(s);
        }
        return x(o);
    }
    
    public static Map.Entry m(final Object o) {
        if (o instanceof o6.a && !(o instanceof o6.g.a)) {
            M(o, "kotlin.collections.MutableMap.MutableEntry");
        }
        return y(o);
    }
    
    public static Map.Entry n(final Object o, final String s) {
        if (o instanceof o6.a && !(o instanceof o6.g.a)) {
            N(s);
        }
        return y(o);
    }
    
    public static Set o(final Object o) {
        if (o instanceof o6.a && !(o instanceof o6.h)) {
            M(o, "kotlin.collections.MutableSet");
        }
        return z(o);
    }
    
    public static Set p(final Object o, final String s) {
        if (o instanceof o6.a && !(o instanceof o6.h)) {
            N(s);
        }
        return z(o);
    }
    
    public static Object q(final Object o, final int i) {
        if (o != null && !B(o, i)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.functions.Function");
            sb.append(i);
            M(o, sb.toString());
        }
        return o;
    }
    
    public static Object r(final Object o, final int n, final String s) {
        if (o != null && !B(o, n)) {
            N(s);
        }
        return o;
    }
    
    public static Collection s(final Object o) {
        try {
            return (Collection)o;
        }
        catch (ClassCastException ex) {
            throw L(ex);
        }
    }
    
    public static Iterable t(final Object o) {
        try {
            return (Iterable)o;
        }
        catch (ClassCastException ex) {
            throw L(ex);
        }
    }
    
    public static Iterator u(final Object o) {
        try {
            return (Iterator)o;
        }
        catch (ClassCastException ex) {
            throw L(ex);
        }
    }
    
    public static List v(final Object o) {
        try {
            return (List)o;
        }
        catch (ClassCastException ex) {
            throw L(ex);
        }
    }
    
    public static ListIterator w(final Object o) {
        try {
            return (ListIterator)o;
        }
        catch (ClassCastException ex) {
            throw L(ex);
        }
    }
    
    public static Map x(final Object o) {
        try {
            return (Map)o;
        }
        catch (ClassCastException ex) {
            throw L(ex);
        }
    }
    
    public static Map.Entry y(final Object o) {
        try {
            return (Map.Entry)o;
        }
        catch (ClassCastException ex) {
            throw L(ex);
        }
    }
    
    public static Set z(final Object o) {
        try {
            return (Set)o;
        }
        catch (ClassCastException ex) {
            throw L(ex);
        }
    }
}
