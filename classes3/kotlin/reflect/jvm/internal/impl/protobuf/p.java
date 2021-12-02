// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;
import java.util.Iterator;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

class p extends d
{
    protected final byte[] I;
    private int J;
    
    p(final byte[] i) {
        this.J = 0;
        this.I = i;
    }
    
    static int I(int i, final byte[] array, final int n, final int n2) {
        int n3 = i;
        for (i = n; i < n + n2; ++i) {
            n3 = n3 * 31 + array[i];
        }
        return n3;
    }
    
    @Override
    public String B(final String charsetName) throws UnsupportedEncodingException {
        return new String(this.I, this.H(), this.size(), charsetName);
    }
    
    @Override
    void E(final OutputStream outputStream, final int n, final int len) throws IOException {
        outputStream.write(this.I, this.H() + n, len);
    }
    
    public byte F(final int n) {
        return this.I[n];
    }
    
    boolean G(final p p3, int i, final int n) {
        if (n > p3.size()) {
            i = this.size();
            final StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(n);
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + n <= p3.size()) {
            final byte[] j = this.I;
            final byte[] k = p3.I;
            final int h = this.H();
            final int h2 = this.H();
            final int n2 = p3.H() + i;
            i = h2;
            for (int n3 = n2; i < h + n; ++i, ++n3) {
                if (j[i] != k[n3]) {
                    return false;
                }
            }
            return true;
        }
        final int size = p3.size();
        final StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(n);
        sb2.append(", ");
        sb2.append(size);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    protected int H() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        if (this.size() != ((d)o).size()) {
            return false;
        }
        if (this.size() == 0) {
            return true;
        }
        if (o instanceof p) {
            return this.G((p)o, 0, this.size());
        }
        if (o instanceof u) {
            return o.equals(this);
        }
        final String value = String.valueOf(o.getClass());
        final StringBuilder sb = new StringBuilder(value.length() + 49);
        sb.append("Has a new type of ByteString been created? Found ");
        sb.append(value);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public int hashCode() {
        int j;
        if ((j = this.J) == 0) {
            final int size = this.size();
            if ((j = this.w(size, 0, size)) == 0) {
                j = 1;
            }
            this.J = j;
        }
        return j;
    }
    
    @Override
    protected void n(final byte[] array, final int n, final int n2, final int n3) {
        System.arraycopy(this.I, n, array, n2, n3);
    }
    
    @Override
    protected int o() {
        return 0;
    }
    
    @Override
    protected boolean p() {
        return true;
    }
    
    @Override
    public boolean q() {
        final int h = this.H();
        return y.f(this.I, h, this.size() + h);
    }
    
    @Override
    public a r() {
        return new b();
    }
    
    @Override
    public int size() {
        return this.I.length;
    }
    
    @Override
    public e t() {
        return e.h(this);
    }
    
    @Override
    protected int w(final int n, final int n2, final int n3) {
        return I(n, this.I, this.H() + n2, n3);
    }
    
    @Override
    protected int x(final int n, int n2, final int n3) {
        n2 += this.H();
        return y.g(n, this.I, n2, n3 + n2);
    }
    
    @Override
    protected int z() {
        return this.J;
    }
    
    private class b implements a
    {
        private int G;
        private final int H;
        
        private b() {
            this.G = 0;
            this.H = p.this.size();
        }
        
        public Byte a() {
            return this.n();
        }
        
        @Override
        public boolean hasNext() {
            return this.G < this.H;
        }
        
        @Override
        public byte n() {
            try {
                return p.this.I[this.G++];
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                throw new NoSuchElementException(ex.getMessage());
            }
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
