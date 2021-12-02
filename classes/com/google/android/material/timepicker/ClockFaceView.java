// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.timepicker;

import android.util.DisplayMetrics;
import android.view.View$MeasureSpec;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.t;
import androidx.annotation.w0;
import android.graphics.Shader$TileMode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.content.res.TypedArray;
import java.util.Arrays;
import androidx.core.view.accessibility.d;
import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.core.view.a;
import android.widget.TextView;
import android.util.SparseArray;
import android.graphics.RectF;
import android.graphics.Rect;
import android.content.res.ColorStateList;

class ClockFaceView extends c implements d
{
    private static final float J0 = 0.001f;
    private static final int K0 = 12;
    private static final String L0 = "";
    private final int[] A0;
    private final float[] B0;
    private final int C0;
    private final int D0;
    private final int E0;
    private final int F0;
    private String[] G0;
    private float H0;
    private final ColorStateList I0;
    private final ClockHandView v0;
    private final Rect w0;
    private final RectF x0;
    private final SparseArray<TextView> y0;
    private final androidx.core.view.a z0;
    
    public ClockFaceView(@j0 final Context context) {
        this(context, null);
    }
    
    public ClockFaceView(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, o2.a.c.N9);
    }
    
    @SuppressLint({ "ClickableViewAccessibility" })
    public ClockFaceView(@j0 final Context context, @k0 final AttributeSet set, int backgroundColor) {
        super(context, set, backgroundColor);
        this.w0 = new Rect();
        this.x0 = new RectF();
        this.y0 = (SparseArray<TextView>)new SparseArray();
        this.B0 = new float[] { 0.0f, 0.9f, 1.0f };
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o2.a.o.m6, backgroundColor, o2.a.n.Ic);
        final Resources resources = this.getResources();
        final ColorStateList a = com.google.android.material.resources.c.a(context, obtainStyledAttributes, o2.a.o.o6);
        this.I0 = a;
        LayoutInflater.from(context).inflate(o2.a.k.Y, (ViewGroup)this, true);
        final ClockHandView v0 = (ClockHandView)this.findViewById(o2.a.h.q2);
        this.v0 = v0;
        this.C0 = resources.getDimensionPixelSize(o2.a.f.c2);
        backgroundColor = a.getDefaultColor();
        backgroundColor = a.getColorForState(new int[] { 16842913 }, backgroundColor);
        this.A0 = new int[] { backgroundColor, backgroundColor, a.getDefaultColor() };
        v0.b((ClockHandView.d)this);
        backgroundColor = androidx.appcompat.content.res.a.c(context, o2.a.e.w1).getDefaultColor();
        final ColorStateList a2 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, o2.a.o.n6);
        if (a2 != null) {
            backgroundColor = a2.getDefaultColor();
        }
        this.setBackgroundColor(backgroundColor);
        this.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new ViewTreeObserver$OnPreDrawListener() {
            public boolean onPreDraw() {
                if (!ClockFaceView.this.isShown()) {
                    return true;
                }
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
                ClockFaceView.this.K(ClockFaceView.this.getHeight() / 2 - ClockFaceView.this.v0.g() - ClockFaceView.this.C0);
                return true;
            }
        });
        this.setFocusable(true);
        obtainStyledAttributes.recycle();
        this.z0 = new androidx.core.view.a() {
            @Override
            public void g(final View view, @j0 final androidx.core.view.accessibility.d d) {
                super.g(view, d);
                final int intValue = (int)view.getTag(a.h.G2);
                if (intValue > 0) {
                    d.O1((View)ClockFaceView.this.y0.get(intValue - 1));
                }
                d.X0(d.c.h(0, 1, intValue, 1, false, view.isSelected()));
            }
        };
        final String[] a3 = new String[12];
        Arrays.fill(a3, "");
        this.c(a3, 0);
        this.D0 = resources.getDimensionPixelSize(o2.a.f.E2);
        this.E0 = resources.getDimensionPixelSize(o2.a.f.F2);
        this.F0 = resources.getDimensionPixelSize(o2.a.f.i2);
    }
    
    private void R() {
        final RectF d = this.v0.d();
        for (int i = 0; i < this.y0.size(); ++i) {
            final TextView textView = (TextView)this.y0.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.w0);
                this.w0.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                this.offsetDescendantRectToMyCoords((View)textView, this.w0);
                this.x0.set(this.w0);
                textView.getPaint().setShader((Shader)this.S(d, this.x0));
                textView.invalidate();
            }
        }
    }
    
    private RadialGradient S(final RectF rectF, final RectF rectF2) {
        if (!RectF.intersects(rectF, rectF2)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.x0.left, rectF.centerY() - this.x0.top, rectF.width() * 0.5f, this.A0, this.B0, Shader$TileMode.CLAMP);
    }
    
    private static float T(final float a, final float b, final float b2) {
        return Math.max(Math.max(a, b), b2);
    }
    
    private void U(@w0 final int n) {
        final LayoutInflater from = LayoutInflater.from(this.getContext());
        for (int size = this.y0.size(), i = 0; i < Math.max(this.G0.length, size); ++i) {
            final TextView textView = (TextView)this.y0.get(i);
            if (i >= this.G0.length) {
                this.removeView((View)textView);
                this.y0.remove(i);
            }
            else {
                TextView textView2;
                if ((textView2 = textView) == null) {
                    textView2 = (TextView)from.inflate(o2.a.k.X, (ViewGroup)this, false);
                    this.y0.put(i, (Object)textView2);
                    this.addView((View)textView2);
                }
                textView2.setVisibility(0);
                textView2.setText((CharSequence)this.G0[i]);
                textView2.setTag(o2.a.h.G2, (Object)i);
                androidx.core.view.j0.z1((View)textView2, this.z0);
                textView2.setTextColor(this.I0);
                if (n != 0) {
                    textView2.setContentDescription((CharSequence)this.getResources().getString(n, new Object[] { this.G0[i] }));
                }
            }
        }
    }
    
    @Override
    public void K(final int n) {
        if (n != this.J()) {
            super.K(n);
            this.v0.k(this.J());
        }
    }
    
    public void c(final String[] g0, @w0 final int n) {
        this.G0 = g0;
        this.U(n);
    }
    
    @Override
    public void d(final float h0, final boolean b) {
        if (Math.abs(this.H0 - h0) > 0.001f) {
            this.H0 = h0;
            this.R();
        }
    }
    
    public void e(@t(from = 0.0, to = 360.0) final float n) {
        this.v0.l(n);
        this.R();
    }
    
    public void onInitializeAccessibilityNodeInfo(@j0 final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        androidx.core.view.accessibility.d.V1(accessibilityNodeInfo).W0(androidx.core.view.accessibility.d.b.f(1, this.G0.length, false, 1));
    }
    
    @Override
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.R();
    }
    
    @Override
    protected void onMeasure(int measureSpec, int n) {
        final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        n = (int)(this.F0 / T(this.D0 / (float)displayMetrics.heightPixels, this.E0 / (float)displayMetrics.widthPixels, 1.0f));
        measureSpec = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
        this.setMeasuredDimension(n, n);
        super.onMeasure(measureSpec, measureSpec);
    }
}
