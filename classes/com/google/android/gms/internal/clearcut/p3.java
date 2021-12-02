// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.List;
import java.util.Map;
import java.util.Iterator;

final class p3 implements Iterator<Map.Entry<Object, Object>>
{
    private int G;
    private Iterator<Map.Entry<Object, Object>> H;
    private final /* synthetic */ n3 I;
    
    private p3(final n3 i) {
        this.I = i;
        this.G = i.H.size();
    }
    
    private final Iterator<Map.Entry<Object, Object>> a() {
        if (this.H == null) {
            this.H = this.I.L.entrySet().iterator();
        }
        return this.H;
    }
    
    @Override
    public final boolean hasNext() {
        final int g = this.G;
        return (g > 0 && g <= this.I.H.size()) || this.a().hasNext();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
