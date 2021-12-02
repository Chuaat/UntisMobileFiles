// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public final class g7 extends v4<String> implements j7, RandomAccess
{
    private static final g7 I;
    private static final j7 J;
    private final List<Object> H;
    
    static {
        final g7 g7 = new g7();
        (I = g7).zzb();
        J = g7;
    }
    
    public g7() {
        this(10);
    }
    
    public g7(final int initialCapacity) {
        this(new ArrayList<Object>(initialCapacity));
    }
    
    private g7(final ArrayList<Object> h) {
        this.H = h;
    }
    
    private static String f(final Object o) {
        if (o instanceof String) {
            return (String)o;
        }
        if (o instanceof f5) {
            return ((f5)o).x();
        }
        return t6.i((byte[])o);
    }
    
    @Override
    public final boolean addAll(final int n, final Collection<? extends String> collection) {
        this.b();
        Object c = collection;
        if (collection instanceof j7) {
            c = ((j7)collection).c();
        }
        final boolean addAll = this.H.addAll(n, (Collection<?>)c);
        ++super.modCount;
        return addAll;
    }
    
    @Override
    public final boolean addAll(final Collection<? extends String> collection) {
        return this.addAll(this.size(), collection);
    }
    
    @Override
    public final List<?> c() {
        return Collections.unmodifiableList((List<?>)this.H);
    }
    
    @Override
    public final void clear() {
        this.b();
        this.H.clear();
        ++super.modCount;
    }
    
    @Override
    public final j7 e() {
        if (this.zza()) {
            return new p9(this);
        }
        return this;
    }
    
    @Override
    public final void q4(final f5 f5) {
        this.b();
        this.H.add(f5);
        ++super.modCount;
    }
    
    @Override
    public final Object s(final int n) {
        return this.H.get(n);
    }
    
    @Override
    public final int size() {
        return this.H.size();
    }
}
