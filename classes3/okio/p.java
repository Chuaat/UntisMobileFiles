// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.io.EOFException;
import kotlin.text.s;
import java.util.Objects;
import java.security.MessageDigest;
import kotlin.z0;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.collections.m;
import m6.h;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import okio.internal.b;
import java.lang.reflect.Field;
import java.io.ObjectInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import m6.g;
import java.nio.charset.Charset;
import m6.k;
import java.io.IOException;
import java.io.ObjectOutputStream;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;
import java.io.Serializable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0016\u0018\u0000 b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001cB\u0011\b\u0000\u0012\u0006\u0010_\u001a\u00020-¢\u0006\u0004\b`\u0010aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0006\u0010\u0010\u001a\u00020\u0000J\u0006\u0010\u0011\u001a\u00020\u0000J\u0006\u0010\u0012\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0000J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0016J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0016J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0016J\u001f\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\nH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\u0000H\u0016J\b\u0010 \u001a\u00020\u0000H\u0016J\u001c\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!H\u0017J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020!H\u0010¢\u0006\u0004\b'\u0010(J\u0018\u0010*\u001a\u00020&2\u0006\u0010)\u001a\u00020!H\u0087\u0002¢\u0006\u0004\b*\u0010(J\u000f\u0010+\u001a\u00020!H\u0010¢\u0006\u0004\b+\u0010,J\b\u0010.\u001a\u00020-H\u0016J\u000f\u0010/\u001a\u00020-H\u0010¢\u0006\u0004\b/\u00100J\b\u00102\u001a\u000201H\u0016J\u0010\u00104\u001a\u00020\u00052\u0006\u0010\b\u001a\u000203H\u0016J'\u00109\u001a\u00020\u00052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0010¢\u0006\u0004\b9\u0010:J(\u0010>\u001a\u00020=2\u0006\u00107\u001a\u00020!2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0016J(\u0010?\u001a\u00020=2\u0006\u00107\u001a\u00020!2\u0006\u0010;\u001a\u00020-2\u0006\u0010<\u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0016J\u000e\u0010A\u001a\u00020=2\u0006\u0010@\u001a\u00020\u0000J\u000e\u0010B\u001a\u00020=2\u0006\u0010@\u001a\u00020-J\u000e\u0010D\u001a\u00020=2\u0006\u0010C\u001a\u00020\u0000J\u000e\u0010E\u001a\u00020=2\u0006\u0010C\u001a\u00020-J\u001a\u0010G\u001a\u00020!2\u0006\u0010;\u001a\u00020\u00002\b\b\u0002\u0010F\u001a\u00020!H\u0007J\u001a\u0010H\u001a\u00020!2\u0006\u0010;\u001a\u00020-2\b\b\u0002\u0010F\u001a\u00020!H\u0017J\u001a\u0010I\u001a\u00020!2\u0006\u0010;\u001a\u00020\u00002\b\b\u0002\u0010F\u001a\u00020!H\u0007J\u001a\u0010J\u001a\u00020!2\u0006\u0010;\u001a\u00020-2\b\b\u0002\u0010F\u001a\u00020!H\u0017J\u0013\u0010L\u001a\u00020=2\b\u0010;\u001a\u0004\u0018\u00010KH\u0096\u0002J\b\u0010M\u001a\u00020!H\u0016J\u0011\u0010N\u001a\u00020!2\u0006\u0010;\u001a\u00020\u0000H\u0096\u0002J\b\u0010O\u001a\u00020\nH\u0016J\u0017\u0010P\u001a\u00020&2\u0006\u0010)\u001a\u00020!H\u0007¢\u0006\u0004\bP\u0010(J\u000f\u0010Q\u001a\u00020!H\u0007¢\u0006\u0004\bQ\u0010,R$\u0010X\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010M\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0018\u001a\u0004\bY\u0010,\"\u0004\bZ\u0010[R\u0013\u0010\\\u001a\u00020!8G@\u0006¢\u0006\u0006\u001a\u0004\b\\\u0010,R\u001c\u0010_\u001a\u00020-8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010]\u001a\u0004\b^\u00100¨\u0006d" }, d2 = { "Lokio/p;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "Lkotlin/j2;", "z0", "Ljava/io/ObjectOutputStream;", "out", "X0", "", "U0", "Ljava/nio/charset/Charset;", "charset", "J0", "g", "q0", "C0", "E0", "F0", "algorithm", "l", "(Ljava/lang/String;)Lokio/p;", "key", "I", "K", "M", "G", "(Ljava/lang/String;Lokio/p;)Lokio/p;", "h", "E", "R0", "S0", "", "beginIndex", "endIndex", "O0", "pos", "", "b0", "(I)B", "index", "u", "z", "()I", "", "T0", "a0", "()[B", "Ljava/nio/ByteBuffer;", "f", "Ljava/io/OutputStream;", "V0", "Lokio/m;", "buffer", "offset", "byteCount", "W0", "(Lokio/m;II)V", "other", "otherOffset", "", "u0", "v0", "prefix", "G0", "I0", "suffix", "p", "s", "fromIndex", "P", "T", "i0", "l0", "", "equals", "hashCode", "i", "toString", "b", "d", "H", "Ljava/lang/String;", "B", "()Ljava/lang/String;", "B0", "(Ljava/lang/String;)V", "utf8", "y", "A0", "(I)V", "size", "[B", "v", "data", "<init>", "([B)V", "L", "a", "okio" }, k = 1, mv = { 1, 4, 1 })
public class p implements Serializable, Comparable<p>
{
    private static final long J = 1L;
    @d
    @e
    public static final p K;
    @e
    public static final a L;
    private transient int G;
    @f
    private transient String H;
    @e
    private final byte[] I;
    
    static {
        L = new a(null);
        K = new p(new byte[0]);
    }
    
    public p(@e final byte[] i) {
        k0.p((Object)i, "data");
        this.I = i;
    }
    
    public static /* synthetic */ p P0(final p p5, int n, int size, final int n2, final Object o) {
        if (o == null) {
            if ((n2 & 0x1) != 0x0) {
                n = 0;
            }
            if ((n2 & 0x2) != 0x0) {
                size = p5.size();
            }
            return p5.O0(n, size);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }
    
    public static /* synthetic */ int U(final p p5, final p p6, int n, final int n2, final Object o) {
        if (o == null) {
            if ((n2 & 0x2) != 0x0) {
                n = 0;
            }
            return p5.P(p6, n);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }
    
    public static /* synthetic */ int V(final p p5, final byte[] array, int n, final int n2, final Object o) {
        if (o == null) {
            if ((n2 & 0x2) != 0x0) {
                n = 0;
            }
            return p5.T(array, n);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }
    
    private final void X0(final ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.I.length);
        objectOutputStream.write(this.I);
    }
    
    @k
    @f
    public static final p j(@e final String s) {
        return p.L.h(s);
    }
    
    @k
    @e
    public static final p k(@e final String s) {
        return p.L.i(s);
    }
    
    @k
    @g(name = "encodeString")
    @e
    public static final p m(@e final String s, @e final Charset charset) {
        return p.L.j(s, charset);
    }
    
    public static /* synthetic */ int n0(final p p5, final p p6, int size, final int n, final Object o) {
        if (o == null) {
            if ((n & 0x2) != 0x0) {
                size = p5.size();
            }
            return p5.i0(p6, size);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }
    
    @k
    @e
    public static final p o(@e final String s) {
        return p.L.l(s);
    }
    
    public static /* synthetic */ int o0(final p p5, final byte[] array, int size, final int n, final Object o) {
        if (o == null) {
            if ((n & 0x2) != 0x0) {
                size = p5.size();
            }
            return p5.l0(array, size);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }
    
    @k
    @g(name = "of")
    @e
    public static final p r0(@e final ByteBuffer byteBuffer) {
        return p.L.m(byteBuffer);
    }
    
    @k
    @e
    public static final p s0(@e final byte... array) {
        return p.L.n(array);
    }
    
    @k
    @g(name = "of")
    @e
    public static final p t0(@e final byte[] array, final int n, final int n2) {
        return p.L.o(array, n, n2);
    }
    
    @k
    @g(name = "read")
    @e
    public static final p x0(@e final InputStream inputStream, final int n) throws IOException {
        return p.L.q(inputStream, n);
    }
    
    private final void z0(final ObjectInputStream objectInputStream) throws IOException {
        final p q = p.L.q(objectInputStream, objectInputStream.readInt());
        final Field declaredField = p.class.getDeclaredField("I");
        k0.o((Object)declaredField, "field");
        declaredField.setAccessible(true);
        declaredField.set(this, q.I);
    }
    
    public final void A0(final int g) {
        this.G = g;
    }
    
    @f
    public final String B() {
        return this.H;
    }
    
    public final void B0(@f final String h) {
        this.H = h;
    }
    
    @e
    public final p C0() {
        return this.l("SHA-1");
    }
    
    @e
    public String E() {
        final char[] value = new char[this.v().length * 2];
        final byte[] v = this.v();
        final int length = v.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final byte b = v[i];
            final int n2 = n + 1;
            value[n] = okio.internal.b.I()[b >> 4 & 0xF];
            n = n2 + 1;
            value[n2] = okio.internal.b.I()[b & 0xF];
            ++i;
        }
        return new String(value);
    }
    
    @e
    public final p E0() {
        return this.l("SHA-256");
    }
    
    @e
    public final p F0() {
        return this.l("SHA-512");
    }
    
    @e
    public p G(@e final String s, @e final p p2) {
        k0.p((Object)s, "algorithm");
        k0.p((Object)p2, "key");
        try {
            final Mac instance = Mac.getInstance(s);
            instance.init(new SecretKeySpec(p2.T0(), s));
            final byte[] doFinal = instance.doFinal(this.I);
            k0.o((Object)doFinal, "mac.doFinal(data)");
            return new p(doFinal);
        }
        catch (InvalidKeyException cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    public final boolean G0(@e final p p) {
        k0.p((Object)p, "prefix");
        return this.u0(0, p, 0, p.size());
    }
    
    @e
    public p I(@e final p p) {
        k0.p((Object)p, "key");
        return this.G("HmacSHA1", p);
    }
    
    public final boolean I0(@e final byte[] array) {
        k0.p((Object)array, "prefix");
        return this.v0(0, array, 0, array.length);
    }
    
    @e
    public String J0(@e final Charset charset) {
        k0.p((Object)charset, "charset");
        return new String(this.I, charset);
    }
    
    @e
    public p K(@e final p p) {
        k0.p((Object)p, "key");
        return this.G("HmacSHA256", p);
    }
    
    @h
    @e
    public final p K0() {
        return P0(this, 0, 0, 3, null);
    }
    
    @e
    public p M(@e final p p) {
        k0.p((Object)p, "key");
        return this.G("HmacSHA512", p);
    }
    
    @h
    @e
    public final p N0(final int n) {
        return P0(this, n, 0, 2, null);
    }
    
    @h
    public final int O(@e final p p) {
        return U(this, p, 0, 2, null);
    }
    
    @h
    @e
    public p O0(final int n, final int n2) {
        final int n3 = 1;
        if (n < 0) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (n2 > this.v().length) {
            final StringBuilder sb = new StringBuilder();
            sb.append("endIndex > length(");
            sb.append(this.v().length);
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
        if (n4 != 0) {
            p p2;
            if (n == 0 && n2 == this.v().length) {
                p2 = this;
            }
            else {
                p2 = new p(m.G1(this.v(), n, n2));
            }
            return p2;
        }
        throw new IllegalArgumentException("endIndex < beginIndex".toString());
    }
    
    @h
    public final int P(@e final p p2, final int n) {
        k0.p((Object)p2, "other");
        return this.T(p2.a0(), n);
    }
    
    @h
    public final int Q(@e final byte[] array) {
        return V(this, array, 0, 2, null);
    }
    
    @e
    public p R0() {
        for (int i = 0; i < this.v().length; ++i) {
            final byte b = this.v()[i];
            final byte b2 = 65;
            if (b >= b2) {
                final byte b3 = 90;
                if (b <= b3) {
                    final byte[] v = this.v();
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
        return this;
    }
    
    @e
    public p S0() {
        for (int i = 0; i < this.v().length; ++i) {
            final byte b = this.v()[i];
            final byte b2 = 97;
            if (b >= b2) {
                final byte b3 = 122;
                if (b <= b3) {
                    final byte[] v = this.v();
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
        return this;
    }
    
    @h
    public int T(@e final byte[] array, int max) {
        k0.p((Object)array, "other");
        final int n = this.v().length - array.length;
        max = Math.max(max, 0);
        if (max <= n) {
            while (!j.d(this.v(), max, array, 0, array.length)) {
                if (max == n) {
                    return -1;
                }
                ++max;
            }
            return max;
        }
        max = -1;
        return max;
    }
    
    @e
    public byte[] T0() {
        final byte[] v = this.v();
        final byte[] copy = Arrays.copyOf(v, v.length);
        k0.o((Object)copy, "java.util.Arrays.copyOf(this, size)");
        return copy;
    }
    
    @e
    public String U0() {
        String s;
        if ((s = this.B()) == null) {
            s = i.c(this.a0());
            this.B0(s);
        }
        return s;
    }
    
    public void V0(@e final OutputStream outputStream) throws IOException {
        k0.p((Object)outputStream, "out");
        outputStream.write(this.I);
    }
    
    public void W0(@e final okio.m m, final int n, final int n2) {
        k0.p((Object)m, "buffer");
        b.G(this, m, n, n2);
    }
    
    @e
    public byte[] a0() {
        return this.v();
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to operator function", replaceWith = @z0(expression = "this[index]", imports = {}))
    @g(name = "-deprecated_getByte")
    public final byte b(final int n) {
        return this.u(n);
    }
    
    public byte b0(final int n) {
        return this.v()[n];
    }
    
    @h
    public final int c0(@e final p p) {
        return n0(this, p, 0, 2, null);
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "size", imports = {}))
    @g(name = "-deprecated_size")
    public final int d() {
        return this.size();
    }
    
    @Override
    public boolean equals(@f final Object o) {
        boolean b = true;
        if (o != this) {
            if (o instanceof p) {
                final p p = (p)o;
                if (p.size() == this.v().length && p.v0(0, this.v(), 0, this.v().length)) {
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
    
    @e
    public ByteBuffer f() {
        final ByteBuffer readOnlyBuffer = ByteBuffer.wrap(this.I).asReadOnlyBuffer();
        k0.o((Object)readOnlyBuffer, "ByteBuffer.wrap(data).asReadOnlyBuffer()");
        return readOnlyBuffer;
    }
    
    @e
    public String g() {
        return okio.a.c(this.v(), null, 1, null);
    }
    
    @e
    public String h() {
        return okio.a.b(this.v(), okio.a.e());
    }
    
    @Override
    public int hashCode() {
        int n = this.y();
        if (n == 0) {
            n = Arrays.hashCode(this.v());
            this.A0(n);
        }
        return n;
    }
    
    public int i(@e final p p) {
        k0.p((Object)p, "other");
        final int size = this.size();
        final int size2 = p.size();
        final int min = Math.min(size, size2);
        final int n = 0;
        while (true) {
            while (true) {
                for (int i = 0; i < min; ++i) {
                    final int n2 = this.u(i) & 0xFF;
                    final int n3 = p.u(i) & 0xFF;
                    if (n2 != n3) {
                        int n4;
                        if (n2 < n3) {
                            n4 = -1;
                        }
                        else {
                            n4 = 1;
                        }
                        return n4;
                    }
                }
                if (size == size2) {
                    return n;
                }
                if (size < size2) {
                    continue;
                }
                break;
            }
            continue;
        }
    }
    
    @h
    public final int i0(@e final p p2, final int n) {
        k0.p((Object)p2, "other");
        return this.l0(p2.a0(), n);
    }
    
    @h
    public final int k0(@e final byte[] array) {
        return o0(this, array, 0, 2, null);
    }
    
    @e
    public p l(@e final String algorithm) {
        k0.p((Object)algorithm, "algorithm");
        final MessageDigest instance = MessageDigest.getInstance(algorithm);
        instance.update(this.I, 0, this.size());
        final byte[] digest = instance.digest();
        k0.o((Object)digest, "digestBytes");
        return new p(digest);
    }
    
    @h
    public int l0(@e final byte[] array, int i) {
        k0.p((Object)array, "other");
        for (i = Math.min(i, this.v().length - array.length); i >= 0; --i) {
            if (j.d(this.v(), i, array, 0, array.length)) {
                return i;
            }
        }
        i = -1;
        return i;
    }
    
    public final boolean p(@e final p p) {
        k0.p((Object)p, "suffix");
        return this.u0(this.size() - p.size(), p, 0, p.size());
    }
    
    @e
    public final p q0() {
        return this.l("MD5");
    }
    
    public final boolean s(@e final byte[] array) {
        k0.p((Object)array, "suffix");
        return this.v0(this.size() - array.length, array, 0, array.length);
    }
    
    @g(name = "size")
    public final int size() {
        return this.z();
    }
    
    @e
    @Override
    public String toString() {
        final int length = this.v().length;
        final int n = 1;
        if (length != 0) {
            final int a = b.a(this.v(), 64);
            StringBuilder sb = null;
            Label_0369: {
                if (a == -1) {
                    if (this.v().length <= 64) {
                        sb = new StringBuilder();
                        sb.append("[hex=");
                        sb.append(this.E());
                    }
                    else {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("[size=");
                        sb2.append(this.v().length);
                        sb2.append(" hex=");
                        int n2;
                        if (64 <= this.v().length) {
                            n2 = n;
                        }
                        else {
                            n2 = 0;
                        }
                        if (n2 != 0) {
                            p p;
                            if (64 == this.v().length) {
                                p = this;
                            }
                            else {
                                p = new p(m.G1(this.v(), 0, 64));
                            }
                            sb2.append(p.E());
                            sb = sb2;
                            break Label_0369;
                        }
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("endIndex > length(");
                        sb3.append(this.v().length);
                        sb3.append(')');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                }
                else {
                    final String u0 = this.U0();
                    Objects.requireNonNull(u0, "null cannot be cast to non-null type java.lang.String");
                    final String substring = u0.substring(0, a);
                    k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                    final String k2 = s.k2(s.k2(s.k2(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                    if (a < u0.length()) {
                        sb = new StringBuilder();
                        sb.append("[size=");
                        sb.append(this.v().length);
                        sb.append(" text=");
                        sb.append(k2);
                        break Label_0369;
                    }
                    sb = new StringBuilder();
                    sb.append("[text=");
                    sb.append(k2);
                }
                sb.append(']');
                return sb.toString();
            }
            sb.append("\u2026]");
            return sb.toString();
        }
        return "[size=0]";
    }
    
    @g(name = "getByte")
    public final byte u(final int n) {
        return this.b0(n);
    }
    
    public boolean u0(final int n, @e final p p4, final int n2, final int n3) {
        k0.p((Object)p4, "other");
        return p4.v0(n2, this.v(), n, n3);
    }
    
    @e
    public final byte[] v() {
        return this.I;
    }
    
    public boolean v0(final int n, @e final byte[] array, final int n2, final int n3) {
        k0.p((Object)array, "other");
        return n >= 0 && n <= this.v().length - n3 && n2 >= 0 && n2 <= array.length - n3 && j.d(this.v(), n, array, n2, n3);
    }
    
    public final int y() {
        return this.G;
    }
    
    public int z() {
        return this.v().length;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003H\u0007J'\u0010\n\u001a\u00020\u0005*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u0005*\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0010\u001a\u00020\u0005*\u00020\u000fH\u0007J\u001d\u0010\u0013\u001a\u00020\u0005*\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u0005*\u00020\u000fH\u0007J\f\u0010\u0016\u001a\u00020\u0005*\u00020\u000fH\u0007J\u001b\u0010\u0018\u001a\u00020\u0005*\u00020\u00172\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001e\u0010\u0014J\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\fH\u0007¢\u0006\u0004\b!\u0010\u000eJ'\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b#\u0010\u000bJ\u001f\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b%\u0010\u0019R\u0016\u0010&\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-" }, d2 = { "okio/p$a", "", "", "", "data", "Lokio/p;", "n", "", "offset", "byteCount", "o", "([BII)Lokio/p;", "Ljava/nio/ByteBuffer;", "m", "(Ljava/nio/ByteBuffer;)Lokio/p;", "", "l", "Ljava/nio/charset/Charset;", "charset", "j", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/p;", "h", "i", "Ljava/io/InputStream;", "q", "(Ljava/io/InputStream;I)Lokio/p;", "string", "a", "(Ljava/lang/String;)Lokio/p;", "b", "c", "d", "buffer", "e", "array", "f", "inputstream", "g", "EMPTY", "Lokio/p;", "", "serialVersionUID", "J", "<init>", "()V", "okio" }, k = 1, mv = { 1, 4, 1 })
    public static final class a
    {
        private a() {
        }
        
        @kotlin.i(level = kotlin.k.H, message = "moved to extension function", replaceWith = @z0(expression = "string.decodeBase64()", imports = { "okio.ByteString.Companion.decodeBase64" }))
        @g(name = "-deprecated_decodeBase64")
        @f
        public final p a(@e final String s) {
            k0.p((Object)s, "string");
            return this.h(s);
        }
        
        @kotlin.i(level = kotlin.k.H, message = "moved to extension function", replaceWith = @z0(expression = "string.decodeHex()", imports = { "okio.ByteString.Companion.decodeHex" }))
        @g(name = "-deprecated_decodeHex")
        @e
        public final p b(@e final String s) {
            k0.p((Object)s, "string");
            return this.i(s);
        }
        
        @kotlin.i(level = kotlin.k.H, message = "moved to extension function", replaceWith = @z0(expression = "string.encode(charset)", imports = { "okio.ByteString.Companion.encode" }))
        @g(name = "-deprecated_encodeString")
        @e
        public final p c(@e final String s, @e final Charset charset) {
            k0.p((Object)s, "string");
            k0.p((Object)charset, "charset");
            return this.j(s, charset);
        }
        
        @kotlin.i(level = kotlin.k.H, message = "moved to extension function", replaceWith = @z0(expression = "string.encodeUtf8()", imports = { "okio.ByteString.Companion.encodeUtf8" }))
        @g(name = "-deprecated_encodeUtf8")
        @e
        public final p d(@e final String s) {
            k0.p((Object)s, "string");
            return this.l(s);
        }
        
        @kotlin.i(level = kotlin.k.H, message = "moved to extension function", replaceWith = @z0(expression = "buffer.toByteString()", imports = { "okio.ByteString.Companion.toByteString" }))
        @g(name = "-deprecated_of")
        @e
        public final p e(@e final ByteBuffer byteBuffer) {
            k0.p((Object)byteBuffer, "buffer");
            return this.m(byteBuffer);
        }
        
        @kotlin.i(level = kotlin.k.H, message = "moved to extension function", replaceWith = @z0(expression = "array.toByteString(offset, byteCount)", imports = { "okio.ByteString.Companion.toByteString" }))
        @g(name = "-deprecated_of")
        @e
        public final p f(@e final byte[] array, final int n, final int n2) {
            k0.p((Object)array, "array");
            return this.o(array, n, n2);
        }
        
        @kotlin.i(level = kotlin.k.H, message = "moved to extension function", replaceWith = @z0(expression = "inputstream.readByteString(byteCount)", imports = { "okio.ByteString.Companion.readByteString" }))
        @g(name = "-deprecated_read")
        @e
        public final p g(@e final InputStream inputStream, final int n) {
            k0.p((Object)inputStream, "inputstream");
            return this.q(inputStream, n);
        }
        
        @k
        @f
        public final p h(@e final String s) {
            k0.p((Object)s, "$this$decodeBase64");
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
        
        @k
        @e
        public final p i(@e final String str) {
            k0.p((Object)str, "$this$decodeHex");
            final int length = str.length();
            final int n = 0;
            if (length % 2 == 0) {
                final int n2 = str.length() / 2;
                final byte[] array = new byte[n2];
                for (int i = n; i < n2; ++i) {
                    final int index = i * 2;
                    array[i] = (byte)((b.b(str.charAt(index)) << 4) + b.b(str.charAt(index + 1)));
                }
                return new p(array);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Unexpected hex string: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @k
        @g(name = "encodeString")
        @e
        public final p j(@e final String s, @e final Charset charset) {
            k0.p((Object)s, "$this$encode");
            k0.p((Object)charset, "charset");
            final byte[] bytes = s.getBytes(charset);
            k0.o((Object)bytes, "(this as java.lang.String).getBytes(charset)");
            return new p(bytes);
        }
        
        @k
        @e
        public final p l(@e final String s) {
            k0.p((Object)s, "$this$encodeUtf8");
            final p p = new p(i.a(s));
            p.B0(s);
            return p;
        }
        
        @k
        @g(name = "of")
        @e
        public final p m(@e final ByteBuffer byteBuffer) {
            k0.p((Object)byteBuffer, "$this$toByteString");
            final byte[] dst = new byte[byteBuffer.remaining()];
            byteBuffer.get(dst);
            return new p(dst);
        }
        
        @k
        @e
        public final p n(@e byte... copy) {
            k0.p((Object)copy, "data");
            copy = Arrays.copyOf(copy, copy.length);
            k0.o((Object)copy, "java.util.Arrays.copyOf(this, size)");
            return new p(copy);
        }
        
        @k
        @g(name = "of")
        @e
        public final p o(@e final byte[] array, final int n, final int n2) {
            k0.p((Object)array, "$this$toByteString");
            j.e(array.length, n, n2);
            return new p(m.G1(array, n, n2 + n));
        }
        
        @k
        @g(name = "read")
        @e
        public final p q(@e final InputStream inputStream, final int i) throws IOException {
            k0.p((Object)inputStream, "$this$readByteString");
            final int n = 0;
            if (i >= 0) {
                final byte[] b = new byte[i];
                int read;
                for (int j = n; j < i; j += read) {
                    read = inputStream.read(b, j, i - j);
                    if (read == -1) {
                        throw new EOFException();
                    }
                }
                return new p(b);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }
}
