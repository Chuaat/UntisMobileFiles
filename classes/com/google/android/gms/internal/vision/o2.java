// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.io.Serializable;

public class o2<K, V> extends t1<K, V> implements Serializable
{
    private final transient m2<K, ? extends i2<V>> H;
    private final transient int I;
    
    o2(final m2<K, ? extends i2<V>> h, final int i) {
        this.H = h;
        this.I = i;
    }
    
    @Override
    public final boolean a(@NullableDecl final Object o) {
        return o != null && super.a(o);
    }
    
    @Override
    final Map<K, Collection<V>> b() {
        throw new AssertionError((Object)"should never be called");
    }
}
