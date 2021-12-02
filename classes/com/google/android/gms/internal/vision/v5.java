// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Objects;
import java.util.logging.Level;
import java.io.IOException;
import java.util.logging.Logger;

public abstract class v5 extends c5
{
    private static final Logger b;
    private static final boolean c;
    y5 a;
    
    static {
        b = Logger.getLogger(v5.class.getName());
        c = r9.m();
    }
    
    private v5() {
    }
    
    public static int A(final float n) {
        return 4;
    }
    
    public static int A0(final int n) {
        return 4;
    }
    
    public static int B(final int n, final double n2) {
        return p0(n << 3) + 8;
    }
    
    public static int B0(final int n, final int n2) {
        return p0(n << 3) + 4;
    }
    
    public static int C(final int n, final float n2) {
        return p0(n << 3) + 4;
    }
    
    public static int C0(final int n) {
        return l0(n);
    }
    
    public static int D(final int n, final h7 h7) {
        return (p0(8) << 1) + q0(2, n) + c(3, h7);
    }
    
    public static int D0(final int n, final int n2) {
        return p0(n << 3) + l0(n2);
    }
    
    public static int E(final int n, final z7 z7) {
        return (p0(8) << 1) + q0(2, n) + (p0(24) + J(z7));
    }
    
    @Deprecated
    public static int E0(final int n) {
        return p0(n);
    }
    
    static int F(final int n, final z7 z7, final s8 s8) {
        return p0(n << 3) + e(z7, s8);
    }
    
    private static int F0(final int n) {
        return n >> 31 ^ n << 1;
    }
    
    public static int G(final int n, final String s) {
        return p0(n << 3) + K(s);
    }
    
    public static int H(final int n, final boolean b) {
        return p0(n << 3) + 1;
    }
    
    public static int I(final f5 f5) {
        final int f6 = f5.f();
        return p0(f6) + f6;
    }
    
    public static int J(final z7 z7) {
        final int q = z7.q();
        return p0(q) + q;
    }
    
    public static int K(final String s) {
        int n;
        try {
            n = u9.d(s);
        }
        catch (x9 x9) {
            n = s.getBytes(t6.a).length;
        }
        return p0(n) + n;
    }
    
    public static int L(final boolean b) {
        return 1;
    }
    
    public static int M(final byte[] array) {
        final int length = array.length;
        return p0(length) + length;
    }
    
    public static int U(int f, final f5 f2) {
        final int p2 = p0(f << 3);
        f = f2.f();
        return p2 + (p0(f) + f);
    }
    
    @Deprecated
    static int V(int n, final z7 z7, final s8 s8) {
        final int p3 = p0(n << 3);
        final r4 r4 = (r4)z7;
        if ((n = r4.f()) == -1) {
            n = s8.c(r4);
            r4.c(n);
        }
        return (p3 << 1) + n;
    }
    
    @Deprecated
    public static int W(final z7 z7) {
        return z7.q();
    }
    
    public static int c(int p2, final h7 h7) {
        p2 = p0(p2 << 3);
        final int b = h7.b();
        return p2 + (p0(b) + b);
    }
    
    public static int c0(final int n, final long n2) {
        return p0(n << 3) + j0(n2);
    }
    
    public static int d(final h7 h7) {
        final int b = h7.b();
        return p0(b) + b;
    }
    
    public static int d0(final int n, final f5 f5) {
        return (p0(8) << 1) + q0(2, n) + U(3, f5);
    }
    
    static int e(final z7 z7, final s8 s8) {
        final r4 r4 = (r4)z7;
        int n;
        if ((n = r4.f()) == -1) {
            n = s8.c(r4);
            r4.c(n);
        }
        return p0(n) + n;
    }
    
    public static int e0(final long n) {
        return j0(n);
    }
    
    public static v5 f(final byte[] array) {
        return new a(array, 0, array.length);
    }
    
    public static int h0(final int n) {
        return p0(n << 3);
    }
    
    public static int i0(final int n, final long n2) {
        return p0(n << 3) + j0(n2);
    }
    
    public static int j0(long n) {
        if ((0xFFFFFFFFFFFFFF80L & n) == 0x0L) {
            return 1;
        }
        if (n < 0L) {
            return 10;
        }
        int n2;
        if ((0xFFFFFFF800000000L & n) != 0x0L) {
            n2 = 6;
            n >>>= 28;
        }
        else {
            n2 = 2;
        }
        int n3 = n2;
        long n4 = n;
        if ((0xFFFFFFFFFFE00000L & n) != 0x0L) {
            n3 = n2 + 2;
            n4 = n >>> 14;
        }
        int n5 = n3;
        if ((n4 & 0xFFFFFFFFFFFFC000L) != 0x0L) {
            n5 = n3 + 1;
        }
        return n5;
    }
    
    public static int l0(final int n) {
        if (n >= 0) {
            return p0(n);
        }
        return 10;
    }
    
    public static int m0(final int n, final int n2) {
        return p0(n << 3) + l0(n2);
    }
    
    public static int n0(final int n, final long n2) {
        return p0(n << 3) + j0(z0(n2));
    }
    
    public static int o0(final long n) {
        return j0(z0(n));
    }
    
    public static int p0(final int n) {
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
    
    public static int q0(final int n, final int n2) {
        return p0(n << 3) + p0(n2);
    }
    
    public static int r0(final int n, final long n2) {
        return p0(n << 3) + 8;
    }
    
    public static int s0(final long n) {
        return 8;
    }
    
    public static int t0(final int n) {
        return p0(F0(n));
    }
    
    public static int u0(final int n, final int n2) {
        return p0(n << 3) + p0(F0(n2));
    }
    
    public static int v0(final int n, final long n2) {
        return p0(n << 3) + 8;
    }
    
    public static int w0(final long n) {
        return 8;
    }
    
    public static int x0(final int n) {
        return 4;
    }
    
    public static int y0(final int n, final int n2) {
        return p0(n << 3) + 4;
    }
    
    public static int z(final double n) {
        return 8;
    }
    
    private static long z0(final long n) {
        return n >> 63 ^ n << 1;
    }
    
    public final void N() {
        if (this.b() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }
    
    public abstract void O(final int p0) throws IOException;
    
    public abstract void P(final int p0, final int p1) throws IOException;
    
    public final void Q(final int n, final long n2) throws IOException {
        this.n(n, z0(n2));
    }
    
    public abstract void R(final int p0, final f5 p1) throws IOException;
    
    public final void S(final long n) throws IOException {
        this.t(z0(n));
    }
    
    abstract void T(final byte[] p0, final int p1, final int p2) throws IOException;
    
    public final void X(final int n) throws IOException {
        this.O(F0(n));
    }
    
    public abstract void Y(final int p0, final int p1) throws IOException;
    
    public abstract void Z(final int p0, final long p1) throws IOException;
    
    public abstract void a0(final long p0) throws IOException;
    
    public abstract int b();
    
    public abstract void f0(final int p0) throws IOException;
    
    public abstract void g(final byte p0) throws IOException;
    
    public final void g0(final int n, final int n2) throws IOException {
        this.Y(n, F0(n2));
    }
    
    public final void h(final double n) throws IOException {
        this.a0(Double.doubleToRawLongBits(n));
    }
    
    public final void i(final float n) throws IOException {
        this.f0(Float.floatToRawIntBits(n));
    }
    
    public abstract void j(final int p0) throws IOException;
    
    public final void k(final int n, final double n2) throws IOException {
        this.Z(n, Double.doubleToRawLongBits(n2));
    }
    
    public abstract void k0(final int p0, final int p1) throws IOException;
    
    public final void l(final int n, final float n2) throws IOException {
        this.k0(n, Float.floatToRawIntBits(n2));
    }
    
    public abstract void m(final int p0, final int p1) throws IOException;
    
    public abstract void n(final int p0, final long p1) throws IOException;
    
    public abstract void o(final int p0, final f5 p1) throws IOException;
    
    public abstract void p(final int p0, final z7 p1) throws IOException;
    
    abstract void q(final int p0, final z7 p1, final s8 p2) throws IOException;
    
    public abstract void r(final int p0, final String p1) throws IOException;
    
    public abstract void s(final int p0, final boolean p1) throws IOException;
    
    public abstract void t(final long p0) throws IOException;
    
    public abstract void u(final f5 p0) throws IOException;
    
    public abstract void v(final z7 p0) throws IOException;
    
    public abstract void w(final String p0) throws IOException;
    
    final void x(final String s, final x9 thrown) throws IOException {
        v5.b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", thrown);
        final byte[] bytes = s.getBytes(t6.a);
        try {
            this.O(bytes.length);
            this.a(bytes, 0, bytes.length);
        }
        catch (b b) {
            throw b;
        }
        catch (IndexOutOfBoundsException ex) {
            throw new b(ex);
        }
    }
    
    public final void y(final boolean b) throws IOException {
        this.g((byte)(b ? 1 : 0));
    }
    
    private static final class a extends v5
    {
        private final byte[] d;
        private final int e;
        private final int f;
        private int g;
        
        a(final byte[] array, final int n, final int n2) {
            super(null);
            Objects.requireNonNull(array, "buffer");
            if ((n2 | 0x0 | array.length - n2) >= 0) {
                this.d = array;
                this.e = 0;
                this.g = 0;
                this.f = n2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", array.length, 0, n2));
        }
        
        private final void G0(final byte[] array, final int n, final int i) throws IOException {
            try {
                System.arraycopy(array, n, this.d, this.g, i);
                this.g += i;
            }
            catch (IndexOutOfBoundsException ex) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", this.g, this.f, i), ex);
            }
        }
        
        @Override
        public final void O(int n) throws IOException {
            int n2 = n;
            if (v5.c) {
                n2 = n;
                if (!u4.b()) {
                    n2 = n;
                    if (this.b() >= 5) {
                        if ((n & 0xFFFFFF80) == 0x0) {
                            r9.l(this.d, this.g++, (byte)n);
                            return;
                        }
                        r9.l(this.d, this.g++, (byte)(n | 0x80));
                        n >>>= 7;
                        if ((n & 0xFFFFFF80) == 0x0) {
                            r9.l(this.d, this.g++, (byte)n);
                            return;
                        }
                        r9.l(this.d, this.g++, (byte)(n | 0x80));
                        n >>>= 7;
                        if ((n & 0xFFFFFF80) == 0x0) {
                            r9.l(this.d, this.g++, (byte)n);
                            return;
                        }
                        r9.l(this.d, this.g++, (byte)(n | 0x80));
                        n >>>= 7;
                        if ((n & 0xFFFFFF80) == 0x0) {
                            r9.l(this.d, this.g++, (byte)n);
                            return;
                        }
                        r9.l(this.d, this.g++, (byte)(n | 0x80));
                        r9.l(this.d, this.g++, (byte)(n >>> 7));
                        return;
                    }
                }
            }
            while (true) {
                Label_0349: {
                    if ((n2 & 0xFFFFFF80) != 0x0) {
                        break Label_0349;
                    }
                    try {
                        final byte[] d = this.d;
                        n = this.g++;
                        d[n] = (byte)n2;
                        return;
                        final byte[] d2 = this.d;
                        n = this.g++;
                        d2[n] = (byte)((n2 & 0x7F) | 0x80);
                        n2 >>>= 7;
                    }
                    catch (IndexOutOfBoundsException ex) {
                        throw new b(String.format("Pos: %d, limit: %d, len: %d", this.g, this.f, 1), ex);
                    }
                }
            }
        }
        
        @Override
        public final void P(final int n, final int n2) throws IOException {
            this.m(n, 0);
            this.j(n2);
        }
        
        @Override
        public final void R(final int n, final f5 f5) throws IOException {
            this.m(1, 3);
            this.Y(2, n);
            this.o(3, f5);
            this.m(1, 4);
        }
        
        public final void T(final byte[] array, final int n, final int n2) throws IOException {
            this.O(n2);
            this.G0(array, 0, n2);
        }
        
        @Override
        public final void Y(final int n, final int n2) throws IOException {
            this.m(n, 0);
            this.O(n2);
        }
        
        @Override
        public final void Z(final int n, final long n2) throws IOException {
            this.m(n, 1);
            this.a0(n2);
        }
        
        @Override
        public final void a(final byte[] array, final int n, final int n2) throws IOException {
            this.G0(array, n, n2);
        }
        
        @Override
        public final void a0(final long n) throws IOException {
            try {
                final byte[] d = this.d;
                final int g = this.g;
                final int g2 = g + 1;
                this.g = g2;
                d[g] = (byte)n;
                final int g3 = g2 + 1;
                this.g = g3;
                d[g2] = (byte)(n >> 8);
                final int g4 = g3 + 1;
                this.g = g4;
                d[g3] = (byte)(n >> 16);
                final int g5 = g4 + 1;
                this.g = g5;
                d[g4] = (byte)(n >> 24);
                final int g6 = g5 + 1;
                this.g = g6;
                d[g5] = (byte)(n >> 32);
                final int g7 = g6 + 1;
                this.g = g7;
                d[g6] = (byte)(n >> 40);
                final int g8 = g7 + 1;
                this.g = g8;
                d[g7] = (byte)(n >> 48);
                this.g = g8 + 1;
                d[g8] = (byte)(n >> 56);
            }
            catch (IndexOutOfBoundsException ex) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", this.g, this.f, 1), ex);
            }
        }
        
        @Override
        public final int b() {
            return this.f - this.g;
        }
        
        @Override
        public final void f0(final int n) throws IOException {
            try {
                final byte[] d = this.d;
                final int g = this.g;
                final int g2 = g + 1;
                this.g = g2;
                d[g] = (byte)n;
                final int g3 = g2 + 1;
                this.g = g3;
                d[g2] = (byte)(n >> 8);
                final int g4 = g3 + 1;
                this.g = g4;
                d[g3] = (byte)(n >> 16);
                this.g = g4 + 1;
                d[g4] = (byte)(n >>> 24);
            }
            catch (IndexOutOfBoundsException ex) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", this.g, this.f, 1), ex);
            }
        }
        
        @Override
        public final void g(final byte b) throws IOException {
            try {
                this.d[this.g++] = b;
            }
            catch (IndexOutOfBoundsException ex) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", this.g, this.f, 1), ex);
            }
        }
        
        @Override
        public final void j(final int n) throws IOException {
            if (n >= 0) {
                this.O(n);
                return;
            }
            this.t(n);
        }
        
        @Override
        public final void k0(final int n, final int n2) throws IOException {
            this.m(n, 5);
            this.f0(n2);
        }
        
        @Override
        public final void m(final int n, final int n2) throws IOException {
            this.O(n << 3 | n2);
        }
        
        @Override
        public final void n(final int n, final long n2) throws IOException {
            this.m(n, 0);
            this.t(n2);
        }
        
        @Override
        public final void o(final int n, final f5 f5) throws IOException {
            this.m(n, 2);
            this.u(f5);
        }
        
        @Override
        public final void p(final int n, final z7 z7) throws IOException {
            this.m(1, 3);
            this.Y(2, n);
            this.m(3, 2);
            this.v(z7);
            this.m(1, 4);
        }
        
        @Override
        final void q(int n, final z7 z7, final s8 s8) throws IOException {
            this.m(n, 2);
            final r4 r4 = (r4)z7;
            if ((n = r4.f()) == -1) {
                n = s8.c(r4);
                r4.c(n);
            }
            this.O(n);
            s8.g(z7, super.a);
        }
        
        @Override
        public final void r(final int n, final String s) throws IOException {
            this.m(n, 2);
            this.w(s);
        }
        
        @Override
        public final void s(final int n, final boolean b) throws IOException {
            this.m(n, 0);
            this.g((byte)(b ? 1 : 0));
        }
        
        @Override
        public final void t(long n) throws IOException {
            long n2 = n;
            if (v5.c) {
                n2 = n;
                if (this.b() >= 10) {
                    while ((n & 0xFFFFFFFFFFFFFF80L) != 0x0L) {
                        r9.l(this.d, this.g++, (byte)(((int)n & 0x7F) | 0x80));
                        n >>>= 7;
                    }
                    r9.l(this.d, this.g++, (byte)n);
                    return;
                }
            }
            while (true) {
                Label_0147: {
                    if ((n2 & 0xFFFFFFFFFFFFFF80L) != 0x0L) {
                        break Label_0147;
                    }
                    try {
                        this.d[this.g++] = (byte)n2;
                        return;
                        this.d[this.g++] = (byte)(((int)n2 & 0x7F) | 0x80);
                        n2 >>>= 7;
                    }
                    catch (IndexOutOfBoundsException ex) {
                        throw new b(String.format("Pos: %d, limit: %d, len: %d", this.g, this.f, 1), ex);
                    }
                }
            }
        }
        
        @Override
        public final void u(final f5 f5) throws IOException {
            this.O(f5.f());
            f5.p(this);
        }
        
        @Override
        public final void v(final z7 z7) throws IOException {
            this.O(z7.q());
            z7.a(this);
        }
        
        @Override
        public final void w(final String s) throws IOException {
            final int g = this.g;
            try {
                final int p = v5.p0(s.length() * 3);
                final int p2 = v5.p0(s.length());
                if (p2 == p) {
                    final int g2 = g + p2;
                    this.g = g2;
                    final int e = u9.e(s, this.d, g2, this.b());
                    this.O(e - (this.g = g) - p2);
                    this.g = e;
                    return;
                }
                this.O(u9.d(s));
                this.g = u9.e(s, this.d, this.g, this.b());
            }
            catch (IndexOutOfBoundsException ex) {
                throw new b(ex);
            }
            catch (x9 x9) {
                this.g = g;
                this.x(s, x9);
            }
        }
    }
    
    public static final class b extends IOException
    {
        b() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        
        b(String message, final Throwable cause) {
            message = String.valueOf(message);
            if (message.length() != 0) {
                message = "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(message);
            }
            else {
                message = new String("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            }
            super(message, cause);
        }
        
        b(final Throwable cause) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", cause);
        }
    }
}
