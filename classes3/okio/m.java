// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.Objects;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import m6.h;
import okio.internal.a;
import m6.g;
import java.nio.charset.Charset;
import org.jetbrains.annotations.e;
import java.security.MessageDigest;
import java.io.OutputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import kotlin.jvm.internal.k0;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import org.jetbrains.annotations.f;
import m6.d;
import kotlin.Metadata;
import java.nio.channels.ByteChannel;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u009c\u0001B\t¢\u0006\u0006\b©\u0001\u0010ª\u0001J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0000H\u0016J\b\u0010\u0017\u001a\u00020\u0000H\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u0001H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J$\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007J \u0010 \u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u0007J\u001a\u0010\"\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010$\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010%\u001a\u00020\u0007J\b\u0010'\u001a\u00020&H\u0016J\u0018\u0010)\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b)\u0010*J\b\u0010,\u001a\u00020+H\u0016J\b\u0010.\u001a\u00020-H\u0016J\b\u0010/\u001a\u00020\u0007H\u0016J\b\u00100\u001a\u00020+H\u0016J\b\u00101\u001a\u00020-H\u0016J\b\u00102\u001a\u00020\u0007H\u0016J\b\u00103\u001a\u00020\u0007H\u0016J\b\u00104\u001a\u00020\u0007H\u0016J\b\u00105\u001a\u00020\u000fH\u0016J\u0010\u00106\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u00109\u001a\u00020-2\u0006\u00108\u001a\u000207H\u0016J\u0018\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010=\u001a\u00020\u00072\u0006\u0010:\u001a\u00020<H\u0016J\b\u0010>\u001a\u00020\rH\u0016J\u0010\u0010?\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010B\u001a\u00020\r2\u0006\u0010A\u001a\u00020@H\u0016J\u0018\u0010C\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010A\u001a\u00020@H\u0016J\n\u0010D\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010E\u001a\u00020\rH\u0016J\u0010\u0010G\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u0007H\u0016J\b\u0010H\u001a\u00020-H\u0016J\b\u0010J\u001a\u00020IH\u0016J\u0010\u0010K\u001a\u00020I2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010L\u001a\u00020-2\u0006\u0010:\u001a\u00020IH\u0016J\u0010\u0010M\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020IH\u0016J \u0010L\u001a\u00020-2\u0006\u0010:\u001a\u00020I2\u0006\u0010\u001e\u001a\u00020-2\u0006\u0010\b\u001a\u00020-H\u0016J\u0010\u0010L\u001a\u00020-2\u0006\u0010:\u001a\u00020NH\u0016J\u0006\u0010O\u001a\u00020\u000bJ\u0010\u0010P\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010R\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u000fH\u0016J \u0010S\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020-2\u0006\u0010\b\u001a\u00020-H\u0016J\u0010\u0010U\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\rH\u0016J \u0010X\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\r2\u0006\u0010V\u001a\u00020-2\u0006\u0010W\u001a\u00020-H\u0016J\u0010\u0010Z\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020-H\u0016J\u0018\u0010[\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\r2\u0006\u0010A\u001a\u00020@H\u0016J(\u0010\\\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\r2\u0006\u0010V\u001a\u00020-2\u0006\u0010W\u001a\u00020-2\u0006\u0010A\u001a\u00020@H\u0016J\u0010\u0010^\u001a\u00020\u00002\u0006\u0010]\u001a\u00020IH\u0016J \u0010_\u001a\u00020\u00002\u0006\u0010]\u001a\u00020I2\u0006\u0010\u001e\u001a\u00020-2\u0006\u0010\b\u001a\u00020-H\u0016J\u0010\u0010`\u001a\u00020-2\u0006\u0010]\u001a\u00020NH\u0016J\u0010\u0010b\u001a\u00020\u00072\u0006\u0010]\u001a\u00020aH\u0016J\u0018\u0010c\u001a\u00020\u00002\u0006\u0010]\u001a\u00020a2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010e\u001a\u00020\u00002\u0006\u0010d\u001a\u00020-H\u0016J\u0010\u0010f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020-H\u0016J\u0010\u0010g\u001a\u00020\u00002\u0006\u0010 \u001a\u00020-H\u0016J\u0010\u0010i\u001a\u00020\u00002\u0006\u0010h\u001a\u00020-H\u0016J\u0010\u0010j\u001a\u00020\u00002\u0006\u0010h\u001a\u00020-H\u0016J\u0010\u0010k\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\u0010\u0010l\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\u0010\u0010m\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\u0010\u0010n\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\u0017\u0010q\u001a\u00020p2\u0006\u0010o\u001a\u00020-H\u0000¢\u0006\u0004\bq\u0010rJ\u0018\u0010s\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010L\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010t\u001a\u00020\u00072\u0006\u0010d\u001a\u00020&H\u0016J\u0018\u0010v\u001a\u00020\u00072\u0006\u0010d\u001a\u00020&2\u0006\u0010u\u001a\u00020\u0007H\u0016J \u0010x\u001a\u00020\u00072\u0006\u0010d\u001a\u00020&2\u0006\u0010u\u001a\u00020\u00072\u0006\u0010w\u001a\u00020\u0007H\u0016J\u0010\u0010z\u001a\u00020\u00072\u0006\u0010y\u001a\u00020\u000fH\u0016J\u0018\u0010{\u001a\u00020\u00072\u0006\u0010y\u001a\u00020\u000f2\u0006\u0010u\u001a\u00020\u0007H\u0016J\u0010\u0010}\u001a\u00020\u00072\u0006\u0010|\u001a\u00020\u000fH\u0016J\u0018\u0010~\u001a\u00020\u00072\u0006\u0010|\u001a\u00020\u000f2\u0006\u0010u\u001a\u00020\u0007H\u0016J\u0018\u0010\u007f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010y\u001a\u00020\u000fH\u0016J*\u0010\u0081\u0001\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010y\u001a\u00020\u000f2\u0007\u0010\u0080\u0001\u001a\u00020-2\u0006\u0010\b\u001a\u00020-H\u0016J\t\u0010\u0082\u0001\u001a\u00020\u000bH\u0016J\t\u0010\u0083\u0001\u001a\u00020\tH\u0016J\t\u0010\u0084\u0001\u001a\u00020\u000bH\u0016J\n\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0016J\u0007\u0010\u0087\u0001\u001a\u00020\u000fJ\u0007\u0010\u0088\u0001\u001a\u00020\u000fJ\u0007\u0010\u0089\u0001\u001a\u00020\u000fJ\u0007\u0010\u008a\u0001\u001a\u00020\u000fJ\u000f\u0010\u008b\u0001\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u000f\u0010\u008c\u0001\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u000f\u0010\u008d\u0001\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u0016\u0010\u0090\u0001\u001a\u00020\t2\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0096\u0002J\t\u0010\u0091\u0001\u001a\u00020-H\u0016J\t\u0010\u0092\u0001\u001a\u00020\rH\u0016J\u0007\u0010\u0093\u0001\u001a\u00020\u0000J\t\u0010\u0094\u0001\u001a\u00020\u0000H\u0016J\u0007\u0010\u0095\u0001\u001a\u00020\u000fJ\u000f\u0010\u0096\u0001\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020-J\u0016\u0010\u0099\u0001\u001a\u00030\u0097\u00012\n\b\u0002\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0007J\u0016\u0010\u009a\u0001\u001a\u00030\u0097\u00012\n\b\u0002\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0007J\u001a\u0010\u009c\u0001\u001a\u00020&2\u0007\u0010\u009b\u0001\u001a\u00020\u0007H\u0007¢\u0006\u0005\b\u009c\u0001\u0010*J\u0010\u0010d\u001a\u00020\u0007H\u0007¢\u0006\u0005\bd\u0010\u009d\u0001R\u0019\u0010 \u0001\u001a\u00020\u00008V@\u0016X\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001b\u0010£\u0001\u001a\u0004\u0018\u00010p8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R1\u0010¨\u0001\u001a\u00020\u00072\u0007\u0010¤\u0001\u001a\u00020\u00078G@@X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010\u008b\u0001\u001a\u0006\b¥\u0001\u0010\u009d\u0001\"\u0006\b¦\u0001\u0010§\u0001¨\u0006«\u0001" }, d2 = { "Lokio/m;", "Lokio/o;", "Lokio/n;", "", "Ljava/nio/channels/ByteChannel;", "Ljava/io/InputStream;", "input", "", "byteCount", "", "forever", "Lkotlin/j2;", "X", "", "algorithm", "Lokio/p;", "y", "key", "H", "m", "Ljava/io/OutputStream;", "G5", "D", "C", "D1", "B5", "v", "peek", "N5", "out", "offset", "q", "s", "r", "k1", "V", "W", "f", "", "readByte", "pos", "F", "(J)B", "", "readShort", "", "readInt", "readLong", "P4", "i4", "Z4", "b2", "L5", "D3", "E0", "Lokio/g0;", "options", "P5", "sink", "S1", "Lokio/p0;", "e5", "y4", "t0", "Ljava/nio/charset/Charset;", "charset", "b3", "I4", "Z1", "e4", "limit", "g2", "q3", "", "s1", "v4", "read", "readFully", "Ljava/nio/ByteBuffer;", "c", "skip", "byteString", "p0", "s0", "string", "p1", "beginIndex", "endIndex", "t1", "codePoint", "v1", "e1", "d1", "source", "y0", "D0", "write", "Lokio/r0;", "z3", "w0", "b", "G0", "Z0", "a1", "i", "M0", "N0", "Q0", "W0", "H0", "L0", "minimumCapacity", "Lokio/m0;", "m0", "(I)Lokio/m0;", "t3", "H5", "fromIndex", "R1", "toIndex", "V1", "bytes", "y1", "v0", "targetBytes", "Y1", "y5", "Y2", "bytesOffset", "j4", "flush", "isOpen", "close", "Lokio/t0;", "timeout", "Q", "e0", "f0", "g0", "J", "L", "N", "", "other", "equals", "hashCode", "toString", "g", "d", "i0", "j0", "Lokio/m$a;", "unsafeCursor", "Z", "S", "index", "a", "()J", "z", "()Lokio/m;", "buffer", "G", "Lokio/m0;", "head", "<set-?>", "h0", "d0", "(J)V", "size", "<init>", "()V", "okio" }, k = 1, mv = { 1, 4, 1 })
public final class m implements o, n, Cloneable, ByteChannel
{
    @d
    @f
    public m0 G;
    private long H;
    
    private final p H(final String s, final p p2) {
        try {
            final Mac instance = Mac.getInstance(s);
            instance.init(new SecretKeySpec(p2.a0(), s));
            final m0 g = this.G;
            if (g != null) {
                final byte[] a = g.a;
                final int b = g.b;
                instance.update(a, b, g.c - b);
                m0 m0 = g.f;
                while (true) {
                    k0.m((Object)m0);
                    if (m0 == g) {
                        break;
                    }
                    final byte[] a2 = m0.a;
                    final int b2 = m0.b;
                    instance.update(a2, b2, m0.c - b2);
                    m0 = m0.f;
                }
            }
            final byte[] doFinal = instance.doFinal();
            k0.o((Object)doFinal, "mac.doFinal()");
            return new p(doFinal);
        }
        catch (InvalidKeyException cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    public static /* synthetic */ a T(final m m, a a, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            a = new a();
        }
        return m.S(a);
    }
    
    private final void X(final InputStream inputStream, long a, final boolean b) throws IOException {
        while (a > 0L || b) {
            final m0 m0 = this.m0(1);
            final int read = inputStream.read(m0.a, m0.c, (int)Math.min(a, 8192 - m0.c));
            if (read == -1) {
                if (m0.b == m0.c) {
                    this.G = m0.b();
                    n0.d(m0);
                }
                if (b) {
                    return;
                }
                throw new EOFException();
            }
            else {
                m0.c += read;
                final long h = this.H;
                final long n = read;
                this.H = h + n;
                a -= n;
            }
        }
    }
    
    public static /* synthetic */ a a0(final m m, a a, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            a = new a();
        }
        return m.Z(a);
    }
    
    public static /* synthetic */ m o1(final m m, final OutputStream outputStream, long h, final int n, final Object o) throws IOException {
        if ((n & 0x2) != 0x0) {
            h = m.H;
        }
        return m.k1(outputStream, h);
    }
    
    public static /* synthetic */ m t(final m m, final OutputStream outputStream, long n, long n2, final int n3, final Object o) throws IOException {
        if ((n3 & 0x2) != 0x0) {
            n = 0L;
        }
        if ((n3 & 0x4) != 0x0) {
            n2 = m.H - n;
        }
        return m.q(outputStream, n, n2);
    }
    
    private final p y(final String algorithm) {
        final MessageDigest instance = MessageDigest.getInstance(algorithm);
        final m0 g = this.G;
        if (g != null) {
            final byte[] a = g.a;
            final int b = g.b;
            instance.update(a, b, g.c - b);
            m0 m0 = g.f;
            while (true) {
                k0.m((Object)m0);
                if (m0 == g) {
                    break;
                }
                final byte[] a2 = m0.a;
                final int b2 = m0.b;
                instance.update(a2, b2, m0.c - b2);
                m0 = m0.f;
            }
        }
        final byte[] digest = instance.digest();
        k0.o((Object)digest, "messageDigest.digest()");
        return new p(digest);
    }
    
    @Override
    public void B5(final long n) throws EOFException {
        if (this.H >= n) {
            return;
        }
        throw new EOFException();
    }
    
    @e
    public m C() {
        return this;
    }
    
    @e
    public m D() {
        return this;
    }
    
    @e
    public m D0(@e final byte[] array, int i, int n) {
        k0.p((Object)array, "source");
        final long n2 = array.length;
        final long n3 = i;
        final long n4 = n;
        j.e(n2, n3, n4);
        for (int n5 = n + i; i < n5; i = n) {
            final m0 m0 = this.m0(1);
            final int min = Math.min(n5 - i, 8192 - m0.c);
            final byte[] a = m0.a;
            final int c = m0.c;
            n = i + min;
            kotlin.collections.m.W0(array, a, c, i, n);
            m0.c += min;
        }
        this.d0(this.h0() + n4);
        return this;
    }
    
    @Override
    public boolean D1() {
        return this.H == 0L;
    }
    
    @e
    @Override
    public p D3() {
        return this.E0(this.h0());
    }
    
    @e
    @Override
    public p E0(final long lng) throws EOFException {
        if (lng < 0L || lng > Integer.MAX_VALUE) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount: ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (this.h0() >= lng) {
            p j0;
            if (lng >= 4096) {
                j0 = this.j0((int)lng);
                this.skip(lng);
            }
            else {
                j0 = new p(this.v4(lng));
            }
            return j0;
        }
        throw new EOFException();
    }
    
    @g(name = "getByte")
    public final byte F(final long n) {
        j.e(this.h0(), n, 1L);
        m0 m0 = this.G;
        if (m0 != null) {
            byte b;
            if (this.h0() - n < n) {
                long h0;
                for (h0 = this.h0(); h0 > n; h0 -= m0.c - m0.b) {
                    m0 = m0.g;
                    k0.m((Object)m0);
                }
                k0.m((Object)m0);
                b = m0.a[(int)(m0.b + n - h0)];
            }
            else {
                long n2 = 0L;
                while (true) {
                    final long n3 = m0.c - m0.b + n2;
                    if (n3 > n) {
                        break;
                    }
                    m0 = m0.f;
                    k0.m((Object)m0);
                    n2 = n3;
                }
                k0.m((Object)m0);
                b = m0.a[(int)(m0.b + n - n2)];
            }
            return b;
        }
        k0.m((Object)null);
        throw null;
    }
    
    @e
    public m G0(final int n) {
        final m0 m0 = this.m0(1);
        m0.a[m0.c++] = (byte)n;
        this.d0(this.h0() + 1L);
        return this;
    }
    
    @e
    @Override
    public OutputStream G5() {
        return new OutputStream() {
            final /* synthetic */ m G;
            
            @Override
            public void close() {
            }
            
            @Override
            public void flush() {
            }
            
            @e
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.G);
                sb.append(".outputStream()");
                return sb.toString();
            }
            
            @Override
            public void write(final int n) {
                this.G.G0(n);
            }
            
            @Override
            public void write(@e final byte[] array, final int n, final int n2) {
                k0.p((Object)array, "data");
                this.G.D0(array, n, n2);
            }
        };
    }
    
    @e
    public m H0(long n) {
        final long n2 = lcmp(n, 0L);
        m m;
        if (n2 == 0) {
            m = this.G0(48);
        }
        else {
            boolean b = false;
            int n3 = 1;
            long n4 = n;
            if (n2 < 0) {
                n4 = -n;
                if (n4 < 0L) {
                    m = this.p1("-9223372036854775808");
                    return m;
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
            final m0 m2 = this.m0(n5);
            final byte[] a = m2.a;
            int n6 = m2.c + n5;
            while (n4 != 0L) {
                n = 10;
                final int n7 = (int)(n4 % n);
                --n6;
                a[n6] = okio.internal.a.g0()[n7];
                n4 /= n;
            }
            if (b) {
                a[n6 - 1] = 45;
            }
            m2.c += n5;
            this.d0(this.h0() + n5);
            m = this;
        }
        return m;
    }
    
    @Override
    public long H5(final byte b) {
        return this.V1(b, 0L, Long.MAX_VALUE);
    }
    
    @e
    @Override
    public String I4(final long lng, @e final Charset charset) throws EOFException {
        k0.p((Object)charset, "charset");
        final long n = lcmp(lng, 0L);
        if (n < 0 || lng > Integer.MAX_VALUE) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount: ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (this.H < lng) {
            throw new EOFException();
        }
        if (n == 0) {
            return "";
        }
        final m0 g = this.G;
        k0.m((Object)g);
        final int b = g.b;
        if (b + lng > g.c) {
            return new String(this.v4(lng), charset);
        }
        final byte[] a = g.a;
        final int length = (int)lng;
        final String s = new String(a, b, length, charset);
        final int b2 = g.b + length;
        g.b = b2;
        this.H -= lng;
        if (b2 == g.c) {
            this.G = g.b();
            n0.d(g);
        }
        return s;
    }
    
    @e
    public final p J(@e final p p) {
        k0.p((Object)p, "key");
        return this.H("HmacSHA1", p);
    }
    
    @e
    public final p L(@e final p p) {
        k0.p((Object)p, "key");
        return this.H("HmacSHA256", p);
    }
    
    @e
    public m L0(long n) {
        m g0;
        if (n == 0L) {
            g0 = this.G0(48);
        }
        else {
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
            final m0 m0 = this.m0(n13);
            final byte[] a = m0.a;
            for (int c = m0.c, i = c + n13 - 1; i >= c; --i) {
                a[i] = okio.internal.a.g0()[(int)(0xFL & n)];
                n >>>= 4;
            }
            m0.c += n13;
            this.d0(this.h0() + n13);
            g0 = this;
        }
        return g0;
    }
    
    @Override
    public long L5() throws EOFException {
        if (this.h0() != 0L) {
            int n = 0;
            long n2 = 0L;
            int n3 = 0;
            long n4;
            int n5;
            do {
                final m0 g = this.G;
                k0.m((Object)g);
                final byte[] a = g.a;
                int b = g.b;
                final int c = g.c;
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
                        final m g2 = new m().L0(n4).G0(b2);
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Number too large: ");
                        sb2.append(g2.y4());
                        throw new NumberFormatException(sb2.toString());
                    }
                    n4 = (n4 << 4 | (long)n7);
                    ++b;
                    ++n5;
                }
                if (b == c) {
                    this.G = g.b();
                    n0.d(g);
                }
                else {
                    g.b = b;
                }
                if (n6 != 0) {
                    break;
                }
                n = n5;
                n3 = n6;
                n2 = n4;
            } while (this.G != null);
            this.d0(this.h0() - n5);
            return n4;
        }
        throw new EOFException();
    }
    
    @e
    public m M0(final int n) {
        final m0 m0 = this.m0(4);
        final byte[] a = m0.a;
        final int c = m0.c;
        final int n2 = c + 1;
        a[c] = (byte)(n >>> 24 & 0xFF);
        final int n3 = n2 + 1;
        a[n2] = (byte)(n >>> 16 & 0xFF);
        final int n4 = n3 + 1;
        a[n3] = (byte)(n >>> 8 & 0xFF);
        a[n4] = (byte)(n & 0xFF);
        m0.c = n4 + 1;
        this.d0(this.h0() + 4L);
        return this;
    }
    
    @e
    public final p N(@e final p p) {
        k0.p((Object)p, "key");
        return this.H("HmacSHA512", p);
    }
    
    @e
    public m N0(final int n) {
        return this.M0(j.i(n));
    }
    
    @e
    @Override
    public InputStream N5() {
        return new InputStream() {
            final /* synthetic */ m G;
            
            @Override
            public int available() {
                return (int)Math.min(this.G.h0(), Integer.MAX_VALUE);
            }
            
            @Override
            public void close() {
            }
            
            @Override
            public int read() {
                int n;
                if (this.G.h0() > 0L) {
                    n = (this.G.readByte() & 0xFF);
                }
                else {
                    n = -1;
                }
                return n;
            }
            
            @Override
            public int read(@e final byte[] array, final int n, final int n2) {
                k0.p((Object)array, "sink");
                return this.G.read(array, n, n2);
            }
            
            @e
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.G);
                sb.append(".inputStream()");
                return sb.toString();
            }
        };
    }
    
    @Override
    public short P4() throws EOFException {
        return j.k(this.readShort());
    }
    
    @Override
    public int P5(@e final g0 g0) {
        k0.p((Object)g0, "options");
        int l0 = okio.internal.a.l0(this, g0, false, 2, null);
        if (l0 == -1) {
            l0 = -1;
        }
        else {
            this.skip(g0.i()[l0].size());
        }
        return l0;
    }
    
    @e
    public final p Q() {
        return this.y("MD5");
    }
    
    @e
    public m Q0(final long n) {
        final m0 m0 = this.m0(8);
        final byte[] a = m0.a;
        final int c = m0.c;
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
        m0.c = n8 + 1;
        this.d0(this.h0() + 8L);
        return this;
    }
    
    @h
    @e
    public final a R() {
        return T(this, null, 1, null);
    }
    
    @Override
    public long R1(final byte b, final long n) {
        return this.V1(b, n, Long.MAX_VALUE);
    }
    
    @h
    @e
    public final a S(@e final a a) {
        k0.p((Object)a, "unsafeCursor");
        return a.s(this, a);
    }
    
    @Override
    public void S1(@e final m m, final long n) throws EOFException {
        k0.p((Object)m, "sink");
        if (this.h0() >= n) {
            m.t3(this, n);
            return;
        }
        m.t3(this, this.h0());
        throw new EOFException();
    }
    
    @e
    public final m V(@e final InputStream inputStream) throws IOException {
        k0.p((Object)inputStream, "input");
        this.X(inputStream, Long.MAX_VALUE, true);
        return this;
    }
    
    @Override
    public long V1(final byte b, long lng, long lng2) {
        final long n = 0L;
        boolean b2 = false;
        Label_0028: {
            if (0L <= lng) {
                if (lng2 >= lng) {
                    b2 = true;
                    break Label_0028;
                }
            }
            b2 = false;
        }
        if (b2) {
            long h0 = lng2;
            if (lng2 > this.h0()) {
                h0 = this.h0();
            }
            final long n2 = -1L;
            long n3;
            if (lng == h0) {
                n3 = n2;
            }
            else {
                m0 m0 = this.G;
                n3 = n2;
                if (m0 != null) {
                    lng2 = n;
                    m0 m2 = m0;
                    int i = 0;
                    Label_0239: {
                        if (this.h0() - lng < lng) {
                            long h2 = this.h0();
                            long n4;
                            while (true) {
                                lng2 = h2;
                                m2 = m0;
                                n4 = lng;
                                if (h2 <= lng) {
                                    break;
                                }
                                m0 = m0.g;
                                k0.m((Object)m0);
                                h2 -= m0.c - m0.b;
                            }
                            while (true) {
                                n3 = n2;
                                if (lng2 >= h0) {
                                    return n3;
                                }
                                final byte[] a = m2.a;
                                for (final int n5 = (int)Math.min(m2.c, m2.b + h0 - lng2), i = (int)(m2.b + n4 - lng2); i < n5; ++i) {
                                    if (a[i] == b) {
                                        lng = lng2;
                                        break Label_0239;
                                    }
                                }
                                lng2 += m2.c - m2.b;
                                m2 = m2.f;
                                k0.m((Object)m2);
                                n4 = lng2;
                            }
                        }
                        else {
                            while (true) {
                                final long n6 = m2.c - m2.b + lng2;
                                if (n6 > lng) {
                                    break;
                                }
                                m2 = m2.f;
                                k0.m((Object)m2);
                                lng2 = n6;
                            }
                            long n7 = lng;
                            lng = lng2;
                            while (true) {
                                n3 = n2;
                                if (lng >= h0) {
                                    return n3;
                                }
                                final byte[] a2 = m2.a;
                                for (final int n8 = (int)Math.min(m2.c, m2.b + h0 - lng), i = (int)(m2.b + n7 - lng); i < n8; ++i) {
                                    if (a2[i] == b) {
                                        break Label_0239;
                                    }
                                }
                                lng += m2.c - m2.b;
                                m2 = m2.f;
                                k0.m((Object)m2);
                                n7 = lng;
                            }
                        }
                    }
                    n3 = i - m2.b + lng;
                }
            }
            return n3;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("size=");
        sb.append(this.h0());
        sb.append(" fromIndex=");
        sb.append(lng);
        sb.append(" toIndex=");
        sb.append(lng2);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    @e
    public final m W(@e final InputStream inputStream, final long lng) throws IOException {
        k0.p((Object)inputStream, "input");
        if (lng >= 0L) {
            this.X(inputStream, lng, false);
            return this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("byteCount < 0: ");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    @e
    public m W0(final long n) {
        return this.Q0(j.j(n));
    }
    
    @h
    @e
    public final a Y() {
        return a0(this, null, 1, null);
    }
    
    @Override
    public long Y1(@e final p p) {
        k0.p((Object)p, "targetBytes");
        return this.y5(p, 0L);
    }
    
    @Override
    public boolean Y2(final long n, @e final p p2) {
        k0.p((Object)p2, "bytes");
        return this.j4(n, p2, 0, p2.size());
    }
    
    @h
    @e
    public final a Z(@e final a a) {
        k0.p((Object)a, "unsafeCursor");
        return a.F(this, a);
    }
    
    @e
    public m Z0(final int n) {
        final m0 m0 = this.m0(2);
        final byte[] a = m0.a;
        final int c = m0.c;
        final int n2 = c + 1;
        a[c] = (byte)(n >>> 8 & 0xFF);
        a[n2] = (byte)(n & 0xFF);
        m0.c = n2 + 1;
        this.d0(this.h0() + 2L);
        return this;
    }
    
    @f
    @Override
    public String Z1() throws EOFException {
        final long h5 = this.H5((byte)10);
        String s;
        if (h5 != -1L) {
            s = okio.internal.a.i0(this, h5);
        }
        else if (this.h0() != 0L) {
            s = this.t0(this.h0());
        }
        else {
            s = null;
        }
        return s;
    }
    
    @Override
    public long Z4() throws EOFException {
        return j.j(this.readLong());
    }
    
    @i(level = k.H, message = "moved to operator function", replaceWith = @z0(expression = "this[index]", imports = {}))
    @g(name = "-deprecated_getByte")
    public final byte a(final long n) {
        return this.F(n);
    }
    
    @e
    public m a1(final int n) {
        return this.Z0(j.k((short)n));
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "size", imports = {}))
    @g(name = "-deprecated_size")
    public final long b() {
        return this.H;
    }
    
    @Override
    public long b2() throws EOFException {
        final long h0 = this.h0();
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
                final m0 g = this.G;
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
                    this.G = g.b();
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
            } while (this.G != null);
            this.d0(this.h0() - n6);
            if (n5 == 0) {
                n7 = -n7;
            }
            return n7;
        }
        throw new EOFException();
    }
    
    @e
    @Override
    public String b3(@e final Charset charset) {
        k0.p((Object)charset, "charset");
        return this.I4(this.H, charset);
    }
    
    public final void c() {
        this.skip(this.h0());
    }
    
    @Override
    public void close() {
    }
    
    @e
    public m d() {
        return this.g();
    }
    
    public final void d0(final long h) {
        this.H = h;
    }
    
    @e
    public m d1(@e String substring, final int beginIndex, final int endIndex, @e final Charset charset) {
        k0.p((Object)substring, "string");
        k0.p((Object)charset, "charset");
        final int n = 1;
        if (beginIndex < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("beginIndex < 0: ");
            sb.append(beginIndex);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (endIndex < beginIndex) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(endIndex);
            sb2.append(" < ");
            sb2.append(beginIndex);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        int n2;
        if (endIndex <= substring.length()) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("endIndex > string.length: ");
            sb3.append(endIndex);
            sb3.append(" > ");
            sb3.append(substring.length());
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        if (k0.g((Object)charset, (Object)kotlin.text.f.a)) {
            return this.t1(substring, beginIndex, endIndex);
        }
        substring = substring.substring(beginIndex, endIndex);
        k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
        final byte[] bytes = substring.getBytes(charset);
        k0.o((Object)bytes, "(this as java.lang.String).getBytes(charset)");
        return this.D0(bytes, 0, bytes.length);
    }
    
    @e
    public final p e0() {
        return this.y("SHA-1");
    }
    
    @e
    public m e1(@e final String s, @e final Charset charset) {
        k0.p((Object)s, "string");
        k0.p((Object)charset, "charset");
        return this.d1(s, 0, s.length(), charset);
    }
    
    @e
    @Override
    public String e4() throws EOFException {
        return this.g2(Long.MAX_VALUE);
    }
    
    @Override
    public long e5(@e final p0 p) throws IOException {
        k0.p((Object)p, "sink");
        final long h0 = this.h0();
        if (h0 > 0L) {
            p.t3(this, h0);
        }
        return h0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        boolean b = false;
        if (this != o) {
            if (!(o instanceof m)) {
                return b;
            }
            final long h0 = this.h0();
            final m m = (m)o;
            if (h0 != m.h0()) {
                return b;
            }
            if (this.h0() != 0L) {
                m0 g = this.G;
                k0.m((Object)g);
                m0 g2 = m.G;
                k0.m((Object)g2);
                int n = g.b;
                int b2 = g2.b;
                long n3;
                m0 f;
                m0 f2;
                int b3;
                for (long n2 = 0L; n2 < this.h0(); n2 += n3, g2 = f2, g = f, b2 = b3) {
                    long n4;
                    int n5;
                    for (n3 = Math.min(g.c - n, g2.c - b2), n4 = 0L, n5 = n; n4 < n3; ++n4, ++n5, ++b2) {
                        if (g.a[n5] != g2.a[b2]) {
                            return b;
                        }
                    }
                    f = g;
                    if ((n = n5) == g.c) {
                        f = g.f;
                        k0.m((Object)f);
                        n = f.b;
                    }
                    f2 = g2;
                    if ((b3 = b2) == g2.c) {
                        f2 = g2.f;
                        k0.m((Object)f2);
                        b3 = f2.b;
                    }
                }
            }
        }
        b = true;
        return b;
    }
    
    public final long f() {
        final long h0 = this.h0();
        long n = 0L;
        if (h0 != 0L) {
            final m0 g = this.G;
            k0.m((Object)g);
            final m0 g2 = g.g;
            k0.m((Object)g2);
            final int c = g2.c;
            n = h0;
            if (c < 8192) {
                n = h0;
                if (g2.e) {
                    n = h0 - (c - g2.b);
                }
            }
        }
        return n;
    }
    
    @e
    public final p f0() {
        return this.y("SHA-256");
    }
    
    @h
    @e
    public final m f1(@e final OutputStream outputStream) throws IOException {
        return o1(this, outputStream, 0L, 2, null);
    }
    
    @Override
    public void flush() {
    }
    
    @e
    public final m g() {
        final m m = new m();
        if (this.h0() != 0L) {
            final m0 g = this.G;
            k0.m((Object)g);
            final m0 d = g.d();
            m.G = d;
            d.g = d;
            d.f = d;
            for (m0 m2 = g.f; m2 != g; m2 = m2.f) {
                final m0 g2 = d.g;
                k0.m((Object)g2);
                k0.m((Object)m2);
                g2.c(m2.d());
            }
            m.d0(this.h0());
        }
        return m;
    }
    
    @e
    public final p g0() {
        return this.y("SHA-512");
    }
    
    @e
    @Override
    public String g2(final long n) throws EOFException {
        if (n >= 0L) {
            long n2 = Long.MAX_VALUE;
            if (n != Long.MAX_VALUE) {
                n2 = n + 1L;
            }
            final byte b = 10;
            final long v1 = this.V1(b, 0L, n2);
            String s;
            if (v1 != -1L) {
                s = okio.internal.a.i0(this, v1);
            }
            else {
                if (n2 >= this.h0() || this.F(n2 - 1L) != (byte)13 || this.F(n2) != b) {
                    final m m = new m();
                    this.s(m, 0L, Math.min(32, this.h0()));
                    final StringBuilder sb = new StringBuilder();
                    sb.append("\\n not found: limit=");
                    sb.append(Math.min(this.h0(), n));
                    sb.append(" content=");
                    sb.append(m.D3().E());
                    sb.append('\u2026');
                    throw new EOFException(sb.toString());
                }
                s = okio.internal.a.i0(this, n2);
            }
            return s;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("limit < 0: ");
        sb2.append(n);
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    @g(name = "size")
    public final long h0() {
        return this.H;
    }
    
    @Override
    public int hashCode() {
        m0 g = this.G;
        int n2;
        if (g != null) {
            int n = 1;
            m0 f;
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
            } while (f != this.G);
        }
        else {
            n2 = 0;
        }
        return n2;
    }
    
    @e
    public final p i0() {
        if (this.h0() <= Integer.MAX_VALUE) {
            return this.j0((int)this.h0());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("size > Int.MAX_VALUE: ");
        sb.append(this.h0());
        throw new IllegalStateException(sb.toString().toString());
    }
    
    @Override
    public int i4() throws EOFException {
        return j.i(this.readInt());
    }
    
    @Override
    public boolean isOpen() {
        return true;
    }
    
    @h
    @e
    public final m j(@e final OutputStream outputStream) throws IOException {
        return t(this, outputStream, 0L, 0L, 6, null);
    }
    
    @e
    public final p j0(final int b) {
        p k;
        if (b == 0) {
            k = p.K;
        }
        else {
            j.e(this.h0(), 0L, b);
            m0 m0 = this.G;
            int i = 0;
            int j;
            int n;
            int c;
            int b2;
            for (j = 0, n = 0; j < b; j += c - b2, ++n, m0 = m0.f) {
                k0.m((Object)m0);
                c = m0.c;
                b2 = m0.b;
                if (c == b2) {
                    throw new AssertionError((Object)"s.limit == s.pos");
                }
            }
            final byte[][] array = new byte[n][];
            final int[] array2 = new int[n * 2];
            m0 m2 = this.G;
            for (int n2 = 0; i < b; i += m2.c - m2.b, array2[n2] = Math.min(i, b), array2[n2 + n] = m2.b, m2.d = true, ++n2, m2 = m2.f) {
                k0.m((Object)m2);
                array[n2] = m2.a;
            }
            k = new o0(array, array2);
        }
        return k;
    }
    
    @Override
    public boolean j4(final long n, @e final p p4, final int n2, final int n3) {
        k0.p((Object)p4, "bytes");
        boolean b2;
        final boolean b = b2 = false;
        if (n >= 0L) {
            b2 = b;
            if (n2 >= 0) {
                b2 = b;
                if (n3 >= 0) {
                    b2 = b;
                    if (this.h0() - n >= n3) {
                        if (p4.size() - n2 < n3) {
                            b2 = b;
                        }
                        else {
                            for (int i = 0; i < n3; ++i) {
                                if (this.F(i + n) != p4.u(n2 + i)) {
                                    b2 = b;
                                    return b2;
                                }
                            }
                            b2 = true;
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    @h
    @e
    public final m k1(@e final OutputStream outputStream, long a) throws IOException {
        k0.p((Object)outputStream, "out");
        j.e(this.H, 0L, a);
        m0 g = this.G;
        while (a > 0L) {
            k0.m((Object)g);
            final int len = (int)Math.min(a, g.c - g.b);
            outputStream.write(g.a, g.b, len);
            final int b = g.b + len;
            g.b = b;
            final long h = this.H;
            final long n = len;
            this.H = h - n;
            final long n2 = a -= n;
            if (b == g.c) {
                final m0 b2 = g.b();
                this.G = b2;
                n0.d(g);
                g = b2;
                a = n2;
            }
        }
        return this;
    }
    
    @e
    @Override
    public m m() {
        return this;
    }
    
    @e
    public final m0 m0(final int n) {
        boolean b = true;
        if (n < 1 || n > 8192) {
            b = false;
        }
        if (b) {
            final m0 g = this.G;
            m0 f;
            if (g == null) {
                f = n0.e();
                this.G = f;
                f.g = f;
                f.f = f;
            }
            else {
                k0.m((Object)g);
                f = g.g;
                k0.m((Object)f);
                if (f.c + n > 8192 || !f.e) {
                    f = f.c(n0.e());
                }
            }
            return f;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }
    
    @h
    @e
    public final m n(@e final OutputStream outputStream, final long n) throws IOException {
        return t(this, outputStream, n, 0L, 4, null);
    }
    
    @e
    public m p0(@e final p p) {
        k0.p((Object)p, "byteString");
        p.W0(this, 0, p.size());
        return this;
    }
    
    @e
    public m p1(@e final String s) {
        k0.p((Object)s, "string");
        return this.t1(s, 0, s.length());
    }
    
    @e
    @Override
    public o peek() {
        return d0.d(new i0(this));
    }
    
    @h
    @e
    public final m q(@e final OutputStream outputStream, long n, final long n2) throws IOException {
        k0.p((Object)outputStream, "out");
        j.e(this.H, n, n2);
        if (n2 == 0L) {
            return this;
        }
        m0 m0 = this.G;
        m0 f;
        long n3;
        long b2;
        while (true) {
            k0.m((Object)m0);
            final int c = m0.c;
            final int b = m0.b;
            f = m0;
            n3 = n;
            b2 = n2;
            if (n < c - b) {
                break;
            }
            n -= c - b;
            m0 = m0.f;
        }
        while (b2 > 0L) {
            k0.m((Object)f);
            final int off = (int)(f.b + n3);
            final int len = (int)Math.min(f.c - off, b2);
            outputStream.write(f.a, off, len);
            b2 -= len;
            f = f.f;
            n3 = 0L;
        }
        return this;
    }
    
    @Override
    public int q3() throws EOFException {
        if (this.h0() != 0L) {
            final byte f = this.F(0L);
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
                    this.skip(1L);
                    n2 = n;
                    return n2;
                }
                n2 = (f & 0x7);
                j = 4;
                n3 = 65536;
            }
            final long h0 = this.h0();
            final long n4 = j;
            if (h0 < n4) {
                final StringBuilder sb = new StringBuilder();
                sb.append("size < ");
                sb.append(j);
                sb.append(": ");
                sb.append(this.h0());
                sb.append(" (to read code point prefixed 0x");
                sb.append(okio.j.o(f));
                sb.append(')');
                throw new EOFException(sb.toString());
            }
            while (i < j) {
                final long n5 = i;
                final byte f2 = this.F(n5);
                if ((f2 & 0xC0) != 0x80) {
                    this.skip(n5);
                    n2 = n;
                    return n2;
                }
                n2 = (n2 << 6 | (f2 & 0x3F));
                ++i;
            }
            this.skip(n4);
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
        throw new EOFException();
    }
    
    @e
    public final m r(@e final m m, final long n) {
        k0.p((Object)m, "out");
        return this.s(m, n, this.H - n);
    }
    
    @Override
    public int read(@e final ByteBuffer byteBuffer) throws IOException {
        k0.p((Object)byteBuffer, "sink");
        final m0 g = this.G;
        if (g != null) {
            final int min = Math.min(byteBuffer.remaining(), g.c - g.b);
            byteBuffer.put(g.a, g.b, min);
            final int b = g.b + min;
            g.b = b;
            this.H -= min;
            if (b == g.c) {
                this.G = g.b();
                n0.d(g);
            }
            return min;
        }
        return -1;
    }
    
    @Override
    public int read(@e final byte[] array) {
        k0.p((Object)array, "sink");
        return this.read(array, 0, array.length);
    }
    
    @Override
    public int read(@e final byte[] array, int n, int min) {
        k0.p((Object)array, "sink");
        j.e(array.length, n, min);
        final m0 g = this.G;
        if (g != null) {
            min = Math.min(min, g.c - g.b);
            final byte[] a = g.a;
            final int b = g.b;
            kotlin.collections.m.W0(a, array, n, b, b + min);
            g.b += min;
            this.d0(this.h0() - min);
            n = min;
            if (g.b == g.c) {
                this.G = g.b();
                n0.d(g);
                n = min;
            }
        }
        else {
            n = -1;
        }
        return n;
    }
    
    @Override
    public long read(@e final m m, long lng) {
        k0.p((Object)m, "sink");
        if (lng >= 0L) {
            if (this.h0() == 0L) {
                lng = -1L;
            }
            else {
                long h0 = lng;
                if (lng > this.h0()) {
                    h0 = this.h0();
                }
                m.t3(this, h0);
                lng = h0;
            }
            return lng;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("byteCount < 0: ");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    @Override
    public byte readByte() throws EOFException {
        if (this.h0() != 0L) {
            final m0 g = this.G;
            k0.m((Object)g);
            final int b = g.b;
            final int c = g.c;
            final byte[] a = g.a;
            final int b2 = b + 1;
            final byte b3 = a[b];
            this.d0(this.h0() - 1L);
            if (b2 == c) {
                this.G = g.b();
                n0.d(g);
            }
            else {
                g.b = b2;
            }
            return b3;
        }
        throw new EOFException();
    }
    
    @Override
    public void readFully(@e final byte[] array) throws EOFException {
        k0.p((Object)array, "sink");
        int read;
        for (int i = 0; i < array.length; i += read) {
            read = this.read(array, i, array.length - i);
            if (read == -1) {
                throw new EOFException();
            }
        }
    }
    
    @Override
    public int readInt() throws EOFException {
        if (this.h0() >= 4L) {
            final m0 g = this.G;
            k0.m((Object)g);
            final int b = g.b;
            final int c = g.c;
            int n;
            if (c - b < 4L) {
                n = ((this.readByte() & 0xFF) << 24 | (this.readByte() & 0xFF) << 16 | (this.readByte() & 0xFF) << 8 | (this.readByte() & 0xFF));
            }
            else {
                final byte[] a = g.a;
                final int n2 = b + 1;
                final byte b2 = a[b];
                final int n3 = n2 + 1;
                final byte b3 = a[n2];
                final int n4 = n3 + 1;
                final byte b4 = a[n3];
                final int b5 = n4 + 1;
                final byte b6 = a[n4];
                this.d0(this.h0() - 4L);
                if (b5 == c) {
                    this.G = g.b();
                    n0.d(g);
                }
                else {
                    g.b = b5;
                }
                n = ((b2 & 0xFF) << 24 | (b3 & 0xFF) << 16 | (b4 & 0xFF) << 8 | (b6 & 0xFF));
            }
            return n;
        }
        throw new EOFException();
    }
    
    @Override
    public long readLong() throws EOFException {
        if (this.h0() >= 8L) {
            final m0 g = this.G;
            k0.m((Object)g);
            final int b = g.b;
            final int c = g.c;
            long n;
            if (c - b < 8L) {
                n = (((long)this.readInt() & 0xFFFFFFFFL) << 32 | (0xFFFFFFFFL & (long)this.readInt()));
            }
            else {
                final byte[] a = g.a;
                final int n2 = b + 1;
                final long n3 = a[b];
                final int n4 = n2 + 1;
                final long n5 = a[n2];
                final int n6 = n4 + 1;
                final long n7 = a[n4];
                final int n8 = n6 + 1;
                final long n9 = a[n6];
                final int n10 = n8 + 1;
                final long n11 = a[n8];
                final int n12 = n10 + 1;
                final long n13 = a[n10];
                final int n14 = n12 + 1;
                final long n15 = a[n12];
                final int b2 = n14 + 1;
                final long n16 = a[n14];
                this.d0(this.h0() - 8L);
                if (b2 == c) {
                    this.G = g.b();
                    n0.d(g);
                }
                else {
                    g.b = b2;
                }
                n = ((n9 & 0xFFL) << 32 | ((n3 & 0xFFL) << 56 | (n5 & 0xFFL) << 48 | (n7 & 0xFFL) << 40) | (n11 & 0xFFL) << 24 | (n13 & 0xFFL) << 16 | (n15 & 0xFFL) << 8 | (n16 & 0xFFL));
            }
            return n;
        }
        throw new EOFException();
    }
    
    @Override
    public short readShort() throws EOFException {
        if (this.h0() >= 2L) {
            final m0 g = this.G;
            k0.m((Object)g);
            final int b = g.b;
            final int c = g.c;
            short n;
            if (c - b < 2) {
                n = (short)((this.readByte() & 0xFF) << 8 | (this.readByte() & 0xFF));
            }
            else {
                final byte[] a = g.a;
                final int n2 = b + 1;
                final byte b2 = a[b];
                final int b3 = n2 + 1;
                final byte b4 = a[n2];
                this.d0(this.h0() - 2L);
                if (b3 == c) {
                    this.G = g.b();
                    n0.d(g);
                }
                else {
                    g.b = b3;
                }
                n = (short)((b2 & 0xFF) << 8 | (b4 & 0xFF));
            }
            return n;
        }
        throw new EOFException();
    }
    
    @e
    public final m s(@e final m m, long n, final long n2) {
        k0.p((Object)m, "out");
        j.e(this.h0(), n, n2);
        if (n2 != 0L) {
            m.d0(m.h0() + n2);
            m0 m2 = this.G;
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
                final m0 g = m.G;
                if (g == null) {
                    d.g = d;
                    d.f = d;
                    m.G = d;
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
        }
        return this;
    }
    
    @e
    public m s0(@e final p p3, final int n, final int n2) {
        k0.p((Object)p3, "byteString");
        p3.W0(this, n, n2);
        return this;
    }
    
    @e
    @Override
    public byte[] s1() {
        return this.v4(this.h0());
    }
    
    @Override
    public void skip(long a) throws EOFException {
        while (a > 0L) {
            final m0 g = this.G;
            if (g == null) {
                throw new EOFException();
            }
            final int n = (int)Math.min(a, g.c - g.b);
            final long h0 = this.h0();
            final long n2 = n;
            this.d0(h0 - n2);
            final long n3 = a - n2;
            final int b = g.b + n;
            g.b = b;
            a = n3;
            if (b != g.c) {
                continue;
            }
            this.G = g.b();
            n0.d(g);
            a = n3;
        }
    }
    
    @e
    @Override
    public String t0(final long n) throws EOFException {
        return this.I4(n, kotlin.text.f.a);
    }
    
    @e
    public m t1(@e final String s, int i, final int j) {
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
                    final m0 m0 = this.m0(1);
                    final byte[] a = m0.a;
                    final int n = m0.c - i;
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
                    final int c = m0.c;
                    final int n3 = n + i - c;
                    m0.c = c + n3;
                    this.d0(this.h0() + n3);
                }
                else {
                    long n4;
                    long n5;
                    if (char1 < '\u0800') {
                        final m0 m2 = this.m0(2);
                        final byte[] a2 = m2.a;
                        final int c2 = m2.c;
                        a2[c2] = (byte)(char1 >> 6 | 0xC0);
                        a2[c2 + 1] = (byte)((char1 & '?') | 0x80);
                        m2.c = c2 + 2;
                        n4 = this.h0();
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
                            final m0 m3 = this.m0(4);
                            final byte[] a3 = m3.a;
                            final int c3 = m3.c;
                            a3[c3] = (byte)(n6 >> 18 | 0xF0);
                            a3[c3 + 1] = (byte)((n6 >> 12 & 0x3F) | 0x80);
                            a3[c3 + 2] = (byte)((n6 >> 6 & 0x3F) | 0x80);
                            a3[c3 + 3] = (byte)((n6 & 0x3F) | 0x80);
                            m3.c = c3 + 4;
                            this.d0(this.h0() + 4L);
                            i += 2;
                            continue;
                        }
                        this.G0(63);
                        i = index;
                        continue;
                    }
                    else {
                        final m0 m4 = this.m0(3);
                        final byte[] a4 = m4.a;
                        final int c4 = m4.c;
                        a4[c4] = (byte)(char1 >> 12 | 0xE0);
                        a4[c4 + 1] = (byte)((0x3F & char1 >> 6) | 0x80);
                        a4[c4 + 2] = (byte)((char1 & '?') | 0x80);
                        m4.c = c4 + 3;
                        n4 = this.h0();
                        n5 = 3L;
                    }
                    this.d0(n4 + n5);
                    ++i;
                }
            }
            return this;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("endIndex > string.length: ");
        sb3.append(j);
        sb3.append(" > ");
        sb3.append(s.length());
        throw new IllegalArgumentException(sb3.toString().toString());
    }
    
    @Override
    public void t3(@e final m m, long n) {
        k0.p((Object)m, "source");
        if (m != this) {
            j.e(m.h0(), 0L, n);
            while (n > 0L) {
                final m0 g = m.G;
                k0.m((Object)g);
                final int c = g.c;
                final m0 g2 = m.G;
                k0.m((Object)g2);
                if (n < c - g2.b) {
                    final m0 g3 = this.G;
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
                            final m0 g5 = m.G;
                            k0.m((Object)g5);
                            g5.g(g4, (int)n);
                            m.d0(m.h0() - n);
                            this.d0(this.h0() + n);
                            break;
                        }
                    }
                    final m0 g6 = m.G;
                    k0.m((Object)g6);
                    m.G = g6.e((int)n);
                }
                final m0 g7 = m.G;
                k0.m((Object)g7);
                final long n3 = g7.c - g7.b;
                m.G = g7.b();
                final m0 g8 = this.G;
                if (g8 == null) {
                    this.G = g7;
                    g7.g = g7;
                    g7.f = g7;
                }
                else {
                    k0.m((Object)g8);
                    final m0 g9 = g8.g;
                    k0.m((Object)g9);
                    g9.c(g7).a();
                }
                m.d0(m.h0() - n3);
                this.d0(this.h0() + n3);
                n -= n3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }
    
    @e
    @Override
    public t0 timeout() {
        return t0.d;
    }
    
    @e
    @Override
    public String toString() {
        return this.i0().toString();
    }
    
    @Override
    public boolean v(final long n) {
        return this.H >= n;
    }
    
    @Override
    public long v0(@e final p p2, long lng) throws IOException {
        k0.p((Object)p2, "bytes");
        if (p2.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long n = 0L;
        if (lng >= 0L) {
            final m0 g = this.G;
            if (g != null) {
                m0 m0 = g;
                if (this.h0() - lng < lng) {
                    long h0;
                    m0 m2;
                    for (h0 = this.h0(), m2 = g; h0 > lng; h0 -= m2.c - m2.b) {
                        m2 = m2.g;
                        k0.m((Object)m2);
                    }
                    final byte[] a0 = p2.a0();
                    final byte b = a0[0];
                    final int size = p2.size();
                    final long n2 = this.h0() - size + 1L;
                    while (h0 < n2) {
                        final byte[] a2 = m2.a;
                        for (int n3 = (int)Math.min(m2.c, m2.b + n2 - h0), i = (int)(m2.b + lng - h0); i < n3; ++i) {
                            if (a2[i] == b && okio.internal.a.h0(m2, i + 1, a0, 1, size)) {
                                lng = i - m2.b + h0;
                                return lng;
                            }
                        }
                        h0 += m2.c - m2.b;
                        m2 = m2.f;
                        k0.m((Object)m2);
                        lng = h0;
                    }
                }
                else {
                    while (true) {
                        final long n4 = m0.c - m0.b + n;
                        if (n4 > lng) {
                            break;
                        }
                        m0 = m0.f;
                        k0.m((Object)m0);
                        n = n4;
                    }
                    final byte[] a3 = p2.a0();
                    final byte b2 = a3[0];
                    final int size2 = p2.size();
                    final long n5 = this.h0() - size2 + 1L;
                    while (n < n5) {
                        final byte[] a4 = m0.a;
                        for (int n6 = (int)Math.min(m0.c, m0.b + n5 - n), j = (int)(m0.b + lng - n); j < n6; ++j) {
                            if (a4[j] == b2 && okio.internal.a.h0(m0, j + 1, a3, 1, size2)) {
                                lng = j - m0.b + n;
                                return lng;
                            }
                        }
                        n += m0.c - m0.b;
                        m0 = m0.f;
                        k0.m((Object)m0);
                        lng = n;
                    }
                }
            }
            lng = -1L;
            return lng;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("fromIndex < 0: ");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    @e
    public m v1(final int n) {
        if (n < 128) {
            this.G0(n);
        }
        else {
            long n2;
            long n3;
            if (n < 2048) {
                final m0 m0 = this.m0(2);
                final byte[] a = m0.a;
                final int c = m0.c;
                a[c] = (byte)(n >> 6 | 0xC0);
                a[c + 1] = (byte)((n & 0x3F) | 0x80);
                m0.c = c + 2;
                n2 = this.h0();
                n3 = 2L;
            }
            else {
                if (55296 <= n) {
                    if (57343 >= n) {
                        this.G0(63);
                        return this;
                    }
                }
                if (n < 65536) {
                    final m0 m2 = this.m0(3);
                    final byte[] a2 = m2.a;
                    final int c2 = m2.c;
                    a2[c2] = (byte)(n >> 12 | 0xE0);
                    a2[c2 + 1] = (byte)((n >> 6 & 0x3F) | 0x80);
                    a2[c2 + 2] = (byte)((n & 0x3F) | 0x80);
                    m2.c = c2 + 3;
                    n2 = this.h0();
                    n3 = 3L;
                }
                else {
                    if (n > 1114111) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected code point: 0x");
                        sb.append(j.p(n));
                        throw new IllegalArgumentException(sb.toString());
                    }
                    final m0 m3 = this.m0(4);
                    final byte[] a3 = m3.a;
                    final int c3 = m3.c;
                    a3[c3] = (byte)(n >> 18 | 0xF0);
                    a3[c3 + 1] = (byte)((n >> 12 & 0x3F) | 0x80);
                    a3[c3 + 2] = (byte)((n >> 6 & 0x3F) | 0x80);
                    a3[c3 + 3] = (byte)((n & 0x3F) | 0x80);
                    m3.c = c3 + 4;
                    n2 = this.h0();
                    n3 = 4L;
                }
            }
            this.d0(n2 + n3);
        }
        return this;
    }
    
    @e
    @Override
    public byte[] v4(final long lng) throws EOFException {
        if (lng < 0L || lng > Integer.MAX_VALUE) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount: ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (this.h0() >= lng) {
            final byte[] array = new byte[(int)lng];
            this.readFully(array);
            return array;
        }
        throw new EOFException();
    }
    
    @e
    public m w0(@e final r0 r0, long n) throws IOException {
        k0.p((Object)r0, "source");
        while (n > 0L) {
            final long read = r0.read(this, n);
            if (read == -1L) {
                throw new EOFException();
            }
            n -= read;
        }
        return this;
    }
    
    @Override
    public int write(@e final ByteBuffer byteBuffer) throws IOException {
        k0.p((Object)byteBuffer, "source");
        int i;
        int n;
        m0 m0;
        int min;
        for (n = (i = byteBuffer.remaining()); i > 0; i -= min, m0.c += min) {
            m0 = this.m0(1);
            min = Math.min(i, 8192 - m0.c);
            byteBuffer.get(m0.a, m0.c, min);
        }
        this.H += n;
        return n;
    }
    
    @e
    public m y0(@e final byte[] array) {
        k0.p((Object)array, "source");
        return this.D0(array, 0, array.length);
    }
    
    @Override
    public long y1(@e final p p) throws IOException {
        k0.p((Object)p, "bytes");
        return this.v0(p, 0L);
    }
    
    @e
    @Override
    public String y4() {
        return this.I4(this.H, kotlin.text.f.a);
    }
    
    @Override
    public long y5(@e final p p2, long lng) {
        k0.p((Object)p2, "targetBytes");
        long n = 0L;
        if (lng >= 0L) {
            final m0 g = this.G;
            long n3;
            final long n2 = n3 = -1L;
            if (g != null) {
                m0 m0 = g;
                m0 m3 = null;
                int j = 0;
                Label_0235: {
                    if (this.h0() - lng < lng) {
                        long h0;
                        m0 m2;
                        for (h0 = this.h0(), m2 = g; h0 > lng; h0 -= m2.c - m2.b) {
                            m2 = m2.g;
                            k0.m((Object)m2);
                        }
                        if (p2.size() == 2) {
                            final byte u = p2.u(0);
                            final byte u2 = p2.u(1);
                            int i = 0;
                        Block_10:
                            while (true) {
                                n3 = n2;
                                if (h0 >= this.h0()) {
                                    return n3;
                                }
                                final byte[] a = m2.a;
                                for (i = (int)(m2.b + lng - h0); i < m2.c; ++i) {
                                    final byte b = a[i];
                                    lng = h0;
                                    m3 = m2;
                                    j = i;
                                    if (b == u) {
                                        break Label_0235;
                                    }
                                    if (b == u2) {
                                        break Block_10;
                                    }
                                }
                                h0 += m2.c - m2.b;
                                m2 = m2.f;
                                k0.m((Object)m2);
                                lng = h0;
                            }
                            lng = h0;
                            m3 = m2;
                            j = i;
                        }
                        else {
                            final byte[] a2 = p2.a0();
                            long n4 = lng;
                            m3 = m2;
                            lng = h0;
                            while (true) {
                                n3 = n2;
                                if (lng >= this.h0()) {
                                    return n3;
                                }
                                final byte[] a3 = m3.a;
                                for (j = (int)(m3.b + n4 - lng); j < m3.c; ++j) {
                                    final byte b2 = a3[j];
                                    for (int length = a2.length, k = 0; k < length; ++k) {
                                        if (b2 == a2[k]) {
                                            break Label_0235;
                                        }
                                    }
                                }
                                lng += m3.c - m3.b;
                                m3 = m3.f;
                                k0.m((Object)m3);
                                n4 = lng;
                            }
                        }
                    }
                    else {
                        while (true) {
                            final long n5 = m0.c - m0.b + n;
                            if (n5 > lng) {
                                break;
                            }
                            m0 = m0.f;
                            k0.m((Object)m0);
                            n = n5;
                        }
                        if (p2.size() == 2) {
                            final byte u3 = p2.u(0);
                            final byte u4 = p2.u(1);
                            int l = 0;
                        Block_20:
                            while (true) {
                                n3 = n2;
                                if (n >= this.h0()) {
                                    return n3;
                                }
                                final byte[] a4 = m0.a;
                                for (l = (int)(m0.b + lng - n); l < m0.c; ++l) {
                                    final byte b3 = a4[l];
                                    lng = n;
                                    m3 = m0;
                                    j = l;
                                    if (b3 == u3) {
                                        break Label_0235;
                                    }
                                    if (b3 == u4) {
                                        break Block_20;
                                    }
                                }
                                n += m0.c - m0.b;
                                m0 = m0.f;
                                k0.m((Object)m0);
                                lng = n;
                            }
                            lng = n;
                            m3 = m0;
                            j = l;
                        }
                        else {
                            final byte[] a5 = p2.a0();
                            long n6 = lng;
                            m3 = m0;
                            lng = n;
                            while (true) {
                                n3 = n2;
                                if (lng >= this.h0()) {
                                    return n3;
                                }
                                final byte[] a6 = m3.a;
                                for (j = (int)(m3.b + n6 - lng); j < m3.c; ++j) {
                                    final byte b4 = a6[j];
                                    for (int length2 = a5.length, n7 = 0; n7 < length2; ++n7) {
                                        if (b4 == a5[n7]) {
                                            break Label_0235;
                                        }
                                    }
                                }
                                lng += m3.c - m3.b;
                                m3 = m3.f;
                                k0.m((Object)m3);
                                n6 = lng;
                            }
                        }
                    }
                }
                n3 = j - m3.b + lng;
            }
            return n3;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("fromIndex < 0: ");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    @e
    @Override
    public m z() {
        return this;
    }
    
    @Override
    public long z3(@e final r0 r0) throws IOException {
        k0.p((Object)r0, "source");
        long n = 0L;
        while (true) {
            final long read = r0.read(this, 8192);
            if (read == -1L) {
                break;
            }
            n += read;
        }
        return n;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR$\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010!R\u0016\u0010%\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006(" }, d2 = { "okio/m$a", "Ljava/io/Closeable;", "", "c", "", "offset", "e", "newSize", "d", "minByteCount", "a", "Lkotlin/j2;", "close", "M", "I", "end", "Lokio/m;", "G", "Lokio/m;", "buffer", "L", "start", "Lokio/m0;", "Lokio/m0;", "b", "()Lokio/m0;", "f", "(Lokio/m0;)V", "segment", "", "K", "[B", "data", "J", "", "H", "Z", "readWrite", "<init>", "()V", "okio" }, k = 1, mv = { 1, 4, 1 })
    public static final class a implements Closeable
    {
        @d
        @f
        public m G;
        @d
        public boolean H;
        @f
        private m0 I;
        @d
        public long J;
        @d
        @f
        public byte[] K;
        @d
        public int L;
        @d
        public int M;
        
        public a() {
            this.J = -1L;
            this.L = -1;
            this.M = -1;
        }
        
        public final long a(int n) {
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
            final m g = this.G;
            if (g == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (this.H) {
                final long h0 = g.h0();
                final m0 m0 = g.m0(n);
                n = 8192 - m0.c;
                m0.c = 8192;
                final long n4 = n;
                g.d0(h0 + n4);
                this.f(m0);
                this.J = h0;
                this.K = m0.a;
                this.L = 8192 - n;
                this.M = 8192;
                return n4;
            }
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
        }
        
        @f
        public final m0 b() {
            return this.I;
        }
        
        public final int c() {
            final long j = this.J;
            final m g = this.G;
            k0.m((Object)g);
            if (j != g.h0()) {
                final long i = this.J;
                long n;
                if (i == -1L) {
                    n = 0L;
                }
                else {
                    n = i + (this.M - this.L);
                }
                return this.e(n);
            }
            throw new IllegalStateException("no more bytes".toString());
        }
        
        @Override
        public void close() {
            if (this.G != null) {
                this.G = null;
                this.f(null);
                this.J = -1L;
                this.K = null;
                this.L = -1;
                this.M = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        
        public final long d(final long n) {
            final m g = this.G;
            if (g == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (this.H) {
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
                    this.f(null);
                    this.J = n;
                    this.K = null;
                    this.L = -1;
                    this.M = -1;
                }
                else if (n2 > 0) {
                    long a = n - h0;
                    int n5 = 1;
                    while (a > 0L) {
                        final m0 m0 = g.m0(1);
                        final int n6 = (int)Math.min(a, 8192 - m0.c);
                        m0.c += n6;
                        a -= n6;
                        int n7;
                        if ((n7 = n5) != 0) {
                            this.f(m0);
                            this.J = h0;
                            this.K = m0.a;
                            final int c2 = m0.c;
                            this.L = c2 - n6;
                            this.M = c2;
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
        
        public final int e(final long lng) {
            final m g = this.G;
            if (g == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            int n = -1;
            if (lng >= -1 && lng <= g.h0()) {
                if (lng != -1L && lng != g.h0()) {
                    long n2 = 0L;
                    final long h0 = g.h0();
                    m0 m0 = g.G;
                    long n3;
                    m0 b3;
                    if (this.b() != null) {
                        final long j = this.J;
                        final int l = this.L;
                        final m0 b = this.b();
                        k0.m((Object)b);
                        n3 = j - (l - b.b);
                        if (n3 > lng) {
                            final m0 b2 = this.b();
                            b3 = m0;
                            m0 = b2;
                        }
                        else {
                            b3 = this.b();
                            n2 = n3;
                            n3 = h0;
                        }
                    }
                    else {
                        b3 = m0;
                        n3 = h0;
                    }
                    long n4 = n3;
                    long n5;
                    m0 m2;
                    if (n3 - lng > lng - n2) {
                        m0 f = b3;
                        while (true) {
                            k0.m((Object)f);
                            final int c = f.c;
                            final int b4 = f.b;
                            n5 = n2;
                            m2 = f;
                            if (lng < c - b4 + n2) {
                                break;
                            }
                            n2 += c - b4;
                            f = f.f;
                        }
                    }
                    else {
                        while (n4 > lng) {
                            k0.m((Object)m0);
                            m0 = m0.g;
                            k0.m((Object)m0);
                            n4 -= m0.c - m0.b;
                        }
                        n5 = n4;
                        m2 = m0;
                    }
                    m0 c2 = m2;
                    if (this.H) {
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
                    this.f(c2);
                    this.J = lng;
                    k0.m((Object)c2);
                    this.K = c2.a;
                    final int i = c2.b + (int)(lng - n5);
                    this.L = i;
                    final int c3 = c2.c;
                    this.M = c3;
                    n = c3 - i;
                }
                else {
                    this.f(null);
                    this.J = lng;
                    this.K = null;
                    this.L = -1;
                    this.M = -1;
                }
                return n;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("offset=");
            sb.append(lng);
            sb.append(" > size=");
            sb.append(g.h0());
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        
        public final void f(@f final m0 i) {
            this.I = i;
        }
    }
}
