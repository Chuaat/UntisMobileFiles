// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.field;

import org.joda.time.g;
import org.joda.time.f;
import org.joda.time.l;
import java.util.Locale;
import org.joda.time.n0;
import org.joda.time.l0;

public abstract class a
{
    protected a() {
    }
    
    public int a(final l0 l0) {
        if (l0 == null) {
            throw new IllegalArgumentException("The instant must not be null");
        }
        final int c = this.c();
        final int j0 = l0.j0(this.k());
        if (c < j0) {
            return -1;
        }
        if (c > j0) {
            return 1;
        }
        return 0;
    }
    
    public int b(final n0 n0) {
        if (n0 == null) {
            throw new IllegalArgumentException("The instant must not be null");
        }
        final int c = this.c();
        final int j0 = n0.j0(this.k());
        if (c < j0) {
            return -1;
        }
        if (c > j0) {
            return 1;
        }
        return 0;
    }
    
    public abstract int c();
    
    public String d() {
        return this.e(null);
    }
    
    public String e(final Locale locale) {
        return this.j().k(this.t(), this.c(), locale);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        if (this.c() != a.c() || this.k() != a.k() || !j.a(this.t().t(), a.t().t())) {
            b = false;
        }
        return b;
    }
    
    public String f() {
        return Integer.toString(this.c());
    }
    
    public String g() {
        return this.h(null);
    }
    
    public String h(final Locale locale) {
        return this.j().p(this.t(), this.c(), locale);
    }
    
    @Override
    public int hashCode() {
        return ((247 + this.c()) * 13 + this.k().hashCode()) * 13 + this.t().t().hashCode();
    }
    
    public l i() {
        return this.j().t();
    }
    
    public abstract f j();
    
    public g k() {
        return this.j().J();
    }
    
    public int l(final Locale locale) {
        return this.j().w(locale);
    }
    
    public int m(final Locale locale) {
        return this.j().x(locale);
    }
    
    public int n() {
        return this.j().B(this.t());
    }
    
    public int o() {
        return this.j().y();
    }
    
    public int p() {
        return this.j().F(this.t());
    }
    
    public int q() {
        return this.j().D();
    }
    
    public String r() {
        return this.j().H();
    }
    
    public l s() {
        return this.j().I();
    }
    
    protected abstract n0 t();
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Property[");
        sb.append(this.r());
        sb.append("]");
        return sb.toString();
    }
}
