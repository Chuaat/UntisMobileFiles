// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import java.util.Collection;
import java.util.ArrayList;
import org.bson.codecs.configuration.a;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.List;
import java.lang.annotation.Annotation;
import java.util.Map;

final class i0<T>
{
    private final String a;
    private final String b;
    private final o0<T> c;
    private final Map<Class<? extends Annotation>, Annotation> d;
    private final Map<Class<? extends Annotation>, Annotation> e;
    private p0 f;
    private List<o0<?>> g;
    private String h;
    private Field i;
    private Method j;
    private Method k;
    
    i0(final String a, final String b, final o0<T> c) {
        this.d = new HashMap<Class<? extends Annotation>, Annotation>();
        this.e = new HashMap<Class<? extends Annotation>, Annotation>();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private boolean p(final int mod) {
        return Modifier.isPublic(mod) && this.r(mod);
    }
    
    private boolean r(final int n) {
        return !Modifier.isTransient(n) && !Modifier.isStatic(n);
    }
    
    public i0<T> a(final Annotation annotation) {
        if (!this.d.containsKey(annotation.annotationType())) {
            this.d.put(annotation.annotationType(), annotation);
            return this;
        }
        if (annotation.equals(this.d.get(annotation.annotationType()))) {
            return this;
        }
        throw new a(String.format("Read annotation %s for '%s' already exists in %s", annotation.annotationType(), this.a, this.b));
    }
    
    public i0<T> b(final Annotation annotation) {
        if (!this.e.containsKey(annotation.annotationType())) {
            this.e.put(annotation.annotationType(), annotation);
            return this;
        }
        if (annotation.equals(this.e.get(annotation.annotationType()))) {
            return this;
        }
        throw new a(String.format("Write annotation %s for '%s' already exists in %s", annotation.annotationType(), this.a, this.b));
    }
    
    public i0<T> c(final Field i) {
        this.i = i;
        return this;
    }
    
    public String d() {
        return this.b;
    }
    
    String e() {
        return this.h;
    }
    
    public Field f() {
        return this.i;
    }
    
    public Method g() {
        return this.j;
    }
    
    public String h() {
        return this.a;
    }
    
    public List<Annotation> i() {
        return new ArrayList<Annotation>(this.d.values());
    }
    
    public Method j() {
        return this.k;
    }
    
    public o0<T> k() {
        return this.c;
    }
    
    public p0 l() {
        return this.f;
    }
    
    public List<o0<?>> m() {
        return this.g;
    }
    
    public List<Annotation> n() {
        return new ArrayList<Annotation>(this.e.values());
    }
    
    public boolean o() {
        final Method k = this.k;
        boolean b = true;
        final boolean b2 = true;
        if (k != null) {
            final Field i = this.i;
            boolean b3 = b2;
            if (i != null) {
                b3 = (!Modifier.isFinal(i.getModifiers()) && this.r(this.i.getModifiers()) && b2);
            }
            return b3;
        }
        final Field j = this.i;
        if (j == null || Modifier.isFinal(j.getModifiers()) || !this.p(this.i.getModifiers())) {
            b = false;
        }
        return b;
    }
    
    public boolean q() {
        final Method j = this.j;
        boolean b = true;
        final boolean b2 = true;
        if (j != null) {
            final Field i = this.i;
            boolean b3 = b2;
            if (i != null) {
                b3 = (this.r(i.getModifiers()) && b2);
            }
            return b3;
        }
        final Field k = this.i;
        if (k == null || !this.p(k.getModifiers())) {
            b = false;
        }
        return b;
    }
    
    void s(final String h) {
        this.h = h;
    }
    
    public void t(final Method j) {
        this.j = j;
    }
    
    public void u(final Method k) {
        this.k = k;
    }
    
    public <S> i0<T> v(final p0 f, final o0<S> o0) {
        if (f != null && o0 != null) {
            this.f = f;
            this.g = (List<o0<?>>)o0.getTypeParameters();
        }
        return this;
    }
}
