// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.text.s;
import m6.k;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.a;
import m6.d;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.e;

public final class x
{
    @e
    public static final x a;
    @d
    @e
    public static final b b;
    @e
    private static final a c;
    
    static {
        a = new x();
        b = new b("kotlin.jvm.JvmField");
        final a m = kotlin.reflect.jvm.internal.impl.name.a.m(new b("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        k0.o((Object)m, "topLevel(FqName(\"kotlin.reflect.jvm.internal.ReflectionFactoryImpl\"))");
        c = m;
    }
    
    private x() {
    }
    
    @k
    @e
    public static final String a(@e String c) {
        k0.p((Object)c, "propertyName");
        if (!e(c)) {
            c = k0.C("get", (Object)w6.a.a(c));
        }
        return c;
    }
    
    @k
    public static final boolean b(@e final String s) {
        k0.p((Object)s, "name");
        boolean b = false;
        if (s.u2(s, "get", false, 2, null) || s.u2(s, "is", false, 2, null)) {
            b = true;
        }
        return b;
    }
    
    @k
    public static final boolean c(@e final String s) {
        k0.p((Object)s, "name");
        return s.u2(s, "set", false, 2, null);
    }
    
    @k
    @e
    public static final String d(@e String s) {
        k0.p((Object)s, "propertyName");
        if (e(s)) {
            s = s.substring(2);
            k0.o((Object)s, "(this as java.lang.String).substring(startIndex)");
        }
        else {
            s = w6.a.a(s);
        }
        return k0.C("set", (Object)s);
    }
    
    @k
    public static final boolean e(@e final String s) {
        k0.p((Object)s, "name");
        boolean b = false;
        if (!s.u2(s, "is", false, 2, null)) {
            return false;
        }
        if (s.length() == 2) {
            return false;
        }
        final char char1 = s.charAt(2);
        if (k0.t(97, (int)char1) > 0 || k0.t((int)char1, 122) > 0) {
            b = true;
        }
        return b;
    }
}
