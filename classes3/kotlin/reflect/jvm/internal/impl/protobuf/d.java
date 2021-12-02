// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class d implements Iterable<Byte>
{
    public static final d G;
    
    static {
        G = new p(new byte[0]);
    }
    
    d() {
    }
    
    private static d b(final Iterator<d> iterator, final int n) {
        d f;
        if (n == 1) {
            f = iterator.next();
        }
        else {
            final int n2 = n >>> 1;
            f = b(iterator, n2).f(b(iterator, n - n2));
        }
        return f;
    }
    
    public static d h(final Iterable<d> iterable) {
        Object o;
        if (!(iterable instanceof Collection)) {
            final ArrayList<d> list = new ArrayList<d>();
            final Iterator<d> iterator = iterable.iterator();
            while (true) {
                o = list;
                if (!iterator.hasNext()) {
                    break;
                }
                list.add(iterator.next());
            }
        }
        else {
            o = iterable;
        }
        d d;
        if (((Collection)o).isEmpty()) {
            d = kotlin.reflect.jvm.internal.impl.protobuf.d.G;
        }
        else {
            d = b(((Collection<d>)o).iterator(), ((Collection)o).size());
        }
        return d;
    }
    
    public static d i(final byte[] array) {
        return k(array, 0, array.length);
    }
    
    public static d k(final byte[] array, final int n, final int n2) {
        final byte[] array2 = new byte[n2];
        System.arraycopy(array, n, array2, 0, n2);
        return new p(array2);
    }
    
    public static d l(final String s) {
        try {
            return new p(s.getBytes("UTF-8"));
        }
        catch (UnsupportedEncodingException cause) {
            throw new RuntimeException("UTF-8 not supported?", cause);
        }
    }
    
    public static b v() {
        return new b(128);
    }
    
    public byte[] A() {
        final int size = this.size();
        if (size == 0) {
            return j.a;
        }
        final byte[] array = new byte[size];
        this.n(array, 0, 0, size);
        return array;
    }
    
    public abstract String B(final String p0) throws UnsupportedEncodingException;
    
    public String C() {
        try {
            return this.B("UTF-8");
        }
        catch (UnsupportedEncodingException cause) {
            throw new RuntimeException("UTF-8 not supported?", cause);
        }
    }
    
    void D(final OutputStream outputStream, final int i, final int j) throws IOException {
        if (i < 0) {
            final StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (j < 0) {
            final StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(j);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        final int k = i + j;
        if (k <= this.size()) {
            if (j > 0) {
                this.E(outputStream, i, j);
            }
            return;
        }
        final StringBuilder sb3 = new StringBuilder(39);
        sb3.append("Source end offset exceeded: ");
        sb3.append(k);
        throw new IndexOutOfBoundsException(sb3.toString());
    }
    
    abstract void E(final OutputStream p0, final int p1, final int p2) throws IOException;
    
    public d f(final d d) {
        final int size = this.size();
        final int size2 = d.size();
        if (size + (long)size2 < 2147483647L) {
            return u.I(this, d);
        }
        final StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    public void m(final byte[] array, final int i, final int j, final int k) {
        if (i < 0) {
            final StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (j < 0) {
            final StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(j);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (k < 0) {
            final StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(k);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        final int l = i + k;
        if (l > this.size()) {
            final StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(l);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        final int m = j + k;
        if (m <= array.length) {
            if (k > 0) {
                this.n(array, i, j, k);
            }
            return;
        }
        final StringBuilder sb5 = new StringBuilder(34);
        sb5.append("Target end offset < 0: ");
        sb5.append(m);
        throw new IndexOutOfBoundsException(sb5.toString());
    }
    
    protected abstract void n(final byte[] p0, final int p1, final int p2, final int p3);
    
    protected abstract int o();
    
    protected abstract boolean p();
    
    public abstract boolean q();
    
    public abstract a r();
    
    public abstract int size();
    
    public abstract e t();
    
    @Override
    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.size());
    }
    
    protected abstract int w(final int p0, final int p1, final int p2);
    
    protected abstract int x(final int p0, final int p1, final int p2);
    
    protected abstract int z();
    
    public interface a extends Iterator<Byte>
    {
        byte n();
    }
    
    public static final class b extends OutputStream
    {
        private static final byte[] L;
        private final int G;
        private final ArrayList<d> H;
        private int I;
        private byte[] J;
        private int K;
        
        static {
            L = new byte[0];
        }
        
        b(final int g) {
            if (g >= 0) {
                this.G = g;
                this.H = new ArrayList<d>();
                this.J = new byte[g];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }
        
        private byte[] a(final byte[] array, final int b) {
            final byte[] array2 = new byte[b];
            System.arraycopy(array, 0, array2, 0, Math.min(array.length, b));
            return array2;
        }
        
        private void b(final int a) {
            this.H.add(new p(this.J));
            final int i = this.I + this.J.length;
            this.I = i;
            this.J = new byte[Math.max(this.G, Math.max(a, i >>> 1))];
            this.K = 0;
        }
        
        private void c() {
            final int k = this.K;
            final byte[] j = this.J;
            if (k < j.length) {
                if (k > 0) {
                    this.H.add(new p(this.a(j, k)));
                }
            }
            else {
                this.H.add(new p(this.J));
                this.J = b.L;
            }
            this.I += this.K;
            this.K = 0;
        }
        
        public int d() {
            synchronized (this) {
                return this.I + this.K;
            }
        }
        
        public d e() {
            synchronized (this) {
                this.c();
                return d.h(this.H);
            }
        }
        
        @Override
        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.d());
        }
        
        @Override
        public void write(final int n) {
            synchronized (this) {
                if (this.K == this.J.length) {
                    this.b(1);
                }
                this.J[this.K++] = (byte)n;
            }
        }
        
        @Override
        public void write(final byte[] array, final int n, int k) {
            synchronized (this) {
                final byte[] j = this.J;
                final int length = j.length;
                final int i = this.K;
                if (k <= length - i) {
                    System.arraycopy(array, n, j, i, k);
                    this.K += k;
                }
                else {
                    final int n2 = j.length - i;
                    System.arraycopy(array, n, j, i, n2);
                    k -= n2;
                    this.b(k);
                    System.arraycopy(array, n + n2, this.J, 0, k);
                    this.K = k;
                }
            }
        }
    }
}
