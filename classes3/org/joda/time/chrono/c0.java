// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.format.b;
import java.util.Locale;
import org.joda.time.field.e;
import org.joda.time.field.j;
import org.joda.time.z;
import org.joda.time.i;
import org.joda.time.l0;
import org.joda.time.j0;
import org.joda.time.l;
import java.util.HashMap;
import org.joda.time.f;
import org.joda.time.c;

public final class c0 extends org.joda.time.chrono.a
{
    private static final long x0 = 7670866536893052522L;
    final org.joda.time.c u0;
    final org.joda.time.c v0;
    private transient c0 w0;
    
    private c0(final org.joda.time.a a, final org.joda.time.c u0, final org.joda.time.c v0) {
        super(a, null);
        this.u0 = u0;
        this.v0 = v0;
    }
    
    private f d0(final f key, final HashMap<Object, Object> hashMap) {
        if (key == null || !key.M()) {
            return key;
        }
        if (hashMap.containsKey(key)) {
            return hashMap.get(key);
        }
        final a value = new a(key, this.e0(key.t(), hashMap), this.e0(key.I(), hashMap), this.e0(key.v(), hashMap));
        hashMap.put(key, value);
        return value;
    }
    
    private l e0(final l key, final HashMap<Object, Object> hashMap) {
        if (key == null || !key.z()) {
            return key;
        }
        if (hashMap.containsKey(key)) {
            return hashMap.get(key);
        }
        final b value = new b(key);
        hashMap.put(key, value);
        return value;
    }
    
    public static c0 f0(final org.joda.time.a a, final j0 j0, final j0 j2) {
        if (a == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        final org.joda.time.c c = null;
        org.joda.time.c y0;
        if (j0 == null) {
            y0 = null;
        }
        else {
            y0 = j0.y0();
        }
        org.joda.time.c y2;
        if (j2 == null) {
            y2 = c;
        }
        else {
            y2 = j2.y0();
        }
        if (y0 != null && y2 != null && !y0.C(y2)) {
            throw new IllegalArgumentException("The lower limit must be come before than the upper limit");
        }
        return new c0(a, y0, y2);
    }
    
    @Override
    public org.joda.time.a R() {
        return this.S(i.I);
    }
    
    @Override
    public org.joda.time.a S(final i i) {
        i n = i;
        if (i == null) {
            n = i.n();
        }
        if (n == this.s()) {
            return this;
        }
        final i j = i.I;
        if (n == j) {
            final c0 w0 = this.w0;
            if (w0 != null) {
                return w0;
            }
        }
        final org.joda.time.c u0 = this.u0;
        org.joda.time.c y0;
        if ((y0 = u0) != null) {
            final z i2 = u0.I3();
            i2.t1(n);
            y0 = i2.y0();
        }
        final org.joda.time.c v0 = this.v0;
        org.joda.time.c y2;
        if ((y2 = v0) != null) {
            final z i3 = v0.I3();
            i3.t1(n);
            y2 = i3.y0();
        }
        final c0 f0 = f0(this.Y().S(n), y0, y2);
        if (n == j) {
            this.w0 = f0;
        }
        return f0;
    }
    
    @Override
    protected void X(final org.joda.time.chrono.a.a a) {
        final HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        a.l = this.e0(a.l, hashMap);
        a.k = this.e0(a.k, hashMap);
        a.j = this.e0(a.j, hashMap);
        a.i = this.e0(a.i, hashMap);
        a.h = this.e0(a.h, hashMap);
        a.g = this.e0(a.g, hashMap);
        a.f = this.e0(a.f, hashMap);
        a.e = this.e0(a.e, hashMap);
        a.d = this.e0(a.d, hashMap);
        a.c = this.e0(a.c, hashMap);
        a.b = this.e0(a.b, hashMap);
        a.a = this.e0(a.a, hashMap);
        a.E = this.d0(a.E, hashMap);
        a.F = this.d0(a.F, hashMap);
        a.G = this.d0(a.G, hashMap);
        a.H = this.d0(a.H, hashMap);
        a.I = this.d0(a.I, hashMap);
        a.x = this.d0(a.x, hashMap);
        a.y = this.d0(a.y, hashMap);
        a.z = this.d0(a.z, hashMap);
        a.D = this.d0(a.D, hashMap);
        a.A = this.d0(a.A, hashMap);
        a.B = this.d0(a.B, hashMap);
        a.C = this.d0(a.C, hashMap);
        a.m = this.d0(a.m, hashMap);
        a.n = this.d0(a.n, hashMap);
        a.o = this.d0(a.o, hashMap);
        a.p = this.d0(a.p, hashMap);
        a.q = this.d0(a.q, hashMap);
        a.r = this.d0(a.r, hashMap);
        a.s = this.d0(a.s, hashMap);
        a.u = this.d0(a.u, hashMap);
        a.t = this.d0(a.t, hashMap);
        a.v = this.d0(a.v, hashMap);
        a.w = this.d0(a.w, hashMap);
    }
    
    void c0(final long n, final String s) {
        final org.joda.time.c u0 = this.u0;
        if (u0 != null && n < u0.n()) {
            throw new c(s, true);
        }
        final org.joda.time.c v0 = this.v0;
        if (v0 != null && n >= v0.n()) {
            throw new c(s, false);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof c0)) {
            return false;
        }
        final c0 c0 = (c0)o;
        if (!this.Y().equals(c0.Y()) || !j.a(this.g0(), c0.g0()) || !j.a(this.h0(), c0.h0())) {
            b = false;
        }
        return b;
    }
    
    public org.joda.time.c g0() {
        return this.u0;
    }
    
    public org.joda.time.c h0() {
        return this.v0;
    }
    
    @Override
    public int hashCode() {
        final org.joda.time.c g0 = this.g0();
        int hashCode = 0;
        int hashCode2;
        if (g0 != null) {
            hashCode2 = this.g0().hashCode();
        }
        else {
            hashCode2 = 0;
        }
        if (this.h0() != null) {
            hashCode = this.h0().hashCode();
        }
        return hashCode2 + 317351877 + hashCode + this.Y().hashCode() * 7;
    }
    
    @Override
    public long p(final int n, final int n2, final int n3, final int n4) throws IllegalArgumentException {
        final long p4 = this.Y().p(n, n2, n3, n4);
        this.c0(p4, "resulting");
        return p4;
    }
    
    @Override
    public long q(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) throws IllegalArgumentException {
        final long q = this.Y().q(n, n2, n3, n4, n5, n6, n7);
        this.c0(q, "resulting");
        return q;
    }
    
    @Override
    public long r(long r, final int n, final int n2, final int n3, final int n4) throws IllegalArgumentException {
        this.c0(r, null);
        r = this.Y().r(r, n, n2, n3, n4);
        this.c0(r, "resulting");
        return r;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LimitChronology[");
        sb.append(this.Y().toString());
        sb.append(", ");
        final org.joda.time.c g0 = this.g0();
        final String s = "NoLimit";
        String string;
        if (g0 == null) {
            string = "NoLimit";
        }
        else {
            string = this.g0().toString();
        }
        sb.append(string);
        sb.append(", ");
        String string2;
        if (this.h0() == null) {
            string2 = s;
        }
        else {
            string2 = this.h0().toString();
        }
        sb.append(string2);
        sb.append(']');
        return sb.toString();
    }
    
    private class a extends e
    {
        private static final long h = -2435306746995699312L;
        private final l d;
        private final l e;
        private final l f;
        
        a(final f f, final l d, final l e, final l f2) {
            super(f, f.J());
            this.d = d;
            this.e = e;
            this.f = f2;
        }
        
        @Override
        public int E(final long n) {
            c0.this.c0(n, null);
            return this.a0().E(n);
        }
        
        @Override
        public final l I() {
            return this.e;
        }
        
        @Override
        public boolean K(final long n) {
            c0.this.c0(n, null);
            return this.a0().K(n);
        }
        
        @Override
        public long N(long n) {
            c0.this.c0(n, null);
            n = this.a0().N(n);
            c0.this.c0(n, "resulting");
            return n;
        }
        
        @Override
        public long O(long o) {
            c0.this.c0(o, null);
            o = this.a0().O(o);
            c0.this.c0(o, "resulting");
            return o;
        }
        
        @Override
        public long P(long p) {
            c0.this.c0(p, null);
            p = this.a0().P(p);
            c0.this.c0(p, "resulting");
            return p;
        }
        
        @Override
        public long Q(long q) {
            c0.this.c0(q, null);
            q = this.a0().Q(q);
            c0.this.c0(q, "resulting");
            return q;
        }
        
        @Override
        public long R(long r) {
            c0.this.c0(r, null);
            r = this.a0().R(r);
            c0.this.c0(r, "resulting");
            return r;
        }
        
        @Override
        public long S(long s) {
            c0.this.c0(s, null);
            s = this.a0().S(s);
            c0.this.c0(s, "resulting");
            return s;
        }
        
        @Override
        public long T(long t, final int n) {
            c0.this.c0(t, null);
            t = this.a0().T(t, n);
            c0.this.c0(t, "resulting");
            return t;
        }
        
        @Override
        public long V(long v, final String s, final Locale locale) {
            c0.this.c0(v, null);
            v = this.a0().V(v, s, locale);
            c0.this.c0(v, "resulting");
            return v;
        }
        
        @Override
        public long a(long a, final int n) {
            c0.this.c0(a, null);
            a = this.a0().a(a, n);
            c0.this.c0(a, "resulting");
            return a;
        }
        
        @Override
        public long b(long b, final long n) {
            c0.this.c0(b, null);
            b = this.a0().b(b, n);
            c0.this.c0(b, "resulting");
            return b;
        }
        
        @Override
        public long d(long d, final int n) {
            c0.this.c0(d, null);
            d = this.a0().d(d, n);
            c0.this.c0(d, "resulting");
            return d;
        }
        
        @Override
        public int g(final long n) {
            c0.this.c0(n, null);
            return this.a0().g(n);
        }
        
        @Override
        public String j(final long n, final Locale locale) {
            c0.this.c0(n, null);
            return this.a0().j(n, locale);
        }
        
        @Override
        public String o(final long n, final Locale locale) {
            c0.this.c0(n, null);
            return this.a0().o(n, locale);
        }
        
        @Override
        public int r(final long n, final long n2) {
            c0.this.c0(n, "minuend");
            c0.this.c0(n2, "subtrahend");
            return this.a0().r(n, n2);
        }
        
        @Override
        public long s(final long n, final long n2) {
            c0.this.c0(n, "minuend");
            c0.this.c0(n2, "subtrahend");
            return this.a0().s(n, n2);
        }
        
        @Override
        public final l t() {
            return this.d;
        }
        
        @Override
        public int u(final long n) {
            c0.this.c0(n, null);
            return this.a0().u(n);
        }
        
        @Override
        public final l v() {
            return this.f;
        }
        
        @Override
        public int w(final Locale locale) {
            return this.a0().w(locale);
        }
        
        @Override
        public int x(final Locale locale) {
            return this.a0().x(locale);
        }
        
        @Override
        public int z(final long n) {
            c0.this.c0(n, null);
            return this.a0().z(n);
        }
    }
    
    private class b extends f
    {
        private static final long L = 8049297699408782284L;
        
        b(final l l) {
            super(l, l.m());
        }
        
        @Override
        public long b(long b, final int n) {
            c0.this.c0(b, null);
            b = this.I().b(b, n);
            c0.this.c0(b, "resulting");
            return b;
        }
        
        @Override
        public long d(long d, final long n) {
            c0.this.c0(d, null);
            d = this.I().d(d, n);
            c0.this.c0(d, "resulting");
            return d;
        }
        
        @Override
        public int f(final long n, final long n2) {
            c0.this.c0(n, "minuend");
            c0.this.c0(n2, "subtrahend");
            return this.I().f(n, n2);
        }
        
        @Override
        public long g(final long n, final long n2) {
            c0.this.c0(n, "minuend");
            c0.this.c0(n2, "subtrahend");
            return this.I().g(n, n2);
        }
        
        @Override
        public long i(final int n, final long n2) {
            c0.this.c0(n2, null);
            return this.I().i(n, n2);
        }
        
        @Override
        public long k(final long n, final long n2) {
            c0.this.c0(n2, null);
            return this.I().k(n, n2);
        }
        
        @Override
        public int s(final long n, final long n2) {
            c0.this.c0(n2, null);
            return this.I().s(n, n2);
        }
        
        @Override
        public long v(final long n, final long n2) {
            c0.this.c0(n2, null);
            return this.I().v(n, n2);
        }
    }
    
    private class c extends IllegalArgumentException
    {
        private static final long I = -5924689995607498581L;
        private final boolean G;
        
        c(final String s, final boolean g) {
            super(s);
            this.G = g;
        }
        
        @Override
        public String getMessage() {
            final StringBuffer sb = new StringBuffer(85);
            sb.append("The");
            final String message = super.getMessage();
            if (message != null) {
                sb.append(' ');
                sb.append(message);
            }
            sb.append(" instant is ");
            final org.joda.time.format.b n = org.joda.time.format.j.B().N(c0.this.Y());
            org.joda.time.c c;
            if (this.G) {
                sb.append("below the supported minimum of ");
                c = c0.this.g0();
            }
            else {
                sb.append("above the supported maximum of ");
                c = c0.this.h0();
            }
            n.E(sb, c.n());
            sb.append(" (");
            sb.append(c0.this.Y());
            sb.append(')');
            return sb.toString();
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("IllegalArgumentException: ");
            sb.append(this.getMessage());
            return sb.toString();
        }
    }
}
