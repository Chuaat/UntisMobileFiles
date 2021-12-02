// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.text.s;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

public final class g
{
    @e
    public static final f a(@e String s) {
        k0.p((Object)s, "value");
        f f;
        if (!s.u2(s, "0x", false, 2, null) && !s.u2(s, "0X", false, 2, null)) {
            if (!s.u2(s, "0b", false, 2, null) && !s.u2(s, "0B", false, 2, null)) {
                f = new f(s, 10);
            }
            else {
                s = s.substring(2);
                k0.o((Object)s, "(this as java.lang.String).substring(startIndex)");
                f = new f(s, 2);
            }
        }
        else {
            s = s.substring(2);
            k0.o((Object)s, "(this as java.lang.String).substring(startIndex)");
            f = new f(s, 16);
        }
        return f;
    }
}
