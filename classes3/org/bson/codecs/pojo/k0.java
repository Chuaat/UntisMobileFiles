// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import e7.a;
import java.util.Collections;
import java.lang.annotation.Annotation;
import java.util.List;

public final class k0<T>
{
    private String a;
    private String b;
    private String c;
    private o0<T> d;
    private n0<T> e;
    private org.bson.codecs.n0<T> f;
    private d0<T> g;
    private List<Annotation> h;
    private List<Annotation> i;
    private Boolean j;
    private String k;
    
    k0() {
        this.h = Collections.emptyList();
        this.i = Collections.emptyList();
    }
    
    public j0<T> a() {
        if (!this.n() && !this.o()) {
            throw new IllegalStateException(String.format("Invalid PropertyModel '%s', neither readable or writable,", this.a));
        }
        return new j0<T>(z.k("propertyName", this.a), this.b, this.c, z.k("typeData", this.d), this.f, z.k("propertySerialization", this.e), this.j, z.k("propertyAccessor", this.g), this.k);
    }
    
    public k0<T> b(final org.bson.codecs.n0<T> f) {
        this.f = f;
        return this;
    }
    
    public k0<T> c(final boolean b) {
        this.j = b;
        return this;
    }
    
    org.bson.codecs.n0<T> d() {
        return this.f;
    }
    
    public String e() {
        return this.a;
    }
    
    public d0<T> f() {
        return this.g;
    }
    
    public n0<T> g() {
        return this.e;
    }
    
    public List<Annotation> h() {
        return this.h;
    }
    
    public String i() {
        return this.b;
    }
    
    o0<T> j() {
        return this.d;
    }
    
    public List<Annotation> k() {
        return this.i;
    }
    
    public String l() {
        return this.c;
    }
    
    public Boolean m() {
        return this.j;
    }
    
    public boolean n() {
        return this.b != null;
    }
    
    public boolean o() {
        return this.c != null;
    }
    
    public k0<T> p(final d0<T> g) {
        this.g = g;
        return this;
    }
    
    k0<T> q(final String s) {
        this.a = e7.a.e("propertyName", s);
        return this;
    }
    
    public k0<T> r(final n0<T> n0) {
        this.e = e7.a.e("propertySerialization", n0);
        return this;
    }
    
    public k0<T> s(final List<Annotation> list) {
        this.h = Collections.unmodifiableList((List<? extends Annotation>)e7.a.e("annotations", (List<? extends T>)list));
        return this;
    }
    
    public k0<T> t(final String b) {
        this.b = b;
        return this;
    }
    
    @Override
    public String toString() {
        return String.format("PropertyModelBuilder{propertyName=%s, typeData=%s}", this.a, this.d);
    }
    
    k0<T> u(final String k) {
        this.k = k;
        return this;
    }
    
    k0<T> v(final o0<T> o0) {
        this.d = e7.a.e("typeData", o0);
        return this;
    }
    
    public k0<T> w(final List<Annotation> i) {
        this.i = i;
        return this;
    }
    
    public k0<T> x(final String c) {
        this.c = c;
        return this;
    }
}
