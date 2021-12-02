// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.parser;

public class j extends c
{
    int N;
    b O;
    char[] P;
    char[] Q;
    char[] R;
    
    public j(final char[] array) {
        super(array);
        this.N = 0;
        this.O = b.G;
        this.P = "true".toCharArray();
        this.Q = "false".toCharArray();
        this.R = "null".toCharArray();
    }
    
    public static c C(final char[] array) {
        return new j(array);
    }
    
    @Override
    protected String A(final int n, final int n2) {
        final StringBuilder sb = new StringBuilder();
        this.b(sb, n);
        sb.append(this.f());
        return sb.toString();
    }
    
    @Override
    protected String B() {
        if (g.d) {
            final StringBuilder sb = new StringBuilder();
            sb.append("<");
            sb.append(this.f());
            sb.append(">");
            return sb.toString();
        }
        return this.f();
    }
    
    public boolean D() throws h {
        final b o = this.O;
        if (o == b.H) {
            return true;
        }
        if (o == b.I) {
            return false;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("this token is not a boolean: <");
        sb.append(this.f());
        sb.append(">");
        throw new h(sb.toString(), this);
    }
    
    public b E() {
        return this.O;
    }
    
    public boolean F() throws h {
        if (this.O == b.J) {
            return true;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("this token is not a null: <");
        sb.append(this.f());
        sb.append(">");
        throw new h(sb.toString(), this);
    }
    
    public boolean G(final char c, final long n) {
        final int n2 = j$a.a[this.O.ordinal()];
        final int n3 = 0;
        final int n4 = 0;
        final boolean b = false;
        int n5 = 0;
        int n6 = 0;
        Label_0311: {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            n6 = (b ? 1 : 0);
                            break Label_0311;
                        }
                        final char[] p2 = this.P;
                        final int n7 = this.N;
                        b o;
                        if (p2[n7] == c) {
                            o = j.b.H;
                        }
                        else if (this.Q[n7] == c) {
                            o = j.b.I;
                        }
                        else {
                            n6 = (b ? 1 : 0);
                            if (this.R[n7] != c) {
                                break Label_0311;
                            }
                            o = j.b.J;
                        }
                        this.O = o;
                        n6 = 1;
                        break Label_0311;
                    }
                    else {
                        final char[] r = this.R;
                        final int n8 = this.N;
                        if (r[n8] == c) {
                            n5 = 1;
                        }
                        n6 = n5;
                        if (n5 == 0) {
                            break Label_0311;
                        }
                        n6 = n5;
                        if (n8 + 1 != r.length) {
                            break Label_0311;
                        }
                        n6 = n5;
                    }
                }
                else {
                    final char[] q = this.Q;
                    final int n9 = this.N;
                    int n10 = n3;
                    if (q[n9] == c) {
                        n10 = 1;
                    }
                    n6 = n10;
                    if (n10 == 0) {
                        break Label_0311;
                    }
                    n6 = n10;
                    if (n9 + 1 != q.length) {
                        break Label_0311;
                    }
                    n6 = n10;
                }
            }
            else {
                final char[] p3 = this.P;
                final int n11 = this.N;
                int n12 = n4;
                if (p3[n11] == c) {
                    n12 = 1;
                }
                n6 = n12;
                if (n12 == 0) {
                    break Label_0311;
                }
                n6 = n12;
                if (n11 + 1 != p3.length) {
                    break Label_0311;
                }
                n6 = n12;
            }
            this.w(n);
        }
        ++this.N;
        return n6 != 0;
    }
    
    enum b
    {
        G, 
        H, 
        I, 
        J;
    }
}
