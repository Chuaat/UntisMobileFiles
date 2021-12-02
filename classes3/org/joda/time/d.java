// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import org.joda.time.convert.h;
import java.io.Serializable;
import java.util.Comparator;

public class d implements Comparator<Object>, Serializable
{
    private static final long I = -6097339773320178364L;
    private static final d J;
    private static final d K;
    private static final d L;
    private final g G;
    private final g H;
    
    static {
        J = new d(null, null);
        K = new d(g.D(), null);
        L = new d(null, g.D());
    }
    
    protected d(final g g, final g h) {
        this.G = g;
        this.H = h;
    }
    
    public static d a() {
        return d.K;
    }
    
    public static d b() {
        return d.J;
    }
    
    public static d c(final g g) {
        return d(g, null);
    }
    
    public static d d(final g g, final g g2) {
        if (g == null && g2 == null) {
            return d.J;
        }
        if (g == g.D() && g2 == null) {
            return d.K;
        }
        if (g == null && g2 == g.D()) {
            return d.L;
        }
        return new d(g, g2);
    }
    
    public static d f() {
        return d.L;
    }
    
    private Object h() {
        return d(this.G, this.H);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        final h n = org.joda.time.convert.d.m().n(o);
        final a a = n.a(o, null);
        final long d = n.d(o, a);
        if (o == o2) {
            return 0;
        }
        final h n2 = org.joda.time.convert.d.m().n(o2);
        final a a2 = n2.a(o2, null);
        final long d2 = n2.d(o2, a2);
        final g g = this.G;
        long p2 = d;
        long p3 = d2;
        if (g != null) {
            p2 = g.G(a).P(d);
            p3 = this.G.G(a2).P(d2);
        }
        final g h = this.H;
        long n3 = p2;
        long n4 = p3;
        if (h != null) {
            n3 = h.G(a).N(p2);
            n4 = this.H.G(a2).N(p3);
        }
        final long n5 = lcmp(n3, n4);
        if (n5 < 0) {
            return -1;
        }
        if (n5 > 0) {
            return 1;
        }
        return 0;
    }
    
    public g e() {
        return this.G;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof d;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final d d = (d)o;
            if (this.G != d.e()) {
                final g g = this.G;
                b3 = b2;
                if (g == null) {
                    return b3;
                }
                b3 = b2;
                if (!g.equals(d.e())) {
                    return b3;
                }
            }
            if (this.H != d.g()) {
                final g h = this.H;
                b3 = b2;
                if (h == null) {
                    return b3;
                }
                b3 = b2;
                if (!h.equals(d.g())) {
                    return b3;
                }
            }
            b3 = true;
        }
        return b3;
    }
    
    public g g() {
        return this.H;
    }
    
    @Override
    public int hashCode() {
        final g g = this.G;
        int hashCode = 0;
        int hashCode2;
        if (g == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = g.hashCode();
        }
        final g h = this.H;
        if (h != null) {
            hashCode = h.hashCode();
        }
        return hashCode2 + hashCode * 123;
    }
    
    @Override
    public String toString() {
        final g g = this.G;
        final g h = this.H;
        final String s = "";
        StringBuilder sb2 = null;
        String h2 = null;
        Label_0063: {
            g g3;
            if (g == h) {
                final StringBuilder sb = new StringBuilder();
                sb.append("DateTimeComparator[");
                final g g2 = this.G;
                sb2 = sb;
                if ((g3 = g2) == null) {
                    sb2 = sb;
                    h2 = s;
                    break Label_0063;
                }
            }
            else {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("DateTimeComparator[");
                final g g4 = this.G;
                String h3;
                if (g4 == null) {
                    h3 = "";
                }
                else {
                    h3 = g4.H();
                }
                sb3.append(h3);
                sb3.append("-");
                final g h4 = this.H;
                sb2 = sb3;
                g3 = h4;
                if (h4 == null) {
                    sb2 = sb3;
                    h2 = s;
                    break Label_0063;
                }
            }
            h2 = g3.H();
        }
        sb2.append(h2);
        sb2.append("]");
        return sb2.toString();
    }
}
