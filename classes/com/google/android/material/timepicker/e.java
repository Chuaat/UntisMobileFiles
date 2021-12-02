// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.timepicker;

import androidx.annotation.b0;
import java.util.Arrays;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

class e implements Parcelable
{
    public static final Parcelable$Creator<e> CREATOR;
    public static final String N = "%02d";
    public static final String O = "%d";
    private final b G;
    private final b H;
    final int I;
    int J;
    int K;
    int L;
    int M;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<e>() {
            public e a(final Parcel parcel) {
                return new e(parcel);
            }
            
            public e[] b(final int n) {
                return new e[n];
            }
        };
    }
    
    public e() {
        this(0);
    }
    
    public e(final int n) {
        this(0, 0, 10, n);
    }
    
    public e(int j, final int k, final int l, final int i) {
        this.J = j;
        this.K = k;
        this.L = l;
        this.I = i;
        this.M = f(j);
        this.G = new b(59);
        if (i == 1) {
            j = 24;
        }
        else {
            j = 12;
        }
        this.H = new b(j);
    }
    
    protected e(final Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
    
    public static String a(final Resources resources, final CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }
    
    public static String b(final Resources resources, final CharSequence obj, final String format) {
        return String.format(resources.getConfiguration().locale, format, Integer.parseInt(String.valueOf(obj)));
    }
    
    private static int f(int n) {
        if (n >= 12) {
            n = 1;
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public int c() {
        if (this.I == 1) {
            return this.J % 24;
        }
        final int j = this.J;
        if (j % 12 == 0) {
            return 12;
        }
        int n = j;
        if (this.M == 1) {
            n = j - 12;
        }
        return n;
    }
    
    public b d() {
        return this.H;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public b e() {
        return this.G;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        if (this.J != e.J || this.K != e.K || this.I != e.I || this.L != e.L) {
            b = false;
        }
        return b;
    }
    
    public void g(final int j) {
        if (this.I == 1) {
            this.J = j;
            return;
        }
        int n = 12;
        if (this.M != 1) {
            n = 0;
        }
        this.J = j % 12 + n;
    }
    
    public void h(final int j) {
        this.M = f(j);
        this.J = j;
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[] { this.I, this.J, this.K, this.L });
    }
    
    public void i(@b0(from = 0L, to = 60L) final int n) {
        this.K = n % 60;
    }
    
    public void j(int n) {
        if (n != this.M) {
            this.M = n;
            final int j = this.J;
            if (j < 12 && n == 1) {
                n = j + 12;
            }
            else {
                if (j < 12 || n != 0) {
                    return;
                }
                n = j - 12;
            }
            this.J = n;
        }
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.J);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
        parcel.writeInt(this.I);
    }
}
