// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.timepicker;

import androidx.annotation.l;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.e;
import androidx.annotation.q;
import android.os.Handler;
import android.content.res.ColorStateList;
import com.google.android.material.shape.d;
import com.google.android.material.shape.m;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import o2.a;
import android.view.LayoutInflater;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import com.google.android.material.shape.j;
import androidx.constraintlayout.widget.ConstraintLayout;

class c extends ConstraintLayout
{
    private static final String u0 = "skip";
    private final Runnable r0;
    private int s0;
    private j t0;
    
    public c(@j0 final Context context) {
        this(context, null);
    }
    
    public c(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 0);
    }
    
    public c(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        LayoutInflater.from(context).inflate(o2.a.k.Z, (ViewGroup)this);
        androidx.core.view.j0.G1((View)this, this.I());
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o2.a.o.To, n, 0);
        this.s0 = obtainStyledAttributes.getDimensionPixelSize(o2.a.o.Uo, 0);
        this.r0 = new Runnable() {
            @Override
            public void run() {
                c.this.M();
            }
        };
        obtainStyledAttributes.recycle();
    }
    
    private Drawable I() {
        (this.t0 = new j()).k0(new m(0.5f));
        this.t0.n0(ColorStateList.valueOf(-1));
        return this.t0;
    }
    
    private static boolean L(final View view) {
        return "skip".equals(view.getTag());
    }
    
    private void N() {
        final Handler handler = this.getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.r0);
            handler.post(this.r0);
        }
    }
    
    @q
    public int J() {
        return this.s0;
    }
    
    public void K(@q final int s0) {
        this.s0 = s0;
        this.M();
    }
    
    protected void M() {
        final int childCount = this.getChildCount();
        final int n = 0;
        int n2 = 1;
        int n3;
        for (int i = 0; i < childCount; ++i, n2 = n3) {
            n3 = n2;
            if (L(this.getChildAt(i))) {
                n3 = n2 + 1;
            }
        }
        final e e = new e();
        e.H(this);
        float n4 = 0.0f;
        float n5;
        for (int j = n; j < childCount; ++j, n4 = n5) {
            final View child = this.getChildAt(j);
            final int id = child.getId();
            final int m0 = o2.a.h.M0;
            n5 = n4;
            if (id != m0) {
                if (L(child)) {
                    n5 = n4;
                }
                else {
                    e.M(child.getId(), m0, this.s0, n4);
                    n5 = n4 + 360.0f / (childCount - n2);
                }
            }
        }
        e.r(this);
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.addView(view, n, viewGroup$LayoutParams);
        if (view.getId() == -1) {
            view.setId(androidx.core.view.j0.B());
        }
        this.N();
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.M();
    }
    
    @Override
    public void onViewRemoved(final View view) {
        super.onViewRemoved(view);
        this.N();
    }
    
    public void setBackgroundColor(@l final int n) {
        this.t0.n0(ColorStateList.valueOf(n));
    }
}
