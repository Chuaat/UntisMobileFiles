// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.name;

import m6.k;
import kotlin.jvm.internal.k0;
import kotlin.text.o;
import org.jetbrains.annotations.e;

public final class f
{
    @e
    public static final f a;
    @e
    private static final o b;
    
    static {
        a = new f();
        b = new o("[^\\p{L}\\p{Digit}]");
    }
    
    private f() {
    }
    
    @k
    @e
    public static final String a(@e final String s) {
        k0.p((Object)s, "name");
        return f.b.j(s, "_");
    }
}
