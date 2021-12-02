// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.views;

import android.graphics.Paint;
import android.graphics.Canvas;
import androidx.annotation.j0;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class a extends c
{
    public static final Parcelable$Creator<a> CREATOR;
    private final float G;
    private final float H;
    private final float I;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
            public a a(final Parcel parcel) {
                return new a(parcel);
            }
            
            public a[] b(final int n) {
                return new a[n];
            }
        };
    }
    
    public a(final float g, final float h, final float i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    protected a(@j0 final Parcel parcel) {
        this.G = parcel.readFloat();
        this.H = parcel.readFloat();
        this.I = parcel.readFloat();
    }
    
    public float a() {
        return this.I;
    }
    
    public float b() {
        return this.G;
    }
    
    public float c() {
        return this.H;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void draw(final Canvas canvas, final Paint paint) {
        canvas.drawCircle(this.G, this.H, this.I, paint);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeFloat(this.G);
        parcel.writeFloat(this.H);
        parcel.writeFloat(this.I);
    }
}
