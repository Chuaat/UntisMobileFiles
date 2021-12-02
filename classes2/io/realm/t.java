// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.Table;
import io.realm.internal.r;
import c6.h;
import io.realm.internal.i;

public abstract class t implements Comparable<t>, i
{
    t() {
    }
    
    public static t i() {
        return new b(null);
    }
    
    public static t l(final long l) {
        return m(l);
    }
    
    public static t m(final Long n) {
        return new b(n);
    }
    
    public static t o(final String s) {
        return l(Long.parseLong(s));
    }
    
    public final int b(final t t) {
        final Long f = this.f();
        final Long f2 = t.f();
        int compareTo;
        if (f == null) {
            if (f2 == null) {
                compareTo = 0;
            }
            else {
                compareTo = -1;
            }
        }
        else if (f2 == null) {
            compareTo = 1;
        }
        else {
            compareTo = f.compareTo(f2);
        }
        return compareTo;
    }
    
    public abstract void d(final long p0);
    
    @Override
    public final boolean equals(final Object o) {
        boolean equals = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof t)) {
            return false;
        }
        final Long f = this.f();
        final Long f2 = ((t)o).f();
        if (f == null) {
            if (f2 != null) {
                equals = false;
            }
        }
        else {
            equals = f.equals(f2);
        }
        return equals;
    }
    
    @h
    public abstract Long f();
    
    public abstract void g(final long p0);
    
    public final boolean h() {
        return this.f() == null;
    }
    
    @Override
    public final int hashCode() {
        final Long f = this.f();
        int hashCode;
        if (f == null) {
            hashCode = 0;
        }
        else {
            hashCode = f.hashCode();
        }
        return hashCode;
    }
    
    public final void j(final long l) {
        this.k(l);
    }
    
    public abstract void k(@h final Long p0);
    
    abstract static class a<T extends n0> extends t
    {
        private io.realm.a u() {
            return this.s().f();
        }
        
        private r v() {
            return this.s().g();
        }
        
        private void y(@h final Long n, final boolean b) {
            final r v = this.v();
            final Table g = v.g();
            final long l0 = v.l0();
            final long p2 = this.p();
            if (n == null) {
                g.r0(p2, l0, b);
            }
            else {
                g.q0(p2, l0, n, b);
            }
        }
        
        @Override
        public final boolean G0() {
            return true;
        }
        
        @Override
        public final boolean T() {
            return !this.u().isClosed() && this.v().T();
        }
        
        @Override
        public final void d(final long n) {
            this.g(-n);
        }
        
        @Override
        public final Long f() {
            final r v = this.v();
            v.M();
            final long p = this.p();
            Long value;
            if (v.y(p)) {
                value = null;
            }
            else {
                value = v.m(p);
            }
            return value;
        }
        
        @Override
        public final void g(final long n) {
            this.u().j();
            final r v = this.v();
            v.g().V(this.p(), v.l0(), n);
        }
        
        @Override
        public final void k(@h final Long n) {
            final c0<T> s = this.s();
            s.f().j();
            boolean b;
            if (!s.i()) {
                b = false;
            }
            else {
                if (!s.d()) {
                    return;
                }
                b = true;
            }
            this.y(n, b);
        }
        
        @Override
        public boolean n6() {
            return this.u().N();
        }
        
        protected abstract long p();
        
        protected abstract c0<T> s();
    }
    
    private static final class b extends t
    {
        @h
        private Long G;
        
        b(@h final Long g) {
            this.G = g;
        }
        
        @Override
        public boolean G0() {
            return false;
        }
        
        @Override
        public boolean T() {
            return true;
        }
        
        @Override
        public void d(final long n) {
            this.g(-n);
        }
        
        @h
        @Override
        public Long f() {
            return this.G;
        }
        
        @Override
        public void g(final long n) {
            final Long g = this.G;
            if (g != null) {
                this.G = g + n;
                return;
            }
            throw new IllegalStateException("Cannot increment a MutableRealmInteger whose value is null. Set its value first.");
        }
        
        @Override
        public void k(@h final Long g) {
            this.G = g;
        }
        
        @Override
        public boolean n6() {
            return false;
        }
    }
}
