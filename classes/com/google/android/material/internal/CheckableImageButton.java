// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.widget.ImageButton;
import androidx.core.view.accessibility.d;
import androidx.annotation.j0;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import c.a;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.t0;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;

@t0({ t0.a.H })
public class CheckableImageButton extends AppCompatImageButton implements Checkable
{
    private static final int[] L;
    private boolean I;
    private boolean J;
    private boolean K;
    
    static {
        L = new int[] { 16842912 };
    }
    
    public CheckableImageButton(final Context context) {
        this(context, null);
    }
    
    public CheckableImageButton(final Context context, final AttributeSet set) {
        this(context, set, a.c.R1);
    }
    
    public CheckableImageButton(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.J = true;
        this.K = true;
        androidx.core.view.j0.z1((View)this, new androidx.core.view.a() {
            @Override
            public void f(final View view, @j0 final AccessibilityEvent accessibilityEvent) {
                super.f(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }
            
            @Override
            public void g(final View view, @j0 final d d) {
                super.g(view, d);
                d.S0(CheckableImageButton.this.a());
                d.T0(CheckableImageButton.this.isChecked());
            }
        });
    }
    
    public boolean a() {
        return this.J;
    }
    
    public boolean b() {
        return this.K;
    }
    
    public boolean isChecked() {
        return this.I;
    }
    
    public int[] onCreateDrawableState(final int n) {
        if (this.I) {
            final int[] l = CheckableImageButton.L;
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(n + l.length), l);
        }
        return super.onCreateDrawableState(n);
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final b b = (b)parcelable;
        super.onRestoreInstanceState(b.a());
        this.setChecked(b.I);
    }
    
    @j0
    protected Parcelable onSaveInstanceState() {
        final b b = new b(super.onSaveInstanceState());
        b.I = this.I;
        return (Parcelable)b;
    }
    
    public void setCheckable(final boolean j) {
        if (this.J != j) {
            this.J = j;
            this.sendAccessibilityEvent(0);
        }
    }
    
    public void setChecked(final boolean i) {
        if (this.J && this.I != i) {
            this.I = i;
            this.refreshDrawableState();
            this.sendAccessibilityEvent(2048);
        }
    }
    
    public void setPressable(final boolean k) {
        this.K = k;
    }
    
    public void setPressed(final boolean pressed) {
        if (this.K) {
            super.setPressed(pressed);
        }
    }
    
    public void toggle() {
        this.setChecked(this.I ^ true);
    }
    
    static class b extends a
    {
        public static final Parcelable$Creator<b> CREATOR;
        boolean I;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<b>() {
                @j0
                public b a(@j0 final Parcel parcel) {
                    return new b(parcel, null);
                }
                
                @j0
                public b b(@j0 final Parcel parcel, final ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }
                
                @j0
                public b[] c(final int n) {
                    return new b[n];
                }
            };
        }
        
        public b(@j0 final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.b(parcel);
        }
        
        public b(final Parcelable parcelable) {
            super(parcelable);
        }
        
        private void b(@j0 final Parcel parcel) {
            final int int1 = parcel.readInt();
            boolean i = true;
            if (int1 != 1) {
                i = false;
            }
            this.I = i;
        }
        
        @Override
        public void writeToParcel(@j0 final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt((int)(this.I ? 1 : 0));
        }
    }
}
