// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

public class o extends IllegalArgumentException
{
    private static final long O = 6305711765985447737L;
    private final g G;
    private final m H;
    private final String I;
    private final Number J;
    private final String K;
    private final Number L;
    private final Number M;
    private String N;
    
    public o(final String i, final Number j, final Number l, final Number m) {
        super(a(i, j, l, m, null));
        this.G = null;
        this.H = null;
        this.I = i;
        this.J = j;
        this.K = null;
        this.L = l;
        this.M = m;
        this.N = super.getMessage();
    }
    
    public o(final String i, final String k) {
        super(b(i, k));
        this.G = null;
        this.H = null;
        this.I = i;
        this.K = k;
        this.J = null;
        this.L = null;
        this.M = null;
        this.N = super.getMessage();
    }
    
    public o(final g g, final Number j, final Number l, final Number m) {
        super(a(g.H(), j, l, m, null));
        this.G = g;
        this.H = null;
        this.I = g.H();
        this.J = j;
        this.K = null;
        this.L = l;
        this.M = m;
        this.N = super.getMessage();
    }
    
    public o(final g g, final Number j, final String s) {
        super(a(g.H(), j, null, null, s));
        this.G = g;
        this.H = null;
        this.I = g.H();
        this.J = j;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = super.getMessage();
    }
    
    public o(final g g, final String k) {
        super(b(g.H(), k));
        this.G = g;
        this.H = null;
        this.I = g.H();
        this.K = k;
        this.J = null;
        this.L = null;
        this.M = null;
        this.N = super.getMessage();
    }
    
    public o(final m h, final Number j, final Number l, final Number m) {
        super(a(h.e(), j, l, m, null));
        this.G = null;
        this.H = h;
        this.I = h.e();
        this.J = j;
        this.K = null;
        this.L = l;
        this.M = m;
        this.N = super.getMessage();
    }
    
    public o(final m h, final String k) {
        super(b(h.e(), k));
        this.G = null;
        this.H = h;
        this.I = h.e();
        this.K = k;
        this.J = null;
        this.L = null;
        this.M = null;
        this.N = super.getMessage();
    }
    
    private static String a(final String str, final Number obj, final Number n, final Number n2, final String str2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Value ");
        sb.append(obj);
        sb.append(" for ");
        sb.append(str);
        sb.append(' ');
        if (n == null) {
            if (n2 == null) {
                sb.append("is not supported");
            }
            else {
                sb.append("must not be larger than ");
                sb.append(n2);
            }
        }
        else if (n2 == null) {
            sb.append("must not be smaller than ");
            sb.append(n);
        }
        else {
            sb.append("must be in the range [");
            sb.append(n);
            sb.append(',');
            sb.append(n2);
            sb.append(']');
        }
        if (str2 != null) {
            sb.append(": ");
            sb.append(str2);
        }
        return sb.toString();
    }
    
    private static String b(final String str, final String str2) {
        final StringBuffer sb = new StringBuffer();
        sb.append("Value ");
        if (str2 == null) {
            sb.append("null");
        }
        else {
            sb.append('\"');
            sb.append(str2);
            sb.append('\"');
        }
        sb.append(" for ");
        sb.append(str);
        sb.append(' ');
        sb.append("is not supported");
        return sb.toString();
    }
    
    public g c() {
        return this.G;
    }
    
    public m d() {
        return this.H;
    }
    
    public String e() {
        return this.I;
    }
    
    public Number f() {
        return this.J;
    }
    
    public String g() {
        return this.K;
    }
    
    @Override
    public String getMessage() {
        return this.N;
    }
    
    public String h() {
        String s;
        if ((s = this.K) == null) {
            s = String.valueOf(this.J);
        }
        return s;
    }
    
    public Number i() {
        return this.L;
    }
    
    public Number j() {
        return this.M;
    }
    
    public void k(String string) {
        if (this.N != null) {
            if (string == null) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(": ");
            sb.append(this.N);
            string = sb.toString();
        }
        this.N = string;
    }
}
