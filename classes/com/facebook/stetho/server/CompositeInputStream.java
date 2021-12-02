// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.server;

import java.io.IOException;
import com.facebook.stetho.common.LogUtil;
import d6.c;
import java.io.InputStream;

@c
public class CompositeInputStream extends InputStream
{
    private int mCurrentIndex;
    private final InputStream[] mStreams;
    
    public CompositeInputStream(final InputStream[] mStreams) {
        if (mStreams != null && mStreams.length >= 2) {
            this.mStreams = mStreams;
            this.mCurrentIndex = 0;
            return;
        }
        throw new IllegalArgumentException("Streams must be non-null and have more than 1 entry");
    }
    
    private void closeAll(final int n) throws IOException {
        IOException ex = null;
        int n2 = 0;
        while (true) {
            final InputStream[] mStreams = this.mStreams;
            if (n2 >= mStreams.length) {
                break;
            }
            try {
                mStreams[n2].close();
            }
            catch (IOException ex3) {
                IOException ex2 = ex3;
                if (n2 != n) {
                    if (ex == null) {
                        ex2 = ex3;
                    }
                    else {
                        ex2 = ex;
                    }
                }
                if (ex != null && ex != ex2) {
                    LogUtil.w(ex, "Suppressing exception");
                }
                ex = ex2;
            }
            ++n2;
        }
    }
    
    private boolean tryMoveToNextStream() {
        final int mCurrentIndex = this.mCurrentIndex;
        if (mCurrentIndex + 1 < this.mStreams.length) {
            this.mCurrentIndex = mCurrentIndex + 1;
            return true;
        }
        return false;
    }
    
    @Override
    public int available() throws IOException {
        return this.mStreams[this.mCurrentIndex].available();
    }
    
    @Override
    public void close() throws IOException {
        this.closeAll(this.mCurrentIndex);
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
        int read;
        do {
            read = this.mStreams[this.mCurrentIndex].read();
        } while (read == -1 && this.tryMoveToNextStream());
        return read;
    }
    
    @Override
    public int read(final byte[] array) throws IOException {
        return this.read(array, 0, array.length);
    }
    
    @Override
    public int read(final byte[] b, final int off, final int len) throws IOException {
        int read;
        do {
            read = this.mStreams[this.mCurrentIndex].read(b, off, len);
        } while (read == -1 && this.tryMoveToNextStream());
        return read;
    }
    
    @Override
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public long skip(long n) throws IOException {
        final int read = this.read(new byte[(int)n]);
        if (read >= 0) {
            n = read;
        }
        else {
            n = -1L;
        }
        return n;
    }
}
