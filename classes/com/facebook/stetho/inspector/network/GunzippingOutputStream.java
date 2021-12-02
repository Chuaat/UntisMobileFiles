// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.network;

import com.facebook.stetho.common.Util;
import java.util.zip.GZIPInputStream;
import java.util.concurrent.ExecutionException;
import com.facebook.stetho.common.ExceptionUtil;
import java.util.concurrent.Callable;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.io.PipedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.io.FilterOutputStream;

class GunzippingOutputStream extends FilterOutputStream
{
    private static final ExecutorService sExecutor;
    private final Future<Void> mCopyFuture;
    
    static {
        sExecutor = Executors.newCachedThreadPool();
    }
    
    private GunzippingOutputStream(final OutputStream out, final Future<Void> mCopyFuture) throws IOException {
        super(out);
        this.mCopyFuture = mCopyFuture;
    }
    
    public static GunzippingOutputStream create(final OutputStream outputStream) throws IOException {
        final PipedInputStream snk = new PipedInputStream();
        return new GunzippingOutputStream(new PipedOutputStream(snk), GunzippingOutputStream.sExecutor.submit((Callable<Void>)new GunzippingCallable(snk, outputStream)));
    }
    
    private static <T> T getAndRethrow(final Future<T> future) throws IOException {
        try {
            return future.get();
        }
        catch (ExecutionException ex) {
            final Throwable cause = ex.getCause();
            ExceptionUtil.propagateIfInstanceOf(cause, IOException.class);
            ExceptionUtil.propagate(cause);
            return future.get();
        }
        catch (InterruptedException ex2) {
            return future.get();
        }
    }
    
    @Override
    public void close() throws IOException {
        try {
            super.close();
            try {
                getAndRethrow(this.mCopyFuture);
            }
            catch (IOException ex) {
                throw ex;
            }
        }
        finally {
            try {
                getAndRethrow(this.mCopyFuture);
            }
            catch (IOException ex2) {}
        }
    }
    
    private static class GunzippingCallable implements Callable<Void>
    {
        private final InputStream mIn;
        private final OutputStream mOut;
        
        public GunzippingCallable(final InputStream mIn, final OutputStream mOut) {
            this.mIn = mIn;
            this.mOut = mOut;
        }
        
        @Override
        public Void call() throws IOException {
            final GZIPInputStream gzipInputStream = new GZIPInputStream(this.mIn);
            try {
                Util.copy(gzipInputStream, this.mOut, new byte[1024]);
                return null;
            }
            finally {
                gzipInputStream.close();
                this.mOut.close();
            }
        }
    }
}
