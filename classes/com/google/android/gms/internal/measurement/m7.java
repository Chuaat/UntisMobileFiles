// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Objects;
import c6.a;

final class m7<T> implements k7<T>
{
    @a
    volatile k7<T> G;
    volatile boolean H;
    @a
    T I;
    
    m7(final k7<T> k7) {
        Objects.requireNonNull(k7);
        this.G = k7;
    }
    
    @Override
    public final String toString() {
        Object obj;
        if ((obj = this.G) == null) {
            final String value = String.valueOf(this.I);
            final StringBuilder sb = new StringBuilder(value.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(value);
            sb.append(">");
            obj = sb.toString();
        }
        final String value2 = String.valueOf(obj);
        final StringBuilder sb2 = new StringBuilder(value2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(value2);
        sb2.append(")");
        return sb2.toString();
    }
    
    @Override
    public final T zza() {
        if (!this.H) {
            synchronized (this) {
                if (!this.H) {
                    final k7<T> g = this.G;
                    g.getClass();
                    final T zza = g.zza();
                    this.I = zza;
                    this.H = true;
                    this.G = null;
                    return zza;
                }
            }
        }
        return this.I;
    }
}
