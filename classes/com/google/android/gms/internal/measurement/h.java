// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class h implements q
{
    private final q G;
    private final String H;
    
    public h() {
        throw null;
    }
    
    public h(final String h) {
        this.G = q.f;
        this.H = h;
    }
    
    public h(final String h, final q g) {
        this.G = g;
        this.H = h;
    }
    
    public final q a() {
        return this.G;
    }
    
    public final String b() {
        return this.H;
    }
    
    @Override
    public final q c() {
        return new h(this.H, this.G.c());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof h)) {
            return false;
        }
        final String h = this.H;
        final h h2 = (h)o;
        return h.equals(h2.H) && this.G.equals(h2.G);
    }
    
    @Override
    public final Double g() {
        throw new IllegalStateException("Control is not a double");
    }
    
    @Override
    public final int hashCode() {
        return this.H.hashCode() * 31 + this.G.hashCode();
    }
    
    @Override
    public final q i(final String s, final g5 g5, final List<q> list) {
        throw new IllegalStateException("Control does not have functions");
    }
    
    @Override
    public final String k() {
        throw new IllegalStateException("Control is not a String");
    }
    
    @Override
    public final Boolean m() {
        throw new IllegalStateException("Control is not a boolean");
    }
    
    @Override
    public final Iterator<q> p() {
        return null;
    }
}
