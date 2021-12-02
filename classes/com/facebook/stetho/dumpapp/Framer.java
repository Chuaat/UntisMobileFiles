// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.dumpapp;

import java.nio.charset.Charset;
import com.facebook.stetho.common.LogUtil;
import c6.h;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;

class Framer
{
    public static final byte ENTER_FRAME_PREFIX = 33;
    public static final byte EXIT_FRAME_PREFIX = 120;
    public static final byte STDERR_FRAME_PREFIX = 50;
    public static final byte STDIN_FRAME_PREFIX = 45;
    public static final byte STDIN_REQUEST_FRAME_PREFIX = 95;
    public static final byte STDOUT_FRAME_PREFIX = 49;
    private static final String TAG = "FramingSocket";
    private final DataInputStream mInput;
    private final DataOutputStream mMultiplexedOutputStream;
    private final PrintStream mStderr;
    private final InputStream mStdin;
    private final PrintStream mStdout;
    
    public Framer(final InputStream in, final OutputStream out) throws IOException {
        this.mInput = new DataInputStream(in);
        this.mMultiplexedOutputStream = new DataOutputStream(out);
        this.mStdin = new FramingInputStream();
        this.mStdout = new PrintStream(new BufferedOutputStream(new FramingOutputStream((byte)49)));
        this.mStderr = new PrintStream(new FramingOutputStream((byte)50));
    }
    
    private static <T extends Throwable> T handleSuppression(@h final T obj, final T t) {
        if (obj == null) {
            return t;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Suppressed while handling ");
        sb.append(obj);
        LogUtil.i("FramingSocket", t, sb.toString());
        return obj;
    }
    
    public PrintStream getStderr() {
        return this.mStderr;
    }
    
    public InputStream getStdin() {
        return this.mStdin;
    }
    
    public PrintStream getStdout() {
        return this.mStdout;
    }
    
    public byte readFrameType() throws IOException {
        return this.mInput.readByte();
    }
    
    public int readInt() throws IOException {
        return this.mInput.readInt();
    }
    
    public String readString() throws IOException {
        final byte[] array = new byte[this.mInput.readUnsignedShort()];
        this.mInput.readFully(array);
        return new String(array, Charset.forName("UTF-8"));
    }
    
    public void writeBlob(final byte[] b, final int off, final int len) throws IOException {
        this.mMultiplexedOutputStream.write(b, off, len);
    }
    
    public void writeExitCode(final int n) throws IOException {
        this.mStdout.flush();
        this.mStderr.flush();
        this.writeIntFrame((byte)120, n);
    }
    
    public void writeIntFrame(final byte b, final int v) throws IOException {
        this.mMultiplexedOutputStream.write(b);
        this.mMultiplexedOutputStream.writeInt(v);
    }
    
    private static class ClosedHelper
    {
        private volatile boolean mClosed;
        
        public void close() {
            this.mClosed = true;
        }
        
        public void throwIfClosed() throws IOException {
            if (!this.mClosed) {
                return;
            }
            throw new IOException("Stream is closed");
        }
    }
    
    private class FramingInputStream extends InputStream
    {
        private final ClosedHelper mClosedHelper;
        
        private FramingInputStream() {
            this.mClosedHelper = new ClosedHelper();
        }
        
        @Override
        public void close() throws IOException {
            this.mClosedHelper.close();
        }
        
        @Override
        public int read() throws IOException {
            final byte[] array = { 0 };
            if (this.read(array) == 0) {
                return -1;
            }
            return array[0];
        }
        
        @Override
        public int read(final byte[] array) throws IOException {
            return this.read(array, 0, array.length);
        }
        
        @Override
        public int read(final byte[] b, final int off, final int i) throws IOException {
            this.mClosedHelper.throwIfClosed();
            synchronized (Framer.this) {
                Framer.this.writeIntFrame((byte)95, i);
                final byte frameType = Framer.this.readFrameType();
                if (frameType == 45) {
                    final int int1 = Framer.this.readInt();
                    if (int1 > 0) {
                        if (int1 > i) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Expected at most ");
                            sb.append(i);
                            sb.append(" bytes, got: ");
                            sb.append(int1);
                            throw new DumpappFramingException(sb.toString());
                        }
                        Framer.this.mInput.readFully(b, off, int1);
                    }
                    return int1;
                }
                throw new UnexpectedFrameException((byte)45, frameType);
            }
        }
        
        @Override
        public long skip(final long a) throws IOException {
            final byte[] array = new byte[(int)Math.min(a, 2048L)];
            final Framer this$0 = Framer.this;
            // monitorenter(this$0)
            long n = 0L;
            while (true) {
                if (n >= a) {
                    return n;
                }
                try {
                    final int read = this.read(array);
                    if (read < 0) {
                        return n;
                    }
                    n += read;
                }
                finally {
                }
                // monitorexit(this$0)
            }
        }
    }
    
    private class FramingOutputStream extends OutputStream
    {
        private final ClosedHelper mClosedHelper;
        private final byte mPrefix;
        
        public FramingOutputStream(final byte b) {
            this.mClosedHelper = new ClosedHelper();
            this.mPrefix = b;
        }
        
        @Override
        public void close() throws IOException {
            this.mClosedHelper.close();
        }
        
        @Override
        public void write(final int n) throws IOException {
            this.write(new byte[] { (byte)n }, 0, 1);
        }
        
        @Override
        public void write(final byte[] array) throws IOException {
            this.write(array, 0, array.length);
        }
        
        @Override
        public void write(final byte[] array, final int n, final int n2) throws IOException {
            this.mClosedHelper.throwIfClosed();
            if (n2 > 0) {
                try {
                    synchronized (Framer.this) {
                        Framer.this.writeIntFrame(this.mPrefix, n2);
                        Framer.this.writeBlob(array, n, n2);
                        Framer.this.mMultiplexedOutputStream.flush();
                    }
                }
                catch (IOException ex) {
                    throw new DumpappOutputBrokenException(ex);
                }
            }
        }
    }
}
