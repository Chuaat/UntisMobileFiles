// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.server.converter;

import java.util.Iterator;
import java.util.List;
import android.os.Parcelable;
import h2.c;
import android.os.Parcel;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.k0;
import java.util.ArrayList;
import android.util.SparseArray;
import java.util.HashMap;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;

@f2.a
@d.a(creator = "StringToIntConverterCreator")
public final class a extends a implements a.b<String, Integer>
{
    @RecentlyNonNull
    public static final Parcelable$Creator<a> CREATOR;
    @g(id = 1)
    private final int G;
    private final HashMap<String, Integer> H;
    private final SparseArray<String> I;
    @k0
    @c(getter = "getSerializedMap", id = 2)
    private final ArrayList<a> J;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    @f2.a
    public a() {
        this.G = 1;
        this.H = new HashMap<String, Integer>();
        this.I = (SparseArray<String>)new SparseArray();
        this.J = null;
    }
    
    @d.b
    a(@e(id = 1) int i, @e(id = 2) final ArrayList<a> list) {
        this.G = i;
        this.H = new HashMap<String, Integer>();
        this.I = (SparseArray<String>)new SparseArray();
        this.J = null;
        final int size = list.size();
        i = 0;
        while (i < size) {
            final a value = list.get(i);
            ++i;
            final a a = value;
            this.M(a.H, a.I);
        }
    }
    
    @RecentlyNonNull
    @f2.a
    public final a M(@RecentlyNonNull final String key, @RecentlyNonNull final int i) {
        this.H.put(key, i);
        this.I.put(i, (Object)key);
        return this;
    }
    
    @RecentlyNonNull
    @Override
    public final int b() {
        return 7;
    }
    
    @RecentlyNonNull
    @Override
    public final int f() {
        return 0;
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull int a) {
        a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        final ArrayList<Parcelable> list = new ArrayList<Parcelable>();
        for (final String key : this.H.keySet()) {
            list.add((Parcelable)new a(key, this.H.get(key)));
        }
        h2.c.c0(parcel, 2, list, false);
        h2.c.b(parcel, a);
    }
    
    @h2.d.a(creator = "StringToIntConverterEntryCreator")
    public static final class a extends h2.a
    {
        public static final Parcelable$Creator<a> CREATOR;
        @g(id = 1)
        private final int G;
        @c(id = 2)
        final String H;
        @c(id = 3)
        final int I;
        
        static {
            CREATOR = (Parcelable$Creator)new com.google.android.gms.common.server.converter.e();
        }
        
        @d.b
        a(@e(id = 1) final int g, @e(id = 2) final String h, @e(id = 3) final int i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        a(final String h, final int i) {
            this.G = 1;
            this.H = h;
            this.I = i;
        }
        
        public final void writeToParcel(final Parcel parcel, int a) {
            a = h2.c.a(parcel);
            h2.c.F(parcel, 1, this.G);
            h2.c.X(parcel, 2, this.H, false);
            h2.c.F(parcel, 3, this.I);
            h2.c.b(parcel, a);
        }
    }
}
