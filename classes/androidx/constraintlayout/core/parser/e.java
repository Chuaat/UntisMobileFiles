// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.parser;

public class e extends c
{
    float N;
    
    public e(final float n) {
        super(null);
        this.N = Float.NaN;
        this.N = n;
    }
    
    public e(final char[] array) {
        super(array);
        this.N = Float.NaN;
    }
    
    public static c C(final char[] array) {
        return new e(array);
    }
    
    @Override
    protected String A(int i, final int n) {
        final StringBuilder sb = new StringBuilder();
        this.b(sb, i);
        final float l = this.l();
        i = (int)l;
        if (i == l) {
            sb.append(i);
        }
        else {
            sb.append(l);
        }
        return sb.toString();
    }
    
    @Override
    protected String B() {
        final float l = this.l();
        final int i = (int)l;
        if (i == l) {
            final StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(i);
            return sb.toString();
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        sb2.append(l);
        return sb2.toString();
    }
    
    public boolean D() {
        final float l = this.l();
        return (int)l == l;
    }
    
    public void E(final float n) {
        this.N = n;
    }
    
    @Override
    public float l() {
        if (Float.isNaN(this.N)) {
            this.N = Float.parseFloat(this.f());
        }
        return this.N;
    }
    
    @Override
    public int m() {
        if (Float.isNaN(this.N)) {
            this.N = (float)Integer.parseInt(this.f());
        }
        return (int)this.N;
    }
}
