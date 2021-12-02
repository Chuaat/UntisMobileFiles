// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class e2 extends r1<Object, Object>
{
    @NullableDecl
    private final G;
    private int H;
    private final /* synthetic */ v1 I;
    
    e2(final v1 i, final int h) {
        this.I = i;
        this.G = i.I[h];
        this.H = h;
    }
    
    private final void a() {
        final int h = this.H;
        if (h == -1 || h >= this.I.size() || !e1.a(this.G, this.I.I[this.H])) {
            this.H = this.I.d(this.G);
        }
    }
    
    @NullableDecl
    @Override
    public final Object getKey() {
        return this.G;
    }
    
    @NullableDecl
    @Override
    public final Object getValue() {
        final Map<K, Object> n = this.I.n();
        if (n != null) {
            return n.get(this.G);
        }
        this.a();
        final int h = this.H;
        if (h == -1) {
            return null;
        }
        return this.I.J[h];
    }
    
    @Override
    public final Object setValue(final Object o) {
        final Map<Object, Object> n = this.I.n();
        if (n != null) {
            return n.put(this.G, o);
        }
        this.a();
        final int h = this.H;
        if (h == -1) {
            this.I.put(this.G, o);
            return null;
        }
        final Object[] j = this.I.J;
        final Object o2 = j[h];
        j[h] = o;
        return o2;
    }
}
