// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import java.util.GregorianCalendar;
import android.content.Context;
import java.util.Arrays;
import android.os.Parcel;
import androidx.annotation.k0;
import androidx.annotation.j0;
import java.util.Calendar;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class m implements Comparable<m>, Parcelable
{
    public static final Parcelable$Creator<m> CREATOR;
    @j0
    private final Calendar G;
    final int H;
    final int I;
    final int J;
    final int K;
    final long L;
    @k0
    private String M;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<m>() {
            @j0
            public m a(@j0 final Parcel parcel) {
                return m.d(parcel.readInt(), parcel.readInt());
            }
            
            @j0
            public m[] b(final int n) {
                return new m[n];
            }
        };
    }
    
    private m(@j0 Calendar f) {
        f.set(5, 1);
        f = u.f(f);
        this.G = f;
        this.H = f.get(2);
        this.I = f.get(1);
        this.J = f.getMaximum(7);
        this.K = f.getActualMaximum(5);
        this.L = f.getTimeInMillis();
    }
    
    @j0
    static m d(final int value, final int value2) {
        final Calendar v = u.v();
        v.set(1, value);
        v.set(2, value2);
        return new m(v);
    }
    
    @j0
    static m f(final long timeInMillis) {
        final Calendar v = u.v();
        v.setTimeInMillis(timeInMillis);
        return new m(v);
    }
    
    @j0
    static m g() {
        return new m(u.t());
    }
    
    public int b(@j0 final m m) {
        return this.G.compareTo(m.G);
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
        if (!(o instanceof m)) {
            return false;
        }
        final m m = (m)o;
        if (this.H != m.H || this.I != m.I) {
            b = false;
        }
        return b;
    }
    
    int h() {
        int n2;
        final int n = n2 = this.G.get(7) - this.G.getFirstDayOfWeek();
        if (n < 0) {
            n2 = n + this.J;
        }
        return n2;
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[] { this.H, this.I });
    }
    
    long i(final int value) {
        final Calendar f = u.f(this.G);
        f.set(5, value);
        return f.getTimeInMillis();
    }
    
    int j(final long timeInMillis) {
        final Calendar f = u.f(this.G);
        f.setTimeInMillis(timeInMillis);
        return f.get(5);
    }
    
    @j0
    String k(final Context context) {
        if (this.M == null) {
            this.M = g.i(context, this.G.getTimeInMillis());
        }
        return this.M;
    }
    
    long l() {
        return this.G.getTimeInMillis();
    }
    
    @j0
    m m(final int n) {
        final Calendar f = u.f(this.G);
        f.add(2, n);
        return new m(f);
    }
    
    int o(@j0 final m m) {
        if (this.G instanceof GregorianCalendar) {
            return (m.I - this.I) * 12 + (m.H - this.H);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
    
    public void writeToParcel(@j0 final Parcel parcel, final int n) {
        parcel.writeInt(this.I);
        parcel.writeInt(this.H);
    }
}
