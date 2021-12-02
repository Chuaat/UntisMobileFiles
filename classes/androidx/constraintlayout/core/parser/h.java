// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.parser;

public class h extends Exception
{
    private final String G;
    private final int H;
    private final String I;
    
    public h(final String g, final c c) {
        this.G = g;
        int n;
        if (c != null) {
            this.I = c.p();
            n = c.n();
        }
        else {
            this.I = "unknown";
            n = 0;
        }
        this.H = n;
    }
    
    public String a() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.G);
        sb.append(" (");
        sb.append(this.I);
        sb.append(" at line ");
        sb.append(this.H);
        sb.append(")");
        return sb.toString();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CLParsingException (");
        sb.append(this.hashCode());
        sb.append(") : ");
        sb.append(this.a());
        return sb.toString();
    }
}
