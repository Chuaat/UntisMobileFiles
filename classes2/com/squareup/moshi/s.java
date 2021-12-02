// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import java.util.Objects;
import java.util.ArrayList;
import okio.d0;
import okio.o;
import okio.p0;
import okio.u;
import okio.m;
import okio.n;
import java.math.BigDecimal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import c6.h;

final class s extends t
{
    Object[] Q;
    @h
    private String R;
    
    s() {
        this.Q = new Object[32];
        this.w(6);
    }
    
    private s T(@h final Object obj) {
        final int s = this.s();
        final int g = super.G;
        if (g == 1) {
            if (s != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            super.H[g - 1] = 7;
            this.Q[g - 1] = obj;
        }
        else {
            if (s == 3) {
                final String r = this.R;
                if (r != null) {
                    if (obj != null || super.M) {
                        final Object put = ((Map)this.Q[g - 1]).put(r, obj);
                        if (put != null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Map key '");
                            sb.append(this.R);
                            sb.append("' has multiple values at path ");
                            sb.append(this.getPath());
                            sb.append(": ");
                            sb.append(put);
                            sb.append(" and ");
                            sb.append(obj);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    this.R = null;
                    return this;
                }
            }
            if (s == 1) {
                ((List)this.Q[g - 1]).add(obj);
            }
            else {
                if (s == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                throw new IllegalStateException("Nesting problem.");
            }
        }
        return this;
    }
    
    @Override
    public t H(final double n) throws IOException {
        if (!super.L && (Double.isNaN(n) || n == Double.NEGATIVE_INFINITY || n == Double.POSITIVE_INFINITY)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Numeric values must be finite, but was ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        if (super.N) {
            super.N = false;
            return this.o(Double.toString(n));
        }
        this.T(n);
        final int[] j = super.J;
        final int n2 = super.G - 1;
        ++j[n2];
        return this;
    }
    
    @Override
    public t J(final long n) throws IOException {
        if (super.N) {
            super.N = false;
            return this.o(Long.toString(n));
        }
        this.T(n);
        final int[] j = super.J;
        final int n2 = super.G - 1;
        ++j[n2];
        return this;
    }
    
    @Override
    public t K(@h final Boolean b) throws IOException {
        if (!super.N) {
            this.T(b);
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
    public t L(@h final Number n) throws IOException {
        if (n instanceof Byte || n instanceof Short || n instanceof Integer || n instanceof Long) {
            return this.J(n.longValue());
        }
        if (n instanceof Float || n instanceof Double) {
            return this.H(n.doubleValue());
        }
        if (n == null) {
            return this.q();
        }
        BigDecimal bigDecimal;
        if (n instanceof BigDecimal) {
            bigDecimal = (BigDecimal)n;
        }
        else {
            bigDecimal = new BigDecimal(n.toString());
        }
        if (super.N) {
            super.N = false;
            return this.o(bigDecimal.toString());
        }
        this.T(bigDecimal);
        final int[] j = super.J;
        final int n2 = super.G - 1;
        ++j[n2];
        return this;
    }
    
    @Override
    public t M(@h final String s) throws IOException {
        if (super.N) {
            super.N = false;
            return this.o(s);
        }
        this.T(s);
        final int[] j = super.J;
        final int n = super.G - 1;
        ++j[n];
        return this;
    }
    
    @Override
    public t Q(final boolean b) throws IOException {
        if (!super.N) {
            this.T(b);
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
    public n R() {
        if (super.N) {
            final StringBuilder sb = new StringBuilder();
            sb.append("BufferedSink cannot be used as a map key in JSON at path ");
            sb.append(this.getPath());
            throw new IllegalStateException(sb.toString());
        }
        if (this.s() != 9) {
            this.w(9);
            final m m = new m();
            return d0.c((p0)new u(m) {
                public void close() throws IOException {
                    if (s.this.s() == 9) {
                        final s i = s.this;
                        final Object[] q = i.Q;
                        final int g = i.G;
                        if (q[g] == null) {
                            i.G = g - 1;
                            final Object d = com.squareup.moshi.m.t((o)m).D();
                            final s j = s.this;
                            final boolean m = j.M;
                            j.M = true;
                            try {
                                j.T(d);
                                final s k = s.this;
                                k.M = m;
                                final int[] l = k.J;
                                final int n = k.G - 1;
                                ++l[n];
                                return;
                            }
                            finally {
                                s.this.M = m;
                            }
                        }
                    }
                    throw new AssertionError();
                }
            });
        }
        throw new IllegalStateException("Sink from valueSink() was not closed");
    }
    
    public Object V() {
        final int g = super.G;
        if (g <= 1 && (g != 1 || super.H[g - 1] == 7)) {
            return this.Q[0];
        }
        throw new IllegalStateException("Incomplete document");
    }
    
    @Override
    public t a() throws IOException {
        if (super.N) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Array cannot be used as a map key in JSON at path ");
            sb.append(this.getPath());
            throw new IllegalStateException(sb.toString());
        }
        final int g = super.G;
        final int o = super.O;
        if (g == o && super.H[g - 1] == 1) {
            super.O = ~o;
            return this;
        }
        this.d();
        final ArrayList list = new ArrayList();
        this.T(list);
        final Object[] q = this.Q;
        final int g2 = super.G;
        q[g2] = list;
        super.J[g2] = 0;
        this.w(1);
        return this;
    }
    
    @Override
    public t c() throws IOException {
        if (super.N) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Object cannot be used as a map key in JSON at path ");
            sb.append(this.getPath());
            throw new IllegalStateException(sb.toString());
        }
        final int g = super.G;
        final int o = super.O;
        if (g == o && super.H[g - 1] == 3) {
            super.O = ~o;
            return this;
        }
        this.d();
        final v v = new v();
        this.T(v);
        this.Q[super.G] = v;
        this.w(3);
        return this;
    }
    
    @Override
    public void close() throws IOException {
        final int g = super.G;
        if (g <= 1 && (g != 1 || super.H[g - 1] == 7)) {
            super.G = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }
    
    @Override
    public t e() throws IOException {
        if (this.s() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int g = super.G;
        final int o = super.O;
        if (g == ~o) {
            super.O = ~o;
            return this;
        }
        --g;
        super.G = g;
        this.Q[g] = null;
        final int[] j = super.J;
        --g;
        ++j[g];
        return this;
    }
    
    @Override
    public void flush() throws IOException {
        if (super.G != 0) {
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }
    
    @Override
    public t g() throws IOException {
        if (this.s() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.R != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Dangling name: ");
            sb.append(this.R);
            throw new IllegalStateException(sb.toString());
        }
        final int g = super.G;
        final int o = super.O;
        if (g == ~o) {
            super.O = ~o;
            return this;
        }
        super.N = false;
        int g2 = g - 1;
        super.G = g2;
        this.Q[g2] = null;
        super.I[g2] = null;
        final int[] j = super.J;
        --g2;
        ++j[g2];
        return this;
    }
    
    @Override
    public t o(final String s) throws IOException {
        Objects.requireNonNull(s, "name == null");
        if (super.G == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (this.s() == 3 && this.R == null && !super.N) {
            this.R = s;
            super.I[super.G - 1] = s;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }
    
    @Override
    public t q() throws IOException {
        if (!super.N) {
            this.T(null);
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
}
