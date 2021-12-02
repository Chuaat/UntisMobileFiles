// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.button;

import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.n;
import androidx.annotation.p0;
import androidx.annotation.p;
import java.util.Iterator;
import android.util.Log;
import androidx.annotation.l;
import android.os.Parcelable;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.shape.k;
import androidx.annotation.t0;
import androidx.annotation.q;
import android.widget.TextView;
import androidx.core.widget.r;
import android.text.TextPaint;
import android.graphics.Rect;
import java.io.Serializable;
import android.widget.Button;
import android.widget.CompoundButton;
import android.view.View;
import android.content.res.TypedArray;
import com.google.android.material.shape.o;
import com.google.android.material.resources.c;
import com.google.android.material.internal.b0;
import com.google.android.material.internal.t;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.n0;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import androidx.annotation.k0;
import java.util.LinkedHashSet;
import androidx.annotation.j0;
import com.google.android.material.shape.s;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatButton;

public class MaterialButton extends AppCompatButton implements Checkable, s
{
    private static final int[] V;
    private static final int[] W;
    public static final int a0 = 1;
    public static final int b0 = 2;
    public static final int c0 = 3;
    public static final int d0 = 4;
    public static final int e0 = 16;
    public static final int f0 = 32;
    private static final String g0 = "MaterialButton";
    private static final int h0;
    @j0
    private final com.google.android.material.button.a I;
    @j0
    private final LinkedHashSet<b> J;
    @k0
    private c K;
    @k0
    private PorterDuff$Mode L;
    @k0
    private ColorStateList M;
    @k0
    private Drawable N;
    @n0
    private int O;
    @n0
    private int P;
    @n0
    private int Q;
    @n0
    private int R;
    private boolean S;
    private boolean T;
    private int U;
    
    static {
        V = new int[] { 16842911 };
        W = new int[] { 16842912 };
        h0 = o2.a.n.Xa;
    }
    
    public MaterialButton(@j0 final Context context) {
        this(context, null);
    }
    
    public MaterialButton(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, o2.a.c.v9);
    }
    
    public MaterialButton(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        final int h0 = MaterialButton.h0;
        super(com.google.android.material.theme.overlay.a.c(context, set, n, h0), set, n);
        this.J = new LinkedHashSet<b>();
        boolean b = false;
        this.S = false;
        this.T = false;
        final Context context2 = this.getContext();
        final TypedArray j = t.j(context2, set, o2.a.o.sk, n, h0, new int[0]);
        this.R = j.getDimensionPixelSize(o2.a.o.Fk, 0);
        this.L = com.google.android.material.internal.b0.k(j.getInt(o2.a.o.Ik, -1), PorterDuff$Mode.SRC_IN);
        this.M = com.google.android.material.resources.c.a(this.getContext(), j, o2.a.o.Hk);
        this.N = com.google.android.material.resources.c.d(this.getContext(), j, o2.a.o.Dk);
        this.U = j.getInteger(o2.a.o.Ek, 1);
        this.O = j.getDimensionPixelSize(o2.a.o.Gk, 0);
        (this.I = new com.google.android.material.button.a(this, o.e(context2, set, n, h0).m())).q(j);
        j.recycle();
        this.setCompoundDrawablePadding(this.R);
        if (this.N != null) {
            b = true;
        }
        this.k(b);
    }
    
    private boolean d() {
        final int u = this.U;
        return u == 3 || u == 4;
    }
    
    private boolean e() {
        final int u = this.U;
        boolean b = true;
        if (u != 1) {
            b = (u == 2 && b);
        }
        return b;
    }
    
    private boolean f() {
        final int u = this.U;
        return u == 16 || u == 32;
    }
    
    private boolean g() {
        final int x = androidx.core.view.j0.X((View)this);
        boolean b = true;
        if (x != 1) {
            b = false;
        }
        return b;
    }
    
    @j0
    private String getA11yClassName() {
        Serializable s;
        if (this.c()) {
            s = CompoundButton.class;
        }
        else {
            s = Button.class;
        }
        return ((Class)s).getName();
    }
    
    private int getTextHeight() {
        final TextPaint paint = this.getPaint();
        String s2;
        final String s = s2 = this.getText().toString();
        if (this.getTransformationMethod() != null) {
            s2 = this.getTransformationMethod().getTransformation((CharSequence)s, (View)this).toString();
        }
        final Rect rect = new Rect();
        ((Paint)paint).getTextBounds(s2, 0, s2.length(), rect);
        return Math.min(rect.height(), this.getLayout().getHeight());
    }
    
    private int getTextWidth() {
        final TextPaint paint = this.getPaint();
        String s = this.getText().toString();
        if (this.getTransformationMethod() != null) {
            s = this.getTransformationMethod().getTransformation((CharSequence)s, (View)this).toString();
        }
        return Math.min((int)((Paint)paint).measureText(s), this.getLayout().getEllipsizedWidth());
    }
    
    private boolean h() {
        final com.google.android.material.button.a i = this.I;
        return i != null && !i.o();
    }
    
    private void j() {
        if (this.e()) {
            r.w((TextView)this, this.N, null, null, null);
        }
        else if (this.d()) {
            r.w((TextView)this, null, null, this.N, null);
        }
        else if (this.f()) {
            r.w((TextView)this, null, this.N, null, null);
        }
    }
    
    private void k(final boolean b) {
        final Drawable n = this.N;
        if (n != null) {
            androidx.core.graphics.drawable.c.o(this.N = androidx.core.graphics.drawable.c.r(n).mutate(), this.M);
            final PorterDuff$Mode l = this.L;
            if (l != null) {
                androidx.core.graphics.drawable.c.p(this.N, l);
            }
            int n2 = this.O;
            if (n2 == 0) {
                n2 = this.N.getIntrinsicWidth();
            }
            int n3 = this.O;
            if (n3 == 0) {
                n3 = this.N.getIntrinsicHeight();
            }
            final Drawable n4 = this.N;
            final int p = this.P;
            final int q = this.Q;
            n4.setBounds(p, q, n2 + p, n3 + q);
        }
        if (b) {
            this.j();
            return;
        }
        final Drawable[] h = r.h((TextView)this);
        final boolean b2 = false;
        final Drawable drawable = h[0];
        final Drawable drawable2 = h[1];
        final Drawable drawable3 = h[2];
        int n5 = 0;
        Label_0214: {
            if ((!this.e() || drawable == this.N) && (!this.d() || drawable3 == this.N)) {
                n5 = (b2 ? 1 : 0);
                if (!this.f()) {
                    break Label_0214;
                }
                n5 = (b2 ? 1 : 0);
                if (drawable2 == this.N) {
                    break Label_0214;
                }
            }
            n5 = 1;
        }
        if (n5 != 0) {
            this.j();
        }
    }
    
    private void l(int n, int n2) {
        if (this.N != null && this.getLayout() != null) {
            Label_0124: {
                if (!this.e() && !this.d()) {
                    if (!this.f()) {
                        return;
                    }
                    this.P = 0;
                    if (this.U == 16) {
                        this.Q = 0;
                    }
                    else {
                        if ((n = this.O) == 0) {
                            n = this.N.getIntrinsicHeight();
                        }
                        n = (n2 - this.getTextHeight() - this.getPaddingTop() - n - this.R - this.getPaddingBottom()) / 2;
                        if (this.Q != n) {
                            this.Q = n;
                            break Label_0124;
                        }
                        return;
                    }
                }
                else {
                    this.Q = 0;
                    n2 = this.U;
                    int n3 = true ? 1 : 0;
                    if (n2 != 1 && n2 != 3) {
                        if ((n2 = this.O) == 0) {
                            n2 = this.N.getIntrinsicWidth();
                        }
                        n2 = (n - this.getTextWidth() - androidx.core.view.j0.i0((View)this) - n2 - this.R - androidx.core.view.j0.j0((View)this)) / 2;
                        final boolean g = this.g();
                        if (this.U != 4) {
                            n3 = (false ? 1 : 0);
                        }
                        n = n2;
                        if ((g ? 1 : 0) != n3) {
                            n = -n2;
                        }
                        if (this.P != n) {
                            this.P = n;
                            break Label_0124;
                        }
                        return;
                    }
                    else {
                        this.P = 0;
                    }
                }
                this.k(false);
                return;
            }
            this.k(false);
        }
    }
    
    public void a(@j0 final b e) {
        this.J.add(e);
    }
    
    public void b() {
        this.J.clear();
    }
    
    public boolean c() {
        final com.google.android.material.button.a i = this.I;
        return i != null && i.p();
    }
    
    @k0
    public ColorStateList getBackgroundTintList() {
        return this.getSupportBackgroundTintList();
    }
    
    @k0
    public PorterDuff$Mode getBackgroundTintMode() {
        return this.getSupportBackgroundTintMode();
    }
    
    @n0
    public int getCornerRadius() {
        int b;
        if (this.h()) {
            b = this.I.b();
        }
        else {
            b = 0;
        }
        return b;
    }
    
    public Drawable getIcon() {
        return this.N;
    }
    
    public int getIconGravity() {
        return this.U;
    }
    
    @n0
    public int getIconPadding() {
        return this.R;
    }
    
    @n0
    public int getIconSize() {
        return this.O;
    }
    
    public ColorStateList getIconTint() {
        return this.M;
    }
    
    public PorterDuff$Mode getIconTintMode() {
        return this.L;
    }
    
    @q
    public int getInsetBottom() {
        return this.I.c();
    }
    
    @q
    public int getInsetTop() {
        return this.I.d();
    }
    
    @k0
    public ColorStateList getRippleColor() {
        ColorStateList h;
        if (this.h()) {
            h = this.I.h();
        }
        else {
            h = null;
        }
        return h;
    }
    
    @j0
    public o getShapeAppearanceModel() {
        if (this.h()) {
            return this.I.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }
    
    public ColorStateList getStrokeColor() {
        ColorStateList j;
        if (this.h()) {
            j = this.I.j();
        }
        else {
            j = null;
        }
        return j;
    }
    
    @n0
    public int getStrokeWidth() {
        int k;
        if (this.h()) {
            k = this.I.k();
        }
        else {
            k = 0;
        }
        return k;
    }
    
    @k0
    @t0({ t0.a.H })
    @Override
    public ColorStateList getSupportBackgroundTintList() {
        if (this.h()) {
            return this.I.l();
        }
        return super.getSupportBackgroundTintList();
    }
    
    @k0
    @t0({ t0.a.H })
    @Override
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        if (this.h()) {
            return this.I.m();
        }
        return super.getSupportBackgroundTintMode();
    }
    
    public void i(@j0 final b o) {
        this.J.remove(o);
    }
    
    public boolean isChecked() {
        return this.S;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h()) {
            k.f((View)this, this.I.f());
        }
    }
    
    protected int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 2);
        if (this.c()) {
            Button.mergeDrawableStates(onCreateDrawableState, MaterialButton.V);
        }
        if (this.isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, MaterialButton.W);
        }
        return onCreateDrawableState;
    }
    
    @Override
    public void onInitializeAccessibilityEvent(@j0 final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)this.getA11yClassName());
        accessibilityEvent.setChecked(this.isChecked());
    }
    
    @Override
    public void onInitializeAccessibilityNodeInfo(@j0 final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)this.getA11yClassName());
        accessibilityNodeInfo.setCheckable(this.c());
        accessibilityNodeInfo.setChecked(this.isChecked());
        accessibilityNodeInfo.setClickable(this.isClickable());
    }
    
    @Override
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (Build$VERSION.SDK_INT == 21) {
            final com.google.android.material.button.a i = this.I;
            if (i != null) {
                i.H(n4 - n2, n3 - n);
            }
        }
    }
    
    public void onRestoreInstanceState(@k0 final Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final d d = (d)parcelable;
        super.onRestoreInstanceState(d.a());
        this.setChecked(d.I);
    }
    
    @j0
    public Parcelable onSaveInstanceState() {
        final d d = new d(super.onSaveInstanceState());
        d.I = this.S;
        return (Parcelable)d;
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.l(n, n2);
    }
    
    @Override
    protected void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        super.onTextChanged(charSequence, n, n2, n3);
        this.l(this.getMeasuredWidth(), this.getMeasuredHeight());
    }
    
    public boolean performClick() {
        this.toggle();
        return super.performClick();
    }
    
    public void setBackground(@j0 final Drawable backgroundDrawable) {
        this.setBackgroundDrawable(backgroundDrawable);
    }
    
    public void setBackgroundColor(@l final int backgroundColor) {
        if (this.h()) {
            this.I.r(backgroundColor);
        }
        else {
            super.setBackgroundColor(backgroundColor);
        }
    }
    
    @Override
    public void setBackgroundDrawable(@j0 final Drawable backgroundDrawable) {
        if (this.h()) {
            if (backgroundDrawable == this.getBackground()) {
                this.getBackground().setState(backgroundDrawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.I.s();
        }
        super.setBackgroundDrawable(backgroundDrawable);
    }
    
    @Override
    public void setBackgroundResource(@androidx.annotation.s final int n) {
        Drawable d;
        if (n != 0) {
            d = androidx.appcompat.content.res.a.d(this.getContext(), n);
        }
        else {
            d = null;
        }
        this.setBackgroundDrawable(d);
    }
    
    public void setBackgroundTintList(@k0 final ColorStateList supportBackgroundTintList) {
        this.setSupportBackgroundTintList(supportBackgroundTintList);
    }
    
    public void setBackgroundTintMode(@k0 final PorterDuff$Mode supportBackgroundTintMode) {
        this.setSupportBackgroundTintMode(supportBackgroundTintMode);
    }
    
    public void setCheckable(final boolean b) {
        if (this.h()) {
            this.I.t(b);
        }
    }
    
    public void setChecked(final boolean s) {
        if (this.c() && this.isEnabled() && this.S != s) {
            this.S = s;
            this.refreshDrawableState();
            if (this.T) {
                return;
            }
            this.T = true;
            final Iterator<b> iterator = this.J.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(this, this.S);
            }
            this.T = false;
        }
    }
    
    public void setCornerRadius(@n0 final int n) {
        if (this.h()) {
            this.I.u(n);
        }
    }
    
    public void setCornerRadiusResource(@p final int n) {
        if (this.h()) {
            this.setCornerRadius(this.getResources().getDimensionPixelSize(n));
        }
    }
    
    @p0(21)
    public void setElevation(final float elevation) {
        super.setElevation(elevation);
        if (this.h()) {
            this.I.f().m0(elevation);
        }
    }
    
    public void setIcon(@k0 final Drawable n) {
        if (this.N != n) {
            this.N = n;
            this.k(true);
            this.l(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
    }
    
    public void setIconGravity(final int u) {
        if (this.U != u) {
            this.U = u;
            this.l(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
    }
    
    public void setIconPadding(@n0 final int r) {
        if (this.R != r) {
            this.setCompoundDrawablePadding(this.R = r);
        }
    }
    
    public void setIconResource(@androidx.annotation.s final int n) {
        Drawable d;
        if (n != 0) {
            d = androidx.appcompat.content.res.a.d(this.getContext(), n);
        }
        else {
            d = null;
        }
        this.setIcon(d);
    }
    
    public void setIconSize(@n0 final int o) {
        if (o >= 0) {
            if (this.O != o) {
                this.O = o;
                this.k(true);
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }
    
    public void setIconTint(@k0 final ColorStateList m) {
        if (this.M != m) {
            this.M = m;
            this.k(false);
        }
    }
    
    public void setIconTintMode(final PorterDuff$Mode l) {
        if (this.L != l) {
            this.L = l;
            this.k(false);
        }
    }
    
    public void setIconTintResource(@n final int n) {
        this.setIconTint(androidx.appcompat.content.res.a.c(this.getContext(), n));
    }
    
    public void setInsetBottom(@q final int n) {
        this.I.v(n);
    }
    
    public void setInsetTop(@q final int n) {
        this.I.w(n);
    }
    
    void setInternalBackground(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
    }
    
    void setOnPressedChangeListenerInternal(@k0 final c k) {
        this.K = k;
    }
    
    public void setPressed(final boolean pressed) {
        final c k = this.K;
        if (k != null) {
            k.a(this, pressed);
        }
        super.setPressed(pressed);
    }
    
    public void setRippleColor(@k0 final ColorStateList list) {
        if (this.h()) {
            this.I.x(list);
        }
    }
    
    public void setRippleColorResource(@n final int n) {
        if (this.h()) {
            this.setRippleColor(androidx.appcompat.content.res.a.c(this.getContext(), n));
        }
    }
    
    public void setShapeAppearanceModel(@j0 final o o) {
        if (this.h()) {
            this.I.y(o);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }
    
    void setShouldDrawSurfaceColorStroke(final boolean b) {
        if (this.h()) {
            this.I.z(b);
        }
    }
    
    public void setStrokeColor(@k0 final ColorStateList list) {
        if (this.h()) {
            this.I.A(list);
        }
    }
    
    public void setStrokeColorResource(@n final int n) {
        if (this.h()) {
            this.setStrokeColor(androidx.appcompat.content.res.a.c(this.getContext(), n));
        }
    }
    
    public void setStrokeWidth(@n0 final int n) {
        if (this.h()) {
            this.I.B(n);
        }
    }
    
    public void setStrokeWidthResource(@p final int n) {
        if (this.h()) {
            this.setStrokeWidth(this.getResources().getDimensionPixelSize(n));
        }
    }
    
    @t0({ t0.a.H })
    @Override
    public void setSupportBackgroundTintList(@k0 final ColorStateList supportBackgroundTintList) {
        if (this.h()) {
            this.I.C(supportBackgroundTintList);
        }
        else {
            super.setSupportBackgroundTintList(supportBackgroundTintList);
        }
    }
    
    @t0({ t0.a.H })
    @Override
    public void setSupportBackgroundTintMode(@k0 final PorterDuff$Mode supportBackgroundTintMode) {
        if (this.h()) {
            this.I.D(supportBackgroundTintMode);
        }
        else {
            super.setSupportBackgroundTintMode(supportBackgroundTintMode);
        }
    }
    
    public void toggle() {
        this.setChecked(this.S ^ true);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }
    
    public interface b
    {
        void a(final MaterialButton p0, final boolean p1);
    }
    
    interface c
    {
        void a(final MaterialButton p0, final boolean p1);
    }
    
    static class d extends androidx.customview.view.a
    {
        public static final Parcelable$Creator<d> CREATOR;
        boolean I;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<d>() {
                @j0
                public d a(@j0 final Parcel parcel) {
                    return new d(parcel, null);
                }
                
                @j0
                public d b(@j0 final Parcel parcel, final ClassLoader classLoader) {
                    return new d(parcel, classLoader);
                }
                
                @j0
                public d[] c(final int n) {
                    return new d[n];
                }
            };
        }
        
        public d(@j0 final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                this.getClass().getClassLoader();
            }
            this.b(parcel);
        }
        
        public d(final Parcelable parcelable) {
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
