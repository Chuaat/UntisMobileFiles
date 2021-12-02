// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.firebase_messaging;

import java.io.IOException;
import java.util.Objects;
import java.io.InputStream;
import java.io.FilterInputStream;

final class q extends FilterInputStream
{
    private long G;
    private long H;
    
    q(final InputStream inputStream, final long n) {
        super(inputStream);
        this.H = -1L;
        Objects.requireNonNull(inputStream);
        this.G = 1048577L;
    }
    
    @Override
    public final int available() throws IOException {
        return (int)Math.min(super.in.available(), this.G);
    }
    
    @Override
    public final void mark(final int readlimit) {
        synchronized (this) {
            super.in.mark(readlimit);
            this.H = this.G;
        }
    }
    
    @Override
    public final int read() throws IOException {
        if (this.G == 0L) {
            return -1;
        }
        final int read = super.in.read();
        if (read != -1) {
            --this.G;
        }
        return read;
    }
    
    @Override
    public final int read(final byte[] b, int read, final int n) throws IOException {
        final long g = this.G;
        if (g == 0L) {
            return -1;
        }
        read = super.in.read(b, read, (int)Math.min(n, g));
        if (read != -1) {
            this.G -= read;
        }
        return read;
    }
    
    @Override
    public final void reset() throws IOException {
        synchronized (this) {
            if (!super.in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.H != -1L) {
                super.in.reset();
                this.G = this.H;
                return;
            }
            throw new IOException("Mark not set");
        }
    }
    
    @Override
    public final long skip(long n) throws IOException {
        n = Math.min(n, this.G);
        n = super.in.skip(n);
        this.G -= n;
        return n;
    }
}
