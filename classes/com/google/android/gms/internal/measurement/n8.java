// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Objects;

final class n8 extends q8
{
    private final byte[] d;
    private final int e;
    private int f;
    
    n8(final byte[] array, int length, final int n) {
        super(null);
        Objects.requireNonNull(array, "buffer");
        length = array.length;
        if ((length - n | n) >= 0) {
            this.d = array;
            this.f = 0;
            this.e = n;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", length, 0, n));
    }
    
    public final void E(final byte[] array, final int n, final int i) throws IOException {
        try {
            System.arraycopy(array, 0, this.d, this.f, i);
            this.f += i;
        }
        catch (IndexOutOfBoundsException ex) {
            throw new o8(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, i), ex);
        }
    }
    
    public final void F(final String s) throws IOException {
        final int f = this.f;
        try {
            final int a = q8.a(s.length() * 3);
            final int a2 = q8.a(s.length());
            if (a2 == a) {
                final int f2 = f + a2;
                this.f = f2;
                final int b = kc.b(s, this.d, f2, this.e - f2);
                this.u(b - (this.f = f) - a2);
                this.f = b;
                return;
            }
            this.u(kc.c(s));
            final byte[] d = this.d;
            final int f3 = this.f;
            this.f = kc.b(s, d, f3, this.e - f3);
        }
        catch (IndexOutOfBoundsException ex) {
            throw new o8(ex);
        }
        catch (jc jc) {
            this.f = f;
            this.e(s, jc);
        }
    }
    
    @Override
    public final int g() {
        return this.e - this.f;
    }
    
    @Override
    public final void h(final byte b) throws IOException {
        try {
            this.d[this.f++] = b;
        }
        catch (IndexOutOfBoundsException ex) {
            throw new o8(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, 1), ex);
        }
    }
    
    @Override
    public final void i(final int n, final boolean b) throws IOException {
        this.u(n << 3);
        this.h((byte)(b ? 1 : 0));
    }
    
    @Override
    public final void j(final int n, final h8 h8) throws IOException {
        this.u(n << 3 | 0x2);
        this.u(h8.h());
        h8.m(this);
    }
    
    @Override
    public final void k(final int n, final int n2) throws IOException {
        this.u(n << 3 | 0x5);
        this.l(n2);
    }
    
    @Override
    public final void l(final int n) throws IOException {
        try {
            final byte[] d = this.d;
            final int f = this.f;
            final int f2 = f + 1;
            this.f = f2;
            d[f] = (byte)(n & 0xFF);
            final int f3 = f2 + 1;
            this.f = f3;
            d[f2] = (byte)(n >> 8 & 0xFF);
            final int f4 = f3 + 1;
            this.f = f4;
            d[f3] = (byte)(n >> 16 & 0xFF);
            this.f = f4 + 1;
            d[f4] = (byte)(n >> 24 & 0xFF);
        }
        catch (IndexOutOfBoundsException ex) {
            throw new o8(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, 1), ex);
        }
    }
    
    @Override
    public final void m(final int n, final long n2) throws IOException {
        this.u(n << 3 | 0x1);
        this.n(n2);
    }
    
    @Override
    public final void n(final long n) throws IOException {
        try {
            final byte[] d = this.d;
            final int f = this.f;
            final int f2 = f + 1;
            this.f = f2;
            d[f] = (byte)((int)n & 0xFF);
            final int f3 = f2 + 1;
            this.f = f3;
            d[f2] = (byte)((int)(n >> 8) & 0xFF);
            final int f4 = f3 + 1;
            this.f = f4;
            d[f3] = (byte)((int)(n >> 16) & 0xFF);
            final int f5 = f4 + 1;
            this.f = f5;
            d[f4] = (byte)((int)(n >> 24) & 0xFF);
            final int f6 = f5 + 1;
            this.f = f6;
            d[f5] = (byte)((int)(n >> 32) & 0xFF);
            final int f7 = f6 + 1;
            this.f = f7;
            d[f6] = (byte)((int)(n >> 40) & 0xFF);
            final int f8 = f7 + 1;
            this.f = f8;
            d[f7] = (byte)((int)(n >> 48) & 0xFF);
            this.f = f8 + 1;
            d[f8] = (byte)((int)(n >> 56) & 0xFF);
        }
        catch (IndexOutOfBoundsException ex) {
            throw new o8(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, 1), ex);
        }
    }
    
    @Override
    public final void o(final int n, final int n2) throws IOException {
        this.u(n << 3);
        this.p(n2);
    }
    
    @Override
    public final void p(final int n) throws IOException {
        if (n >= 0) {
            this.u(n);
            return;
        }
        this.w(n);
    }
    
    @Override
    public final void q(final byte[] array, final int n, final int n2) throws IOException {
        this.E(array, 0, n2);
    }
    
    @Override
    public final void r(final int n, final String s) throws IOException {
        this.u(n << 3 | 0x2);
        this.F(s);
    }
    
    @Override
    public final void s(final int n, final int n2) throws IOException {
        this.u(n << 3 | n2);
    }
    
    @Override
    public final void t(final int n, final int n2) throws IOException {
        this.u(n << 3);
        this.u(n2);
    }
    
    @Override
    public final void u(int n) throws IOException {
        int n2 = n;
        if (q8.f()) {
            final int a = s7.a;
            n2 = n;
        }
        while (true) {
            Label_0045: {
                if ((n2 & 0xFFFFFF80) != 0x0) {
                    break Label_0045;
                }
                try {
                    final byte[] d = this.d;
                    n = this.f++;
                    d[n] = (byte)n2;
                    return;
                    final byte[] d2 = this.d;
                    n = this.f++;
                    d2[n] = (byte)((n2 & 0x7F) | 0x80);
                    n2 >>>= 7;
                }
                catch (IndexOutOfBoundsException ex) {
                    throw new o8(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, 1), ex);
                }
            }
        }
    }
    
    @Override
    public final void v(final int n, final long n2) throws IOException {
        this.u(n << 3);
        this.w(n2);
    }
    
    @Override
    public final void w(long n) throws IOException {
        long n2 = n;
        if (q8.f()) {
            n2 = n;
            if (this.e - this.f >= 10) {
                while ((n & 0xFFFFFFFFFFFFFF80L) != 0x0L) {
                    fc.s(this.d, this.f++, (byte)(((int)n & 0x7F) | 0x80));
                    n >>>= 7;
                }
                fc.s(this.d, this.f++, (byte)n);
                return;
            }
        }
        while (true) {
            Label_0152: {
                if ((n2 & 0xFFFFFFFFFFFFFF80L) != 0x0L) {
                    break Label_0152;
                }
                try {
                    this.d[this.f++] = (byte)n2;
                    return;
                    this.d[this.f++] = (byte)(((int)n2 & 0x7F) | 0x80);
                    n2 >>>= 7;
                }
                catch (IndexOutOfBoundsException ex) {
                    throw new o8(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, 1), ex);
                }
            }
        }
    }
}
