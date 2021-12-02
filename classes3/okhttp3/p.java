// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.k0;
import m6.h;
import m6.k;
import java.nio.charset.Charset;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n" }, d2 = { "Lokhttp3/p;", "", "", "username", "password", "Ljava/nio/charset/Charset;", "charset", "b", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class p
{
    public static final p a;
    
    static {
        a = new p();
    }
    
    private p() {
    }
    
    @k
    @h
    @e
    public static final String a(@e final String s, @e final String s2) {
        return c(s, s2, null, 4, null);
    }
    
    @k
    @h
    @e
    public static final String b(@e String s, @e final String str, @e final Charset charset) {
        k0.p((Object)s, "username");
        k0.p((Object)str, "password");
        k0.p((Object)charset, "charset");
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(':');
        sb.append(str);
        s = sb.toString();
        s = okio.p.L.j(s, charset).g();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Basic ");
        sb2.append(s);
        return sb2.toString();
    }
    
    public static /* synthetic */ String c(final String s, final String s2, Charset iso_8859_1, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            iso_8859_1 = StandardCharsets.ISO_8859_1;
            k0.o((Object)iso_8859_1, "ISO_8859_1");
        }
        return b(s, s2, iso_8859_1);
    }
}
