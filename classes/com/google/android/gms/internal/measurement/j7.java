// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import c6.a;

final class j7<T> extends h7<T>
{
    private final T G;
    
    j7(final T g) {
        this.G = g;
    }
    
    @Override
    public final T a() {
        return this.G;
    }
    
    @Override
    public final boolean b() {
        return true;
    }
    
    @Override
    public final boolean equals(@a final Object o) {
        return o instanceof j7 && this.G.equals(((j7)o).G);
    }
    
    @Override
    public final int hashCode() {
        return this.G.hashCode() + 1502476572;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.G);
        final StringBuilder sb = new StringBuilder(value.length() + 13);
        sb.append("Optional.of(");
        sb.append(value);
        sb.append(")");
        return sb.toString();
    }
}
