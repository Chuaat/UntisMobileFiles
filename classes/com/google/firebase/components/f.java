// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.components;

import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public final class f<T>
{
    private final Set<Class<? super T>> a;
    private final Set<t> b;
    private final int c;
    private final int d;
    private final j<T> e;
    private final Set<Class<?>> f;
    
    private f(final Set<Class<? super T>> s, final Set<t> s2, final int c, final int d, final j<T> e, final Set<Class<?>> s3) {
        this.a = Collections.unmodifiableSet((Set<? extends Class<? super T>>)s);
        this.b = Collections.unmodifiableSet((Set<? extends t>)s2);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = Collections.unmodifiableSet((Set<? extends Class<?>>)s3);
    }
    
    public static <T> b<T> d(final Class<T> clazz) {
        return new b<T>((Class)clazz, new Class[0]);
    }
    
    @SafeVarargs
    public static <T> b<T> e(final Class<T> clazz, final Class<? super T>... array) {
        return new b<T>((Class)clazz, (Class[])array);
    }
    
    public static <T> f<T> j(final T t, final Class<T> clazz) {
        return k(clazz).f(new c(t)).d();
    }
    
    public static <T> b<T> k(final Class<T> clazz) {
        return (b<T>)d((Class<Object>)clazz).g();
    }
    
    @Deprecated
    public static <T> f<T> s(final Class<T> clazz, final T t) {
        return d(clazz).f(new d(t)).d();
    }
    
    @SafeVarargs
    public static <T> f<T> t(final T t, final Class<T> clazz, final Class<? super T>... array) {
        return e(clazz, array).f(new e(t)).d();
    }
    
    public Set<t> f() {
        return this.b;
    }
    
    public j<T> g() {
        return this.e;
    }
    
    public Set<Class<? super T>> h() {
        return this.a;
    }
    
    public Set<Class<?>> i() {
        return this.f;
    }
    
    public boolean l() {
        final int c = this.c;
        boolean b = true;
        if (c != 1) {
            b = false;
        }
        return b;
    }
    
    public boolean m() {
        return this.c == 2;
    }
    
    public boolean n() {
        return this.c == 0;
    }
    
    public boolean o() {
        return this.d == 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.a.toArray()));
        sb.append(">{");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.b.toArray()));
        sb.append("}");
        return sb.toString();
    }
    
    public static class b<T>
    {
        private final Set<Class<? super T>> a;
        private final Set<t> b;
        private int c;
        private int d;
        private j<T> e;
        private Set<Class<?>> f;
        
        @SafeVarargs
        private b(final Class<T> clazz, final Class<? super T>... elements) {
            final HashSet<Class<T>> a = new HashSet<Class<T>>();
            this.a = (Set<Class<? super T>>)a;
            this.b = new HashSet<t>();
            int i = 0;
            this.c = 0;
            this.d = 0;
            this.f = new HashSet<Class<?>>();
            g0.c(clazz, "Null interface");
            a.add(clazz);
            while (i < elements.length) {
                g0.c(elements[i], "Null interface");
                ++i;
            }
            Collections.addAll(this.a, elements);
        }
        
        private b<T> g() {
            this.d = 1;
            return this;
        }
        
        private b<T> i(final int c) {
            g0.d(this.c == 0, "Instantiation type has already been set.");
            this.c = c;
            return this;
        }
        
        private void j(final Class<?> clazz) {
            g0.a(this.a.contains(clazz) ^ true, "Components are not allowed to depend on interfaces they themselves provide.");
        }
        
        public b<T> b(final t t) {
            g0.c(t, "Null dependency");
            this.j(t.c());
            this.b.add(t);
            return this;
        }
        
        public b<T> c() {
            return this.i(1);
        }
        
        public f<T> d() {
            g0.d(this.e != null, "Missing required property: factory.");
            return new f<T>(new HashSet(this.a), new HashSet(this.b), this.c, this.d, this.e, this.f, null);
        }
        
        public b<T> e() {
            return this.i(2);
        }
        
        public b<T> f(final j<T> j) {
            this.e = g0.c(j, "Null factory");
            return this;
        }
        
        public b<T> h(final Class<?> clazz) {
            this.f.add(clazz);
            return this;
        }
    }
}
