// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.tooltip;

import androidx.annotation.w0;
import android.text.TextUtils;
import androidx.annotation.n0;
import com.google.android.material.resources.d;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import androidx.core.graphics.h;
import com.google.android.material.resources.c;
import com.google.android.material.internal.t;
import android.graphics.Paint;
import android.graphics.Canvas;
import com.google.android.material.shape.l;
import com.google.android.material.shape.i;
import com.google.android.material.shape.g;
import android.graphics.Paint$Align;
import android.view.View;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.view.View$OnLayoutChangeListener;
import android.graphics.Paint$FontMetrics;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.k0;
import androidx.annotation.f;
import androidx.annotation.x0;
import androidx.annotation.t0;
import com.google.android.material.internal.q;
import com.google.android.material.shape.j;

@t0({ androidx.annotation.t0.a.H })
public class a extends j implements b
{
    @x0
    private static final int A0;
    @f
    private static final int B0;
    @k0
    private CharSequence j0;
    @j0
    private final Context k0;
    @k0
    private final Paint$FontMetrics l0;
    @j0
    private final q m0;
    @j0
    private final View$OnLayoutChangeListener n0;
    @j0
    private final Rect o0;
    private int p0;
    private int q0;
    private int r0;
    private int s0;
    private int t0;
    private int u0;
    private float v0;
    private float w0;
    private final float x0;
    private float y0;
    private float z0;
    
    static {
        A0 = o2.a.n.Rc;
        B0 = o2.a.c.vf;
    }
    
    private a(@j0 final Context k0, final AttributeSet set, @f final int n, @x0 final int n2) {
        super(k0, set, n, n2);
        this.l0 = new Paint$FontMetrics();
        final q m0 = new q((q.b)this);
        this.m0 = m0;
        this.n0 = (View$OnLayoutChangeListener)new View$OnLayoutChangeListener() {
            public void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
                com.google.android.material.tooltip.a.this.q1(view);
            }
        };
        this.o0 = new Rect();
        this.v0 = 1.0f;
        this.w0 = 1.0f;
        this.x0 = 0.5f;
        this.y0 = 0.5f;
        this.z0 = 1.0f;
        this.k0 = k0;
        m0.e().density = k0.getResources().getDisplayMetrics().density;
        m0.e().setTextAlign(Paint$Align.CENTER);
    }
    
    private float P0() {
        int n;
        if (this.o0.right - this.getBounds().right - this.u0 - this.s0 < 0) {
            n = this.o0.right - this.getBounds().right - this.u0 - this.s0;
        }
        else {
            if (this.o0.left - this.getBounds().left - this.u0 + this.s0 <= 0) {
                return 0.0f;
            }
            n = this.o0.left - this.getBounds().left - this.u0 + this.s0;
        }
        return (float)n;
    }
    
    private float Q0() {
        this.m0.e().getFontMetrics(this.l0);
        final Paint$FontMetrics l0 = this.l0;
        return (l0.descent + l0.ascent) / 2.0f;
    }
    
    private float R0(@j0 final Rect rect) {
        return rect.centerY() - this.Q0();
    }
    
    @j0
    public static a S0(@j0 final Context context) {
        return U0(context, null, a.B0, a.A0);
    }
    
    @j0
    public static a T0(@j0 final Context context, @k0 final AttributeSet set) {
        return U0(context, set, a.B0, a.A0);
    }
    
    @j0
    public static a U0(@j0 final Context context, @k0 final AttributeSet set, @f final int n, @x0 final int n2) {
        final a a = new a(context, set, n, n2);
        a.f1(set, n, n2);
        return a;
    }
    
    private g V0() {
        final float a = -this.P0();
        final float b = (float)(this.getBounds().width() - this.t0 * Math.sqrt(2.0)) / 2.0f;
        return new l(new com.google.android.material.shape.i((float)this.t0), Math.min(Math.max(a, -b), b));
    }
    
    private void X0(@j0 final Canvas canvas) {
        if (this.j0 == null) {
            return;
        }
        final Rect bounds = this.getBounds();
        final int n = (int)this.R0(bounds);
        if (this.m0.d() != null) {
            this.m0.e().drawableState = this.getState();
            this.m0.k(this.k0);
            this.m0.e().setAlpha((int)(this.z0 * 255.0f));
        }
        final CharSequence j0 = this.j0;
        canvas.drawText(j0, 0, j0.length(), (float)bounds.centerX(), (float)n, (Paint)this.m0.e());
    }
    
    private float e1() {
        final CharSequence j0 = this.j0;
        if (j0 == null) {
            return 0.0f;
        }
        return this.m0.f(j0.toString());
    }
    
    private void f1(@k0 final AttributeSet set, @f int n, @x0 final int n2) {
        final TypedArray j = t.j(this.k0, set, o2.a.o.xu, n, n2, new int[0]);
        this.t0 = this.k0.getResources().getDimensionPixelSize(o2.a.f.o6);
        this.setShapeAppearanceModel(this.getShapeAppearanceModel().v().t(this.V0()).m());
        this.l1(j.getText(o2.a.o.Du));
        this.m1(c.f(this.k0, j, o2.a.o.yu));
        n = s2.a.c(this.k0, o2.a.c.D2, a.class.getCanonicalName());
        n = s2.a.g(h.B(s2.a.c(this.k0, 16842801, a.class.getCanonicalName()), 229), h.B(n, 153));
        this.n0(ColorStateList.valueOf(j.getColor(o2.a.o.Eu, n)));
        this.E0(ColorStateList.valueOf(s2.a.c(this.k0, o2.a.c.P2, a.class.getCanonicalName())));
        this.p0 = j.getDimensionPixelSize(o2.a.o.zu, 0);
        this.q0 = j.getDimensionPixelSize(o2.a.o.Bu, 0);
        this.r0 = j.getDimensionPixelSize(o2.a.o.Cu, 0);
        this.s0 = j.getDimensionPixelSize(o2.a.o.Au, 0);
        j.recycle();
    }
    
    private void q1(@j0 final View view) {
        final int[] array = new int[2];
        view.getLocationOnScreen(array);
        this.u0 = array[0];
        view.getWindowVisibleDisplayFrame(this.o0);
    }
    
    public void W0(@k0 final View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.n0);
    }
    
    public int Y0() {
        return this.s0;
    }
    
    public int Z0() {
        return this.r0;
    }
    
    @Override
    public void a() {
        this.invalidateSelf();
    }
    
    public int a1() {
        return this.q0;
    }
    
    @k0
    public CharSequence b1() {
        return this.j0;
    }
    
    @k0
    public com.google.android.material.resources.d c1() {
        return this.m0.d();
    }
    
    public int d1() {
        return this.p0;
    }
    
    @Override
    public void draw(@j0 final Canvas canvas) {
        canvas.save();
        final float p = this.P0();
        final float n = (float)(-(this.t0 * Math.sqrt(2.0) - this.t0));
        canvas.scale(this.v0, this.w0, this.getBounds().left + this.getBounds().width() * 0.5f, this.getBounds().top + this.getBounds().height() * this.y0);
        canvas.translate(p, n);
        super.draw(canvas);
        this.X0(canvas);
        canvas.restore();
    }
    
    public void g1(@n0 final int s0) {
        this.s0 = s0;
        this.invalidateSelf();
    }
    
    public int getIntrinsicHeight() {
        return (int)Math.max(this.m0.e().getTextSize(), (float)this.r0);
    }
    
    public int getIntrinsicWidth() {
        return (int)Math.max(this.p0 * 2 + this.e1(), (float)this.q0);
    }
    
    public void h1(@n0 final int r0) {
        this.r0 = r0;
        this.invalidateSelf();
    }
    
    public void i1(@n0 final int q0) {
        this.q0 = q0;
        this.invalidateSelf();
    }
    
    public void j1(@k0 final View view) {
        if (view == null) {
            return;
        }
        this.q1(view);
        view.addOnLayoutChangeListener(this.n0);
    }
    
    public void k1(@androidx.annotation.t(from = 0.0, to = 1.0) final float n) {
        this.y0 = 1.2f;
        this.v0 = n;
        this.w0 = n;
        this.z0 = com.google.android.material.animation.a.b(0.0f, 1.0f, 0.19f, 1.0f, n);
        this.invalidateSelf();
    }
    
    public void l1(@k0 final CharSequence j0) {
        if (!TextUtils.equals(this.j0, j0)) {
            this.j0 = j0;
            this.m0.j(true);
            this.invalidateSelf();
        }
    }
    
    public void m1(@k0 final com.google.android.material.resources.d d) {
        this.m0.i(d, this.k0);
    }
    
    public void n1(@x0 final int n) {
        this.m1(new com.google.android.material.resources.d(this.k0, n));
    }
    
    public void o1(@n0 final int p) {
        this.p0 = p;
        this.invalidateSelf();
    }
    
    @Override
    protected void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        this.setShapeAppearanceModel(this.getShapeAppearanceModel().v().t(this.V0()).m());
    }
    
    @Override
    public boolean onStateChange(final int[] array) {
        return super.onStateChange(array);
    }
    
    public void p1(@w0 final int n) {
        this.l1(this.k0.getResources().getString(n));
    }
}
