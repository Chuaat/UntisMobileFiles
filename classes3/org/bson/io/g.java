// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bson.b1;
import java.util.List;
import org.bson.types.ObjectId;
import org.bson.s0;
import java.io.OutputStream;

public abstract class g extends OutputStream implements e
{
    private int f(final String seq, final boolean b) {
        final int length = seq.length();
        int i = 0;
        int n = 0;
        while (i < length) {
            final int codePoint = Character.codePointAt(seq, i);
            if (b && codePoint == 0) {
                throw new s0(String.format("BSON cstring '%s' is not valid because it contains a null character at index %d", seq, i));
            }
            if (codePoint < 128) {
                this.write((byte)codePoint);
                ++n;
            }
            else if (codePoint < 2048) {
                this.write((byte)((codePoint >> 6) + 192));
                this.write((byte)((codePoint & 0x3F) + 128));
                n += 2;
            }
            else if (codePoint < 65536) {
                this.write((byte)((codePoint >> 12) + 224));
                this.write((byte)((codePoint >> 6 & 0x3F) + 128));
                this.write((byte)((codePoint & 0x3F) + 128));
                n += 3;
            }
            else {
                this.write((byte)((codePoint >> 18) + 240));
                this.write((byte)((codePoint >> 12 & 0x3F) + 128));
                this.write((byte)((codePoint >> 6 & 0x3F) + 128));
                this.write((byte)((codePoint & 0x3F) + 128));
                n += 4;
            }
            i += Character.charCount(codePoint);
        }
        this.write(0);
        return n + 1;
    }
    
    @Override
    public void B(final ObjectId objectId) {
        this.write(objectId.T());
    }
    
    @Override
    public void C2(final byte[] array) {
        this.n1(array, 0, array.length);
    }
    
    @Override
    public void I(final long n) {
        this.write((byte)(n >> 0 & 0xFFL));
        this.write((byte)(n >> 8 & 0xFFL));
        this.write((byte)(n >> 16 & 0xFFL));
        this.write((byte)(n >> 24 & 0xFFL));
        this.write((byte)(n >> 32 & 0xFFL));
        this.write((byte)(n >> 40 & 0xFFL));
        this.write((byte)(n >> 48 & 0xFFL));
        this.write((byte)(n >> 56 & 0xFFL));
    }
    
    @Override
    public void L2(final String s) {
        this.f(s, true);
    }
    
    @Override
    public void P(final double n) {
        this.h(Double.doubleToRawLongBits(n));
    }
    
    @Override
    public void V3(final int n, final int n2) {
        this.e(n, n2 >> 0);
        this.e(n + 1, n2 >> 8);
        this.e(n + 2, n2 >> 16);
        this.e(n + 3, n2 >> 24);
    }
    
    public abstract List<b1> a();
    
    public abstract int b(final OutputStream p0) throws IOException;
    
    public int c() {
        return this.l0();
    }
    
    @Override
    public void close() {
    }
    
    public byte[] d() {
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.c());
            this.b(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException cause) {
            throw new RuntimeException("should be impossible", cause);
        }
    }
    
    protected abstract void e(final int p0, final int p1);
    
    public void g(final int n) {
        this.l(n);
    }
    
    public void h(final long n) {
        this.I(n);
    }
    
    @Override
    public void i(final String s) {
        this.g(0);
        final int f = this.f(s, false);
        this.V3(this.getPosition() - f - 4, f);
    }
    
    @Override
    public void l(final int n) {
        this.write(n >> 0);
        this.write(n >> 8);
        this.write(n >> 16);
        this.write(n >> 24);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName());
        sb.append(" size: ");
        sb.append(this.c());
        sb.append(" pos: ");
        sb.append(this.getPosition());
        return sb.toString();
    }
    
    @Override
    public abstract void u1(final int p0);
    
    @Override
    public void write(final int n) {
        this.A(n);
    }
    
    @Override
    public void write(final byte[] array) {
        this.write(array, 0, array.length);
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) {
        this.n1(array, n, n2);
    }
}
