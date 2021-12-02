// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.help;

import androidx.annotation.j0;
import android.os.Parcel;
import androidx.annotation.e0;
import androidx.annotation.y;
import android.os.Parcelable$Creator;
import java.io.Serializable;
import android.os.Parcelable;

public class b implements Parcelable, Serializable
{
    public static final Parcelable$Creator<b> CREATOR;
    private j G;
    private k H;
    @y
    private int I;
    @e0
    private int J;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<b>() {
            public b a(final Parcel parcel) {
                return new b(parcel);
            }
            
            public b[] b(final int n) {
                return new b[n];
            }
        };
    }
    
    public b(@e0 final int j) {
        this.J = j;
    }
    
    public b(@y final int i, @e0 final int j, @j0 final k h) {
        this.I = i;
        this.J = j;
        this.H = h;
    }
    
    protected b(final Parcel parcel) {
        this.G = (j)parcel.readValue(this.getClass().getClassLoader());
        this.I = parcel.readInt();
        this.J = parcel.readInt();
    }
    
    public j a() {
        return this.G;
    }
    
    public k b() {
        return this.H;
    }
    
    @e0
    public int c() {
        return this.J;
    }
    
    @y
    public int d() {
        return this.I;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void e(final j g) {
        this.G = g;
    }
    
    public void f(@j0 final k h) {
        this.H = h;
    }
    
    public void g(@e0 final int j) {
        this.J = j;
    }
    
    public void h(@y final int i) {
        this.I = i;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeValue((Object)this.G);
        parcel.writeInt(this.I);
        parcel.writeInt(this.J);
    }
}
