// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.util.ListIterator;
import java.util.Collections;
import java.util.Iterator;
import org.bson.codecs.s0;
import org.bson.json.w;
import org.bson.codecs.g;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class n extends y0 implements List<y0>, Cloneable
{
    private final List<y0> G;
    
    public n() {
        this(new ArrayList<y0>(), false);
    }
    
    public n(final List<? extends y0> list) {
        this(list, true);
    }
    
    n(final List<? extends y0> list, final boolean b) {
        if (b) {
            this.G = new ArrayList<y0>(list);
        }
        else {
            this.G = (List<y0>)list;
        }
    }
    
    public static n h1(final String s) {
        return new g().e(new w(s), s0.a().a());
    }
    
    public void X0(final int n, final y0 y0) {
        this.G.add(n, y0);
    }
    
    public boolean Y0(final y0 y0) {
        return this.G.add(y0);
    }
    
    public n Z0() {
        final n n = new n();
        for (y0 y0 : this) {
            final int n2 = n$a.a[y0.t0().ordinal()];
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 == 4) {
                            y0 = i0.X0(y0.c0());
                        }
                    }
                    else {
                        y0 = o.Z0(y0.i());
                    }
                }
                else {
                    y0 = y0.f().Z0();
                }
            }
            else {
                y0 = y0.I().Z0();
            }
            n.Y0(y0);
        }
        return n;
    }
    
    @Override
    public boolean addAll(final int n, final Collection<? extends y0> collection) {
        return this.G.addAll(n, collection);
    }
    
    @Override
    public boolean addAll(final Collection<? extends y0> collection) {
        return this.G.addAll(collection);
    }
    
    public y0 b1(final int n) {
        return this.G.get(n);
    }
    
    public List<y0> c1() {
        return Collections.unmodifiableList((List<? extends y0>)this.G);
    }
    
    @Override
    public void clear() {
        this.G.clear();
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.G.contains(o);
    }
    
    @Override
    public boolean containsAll(final Collection<?> collection) {
        return this.G.containsAll(collection);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof n && this.c1().equals(((n)o).c1()));
    }
    
    @Override
    public int hashCode() {
        return this.G.hashCode();
    }
    
    public y0 i1(final int n) {
        return this.G.remove(n);
    }
    
    @Override
    public int indexOf(final Object o) {
        return this.G.indexOf(o);
    }
    
    @Override
    public boolean isEmpty() {
        return this.G.isEmpty();
    }
    
    @Override
    public Iterator<y0> iterator() {
        return this.G.iterator();
    }
    
    public y0 j1(final int n, final y0 y0) {
        return this.G.set(n, y0);
    }
    
    @Override
    public int lastIndexOf(final Object o) {
        return this.G.lastIndexOf(o);
    }
    
    @Override
    public ListIterator<y0> listIterator() {
        return this.G.listIterator();
    }
    
    @Override
    public ListIterator<y0> listIterator(final int n) {
        return this.G.listIterator(n);
    }
    
    @Override
    public boolean remove(final Object o) {
        return this.G.remove(o);
    }
    
    @Override
    public boolean removeAll(final Collection<?> collection) {
        return this.G.removeAll(collection);
    }
    
    @Override
    public boolean retainAll(final Collection<?> collection) {
        return this.G.retainAll(collection);
    }
    
    @Override
    public int size() {
        return this.G.size();
    }
    
    @Override
    public List<y0> subList(final int n, final int n2) {
        return this.G.subList(n, n2);
    }
    
    @Override
    public w0 t0() {
        return w0.L;
    }
    
    @Override
    public Object[] toArray() {
        return this.G.toArray();
    }
    
    @Override
    public <T> T[] toArray(final T[] array) {
        return this.G.toArray(array);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BsonArray{values=");
        sb.append(this.G);
        sb.append('}');
        return sb.toString();
    }
}
