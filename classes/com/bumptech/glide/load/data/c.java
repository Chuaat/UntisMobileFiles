// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data;

import java.io.IOException;
import androidx.annotation.b1;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import androidx.annotation.j0;
import java.io.OutputStream;

public final class c extends OutputStream
{
    @j0
    private final OutputStream G;
    private byte[] H;
    private b I;
    private int J;
    
    public c(@j0 final OutputStream outputStream, @j0 final b b) {
        this(outputStream, b, 65536);
    }
    
    @b1
    c(@j0 final OutputStream g, final b i, final int n) {
        this.G = g;
        this.I = i;
        this.H = i.f(n, byte[].class);
    }
    
    private void a() throws IOException {
        final int j = this.J;
        if (j > 0) {
            this.G.write(this.H, 0, j);
            this.J = 0;
        }
    }
    
    private void b() throws IOException {
        if (this.J == this.H.length) {
            this.a();
        }
    }
    
    private void release() {
        final byte[] h = this.H;
        if (h != null) {
            this.I.d(h);
            this.H = null;
        }
    }
    
    @Override
    public void close() throws IOException {
        try {
            this.flush();
            this.G.close();
            this.release();
        }
        finally {
            this.G.close();
        }
    }
    
    @Override
    public void flush() throws IOException {
        this.a();
        this.G.flush();
    }
    
    @Override
    public void write(final int n) throws IOException {
        this.H[this.J++] = (byte)n;
        this.b();
    }
    
    @Override
    public void write(@j0 final byte[] array) throws IOException {
        this.write(array, 0, array.length);
    }
    
    @Override
    public void write(@j0 final byte[] b, final int n, final int n2) throws IOException {
        int n3 = 0;
        int n4;
        do {
            final int n5 = n2 - n3;
            final int off = n + n3;
            final int j = this.J;
            if (j == 0 && n5 >= this.H.length) {
                this.G.write(b, off, n5);
                return;
            }
            final int min = Math.min(n5, this.H.length - j);
            System.arraycopy(b, off, this.H, this.J, min);
            this.J += min;
            n4 = n3 + min;
            this.b();
        } while ((n3 = n4) < n2);
    }
}
