// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.network;

import java.io.IOException;
import java.io.OutputStream;
import java.io.FilterOutputStream;

class CountingOutputStream extends FilterOutputStream
{
    private long mCount;
    
    public CountingOutputStream(final OutputStream out) {
        super(out);
    }
    
    public long getCount() {
        return this.mCount;
    }
    
    @Override
    public void write(final int n) throws IOException {
        super.out.write(n);
        ++this.mCount;
    }
    
    @Override
    public void write(final byte[] array) throws IOException {
        this.write(array, 0, array.length);
    }
    
    @Override
    public void write(final byte[] b, final int off, final int len) throws IOException {
        super.out.write(b, off, len);
        this.mCount += len;
    }
}
