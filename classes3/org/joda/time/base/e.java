// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.base;

import org.joda.time.format.b;
import org.joda.time.m;
import org.joda.time.field.j;
import org.joda.time.a;
import org.joda.time.h;
import org.joda.time.c;
import org.joda.time.l0;
import org.joda.time.f;
import org.joda.time.g;
import org.joda.time.n0;

public abstract class e implements n0, Comparable<n0>
{
    protected e() {
    }
    
    @Override
    public g N(final int n) {
        return this.d(n, this.t()).J();
    }
    
    @Override
    public f Q3(final int n) {
        return this.d(n, this.t());
    }
    
    @Override
    public c V4(final l0 l0) {
        final a i = h.i(l0);
        return new c(i.K(this, h.j(l0)), i);
    }
    
    @Override
    public boolean Z(final g g) {
        return this.i(g) != -1;
    }
    
    public int b(final n0 n0) {
        if (this == n0) {
            return 0;
        }
        if (this.size() == n0.size()) {
            for (int size = this.size(), i = 0; i < size; ++i) {
                if (this.N(i) != n0.N(i)) {
                    throw new ClassCastException("ReadablePartial objects must have matching field types");
                }
            }
            for (int size2 = this.size(), j = 0; j < size2; ++j) {
                if (this.e0(j) > n0.e0(j)) {
                    return 1;
                }
                if (this.e0(j) < n0.e0(j)) {
                    return -1;
                }
            }
            return 0;
        }
        throw new ClassCastException("ReadablePartial objects must have matching field types");
    }
    
    protected abstract f d(final int p0, final a p1);
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n0)) {
            return false;
        }
        final n0 n0 = (n0)o;
        if (this.size() != n0.size()) {
            return false;
        }
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (this.e0(i) != n0.e0(i) || this.N(i) != n0.N(i)) {
                return false;
            }
        }
        return j.a(this.t(), n0.t());
    }
    
    public g[] f() {
        final int size = this.size();
        final g[] array = new g[size];
        for (int i = 0; i < size; ++i) {
            array[i] = this.N(i);
        }
        return array;
    }
    
    public f[] g() {
        final int size = this.size();
        final f[] array = new f[size];
        for (int i = 0; i < size; ++i) {
            array[i] = this.Q3(i);
        }
        return array;
    }
    
    public int[] h() {
        final int size = this.size();
        final int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = this.e0(i);
        }
        return array;
    }
    
    @Override
    public int hashCode() {
        final int size = this.size();
        int n = 157;
        for (int i = 0; i < size; ++i) {
            n = (n * 23 + this.e0(i)) * 23 + this.N(i).hashCode();
        }
        return n + this.t().hashCode();
    }
    
    public int i(final g g) {
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (this.N(i) == g) {
                return i;
            }
        }
        return -1;
    }
    
    protected int j(final m m) {
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (this.N(i).F() == m) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public int j0(final g g) {
        return this.e0(this.k(g));
    }
    
    protected int k(final g obj) {
        final int i = this.i(obj);
        if (i != -1) {
            return i;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Field '");
        sb.append(obj);
        sb.append("' is not supported");
        throw new IllegalArgumentException(sb.toString());
    }
    
    protected int l(final m obj) {
        final int j = this.j(obj);
        if (j != -1) {
            return j;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Field '");
        sb.append(obj);
        sb.append("' is not supported");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public boolean m(final n0 n0) {
        if (n0 != null) {
            return this.b(n0) > 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }
    
    public boolean o(final n0 n0) {
        if (n0 != null) {
            return this.b(n0) < 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }
    
    public boolean p(final n0 n0) {
        if (n0 != null) {
            return this.b(n0) == 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }
    
    public String s(final b b) {
        if (b == null) {
            return this.toString();
        }
        return b.w(this);
    }
}
