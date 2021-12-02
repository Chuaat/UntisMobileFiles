// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;
import java.util.Iterator;

class c extends p
{
    private final int K;
    private final int L;
    
    c(final byte[] array, final int n, final int n2) {
        super(array);
        if (n < 0) {
            final StringBuilder sb = new StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n2 < 0) {
            final StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(n);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (n + (long)n2 <= array.length) {
            this.K = n;
            this.L = n2;
            return;
        }
        final StringBuilder sb3 = new StringBuilder(48);
        sb3.append("Offset+Length too large: ");
        sb3.append(n);
        sb3.append("+");
        sb3.append(n2);
        throw new IllegalArgumentException(sb3.toString());
    }
    
    @Override
    public byte F(final int n) {
        if (n < 0) {
            final StringBuilder sb = new StringBuilder(28);
            sb.append("Index too small: ");
            sb.append(n);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        if (n < this.size()) {
            return super.I[this.K + n];
        }
        final int size = this.size();
        final StringBuilder sb2 = new StringBuilder(41);
        sb2.append("Index too large: ");
        sb2.append(n);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }
    
    @Override
    protected int H() {
        return this.K;
    }
    
    @Override
    protected void n(final byte[] array, final int n, final int n2, final int n3) {
        System.arraycopy(super.I, this.H() + n, array, n2, n3);
    }
    
    @Override
    public a r() {
        return new b();
    }
    
    @Override
    public int size() {
        return this.L;
    }
    
    private class b implements a
    {
        private int G;
        private final int H;
        
        private b() {
            final int h = c.this.H();
            this.G = h;
            this.H = h + c.this.size();
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
            final int g = this.G;
            if (g < this.H) {
                final byte[] i = c.this.I;
                this.G = g + 1;
                return i[g];
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
