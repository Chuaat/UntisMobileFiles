// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u000f\u001a\u0015\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0082\b\u001a\r\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0086\b\"\u0016\u0010\b\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b\"\u0016\u0010\u000f\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007\"\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b\"\u0016\u0010\u0013\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000b\"\u0016\u0010\u0015\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007\"\u0016\u0010\u0017\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007¨\u0006\u0018" }, d2 = { "", "bit", "", "b", "Lokio/r0;", "Lokio/y;", "c", "I", "FNAME", "", "f", "B", "SECTION_BODY", "g", "SECTION_TRAILER", "FEXTRA", "e", "SECTION_HEADER", "h", "SECTION_DONE", "d", "FCOMMENT", "a", "FHCRC", "okio" }, k = 2, mv = { 1, 4, 1 })
@m6.g(name = "-GzipSourceExtensions")
public final class g
{
    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 3;
    private static final int d = 4;
    private static final byte e = 0;
    private static final byte f = 1;
    private static final byte g = 2;
    private static final byte h = 3;
    
    private static final boolean b(final int n, final int n2) {
        boolean b = true;
        if ((n >> n2 & 0x1) != 0x1) {
            b = false;
        }
        return b;
    }
    
    @e
    public static final y c(@e final r0 r0) {
        k0.p((Object)r0, "$this$gzip");
        return new y(r0);
    }
}
