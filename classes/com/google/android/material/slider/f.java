// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.AbsSavedState;
import androidx.annotation.n;
import androidx.annotation.p;
import androidx.annotation.b0;
import android.os.Parcelable;
import android.content.res.ColorStateList;
import androidx.annotation.q;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import android.content.res.TypedArray;
import com.google.android.material.internal.t;
import o2.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;

public class f extends com.google.android.material.slider.c<f, b, c>
{
    private float X0;
    private int Y0;
    
    public f(@j0 final Context context) {
        this(context, null);
    }
    
    public f(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, a.c.Jc);
    }
    
    public f(@j0 final Context context, @k0 final AttributeSet set, int n) {
        super(context, set, n);
        final TypedArray j = t.j(context, set, a.o.Vo, n, com.google.android.material.slider.c.S0, new int[0]);
        n = a.o.Xo;
        if (j.hasValue(n)) {
            n = j.getResourceId(n, 0);
            this.setValues(v0(j.getResources().obtainTypedArray(n)));
        }
        this.X0 = j.getDimension(a.o.Wo, 0.0f);
        j.recycle();
    }
    
    private static List<Float> v0(final TypedArray typedArray) {
        final ArrayList<Float> list = new ArrayList<Float>();
        for (int i = 0; i < typedArray.length(); ++i) {
            list.add(typedArray.getFloat(i, -1.0f));
        }
        return list;
    }
    
    public float getMinSeparation() {
        return this.X0;
    }
    
    @j0
    public List<Float> getValues() {
        return super.getValues();
    }
    
    @Override
    protected void onRestoreInstanceState(@k0 final Parcelable parcelable) {
        final d d = (d)parcelable;
        super.onRestoreInstanceState(d.getSuperState());
        this.X0 = d.G;
        this.setSeparationUnit(this.Y0 = d.H);
    }
    
    @j0
    public Parcelable onSaveInstanceState() {
        final d d = new d(super.onSaveInstanceState());
        d.G = this.X0;
        d.H = this.Y0;
        return (Parcelable)d;
    }
    
    public void setMinSeparation(@q final float x0) {
        this.X0 = x0;
        this.setSeparationUnit(this.Y0 = 0);
    }
    
    public void setMinSeparationValue(final float x0) {
        this.X0 = x0;
        this.setSeparationUnit(this.Y0 = 1);
    }
    
    public void setValues(@j0 final List<Float> values) {
        super.setValues(values);
    }
    
    public void setValues(@j0 final Float... values) {
        super.setValues(values);
    }
    
    public interface b extends a<f>
    {
    }
    
    public interface c extends b<f>
    {
    }
    
    static class d extends AbsSavedState
    {
        public static final Parcelable$Creator<d> CREATOR;
        private float G;
        private int H;
        
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
        
        private d(final Parcel parcel) {
            super(parcel.readParcelable(d.class.getClassLoader()));
            this.G = parcel.readFloat();
            this.H = parcel.readInt();
        }
        
        d(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeFloat(this.G);
            parcel.writeInt(this.H);
        }
    }
}
