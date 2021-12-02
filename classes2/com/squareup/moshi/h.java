// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import java.lang.annotation.Annotation;
import java.util.Set;
import java.lang.reflect.Type;
import okio.n;
import com.squareup.moshi.internal.b;
import com.squareup.moshi.internal.a;
import java.util.Objects;
import okio.o;
import c6.c;
import java.io.IOException;

public abstract class h<T>
{
    @c
    public final h<T> a() {
        return new h<T>() {
            @c6.h
            @Override
            public T b(final m m) throws IOException {
                final boolean e = m.e();
                m.H(true);
                try {
                    return h.this.b(m);
                }
                finally {
                    m.H(e);
                }
            }
            
            @Override
            boolean g() {
                return h.this.g();
            }
            
            @Override
            public void m(final t t, @c6.h final T t2) throws IOException {
                h.this.m(t, t2);
            }
            
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append(h.this);
                sb.append(".failOnUnknown()");
                return sb.toString();
            }
        };
    }
    
    @c
    @c6.h
    public abstract T b(final m p0) throws IOException;
    
    @c
    @c6.h
    public final T c(final String s) throws IOException {
        final m t = m.t((o)new okio.m().p1(s));
        final T b = this.b(t);
        if (!this.g() && t.w() != m.c.P) {
            throw new j("JSON document was not fully consumed.");
        }
        return b;
    }
    
    @c
    @c6.h
    public final T d(final o o) throws IOException {
        return this.b(m.t(o));
    }
    
    @c
    @c6.h
    public final T e(@c6.h Object b) {
        final q q = new q(b);
        try {
            b = this.b(q);
            return (T)b;
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @c
    public h<T> f(final String obj) {
        Objects.requireNonNull(obj, "indent == null");
        return new h<T>() {
            @c6.h
            @Override
            public T b(final m m) throws IOException {
                return h.this.b(m);
            }
            
            @Override
            boolean g() {
                return h.this.g();
            }
            
            @Override
            public void m(final t t, @c6.h final T t2) throws IOException {
                final String h = t.h();
                t.y(obj);
                try {
                    com.squareup.moshi.h.this.m(t, t2);
                }
                finally {
                    t.y(h);
                }
            }
            
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append(h.this);
                sb.append(".indent(\"");
                sb.append(obj);
                sb.append("\")");
                return sb.toString();
            }
        };
    }
    
    boolean g() {
        return false;
    }
    
    @c
    public final h<T> h() {
        return new h<T>() {
            @c6.h
            @Override
            public T b(final m m) throws IOException {
                final boolean g = m.g();
                m.J(true);
                try {
                    return h.this.b(m);
                }
                finally {
                    m.J(g);
                }
            }
            
            @Override
            boolean g() {
                return true;
            }
            
            @Override
            public void m(final t t, @c6.h final T t2) throws IOException {
                final boolean k = t.k();
                t.C(true);
                try {
                    h.this.m(t, t2);
                }
                finally {
                    t.C(k);
                }
            }
            
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append(h.this);
                sb.append(".lenient()");
                return sb.toString();
            }
        };
    }
    
    @c
    public final h<T> i() {
        if (this instanceof a) {
            return this;
        }
        return new a<T>(this);
    }
    
    @c
    public final h<T> j() {
        if (this instanceof b) {
            return this;
        }
        return new b<T>(this);
    }
    
    @c
    public final h<T> k() {
        return new h<T>() {
            @c6.h
            @Override
            public T b(final m m) throws IOException {
                return h.this.b(m);
            }
            
            @Override
            boolean g() {
                return h.this.g();
            }
            
            @Override
            public void m(final t t, @c6.h final T t2) throws IOException {
                final boolean j = t.j();
                t.D(true);
                try {
                    h.this.m(t, t2);
                }
                finally {
                    t.D(j);
                }
            }
            
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append(h.this);
                sb.append(".serializeNulls()");
                return sb.toString();
            }
        };
    }
    
    @c
    public final String l(@c6.h final T t) {
        final okio.m m = new okio.m();
        try {
            this.n((n)m, t);
            return m.y4();
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    public abstract void m(final t p0, @c6.h final T p1) throws IOException;
    
    public final void n(final n n, @c6.h final T t) throws IOException {
        this.m(t.r(n), t);
    }
    
    @c
    @c6.h
    public final Object o(@c6.h final T t) {
        final s s = new s();
        try {
            this.m(s, t);
            return s.V();
        }
        catch (IOException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    public interface e
    {
        @c
        @c6.h
        h<?> a(final Type p0, final Set<? extends Annotation> p1, final x p2);
    }
}
