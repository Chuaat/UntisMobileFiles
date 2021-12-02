// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.format;

import java.io.Writer;
import org.joda.time.z;
import org.joda.time.v;
import org.joda.time.u;
import org.joda.time.t;
import org.joda.time.g0;
import org.joda.time.c;
import org.joda.time.n0;
import org.joda.time.l0;
import java.io.IOException;
import org.joda.time.i;
import org.joda.time.a;
import java.util.Locale;

public class b
{
    private final n a;
    private final l b;
    private final Locale c;
    private final boolean d;
    private final a e;
    private final i f;
    private final Integer g;
    private final int h;
    
    public b(final g g, final d d) {
        this(org.joda.time.format.h.b(g), org.joda.time.format.f.c(d));
    }
    
    b(final n a, final l b) {
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = false;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = 2000;
    }
    
    private b(final n a, final l b, final Locale c, final boolean d, final a e, final i f, final Integer g, final int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    private void B(final Appendable appendable, final long n, final a a) throws IOException {
        final n l = this.L();
        final a m = this.M(a);
        final i s = m.s();
        final int w = s.w(n);
        final long n2 = w;
        final long n3 = n + n2;
        i i = s;
        int n4 = w;
        long n5 = n3;
        if ((n ^ n3) < 0L) {
            i = s;
            n4 = w;
            n5 = n3;
            if ((n2 ^ n) >= 0L) {
                i = org.joda.time.i.I;
                n4 = 0;
                n5 = n;
            }
        }
        l.h(appendable, n5, m.R(), n4, i, this.c);
    }
    
    private l K() {
        final l b = this.b;
        if (b != null) {
            return b;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }
    
    private n L() {
        final n a = this.a;
        if (a != null) {
            return a;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }
    
    private a M(a e) {
        e = org.joda.time.h.e(e);
        final a e2 = this.e;
        if (e2 != null) {
            e = e2;
        }
        final i f = this.f;
        a s = e;
        if (f != null) {
            s = e.S(f);
        }
        return s;
    }
    
    public void A(final Appendable appendable, final long n) throws IOException {
        this.B(appendable, n, null);
    }
    
    public void C(final Appendable appendable, final l0 l0) throws IOException {
        this.B(appendable, org.joda.time.h.j(l0), org.joda.time.h.i(l0));
    }
    
    public void D(final Appendable appendable, final n0 n0) throws IOException {
        final n l = this.L();
        if (n0 != null) {
            l.f(appendable, n0, this.c);
            return;
        }
        throw new IllegalArgumentException("The partial must not be null");
    }
    
    public void E(final StringBuffer sb, final long n) {
        try {
            this.A(sb, n);
        }
        catch (IOException ex) {}
    }
    
    public void F(final StringBuffer sb, final l0 l0) {
        try {
            this.C(sb, l0);
        }
        catch (IOException ex) {}
    }
    
    public void G(final StringBuffer sb, final n0 n0) {
        try {
            this.D(sb, n0);
        }
        catch (IOException ex) {}
    }
    
    public void H(final StringBuilder sb, final long n) {
        try {
            this.A(sb, n);
        }
        catch (IOException ex) {}
    }
    
    public void I(final StringBuilder sb, final l0 l0) {
        try {
            this.C(sb, l0);
        }
        catch (IOException ex) {}
    }
    
    public void J(final StringBuilder sb, final n0 n0) {
        try {
            this.D(sb, n0);
        }
        catch (IOException ex) {}
    }
    
    public b N(final a a) {
        if (this.e == a) {
            return this;
        }
        return new b(this.a, this.b, this.c, this.d, a, this.f, this.g, this.h);
    }
    
    public b O(final int n) {
        return new b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, n);
    }
    
    public b P(final Locale locale) {
        if (locale != this.d() && (locale == null || !locale.equals(this.d()))) {
            return new b(this.a, this.b, locale, this.d, this.e, this.f, this.g, this.h);
        }
        return this;
    }
    
    public b Q() {
        if (this.d) {
            return this;
        }
        return new b(this.a, this.b, this.c, true, this.e, null, this.g, this.h);
    }
    
    public b R(final int i) {
        return this.S(i);
    }
    
    public b S(final Integer obj) {
        final Integer g = this.g;
        if (g != obj && (g == null || !g.equals(obj))) {
            return new b(this.a, this.b, this.c, this.d, this.e, this.f, obj, this.h);
        }
        return this;
    }
    
    public b T(final i i) {
        if (this.f == i) {
            return this;
        }
        return new b(this.a, this.b, this.c, false, this.e, i, this.g, this.h);
    }
    
    public b U() {
        return this.T(i.I);
    }
    
    @Deprecated
    public a a() {
        return this.e;
    }
    
    public a b() {
        return this.e;
    }
    
    public int c() {
        return this.h;
    }
    
    public Locale d() {
        return this.c;
    }
    
    public d e() {
        return m.a(this.b);
    }
    
    l f() {
        return this.b;
    }
    
    public Integer g() {
        return this.g;
    }
    
    public g h() {
        return o.a(this.a);
    }
    
    n i() {
        return this.a;
    }
    
    public i j() {
        return this.f;
    }
    
    public boolean k() {
        return this.d;
    }
    
    public boolean l() {
        return this.b != null;
    }
    
    public boolean m() {
        return this.a != null;
    }
    
    public c n(final String s) {
        final l k = this.K();
        final a m = this.M(null);
        final e e = new e(0L, m, this.c, this.g, this.h);
        final int g = k.g(e, s, 0);
        int n;
        if (g >= 0) {
            if ((n = g) >= s.length()) {
                final long n2 = e.n(true, s);
                a s2 = null;
                Label_0125: {
                    i i;
                    if (this.d && e.s() != null) {
                        i = org.joda.time.i.j(e.s());
                    }
                    else {
                        s2 = m;
                        if (e.u() == null) {
                            break Label_0125;
                        }
                        i = e.u();
                    }
                    s2 = m.S(i);
                }
                final c c = new c(n2, s2);
                final i f = this.f;
                c i2 = c;
                if (f != null) {
                    i2 = c.i2(f);
                }
                return i2;
            }
        }
        else {
            n = ~g;
        }
        throw new IllegalArgumentException(org.joda.time.format.i.j(s, n));
    }
    
    public int o(final g0 g0, final String s, int g2) {
        final l k = this.K();
        if (g0 != null) {
            final long n = g0.n();
            final a t = g0.t();
            final int g3 = org.joda.time.h.e(t).T().g(n);
            final long n2 = t.s().w(n);
            final a m = this.M(t);
            final e e = new e(n + n2, m, this.c, this.g, g3);
            g2 = k.g(e, s, g2);
            g0.N3(e.n(false, s));
            a s2 = null;
            Label_0167: {
                i i;
                if (this.d && e.s() != null) {
                    i = org.joda.time.i.j(e.s());
                }
                else {
                    s2 = m;
                    if (e.u() == null) {
                        break Label_0167;
                    }
                    i = e.u();
                }
                s2 = m.S(i);
            }
            g0.J(s2);
            final i f = this.f;
            if (f != null) {
                g0.G1(f);
            }
            return g2;
        }
        throw new IllegalArgumentException("Instant must not be null");
    }
    
    public t p(final String s) {
        return this.q(s).T0();
    }
    
    public u q(final String s) {
        final l k = this.K();
        final a r = this.M(null).R();
        final e e = new e(0L, r, this.c, this.g, this.h);
        final int g = k.g(e, s, 0);
        int n;
        if (g >= 0) {
            if ((n = g) >= s.length()) {
                final long n2 = e.n(true, s);
                i i;
                if (e.s() != null) {
                    i = org.joda.time.i.j(e.s());
                }
                else {
                    final a s2 = r;
                    if (e.u() == null) {
                        return new u(n2, s2);
                    }
                    i = e.u();
                }
                final a s2 = r.S(i);
                return new u(n2, s2);
            }
        }
        else {
            n = ~g;
        }
        throw new IllegalArgumentException(org.joda.time.format.i.j(s, n));
    }
    
    public v r(final String s) {
        return this.q(s).U0();
    }
    
    public long s(final String s) {
        return new e(0L, this.M(this.e), this.c, this.g, this.h).o(this.K(), s);
    }
    
    public z t(final String s) {
        final l k = this.K();
        final a m = this.M(null);
        final e e = new e(0L, m, this.c, this.g, this.h);
        final int g = k.g(e, s, 0);
        int n;
        if (g >= 0) {
            if ((n = g) >= s.length()) {
                final long n2 = e.n(true, s);
                a s2 = null;
                Label_0125: {
                    i i;
                    if (this.d && e.s() != null) {
                        i = org.joda.time.i.j(e.s());
                    }
                    else {
                        s2 = m;
                        if (e.u() == null) {
                            break Label_0125;
                        }
                        i = e.u();
                    }
                    s2 = m.S(i);
                }
                final z z = new z(n2, s2);
                final i f = this.f;
                if (f != null) {
                    z.G1(f);
                }
                return z;
            }
        }
        else {
            n = ~g;
        }
        throw new IllegalArgumentException(org.joda.time.format.i.j(s, n));
    }
    
    public String u(final long n) {
        final StringBuilder sb = new StringBuilder(this.L().d());
        try {
            this.A(sb, n);
            return sb.toString();
        }
        catch (IOException ex) {
            return sb.toString();
        }
    }
    
    public String v(final l0 l0) {
        final StringBuilder sb = new StringBuilder(this.L().d());
        try {
            this.C(sb, l0);
            return sb.toString();
        }
        catch (IOException ex) {
            return sb.toString();
        }
    }
    
    public String w(final n0 n0) {
        final StringBuilder sb = new StringBuilder(this.L().d());
        try {
            this.D(sb, n0);
            return sb.toString();
        }
        catch (IOException ex) {
            return sb.toString();
        }
    }
    
    public void x(final Writer writer, final long n) throws IOException {
        this.A(writer, n);
    }
    
    public void y(final Writer writer, final l0 l0) throws IOException {
        this.C(writer, l0);
    }
    
    public void z(final Writer writer, final n0 n0) throws IOException {
        this.D(writer, n0);
    }
}
