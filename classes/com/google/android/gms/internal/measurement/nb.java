// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.Iterator;

final class nb implements Iterator<Map.Entry>
{
    private int G = -1;
    private boolean H;
    private Iterator<Map.Entry> I;
    final /* synthetic */ rb J;
    
    private final Iterator<Map.Entry> a() {
        if (this.I == null) {
            this.I = (Iterator<Map.Entry>)rb.h((rb<Comparable, Object>)this.J).entrySet().iterator();
        }
        return this.I;
    }
    
    @Override
    public final boolean hasNext() {
        final int g = this.G;
        boolean b = true;
        if (g + 1 >= rb.f((rb<Comparable, Object>)this.J).size()) {
            if (!rb.h((rb<Comparable, Object>)this.J).isEmpty()) {
                if (!this.a().hasNext()) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    @Override
    public final void remove() {
        if (!this.H) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.H = false;
        rb.i((rb<Comparable, Object>)this.J);
        if (this.G < rb.f((rb<Comparable, Object>)this.J).size()) {
            rb.d((rb<Comparable, Object>)this.J, this.G--);
            return;
        }
        this.a().remove();
    }
}
