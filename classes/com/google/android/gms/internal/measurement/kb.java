// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Map;

final class kb implements Entry, Comparable<kb>
{
    private final Comparable G;
    private Object H;
    final /* synthetic */ rb I;
    
    kb(final rb i, final Comparable g, final Object h) {
        this.I = i;
        this.G = g;
        this.H = h;
    }
    
    private static final boolean d(final Object o, final Object obj) {
        boolean equals;
        if (o == null) {
            if (obj == null) {
                return true;
            }
            equals = false;
        }
        else {
            equals = o.equals(obj);
        }
        return equals;
    }
    
    public final Comparable b() {
        return this.G;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Entry)) {
            return false;
        }
        final Entry entry = (Entry)o;
        return d(this.G, entry.getKey()) && d(this.H, entry.getValue());
    }
    
    @Override
    public final Object getValue() {
        return this.H;
    }
    
    @Override
    public final int hashCode() {
        final Comparable g = this.G;
        int hashCode = 0;
        int hashCode2;
        if (g == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = g.hashCode();
        }
        final Object h = this.H;
        if (h != null) {
            hashCode = h.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public final Object setValue(final Object h) {
        rb.i((rb<Comparable, Object>)this.I);
        final Object h2 = this.H;
        this.H = h;
        return h2;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.G);
        final String value2 = String.valueOf(this.H);
        final StringBuilder sb = new StringBuilder(value.length() + 1 + value2.length());
        sb.append(value);
        sb.append("=");
        sb.append(value2);
        return sb.toString();
    }
}
