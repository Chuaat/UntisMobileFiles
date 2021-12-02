// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Objects;
import c6.a;
import java.io.Serializable;

final class l7<T> implements Serializable, k7
{
    final k7<T> G;
    transient volatile boolean H;
    @a
    transient T I;
    
    l7(final k7<T> k7) {
        Objects.requireNonNull(k7);
        this.G = k7;
    }
    
    @Override
    public final String toString() {
        Object obj;
        if (this.H) {
            final String value = String.valueOf(this.I);
            final StringBuilder sb = new StringBuilder(value.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(value);
            sb.append(">");
            obj = sb.toString();
        }
        else {
            obj = this.G;
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
                    final T zza = this.G.zza();
                    this.I = zza;
                    this.H = true;
                    return zza;
                }
            }
        }
        return this.I;
    }
}
