// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import w6.a;
import kotlin.text.s;
import org.jetbrains.annotations.f;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.e;

public final class a0
{
    @org.jetbrains.annotations.e
    public static final List<e> a(@org.jetbrains.annotations.e final e e) {
        k0.p((Object)e, "name");
        final String d = e.d();
        k0.o((Object)d, "name.asString()");
        final x a = x.a;
        if (x.b(d)) {
            return (List<e>)v.M((Object)b(e));
        }
        if (x.c(d)) {
            return f(e);
        }
        return g.a.b(e);
    }
    
    @f
    public static final e b(@org.jetbrains.annotations.e final e e) {
        k0.p((Object)e, "methodName");
        e e2;
        if ((e2 = e(e, "get", false, null, 12, null)) == null) {
            e2 = e(e, "is", false, null, 8, null);
        }
        return e2;
    }
    
    @f
    public static final e c(@org.jetbrains.annotations.e final e e, final boolean b) {
        k0.p((Object)e, "methodName");
        String s;
        if (b) {
            s = "is";
        }
        else {
            s = null;
        }
        return e(e, "set", false, s, 4, null);
    }
    
    private static final e d(final e e, final String s, final boolean b, final String s2) {
        if (e.j()) {
            return null;
        }
        final String g = e.g();
        k0.o((Object)g, "methodName.identifier");
        final boolean b2 = false;
        if (!s.u2(g, s, false, 2, null)) {
            return null;
        }
        if (g.length() == s.length()) {
            return null;
        }
        final char char1 = g.charAt(s.length());
        int n = b2 ? 1 : 0;
        if ('a' <= char1) {
            n = (b2 ? 1 : 0);
            if (char1 <= 'z') {
                n = 1;
            }
        }
        if (n != 0) {
            return null;
        }
        if (s2 != null) {
            return e.i(k0.C(s2, (Object)s.c4(g, s)));
        }
        if (!b) {
            return e;
        }
        final String c = a.c(s.c4(g, s), true);
        if (!e.k(c)) {
            return null;
        }
        return e.i(c);
    }
    
    static /* synthetic */ e e(final e e, final String s, boolean b, String s2, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            b = true;
        }
        if ((n & 0x8) != 0x0) {
            s2 = null;
        }
        return d(e, s, b, s2);
    }
    
    @org.jetbrains.annotations.e
    public static final List<e> f(@org.jetbrains.annotations.e final e e) {
        k0.p((Object)e, "methodName");
        return (List<e>)v.N((Object[])new e[] { c(e, false), c(e, true) });
    }
}
