// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.parser;

import java.io.PrintStream;

public class c
{
    protected static int L = 80;
    protected static int M = 2;
    private final char[] G;
    protected long H;
    protected long I;
    protected b J;
    private int K;
    
    public c(final char[] g) {
        this.H = -1L;
        this.I = Long.MAX_VALUE;
        this.G = g;
    }
    
    protected String A(final int n, final int n2) {
        return "";
    }
    
    protected String B() {
        return "";
    }
    
    protected void b(final StringBuilder sb, final int n) {
        for (int i = 0; i < n; ++i) {
            sb.append(' ');
        }
    }
    
    public String f() {
        final String s = new String(this.G);
        final long i = this.I;
        if (i != Long.MAX_VALUE) {
            final long h = this.H;
            if (i >= h) {
                return s.substring((int)h, (int)i + 1);
            }
        }
        final long h2 = this.H;
        return s.substring((int)h2, (int)h2 + 1);
    }
    
    public c h() {
        return this.J;
    }
    
    protected String i() {
        if (g.d) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.p());
            sb.append(" -> ");
            return sb.toString();
        }
        return "";
    }
    
    public long k() {
        return this.I;
    }
    
    public float l() {
        if (this instanceof e) {
            return ((e)this).l();
        }
        return Float.NaN;
    }
    
    public int m() {
        if (this instanceof e) {
            return ((e)this).m();
        }
        return 0;
    }
    
    public int n() {
        return this.K;
    }
    
    public long o() {
        return this.H;
    }
    
    protected String p() {
        final String string = this.getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }
    
    public boolean q() {
        return this.I != Long.MAX_VALUE;
    }
    
    public boolean r() {
        return this.H > -1L;
    }
    
    public boolean t() {
        return this.H == -1L;
    }
    
    @Override
    public String toString() {
        final long h = this.H;
        final long i = this.I;
        if (h <= i && i != Long.MAX_VALUE) {
            final String substring = new String(this.G).substring((int)this.H, (int)this.I + 1);
            final StringBuilder sb = new StringBuilder();
            sb.append(this.p());
            sb.append(" (");
            sb.append(this.H);
            sb.append(" : ");
            sb.append(this.I);
            sb.append(") <<");
            sb.append(substring);
            sb.append(">>");
            return sb.toString();
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.getClass());
        sb2.append(" (INVALID, ");
        sb2.append(this.H);
        sb2.append("-");
        sb2.append(this.I);
        sb2.append(")");
        return sb2.toString();
    }
    
    public void v(final b j) {
        this.J = j;
    }
    
    public void w(final long i) {
        if (this.I != Long.MAX_VALUE) {
            return;
        }
        this.I = i;
        if (g.d) {
            final PrintStream out = System.out;
            final StringBuilder sb = new StringBuilder();
            sb.append("closing ");
            sb.append(this.hashCode());
            sb.append(" -> ");
            sb.append(this);
            out.println(sb.toString());
        }
        final b j = this.J;
        if (j != null) {
            j.C(this);
        }
    }
    
    public void x(final int k) {
        this.K = k;
    }
    
    public void z(final long h) {
        this.H = h;
    }
}
