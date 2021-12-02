// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.chip;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import android.os.Bundle;
import java.util.List;
import androidx.annotation.i;
import androidx.annotation.x0;
import android.widget.TextView$BufferType;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.annotation.p;
import androidx.annotation.n;
import android.widget.CompoundButton;
import android.graphics.PorterDuff$Mode;
import android.view.PointerIcon;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import com.google.android.material.shape.j;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;
import com.google.android.material.animation.h;
import android.text.TextUtils$TruncateAt;
import android.content.res.ColorStateList;
import android.view.KeyEvent;
import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.b0;
import android.annotation.SuppressLint;
import java.lang.reflect.InvocationTargetException;
import android.view.MotionEvent;
import android.graphics.drawable.Drawable$Callback;
import android.util.Log;
import com.google.android.material.resources.d;
import android.text.TextPaint;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import com.google.android.material.ripple.b;
import android.content.res.TypedArray;
import com.google.android.material.resources.c;
import android.os.Build$VERSION;
import com.google.android.material.internal.t;
import android.view.View;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.material.resources.f;
import android.graphics.RectF;
import androidx.annotation.j0;
import androidx.annotation.q;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.InsetDrawable;
import androidx.annotation.k0;
import android.graphics.Rect;
import com.google.android.material.shape.s;
import androidx.appcompat.widget.g;

public class Chip extends g implements a, s
{
    private static final String c0 = "Chip";
    private static final int d0;
    private static final int e0 = 0;
    private static final int f0 = 1;
    private static final Rect g0;
    private static final int[] h0;
    private static final int[] i0;
    private static final String j0 = "http://schemas.android.com/apk/res/android";
    private static final int k0 = 48;
    private static final String l0 = "android.widget.Button";
    private static final String m0 = "android.widget.CompoundButton";
    private static final String n0 = "android.view.View";
    @k0
    private com.google.android.material.chip.a J;
    @k0
    private InsetDrawable K;
    @k0
    private RippleDrawable L;
    @k0
    private View$OnClickListener M;
    @k0
    private CompoundButton$OnCheckedChangeListener N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private int T;
    @androidx.annotation.q(unit = 1)
    private int U;
    @j0
    private final c V;
    private final Rect W;
    private final RectF a0;
    private final f b0;
    
    static {
        d0 = o2.a.n.mb;
        g0 = new Rect();
        h0 = new int[] { 16842913 };
        i0 = new int[] { 16842911 };
    }
    
    public Chip(final Context context) {
        this(context, null);
    }
    
    public Chip(final Context context, final AttributeSet set) {
        this(context, set, o2.a.c.Y1);
    }
    
    public Chip(final Context context, final AttributeSet set, final int n) {
        final int d0 = Chip.d0;
        super(com.google.android.material.theme.overlay.a.c(context, set, n, d0), set, n);
        this.W = new Rect();
        this.a0 = new RectF();
        this.b0 = new f() {
            @Override
            public void a(final int n) {
            }
            
            @Override
            public void b(@j0 final Typeface typeface, final boolean b) {
                final Chip a = Chip.this;
                CharSequence text;
                if (a.J.H3()) {
                    text = Chip.this.J.O1();
                }
                else {
                    text = Chip.this.getText();
                }
                a.setText(text);
                Chip.this.requestLayout();
                Chip.this.invalidate();
            }
        };
        final Context context2 = this.getContext();
        this.H(set);
        final com.google.android.material.chip.a z0 = com.google.android.material.chip.a.Z0(context2, set, n, d0);
        this.o(context2, set, n);
        this.setChipDrawable(z0);
        z0.m0(androidx.core.view.j0.P((View)this));
        final TypedArray j = t.j(context2, set, o2.a.o.j5, n, d0, new int[0]);
        if (Build$VERSION.SDK_INT < 23) {
            this.setTextColor(com.google.android.material.resources.c.a(context2, j, o2.a.o.m5));
        }
        final boolean hasValue = j.hasValue(o2.a.o.V5);
        j.recycle();
        this.V = new c(this);
        this.C();
        if (!hasValue) {
            this.p();
        }
        this.setChecked(this.O);
        this.setText(z0.O1());
        this.setEllipsize(z0.H1());
        this.G();
        if (!this.J.H3()) {
            this.setLines(1);
            this.setHorizontallyScrolling(true);
        }
        this.setGravity(8388627);
        this.F();
        if (this.A()) {
            this.setMinHeight(this.U);
        }
        this.T = androidx.core.view.j0.X((View)this);
    }
    
    private void B(@k0 final com.google.android.material.chip.a a) {
        if (a != null) {
            a.j3(null);
        }
    }
    
    private void C() {
        c v;
        if (this.n() && this.x() && this.M != null) {
            v = this.V;
        }
        else {
            v = null;
        }
        androidx.core.view.j0.z1((View)this, v);
    }
    
    private void D() {
        if (com.google.android.material.ripple.b.a) {
            this.E();
        }
        else {
            this.J.G3(true);
            androidx.core.view.j0.G1((View)this, this.getBackgroundDrawable());
            this.F();
            this.l();
        }
    }
    
    private void E() {
        this.L = new RippleDrawable(com.google.android.material.ripple.b.d(this.J.M1()), this.getBackgroundDrawable(), (Drawable)null);
        this.J.G3(false);
        androidx.core.view.j0.G1((View)this, (Drawable)this.L);
        this.F();
    }
    
    private void F() {
        if (!TextUtils.isEmpty(this.getText())) {
            final com.google.android.material.chip.a j = this.J;
            if (j != null) {
                final int n = (int)(j.o1() + this.J.Q1() + this.J.U0());
                final int n2 = (int)(this.J.t1() + this.J.R1() + this.J.Q0());
                int n3 = n;
                int n4 = n2;
                if (this.K != null) {
                    final Rect rect = new Rect();
                    this.K.getPadding(rect);
                    n4 = n2 + rect.left;
                    n3 = n + rect.right;
                }
                androidx.core.view.j0.b2((View)this, n4, this.getPaddingTop(), n3, this.getPaddingBottom());
            }
        }
    }
    
    private void G() {
        final TextPaint paint = this.getPaint();
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            paint.drawableState = j.getState();
        }
        final com.google.android.material.resources.d textAppearance = this.getTextAppearance();
        if (textAppearance != null) {
            textAppearance.j(this.getContext(), paint, this.b0);
        }
    }
    
    private void H(@k0 final AttributeSet set) {
        if (set == null) {
            return;
        }
        if (set.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (set.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (set.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (set.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (set.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (set.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && set.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && set.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && set.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
            if (set.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }
    
    @j0
    private RectF getCloseIconTouchBounds() {
        this.a0.setEmpty();
        if (this.n() && this.M != null) {
            this.J.E1(this.a0);
        }
        return this.a0;
    }
    
    @j0
    private Rect getCloseIconTouchBoundsInt() {
        final RectF closeIconTouchBounds = this.getCloseIconTouchBounds();
        this.W.set((int)closeIconTouchBounds.left, (int)closeIconTouchBounds.top, (int)closeIconTouchBounds.right, (int)closeIconTouchBounds.bottom);
        return this.W;
    }
    
    @k0
    private com.google.android.material.resources.d getTextAppearance() {
        final com.google.android.material.chip.a j = this.J;
        com.google.android.material.resources.d p1;
        if (j != null) {
            p1 = j.P1();
        }
        else {
            p1 = null;
        }
        return p1;
    }
    
    private void i(@j0 final com.google.android.material.chip.a a) {
        a.j3((a)this);
    }
    
    @j0
    private int[] j() {
        int enabled;
        final int n = enabled = (this.isEnabled() ? 1 : 0);
        if (this.R) {
            enabled = n + 1;
        }
        int n2 = enabled;
        if (this.Q) {
            n2 = enabled + 1;
        }
        int n3 = n2;
        if (this.P) {
            n3 = n2 + 1;
        }
        int n4 = n3;
        if (this.isChecked()) {
            n4 = n3 + 1;
        }
        final int[] array = new int[n4];
        int n5 = 0;
        if (this.isEnabled()) {
            array[0] = 16842910;
            n5 = 1;
        }
        int n6 = n5;
        if (this.R) {
            array[n5] = 16842908;
            n6 = n5 + 1;
        }
        int n7 = n6;
        if (this.Q) {
            array[n6] = 16843623;
            n7 = n6 + 1;
        }
        int n8 = n7;
        if (this.P) {
            array[n7] = 16842919;
            n8 = n7 + 1;
        }
        if (this.isChecked()) {
            array[n8] = 16842913;
        }
        return array;
    }
    
    private void l() {
        if (this.getBackgroundDrawable() == this.K && this.J.getCallback() == null) {
            this.J.setCallback((Drawable$Callback)this.K);
        }
    }
    
    @SuppressLint({ "PrivateApi" })
    private boolean m(@j0 MotionEvent ex) {
        if (((MotionEvent)ex).getAction() == 10) {
            try {
                ex = (NoSuchFieldException)androidx.customview.widget.a.class.getDeclaredField("m");
                ((Field)ex).setAccessible(true);
                if ((int)((Field)ex).get(this.V) != Integer.MIN_VALUE) {
                    ex = (NoSuchFieldException)androidx.customview.widget.a.class.getDeclaredMethod("Z", Integer.TYPE);
                    ((Method)ex).setAccessible(true);
                    ((Method)ex).invoke(this.V, Integer.MIN_VALUE);
                    return true;
                }
                return false;
            }
            catch (NoSuchFieldException ex) {}
            catch (InvocationTargetException ex) {}
            catch (IllegalAccessException ex) {}
            catch (NoSuchMethodException ex2) {}
            Log.e("Chip", "Unable to send Accessibility Exit event", (Throwable)ex);
        }
        return false;
    }
    
    private boolean n() {
        final com.google.android.material.chip.a j = this.J;
        return j != null && j.x1() != null;
    }
    
    private void o(final Context context, @k0 final AttributeSet set, final int n) {
        final TypedArray j = t.j(context, set, o2.a.o.j5, n, Chip.d0, new int[0]);
        this.S = j.getBoolean(o2.a.o.Q5, false);
        this.U = (int)Math.ceil(j.getDimension(o2.a.o.E5, (float)Math.ceil(com.google.android.material.internal.b0.e(this.getContext(), 48))));
        j.recycle();
    }
    
    private void p() {
        if (Build$VERSION.SDK_INT >= 21) {
            this.setOutlineProvider((ViewOutlineProvider)new ViewOutlineProvider() {
                @TargetApi(21)
                public void getOutline(final View view, @j0 final Outline outline) {
                    if (Chip.this.J != null) {
                        Chip.this.J.getOutline(outline);
                    }
                    else {
                        outline.setAlpha(0.0f);
                    }
                }
            });
        }
    }
    
    private void q(final int n, final int n2, final int n3, final int n4) {
        this.K = new InsetDrawable((Drawable)this.J, n, n2, n3, n4);
    }
    
    private void setCloseIconHovered(final boolean q) {
        if (this.Q != q) {
            this.Q = q;
            this.refreshDrawableState();
        }
    }
    
    private void setCloseIconPressed(final boolean p) {
        if (this.P != p) {
            this.P = p;
            this.refreshDrawableState();
        }
    }
    
    private void z() {
        if (this.K != null) {
            this.K = null;
            this.setMinWidth(0);
            this.setMinHeight((int)this.getChipMinHeight());
            this.D();
        }
    }
    
    public boolean A() {
        return this.S;
    }
    
    @Override
    public void a() {
        this.k(this.U);
        this.requestLayout();
        if (Build$VERSION.SDK_INT >= 21) {
            this.invalidateOutline();
        }
    }
    
    protected boolean dispatchHoverEvent(@j0 final MotionEvent motionEvent) {
        return this.m(motionEvent) || this.V.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return (this.V.w(keyEvent) && this.V.B() != Integer.MIN_VALUE) || super.dispatchKeyEvent(keyEvent);
    }
    
    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final com.google.android.material.chip.a j = this.J;
        if (j != null && j.b2() && this.J.e3(this.j())) {
            this.invalidate();
        }
    }
    
    @k0
    public Drawable getBackgroundDrawable() {
        Object o;
        if ((o = this.K) == null) {
            o = this.J;
        }
        return (Drawable)o;
    }
    
    @k0
    public Drawable getCheckedIcon() {
        final com.google.android.material.chip.a j = this.J;
        Drawable k1;
        if (j != null) {
            k1 = j.k1();
        }
        else {
            k1 = null;
        }
        return k1;
    }
    
    @k0
    public ColorStateList getCheckedIconTint() {
        final com.google.android.material.chip.a j = this.J;
        ColorStateList l1;
        if (j != null) {
            l1 = j.l1();
        }
        else {
            l1 = null;
        }
        return l1;
    }
    
    @k0
    public ColorStateList getChipBackgroundColor() {
        final com.google.android.material.chip.a j = this.J;
        ColorStateList m1;
        if (j != null) {
            m1 = j.m1();
        }
        else {
            m1 = null;
        }
        return m1;
    }
    
    public float getChipCornerRadius() {
        final com.google.android.material.chip.a j = this.J;
        float max = 0.0f;
        if (j != null) {
            max = Math.max(0.0f, j.n1());
        }
        return max;
    }
    
    public Drawable getChipDrawable() {
        return this.J;
    }
    
    public float getChipEndPadding() {
        final com.google.android.material.chip.a j = this.J;
        float o1;
        if (j != null) {
            o1 = j.o1();
        }
        else {
            o1 = 0.0f;
        }
        return o1;
    }
    
    @k0
    public Drawable getChipIcon() {
        final com.google.android.material.chip.a j = this.J;
        Drawable p1;
        if (j != null) {
            p1 = j.p1();
        }
        else {
            p1 = null;
        }
        return p1;
    }
    
    public float getChipIconSize() {
        final com.google.android.material.chip.a j = this.J;
        float q1;
        if (j != null) {
            q1 = j.q1();
        }
        else {
            q1 = 0.0f;
        }
        return q1;
    }
    
    @k0
    public ColorStateList getChipIconTint() {
        final com.google.android.material.chip.a j = this.J;
        ColorStateList r1;
        if (j != null) {
            r1 = j.r1();
        }
        else {
            r1 = null;
        }
        return r1;
    }
    
    public float getChipMinHeight() {
        final com.google.android.material.chip.a j = this.J;
        float s1;
        if (j != null) {
            s1 = j.s1();
        }
        else {
            s1 = 0.0f;
        }
        return s1;
    }
    
    public float getChipStartPadding() {
        final com.google.android.material.chip.a j = this.J;
        float t1;
        if (j != null) {
            t1 = j.t1();
        }
        else {
            t1 = 0.0f;
        }
        return t1;
    }
    
    @k0
    public ColorStateList getChipStrokeColor() {
        final com.google.android.material.chip.a j = this.J;
        ColorStateList u1;
        if (j != null) {
            u1 = j.u1();
        }
        else {
            u1 = null;
        }
        return u1;
    }
    
    public float getChipStrokeWidth() {
        final com.google.android.material.chip.a j = this.J;
        float v1;
        if (j != null) {
            v1 = j.v1();
        }
        else {
            v1 = 0.0f;
        }
        return v1;
    }
    
    @Deprecated
    public CharSequence getChipText() {
        return this.getText();
    }
    
    @k0
    public Drawable getCloseIcon() {
        final com.google.android.material.chip.a j = this.J;
        Drawable x1;
        if (j != null) {
            x1 = j.x1();
        }
        else {
            x1 = null;
        }
        return x1;
    }
    
    @k0
    public CharSequence getCloseIconContentDescription() {
        final com.google.android.material.chip.a j = this.J;
        CharSequence y1;
        if (j != null) {
            y1 = j.y1();
        }
        else {
            y1 = null;
        }
        return y1;
    }
    
    public float getCloseIconEndPadding() {
        final com.google.android.material.chip.a j = this.J;
        float z1;
        if (j != null) {
            z1 = j.z1();
        }
        else {
            z1 = 0.0f;
        }
        return z1;
    }
    
    public float getCloseIconSize() {
        final com.google.android.material.chip.a j = this.J;
        float a1;
        if (j != null) {
            a1 = j.A1();
        }
        else {
            a1 = 0.0f;
        }
        return a1;
    }
    
    public float getCloseIconStartPadding() {
        final com.google.android.material.chip.a j = this.J;
        float b1;
        if (j != null) {
            b1 = j.B1();
        }
        else {
            b1 = 0.0f;
        }
        return b1;
    }
    
    @k0
    public ColorStateList getCloseIconTint() {
        final com.google.android.material.chip.a j = this.J;
        ColorStateList d1;
        if (j != null) {
            d1 = j.D1();
        }
        else {
            d1 = null;
        }
        return d1;
    }
    
    @k0
    public TextUtils$TruncateAt getEllipsize() {
        final com.google.android.material.chip.a j = this.J;
        TextUtils$TruncateAt h1;
        if (j != null) {
            h1 = j.H1();
        }
        else {
            h1 = null;
        }
        return h1;
    }
    
    public void getFocusedRect(@j0 final Rect rect) {
        if (this.V.B() != 1 && this.V.x() != 1) {
            super.getFocusedRect(rect);
        }
        else {
            rect.set(this.getCloseIconTouchBoundsInt());
        }
    }
    
    @k0
    public h getHideMotionSpec() {
        final com.google.android.material.chip.a j = this.J;
        h i1;
        if (j != null) {
            i1 = j.I1();
        }
        else {
            i1 = null;
        }
        return i1;
    }
    
    public float getIconEndPadding() {
        final com.google.android.material.chip.a j = this.J;
        float j2;
        if (j != null) {
            j2 = j.J1();
        }
        else {
            j2 = 0.0f;
        }
        return j2;
    }
    
    public float getIconStartPadding() {
        final com.google.android.material.chip.a j = this.J;
        float k1;
        if (j != null) {
            k1 = j.K1();
        }
        else {
            k1 = 0.0f;
        }
        return k1;
    }
    
    @k0
    public ColorStateList getRippleColor() {
        final com.google.android.material.chip.a j = this.J;
        ColorStateList m1;
        if (j != null) {
            m1 = j.M1();
        }
        else {
            m1 = null;
        }
        return m1;
    }
    
    @j0
    @Override
    public o getShapeAppearanceModel() {
        return this.J.getShapeAppearanceModel();
    }
    
    @k0
    public h getShowMotionSpec() {
        final com.google.android.material.chip.a j = this.J;
        h n1;
        if (j != null) {
            n1 = j.N1();
        }
        else {
            n1 = null;
        }
        return n1;
    }
    
    public float getTextEndPadding() {
        final com.google.android.material.chip.a j = this.J;
        float q1;
        if (j != null) {
            q1 = j.Q1();
        }
        else {
            q1 = 0.0f;
        }
        return q1;
    }
    
    public float getTextStartPadding() {
        final com.google.android.material.chip.a j = this.J;
        float r1;
        if (j != null) {
            r1 = j.R1();
        }
        else {
            r1 = 0.0f;
        }
        return r1;
    }
    
    public boolean k(@androidx.annotation.q final int n) {
        this.U = n;
        final boolean a = this.A();
        int n2 = 0;
        if (!a) {
            if (this.K != null) {
                this.z();
            }
            else {
                this.D();
            }
            return false;
        }
        final int max = Math.max(0, n - this.J.getIntrinsicHeight());
        final int max2 = Math.max(0, n - this.J.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.K != null) {
                this.z();
            }
            else {
                this.D();
            }
            return false;
        }
        int n3;
        if (max2 > 0) {
            n3 = max2 / 2;
        }
        else {
            n3 = 0;
        }
        if (max > 0) {
            n2 = max / 2;
        }
        if (this.K != null) {
            final Rect rect = new Rect();
            this.K.getPadding(rect);
            if (rect.top == n2 && rect.bottom == n2 && rect.left == n3 && rect.right == n3) {
                this.D();
                return true;
            }
        }
        Label_0235: {
            if (Build$VERSION.SDK_INT >= 16) {
                if (this.getMinHeight() != n) {
                    this.setMinHeight(n);
                }
                if (this.getMinWidth() == n) {
                    break Label_0235;
                }
            }
            else {
                this.setMinHeight(n);
            }
            this.setMinWidth(n);
        }
        this.q(n3, n2, n3, n2);
        this.D();
        return true;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.f((View)this, this.J);
    }
    
    protected int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 2);
        if (this.isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, Chip.h0);
        }
        if (this.r()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, Chip.i0);
        }
        return onCreateDrawableState;
    }
    
    protected void onFocusChanged(final boolean b, final int n, final Rect rect) {
        super.onFocusChanged(b, n, rect);
        this.V.M(b, n, rect);
    }
    
    public boolean onHoverEvent(@j0 final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        boolean contains;
        if (actionMasked != 7) {
            if (actionMasked != 10) {
                return super.onHoverEvent(motionEvent);
            }
            contains = false;
        }
        else {
            contains = this.getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        }
        this.setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }
    
    public void onInitializeAccessibilityNodeInfo(@j0 final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String className;
        if (!this.r() && !this.isClickable()) {
            className = "android.view.View";
        }
        else if (this.r()) {
            className = "android.widget.CompoundButton";
        }
        else {
            className = "android.widget.Button";
        }
        accessibilityNodeInfo.setClassName((CharSequence)className);
        accessibilityNodeInfo.setCheckable(this.r());
        accessibilityNodeInfo.setClickable(this.isClickable());
        if (this.getParent() instanceof ChipGroup) {
            final ChipGroup chipGroup = (ChipGroup)this.getParent();
            final androidx.core.view.accessibility.d v1 = androidx.core.view.accessibility.d.V1(accessibilityNodeInfo);
            int o;
            if (chipGroup.c()) {
                o = chipGroup.o((View)this);
            }
            else {
                o = -1;
            }
            v1.X0(androidx.core.view.accessibility.d.c.h(chipGroup.b((View)this), 1, o, 1, false, this.isChecked()));
        }
    }
    
    @TargetApi(24)
    @k0
    public PointerIcon onResolvePointerIcon(@j0 final MotionEvent motionEvent, final int n) {
        if (this.getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && this.isEnabled()) {
            return PointerIcon.getSystemIcon(this.getContext(), 1002);
        }
        return null;
    }
    
    @TargetApi(17)
    public void onRtlPropertiesChanged(final int t) {
        super.onRtlPropertiesChanged(t);
        if (this.T != t) {
            this.T = t;
            this.F();
        }
    }
    
    @SuppressLint({ "ClickableViewAccessibility" })
    public boolean onTouchEvent(@j0 final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final boolean contains = this.getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        boolean b = false;
        boolean b2 = false;
        Label_0108: {
            Label_0106: {
                Label_0101: {
                    if (actionMasked != 0) {
                        Label_0084: {
                            if (actionMasked != 1) {
                                if (actionMasked != 2) {
                                    if (actionMasked != 3) {
                                        break Label_0106;
                                    }
                                }
                                else {
                                    if (!this.P) {
                                        break Label_0106;
                                    }
                                    if (!contains) {
                                        this.setCloseIconPressed(false);
                                    }
                                    break Label_0101;
                                }
                            }
                            else if (this.P) {
                                this.y();
                                b2 = true;
                                break Label_0084;
                            }
                            b2 = false;
                        }
                        this.setCloseIconPressed(false);
                        break Label_0108;
                    }
                    if (!contains) {
                        break Label_0106;
                    }
                    this.setCloseIconPressed(true);
                }
                b2 = true;
                break Label_0108;
            }
            b2 = false;
        }
        if (b2 || super.onTouchEvent(motionEvent)) {
            b = true;
        }
        return b;
    }
    
    public boolean r() {
        final com.google.android.material.chip.a j = this.J;
        return j != null && j.V1();
    }
    
    @Deprecated
    public boolean s() {
        return this.t();
    }
    
    public void setBackground(final Drawable background) {
        if (background != this.getBackgroundDrawable() && background != this.L) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        else {
            super.setBackground(background);
        }
    }
    
    public void setBackgroundColor(final int n) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }
    
    @Override
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        if (backgroundDrawable != this.getBackgroundDrawable() && backgroundDrawable != this.L) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
        else {
            super.setBackgroundDrawable(backgroundDrawable);
        }
    }
    
    @Override
    public void setBackgroundResource(final int n) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }
    
    public void setBackgroundTintList(@k0 final ColorStateList list) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }
    
    public void setBackgroundTintMode(@k0 final PorterDuff$Mode porterDuff$Mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }
    
    public void setCheckable(final boolean b) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.k2(b);
        }
    }
    
    public void setCheckableResource(@androidx.annotation.h final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.l2(n);
        }
    }
    
    public void setChecked(final boolean b) {
        final com.google.android.material.chip.a j = this.J;
        if (j == null) {
            this.O = b;
        }
        else if (j.V1()) {
            final boolean checked = this.isChecked();
            super.setChecked(b);
            if (checked != b) {
                final CompoundButton$OnCheckedChangeListener n = this.N;
                if (n != null) {
                    n.onCheckedChanged((CompoundButton)this, b);
                }
            }
        }
    }
    
    public void setCheckedIcon(@k0 final Drawable drawable) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.m2(drawable);
        }
    }
    
    @Deprecated
    public void setCheckedIconEnabled(final boolean checkedIconVisible) {
        this.setCheckedIconVisible(checkedIconVisible);
    }
    
    @Deprecated
    public void setCheckedIconEnabledResource(@androidx.annotation.h final int checkedIconVisible) {
        this.setCheckedIconVisible(checkedIconVisible);
    }
    
    public void setCheckedIconResource(@androidx.annotation.s final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.p2(n);
        }
    }
    
    public void setCheckedIconTint(@k0 final ColorStateList list) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.q2(list);
        }
    }
    
    public void setCheckedIconTintResource(@n final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.r2(n);
        }
    }
    
    public void setCheckedIconVisible(@androidx.annotation.h final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.s2(n);
        }
    }
    
    public void setCheckedIconVisible(final boolean b) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.t2(b);
        }
    }
    
    public void setChipBackgroundColor(@k0 final ColorStateList list) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.u2(list);
        }
    }
    
    public void setChipBackgroundColorResource(@n final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.v2(n);
        }
    }
    
    @Deprecated
    public void setChipCornerRadius(final float n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.w2(n);
        }
    }
    
    @Deprecated
    public void setChipCornerRadiusResource(@p final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.x2(n);
        }
    }
    
    public void setChipDrawable(@j0 final com.google.android.material.chip.a j) {
        final com.google.android.material.chip.a i = this.J;
        if (i != j) {
            this.B(i);
            (this.J = j).u3(false);
            this.i(this.J);
            this.k(this.U);
        }
    }
    
    public void setChipEndPadding(final float n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.y2(n);
        }
    }
    
    public void setChipEndPaddingResource(@p final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.z2(n);
        }
    }
    
    public void setChipIcon(@k0 final Drawable drawable) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.A2(drawable);
        }
    }
    
    @Deprecated
    public void setChipIconEnabled(final boolean chipIconVisible) {
        this.setChipIconVisible(chipIconVisible);
    }
    
    @Deprecated
    public void setChipIconEnabledResource(@androidx.annotation.h final int chipIconVisible) {
        this.setChipIconVisible(chipIconVisible);
    }
    
    public void setChipIconResource(@androidx.annotation.s final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.D2(n);
        }
    }
    
    public void setChipIconSize(final float n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.E2(n);
        }
    }
    
    public void setChipIconSizeResource(@p final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.F2(n);
        }
    }
    
    public void setChipIconTint(@k0 final ColorStateList list) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.G2(list);
        }
    }
    
    public void setChipIconTintResource(@n final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.H2(n);
        }
    }
    
    public void setChipIconVisible(@androidx.annotation.h final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.I2(n);
        }
    }
    
    public void setChipIconVisible(final boolean b) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.J2(b);
        }
    }
    
    public void setChipMinHeight(final float n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.K2(n);
        }
    }
    
    public void setChipMinHeightResource(@p final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.L2(n);
        }
    }
    
    public void setChipStartPadding(final float n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.M2(n);
        }
    }
    
    public void setChipStartPaddingResource(@p final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.N2(n);
        }
    }
    
    public void setChipStrokeColor(@k0 final ColorStateList list) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.O2(list);
        }
    }
    
    public void setChipStrokeColorResource(@n final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.P2(n);
        }
    }
    
    public void setChipStrokeWidth(final float n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.Q2(n);
        }
    }
    
    public void setChipStrokeWidthResource(@p final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.R2(n);
        }
    }
    
    @Deprecated
    public void setChipText(@k0 final CharSequence text) {
        this.setText(text);
    }
    
    @Deprecated
    public void setChipTextResource(@w0 final int n) {
        this.setText((CharSequence)this.getResources().getString(n));
    }
    
    public void setCloseIcon(@k0 final Drawable drawable) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.T2(drawable);
        }
        this.C();
    }
    
    public void setCloseIconContentDescription(@k0 final CharSequence charSequence) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.U2(charSequence);
        }
    }
    
    @Deprecated
    public void setCloseIconEnabled(final boolean closeIconVisible) {
        this.setCloseIconVisible(closeIconVisible);
    }
    
    @Deprecated
    public void setCloseIconEnabledResource(@androidx.annotation.h final int closeIconVisible) {
        this.setCloseIconVisible(closeIconVisible);
    }
    
    public void setCloseIconEndPadding(final float n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.X2(n);
        }
    }
    
    public void setCloseIconEndPaddingResource(@p final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.Y2(n);
        }
    }
    
    public void setCloseIconResource(@androidx.annotation.s final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.Z2(n);
        }
        this.C();
    }
    
    public void setCloseIconSize(final float n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.a3(n);
        }
    }
    
    public void setCloseIconSizeResource(@p final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.b3(n);
        }
    }
    
    public void setCloseIconStartPadding(final float n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.c3(n);
        }
    }
    
    public void setCloseIconStartPaddingResource(@p final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.d3(n);
        }
    }
    
    public void setCloseIconTint(@k0 final ColorStateList list) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.f3(list);
        }
    }
    
    public void setCloseIconTintResource(@n final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.g3(n);
        }
    }
    
    public void setCloseIconVisible(@androidx.annotation.h final int n) {
        this.setCloseIconVisible(this.getResources().getBoolean(n));
    }
    
    public void setCloseIconVisible(final boolean b) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.i3(b);
        }
        this.C();
    }
    
    public void setCompoundDrawables(@k0 final Drawable drawable, @k0 final Drawable drawable2, @k0 final Drawable drawable3, @k0 final Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }
    
    public void setCompoundDrawablesRelative(@k0 final Drawable drawable, @k0 final Drawable drawable2, @k0 final Drawable drawable3, @k0 final Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }
    
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(final int n, final int n2, final int n3, final int n4) {
        if (n != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (n3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(n, n2, n3, n4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }
    
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@k0 final Drawable drawable, @k0 final Drawable drawable2, @k0 final Drawable drawable3, @k0 final Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }
    
    public void setCompoundDrawablesWithIntrinsicBounds(final int n, final int n2, final int n3, final int n4) {
        if (n != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (n3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(n, n2, n3, n4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }
    
    public void setCompoundDrawablesWithIntrinsicBounds(@k0 final Drawable drawable, @k0 final Drawable drawable2, @k0 final Drawable drawable3, @k0 final Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }
    
    @p0(21)
    public void setElevation(final float elevation) {
        super.setElevation(elevation);
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.m0(elevation);
        }
    }
    
    public void setEllipsize(final TextUtils$TruncateAt ellipsize) {
        if (this.J == null) {
            return;
        }
        if (ellipsize != TextUtils$TruncateAt.MARQUEE) {
            super.setEllipsize(ellipsize);
            final com.google.android.material.chip.a j = this.J;
            if (j != null) {
                j.k3(ellipsize);
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }
    
    public void setEnsureMinTouchTargetSize(final boolean s) {
        this.S = s;
        this.k(this.U);
    }
    
    public void setGravity(final int gravity) {
        if (gravity != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
        else {
            super.setGravity(gravity);
        }
    }
    
    public void setHideMotionSpec(@k0 final h h) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.l3(h);
        }
    }
    
    public void setHideMotionSpecResource(@androidx.annotation.b final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.m3(n);
        }
    }
    
    public void setIconEndPadding(final float n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.n3(n);
        }
    }
    
    public void setIconEndPaddingResource(@p final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.o3(n);
        }
    }
    
    public void setIconStartPadding(final float n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.p3(n);
        }
    }
    
    public void setIconStartPaddingResource(@p final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.q3(n);
        }
    }
    
    public void setLayoutDirection(final int layoutDirection) {
        if (this.J == null) {
            return;
        }
        if (Build$VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(layoutDirection);
        }
    }
    
    public void setLines(final int lines) {
        if (lines <= 1) {
            super.setLines(lines);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }
    
    public void setMaxLines(final int maxLines) {
        if (maxLines <= 1) {
            super.setMaxLines(maxLines);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }
    
    public void setMaxWidth(@n0 final int maxWidth) {
        super.setMaxWidth(maxWidth);
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.r3(maxWidth);
        }
    }
    
    public void setMinLines(final int minLines) {
        if (minLines <= 1) {
            super.setMinLines(minLines);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }
    
    void setOnCheckedChangeListenerInternal(final CompoundButton$OnCheckedChangeListener n) {
        this.N = n;
    }
    
    public void setOnCloseIconClickListener(final View$OnClickListener m) {
        this.M = m;
        this.C();
    }
    
    public void setRippleColor(@k0 final ColorStateList list) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.s3(list);
        }
        if (!this.J.T1()) {
            this.E();
        }
    }
    
    public void setRippleColorResource(@n final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.t3(n);
            if (!this.J.T1()) {
                this.E();
            }
        }
    }
    
    @Override
    public void setShapeAppearanceModel(@j0 final o shapeAppearanceModel) {
        this.J.setShapeAppearanceModel(shapeAppearanceModel);
    }
    
    public void setShowMotionSpec(@k0 final h h) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.v3(h);
        }
    }
    
    public void setShowMotionSpecResource(@androidx.annotation.b final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.w3(n);
        }
    }
    
    public void setSingleLine(final boolean singleLine) {
        if (singleLine) {
            super.setSingleLine(singleLine);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }
    
    public void setText(CharSequence charSequence, final TextView$BufferType textView$BufferType) {
        final com.google.android.material.chip.a j = this.J;
        if (j == null) {
            return;
        }
        CharSequence charSequence2;
        if ((charSequence2 = charSequence) == null) {
            charSequence2 = "";
        }
        if (j.H3()) {
            charSequence = null;
        }
        else {
            charSequence = charSequence2;
        }
        super.setText(charSequence, textView$BufferType);
        final com.google.android.material.chip.a i = this.J;
        if (i != null) {
            i.x3(charSequence2);
        }
    }
    
    public void setTextAppearance(final int textAppearance) {
        super.setTextAppearance(textAppearance);
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.z3(textAppearance);
        }
        this.G();
    }
    
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.z3(n);
        }
        this.G();
    }
    
    public void setTextAppearance(@k0 final com.google.android.material.resources.d d) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.y3(d);
        }
        this.G();
    }
    
    public void setTextAppearanceResource(@x0 final int n) {
        this.setTextAppearance(this.getContext(), n);
    }
    
    public void setTextEndPadding(final float n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.A3(n);
        }
    }
    
    public void setTextEndPaddingResource(@p final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.B3(n);
        }
    }
    
    public void setTextStartPadding(final float n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.E3(n);
        }
    }
    
    public void setTextStartPaddingResource(@p final int n) {
        final com.google.android.material.chip.a j = this.J;
        if (j != null) {
            j.F3(n);
        }
    }
    
    public boolean t() {
        final com.google.android.material.chip.a j = this.J;
        return j != null && j.X1();
    }
    
    @Deprecated
    public boolean u() {
        return this.v();
    }
    
    public boolean v() {
        final com.google.android.material.chip.a j = this.J;
        return j != null && j.Z1();
    }
    
    @Deprecated
    public boolean w() {
        return this.x();
    }
    
    public boolean x() {
        final com.google.android.material.chip.a j = this.J;
        return j != null && j.c2();
    }
    
    @androidx.annotation.i
    public boolean y() {
        boolean b = false;
        this.playSoundEffect(0);
        final View$OnClickListener m = this.M;
        if (m != null) {
            m.onClick((View)this);
            b = true;
        }
        this.V.Y(1, 1);
        return b;
    }
    
    private class c extends androidx.customview.widget.a
    {
        c(final Chip chip) {
            super((View)chip);
        }
        
        @Override
        protected int C(final float n, final float n2) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(n, n2)) ? 1 : 0;
        }
        
        @Override
        protected void D(@j0 final List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.x() && Chip.this.M != null) {
                list.add(1);
            }
        }
        
        @Override
        protected boolean N(final int n, final int n2, final Bundle bundle) {
            if (n2 == 16) {
                if (n == 0) {
                    return Chip.this.performClick();
                }
                if (n == 1) {
                    return Chip.this.y();
                }
            }
            return false;
        }
        
        @Override
        protected void Q(@j0 final androidx.core.view.accessibility.d d) {
            d.S0(Chip.this.r());
            d.V0(Chip.this.isClickable());
            String s;
            if (!Chip.this.r() && !Chip.this.isClickable()) {
                s = "android.view.View";
            }
            else if (Chip.this.r()) {
                s = "android.widget.CompoundButton";
            }
            else {
                s = "android.widget.Button";
            }
            d.U0(s);
            final CharSequence text = Chip.this.getText();
            if (Build$VERSION.SDK_INT >= 23) {
                d.J1(text);
            }
            else {
                d.Y0(text);
            }
        }
        
        @Override
        protected void R(int l0, @j0 final androidx.core.view.accessibility.d d) {
            CharSequence charSequence = "";
            if (l0 == 1) {
                final CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                CharSequence trim;
                if (closeIconContentDescription != null) {
                    trim = closeIconContentDescription;
                }
                else {
                    final CharSequence text = Chip.this.getText();
                    final Context context = Chip.this.getContext();
                    l0 = o2.a.m.l0;
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    trim = context.getString(l0, new Object[] { charSequence }).trim();
                }
                d.Y0(trim);
                d.P0(Chip.this.getCloseIconTouchBoundsInt());
                d.b(d.a.j);
                d.e1(Chip.this.isEnabled());
            }
            else {
                d.Y0("");
                d.P0(Chip.g0);
            }
        }
        
        @Override
        protected void S(final int n, final boolean b) {
            if (n == 1) {
                Chip.this.R = b;
                Chip.this.refreshDrawableState();
            }
        }
    }
}
