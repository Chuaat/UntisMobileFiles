// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;
import java.lang.annotation.Annotation;
import java.util.Set;
import java.lang.reflect.Type;
import java.util.Collection;

abstract class e<C extends Collection<T>, T> extends h<C>
{
    public static final h.e b;
    private final h<T> a;
    
    static {
        b = new h.e() {
            @c6.h
            @Override
            public h<?> a(final Type type, final Set<? extends Annotation> set, final x x) {
                final Class<?> j = a0.j(type);
                if (!set.isEmpty()) {
                    return null;
                }
                Object o;
                if (j != List.class && j != Collection.class) {
                    if (j != Set.class) {
                        return null;
                    }
                    o = e.s(type, x);
                }
                else {
                    o = e.q(type, x);
                }
                return ((h<?>)o).j();
            }
        };
    }
    
    private e(final h<T> a) {
        this.a = a;
    }
    
    static <T> h<Collection<T>> q(final Type type, final x x) {
        return (h<Collection<T>>)new e<Collection<T>, T>(x.d(a0.c(type, Collection.class))) {
            @Override
            Collection<T> r() {
                return new ArrayList<T>();
            }
        };
    }
    
    static <T> h<Set<T>> s(final Type type, final x x) {
        return (h<Set<T>>)new e<Set<T>, T>(x.d(a0.c(type, Collection.class))) {
            Set<T> u() {
                return new LinkedHashSet<T>();
            }
        };
    }
    
    public C p(final m m) throws IOException {
        final Collection<T> r = this.r();
        m.a();
        while (m.f()) {
            r.add(this.a.b(m));
        }
        m.c();
        return (C)r;
    }
    
    abstract C r();
    
    public void t(final t t, final C c) throws IOException {
        t.a();
        final Iterator<T> iterator = c.iterator();
        while (iterator.hasNext()) {
            this.a.m(t, iterator.next());
        }
        t.e();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(".collection()");
        return sb.toString();
    }
}
