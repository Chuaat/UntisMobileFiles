// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.parser;

import java.util.Iterator;

public class f extends b implements Iterable<d>
{
    public f(final char[] array) {
        super(array);
    }
    
    public static f j0(final char[] array) {
        return new f(array);
    }
    
    public String A(final int n, final int n2) {
        final StringBuilder sb = new StringBuilder(this.i());
        sb.append("{\n");
        final Iterator<c> iterator = super.N.iterator();
        int n3 = 1;
        while (iterator.hasNext()) {
            final c c = iterator.next();
            if (n3 == 0) {
                sb.append(",\n");
            }
            else {
                n3 = 0;
            }
            sb.append(c.A(androidx.constraintlayout.core.parser.c.M + n, n2 - 1));
        }
        sb.append("\n");
        this.b(sb, n);
        sb.append("}");
        return sb.toString();
    }
    
    public String B() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.i());
        sb.append("{ ");
        final StringBuilder sb2 = new StringBuilder(sb.toString());
        final Iterator<c> iterator = super.N.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final c c = iterator.next();
            if (n == 0) {
                sb2.append(", ");
            }
            else {
                n = 0;
            }
            sb2.append(c.B());
        }
        sb2.append(" }");
        return sb2.toString();
    }
    
    @Override
    public Iterator iterator() {
        return new a(this);
    }
    
    public String k0() {
        return this.A(0, 0);
    }
    
    private class a implements Iterator
    {
        f G;
        int H;
        
        public a(final f g) {
            this.H = 0;
            this.G = g;
        }
        
        @Override
        public boolean hasNext() {
            return this.H < this.G.size();
        }
        
        @Override
        public Object next() {
            final d d = this.G.N.get(this.H);
            ++this.H;
            return d;
        }
    }
}
