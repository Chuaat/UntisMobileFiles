// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import kotlin.b1$a;
import kotlin.c1;
import kotlin.b1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001c\u0010\u0004\u001a\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005" }, d2 = { "", "a", "Z", "()Z", "ANDROID_DETECTED", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class n
{
    private static final boolean a;
    
    static {
        Object b = null;
        try {
            final b1$a h = b1.H;
            b1.b((Object)Class.forName("android.os.Build"));
        }
        finally {
            final b1$a h2 = b1.H;
            final Throwable t;
            b = b1.b(c1.a(t));
        }
        a = b1.j(b);
    }
    
    public static final boolean a() {
        return n.a;
    }
}
