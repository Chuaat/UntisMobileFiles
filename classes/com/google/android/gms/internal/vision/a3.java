// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class a3<K> extends q2<K>
{
    private final transient m2<K, ?> I;
    private final transient l2<K> J;
    
    a3(final m2<K, ?> i, final l2<K> j) {
        this.I = i;
        this.J = j;
    }
    
    @Override
    final int b(final Object[] array, final int n) {
        return this.l().b(array, n);
    }
    
    @Override
    public final boolean contains(@NullableDecl final Object o) {
        return this.I.get(o) != null;
    }
    
    @Override
    public final i3<K> f() {
        return (i3<K>)this.l().iterator();
    }
    
    @Override
    public final l2<K> l() {
        return this.J;
    }
    
    @Override
    final boolean m() {
        return true;
    }
    
    @Override
    public final int size() {
        return this.I.size();
    }
}
