// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.binary;

import java.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.io.FilterInputStream;

public class h extends FilterInputStream
{
    private final g G;
    private final boolean H;
    private final byte[] I;
    private final g.a J;
    
    protected h(final InputStream in, final g g, final boolean h) {
        super(in);
        this.I = new byte[1];
        this.J = new g.a();
        this.H = h;
        this.G = g;
    }
    
    @Override
    public int available() throws IOException {
        return (this.J.f ^ true) ? 1 : 0;
    }
    
    @Override
    public void mark(final int n) {
    }
    // monitorenter(this)
    // monitorexit(this)
    
    @Override
    public boolean markSupported() {
        return false;
    }
    
    @Override
    public int read() throws IOException {
        int i;
        for (i = this.read(this.I, 0, 1); i == 0; i = this.read(this.I, 0, 1)) {}
        if (i > 0) {
            final byte b = this.I[0];
            int n;
            if ((n = b) < 0) {
                n = b + 256;
            }
            return n;
        }
        return -1;
    }
    
    @Override
    public int read(final byte[] obj, final int n, final int n2) throws IOException {
        Objects.requireNonNull(obj, "array");
        if (n < 0 || n2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (n > obj.length || n + n2 > obj.length) {
            throw new IndexOutOfBoundsException();
        }
        if (n2 == 0) {
            return 0;
        }
        int i;
        for (i = 0; i == 0; i = this.G.y(obj, n, n2, this.J)) {
            if (!this.G.t(this.J)) {
                int n3;
                if (this.H) {
                    n3 = 4096;
                }
                else {
                    n3 = 8192;
                }
                final byte[] b = new byte[n3];
                final int read = super.in.read(b);
                if (this.H) {
                    this.G.m(b, 0, read, this.J);
                }
                else {
                    this.G.k(b, 0, read, this.J);
                }
            }
        }
        return i;
    }
    
    @Override
    public void reset() throws IOException {
        synchronized (this) {
            throw new IOException("mark/reset not supported");
        }
    }
    
    @Override
    public long skip(final long lng) throws IOException {
        if (lng >= 0L) {
            final byte[] array = new byte[512];
            long b;
            int read;
            for (b = lng; b > 0L; b -= read) {
                read = this.read(array, 0, (int)Math.min(512, b));
                if (read == -1) {
                    break;
                }
            }
            return lng - b;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Negative skip length: ");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString());
    }
}
