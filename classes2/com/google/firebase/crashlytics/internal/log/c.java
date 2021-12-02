// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.log;

import java.util.logging.Level;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.io.IOException;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.logging.Logger;
import java.io.Closeable;

class c implements Closeable
{
    private static final Logger M;
    private static final int N = 4096;
    static final int O = 16;
    private final RandomAccessFile G;
    int H;
    private int I;
    private b J;
    private b K;
    private final byte[] L;
    
    static {
        M = Logger.getLogger(c.class.getName());
    }
    
    public c(final File file) throws IOException {
        this.L = new byte[16];
        if (!file.exists()) {
            n(file);
        }
        this.G = r(file);
        this.x();
    }
    
    c(final RandomAccessFile g) throws IOException {
        this.L = new byte[16];
        this.G = g;
        this.x();
    }
    
    private int C() {
        return this.H - this.K();
    }
    
    private void F(int h, final byte[] array, int n, int len) throws IOException {
        final int l = this.L(h);
        h = this.H;
        RandomAccessFile randomAccessFile;
        if (l + len <= h) {
            this.G.seek(l);
            randomAccessFile = this.G;
        }
        else {
            h -= l;
            this.G.seek(l);
            this.G.readFully(array, n, h);
            this.G.seek(16L);
            randomAccessFile = this.G;
            n += h;
            len -= h;
        }
        randomAccessFile.readFully(array, n, len);
    }
    
    private void G(int h, final byte[] array, int n, int len) throws IOException {
        final int l = this.L(h);
        h = this.H;
        RandomAccessFile randomAccessFile;
        if (l + len <= h) {
            this.G.seek(l);
            randomAccessFile = this.G;
        }
        else {
            h -= l;
            this.G.seek(l);
            this.G.write(array, n, h);
            this.G.seek(16L);
            randomAccessFile = this.G;
            n += h;
            len -= h;
        }
        randomAccessFile.write(array, n, len);
    }
    
    private void H(final int n) throws IOException {
        this.G.setLength(n);
        this.G.getChannel().force(true);
    }
    
    private int L(int n) {
        final int h = this.H;
        if (n >= h) {
            n = n + 16 - h;
        }
        return n;
    }
    
    private void M(final int n, final int n2, final int n3, final int n4) throws IOException {
        Q(this.L, n, n2, n3, n4);
        this.G.seek(0L);
        this.G.write(this.L);
    }
    
    private static void N(final byte[] array, final int n, final int n2) {
        array[n] = (byte)(n2 >> 24);
        array[n + 1] = (byte)(n2 >> 16);
        array[n + 2] = (byte)(n2 >> 8);
        array[n + 3] = (byte)n2;
    }
    
    private static void Q(final byte[] array, final int... array2) {
        final int length = array2.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            N(array, n, array2[i]);
            n += 4;
            ++i;
        }
    }
    
    private void h(int n) throws IOException {
        final int n2 = n + 4;
        int c = this.C();
        if (c >= n2) {
            return;
        }
        n = this.H;
        int i;
        int h;
        do {
            i = c + n;
            h = n << 1;
            c = i;
            n = h;
        } while (i < n2);
        this.H(h);
        final b k = this.K;
        n = this.L(k.a + 4 + k.b);
        if (n < this.J.a) {
            final FileChannel channel = this.G.getChannel();
            channel.position(this.H);
            final long n3 = n - 4;
            if (channel.transferTo(16L, n3, channel) != n3) {
                throw new AssertionError((Object)"Copied insufficient number of bytes!");
            }
        }
        final int a = this.K.a;
        n = this.J.a;
        if (a < n) {
            final int n4 = this.H + a - 16;
            this.M(h, this.I, n, n4);
            this.K = new b(n4, this.K.b);
        }
        else {
            this.M(h, this.I, n, a);
        }
        this.H = h;
    }
    
    private static void n(final File dest) throws IOException {
        final StringBuilder sb = new StringBuilder();
        sb.append(dest.getPath());
        sb.append(".tmp");
        final File file = new File(sb.toString());
        final RandomAccessFile r = r(file);
        try {
            r.setLength(4096L);
            r.seek(0L);
            final byte[] b = new byte[16];
            Q(b, 4096, 0, 0, 0);
            r.write(b);
            r.close();
            if (file.renameTo(dest)) {
                return;
            }
            throw new IOException("Rename failed!");
        }
        finally {
            r.close();
        }
    }
    
    private static <T> T q(final T obj, final String message) {
        Objects.requireNonNull(obj, message);
        return obj;
    }
    
    private static RandomAccessFile r(final File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }
    
    private b w(final int n) throws IOException {
        if (n == 0) {
            return b.d;
        }
        this.G.seek(n);
        return new b(n, this.G.readInt());
    }
    
    private void x() throws IOException {
        this.G.seek(0L);
        this.G.readFully(this.L);
        final int y = y(this.L, 0);
        this.H = y;
        if (y <= this.G.length()) {
            this.I = y(this.L, 4);
            final int y2 = y(this.L, 8);
            final int y3 = y(this.L, 12);
            this.J = this.w(y2);
            this.K = this.w(y3);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("File is truncated. Expected length: ");
        sb.append(this.H);
        sb.append(", Actual length: ");
        sb.append(this.G.length());
        throw new IOException(sb.toString());
    }
    
    private static int y(final byte[] array, final int n) {
        return ((array[n] & 0xFF) << 24) + ((array[n + 1] & 0xFF) << 16) + ((array[n + 2] & 0xFF) << 8) + (array[n + 3] & 0xFF);
    }
    
    public void D() throws IOException {
        synchronized (this) {
            if (!this.o()) {
                if (this.I == 1) {
                    this.g();
                }
                else {
                    final b j = this.J;
                    final int l = this.L(j.a + 4 + j.b);
                    this.F(l, this.L, 0, 4);
                    final int y = y(this.L, 0);
                    this.M(this.H, this.I - 1, l, this.K.a);
                    --this.I;
                    this.J = new b(l, y);
                }
                return;
            }
            throw new NoSuchElementException();
        }
    }
    
    public int J() {
        synchronized (this) {
            return this.I;
        }
    }
    
    public int K() {
        if (this.I == 0) {
            return 16;
        }
        final b k = this.K;
        final int a = k.a;
        final int a2 = this.J.a;
        if (a >= a2) {
            return a - a2 + 4 + k.b + 16;
        }
        return a + 4 + k.b + this.H - a2;
    }
    
    @Override
    public void close() throws IOException {
        synchronized (this) {
            this.G.close();
        }
    }
    
    public void e(final byte[] array) throws IOException {
        this.f(array, 0, array.length);
    }
    
    public void f(final byte[] array, int n, final int n2) throws IOException {
        synchronized (this) {
            q(array, "buffer");
            if ((n | n2) >= 0 && n2 <= array.length - n) {
                this.h(n2);
                final boolean o = this.o();
                int l;
                if (o) {
                    l = 16;
                }
                else {
                    final b k = this.K;
                    l = this.L(k.a + 4 + k.b);
                }
                final b b = new b(l, n2);
                N(this.L, 0, n2);
                this.G(b.a, this.L, 0, 4);
                this.G(b.a + 4, array, n, n2);
                if (o) {
                    n = b.a;
                }
                else {
                    n = this.J.a;
                }
                this.M(this.H, this.I + 1, n, b.a);
                this.K = b;
                ++this.I;
                if (o) {
                    this.J = b;
                }
                return;
            }
            throw new IndexOutOfBoundsException();
        }
    }
    
    public void g() throws IOException {
        synchronized (this) {
            this.M(4096, 0, 0, 0);
            this.I = 0;
            final b d = b.d;
            this.J = d;
            this.K = d;
            if (this.H > 4096) {
                this.H(4096);
            }
            this.H = 4096;
        }
    }
    
    public void j(final d d) throws IOException {
        synchronized (this) {
            int n = this.J.a;
            for (int i = 0; i < this.I; ++i) {
                final b w = this.w(n);
                d.i(new c(w), w.b);
                n = this.L(w.a + 4 + w.b);
            }
        }
    }
    
    public boolean k(final int n, final int n2) {
        return this.K() + 4 + n <= n2;
    }
    
    public boolean o() {
        synchronized (this) {
            return this.I == 0;
        }
    }
    
    public void s(final d d) throws IOException {
        synchronized (this) {
            if (this.I > 0) {
                d.i(new c(this.J), this.J.b);
            }
        }
    }
    
    public byte[] t() throws IOException {
        synchronized (this) {
            if (this.o()) {
                return null;
            }
            final b j = this.J;
            final int b = j.b;
            final byte[] array = new byte[b];
            this.F(j.a + 4, array, 0, b);
            return array;
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.H);
        sb.append(", size=");
        sb.append(this.I);
        sb.append(", first=");
        sb.append(this.J);
        sb.append(", last=");
        sb.append(this.K);
        sb.append(", element lengths=[");
        try {
            this.j((d)new d() {
                boolean a = true;
                
                @Override
                public void i(final InputStream inputStream, final int i) throws IOException {
                    if (this.a) {
                        this.a = false;
                    }
                    else {
                        sb.append(", ");
                    }
                    sb.append(i);
                }
            });
        }
        catch (IOException thrown) {
            c.M.log(Level.WARNING, "read error", thrown);
        }
        sb.append("]]");
        return sb.toString();
    }
    
    static class b
    {
        static final int c = 4;
        static final b d;
        final int a;
        final int b;
        
        static {
            d = new b(0, 0);
        }
        
        b(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getClass().getSimpleName());
            sb.append("[position = ");
            sb.append(this.a);
            sb.append(", length = ");
            sb.append(this.b);
            sb.append("]");
            return sb.toString();
        }
    }
    
    private final class c extends InputStream
    {
        private int G;
        private int H;
        
        private c(final b b) {
            this.G = com.google.firebase.crashlytics.internal.log.c.this.L(b.a + 4);
            this.H = b.b;
        }
        
        @Override
        public int read() throws IOException {
            if (this.H == 0) {
                return -1;
            }
            com.google.firebase.crashlytics.internal.log.c.this.G.seek(this.G);
            final int read = com.google.firebase.crashlytics.internal.log.c.this.G.read();
            this.G = com.google.firebase.crashlytics.internal.log.c.this.L(this.G + 1);
            --this.H;
            return read;
        }
        
        @Override
        public int read(final byte[] array, final int n, final int n2) throws IOException {
            q(array, "buffer");
            if ((n | n2) < 0 || n2 > array.length - n) {
                throw new ArrayIndexOutOfBoundsException();
            }
            final int h = this.H;
            if (h > 0) {
                int n3;
                if ((n3 = n2) > h) {
                    n3 = h;
                }
                com.google.firebase.crashlytics.internal.log.c.this.F(this.G, array, n, n3);
                this.G = com.google.firebase.crashlytics.internal.log.c.this.L(this.G + n3);
                this.H -= n3;
                return n3;
            }
            return -1;
        }
    }
    
    public interface d
    {
        void i(final InputStream p0, final int p1) throws IOException;
    }
}
