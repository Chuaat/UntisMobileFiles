// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.base;

import org.joda.convert.ToString;
import org.joda.time.format.k;
import org.joda.time.d0;
import org.joda.time.format.q;
import org.joda.time.b0;
import org.joda.time.m;
import org.joda.time.o0;

public abstract class f implements o0
{
    protected f() {
    }
    
    @Override
    public boolean B(final m m) {
        return this.I().j(m);
    }
    
    @Override
    public m N(final int n) {
        return this.I().e(n);
    }
    
    @Override
    public b0 O() {
        return new b0(this);
    }
    
    public m[] a() {
        final int size = this.size();
        final m[] array = new m[size];
        for (int i = 0; i < size; ++i) {
            array[i] = this.N(i);
        }
        return array;
    }
    
    public int[] c() {
        final int size = this.size();
        final int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = this.e0(i);
        }
        return array;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof o0)) {
            return false;
        }
        final o0 o2 = (o0)o;
        if (this.size() != o2.size()) {
            return false;
        }
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (this.e0(i) != o2.e0(i) || this.N(i) != o2.N(i)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int size = this.size();
        int n = 17;
        for (int i = 0; i < size; ++i) {
            n = (n * 27 + this.e0(i)) * 27 + this.N(i).hashCode();
        }
        return n;
    }
    
    public int n(final m m) {
        return this.I().i(m);
    }
    
    public String q(final q q) {
        if (q == null) {
            return this.toString();
        }
        return q.m(this);
    }
    
    @Override
    public d0 r() {
        return new d0(this);
    }
    
    @Override
    public int size() {
        return this.I().p();
    }
    
    @ToString
    @Override
    public String toString() {
        return k.e().m(this);
    }
    
    @Override
    public int y(final m m) {
        final int n = this.n(m);
        if (n == -1) {
            return 0;
        }
        return this.e0(n);
    }
}
