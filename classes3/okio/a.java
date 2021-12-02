// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import org.jetbrains.annotations.f;
import java.util.Arrays;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\n\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000\"\u001c\u0010\b\u001a\u00020\u00018\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u001c\u0010\n\u001a\u00020\u00018\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b" }, d2 = { "", "", "a", "map", "b", "[B", "d", "()[B", "BASE64", "e", "BASE64_URL_SAFE", "okio" }, k = 2, mv = { 1, 4, 1 })
@g(name = "-Base64")
public final class a
{
    @e
    private static final byte[] a;
    @e
    private static final byte[] b;
    
    static {
        final p.a l = p.L;
        a = l.l("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").v();
        b = l.l("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").v();
    }
    
    @f
    public static final byte[] a(@e final String s) {
        k0.p((Object)s, "$this$decodeBase64ToArray");
        int i;
        for (i = s.length(); i > 0; --i) {
            final char char1 = s.charAt(i - 1);
            if (char1 != '=' && char1 != '\n' && char1 != '\r' && char1 != ' ' && char1 != '\t') {
                break;
            }
        }
        final int n = (int)(i * 6L / 8L);
        final byte[] original = new byte[n];
        int j = 0;
        int n2 = 0;
        int n3 = 0;
        int newLength = 0;
        while (j < i) {
            final char char2 = s.charAt(j);
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            Label_0387: {
                int n4 = 0;
                Label_0302: {
                    if ('A' <= char2) {
                        if ('Z' >= char2) {
                            n4 = char2 - 'A';
                            break Label_0302;
                        }
                    }
                    if ('a' <= char2) {
                        if ('z' >= char2) {
                            n4 = char2 - 'G';
                            break Label_0302;
                        }
                    }
                    if ('0' <= char2) {
                        if ('9' >= char2) {
                            n4 = char2 + '\u0004';
                            break Label_0302;
                        }
                    }
                    if (char2 != '+' && char2 != '-') {
                        if (char2 != '/' && char2 != '_') {
                            n5 = n2;
                            n6 = n3;
                            n7 = newLength;
                            if (char2 == '\n') {
                                break Label_0387;
                            }
                            n5 = n2;
                            n6 = n3;
                            n7 = newLength;
                            if (char2 == '\r') {
                                break Label_0387;
                            }
                            n5 = n2;
                            n6 = n3;
                            n7 = newLength;
                            if (char2 == ' ') {
                                break Label_0387;
                            }
                            if (char2 == '\t') {
                                n5 = n2;
                                n6 = n3;
                                n7 = newLength;
                                break Label_0387;
                            }
                            return null;
                        }
                        else {
                            n4 = 63;
                        }
                    }
                    else {
                        n4 = 62;
                    }
                }
                final int n8 = n3 << 6 | n4;
                n5 = ++n2;
                n6 = n8;
                n7 = newLength;
                if (n2 % 4 == 0) {
                    final int n9 = newLength + 1;
                    original[newLength] = (byte)(n8 >> 16);
                    final int n10 = n9 + 1;
                    original[n9] = (byte)(n8 >> 8);
                    original[n10] = (byte)n8;
                    n7 = n10 + 1;
                    n6 = n8;
                    n5 = n2;
                }
            }
            ++j;
            n2 = n5;
            n3 = n6;
            newLength = n7;
        }
        final int n11 = n2 % 4;
        if (n11 == 1) {
            return null;
        }
        if (n11 != 2) {
            if (n11 == 3) {
                final int n12 = n3 << 6;
                final int n13 = newLength + 1;
                original[newLength] = (byte)(n12 >> 16);
                newLength = n13 + 1;
                original[n13] = (byte)(n12 >> 8);
            }
        }
        else {
            original[newLength] = (byte)(n3 << 12 >> 16);
            ++newLength;
        }
        if (newLength == n) {
            return original;
        }
        final byte[] copy = Arrays.copyOf(original, newLength);
        k0.o((Object)copy, "java.util.Arrays.copyOf(this, newSize)");
        return copy;
    }
    
    @e
    public static final String b(@e final byte[] array, @e final byte[] array2) {
        k0.p((Object)array, "$this$encodeBase64");
        k0.p((Object)array2, "map");
        byte[] array3;
        int n;
        int i;
        int n2;
        int n3;
        byte b;
        byte b2;
        byte b3;
        int n4;
        int n5;
        int n6;
        for (array3 = new byte[(array.length + 2) / 3 * 4], n = array.length - array.length % 3, i = 0, n2 = 0; i < n; i = n3 + 1, b2 = array[n3], b3 = array[i], n4 = n2 + 1, array3[n2] = array2[(b & 0xFF) >> 2], n5 = n4 + 1, array3[n4] = array2[(b & 0x3) << 4 | (b2 & 0xFF) >> 4], n6 = n5 + 1, array3[n5] = array2[(b2 & 0xF) << 2 | (b3 & 0xFF) >> 6], n2 = n6 + 1, array3[n6] = array2[b3 & 0x3F], ++i) {
            n3 = i + 1;
            b = array[i];
        }
        final int n7 = array.length - n;
        if (n7 != 1) {
            if (n7 == 2) {
                final byte b4 = array[i];
                final byte b5 = array[i + 1];
                final int n8 = n2 + 1;
                array3[n2] = array2[(b4 & 0xFF) >> 2];
                final int n9 = n8 + 1;
                array3[n8] = array2[(b4 & 0x3) << 4 | (b5 & 0xFF) >> 4];
                array3[n9] = array2[(b5 & 0xF) << 2];
                array3[n9 + 1] = 61;
            }
        }
        else {
            final byte b6 = array[i];
            final int n10 = n2 + 1;
            array3[n2] = array2[(b6 & 0xFF) >> 2];
            final int n11 = n10 + 1;
            array3[n10] = array2[(b6 & 0x3) << 4];
            final byte b7 = 61;
            array3[n11] = b7;
            array3[n11 + 1] = b7;
        }
        return okio.i.c(array3);
    }
    
    @e
    public static final byte[] d() {
        return okio.a.a;
    }
    
    @e
    public static final byte[] e() {
        return okio.a.b;
    }
}
