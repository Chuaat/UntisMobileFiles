// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.name;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.text.s;

public final class d
{
    private static final boolean a(final String s, final String s2) {
        boolean b = false;
        if (s.u2(s, s2, false, 2, null)) {
            b = b;
            if (s.charAt(s2.length()) == '.') {
                b = true;
            }
        }
        return b;
    }
    
    public static final boolean b(@e final b b, @e final b b2) {
        k0.p((Object)b, "<this>");
        k0.p((Object)b2, "packageName");
        final boolean g = k0.g((Object)b, (Object)b2);
        boolean a = true;
        if (!g) {
            if (!b2.d()) {
                final String b3 = b.b();
                k0.o((Object)b3, "this.asString()");
                final String b4 = b2.b();
                k0.o((Object)b4, "packageName.asString()");
                a = a(b3, b4);
            }
        }
        return a;
    }
    
    public static final boolean c(@f final String s) {
        boolean b = false;
        if (s == null) {
            return false;
        }
        h h = kotlin.reflect.jvm.internal.impl.name.h.G;
        int i = 0;
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            ++i;
            final int n = a.a[h.ordinal()];
            if (n != 1 && n != 2) {
                if (n != 3) {
                    continue;
                }
                if (char1 == '.') {
                    h = kotlin.reflect.jvm.internal.impl.name.h.I;
                }
                else {
                    if (!Character.isJavaIdentifierPart(char1)) {
                        return false;
                    }
                    continue;
                }
            }
            else {
                if (!Character.isJavaIdentifierPart(char1)) {
                    return false;
                }
                h = kotlin.reflect.jvm.internal.impl.name.h.H;
            }
        }
        if (h != kotlin.reflect.jvm.internal.impl.name.h.I) {
            b = true;
        }
        return b;
    }
    
    @e
    public static final b d(@e final b b, @e final b b2) {
        k0.p((Object)b, "<this>");
        k0.p((Object)b2, "prefix");
        b c = b;
        if (b(b, b2)) {
            if (b2.d()) {
                c = b;
            }
            else if (k0.g((Object)b, (Object)b2)) {
                c = b.c;
                k0.o((Object)c, "ROOT");
            }
            else {
                final String b3 = b.b();
                k0.o((Object)b3, "asString()");
                final String substring = b3.substring(b2.b().length() + 1);
                k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
                c = new b(substring);
            }
        }
        return c;
    }
}
