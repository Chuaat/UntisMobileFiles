// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.util;

import androidx.annotation.k0;
import androidx.annotation.j0;
import java.io.IOException;
import java.util.Queue;
import java.io.InputStream;

public class d extends InputStream
{
    private static final Queue<d> I;
    private InputStream G;
    private IOException H;
    
    static {
        I = m.f(0);
    }
    
    d() {
    }
    
    static void a() {
        while (true) {
            final Queue<d> i = d.I;
            if (i.isEmpty()) {
                break;
            }
            i.remove();
        }
    }
    
    @j0
    public static d c(@j0 final InputStream inputStream) {
        Object i = d.I;
        synchronized (i) {
            final d d = ((Queue<d>)i).poll();
            // monitorexit(i)
            i = d;
            if (d == null) {
                i = new d();
            }
            ((d)i).d(inputStream);
            return (d)i;
        }
    }
    
    @Override
    public int available() throws IOException {
        return this.G.available();
    }
    
    @k0
    public IOException b() {
        return this.H;
    }
    
    @Override
    public void close() throws IOException {
        this.G.close();
    }
    
    void d(@j0 final InputStream g) {
        this.G = g;
    }
    
    @Override
    public void mark(final int readlimit) {
        this.G.mark(readlimit);
    }
    
    @Override
    public boolean markSupported() {
        return this.G.markSupported();
    }
    
    @Override
    public int read() {
        int read;
        try {
            read = this.G.read();
        }
        catch (IOException h) {
            this.H = h;
            read = -1;
        }
        return read;
    }
    
    @Override
    public int read(final byte[] b) {
        int read;
        try {
            read = this.G.read(b);
        }
        catch (IOException h) {
            this.H = h;
            read = -1;
        }
        return read;
    }
    
    @Override
    public int read(final byte[] b, int read, final int len) {
        try {
            read = this.G.read(b, read, len);
        }
        catch (IOException h) {
            this.H = h;
            read = -1;
        }
        return read;
    }
    
    public void release() {
        this.H = null;
        this.G = null;
        final Queue<d> i = d.I;
        synchronized (i) {
            i.offer(this);
        }
    }
    
    @Override
    public void reset() throws IOException {
        synchronized (this) {
            this.G.reset();
        }
    }
    
    @Override
    public long skip(long skip) {
        try {
            skip = this.G.skip(skip);
        }
        catch (IOException h) {
            this.H = h;
            skip = 0L;
        }
        return skip;
    }
}
