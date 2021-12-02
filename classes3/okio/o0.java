// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.security.MessageDigest;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.f;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.collections.m;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import java.util.Objects;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001e0@\u0012\u0006\u0010?\u001a\u00020:¢\u0006\u0004\bF\u0010GJ\b\u0010\u0002\u001a\u00020\u0001H\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0001H\u0016J\b\u0010\f\u001a\u00020\u0001H\u0016J\u0017\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020 H\u0016J\u0010\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016J'\u0010*\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0014H\u0010¢\u0006\u0004\b*\u0010+J(\u0010/\u001a\u00020.2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0014H\u0016J(\u00100\u001a\u00020.2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0014H\u0016J\u0018\u00102\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u0014H\u0016J\u0018\u00103\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u0014H\u0016J\u000f\u00104\u001a\u00020\u001eH\u0010¢\u0006\u0004\b4\u00105J\u0013\u00107\u001a\u00020.2\b\u0010,\u001a\u0004\u0018\u000106H\u0096\u0002J\b\u00108\u001a\u00020\u0014H\u0016J\b\u00109\u001a\u00020\u0007H\u0016R\u001c\u0010?\u001a\u00020:8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\"\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001e0@8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006H" }, d2 = { "Lokio/o0;", "Lokio/p;", "b1", "Ljava/lang/Object;", "c1", "Ljava/nio/charset/Charset;", "charset", "", "J0", "g", "E", "R0", "S0", "algorithm", "l", "(Ljava/lang/String;)Lokio/p;", "key", "G", "(Ljava/lang/String;Lokio/p;)Lokio/p;", "h", "", "beginIndex", "endIndex", "O0", "pos", "", "b0", "(I)B", "z", "()I", "", "T0", "Ljava/nio/ByteBuffer;", "f", "Ljava/io/OutputStream;", "out", "Lkotlin/j2;", "V0", "Lokio/m;", "buffer", "offset", "byteCount", "W0", "(Lokio/m;II)V", "other", "otherOffset", "", "u0", "v0", "fromIndex", "T", "l0", "a0", "()[B", "", "equals", "hashCode", "toString", "", "N", "[I", "Y0", "()[I", "directory", "", "M", "[[B", "Z0", "()[[B", "segments", "<init>", "([[B[I)V", "okio" }, k = 1, mv = { 1, 4, 1 })
public final class o0 extends p
{
    @e
    private final transient byte[][] M;
    @e
    private final transient int[] N;
    
    public o0(@e final byte[][] m, @e final int[] n) {
        k0.p((Object)m, "segments");
        k0.p((Object)n, "directory");
        super(p.K.v());
        this.M = m;
        this.N = n;
    }
    
    private final p b1() {
        return new p(this.T0());
    }
    
    private final Object c1() {
        final p b1 = this.b1();
        Objects.requireNonNull(b1, "null cannot be cast to non-null type java.lang.Object");
        return b1;
    }
    
    @e
    @Override
    public String E() {
        return this.b1().E();
    }
    
    @e
    @Override
    public p G(@e final String s, @e final p p2) {
        k0.p((Object)s, "algorithm");
        k0.p((Object)p2, "key");
        try {
            final Mac instance = Mac.getInstance(s);
            instance.init(new SecretKeySpec(p2.T0(), s));
            final int length = this.Z0().length;
            int i = 0;
            int n = 0;
            while (i < length) {
                final int offset = this.Y0()[length + i];
                final int n2 = this.Y0()[i];
                instance.update(this.Z0()[i], offset, n2 - n);
                ++i;
                n = n2;
            }
            final byte[] doFinal = instance.doFinal();
            k0.o((Object)doFinal, "mac.doFinal()");
            return new p(doFinal);
        }
        catch (InvalidKeyException cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    @e
    @Override
    public String J0(@e final Charset charset) {
        k0.p((Object)charset, "charset");
        return this.b1().J0(charset);
    }
    
    @e
    @Override
    public p O0(final int n, int n2) {
        final int n3 = 0;
        if (n < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("beginIndex=");
            sb.append(n);
            sb.append(" < 0");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (n2 > this.size()) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex=");
            sb2.append(n2);
            sb2.append(" > length(");
            sb2.append(this.size());
            sb2.append(')');
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        final int b = n2 - n;
        if (b >= 0) {
            p k;
            if (n == 0 && n2 == this.size()) {
                k = this;
            }
            else if (n == n2) {
                k = p.K;
            }
            else {
                final int n4 = okio.internal.e.n(this, n);
                final int n5 = okio.internal.e.n(this, n2 - 1);
                final byte[][] array = (byte[][])m.M1((Object[])this.Z0(), n4, n5 + 1);
                final int[] array2 = new int[array.length * 2];
                if (n4 <= n5) {
                    n2 = n4;
                    int n6 = 0;
                    while (true) {
                        array2[n6] = Math.min(this.Y0()[n2] - n, b);
                        array2[n6 + array.length] = this.Y0()[this.Z0().length + n2];
                        if (n2 == n5) {
                            break;
                        }
                        ++n2;
                        ++n6;
                    }
                }
                if (n4 == 0) {
                    n2 = n3;
                }
                else {
                    n2 = this.Y0()[n4 - 1];
                }
                final int length = array.length;
                array2[length] += n - n2;
                k = new o0(array, array2);
            }
            return k;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("endIndex=");
        sb3.append(n2);
        sb3.append(" < beginIndex=");
        sb3.append(n);
        throw new IllegalArgumentException(sb3.toString().toString());
    }
    
    @e
    @Override
    public p R0() {
        return this.b1().R0();
    }
    
    @e
    @Override
    public p S0() {
        return this.b1().S0();
    }
    
    @Override
    public int T(@e final byte[] array, final int n) {
        k0.p((Object)array, "other");
        return this.b1().T(array, n);
    }
    
    @e
    @Override
    public byte[] T0() {
        final byte[] array = new byte[this.size()];
        final int length = this.Z0().length;
        int i = 0;
        int n = 0;
        int n2 = 0;
        while (i < length) {
            final int n3 = this.Y0()[length + i];
            final int n4 = this.Y0()[i];
            final byte[] array2 = this.Z0()[i];
            final int n5 = n4 - n;
            m.W0(array2, array, n2, n3, n3 + n5);
            n2 += n5;
            ++i;
            n = n4;
        }
        return array;
    }
    
    @Override
    public void V0(@e final OutputStream outputStream) throws IOException {
        k0.p((Object)outputStream, "out");
        final int length = this.Z0().length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final int off = this.Y0()[length + i];
            final int n2 = this.Y0()[i];
            outputStream.write(this.Z0()[i], off, n2 - n);
            ++i;
            n = n2;
        }
    }
    
    @Override
    public void W0(@e final okio.m m, int n, final int n2) {
        k0.p((Object)m, "buffer");
        final int a = n + n2;
        final int n3 = okio.internal.e.n(this, n);
        int i;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        m0 g;
        m0 g2;
        m0 g3;
        for (i = n, n = n3; i < a; i += n7, ++n) {
            if (n == 0) {
                n4 = 0;
            }
            else {
                n4 = this.Y0()[n - 1];
            }
            n5 = this.Y0()[n];
            n6 = this.Y0()[this.Z0().length + n];
            n7 = Math.min(a, n5 - n4 + n4) - i;
            n8 = n6 + (i - n4);
            g = new m0(this.Z0()[n], n8, n8 + n7, true, false);
            g2 = m.G;
            if (g2 == null) {
                g.g = g;
                g.f = g;
                m.G = g;
            }
            else {
                k0.m((Object)g2);
                g3 = g2.g;
                k0.m((Object)g3);
                g3.c(g);
            }
        }
        m.d0(m.h0() + n2);
    }
    
    @e
    public final int[] Y0() {
        return this.N;
    }
    
    @e
    public final byte[][] Z0() {
        return this.M;
    }
    
    @e
    @Override
    public byte[] a0() {
        return this.T0();
    }
    
    @Override
    public byte b0(final int n) {
        j.e(this.Y0()[this.Z0().length - 1], n, 1L);
        final int n2 = okio.internal.e.n(this, n);
        int n3;
        if (n2 == 0) {
            n3 = 0;
        }
        else {
            n3 = this.Y0()[n2 - 1];
        }
        return this.Z0()[n2][n - n3 + this.Y0()[this.Z0().length + n2]];
    }
    
    @Override
    public boolean equals(@f final Object o) {
        boolean b = true;
        if (o != this) {
            if (o instanceof p) {
                final p p = (p)o;
                if (p.size() == this.size() && this.u0(0, p, 0, this.size())) {
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
    
    @e
    @Override
    public ByteBuffer f() {
        final ByteBuffer readOnlyBuffer = ByteBuffer.wrap(this.T0()).asReadOnlyBuffer();
        k0.o((Object)readOnlyBuffer, "ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer()");
        return readOnlyBuffer;
    }
    
    @e
    @Override
    public String g() {
        return this.b1().g();
    }
    
    @e
    @Override
    public String h() {
        return this.b1().h();
    }
    
    @Override
    public int hashCode() {
        int y = this.y();
        if (y == 0) {
            final int length = this.Z0().length;
            int i = 0;
            y = 1;
            int n = 0;
            while (i < length) {
                final int n2 = this.Y0()[length + i];
                final int n3 = this.Y0()[i];
                final byte[] array = this.Z0()[i];
                for (int j = n2; j < n3 - n + n2; ++j) {
                    y = y * 31 + array[j];
                }
                ++i;
                n = n3;
            }
            this.A0(y);
        }
        return y;
    }
    
    @e
    @Override
    public p l(@e final String algorithm) {
        k0.p((Object)algorithm, "algorithm");
        final MessageDigest instance = MessageDigest.getInstance(algorithm);
        final int length = this.Z0().length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final int offset = this.Y0()[length + i];
            final int n2 = this.Y0()[i];
            instance.update(this.Z0()[i], offset, n2 - n);
            ++i;
            n = n2;
        }
        final byte[] digest = instance.digest();
        k0.o((Object)digest, "digestBytes");
        return new p(digest);
    }
    
    @Override
    public int l0(@e final byte[] array, final int n) {
        k0.p((Object)array, "other");
        return this.b1().l0(array, n);
    }
    
    @e
    @Override
    public String toString() {
        return this.b1().toString();
    }
    
    @Override
    public boolean u0(int i, @e final p p4, int n, int n2) {
        k0.p((Object)p4, "other");
        boolean b2;
        final boolean b = b2 = false;
        if (i >= 0) {
            if (i > this.size() - n2) {
                b2 = b;
            }
            else {
                final int a = n2 + i;
                final int n3 = okio.internal.e.n(this, i);
                n2 = n;
                int n4;
                int n5;
                int n6;
                int n7;
                for (n = n3; i < a; i += n7, ++n) {
                    if (n == 0) {
                        n4 = 0;
                    }
                    else {
                        n4 = this.Y0()[n - 1];
                    }
                    n5 = this.Y0()[n];
                    n6 = this.Y0()[this.Z0().length + n];
                    n7 = Math.min(a, n5 - n4 + n4) - i;
                    if (!p4.v0(n2, this.Z0()[n], n6 + (i - n4), n7)) {
                        b2 = b;
                        return b2;
                    }
                    n2 += n7;
                }
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public boolean v0(int n, @e final byte[] array, int n2, int i) {
        k0.p((Object)array, "other");
        boolean b2;
        final boolean b = b2 = false;
        if (n >= 0) {
            b2 = b;
            if (n <= this.size() - i) {
                b2 = b;
                if (n2 >= 0) {
                    if (n2 > array.length - i) {
                        b2 = b;
                    }
                    else {
                        final int a = i + n;
                        final int n3 = okio.internal.e.n(this, n);
                        int n4;
                        int n5;
                        int n6;
                        int n7;
                        for (i = n, n = n3; i < a; i += n7, ++n) {
                            if (n == 0) {
                                n4 = 0;
                            }
                            else {
                                n4 = this.Y0()[n - 1];
                            }
                            n5 = this.Y0()[n];
                            n6 = this.Y0()[this.Z0().length + n];
                            n7 = Math.min(a, n5 - n4 + n4) - i;
                            if (!j.d(this.Z0()[n], n6 + (i - n4), array, n2, n7)) {
                                b2 = b;
                                return b2;
                            }
                            n2 += n7;
                        }
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    @Override
    public int z() {
        return this.Y0()[this.Z0().length - 1];
    }
}
