// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class j1<T> extends d1<T>
{
    private final T G;
    
    j1(final T g) {
        this.G = g;
    }
    
    @Override
    public final boolean b() {
        return true;
    }
    
    @Override
    public final T c() {
        return this.G;
    }
    
    @Override
    public final boolean equals(@NullableDecl final Object o) {
        return o instanceof j1 && this.G.equals(((j1)o).G);
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
