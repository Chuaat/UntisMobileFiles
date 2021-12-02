// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

final class g3<E> extends w<E>
{
    private static final g3<Object> I;
    private final List<E> H;
    
    static {
        (I = new g3<Object>()).V();
    }
    
    g3() {
        this((List)new ArrayList(10));
    }
    
    private g3(final List<E> h) {
        this.H = h;
    }
    
    public static <E> g3<E> f() {
        return (g3<E>)g3.I;
    }
    
    @Override
    public final void add(final int n, final E e) {
        this.b();
        this.H.add(n, e);
        ++super.modCount;
    }
    
    @Override
    public final E get(final int n) {
        return this.H.get(n);
    }
    
    @Override
    public final E remove(final int n) {
        this.b();
        final E remove = this.H.remove(n);
        ++super.modCount;
        return remove;
    }
    
    @Override
    public final E set(final int n, final E e) {
        this.b();
        final E set = this.H.set(n, e);
        ++super.modCount;
        return set;
    }
    
    @Override
    public final int size() {
        return this.H.size();
    }
}
