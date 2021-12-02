// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Map;

final class c9 implements Comparable<c9>, Entry<Object, Object>
{
    private final G;
    private H;
    private final /* synthetic */ x8 I;
    
    c9(final x8 i, final Comparable g, final Object h) {
        this.I = i;
        this.G = g;
        this.H = h;
    }
    
    c9(final x8 x8, final Entry<Object, Object> entry) {
        this(x8, entry.getKey(), entry.getValue());
    }
    
    private static boolean b(final Object o, final Object obj) {
        if (o == null) {
            return obj == null;
        }
        return o.equals(obj);
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
        return b(this.G, entry.getKey()) && b(this.H, entry.getValue());
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
        this.I.r();
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
