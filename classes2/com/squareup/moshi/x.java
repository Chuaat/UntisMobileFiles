// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import java.util.Iterator;
import java.util.ArrayDeque;
import java.util.Deque;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Objects;
import com.squareup.moshi.internal.c;
import java.util.Arrays;
import java.lang.annotation.Annotation;
import java.util.Set;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public final class x
{
    static final List<h.e> e;
    private final List<h.e> a;
    private final int b;
    private final ThreadLocal<e> c;
    private final Map<Object, h<?>> d;
    
    static {
        final ArrayList<h.e> e2 = new ArrayList<h.e>(5);
        (e = e2).add(y.a);
        e2.add(com.squareup.moshi.e.b);
        e2.add(w.c);
        e2.add(b.c);
        e2.add(com.squareup.moshi.d.d);
    }
    
    x(final c c) {
        this.c = new ThreadLocal<e>();
        this.d = new LinkedHashMap<Object, h<?>>();
        final int size = c.a.size();
        final List<h.e> e = x.e;
        final ArrayList list = new ArrayList<Object>(size + e.size());
        list.addAll((Collection<?>)c.a);
        list.addAll((Collection<?>)e);
        this.a = Collections.unmodifiableList((List<? extends h.e>)list);
        this.b = c.b;
    }
    
    private Object i(final Type type, final Set<? extends Annotation> set) {
        if (set.isEmpty()) {
            return type;
        }
        return Arrays.asList(type, set);
    }
    
    static <T> h.e j(final Type type, final h<T> h) {
        if (type == null) {
            throw new IllegalArgumentException("type == null");
        }
        if (h != null) {
            return new h.e() {
                @c6.h
                @Override
                public h<?> a(final Type type, final Set<? extends Annotation> set, final x x) {
                    h<?> b;
                    if (set.isEmpty() && com.squareup.moshi.internal.c.y(type, type)) {
                        b = h;
                    }
                    else {
                        b = null;
                    }
                    return b;
                }
            };
        }
        throw new IllegalArgumentException("jsonAdapter == null");
    }
    
    static <T> h.e k(final Type type, final Class<? extends Annotation> obj, final h<T> h) {
        if (type == null) {
            throw new IllegalArgumentException("type == null");
        }
        if (obj == null) {
            throw new IllegalArgumentException("annotation == null");
        }
        if (h == null) {
            throw new IllegalArgumentException("jsonAdapter == null");
        }
        if (!obj.isAnnotationPresent(l.class)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(" does not have @JsonQualifier");
            throw new IllegalArgumentException(sb.toString());
        }
        if (obj.getDeclaredMethods().length <= 0) {
            return new h.e() {
                @c6.h
                @Override
                public h<?> a(final Type type, final Set<? extends Annotation> set, final x x) {
                    if (com.squareup.moshi.internal.c.y(type, type) && set.size() == 1 && com.squareup.moshi.internal.c.k(set, obj)) {
                        return h;
                    }
                    return null;
                }
            };
        }
        throw new IllegalArgumentException("Use JsonAdapter.Factory for annotations with elements");
    }
    
    @c6.c
    public <T> h<T> c(final Class<T> clazz) {
        return this.f(clazz, com.squareup.moshi.internal.c.a);
    }
    
    @c6.c
    public <T> h<T> d(final Type type) {
        return this.f(type, com.squareup.moshi.internal.c.a);
    }
    
    @c6.c
    public <T> h<T> e(final Type type, final Class<? extends Annotation> obj) {
        Objects.requireNonNull(obj, "annotationType == null");
        return this.f(type, Collections.singleton((Annotation)a0.d((Class<T>)obj)));
    }
    
    @c6.c
    public <T> h<T> f(final Type type, final Set<? extends Annotation> set) {
        return this.g(type, set, null);
    }
    
    @c6.c
    public <T> h<T> g(Type d, final Set<? extends Annotation> obj, @c6.h final String s) {
        Objects.requireNonNull(d, "type == null");
        Objects.requireNonNull(obj, "annotations == null");
        final Type r = com.squareup.moshi.internal.c.r(com.squareup.moshi.internal.c.b(d));
        final Object i = this.i(r, obj);
        d = (Type)this.d;
        synchronized (d) {
            final h<?> h = this.d.get(i);
            if (h != null) {
                return (h<T>)h;
            }
            // monitorexit(d)
            if ((d = (Type)this.c.get()) == null) {
                d = (Type)new e();
                this.c.set((e)d);
            }
            final h<Object> d2 = ((e)d).d(r, s, i);
            if (d2 != null) {
                ((e)d).c(false);
                return (h<T>)d2;
            }
            try {
                for (int size = this.a.size(), j = 0; j < size; ++j) {
                    final h<?> a = this.a.get(j).a(r, obj, this);
                    if (a != null) {
                        ((e)d).a(a);
                        ((e)d).c(true);
                        return (h<T>)a;
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("No JsonAdapter for ");
                sb.append(com.squareup.moshi.internal.c.w(r, obj));
                throw new IllegalArgumentException(sb.toString());
            }
            catch (IllegalArgumentException ex) {
                throw ((e)d).b(ex);
            }
            ((e)d).c(false);
        }
    }
    
    @c6.c
    public <T> h<T> h(final Type type, final Class<? extends Annotation>... array) {
        final int length = array.length;
        int i = 0;
        if (length == 1) {
            return this.e(type, array[0]);
        }
        final LinkedHashSet<Object> s = new LinkedHashSet<Object>(array.length);
        while (i < array.length) {
            s.add(a0.d((Class<Object>)array[i]));
            ++i;
        }
        return (h<T>)this.f(type, Collections.unmodifiableSet((Set<? extends Annotation>)s));
    }
    
    @c6.c
    public c l() {
        final c c = new c();
        for (int b = this.b, i = 0; i < b; ++i) {
            c.a(this.a.get(i));
        }
        for (int j = this.b; j < this.a.size() - x.e.size(); ++j) {
            c.e(this.a.get(j));
        }
        return c;
    }
    
    @c6.c
    public <T> h<T> m(final h.e obj, Type r, final Set<? extends Annotation> obj2) {
        Objects.requireNonNull(obj2, "annotations == null");
        r = com.squareup.moshi.internal.c.r(com.squareup.moshi.internal.c.b(r));
        int i = this.a.indexOf(obj);
        if (i != -1) {
            ++i;
            while (i < this.a.size()) {
                final h<?> a = this.a.get(i).a(r, obj2, this);
                if (a != null) {
                    return (h<T>)a;
                }
                ++i;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No next JsonAdapter for ");
            sb.append(com.squareup.moshi.internal.c.w(r, obj2));
            throw new IllegalArgumentException(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to skip past unknown factory ");
        sb2.append(obj);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    public static final class c
    {
        final List<h.e> a;
        int b;
        
        public c() {
            this.a = new ArrayList<h.e>();
            this.b = 0;
        }
        
        public c a(final h.e e) {
            if (e != null) {
                this.a.add(this.b++, e);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }
        
        public c b(final Object o) {
            if (o != null) {
                return this.a(com.squareup.moshi.a.d(o));
            }
            throw new IllegalArgumentException("adapter == null");
        }
        
        public <T> c c(final Type type, final h<T> h) {
            return this.a(x.j(type, h));
        }
        
        public <T> c d(final Type type, final Class<? extends Annotation> clazz, final h<T> h) {
            return this.a(x.k(type, clazz, h));
        }
        
        public c e(final h.e e) {
            if (e != null) {
                this.a.add(e);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }
        
        public c f(final Object o) {
            if (o != null) {
                return this.e(com.squareup.moshi.a.d(o));
            }
            throw new IllegalArgumentException("adapter == null");
        }
        
        public <T> c g(final Type type, final h<T> h) {
            return this.e(x.j(type, h));
        }
        
        public <T> c h(final Type type, final Class<? extends Annotation> clazz, final h<T> h) {
            return this.e(x.k(type, clazz, h));
        }
        
        @c6.c
        public x i() {
            return new x(this);
        }
    }
    
    static final class d<T> extends h<T>
    {
        final Type a;
        @c6.h
        final String b;
        final Object c;
        @c6.h
        h<T> d;
        
        d(final Type a, @c6.h final String b, final Object c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public T b(final m m) throws IOException {
            final h<T> d = this.d;
            if (d != null) {
                return d.b(m);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }
        
        @Override
        public void m(final t t, final T t2) throws IOException {
            final h<T> d = this.d;
            if (d != null) {
                d.m(t, t2);
                return;
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }
        
        @Override
        public String toString() {
            final h<T> d = this.d;
            String s;
            if (d != null) {
                s = d.toString();
            }
            else {
                s = super.toString();
            }
            return s;
        }
    }
    
    final class e
    {
        final List<d<?>> a;
        final Deque<d<?>> b;
        boolean c;
        
        e() {
            this.a = new ArrayList<d<?>>();
            this.b = new ArrayDeque<d<?>>();
        }
        
         <T> void a(final h<T> d) {
            this.b.getLast().d = d;
        }
        
        IllegalArgumentException b(final IllegalArgumentException cause) {
            if (this.c) {
                return cause;
            }
            this.c = true;
            if (this.b.size() == 1 && this.b.getFirst().b == null) {
                return cause;
            }
            final StringBuilder sb = new StringBuilder(cause.getMessage());
            final Iterator<d<?>> descendingIterator = this.b.descendingIterator();
            while (descendingIterator.hasNext()) {
                final d d = (d)descendingIterator.next();
                sb.append("\nfor ");
                sb.append(((d)d).a);
                if (((d)d).b != null) {
                    sb.append(' ');
                    sb.append(((d)d).b);
                }
            }
            return new IllegalArgumentException(sb.toString(), cause);
        }
        
        void c(final boolean b) {
            this.b.removeLast();
            if (!this.b.isEmpty()) {
                return;
            }
            x.this.c.remove();
            if (b) {
                final Map b2 = x.this.d;
                // monitorenter(b2)
                int i = 0;
                try {
                    while (i < this.a.size()) {
                        final d d = this.a.get(i);
                        final h<T> d2 = x.this.d.put(d.c, d.d);
                        if (d2 != null) {
                            d.d = d2;
                            x.this.d.put(d.c, d2);
                        }
                        ++i;
                    }
                }
                finally {
                }
                // monitorexit(b2)
            }
        }
        
         <T> h<T> d(final Type type, @c6.h final String s, final Object obj) {
            for (int size = this.a.size(), i = 0; i < size; ++i) {
                final d d = this.a.get(i);
                if (d.c.equals(obj)) {
                    this.b.add(d);
                    final h<T> d2 = d.d;
                    h<T> h = (h<T>)d;
                    if (d2 != null) {
                        h = d2;
                    }
                    return (h<T>)h;
                }
            }
            final d d3 = new d(type, s, obj);
            this.a.add((d<?>)d3);
            this.b.add((d<?>)d3);
            return null;
        }
    }
}
