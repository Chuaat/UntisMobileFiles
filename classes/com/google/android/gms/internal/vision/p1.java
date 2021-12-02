// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.io.Serializable;

final class p1<T> implements l1<T>, Serializable
{
    @NullableDecl
    private final T G;
    
    p1(@NullableDecl final T g) {
        this.G = g;
    }
    
    @Override
    public final boolean equals(@NullableDecl final Object o) {
        return o instanceof p1 && e1.a(this.G, ((p1)o).G);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.G });
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.G);
        final StringBuilder sb = new StringBuilder(value.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(value);
        sb.append(")");
        return sb.toString();
    }
    
    @Override
    public final T zza() {
        return this.G;
    }
}
