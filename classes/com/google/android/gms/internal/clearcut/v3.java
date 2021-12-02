// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Map;
import java.util.Iterator;

final class v3 implements Iterator<Map.Entry<Object, Object>>
{
    private int G;
    private boolean H;
    private Iterator<Map.Entry<Object, Object>> I;
    private final /* synthetic */ n3 J;
    
    private v3(final n3 j) {
        this.J = j;
        this.G = -1;
    }
    
    private final Iterator<Map.Entry<Object, Object>> a() {
        if (this.I == null) {
            this.I = this.J.I.entrySet().iterator();
        }
        return this.I;
    }
    
    @Override
    public final boolean hasNext() {
        return this.G + 1 < this.J.H.size() || (!this.J.I.isEmpty() && this.a().hasNext());
    }
    
    @Override
    public final void remove() {
        if (!this.H) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.H = false;
        this.J.q();
        if (this.G < this.J.H.size()) {
            this.J.h(this.G--);
            return;
        }
        this.a().remove();
    }
}
