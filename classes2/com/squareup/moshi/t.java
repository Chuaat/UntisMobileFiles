// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import okio.p0;
import okio.o;
import java.io.IOException;
import c6.h;
import java.util.LinkedHashMap;
import c6.c;
import okio.n;
import java.util.Map;
import java.io.Flushable;
import java.io.Closeable;

public abstract class t implements Closeable, Flushable
{
    int G;
    int[] H;
    String[] I;
    int[] J;
    String K;
    boolean L;
    boolean M;
    boolean N;
    int O;
    private Map<Class<?>, Object> P;
    
    t() {
        this.G = 0;
        this.H = new int[32];
        this.I = new String[32];
        this.J = new int[32];
        this.O = -1;
    }
    
    @c
    public static t r(final n n) {
        return new p(n);
    }
    
    public final void C(final boolean l) {
        this.L = l;
    }
    
    public final void D(final boolean m) {
        this.M = m;
    }
    
    public final <T> void F(final Class<T> clazz, final T t) {
        if (clazz.isAssignableFrom(t.getClass())) {
            if (this.P == null) {
                this.P = new LinkedHashMap<Class<?>, Object>();
            }
            this.P.put(clazz, t);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Tag value must be of type ");
        sb.append(clazz.getName());
        throw new IllegalArgumentException(sb.toString());
    }
    
    @c
    @h
    public final <T> T G(final Class<T> clazz) {
        final Map<Class<?>, Object> p = this.P;
        if (p == null) {
            return null;
        }
        return (T)p.get(clazz);
    }
    
    public abstract t H(final double p0) throws IOException;
    
    public abstract t J(final long p0) throws IOException;
    
    public abstract t K(@h final Boolean p0) throws IOException;
    
    public abstract t L(@h final Number p0) throws IOException;
    
    public abstract t M(@h final String p0) throws IOException;
    
    public final t N(final o o) throws IOException {
        if (!this.N) {
            final n r = this.R();
            try {
                o.e5((p0)r);
                if (r != null) {
                    ((p0)r).close();
                }
                return this;
            }
            finally {
                if (r != null) {
                    try {
                        ((p0)r).close();
                    }
                    finally {
                        final Throwable exception;
                        ((Throwable)o).addSuppressed(exception);
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("BufferedSource cannot be used as a map key in JSON at path ");
        sb.append(this.getPath());
        throw new IllegalStateException(sb.toString());
    }
    
    public abstract t Q(final boolean p0) throws IOException;
    
    @c
    public abstract n R() throws IOException;
    
    public abstract t a() throws IOException;
    
    @c
    public final int b() {
        final int s = this.s();
        if (s != 5 && s != 3 && s != 2 && s != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        final int o = this.O;
        this.O = this.G;
        return o;
    }
    
    public abstract t c() throws IOException;
    
    final boolean d() {
        final int g = this.G;
        final int[] h = this.H;
        if (g != h.length) {
            return false;
        }
        if (g != 256) {
            this.H = Arrays.copyOf(h, h.length * 2);
            final String[] i = this.I;
            this.I = Arrays.copyOf(i, i.length * 2);
            final int[] j = this.J;
            this.J = Arrays.copyOf(j, j.length * 2);
            if (this instanceof s) {
                final s s = (s)this;
                final Object[] q = s.Q;
                s.Q = Arrays.copyOf(q, q.length * 2);
            }
            return true;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Nesting too deep at ");
        sb.append(this.getPath());
        sb.append(": circular reference?");
        throw new j(sb.toString());
    }
    
    public abstract t e() throws IOException;
    
    public final void f(final int o) {
        this.O = o;
    }
    
    public abstract t g() throws IOException;
    
    @c
    public final String getPath() {
        return com.squareup.moshi.n.a(this.G, this.H, this.I, this.J);
    }
    
    @c
    public final String h() {
        String k = this.K;
        if (k == null) {
            k = "";
        }
        return k;
    }
    
    @c
    public final boolean j() {
        return this.M;
    }
    
    @c
    public final boolean k() {
        return this.L;
    }
    
    public final t n(@h Object key) throws IOException {
        if (key instanceof Map) {
            this.c();
            for (final Map.Entry<Object, V> entry : ((Map)key).entrySet()) {
                key = entry.getKey();
                if (!(key instanceof String)) {
                    String string;
                    if (key == null) {
                        string = "Map keys must be non-null";
                    }
                    else {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Map keys must be of type String: ");
                        sb.append(key.getClass().getName());
                        string = sb.toString();
                    }
                    throw new IllegalArgumentException(string);
                }
                this.o((String)key);
                this.n(entry.getValue());
            }
            this.g();
        }
        else if (key instanceof List) {
            this.a();
            final Iterator<Object> iterator2 = ((List)key).iterator();
            while (iterator2.hasNext()) {
                this.n(iterator2.next());
            }
            this.e();
        }
        else if (key instanceof String) {
            this.M((String)key);
        }
        else if (key instanceof Boolean) {
            this.Q((boolean)key);
        }
        else if (key instanceof Double) {
            this.H((double)key);
        }
        else if (key instanceof Long) {
            this.J((long)key);
        }
        else if (key instanceof Number) {
            this.L((Number)key);
        }
        else {
            if (key != null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Unsupported type: ");
                sb2.append(key.getClass().getName());
                throw new IllegalArgumentException(sb2.toString());
            }
            this.q();
        }
        return this;
    }
    
    public abstract t o(final String p0) throws IOException;
    
    public abstract t q() throws IOException;
    
    final int s() {
        final int g = this.G;
        if (g != 0) {
            return this.H[g - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }
    
    public final void t() throws IOException {
        final int s = this.s();
        if (s != 5 && s != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.N = true;
    }
    
    final void w(final int n) {
        this.H[this.G++] = n;
    }
    
    final void x(final int n) {
        this.H[this.G - 1] = n;
    }
    
    public void y(String k) {
        if (k.isEmpty()) {
            k = null;
        }
        this.K = k;
    }
}
