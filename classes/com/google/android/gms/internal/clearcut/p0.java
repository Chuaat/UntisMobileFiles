// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.nio.BufferOverflowException;
import java.nio.ByteOrder;
import java.util.Objects;
import java.util.logging.Level;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

public abstract class p0 extends c0
{
    private static final Logger b;
    private static final boolean c;
    r0 a;
    
    static {
        b = Logger.getLogger(p0.class.getName());
        c = j4.x();
    }
    
    private p0() {
    }
    
    public static int A(final int n, final y1 y1) {
        return (C0(1) << 1) + o0(2, n) + d(3, y1);
    }
    
    static int B(final int n, final s2 s2, final k3 k3) {
        return C0(n) + E(s2, k3);
    }
    
    public static int C(final int n, final String s) {
        return C0(n) + r0(s);
    }
    
    public static int C0(final int n) {
        return E0(n << 3);
    }
    
    public static int D(final d0 d0) {
        final int size = d0.size();
        return E0(size) + size;
    }
    
    public static int D0(final int n) {
        if (n >= 0) {
            return E0(n);
        }
        return 10;
    }
    
    static int E(final s2 s2, final k3 k3) {
        final t t = (t)s2;
        int n;
        if ((n = t.h()) == -1) {
            n = k3.e(t);
            t.e(n);
        }
        return E0(n) + n;
    }
    
    public static int E0(final int n) {
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
    
    public static int F(final boolean b) {
        return 1;
    }
    
    public static int F0(final int n) {
        return E0(J0(n));
    }
    
    public static int G0(final int n) {
        return 4;
    }
    
    public static int H0(final int n) {
        return 4;
    }
    
    public static int I0(final int n) {
        return D0(n);
    }
    
    private static int J0(final int n) {
        return n >> 31 ^ n << 1;
    }
    
    @Deprecated
    public static int K0(final int n) {
        return E0(n);
    }
    
    public static int N(int size, final d0 d0) {
        final int c0 = C0(size);
        size = d0.size();
        return c0 + (E0(size) + size);
    }
    
    public static int O(final int n, final s2 s2) {
        return C0(n) + R(s2);
    }
    
    @Deprecated
    static int P(int n, final s2 s2, final k3 k3) {
        final int c0 = C0(n);
        final t t = (t)s2;
        if ((n = t.h()) == -1) {
            n = k3.e(t);
            t.e(n);
        }
        return (c0 << 1) + n;
    }
    
    public static int Q(final int n, final boolean b) {
        return C0(n) + 1;
    }
    
    public static int R(final s2 s2) {
        final int f = s2.f();
        return E0(f) + f;
    }
    
    public static p0 S(final byte[] array) {
        return new a(array, 0, array.length);
    }
    
    public static int W(final int n, final long n2) {
        return C0(n) + i0(n2);
    }
    
    public static int X(final int n, final d0 d0) {
        return (C0(1) << 1) + o0(2, n) + N(3, d0);
    }
    
    public static int Y(final int n, final s2 s2) {
        return (C0(1) << 1) + o0(2, n) + O(3, s2);
    }
    
    @Deprecated
    public static int Z(final s2 s2) {
        return s2.f();
    }
    
    public static int a0(final byte[] array) {
        final int length = array.length;
        return E0(length) + length;
    }
    
    public static int d(int c0, final y1 y1) {
        c0 = C0(c0);
        final int a = y1.a();
        return c0 + (E0(a) + a);
    }
    
    public static int e(final y1 y1) {
        final int a = y1.a();
        return E0(a) + a;
    }
    
    public static int e0(final int n, final long n2) {
        return C0(n) + i0(n2);
    }
    
    public static p0 f(final ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        if (j4.y()) {
            return new e(byteBuffer);
        }
        return new d(byteBuffer);
    }
    
    public static int f0(final long n) {
        return i0(n);
    }
    
    public static int h0(final int n, final long n2) {
        return C0(n) + i0(v0(n2));
    }
    
    public static int i0(long n) {
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
    
    public static int k0(final int n, final int n2) {
        return C0(n) + D0(n2);
    }
    
    public static int l0(final int n, final long n2) {
        return C0(n) + 8;
    }
    
    public static int m0(final long n) {
        return i0(v0(n));
    }
    
    public static int o0(final int n, final int n2) {
        return C0(n) + E0(n2);
    }
    
    public static int p0(final int n, final long n2) {
        return C0(n) + 8;
    }
    
    public static int q0(final long n) {
        return 8;
    }
    
    public static int r0(final String s) {
        int n;
        try {
            n = l4.a(s);
        }
        catch (o4 o4) {
            n = s.getBytes(l1.a).length;
        }
        return E0(n) + n;
    }
    
    public static int s0(final int n, final int n2) {
        return C0(n) + E0(J0(n2));
    }
    
    public static int t0(final long n) {
        return 8;
    }
    
    public static int u0(final int n, final int n2) {
        return C0(n) + 4;
    }
    
    private static long v0(final long n) {
        return n >> 63 ^ n << 1;
    }
    
    public static int w(final double n) {
        return 8;
    }
    
    public static int w0(final int n, final int n2) {
        return C0(n) + 4;
    }
    
    public static int x(final float n) {
        return 4;
    }
    
    public static int x0(final int n, final int n2) {
        return C0(n) + D0(n2);
    }
    
    public static int y(final int n, final double n2) {
        return C0(n) + 8;
    }
    
    public static int z(final int n, final float n2) {
        return C0(n) + 4;
    }
    
    public final void A0(final int n) throws IOException {
        this.z0(J0(n));
    }
    
    public abstract void B0(final int p0) throws IOException;
    
    public abstract void G(final int p0, final int p1) throws IOException;
    
    public final void H(final int n, final long n2) throws IOException {
        this.l(n, v0(n2));
    }
    
    public abstract void I(final int p0, final d0 p1) throws IOException;
    
    public abstract void J(final int p0, final s2 p1) throws IOException;
    
    public abstract void K(final int p0, final boolean p1) throws IOException;
    
    public abstract void L(final long p0) throws IOException;
    
    public abstract void M(final s2 p0) throws IOException;
    
    public abstract void T(final int p0, final int p1) throws IOException;
    
    public abstract void U(final int p0, final long p1) throws IOException;
    
    public final void V(final long n) throws IOException {
        this.L(v0(n));
    }
    
    public abstract void b() throws IOException;
    
    public abstract void b0(final int p0, final int p1) throws IOException;
    
    public abstract void c(final byte[] p0, final int p1, final int p2) throws IOException;
    
    public abstract void c0(final long p0) throws IOException;
    
    abstract void d0(final byte[] p0, final int p1, final int p2) throws IOException;
    
    public abstract void g(final byte p0) throws IOException;
    
    public final void g0(final int n, final int n2) throws IOException {
        this.b0(n, J0(n2));
    }
    
    public final void h(final double n) throws IOException {
        this.c0(Double.doubleToRawLongBits(n));
    }
    
    public final void i(final float n) throws IOException {
        this.B0(Float.floatToRawIntBits(n));
    }
    
    public final void j(final int n, final double n2) throws IOException {
        this.U(n, Double.doubleToRawLongBits(n2));
    }
    
    public abstract void j0(final int p0, final int p1) throws IOException;
    
    public final void k(final int n, final float n2) throws IOException {
        this.j0(n, Float.floatToRawIntBits(n2));
    }
    
    public abstract void l(final int p0, final long p1) throws IOException;
    
    public abstract void m(final int p0, final d0 p1) throws IOException;
    
    public abstract void n(final int p0, final s2 p1) throws IOException;
    
    public abstract void n0(final String p0) throws IOException;
    
    abstract void o(final int p0, final s2 p1, final k3 p2) throws IOException;
    
    public abstract void p(final int p0, final String p1) throws IOException;
    
    public abstract void q(final d0 p0) throws IOException;
    
    abstract void r(final s2 p0, final k3 p1) throws IOException;
    
    final void s(final String s, final o4 thrown) throws IOException {
        p0.b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", thrown);
        final byte[] bytes = s.getBytes(l1.a);
        try {
            this.z0(bytes.length);
            this.a(bytes, 0, bytes.length);
        }
        catch (c c) {
            throw c;
        }
        catch (IndexOutOfBoundsException ex) {
            throw new c(ex);
        }
    }
    
    public final void t(final boolean b) throws IOException {
        this.g((byte)(b ? 1 : 0));
    }
    
    public abstract int u();
    
    public abstract void y0(final int p0) throws IOException;
    
    public abstract void z0(final int p0) throws IOException;
    
    static class a extends p0
    {
        private final byte[] d;
        private final int e;
        private final int f;
        private int g;
        
        a(final byte[] array, final int i, final int j) {
            super(null);
            Objects.requireNonNull(array, "buffer");
            final int length = array.length;
            final int f = i + j;
            if ((i | j | length - f) >= 0) {
                this.d = array;
                this.e = i;
                this.g = i;
                this.f = f;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", array.length, i, j));
        }
        
        @Override
        public final void B0(final int n) throws IOException {
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
                d[g4] = (byte)(n >> 24);
            }
            catch (IndexOutOfBoundsException ex) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", this.g, this.f, 1), ex);
            }
        }
        
        @Override
        public final void G(final int n, final int n2) throws IOException {
            this.z0(n << 3 | n2);
        }
        
        @Override
        public final void I(final int n, final d0 d0) throws IOException {
            this.G(1, 3);
            this.b0(2, n);
            this.m(3, d0);
            this.G(1, 4);
        }
        
        @Override
        public final void J(final int n, final s2 s2) throws IOException {
            this.G(1, 3);
            this.b0(2, n);
            this.n(3, s2);
            this.G(1, 4);
        }
        
        @Override
        public final void K(final int n, final boolean b) throws IOException {
            this.G(n, 0);
            this.g((byte)(b ? 1 : 0));
        }
        
        @Override
        public final void L(long n) throws IOException {
            long n2 = n;
            if (p0.c) {
                n2 = n;
                if (this.u() >= 10) {
                    while ((n & 0xFFFFFFFFFFFFFF80L) != 0x0L) {
                        j4.k(this.d, this.g++, (byte)(((int)n & 0x7F) | 0x80));
                        n >>>= 7;
                    }
                    j4.k(this.d, this.g++, (byte)n);
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
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", this.g, this.f, 1), ex);
                    }
                }
            }
        }
        
        public final int L0() {
            return this.g - this.e;
        }
        
        @Override
        public final void M(final s2 s2) throws IOException {
            this.z0(s2.f());
            s2.c(this);
        }
        
        @Override
        public final void T(final int n, final int n2) throws IOException {
            this.G(n, 0);
            this.y0(n2);
        }
        
        @Override
        public final void U(final int n, final long n2) throws IOException {
            this.G(n, 1);
            this.c0(n2);
        }
        
        @Override
        public final void a(final byte[] array, final int n, final int n2) throws IOException {
            this.c(array, n, n2);
        }
        
        @Override
        public void b() {
        }
        
        @Override
        public final void b0(final int n, final int n2) throws IOException {
            this.G(n, 0);
            this.z0(n2);
        }
        
        @Override
        public final void c(final byte[] array, final int n, final int i) throws IOException {
            try {
                System.arraycopy(array, n, this.d, this.g, i);
                this.g += i;
            }
            catch (IndexOutOfBoundsException ex) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", this.g, this.f, i), ex);
            }
        }
        
        @Override
        public final void c0(final long n) throws IOException {
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
                throw new c(String.format("Pos: %d, limit: %d, len: %d", this.g, this.f, 1), ex);
            }
        }
        
        public final void d0(final byte[] array, final int n, final int n2) throws IOException {
            this.z0(n2);
            this.c(array, 0, n2);
        }
        
        @Override
        public final void g(final byte b) throws IOException {
            try {
                this.d[this.g++] = b;
            }
            catch (IndexOutOfBoundsException ex) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", this.g, this.f, 1), ex);
            }
        }
        
        @Override
        public final void j0(final int n, final int n2) throws IOException {
            this.G(n, 5);
            this.B0(n2);
        }
        
        @Override
        public final void l(final int n, final long n2) throws IOException {
            this.G(n, 0);
            this.L(n2);
        }
        
        @Override
        public final void m(final int n, final d0 d0) throws IOException {
            this.G(n, 2);
            this.q(d0);
        }
        
        @Override
        public final void n(final int n, final s2 s2) throws IOException {
            this.G(n, 2);
            this.M(s2);
        }
        
        @Override
        public final void n0(final String s) throws IOException {
            final int g = this.g;
            try {
                final int e0 = p0.E0(s.length() * 3);
                final int e2 = p0.E0(s.length());
                if (e2 == e0) {
                    final int g2 = g + e2;
                    this.g = g2;
                    final int b = l4.b(s, this.d, g2, this.u());
                    this.z0(b - (this.g = g) - e2);
                    this.g = b;
                    return;
                }
                this.z0(l4.a(s));
                this.g = l4.b(s, this.d, this.g, this.u());
            }
            catch (IndexOutOfBoundsException ex) {
                throw new c(ex);
            }
            catch (o4 o4) {
                this.g = g;
                this.s(s, o4);
            }
        }
        
        @Override
        final void o(int n, final s2 s2, final k3 k3) throws IOException {
            this.G(n, 2);
            final t t = (t)s2;
            if ((n = t.h()) == -1) {
                n = k3.e(t);
                t.e(n);
            }
            this.z0(n);
            k3.c(s2, super.a);
        }
        
        @Override
        public final void p(final int n, final String s) throws IOException {
            this.G(n, 2);
            this.n0(s);
        }
        
        @Override
        public final void q(final d0 d0) throws IOException {
            this.z0(d0.size());
            d0.i(this);
        }
        
        @Override
        final void r(final s2 s2, final k3 k3) throws IOException {
            final t t = (t)s2;
            int n;
            if ((n = t.h()) == -1) {
                n = k3.e(t);
                t.e(n);
            }
            this.z0(n);
            k3.c(s2, super.a);
        }
        
        @Override
        public final int u() {
            return this.f - this.g;
        }
        
        @Override
        public final void y0(final int n) throws IOException {
            if (n >= 0) {
                this.z0(n);
                return;
            }
            this.L(n);
        }
        
        @Override
        public final void z0(int n) throws IOException {
            int n2 = n;
            if (p0.c) {
                n2 = n;
                if (this.u() >= 10) {
                    while ((n & 0xFFFFFF80) != 0x0) {
                        j4.k(this.d, this.g++, (byte)((n & 0x7F) | 0x80));
                        n >>>= 7;
                    }
                    j4.k(this.d, this.g++, (byte)n);
                    return;
                }
            }
            while (true) {
                Label_0123: {
                    if ((n2 & 0xFFFFFF80) != 0x0) {
                        break Label_0123;
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
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", this.g, this.f, 1), ex);
                    }
                }
            }
        }
    }
    
    static final class b extends a
    {
        private final ByteBuffer h;
        private int i;
        
        b(final ByteBuffer h) {
            super(h.array(), h.arrayOffset() + h.position(), h.remaining());
            this.h = h;
            this.i = h.position();
        }
        
        @Override
        public final void b() {
            this.h.position(this.i + ((a)this).L0());
        }
    }
    
    public static final class c extends IOException
    {
        c() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        
        c(String message) {
            message = String.valueOf(message);
            if (message.length() != 0) {
                message = "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(message);
            }
            else {
                message = new String("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            }
            super(message);
        }
        
        c(String message, final Throwable cause) {
            message = String.valueOf(message);
            if (message.length() != 0) {
                message = "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(message);
            }
            else {
                message = new String("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            }
            super(message, cause);
        }
        
        c(final Throwable cause) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", cause);
        }
    }
    
    static final class d extends p0
    {
        private final ByteBuffer d;
        private final ByteBuffer e;
        private final int f;
        
        d(final ByteBuffer d) {
            super(null);
            this.d = d;
            this.e = d.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f = d.position();
        }
        
        private final void L0(final String s) throws IOException {
            try {
                l4.c(s, this.e);
            }
            catch (IndexOutOfBoundsException ex) {
                throw new c(ex);
            }
        }
        
        @Override
        public final void B0(final int n) throws IOException {
            try {
                this.e.putInt(n);
            }
            catch (BufferOverflowException ex) {
                throw new c(ex);
            }
        }
        
        @Override
        public final void G(final int n, final int n2) throws IOException {
            this.z0(n << 3 | n2);
        }
        
        @Override
        public final void I(final int n, final d0 d0) throws IOException {
            this.G(1, 3);
            this.b0(2, n);
            this.m(3, d0);
            this.G(1, 4);
        }
        
        @Override
        public final void J(final int n, final s2 s2) throws IOException {
            this.G(1, 3);
            this.b0(2, n);
            this.n(3, s2);
            this.G(1, 4);
        }
        
        @Override
        public final void K(final int n, final boolean b) throws IOException {
            this.G(n, 0);
            this.g((byte)(b ? 1 : 0));
        }
        
        @Override
        public final void L(long n) throws IOException {
            while (true) {
                Label_0022: {
                    if ((0xFFFFFFFFFFFFFF80L & n) != 0x0L) {
                        break Label_0022;
                    }
                    try {
                        this.e.put((byte)n);
                        return;
                        this.e.put((byte)(((int)n & 0x7F) | 0x80));
                        n >>>= 7;
                    }
                    catch (BufferOverflowException ex) {
                        throw new c(ex);
                    }
                }
            }
        }
        
        @Override
        public final void M(final s2 s2) throws IOException {
            this.z0(s2.f());
            s2.c(this);
        }
        
        @Override
        public final void T(final int n, final int n2) throws IOException {
            this.G(n, 0);
            this.y0(n2);
        }
        
        @Override
        public final void U(final int n, final long n2) throws IOException {
            this.G(n, 1);
            this.c0(n2);
        }
        
        @Override
        public final void a(final byte[] array, final int n, final int n2) throws IOException {
            this.c(array, n, n2);
        }
        
        @Override
        public final void b() {
            this.d.position(this.e.position());
        }
        
        @Override
        public final void b0(final int n, final int n2) throws IOException {
            this.G(n, 0);
            this.z0(n2);
        }
        
        @Override
        public final void c(final byte[] src, final int offset, final int length) throws IOException {
            try {
                this.e.put(src, offset, length);
            }
            catch (BufferOverflowException ex) {
                throw new c(ex);
            }
            catch (IndexOutOfBoundsException ex2) {
                throw new c(ex2);
            }
        }
        
        @Override
        public final void c0(final long n) throws IOException {
            try {
                this.e.putLong(n);
            }
            catch (BufferOverflowException ex) {
                throw new c(ex);
            }
        }
        
        public final void d0(final byte[] array, final int n, final int n2) throws IOException {
            this.z0(n2);
            this.c(array, 0, n2);
        }
        
        @Override
        public final void g(final byte b) throws IOException {
            try {
                this.e.put(b);
            }
            catch (BufferOverflowException ex) {
                throw new c(ex);
            }
        }
        
        @Override
        public final void j0(final int n, final int n2) throws IOException {
            this.G(n, 5);
            this.B0(n2);
        }
        
        @Override
        public final void l(final int n, final long n2) throws IOException {
            this.G(n, 0);
            this.L(n2);
        }
        
        @Override
        public final void m(final int n, final d0 d0) throws IOException {
            this.G(n, 2);
            this.q(d0);
        }
        
        @Override
        public final void n(final int n, final s2 s2) throws IOException {
            this.G(n, 2);
            this.M(s2);
        }
        
        @Override
        public final void n0(final String s) throws IOException {
            final int position = this.e.position();
            try {
                final int e0 = p0.E0(s.length() * 3);
                final int e2 = p0.E0(s.length());
                if (e2 == e0) {
                    final int n = this.e.position() + e2;
                    this.e.position(n);
                    this.L0(s);
                    final int position2 = this.e.position();
                    this.e.position(position);
                    this.z0(position2 - n);
                    this.e.position(position2);
                    return;
                }
                this.z0(l4.a(s));
                this.L0(s);
            }
            catch (IllegalArgumentException ex) {
                throw new c(ex);
            }
            catch (o4 o4) {
                this.e.position(position);
                this.s(s, o4);
            }
        }
        
        @Override
        final void o(final int n, final s2 s2, final k3 k3) throws IOException {
            this.G(n, 2);
            this.r(s2, k3);
        }
        
        @Override
        public final void p(final int n, final String s) throws IOException {
            this.G(n, 2);
            this.n0(s);
        }
        
        @Override
        public final void q(final d0 d0) throws IOException {
            this.z0(d0.size());
            d0.i(this);
        }
        
        @Override
        final void r(final s2 s2, final k3 k3) throws IOException {
            final t t = (t)s2;
            int n;
            if ((n = t.h()) == -1) {
                n = k3.e(t);
                t.e(n);
            }
            this.z0(n);
            k3.c(s2, super.a);
        }
        
        @Override
        public final int u() {
            return this.e.remaining();
        }
        
        @Override
        public final void y0(final int n) throws IOException {
            if (n >= 0) {
                this.z0(n);
                return;
            }
            this.L(n);
        }
        
        @Override
        public final void z0(int n) throws IOException {
            while (true) {
                Label_0018: {
                    if ((n & 0xFFFFFF80) != 0x0) {
                        break Label_0018;
                    }
                    try {
                        this.e.put((byte)n);
                        return;
                        this.e.put((byte)((n & 0x7F) | 0x80));
                        n >>>= 7;
                    }
                    catch (BufferOverflowException ex) {
                        throw new c(ex);
                    }
                }
            }
        }
    }
    
    static final class e extends p0
    {
        private final ByteBuffer d;
        private final ByteBuffer e;
        private final long f;
        private final long g;
        private final long h;
        private final long i;
        private long j;
        
        e(final ByteBuffer d) {
            super(null);
            this.d = d;
            this.e = d.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            final long o = j4.o(d);
            this.f = o;
            final long n = d.position() + o;
            this.g = n;
            final long h = o + d.limit();
            this.h = h;
            this.i = h - 10L;
            this.j = n;
        }
        
        private final void L0(final long n) {
            this.e.position((int)(n - this.f));
        }
        
        @Override
        public final void B0(final int n) throws IOException {
            this.e.putInt((int)(this.j - this.f), n);
            this.j += 4L;
        }
        
        @Override
        public final void G(final int n, final int n2) throws IOException {
            this.z0(n << 3 | n2);
        }
        
        @Override
        public final void I(final int n, final d0 d0) throws IOException {
            this.G(1, 3);
            this.b0(2, n);
            this.m(3, d0);
            this.G(1, 4);
        }
        
        @Override
        public final void J(final int n, final s2 s2) throws IOException {
            this.G(1, 3);
            this.b0(2, n);
            this.n(3, s2);
            this.G(1, 4);
        }
        
        @Override
        public final void K(final int n, final boolean b) throws IOException {
            this.G(n, 0);
            this.g((byte)(b ? 1 : 0));
        }
        
        @Override
        public final void L(long n) throws IOException {
            long n2 = n;
            long n3;
            if (this.j <= this.i) {
                while (true) {
                    n3 = this.j;
                    if ((n & 0xFFFFFFFFFFFFFF80L) == 0x0L) {
                        break;
                    }
                    this.j = n3 + 1L;
                    j4.c(n3, (byte)(((int)n & 0x7F) | 0x80));
                    n >>>= 7;
                }
            }
            else {
                while (true) {
                    n3 = this.j;
                    if (n3 >= this.h) {
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", this.j, this.h, 1));
                    }
                    if ((n2 & 0xFFFFFFFFFFFFFF80L) == 0x0L) {
                        n = n2;
                        break;
                    }
                    this.j = n3 + 1L;
                    j4.c(n3, (byte)(((int)n2 & 0x7F) | 0x80));
                    n2 >>>= 7;
                }
            }
            this.j = 1L + n3;
            j4.c(n3, (byte)n);
        }
        
        @Override
        public final void M(final s2 s2) throws IOException {
            this.z0(s2.f());
            s2.c(this);
        }
        
        @Override
        public final void T(final int n, final int n2) throws IOException {
            this.G(n, 0);
            this.y0(n2);
        }
        
        @Override
        public final void U(final int n, final long n2) throws IOException {
            this.G(n, 1);
            this.c0(n2);
        }
        
        @Override
        public final void a(final byte[] array, final int n, final int n2) throws IOException {
            this.c(array, n, n2);
        }
        
        @Override
        public final void b() {
            this.d.position((int)(this.j - this.f));
        }
        
        @Override
        public final void b0(final int n, final int n2) throws IOException {
            this.G(n, 0);
            this.z0(n2);
        }
        
        @Override
        public final void c(final byte[] obj, final int n, final int i) throws IOException {
            if (obj != null && n >= 0 && i >= 0 && obj.length - i >= n) {
                final long h = this.h;
                final long n2 = i;
                final long j = this.j;
                if (h - n2 >= j) {
                    j4.l(obj, n, j, n2);
                    this.j += n2;
                    return;
                }
            }
            Objects.requireNonNull(obj, "value");
            throw new c(String.format("Pos: %d, limit: %d, len: %d", this.j, this.h, i));
        }
        
        @Override
        public final void c0(final long n) throws IOException {
            this.e.putLong((int)(this.j - this.f), n);
            this.j += 8L;
        }
        
        public final void d0(final byte[] array, final int n, final int n2) throws IOException {
            this.z0(n2);
            this.c(array, 0, n2);
        }
        
        @Override
        public final void g(final byte b) throws IOException {
            final long j = this.j;
            if (j < this.h) {
                this.j = 1L + j;
                j4.c(j, b);
                return;
            }
            throw new c(String.format("Pos: %d, limit: %d, len: %d", this.j, this.h, 1));
        }
        
        @Override
        public final void j0(final int n, final int n2) throws IOException {
            this.G(n, 5);
            this.B0(n2);
        }
        
        @Override
        public final void l(final int n, final long n2) throws IOException {
            this.G(n, 0);
            this.L(n2);
        }
        
        @Override
        public final void m(final int n, final d0 d0) throws IOException {
            this.G(n, 2);
            this.q(d0);
        }
        
        @Override
        public final void n(final int n, final s2 s2) throws IOException {
            this.G(n, 2);
            this.M(s2);
        }
        
        @Override
        public final void n0(final String s) throws IOException {
            final long j = this.j;
            try {
                final int e0 = p0.E0(s.length() * 3);
                final int e2 = p0.E0(s.length());
                if (e2 == e0) {
                    final int n = (int)(this.j - this.f) + e2;
                    this.e.position(n);
                    l4.c(s, this.e);
                    final int n2 = this.e.position() - n;
                    this.z0(n2);
                    this.j += n2;
                    return;
                }
                final int a = l4.a(s);
                this.z0(a);
                this.L0(this.j);
                l4.c(s, this.e);
                this.j += a;
            }
            catch (IndexOutOfBoundsException ex) {
                throw new c(ex);
            }
            catch (IllegalArgumentException ex2) {
                throw new c(ex2);
            }
            catch (o4 o4) {
                this.L0(this.j = j);
                this.s(s, o4);
            }
        }
        
        @Override
        final void o(final int n, final s2 s2, final k3 k3) throws IOException {
            this.G(n, 2);
            this.r(s2, k3);
        }
        
        @Override
        public final void p(final int n, final String s) throws IOException {
            this.G(n, 2);
            this.n0(s);
        }
        
        @Override
        public final void q(final d0 d0) throws IOException {
            this.z0(d0.size());
            d0.i(this);
        }
        
        @Override
        final void r(final s2 s2, final k3 k3) throws IOException {
            final t t = (t)s2;
            int n;
            if ((n = t.h()) == -1) {
                n = k3.e(t);
                t.e(n);
            }
            this.z0(n);
            k3.c(s2, super.a);
        }
        
        @Override
        public final int u() {
            return (int)(this.h - this.j);
        }
        
        @Override
        public final void y0(final int n) throws IOException {
            if (n >= 0) {
                this.z0(n);
                return;
            }
            this.L(n);
        }
        
        @Override
        public final void z0(int n) throws IOException {
            int n2 = n;
            long n3;
            if (this.j <= this.i) {
                while ((n & 0xFFFFFF80) != 0x0) {
                    j4.c(this.j++, (byte)((n & 0x7F) | 0x80));
                    n >>>= 7;
                }
                n3 = this.j;
            }
            else {
                while (true) {
                    n3 = this.j;
                    if (n3 >= this.h) {
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", this.j, this.h, 1));
                    }
                    if ((n2 & 0xFFFFFF80) == 0x0) {
                        n = n2;
                        break;
                    }
                    this.j = n3 + 1L;
                    j4.c(n3, (byte)((n2 & 0x7F) | 0x80));
                    n2 >>>= 7;
                }
            }
            this.j = 1L + n3;
            j4.c(n3, (byte)n);
        }
    }
}
