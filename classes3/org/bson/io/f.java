// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.io;

import org.bson.types.ObjectId;
import org.bson.s0;
import java.nio.ByteOrder;
import org.bson.b1;
import java.nio.charset.Charset;

public class f implements c
{
    private static final Charset I;
    private static final String[] J;
    private b1 G;
    private int H;
    
    static {
        I = Charset.forName("UTF-8");
        J = new String[128];
        int n = 0;
        while (true) {
            final String[] j = f.J;
            if (n >= j.length) {
                break;
            }
            j[n] = String.valueOf((char)n);
            ++n;
        }
    }
    
    public f(final b1 g) {
        this.H = -1;
        if (g != null) {
            (this.G = g).u0(ByteOrder.LITTLE_ENDIAN);
            return;
        }
        throw new IllegalArgumentException("buffer can not be null");
    }
    
    private void c(final int i) {
        if (this.G.y0() >= i) {
            return;
        }
        throw new s0(String.format("While decoding a BSON document %d bytes were required, but only %d remain", i, this.G.y0()));
    }
    
    private void d() {
        if (this.G != null) {
            return;
        }
        throw new IllegalStateException("Stream is closed");
    }
    
    private String e(int byte1) {
        if (byte1 == 2) {
            byte1 = this.readByte();
            if (this.readByte() != 0) {
                throw new s0("Found a BSON string that is not null-terminated");
            }
            if (byte1 < 0) {
                return f.I.newDecoder().replacement();
            }
            return f.J[byte1];
        }
        else {
            final byte[] bytes = new byte[byte1 - 1];
            this.i2(bytes);
            if (this.readByte() == 0) {
                return new String(bytes, f.I);
            }
            throw new s0("Found a BSON string that is not null-terminated");
        }
    }
    
    private void f() {
        while (this.readByte() != 0) {}
    }
    
    @Override
    public ObjectId E() {
        this.d();
        final byte[] array = new byte[12];
        this.i2(array);
        return new ObjectId(array);
    }
    
    @Override
    public void F3(final int n) {
        this.d();
        final b1 g = this.G;
        g.z0(g.i0() + n);
    }
    
    @Override
    public String U() {
        this.d();
        final int b0 = this.b0();
        if (b0 > 0) {
            return this.e(b0);
        }
        throw new s0(String.format("While decoding a BSON string found a size that is not a positive number: %d", b0));
    }
    
    @Override
    public int b0() {
        this.d();
        this.c(4);
        return this.G.x0();
    }
    
    @Override
    public boolean c0() {
        this.d();
        return this.G.c0();
    }
    
    @Override
    public void c3(final byte[] array, final int n, final int n2) {
        this.d();
        this.c(n2);
        this.G.p0(array, n, n2);
    }
    
    @Override
    public void close() {
        this.G.release();
        this.G = null;
    }
    
    @Override
    public int getPosition() {
        this.d();
        return this.G.i0();
    }
    
    @Override
    public void i2(final byte[] array) {
        this.d();
        this.c(array.length);
        this.G.t0(array);
    }
    
    @Override
    public long k0() {
        this.d();
        this.c(8);
        return this.G.f0();
    }
    
    @Deprecated
    @Override
    public void mark(final int n) {
        this.d();
        this.H = this.G.i0();
    }
    
    @Override
    public d o4(final int n) {
        return new d() {
            private int a = f.this.G.i0();
            
            @Override
            public void reset() {
                f.this.d();
                f.this.G.z0(this.a);
            }
        };
    }
    
    @Override
    public byte readByte() {
        this.d();
        this.c(1);
        return this.G.get();
    }
    
    @Override
    public double readDouble() {
        this.d();
        this.c(8);
        return this.G.e0();
    }
    
    @Deprecated
    @Override
    public void reset() {
        this.d();
        final int h = this.H;
        if (h != -1) {
            this.G.z0(h);
            return;
        }
        throw new IllegalStateException("Mark not set");
    }
    
    @Override
    public String x1() {
        this.d();
        final int i0 = this.G.i0();
        this.f();
        final int i2 = this.G.i0();
        this.G.z0(i0);
        return this.e(i2 - i0);
    }
    
    @Override
    public void x3() {
        this.d();
        this.f();
    }
}
