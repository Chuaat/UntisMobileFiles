// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.nio.ByteBuffer;
import org.jetbrains.annotations.f;
import okio.internal.a;
import java.io.IOException;
import java.io.InputStream;
import kotlin.text.c;
import java.nio.charset.Charset;
import java.io.EOFException;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010Z\u001a\u00020W¢\u0006\u0004\b[\u0010\\J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0016H\u0016J \u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014H\u0016J\u0010\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010%\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"H\u0016J\n\u0010&\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010'\u001a\u00020\u001fH\u0016J\u0010\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0005H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\b\u0010,\u001a\u00020+H\u0016J\b\u0010-\u001a\u00020+H\u0016J\b\u0010.\u001a\u00020\u0014H\u0016J\b\u0010/\u001a\u00020\u0014H\u0016J\b\u00100\u001a\u00020\u0005H\u0016J\b\u00101\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u00020\u0005H\u0016J\b\u00103\u001a\u00020\u0005H\u0016J\u0010\u00104\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u00106\u001a\u00020\u00052\u0006\u00105\u001a\u00020\rH\u0016J\u0018\u00108\u001a\u00020\u00052\u0006\u00105\u001a\u00020\r2\u0006\u00107\u001a\u00020\u0005H\u0016J \u0010:\u001a\u00020\u00052\u0006\u00105\u001a\u00020\r2\u0006\u00107\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0016J\u0010\u0010<\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u000fH\u0016J\u0018\u0010=\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0005H\u0016J\u0010\u0010?\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u000fH\u0016J\u0018\u0010@\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0005H\u0016J\u0018\u0010A\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u000fH\u0016J(\u0010C\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014H\u0016J\b\u0010D\u001a\u00020\u0001H\u0016J\b\u0010F\u001a\u00020EH\u0016J\b\u0010G\u001a\u00020\bH\u0016J\b\u0010H\u001a\u00020\nH\u0016J\b\u0010J\u001a\u00020IH\u0016J\b\u0010K\u001a\u00020\u001fH\u0016R\u001d\u0010P\u001a\u00020\u00028\u00d6\u0002@\u0016X\u0096\u0004¢\u0006\f\u0012\u0004\bN\u0010O\u001a\u0004\bL\u0010MR\u0016\u0010S\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010V\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Z\u001a\u00020W8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006]" }, d2 = { "Lokio/l0;", "Lokio/o;", "Lokio/m;", "m", "sink", "", "byteCount", "read", "", "D1", "Lkotlin/j2;", "B5", "v", "", "readByte", "Lokio/p;", "D3", "E0", "Lokio/g0;", "options", "", "P5", "", "s1", "v4", "readFully", "offset", "Ljava/nio/ByteBuffer;", "S1", "Lokio/p0;", "e5", "", "y4", "t0", "Ljava/nio/charset/Charset;", "charset", "b3", "I4", "Z1", "e4", "limit", "g2", "q3", "", "readShort", "P4", "readInt", "i4", "readLong", "Z4", "b2", "L5", "skip", "b", "H5", "fromIndex", "R1", "toIndex", "V1", "bytes", "y1", "v0", "targetBytes", "Y1", "y5", "Y2", "bytesOffset", "j4", "peek", "Ljava/io/InputStream;", "N5", "isOpen", "close", "Lokio/t0;", "timeout", "toString", "z", "()Lokio/m;", "getBuffer$annotations", "()V", "buffer", "G", "Lokio/m;", "bufferField", "H", "Z", "closed", "Lokio/r0;", "I", "Lokio/r0;", "source", "<init>", "(Lokio/r0;)V", "okio" }, k = 1, mv = { 1, 4, 1 })
public final class l0 implements o
{
    @d
    @e
    public final m G;
    @d
    public boolean H;
    @d
    @e
    public final r0 I;
    
    public l0(@e final r0 i) {
        k0.p((Object)i, "source");
        this.I = i;
        this.G = new m();
    }
    
    @Override
    public void B5(final long n) {
        if (this.v(n)) {
            return;
        }
        throw new EOFException();
    }
    
    @Override
    public boolean D1() {
        final boolean h = this.H;
        boolean b = true;
        if (h ^ true) {
            if (!this.G.D1() || this.I.read(this.G, 8192) != -1L) {
                b = false;
            }
            return b;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public p D3() {
        this.G.z3(this.I);
        return this.G.D3();
    }
    
    @e
    @Override
    public p E0(final long n) {
        this.B5(n);
        return this.G.E0(n);
    }
    
    @Override
    public long H5(final byte b) {
        return this.V1(b, 0L, Long.MAX_VALUE);
    }
    
    @e
    @Override
    public String I4(final long n, @e final Charset charset) {
        k0.p((Object)charset, "charset");
        this.B5(n);
        return this.G.I4(n, charset);
    }
    
    @Override
    public long L5() {
        this.B5(1L);
        int n = 0;
        while (true) {
            final int n2 = n + 1;
            if (!this.v(n2)) {
                break;
            }
            final byte f = this.G.F(n);
            if ((f < (byte)48 || f > (byte)57) && (f < (byte)97 || f > (byte)102) && (f < (byte)65 || f > (byte)70)) {
                if (n != 0) {
                    break;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9a-fA-F] character but was 0x");
                final String string = Integer.toString(f, c.a(c.a(16)));
                k0.o((Object)string, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            else {
                n = n2;
            }
        }
        return this.G.L5();
    }
    
    @e
    @Override
    public InputStream N5() {
        return new InputStream() {
            final /* synthetic */ l0 G;
            
            @Override
            public int available() {
                final l0 g = this.G;
                if (!g.H) {
                    return (int)Math.min(g.G.h0(), Integer.MAX_VALUE);
                }
                throw new IOException("closed");
            }
            
            @Override
            public void close() {
                this.G.close();
            }
            
            @Override
            public int read() {
                final l0 g = this.G;
                if (!g.H) {
                    if (g.G.h0() == 0L) {
                        final l0 g2 = this.G;
                        if (g2.I.read(g2.G, 8192) == -1L) {
                            return -1;
                        }
                    }
                    return this.G.G.readByte() & 0xFF;
                }
                throw new IOException("closed");
            }
            
            @Override
            public int read(@e final byte[] array, final int n, final int n2) {
                k0.p((Object)array, "data");
                if (!this.G.H) {
                    j.e(array.length, n, n2);
                    if (this.G.G.h0() == 0L) {
                        final l0 g = this.G;
                        if (g.I.read(g.G, 8192) == -1L) {
                            return -1;
                        }
                    }
                    return this.G.G.read(array, n, n2);
                }
                throw new IOException("closed");
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
    public short P4() {
        this.B5(2L);
        return this.G.P4();
    }
    
    @Override
    public int P5(@e final g0 g0) {
        k0.p((Object)g0, "options");
        if (this.H ^ true) {
            while (true) {
                do {
                    int k0 = a.k0(this.G, g0, true);
                    if (k0 != -2) {
                        if (k0 != -1) {
                            this.G.skip(g0.i()[k0].size());
                        }
                        else {
                            k0 = -1;
                        }
                        return k0;
                    }
                } while (this.I.read(this.G, 8192) != -1L);
                continue;
            }
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @Override
    public long R1(final byte b, final long n) {
        return this.V1(b, n, Long.MAX_VALUE);
    }
    
    @Override
    public void S1(@e final m m, final long n) {
        k0.p((Object)m, "sink");
        try {
            this.B5(n);
            this.G.S1(m, n);
        }
        catch (EOFException ex) {
            m.z3(this.G);
            throw ex;
        }
    }
    
    @Override
    public long V1(final byte b, long max, final long lng) {
        final boolean h = this.H;
        boolean b2 = true;
        if (!(h ^ true)) {
            throw new IllegalStateException("closed".toString());
        }
        Label_0038: {
            if (0L <= max) {
                if (lng >= max) {
                    break Label_0038;
                }
            }
            b2 = false;
        }
        if (b2) {
            long v1;
            while (true) {
                final long n = v1 = -1L;
                if (max >= lng) {
                    break;
                }
                v1 = this.G.V1(b, max, lng);
                if (v1 != -1L) {
                    break;
                }
                final long h2 = this.G.h0();
                v1 = n;
                if (h2 >= lng) {
                    break;
                }
                if (this.I.read(this.G, 8192) == -1L) {
                    v1 = n;
                    break;
                }
                max = Math.max(max, h2);
            }
            return v1;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("fromIndex=");
        sb.append(max);
        sb.append(" toIndex=");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString().toString());
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
    
    @f
    @Override
    public String Z1() {
        final long h5 = this.H5((byte)10);
        String s;
        if (h5 == -1L) {
            if (this.G.h0() != 0L) {
                s = this.t0(this.G.h0());
            }
            else {
                s = null;
            }
        }
        else {
            s = a.i0(this.G, h5);
        }
        return s;
    }
    
    @Override
    public long Z4() {
        this.B5(8L);
        return this.G.Z4();
    }
    
    @Override
    public long b2() {
        this.B5(1L);
        long n = 0L;
        while (true) {
            final long n2 = n + 1L;
            if (!this.v(n2)) {
                break;
            }
            final byte f = this.G.F(n);
            if (f < (byte)48 || f > (byte)57) {
                final long n3 = lcmp(n, 0L);
                if (n3 != 0 || f != (byte)45) {
                    if (n3 != 0) {
                        break;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Expected leading [0-9] or '-' character but was 0x");
                    final String string = Integer.toString(f, c.a(c.a(16)));
                    k0.o((Object)string, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))");
                    sb.append(string);
                    throw new NumberFormatException(sb.toString());
                }
            }
            n = n2;
        }
        return this.G.b2();
    }
    
    @e
    @Override
    public String b3(@e final Charset charset) {
        k0.p((Object)charset, "charset");
        this.G.z3(this.I);
        return this.G.b3(charset);
    }
    
    @Override
    public void close() {
        if (!this.H) {
            this.H = true;
            this.I.close();
            this.G.c();
        }
    }
    
    @e
    @Override
    public String e4() {
        return this.g2(Long.MAX_VALUE);
    }
    
    @Override
    public long e5(@e final p0 p) {
        k0.p((Object)p, "sink");
        long n = 0L;
        m g;
        while (true) {
            final long read = this.I.read(this.G, 8192);
            g = this.G;
            if (read == -1L) {
                break;
            }
            final long f = g.f();
            if (f <= 0L) {
                continue;
            }
            n += f;
            p.t3(this.G, f);
        }
        long n2 = n;
        if (g.h0() > 0L) {
            n2 = n + this.G.h0();
            final m g2 = this.G;
            p.t3(g2, g2.h0());
        }
        return n2;
    }
    
    @e
    @Override
    public String g2(final long n) {
        if (n >= 0L) {
            long n2;
            if (n == Long.MAX_VALUE) {
                n2 = Long.MAX_VALUE;
            }
            else {
                n2 = n + 1L;
            }
            final byte b = 10;
            final long v1 = this.V1(b, 0L, n2);
            String s;
            if (v1 != -1L) {
                s = a.i0(this.G, v1);
            }
            else {
                if (n2 >= Long.MAX_VALUE || !this.v(n2) || this.G.F(n2 - 1L) != (byte)13 || !this.v(1L + n2) || this.G.F(n2) != b) {
                    final m m = new m();
                    final m g = this.G;
                    g.s(m, 0L, Math.min(32, g.h0()));
                    final StringBuilder sb = new StringBuilder();
                    sb.append("\\n not found: limit=");
                    sb.append(Math.min(this.G.h0(), n));
                    sb.append(" content=");
                    sb.append(m.D3().E());
                    sb.append("\u2026");
                    throw new EOFException(sb.toString());
                }
                s = a.i0(this.G, n2);
            }
            return s;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("limit < 0: ");
        sb2.append(n);
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    @Override
    public int i4() {
        this.B5(4L);
        return this.G.i4();
    }
    
    @Override
    public boolean isOpen() {
        return this.H ^ true;
    }
    
    @Override
    public boolean j4(final long n, @e final p p4, final int n2, final int n3) {
        k0.p((Object)p4, "bytes");
        final boolean h = this.H;
        final boolean b = true;
        if (h ^ true) {
            if (n >= 0L && n2 >= 0 && n3 >= 0) {
                if (p4.size() - n2 >= n3) {
                    int n4 = 0;
                    while (true) {
                        final boolean b2 = b;
                        if (n4 >= n3) {
                            return b2;
                        }
                        final long n5 = n4 + n;
                        if (!this.v(1L + n5)) {
                            break;
                        }
                        if (this.G.F(n5) != p4.u(n2 + n4)) {
                            break;
                        }
                        ++n4;
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public m m() {
        return this.G;
    }
    
    @e
    @Override
    public o peek() {
        return d0.d(new i0(this));
    }
    
    @Override
    public int q3() {
        this.B5(1L);
        final byte f = this.G.F(0L);
        long n;
        if ((f & 0xE0) == 0xC0) {
            n = 2L;
        }
        else if ((f & 0xF0) == 0xE0) {
            n = 3L;
        }
        else {
            if ((f & 0xF8) != 0xF0) {
                return this.G.q3();
            }
            n = 4L;
        }
        this.B5(n);
        return this.G.q3();
    }
    
    @Override
    public int read(@e final ByteBuffer byteBuffer) {
        k0.p((Object)byteBuffer, "sink");
        if (this.G.h0() == 0L && this.I.read(this.G, 8192) == -1L) {
            return -1;
        }
        return this.G.read(byteBuffer);
    }
    
    @Override
    public int read(@e final byte[] array) {
        k0.p((Object)array, "sink");
        return this.read(array, 0, array.length);
    }
    
    @Override
    public int read(@e final byte[] array, int read, int n) {
        k0.p((Object)array, "sink");
        final long n2 = array.length;
        final long n3 = read;
        final long a = n;
        j.e(n2, n3, a);
        if (this.G.h0() == 0L && this.I.read(this.G, 8192) == -1L) {
            read = -1;
        }
        else {
            n = (int)Math.min(a, this.G.h0());
            read = this.G.read(array, read, n);
        }
        return read;
    }
    
    @Override
    public long read(@e final m m, long n) {
        k0.p((Object)m, "sink");
        if (n < 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (true ^ this.H) {
            final long h0 = this.G.h0();
            final long n2 = -1L;
            if (h0 == 0L && this.I.read(this.G, 8192) == -1L) {
                n = n2;
            }
            else {
                n = Math.min(n, this.G.h0());
                n = this.G.read(m, n);
            }
            return n;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @Override
    public byte readByte() {
        this.B5(1L);
        return this.G.readByte();
    }
    
    @Override
    public void readFully(@e final byte[] array) {
        k0.p((Object)array, "sink");
        try {
            this.B5(array.length);
            this.G.readFully(array);
        }
        catch (EOFException ex) {
            int n = 0;
            while (this.G.h0() > 0L) {
                final m g = this.G;
                final int read = g.read(array, n, (int)g.h0());
                if (read == -1) {
                    throw new AssertionError();
                }
                n += read;
            }
            throw ex;
        }
    }
    
    @Override
    public int readInt() {
        this.B5(4L);
        return this.G.readInt();
    }
    
    @Override
    public long readLong() {
        this.B5(8L);
        return this.G.readLong();
    }
    
    @Override
    public short readShort() {
        this.B5(2L);
        return this.G.readShort();
    }
    
    @e
    @Override
    public byte[] s1() {
        this.G.z3(this.I);
        return this.G.s1();
    }
    
    @Override
    public void skip(long a) {
        if (this.H ^ true) {
            while (a > 0L) {
                if (this.G.h0() == 0L && this.I.read(this.G, 8192) == -1L) {
                    throw new EOFException();
                }
                final long min = Math.min(a, this.G.h0());
                this.G.skip(min);
                a -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public String t0(final long n) {
        this.B5(n);
        return this.G.t0(n);
    }
    
    @e
    @Override
    public t0 timeout() {
        return this.I.timeout();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.I);
        sb.append(')');
        return sb.toString();
    }
    
    @Override
    public boolean v(final long lng) {
        boolean b = false;
        if (lng < 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (this.H ^ true) {
            while (this.G.h0() < lng) {
                if (this.I.read(this.G, 8192) == -1L) {
                    return b;
                }
            }
            b = true;
            return b;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @Override
    public long v0(@e final p p2, long max) {
        k0.p((Object)p2, "bytes");
        if (this.H ^ true) {
            while (true) {
                final long v0 = this.G.v0(p2, max);
                if (v0 != -1L) {
                    max = v0;
                    break;
                }
                final long h0 = this.G.h0();
                if (this.I.read(this.G, 8192) == -1L) {
                    max = -1L;
                    break;
                }
                max = Math.max(max, h0 - p2.size() + 1L);
            }
            return max;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public byte[] v4(final long n) {
        this.B5(n);
        return this.G.v4(n);
    }
    
    @Override
    public long y1(@e final p p) {
        k0.p((Object)p, "bytes");
        return this.v0(p, 0L);
    }
    
    @e
    @Override
    public String y4() {
        this.G.z3(this.I);
        return this.G.y4();
    }
    
    @Override
    public long y5(@e final p p2, long max) {
        k0.p((Object)p2, "targetBytes");
        if (this.H ^ true) {
            while (true) {
                final long y5 = this.G.y5(p2, max);
                if (y5 != -1L) {
                    max = y5;
                    break;
                }
                final long h0 = this.G.h0();
                if (this.I.read(this.G, 8192) == -1L) {
                    max = -1L;
                    break;
                }
                max = Math.max(max, h0);
            }
            return max;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @e
    @Override
    public m z() {
        return this.G;
    }
}
