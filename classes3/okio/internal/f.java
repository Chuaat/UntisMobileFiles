// 
// Decompiled by Procyon v0.5.36
// 

package okio.internal;

import kotlin.j2;
import java.util.Arrays;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0000*\u00020\u0004¨\u0006\u0007" }, d2 = { "", "", "beginIndex", "endIndex", "", "b", "a", "okio" }, k = 2, mv = { 1, 4, 1 })
public final class f
{
    @e
    public static final byte[] a(@e final String s) {
        k0.p((Object)s, "$this$commonAsUtf8ToByteArray");
        final byte[] array = new byte[s.length() * 4];
        for (int length = s.length(), i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (k0.t((int)char1, 128) >= 0) {
                final int length2 = s.length();
                int newLength = i;
                int j = i;
                while (j < length2) {
                    final char char2 = s.charAt(j);
                    if (k0.t((int)char2, 128) < 0) {
                        final byte b = (byte)char2;
                        int n = newLength + 1;
                        array[newLength] = b;
                        ++j;
                        while (j < length2 && k0.t((int)s.charAt(j), 128) < 0) {
                            array[n] = (byte)s.charAt(j);
                            ++j;
                            ++n;
                        }
                        newLength = n;
                    }
                    else {
                        int n3 = 0;
                        Label_0202: {
                            if (k0.t((int)char2, 2048) < 0) {
                                final byte b2 = (byte)(char2 >> 6 | 0xC0);
                                final int n2 = newLength + 1;
                                array[newLength] = b2;
                                final byte b3 = (byte)((char2 & '?') | 0x80);
                                n3 = n2 + 1;
                                array[n2] = b3;
                            }
                            else if ('\ud800' <= char2 && '\udfff' >= char2) {
                                if (k0.t((int)char2, 56319) <= 0) {
                                    final int n4 = j + 1;
                                    if (length2 > n4) {
                                        final char char3 = s.charAt(n4);
                                        if ('\udc00' <= char3) {
                                            if ('\udfff' >= char3) {
                                                final int n5 = (char2 << 10) + s.charAt(n4) - 56613888;
                                                final byte b4 = (byte)(n5 >> 18 | 0xF0);
                                                final int n6 = newLength + 1;
                                                array[newLength] = b4;
                                                final byte b5 = (byte)((n5 >> 12 & 0x3F) | 0x80);
                                                final int n7 = n6 + 1;
                                                array[n6] = b5;
                                                final byte b6 = (byte)((n5 >> 6 & 0x3F) | 0x80);
                                                final int n8 = n7 + 1;
                                                array[n7] = b6;
                                                final byte b7 = (byte)((n5 & 0x3F) | 0x80);
                                                n3 = n8 + 1;
                                                array[n8] = b7;
                                                j += 2;
                                                break Label_0202;
                                            }
                                        }
                                    }
                                }
                                n3 = newLength + 1;
                                array[newLength] = 63;
                            }
                            else {
                                final byte b8 = (byte)(char2 >> 12 | 0xE0);
                                final int n9 = newLength + 1;
                                array[newLength] = b8;
                                final byte b9 = (byte)((char2 >> 6 & 0x3F) | 0x80);
                                final int n10 = n9 + 1;
                                array[n9] = b9;
                                final byte b10 = (byte)((char2 & '?') | 0x80);
                                n3 = n10 + 1;
                                array[n10] = b10;
                            }
                            ++j;
                        }
                        newLength = n3;
                    }
                }
                final byte[] copy = Arrays.copyOf(array, newLength);
                k0.o((Object)copy, "java.util.Arrays.copyOf(this, newSize)");
                return copy;
            }
            array[i] = (byte)char1;
        }
        final byte[] copy2 = Arrays.copyOf(array, s.length());
        k0.o((Object)copy2, "java.util.Arrays.copyOf(this, newSize)");
        return copy2;
    }
    
    @e
    public static final String b(@e final byte[] array, int count, final int i) {
        int j = count;
        k0.p((Object)array, "$this$commonToUtf8String");
        if (j >= 0 && i <= array.length && j <= i) {
            final char[] value = new char[i - j];
            count = 0;
            while (j < i) {
                final byte b = array[j];
                int n3;
                if (b >= 0) {
                    final char c = (char)b;
                    final int n = count + 1;
                    value[count] = c;
                    ++j;
                    count = n;
                    int n2 = j;
                    while (true) {
                        j = n2;
                        n3 = count;
                        if (n2 >= i) {
                            break;
                        }
                        j = n2;
                        n3 = count;
                        if (array[n2] < 0) {
                            break;
                        }
                        value[count] = (char)array[n2];
                        ++n2;
                        ++count;
                    }
                }
                else {
                    int n34 = 0;
                    Label_0307: {
                        Label_0304: {
                            if (b >> 5 == -2) {
                                final int n4 = j + 1;
                                if (i <= n4) {
                                    final char c2 = 65533;
                                    final int n5 = count + 1;
                                    value[count] = c2;
                                    count = n5;
                                }
                                else {
                                    final byte b2 = array[j];
                                    final byte b3 = array[n4];
                                    if ((b3 & 0xC0) == 0x80) {
                                        final int n6 = b3 ^ 0xF80 ^ b2 << 6;
                                        if (n6 < 128) {
                                            final char c3 = 65533;
                                            final int n7 = count + 1;
                                            value[count] = c3;
                                            count = n7;
                                        }
                                        else {
                                            final char c4 = (char)n6;
                                            final int n8 = count + 1;
                                            value[count] = c4;
                                            count = n8;
                                        }
                                        final j2 a = j2.a;
                                        break Label_0304;
                                    }
                                    final char c5 = 65533;
                                    final int n9 = count + 1;
                                    value[count] = c5;
                                    count = n9;
                                }
                                final j2 a2 = j2.a;
                            }
                            else {
                                if (b >> 4 != -2) {
                                    if (b >> 3 == -2) {
                                        final int n10 = j + 3;
                                        int n22 = 0;
                                        Label_1178: {
                                            Label_0806: {
                                                Label_0800: {
                                                    if (i <= n10) {
                                                        final int n11 = count + 1;
                                                        value[count] = 65533;
                                                        final j2 a3 = j2.a;
                                                        final int n12 = j + 1;
                                                        count = n11;
                                                        if (i <= n12) {
                                                            break Label_0806;
                                                        }
                                                        if ((array[n12] & 0xC0) == 0x80) {
                                                            count = 1;
                                                        }
                                                        else {
                                                            count = 0;
                                                        }
                                                        if (count == 0) {
                                                            count = n11;
                                                            break Label_0806;
                                                        }
                                                        final int n13 = j + 2;
                                                        count = n11;
                                                        if (i <= n13) {
                                                            break Label_0800;
                                                        }
                                                        final boolean b4 = (array[n13] & 0xC0) == 0x80;
                                                        count = n11;
                                                        if (!b4) {
                                                            count = n11;
                                                            break Label_0800;
                                                        }
                                                    }
                                                    else {
                                                        final byte b5 = array[j];
                                                        final byte b6 = array[j + 1];
                                                        if ((b6 & 0xC0) != 0x80) {
                                                            final int n14 = count + 1;
                                                            value[count] = 65533;
                                                            final j2 a4 = j2.a;
                                                            count = n14;
                                                            break Label_0806;
                                                        }
                                                        final byte b7 = array[j + 2];
                                                        if ((b7 & 0xC0) != 0x80) {
                                                            final int n15 = count + 1;
                                                            value[count] = 65533;
                                                            final j2 a5 = j2.a;
                                                            count = n15;
                                                            break Label_0800;
                                                        }
                                                        final byte b8 = array[n10];
                                                        if ((b8 & 0xC0) == 0x80) {
                                                            final int n16 = b8 ^ 0x381F80 ^ b7 << 6 ^ b6 << 12 ^ b5 << 18;
                                                            Label_1031: {
                                                                if (n16 > 1114111) {
                                                                    final int n17 = count + 1;
                                                                    value[count] = 65533;
                                                                    count = n17;
                                                                }
                                                                else {
                                                                    if (55296 <= n16) {
                                                                        if (57343 >= n16) {
                                                                            final int n18 = count + 1;
                                                                            value[count] = 65533;
                                                                            count = n18;
                                                                            break Label_1031;
                                                                        }
                                                                    }
                                                                    if (n16 < 65536) {
                                                                        final int n19 = count + 1;
                                                                        value[count] = 65533;
                                                                        count = n19;
                                                                    }
                                                                    else if (n16 != 65533) {
                                                                        final char c6 = (char)((n16 >>> 10) + 55232);
                                                                        final int n20 = count + 1;
                                                                        value[count] = c6;
                                                                        final char c7 = (char)((n16 & 0x3FF) + 56320);
                                                                        count = n20 + 1;
                                                                        value[n20] = c7;
                                                                    }
                                                                    else {
                                                                        final int n21 = count + 1;
                                                                        value[count] = 65533;
                                                                        count = n21;
                                                                    }
                                                                }
                                                            }
                                                            final j2 a6 = j2.a;
                                                            n22 = 4;
                                                            break Label_1178;
                                                        }
                                                        final int n23 = count + 1;
                                                        value[count] = 65533;
                                                        final j2 a7 = j2.a;
                                                        count = n23;
                                                    }
                                                    n22 = 3;
                                                    break Label_1178;
                                                }
                                                n22 = 2;
                                                break Label_1178;
                                            }
                                            n22 = 1;
                                        }
                                        j += n22;
                                    }
                                    else {
                                        final int n24 = count + 1;
                                        value[count] = 65533;
                                        ++j;
                                        count = n24;
                                    }
                                    continue;
                                }
                                final int n25 = j + 2;
                                if (i <= n25) {
                                    final char c8 = 65533;
                                    final int n26 = count + 1;
                                    value[count] = c8;
                                    final j2 a8 = j2.a;
                                    final int n27 = j + 1;
                                    count = n26;
                                    if (i > n27) {
                                        final boolean b9 = (array[n27] & 0xC0) == 0x80;
                                        count = n26;
                                        if (b9) {
                                            break Label_0304;
                                        }
                                        count = n26;
                                    }
                                }
                                else {
                                    final byte b10 = array[j];
                                    final byte b11 = array[j + 1];
                                    if ((b11 & 0xC0) != 0x80) {
                                        final char c9 = 65533;
                                        final int n28 = count + 1;
                                        value[count] = c9;
                                        final j2 a9 = j2.a;
                                        count = n28;
                                    }
                                    else {
                                        final byte b12 = array[n25];
                                        if ((b12 & 0xC0) != 0x80) {
                                            final char c10 = 65533;
                                            final int n29 = count + 1;
                                            value[count] = c10;
                                            final j2 a10 = j2.a;
                                            count = n29;
                                            break Label_0304;
                                        }
                                        final int n30 = b12 ^ 0xFFFE1F80 ^ b11 << 6 ^ b10 << 12;
                                        Label_0584: {
                                            if (n30 < 2048) {
                                                final char c11 = 65533;
                                                final int n31 = count + 1;
                                                value[count] = c11;
                                                count = n31;
                                            }
                                            else {
                                                if (55296 <= n30) {
                                                    if (57343 >= n30) {
                                                        final char c12 = 65533;
                                                        final int n32 = count + 1;
                                                        value[count] = c12;
                                                        count = n32;
                                                        break Label_0584;
                                                    }
                                                }
                                                final char c13 = (char)n30;
                                                final int n33 = count + 1;
                                                value[count] = c13;
                                                count = n33;
                                            }
                                        }
                                        final j2 a11 = j2.a;
                                        n34 = 3;
                                        break Label_0307;
                                    }
                                }
                            }
                            n34 = 1;
                            break Label_0307;
                        }
                        n34 = 2;
                    }
                    j += n34;
                    n3 = count;
                }
                count = n3;
            }
            return new String(value, 0, count);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("size=");
        sb.append(array.length);
        sb.append(" beginIndex=");
        sb.append(j);
        sb.append(" endIndex=");
        sb.append(i);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }
}
