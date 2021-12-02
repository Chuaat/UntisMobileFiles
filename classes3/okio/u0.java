// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import m6.h;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\f\n\u0002\b\u0010\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0080\b\u001a\u0011\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0080\b\u001a4\u0010\u0010\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\rH\u0080\b\u00f8\u0001\u0000\u001a4\u0010\u0012\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\u0080\b\u00f8\u0001\u0000\u001a4\u0010\u0014\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\rH\u0080\b\u00f8\u0001\u0000\u001a4\u0010\u0015\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\u0080\b\u00f8\u0001\u0000\u001a4\u0010\u0016\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\u0080\b\u00f8\u0001\u0000\u001a4\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\u0080\b\u00f8\u0001\u0000\"\u0016\u0010\u0019\u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018\"\u0016\u0010\u001b\u001a\u00020\u00138\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u001a\"\u0016\u0010\u001c\u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018\"\u0016\u0010\u001e\u001a\u00020\n8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u001d\"\u0016\u0010\u001f\u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0016\u0010 \u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018\"\u0016\u0010!\u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018\"\u0016\u0010\"\u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006#" }, d2 = { "", "", "beginIndex", "endIndex", "", "k", "(Ljava/lang/String;II)J", "codePoint", "", "a", "", "byte", "b", "Lkotlin/Function1;", "Lkotlin/j2;", "yield", "g", "", "h", "", "f", "c", "d", "e", "I", "REPLACEMENT_CODE_POINT", "C", "REPLACEMENT_CHARACTER", "MASK_4BYTES", "B", "REPLACEMENT_BYTE", "LOG_SURROGATE_HEADER", "HIGH_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "okio" }, k = 2, mv = { 1, 4, 1 })
@g(name = "Utf8")
public final class u0
{
    public static final byte a = 63;
    public static final char b = '\ufffd';
    public static final int c = 65533;
    public static final int d = 55232;
    public static final int e = 56320;
    public static final int f = 3968;
    public static final int g = -123008;
    public static final int h = 3678080;
    
    public static final boolean a(final int n) {
        if (n < 0 || 31 < n) {
            if (127 <= n) {
                if (159 >= n) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public static final boolean b(final byte b) {
        return (b & 0xC0) == 0x80;
    }
    
    public static final int c(@e final byte[] array, int i, int n, @e final l<? super Integer, j2> l) {
        k0.p((Object)array, "$this$process2Utf8Bytes");
        k0.p((Object)l, "yield");
        final int n2 = i + 1;
        final Integer value = 65533;
        if (n <= n2) {
            l.invoke((Object)value);
            return 1;
        }
        n = array[i];
        final byte b = array[n2];
        if ((b & 0xC0) == 0x80) {
            i = 1;
        }
        else {
            i = 0;
        }
        if (i == 0) {
            l.invoke((Object)value);
            return 1;
        }
        i = (b ^ 0xF80 ^ n << 6);
        if (i < 128) {
            l.invoke((Object)value);
        }
        else {
            l.invoke((Object)i);
        }
        return 2;
    }
    
    public static final int d(@e final byte[] array, int i, int n, @e final l<? super Integer, j2> l) {
        k0.p((Object)array, "$this$process3Utf8Bytes");
        k0.p((Object)l, "yield");
        final int n2 = i + 2;
        final int n3 = 0;
        final int n4 = 0;
        final Integer value = 65533;
        if (n <= n2) {
            l.invoke((Object)value);
            final int n5 = i + 1;
            if (n > n5) {
                i = n4;
                if ((array[n5] & 0xC0) == 0x80) {
                    i = 1;
                }
                if (i != 0) {
                    return 2;
                }
            }
            return 1;
        }
        n = array[i];
        final byte b = array[i + 1];
        if ((b & 0xC0) == 0x80) {
            i = 1;
        }
        else {
            i = 0;
        }
        if (i == 0) {
            l.invoke((Object)value);
            return 1;
        }
        final byte b2 = array[n2];
        i = n3;
        if ((b2 & 0xC0) == 0x80) {
            i = 1;
        }
        if (i == 0) {
            l.invoke((Object)value);
            return 2;
        }
        i = (b2 ^ 0xFFFE1F80 ^ b << 6 ^ n << 12);
        Label_0193: {
            if (i >= 2048) {
                if (55296 <= i) {
                    if (57343 >= i) {
                        break Label_0193;
                    }
                }
                l.invoke((Object)i);
                return 3;
            }
        }
        l.invoke((Object)value);
        return 3;
    }
    
    public static final int e(@e final byte[] array, int i, int n, @e final l<? super Integer, j2> l) {
        k0.p((Object)array, "$this$process4Utf8Bytes");
        k0.p((Object)l, "yield");
        final int n2 = i + 3;
        final int n3 = 0;
        final int n4 = 0;
        final Integer value = 65533;
        if (n <= n2) {
            l.invoke((Object)value);
            final int n5 = i + 1;
            if (n > n5 && (array[n5] & 0xC0) == 0x80) {
                final int n6 = i + 2;
                if (n > n6) {
                    i = n4;
                    if ((array[n6] & 0xC0) == 0x80) {
                        i = 1;
                    }
                    if (i != 0) {
                        return 3;
                    }
                }
                return 2;
            }
            return 1;
        }
        else {
            final byte b = array[i];
            final byte b2 = array[i + 1];
            if ((b2 & 0xC0) == 0x80) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n == 0) {
                l.invoke((Object)value);
                return 1;
            }
            n = array[i + 2];
            if ((n & 0xC0) == 0x80) {
                i = 1;
            }
            else {
                i = 0;
            }
            if (i == 0) {
                l.invoke((Object)value);
                return 2;
            }
            final byte b3 = array[n2];
            i = n3;
            if ((b3 & 0xC0) == 0x80) {
                i = 1;
            }
            if (i == 0) {
                l.invoke((Object)value);
                return 3;
            }
            i = (b3 ^ 0x381F80 ^ n << 6 ^ b2 << 12 ^ b << 18);
            Label_0282: {
                if (i <= 1114111) {
                    if (55296 <= i) {
                        if (57343 >= i) {
                            break Label_0282;
                        }
                    }
                    if (i >= 65536) {
                        l.invoke((Object)i);
                        return 4;
                    }
                }
            }
            l.invoke((Object)value);
            return 4;
        }
    }
    
    public static final void f(@e final byte[] array, int i, final int n, @e final l<? super Character, j2> l) {
        k0.p((Object)array, "$this$processUtf16Chars");
        k0.p((Object)l, "yield");
        while (i < n) {
            final byte b = array[i];
            if (b >= 0) {
                l.invoke((Object)(char)b);
                int n2 = i + 1;
                while (true) {
                    i = n2;
                    if (n2 >= n) {
                        break;
                    }
                    i = n2;
                    if (array[n2] < 0) {
                        break;
                    }
                    l.invoke((Object)(char)array[n2]);
                    ++n2;
                }
            }
            else {
                final int n3 = 0;
                final int n4 = 0;
                final int n5 = 0;
                final int n6 = 0;
                boolean b2 = false;
                int n18 = 0;
                Label_0241: {
                    Label_0238: {
                        Label_0138: {
                            if (b >> 5 != -2) {
                                if (b >> 4 == -2) {
                                    final int n7 = i + 2;
                                    if (n <= n7) {
                                        l.invoke((Object)65533);
                                        final j2 a = j2.a;
                                        final int n8 = i + 1;
                                        if (n <= n8) {
                                            break Label_0138;
                                        }
                                        int n9 = n3;
                                        if ((array[n8] & 0xC0) == 0x80) {
                                            n9 = 1;
                                        }
                                        if (n9 == 0) {
                                            break Label_0138;
                                        }
                                        break Label_0238;
                                    }
                                    else {
                                        final byte b3 = array[i];
                                        final byte b4 = array[i + 1];
                                        if ((b4 & 0xC0) != 0x80) {
                                            l.invoke((Object)65533);
                                            final j2 a2 = j2.a;
                                            break Label_0138;
                                        }
                                        final byte b5 = array[n7];
                                        int n10 = n4;
                                        if ((b5 & 0xC0) == 0x80) {
                                            n10 = 1;
                                        }
                                        if (n10 == 0) {
                                            l.invoke((Object)65533);
                                            final j2 a3 = j2.a;
                                            break Label_0238;
                                        }
                                        final int n11 = b5 ^ 0xFFFE1F80 ^ b4 << 6 ^ b3 << 12;
                                        char c = '\0';
                                        Label_0473: {
                                            Label_0464: {
                                                if (n11 >= 2048) {
                                                    if (55296 <= n11) {
                                                        if (57343 >= n11) {
                                                            break Label_0464;
                                                        }
                                                    }
                                                    c = (char)n11;
                                                    break Label_0473;
                                                }
                                            }
                                            c = 65533;
                                        }
                                        l.invoke((Object)c);
                                        final j2 a4 = j2.a;
                                    }
                                }
                                else {
                                    if (b >> 3 != -2) {
                                        l.invoke((Object)'\ufffd');
                                        ++i;
                                        continue;
                                    }
                                    final int n12 = i + 3;
                                    if (n <= n12) {
                                        l.invoke((Object)'\ufffd');
                                        final j2 a5 = j2.a;
                                        final int n13 = i + 1;
                                        if (n <= n13) {
                                            break Label_0138;
                                        }
                                        if ((array[n13] & 0xC0) != 0x80) {
                                            break Label_0138;
                                        }
                                        final int n14 = i + 2;
                                        if (n <= n14) {
                                            break Label_0238;
                                        }
                                        int n15 = n5;
                                        if ((array[n14] & 0xC0) == 0x80) {
                                            n15 = 1;
                                        }
                                        if (n15 == 0) {
                                            break Label_0238;
                                        }
                                    }
                                    else {
                                        final byte b6 = array[i];
                                        final byte b7 = array[i + 1];
                                        if ((b7 & 0xC0) != 0x80) {
                                            l.invoke((Object)'\ufffd');
                                            final j2 a6 = j2.a;
                                            break Label_0138;
                                        }
                                        final byte b8 = array[i + 2];
                                        if ((b8 & 0xC0) != 0x80) {
                                            l.invoke((Object)'\ufffd');
                                            final j2 a7 = j2.a;
                                            break Label_0238;
                                        }
                                        final byte b9 = array[n12];
                                        int n16 = n6;
                                        if ((b9 & 0xC0) == 0x80) {
                                            n16 = 1;
                                        }
                                        if (n16 != 0) {
                                            final int n17 = b9 ^ 0x381F80 ^ b8 << 6 ^ b7 << 12 ^ b6 << 18;
                                            Character c2 = null;
                                            Label_0850: {
                                                Label_0843: {
                                                    if (n17 <= 1114111) {
                                                        if (55296 <= n17) {
                                                            if (57343 >= n17) {
                                                                break Label_0843;
                                                            }
                                                        }
                                                        if (n17 >= 65536) {
                                                            if (n17 != 65533) {
                                                                l.invoke((Object)(char)((n17 >>> 10) + 55232));
                                                                c2 = (char)((n17 & 0x3FF) + 56320);
                                                                break Label_0850;
                                                            }
                                                            c2 = '\ufffd';
                                                            break Label_0850;
                                                        }
                                                    }
                                                }
                                                c2 = '\ufffd';
                                            }
                                            l.invoke((Object)c2);
                                            final j2 a8 = j2.a;
                                            n18 = 4;
                                            break Label_0241;
                                        }
                                        l.invoke((Object)'\ufffd');
                                        final j2 a9 = j2.a;
                                    }
                                }
                                n18 = 3;
                                break Label_0241;
                            }
                            final int n19 = i + 1;
                            if (n > n19) {
                                final byte b10 = array[i];
                                final byte b11 = array[n19];
                                if ((b11 & 0xC0) == 0x80) {
                                    b2 = true;
                                }
                                if (b2) {
                                    final int n20 = b11 ^ 0xF80 ^ b10 << 6;
                                    char c3;
                                    if (n20 < 128) {
                                        c3 = 65533;
                                    }
                                    else {
                                        c3 = (char)n20;
                                    }
                                    l.invoke((Object)c3);
                                    final j2 a10 = j2.a;
                                    break Label_0238;
                                }
                            }
                            l.invoke((Object)65533);
                            final j2 a11 = j2.a;
                        }
                        n18 = 1;
                        break Label_0241;
                    }
                    n18 = 2;
                }
                i += n18;
            }
        }
    }
    
    public static final void g(@e final String s, int i, final int n, @e final l<? super Byte, j2> l) {
        k0.p((Object)s, "$this$processUtf8Bytes");
        k0.p((Object)l, "yield");
        while (i < n) {
            final char char1 = s.charAt(i);
            if (k0.t((int)char1, 128) < 0) {
                l.invoke((Object)(byte)char1);
                int n2 = i + 1;
                while (true) {
                    i = n2;
                    if (n2 >= n) {
                        break;
                    }
                    i = n2;
                    if (k0.t((int)s.charAt(n2), 128) >= 0) {
                        break;
                    }
                    l.invoke((Object)(byte)s.charAt(n2));
                    ++n2;
                }
            }
            else {
                Byte b = null;
                Label_0153: {
                    int n3;
                    if (k0.t((int)char1, 2048) < 0) {
                        n3 = (char1 >> 6 | 0xC0);
                    }
                    else {
                        if ('\ud800' <= char1 && '\udfff' >= char1) {
                            if (k0.t((int)char1, 56319) <= 0) {
                                final int n4 = i + 1;
                                if (n > n4) {
                                    final char char2 = s.charAt(n4);
                                    if ('\udc00' <= char2) {
                                        if ('\udfff' >= char2) {
                                            final int n5 = (char1 << 10) + s.charAt(n4) - 56613888;
                                            l.invoke((Object)(byte)(n5 >> 18 | 0xF0));
                                            l.invoke((Object)(byte)((n5 >> 12 & 0x3F) | 0x80));
                                            l.invoke((Object)(byte)((n5 >> 6 & 0x3F) | 0x80));
                                            l.invoke((Object)(byte)((n5 & 0x3F) | 0x80));
                                            i += 2;
                                            continue;
                                        }
                                    }
                                }
                            }
                            b = 63;
                            break Label_0153;
                        }
                        l.invoke((Object)(byte)(char1 >> 12 | 0xE0));
                        n3 = ((char1 >> 6 & 0x3F) | 0x80);
                    }
                    l.invoke((Object)(byte)n3);
                    b = (byte)((char1 & '?') | 0x80);
                }
                l.invoke((Object)b);
                ++i;
            }
        }
    }
    
    public static final void h(@e final byte[] array, int i, final int n, @e final l<? super Integer, j2> l) {
        k0.p((Object)array, "$this$processUtf8CodePoints");
        k0.p((Object)l, "yield");
        while (i < n) {
            final byte j = array[i];
            if (j >= 0) {
                l.invoke((Object)(int)j);
                int n2 = i + 1;
                while (true) {
                    i = n2;
                    if (n2 >= n) {
                        break;
                    }
                    i = n2;
                    if (array[n2] < 0) {
                        break;
                    }
                    l.invoke((Object)(int)array[n2]);
                    ++n2;
                }
            }
            else {
                final int n3 = 0;
                final int n4 = 0;
                final int n5 = 0;
                final int n6 = 0;
                boolean b = false;
                int n18 = 0;
                Label_0231: {
                    Label_0228: {
                        Label_0135: {
                            if (j >> 5 != -2) {
                                if (j >> 4 == -2) {
                                    final int n7 = i + 2;
                                    if (n <= n7) {
                                        l.invoke((Object)65533);
                                        final j2 a = j2.a;
                                        final int n8 = i + 1;
                                        if (n <= n8) {
                                            break Label_0135;
                                        }
                                        int n9 = n3;
                                        if ((array[n8] & 0xC0) == 0x80) {
                                            n9 = 1;
                                        }
                                        if (n9 == 0) {
                                            break Label_0135;
                                        }
                                        break Label_0228;
                                    }
                                    else {
                                        final byte b2 = array[i];
                                        final byte b3 = array[i + 1];
                                        if ((b3 & 0xC0) != 0x80) {
                                            l.invoke((Object)65533);
                                            final j2 a2 = j2.a;
                                            break Label_0135;
                                        }
                                        final byte b4 = array[n7];
                                        int n10 = n4;
                                        if ((b4 & 0xC0) == 0x80) {
                                            n10 = 1;
                                        }
                                        if (n10 == 0) {
                                            l.invoke((Object)65533);
                                            final j2 a3 = j2.a;
                                            break Label_0228;
                                        }
                                        final int k = b4 ^ 0xFFFE1F80 ^ b3 << 6 ^ b2 << 12;
                                        Integer n11 = null;
                                        Label_0458: {
                                            Label_0451: {
                                                if (k >= 2048) {
                                                    if (55296 <= k) {
                                                        if (57343 >= k) {
                                                            break Label_0451;
                                                        }
                                                    }
                                                    n11 = k;
                                                    break Label_0458;
                                                }
                                            }
                                            n11 = 65533;
                                        }
                                        l.invoke((Object)n11);
                                        final j2 a4 = j2.a;
                                    }
                                }
                                else {
                                    if (j >> 3 != -2) {
                                        l.invoke((Object)65533);
                                        ++i;
                                        continue;
                                    }
                                    final int n12 = i + 3;
                                    if (n <= n12) {
                                        l.invoke((Object)65533);
                                        final j2 a5 = j2.a;
                                        final int n13 = i + 1;
                                        if (n <= n13) {
                                            break Label_0135;
                                        }
                                        if ((array[n13] & 0xC0) != 0x80) {
                                            break Label_0135;
                                        }
                                        final int n14 = i + 2;
                                        if (n <= n14) {
                                            break Label_0228;
                                        }
                                        int n15 = n5;
                                        if ((array[n14] & 0xC0) == 0x80) {
                                            n15 = 1;
                                        }
                                        if (n15 == 0) {
                                            break Label_0228;
                                        }
                                    }
                                    else {
                                        final byte b5 = array[i];
                                        final byte b6 = array[i + 1];
                                        if ((b6 & 0xC0) != 0x80) {
                                            l.invoke((Object)65533);
                                            final j2 a6 = j2.a;
                                            break Label_0135;
                                        }
                                        final byte b7 = array[i + 2];
                                        if ((b7 & 0xC0) != 0x80) {
                                            l.invoke((Object)65533);
                                            final j2 a7 = j2.a;
                                            break Label_0228;
                                        }
                                        final byte b8 = array[n12];
                                        int n16 = n6;
                                        if ((b8 & 0xC0) == 0x80) {
                                            n16 = 1;
                                        }
                                        if (n16 != 0) {
                                            final int m = b8 ^ 0x381F80 ^ b7 << 6 ^ b6 << 12 ^ b5 << 18;
                                            Integer n17 = null;
                                            Label_0830: {
                                                Label_0823: {
                                                    if (m <= 1114111) {
                                                        if (55296 <= m) {
                                                            if (57343 >= m) {
                                                                break Label_0823;
                                                            }
                                                        }
                                                        if (m >= 65536) {
                                                            n17 = m;
                                                            break Label_0830;
                                                        }
                                                    }
                                                }
                                                n17 = 65533;
                                            }
                                            l.invoke((Object)n17);
                                            final j2 a8 = j2.a;
                                            n18 = 4;
                                            break Label_0231;
                                        }
                                        l.invoke((Object)65533);
                                        final j2 a9 = j2.a;
                                    }
                                }
                                n18 = 3;
                                break Label_0231;
                            }
                            final int n19 = i + 1;
                            if (n > n19) {
                                final byte b9 = array[i];
                                final byte b10 = array[n19];
                                if ((b10 & 0xC0) == 0x80) {
                                    b = true;
                                }
                                if (b) {
                                    final int i2 = b10 ^ 0xF80 ^ b9 << 6;
                                    Integer n20;
                                    if (i2 < 128) {
                                        n20 = 65533;
                                    }
                                    else {
                                        n20 = i2;
                                    }
                                    l.invoke((Object)n20);
                                    final j2 a10 = j2.a;
                                    break Label_0228;
                                }
                            }
                            l.invoke((Object)65533);
                            final j2 a11 = j2.a;
                        }
                        n18 = 1;
                        break Label_0231;
                    }
                    n18 = 2;
                }
                i += n18;
            }
        }
    }
    
    @g(name = "size")
    @h
    public static final long i(@e final String s) {
        return l(s, 0, 0, 3, null);
    }
    
    @g(name = "size")
    @h
    public static final long j(@e final String s, final int n) {
        return l(s, n, 0, 2, null);
    }
    
    @g(name = "size")
    @h
    public static final long k(@e final String s, int i, final int n) {
        k0.p((Object)s, "$this$utf8Size");
        final int n2 = 1;
        if (i < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (n < i) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(n);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        int n3;
        if (n <= s.length()) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        if (n3 != 0) {
            long n4 = 0L;
            while (i < n) {
                final char char1 = s.charAt(i);
                if (char1 < '\u0080') {
                    ++n4;
                }
                else {
                    int n5;
                    if (char1 < '\u0800') {
                        n5 = 2;
                    }
                    else if (char1 >= '\ud800' && char1 <= '\udfff') {
                        final int index = i + 1;
                        char char2;
                        if (index < n) {
                            char2 = s.charAt(index);
                        }
                        else {
                            char2 = '\0';
                        }
                        if (char1 <= '\udbff' && char2 >= '\udc00' && char2 <= '\udfff') {
                            n4 += 4;
                            i += 2;
                            continue;
                        }
                        ++n4;
                        i = index;
                        continue;
                    }
                    else {
                        n5 = 3;
                    }
                    n4 += n5;
                }
                ++i;
            }
            return n4;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("endIndex > string.length: ");
        sb3.append(n);
        sb3.append(" > ");
        sb3.append(s.length());
        throw new IllegalArgumentException(sb3.toString().toString());
    }
    
    public static /* synthetic */ long l(final String s, int n, int length, final int n2, final Object o) {
        if ((n2 & 0x1) != 0x0) {
            n = 0;
        }
        if ((n2 & 0x2) != 0x0) {
            length = s.length();
        }
        return k(s, n, length);
    }
}
