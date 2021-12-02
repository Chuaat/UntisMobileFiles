// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import kotlin.z0;
import kotlin.k;
import kotlin.jvm.internal.k0;
import kotlin.i;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\f" }, d2 = { "Lokio/e;", "", "", "string", "", "a", "", "beginIndex", "endIndex", "b", "<init>", "()V", "okio" }, k = 1, mv = { 1, 4, 1 })
@i(message = "changed in Okio 2.x")
public final class e
{
    @org.jetbrains.annotations.e
    public static final e a;
    
    static {
        a = new e();
    }
    
    private e() {
    }
    
    @i(level = k.H, message = "moved to extension function", replaceWith = @z0(expression = "string.utf8Size()", imports = { "okio.utf8Size" }))
    public final long a(@org.jetbrains.annotations.e final String s) {
        k0.p((Object)s, "string");
        return u0.l(s, 0, 0, 3, null);
    }
    
    @i(level = k.H, message = "moved to extension function", replaceWith = @z0(expression = "string.utf8Size(beginIndex, endIndex)", imports = { "okio.utf8Size" }))
    public final long b(@org.jetbrains.annotations.e final String s, final int n, final int n2) {
        k0.p((Object)s, "string");
        return u0.k(s, n, n2);
    }
}
