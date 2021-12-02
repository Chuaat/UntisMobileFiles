// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.chip;

import android.graphics.Outline;
import java.util.Arrays;
import androidx.annotation.n0;
import androidx.annotation.n;
import androidx.annotation.s;
import androidx.annotation.w0;
import androidx.annotation.p;
import android.graphics.Paint$Align;
import android.text.TextUtils;
import android.content.res.TypedArray;
import com.google.android.material.internal.t;
import com.google.android.material.resources.d;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import androidx.annotation.d1;
import android.graphics.Rect;
import androidx.core.graphics.drawable.c;
import android.annotation.TargetApi;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.internal.b0;
import com.google.android.material.ripple.b;
import androidx.annotation.x0;
import androidx.annotation.f;
import android.util.AttributeSet;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils$TruncateAt;
import java.lang.ref.WeakReference;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.ColorFilter;
import androidx.annotation.l;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Paint$FontMetrics;
import android.graphics.Paint;
import androidx.annotation.j0;
import android.content.Context;
import com.google.android.material.animation.h;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.annotation.k0;
import android.graphics.drawable.ShapeDrawable;
import com.google.android.material.internal.q;
import android.graphics.drawable.Drawable$Callback;
import androidx.core.graphics.drawable.i;
import com.google.android.material.shape.j;

public class a extends j implements i, Drawable$Callback, b
{
    private static final boolean t1 = false;
    private static final int[] u1;
    private static final String v1 = "http://schemas.android.com/apk/res-auto";
    private static final int w1 = 24;
    private static final ShapeDrawable x1;
    private float A0;
    @k0
    private CharSequence B0;
    private boolean C0;
    private boolean D0;
    @k0
    private Drawable E0;
    @k0
    private ColorStateList F0;
    @k0
    private h G0;
    @k0
    private h H0;
    private float I0;
    private float J0;
    private float K0;
    private float L0;
    private float M0;
    private float N0;
    private float O0;
    private float P0;
    @j0
    private final Context Q0;
    private final Paint R0;
    @k0
    private final Paint S0;
    private final Paint$FontMetrics T0;
    private final RectF U0;
    private final PointF V0;
    private final Path W0;
    @j0
    private final q X0;
    @l
    private int Y0;
    @l
    private int Z0;
    @l
    private int a1;
    @l
    private int b1;
    @l
    private int c1;
    @l
    private int d1;
    private boolean e1;
    @l
    private int f1;
    private int g1;
    @k0
    private ColorFilter h1;
    @k0
    private PorterDuffColorFilter i1;
    @k0
    private ColorStateList j0;
    @k0
    private ColorStateList j1;
    @k0
    private ColorStateList k0;
    @k0
    private PorterDuff$Mode k1;
    private float l0;
    private int[] l1;
    private float m0;
    private boolean m1;
    @k0
    private ColorStateList n0;
    @k0
    private ColorStateList n1;
    private float o0;
    @j0
    private WeakReference<a> o1;
    @k0
    private ColorStateList p0;
    private TextUtils$TruncateAt p1;
    @k0
    private CharSequence q0;
    private boolean q1;
    private boolean r0;
    private int r1;
    @k0
    private Drawable s0;
    private boolean s1;
    @k0
    private ColorStateList t0;
    private float u0;
    private boolean v0;
    private boolean w0;
    @k0
    private Drawable x0;
    @k0
    private Drawable y0;
    @k0
    private ColorStateList z0;
    
    static {
        u1 = new int[] { 16842910 };
        x1 = new ShapeDrawable((Shape)new OvalShape());
    }
    
    private a(@j0 final Context q0, final AttributeSet set, @f final int n, @x0 final int n2) {
        super(q0, set, n, n2);
        this.m0 = -1.0f;
        this.R0 = new Paint(1);
        this.T0 = new Paint$FontMetrics();
        this.U0 = new RectF();
        this.V0 = new PointF();
        this.W0 = new Path();
        this.g1 = 255;
        this.k1 = PorterDuff$Mode.SRC_IN;
        this.o1 = new WeakReference<a>(null);
        this.Y(q0);
        this.Q0 = q0;
        final q x0 = new q((q.b)this);
        this.X0 = x0;
        this.q0 = "";
        x0.e().density = q0.getResources().getDisplayMetrics().density;
        this.S0 = null;
        final int[] u1 = a.u1;
        this.setState(u1);
        this.e3(u1);
        this.q1 = true;
        if (com.google.android.material.ripple.b.a) {
            a.x1.setTint(-1);
        }
    }
    
    private float F1() {
        Drawable drawable;
        if (this.e1) {
            drawable = this.E0;
        }
        else {
            drawable = this.s0;
        }
        float u0;
        final float n = u0 = this.u0;
        if (n <= 0.0f) {
            u0 = n;
            if (drawable != null && drawable.getIntrinsicHeight() <= (u0 = (float)Math.ceil(com.google.android.material.internal.b0.e(this.Q0, 24)))) {
                return (float)drawable.getIntrinsicHeight();
            }
        }
        return u0;
    }
    
    private float G1() {
        Drawable drawable;
        if (this.e1) {
            drawable = this.E0;
        }
        else {
            drawable = this.s0;
        }
        final float u0 = this.u0;
        if (u0 <= 0.0f && drawable != null) {
            return (float)drawable.getIntrinsicWidth();
        }
        return u0;
    }
    
    private boolean I3() {
        return this.D0 && this.E0 != null && this.e1;
    }
    
    private boolean J3() {
        return this.r0 && this.s0 != null;
    }
    
    private boolean K3() {
        return this.w0 && this.x0 != null;
    }
    
    private void L3(@k0 final Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable$Callback)null);
        }
    }
    
    private void M3() {
        ColorStateList d;
        if (this.m1) {
            d = com.google.android.material.ripple.b.d(this.p0);
        }
        else {
            d = null;
        }
        this.n1 = d;
    }
    
    @TargetApi(21)
    private void N3() {
        this.y0 = (Drawable)new RippleDrawable(com.google.android.material.ripple.b.d(this.M1()), this.x0, (Drawable)a.x1);
    }
    
    private void O0(@k0 final Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback((Drawable$Callback)this);
        c.m(drawable, c.f(this));
        drawable.setLevel(this.getLevel());
        drawable.setVisible(this.isVisible(), false);
        if (drawable == this.x0) {
            if (drawable.isStateful()) {
                drawable.setState(this.C1());
            }
            c.o(drawable, this.z0);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(this.getState());
        }
        final Drawable s0 = this.s0;
        if (drawable == s0 && this.v0) {
            c.o(s0, this.t0);
        }
    }
    
    private void P0(@j0 final Rect rect, @j0 final RectF rectF) {
        rectF.setEmpty();
        if (this.J3() || this.I3()) {
            final float n = this.I0 + this.J0;
            final float g1 = this.G1();
            if (c.f(this) == 0) {
                final float left = rect.left + n;
                rectF.left = left;
                rectF.right = left + g1;
            }
            else {
                final float right = rect.right - n;
                rectF.right = right;
                rectF.left = right - g1;
            }
            final float f1 = this.F1();
            final float top = rect.exactCenterY() - f1 / 2.0f;
            rectF.top = top;
            rectF.bottom = top + f1;
        }
    }
    
    private void R0(@j0 final Rect rect, @j0 final RectF rectF) {
        rectF.set(rect);
        if (this.K3()) {
            final float n = this.P0 + this.O0 + this.A0 + this.N0 + this.M0;
            if (c.f(this) == 0) {
                rectF.right = rect.right - n;
            }
            else {
                rectF.left = rect.left + n;
            }
        }
    }
    
    private void S0(@j0 final Rect rect, @j0 final RectF rectF) {
        rectF.setEmpty();
        if (this.K3()) {
            final float n = this.P0 + this.O0;
            if (c.f(this) == 0) {
                final float right = rect.right - n;
                rectF.right = right;
                rectF.left = right - this.A0;
            }
            else {
                final float left = rect.left + n;
                rectF.left = left;
                rectF.right = left + this.A0;
            }
            final float exactCenterY = rect.exactCenterY();
            final float a0 = this.A0;
            final float top = exactCenterY - a0 / 2.0f;
            rectF.top = top;
            rectF.bottom = top + a0;
        }
    }
    
    @k0
    private ColorFilter S1() {
        Object o = this.h1;
        if (o == null) {
            o = this.i1;
        }
        return (ColorFilter)o;
    }
    
    private void S2(@k0 final ColorStateList j0) {
        if (this.j0 != j0) {
            this.j0 = j0;
            this.onStateChange(this.getState());
        }
    }
    
    private void T0(@j0 final Rect rect, @j0 final RectF rectF) {
        rectF.setEmpty();
        if (this.K3()) {
            final float n = this.P0 + this.O0 + this.A0 + this.N0 + this.M0;
            if (c.f(this) == 0) {
                final float right = (float)rect.right;
                rectF.right = right;
                rectF.left = right - n;
            }
            else {
                final int left = rect.left;
                rectF.left = (float)left;
                rectF.right = left + n;
            }
            rectF.top = (float)rect.top;
            rectF.bottom = (float)rect.bottom;
        }
    }
    
    private static boolean U1(@k0 final int[] array, @f final int n) {
        if (array == null) {
            return false;
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    private void V0(@j0 final Rect rect, @j0 final RectF rectF) {
        rectF.setEmpty();
        if (this.q0 != null) {
            final float n = this.I0 + this.Q0() + this.L0;
            final float n2 = this.P0 + this.U0() + this.M0;
            if (c.f(this) == 0) {
                rectF.left = rect.left + n;
                rectF.right = rect.right - n2;
            }
            else {
                rectF.left = rect.left + n2;
                rectF.right = rect.right - n;
            }
            rectF.top = (float)rect.top;
            rectF.bottom = (float)rect.bottom;
        }
    }
    
    private float W0() {
        this.X0.e().getFontMetrics(this.T0);
        final Paint$FontMetrics t0 = this.T0;
        return (t0.descent + t0.ascent) / 2.0f;
    }
    
    private boolean Y0() {
        return this.D0 && this.E0 != null && this.C0;
    }
    
    @j0
    public static a Z0(@j0 final Context context, @k0 final AttributeSet set, @f final int n, @x0 final int n2) {
        final a a = new a(context, set, n, n2);
        a.h2(set, n, n2);
        return a;
    }
    
    @j0
    public static a a1(@j0 final Context context, @d1 int n) {
        final AttributeSet a = t2.a.a(context, n, "chip");
        if ((n = a.getStyleAttribute()) == 0) {
            n = o2.a.n.ob;
        }
        return Z0(context, a, o2.a.c.U1, n);
    }
    
    private void b1(@j0 final Canvas canvas, @j0 final Rect rect) {
        if (this.I3()) {
            this.P0(rect, this.U0);
            final RectF u0 = this.U0;
            final float left = u0.left;
            final float top = u0.top;
            canvas.translate(left, top);
            this.E0.setBounds(0, 0, (int)this.U0.width(), (int)this.U0.height());
            this.E0.draw(canvas);
            canvas.translate(-left, -top);
        }
    }
    
    private void c1(@j0 final Canvas canvas, @j0 final Rect rect) {
        if (!this.s1) {
            this.R0.setColor(this.Z0);
            this.R0.setStyle(Paint$Style.FILL);
            this.R0.setColorFilter(this.S1());
            this.U0.set(rect);
            canvas.drawRoundRect(this.U0, this.n1(), this.n1(), this.R0);
        }
    }
    
    private void d1(@j0 final Canvas canvas, @j0 final Rect rect) {
        if (this.J3()) {
            this.P0(rect, this.U0);
            final RectF u0 = this.U0;
            final float left = u0.left;
            final float top = u0.top;
            canvas.translate(left, top);
            this.s0.setBounds(0, 0, (int)this.U0.width(), (int)this.U0.height());
            this.s0.draw(canvas);
            canvas.translate(-left, -top);
        }
    }
    
    private void e1(@j0 final Canvas canvas, @j0 final Rect rect) {
        if (this.o0 > 0.0f && !this.s1) {
            this.R0.setColor(this.b1);
            this.R0.setStyle(Paint$Style.STROKE);
            if (!this.s1) {
                this.R0.setColorFilter(this.S1());
            }
            final RectF u0 = this.U0;
            final float n = (float)rect.left;
            final float o0 = this.o0;
            u0.set(n + o0 / 2.0f, rect.top + o0 / 2.0f, rect.right - o0 / 2.0f, rect.bottom - o0 / 2.0f);
            final float n2 = this.m0 - this.o0 / 2.0f;
            canvas.drawRoundRect(this.U0, n2, n2, this.R0);
        }
    }
    
    private static boolean e2(@k0 final ColorStateList list) {
        return list != null && list.isStateful();
    }
    
    private void f1(@j0 final Canvas canvas, @j0 final Rect rect) {
        if (!this.s1) {
            this.R0.setColor(this.Y0);
            this.R0.setStyle(Paint$Style.FILL);
            this.U0.set(rect);
            canvas.drawRoundRect(this.U0, this.n1(), this.n1(), this.R0);
        }
    }
    
    private static boolean f2(@k0 final Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }
    
    private void g1(@j0 final Canvas canvas, @j0 final Rect rect) {
        if (this.K3()) {
            this.S0(rect, this.U0);
            final RectF u0 = this.U0;
            final float left = u0.left;
            final float top = u0.top;
            canvas.translate(left, top);
            this.x0.setBounds(0, 0, (int)this.U0.width(), (int)this.U0.height());
            Drawable drawable;
            if (com.google.android.material.ripple.b.a) {
                this.y0.setBounds(this.x0.getBounds());
                this.y0.jumpToCurrentState();
                drawable = this.y0;
            }
            else {
                drawable = this.x0;
            }
            drawable.draw(canvas);
            canvas.translate(-left, -top);
        }
    }
    
    private static boolean g2(@k0 final com.google.android.material.resources.d d) {
        if (d != null) {
            final ColorStateList a = d.a;
            if (a != null && a.isStateful()) {
                return true;
            }
        }
        return false;
    }
    
    private void h1(@j0 final Canvas canvas, @j0 final Rect rect) {
        this.R0.setColor(this.c1);
        this.R0.setStyle(Paint$Style.FILL);
        this.U0.set(rect);
        if (!this.s1) {
            canvas.drawRoundRect(this.U0, this.n1(), this.n1(), this.R0);
        }
        else {
            this.h(new RectF(rect), this.W0);
            super.q(canvas, this.R0, this.W0, this.v());
        }
    }
    
    private void h2(@k0 final AttributeSet set, @f int n, @x0 final int n2) {
        final TypedArray j = t.j(this.Q0, set, a.o.j5, n, n2, new int[0]);
        this.s1 = j.hasValue(a.o.V5);
        this.S2(com.google.android.material.resources.c.a(this.Q0, j, a.o.I5));
        this.u2(com.google.android.material.resources.c.a(this.Q0, j, a.o.v5));
        this.K2(j.getDimension(a.o.D5, 0.0f));
        n = a.o.w5;
        if (j.hasValue(n)) {
            this.w2(j.getDimension(n, 0.0f));
        }
        this.O2(com.google.android.material.resources.c.a(this.Q0, j, a.o.G5));
        this.Q2(j.getDimension(a.o.H5, 0.0f));
        this.s3(com.google.android.material.resources.c.a(this.Q0, j, a.o.U5));
        this.x3(j.getText(a.o.p5));
        final com.google.android.material.resources.d f = com.google.android.material.resources.c.f(this.Q0, j, a.o.k5);
        f.n = j.getDimension(a.o.l5, f.n);
        this.y3(f);
        n = j.getInt(a.o.n5, 0);
        Label_0249: {
            TextUtils$TruncateAt textUtils$TruncateAt;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        break Label_0249;
                    }
                    textUtils$TruncateAt = TextUtils$TruncateAt.END;
                }
                else {
                    textUtils$TruncateAt = TextUtils$TruncateAt.MIDDLE;
                }
            }
            else {
                textUtils$TruncateAt = TextUtils$TruncateAt.START;
            }
            this.k3(textUtils$TruncateAt);
        }
        this.J2(j.getBoolean(a.o.C5, false));
        if (set != null && set.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && set.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            this.J2(j.getBoolean(a.o.z5, false));
        }
        this.A2(com.google.android.material.resources.c.d(this.Q0, j, a.o.y5));
        n = a.o.B5;
        if (j.hasValue(n)) {
            this.G2(com.google.android.material.resources.c.a(this.Q0, j, n));
        }
        this.E2(j.getDimension(a.o.A5, -1.0f));
        this.i3(j.getBoolean(a.o.P5, false));
        if (set != null && set.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && set.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            this.i3(j.getBoolean(a.o.K5, false));
        }
        this.T2(com.google.android.material.resources.c.d(this.Q0, j, a.o.J5));
        this.f3(com.google.android.material.resources.c.a(this.Q0, j, a.o.O5));
        this.a3(j.getDimension(a.o.M5, 0.0f));
        this.k2(j.getBoolean(a.o.q5, false));
        this.t2(j.getBoolean(a.o.u5, false));
        if (set != null && set.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && set.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            this.t2(j.getBoolean(a.o.s5, false));
        }
        this.m2(com.google.android.material.resources.c.d(this.Q0, j, a.o.r5));
        n = a.o.t5;
        if (j.hasValue(n)) {
            this.q2(com.google.android.material.resources.c.a(this.Q0, j, n));
        }
        this.v3(h.c(this.Q0, j, a.o.X5));
        this.l3(h.c(this.Q0, j, a.o.R5));
        this.M2(j.getDimension(a.o.F5, 0.0f));
        this.p3(j.getDimension(a.o.T5, 0.0f));
        this.n3(j.getDimension(a.o.S5, 0.0f));
        this.E3(j.getDimension(a.o.Z5, 0.0f));
        this.A3(j.getDimension(a.o.Y5, 0.0f));
        this.c3(j.getDimension(a.o.N5, 0.0f));
        this.X2(j.getDimension(a.o.L5, 0.0f));
        this.y2(j.getDimension(a.o.x5, 0.0f));
        this.r3(j.getDimensionPixelSize(a.o.o5, Integer.MAX_VALUE));
        j.recycle();
    }
    
    private void i1(@j0 final Canvas canvas, @j0 final Rect rect) {
        final Paint s0 = this.S0;
        if (s0 != null) {
            s0.setColor(androidx.core.graphics.h.B(-16777216, 127));
            canvas.drawRect(rect, this.S0);
            if (this.J3() || this.I3()) {
                this.P0(rect, this.U0);
                canvas.drawRect(this.U0, this.S0);
            }
            if (this.q0 != null) {
                canvas.drawLine((float)rect.left, rect.exactCenterY(), (float)rect.right, rect.exactCenterY(), this.S0);
            }
            if (this.K3()) {
                this.S0(rect, this.U0);
                canvas.drawRect(this.U0, this.S0);
            }
            this.S0.setColor(androidx.core.graphics.h.B(-65536, 127));
            this.R0(rect, this.U0);
            canvas.drawRect(this.U0, this.S0);
            this.S0.setColor(androidx.core.graphics.h.B(-16711936, 127));
            this.T0(rect, this.U0);
            canvas.drawRect(this.U0, this.S0);
        }
    }
    
    private void j1(@j0 final Canvas canvas, @j0 final Rect rect) {
        if (this.q0 != null) {
            final Paint$Align x0 = this.X0(rect, this.V0);
            this.V0(rect, this.U0);
            if (this.X0.d() != null) {
                this.X0.e().drawableState = this.getState();
                this.X0.k(this.Q0);
            }
            this.X0.e().setTextAlign(x0);
            final int round = Math.round(this.X0.f(this.O1().toString()));
            final int round2 = Math.round(this.U0.width());
            int save = 0;
            final boolean b = round > round2;
            if (b) {
                save = canvas.save();
                canvas.clipRect(this.U0);
            }
            CharSequence charSequence2;
            final CharSequence charSequence = charSequence2 = this.q0;
            if (b) {
                charSequence2 = charSequence;
                if (this.p1 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence, this.X0.e(), this.U0.width(), this.p1);
                }
            }
            final int length = charSequence2.length();
            final PointF v0 = this.V0;
            canvas.drawText(charSequence2, 0, length, v0.x, v0.y, (Paint)this.X0.e());
            if (b) {
                canvas.restoreToCount(save);
            }
        }
    }
    
    private boolean j2(@j0 final int[] array, @j0 final int[] state) {
        int onStateChange = super.onStateChange(array) ? 1 : 0;
        final ColorStateList j0 = this.j0;
        int colorForState;
        if (j0 != null) {
            colorForState = j0.getColorForState(array, this.Y0);
        }
        else {
            colorForState = 0;
        }
        final int l = this.l(colorForState);
        final int y0 = this.Y0;
        final int n = 1;
        if (y0 != l) {
            this.Y0 = l;
            onStateChange = 1;
        }
        final ColorStateList k0 = this.k0;
        int colorForState2;
        if (k0 != null) {
            colorForState2 = k0.getColorForState(array, this.Z0);
        }
        else {
            colorForState2 = 0;
        }
        final int i = this.l(colorForState2);
        if (this.Z0 != i) {
            this.Z0 = i;
            onStateChange = 1;
        }
        final int g = s2.a.g(l, i);
        if (this.a1 != g | this.y() == null) {
            this.a1 = g;
            this.n0(ColorStateList.valueOf(g));
            onStateChange = 1;
        }
        final ColorStateList n2 = this.n0;
        int colorForState3;
        if (n2 != null) {
            colorForState3 = n2.getColorForState(array, this.b1);
        }
        else {
            colorForState3 = 0;
        }
        if (this.b1 != colorForState3) {
            this.b1 = colorForState3;
            onStateChange = 1;
        }
        int colorForState4;
        if (this.n1 != null && com.google.android.material.ripple.b.e(array)) {
            colorForState4 = this.n1.getColorForState(array, this.c1);
        }
        else {
            colorForState4 = 0;
        }
        int n3 = onStateChange;
        if (this.c1 != colorForState4) {
            this.c1 = colorForState4;
            n3 = onStateChange;
            if (this.m1) {
                n3 = 1;
            }
        }
        int colorForState5;
        if (this.X0.d() != null && this.X0.d().a != null) {
            colorForState5 = this.X0.d().a.getColorForState(array, this.d1);
        }
        else {
            colorForState5 = 0;
        }
        int n4 = n3;
        if (this.d1 != colorForState5) {
            this.d1 = colorForState5;
            n4 = 1;
        }
        final boolean e1 = U1(this.getState(), 16842912) && this.C0;
        int n5 = n4;
        boolean b = false;
        Label_0457: {
            if (this.e1 != e1) {
                n5 = n4;
                if (this.E0 != null) {
                    final float q0 = this.Q0();
                    this.e1 = e1;
                    if (q0 != this.Q0()) {
                        n5 = 1;
                        b = true;
                        break Label_0457;
                    }
                    n5 = 1;
                }
            }
            b = false;
        }
        final ColorStateList j2 = this.j1;
        int colorForState6;
        if (j2 != null) {
            colorForState6 = j2.getColorForState(array, this.f1);
        }
        else {
            colorForState6 = 0;
        }
        boolean b2;
        if (this.f1 != colorForState6) {
            this.f1 = colorForState6;
            this.i1 = a.c(this, this.j1, this.k1);
            b2 = (n != 0);
        }
        else {
            b2 = (n5 != 0);
        }
        boolean b3 = b2;
        if (f2(this.s0)) {
            b3 = (b2 | this.s0.setState(array));
        }
        boolean b4 = b3;
        if (f2(this.E0)) {
            b4 = (b3 | this.E0.setState(array));
        }
        boolean b5 = b4;
        if (f2(this.x0)) {
            final int[] state2 = new int[array.length + state.length];
            System.arraycopy(array, 0, state2, 0, array.length);
            System.arraycopy(state, 0, state2, array.length, state.length);
            b5 = (b4 | this.x0.setState(state2));
        }
        boolean b6 = b5;
        if (com.google.android.material.ripple.b.a) {
            b6 = b5;
            if (f2(this.y0)) {
                b6 = (b5 | this.y0.setState(state));
            }
        }
        if (b6) {
            this.invalidateSelf();
        }
        if (b) {
            this.i2();
        }
        return b6;
    }
    
    public float A1() {
        return this.A0;
    }
    
    public void A2(@k0 Drawable mutate) {
        final Drawable p = this.p1();
        if (p != mutate) {
            final float q0 = this.Q0();
            if (mutate != null) {
                mutate = c.r(mutate).mutate();
            }
            else {
                mutate = null;
            }
            this.s0 = mutate;
            final float q2 = this.Q0();
            this.L3(p);
            if (this.J3()) {
                this.O0(this.s0);
            }
            this.invalidateSelf();
            if (q0 != q2) {
                this.i2();
            }
        }
    }
    
    public void A3(final float m0) {
        if (this.M0 != m0) {
            this.M0 = m0;
            this.invalidateSelf();
            this.i2();
        }
    }
    
    public float B1() {
        return this.N0;
    }
    
    @Deprecated
    public void B2(final boolean b) {
        this.J2(b);
    }
    
    public void B3(@p final int n) {
        this.A3(this.Q0.getResources().getDimension(n));
    }
    
    @j0
    public int[] C1() {
        return this.l1;
    }
    
    @Deprecated
    public void C2(@androidx.annotation.h final int n) {
        this.I2(n);
    }
    
    public void C3(@w0 final int n) {
        this.x3(this.Q0.getResources().getString(n));
    }
    
    @k0
    public ColorStateList D1() {
        return this.z0;
    }
    
    public void D2(@androidx.annotation.s final int n) {
        this.A2(androidx.appcompat.content.res.a.d(this.Q0, n));
    }
    
    public void D3(@androidx.annotation.q final float n) {
        final com.google.android.material.resources.d p = this.P1();
        if (p != null) {
            p.n = n;
            this.X0.e().setTextSize(n);
            this.a();
        }
    }
    
    public void E1(@j0 final RectF rectF) {
        this.T0(this.getBounds(), rectF);
    }
    
    public void E2(float q0) {
        if (this.u0 != q0) {
            final float q2 = this.Q0();
            this.u0 = q0;
            q0 = this.Q0();
            this.invalidateSelf();
            if (q2 != q0) {
                this.i2();
            }
        }
    }
    
    public void E3(final float l0) {
        if (this.L0 != l0) {
            this.L0 = l0;
            this.invalidateSelf();
            this.i2();
        }
    }
    
    public void F2(@p final int n) {
        this.E2(this.Q0.getResources().getDimension(n));
    }
    
    public void F3(@p final int n) {
        this.E3(this.Q0.getResources().getDimension(n));
    }
    
    public void G2(@k0 final ColorStateList t0) {
        this.v0 = true;
        if (this.t0 != t0) {
            this.t0 = t0;
            if (this.J3()) {
                c.o(this.s0, t0);
            }
            this.onStateChange(this.getState());
        }
    }
    
    public void G3(final boolean m1) {
        if (this.m1 != m1) {
            this.m1 = m1;
            this.M3();
            this.onStateChange(this.getState());
        }
    }
    
    public TextUtils$TruncateAt H1() {
        return this.p1;
    }
    
    public void H2(@n final int n) {
        this.G2(androidx.appcompat.content.res.a.c(this.Q0, n));
    }
    
    boolean H3() {
        return this.q1;
    }
    
    @k0
    public h I1() {
        return this.H0;
    }
    
    public void I2(@androidx.annotation.h final int n) {
        this.J2(this.Q0.getResources().getBoolean(n));
    }
    
    public float J1() {
        return this.K0;
    }
    
    public void J2(final boolean r0) {
        if (this.r0 != r0) {
            final boolean j3 = this.J3();
            this.r0 = r0;
            final boolean j4 = this.J3();
            if (j3 != j4) {
                if (j4) {
                    this.O0(this.s0);
                }
                else {
                    this.L3(this.s0);
                }
                this.invalidateSelf();
                this.i2();
            }
        }
    }
    
    public float K1() {
        return this.J0;
    }
    
    public void K2(final float l0) {
        if (this.l0 != l0) {
            this.l0 = l0;
            this.invalidateSelf();
            this.i2();
        }
    }
    
    @n0
    public int L1() {
        return this.r1;
    }
    
    public void L2(@p final int n) {
        this.K2(this.Q0.getResources().getDimension(n));
    }
    
    @k0
    public ColorStateList M1() {
        return this.p0;
    }
    
    public void M2(final float i0) {
        if (this.I0 != i0) {
            this.I0 = i0;
            this.invalidateSelf();
            this.i2();
        }
    }
    
    @k0
    public h N1() {
        return this.G0;
    }
    
    public void N2(@p final int n) {
        this.M2(this.Q0.getResources().getDimension(n));
    }
    
    @k0
    public CharSequence O1() {
        return this.q0;
    }
    
    public void O2(@k0 final ColorStateList n0) {
        if (this.n0 != n0) {
            this.n0 = n0;
            if (this.s1) {
                this.E0(n0);
            }
            this.onStateChange(this.getState());
        }
    }
    
    @k0
    public com.google.android.material.resources.d P1() {
        return this.X0.d();
    }
    
    public void P2(@n final int n) {
        this.O2(androidx.appcompat.content.res.a.c(this.Q0, n));
    }
    
    float Q0() {
        if (!this.J3() && !this.I3()) {
            return 0.0f;
        }
        return this.J0 + this.G1() + this.K0;
    }
    
    public float Q1() {
        return this.M0;
    }
    
    public void Q2(final float n) {
        if (this.o0 != n) {
            this.o0 = n;
            this.R0.setStrokeWidth(n);
            if (this.s1) {
                super.H0(n);
            }
            this.invalidateSelf();
        }
    }
    
    public float R1() {
        return this.L0;
    }
    
    public void R2(@p final int n) {
        this.Q2(this.Q0.getResources().getDimension(n));
    }
    
    public boolean T1() {
        return this.m1;
    }
    
    public void T2(@k0 Drawable mutate) {
        final Drawable x1 = this.x1();
        if (x1 != mutate) {
            final float u0 = this.U0();
            if (mutate != null) {
                mutate = c.r(mutate).mutate();
            }
            else {
                mutate = null;
            }
            this.x0 = mutate;
            if (com.google.android.material.ripple.b.a) {
                this.N3();
            }
            final float u2 = this.U0();
            this.L3(x1);
            if (this.K3()) {
                this.O0(this.x0);
            }
            this.invalidateSelf();
            if (u0 != u2) {
                this.i2();
            }
        }
    }
    
    float U0() {
        if (this.K3()) {
            return this.N0 + this.A0 + this.O0;
        }
        return 0.0f;
    }
    
    public void U2(@k0 final CharSequence charSequence) {
        if (this.B0 != charSequence) {
            this.B0 = androidx.core.text.a.c().m(charSequence);
            this.invalidateSelf();
        }
    }
    
    public boolean V1() {
        return this.C0;
    }
    
    @Deprecated
    public void V2(final boolean b) {
        this.i3(b);
    }
    
    @Deprecated
    public boolean W1() {
        return this.X1();
    }
    
    @Deprecated
    public void W2(@androidx.annotation.h final int n) {
        this.h3(n);
    }
    
    @j0
    Paint$Align X0(@j0 final Rect rect, @j0 final PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint$Align paint$Align = Paint$Align.LEFT;
        if (this.q0 != null) {
            final float n = this.I0 + this.Q0() + this.L0;
            if (c.f(this) == 0) {
                pointF.x = rect.left + n;
                paint$Align = Paint$Align.LEFT;
            }
            else {
                pointF.x = rect.right - n;
                paint$Align = Paint$Align.RIGHT;
            }
            pointF.y = rect.centerY() - this.W0();
        }
        return paint$Align;
    }
    
    public boolean X1() {
        return this.D0;
    }
    
    public void X2(final float o0) {
        if (this.O0 != o0) {
            this.O0 = o0;
            this.invalidateSelf();
            if (this.K3()) {
                this.i2();
            }
        }
    }
    
    @Deprecated
    public boolean Y1() {
        return this.Z1();
    }
    
    public void Y2(@p final int n) {
        this.X2(this.Q0.getResources().getDimension(n));
    }
    
    public boolean Z1() {
        return this.r0;
    }
    
    public void Z2(@androidx.annotation.s final int n) {
        this.T2(androidx.appcompat.content.res.a.d(this.Q0, n));
    }
    
    public void a() {
        this.i2();
        this.invalidateSelf();
    }
    
    @Deprecated
    public boolean a2() {
        return this.c2();
    }
    
    public void a3(final float a0) {
        if (this.A0 != a0) {
            this.A0 = a0;
            this.invalidateSelf();
            if (this.K3()) {
                this.i2();
            }
        }
    }
    
    public boolean b2() {
        return f2(this.x0);
    }
    
    public void b3(@p final int n) {
        this.a3(this.Q0.getResources().getDimension(n));
    }
    
    public boolean c2() {
        return this.w0;
    }
    
    public void c3(final float n0) {
        if (this.N0 != n0) {
            this.N0 = n0;
            this.invalidateSelf();
            if (this.K3()) {
                this.i2();
            }
        }
    }
    
    boolean d2() {
        return this.s1;
    }
    
    public void d3(@p final int n) {
        this.c3(this.Q0.getResources().getDimension(n));
    }
    
    @Override
    public void draw(@j0 final Canvas canvas) {
        final Rect bounds = this.getBounds();
        if (!bounds.isEmpty()) {
            if (this.getAlpha() != 0) {
                int a = 0;
                final int g1 = this.g1;
                if (g1 < 255) {
                    a = p2.a.a(canvas, (float)bounds.left, (float)bounds.top, (float)bounds.right, (float)bounds.bottom, g1);
                }
                this.f1(canvas, bounds);
                this.c1(canvas, bounds);
                if (this.s1) {
                    super.draw(canvas);
                }
                this.e1(canvas, bounds);
                this.h1(canvas, bounds);
                this.d1(canvas, bounds);
                this.b1(canvas, bounds);
                if (this.q1) {
                    this.j1(canvas, bounds);
                }
                this.g1(canvas, bounds);
                this.i1(canvas, bounds);
                if (this.g1 < 255) {
                    canvas.restoreToCount(a);
                }
            }
        }
    }
    
    public boolean e3(@j0 final int[] array) {
        if (!Arrays.equals(this.l1, array)) {
            this.l1 = array;
            if (this.K3()) {
                return this.j2(this.getState(), array);
            }
        }
        return false;
    }
    
    public void f3(@k0 final ColorStateList z0) {
        if (this.z0 != z0) {
            this.z0 = z0;
            if (this.K3()) {
                c.o(this.x0, z0);
            }
            this.onStateChange(this.getState());
        }
    }
    
    public void g3(@n final int n) {
        this.f3(androidx.appcompat.content.res.a.c(this.Q0, n));
    }
    
    public int getAlpha() {
        return this.g1;
    }
    
    @k0
    public ColorFilter getColorFilter() {
        return this.h1;
    }
    
    public int getIntrinsicHeight() {
        return (int)this.l0;
    }
    
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.I0 + this.Q0() + this.L0 + this.X0.f(this.O1().toString()) + this.M0 + this.U0() + this.P0), this.r1);
    }
    
    @Override
    public int getOpacity() {
        return -3;
    }
    
    @TargetApi(21)
    @Override
    public void getOutline(@j0 final Outline outline) {
        if (this.s1) {
            super.getOutline(outline);
            return;
        }
        final Rect bounds = this.getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.m0);
        }
        else {
            outline.setRoundRect(0, 0, this.getIntrinsicWidth(), this.getIntrinsicHeight(), this.m0);
        }
        outline.setAlpha(this.getAlpha() / 255.0f);
    }
    
    public void h3(@androidx.annotation.h final int n) {
        this.i3(this.Q0.getResources().getBoolean(n));
    }
    
    protected void i2() {
        final a a = this.o1.get();
        if (a != null) {
            a.a();
        }
    }
    
    public void i3(final boolean w0) {
        if (this.w0 != w0) {
            final boolean k3 = this.K3();
            this.w0 = w0;
            final boolean k4 = this.K3();
            if (k3 != k4) {
                if (k4) {
                    this.O0(this.x0);
                }
                else {
                    this.L3(this.x0);
                }
                this.invalidateSelf();
                this.i2();
            }
        }
    }
    
    public void invalidateDrawable(@j0 final Drawable drawable) {
        final Drawable$Callback callback = this.getCallback();
        if (callback != null) {
            callback.invalidateDrawable((Drawable)this);
        }
    }
    
    @Override
    public boolean isStateful() {
        return e2(this.j0) || e2(this.k0) || e2(this.n0) || (this.m1 && e2(this.n1)) || g2(this.X0.d()) || this.Y0() || f2(this.s0) || f2(this.E0) || e2(this.j1);
    }
    
    public void j3(@k0 final a referent) {
        this.o1 = new WeakReference<a>(referent);
    }
    
    @k0
    public Drawable k1() {
        return this.E0;
    }
    
    public void k2(final boolean c0) {
        if (this.C0 != c0) {
            this.C0 = c0;
            final float q0 = this.Q0();
            if (!c0 && this.e1) {
                this.e1 = false;
            }
            final float q2 = this.Q0();
            this.invalidateSelf();
            if (q0 != q2) {
                this.i2();
            }
        }
    }
    
    public void k3(@k0 final TextUtils$TruncateAt p) {
        this.p1 = p;
    }
    
    @k0
    public ColorStateList l1() {
        return this.F0;
    }
    
    public void l2(@androidx.annotation.h final int n) {
        this.k2(this.Q0.getResources().getBoolean(n));
    }
    
    public void l3(@k0 final h h0) {
        this.H0 = h0;
    }
    
    @k0
    public ColorStateList m1() {
        return this.k0;
    }
    
    public void m2(@k0 final Drawable e0) {
        if (this.E0 != e0) {
            final float q0 = this.Q0();
            this.E0 = e0;
            final float q2 = this.Q0();
            this.L3(this.E0);
            this.O0(this.E0);
            this.invalidateSelf();
            if (q0 != q2) {
                this.i2();
            }
        }
    }
    
    public void m3(@androidx.annotation.b final int n) {
        this.l3(h.d(this.Q0, n));
    }
    
    public float n1() {
        float n;
        if (this.s1) {
            n = this.R();
        }
        else {
            n = this.m0;
        }
        return n;
    }
    
    @Deprecated
    public void n2(final boolean b) {
        this.t2(b);
    }
    
    public void n3(float q0) {
        if (this.K0 != q0) {
            final float q2 = this.Q0();
            this.K0 = q0;
            q0 = this.Q0();
            this.invalidateSelf();
            if (q2 != q0) {
                this.i2();
            }
        }
    }
    
    public float o1() {
        return this.P0;
    }
    
    @Deprecated
    public void o2(@androidx.annotation.h final int n) {
        this.t2(this.Q0.getResources().getBoolean(n));
    }
    
    public void o3(@p final int n) {
        this.n3(this.Q0.getResources().getDimension(n));
    }
    
    public boolean onLayoutDirectionChanged(final int n) {
        boolean onLayoutDirectionChanged;
        final boolean b = onLayoutDirectionChanged = super.onLayoutDirectionChanged(n);
        if (this.J3()) {
            onLayoutDirectionChanged = (b | c.m(this.s0, n));
        }
        boolean b2 = onLayoutDirectionChanged;
        if (this.I3()) {
            b2 = (onLayoutDirectionChanged | c.m(this.E0, n));
        }
        int n2 = b2 ? 1 : 0;
        if (this.K3()) {
            n2 = ((b2 | c.m(this.x0, n)) ? 1 : 0);
        }
        if (n2 != 0) {
            this.invalidateSelf();
        }
        return true;
    }
    
    protected boolean onLevelChange(final int level) {
        boolean onLevelChange;
        final boolean b = onLevelChange = super.onLevelChange(level);
        if (this.J3()) {
            onLevelChange = (b | this.s0.setLevel(level));
        }
        boolean b2 = onLevelChange;
        if (this.I3()) {
            b2 = (onLevelChange | this.E0.setLevel(level));
        }
        boolean b3 = b2;
        if (this.K3()) {
            b3 = (b2 | this.x0.setLevel(level));
        }
        if (b3) {
            this.invalidateSelf();
        }
        return b3;
    }
    
    public boolean onStateChange(@j0 final int[] array) {
        if (this.s1) {
            super.onStateChange(array);
        }
        return this.j2(array, this.C1());
    }
    
    @k0
    public Drawable p1() {
        final Drawable s0 = this.s0;
        Drawable q;
        if (s0 != null) {
            q = c.q(s0);
        }
        else {
            q = null;
        }
        return q;
    }
    
    public void p2(@androidx.annotation.s final int n) {
        this.m2(androidx.appcompat.content.res.a.d(this.Q0, n));
    }
    
    public void p3(float q0) {
        if (this.J0 != q0) {
            final float q2 = this.Q0();
            this.J0 = q0;
            q0 = this.Q0();
            this.invalidateSelf();
            if (q2 != q0) {
                this.i2();
            }
        }
    }
    
    public float q1() {
        return this.u0;
    }
    
    public void q2(@k0 final ColorStateList f0) {
        if (this.F0 != f0) {
            this.F0 = f0;
            if (this.Y0()) {
                c.o(this.E0, f0);
            }
            this.onStateChange(this.getState());
        }
    }
    
    public void q3(@p final int n) {
        this.p3(this.Q0.getResources().getDimension(n));
    }
    
    @k0
    public ColorStateList r1() {
        return this.t0;
    }
    
    public void r2(@n final int n) {
        this.q2(androidx.appcompat.content.res.a.c(this.Q0, n));
    }
    
    public void r3(@n0 final int r1) {
        this.r1 = r1;
    }
    
    public float s1() {
        return this.l0;
    }
    
    public void s2(@androidx.annotation.h final int n) {
        this.t2(this.Q0.getResources().getBoolean(n));
    }
    
    public void s3(@k0 final ColorStateList p) {
        if (this.p0 != p) {
            this.p0 = p;
            this.M3();
            this.onStateChange(this.getState());
        }
    }
    
    public void scheduleDrawable(@j0 final Drawable drawable, @j0 final Runnable runnable, final long n) {
        final Drawable$Callback callback = this.getCallback();
        if (callback != null) {
            callback.scheduleDrawable((Drawable)this, runnable, n);
        }
    }
    
    @Override
    public void setAlpha(final int g1) {
        if (this.g1 != g1) {
            this.g1 = g1;
            this.invalidateSelf();
        }
    }
    
    @Override
    public void setColorFilter(@k0 final ColorFilter h1) {
        if (this.h1 != h1) {
            this.h1 = h1;
            this.invalidateSelf();
        }
    }
    
    @Override
    public void setTintList(@k0 final ColorStateList j1) {
        if (this.j1 != j1) {
            this.j1 = j1;
            this.onStateChange(this.getState());
        }
    }
    
    @Override
    public void setTintMode(@j0 final PorterDuff$Mode k1) {
        if (this.k1 != k1) {
            this.k1 = k1;
            this.i1 = a.c(this, this.j1, k1);
            this.invalidateSelf();
        }
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        boolean setVisible;
        final boolean b3 = setVisible = super.setVisible(b, b2);
        if (this.J3()) {
            setVisible = (b3 | this.s0.setVisible(b, b2));
        }
        boolean b4 = setVisible;
        if (this.I3()) {
            b4 = (setVisible | this.E0.setVisible(b, b2));
        }
        boolean b5 = b4;
        if (this.K3()) {
            b5 = (b4 | this.x0.setVisible(b, b2));
        }
        if (b5) {
            this.invalidateSelf();
        }
        return b5;
    }
    
    public float t1() {
        return this.I0;
    }
    
    public void t2(final boolean d0) {
        if (this.D0 != d0) {
            final boolean i3 = this.I3();
            this.D0 = d0;
            final boolean i4 = this.I3();
            if (i3 != i4) {
                if (i4) {
                    this.O0(this.E0);
                }
                else {
                    this.L3(this.E0);
                }
                this.invalidateSelf();
                this.i2();
            }
        }
    }
    
    public void t3(@n final int n) {
        this.s3(androidx.appcompat.content.res.a.c(this.Q0, n));
    }
    
    @k0
    public ColorStateList u1() {
        return this.n0;
    }
    
    public void u2(@k0 final ColorStateList k0) {
        if (this.k0 != k0) {
            this.k0 = k0;
            this.onStateChange(this.getState());
        }
    }
    
    void u3(final boolean q1) {
        this.q1 = q1;
    }
    
    public void unscheduleDrawable(@j0 final Drawable drawable, @j0 final Runnable runnable) {
        final Drawable$Callback callback = this.getCallback();
        if (callback != null) {
            callback.unscheduleDrawable((Drawable)this, runnable);
        }
    }
    
    public float v1() {
        return this.o0;
    }
    
    public void v2(@n final int n) {
        this.u2(androidx.appcompat.content.res.a.c(this.Q0, n));
    }
    
    public void v3(@k0 final h g0) {
        this.G0 = g0;
    }
    
    public void w1(@j0 final RectF rectF) {
        this.R0(this.getBounds(), rectF);
    }
    
    @Deprecated
    public void w2(final float m0) {
        if (this.m0 != m0) {
            this.m0 = m0;
            this.setShapeAppearanceModel(this.getShapeAppearanceModel().w(m0));
        }
    }
    
    public void w3(@androidx.annotation.b final int n) {
        this.v3(h.d(this.Q0, n));
    }
    
    @k0
    public Drawable x1() {
        final Drawable x0 = this.x0;
        Drawable q;
        if (x0 != null) {
            q = c.q(x0);
        }
        else {
            q = null;
        }
        return q;
    }
    
    @Deprecated
    public void x2(@p final int n) {
        this.w2(this.Q0.getResources().getDimension(n));
    }
    
    public void x3(@k0 final CharSequence charSequence) {
        CharSequence q0 = charSequence;
        if (charSequence == null) {
            q0 = "";
        }
        if (!TextUtils.equals(this.q0, q0)) {
            this.q0 = q0;
            this.X0.j(true);
            this.invalidateSelf();
            this.i2();
        }
    }
    
    @k0
    public CharSequence y1() {
        return this.B0;
    }
    
    public void y2(final float p) {
        if (this.P0 != p) {
            this.P0 = p;
            this.invalidateSelf();
            this.i2();
        }
    }
    
    public void y3(@k0 final com.google.android.material.resources.d d) {
        this.X0.i(d, this.Q0);
    }
    
    public float z1() {
        return this.O0;
    }
    
    public void z2(@p final int n) {
        this.y2(this.Q0.getResources().getDimension(n));
    }
    
    public void z3(@x0 final int n) {
        this.y3(new com.google.android.material.resources.d(this.Q0, n));
    }
    
    public interface a
    {
        void a();
    }
}
