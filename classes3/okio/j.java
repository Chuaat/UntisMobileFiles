// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import okio.internal.b;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0000\u001a\f\u0010\t\u001a\u00020\b*\u00020\bH\u0000\u001a\f\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\u0015\u0010\f\u001a\u00020\b*\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u0010\u001a\u00020\b*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u0011\u001a\u00020\b*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u0012\u001a\u00020\b*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u0013\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0000H\u0080\f\u001a\u0015\u0010\u0014\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0080\f\u001a\u0015\u0010\u0015\u001a\u00020\u0000*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0000H\u0080\f\u001a\u0019\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\bH\u0080\b\u001a\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0000H\u0080\b\u001a0\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0000\u001a\f\u0010\u001e\u001a\u00020\u001d*\u00020\u000eH\u0000\u001a\f\u0010\u001f\u001a\u00020\u001d*\u00020\bH\u0000\u001a\f\u0010 \u001a\u00020\u001d*\u00020\u0000H\u0000¨\u0006!" }, d2 = { "", "size", "offset", "byteCount", "Lkotlin/j2;", "e", "", "k", "", "i", "j", "bitCount", "f", "l", "", "other", "n", "m", "a", "b", "r", "c", "h", "g", "", "aOffset", "bOffset", "", "d", "", "o", "p", "q", "okio" }, k = 2, mv = { 1, 4, 1 })
@g(name = "-Util")
public final class j
{
    public static final int a(final byte b, final int n) {
        return b & n;
    }
    
    public static final long b(final byte b, final long n) {
        return (long)b & n;
    }
    
    public static final long c(final int n, final long n2) {
        return (long)n & n2;
    }
    
    public static final boolean d(@e final byte[] array, final int n, @e final byte[] array2, final int n2, final int n3) {
        k0.p((Object)array, "a");
        k0.p((Object)array2, "b");
        for (int i = 0; i < n3; ++i) {
            if (array[i + n] != array2[i + n2]) {
                return false;
            }
        }
        return true;
    }
    
    public static final void e(final long lng, final long lng2, final long lng3) {
        if ((lng2 | lng3) >= 0L && lng2 <= lng && lng - lng2 >= lng3) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("size=");
        sb.append(lng);
        sb.append(" offset=");
        sb.append(lng2);
        sb.append(" byteCount=");
        sb.append(lng3);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }
    
    public static final int f(final int n, final int n2) {
        return n >>> 32 - n2 | n << n2;
    }
    
    public static final long g(final int n, final long b) {
        return Math.min(n, b);
    }
    
    public static final long h(final long a, final int n) {
        return Math.min(a, n);
    }
    
    public static final int i(final int n) {
        return (n & 0xFF) << 24 | ((0xFF000000 & n) >>> 24 | (0xFF0000 & n) >>> 8 | (0xFF00 & n) << 8);
    }
    
    public static final long j(final long n) {
        return (n & 0xFFL) << 56 | ((0xFF00000000000000L & n) >>> 56 | (0xFF000000000000L & n) >>> 40 | (0xFF0000000000L & n) >>> 24 | (0xFF00000000L & n) >>> 8 | (0xFF000000L & n) << 8 | (0xFF0000L & n) << 24 | (0xFF00L & n) << 40);
    }
    
    public static final short k(final short n) {
        final int n2 = n & 0xFFFF;
        return (short)((n2 & 0xFF) << 8 | (0xFF00 & n2) >>> 8);
    }
    
    public static final long l(final long n, final int n2) {
        return n << 64 - n2 | n >>> n2;
    }
    
    public static final int m(final byte b, final int n) {
        return b << n;
    }
    
    public static final int n(final byte b, final int n) {
        return b >> n;
    }
    
    @e
    public static final String o(final byte b) {
        return new String(new char[] { b.I()[b >> 4 & 0xF], b.I()[b & 0xF] });
    }
    
    @e
    public static final String p(int offset) {
        if (offset == 0) {
            return "0";
        }
        final char[] value = new char[8];
        final char c = b.I()[offset >> 28 & 0xF];
        final int n = 0;
        value[0] = c;
        value[1] = b.I()[offset >> 24 & 0xF];
        value[2] = b.I()[offset >> 20 & 0xF];
        value[3] = b.I()[offset >> 16 & 0xF];
        value[4] = b.I()[offset >> 12 & 0xF];
        value[5] = b.I()[offset >> 8 & 0xF];
        value[6] = b.I()[offset >> 4 & 0xF];
        value[7] = b.I()[offset & 0xF];
        for (offset = n; offset < 8 && value[offset] == '0'; ++offset) {}
        return new String(value, offset, 8 - offset);
    }
    
    @e
    public static final String q(final long n) {
        if (n == 0L) {
            return "0";
        }
        final char[] value = new char[16];
        final char c = b.I()[(int)(n >> 60 & 0xFL)];
        int offset = 0;
        value[0] = c;
        value[1] = b.I()[(int)(n >> 56 & 0xFL)];
        value[2] = b.I()[(int)(n >> 52 & 0xFL)];
        value[3] = b.I()[(int)(n >> 48 & 0xFL)];
        value[4] = b.I()[(int)(n >> 44 & 0xFL)];
        value[5] = b.I()[(int)(n >> 40 & 0xFL)];
        value[6] = b.I()[(int)(n >> 36 & 0xFL)];
        value[7] = b.I()[(int)(n >> 32 & 0xFL)];
        value[8] = b.I()[(int)(n >> 28 & 0xFL)];
        value[9] = b.I()[(int)(n >> 24 & 0xFL)];
        value[10] = b.I()[(int)(n >> 20 & 0xFL)];
        value[11] = b.I()[(int)(n >> 16 & 0xFL)];
        value[12] = b.I()[(int)(n >> 12 & 0xFL)];
        value[13] = b.I()[(int)(n >> 8 & 0xFL)];
        value[14] = b.I()[(int)(n >> 4 & 0xFL)];
        value[15] = b.I()[(int)(n & 0xFL)];
        while (offset < 16 && value[offset] == '0') {
            ++offset;
        }
        return new String(value, offset, 16 - offset);
    }
    
    public static final byte r(final byte b, final byte b2) {
        return (byte)(b ^ b2);
    }
}
