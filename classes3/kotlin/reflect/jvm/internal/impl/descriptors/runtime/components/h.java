// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.text.s;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.name.a;

public final class h
{
    private static final String b(final a a) {
        final String b = a.i().b();
        k0.o((Object)b, "relativeClassName.asString()");
        final String j2 = s.j2(b, '.', '$', false, 4, null);
        String string;
        if (a.h().d()) {
            string = j2;
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(a.h());
            sb.append('.');
            sb.append(j2);
            string = sb.toString();
        }
        return string;
    }
}
