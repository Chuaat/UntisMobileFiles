// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import h2.c;
import android.os.Parcel;
import java.util.Iterator;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "EventParamsCreator")
@f({ 1 })
public final class s extends a implements Iterable<String>
{
    public static final Parcelable$Creator<s> CREATOR;
    @c(getter = "z", id = 2)
    private final Bundle G;
    
    static {
        CREATOR = (Parcelable$Creator)new t();
    }
    
    @b
    s(@e(id = 2) final Bundle g) {
        this.G = g;
    }
    
    final String N2(final String s) {
        return this.G.getString(s);
    }
    
    final Long Q1(final String s) {
        return this.G.getLong("value");
    }
    
    public final Bundle g1() {
        return new Bundle(this.G);
    }
    
    @Override
    public final Iterator<String> iterator() {
        return new r(this);
    }
    
    final Object j2(final String s) {
        return this.G.get(s);
    }
    
    final Double q1(final String s) {
        return this.G.getDouble("value");
    }
    
    @Override
    public final String toString() {
        return this.G.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.k(parcel, 2, this.g1(), false);
        h2.c.b(parcel, a);
    }
    
    public final int zza() {
        return this.G.size();
    }
}
