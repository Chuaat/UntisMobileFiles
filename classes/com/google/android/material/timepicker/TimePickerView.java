// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.timepicker;

import androidx.annotation.w0;
import java.util.Locale;
import androidx.core.view.j0;
import androidx.constraintlayout.widget.e;
import android.annotation.SuppressLint;
import android.widget.Checkable;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$OnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import o2.a;
import android.view.View;
import androidx.annotation.k0;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnClickListener;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import androidx.constraintlayout.widget.ConstraintLayout;

class TimePickerView extends ConstraintLayout implements com.google.android.material.timepicker.g
{
    private final Chip r0;
    private final Chip s0;
    private final ClockHandView t0;
    private final ClockFaceView u0;
    private final MaterialButtonToggleGroup v0;
    private final View$OnClickListener w0;
    private f x0;
    private g y0;
    private e z0;
    
    public TimePickerView(final Context context) {
        this(context, null);
    }
    
    public TimePickerView(final Context context, @k0 final AttributeSet set) {
        this(context, set, 0);
    }
    
    public TimePickerView(final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        this.w0 = (View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                if (TimePickerView.this.y0 != null) {
                    TimePickerView.this.y0.g((int)view.getTag(a.h.w4));
                }
            }
        };
        LayoutInflater.from(context).inflate(a.k.d0, (ViewGroup)this);
        this.u0 = (ClockFaceView)this.findViewById(a.h.p2);
        (this.v0 = (MaterialButtonToggleGroup)this.findViewById(a.h.t2)).g((MaterialButtonToggleGroup.e)new MaterialButtonToggleGroup.e() {
            @Override
            public void a(final MaterialButtonToggleGroup materialButtonToggleGroup, int n, final boolean b) {
                if (n == o2.a.h.s2) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (TimePickerView.this.x0 != null && b) {
                    TimePickerView.this.x0.f(n);
                }
            }
        });
        this.r0 = (Chip)this.findViewById(a.h.y2);
        this.s0 = (Chip)this.findViewById(a.h.v2);
        this.t0 = (ClockHandView)this.findViewById(a.h.q2);
        this.V();
        this.U();
    }
    
    private void U() {
        final Chip r0 = this.r0;
        final int w4 = a.h.w4;
        r0.setTag(w4, (Object)12);
        this.s0.setTag(w4, (Object)10);
        this.r0.setOnClickListener(this.w0);
        this.s0.setOnClickListener(this.w0);
    }
    
    @SuppressLint({ "ClickableViewAccessibility" })
    private void V() {
        final View$OnTouchListener view$OnTouchListener = (View$OnTouchListener)new View$OnTouchListener() {
            final /* synthetic */ GestureDetector G = new GestureDetector(this.getContext(), (GestureDetector$OnGestureListener)new GestureDetector$SimpleOnGestureListener(this) {
                public boolean onDoubleTap(final MotionEvent motionEvent) {
                    final boolean onDoubleTap = super.onDoubleTap(motionEvent);
                    if (TimePickerView.this.z0 != null) {
                        TimePickerView.this.z0.a();
                    }
                    return onDoubleTap;
                }
            });
            
            public boolean onTouch(final View view, final MotionEvent motionEvent) {
                return ((Checkable)view).isChecked() && this.G.onTouchEvent(motionEvent);
            }
        };
        this.r0.setOnTouchListener((View$OnTouchListener)view$OnTouchListener);
        this.s0.setOnTouchListener((View$OnTouchListener)view$OnTouchListener);
    }
    
    private void X() {
        if (this.v0.getVisibility() == 0) {
            final androidx.constraintlayout.widget.e e = new androidx.constraintlayout.widget.e();
            e.H(this);
            final int x = androidx.core.view.j0.X((View)this);
            int n = 1;
            if (x == 0) {
                n = 2;
            }
            e.F(a.h.o2, n);
            e.r(this);
        }
    }
    
    public void L(final ClockHandView.d d) {
        this.t0.b(d);
    }
    
    public void M(final boolean b) {
        this.t0.j(b);
    }
    
    public void N(final float n, final boolean b) {
        this.t0.m(n, b);
    }
    
    public void O(final androidx.core.view.a a) {
        androidx.core.view.j0.z1((View)this.r0, a);
    }
    
    public void P(final androidx.core.view.a a) {
        androidx.core.view.j0.z1((View)this.s0, a);
    }
    
    public void Q(final ClockHandView.c c) {
        this.t0.o(c);
    }
    
    void R(@k0 final e z0) {
        this.z0 = z0;
    }
    
    void S(final f x0) {
        this.x0 = x0;
    }
    
    void T(final g y0) {
        this.y0 = y0;
    }
    
    public void W() {
        this.v0.setVisibility(0);
    }
    
    @Override
    public void a(final int n) {
        final Chip r0 = this.r0;
        final boolean b = true;
        r0.setChecked(n == 12);
        this.s0.setChecked(n == 10 && b);
    }
    
    @SuppressLint({ "DefaultLocale" })
    @Override
    public void b(int n, final int i, final int j) {
        if (n == 1) {
            n = a.h.s2;
        }
        else {
            n = a.h.r2;
        }
        this.v0.j(n);
        final Locale locale = this.getResources().getConfiguration().locale;
        final String format = String.format(locale, "%02d", j);
        final String format2 = String.format(locale, "%02d", i);
        this.r0.setText((CharSequence)format);
        this.s0.setText((CharSequence)format2);
    }
    
    @Override
    public void c(final String[] array, @w0 final int n) {
        this.u0.c(array, n);
    }
    
    @Override
    public void e(final float n) {
        this.t0.l(n);
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X();
    }
    
    protected void onVisibilityChanged(@androidx.annotation.j0 final View view, final int n) {
        super.onVisibilityChanged(view, n);
        if (view == this && n == 0) {
            this.X();
        }
    }
    
    interface e
    {
        void a();
    }
    
    interface f
    {
        void f(final int p0);
    }
    
    interface g
    {
        void g(final int p0);
    }
}
