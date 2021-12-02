// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public final class y9 extends r7<String> implements RandomAccess, z9
{
    private static final y9 I;
    public static final z9 J;
    private final List<Object> H;
    
    static {
        final y9 y9 = new y9(10);
        (I = y9).zzb();
        J = y9;
    }
    
    public y9() {
        this(10);
    }
    
    public y9(final int initialCapacity) {
        final ArrayList<Object> h = new ArrayList<Object>(initialCapacity);
        this.H = h;
    }
    
    private y9(final ArrayList<Object> h) {
        this.H = h;
    }
    
    private static String h(final Object o) {
        if (o instanceof String) {
            return (String)o;
        }
        if (o instanceof h8) {
            return ((h8)o).t(s9.a);
        }
        return s9.h((byte[])o);
    }
    
    @Override
    public final Object J1(final int n) {
        return this.H.get(n);
    }
    
    @Override
    public final boolean addAll(final int n, final Collection<? extends String> collection) {
        this.b();
        Object g = collection;
        if (collection instanceof z9) {
            g = ((z9)collection).g();
        }
        final boolean addAll = this.H.addAll(n, (Collection<?>)g);
        ++super.modCount;
        return addAll;
    }
    
    @Override
    public final boolean addAll(final Collection<? extends String> collection) {
        return this.addAll(this.size(), collection);
    }
    
    @Override
    public final void clear() {
        this.b();
        this.H.clear();
        ++super.modCount;
    }
    
    @Override
    public final z9 e() {
        if (this.a()) {
            return new ac(this);
        }
        return this;
    }
    
    public final String f(final int n) {
        final byte[] value = this.H.get(n);
        if (value instanceof String) {
            return (String)(Object)value;
        }
        if (value instanceof h8) {
            final h8 h8 = (Object)value;
            final String t = h8.t(s9.a);
            if (h8.n()) {
                this.H.set(n, t);
            }
            return t;
        }
        final byte[] array = value;
        final String h9 = s9.h(array);
        if (s9.i(array)) {
            this.H.set(n, h9);
        }
        return h9;
    }
    
    @Override
    public final List<?> g() {
        return Collections.unmodifiableList((List<?>)this.H);
    }
    
    @Override
    public final int size() {
        return this.H.size();
    }
    
    @Override
    public final void x2(final h8 h8) {
        this.b();
        this.H.add(h8);
        ++super.modCount;
    }
}
