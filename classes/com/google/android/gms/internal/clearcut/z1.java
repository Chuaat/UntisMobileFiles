// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public final class z1 extends w<String> implements a2, RandomAccess
{
    private static final z1 I;
    private static final a2 J;
    private final List<Object> H;
    
    static {
        final z1 z1 = new z1();
        (I = z1).V();
        J = z1;
    }
    
    public z1() {
        this(10);
    }
    
    public z1(final int initialCapacity) {
        this(new ArrayList<Object>(initialCapacity));
    }
    
    private z1(final ArrayList<Object> h) {
        this.H = h;
    }
    
    private static String f(final Object o) {
        if (o instanceof String) {
            return (String)o;
        }
        if (o instanceof d0) {
            return ((d0)o).r();
        }
        return l1.h((byte[])o);
    }
    
    @Override
    public final boolean addAll(final int n, final Collection<? extends String> collection) {
        this.b();
        Object y = collection;
        if (collection instanceof a2) {
            y = ((a2)collection).y();
        }
        final boolean addAll = this.H.addAll(n, (Collection<?>)y);
        ++super.modCount;
        return addAll;
    }
    
    @Override
    public final boolean addAll(final Collection<? extends String> collection) {
        return this.addAll(this.size(), collection);
    }
    
    @Override
    public final a2 c5() {
        if (this.Q()) {
            return new g4(this);
        }
        return this;
    }
    
    @Override
    public final void clear() {
        this.b();
        this.H.clear();
        ++super.modCount;
    }
    
    @Override
    public final Object q5(final int n) {
        return this.H.get(n);
    }
    
    @Override
    public final int size() {
        return this.H.size();
    }
    
    @Override
    public final List<?> y() {
        return Collections.unmodifiableList((List<?>)this.H);
    }
}
