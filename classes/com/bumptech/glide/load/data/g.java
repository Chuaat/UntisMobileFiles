// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data;

import androidx.annotation.j0;
import java.io.IOException;
import java.io.InputStream;
import java.io.FilterInputStream;

public final class g extends FilterInputStream
{
    private static final int I = 2;
    private static final byte[] J;
    private static final int K;
    private static final int L;
    private final byte G;
    private int H;
    
    static {
        final byte[] array;
        final byte[] j = array = new byte[29];
        array[0] = -1;
        array[1] = -31;
        array[2] = 0;
        array[3] = 28;
        array[4] = 69;
        array[5] = 120;
        array[6] = 105;
        array[7] = 102;
        array[9] = (array[8] = 0);
        array[11] = (array[10] = 77);
        array[12] = 0;
        array[14] = (array[13] = 0);
        array[16] = (array[15] = 0);
        array[17] = 8;
        array[18] = 0;
        array[20] = (array[19] = 1);
        array[21] = 18;
        array[22] = 0;
        array[23] = 2;
        array[24] = 0;
        array[26] = (array[25] = 0);
        array[27] = 1;
        array[28] = 0;
        J = j;
        L = (K = j.length) + 2;
    }
    
    public g(final InputStream in, final int i) {
        super(in);
        if (i >= -1 && i <= 8) {
            this.G = (byte)i;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot add invalid orientation: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public void mark(final int n) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean markSupported() {
        return false;
    }
    
    @Override
    public int read() throws IOException {
        final int h = this.H;
        int n = 0;
        Label_0055: {
            if (h >= 2) {
                final int l = g.L;
                if (h <= l) {
                    if (h == l) {
                        n = this.G;
                        break Label_0055;
                    }
                    n = (g.J[h - 2] & 0xFF);
                    break Label_0055;
                }
            }
            n = super.read();
        }
        if (n != -1) {
            ++this.H;
        }
        return n;
    }
    
    @Override
    public int read(@j0 final byte[] array, int n, int min) throws IOException {
        final int h = this.H;
        final int l = g.L;
        if (h > l) {
            n = super.read(array, n, min);
        }
        else if (h == l) {
            array[n] = this.G;
            n = 1;
        }
        else if (h < 2) {
            n = super.read(array, n, 2 - h);
        }
        else {
            min = Math.min(l - h, min);
            System.arraycopy(g.J, this.H - 2, array, n, min);
            n = min;
        }
        if (n > 0) {
            this.H += n;
        }
        return n;
    }
    
    @Override
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public long skip(long skip) throws IOException {
        skip = super.skip(skip);
        if (skip > 0L) {
            this.H += (int)skip;
        }
        return skip;
    }
}
