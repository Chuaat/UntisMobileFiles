// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.disklrucache;

import java.io.UnsupportedEncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.io.InputStream;
import java.io.Closeable;

class b implements Closeable
{
    private static final byte L = 13;
    private static final byte M = 10;
    private final InputStream G;
    private final Charset H;
    private byte[] I;
    private int J;
    private int K;
    
    public b(final InputStream g, final int n, final Charset h) {
        if (g == null || h == null) {
            throw null;
        }
        if (n < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (h.equals(c.a)) {
            this.G = g;
            this.H = h;
            this.I = new byte[n];
            return;
        }
        throw new IllegalArgumentException("Unsupported encoding");
    }
    
    public b(final InputStream inputStream, final Charset charset) {
        this(inputStream, 8192, charset);
    }
    
    private void b() throws IOException {
        final InputStream g = this.G;
        final byte[] i = this.I;
        final int read = g.read(i, 0, i.length);
        if (read != -1) {
            this.J = 0;
            this.K = read;
            return;
        }
        throw new EOFException();
    }
    
    public boolean c() {
        return this.K == -1;
    }
    
    @Override
    public void close() throws IOException {
        synchronized (this.G) {
            if (this.I != null) {
                this.I = null;
                this.G.close();
            }
        }
    }
    
    public String d() throws IOException {
        synchronized (this.G) {
            if (this.I != null) {
                if (this.J >= this.K) {
                    this.b();
                }
                for (int i = this.J; i != this.K; ++i) {
                    final byte[] j = this.I;
                    if (j[i] == 10) {
                        final int k = this.J;
                        int n = 0;
                        Label_0087: {
                            if (i != k) {
                                n = i - 1;
                                if (j[n] == 13) {
                                    break Label_0087;
                                }
                            }
                            n = i;
                        }
                        final String s = new String(j, k, n - k, this.H.name());
                        this.J = i + 1;
                        return s;
                    }
                }
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.K - this.J + 80) {
                    @Override
                    public String toString() {
                        int count;
                        final int n = count = super.count;
                        if (n > 0) {
                            count = n;
                            if (super.buf[n - 1] == 13) {
                                count = n - 1;
                            }
                        }
                        try {
                            return new String(super.buf, 0, count, b.this.H.name());
                        }
                        catch (UnsupportedEncodingException detailMessage) {
                            throw new AssertionError((Object)detailMessage);
                        }
                    }
                };
                int j2 = 0;
                byte[] i2 = null;
            Block_10:
                while (true) {
                    final byte[] l = this.I;
                    final int m = this.J;
                    byteArrayOutputStream.write(l, m, this.K - m);
                    this.K = -1;
                    this.b();
                    for (j2 = this.J; j2 != this.K; ++j2) {
                        i2 = this.I;
                        if (i2[j2] == 10) {
                            break Block_10;
                        }
                    }
                }
                final int j3 = this.J;
                if (j2 != j3) {
                    byteArrayOutputStream.write(i2, j3, j2 - j3);
                }
                this.J = j2 + 1;
                return byteArrayOutputStream.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }
}
