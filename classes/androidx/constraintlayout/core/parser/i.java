// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.parser;

public class i extends c
{
    public i(final char[] array) {
        super(array);
    }
    
    public static c C(final char[] array) {
        return new i(array);
    }
    
    @Override
    protected String A(final int n, final int n2) {
        final StringBuilder sb = new StringBuilder();
        this.b(sb, n);
        sb.append("'");
        sb.append(this.f());
        sb.append("'");
        return sb.toString();
    }
    
    @Override
    protected String B() {
        final StringBuilder sb = new StringBuilder();
        sb.append("'");
        sb.append(this.f());
        sb.append("'");
        return sb.toString();
    }
}
