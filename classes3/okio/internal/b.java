// 
// Decompiled by Procyon v0.5.36
// 

package okio.internal;

import org.jetbrains.annotations.f;
import okio.a;
import kotlin.j2;
import okio.i;
import kotlin.text.s;
import java.util.Objects;
import kotlin.collections.m;
import okio.j;
import java.util.Arrays;
import kotlin.jvm.internal.k0;
import okio.p;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0006\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\r\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0080\b\u001a\r\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0080\b\u001a\u0015\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0080\b\u001a\r\u0010\u000f\u001a\u00020\b*\u00020\u0000H\u0080\b\u001a\r\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0080\b\u001a\r\u0010\u0012\u001a\u00020\u0010*\u00020\u0000H\u0080\b\u001a-\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0080\b\u001a-\u0010\u0019\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0080\b\u001a\u0015\u0010\u001b\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0010H\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0010H\u0080\b\u001a\u001d\u0010!\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\bH\u0080\b\u001a\u001d\u0010\"\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\bH\u0080\b\u001a\u001d\u0010#\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\bH\u0080\b\u001a\u0017\u0010%\u001a\u00020\u0017*\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010$H\u0080\b\u001a\r\u0010&\u001a\u00020\b*\u00020\u0000H\u0080\b\u001a\u0015\u0010'\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000H\u0080\b\u001a\u0011\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0010H\u0080\b\u001a\u001d\u0010*\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0080\b\u001a\r\u0010+\u001a\u00020\u0000*\u00020\u0001H\u0080\b\u001a\u000f\u0010,\u001a\u0004\u0018\u00010\u0000*\u00020\u0001H\u0080\b\u001a\r\u0010-\u001a\u00020\u0000*\u00020\u0001H\u0080\b\u001a$\u00101\u001a\u000200*\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0000\u001a\u0010\u00104\u001a\u00020\b2\u0006\u00103\u001a\u000202H\u0002\u001a\r\u00105\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\u0018\u00103\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00102\u0006\u00106\u001a\u00020\bH\u0002\"\u001c\u0010<\u001a\u0002078\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006=" }, d2 = { "Lokio/p;", "", "F", "d", "e", "p", "A", "B", "", "beginIndex", "endIndex", "z", "pos", "", "m", "n", "", "C", "r", "offset", "other", "otherOffset", "byteCount", "", "v", "w", "prefix", "x", "y", "suffix", "j", "k", "fromIndex", "q", "s", "t", "", "l", "o", "f", "data", "u", "D", "i", "g", "h", "Lokio/m;", "buffer", "Lkotlin/j2;", "G", "", "c", "H", "E", "codePointCount", "", "a", "[C", "I", "()[C", "HEX_DIGIT_CHARS", "okio" }, k = 2, mv = { 1, 4, 1 })
public final class b
{
    @e
    private static final char[] a;
    
    static {
        a = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    }
    
    @e
    public static final p A(@e final p p) {
        k0.p((Object)p, "$this$commonToAsciiLowercase");
        for (int i = 0; i < p.v().length; ++i) {
            final byte b = p.v()[i];
            final byte b2 = 65;
            if (b >= b2) {
                final byte b3 = 90;
                if (b <= b3) {
                    final byte[] v = p.v();
                    final byte[] copy = Arrays.copyOf(v, v.length);
                    k0.o((Object)copy, "java.util.Arrays.copyOf(this, size)");
                    final int n = i + 1;
                    copy[i] = (byte)(b + 32);
                    for (int j = n; j < copy.length; ++j) {
                        final byte b4 = copy[j];
                        if (b4 >= b2) {
                            if (b4 <= b3) {
                                copy[j] = (byte)(b4 + 32);
                            }
                        }
                    }
                    return new p(copy);
                }
            }
        }
        return p;
    }
    
    @e
    public static final p B(@e final p p) {
        k0.p((Object)p, "$this$commonToAsciiUppercase");
        for (int i = 0; i < p.v().length; ++i) {
            final byte b = p.v()[i];
            final byte b2 = 97;
            if (b >= b2) {
                final byte b3 = 122;
                if (b <= b3) {
                    final byte[] v = p.v();
                    final byte[] copy = Arrays.copyOf(v, v.length);
                    k0.o((Object)copy, "java.util.Arrays.copyOf(this, size)");
                    final int n = i + 1;
                    copy[i] = (byte)(b - 32);
                    for (int j = n; j < copy.length; ++j) {
                        final byte b4 = copy[j];
                        if (b4 >= b2) {
                            if (b4 <= b3) {
                                copy[j] = (byte)(b4 - 32);
                            }
                        }
                    }
                    return new p(copy);
                }
            }
        }
        return p;
    }
    
    @e
    public static final byte[] C(@e final p p) {
        k0.p((Object)p, "$this$commonToByteArray");
        final byte[] v = p.v();
        final byte[] copy = Arrays.copyOf(v, v.length);
        k0.o((Object)copy, "java.util.Arrays.copyOf(this, size)");
        return copy;
    }
    
    @e
    public static final p D(@e final byte[] array, final int n, final int n2) {
        k0.p((Object)array, "$this$commonToByteString");
        j.e(array.length, n, n2);
        return new p(m.G1(array, n, n2 + n));
    }
    
    @e
    public static final String E(@e final p p) {
        p p2 = p;
        k0.p((Object)p2, "$this$commonToString");
        final int length = p.v().length;
        final int n = 1;
        if (length == 0) {
            return "[size=0]";
        }
        final int a = c(p.v(), 64);
        if (a == -1) {
            StringBuilder sb2;
            if (p.v().length <= 64) {
                final StringBuilder sb = new StringBuilder();
                sb.append("[hex=");
                sb.append(p.E());
                sb.append(']');
                sb2 = sb;
            }
            else {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("[size=");
                sb3.append(p.v().length);
                sb3.append(" hex=");
                int n2;
                if (64 <= p.v().length) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 == 0) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("endIndex > length(");
                    sb4.append(p.v().length);
                    sb4.append(')');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                if (64 != p.v().length) {
                    p2 = new p(m.G1(p.v(), 0, 64));
                }
                sb3.append(p2.E());
                sb3.append("\u2026]");
                sb2 = sb3;
            }
            return sb2.toString();
        }
        final String u0 = p.U0();
        Objects.requireNonNull(u0, "null cannot be cast to non-null type java.lang.String");
        final String substring = u0.substring(0, a);
        k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        final String k2 = s.k2(s.k2(s.k2(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
        StringBuilder sb6;
        if (a < u0.length()) {
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("[size=");
            sb5.append(p.v().length);
            sb5.append(" text=");
            sb5.append(k2);
            sb5.append("\u2026]");
            sb6 = sb5;
        }
        else {
            sb6 = new StringBuilder();
            sb6.append("[text=");
            sb6.append(k2);
            sb6.append(']');
        }
        return sb6.toString();
    }
    
    @e
    public static final String F(@e final p p) {
        k0.p((Object)p, "$this$commonUtf8");
        String s;
        if ((s = p.B()) == null) {
            s = i.c(p.a0());
            p.B0(s);
        }
        return s;
    }
    
    public static final void G(@e final p p4, @e final okio.m m, final int n, final int n2) {
        k0.p((Object)p4, "$this$commonWrite");
        k0.p((Object)m, "buffer");
        m.D0(p4.v(), n, n2);
    }
    
    private static final int H(final char c) {
        if ('0' <= c) {
            if ('9' >= c) {
                return c - '0';
            }
        }
        char c2 = 'a';
        Label_0051: {
            if ('a' > c) {
                break Label_0051;
            }
            if ('f' < c) {
                break Label_0051;
            }
            return c - c2 + 10;
        }
        c2 = 'A';
        if ('A' <= c && 'F' >= c) {
            return c - c2 + 10;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected hex digit: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @e
    public static final char[] I() {
        return b.a;
    }
    
    private static final int c(final byte[] array, final int n) {
        final int length = array.length;
        int i = 0;
        int n2 = 0;
        int n3 = 0;
    Label_0011:
        while (i < length) {
            final byte b = array[i];
            if (b >= 0) {
                final int n4 = n3 + 1;
                if (n3 == n) {
                    return n2;
                }
                if (b != 10 && b != 13) {
                    boolean b2 = false;
                    Label_0094: {
                        Label_0085: {
                            if (b < 0 || 31 < b) {
                                if (127 <= b) {
                                    if (159 >= b) {
                                        break Label_0085;
                                    }
                                }
                                b2 = false;
                                break Label_0094;
                            }
                        }
                        b2 = true;
                    }
                    if (b2) {
                        return -1;
                    }
                }
                if (b != 65533) {
                    int n5;
                    if (b < 65536) {
                        n5 = 1;
                    }
                    else {
                        n5 = 2;
                    }
                    final int n6 = n2 + n5;
                    int n7 = i + 1;
                    int n8 = n4;
                    int n9 = n6;
                    while (true) {
                        final int n10 = n8;
                        i = n7;
                        n2 = n9;
                        n3 = n10;
                        if (n7 >= length) {
                            continue Label_0011;
                        }
                        i = n7;
                        n2 = n9;
                        n3 = n10;
                        if (array[n7] < 0) {
                            continue Label_0011;
                        }
                        final byte b3 = array[n7];
                        final int n11 = n10 + 1;
                        if (n10 == n) {
                            break;
                        }
                        if (b3 != 10 && b3 != 13) {
                            boolean b4 = false;
                            Label_0255: {
                                Label_0248: {
                                    if (b3 < 0 || 31 < b3) {
                                        if (127 <= b3) {
                                            if (159 >= b3) {
                                                break Label_0248;
                                            }
                                        }
                                        b4 = false;
                                        break Label_0255;
                                    }
                                }
                                b4 = true;
                            }
                            if (b4) {
                                return -1;
                            }
                        }
                        if (b3 == 65533) {
                            return -1;
                        }
                        int n12;
                        if (b3 < 65536) {
                            n12 = 1;
                        }
                        else {
                            n12 = 2;
                        }
                        n9 += n12;
                        ++n7;
                        n8 = n11;
                    }
                    return n9;
                }
                return -1;
            }
            else if (b >> 5 == -2) {
                final int n13 = i + 1;
                if (length <= n13) {
                    if (n3 == n) {
                        return n2;
                    }
                    return -1;
                }
                else {
                    final byte b5 = array[i];
                    final byte b6 = array[n13];
                    if ((b6 & 0xC0) != 0x80) {
                        if (n3 == n) {
                            return n2;
                        }
                        return -1;
                    }
                    else {
                        final int n14 = b6 ^ 0xF80 ^ b5 << 6;
                        if (n14 < 128) {
                            if (n3 == n) {
                                return n2;
                            }
                            return -1;
                        }
                        else {
                            final int n15 = n3 + 1;
                            if (n3 == n) {
                                return n2;
                            }
                            if (n14 != 10 && n14 != 13) {
                                boolean b7 = false;
                                Label_0479: {
                                    Label_0470: {
                                        if (n14 < 0 || 31 < n14) {
                                            if (127 <= n14) {
                                                if (159 >= n14) {
                                                    break Label_0470;
                                                }
                                            }
                                            b7 = false;
                                            break Label_0479;
                                        }
                                    }
                                    b7 = true;
                                }
                                if (b7) {
                                    return -1;
                                }
                            }
                            if (n14 != 65533) {
                                int n16;
                                if (n14 < 65536) {
                                    n16 = 1;
                                }
                                else {
                                    n16 = 2;
                                }
                                n2 += n16;
                                final j2 a = j2.a;
                                i += 2;
                                n3 = n15;
                                continue;
                            }
                            return -1;
                        }
                    }
                }
            }
            else if (b >> 4 == -2) {
                final int n17 = i + 2;
                if (length <= n17) {
                    if (n3 == n) {
                        return n2;
                    }
                    return -1;
                }
                else {
                    final byte b8 = array[i];
                    final byte b9 = array[i + 1];
                    if ((b9 & 0xC0) != 0x80) {
                        if (n3 == n) {
                            return n2;
                        }
                        return -1;
                    }
                    else {
                        final byte b10 = array[n17];
                        if ((b10 & 0xC0) != 0x80) {
                            if (n3 == n) {
                                return n2;
                            }
                            return -1;
                        }
                        else {
                            final int n18 = b10 ^ 0xFFFE1F80 ^ b9 << 6 ^ b8 << 12;
                            if (n18 < 2048) {
                                if (n3 == n) {
                                    return n2;
                                }
                                return -1;
                            }
                            else {
                                if (55296 <= n18) {
                                    if (57343 >= n18) {
                                        if (n3 == n) {
                                            return n2;
                                        }
                                        return -1;
                                    }
                                }
                                final int n19 = n3 + 1;
                                if (n3 == n) {
                                    return n2;
                                }
                                if (n18 != 10 && n18 != 13) {
                                    boolean b11 = false;
                                    Label_0793: {
                                        Label_0784: {
                                            if (n18 < 0 || 31 < n18) {
                                                if (127 <= n18) {
                                                    if (159 >= n18) {
                                                        break Label_0784;
                                                    }
                                                }
                                                b11 = false;
                                                break Label_0793;
                                            }
                                        }
                                        b11 = true;
                                    }
                                    if (b11) {
                                        return -1;
                                    }
                                }
                                if (n18 != 65533) {
                                    int n20;
                                    if (n18 < 65536) {
                                        n20 = 1;
                                    }
                                    else {
                                        n20 = 2;
                                    }
                                    n2 += n20;
                                    final j2 a2 = j2.a;
                                    i += 3;
                                    n3 = n19;
                                    continue;
                                }
                                return -1;
                            }
                        }
                    }
                }
            }
            else if (b >> 3 == -2) {
                final int n21 = i + 3;
                if (length <= n21) {
                    if (n3 == n) {
                        return n2;
                    }
                    return -1;
                }
                else {
                    final byte b12 = array[i];
                    final byte b13 = array[i + 1];
                    if ((b13 & 0xC0) != 0x80) {
                        if (n3 == n) {
                            return n2;
                        }
                        return -1;
                    }
                    else {
                        final byte b14 = array[i + 2];
                        if ((b14 & 0xC0) != 0x80) {
                            if (n3 == n) {
                                return n2;
                            }
                            return -1;
                        }
                        else {
                            final byte b15 = array[n21];
                            if ((b15 & 0xC0) != 0x80) {
                                if (n3 == n) {
                                    return n2;
                                }
                                return -1;
                            }
                            else {
                                final int n22 = b15 ^ 0x381F80 ^ b14 << 6 ^ b13 << 12 ^ b12 << 18;
                                if (n22 > 1114111) {
                                    if (n3 == n) {
                                        return n2;
                                    }
                                    return -1;
                                }
                                else {
                                    if (55296 <= n22) {
                                        if (57343 >= n22) {
                                            if (n3 == n) {
                                                return n2;
                                            }
                                            return -1;
                                        }
                                    }
                                    if (n22 < 65536) {
                                        if (n3 == n) {
                                            return n2;
                                        }
                                        return -1;
                                    }
                                    else {
                                        final int n23 = n3 + 1;
                                        if (n3 == n) {
                                            return n2;
                                        }
                                        if (n22 != 10 && n22 != 13) {
                                            boolean b16 = false;
                                            Label_1176: {
                                                Label_1167: {
                                                    if (n22 < 0 || 31 < n22) {
                                                        if (127 <= n22) {
                                                            if (159 >= n22) {
                                                                break Label_1167;
                                                            }
                                                        }
                                                        b16 = false;
                                                        break Label_1176;
                                                    }
                                                }
                                                b16 = true;
                                            }
                                            if (b16) {
                                                return -1;
                                            }
                                        }
                                        if (n22 != 65533) {
                                            int n24;
                                            if (n22 < 65536) {
                                                n24 = 1;
                                            }
                                            else {
                                                n24 = 2;
                                            }
                                            n2 += n24;
                                            final j2 a3 = j2.a;
                                            i += 4;
                                            n3 = n23;
                                            continue;
                                        }
                                        return -1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else {
                if (n3 == n) {
                    return n2;
                }
                return -1;
            }
        }
        return n2;
    }
    
    @e
    public static final String d(@e final p p) {
        k0.p((Object)p, "$this$commonBase64");
        return okio.a.c(p.v(), null, 1, null);
    }
    
    @e
    public static final String e(@e final p p) {
        k0.p((Object)p, "$this$commonBase64Url");
        return okio.a.b(p.v(), okio.a.e());
    }
    
    public static final int f(@e final p p2, @e final p p3) {
        k0.p((Object)p2, "$this$commonCompareTo");
        k0.p((Object)p3, "other");
        final int size = p2.size();
        final int size2 = p3.size();
        final int min = Math.min(size, size2);
        int n = 0;
        while (true) {
            int n2 = -1;
            if (n < min) {
                final int n3 = p2.u(n) & 0xFF;
                final int n4 = p3.u(n) & 0xFF;
                if (n3 != n4) {
                    if (n3 >= n4) {
                        n2 = 1;
                    }
                    return n2;
                }
                ++n;
            }
            else {
                if (size == size2) {
                    return 0;
                }
                if (size >= size2) {
                    n2 = 1;
                }
                return n2;
            }
        }
    }
    
    @f
    public static final p g(@e final String s) {
        k0.p((Object)s, "$this$commonDecodeBase64");
        final byte[] a = okio.a.a(s);
        p p;
        if (a != null) {
            p = new p(a);
        }
        else {
            p = null;
        }
        return p;
    }
    
    @e
    public static final p h(@e final String str) {
        k0.p((Object)str, "$this$commonDecodeHex");
        final int length = str.length();
        final int n = 0;
        if (length % 2 == 0) {
            final int n2 = str.length() / 2;
            final byte[] array = new byte[n2];
            for (int i = n; i < n2; ++i) {
                final int index = i * 2;
                array[i] = (byte)((H(str.charAt(index)) << 4) + H(str.charAt(index + 1)));
            }
            return new p(array);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected hex string: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    @e
    public static final p i(@e final String s) {
        k0.p((Object)s, "$this$commonEncodeUtf8");
        final p p = new p(i.a(s));
        p.B0(s);
        return p;
    }
    
    public static final boolean j(@e final p p2, @e final p p3) {
        k0.p((Object)p2, "$this$commonEndsWith");
        k0.p((Object)p3, "suffix");
        return p2.u0(p2.size() - p3.size(), p3, 0, p3.size());
    }
    
    public static final boolean k(@e final p p2, @e final byte[] array) {
        k0.p((Object)p2, "$this$commonEndsWith");
        k0.p((Object)array, "suffix");
        return p2.v0(p2.size() - array.length, array, 0, array.length);
    }
    
    public static final boolean l(@e final p p2, @f final Object o) {
        k0.p((Object)p2, "$this$commonEquals");
        boolean b = true;
        if (o != p2) {
            if (o instanceof p) {
                final p p3 = (p)o;
                if (p3.size() == p2.v().length && p3.v0(0, p2.v(), 0, p2.v().length)) {
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
    
    public static final byte m(@e final p p2, final int n) {
        k0.p((Object)p2, "$this$commonGetByte");
        return p2.v()[n];
    }
    
    public static final int n(@e final p p) {
        k0.p((Object)p, "$this$commonGetSize");
        return p.v().length;
    }
    
    public static final int o(@e final p p) {
        k0.p((Object)p, "$this$commonHashCode");
        final int y = p.y();
        if (y != 0) {
            return y;
        }
        final int hashCode = Arrays.hashCode(p.v());
        p.A0(hashCode);
        return hashCode;
    }
    
    @e
    public static final String p(@e final p p) {
        k0.p((Object)p, "$this$commonHex");
        final char[] value = new char[p.v().length * 2];
        final byte[] v = p.v();
        final int length = v.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final byte b = v[i];
            final int n2 = n + 1;
            value[n] = I()[b >> 4 & 0xF];
            n = n2 + 1;
            value[n2] = I()[b & 0xF];
            ++i;
        }
        return new String(value);
    }
    
    public static final int q(@e final p p3, @e final byte[] array, int max) {
        k0.p((Object)p3, "$this$commonIndexOf");
        k0.p((Object)array, "other");
        final int n = p3.v().length - array.length;
        max = Math.max(max, 0);
        if (max <= n) {
            while (!j.d(p3.v(), max, array, 0, array.length)) {
                if (max == n) {
                    return -1;
                }
                ++max;
            }
            return max;
        }
        return -1;
    }
    
    @e
    public static final byte[] r(@e final p p) {
        k0.p((Object)p, "$this$commonInternalArray");
        return p.v();
    }
    
    public static final int s(@e final p p3, @e final p p4, final int n) {
        k0.p((Object)p3, "$this$commonLastIndexOf");
        k0.p((Object)p4, "other");
        return p3.l0(p4.a0(), n);
    }
    
    public static final int t(@e final p p3, @e final byte[] array, int i) {
        k0.p((Object)p3, "$this$commonLastIndexOf");
        k0.p((Object)array, "other");
        for (i = Math.min(i, p3.v().length - array.length); i >= 0; --i) {
            if (j.d(p3.v(), i, array, 0, array.length)) {
                return i;
            }
        }
        return -1;
    }
    
    @e
    public static final p u(@e byte[] copy) {
        k0.p((Object)copy, "data");
        copy = Arrays.copyOf(copy, copy.length);
        k0.o((Object)copy, "java.util.Arrays.copyOf(this, size)");
        return new p(copy);
    }
    
    public static final boolean v(@e final p p5, final int n, @e final p p6, final int n2, final int n3) {
        k0.p((Object)p5, "$this$commonRangeEquals");
        k0.p((Object)p6, "other");
        return p6.v0(n2, p5.v(), n, n3);
    }
    
    public static final boolean w(@e final p p5, final int n, @e final byte[] array, final int n2, final int n3) {
        k0.p((Object)p5, "$this$commonRangeEquals");
        k0.p((Object)array, "other");
        return n >= 0 && n <= p5.v().length - n3 && n2 >= 0 && n2 <= array.length - n3 && j.d(p5.v(), n, array, n2, n3);
    }
    
    public static final boolean x(@e final p p2, @e final p p3) {
        k0.p((Object)p2, "$this$commonStartsWith");
        k0.p((Object)p3, "prefix");
        return p2.u0(0, p3, 0, p3.size());
    }
    
    public static final boolean y(@e final p p2, @e final byte[] array) {
        k0.p((Object)p2, "$this$commonStartsWith");
        k0.p((Object)array, "prefix");
        return p2.v0(0, array, 0, array.length);
    }
    
    @e
    public static final p z(@e final p p3, final int n, final int n2) {
        k0.p((Object)p3, "$this$commonSubstring");
        final int n3 = 1;
        if (n < 0) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (n2 > p3.v().length) {
            final StringBuilder sb = new StringBuilder();
            sb.append("endIndex > length(");
            sb.append(p3.v().length);
            sb.append(')');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        int n4;
        if (n2 - n >= 0) {
            n4 = n3;
        }
        else {
            n4 = 0;
        }
        if (n4 == 0) {
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        if (n == 0 && n2 == p3.v().length) {
            return p3;
        }
        return new p(m.G1(p3.v(), n, n2));
    }
}
