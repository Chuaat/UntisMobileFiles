// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.io.Serializable;

final class n1<T> implements l1<T>, Serializable
{
    private final l1<T> G;
    private transient volatile boolean H;
    @NullableDecl
    private transient T I;
    
    n1(final l1<T> l1) {
        this.G = k1.b(l1);
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
