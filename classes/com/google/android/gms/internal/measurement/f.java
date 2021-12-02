// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;
import java.util.SortedMap;

public final class f implements Iterable<q>, q, m
{
    final SortedMap<Integer, q> G;
    final Map<String, q> H;
    
    public f() {
        this.G = new TreeMap<Integer, q>();
        this.H = new TreeMap<String, q>();
    }
    
    public f(final List<q> list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); ++i) {
                this.z(i, list.get(i));
            }
        }
    }
    
    public final boolean A(final int n) {
        if (n >= 0 && n <= this.G.lastKey()) {
            return this.G.containsKey(n);
        }
        final StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(n);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @Override
    public final boolean b(final String anObject) {
        return "length".equals(anObject) || this.H.containsKey(anObject);
    }
    
    @Override
    public final q c() {
        final f f = new f();
        for (final Map.Entry<Integer, q> entry : this.G.entrySet()) {
            SortedMap<Integer, q> sortedMap;
            Integer n;
            q c;
            if (entry.getValue() instanceof m) {
                sortedMap = f.G;
                n = entry.getKey();
                c = entry.getValue();
            }
            else {
                sortedMap = f.G;
                n = entry.getKey();
                c = entry.getValue().c();
            }
            sortedMap.put(n, c);
        }
        return f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        if (this.n() != f.n()) {
            return false;
        }
        if (this.G.isEmpty()) {
            return f.G.isEmpty();
        }
        for (int i = this.G.firstKey(); i <= this.G.lastKey(); ++i) {
            if (!this.o(i).equals(f.o(i))) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final void f(final String s, final q q) {
        if (q == null) {
            this.H.remove(s);
            return;
        }
        this.H.put(s, q);
    }
    
    @Override
    public final Double g() {
        if (this.G.size() == 1) {
            return this.o(0).g();
        }
        if (this.G.size() <= 0) {
            return 0.0;
        }
        return Double.NaN;
    }
    
    @Override
    public final q h(final String anObject) {
        if ("length".equals(anObject)) {
            return new i((double)this.n());
        }
        if (this.b(anObject)) {
            final q q = this.H.get(anObject);
            if (q != null) {
                return q;
            }
        }
        return q.f;
    }
    
    @Override
    public final int hashCode() {
        return this.G.hashCode() * 31;
    }
    
    @Override
    public final q i(final String s, final g5 g5, final List<q> list) {
        if (!"concat".equals(s) && !"every".equals(s) && !"filter".equals(s) && !"forEach".equals(s) && !"indexOf".equals(s) && !"join".equals(s) && !"lastIndexOf".equals(s) && !"map".equals(s) && !"pop".equals(s) && !"push".equals(s) && !"reduce".equals(s) && !"reduceRight".equals(s) && !"reverse".equals(s) && !"shift".equals(s) && !"slice".equals(s) && !"some".equals(s) && !"sort".equals(s) && !"splice".equals(s) && !"toString".equals(s) && !"unshift".equals(s)) {
            return com.google.android.gms.internal.measurement.k.a(this, new u(s), g5, list);
        }
        return d0.a(s, this, g5, list);
    }
    
    @Override
    public final Iterator<q> iterator() {
        return new e(this);
    }
    
    @Override
    public final String k() {
        return this.q(",");
    }
    
    public final int l() {
        return this.G.size();
    }
    
    @Override
    public final Boolean m() {
        return Boolean.TRUE;
    }
    
    public final int n() {
        if (this.G.isEmpty()) {
            return 0;
        }
        return this.G.lastKey() + 1;
    }
    
    public final q o(final int i) {
        if (i < this.n()) {
            if (this.A(i)) {
                final q q = this.G.get(i);
                if (q != null) {
                    return q;
                }
            }
            return q.f;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }
    
    @Override
    public final Iterator<q> p() {
        return new d(this, this.G.keySet().iterator(), this.H.keySet().iterator());
    }
    
    public final String q(final String s) {
        String str = s;
        if (s == null) {
            str = "";
        }
        final StringBuilder sb = new StringBuilder();
        if (!this.G.isEmpty()) {
            for (int i = 0; i < this.n(); ++i) {
                final q o = this.o(i);
                sb.append(str);
                if (!(o instanceof v) && !(o instanceof o)) {
                    sb.append(o.k());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }
    
    public final Iterator<Integer> r() {
        return this.G.keySet().iterator();
    }
    
    public final List<q> t() {
        final ArrayList<q> list = new ArrayList<q>(this.n());
        for (int i = 0; i < this.n(); ++i) {
            list.add(this.o(i));
        }
        return list;
    }
    
    @Override
    public final String toString() {
        return this.q(",");
    }
    
    public final void v() {
        this.G.clear();
    }
    
    public final void w(final int i, final q q) {
        if (i < 0) {
            final StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid value index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i >= this.n()) {
            this.z(i, q);
            return;
        }
        for (int j = this.G.lastKey(); j >= i; --j) {
            final SortedMap<Integer, q> g = this.G;
            final Integer value = j;
            final q q2 = g.get(value);
            if (q2 != null) {
                this.z(j + 1, q2);
                this.G.remove(value);
            }
        }
        this.z(i, q);
    }
    
    public final void x(int n) {
        final int intValue = this.G.lastKey();
        if (n <= intValue) {
            if (n >= 0) {
                this.G.remove(n);
                int n2;
                if ((n2 = n) == intValue) {
                    final SortedMap<Integer, q> g = this.G;
                    final Integer value = --n;
                    if (!g.containsKey(value) && n >= 0) {
                        this.G.put(value, q.f);
                    }
                    return;
                }
                while (true) {
                    n = n2 + 1;
                    if (n > this.G.lastKey()) {
                        break;
                    }
                    final SortedMap<Integer, q> g2 = this.G;
                    final Integer value2 = n;
                    final q q = g2.get(value2);
                    n2 = n;
                    if (q == null) {
                        continue;
                    }
                    this.G.put(n - 1, q);
                    this.G.remove(value2);
                    n2 = n;
                }
            }
        }
    }
    
    @RequiresNonNull({ "elements" })
    public final void z(final int i, final q q) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            final StringBuilder sb = new StringBuilder(32);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (q == null) {
            this.G.remove(i);
            return;
        }
        this.G.put(i, q);
    }
}
