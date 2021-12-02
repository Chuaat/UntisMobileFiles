// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.views;

import android.graphics.Paint;
import androidx.annotation.j0;
import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class d extends c
{
    public static final Parcelable$Creator<d> CREATOR;
    private final float G;
    private final float H;
    private final float I;
    private final float J;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<d>() {
            public d a(final Parcel parcel) {
                return new d(parcel);
            }
            
            public d[] b(final int n) {
                return new d[n];
            }
        };
    }
    
    public d(final float g, final float h, final float i, final float j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    protected d(final Parcel parcel) {
        this.G = parcel.readFloat();
        this.H = parcel.readFloat();
        this.I = parcel.readFloat();
        this.J = parcel.readFloat();
    }
    
    public float a() {
        return this.J;
    }
    
    public float b() {
        return this.G;
    }
    
    public float c() {
        return this.I;
    }
    
    public float d() {
        return this.H;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void draw(@j0 final Canvas canvas, @j0 final Paint paint) {
        canvas.drawRect(this.G, this.H, this.I, this.J, paint);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeFloat(this.G);
        parcel.writeFloat(this.H);
        parcel.writeFloat(this.I);
        parcel.writeFloat(this.J);
    }
}
