// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import okio.n;
import okio.o;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import c6.h;
import java.io.IOException;
import java.util.Iterator;
import java.util.Arrays;

final class q extends m
{
    private static final Object O;
    private Object[] N;
    
    static {
        O = new Object();
    }
    
    q(final q q) {
        super(q);
        this.N = q.N.clone();
        for (int i = 0; i < super.G; ++i) {
            final Object[] n = this.N;
            if (n[i] instanceof a) {
                n[i] = ((a)n[i]).a();
            }
        }
    }
    
    q(final Object o) {
        final int[] h = super.H;
        final int g = super.G;
        h[g] = 7;
        final Object[] n = new Object[32];
        this.N = n;
        super.G = g + 1;
        n[g] = o;
    }
    
    private void Q(final Object o) {
        final int g = super.G;
        if (g == this.N.length) {
            if (g == 256) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Nesting too deep at ");
                sb.append(this.getPath());
                throw new j(sb.toString());
            }
            final int[] h = super.H;
            super.H = Arrays.copyOf(h, h.length * 2);
            final String[] i = super.I;
            super.I = Arrays.copyOf(i, i.length * 2);
            final int[] j = super.J;
            super.J = Arrays.copyOf(j, j.length * 2);
            final Object[] n = this.N;
            this.N = Arrays.copyOf(n, n.length * 2);
        }
        this.N[super.G++] = o;
    }
    
    private void R() {
        final int g = super.G - 1;
        super.G = g;
        final Object[] n = this.N;
        n[g] = null;
        super.H[g] = 0;
        if (g > 0) {
            final int[] j = super.J;
            final int n2 = g - 1;
            ++j[n2];
            final Object o = n[g - 1];
            if (o instanceof Iterator) {
                final Iterator<Object> iterator = (Iterator<Object>)o;
                if (iterator.hasNext()) {
                    this.Q(iterator.next());
                }
            }
        }
    }
    
    @h
    private <T> T S(final Class<T> clazz, final c c) throws IOException {
        final int g = super.G;
        Object obj;
        if (g != 0) {
            obj = this.N[g - 1];
        }
        else {
            obj = null;
        }
        if (clazz.isInstance(obj)) {
            return clazz.cast(obj);
        }
        if (obj == null && c == m.c.O) {
            return null;
        }
        if (obj == q.O) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw this.N(obj, c);
    }
    
    private String T(final Map.Entry<?, ?> entry) {
        final Object key = entry.getKey();
        if (key instanceof String) {
            return (String)key;
        }
        throw this.N(key, c.K);
    }
    
    @Override
    public void C1() throws IOException {
        if (!super.L) {
            this.N[super.G - 1] = this.S((Class<Map.Entry<K, Object>>)Map.Entry.class, c.K).getValue();
            super.I[super.G - 2] = "null";
            return;
        }
        final c w = this.w();
        this.o();
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot skip unexpected ");
        sb.append(w);
        sb.append(" at ");
        sb.append(this.getPath());
        throw new j(sb.toString());
    }
    
    @Override
    public int F(final b b) throws IOException {
        final Map.Entry<K, Object> entry = this.S((Class<Map.Entry<K, Object>>)Map.Entry.class, c.K);
        final String t = this.T((Map.Entry<?, ?>)entry);
        for (int length = b.a.length, i = 0; i < length; ++i) {
            if (b.a[i].equals(t)) {
                this.N[super.G - 1] = entry.getValue();
                super.I[super.G - 2] = t;
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public int G(final b b) throws IOException {
        final int g = super.G;
        Object o;
        if (g != 0) {
            o = this.N[g - 1];
        }
        else {
            o = null;
        }
        if (o instanceof String) {
            final String anObject = (String)o;
            for (int i = 0; i < b.a.length; ++i) {
                if (b.a[i].equals(anObject)) {
                    this.R();
                    return i;
                }
            }
            return -1;
        }
        if (o != q.O) {
            return -1;
        }
        throw new IllegalStateException("JsonReader is closed");
    }
    
    @Override
    public void a() throws IOException {
        final List list = this.S(List.class, c.G);
        final a a = new a(c.H, list.toArray(new Object[list.size()]), 0);
        final Object[] n = this.N;
        final int g = super.G;
        n[g - 1] = a;
        super.H[g - 1] = 1;
        super.J[g - 1] = 0;
        if (a.hasNext()) {
            this.Q(a.next());
        }
    }
    
    @Override
    public void b() throws IOException {
        final Map map = this.S(Map.class, c.I);
        final a a = new a(c.J, map.entrySet().toArray(new Object[map.size()]), 0);
        final Object[] n = this.N;
        final int g = super.G;
        n[g - 1] = a;
        super.H[g - 1] = 3;
        if (a.hasNext()) {
            this.Q(a.next());
        }
    }
    
    @Override
    public void c() throws IOException {
        final c h = c.H;
        final a a = this.S(a.class, h);
        if (a.G == h && !a.hasNext()) {
            this.R();
            return;
        }
        throw this.N(a, h);
    }
    
    @Override
    public void close() throws IOException {
        Arrays.fill(this.N, 0, super.G, null);
        this.N[0] = q.O;
        super.H[0] = 8;
        super.G = 1;
    }
    
    @Override
    public void d() throws IOException {
        final c j = c.J;
        final a a = this.S(a.class, j);
        if (a.G == j && !a.hasNext()) {
            super.I[super.G - 1] = null;
            this.R();
            return;
        }
        throw this.N(a, j);
    }
    
    @Override
    public boolean f() throws IOException {
        final int g = super.G;
        boolean b = false;
        if (g == 0) {
            return false;
        }
        final Object o = this.N[g - 1];
        if (!(o instanceof Iterator) || ((Iterator)o).hasNext()) {
            b = true;
        }
        return b;
    }
    
    @Override
    public boolean h() throws IOException {
        final Boolean b = this.S(Boolean.class, c.N);
        this.R();
        return b;
    }
    
    @Override
    public double j() throws IOException {
        final c m = c.M;
        Serializable s = this.S((Class<Number>)Object.class, m);
        Label_0045: {
            if (s instanceof Number) {
                final double d = ((Number)s).doubleValue();
                break Label_0045;
            }
            if (!(s instanceof String)) {
                throw this.N(s, m);
            }
            try {
                final double d = Double.parseDouble((String)s);
                if (!super.K && (Double.isNaN(d) || Double.isInfinite(d))) {
                    s = new StringBuilder();
                    ((StringBuilder)s).append("JSON forbids NaN and infinities: ");
                    ((StringBuilder)s).append(d);
                    ((StringBuilder)s).append(" at path ");
                    ((StringBuilder)s).append(this.getPath());
                    throw new k(((StringBuilder)s).toString());
                }
                this.R();
                return d;
            }
            catch (NumberFormatException ex) {
                throw this.N(s, c.M);
            }
        }
        throw this.N(s, m);
    }
    
    @Override
    public int k() throws IOException {
        final c m = c.M;
        final Number s = this.S((Class<Number>)Object.class, m);
        Label_0066: {
            if (s instanceof Number) {
                final int n = s.intValue();
                break Label_0066;
            }
            if (!(s instanceof String)) {
                throw this.N(s, m);
            }
            try {
                final int n = Integer.parseInt((String)s);
                break Label_0066;
            }
            catch (NumberFormatException ex) {
                final BigDecimal bigDecimal = new(java.math.BigDecimal.class);
                final BigDecimal bigDecimal3;
                final BigDecimal bigDecimal2 = bigDecimal3 = bigDecimal;
                final String s2 = (String)s;
                final String s3 = s2;
                new BigDecimal(s3);
                final BigDecimal bigDecimal4 = bigDecimal2;
                final int n;
                final int n2 = n = bigDecimal4.intValueExact();
            }
            try {
                final BigDecimal bigDecimal = new(java.math.BigDecimal.class);
                final BigDecimal bigDecimal3;
                final BigDecimal bigDecimal2 = bigDecimal3 = bigDecimal;
                final String s2 = (String)s;
                final String s3 = s2;
                new BigDecimal(s3);
                final BigDecimal bigDecimal4 = bigDecimal2;
                final int n = bigDecimal4.intValueExact();
                this.R();
                return n;
            }
            catch (NumberFormatException ex2) {
                throw this.N(s, c.M);
            }
        }
        throw this.N(s, m);
    }
    
    @Override
    public long n() throws IOException {
        final c m = c.M;
        final Number s = this.S((Class<Number>)Object.class, m);
        Label_0066: {
            if (s instanceof Number) {
                final long n = s.longValue();
                break Label_0066;
            }
            if (!(s instanceof String)) {
                throw this.N(s, m);
            }
            try {
                final long n = Long.parseLong((String)s);
                break Label_0066;
            }
            catch (NumberFormatException ex) {
                final BigDecimal bigDecimal = new(java.math.BigDecimal.class);
                final BigDecimal bigDecimal3;
                final BigDecimal bigDecimal2 = bigDecimal3 = bigDecimal;
                final String s2 = (String)s;
                final String s3 = s2;
                new BigDecimal(s3);
                final BigDecimal bigDecimal4 = bigDecimal2;
                final long n;
                final long n2 = n = bigDecimal4.longValueExact();
            }
            try {
                final BigDecimal bigDecimal = new(java.math.BigDecimal.class);
                final BigDecimal bigDecimal3;
                final BigDecimal bigDecimal2 = bigDecimal3 = bigDecimal;
                final String s2 = (String)s;
                final String s3 = s2;
                new BigDecimal(s3);
                final BigDecimal bigDecimal4 = bigDecimal2;
                final long n = bigDecimal4.longValueExact();
                this.R();
                return n;
            }
            catch (NumberFormatException ex2) {
                throw this.N(s, c.M);
            }
        }
        throw this.N(s, m);
    }
    
    @Override
    public String o() throws IOException {
        final Map.Entry<K, Object> entry = this.S((Class<Map.Entry<K, Object>>)Map.Entry.class, c.K);
        final String t = this.T((Map.Entry<?, ?>)entry);
        this.N[super.G - 1] = entry.getValue();
        return super.I[super.G - 2] = t;
    }
    
    @h
    @Override
    public <T> T q() throws IOException {
        this.S(Void.class, c.O);
        this.R();
        return null;
    }
    
    @Override
    public o r() throws IOException {
        final Object d = this.D();
        final okio.m m = new okio.m();
        final t r = t.r((n)m);
        try {
            r.n(d);
            r.close();
            return (o)m;
        }
        finally {
            if (r != null) {
                try {
                    r.close();
                }
                finally {
                    final Throwable t;
                    final Throwable exception;
                    t.addSuppressed(exception);
                }
            }
        }
    }
    
    @Override
    public String s() throws IOException {
        final int g = super.G;
        Object o;
        if (g != 0) {
            o = this.N[g - 1];
        }
        else {
            o = null;
        }
        if (o instanceof String) {
            this.R();
            return (String)o;
        }
        if (o instanceof Number) {
            this.R();
            return o.toString();
        }
        if (o == q.O) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw this.N(o, c.L);
    }
    
    @Override
    public void skipValue() throws IOException {
        if (super.L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot skip unexpected ");
            sb.append(this.w());
            sb.append(" at ");
            sb.append(this.getPath());
            throw new j(sb.toString());
        }
        final int g = super.G;
        if (g > 1) {
            super.I[g - 2] = "null";
        }
        Object o;
        if (g != 0) {
            o = this.N[g - 1];
        }
        else {
            o = null;
        }
        if (!(o instanceof a)) {
            if (o instanceof Map.Entry) {
                final Object[] n = this.N;
                n[g - 1] = ((Map.Entry)n[g - 1]).getValue();
            }
            else {
                if (g <= 0) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Expected a value but was ");
                    sb2.append(this.w());
                    sb2.append(" at path ");
                    sb2.append(this.getPath());
                    throw new j(sb2.toString());
                }
                this.R();
            }
            return;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("Expected a value but was ");
        sb3.append(this.w());
        sb3.append(" at path ");
        sb3.append(this.getPath());
        throw new j(sb3.toString());
    }
    
    @Override
    public c w() throws IOException {
        final int g = super.G;
        if (g == 0) {
            return c.P;
        }
        final Object o = this.N[g - 1];
        if (o instanceof a) {
            return ((a)o).G;
        }
        if (o instanceof List) {
            return c.G;
        }
        if (o instanceof Map) {
            return c.I;
        }
        if (o instanceof Map.Entry) {
            return c.K;
        }
        if (o instanceof String) {
            return c.L;
        }
        if (o instanceof Boolean) {
            return c.N;
        }
        if (o instanceof Number) {
            return c.M;
        }
        if (o == null) {
            return c.O;
        }
        if (o == q.O) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw this.N(o, "a JSON value");
    }
    
    @Override
    public m x() {
        return new q(this);
    }
    
    @Override
    public void y() throws IOException {
        if (this.f()) {
            this.Q(this.o());
        }
    }
    
    static final class a implements Iterator<Object>, Cloneable
    {
        final c G;
        final Object[] H;
        int I;
        
        a(final c g, final Object[] h, final int i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        protected a a() {
            return new a(this.G, this.H, this.I);
        }
        
        @Override
        public boolean hasNext() {
            return this.I < this.H.length;
        }
        
        @Override
        public Object next() {
            return this.H[this.I++];
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
