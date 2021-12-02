// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.name.c;

public final class n
{
    @e
    public static final String a(@e final c c) {
        k0.p((Object)c, "<this>");
        final List<kotlin.reflect.jvm.internal.impl.name.e> h = c.h();
        k0.o((Object)h, "pathSegments()");
        return c(h);
    }
    
    @e
    public static final String b(@e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)e, "<this>");
        String s;
        if (d(e)) {
            final String d = e.d();
            k0.o((Object)d, "asString()");
            final StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf('`'));
            sb.append(d);
            s = k0.C(sb.toString(), (Object)"`");
        }
        else {
            s = e.d();
            k0.o((Object)s, "asString()");
        }
        return s;
    }
    
    @e
    public static final String c(@e final List<kotlin.reflect.jvm.internal.impl.name.e> list) {
        k0.p((Object)list, "pathSegments");
        final StringBuilder sb = new StringBuilder();
        for (final kotlin.reflect.jvm.internal.impl.name.e e : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(b(e));
        }
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    private static final boolean d(final kotlin.reflect.jvm.internal.impl.name.e e) {
        final boolean j = e.j();
        boolean b = false;
        if (j) {
            return false;
        }
        final String d = e.d();
        k0.o((Object)d, "asString()");
        if (!i.a.contains(d)) {
            int i = 0;
            while (true) {
                while (i < d.length()) {
                    final char char1 = d.charAt(i);
                    if (!Character.isLetterOrDigit(char1) && char1 != '_') {
                        final boolean b2 = true;
                        if (b2) {
                            return true;
                        }
                        return b;
                    }
                    else {
                        ++i;
                    }
                }
                final boolean b2 = false;
                continue;
            }
        }
        b = true;
        return b;
    }
}
