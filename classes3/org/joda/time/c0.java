// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import org.joda.time.field.j;
import java.util.Locale;
import org.joda.time.format.b;
import java.io.Serializable;
import org.joda.time.base.e;

public final class c0 extends e implements n0, Serializable
{
    private static final long K = 12324121189002L;
    private final org.joda.time.a G;
    private final g[] H;
    private final int[] I;
    private transient b[] J;
    
    public c0() {
        this((org.joda.time.a)null);
    }
    
    public c0(final org.joda.time.a a) {
        this.G = h.e(a).R();
        this.H = new g[0];
        this.I = new int[0];
    }
    
    c0(final org.joda.time.a g, final g[] h, final int[] i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    c0(final c0 c0, final int[] i) {
        this.G = c0.G;
        this.H = c0.H;
        this.I = i;
    }
    
    public c0(final g g, final int n) {
        this(g, n, null);
    }
    
    public c0(final g g, final int n, org.joda.time.a r) {
        r = h.e(r).R();
        this.G = r;
        if (g != null) {
            this.H = new g[] { g };
            r.L(this, this.I = new int[] { n });
            return;
        }
        throw new IllegalArgumentException("The field type must not be null");
    }
    
    public c0(final n0 n0) {
        if (n0 != null) {
            this.G = h.e(n0.t()).R();
            this.H = new g[n0.size()];
            this.I = new int[n0.size()];
            for (int i = 0; i < n0.size(); ++i) {
                this.H[i] = n0.N(i);
                this.I[i] = n0.e0(i);
            }
            return;
        }
        throw new IllegalArgumentException("The partial must not be null");
    }
    
    public c0(final g[] array, final int[] array2) {
        this(array, array2, null);
    }
    
    public c0(final g[] h, final int[] i, final org.joda.time.a a) {
        final org.joda.time.a r = h.e(a).R();
        this.G = r;
        if (h == null) {
            throw new IllegalArgumentException("Types array must not be null");
        }
        if (i == null) {
            throw new IllegalArgumentException("Values array must not be null");
        }
        if (i.length != h.length) {
            throw new IllegalArgumentException("Values array must be the same length as the types array");
        }
        if (h.length == 0) {
            this.H = h;
            this.I = i;
            return;
        }
        final int n = 0;
        for (int j = 0; j < h.length; ++j) {
            if (h[j] == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Types array must not contain null: index ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        l l = null;
        l d;
        for (int k = n; k < h.length; ++k, l = d) {
            final g g = h[k];
            d = g.F().d(this.G);
            if (k > 0) {
                if (!d.z()) {
                    if (l.z()) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Types array must be in order largest-smallest: ");
                        sb2.append(h[k - 1].H());
                        sb2.append(" < ");
                        sb2.append(g.H());
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Types array must not contain duplicate unsupported: ");
                    sb3.append(h[k - 1].H());
                    sb3.append(" and ");
                    sb3.append(g.H());
                    throw new IllegalArgumentException(sb3.toString());
                }
                else {
                    final int compareTo = l.compareTo(d);
                    if (compareTo < 0) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Types array must be in order largest-smallest: ");
                        sb4.append(h[k - 1].H());
                        sb4.append(" < ");
                        sb4.append(g.H());
                        throw new IllegalArgumentException(sb4.toString());
                    }
                    if (compareTo == 0) {
                        if (l.equals(d)) {
                            final int n2 = k - 1;
                            final m m = h[n2].I();
                            final m i2 = g.I();
                            if (m == null) {
                                if (i2 == null) {
                                    final StringBuilder sb5 = new StringBuilder();
                                    sb5.append("Types array must not contain duplicate: ");
                                    sb5.append(h[n2].H());
                                    sb5.append(" and ");
                                    sb5.append(g.H());
                                    throw new IllegalArgumentException(sb5.toString());
                                }
                            }
                            else {
                                if (i2 == null) {
                                    final StringBuilder sb6 = new StringBuilder();
                                    sb6.append("Types array must be in order largest-smallest: ");
                                    sb6.append(h[n2].H());
                                    sb6.append(" < ");
                                    sb6.append(g.H());
                                    throw new IllegalArgumentException(sb6.toString());
                                }
                                final l d2 = m.d(this.G);
                                final l d3 = i2.d(this.G);
                                if (d2.compareTo(d3) < 0) {
                                    final StringBuilder sb7 = new StringBuilder();
                                    sb7.append("Types array must be in order largest-smallest: ");
                                    sb7.append(h[n2].H());
                                    sb7.append(" < ");
                                    sb7.append(g.H());
                                    throw new IllegalArgumentException(sb7.toString());
                                }
                                if (d2.compareTo(d3) == 0) {
                                    final StringBuilder sb8 = new StringBuilder();
                                    sb8.append("Types array must not contain duplicate: ");
                                    sb8.append(h[n2].H());
                                    sb8.append(" and ");
                                    sb8.append(g.H());
                                    throw new IllegalArgumentException(sb8.toString());
                                }
                            }
                        }
                        else if (l.z()) {
                            if (l.m() != m.X) {
                                final StringBuilder sb9 = new StringBuilder();
                                sb9.append("Types array must be in order largest-smallest, for year-based fields, years is defined as being largest: ");
                                sb9.append(h[k - 1].H());
                                sb9.append(" < ");
                                sb9.append(g.H());
                                throw new IllegalArgumentException(sb9.toString());
                            }
                        }
                    }
                }
            }
        }
        this.H = h.clone();
        r.L(this, i);
        this.I = i.clone();
    }
    
    public String A2(final String s, final Locale locale) {
        if (s == null) {
            return this.toString();
        }
        return org.joda.time.format.a.f(s).P(locale).w(this);
    }
    
    public c0 B(final o0 o0) {
        return this.Q(o0, 1);
    }
    
    public a E(final g g) {
        return new a(this, this.k(g));
    }
    
    public String G() {
        final int size = this.size();
        final StringBuilder sb = new StringBuilder(size * 20);
        sb.append('[');
        for (int i = 0; i < size; ++i) {
            if (i > 0) {
                sb.append(',');
                sb.append(' ');
            }
            sb.append(this.H[i].H());
            sb.append('=');
            sb.append(this.I[i]);
        }
        sb.append(']');
        return sb.toString();
    }
    
    public c0 I(final g g, int n) {
        if (g == null) {
            throw new IllegalArgumentException("The field type must not be null");
        }
        final int i = this.i(g);
        if (i == -1) {
            final int n2 = this.H.length + 1;
            final g[] array = new g[n2];
            final int[] array2 = new int[n2];
            final l d = g.F().d(this.G);
            int n4;
            if (d.z()) {
                int n3 = 0;
                while (true) {
                    final g[] h = this.H;
                    n4 = n3;
                    if (n3 >= h.length) {
                        break;
                    }
                    final g g2 = h[n3];
                    final l d2 = g2.F().d(this.G);
                    if (d2.z()) {
                        final int compareTo = d.compareTo(d2);
                        if (compareTo > 0) {
                            n4 = n3;
                            break;
                        }
                        if (compareTo == 0) {
                            if (g.I() == null) {
                                n4 = n3;
                                break;
                            }
                            if (g2.I() != null) {
                                if (g.I().d(this.G).compareTo(g2.I().d(this.G)) > 0) {
                                    n4 = n3;
                                    break;
                                }
                            }
                        }
                    }
                    ++n3;
                }
            }
            else {
                n4 = 0;
            }
            System.arraycopy(this.H, 0, array, 0, n4);
            System.arraycopy(this.I, 0, array2, 0, n4);
            array[n4] = g;
            array2[n4] = n;
            final g[] h2 = this.H;
            n = n4 + 1;
            final int n5 = n2 - n4 - 1;
            System.arraycopy(h2, n4, array, n, n5);
            System.arraycopy(this.I, n4, array2, n, n5);
            final c0 c0 = new c0(array, array2, this.G);
            this.G.L(c0, array2);
            return c0;
        }
        if (n == this.e0(i)) {
            return this;
        }
        return new c0(this, this.Q3(i).W(this, i, this.h(), n));
    }
    
    public c0 K(org.joda.time.a r) {
        r = h.e(r).R();
        if (r == this.t()) {
            return this;
        }
        final c0 c0 = new c0(r, this.H, this.I);
        r.L(c0, this.I);
        return c0;
    }
    
    public c0 M(final g g, final int n) {
        final int k = this.k(g);
        if (n == this.e0(k)) {
            return this;
        }
        return new c0(this, this.Q3(k).W(this, k, this.h(), n));
    }
    
    @Override
    public g N(final int n) {
        return this.H[n];
    }
    
    public c0 O(final m m, final int n) {
        final int l = this.l(m);
        if (n == 0) {
            return this;
        }
        return new c0(this, this.Q3(l).f(this, l, this.h(), n));
    }
    
    public c0 P(final m m, final int n) {
        final int l = this.l(m);
        if (n == 0) {
            return this;
        }
        return new c0(this, this.Q3(l).c(this, l, this.h(), n));
    }
    
    public c0 Q(final o0 o0, final int n) {
        if (o0 != null && n != 0) {
            int[] h = this.h();
            int[] c;
            for (int i = 0; i < o0.size(); ++i, h = c) {
                final int j = this.j(o0.N(i));
                c = h;
                if (j >= 0) {
                    c = this.Q3(j).c(this, j, h, org.joda.time.field.j.h(o0.e0(i), n));
                }
            }
            return new c0(this, h);
        }
        return this;
    }
    
    public c0 T(final g g) {
        final int i = this.i(g);
        if (i != -1) {
            final int n = this.size() - 1;
            final g[] array = new g[n];
            final int n2 = this.size() - 1;
            final int[] array2 = new int[n2];
            System.arraycopy(this.H, 0, array, 0, i);
            final g[] h = this.H;
            final int n3 = i + 1;
            System.arraycopy(h, n3, array, i, n - i);
            System.arraycopy(this.I, 0, array2, 0, i);
            System.arraycopy(this.I, n3, array2, i, n2 - i);
            final c0 c0 = new c0(this.G, array, array2);
            this.G.L(c0, array2);
            return c0;
        }
        return this;
    }
    
    @Override
    protected f d(final int n, final org.joda.time.a a) {
        return this.H[n].G(a);
    }
    
    @Override
    public int e0(final int n) {
        return this.I[n];
    }
    
    @Override
    public g[] f() {
        return this.H.clone();
    }
    
    public String g4(final String s) {
        if (s == null) {
            return this.toString();
        }
        return org.joda.time.format.a.f(s).w(this);
    }
    
    @Override
    public int[] h() {
        return this.I.clone();
    }
    
    @Override
    public int size() {
        return this.H.length;
    }
    
    @Override
    public org.joda.time.a t() {
        return this.G;
    }
    
    @Override
    public String toString() {
        b[] array;
        if ((array = this.J) == null) {
            this.u();
            if ((array = this.J) == null) {
                return this.G();
            }
        }
        final b b = array[1];
        if (b == null) {
            return this.G();
        }
        return b.w(this);
    }
    
    public b u() {
        Label_0069: {
            b[] j;
            if ((j = this.J) != null) {
                break Label_0069;
            }
            if (this.size() == 0) {
                return null;
            }
            j = new b[2];
            while (true) {
                try {
                    final ArrayList<g> list = new ArrayList<g>(Arrays.asList(this.H));
                    j[0] = org.joda.time.format.j.E(list, true, false);
                    if (list.size() == 0) {
                        j[1] = j[0];
                    }
                    this.J = j;
                    return j[0];
                }
                catch (IllegalArgumentException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public boolean v(final l0 l0) {
        final long j = h.j(l0);
        final org.joda.time.a i = h.i(l0);
        int n = 0;
        while (true) {
            final g[] h = this.H;
            if (n >= h.length) {
                return true;
            }
            if (h[n].G(i).g(j) != this.I[n]) {
                return false;
            }
            ++n;
        }
    }
    
    public boolean y(final n0 n0) {
        if (n0 == null) {
            throw new IllegalArgumentException("The partial must not be null");
        }
        int n2 = 0;
        while (true) {
            final g[] h = this.H;
            if (n2 >= h.length) {
                return true;
            }
            if (n0.j0(h[n2]) != this.I[n2]) {
                return false;
            }
            ++n2;
        }
    }
    
    public c0 z(final o0 o0) {
        return this.Q(o0, -1);
    }
    
    public static class a extends org.joda.time.field.a implements Serializable
    {
        private static final long I = 53278362873888L;
        private final c0 G;
        private final int H;
        
        a(final c0 g, final int h) {
            this.G = g;
            this.H = h;
        }
        
        public c0 B() {
            return this.x(this.n());
        }
        
        public c0 C() {
            return this.x(this.p());
        }
        
        @Override
        public int c() {
            return this.G.e0(this.H);
        }
        
        @Override
        public f j() {
            return this.G.Q3(this.H);
        }
        
        @Override
        protected n0 t() {
            return this.G;
        }
        
        public c0 u(final int n) {
            return new c0(this.G, this.j().c(this.G, this.H, this.G.h(), n));
        }
        
        public c0 v(final int n) {
            return new c0(this.G, this.j().e(this.G, this.H, this.G.h(), n));
        }
        
        public c0 w() {
            return this.G;
        }
        
        public c0 x(final int n) {
            return new c0(this.G, this.j().W(this.G, this.H, this.G.h(), n));
        }
        
        public c0 y(final String s) {
            return this.z(s, null);
        }
        
        public c0 z(final String s, final Locale locale) {
            return new c0(this.G, this.j().X(this.G, this.H, this.G.h(), s, locale));
        }
    }
}
