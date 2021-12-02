// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.components;

import n3.b;
import java.util.Iterator;
import java.util.Collections;
import j3.c;
import java.util.HashSet;
import java.util.Set;

final class i0 extends com.google.firebase.components.a
{
    private final Set<Class<?>> a;
    private final Set<Class<?>> b;
    private final Set<Class<?>> c;
    private final Set<Class<?>> d;
    private final Set<Class<?>> e;
    private final Set<Class<?>> f;
    private final g g;
    
    i0(final f<?> f, final g g) {
        final HashSet<Class<?>> s = new HashSet<Class<?>>();
        final HashSet<Class<?>> s2 = new HashSet<Class<?>>();
        final HashSet<Class<?>> s3 = new HashSet<Class<?>>();
        final HashSet<Class<?>> s4 = new HashSet<Class<?>>();
        final HashSet<Class<?>> s5 = new HashSet<Class<?>>();
        for (final t t : f.f()) {
            if (t.e()) {
                final boolean g2 = t.g();
                final Class<?> c = t.c();
                if (g2) {
                    s4.add(c);
                }
                else {
                    s.add(c);
                }
            }
            else if (t.d()) {
                s3.add(t.c());
            }
            else {
                final boolean g3 = t.g();
                final Class<?> c2 = t.c();
                if (g3) {
                    s5.add(c2);
                }
                else {
                    s2.add(c2);
                }
            }
        }
        if (!f.i().isEmpty()) {
            s.add(c.class);
        }
        this.a = (Set<Class<?>>)Collections.unmodifiableSet((Set<?>)s);
        this.b = (Set<Class<?>>)Collections.unmodifiableSet((Set<?>)s2);
        this.c = (Set<Class<?>>)Collections.unmodifiableSet((Set<?>)s3);
        this.d = (Set<Class<?>>)Collections.unmodifiableSet((Set<?>)s4);
        this.e = (Set<Class<?>>)Collections.unmodifiableSet((Set<?>)s5);
        this.f = (Set<Class<?>>)f.i();
        this.g = g;
    }
    
    @Override
    public <T> T a(final Class<T> clazz) {
        if (!this.a.contains(clazz)) {
            throw new v(String.format("Attempting to request an undeclared dependency %s.", clazz));
        }
        final T a = this.g.a(clazz);
        if (!clazz.equals(c.class)) {
            return a;
        }
        return (T)new a(this.f, (c)a);
    }
    
    @Override
    public <T> b<T> b(final Class<T> clazz) {
        if (this.b.contains(clazz)) {
            return this.g.b(clazz);
        }
        throw new v(String.format("Attempting to request an undeclared dependency Provider<%s>.", clazz));
    }
    
    @Override
    public <T> b<Set<T>> d(final Class<T> clazz) {
        if (this.e.contains(clazz)) {
            return this.g.d(clazz);
        }
        throw new v(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", clazz));
    }
    
    @Override
    public <T> Set<T> e(final Class<T> clazz) {
        if (this.d.contains(clazz)) {
            return this.g.e(clazz);
        }
        throw new v(String.format("Attempting to request an undeclared dependency Set<%s>.", clazz));
    }
    
    @Override
    public <T> n3.a<T> f(final Class<T> clazz) {
        if (this.c.contains(clazz)) {
            return this.g.f(clazz);
        }
        throw new v(String.format("Attempting to request an undeclared dependency Deferred<%s>.", clazz));
    }
    
    private static class a implements c
    {
        private final Set<Class<?>> a;
        private final c b;
        
        public a(final Set<Class<?>> a, final c b) {
            this.a = a;
            this.b = b;
        }
        
        public void d(final j3.a<?> a) {
            if (this.a.contains(a.b())) {
                this.b.d((j3.a)a);
                return;
            }
            throw new v(String.format("Attempting to publish an undeclared event %s.", a));
        }
    }
}
