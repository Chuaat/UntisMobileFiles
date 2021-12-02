// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import java.util.Collections;
import java.util.List;
import okio.p;
import okio.g0;
import java.util.LinkedHashMap;
import c6.h;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Arrays;
import c6.c;
import okio.o;
import java.util.Map;
import java.io.Closeable;

public abstract class m implements Closeable
{
    int G;
    int[] H;
    String[] I;
    int[] J;
    boolean K;
    boolean L;
    private Map<Class<?>, Object> M;
    
    m() {
        this.H = new int[32];
        this.I = new String[32];
        this.J = new int[32];
    }
    
    m(final m m) {
        this.G = m.G;
        this.H = m.H.clone();
        this.I = m.I.clone();
        this.J = m.J.clone();
        this.K = m.K;
        this.L = m.L;
    }
    
    @c6.c
    public static m t(final o o) {
        return new com.squareup.moshi.o(o);
    }
    
    final void C(final int n) {
        final int g = this.G;
        final int[] h = this.H;
        if (g == h.length) {
            if (g == 256) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Nesting too deep at ");
                sb.append(this.getPath());
                throw new j(sb.toString());
            }
            this.H = Arrays.copyOf(h, h.length * 2);
            final String[] i = this.I;
            this.I = Arrays.copyOf(i, i.length * 2);
            final int[] j = this.J;
            this.J = Arrays.copyOf(j, j.length * 2);
        }
        this.H[this.G++] = n;
    }
    
    public abstract void C1() throws IOException;
    
    @h
    public final Object D() throws IOException {
        switch (m$a.a[this.w().ordinal()]) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Expected a value but was ");
                sb.append(this.w());
                sb.append(" at path ");
                sb.append(this.getPath());
                throw new IllegalStateException(sb.toString());
            }
            case 6: {
                return this.q();
            }
            case 5: {
                return this.h();
            }
            case 4: {
                return this.j();
            }
            case 3: {
                return this.s();
            }
            case 2: {
                final v<String, Object> v = new v<String, Object>();
                this.b();
                while (this.f()) {
                    final String o = this.o();
                    final Object d = this.D();
                    final Object put = v.put(o, d);
                    if (put == null) {
                        continue;
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Map key '");
                    sb2.append(o);
                    sb2.append("' has multiple values at path ");
                    sb2.append(this.getPath());
                    sb2.append(": ");
                    sb2.append(put);
                    sb2.append(" and ");
                    sb2.append(d);
                    throw new j(sb2.toString());
                }
                this.d();
                return v;
            }
            case 1: {
                final ArrayList<Object> list = new ArrayList<Object>();
                this.a();
                while (this.f()) {
                    list.add(this.D());
                }
                this.c();
                return list;
            }
        }
    }
    
    @c6.c
    public abstract int F(final b p0) throws IOException;
    
    @c6.c
    public abstract int G(final b p0) throws IOException;
    
    public final void H(final boolean l) {
        this.L = l;
    }
    
    public final void J(final boolean k) {
        this.K = k;
    }
    
    public final <T> void K(final Class<T> clazz, final T t) {
        if (clazz.isAssignableFrom(t.getClass())) {
            if (this.M == null) {
                this.M = new LinkedHashMap<Class<?>, Object>();
            }
            this.M.put(clazz, t);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Tag value must be of type ");
        sb.append(clazz.getName());
        throw new IllegalArgumentException(sb.toString());
    }
    
    final k L(final String str) throws k {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" at path ");
        sb.append(this.getPath());
        throw new k(sb.toString());
    }
    
    @c6.c
    @h
    public final <T> T M(final Class<T> clazz) {
        final Map<Class<?>, Object> m = this.M;
        if (m == null) {
            return null;
        }
        return (T)m.get(clazz);
    }
    
    final j N(@h final Object obj, final Object o) {
        if (obj == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected ");
            sb.append(o);
            sb.append(" but was null at path ");
            sb.append(this.getPath());
            return new j(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected ");
        sb2.append(o);
        sb2.append(" but was ");
        sb2.append(obj);
        sb2.append(", a ");
        sb2.append(obj.getClass().getName());
        sb2.append(", at path ");
        sb2.append(this.getPath());
        return new j(sb2.toString());
    }
    
    public abstract void a() throws IOException;
    
    public abstract void b() throws IOException;
    
    public abstract void c() throws IOException;
    
    public abstract void d() throws IOException;
    
    @c6.c
    public final boolean e() {
        return this.L;
    }
    
    @c6.c
    public abstract boolean f() throws IOException;
    
    @c6.c
    public final boolean g() {
        return this.K;
    }
    
    @c6.c
    public final String getPath() {
        return n.a(this.G, this.H, this.I, this.J);
    }
    
    public abstract boolean h() throws IOException;
    
    public abstract double j() throws IOException;
    
    public abstract int k() throws IOException;
    
    public abstract long n() throws IOException;
    
    @c6.c
    public abstract String o() throws IOException;
    
    @h
    public abstract <T> T q() throws IOException;
    
    public abstract o r() throws IOException;
    
    public abstract String s() throws IOException;
    
    public abstract void skipValue() throws IOException;
    
    @c6.c
    public abstract c w() throws IOException;
    
    @c6.c
    public abstract m x();
    
    public abstract void y() throws IOException;
    
    public static final class b
    {
        final String[] a;
        final g0 b;
        
        private b(final String[] a, final g0 b) {
            this.a = a;
            this.b = b;
        }
        
        @c6.c
        public static b a(final String... array) {
            try {
                final p[] array2 = new p[array.length];
                final okio.m m = new okio.m();
                for (int i = 0; i < array.length; ++i) {
                    com.squareup.moshi.p.Z((okio.n)m, array[i]);
                    m.readByte();
                    array2[i] = m.D3();
                }
                return new b(array.clone(), g0.p(array2));
            }
            catch (IOException detailMessage) {
                throw new AssertionError((Object)detailMessage);
            }
        }
        
        public List<String> b() {
            return Collections.unmodifiableList((List<? extends String>)Arrays.asList((T[])this.a));
        }
    }
    
    public enum c
    {
        G, 
        H, 
        I, 
        J, 
        K, 
        L, 
        M, 
        N, 
        O, 
        P;
    }
}
