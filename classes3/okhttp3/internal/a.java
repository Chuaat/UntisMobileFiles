// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal;

import org.jetbrains.annotations.f;
import java.util.Locale;
import java.net.IDN;
import org.jetbrains.annotations.e;
import okio.m;
import java.util.Arrays;
import java.net.InetAddress;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\f\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0000H\u0002\u001a\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002\u001a0\u0010\r\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\u000f" }, d2 = { "", "e", "", "a", "input", "", "pos", "limit", "Ljava/net/InetAddress;", "c", "", "address", "addressOffset", "b", "d", "okhttp" }, k = 2, mv = { 1, 4, 0 })
public final class a
{
    private static final boolean a(final String s) {
        for (int length = s.length(), i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (k0.t((int)char1, 31) <= 0 || k0.t((int)char1, 127) >= 0) {
                return true;
            }
            if (s.q3(" #%/:?@[\\]", char1, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }
    
    private static final boolean b(final String s, int n, final int n2, final byte[] array, final int n3) {
        int n4 = n3;
        int i = n;
        while (true) {
            boolean b = false;
            if (i >= n2) {
                if (n4 == n3 + 4) {
                    b = true;
                }
                return b;
            }
            if (n4 == array.length) {
                return false;
            }
            n = i;
            if (n4 != n3) {
                if (s.charAt(i) != '.') {
                    return false;
                }
                n = i + 1;
            }
            i = n;
            int n5 = 0;
            while (i < n2) {
                final char char1 = s.charAt(i);
                if (k0.t((int)char1, 48) < 0) {
                    break;
                }
                if (k0.t((int)char1, 57) > 0) {
                    break;
                }
                if (n5 == 0 && n != i) {
                    return false;
                }
                n5 = n5 * 10 + char1 - 48;
                if (n5 > 255) {
                    return false;
                }
                ++i;
            }
            if (i - n == 0) {
                return false;
            }
            array[n4] = (byte)n5;
            ++n4;
        }
    }
    
    private static final InetAddress c(final String s, int n, int n2) {
        final byte[] array = new byte[16];
        int n3 = 0;
        int n4 = -1;
        int n5 = -1;
        int i = n;
        int fromIndex;
        while (true) {
            n = n3;
            fromIndex = n4;
            if (i >= n2) {
                break;
            }
            if (n3 == 16) {
                return null;
            }
            final int n6 = i + 2;
            if (n6 <= n2 && s.t2(s, "::", i, false, 4, null)) {
                if (n4 != -1) {
                    return null;
                }
                n = n3 + 2;
                if (n6 == n2) {
                    fromIndex = n;
                    break;
                }
                final int n7 = n6;
                n4 = n;
                n3 = n;
                n = n7;
            }
            else {
                n = i;
                if (n3 != 0) {
                    if (s.t2(s, ":", i, false, 4, null)) {
                        n = i + 1;
                    }
                    else {
                        if (!s.t2(s, ".", i, false, 4, null)) {
                            return null;
                        }
                        if (!b(s, n5, n2, array, n3 - 2)) {
                            return null;
                        }
                        n = n3 + 2;
                        fromIndex = n4;
                        break;
                    }
                }
            }
            i = n;
            int n8 = 0;
            while (i < n2) {
                final int n9 = d.N(s.charAt(i));
                if (n9 == -1) {
                    break;
                }
                n8 = (n8 << 4) + n9;
                ++i;
            }
            final int n10 = i - n;
            if (n10 == 0 || n10 > 4) {
                return null;
            }
            final int n11 = n3 + 1;
            array[n3] = (byte)(n8 >>> 8 & 0xFF);
            n3 = n11 + 1;
            array[n11] = (byte)(n8 & 0xFF);
            n5 = n;
        }
        if (n != 16) {
            if (fromIndex == -1) {
                return null;
            }
            n2 = n - fromIndex;
            System.arraycopy(array, fromIndex, array, 16 - n2, n2);
            Arrays.fill(array, fromIndex, 16 - n + fromIndex, (byte)0);
        }
        return InetAddress.getByAddress(array);
    }
    
    private static final String d(final byte[] array) {
        final int n = 0;
        int n2 = -1;
        int i = 0;
        int n3 = 0;
        while (i < array.length) {
            int n4;
            for (n4 = i; n4 < 16 && array[n4] == 0 && array[n4 + 1] == 0; n4 += 2) {}
            final int n5 = n4 - i;
            int n6 = n2;
            int n7;
            if (n5 > (n7 = n3)) {
                n6 = n2;
                n7 = n3;
                if (n5 >= 4) {
                    n7 = n5;
                    n6 = i;
                }
            }
            i = n4 + 2;
            n2 = n6;
            n3 = n7;
        }
        final m m = new m();
        int j = n;
        while (j < array.length) {
            if (j == n2) {
                m.G0(58);
                final int n8 = j + n3;
                if ((j = n8) != 16) {
                    continue;
                }
                m.G0(58);
                j = n8;
            }
            else {
                if (j > 0) {
                    m.G0(58);
                }
                m.L0(d.b(array[j], 255) << 8 | d.b(array[j + 1], 255));
                j += 2;
            }
        }
        return m.y4();
    }
    
    @f
    public static final String e(@e String s) {
        k0.p((Object)s, "$this$toCanonicalHost");
        boolean b = false;
        final String s2 = null;
        if (s.V2(s, ":", false, 2, null)) {
            InetAddress inetAddress;
            if (s.u2(s, "[", false, 2, null) && s.J1(s, "]", false, 2, null)) {
                inetAddress = c(s, 1, s.length() - 1);
            }
            else {
                inetAddress = c(s, 0, s.length());
            }
            if (inetAddress == null) {
                return null;
            }
            final byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                k0.o((Object)address, "address");
                return d(address);
            }
            if (address.length == 4) {
                return inetAddress.getHostAddress();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid IPv6 address: '");
            sb.append(s);
            sb.append('\'');
            throw new AssertionError((Object)sb.toString());
        }
        else {
            try {
                s = IDN.toASCII(s);
                k0.o((Object)s, "IDN.toASCII(host)");
                final Locale us = Locale.US;
                k0.o((Object)us, "Locale.US");
                if (s == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                s = s.toLowerCase(us);
                k0.o((Object)s, "(this as java.lang.String).toLowerCase(locale)");
                if (s.length() == 0) {
                    b = true;
                }
                if (b) {
                    return null;
                }
                if (a(s)) {
                    s = s2;
                }
                return s;
            }
            catch (IllegalArgumentException ex) {
                return null;
            }
        }
    }
}
