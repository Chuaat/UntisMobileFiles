// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import java.io.IOException;
import androidx.annotation.b1;
import androidx.annotation.j0;
import java.io.InputStream;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import java.io.FilterInputStream;

public class b0 extends FilterInputStream
{
    private volatile byte[] G;
    private int H;
    private int I;
    private int J;
    private int K;
    private final b L;
    
    public b0(@j0 final InputStream inputStream, @j0 final b b) {
        this(inputStream, b, 65536);
    }
    
    @b1
    b0(@j0 final InputStream in, @j0 final b l, final int n) {
        super(in);
        this.J = -1;
        this.L = l;
        this.G = l.f(n, byte[].class);
    }
    
    private int a(final InputStream inputStream, final byte[] b) throws IOException {
        final int j = this.J;
        if (j != -1) {
            final int k = this.K;
            int i = this.I;
            if (k - j < i) {
                byte[] array;
                if (j == 0 && i > b.length && this.H == b.length) {
                    final int n = b.length * 2;
                    if (n <= i) {
                        i = n;
                    }
                    array = this.L.f(i, byte[].class);
                    System.arraycopy(b, 0, array, 0, b.length);
                    this.G = array;
                    this.L.d(b);
                }
                else {
                    array = b;
                    if (j > 0) {
                        System.arraycopy(b, j, b, 0, b.length - j);
                        array = b;
                    }
                }
                final int n2 = this.K - this.J;
                this.K = n2;
                this.J = 0;
                this.H = 0;
                final int read = inputStream.read(array, n2, array.length - n2);
                int l = this.K;
                if (read > 0) {
                    l += read;
                }
                this.H = l;
                return read;
            }
        }
        final int read2 = inputStream.read(b);
        if (read2 > 0) {
            this.J = -1;
            this.K = 0;
            this.H = read2;
        }
        return read2;
    }
    
    private static IOException c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }
    
    @Override
    public int available() throws IOException {
        synchronized (this) {
            final InputStream in = super.in;
            if (this.G != null && in != null) {
                final int h = this.H;
                final int k = this.K;
                final int available = in.available();
                // monitorexit(this)
                return h - k + available;
            }
            throw c();
        }
    }
    
    public void b() {
        synchronized (this) {
            this.I = this.G.length;
        }
    }
    
    @Override
    public void close() throws IOException {
        if (this.G != null) {
            this.L.d(this.G);
            this.G = null;
        }
        final InputStream in = super.in;
        super.in = null;
        if (in != null) {
            in.close();
        }
    }
    
    @Override
    public void mark(final int b) {
        synchronized (this) {
            this.I = Math.max(this.I, b);
            this.J = this.K;
        }
    }
    
    @Override
    public boolean markSupported() {
        return true;
    }
    
    @Override
    public int read() throws IOException {
        synchronized (this) {
            final byte[] g = this.G;
            final InputStream in = super.in;
            if (g == null || in == null) {
                throw c();
            }
            if (this.K >= this.H && this.a(in, g) == -1) {
                return -1;
            }
            byte[] g2;
            if ((g2 = g) != this.G) {
                g2 = this.G;
                if (g2 == null) {
                    throw c();
                }
            }
            final int h = this.H;
            final int k = this.K;
            if (h - k > 0) {
                this.K = k + 1;
                final byte b = g2[k];
                // monitorexit(this)
                return b & 0xFF;
            }
            return -1;
        }
    }
    
    @Override
    public int read(@j0 final byte[] b, int len, final int n) throws IOException {
        synchronized (this) {
            byte[] g = this.G;
            if (g == null) {
                throw c();
            }
            if (n == 0) {
                return 0;
            }
            final InputStream in = super.in;
            if (in == null) {
                throw c();
            }
            final int k = this.K;
            final int h = this.H;
            int off;
            if (k < h) {
                int n2;
                if (h - k >= n) {
                    n2 = n;
                }
                else {
                    n2 = h - k;
                }
                System.arraycopy(g, k, b, len, n2);
                this.K += n2;
                if (n2 == n || in.available() == 0) {
                    return n2;
                }
                final int n3 = len + n2;
                len = n - n2;
                off = n3;
            }
            else {
                off = len;
                len = n;
            }
            while (true) {
                final int j = this.J;
                int n4 = -1;
                int read;
                if (j == -1 && len >= g.length) {
                    if ((read = in.read(b, off, len)) == -1) {
                        if (len != n) {
                            n4 = n - len;
                        }
                        return n4;
                    }
                }
                else {
                    if (this.a(in, g) == -1) {
                        if (len != n) {
                            n4 = n - len;
                        }
                        return n4;
                    }
                    byte[] g2;
                    if ((g2 = g) != this.G) {
                        g2 = this.G;
                        if (g2 == null) {
                            throw c();
                        }
                    }
                    final int h2 = this.H;
                    final int i = this.K;
                    int n5;
                    if (h2 - i >= len) {
                        n5 = len;
                    }
                    else {
                        n5 = h2 - i;
                    }
                    System.arraycopy(g2, i, b, off, n5);
                    this.K += n5;
                    read = n5;
                    g = g2;
                }
                len -= read;
                if (len == 0) {
                    return n;
                }
                if (in.available() == 0) {
                    // monitorexit(this)
                    return n - len;
                }
                off += read;
            }
        }
    }
    
    public void release() {
        synchronized (this) {
            if (this.G != null) {
                this.L.d(this.G);
                this.G = null;
            }
        }
    }
    
    @Override
    public void reset() throws IOException {
        synchronized (this) {
            if (this.G == null) {
                throw new IOException("Stream is closed");
            }
            final int j = this.J;
            if (-1 != j) {
                this.K = j;
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Mark has been invalidated, pos: ");
            sb.append(this.K);
            sb.append(" markLimit: ");
            sb.append(this.I);
            throw new a(sb.toString());
        }
    }
    
    @Override
    public long skip(long skip) throws IOException {
        // monitorenter(this)
        if (skip < 1L) {
            // monitorexit(this)
            return 0L;
        }
        try {
            final byte[] g = this.G;
            if (g == null) {
                throw c();
            }
            final InputStream in = super.in;
            if (in == null) {
                throw c();
            }
            final int h = this.H;
            final int k = this.K;
            if (h - k >= skip) {
                this.K = (int)(k + skip);
                return skip;
            }
            final long n = h - (long)k;
            this.K = h;
            if (this.J == -1 || skip > this.I) {
                skip = in.skip(skip - n);
                // monitorexit(this)
                return n + skip;
            }
            if (this.a(in, g) == -1) {
                return n;
            }
            final int h2 = this.H;
            final int i = this.K;
            if (h2 - i >= skip - n) {
                this.K = (int)(i + skip - n);
                return skip;
            }
            skip = h2;
            final long n2 = i;
            this.K = h2;
            // monitorexit(this)
            return n + skip - n2;
        }
        finally {
        }
        // monitorexit(this)
    }
    
    static class a extends IOException
    {
        private static final long G = -4338378848813561757L;
        
        a(final String message) {
            super(message);
        }
    }
}
