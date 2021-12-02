// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.util;

import android.util.Log;
import android.text.TextUtils;
import androidx.annotation.k0;
import java.io.IOException;
import androidx.annotation.j0;
import java.io.InputStream;
import java.io.FilterInputStream;

public final class c extends FilterInputStream
{
    private static final String I = "ContentLengthStream";
    private static final int J = -1;
    private final long G;
    private int H;
    
    private c(@j0 final InputStream in, final long g) {
        super(in);
        this.G = g;
    }
    
    private int a(final int n) throws IOException {
        if (n >= 0) {
            this.H += n;
        }
        else if (this.G - this.H > 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to read all expected data, expected: ");
            sb.append(this.G);
            sb.append(", but read: ");
            sb.append(this.H);
            throw new IOException(sb.toString());
        }
        return n;
    }
    
    @j0
    public static InputStream b(@j0 final InputStream inputStream, final long n) {
        return new c(inputStream, n);
    }
    
    @j0
    public static InputStream c(@j0 final InputStream inputStream, @k0 final String s) {
        return b(inputStream, d(s));
    }
    
    private static int d(@k0 final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            try {
                return Integer.parseInt(s);
            }
            catch (NumberFormatException ex) {
                if (Log.isLoggable("ContentLengthStream", 3)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("failed to parse content length header: ");
                    sb.append(s);
                    Log.d("ContentLengthStream", sb.toString(), (Throwable)ex);
                }
            }
        }
        return -1;
    }
    
    @Override
    public int available() throws IOException {
        synchronized (this) {
            return (int)Math.max(this.G - this.H, super.in.available());
        }
    }
    
    @Override
    public int read() throws IOException {
        synchronized (this) {
            final int read = super.read();
            int n;
            if (read >= 0) {
                n = 1;
            }
            else {
                n = -1;
            }
            this.a(n);
            return read;
        }
    }
    
    @Override
    public int read(final byte[] array) throws IOException {
        return this.read(array, 0, array.length);
    }
    
    @Override
    public int read(final byte[] b, int a, final int len) throws IOException {
        synchronized (this) {
            a = this.a(super.read(b, a, len));
            return a;
        }
    }
}
