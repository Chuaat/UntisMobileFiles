// 
// Decompiled by Procyon v0.5.36
// 

package okio.internal;

import okio.p0;
import okio.r0;
import okio.o0;
import okio.p;
import okio.g0;
import okio.m0;
import okio.n0;
import okio.j;
import java.io.EOFException;
import kotlin.jvm.internal.k0;
import okio.m;
import okio.i;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a0\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aA\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000b2\u001a\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u0011H\u0080\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001e\u0010\u0018\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\bH\u0000\u001a%\u0010\u001c\u001a\u00020\n*\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u001e*\u00020\nH\u0080\b\u001a\r\u0010!\u001a\u00020 *\u00020\nH\u0080\b\u001a\r\u0010\"\u001a\u00020\u0002*\u00020\nH\u0080\b\u001a\r\u0010#\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\u0015\u0010%\u001a\u00020\u001e*\u00020\n2\u0006\u0010$\u001a\u00020\u000bH\u0080\b\u001a\r\u0010'\u001a\u00020&*\u00020\nH\u0080\b\u001a\u0015\u0010(\u001a\u00020&*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a)\u0010+\u001a\u00020\n*\u00020\n2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010-\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010.\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\u000bH\u0080\b\u001a\u0015\u00100\u001a\u00020\u0000*\u00020\n2\u0006\u0010/\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010\u000f\u001a\u00020\n*\u00020\n2\u0006\u00101\u001a\u00020\u0004H\u0080\b\u001a%\u00102\u001a\u00020\n*\u00020\n2\u0006\u00101\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\r\u00103\u001a\u00020\u0004*\u00020\nH\u0080\b\u001a\u0015\u0010,\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u00105\u001a\u00020\u0002*\u00020\n2\u0006\u00104\u001a\u00020\u0004H\u0080\b\u001a\u0015\u00106\u001a\u00020&*\u00020\n2\u0006\u00104\u001a\u00020\u0004H\u0080\b\u001a%\u00107\u001a\u00020\u0002*\u00020\n2\u0006\u00104\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\r\u00108\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\r\u00109\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\r\u0010:\u001a\u00020)*\u00020\nH\u0080\b\u001a\u0015\u0010;\u001a\u00020)*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010<\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0080\b\u001a\u001d\u0010=\u001a\u00020&*\u00020\n2\u0006\u00104\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010?\u001a\u00020\u000b*\u00020\n2\u0006\u00104\u001a\u00020>H\u0080\b\u001a\u0015\u0010@\u001a\u00020\r*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u000f\u0010A\u001a\u0004\u0018\u00010\r*\u00020\nH\u0080\b\u001a\u0015\u0010C\u001a\u00020\r*\u00020\n2\u0006\u0010B\u001a\u00020\u000bH\u0080\b\u001a\r\u0010D\u001a\u00020\u0002*\u00020\nH\u0080\b\u001a%\u0010H\u001a\u00020\n*\u00020\n2\u0006\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010J\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010L\u001a\u00020\u000b*\u00020\n2\u0006\u00101\u001a\u00020KH\u0080\b\u001a\u001d\u0010M\u001a\u00020\n*\u00020\n2\u0006\u00101\u001a\u00020K2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010N\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010Q\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010S\u001a\u00020\n*\u00020\n2\u0006\u0010R\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010T\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\u000bH\u0080\b\u001a\u001d\u0010U\u001a\u00020&*\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u001d\u0010V\u001a\u00020\u000b*\u00020\n2\u0006\u00104\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a%\u0010X\u001a\u00020\u000b*\u00020\n2\u0006\u0010N\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020\u000bH\u0080\b\u001a\u001d\u0010Y\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u000bH\u0080\b\u001a\u001d\u0010[\u001a\u00020\u000b*\u00020\n2\u0006\u0010Z\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u000bH\u0080\b\u001a-\u0010\\\u001a\u00020\b*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\u0017\u0010_\u001a\u00020\b*\u00020\n2\b\u0010^\u001a\u0004\u0018\u00010]H\u0080\b\u001a\r\u0010R\u001a\u00020\u0002*\u00020\nH\u0080\b\u001a\r\u0010`\u001a\u00020\n*\u00020\nH\u0080\b\u001a\r\u0010a\u001a\u00020)*\u00020\nH\u0080\b\u001a\u0015\u0010b\u001a\u00020)*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\u0014\u0010e\u001a\u00020c*\u00020\n2\u0006\u0010d\u001a\u00020cH\u0000\u001a\u0014\u0010P\u001a\u00020c*\u00020\n2\u0006\u0010d\u001a\u00020cH\u0000\u001a\r\u0010f\u001a\u00020\u0002*\u00020cH\u0080\b\u001a\u0015\u0010g\u001a\u00020\u0002*\u00020c2\u0006\u0010\u001a\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010i\u001a\u00020\u000b*\u00020c2\u0006\u0010h\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010k\u001a\u00020\u000b*\u00020c2\u0006\u0010j\u001a\u00020\u0002H\u0080\b\u001a\r\u0010N\u001a\u00020&*\u00020cH\u0080\b\"\u0016\u0010l\u001a\u00020\u000b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010C\"\u0016\u0010m\u001a\u00020\u000b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b`\u0010C\"\u001c\u0010q\u001a\u00020\u00048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010n\u001a\u0004\bo\u0010p\"\u0016\u0010r\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bN\u0010A\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006s" }, d2 = { "Lokio/m0;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "h0", "Lokio/m;", "", "newline", "", "i0", "T", "fromIndex", "Lkotlin/Function2;", "lambda", "j0", "(Lokio/m;JLn6/p;)Ljava/lang/Object;", "Lokio/g0;", "options", "selectTruncated", "k0", "out", "offset", "byteCount", "e", "c", "", "t", "", "E", "C", "D", "pos", "h", "Lkotlin/j2;", "a", "N", "Lokio/p;", "byteString", "R", "v", "Z", "a0", "minimumCapacity", "Q", "source", "U", "u", "sink", "o", "A", "p", "y", "B", "w", "x", "M", "z", "Lokio/p0;", "r", "G", "I", "limit", "J", "H", "string", "beginIndex", "endIndex", "e0", "codePoint", "f0", "Lokio/r0;", "X", "S", "b", "Y", "s", "d0", "i", "b0", "c0", "V", "q", "toIndex", "j", "k", "targetBytes", "l", "n", "", "other", "f", "d", "O", "P", "Lokio/m$a;", "unsafeCursor", "F", "m", "L", "newSize", "K", "minByteCount", "g", "OVERFLOW_ZONE", "OVERFLOW_DIGIT_START", "[B", "g0", "()[B", "HEX_DIGIT_BYTES", "SEGMENTING_THRESHOLD", "okio" }, k = 2, mv = { 1, 4, 1 })
public final class a
{
    @e
    private static final byte[] a;
    public static final int b = 4096;
    public static final long c = -922337203685477580L;
    public static final long d = -7L;
    
    static {
        a = i.a("0123456789abcdef");
    }
    
    public static final void A(@e final m m, @e final byte[] array) {
        k0.p((Object)m, "$this$commonReadFully");
        k0.p((Object)array, "sink");
        int read;
        for (int i = 0; i < array.length; i += read) {
            read = m.read(array, i, array.length - i);
            if (read == -1) {
                throw new EOFException();
            }
        }
    }
    
    public static final long B(@e m g0) {
        k0.p((Object)g0, "$this$commonReadHexadecimalUnsignedLong");
        if (g0.h0() != 0L) {
            int n = 0;
            long n2 = 0L;
            int n3 = 0;
            long n4;
            int n5;
            do {
                final m0 g2 = g0.G;
                k0.m((Object)g2);
                final byte[] a = g2.a;
                int b = g2.b;
                final int c = g2.c;
                n4 = n2;
                n5 = n;
                int n6;
                while (true) {
                    n6 = n3;
                    if (b >= c) {
                        break;
                    }
                    final byte b2 = a[b];
                    final byte b3 = 48;
                    int n7;
                    if (b2 >= b3 && b2 <= (byte)57) {
                        n7 = b2 - b3;
                    }
                    else {
                        byte b4 = 97;
                        if (b2 < b4 || b2 > (byte)102) {
                            b4 = 65;
                            if (b2 < b4 || b2 > (byte)70) {
                                if (n5 != 0) {
                                    n6 = 1;
                                    break;
                                }
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Expected leading [0-9a-fA-F] character but was 0x");
                                sb.append(j.o(b2));
                                throw new NumberFormatException(sb.toString());
                            }
                        }
                        n7 = b2 - b4 + 10;
                    }
                    if ((0xF000000000000000L & n4) != 0x0L) {
                        g0 = new m().L0(n4).G0(b2);
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Number too large: ");
                        sb2.append(g0.y4());
                        throw new NumberFormatException(sb2.toString());
                    }
                    n4 = (n4 << 4 | (long)n7);
                    ++b;
                    ++n5;
                }
                if (b == c) {
                    g0.G = g2.b();
                    n0.d(g2);
                }
                else {
                    g2.b = b;
                }
                if (n6 != 0) {
                    break;
                }
                n = n5;
                n3 = n6;
                n2 = n4;
            } while (g0.G != null);
            g0.d0(g0.h0() - n5);
            return n4;
        }
        throw new EOFException();
    }
    
    public static final int C(@e final m m) {
        k0.p((Object)m, "$this$commonReadInt");
        if (m.h0() < 4L) {
            throw new EOFException();
        }
        final m0 g = m.G;
        k0.m((Object)g);
        final int b = g.b;
        final int c = g.c;
        if (c - b < 4L) {
            return (m.readByte() & 0xFF) | ((m.readByte() & 0xFF) << 24 | (m.readByte() & 0xFF) << 16 | (m.readByte() & 0xFF) << 8);
        }
        final byte[] a = g.a;
        final int n = b + 1;
        final byte b2 = a[b];
        final int n2 = n + 1;
        final byte b3 = a[n];
        final int n3 = n2 + 1;
        final byte b4 = a[n2];
        final int b5 = n3 + 1;
        final byte b6 = a[n3];
        m.d0(m.h0() - 4L);
        if (b5 == c) {
            m.G = g.b();
            n0.d(g);
        }
        else {
            g.b = b5;
        }
        return (b2 & 0xFF) << 24 | (b3 & 0xFF) << 16 | (b4 & 0xFF) << 8 | (b6 & 0xFF);
    }
    
    public static final long D(@e final m m) {
        k0.p((Object)m, "$this$commonReadLong");
        if (m.h0() < 8L) {
            throw new EOFException();
        }
        final m0 g = m.G;
        k0.m((Object)g);
        final int b = g.b;
        final int c = g.c;
        if (c - b < 8L) {
            return ((long)m.readInt() & 0xFFFFFFFFL) << 32 | (0xFFFFFFFFL & (long)m.readInt());
        }
        final byte[] a = g.a;
        final int n = b + 1;
        final long n2 = a[b];
        final int n3 = n + 1;
        final long n4 = a[n];
        final int n5 = n3 + 1;
        final long n6 = a[n3];
        final int n7 = n5 + 1;
        final long n8 = a[n5];
        final int n9 = n7 + 1;
        final long n10 = a[n7];
        final int n11 = n9 + 1;
        final long n12 = a[n9];
        final int n13 = n11 + 1;
        final long n14 = a[n11];
        final int b2 = n13 + 1;
        final long n15 = a[n13];
        m.d0(m.h0() - 8L);
        if (b2 == c) {
            m.G = g.b();
            n0.d(g);
        }
        else {
            g.b = b2;
        }
        return (n8 & 0xFFL) << 32 | ((n2 & 0xFFL) << 56 | (n4 & 0xFFL) << 48 | (n6 & 0xFFL) << 40) | (n10 & 0xFFL) << 24 | (n12 & 0xFFL) << 16 | (n14 & 0xFFL) << 8 | (n15 & 0xFFL);
    }
    
    public static final short E(@e final m m) {
        k0.p((Object)m, "$this$commonReadShort");
        if (m.h0() < 2L) {
            throw new EOFException();
        }
        final m0 g = m.G;
        k0.m((Object)g);
        final int b = g.b;
        final int c = g.c;
        if (c - b < 2) {
            return (short)((m.readByte() & 0xFF) | (m.readByte() & 0xFF) << 8);
        }
        final byte[] a = g.a;
        final int n = b + 1;
        final byte b2 = a[b];
        final int b3 = n + 1;
        final byte b4 = a[n];
        m.d0(m.h0() - 2L);
        if (b3 == c) {
            m.G = g.b();
            n0.d(g);
        }
        else {
            g.b = b3;
        }
        return (short)((b2 & 0xFF) << 8 | (b4 & 0xFF));
    }
    
    @e
    public static final m.a F(@e final m g, @e final m.a a) {
        k0.p((Object)g, "$this$commonReadUnsafe");
        k0.p((Object)a, "unsafeCursor");
        if (a.G == null) {
            a.G = g;
            a.H = false;
            return a;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }
    
    @e
    public static final String G(@e final m m, final long lng) {
        k0.p((Object)m, "$this$commonReadUtf8");
        final long n = lcmp(lng, 0L);
        if (n < 0 || lng > Integer.MAX_VALUE) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount: ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (m.h0() < lng) {
            throw new EOFException();
        }
        if (n == 0) {
            return "";
        }
        final m0 g = m.G;
        k0.m((Object)g);
        final int b = g.b;
        if (b + lng > g.c) {
            return f.c(m.v4(lng), 0, 0, 3, null);
        }
        final byte[] a = g.a;
        final int n2 = (int)lng;
        final String b2 = f.b(a, b, b + n2);
        g.b += n2;
        m.d0(m.h0() - lng);
        if (g.b == g.c) {
            m.G = g.b();
            n0.d(g);
        }
        return b2;
    }
    
    public static final int H(@e final m m) {
        k0.p((Object)m, "$this$commonReadUtf8CodePoint");
        if (m.h0() == 0L) {
            throw new EOFException();
        }
        final byte f = m.F(0L);
        int i = 1;
        final int n = 65533;
        int n2;
        int j;
        int n3;
        if ((f & 0x80) == 0x0) {
            n2 = (f & 0x7F);
            j = 1;
            n3 = 0;
        }
        else if ((f & 0xE0) == 0xC0) {
            n2 = (f & 0x1F);
            j = 2;
            n3 = 128;
        }
        else if ((f & 0xF0) == 0xE0) {
            n2 = (f & 0xF);
            j = 3;
            n3 = 2048;
        }
        else {
            if ((f & 0xF8) != 0xF0) {
                m.skip(1L);
                return 65533;
            }
            n2 = (f & 0x7);
            j = 4;
            n3 = 65536;
        }
        final long h0 = m.h0();
        final long n4 = j;
        if (h0 >= n4) {
            while (i < j) {
                final long n5 = i;
                final byte f2 = m.F(n5);
                if ((f2 & 0xC0) != 0x80) {
                    m.skip(n5);
                    return 65533;
                }
                n2 = (n2 << 6 | (f2 & 0x3F));
                ++i;
            }
            m.skip(n4);
            if (n2 > 1114111) {
                n2 = n;
            }
            else {
                if (55296 <= n2) {
                    if (57343 >= n2) {
                        n2 = n;
                        return n2;
                    }
                }
                if (n2 < n3) {
                    n2 = n;
                }
            }
            return n2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("size < ");
        sb.append(j);
        sb.append(": ");
        sb.append(m.h0());
        sb.append(" (to read code point prefixed 0x");
        sb.append(okio.j.o(f));
        sb.append(')');
        throw new EOFException(sb.toString());
    }
    
    @org.jetbrains.annotations.f
    public static final String I(@e final m m) {
        k0.p((Object)m, "$this$commonReadUtf8Line");
        final long h5 = m.H5((byte)10);
        String s;
        if (h5 != -1L) {
            s = i0(m, h5);
        }
        else if (m.h0() != 0L) {
            s = m.t0(m.h0());
        }
        else {
            s = null;
        }
        return s;
    }
    
    @e
    public static final String J(@e final m m, final long n) {
        k0.p((Object)m, "$this$commonReadUtf8LineStrict");
        if (n < 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("limit < 0: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long n2 = Long.MAX_VALUE;
        if (n != Long.MAX_VALUE) {
            n2 = n + 1L;
        }
        final byte b = 10;
        final long v1 = m.V1(b, 0L, n2);
        if (v1 != -1L) {
            return i0(m, v1);
        }
        if (n2 < m.h0() && m.F(n2 - 1L) == (byte)13 && m.F(n2) == b) {
            return i0(m, n2);
        }
        final m i = new m();
        m.s(i, 0L, Math.min(32, m.h0()));
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("\\n not found: limit=");
        sb2.append(Math.min(m.h0(), n));
        sb2.append(" content=");
        sb2.append(i.D3().E());
        sb2.append('\u2026');
        throw new EOFException(sb2.toString());
    }
    
    public static final long K(@e final m.a a, final long n) {
        k0.p((Object)a, "$this$commonResizeBuffer");
        final m g = a.G;
        if (g == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (a.H) {
            final long h0 = g.h0();
            final long n2 = lcmp(n, h0);
            if (n2 <= 0) {
                if (n < 0L) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("newSize < 0: ");
                    sb.append(n);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                long n4;
                for (long n3 = h0 - n; n3 > 0L; n3 -= n4) {
                    final m0 g2 = g.G;
                    k0.m((Object)g2);
                    final m0 g3 = g2.g;
                    k0.m((Object)g3);
                    final int c = g3.c;
                    n4 = c - g3.b;
                    if (n4 > n3) {
                        g3.c = c - (int)n3;
                        break;
                    }
                    g.G = g3.b();
                    n0.d(g3);
                }
                a.f(null);
                a.J = n;
                a.K = null;
                a.L = -1;
                a.M = -1;
            }
            else if (n2 > 0) {
                long a2 = n - h0;
                int n5 = 1;
                while (a2 > 0L) {
                    final m0 m0 = g.m0(1);
                    final int n6 = (int)Math.min(a2, 8192 - m0.c);
                    m0.c += n6;
                    a2 -= n6;
                    int n7;
                    if ((n7 = n5) != 0) {
                        a.f(m0);
                        a.J = h0;
                        a.K = m0.a;
                        final int c2 = m0.c;
                        a.L = c2 - n6;
                        a.M = c2;
                        n7 = 0;
                    }
                    n5 = n7;
                }
            }
            g.d0(n);
            return h0;
        }
        throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
    }
    
    public static final int L(@e final m.a a, final long j) {
        k0.p((Object)a, "$this$commonSeek");
        final m g = a.G;
        if (g == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (j < -1 || j > g.h0()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("offset=");
            sb.append(j);
            sb.append(" > size=");
            sb.append(g.h0());
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        if (j != -1L && j != g.h0()) {
            final long n = 0L;
            long h0 = g.h0();
            m0 m0 = g.G;
            long n2;
            m0 b3;
            if (a.b() != null) {
                final long i = a.J;
                final int l = a.L;
                final m0 b = a.b();
                k0.m((Object)b);
                n2 = i - (l - b.b);
                if (n2 > j) {
                    final m0 b2 = a.b();
                    h0 = n2;
                    b3 = m0;
                    n2 = n;
                    m0 = b2;
                }
                else {
                    b3 = a.b();
                }
            }
            else {
                b3 = m0;
                n2 = n;
            }
            long n3 = h0;
            long n4;
            m0 m2;
            if (h0 - j > j - n2) {
                m0 f = b3;
                while (true) {
                    k0.m((Object)f);
                    final int c = f.c;
                    final int b4 = f.b;
                    n4 = n2;
                    m2 = f;
                    if (j < c - b4 + n2) {
                        break;
                    }
                    n2 += c - b4;
                    f = f.f;
                }
            }
            else {
                while (n3 > j) {
                    k0.m((Object)m0);
                    m0 = m0.g;
                    k0.m((Object)m0);
                    n3 -= m0.c - m0.b;
                }
                n4 = n3;
                m2 = m0;
            }
            m0 c2 = m2;
            if (a.H) {
                k0.m((Object)m2);
                c2 = m2;
                if (m2.d) {
                    final m0 f2 = m2.f();
                    if (g.G == m2) {
                        g.G = f2;
                    }
                    c2 = m2.c(f2);
                    final m0 g2 = c2.g;
                    k0.m((Object)g2);
                    g2.b();
                }
            }
            a.f(c2);
            a.J = j;
            k0.m((Object)c2);
            a.K = c2.a;
            final int k = c2.b + (int)(j - n4);
            a.L = k;
            return (a.M = c2.c) - k;
        }
        a.f(null);
        a.J = j;
        a.K = null;
        a.L = -1;
        return a.M = -1;
    }
    
    public static final int M(@e final m m, @e final g0 g0) {
        k0.p((Object)m, "$this$commonSelect");
        k0.p((Object)g0, "options");
        final int l0 = l0(m, g0, false, 2, null);
        if (l0 == -1) {
            return -1;
        }
        m.skip(g0.i()[l0].size());
        return l0;
    }
    
    public static final void N(@e final m m, long a) {
        k0.p((Object)m, "$this$commonSkip");
        while (a > 0L) {
            final m0 g = m.G;
            if (g == null) {
                throw new EOFException();
            }
            final int n = (int)Math.min(a, g.c - g.b);
            final long h0 = m.h0();
            final long n2 = n;
            m.d0(h0 - n2);
            final long n3 = a - n2;
            final int b = g.b + n;
            g.b = b;
            a = n3;
            if (b != g.c) {
                continue;
            }
            m.G = g.b();
            n0.d(g);
            a = n3;
        }
    }
    
    @e
    public static final p O(@e final m m) {
        k0.p((Object)m, "$this$commonSnapshot");
        if (m.h0() <= Integer.MAX_VALUE) {
            return m.j0((int)m.h0());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("size > Int.MAX_VALUE: ");
        sb.append(m.h0());
        throw new IllegalStateException(sb.toString().toString());
    }
    
    @e
    public static final p P(@e final m m, final int b) {
        k0.p((Object)m, "$this$commonSnapshot");
        if (b == 0) {
            return p.K;
        }
        j.e(m.h0(), 0L, b);
        m0 m2 = m.G;
        int i = 0;
        int j;
        int n;
        int c;
        int b2;
        for (j = 0, n = 0; j < b; j += c - b2, ++n, m2 = m2.f) {
            k0.m((Object)m2);
            c = m2.c;
            b2 = m2.b;
            if (c == b2) {
                throw new AssertionError((Object)"s.limit == s.pos");
            }
        }
        final byte[][] array = new byte[n][];
        final int[] array2 = new int[n * 2];
        m0 m3 = m.G;
        for (int n2 = 0; i < b; i += m3.c - m3.b, array2[n2] = Math.min(i, b), array2[n2 + n] = m3.b, m3.d = true, ++n2, m3 = m3.f) {
            k0.m((Object)m3);
            array[n2] = m3.a;
        }
        return new o0(array, array2);
    }
    
    @e
    public static final m0 Q(@e final m m, final int n) {
        k0.p((Object)m, "$this$commonWritableSegment");
        boolean b = true;
        if (n < 1 || n > 8192) {
            b = false;
        }
        if (!b) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        final m0 g = m.G;
        if (g == null) {
            final m0 e = n0.e();
            m.G = e;
            e.g = e;
            return e.f = e;
        }
        k0.m((Object)g);
        final m0 g2 = g.g;
        k0.m((Object)g2);
        if (g2.c + n <= 8192) {
            final m0 c = g2;
            if (g2.e) {
                return c;
            }
        }
        return g2.c(n0.e());
    }
    
    @e
    public static final m R(@e final m m, @e final p p4, final int n, final int n2) {
        k0.p((Object)m, "$this$commonWrite");
        k0.p((Object)p4, "byteString");
        p4.W0(m, n, n2);
        return m;
    }
    
    @e
    public static final m S(@e final m m, @e final r0 r0, long n) {
        k0.p((Object)m, "$this$commonWrite");
        k0.p((Object)r0, "source");
        while (n > 0L) {
            final long read = r0.read(m, n);
            if (read == -1L) {
                throw new EOFException();
            }
            n -= read;
        }
        return m;
    }
    
    @e
    public static final m T(@e final m m, @e final byte[] array) {
        k0.p((Object)m, "$this$commonWrite");
        k0.p((Object)array, "source");
        return m.D0(array, 0, array.length);
    }
    
    @e
    public static final m U(@e final m m, @e final byte[] array, int i, int n) {
        k0.p((Object)m, "$this$commonWrite");
        k0.p((Object)array, "source");
        final long n2 = array.length;
        final long n3 = i;
        final long n4 = n;
        j.e(n2, n3, n4);
        for (int n5 = n + i; i < n5; i = n) {
            final m0 m2 = m.m0(1);
            final int min = Math.min(n5 - i, 8192 - m2.c);
            final byte[] a = m2.a;
            final int c = m2.c;
            n = i + min;
            kotlin.collections.m.W0(array, a, c, i, n);
            m2.c += min;
        }
        m.d0(m.h0() + n4);
        return m;
    }
    
    public static final void V(@e final m m, @e final m i, long n) {
        k0.p((Object)m, "$this$commonWrite");
        k0.p((Object)i, "source");
        if (i != m) {
            j.e(i.h0(), 0L, n);
            while (n > 0L) {
                final m0 g = i.G;
                k0.m((Object)g);
                final int c = g.c;
                final m0 g2 = i.G;
                k0.m((Object)g2);
                if (n < c - g2.b) {
                    final m0 g3 = m.G;
                    m0 g4;
                    if (g3 != null) {
                        k0.m((Object)g3);
                        g4 = g3.g;
                    }
                    else {
                        g4 = null;
                    }
                    if (g4 != null && g4.e) {
                        final long n2 = g4.c;
                        int b;
                        if (g4.d) {
                            b = 0;
                        }
                        else {
                            b = g4.b;
                        }
                        if (n2 + n - b <= 8192) {
                            final m0 g5 = i.G;
                            k0.m((Object)g5);
                            g5.g(g4, (int)n);
                            i.d0(i.h0() - n);
                            m.d0(m.h0() + n);
                            return;
                        }
                    }
                    final m0 g6 = i.G;
                    k0.m((Object)g6);
                    i.G = g6.e((int)n);
                }
                final m0 g7 = i.G;
                k0.m((Object)g7);
                final long n3 = g7.c - g7.b;
                i.G = g7.b();
                final m0 g8 = m.G;
                if (g8 == null) {
                    m.G = g7;
                    g7.g = g7;
                    g7.f = g7;
                }
                else {
                    k0.m((Object)g8);
                    final m0 g9 = g8.g;
                    k0.m((Object)g9);
                    g9.c(g7).a();
                }
                i.d0(i.h0() - n3);
                m.d0(m.h0() + n3);
                n -= n3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }
    
    public static final long X(@e final m m, @e final r0 r0) {
        k0.p((Object)m, "$this$commonWriteAll");
        k0.p((Object)r0, "source");
        long n = 0L;
        while (true) {
            final long read = r0.read(m, 8192);
            if (read == -1L) {
                break;
            }
            n += read;
        }
        return n;
    }
    
    @e
    public static final m Y(@e final m m, final int n) {
        k0.p((Object)m, "$this$commonWriteByte");
        final m0 m2 = m.m0(1);
        m2.a[m2.c++] = (byte)n;
        m.d0(m.h0() + 1L);
        return m;
    }
    
    @e
    public static final m Z(@e final m m, long n) {
        k0.p((Object)m, "$this$commonWriteDecimalLong");
        final long n2 = lcmp(n, 0L);
        if (n2 == 0) {
            return m.G0(48);
        }
        boolean b = false;
        int n3 = 1;
        long n4 = n;
        if (n2 < 0) {
            n4 = -n;
            if (n4 < 0L) {
                return m.p1("-9223372036854775808");
            }
            b = true;
        }
        if (n4 < 100000000L) {
            if (n4 < 10000L) {
                if (n4 < 100L) {
                    if (n4 >= 10L) {
                        n3 = 2;
                    }
                }
                else if (n4 < 1000L) {
                    n3 = 3;
                }
                else {
                    n3 = 4;
                }
            }
            else if (n4 < 1000000L) {
                if (n4 < 100000L) {
                    n3 = 5;
                }
                else {
                    n3 = 6;
                }
            }
            else if (n4 < 10000000L) {
                n3 = 7;
            }
            else {
                n3 = 8;
            }
        }
        else if (n4 < 1000000000000L) {
            if (n4 < 10000000000L) {
                if (n4 < 1000000000L) {
                    n3 = 9;
                }
                else {
                    n3 = 10;
                }
            }
            else if (n4 < 100000000000L) {
                n3 = 11;
            }
            else {
                n3 = 12;
            }
        }
        else if (n4 < 1000000000000000L) {
            if (n4 < 10000000000000L) {
                n3 = 13;
            }
            else if (n4 < 100000000000000L) {
                n3 = 14;
            }
            else {
                n3 = 15;
            }
        }
        else if (n4 < 100000000000000000L) {
            if (n4 < 10000000000000000L) {
                n3 = 16;
            }
            else {
                n3 = 17;
            }
        }
        else if (n4 < 1000000000000000000L) {
            n3 = 18;
        }
        else {
            n3 = 19;
        }
        int n5 = n3;
        if (b) {
            n5 = n3 + 1;
        }
        final m0 m2 = m.m0(n5);
        final byte[] a = m2.a;
        int n6 = m2.c + n5;
        while (n4 != 0L) {
            n = 10;
            final int n7 = (int)(n4 % n);
            --n6;
            a[n6] = g0()[n7];
            n4 /= n;
        }
        if (b) {
            a[n6 - 1] = 45;
        }
        m2.c += n5;
        m.d0(m.h0() + n5);
        return m;
    }
    
    public static final void a(@e final m m) {
        k0.p((Object)m, "$this$commonClear");
        m.skip(m.h0());
    }
    
    @e
    public static final m a0(@e final m m, long n) {
        k0.p((Object)m, "$this$commonWriteHexadecimalUnsignedLong");
        if (n == 0L) {
            return m.G0(48);
        }
        final long n2 = n >>> 1 | n;
        final long n3 = n2 | n2 >>> 2;
        final long n4 = n3 | n3 >>> 4;
        final long n5 = n4 | n4 >>> 8;
        final long n6 = n5 | n5 >>> 16;
        final long n7 = n6 | n6 >>> 32;
        final long n8 = n7 - (n7 >>> 1 & 0x5555555555555555L);
        final long n9 = (n8 >>> 2 & 0x3333333333333333L) + (n8 & 0x3333333333333333L);
        final long n10 = (n9 >>> 4) + n9 & 0xF0F0F0F0F0F0F0FL;
        final long n11 = n10 + (n10 >>> 8);
        final long n12 = n11 + (n11 >>> 16);
        final int n13 = (int)(((n12 & 0x3FL) + (n12 >>> 32 & 0x3FL) + 3) / 4);
        final m0 m2 = m.m0(n13);
        final byte[] a = m2.a;
        for (int c = m2.c, i = c + n13 - 1; i >= c; --i) {
            a[i] = g0()[(int)(0xFL & n)];
            n >>>= 4;
        }
        m2.c += n13;
        m.d0(m.h0() + n13);
        return m;
    }
    
    public static final void b(@e final m.a a) {
        k0.p((Object)a, "$this$commonClose");
        if (a.G != null) {
            a.G = null;
            a.f(null);
            a.J = -1L;
            a.K = null;
            a.L = -1;
            a.M = -1;
            return;
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }
    
    @e
    public static final m b0(@e final m m, final int n) {
        k0.p((Object)m, "$this$commonWriteInt");
        final m0 m2 = m.m0(4);
        final byte[] a = m2.a;
        final int c = m2.c;
        final int n2 = c + 1;
        a[c] = (byte)(n >>> 24 & 0xFF);
        final int n3 = n2 + 1;
        a[n2] = (byte)(n >>> 16 & 0xFF);
        final int n4 = n3 + 1;
        a[n3] = (byte)(n >>> 8 & 0xFF);
        a[n4] = (byte)(n & 0xFF);
        m2.c = n4 + 1;
        m.d0(m.h0() + 4L);
        return m;
    }
    
    public static final long c(@e final m m) {
        k0.p((Object)m, "$this$commonCompleteSegmentByteCount");
        final long h0 = m.h0();
        if (h0 == 0L) {
            return 0L;
        }
        final m0 g = m.G;
        k0.m((Object)g);
        final m0 g2 = g.g;
        k0.m((Object)g2);
        final int c = g2.c;
        long n = h0;
        if (c < 8192) {
            n = h0;
            if (g2.e) {
                n = h0 - (c - g2.b);
            }
        }
        return n;
    }
    
    @e
    public static final m c0(@e final m m, final long n) {
        k0.p((Object)m, "$this$commonWriteLong");
        final m0 m2 = m.m0(8);
        final byte[] a = m2.a;
        final int c = m2.c;
        final int n2 = c + 1;
        a[c] = (byte)(n >>> 56 & 0xFFL);
        final int n3 = n2 + 1;
        a[n2] = (byte)(n >>> 48 & 0xFFL);
        final int n4 = n3 + 1;
        a[n3] = (byte)(n >>> 40 & 0xFFL);
        final int n5 = n4 + 1;
        a[n4] = (byte)(n >>> 32 & 0xFFL);
        final int n6 = n5 + 1;
        a[n5] = (byte)(n >>> 24 & 0xFFL);
        final int n7 = n6 + 1;
        a[n6] = (byte)(n >>> 16 & 0xFFL);
        final int n8 = n7 + 1;
        a[n7] = (byte)(n >>> 8 & 0xFFL);
        a[n8] = (byte)(n & 0xFFL);
        m2.c = n8 + 1;
        m.d0(m.h0() + 8L);
        return m;
    }
    
    @e
    public static final m d(@e final m m) {
        k0.p((Object)m, "$this$commonCopy");
        final m i = new m();
        if (m.h0() == 0L) {
            return i;
        }
        final m0 g = m.G;
        k0.m((Object)g);
        final m0 d = g.d();
        i.G = d;
        d.g = d;
        d.f = d;
        for (m0 m2 = g.f; m2 != g; m2 = m2.f) {
            final m0 g2 = d.g;
            k0.m((Object)g2);
            k0.m((Object)m2);
            g2.c(m2.d());
        }
        i.d0(m.h0());
        return i;
    }
    
    @e
    public static final m d0(@e final m m, final int n) {
        k0.p((Object)m, "$this$commonWriteShort");
        final m0 m2 = m.m0(2);
        final byte[] a = m2.a;
        final int c = m2.c;
        final int n2 = c + 1;
        a[c] = (byte)(n >>> 8 & 0xFF);
        a[n2] = (byte)(n & 0xFF);
        m2.c = n2 + 1;
        m.d0(m.h0() + 2L);
        return m;
    }
    
    @e
    public static final m e(@e final m m, @e final m i, long n, final long n2) {
        k0.p((Object)m, "$this$commonCopyTo");
        k0.p((Object)i, "out");
        j.e(m.h0(), n, n2);
        if (n2 == 0L) {
            return m;
        }
        i.d0(i.h0() + n2);
        m0 m2 = m.G;
        m0 f;
        long n3;
        long n4;
        while (true) {
            k0.m((Object)m2);
            final int c = m2.c;
            final int b = m2.b;
            f = m2;
            n3 = n;
            n4 = n2;
            if (n < c - b) {
                break;
            }
            n -= c - b;
            m2 = m2.f;
        }
        while (n4 > 0L) {
            k0.m((Object)f);
            final m0 d = f.d();
            final int b2 = d.b + (int)n3;
            d.b = b2;
            d.c = Math.min(b2 + (int)n4, d.c);
            final m0 g = i.G;
            if (g == null) {
                d.g = d;
                d.f = d;
                i.G = d;
            }
            else {
                k0.m((Object)g);
                final m0 g2 = g.g;
                k0.m((Object)g2);
                g2.c(d);
            }
            n4 -= d.c - d.b;
            f = f.f;
            n3 = 0L;
        }
        return m;
    }
    
    @e
    public static final m e0(@e final m m, @e final String s, int i, final int j) {
        k0.p((Object)m, "$this$commonWriteUtf8");
        k0.p((Object)s, "string");
        if (i < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (j < i) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(j);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        if (j <= s.length()) {
            while (i < j) {
                final char char1 = s.charAt(i);
                if (char1 < '\u0080') {
                    final m0 m2 = m.m0(1);
                    final byte[] a = m2.a;
                    final int n = m2.c - i;
                    final int min = Math.min(j, 8192 - n);
                    final int n2 = i + 1;
                    a[i + n] = (byte)char1;
                    char char2;
                    for (i = n2; i < min; ++i) {
                        char2 = s.charAt(i);
                        if (char2 >= '\u0080') {
                            break;
                        }
                        a[i + n] = (byte)char2;
                    }
                    final int c = m2.c;
                    final int n3 = n + i - c;
                    m2.c = c + n3;
                    m.d0(m.h0() + n3);
                }
                else {
                    long n4;
                    long n5;
                    if (char1 < '\u0800') {
                        final m0 m3 = m.m0(2);
                        final byte[] a2 = m3.a;
                        final int c2 = m3.c;
                        a2[c2] = (byte)(char1 >> 6 | 0xC0);
                        a2[c2 + 1] = (byte)((char1 & '?') | 0x80);
                        m3.c = c2 + 2;
                        n4 = m.h0();
                        n5 = 2L;
                    }
                    else if (char1 >= '\ud800' && char1 <= '\udfff') {
                        final int index = i + 1;
                        char char3;
                        if (index < j) {
                            char3 = s.charAt(index);
                        }
                        else {
                            char3 = '\0';
                        }
                        if (char1 <= '\udbff' && '\udc00' <= char3 && '\udfff' >= char3) {
                            final int n6 = ((char1 & '\u03ff') << 10 | (char3 & '\u03ff')) + 65536;
                            final m0 m4 = m.m0(4);
                            final byte[] a3 = m4.a;
                            final int c3 = m4.c;
                            a3[c3] = (byte)(n6 >> 18 | 0xF0);
                            a3[c3 + 1] = (byte)((n6 >> 12 & 0x3F) | 0x80);
                            a3[c3 + 2] = (byte)((n6 >> 6 & 0x3F) | 0x80);
                            a3[c3 + 3] = (byte)((n6 & 0x3F) | 0x80);
                            m4.c = c3 + 4;
                            m.d0(m.h0() + 4L);
                            i += 2;
                            continue;
                        }
                        m.G0(63);
                        i = index;
                        continue;
                    }
                    else {
                        final m0 m5 = m.m0(3);
                        final byte[] a4 = m5.a;
                        final int c4 = m5.c;
                        a4[c4] = (byte)(char1 >> 12 | 0xE0);
                        a4[c4 + 1] = (byte)((0x3F & char1 >> 6) | 0x80);
                        a4[c4 + 2] = (byte)((char1 & '?') | 0x80);
                        m5.c = c4 + 3;
                        n4 = m.h0();
                        n5 = 3L;
                    }
                    m.d0(n4 + n5);
                    ++i;
                }
            }
            return m;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("endIndex > string.length: ");
        sb3.append(j);
        sb3.append(" > ");
        sb3.append(s.length());
        throw new IllegalArgumentException(sb3.toString().toString());
    }
    
    public static final boolean f(@e final m m, @org.jetbrains.annotations.f final Object o) {
        k0.p((Object)m, "$this$commonEquals");
        if (m == o) {
            return true;
        }
        if (!(o instanceof m)) {
            return false;
        }
        final long h0 = m.h0();
        final m i = (m)o;
        if (h0 != i.h0()) {
            return false;
        }
        if (m.h0() == 0L) {
            return true;
        }
        m0 g = m.G;
        k0.m((Object)g);
        m0 g2 = i.G;
        k0.m((Object)g2);
        int n = g.b;
        int b = g2.b;
        long n3;
        m0 f;
        m0 f2;
        int b2;
        for (long n2 = 0L; n2 < m.h0(); n2 += n3, g2 = f2, g = f, b = b2) {
            long n4;
            int n5;
            for (n3 = Math.min(g.c - n, g2.c - b), n4 = 0L, n5 = n; n4 < n3; ++n4, ++n5, ++b) {
                if (g.a[n5] != g2.a[b]) {
                    return false;
                }
            }
            f = g;
            if ((n = n5) == g.c) {
                f = g.f;
                k0.m((Object)f);
                n = f.b;
            }
            f2 = g2;
            if ((b2 = b) == g2.c) {
                f2 = g2.f;
                k0.m((Object)f2);
                b2 = f2.b;
            }
        }
        return true;
    }
    
    @e
    public static final m f0(@e final m m, final int n) {
        k0.p((Object)m, "$this$commonWriteUtf8CodePoint");
        if (n < 128) {
            m.G0(n);
        }
        else {
            long n2;
            long n3;
            if (n < 2048) {
                final m0 m2 = m.m0(2);
                final byte[] a = m2.a;
                final int c = m2.c;
                a[c] = (byte)(n >> 6 | 0xC0);
                a[c + 1] = (byte)((n & 0x3F) | 0x80);
                m2.c = c + 2;
                n2 = m.h0();
                n3 = 2L;
            }
            else {
                if (55296 <= n) {
                    if (57343 >= n) {
                        m.G0(63);
                        return m;
                    }
                }
                if (n < 65536) {
                    final m0 m3 = m.m0(3);
                    final byte[] a2 = m3.a;
                    final int c2 = m3.c;
                    a2[c2] = (byte)(n >> 12 | 0xE0);
                    a2[c2 + 1] = (byte)((n >> 6 & 0x3F) | 0x80);
                    a2[c2 + 2] = (byte)((n & 0x3F) | 0x80);
                    m3.c = c2 + 3;
                    n2 = m.h0();
                    n3 = 3L;
                }
                else {
                    if (n > 1114111) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected code point: 0x");
                        sb.append(j.p(n));
                        throw new IllegalArgumentException(sb.toString());
                    }
                    final m0 m4 = m.m0(4);
                    final byte[] a3 = m4.a;
                    final int c3 = m4.c;
                    a3[c3] = (byte)(n >> 18 | 0xF0);
                    a3[c3 + 1] = (byte)((n >> 12 & 0x3F) | 0x80);
                    a3[c3 + 2] = (byte)((n >> 6 & 0x3F) | 0x80);
                    a3[c3 + 3] = (byte)((n & 0x3F) | 0x80);
                    m4.c = c3 + 4;
                    n2 = m.h0();
                    n3 = 4L;
                }
            }
            m.d0(n2 + n3);
        }
        return m;
    }
    
    public static final long g(@e final m.a a, int n) {
        k0.p((Object)a, "$this$commonExpandBuffer");
        final int n2 = 1;
        if (n <= 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("minByteCount <= 0: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        int n3;
        if (n <= 8192) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        if (n3 == 0) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("minByteCount > Segment.SIZE: ");
            sb2.append(n);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        final m g = a.G;
        if (g == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (a.H) {
            final long h0 = g.h0();
            final m0 m0 = g.m0(n);
            n = 8192 - m0.c;
            m0.c = 8192;
            final long n4 = n;
            g.d0(h0 + n4);
            a.f(m0);
            a.J = h0;
            a.K = m0.a;
            a.L = 8192 - n;
            a.M = 8192;
            return n4;
        }
        throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
    }
    
    @e
    public static final byte[] g0() {
        return okio.internal.a.a;
    }
    
    public static final byte h(@e final m m, final long n) {
        k0.p((Object)m, "$this$commonGet");
        j.e(m.h0(), n, 1L);
        m0 m2 = m.G;
        if (m2 == null) {
            k0.m((Object)null);
            throw null;
        }
        if (m.h0() - n < n) {
            long h0;
            for (h0 = m.h0(); h0 > n; h0 -= m2.c - m2.b) {
                m2 = m2.g;
                k0.m((Object)m2);
            }
            k0.m((Object)m2);
            return m2.a[(int)(m2.b + n - h0)];
        }
        long n2 = 0L;
        while (true) {
            final long n3 = m2.c - m2.b + n2;
            if (n3 > n) {
                break;
            }
            m2 = m2.f;
            k0.m((Object)m2);
            n2 = n3;
        }
        k0.m((Object)m2);
        return m2.a[(int)(m2.b + n - n2)];
    }
    
    public static final boolean h0(@e m0 f, int n, @e final byte[] array, int i, final int n2) {
        k0.p((Object)f, "segment");
        k0.p((Object)array, "bytes");
        int c = f.c;
        byte[] a = f.a;
        m0 m0 = f;
        while (i < n2) {
            int c2 = c;
            f = m0;
            int b;
            if ((b = n) == c) {
                f = m0.f;
                k0.m((Object)f);
                final byte[] a2 = f.a;
                b = f.b;
                c2 = f.c;
                a = a2;
            }
            if (a[b] != array[i]) {
                return false;
            }
            n = b + 1;
            ++i;
            c = c2;
            m0 = f;
        }
        return true;
    }
    
    public static final int i(@e final m m) {
        k0.p((Object)m, "$this$commonHashCode");
        m0 g = m.G;
        if (g != null) {
            int n = 1;
            m0 f;
            int n2;
            do {
                int i = g.b;
                final int c = g.c;
                n2 = n;
                while (i < c) {
                    n2 = n2 * 31 + g.a[i];
                    ++i;
                }
                f = g.f;
                k0.m((Object)f);
                g = f;
                n = n2;
            } while (f != m.G);
            return n2;
        }
        return 0;
    }
    
    @e
    public static final String i0(@e final m m, long n) {
        k0.p((Object)m, "$this$readUtf8Line");
        final long n2 = 1L;
        String s = null;
        Label_0056: {
            if (n > 0L) {
                final long n3 = n - 1L;
                if (m.F(n3) == (byte)13) {
                    s = m.t0(n3);
                    n = 2L;
                    break Label_0056;
                }
            }
            s = m.t0(n);
            n = n2;
        }
        m.skip(n);
        return s;
    }
    
    public static final long j(@e final m m, final byte b, long lng, long lng2) {
        k0.p((Object)m, "$this$commonIndexOf");
        final long n = 0L;
        boolean b2 = false;
        Label_0035: {
            if (0L <= lng) {
                if (lng2 >= lng) {
                    b2 = true;
                    break Label_0035;
                }
            }
            b2 = false;
        }
        if (!b2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("size=");
            sb.append(m.h0());
            sb.append(" fromIndex=");
            sb.append(lng);
            sb.append(" toIndex=");
            sb.append(lng2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long h0 = lng2;
        if (lng2 > m.h0()) {
            h0 = m.h0();
        }
        if (lng == h0) {
            return -1L;
        }
        final m0 g = m.G;
        if (g != null) {
            lng2 = n;
            m0 m2 = g;
            if (m.h0() - lng < lng) {
                long h2 = m.h0();
                m0 g2 = g;
                m0 f;
                long n2;
                while (true) {
                    lng2 = h2;
                    f = g2;
                    n2 = lng;
                    if (h2 <= lng) {
                        break;
                    }
                    g2 = g2.g;
                    k0.m((Object)g2);
                    h2 -= g2.c - g2.b;
                }
                while (lng2 < h0) {
                    final byte[] a = f.a;
                    for (int n3 = (int)Math.min(f.c, f.b + h0 - lng2), i = (int)(f.b + n2 - lng2); i < n3; ++i) {
                        if (a[i] == b) {
                            return i - f.b + lng2;
                        }
                    }
                    lng2 += f.c - f.b;
                    f = f.f;
                    k0.m((Object)f);
                    n2 = lng2;
                }
                return -1L;
            }
            while (true) {
                final long n4 = m2.c - m2.b + lng2;
                if (n4 > lng) {
                    break;
                }
                m2 = m2.f;
                k0.m((Object)m2);
                lng2 = n4;
            }
            while (lng2 < h0) {
                final byte[] a2 = m2.a;
                for (int n5 = (int)Math.min(m2.c, m2.b + h0 - lng2), i = (int)(m2.b + lng - lng2); i < n5; ++i) {
                    if (a2[i] == b) {
                        final m0 f = m2;
                        return i - f.b + lng2;
                    }
                }
                lng2 += m2.c - m2.b;
                m2 = m2.f;
                k0.m((Object)m2);
                lng = lng2;
            }
            return -1L;
        }
        return -1L;
    }
    
    public static final <T> T j0(@e final m m, final long n, @e final n6.p<? super m0, ? super Long, ? extends T> p3) {
        k0.p((Object)m, "$this$seek");
        k0.p((Object)p3, "lambda");
        m0 m2 = m.G;
        if (m2 == null) {
            return (T)p3.invoke((Object)null, (Object)(-1L));
        }
        if (m.h0() - n < n) {
            long h0;
            for (h0 = m.h0(); h0 > n; h0 -= m2.c - m2.b) {
                m2 = m2.g;
                k0.m((Object)m2);
            }
            return (T)p3.invoke((Object)m2, (Object)h0);
        }
        long l = 0L;
        while (true) {
            final long n2 = m2.c - m2.b + l;
            if (n2 > n) {
                break;
            }
            m2 = m2.f;
            k0.m((Object)m2);
            l = n2;
        }
        return (T)p3.invoke((Object)m2, (Object)l);
    }
    
    public static final long k(@e final m m, @e final p p3, long lng) {
        k0.p((Object)m, "$this$commonIndexOf");
        k0.p((Object)p3, "bytes");
        if (p3.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long h0 = 0L;
        if (lng < 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("fromIndex < 0: ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        final m0 g = m.G;
        if (g != null) {
            m0 m2 = g;
            if (m.h0() - lng < lng) {
                for (h0 = m.h0(), m2 = g; h0 > lng; h0 -= m2.c - m2.b) {
                    m2 = m2.g;
                    k0.m((Object)m2);
                }
                final byte[] a0 = p3.a0();
                final byte b = a0[0];
                final int size = p3.size();
                final long n = m.h0() - size + 1L;
                while (h0 < n) {
                    final byte[] a2 = m2.a;
                    for (int n2 = (int)Math.min(m2.c, m2.b + n - h0), i = (int)(m2.b + lng - h0); i < n2; ++i) {
                        if (a2[i] == b && h0(m2, i + 1, a0, 1, size)) {
                            return i - m2.b + h0;
                        }
                    }
                    h0 += m2.c - m2.b;
                    m2 = m2.f;
                    k0.m((Object)m2);
                    lng = h0;
                }
                return -1L;
            }
            while (true) {
                final long n3 = m2.c - m2.b + h0;
                if (n3 > lng) {
                    break;
                }
                m2 = m2.f;
                k0.m((Object)m2);
                h0 = n3;
            }
            final byte[] a3 = p3.a0();
            final byte b2 = a3[0];
            final int size2 = p3.size();
            final long n4 = m.h0() - size2 + 1L;
            while (h0 < n4) {
                final byte[] a4 = m2.a;
                for (int n5 = (int)Math.min(m2.c, m2.b + n4 - h0), i = (int)(m2.b + lng - h0); i < n5; ++i) {
                    if (a4[i] == b2 && h0(m2, i + 1, a3, 1, size2)) {
                        return i - m2.b + h0;
                    }
                }
                h0 += m2.c - m2.b;
                m2 = m2.f;
                k0.m((Object)m2);
                lng = h0;
            }
            return -1L;
        }
        return -1L;
    }
    
    public static final int k0(@e final m m, @e final g0 g0, final boolean b) {
        k0.p((Object)m, "$this$selectPrefix");
        k0.p((Object)g0, "options");
        final m0 g2 = m.G;
        int n = -2;
        if (g2 != null) {
            final byte[] a = g2.a;
            int b2 = g2.b;
            int c = g2.c;
            final int[] k = g0.k();
            m0 m2 = g2;
            int n2 = 0;
            int n3 = -1;
            byte[] a2 = a;
        Label_0219:
            while (true) {
                final int n4 = n2 + 1;
                final int n5 = k[n2];
                final int n6 = n4 + 1;
                final int n7 = k[n4];
                if (n7 != -1) {
                    n3 = n7;
                }
                if (m2 == null) {
                    break;
                }
                int n10 = 0;
                int n11 = 0;
                m0 f = null;
                Label_0442: {
                    if (n5 >= 0) {
                        final int n8 = b2 + 1;
                        final byte b3 = a2[b2];
                        int i = n6;
                        while (i != n6 + n5) {
                            if ((b3 & 0xFF) == k[i]) {
                                final int n9 = n10 = k[i + n5];
                                n11 = c;
                                f = m2;
                                if ((b2 = n8) != c) {
                                    break Label_0442;
                                }
                                final m0 f2 = m2.f;
                                k0.m((Object)f2);
                                final int b4 = f2.b;
                                final byte[] a3 = f2.a;
                                final int c2 = f2.c;
                                a2 = a3;
                                n10 = n9;
                                n11 = c2;
                                f = f2;
                                b2 = b4;
                                if (f2 == g2) {
                                    f = null;
                                    b2 = b4;
                                    n11 = c2;
                                    n10 = n9;
                                    a2 = a3;
                                }
                                break Label_0442;
                            }
                            else {
                                ++i;
                            }
                        }
                        return n3;
                    }
                    int n12 = n6;
                    int n14;
                    int b7;
                    int c3;
                    while (true) {
                        final int n13 = b2 + 1;
                        final byte b5 = a2[b2];
                        n14 = n12 + 1;
                        if ((b5 & 0xFF) != k[n12]) {
                            return n3;
                        }
                        final boolean b6 = n14 == n6 + n5 * -1;
                        if (n13 == c) {
                            k0.m((Object)m2);
                            f = m2.f;
                            k0.m((Object)f);
                            b7 = f.b;
                            a2 = f.a;
                            c3 = f.c;
                            if (f == g2) {
                                if (!b6) {
                                    break Label_0219;
                                }
                                f = null;
                            }
                        }
                        else {
                            c3 = c;
                            b7 = n13;
                            f = m2;
                        }
                        if (b6) {
                            break;
                        }
                        final int n15 = c3;
                        b2 = b7;
                        c = n15;
                        m2 = f;
                        n12 = n14;
                    }
                    n10 = k[n14];
                    n11 = c3;
                    b2 = b7;
                }
                if (n10 >= 0) {
                    return n10;
                }
                final int n16 = -n10;
                c = n11;
                n2 = n16;
                m2 = f;
            }
            if (b) {
                return -2;
            }
            return n3;
        }
        if (!b) {
            n = -1;
        }
        return n;
    }
    
    public static final long l(@e final m m, @e final p p3, long lng) {
        k0.p((Object)m, "$this$commonIndexOfElement");
        k0.p((Object)p3, "targetBytes");
        long n = 0L;
        if (lng < 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("fromIndex < 0: ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        final m0 g = m.G;
        if (g != null) {
            m0 m2 = g;
            if (m.h0() - lng < lng) {
                long h0;
                m0 m3;
                for (h0 = m.h0(), m3 = g; h0 > lng; h0 -= m3.c - m3.b) {
                    m3 = m3.g;
                    k0.m((Object)m3);
                }
                if (p3.size() == 2) {
                    final byte u = p3.u(0);
                    final byte u2 = p3.u(1);
                    while (h0 < m.h0()) {
                        final byte[] a = m3.a;
                        for (int i = (int)(m3.b + lng - h0); i < m3.c; ++i) {
                            final byte b = a[i];
                            lng = h0;
                            m0 m4 = m3;
                            int j = i;
                            if (b == u) {
                                return j - m4.b + lng;
                            }
                            if (b == u2) {
                                lng = h0;
                                m4 = m3;
                                j = i;
                                return j - m4.b + lng;
                            }
                        }
                        h0 += m3.c - m3.b;
                        m3 = m3.f;
                        k0.m((Object)m3);
                        lng = h0;
                    }
                }
                else {
                    final byte[] a2 = p3.a0();
                    long n2 = lng;
                    m0 m4 = m3;
                    lng = h0;
                    while (lng < m.h0()) {
                        final byte[] a3 = m4.a;
                        for (int j = (int)(m4.b + n2 - lng); j < m4.c; ++j) {
                            final byte b2 = a3[j];
                            for (int length = a2.length, k = 0; k < length; ++k) {
                                if (b2 == a2[k]) {
                                    return j - m4.b + lng;
                                }
                            }
                        }
                        lng += m4.c - m4.b;
                        m4 = m4.f;
                        k0.m((Object)m4);
                        n2 = lng;
                    }
                }
                return -1L;
            }
            while (true) {
                final long n3 = m2.c - m2.b + n;
                if (n3 > lng) {
                    break;
                }
                m2 = m2.f;
                k0.m((Object)m2);
                n = n3;
            }
            if (p3.size() == 2) {
                final byte u3 = p3.u(0);
                final byte u4 = p3.u(1);
                while (n < m.h0()) {
                    final byte[] a4 = m2.a;
                    for (int l = (int)(m2.b + lng - n); l < m2.c; ++l) {
                        final byte b3 = a4[l];
                        lng = n;
                        m0 m4 = m2;
                        int j = l;
                        if (b3 == u3) {
                            return j - m4.b + lng;
                        }
                        if (b3 == u4) {
                            lng = n;
                            m4 = m2;
                            j = l;
                            return j - m4.b + lng;
                        }
                    }
                    n += m2.c - m2.b;
                    m2 = m2.f;
                    k0.m((Object)m2);
                    lng = n;
                }
            }
            else {
                final byte[] a5 = p3.a0();
                long n4 = lng;
                m0 m4 = m2;
                lng = n;
                while (lng < m.h0()) {
                    final byte[] a6 = m4.a;
                    for (int j = (int)(m4.b + n4 - lng); j < m4.c; ++j) {
                        final byte b4 = a6[j];
                        for (int length2 = a5.length, n5 = 0; n5 < length2; ++n5) {
                            if (b4 == a5[n5]) {
                                return j - m4.b + lng;
                            }
                        }
                    }
                    lng += m4.c - m4.b;
                    m4 = m4.f;
                    k0.m((Object)m4);
                    n4 = lng;
                }
            }
            return -1L;
        }
        return -1L;
    }
    
    public static /* synthetic */ int l0(final m m, final g0 g0, boolean b, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            b = false;
        }
        return k0(m, g0, b);
    }
    
    public static final int m(@e final m.a a) {
        k0.p((Object)a, "$this$commonNext");
        final long j = a.J;
        final m g = a.G;
        k0.m((Object)g);
        if (j != g.h0()) {
            final long i = a.J;
            long n;
            if (i == -1L) {
                n = 0L;
            }
            else {
                n = i + (a.M - a.L);
            }
            return a.e(n);
        }
        throw new IllegalStateException("no more bytes".toString());
    }
    
    public static final boolean n(@e final m m, final long n, @e final p p5, final int n2, final int n3) {
        k0.p((Object)m, "$this$commonRangeEquals");
        k0.p((Object)p5, "bytes");
        if (n >= 0L && n2 >= 0 && n3 >= 0 && m.h0() - n >= n3 && p5.size() - n2 >= n3) {
            for (int i = 0; i < n3; ++i) {
                if (m.F(i + n) != p5.u(n2 + i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static final int o(@e final m m, @e final byte[] array) {
        k0.p((Object)m, "$this$commonRead");
        k0.p((Object)array, "sink");
        return m.read(array, 0, array.length);
    }
    
    public static final int p(@e final m m, @e final byte[] array, final int n, int b) {
        k0.p((Object)m, "$this$commonRead");
        k0.p((Object)array, "sink");
        j.e(array.length, n, b);
        final m0 g = m.G;
        if (g != null) {
            final int min = Math.min(b, g.c - g.b);
            final byte[] a = g.a;
            b = g.b;
            kotlin.collections.m.W0(a, array, n, b, b + min);
            g.b += min;
            m.d0(m.h0() - min);
            if (g.b == g.c) {
                m.G = g.b();
                n0.d(g);
            }
            return min;
        }
        return -1;
    }
    
    public static final long q(@e final m m, @e final m i, final long lng) {
        k0.p((Object)m, "$this$commonRead");
        k0.p((Object)i, "sink");
        if (lng < 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (m.h0() == 0L) {
            return -1L;
        }
        long h0 = lng;
        if (lng > m.h0()) {
            h0 = m.h0();
        }
        i.t3(m, h0);
        return h0;
    }
    
    public static final long r(@e final m m, @e final p0 p2) {
        k0.p((Object)m, "$this$commonReadAll");
        k0.p((Object)p2, "sink");
        final long h0 = m.h0();
        if (h0 > 0L) {
            p2.t3(m, h0);
        }
        return h0;
    }
    
    @e
    public static final m.a s(@e final m g, @e final m.a a) {
        k0.p((Object)g, "$this$commonReadAndWriteUnsafe");
        k0.p((Object)a, "unsafeCursor");
        if (a.G == null) {
            a.G = g;
            a.H = true;
            return a;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }
    
    public static final byte t(@e final m m) {
        k0.p((Object)m, "$this$commonReadByte");
        if (m.h0() != 0L) {
            final m0 g = m.G;
            k0.m((Object)g);
            final int b = g.b;
            final int c = g.c;
            final byte[] a = g.a;
            final int b2 = b + 1;
            final byte b3 = a[b];
            m.d0(m.h0() - 1L);
            if (b2 == c) {
                m.G = g.b();
                n0.d(g);
            }
            else {
                g.b = b2;
            }
            return b3;
        }
        throw new EOFException();
    }
    
    @e
    public static final byte[] u(@e final m m) {
        k0.p((Object)m, "$this$commonReadByteArray");
        return m.v4(m.h0());
    }
    
    @e
    public static final byte[] v(@e final m m, final long lng) {
        k0.p((Object)m, "$this$commonReadByteArray");
        if (lng < 0L || lng > Integer.MAX_VALUE) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount: ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (m.h0() >= lng) {
            final byte[] array = new byte[(int)lng];
            m.readFully(array);
            return array;
        }
        throw new EOFException();
    }
    
    @e
    public static final p w(@e final m m) {
        k0.p((Object)m, "$this$commonReadByteString");
        return m.E0(m.h0());
    }
    
    @e
    public static final p x(@e final m m, final long lng) {
        k0.p((Object)m, "$this$commonReadByteString");
        if (lng < 0L || lng > Integer.MAX_VALUE) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount: ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (m.h0() < lng) {
            throw new EOFException();
        }
        if (lng >= 4096) {
            final p j0 = m.j0((int)lng);
            m.skip(lng);
            return j0;
        }
        return new p(m.v4(lng));
    }
    
    public static final long y(@e final m m) {
        k0.p((Object)m, "$this$commonReadDecimalLong");
        final long h0 = m.h0();
        long n = 0L;
        if (h0 != 0L) {
            long n2 = -7L;
            int n3 = 0;
            int n4 = 0;
            boolean b = false;
            int n5;
            int n6;
            long n7;
            do {
                final m0 g = m.G;
                k0.m((Object)g);
                final byte[] a = g.a;
                int i = g.b;
                final int c = g.c;
                n5 = n4;
                n6 = n3;
                n7 = n;
                long n8 = n2;
                while (i < c) {
                    final byte b2 = a[i];
                    final byte b3 = 48;
                    if (b2 >= b3 && b2 <= (byte)57) {
                        final int n9 = b3 - b2;
                        final long n10 = lcmp(n7, -922337203685477580L);
                        if (n10 < 0 || (n10 == 0 && n9 < n8)) {
                            final m g2 = new m().H0(n7).G0(b2);
                            if (n5 == 0) {
                                g2.readByte();
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Number too large: ");
                            sb.append(g2.y4());
                            throw new NumberFormatException(sb.toString());
                        }
                        n7 = n7 * 10L + n9;
                    }
                    else if (b2 == (byte)45 && n6 == 0) {
                        --n8;
                        n5 = 1;
                    }
                    else {
                        if (n6 != 0) {
                            b = true;
                            break;
                        }
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected leading [0-9] or '-' character but was 0x");
                        sb2.append(j.o(b2));
                        throw new NumberFormatException(sb2.toString());
                    }
                    ++i;
                    ++n6;
                }
                if (i == c) {
                    m.G = g.b();
                    n0.d(g);
                }
                else {
                    g.b = i;
                }
                if (b) {
                    break;
                }
                n2 = n8;
                n = n7;
                n3 = n6;
                n4 = n5;
            } while (m.G != null);
            m.d0(m.h0() - n6);
            if (n5 == 0) {
                n7 = -n7;
            }
            return n7;
        }
        throw new EOFException();
    }
    
    public static final void z(@e final m m, @e final m i, final long n) {
        k0.p((Object)m, "$this$commonReadFully");
        k0.p((Object)i, "sink");
        if (m.h0() >= n) {
            i.t3(m, n);
            return;
        }
        i.t3(m, m.h0());
        throw new EOFException();
    }
}
