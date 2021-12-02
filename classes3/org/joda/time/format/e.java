// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.format;

import org.joda.time.p;
import org.joda.time.o;
import org.joda.time.m;
import org.joda.time.g;
import org.joda.time.l;
import java.util.Arrays;
import org.joda.time.h;
import org.joda.time.i;
import java.util.Locale;
import org.joda.time.a;

public class e
{
    private final org.joda.time.a a;
    private final long b;
    private final Locale c;
    private final int d;
    private final i e;
    private final Integer f;
    private i g;
    private Integer h;
    private Integer i;
    private a[] j;
    private int k;
    private boolean l;
    private Object m;
    
    @Deprecated
    public e(final long n, final org.joda.time.a a, final Locale locale) {
        this(n, a, locale, null, 2000);
    }
    
    @Deprecated
    public e(final long n, final org.joda.time.a a, final Locale locale, final Integer n2) {
        this(n, a, locale, n2, 2000);
    }
    
    public e(final long b, org.joda.time.a e, final Locale locale, final Integer n, final int d) {
        e = org.joda.time.h.e(e);
        this.b = b;
        final i s = e.s();
        this.e = s;
        this.a = e.R();
        Locale default1 = locale;
        if (locale == null) {
            default1 = Locale.getDefault();
        }
        this.c = default1;
        this.d = d;
        this.f = n;
        this.g = s;
        this.i = n;
        this.j = new a[8];
    }
    
    private static void H(final a[] a, final int toIndex) {
        int i = 0;
        if (toIndex > 10) {
            Arrays.sort(a, 0, toIndex);
        }
        else {
            while (i < toIndex) {
                for (int j = i; j > 0; --j) {
                    final int n = j - 1;
                    if (a[n].b(a[j]) <= 0) {
                        break;
                    }
                    final a a2 = a[j];
                    a[j] = a[n];
                    a[n] = a2;
                }
                ++i;
            }
        }
    }
    
    static int j(final l l, final l i) {
        if (l != null && l.z()) {
            if (i != null && i.z()) {
                return -l.compareTo(i);
            }
            return 1;
        }
        else {
            if (i != null && i.z()) {
                return -1;
            }
            return 0;
        }
    }
    
    private a v() {
        final a[] j = this.j;
        final int k = this.k;
        a[] i = null;
        Label_0067: {
            if (k != j.length) {
                i = j;
                if (!this.l) {
                    break Label_0067;
                }
            }
            int length;
            if (k == j.length) {
                length = k * 2;
            }
            else {
                length = j.length;
            }
            i = new a[length];
            System.arraycopy(j, 0, i, 0, k);
            this.j = i;
            this.l = false;
        }
        this.m = null;
        a a;
        if ((a = i[k]) == null) {
            a = new a();
            i[k] = a;
        }
        this.k = k + 1;
        return a;
    }
    
    public void A(final g g, final int n) {
        this.v().d(g.G(this.a), n);
    }
    
    public void B(final g g, final String s, final Locale locale) {
        this.v().f(g.G(this.a), s, locale);
    }
    
    public Object C() {
        if (this.m == null) {
            this.m = new b();
        }
        return this.m;
    }
    
    @Deprecated
    public void D(final int i) {
        this.m = null;
        this.h = i;
    }
    
    public void E(final Integer h) {
        this.m = null;
        this.h = h;
    }
    
    @Deprecated
    public void F(final Integer i) {
        this.i = i;
    }
    
    public void G(final i g) {
        this.m = null;
        this.g = g;
    }
    
    public long k() {
        return this.m(false, null);
    }
    
    public long l(final boolean b) {
        return this.m(b, null);
    }
    
    public long m(final boolean b, final CharSequence charSequence) {
        final a[] j = this.j;
        final int k = this.k;
        a[] i = j;
        if (this.l) {
            i = j.clone();
            this.j = i;
            this.l = false;
        }
        H(i, k);
        if (k > 0) {
            final l d = org.joda.time.m.k().d(this.a);
            final l d2 = org.joda.time.m.b().d(this.a);
            final l t = i[0].G.t();
            if (j(t, d) >= 0 && j(t, d2) <= 0) {
                this.A(org.joda.time.g.X(), this.d);
                return this.m(b, charSequence);
            }
        }
        long n = this.b;
        int n2 = 0;
        StringBuilder sb;
        int n3;
        long g;
        long n4 = 0L;
        Label_0176_Outer:Block_12_Outer:Label_0165_Outer:
        while (true) {
            while (true) {
                if (n2 < k) {
                    try {
                        n = i[n2].g(n, b);
                        ++n2;
                        continue Label_0165_Outer;
                    }
                    catch (o o) {
                        if (charSequence != null) {
                            sb = new StringBuilder();
                            sb.append("Cannot parse \"");
                            sb.append((Object)charSequence);
                            sb.append('\"');
                            o.k(sb.toString());
                        }
                        throw o;
                        // iftrue(Label_0290:, n3 >= k)
                        // iftrue(Label_0236:, i[n3].G.L())
                        while (true) {
                        Block_14_Outer:
                            while (true) {
                                while (true) {
                                Block_13:
                                    while (true) {
                                        ++n3;
                                        n = g;
                                        n4 = n;
                                        break Block_13;
                                        g = i[n3].g(n, n3 == k - 1);
                                        continue Label_0176_Outer;
                                    }
                                    g = n;
                                    continue Block_12_Outer;
                                }
                                n3 = 0;
                                continue Block_14_Outer;
                            }
                            n4 = n;
                            continue Label_0165_Outer;
                        }
                    }
                    // iftrue(Label_0290:, !b)
                    break;
                }
                continue;
            }
        }
        final Integer h;
        Label_0290: {
            h = this.h;
        }
        long n5;
        if (h != null) {
            n5 = n4 - h;
        }
        else {
            final i g2 = this.g;
            n5 = n4;
            if (g2 != null) {
                final int y = g2.y(n4);
                if (y != this.g.w(n5 = n4 - y)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Illegal instant due to time zone offset transition (");
                    sb2.append(this.g);
                    sb2.append(')');
                    String str = sb2.toString();
                    if (charSequence != null) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Cannot parse \"");
                        sb3.append((Object)charSequence);
                        sb3.append("\": ");
                        sb3.append(str);
                        str = sb3.toString();
                    }
                    throw new p(str);
                }
            }
        }
        return n5;
    }
    
    public long n(final boolean b, final String s) {
        return this.m(b, s);
    }
    
    long o(final org.joda.time.format.l l, final CharSequence charSequence) {
        final int g = l.g(this, charSequence, 0);
        int n;
        if (g >= 0) {
            if ((n = g) >= charSequence.length()) {
                return this.m(true, charSequence);
            }
        }
        else {
            n = ~g;
        }
        throw new IllegalArgumentException(org.joda.time.format.i.j(charSequence.toString(), n));
    }
    
    public org.joda.time.a p() {
        return this.a;
    }
    
    public Locale q() {
        return this.c;
    }
    
    @Deprecated
    public int r() {
        final Integer h = this.h;
        int intValue;
        if (h != null) {
            intValue = h;
        }
        else {
            intValue = 0;
        }
        return intValue;
    }
    
    public Integer s() {
        return this.h;
    }
    
    public Integer t() {
        return this.i;
    }
    
    public i u() {
        return this.g;
    }
    
    public long w(final d d, final CharSequence charSequence) {
        this.x();
        return this.o(org.joda.time.format.f.c(d), charSequence);
    }
    
    public void x() {
        this.g = this.e;
        this.h = null;
        this.i = this.f;
        this.k = 0;
        this.l = false;
        this.m = null;
    }
    
    public boolean y(final Object m) {
        if (m instanceof b && ((b)m).a(this)) {
            this.m = m;
            return true;
        }
        return false;
    }
    
    public void z(final org.joda.time.f f, final int n) {
        this.v().d(f, n);
    }
    
    static class a implements Comparable<a>
    {
        org.joda.time.f G;
        int H;
        String I;
        Locale J;
        
        public int b(final a a) {
            final org.joda.time.f g = a.G;
            final int j = org.joda.time.format.e.j(this.G.I(), g.I());
            if (j != 0) {
                return j;
            }
            return org.joda.time.format.e.j(this.G.t(), g.t());
        }
        
        void d(final org.joda.time.f g, final int h) {
            this.G = g;
            this.H = h;
            this.I = null;
            this.J = null;
        }
        
        void f(final org.joda.time.f g, final String i, final Locale j) {
            this.G = g;
            this.H = 0;
            this.I = i;
            this.J = j;
        }
        
        long g(long n, final boolean b) {
            final String i = this.I;
            if (i == null) {
                n = this.G.Y(n, this.H);
            }
            else {
                n = this.G.V(n, i, this.J);
            }
            long p2 = n;
            if (b) {
                p2 = this.G.P(n);
            }
            return p2;
        }
    }
    
    class b
    {
        final i a;
        final Integer b;
        final a[] c;
        final int d;
        
        b() {
            this.a = org.joda.time.format.e.this.g;
            this.b = org.joda.time.format.e.this.h;
            this.c = org.joda.time.format.e.this.j;
            this.d = org.joda.time.format.e.this.k;
        }
        
        boolean a(final e e) {
            if (e != e.this) {
                return false;
            }
            e.g = this.a;
            e.h = this.b;
            e.j = this.c;
            if (this.d < e.k) {
                e.l = true;
            }
            e.k = this.d;
            return true;
        }
    }
}
