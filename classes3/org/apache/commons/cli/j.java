// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class j implements Cloneable, Serializable
{
    private static final long Q = 1L;
    public static final int R = -1;
    public static final int S = -2;
    private String G;
    private String H;
    private String I;
    private String J;
    private boolean K;
    private boolean L;
    private int M;
    private Object N;
    private List O;
    private char P;
    
    public j(final String s, final String s2) throws IllegalArgumentException {
        this(s, null, false, s2);
    }
    
    public j(final String g, final String h, final boolean b, final String j) throws IllegalArgumentException {
        this.I = "arg";
        this.M = -1;
        this.O = new ArrayList();
        m.c(g);
        this.G = g;
        this.H = h;
        if (b) {
            this.M = 1;
        }
        this.J = j;
    }
    
    public j(final String s, final boolean b, final String s2) throws IllegalArgumentException {
        this(s, null, b, s2);
    }
    
    private boolean C() {
        return this.O.isEmpty();
    }
    
    private void H(String substring) {
        String s = substring;
        if (this.E()) {
            final char u = this.u();
            while (true) {
                final int index = substring.indexOf(u);
                s = substring;
                if (index == -1) {
                    break;
                }
                if (this.O.size() == this.M - 1) {
                    s = substring;
                    break;
                }
                this.a(substring.substring(0, index));
                substring = substring.substring(index + 1);
            }
        }
        this.a(s);
    }
    
    private void a(final String s) {
        if (this.M > 0 && this.O.size() > this.M - 1) {
            throw new RuntimeException("Cannot add value, list full.");
        }
        this.O.add(s);
    }
    
    public boolean B() {
        return this.H != null;
    }
    
    public boolean D() {
        return this.L;
    }
    
    public boolean E() {
        return this.P > '\0';
    }
    
    public boolean F() {
        return this.K;
    }
    
    public void I(final String i) {
        this.I = i;
    }
    
    public void J(final int m) {
        this.M = m;
    }
    
    public void L(final String j) {
        this.J = j;
    }
    
    public void N(final String h) {
        this.H = h;
    }
    
    public void O(final boolean l) {
        this.L = l;
    }
    
    public void P(final boolean k) {
        this.K = k;
    }
    
    public void Q(final Object n) {
        this.N = n;
    }
    
    public void R(final char c) {
        this.P = c;
    }
    
    public boolean b(final String s) {
        throw new UnsupportedOperationException("The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
    }
    
    void c(final String s) {
        if (this.M != -1) {
            this.H(s);
            return;
        }
        throw new RuntimeException("NO_ARGS_ALLOWED");
    }
    
    public Object clone() {
        try {
            final j j = (j)super.clone();
            j.O = new ArrayList(this.O);
            return j;
        }
        catch (CloneNotSupportedException ex) {
            final StringBuffer sb = new StringBuffer();
            sb.append("A CloneNotSupportedException was thrown: ");
            sb.append(ex.getMessage());
            throw new RuntimeException(sb.toString());
        }
    }
    
    void d() {
        this.O.clear();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final j j = (j)o;
            final String g = this.G;
            Label_0062: {
                if (g != null) {
                    if (g.equals(j.G)) {
                        break Label_0062;
                    }
                }
                else if (j.G == null) {
                    break Label_0062;
                }
                return false;
            }
            final String h = this.H;
            final String h2 = j.H;
            if (h != null) {
                if (h.equals(h2)) {
                    return true;
                }
            }
            else if (h2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public String f() {
        return this.I;
    }
    
    public int g() {
        return this.M;
    }
    
    @Override
    public int hashCode() {
        final String g = this.G;
        int hashCode = 0;
        int hashCode2;
        if (g != null) {
            hashCode2 = g.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String h = this.H;
        if (h != null) {
            hashCode = h.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    public String i() {
        return this.J;
    }
    
    public int j() {
        return this.l().charAt(0);
    }
    
    String l() {
        String s;
        if ((s = this.G) == null) {
            s = this.H;
        }
        return s;
    }
    
    public String m() {
        return this.H;
    }
    
    public String n() {
        return this.G;
    }
    
    public Object q() {
        return this.N;
    }
    
    public String r() {
        String s;
        if (this.C()) {
            s = null;
        }
        else {
            s = this.O.get(0);
        }
        return s;
    }
    
    public String s(final int n) throws IndexOutOfBoundsException {
        String s;
        if (this.C()) {
            s = null;
        }
        else {
            s = this.O.get(n);
        }
        return s;
    }
    
    public String t(String s) {
        final String r = this.r();
        if (r != null) {
            s = r;
        }
        return s;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("[ option: ");
        sb.append(this.G);
        if (this.H != null) {
            sb.append(" ");
            sb.append(this.H);
        }
        sb.append(" ");
        Label_0086: {
            String str;
            if (this.z()) {
                str = "[ARG...]";
            }
            else {
                if (!this.x()) {
                    break Label_0086;
                }
                str = " [ARG]";
            }
            sb.append(str);
        }
        sb.append(" :: ");
        sb.append(this.J);
        if (this.N != null) {
            sb.append(" :: ");
            sb.append(this.N);
        }
        sb.append(" ]");
        return sb.toString();
    }
    
    public char u() {
        return this.P;
    }
    
    public String[] v() {
        String[] array;
        if (this.C()) {
            array = null;
        }
        else {
            final List o = this.O;
            array = o.toArray(new String[o.size()]);
        }
        return array;
    }
    
    public List w() {
        return this.O;
    }
    
    public boolean x() {
        final int m = this.M;
        return m > 0 || m == -2;
    }
    
    public boolean y() {
        final String i = this.I;
        return i != null && i.length() > 0;
    }
    
    public boolean z() {
        final int m = this.M;
        boolean b = true;
        if (m <= 1) {
            b = (m == -2 && b);
        }
        return b;
    }
}
