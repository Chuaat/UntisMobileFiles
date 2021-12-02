// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.io;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import org.bson.c1;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import org.bson.b1;
import java.util.List;

public class a extends g
{
    private byte[] G;
    private int H;
    
    public a() {
        this(1024);
    }
    
    public a(final int n) {
        this.G = new byte[1024];
        this.G = new byte[n];
    }
    
    private void j(int n) {
        final int h = this.H;
        final int n2 = n + h;
        final byte[] g = this.G;
        if (n2 <= g.length) {
            return;
        }
        if ((n = g.length * 2) < n2) {
            n = n2 + 128;
        }
        final byte[] g2 = new byte[n];
        System.arraycopy(g, 0, g2, 0, h);
        this.G = g2;
    }
    
    private void k() {
        if (this.G != null) {
            return;
        }
        throw new IllegalStateException("The output is closed");
    }
    
    @Override
    public void A(final int n) {
        this.k();
        this.j(1);
        this.G[this.H++] = (byte)(n & 0xFF);
    }
    
    @Override
    public List<b1> a() {
        this.k();
        return Arrays.asList(new c1(ByteBuffer.wrap(this.G, 0, this.H).duplicate().order(ByteOrder.LITTLE_ENDIAN)));
    }
    
    @Override
    public int b(final OutputStream outputStream) throws IOException {
        this.k();
        outputStream.write(this.G, 0, this.H);
        return this.H;
    }
    
    @Override
    public void close() {
        this.G = null;
    }
    
    @Override
    protected void e(final int n, final int n2) {
        this.k();
        if (n < 0) {
            throw new IllegalArgumentException(String.format("position must be >= 0 but was %d", n));
        }
        if (n <= this.H - 1) {
            this.G[n] = (byte)(n2 & 0xFF);
            return;
        }
        throw new IllegalArgumentException(String.format("position must be <= %d but was %d", this.H - 1, n));
    }
    
    @Override
    public int getPosition() {
        this.k();
        return this.H;
    }
    
    @Override
    public int l0() {
        this.k();
        return this.H;
    }
    
    public byte[] n() {
        return this.G;
    }
    
    @Override
    public void n1(final byte[] array, final int n, final int n2) {
        this.k();
        this.j(n2);
        System.arraycopy(array, n, this.G, this.H, n2);
        this.H += n2;
    }
    
    @Override
    public void u1(final int h) {
        this.k();
        if (h <= this.H && h >= 0) {
            this.H = h;
            return;
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public void write(final byte[] array) {
        this.k();
        this.write(array, 0, array.length);
    }
}
