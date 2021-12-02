// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.OutputStream;

public final class f
{
    private final byte[] a;
    private final int b;
    private int c;
    private int d;
    private final OutputStream e;
    
    private f(final OutputStream e, final byte[] a) {
        this.d = 0;
        this.e = e;
        this.a = a;
        this.c = 0;
        this.b = a.length;
    }
    
    public static int A(final int n, final long n2) {
        return D(n) + B(n2);
    }
    
    public static int B(final long n) {
        return w(H(n));
    }
    
    public static int C(final String s) {
        try {
            final byte[] bytes = s.getBytes("UTF-8");
            return v(bytes.length) + bytes.length;
        }
        catch (UnsupportedEncodingException cause) {
            throw new RuntimeException("UTF-8 not supported.", cause);
        }
    }
    
    public static int D(final int n) {
        return v(z.c(n, 0));
    }
    
    public static int E(final int n) {
        return v(n);
    }
    
    public static int F(final long n) {
        return w(n);
    }
    
    public static int G(final int n) {
        return n >> 31 ^ n << 1;
    }
    
    public static long H(final long n) {
        return n >> 63 ^ n << 1;
    }
    
    public static f J(final OutputStream outputStream, final int n) {
        return new f(outputStream, new byte[n]);
    }
    
    private void K() throws IOException {
        final OutputStream e = this.e;
        if (e != null) {
            e.write(this.a, 0, this.c);
            this.c = 0;
            return;
        }
        throw new a();
    }
    
    public static int a(final int n, final boolean b) {
        return D(n) + b(b);
    }
    
    public static int b(final boolean b) {
        return 1;
    }
    
    public static int c(final byte[] array) {
        return v(array.length) + array.length;
    }
    
    public static int d(final int n, final d d) {
        return D(n) + e(d);
    }
    
    public static int e(final d d) {
        return v(d.size()) + d.size();
    }
    
    public static int f(final int n, final double n2) {
        return D(n) + g(n2);
    }
    
    public static int g(final double n) {
        return 8;
    }
    
    public static int h(final int n, final int n2) {
        return D(n) + i(n2);
    }
    
    public static int i(final int n) {
        return p(n);
    }
    
    public static int j(final int n) {
        return 4;
    }
    
    public static int k(final long n) {
        return 8;
    }
    
    public static int l(final int n, final float n2) {
        return D(n) + m(n2);
    }
    
    public static int m(final float n) {
        return 4;
    }
    
    public static int n(final q q) {
        return q.f();
    }
    
    public static int o(final int n, final int n2) {
        return D(n) + p(n2);
    }
    
    public static int p(final int n) {
        if (n >= 0) {
            return v(n);
        }
        return 10;
    }
    
    public static int q(final long n) {
        return w(n);
    }
    
    public static int r(final m m) {
        final int b = m.b();
        return v(b) + b;
    }
    
    public static int s(final int n, final q q) {
        return D(n) + t(q);
    }
    
    public static int t(final q q) {
        final int f = q.f();
        return v(f) + f;
    }
    
    static int u(final int n) {
        if (n > 4096) {
            return 4096;
        }
        return n;
    }
    
    public static int v(final int n) {
        if ((n & 0xFFFFFF80) == 0x0) {
            return 1;
        }
        if ((n & 0xFFFFC000) == 0x0) {
            return 2;
        }
        if ((0xFFE00000 & n) == 0x0) {
            return 3;
        }
        if ((n & 0xF0000000) == 0x0) {
            return 4;
        }
        return 5;
    }
    
    public static int w(final long n) {
        if ((0xFFFFFFFFFFFFFF80L & n) == 0x0L) {
            return 1;
        }
        if ((0xFFFFFFFFFFFFC000L & n) == 0x0L) {
            return 2;
        }
        if ((0xFFFFFFFFFFE00000L & n) == 0x0L) {
            return 3;
        }
        if ((0xFFFFFFFFF0000000L & n) == 0x0L) {
            return 4;
        }
        if ((0xFFFFFFF800000000L & n) == 0x0L) {
            return 5;
        }
        if ((0xFFFFFC0000000000L & n) == 0x0L) {
            return 6;
        }
        if ((0xFFFE000000000000L & n) == 0x0L) {
            return 7;
        }
        if ((0xFF00000000000000L & n) == 0x0L) {
            return 8;
        }
        if ((n & Long.MIN_VALUE) == 0x0L) {
            return 9;
        }
        return 10;
    }
    
    public static int x(final int n) {
        return 4;
    }
    
    public static int y(final long n) {
        return 8;
    }
    
    public static int z(final int n) {
        return v(G(n));
    }
    
    public void I() throws IOException {
        if (this.e != null) {
            this.K();
        }
    }
    
    public void L(final int n, final boolean b) throws IOException {
        this.w0(n, 0);
        this.M(b);
    }
    
    public void M(final boolean b) throws IOException {
        this.h0(b ? 1 : 0);
    }
    
    public void N(final byte[] array) throws IOException {
        this.o0(array.length);
        this.k0(array);
    }
    
    public void O(final int n, final d d) throws IOException {
        this.w0(n, 2);
        this.P(d);
    }
    
    public void P(final d d) throws IOException {
        this.o0(d.size());
        this.i0(d);
    }
    
    public void Q(final int n, final double n2) throws IOException {
        this.w0(n, 1);
        this.R(n2);
    }
    
    public void R(final double n) throws IOException {
        this.n0(Double.doubleToRawLongBits(n));
    }
    
    public void S(final int n, final int n2) throws IOException {
        this.w0(n, 0);
        this.T(n2);
    }
    
    public void T(final int n) throws IOException {
        this.b0(n);
    }
    
    public void U(final int n) throws IOException {
        this.m0(n);
    }
    
    public void V(final long n) throws IOException {
        this.n0(n);
    }
    
    public void W(final int n, final float n2) throws IOException {
        this.w0(n, 5);
        this.X(n2);
    }
    
    public void X(final float n) throws IOException {
        this.m0(Float.floatToRawIntBits(n));
    }
    
    public void Y(final int n, final q q) throws IOException {
        this.w0(n, 3);
        this.Z(q);
        this.w0(n, 4);
    }
    
    public void Z(final q q) throws IOException {
        q.d(this);
    }
    
    public void a0(final int n, final int n2) throws IOException {
        this.w0(n, 0);
        this.b0(n2);
    }
    
    public void b0(final int n) throws IOException {
        if (n >= 0) {
            this.o0(n);
        }
        else {
            this.p0(n);
        }
    }
    
    public void c0(final long n) throws IOException {
        this.p0(n);
    }
    
    public void d0(final int n, final q q) throws IOException {
        this.w0(n, 2);
        this.e0(q);
    }
    
    public void e0(final q q) throws IOException {
        this.o0(q.f());
        q.d(this);
    }
    
    public void f0(final int n, final q q) throws IOException {
        this.w0(1, 3);
        this.x0(2, n);
        this.d0(3, q);
        this.w0(1, 4);
    }
    
    public void g0(final byte b) throws IOException {
        if (this.c == this.b) {
            this.K();
        }
        this.a[this.c++] = b;
        ++this.d;
    }
    
    public void h0(final int n) throws IOException {
        this.g0((byte)n);
    }
    
    public void i0(final d d) throws IOException {
        this.j0(d, 0, d.size());
    }
    
    public void j0(final d d, int n, int c) throws IOException {
        final int b = this.b;
        final int c2 = this.c;
        if (b - c2 >= c) {
            d.m(this.a, n, c2, c);
            this.c += c;
        }
        else {
            final int n2 = b - c2;
            d.m(this.a, n, c2, n2);
            n += n2;
            c -= n2;
            this.c = this.b;
            this.d += n2;
            this.K();
            if (c <= this.b) {
                d.m(this.a, n, 0, c);
                this.c = c;
            }
            else {
                d.D(this.e, n, c);
            }
        }
        this.d += c;
    }
    
    public void k0(final byte[] array) throws IOException {
        this.l0(array, 0, array.length);
    }
    
    public void l0(final byte[] b, int off, int n) throws IOException {
        final int b2 = this.b;
        final int c = this.c;
        if (b2 - c >= n) {
            System.arraycopy(b, off, this.a, c, n);
            this.c += n;
        }
        else {
            final int n2 = b2 - c;
            System.arraycopy(b, off, this.a, c, n2);
            off += n2;
            n -= n2;
            this.c = this.b;
            this.d += n2;
            this.K();
            if (n <= this.b) {
                System.arraycopy(b, off, this.a, 0, n);
                this.c = n;
            }
            else {
                this.e.write(b, off, n);
            }
        }
        this.d += n;
    }
    
    public void m0(final int n) throws IOException {
        this.h0(n & 0xFF);
        this.h0(n >> 8 & 0xFF);
        this.h0(n >> 16 & 0xFF);
        this.h0(n >> 24 & 0xFF);
    }
    
    public void n0(final long n) throws IOException {
        this.h0((int)n & 0xFF);
        this.h0((int)(n >> 8) & 0xFF);
        this.h0((int)(n >> 16) & 0xFF);
        this.h0((int)(n >> 24) & 0xFF);
        this.h0((int)(n >> 32) & 0xFF);
        this.h0((int)(n >> 40) & 0xFF);
        this.h0((int)(n >> 48) & 0xFF);
        this.h0((int)(n >> 56) & 0xFF);
    }
    
    public void o0(int n) throws IOException {
        while ((n & 0xFFFFFF80) != 0x0) {
            this.h0((n & 0x7F) | 0x80);
            n >>>= 7;
        }
        this.h0(n);
    }
    
    public void p0(long n) throws IOException {
        while ((0xFFFFFFFFFFFFFF80L & n) != 0x0L) {
            this.h0(((int)n & 0x7F) | 0x80);
            n >>>= 7;
        }
        this.h0((int)n);
    }
    
    public void q0(final int n) throws IOException {
        this.m0(n);
    }
    
    public void r0(final long n) throws IOException {
        this.n0(n);
    }
    
    public void s0(final int n) throws IOException {
        this.o0(G(n));
    }
    
    public void t0(final int n, final long n2) throws IOException {
        this.w0(n, 0);
        this.u0(n2);
    }
    
    public void u0(final long n) throws IOException {
        this.p0(H(n));
    }
    
    public void v0(final String s) throws IOException {
        final byte[] bytes = s.getBytes("UTF-8");
        this.o0(bytes.length);
        this.k0(bytes);
    }
    
    public void w0(final int n, final int n2) throws IOException {
        this.o0(z.c(n, n2));
    }
    
    public void x0(final int n, final int n2) throws IOException {
        this.w0(n, 0);
        this.y0(n2);
    }
    
    public void y0(final int n) throws IOException {
        this.o0(n);
    }
    
    public void z0(final long n) throws IOException {
        this.p0(n);
    }
    
    public static class a extends IOException
    {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }
}
