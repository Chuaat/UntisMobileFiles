// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import java.util.Iterator;
import java.util.HashMap;
import e7.a;
import java.util.Collections;
import java.util.ArrayList;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.List;

public class c<T>
{
    static final String l = "_id";
    private final List<k0<?>> a;
    private p<?> b;
    private t<T> c;
    private Class<T> d;
    private Map<String, p0> e;
    private List<e> f;
    private List<Annotation> g;
    private boolean h;
    private String i;
    private String j;
    private String k;
    
    c(final Class<T> clazz) {
        this.a = new ArrayList<k0<?>>();
        this.e = Collections.emptyMap();
        this.f = org.bson.codecs.pojo.k.f;
        this.g = Collections.emptyList();
        z.b((c<Object>)this, (Class<Object>)e7.a.e("type", (Class<T>)clazz));
    }
    
    private void A(String k, final List<j0<?>> list) {
        final HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        final HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();
        final HashMap<String, Integer> hashMap3 = new HashMap<String, Integer>();
        for (final j0<?> j0 : list) {
            if (j0.l()) {
                throw new org.bson.codecs.configuration.a(j0.e());
            }
            this.d("property", j0.f(), hashMap, k);
            if (j0.m()) {
                this.d("read property", j0.i(), hashMap2, k);
            }
            if (!j0.n()) {
                continue;
            }
            this.d("write property", j0.k(), hashMap3, k);
        }
        k = this.k;
        if (k != null && !hashMap.containsKey(k)) {
            throw new org.bson.codecs.configuration.a(String.format("Invalid id property, property named '%s' can not be found.", this.k));
        }
    }
    
    private void d(final String s, final String s2, final Map<String, Integer> map, final String s3) {
        if (!map.containsKey(s2)) {
            map.put(s2, 1);
            return;
        }
        throw new org.bson.codecs.configuration.a(String.format("Duplicate %s named '%s' found in %s.", s, s2, s3));
    }
    
    c<T> a(final k0<?> k0) {
        this.a.add(e7.a.e("propertyModelBuilder", k0));
        return this;
    }
    
    public c<T> b(final List<Annotation> list) {
        this.g = e7.a.e("annotations", list);
        return this;
    }
    
    public b<T> c() {
        final ArrayList<j0<?>> list = new ArrayList<j0<?>>();
        z.k("type", this.d);
        final Iterator<e> iterator = this.f.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this);
        }
        z.k("instanceCreatorFactory", this.c);
        if (this.h) {
            z.k("discriminatorKey", this.j);
            z.k("discriminator", this.i);
        }
        final Iterator<k0<?>> iterator2 = this.a.iterator();
        Object o = null;
        while (iterator2.hasNext()) {
            final k0<I> k0 = iterator2.next();
            final boolean equals = k0.e().equals(this.k);
            if (equals) {
                k0.t("_id").x("_id");
            }
            final j0<I> a = k0.a();
            list.add(a);
            if (equals) {
                o = a;
            }
        }
        this.A(this.d.getSimpleName(), list);
        return new b<T>((Class<Object>)this.d, this.e, (t<Object>)this.c, this.h, this.j, this.i, r.a(this.d, (j0<?>)o, this.b), Collections.unmodifiableList((List<? extends j0<?>>)list));
    }
    
    public c<T> e(final List<e> list) {
        this.f = e7.a.e("conventions", list);
        return this;
    }
    
    public c<T> f(final String i) {
        this.i = i;
        return this;
    }
    
    public c<T> g(final String j) {
        this.j = j;
        return this;
    }
    
    public c<T> h(final boolean h) {
        this.h = h;
        return this;
    }
    
    public List<Annotation> i() {
        return this.g;
    }
    
    public List<e> j() {
        return this.f;
    }
    
    public String k() {
        return this.i;
    }
    
    public String l() {
        return this.j;
    }
    
    public p<?> m() {
        return this.b;
    }
    
    public String n() {
        return this.k;
    }
    
    public t<T> o() {
        return this.c;
    }
    
    public k0<?> p(final String anObject) {
        e7.a.e("propertyName", anObject);
        for (final k0<?> k0 : this.a) {
            if (k0.e().equals(anObject)) {
                return k0;
            }
        }
        return null;
    }
    
    public List<k0<?>> q() {
        return Collections.unmodifiableList((List<? extends k0<?>>)this.a);
    }
    
    Map<String, p0> r() {
        return this.e;
    }
    
    public Class<T> s() {
        return this.d;
    }
    
    public c<T> t(final p<?> b) {
        this.b = b;
        return this;
    }
    
    @Override
    public String toString() {
        return String.format("ClassModelBuilder{type=%s}", this.d);
    }
    
    public c<T> u(final String k) {
        this.k = k;
        return this;
    }
    
    public c<T> v(final t<T> t) {
        this.c = e7.a.e("instanceCreatorFactory", t);
        return this;
    }
    
    c<T> w(final Map<String, p0> m) {
        this.e = Collections.unmodifiableMap((Map<? extends String, ? extends p0>)new HashMap<String, p0>(m));
        return this;
    }
    
    public boolean x(final String s) {
        return this.a.remove(this.p(e7.a.e("propertyName", s)));
    }
    
    public c<T> y(final Class<T> clazz) {
        this.d = e7.a.e("type", clazz);
        return this;
    }
    
    public Boolean z() {
        return this.h;
    }
}
