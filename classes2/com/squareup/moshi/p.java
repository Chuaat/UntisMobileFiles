// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import okio.d0;
import okio.t0;
import okio.m;
import okio.p0;
import c6.h;
import java.io.IOException;
import java.util.Objects;
import okio.n;

final class p extends t
{
    private static final String[] T;
    private final n Q;
    private String R;
    private String S;
    
    static {
        T = new String[128];
        for (int i = 0; i <= 31; ++i) {
            p.T[i] = String.format("\\u%04x", i);
        }
        final String[] t = p.T;
        t[34] = "\\\"";
        t[92] = "\\\\";
        t[9] = "\\t";
        t[8] = "\\b";
        t[10] = "\\n";
        t[13] = "\\r";
        t[12] = "\\f";
    }
    
    p(final n n) {
        this.R = ":";
        Objects.requireNonNull(n, "sink == null");
        this.Q = n;
        this.w(6);
    }
    
    private void T() throws IOException {
        final int s = this.s();
        if (s == 5) {
            this.Q.A(44);
        }
        else if (s != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.X();
        this.x(4);
    }
    
    private void V() throws IOException {
        final int s = this.s();
        final int n = 7;
        int n2 = 0;
        Label_0122: {
            if (s != 1) {
                if (s != 2) {
                    if (s == 4) {
                        n2 = 5;
                        this.Q.Q2(this.R);
                        break Label_0122;
                    }
                    if (s == 9) {
                        throw new IllegalStateException("Sink from valueSink() was not closed");
                    }
                    n2 = n;
                    if (s == 6) {
                        break Label_0122;
                    }
                    if (s != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (super.L) {
                        n2 = n;
                        break Label_0122;
                    }
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                else {
                    this.Q.A(44);
                }
            }
            this.X();
            n2 = 2;
        }
        this.x(n2);
    }
    
    private t W(int g, final int n, final char c) throws IOException {
        final int s = this.s();
        if (s != n && s != g) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.S != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Dangling name: ");
            sb.append(this.S);
            throw new IllegalStateException(sb.toString());
        }
        g = super.G;
        final int o = super.O;
        if (g == ~o) {
            super.O = ~o;
            return this;
        }
        --g;
        super.G = g;
        super.I[g] = null;
        final int[] j = super.J;
        --g;
        ++j[g];
        if (s == n) {
            this.X();
        }
        this.Q.A((int)c);
        return this;
    }
    
    private void X() throws IOException {
        if (super.K == null) {
            return;
        }
        this.Q.A(10);
        for (int g = super.G, i = 1; i < g; ++i) {
            this.Q.Q2(super.K);
        }
    }
    
    private t Y(final int n, final int n2, final char c) throws IOException {
        final int g = super.G;
        final int o = super.O;
        if (g == o) {
            final int[] h = super.H;
            if (h[g - 1] == n || h[g - 1] == n2) {
                super.O = ~o;
                return this;
            }
        }
        this.V();
        this.d();
        this.w(n);
        super.J[super.G - 1] = 0;
        this.Q.A((int)c);
        return this;
    }
    
    static void Z(final n n, final String s) throws IOException {
        final String[] t = p.T;
        n.A(34);
        final int length = s.length();
        int i = 0;
        int n2 = 0;
        while (i < length) {
            final char char1 = s.charAt(i);
            int n3 = 0;
            Label_0133: {
                String s2;
                if (char1 < '\u0080') {
                    if ((s2 = t[char1]) == null) {
                        n3 = n2;
                        break Label_0133;
                    }
                }
                else if (char1 == '\u2028') {
                    s2 = "\\u2028";
                }
                else {
                    n3 = n2;
                    if (char1 != '\u2029') {
                        break Label_0133;
                    }
                    s2 = "\\u2029";
                }
                if (n2 < i) {
                    n.v3(s, n2, i);
                }
                n.Q2(s2);
                n3 = i + 1;
            }
            ++i;
            n2 = n3;
        }
        if (n2 < length) {
            n.v3(s, n2, length);
        }
        n.A(34);
    }
    
    private void a0() throws IOException {
        if (this.S != null) {
            this.T();
            Z(this.Q, this.S);
            this.S = null;
        }
    }
    
    @Override
    public t H(final double d) throws IOException {
        if (!super.L && (Double.isNaN(d) || Double.isInfinite(d))) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Numeric values must be finite, but was ");
            sb.append(d);
            throw new IllegalArgumentException(sb.toString());
        }
        if (super.N) {
            super.N = false;
            return this.o(Double.toString(d));
        }
        this.a0();
        this.V();
        this.Q.Q2(Double.toString(d));
        final int[] j = super.J;
        final int n = super.G - 1;
        ++j[n];
        return this;
    }
    
    @Override
    public t J(final long n) throws IOException {
        if (super.N) {
            super.N = false;
            return this.o(Long.toString(n));
        }
        this.a0();
        this.V();
        this.Q.Q2(Long.toString(n));
        final int[] j = super.J;
        final int n2 = super.G - 1;
        ++j[n2];
        return this;
    }
    
    @Override
    public t K(final Boolean b) throws IOException {
        if (b == null) {
            return this.q();
        }
        return this.Q(b);
    }
    
    @Override
    public t L(@h final Number obj) throws IOException {
        if (obj == null) {
            return this.q();
        }
        final String string = obj.toString();
        if (!super.L && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Numeric values must be finite, but was ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString());
        }
        if (super.N) {
            super.N = false;
            return this.o(string);
        }
        this.a0();
        this.V();
        this.Q.Q2(string);
        final int[] j = super.J;
        final int n = super.G - 1;
        ++j[n];
        return this;
    }
    
    @Override
    public t M(final String s) throws IOException {
        if (s == null) {
            return this.q();
        }
        if (super.N) {
            super.N = false;
            return this.o(s);
        }
        this.a0();
        this.V();
        Z(this.Q, s);
        final int[] j = super.J;
        final int n = super.G - 1;
        ++j[n];
        return this;
    }
    
    @Override
    public t Q(final boolean b) throws IOException {
        if (!super.N) {
            this.a0();
            this.V();
            final n q = this.Q;
            String s;
            if (b) {
                s = "true";
            }
            else {
                s = "false";
            }
            q.Q2(s);
            final int[] j = super.J;
            final int n = super.G - 1;
            ++j[n];
            return this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Boolean cannot be used as a map key in JSON at path ");
        sb.append(this.getPath());
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public n R() throws IOException {
        if (!super.N) {
            this.a0();
            this.V();
            this.w(9);
            return d0.c((p0)new p0() {
                public void close() {
                    if (p.this.s() == 9) {
                        final p g = p.this;
                        int g2 = g.G - 1;
                        g.G = g2;
                        final int[] j = g.J;
                        --g2;
                        ++j[g2];
                        return;
                    }
                    throw new AssertionError();
                }
                
                public void flush() throws IOException {
                    p.this.Q.flush();
                }
                
                public void t3(final m m, final long n) throws IOException {
                    ((p0)p.this.Q).t3(m, n);
                }
                
                public t0 timeout() {
                    return t0.d;
                }
            });
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("BufferedSink cannot be used as a map key in JSON at path ");
        sb.append(this.getPath());
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public t a() throws IOException {
        if (!super.N) {
            this.a0();
            return this.Y(1, 2, '[');
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Array cannot be used as a map key in JSON at path ");
        sb.append(this.getPath());
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public t c() throws IOException {
        if (!super.N) {
            this.a0();
            return this.Y(3, 5, '{');
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Object cannot be used as a map key in JSON at path ");
        sb.append(this.getPath());
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public void close() throws IOException {
        ((p0)this.Q).close();
        final int g = super.G;
        if (g <= 1 && (g != 1 || super.H[g - 1] == 7)) {
            super.G = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }
    
    @Override
    public t e() throws IOException {
        return this.W(1, 2, ']');
    }
    
    @Override
    public void flush() throws IOException {
        if (super.G != 0) {
            this.Q.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }
    
    @Override
    public t g() throws IOException {
        super.N = false;
        return this.W(3, 5, '}');
    }
    
    @Override
    public t o(final String s) throws IOException {
        Objects.requireNonNull(s, "name == null");
        if (super.G == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        final int s2 = this.s();
        if ((s2 == 3 || s2 == 5) && this.S == null && !super.N) {
            this.S = s;
            super.I[super.G - 1] = s;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }
    
    @Override
    public t q() throws IOException {
        if (!super.N) {
            if (this.S != null) {
                if (!super.M) {
                    this.S = null;
                    return this;
                }
                this.a0();
            }
            this.V();
            this.Q.Q2("null");
            final int[] j = super.J;
            final int n = super.G - 1;
            ++j[n];
            return this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("null cannot be used as a map key in JSON at path ");
        sb.append(this.getPath());
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public void y(String r) {
        super.y(r);
        if (!r.isEmpty()) {
            r = ": ";
        }
        else {
            r = ":";
        }
        this.R = r;
    }
}
