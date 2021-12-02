// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import androidx.core.util.n;
import java.util.ArrayList;
import android.os.Parcel;
import java.util.Iterator;
import java.util.List;
import androidx.annotation.j0;
import android.os.Parcelable$Creator;

public final class d implements c
{
    public static final Parcelable$Creator<d> CREATOR;
    private static final int I = 1;
    private static final int J = 2;
    private static final d K;
    private static final d L;
    @j0
    private final d G;
    @j0
    private final List<c> H;
    
    static {
        K = (d)new d() {
            @Override
            public boolean a(@j0 final List<c> list, final long n) {
                for (final c c : list) {
                    if (c == null) {
                        continue;
                    }
                    if (c.S3(n)) {
                        return true;
                    }
                }
                return false;
            }
            
            @Override
            public int b() {
                return 1;
            }
        };
        L = (d)new d() {
            @Override
            public boolean a(@j0 final List<c> list, final long n) {
                for (final c c : list) {
                    if (c == null) {
                        continue;
                    }
                    if (!c.S3(n)) {
                        return false;
                    }
                }
                return true;
            }
            
            @Override
            public int b() {
                return 2;
            }
        };
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<d>() {
            @j0
            public d a(@j0 final Parcel parcel) {
                final ArrayList arrayList = parcel.readArrayList(c.class.getClassLoader());
                final int int1 = parcel.readInt();
                d d;
                if (int1 != 2 && int1 == 1) {
                    d = com.google.android.material.datepicker.d.K;
                }
                else {
                    d = com.google.android.material.datepicker.d.L;
                }
                return new d(n.g(arrayList), d, null);
            }
            
            @j0
            public d[] b(final int n) {
                return new d[n];
            }
        };
    }
    
    private d(@j0 final List<c> h, final d g) {
        this.H = h;
        this.G = g;
    }
    
    @j0
    public static c c(@j0 final List<c> list) {
        return new d(list, d.L);
    }
    
    @j0
    public static c d(@j0 final List<c> list) {
        return new d(list, d.K);
    }
    
    @Override
    public boolean S3(final long n) {
        return this.G.a(this.H, n);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        if (!this.H.equals(d.H) || this.G.b() != d.G.b()) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return this.H.hashCode();
    }
    
    public void writeToParcel(@j0 final Parcel parcel, final int n) {
        parcel.writeList((List)this.H);
        parcel.writeInt(this.G.b());
    }
    
    private interface d
    {
        boolean a(@j0 final List<c> p0, final long p1);
        
        int b();
    }
}
