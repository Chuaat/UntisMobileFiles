// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import java.util.Collection;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.Objects;
import java.io.IOException;
import com.squareup.moshi.internal.c;
import java.lang.annotation.Annotation;
import java.util.Set;
import java.lang.reflect.Type;

final class y
{
    public static final h.e a;
    private static final String b = "Expected %s but was %s at path %s";
    static final h<Boolean> c;
    static final h<Byte> d;
    static final h<Character> e;
    static final h<Double> f;
    static final h<Float> g;
    static final h<Integer> h;
    static final h<Long> i;
    static final h<Short> j;
    static final h<String> k;
    
    static {
        a = new h.e() {
            @Override
            public h<?> a(final Type type, final Set<? extends Annotation> set, final x x) {
                if (!set.isEmpty()) {
                    return null;
                }
                if (type == Boolean.TYPE) {
                    return y.c;
                }
                if (type == Byte.TYPE) {
                    return y.d;
                }
                if (type == Character.TYPE) {
                    return y.e;
                }
                if (type == Double.TYPE) {
                    return y.f;
                }
                if (type == Float.TYPE) {
                    return y.g;
                }
                if (type == Integer.TYPE) {
                    return y.h;
                }
                if (type == Long.TYPE) {
                    return y.i;
                }
                if (type == Short.TYPE) {
                    return y.j;
                }
                Object o;
                if (type == Boolean.class) {
                    o = y.c;
                }
                else if (type == Byte.class) {
                    o = y.d;
                }
                else if (type == Character.class) {
                    o = y.e;
                }
                else if (type == Double.class) {
                    o = y.f;
                }
                else if (type == Float.class) {
                    o = y.g;
                }
                else if (type == Integer.class) {
                    o = y.h;
                }
                else if (type == Long.class) {
                    o = y.i;
                }
                else if (type == Short.class) {
                    o = y.j;
                }
                else if (type == String.class) {
                    o = y.k;
                }
                else if (type == Object.class) {
                    o = new m(x);
                }
                else {
                    final Class<?> j = a0.j(type);
                    final h<?> f = com.squareup.moshi.internal.c.f(x, type, j);
                    if (f != null) {
                        return f;
                    }
                    if (!j.isEnum()) {
                        return null;
                    }
                    o = new l<Object>((Class<Enum>)j);
                }
                return ((h<?>)o).j();
            }
        };
        c = new h<Boolean>() {
            public Boolean p(final com.squareup.moshi.m m) throws IOException {
                return m.h();
            }
            
            public void q(final t t, final Boolean b) throws IOException {
                t.Q(b);
            }
            
            @Override
            public String toString() {
                return "JsonAdapter(Boolean)";
            }
        };
        d = new h<Byte>() {
            public Byte p(final com.squareup.moshi.m m) throws IOException {
                return (byte)y.a(m, "a byte", -128, 255);
            }
            
            public void q(final t t, final Byte b) throws IOException {
                t.J(b & 0xFF);
            }
            
            @Override
            public String toString() {
                return "JsonAdapter(Byte)";
            }
        };
        e = new h<Character>() {
            public Character p(final com.squareup.moshi.m m) throws IOException {
                final String s = m.s();
                if (s.length() <= 1) {
                    return s.charAt(0);
                }
                final StringBuilder sb = new StringBuilder();
                sb.append('\"');
                sb.append(s);
                sb.append('\"');
                throw new j(String.format("Expected %s but was %s at path %s", "a char", sb.toString(), m.getPath()));
            }
            
            public void q(final t t, final Character c) throws IOException {
                t.M(c.toString());
            }
            
            @Override
            public String toString() {
                return "JsonAdapter(Character)";
            }
        };
        f = new h<Double>() {
            public Double p(final com.squareup.moshi.m m) throws IOException {
                return m.j();
            }
            
            public void q(final t t, final Double n) throws IOException {
                t.H(n);
            }
            
            @Override
            public String toString() {
                return "JsonAdapter(Double)";
            }
        };
        g = new h<Float>() {
            public Float p(final com.squareup.moshi.m m) throws IOException {
                final float f = (float)m.j();
                if (!m.g() && Float.isInfinite(f)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("JSON forbids NaN and infinities: ");
                    sb.append(f);
                    sb.append(" at path ");
                    sb.append(m.getPath());
                    throw new j(sb.toString());
                }
                return f;
            }
            
            public void q(final t t, final Float obj) throws IOException {
                Objects.requireNonNull(obj);
                t.L(obj);
            }
            
            @Override
            public String toString() {
                return "JsonAdapter(Float)";
            }
        };
        h = new h<Integer>() {
            public Integer p(final com.squareup.moshi.m m) throws IOException {
                return m.k();
            }
            
            public void q(final t t, final Integer n) throws IOException {
                t.J(n);
            }
            
            @Override
            public String toString() {
                return "JsonAdapter(Integer)";
            }
        };
        i = new h<Long>() {
            public Long p(final com.squareup.moshi.m m) throws IOException {
                return m.n();
            }
            
            public void q(final t t, final Long n) throws IOException {
                t.J(n);
            }
            
            @Override
            public String toString() {
                return "JsonAdapter(Long)";
            }
        };
        j = new h<Short>() {
            public Short p(final com.squareup.moshi.m m) throws IOException {
                return (short)y.a(m, "a short", -32768, 32767);
            }
            
            public void q(final t t, final Short n) throws IOException {
                t.J(n);
            }
            
            @Override
            public String toString() {
                return "JsonAdapter(Short)";
            }
        };
        k = new h<String>() {
            public String p(final com.squareup.moshi.m m) throws IOException {
                return m.s();
            }
            
            public void q(final t t, final String s) throws IOException {
                t.M(s);
            }
            
            @Override
            public String toString() {
                return "JsonAdapter(String)";
            }
        };
    }
    
    private y() {
    }
    
    static int a(final com.squareup.moshi.m m, final String s, final int n, final int n2) throws IOException {
        final int k = m.k();
        if (k >= n && k <= n2) {
            return k;
        }
        throw new j(String.format("Expected %s but was %s at path %s", s, k, m.getPath()));
    }
    
    static final class l<T extends Enum<T>> extends h<T>
    {
        private final Class<T> a;
        private final String[] b;
        private final T[] c;
        private final com.squareup.moshi.m.b d;
        
        l(final Class<T> a) {
            this.a = a;
            try {
                final T[] c = a.getEnumConstants();
                this.c = c;
                this.b = new String[c.length];
                int n = 0;
                while (true) {
                    final T[] c2 = this.c;
                    if (n >= c2.length) {
                        break;
                    }
                    final Enum<T> enum1 = c2[n];
                    final g g = a.getField(enum1.name()).getAnnotation(g.class);
                    String s;
                    if (g != null) {
                        s = g.name();
                    }
                    else {
                        s = enum1.name();
                    }
                    this.b[n] = s;
                    ++n;
                }
                this.d = com.squareup.moshi.m.b.a(this.b);
            }
            catch (NoSuchFieldException cause) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Missing field in ");
                sb.append(a.getName());
                throw new AssertionError(sb.toString(), cause);
            }
        }
        
        public T p(final com.squareup.moshi.m m) throws IOException {
            final int g = m.G(this.d);
            if (g != -1) {
                return this.c[g];
            }
            final String path = m.getPath();
            final String s = m.s();
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected one of ");
            sb.append(Arrays.asList(this.b));
            sb.append(" but was ");
            sb.append(s);
            sb.append(" at path ");
            sb.append(path);
            throw new j(sb.toString());
        }
        
        public void q(final t t, final T t2) throws IOException {
            t.M(this.b[t2.ordinal()]);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("JsonAdapter(");
            sb.append(this.a.getName());
            sb.append(")");
            return sb.toString();
        }
    }
    
    static final class m extends h<Object>
    {
        private final x a;
        private final h<List> b;
        private final h<Map> c;
        private final h<String> d;
        private final h<Double> e;
        private final h<Boolean> f;
        
        m(final x a) {
            this.a = a;
            this.b = (h<List>)a.c(List.class);
            this.c = (h<Map>)a.c(Map.class);
            this.d = a.c(String.class);
            this.e = a.c(Double.class);
            this.f = a.c(Boolean.class);
        }
        
        private Class<?> p(final Class<?> clazz) {
            if (Map.class.isAssignableFrom(clazz)) {
                return Map.class;
            }
            Class<?> clazz2 = clazz;
            if (Collection.class.isAssignableFrom(clazz)) {
                clazz2 = Collection.class;
            }
            return clazz2;
        }
        
        @Override
        public Object b(final com.squareup.moshi.m m) throws IOException {
            Object o = null;
            switch (y$b.a[m.w().ordinal()]) {
                default: {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Expected a value but was ");
                    sb.append(m.w());
                    sb.append(" at path ");
                    sb.append(m.getPath());
                    throw new IllegalStateException(sb.toString());
                }
                case 6: {
                    return m.q();
                }
                case 5: {
                    o = this.f;
                    break;
                }
                case 4: {
                    o = this.e;
                    break;
                }
                case 3: {
                    o = this.d;
                    break;
                }
                case 2: {
                    o = this.c;
                    break;
                }
                case 1: {
                    o = this.b;
                    break;
                }
            }
            return ((h<Object>)o).b(m);
        }
        
        @Override
        public void m(final t t, final Object o) throws IOException {
            final Class<?> class1 = o.getClass();
            if (class1 == Object.class) {
                t.c();
                t.g();
            }
            else {
                this.a.f(this.p(class1), com.squareup.moshi.internal.c.a).m(t, o);
            }
        }
        
        @Override
        public String toString() {
            return "JsonAdapter(Object)";
        }
    }
}
