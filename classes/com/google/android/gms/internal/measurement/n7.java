// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import c6.a;
import java.io.Serializable;

final class n7<T> implements Serializable, k7
{
    final T G;
    
    n7(final T g) {
        this.G = g;
    }
    
    @Override
    public final boolean equals(@a Object g) {
        if (g instanceof n7) {
            final n7 n7 = (n7)g;
            g = this.G;
            final T g2 = n7.G;
            return g == g2 || g.equals(g2);
        }
        return false;
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
