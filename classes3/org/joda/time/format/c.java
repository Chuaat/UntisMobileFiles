// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.format;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Collections;
import java.util.Collection;
import org.joda.time.z;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import org.joda.time.n0;
import org.joda.time.i;
import java.util.Map;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

public class c
{
    private ArrayList<Object> a;
    private Object b;
    
    public c() {
        this.a = new ArrayList<Object>();
    }
    
    static void c0(final Appendable appendable, int n) throws IOException {
        while (--n >= 0) {
            appendable.append('\ufffd');
        }
    }
    
    private c f(final Object o) {
        this.b = null;
        this.a.add(o);
        this.a.add(o);
        return this;
    }
    
    private c g(final org.joda.time.format.n e, final org.joda.time.format.l e2) {
        this.b = null;
        this.a.add(e);
        this.a.add(e2);
        return this;
    }
    
    private void l0(final org.joda.time.format.d d) {
        if (d != null) {
            return;
        }
        throw new IllegalArgumentException("No parser supplied");
    }
    
    private void m0(final org.joda.time.format.g g) {
        if (g != null) {
            return;
        }
        throw new IllegalArgumentException("No printer supplied");
    }
    
    static boolean o0(final CharSequence charSequence, final int n, final String s) {
        final int length = s.length();
        if (charSequence.length() - n < length) {
            return false;
        }
        for (int i = 0; i < length; ++i) {
            if (charSequence.charAt(n + i) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    static boolean p0(final CharSequence charSequence, final int n, final String s) {
        final int length = s.length();
        if (charSequence.length() - n < length) {
            return false;
        }
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(n + i);
            final char char2 = s.charAt(i);
            if (char1 != char2) {
                final char upperCase = Character.toUpperCase(char1);
                final char upperCase2 = Character.toUpperCase(char2);
                if (upperCase != upperCase2 && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private Object q0() {
        Object b;
        final Object o = b = this.b;
        if (o == null) {
            Object o2 = o;
            Label_0068: {
                if (this.a.size() == 2) {
                    final Object value = this.a.get(0);
                    final Object value2 = this.a.get(1);
                    if (value != null) {
                        if (value != value2) {
                            o2 = o;
                            if (value2 != null) {
                                break Label_0068;
                            }
                        }
                        o2 = value;
                    }
                    else {
                        o2 = value2;
                    }
                }
            }
            Object b2;
            if ((b2 = o2) == null) {
                b2 = new b(this.a);
            }
            this.b = b2;
            b = b2;
        }
        return b;
    }
    
    private boolean r0(final Object o) {
        return this.t0(o) || this.s0(o);
    }
    
    private boolean s0(final Object o) {
        return o instanceof org.joda.time.format.l && (!(o instanceof b) || ((b)o).e());
    }
    
    private boolean t0(final Object o) {
        return o instanceof org.joda.time.format.n && (!(o instanceof b) || ((b)o).i());
    }
    
    public c A(final int n) {
        return this.p(org.joda.time.g.L(), n, 2);
    }
    
    public c B(final char c) {
        return this.f(new a(c));
    }
    
    public c C(final String s) {
        if (s == null) {
            throw new IllegalArgumentException("Literal must not be null");
        }
        final int length = s.length();
        if (length != 0) {
            org.joda.time.format.n n;
            if (length != 1) {
                n = new h(s);
            }
            else {
                n = new a(s.charAt(0));
            }
            return this.f(n);
        }
        return this;
    }
    
    public c D(final int n) {
        return this.p(org.joda.time.g.N(), n, 8);
    }
    
    public c E(final int n) {
        return this.p(org.joda.time.g.O(), n, 3);
    }
    
    public c F(final int n) {
        return this.p(org.joda.time.g.P(), n, 4);
    }
    
    public c G(final int n) {
        return this.p(org.joda.time.g.Q(), n, 2);
    }
    
    public c H(final int n) {
        return this.p(org.joda.time.g.R(), n, 2);
    }
    
    public c I() {
        return this.O(org.joda.time.g.R());
    }
    
    public c J() {
        return this.Q(org.joda.time.g.R());
    }
    
    public c K(final org.joda.time.format.d d) {
        this.l0(d);
        return this.g(null, new e(new org.joda.time.format.l[] { org.joda.time.format.f.c(d), null }));
    }
    
    public c L(final String s) {
        org.joda.time.format.a.a(this, s);
        return this;
    }
    
    public c M(final int n) {
        return this.p(org.joda.time.g.S(), n, 5);
    }
    
    public c N(final int n) {
        return this.p(org.joda.time.g.T(), n, 2);
    }
    
    public c O(final org.joda.time.g g) {
        if (g != null) {
            return this.f(new i(g, true));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }
    
    public c P(final org.joda.time.g g, final int n, final int n2) {
        if (g == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        int n3;
        if ((n3 = n2) < n) {
            n3 = n;
        }
        if (n < 0 || n3 <= 0) {
            throw new IllegalArgumentException();
        }
        if (n <= 1) {
            return this.f(new n(g, n3, true));
        }
        return this.f(new g(g, n3, true, n));
    }
    
    public c Q(final org.joda.time.g g) {
        if (g != null) {
            return this.f(new i(g, false));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }
    
    public c R() {
        final j g = j.G;
        return this.g(g, g);
    }
    
    public c S() {
        return this.g(new k(0, null), null);
    }
    
    public c T(final Map<String, org.joda.time.i> map) {
        final k k = new k(0, map);
        return this.g(k, k);
    }
    
    public c U(final String s, final String s2, final boolean b, final int n, final int n2) {
        return this.f(new l(s, s2, b, n, n2));
    }
    
    public c V(final String s, final boolean b, final int n, final int n2) {
        return this.f(new l(s, s, b, n, n2));
    }
    
    public c W() {
        return this.g(new k(1, null), null);
    }
    
    public c X(final Map<String, org.joda.time.i> map) {
        final k k = new k(1, map);
        return this.g(k, k);
    }
    
    public c Y(final int n) {
        return this.Z(n, false);
    }
    
    public c Z(final int n, final boolean b) {
        return this.f(new m(org.joda.time.g.V(), n, b));
    }
    
    public c a(final org.joda.time.format.b b) {
        if (b != null) {
            return this.g(b.i(), b.f());
        }
        throw new IllegalArgumentException("No formatter supplied");
    }
    
    public c a0(final int n) {
        return this.b0(n, false);
    }
    
    public c b(final org.joda.time.format.d d) {
        this.l0(d);
        return this.g(null, org.joda.time.format.f.c(d));
    }
    
    public c b0(final int n, final boolean b) {
        return this.f(new m(org.joda.time.g.X(), n, b));
    }
    
    public c c(final org.joda.time.format.g g) {
        this.m0(g);
        return this.g(org.joda.time.format.h.b(g), null);
    }
    
    public c d(final org.joda.time.format.g g, final org.joda.time.format.d d) {
        this.m0(g);
        this.l0(d);
        return this.g(org.joda.time.format.h.b(g), org.joda.time.format.f.c(d));
    }
    
    public c d0(final int n) {
        return this.p(org.joda.time.g.U(), n, 2);
    }
    
    public c e(final org.joda.time.format.g g, final org.joda.time.format.d[] array) {
        if (g != null) {
            this.m0(g);
        }
        if (array != null) {
            final int length = array.length;
            int i = 0;
            org.joda.time.format.l c;
            org.joda.time.format.n b2;
            if (length == 1) {
                if (array[0] == null) {
                    throw new IllegalArgumentException("No parser supplied");
                }
                final org.joda.time.format.n b = org.joda.time.format.h.b(g);
                c = org.joda.time.format.f.c(array[0]);
                b2 = b;
            }
            else {
                final org.joda.time.format.l[] array2 = new org.joda.time.format.l[length];
                while (i < length - 1) {
                    if ((array2[i] = org.joda.time.format.f.c(array[i])) == null) {
                        throw new IllegalArgumentException("Incomplete parser array");
                    }
                    ++i;
                }
                array2[i] = org.joda.time.format.f.c(array[i]);
                b2 = org.joda.time.format.h.b(g);
                c = new e(array2);
            }
            return this.g(b2, c);
        }
        throw new IllegalArgumentException("No parsers supplied");
    }
    
    public c e0(final int n, final int n2) {
        return this.P(org.joda.time.g.V(), n, n2);
    }
    
    public c f0(final int n, final int n2) {
        return this.P(org.joda.time.g.X(), n, n2);
    }
    
    public c g0(final int n, final int n2) {
        return this.p(org.joda.time.g.Y(), n, n2);
    }
    
    public c h(final int n, final int n2) {
        return this.P(org.joda.time.g.x(), n, n2);
    }
    
    public c h0(final int n, final int n2) {
        return this.p(org.joda.time.g.Z(), n, n2);
    }
    
    public c i(final int n) {
        return this.p(org.joda.time.g.y(), n, 2);
    }
    
    public boolean i0() {
        return this.r0(this.q0());
    }
    
    public c j(final int n) {
        return this.p(org.joda.time.g.z(), n, 2);
    }
    
    public boolean j0() {
        return this.s0(this.q0());
    }
    
    public c k(final int n) {
        return this.p(org.joda.time.g.B(), n, 2);
    }
    
    public boolean k0() {
        return this.t0(this.q0());
    }
    
    public c l(final int n) {
        return this.p(org.joda.time.g.C(), n, 1);
    }
    
    public c m() {
        return this.O(org.joda.time.g.C());
    }
    
    public c n() {
        return this.Q(org.joda.time.g.C());
    }
    
    public void n0() {
        this.b = null;
        this.a.clear();
    }
    
    public c o(final int n) {
        return this.p(org.joda.time.g.D(), n, 3);
    }
    
    public c p(final org.joda.time.g g, final int n, final int n2) {
        if (g == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        int n3;
        if ((n3 = n2) < n) {
            n3 = n;
        }
        if (n < 0 || n3 <= 0) {
            throw new IllegalArgumentException();
        }
        if (n <= 1) {
            return this.f(new n(g, n3, false));
        }
        return this.f(new g(g, n3, false, n));
    }
    
    public c q() {
        return this.Q(org.joda.time.g.E());
    }
    
    public c r(final org.joda.time.g g, final int i) {
        if (g == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i > 0) {
            return this.f(new c(g, i, false));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Illegal number of digits: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public c s(final org.joda.time.g g, final int i) {
        if (g == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i > 0) {
            return this.f(new c(g, i, true));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Illegal number of digits: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public c t(final org.joda.time.g g, final int n, final int n2) {
        if (g == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        int n3;
        if ((n3 = n2) < n) {
            n3 = n;
        }
        if (n >= 0 && n3 > 0) {
            return this.f(new d(g, n, n3));
        }
        throw new IllegalArgumentException();
    }
    
    public c u(final int n, final int n2) {
        return this.t(org.joda.time.g.D(), n, n2);
    }
    
    public org.joda.time.format.b u0() {
        final Object q0 = this.q0();
        final boolean t0 = this.t0(q0);
        org.joda.time.format.l l = null;
        org.joda.time.format.n n;
        if (t0) {
            n = (org.joda.time.format.n)q0;
        }
        else {
            n = null;
        }
        if (this.s0(q0)) {
            l = (org.joda.time.format.l)q0;
        }
        if (n == null && l == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new org.joda.time.format.b(n, l);
    }
    
    public c v(final int n, final int n2) {
        return this.t(org.joda.time.g.K(), n, n2);
    }
    
    public org.joda.time.format.d v0() {
        final Object q0 = this.q0();
        if (this.s0(q0)) {
            return org.joda.time.format.m.a((org.joda.time.format.l)q0);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }
    
    public c w(final int n, final int n2) {
        return this.t(org.joda.time.g.P(), n, n2);
    }
    
    public org.joda.time.format.g w0() {
        final Object q0 = this.q0();
        if (this.t0(q0)) {
            return o.a((org.joda.time.format.n)q0);
        }
        throw new UnsupportedOperationException("Printing is not supported");
    }
    
    public c x(final int n, final int n2) {
        return this.t(org.joda.time.g.S(), n, n2);
    }
    
    public c y() {
        return this.Q(org.joda.time.g.J());
    }
    
    public c z(final int n) {
        return this.p(org.joda.time.g.K(), n, 2);
    }
    
    static class a implements n, l
    {
        private final char G;
        
        a(final char c) {
            this.G = c;
        }
        
        @Override
        public int b() {
            return 1;
        }
        
        @Override
        public int d() {
            return 1;
        }
        
        @Override
        public void f(final Appendable appendable, final n0 n0, final Locale locale) throws IOException {
            appendable.append(this.G);
        }
        
        @Override
        public int g(final org.joda.time.format.e e, final CharSequence charSequence, final int n) {
            if (n >= charSequence.length()) {
                return ~n;
            }
            final char char1 = charSequence.charAt(n);
            final char g = this.G;
            if (char1 != g) {
                final char upperCase = Character.toUpperCase(char1);
                final char upperCase2 = Character.toUpperCase(g);
                if (upperCase != upperCase2 && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                    return ~n;
                }
            }
            return n + 1;
        }
        
        @Override
        public void h(final Appendable appendable, final long n, final org.joda.time.a a, final int n2, final org.joda.time.i i, final Locale locale) throws IOException {
            appendable.append(this.G);
        }
    }
    
    static class b implements n, l
    {
        private final n[] G;
        private final l[] H;
        private final int I;
        private final int J;
        
        b(final List<Object> list) {
            final ArrayList<n> list2 = new ArrayList<n>();
            final ArrayList<l> list3 = new ArrayList<l>();
            this.c(list, (List<Object>)list2, (List<Object>)list3);
            final boolean contains = list2.contains(null);
            final int n = 0;
            if (!contains && !list2.isEmpty()) {
                final int size = list2.size();
                this.G = new n[size];
                int i = 0;
                int j = 0;
                while (i < size) {
                    final n n2 = list2.get(i);
                    j += n2.d();
                    this.G[i] = n2;
                    ++i;
                }
                this.I = j;
            }
            else {
                this.G = null;
                this.I = 0;
            }
            if (!list3.contains(null) && !list3.isEmpty()) {
                final int size2 = list3.size();
                this.H = new l[size2];
                int k = 0;
                for (int l = n; l < size2; ++l) {
                    final l m = list3.get(l);
                    k += m.b();
                    this.H[l] = m;
                }
                this.J = k;
            }
            else {
                this.H = null;
                this.J = 0;
            }
        }
        
        private void a(final List<Object> list, final Object[] array) {
            if (array != null) {
                for (int i = 0; i < array.length; ++i) {
                    list.add(array[i]);
                }
            }
        }
        
        private void c(final List<Object> list, final List<Object> list2, final List<Object> list3) {
            for (int size = list.size(), i = 0; i < size; i += 2) {
                final b value = list.get(i);
                if (value instanceof b) {
                    this.a(list2, value.G);
                }
                else {
                    list2.add(value);
                }
                final b value2 = list.get(i + 1);
                if (value2 instanceof b) {
                    this.a(list3, value2.H);
                }
                else {
                    list3.add(value2);
                }
            }
        }
        
        @Override
        public int b() {
            return this.J;
        }
        
        @Override
        public int d() {
            return this.I;
        }
        
        boolean e() {
            return this.H != null;
        }
        
        @Override
        public void f(final Appendable appendable, final n0 n0, final Locale locale) throws IOException {
            final n[] g = this.G;
            if (g != null) {
                Locale default1;
                if ((default1 = locale) == null) {
                    default1 = Locale.getDefault();
                }
                for (int length = g.length, i = 0; i < length; ++i) {
                    g[i].f(appendable, n0, default1);
                }
                return;
            }
            throw new UnsupportedOperationException();
        }
        
        @Override
        public int g(final org.joda.time.format.e e, final CharSequence charSequence, int n) {
            final l[] h = this.H;
            if (h != null) {
                final int length = h.length;
                final int n2 = 0;
                int g;
                for (g = n, n = n2; n < length && g >= 0; g = h[n].g(e, charSequence, g), ++n) {}
                return g;
            }
            throw new UnsupportedOperationException();
        }
        
        @Override
        public void h(final Appendable appendable, final long n, final org.joda.time.a a, final int n2, final org.joda.time.i i, Locale default1) throws IOException {
            final n[] g = this.G;
            if (g != null) {
                if (default1 == null) {
                    default1 = Locale.getDefault();
                }
                for (int length = g.length, j = 0; j < length; ++j) {
                    g[j].h(appendable, n, a, n2, i, default1);
                }
                return;
            }
            throw new UnsupportedOperationException();
        }
        
        boolean i() {
            return this.G != null;
        }
    }
    
    static class c extends g
    {
        protected c(final org.joda.time.g g, final int n, final boolean b) {
            super(g, n, b, n);
        }
        
        @Override
        public int g(final org.joda.time.format.e e, final CharSequence charSequence, int char1) {
            final int g = super.g(e, charSequence, char1);
            if (g < 0) {
                return g;
            }
            final int n = super.H + char1;
            int n2;
            if ((n2 = g) != n) {
                int n3 = n;
                Label_0077: {
                    if (super.I) {
                        char1 = charSequence.charAt(char1);
                        if (char1 != 45) {
                            n3 = n;
                            if (char1 != 43) {
                                break Label_0077;
                            }
                        }
                        n3 = n + 1;
                    }
                }
                if (g > n3) {
                    return ~(n3 + 1);
                }
                if ((n2 = g) < n3) {
                    n2 = ~g;
                }
            }
            return n2;
        }
    }
    
    static class d implements n, l
    {
        private final org.joda.time.g G;
        protected int H;
        protected int I;
        
        protected d(final org.joda.time.g g, final int h, final int n) {
            this.G = g;
            int i = n;
            if (n > 18) {
                i = 18;
            }
            this.H = h;
            this.I = i;
        }
        
        private long[] a(final long n, final org.joda.time.f f) {
            final long o = f.t().o();
            int i = this.I;
            long n2 = 0L;
            while (true) {
                switch (i) {
                    default: {
                        n2 = 1L;
                        break;
                    }
                    case 18: {
                        n2 = 1000000000000000000L;
                        break;
                    }
                    case 17: {
                        n2 = 100000000000000000L;
                        break;
                    }
                    case 16: {
                        n2 = 10000000000000000L;
                        break;
                    }
                    case 15: {
                        n2 = 1000000000000000L;
                        break;
                    }
                    case 14: {
                        n2 = 100000000000000L;
                        break;
                    }
                    case 13: {
                        n2 = 10000000000000L;
                        break;
                    }
                    case 12: {
                        n2 = 1000000000000L;
                        break;
                    }
                    case 11: {
                        n2 = 100000000000L;
                        break;
                    }
                    case 10: {
                        n2 = 10000000000L;
                        break;
                    }
                    case 9: {
                        n2 = 1000000000L;
                        break;
                    }
                    case 8: {
                        n2 = 100000000L;
                        break;
                    }
                    case 7: {
                        n2 = 10000000L;
                        break;
                    }
                    case 6: {
                        n2 = 1000000L;
                        break;
                    }
                    case 5: {
                        n2 = 100000L;
                        break;
                    }
                    case 4: {
                        n2 = 10000L;
                        break;
                    }
                    case 3: {
                        n2 = 1000L;
                        break;
                    }
                    case 2: {
                        n2 = 100L;
                        break;
                    }
                    case 1: {
                        n2 = 10L;
                        break;
                    }
                }
                if (o * n2 / n2 == o) {
                    break;
                }
                --i;
            }
            return new long[] { n * n2 / o, i };
        }
        
        @Override
        public int b() {
            return this.I;
        }
        
        protected void c(final Appendable appendable, long n, final org.joda.time.a a) throws IOException {
            final org.joda.time.f g = this.G.G(a);
            int i = this.H;
            try {
                n = g.N(n);
                if (n == 0L) {
                    while (--i >= 0) {
                        appendable.append('0');
                    }
                    return;
                }
                final long[] a2 = this.a(n, g);
                final int n2 = 0;
                n = a2[0];
                int n3 = (int)a2[1];
                String s;
                if ((0x7FFFFFFFL & n) == n) {
                    s = Integer.toString((int)n);
                }
                else {
                    s = Long.toString(n);
                }
                int j;
                for (j = s.length(); j < n3; --n3) {
                    appendable.append('0');
                    --i;
                }
                if (i < n3) {
                    int n4;
                    int n5;
                    for (n4 = n3, n5 = j; i < n4 && n5 > 1 && s.charAt(n5 - 1) == '0'; --n4, --n5) {}
                    if (n5 < s.length()) {
                        for (i = n2; i < n5; ++i) {
                            appendable.append(s.charAt(i));
                        }
                        return;
                    }
                }
                appendable.append(s);
            }
            catch (RuntimeException ex) {
                c.c0(appendable, i);
            }
        }
        
        @Override
        public int d() {
            return this.I;
        }
        
        @Override
        public void f(final Appendable appendable, final n0 n0, final Locale locale) throws IOException {
            this.c(appendable, n0.t().K(n0, 0L), n0.t());
        }
        
        @Override
        public int g(final org.joda.time.format.e e, final CharSequence charSequence, final int n) {
            final org.joda.time.f g = this.G.G(e.p());
            int min;
            long n2;
            long n3;
            int i;
            char char1;
            for (min = Math.min(this.I, charSequence.length() - n), n2 = g.t().o() * 10L, n3 = 0L, i = 0; i < min; ++i, n2 /= 10L, n3 += (char1 - '0') * n2) {
                char1 = charSequence.charAt(n + i);
                if (char1 < '0') {
                    break;
                }
                if (char1 > '9') {
                    break;
                }
            }
            final long n4 = n3 / 10L;
            if (i == 0) {
                return ~n;
            }
            if (n4 > 2147483647L) {
                return ~n;
            }
            e.z(new org.joda.time.field.o(org.joda.time.g.O(), org.joda.time.field.m.H, g.t()), (int)n4);
            return n + i;
        }
        
        @Override
        public void h(final Appendable appendable, final long n, final org.joda.time.a a, final int n2, final org.joda.time.i i, final Locale locale) throws IOException {
            this.c(appendable, n, a);
        }
    }
    
    static class e implements l
    {
        private final l[] G;
        private final int H;
        
        e(final l[] g) {
            this.G = g;
            int length = g.length;
            int h = 0;
            while (true) {
                final int n = length - 1;
                if (n < 0) {
                    break;
                }
                final l l = g[n];
                length = n;
                if (l == null) {
                    continue;
                }
                final int b = l.b();
                length = n;
                if (b <= h) {
                    continue;
                }
                h = b;
                length = n;
            }
            this.H = h;
        }
        
        @Override
        public int b() {
            return this.H;
        }
        
        @Override
        public int g(final org.joda.time.format.e e, final CharSequence charSequence, final int n) {
            final l[] g = this.G;
            final int length = g.length;
            final Object c = e.C();
            final int n2 = 0;
            Object o = null;
            int n3 = n;
            final int n4 = 0;
            int n5 = n;
            int n6 = n4;
            int n7 = 0;
            Label_0249: {
                int g2;
                while (true) {
                    n7 = n2;
                    if (n6 >= length) {
                        break Label_0249;
                    }
                    final l l = g[n6];
                    if (l == null) {
                        if (n5 <= n) {
                            return n;
                        }
                        n7 = 1;
                        break Label_0249;
                    }
                    else {
                        g2 = l.g(e, charSequence, n);
                        Object c2;
                        int n8;
                        int n9;
                        if (g2 >= n) {
                            c2 = o;
                            n8 = n5;
                            n9 = n3;
                            if (g2 > n5) {
                                if (g2 >= charSequence.length()) {
                                    break;
                                }
                                final int n10 = n6 + 1;
                                if (n10 >= length) {
                                    break;
                                }
                                if (g[n10] == null) {
                                    break;
                                }
                                c2 = e.C();
                                n8 = g2;
                                n9 = n3;
                            }
                        }
                        else {
                            c2 = o;
                            n8 = n5;
                            n9 = n3;
                            if (g2 < 0) {
                                final int n11 = ~g2;
                                c2 = o;
                                n8 = n5;
                                if (n11 > (n9 = n3)) {
                                    n9 = n11;
                                    n8 = n5;
                                    c2 = o;
                                }
                            }
                        }
                        e.y(c);
                        ++n6;
                        o = c2;
                        n5 = n8;
                        n3 = n9;
                    }
                }
                return g2;
            }
            if (n5 <= n && (n5 != n || n7 == 0)) {
                return ~n3;
            }
            if (o != null) {
                e.y(o);
            }
            return n5;
        }
    }
    
    abstract static class f implements n, l
    {
        protected final org.joda.time.g G;
        protected final int H;
        protected final boolean I;
        
        f(final org.joda.time.g g, final int h, final boolean i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        @Override
        public int b() {
            return this.H;
        }
        
        @Override
        public int g(final org.joda.time.format.e e, final CharSequence charSequence, int n) {
            int n2 = Math.min(this.H, charSequence.length() - n);
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            Label_0243: {
                int n9;
                boolean b;
                while (true) {
                    n6 = n4;
                    n7 = n5;
                    if (n3 >= n2) {
                        break Label_0243;
                    }
                    final int n8 = n + n3;
                    final char char1 = charSequence.charAt(n8);
                    if (n3 == 0 && (char1 == '-' || char1 == '+') && this.I) {
                        n9 = 1;
                        b = (char1 == '-');
                        if (char1 != '+') {
                            n9 = 0;
                        }
                        final int n10 = n3 + 1;
                        if (n10 >= n2) {
                            break;
                        }
                        final char char2 = charSequence.charAt(n8 + 1);
                        if (char2 < '0') {
                            break;
                        }
                        if (char2 > '9') {
                            break;
                        }
                        n2 = Math.min(n2 + 1, charSequence.length() - n);
                        n3 = n10;
                        final int n11 = n9;
                        n4 = (b ? 1 : 0);
                        n5 = n11;
                    }
                    else {
                        n6 = n4;
                        n7 = n5;
                        if (char1 < '0') {
                            break Label_0243;
                        }
                        if (char1 > '9') {
                            n6 = n4;
                            n7 = n5;
                            break Label_0243;
                        }
                        ++n3;
                    }
                }
                n6 = (b ? 1 : 0);
                n7 = n9;
            }
            if (n3 == 0) {
                return ~n;
            }
            Label_0436: {
                int n13;
                if (n3 >= 9) {
                    if (n7 != 0) {
                        final int n12 = n + n3;
                        n = Integer.parseInt(charSequence.subSequence(n + 1, n12).toString());
                        break Label_0436;
                    }
                    final int n12 = n + n3;
                    n = Integer.parseInt(charSequence.subSequence(n, n12).toString());
                    break Label_0436;
                }
                else if (n6 == 0 && n7 == 0) {
                    n13 = n;
                }
                else {
                    n13 = n + 1;
                }
                final int n14 = n13 + 1;
                try {
                    final int n15 = charSequence.charAt(n13) - '0';
                    int n16;
                    int i;
                    char char3;
                    for (n16 = n + n3, i = n14, n = n15; i < n16; ++i, n = (n << 3) + (n << 1) + char3 - 48) {
                        char3 = charSequence.charAt(i);
                    }
                    int n12;
                    if (n6 != 0) {
                        n = -n;
                        n12 = n16;
                    }
                    else {
                        n12 = n16;
                    }
                    e.A(this.G, n);
                    return n12;
                }
                catch (StringIndexOutOfBoundsException ex) {
                    return ~n;
                }
            }
        }
    }
    
    static class g extends f
    {
        protected final int J;
        
        protected g(final org.joda.time.g g, final int n, final boolean b, final int j) {
            super(g, n, b);
            this.J = j;
        }
        
        @Override
        public int d() {
            return super.H;
        }
        
        @Override
        public void f(final Appendable appendable, final n0 n0, final Locale locale) throws IOException {
            while (true) {
                if (!n0.Z(super.G)) {
                    break Label_0034;
                }
                try {
                    org.joda.time.format.i.a(appendable, n0.j0(super.G), this.J);
                    return;
                    c.c0(appendable, this.J);
                }
                catch (RuntimeException ex) {
                    continue;
                }
                break;
            }
        }
        
        @Override
        public void h(final Appendable appendable, final long n, final org.joda.time.a a, final int n2, final org.joda.time.i i, final Locale locale) throws IOException {
            try {
                i.a(appendable, super.G.G(a).g(n), this.J);
            }
            catch (RuntimeException ex) {
                c.c0(appendable, this.J);
            }
        }
    }
    
    static class h implements n, l
    {
        private final String G;
        
        h(final String g) {
            this.G = g;
        }
        
        @Override
        public int b() {
            return this.G.length();
        }
        
        @Override
        public int d() {
            return this.G.length();
        }
        
        @Override
        public void f(final Appendable appendable, final n0 n0, final Locale locale) throws IOException {
            appendable.append(this.G);
        }
        
        @Override
        public int g(final org.joda.time.format.e e, final CharSequence charSequence, final int n) {
            if (c.p0(charSequence, n, this.G)) {
                return n + this.G.length();
            }
            return ~n;
        }
        
        @Override
        public void h(final Appendable appendable, final long n, final org.joda.time.a a, final int n2, final org.joda.time.i i, final Locale locale) throws IOException {
            appendable.append(this.G);
        }
    }
    
    static class i implements n, l
    {
        private static Map<Locale, Map<org.joda.time.g, Object[]>> I;
        private final org.joda.time.g G;
        private final boolean H;
        
        static {
            i.I = new ConcurrentHashMap<Locale, Map<org.joda.time.g, Object[]>>();
        }
        
        i(final org.joda.time.g g, final boolean h) {
            this.G = g;
            this.H = h;
        }
        
        private String a(final long n, final org.joda.time.a a, final Locale locale) {
            final org.joda.time.f g = this.G.G(a);
            if (this.H) {
                return g.j(n, locale);
            }
            return g.o(n, locale);
        }
        
        private String c(final n0 n0, final Locale locale) {
            if (!n0.Z(this.G)) {
                return "\ufffd";
            }
            final org.joda.time.f g = this.G.G(n0.t());
            if (this.H) {
                return g.l(n0, locale);
            }
            return g.q(n0, locale);
        }
        
        @Override
        public int b() {
            return this.d();
        }
        
        @Override
        public int d() {
            int n;
            if (this.H) {
                n = 6;
            }
            else {
                n = 20;
            }
            return n;
        }
        
        @Override
        public void f(final Appendable appendable, final n0 n0, final Locale locale) throws IOException {
            try {
                appendable.append(this.c(n0, locale));
            }
            catch (RuntimeException ex) {
                appendable.append('\ufffd');
            }
        }
        
        @Override
        public int g(final org.joda.time.format.e e, final CharSequence charSequence, final int n) {
            final Locale q = e.q();
            Map<org.joda.time.g, Object[]> map;
            if ((map = i.I.get(q)) == null) {
                map = new ConcurrentHashMap<org.joda.time.g, Object[]>();
                i.I.put(q, map);
            }
            final Object[] array = map.get(this.G);
            int intValue;
            Map<String, Boolean> map2;
            if (array == null) {
                final ConcurrentHashMap<String, Boolean> concurrentHashMap = new ConcurrentHashMap<String, Boolean>(32);
                final z.a c0 = new z(0L, org.joda.time.i.I).C0(this.G);
                int i = c0.w();
                final int t = c0.t();
                if (t - i > 32) {
                    return ~n;
                }
                final int r = c0.r(q);
                while (i <= t) {
                    c0.N(i);
                    final String e2 = c0.e(q);
                    final Boolean true = Boolean.TRUE;
                    concurrentHashMap.put(e2, true);
                    concurrentHashMap.put(c0.e(q).toLowerCase(q), true);
                    concurrentHashMap.put(c0.e(q).toUpperCase(q), true);
                    concurrentHashMap.put(c0.h(q), true);
                    concurrentHashMap.put(c0.h(q).toLowerCase(q), true);
                    concurrentHashMap.put(c0.h(q).toUpperCase(q), true);
                    ++i;
                }
                intValue = r;
                if ("en".equals(q.getLanguage())) {
                    intValue = r;
                    if (this.G == org.joda.time.g.E()) {
                        final Boolean true2 = Boolean.TRUE;
                        concurrentHashMap.put("BCE", true2);
                        concurrentHashMap.put("bce", true2);
                        concurrentHashMap.put("CE", true2);
                        concurrentHashMap.put("ce", true2);
                        intValue = 3;
                    }
                }
                map.put(this.G, new Object[] { concurrentHashMap, intValue });
                map2 = concurrentHashMap;
            }
            else {
                map2 = (Map<String, Boolean>)array[0];
                intValue = (int)array[1];
            }
            for (int j = Math.min(charSequence.length(), intValue + n); j > n; --j) {
                final String string = charSequence.subSequence(n, j).toString();
                if (map2.containsKey(string)) {
                    e.B(this.G, string, q);
                    return j;
                }
            }
            return ~n;
        }
        
        @Override
        public void h(final Appendable appendable, final long n, final org.joda.time.a a, final int n2, final org.joda.time.i i, final Locale locale) throws IOException {
            try {
                appendable.append(this.a(n, a, locale));
            }
            catch (RuntimeException ex) {
                appendable.append('\ufffd');
            }
        }
    }
    
    enum j implements n, l
    {
        G;
        
        private static final List<String> H;
        private static final Map<String, List<String>> I;
        private static final List<String> J;
        static final int K;
        static final int L;
        
        static {
            J = new ArrayList<String>();
            final ArrayList<String> h = new ArrayList<String>(org.joda.time.i.l());
            Collections.sort((List<String>)(H = h));
            I = new HashMap<String, List<String>>();
            final Iterator<Object> iterator = h.iterator();
            int max = 0;
            int max2 = 0;
            while (iterator.hasNext()) {
                final String s = iterator.next();
                final int index = s.indexOf(47);
                if (index >= 0) {
                    int n;
                    if ((n = index) < s.length()) {
                        n = index + 1;
                    }
                    max2 = Math.max(max2, n);
                    final String substring = s.substring(0, n + 1);
                    final String substring2 = s.substring(n);
                    final Map<String, List<String>> i = j.I;
                    if (!i.containsKey(substring)) {
                        i.put(substring, new ArrayList<String>());
                    }
                    ((ArrayList<String>)i.get(substring)).add(substring2);
                }
                else {
                    j.J.add(s);
                }
                max = Math.max(max, s.length());
            }
            K = max;
            L = max2;
        }
        
        @Override
        public int b() {
            return j.K;
        }
        
        @Override
        public int d() {
            return j.K;
        }
        
        @Override
        public void f(final Appendable appendable, final n0 n0, final Locale locale) throws IOException {
        }
        
        @Override
        public int g(final org.joda.time.format.e e, final CharSequence charSequence, final int n) {
            List<String> j = org.joda.time.format.c.j.J;
            final int length = charSequence.length();
            final int min = Math.min(length, org.joda.time.format.c.j.L + n);
            int i = n;
            while (true) {
                while (i < min) {
                    if (charSequence.charAt(i) == '/') {
                        final int n2 = i + 1;
                        final String string = charSequence.subSequence(n, n2).toString();
                        final int n3 = string.length() + n;
                        String string2;
                        if (i < length) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(string);
                            sb.append(charSequence.charAt(n2));
                            string2 = sb.toString();
                        }
                        else {
                            string2 = string;
                        }
                        final List<String> list = j = org.joda.time.format.c.j.I.get(string2);
                        final int n4 = n3;
                        if (list == null) {
                            return ~n;
                        }
                        String str = null;
                        String s2;
                        for (int k = 0; k < j.size(); ++k, str = s2) {
                            final String s = j.get(k);
                            s2 = str;
                            if (c.o0(charSequence, n4, s)) {
                                if (str != null) {
                                    s2 = str;
                                    if (s.length() <= str.length()) {
                                        continue;
                                    }
                                }
                                s2 = s;
                            }
                        }
                        if (str != null) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(string);
                            sb2.append(str);
                            e.G(org.joda.time.i.g(sb2.toString()));
                            return n4 + str.length();
                        }
                        return ~n;
                    }
                    else {
                        ++i;
                    }
                }
                final String string = "";
                final int n4 = n;
                continue;
            }
        }
        
        @Override
        public void h(final Appendable appendable, final long n, final org.joda.time.a a, final int n2, final org.joda.time.i i, final Locale locale) throws IOException {
            String q;
            if (i != null) {
                q = i.q();
            }
            else {
                q = "";
            }
            appendable.append(q);
        }
    }
    
    static class k implements n, l
    {
        static final int I = 0;
        static final int J = 1;
        private final Map<String, org.joda.time.i> G;
        private final int H;
        
        k(final int h, final Map<String, org.joda.time.i> g) {
            this.H = h;
            this.G = g;
        }
        
        private String a(final long n, final org.joda.time.i i, final Locale locale) {
            if (i == null) {
                return "";
            }
            final int h = this.H;
            if (h == 0) {
                return i.t(n, locale);
            }
            if (h != 1) {
                return "";
            }
            return i.C(n, locale);
        }
        
        @Override
        public int b() {
            int n;
            if (this.H == 1) {
                n = 4;
            }
            else {
                n = 20;
            }
            return n;
        }
        
        @Override
        public int d() {
            int n;
            if (this.H == 1) {
                n = 4;
            }
            else {
                n = 20;
            }
            return n;
        }
        
        @Override
        public void f(final Appendable appendable, final n0 n0, final Locale locale) throws IOException {
        }
        
        @Override
        public int g(final org.joda.time.format.e e, final CharSequence charSequence, final int n) {
            Map<String, org.joda.time.i> map = this.G;
            if (map == null) {
                map = org.joda.time.h.g();
            }
            String s = null;
            for (final String s2 : map.keySet()) {
                if (c.o0(charSequence, n, s2) && (s == null || s2.length() > s.length())) {
                    s = s2;
                }
            }
            if (s != null) {
                e.G(map.get(s));
                return n + s.length();
            }
            return ~n;
        }
        
        @Override
        public void h(final Appendable appendable, final long n, final org.joda.time.a a, final int n2, final org.joda.time.i i, final Locale locale) throws IOException {
            appendable.append(this.a(n - n2, i, locale));
        }
    }
    
    static class l implements n, org.joda.time.format.l
    {
        private final String G;
        private final String H;
        private final boolean I;
        private final int J;
        private final int K;
        
        l(final String g, final String h, final boolean i, final int n, int k) {
            this.G = g;
            this.H = h;
            this.I = i;
            if (n > 0 && k >= n) {
                int j;
                if ((j = n) > 4) {
                    j = 4;
                    k = 4;
                }
                this.J = j;
                this.K = k;
                return;
            }
            throw new IllegalArgumentException();
        }
        
        private int a(final CharSequence charSequence, final int n, int i) {
            i = Math.min(charSequence.length() - n, i);
            int n2 = 0;
            while (i > 0) {
                final char char1 = charSequence.charAt(n + n2);
                if (char1 < '0') {
                    break;
                }
                if (char1 > '9') {
                    break;
                }
                ++n2;
                --i;
            }
            return n2;
        }
        
        @Override
        public int b() {
            return this.d();
        }
        
        @Override
        public int d() {
            final int j = this.J;
            int n2;
            final int n = n2 = j + 1 << 1;
            if (this.I) {
                n2 = n + (j - 1);
            }
            final String g = this.G;
            int length = n2;
            if (g != null && g.length() > (length = n2)) {
                length = this.G.length();
            }
            return length;
        }
        
        @Override
        public void f(final Appendable appendable, final n0 n0, final Locale locale) throws IOException {
        }
        
        @Override
        public int g(final org.joda.time.format.e e, final CharSequence charSequence, int n) {
            final int n2 = charSequence.length() - n;
            final String h = this.H;
            final int n3 = 0;
            final Integer value = 0;
            Label_0105: {
                if (h != null) {
                    if (h.length() == 0) {
                        if (n2 > 0) {
                            final char char1 = charSequence.charAt(n);
                            if (char1 == '-') {
                                break Label_0105;
                            }
                            if (char1 == '+') {
                                break Label_0105;
                            }
                        }
                        e.E(value);
                        return n;
                    }
                    if (c.p0(charSequence, n, this.H)) {
                        e.E(value);
                        return n + this.H.length();
                    }
                }
            }
            if (n2 <= 1) {
                return ~n;
            }
            final char char2 = charSequence.charAt(n);
            boolean b;
            if (char2 == '-') {
                b = true;
            }
            else {
                if (char2 != '+') {
                    return ~n;
                }
                b = false;
            }
            ++n;
            if (this.a(charSequence, n, 2) < 2) {
                return ~n;
            }
            final int k = org.joda.time.format.i.k(charSequence, n);
            if (k > 23) {
                return ~n;
            }
            final int n4 = k * 3600000;
            final int n5 = n2 - 1 - 2;
            final int n6 = n + 2;
            int n7 = 0;
            Label_0701: {
                if (n5 <= 0) {
                    n7 = n4;
                    n = n6;
                }
                else {
                    final char char3 = charSequence.charAt(n6);
                    int n10;
                    int n11;
                    if (char3 == ':') {
                        final int n8 = n5 - 1;
                        n = n6 + 1;
                        final int n9 = 1;
                        n10 = n8;
                        n11 = n9;
                    }
                    else {
                        n7 = n4;
                        n = n6;
                        if (char3 < '0') {
                            break Label_0701;
                        }
                        n7 = n4;
                        n = n6;
                        if (char3 > '9') {
                            break Label_0701;
                        }
                        n = n6;
                        n11 = n3;
                        n10 = n5;
                    }
                    final int a = this.a(charSequence, n, 2);
                    if (a == 0 && n11 == 0) {
                        n7 = n4;
                    }
                    else {
                        if (a < 2) {
                            return ~n;
                        }
                        final int i = org.joda.time.format.i.k(charSequence, n);
                        if (i > 59) {
                            return ~n;
                        }
                        final int n12 = n4 + i * 60000;
                        final int n13 = n10 - 2;
                        final int n14 = n + 2;
                        if (n13 <= 0) {
                            n7 = n12;
                            n = n14;
                        }
                        else {
                            int n15 = n13;
                            n = n14;
                            if (n11 != 0) {
                                if (charSequence.charAt(n14) != ':') {
                                    n7 = n12;
                                    n = n14;
                                    break Label_0701;
                                }
                                n15 = n13 - 1;
                                n = n14 + 1;
                            }
                            final int a2 = this.a(charSequence, n, 2);
                            if (a2 == 0 && n11 == 0) {
                                n7 = n12;
                            }
                            else {
                                if (a2 < 2) {
                                    return ~n;
                                }
                                final int j = org.joda.time.format.i.k(charSequence, n);
                                if (j > 59) {
                                    return ~n;
                                }
                                final int n16 = n12 + j * 1000;
                                final int n17 = n + 2;
                                if (n15 - 2 <= 0) {
                                    n7 = n16;
                                    n = n17;
                                }
                                else {
                                    n = n17;
                                    if (n11 != 0) {
                                        if (charSequence.charAt(n17) != '.' && charSequence.charAt(n17) != ',') {
                                            n7 = n16;
                                            n = n17;
                                            break Label_0701;
                                        }
                                        n = n17 + 1;
                                    }
                                    final int a3 = this.a(charSequence, n, 3);
                                    if (a3 == 0 && n11 == 0) {
                                        n7 = n16;
                                    }
                                    else {
                                        if (a3 < 1) {
                                            return ~n;
                                        }
                                        final int n18 = n + 1;
                                        n7 = n16 + (charSequence.charAt(n) - '0') * 100;
                                        if (a3 > 1) {
                                            final int n19 = n18 + 1;
                                            final int n20 = n7 += (charSequence.charAt(n18) - 48) * 10;
                                            n = n19;
                                            if (a3 > 2) {
                                                n7 = n20 + (charSequence.charAt(n19) - '0');
                                                n = n19 + 1;
                                            }
                                        }
                                        else {
                                            n = n18;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int l = n7;
            if (b) {
                l = -n7;
            }
            e.E(l);
            return n;
        }
        
        @Override
        public void h(final Appendable appendable, final long n, final org.joda.time.a a, int n2, final org.joda.time.i i, final Locale locale) throws IOException {
            if (i == null) {
                return;
            }
            if (n2 == 0) {
                final String g = this.G;
                if (g != null) {
                    appendable.append(g);
                    return;
                }
            }
            if (n2 >= 0) {
                appendable.append('+');
            }
            else {
                appendable.append('-');
                n2 = -n2;
            }
            final int n3 = n2 / 3600000;
            i.a(appendable, n3, 2);
            if (this.K == 1) {
                return;
            }
            n2 -= n3 * 3600000;
            if (n2 == 0 && this.J <= 1) {
                return;
            }
            final int n4 = n2 / 60000;
            if (this.I) {
                appendable.append(':');
            }
            i.a(appendable, n4, 2);
            if (this.K == 2) {
                return;
            }
            n2 -= n4 * 60000;
            if (n2 == 0 && this.J <= 2) {
                return;
            }
            final int n5 = n2 / 1000;
            if (this.I) {
                appendable.append(':');
            }
            i.a(appendable, n5, 2);
            if (this.K == 3) {
                return;
            }
            n2 -= n5 * 1000;
            if (n2 == 0 && this.J <= 3) {
                return;
            }
            if (this.I) {
                appendable.append('.');
            }
            i.a(appendable, n2, 3);
        }
    }
    
    static class m implements n, l
    {
        private final org.joda.time.g G;
        private final int H;
        private final boolean I;
        
        m(final org.joda.time.g g, final int h, final boolean i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        private int a(final long n, final org.joda.time.a a) {
            try {
                int g;
                final int n2 = g = this.G.G(a).g(n);
                if (n2 < 0) {
                    g = -n2;
                }
                return g % 100;
            }
            catch (RuntimeException ex) {
                return -1;
            }
        }
        
        private int c(final n0 n0) {
            if (!n0.Z(this.G)) {
                return -1;
            }
            try {
                int j0;
                final int n2 = j0 = n0.j0(this.G);
                if (n2 < 0) {
                    j0 = -n2;
                }
                return j0 % 100;
            }
            catch (RuntimeException ex) {
                return -1;
            }
        }
        
        @Override
        public int b() {
            int n;
            if (this.I) {
                n = 4;
            }
            else {
                n = 2;
            }
            return n;
        }
        
        @Override
        public int d() {
            return 2;
        }
        
        @Override
        public void f(final Appendable appendable, final n0 n0, final Locale locale) throws IOException {
            final int c = this.c(n0);
            if (c < 0) {
                appendable.append('\ufffd');
                appendable.append('\ufffd');
            }
            else {
                org.joda.time.format.i.a(appendable, c, 2);
            }
        }
        
        @Override
        public int g(final org.joda.time.format.e e, final CharSequence charSequence, int n) {
            final int b = charSequence.length() - n;
            final boolean i = this.I;
            final int n2 = 0;
            int n3 = 0;
            Label_0180: {
                if (!i) {
                    n3 = n;
                    if (Math.min(2, b) < 2) {
                        return ~n;
                    }
                }
                else {
                    int j = 0;
                    boolean b2 = false;
                    boolean b3 = false;
                    int n4 = b;
                    while (j < n4) {
                        final char char1 = charSequence.charAt(n + j);
                        if (j == 0 && (char1 == '-' || char1 == '+')) {
                            b3 = (char1 == '-');
                            if (b3) {
                                ++j;
                            }
                            else {
                                ++n;
                                --n4;
                            }
                            b2 = true;
                        }
                        else {
                            if (char1 < '0') {
                                break;
                            }
                            if (char1 > '9') {
                                break;
                            }
                            ++j;
                        }
                    }
                    if (j == 0) {
                        return ~n;
                    }
                    if (!b2) {
                        n3 = n;
                        if (j == 2) {
                            break Label_0180;
                        }
                    }
                    Label_0492: {
                        if (j >= 9) {
                            final int n5 = j + n;
                            n = Integer.parseInt(charSequence.subSequence(n, n5).toString());
                            break Label_0492;
                        }
                        int n6;
                        if (b3) {
                            n6 = n + 1;
                        }
                        else {
                            n6 = n;
                        }
                        final int n7 = n6 + 1;
                        try {
                            final int n8 = charSequence.charAt(n6) - '0';
                            int n9;
                            int k;
                            char char2;
                            for (n9 = j + n, k = n7, n = n8; k < n9; ++k, n = (n << 3) + (n << 1) + char2 - 48) {
                                char2 = charSequence.charAt(k);
                            }
                            int n5;
                            if (b3) {
                                n = -n;
                                n5 = n9;
                            }
                            else {
                                n5 = n9;
                            }
                            e.A(this.G, n);
                            return n5;
                        }
                        catch (StringIndexOutOfBoundsException ex) {
                            return ~n;
                        }
                    }
                }
            }
            n = charSequence.charAt(n3);
            if (n < 48 || n > 57) {
                return ~n3;
            }
            final int n10 = n - 48;
            n = charSequence.charAt(n3 + 1);
            if (n >= 48 && n <= 57) {
                final int n11 = (n10 << 3) + (n10 << 1) + n - 48;
                n = this.H;
                if (e.t() != null) {
                    n = e.t();
                }
                final int n12 = n - 50;
                if (n12 >= 0) {
                    n = n12 % 100;
                }
                else {
                    n = (n12 + 1) % 100 + 99;
                }
                int n13 = n2;
                if (n11 < n) {
                    n13 = 100;
                }
                e.A(this.G, n11 + (n12 + n13 - n));
                return n3 + 2;
            }
            return ~n3;
        }
        
        @Override
        public void h(final Appendable appendable, final long n, final org.joda.time.a a, int a2, final org.joda.time.i i, final Locale locale) throws IOException {
            a2 = this.a(n, a);
            if (a2 < 0) {
                appendable.append('\ufffd');
                appendable.append('\ufffd');
            }
            else {
                i.a(appendable, a2, 2);
            }
        }
    }
    
    static class n extends f
    {
        protected n(final org.joda.time.g g, final int n, final boolean b) {
            super(g, n, b);
        }
        
        @Override
        public int d() {
            return super.H;
        }
        
        @Override
        public void f(final Appendable appendable, final n0 n0, final Locale locale) throws IOException {
            while (true) {
                if (!n0.Z(super.G)) {
                    break Label_0030;
                }
                try {
                    org.joda.time.format.i.e(appendable, n0.j0(super.G));
                    return;
                    appendable.append('\ufffd');
                }
                catch (RuntimeException ex) {
                    continue;
                }
                break;
            }
        }
        
        @Override
        public void h(final Appendable appendable, final long n, final org.joda.time.a a, final int n2, final org.joda.time.i i, final Locale locale) throws IOException {
            try {
                i.e(appendable, super.G.G(a).g(n));
            }
            catch (RuntimeException ex) {
                appendable.append('\ufffd');
            }
        }
    }
}
