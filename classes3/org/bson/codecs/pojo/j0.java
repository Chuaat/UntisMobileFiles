// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import org.bson.codecs.n0;

public final class j0<T>
{
    private final String a;
    private final String b;
    private final String c;
    private final o0<T> d;
    private final n0<T> e;
    private final org.bson.codecs.pojo.n0<T> f;
    private final Boolean g;
    private final d0<T> h;
    private final String i;
    private volatile n0<T> j;
    
    j0(final String a, final String b, final String c, final o0<T> d, final n0<T> n0, final org.bson.codecs.pojo.n0<T> f, final Boolean g, final d0<T> h, final String i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = n0;
        this.j = n0;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static <T> k0<T> a() {
        return new k0<T>();
    }
    
    void b(final n0<T> j) {
        this.j = j;
    }
    
    n0<T> c() {
        return this.j;
    }
    
    public n0<T> d() {
        return this.e;
    }
    
    String e() {
        return this.i;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && j0.class == o.getClass()) {
            final j0 j0 = (j0)o;
            Label_0061: {
                if (this.f() != null) {
                    if (this.f().equals(j0.f())) {
                        break Label_0061;
                    }
                }
                else if (j0.f() == null) {
                    break Label_0061;
                }
                return false;
            }
            Label_0094: {
                if (this.i() != null) {
                    if (this.i().equals(j0.i())) {
                        break Label_0094;
                    }
                }
                else if (j0.i() == null) {
                    break Label_0094;
                }
                return false;
            }
            Label_0127: {
                if (this.k() != null) {
                    if (this.k().equals(j0.k())) {
                        break Label_0127;
                    }
                }
                else if (j0.k() == null) {
                    break Label_0127;
                }
                return false;
            }
            Label_0160: {
                if (this.j() != null) {
                    if (this.j().equals(j0.j())) {
                        break Label_0160;
                    }
                }
                else if (j0.j() == null) {
                    break Label_0160;
                }
                return false;
            }
            Label_0193: {
                if (this.d() != null) {
                    if (this.d().equals(j0.d())) {
                        break Label_0193;
                    }
                }
                else if (j0.d() == null) {
                    break Label_0193;
                }
                return false;
            }
            Label_0226: {
                if (this.h() != null) {
                    if (this.h().equals(j0.h())) {
                        break Label_0226;
                    }
                }
                else if (j0.h() == null) {
                    break Label_0226;
                }
                return false;
            }
            final Boolean g = this.g;
            Label_0258: {
                if (g != null) {
                    if (g.equals(j0.g)) {
                        break Label_0258;
                    }
                }
                else if (j0.g == null) {
                    break Label_0258;
                }
                return false;
            }
            Label_0291: {
                if (this.g() != null) {
                    if (this.g().equals(j0.g())) {
                        break Label_0291;
                    }
                }
                else if (j0.g() == null) {
                    break Label_0291;
                }
                return false;
            }
            Label_0324: {
                if (this.e() != null) {
                    if (this.e().equals(j0.e())) {
                        break Label_0324;
                    }
                }
                else if (j0.e() == null) {
                    break Label_0324;
                }
                return false;
            }
            if (this.c() != null) {
                if (this.c().equals(j0.c())) {
                    return true;
                }
            }
            else if (j0.c() == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public String f() {
        return this.a;
    }
    
    public d0<T> g() {
        return this.h;
    }
    
    org.bson.codecs.pojo.n0<T> h() {
        return this.f;
    }
    
    @Override
    public int hashCode() {
        final String f = this.f();
        int hashCode = 0;
        int hashCode2;
        if (f != null) {
            hashCode2 = this.f().hashCode();
        }
        else {
            hashCode2 = 0;
        }
        int hashCode3;
        if (this.i() != null) {
            hashCode3 = this.i().hashCode();
        }
        else {
            hashCode3 = 0;
        }
        int hashCode4;
        if (this.k() != null) {
            hashCode4 = this.k().hashCode();
        }
        else {
            hashCode4 = 0;
        }
        int hashCode5;
        if (this.j() != null) {
            hashCode5 = this.j().hashCode();
        }
        else {
            hashCode5 = 0;
        }
        int hashCode6;
        if (this.d() != null) {
            hashCode6 = this.d().hashCode();
        }
        else {
            hashCode6 = 0;
        }
        int hashCode7;
        if (this.h() != null) {
            hashCode7 = this.h().hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final Boolean g = this.g;
        int hashCode8;
        if (g != null) {
            hashCode8 = g.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        int hashCode9;
        if (this.g() != null) {
            hashCode9 = this.g().hashCode();
        }
        else {
            hashCode9 = 0;
        }
        int hashCode10;
        if (this.e() != null) {
            hashCode10 = this.e().hashCode();
        }
        else {
            hashCode10 = 0;
        }
        if (this.c() != null) {
            hashCode = this.c().hashCode();
        }
        return ((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode;
    }
    
    public String i() {
        return this.b;
    }
    
    public o0<T> j() {
        return this.d;
    }
    
    public String k() {
        return this.c;
    }
    
    boolean l() {
        return this.i != null;
    }
    
    public boolean m() {
        return this.b != null;
    }
    
    public boolean n() {
        return this.c != null;
    }
    
    public boolean o(final T t) {
        return this.f.a(t);
    }
    
    public Boolean p() {
        return this.g;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PropertyModel{propertyName='");
        sb.append(this.a);
        sb.append("', readName='");
        sb.append(this.b);
        sb.append("', writeName='");
        sb.append(this.c);
        sb.append("', typeData=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
