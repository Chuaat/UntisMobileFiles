// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class q1<T> implements l1<T>
{
    private volatile l1<T> G;
    private volatile boolean H;
    @NullableDecl
    private T I;
    
    q1(final l1<T> l1) {
        this.G = k1.b(l1);
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
                    final T zza = this.G.zza();
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
