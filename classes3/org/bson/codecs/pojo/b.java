// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public final class b<T>
{
    private final String a;
    private final Class<T> b;
    private final boolean c;
    private final t<T> d;
    private final boolean e;
    private final String f;
    private final String g;
    private final r<?> h;
    private final List<j0<?>> i;
    private final Map<String, p0> j;
    
    b(final Class<T> b, final Map<String, p0> m, final t<T> d, final Boolean b2, final String f, final String g, final r<?> h, final List<j0<?>> c) {
        this.a = b.getSimpleName();
        this.b = b;
        this.c = (b.getTypeParameters().length > 0);
        this.j = Collections.unmodifiableMap((Map<? extends String, ? extends p0>)new HashMap<String, p0>(m));
        this.d = d;
        this.e = b2;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = Collections.unmodifiableList((List<? extends j0<?>>)new ArrayList<j0<?>>(c));
    }
    
    public static <S> c<S> a(final Class<S> clazz) {
        return new c<S>(clazz);
    }
    
    public String b() {
        return this.g;
    }
    
    public String c() {
        return this.f;
    }
    
    public j0<?> d() {
        final r<?> h = this.h;
        j0<?> d;
        if (h != null) {
            d = h.d();
        }
        else {
            d = null;
        }
        return d;
    }
    
    r<?> e() {
        return this.h;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || b.class != o.getClass()) {
            return false;
        }
        final b b = (b)o;
        if (this.e != b.e) {
            return false;
        }
        if (!this.l().equals(b.l())) {
            return false;
        }
        if (!this.g().equals(b.g())) {
            return false;
        }
        Label_0106: {
            if (this.c() != null) {
                if (this.c().equals(b.c())) {
                    break Label_0106;
                }
            }
            else if (b.c() == null) {
                break Label_0106;
            }
            return false;
        }
        Label_0139: {
            if (this.b() != null) {
                if (this.b().equals(b.b())) {
                    break Label_0139;
                }
            }
            else if (b.b() == null) {
                break Label_0139;
            }
            return false;
        }
        final r<?> h = this.h;
        if (h != null) {
            if (h.equals(b.h)) {
                return this.j().equals(b.j()) && this.k().equals(b.k());
            }
        }
        else if (b.h == null) {
            return this.j().equals(b.j()) && this.k().equals(b.k());
        }
        return false;
    }
    
    s<T> f() {
        return this.d.create();
    }
    
    t<T> g() {
        return this.d;
    }
    
    public String h() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.l().hashCode();
        final int hashCode2 = this.g().hashCode();
        final int e = this.e ? 1 : 0;
        final String c = this.c();
        int hashCode3 = 0;
        int hashCode4;
        if (c != null) {
            hashCode4 = this.c().hashCode();
        }
        else {
            hashCode4 = 0;
        }
        int hashCode5;
        if (this.b() != null) {
            hashCode5 = this.b().hashCode();
        }
        else {
            hashCode5 = 0;
        }
        if (this.e() != null) {
            hashCode3 = this.e().hashCode();
        }
        return ((((((hashCode * 31 + hashCode2) * 31 + e) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode3) * 31 + this.j().hashCode()) * 31 + this.k().hashCode();
    }
    
    public j0<?> i(final String anObject) {
        for (final j0<?> j0 : this.i) {
            if (j0.f().equals(anObject)) {
                return j0;
            }
        }
        return null;
    }
    
    public List<j0<?>> j() {
        return this.i;
    }
    
    Map<String, p0> k() {
        return this.j;
    }
    
    public Class<T> l() {
        return this.b;
    }
    
    public boolean m() {
        return this.c;
    }
    
    public boolean n() {
        return this.e;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ClassModel{type=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
