// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.util;

import java.io.IOException;
import androidx.annotation.j0;
import java.io.InputStream;
import java.io.FilterInputStream;

public class i extends FilterInputStream
{
    private static final int H = Integer.MIN_VALUE;
    private static final int I = -1;
    private int G;
    
    public i(@j0 final InputStream in) {
        super(in);
        this.G = Integer.MIN_VALUE;
    }
    
    private long a(final long n) {
        final int g = this.G;
        if (g == 0) {
            return -1L;
        }
        long n2 = n;
        if (g != Integer.MIN_VALUE) {
            n2 = n;
            if (n > g) {
                n2 = g;
            }
        }
        return n2;
    }
    
    private void b(final long n) {
        final int g = this.G;
        if (g != Integer.MIN_VALUE && n != -1L) {
            this.G = (int)(g - n);
        }
    }
    
    @Override
    public int available() throws IOException {
        final int g = this.G;
        int n;
        if (g == Integer.MIN_VALUE) {
            n = super.available();
        }
        else {
            n = Math.min(g, super.available());
        }
        return n;
    }
    
    @Override
    public void mark(final int n) {
        synchronized (this) {
            super.mark(n);
            this.G = n;
        }
    }
    
    @Override
    public int read() throws IOException {
        if (this.a(1L) == -1L) {
            return -1;
        }
        final int read = super.read();
        this.b(1L);
        return read;
    }
    
    @Override
    public int read(@j0 final byte[] b, int read, int len) throws IOException {
        len = (int)this.a(len);
        if (len == -1) {
            return -1;
        }
        read = super.read(b, read, len);
        this.b(read);
        return read;
    }
    
    @Override
    public void reset() throws IOException {
        synchronized (this) {
            super.reset();
            this.G = Integer.MIN_VALUE;
        }
    }
    
    @Override
    public long skip(long n) throws IOException {
        n = this.a(n);
        if (n == -1L) {
            return 0L;
        }
        n = super.skip(n);
        this.b(n);
        return n;
    }
}
