// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.parser;

import java.util.Iterator;

public class a extends b
{
    public a(final char[] array) {
        super(array);
    }
    
    public static c D(final char[] array) {
        return new a(array);
    }
    
    @Override
    protected String A(final int n, final int n2) {
        final StringBuilder sb = new StringBuilder();
        final String b = this.B();
        if (n2 <= 0 && b.length() + n < c.L) {
            sb.append(b);
        }
        else {
            sb.append("[\n");
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
                this.b(sb, androidx.constraintlayout.core.parser.c.M + n);
                sb.append(c.A(androidx.constraintlayout.core.parser.c.M + n, n2 - 1));
            }
            sb.append("\n");
            this.b(sb, n);
            sb.append("]");
        }
        return sb.toString();
    }
    
    @Override
    protected String B() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.i());
        sb.append("[");
        final StringBuilder obj = new StringBuilder(sb.toString());
        int n = 1;
        for (int i = 0; i < super.N.size(); ++i) {
            if (n == 0) {
                obj.append(", ");
            }
            else {
                n = 0;
            }
            obj.append(super.N.get(i).B());
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append((Object)obj);
        sb2.append("]");
        return sb2.toString();
    }
}
