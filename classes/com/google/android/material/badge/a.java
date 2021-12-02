// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.badge;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.graphics.ColorFilter;
import androidx.annotation.t0;
import androidx.annotation.m0;
import androidx.annotation.w0;
import android.content.res.ColorStateList;
import androidx.annotation.l;
import com.google.android.material.resources.c;
import androidx.annotation.y0;
import android.content.res.TypedArray;
import java.text.NumberFormat;
import android.graphics.Paint;
import android.graphics.Canvas;
import androidx.annotation.d1;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import com.google.android.material.resources.d;
import android.content.res.Resources;
import android.graphics.Paint$Align;
import com.google.android.material.internal.t;
import android.widget.FrameLayout;
import androidx.annotation.k0;
import android.view.View;
import android.graphics.Rect;
import com.google.android.material.shape.j;
import androidx.annotation.j0;
import android.content.Context;
import java.lang.ref.WeakReference;
import androidx.annotation.f;
import androidx.annotation.x0;
import com.google.android.material.internal.q;
import android.graphics.drawable.Drawable;

public class a extends Drawable implements q.b
{
    public static final int W = 8388661;
    public static final int X = 8388659;
    public static final int Y = 8388693;
    public static final int Z = 8388691;
    private static final int a0 = 4;
    private static final int b0 = -1;
    private static final int c0 = 9;
    @x0
    private static final int d0;
    @f
    private static final int e0;
    static final String f0 = "+";
    @j0
    private final WeakReference<Context> G;
    @j0
    private final j H;
    @j0
    private final q I;
    @j0
    private final Rect J;
    private final float K;
    private final float L;
    private final float M;
    @j0
    private final c N;
    private float O;
    private float P;
    private int Q;
    private float R;
    private float S;
    private float T;
    @k0
    private WeakReference<View> U;
    @k0
    private WeakReference<FrameLayout> V;
    
    static {
        d0 = o2.a.n.Oa;
        e0 = o2.a.c.r0;
    }
    
    private a(@j0 final Context referent) {
        this.G = new WeakReference<Context>(referent);
        t.c(referent);
        final Resources resources = referent.getResources();
        this.J = new Rect();
        this.H = new j();
        this.K = (float)resources.getDimensionPixelSize(o2.a.f.O2);
        this.M = (float)resources.getDimensionPixelSize(o2.a.f.N2);
        this.L = (float)resources.getDimensionPixelSize(o2.a.f.T2);
        final q i = new q((q.b)this);
        this.I = i;
        i.e().setTextAlign(Paint$Align.CENTER);
        this.N = new c(referent);
        this.L(o2.a.n.f6);
    }
    
    private void K(@k0 final d d) {
        if (this.I.d() == d) {
            return;
        }
        final Context context = this.G.get();
        if (context == null) {
            return;
        }
        this.I.i(d, context);
        this.T();
    }
    
    private void L(@x0 final int n) {
        final Context context = this.G.get();
        if (context == null) {
            return;
        }
        this.K(new d(context, n));
    }
    
    private void O(final View view) {
        final ViewGroup viewGroup = (ViewGroup)view.getParent();
        if (viewGroup == null || viewGroup.getId() != o2.a.h.R2) {
            final WeakReference<FrameLayout> v = this.V;
            if (v == null || v.get() != viewGroup) {
                P(view);
                final FrameLayout referent = new FrameLayout(view.getContext());
                referent.setId(o2.a.h.R2);
                referent.setClipChildren(false);
                referent.setClipToPadding(false);
                referent.setLayoutParams(view.getLayoutParams());
                referent.setMinimumWidth(view.getWidth());
                referent.setMinimumHeight(view.getHeight());
                final int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
                referent.addView(view);
                viewGroup.addView((View)referent, indexOfChild);
                this.V = new WeakReference<FrameLayout>(referent);
                referent.post((Runnable)new Runnable() {
                    @Override
                    public void run() {
                        a.this.S(view, referent);
                    }
                });
            }
        }
    }
    
    private static void P(final View view) {
        final ViewGroup viewGroup = (ViewGroup)view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }
    
    private void T() {
        final Context context = this.G.get();
        final WeakReference<View> u = this.U;
        Object o = null;
        View view;
        if (u != null) {
            view = u.get();
        }
        else {
            view = null;
        }
        if (context != null) {
            if (view != null) {
                final Rect rect = new Rect();
                rect.set(this.J);
                final Rect rect2 = new Rect();
                view.getDrawingRect(rect2);
                final WeakReference<FrameLayout> v = this.V;
                if (v != null) {
                    o = v.get();
                }
                if (o != null || com.google.android.material.badge.b.a) {
                    ViewGroup viewGroup;
                    if ((viewGroup = (ViewGroup)o) == null) {
                        viewGroup = (ViewGroup)view.getParent();
                    }
                    viewGroup.offsetDescendantRectToMyCoords(view, rect2);
                }
                this.b(context, rect2, view);
                com.google.android.material.badge.b.l(this.J, this.O, this.P, this.S, this.T);
                this.H.j0(this.R);
                if (!rect.equals((Object)this.J)) {
                    this.H.setBounds(this.J);
                }
            }
        }
    }
    
    private void U() {
        this.Q = (int)Math.pow(10.0, this.r() - 1.0) - 1;
    }
    
    private void b(@j0 final Context context, @j0 final Rect rect, @j0 final View view) {
        final int n = this.N.R + this.N.T;
        final int s = this.N.O;
        int n2;
        if (s != 8388691 && s != 8388693) {
            n2 = rect.top + n;
        }
        else {
            n2 = rect.bottom - n;
        }
        this.P = (float)n2;
        float s2;
        if (this.s() <= 9) {
            if (!this.v()) {
                s2 = this.K;
            }
            else {
                s2 = this.L;
            }
            this.R = s2;
            this.T = s2;
        }
        else {
            final float l = this.L;
            this.R = l;
            this.T = l;
            s2 = this.I.f(this.m()) / 2.0f + this.M;
        }
        this.S = s2;
        final Resources resources = context.getResources();
        int n3;
        if (this.v()) {
            n3 = o2.a.f.P2;
        }
        else {
            n3 = o2.a.f.M2;
        }
        final int dimensionPixelSize = resources.getDimensionPixelSize(n3);
        final int n4 = this.N.Q + this.N.S;
        final int s3 = this.N.O;
        float o = 0.0f;
        Label_0298: {
            Label_0278: {
                if (s3 != 8388659 && s3 != 8388691) {
                    if (androidx.core.view.j0.X(view) == 0) {
                        break Label_0278;
                    }
                }
                else if (androidx.core.view.j0.X(view) != 0) {
                    break Label_0278;
                }
                o = rect.left - this.S + dimensionPixelSize + n4;
                break Label_0298;
            }
            o = rect.right + this.S - dimensionPixelSize - n4;
        }
        this.O = o;
    }
    
    @j0
    public static a d(@j0 final Context context) {
        return e(context, null, a.e0, a.d0);
    }
    
    @j0
    private static a e(@j0 final Context context, final AttributeSet set, @f final int n, @x0 final int n2) {
        final a a = new a(context);
        a.w(context, set, n, n2);
        return a;
    }
    
    @j0
    public static a f(@j0 final Context context, @d1 int n) {
        final AttributeSet a = t2.a.a(context, n, "badge");
        if ((n = a.getStyleAttribute()) == 0) {
            n = com.google.android.material.badge.a.d0;
        }
        return e(context, a, com.google.android.material.badge.a.e0, n);
    }
    
    @j0
    static a g(@j0 final Context context, @j0 final c c) {
        final a a = new a(context);
        a.y(c);
        return a;
    }
    
    private void h(final Canvas canvas) {
        final Rect rect = new Rect();
        final String m = this.m();
        this.I.e().getTextBounds(m, 0, m.length(), rect);
        canvas.drawText(m, this.O, this.P + rect.height() / 2, (Paint)this.I.e());
    }
    
    @j0
    private String m() {
        if (this.s() <= this.Q) {
            return NumberFormat.getInstance().format(this.s());
        }
        final Context context = this.G.get();
        if (context == null) {
            return "";
        }
        return context.getString(o2.a.m.n0, new Object[] { this.Q, "+" });
    }
    
    private void w(final Context context, final AttributeSet set, @f int n, @x0 final int n2) {
        final TypedArray j = t.j(context, set, o2.a.o.U3, n, n2, new int[0]);
        this.I(j.getInt(o2.a.o.Z3, 4));
        n = o2.a.o.a4;
        if (j.hasValue(n)) {
            this.J(j.getInt(n, 0));
        }
        this.B(x(context, j, o2.a.o.V3));
        n = o2.a.o.X3;
        if (j.hasValue(n)) {
            this.D(x(context, j, n));
        }
        this.C(j.getInt(o2.a.o.W3, 8388661));
        this.H(j.getDimensionPixelOffset(o2.a.o.Y3, 0));
        this.M(j.getDimensionPixelOffset(o2.a.o.b4, 0));
        j.recycle();
    }
    
    private static int x(final Context context, @j0 final TypedArray typedArray, @y0 final int n) {
        return com.google.android.material.resources.c.a(context, typedArray, n).getDefaultColor();
    }
    
    private void y(@j0 final c c) {
        this.I(c.K);
        if (c.J != -1) {
            this.J(c.J);
        }
        this.B(c.G);
        this.D(c.H);
        this.C(c.O);
        this.H(c.Q);
        this.M(c.R);
        this.z(c.S);
        this.A(c.T);
        this.N(c.P);
    }
    
    void A(final int n) {
        this.N.T = n;
        this.T();
    }
    
    public void B(@l final int n) {
        this.N.G = n;
        final ColorStateList value = ColorStateList.valueOf(n);
        if (this.H.y() != value) {
            this.H.n0(value);
            this.invalidateSelf();
        }
    }
    
    public void C(final int n) {
        if (this.N.O != n) {
            this.N.O = n;
            final WeakReference<View> u = this.U;
            if (u != null && u.get() != null) {
                final View view = this.U.get();
                final WeakReference<FrameLayout> v = this.V;
                FrameLayout frameLayout;
                if (v != null) {
                    frameLayout = v.get();
                }
                else {
                    frameLayout = null;
                }
                this.S(view, frameLayout);
            }
        }
    }
    
    public void D(@l final int color) {
        this.N.H = color;
        if (this.I.e().getColor() != color) {
            this.I.e().setColor(color);
            this.invalidateSelf();
        }
    }
    
    public void E(@w0 final int n) {
        this.N.N = n;
    }
    
    public void F(final CharSequence charSequence) {
        this.N.L = charSequence;
    }
    
    public void G(@m0 final int n) {
        this.N.M = n;
    }
    
    public void H(final int n) {
        this.N.Q = n;
        this.T();
    }
    
    public void I(final int n) {
        if (this.N.K != n) {
            this.N.K = n;
            this.U();
            this.I.j(true);
            this.T();
            this.invalidateSelf();
        }
    }
    
    public void J(int max) {
        max = Math.max(0, max);
        if (this.N.J != max) {
            this.N.J = max;
            this.I.j(true);
            this.T();
            this.invalidateSelf();
        }
    }
    
    public void M(final int n) {
        this.N.R = n;
        this.T();
    }
    
    public void N(final boolean b) {
        this.setVisible(b, false);
        this.N.P = b;
        if (b.a && this.p() != null && !b) {
            ((ViewGroup)this.p().getParent()).invalidate();
        }
    }
    
    public void Q(@j0 final View view) {
        this.S(view, null);
    }
    
    @Deprecated
    public void R(@j0 final View view, @k0 final ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            this.S(view, (FrameLayout)viewGroup);
            return;
        }
        throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
    }
    
    public void S(@j0 final View referent, @k0 final FrameLayout referent2) {
        this.U = new WeakReference<View>(referent);
        final boolean a = com.google.android.material.badge.b.a;
        if (a && referent2 == null) {
            this.O(referent);
        }
        else {
            this.V = new WeakReference<FrameLayout>(referent2);
        }
        if (!a) {
            P(referent);
        }
        this.T();
        this.invalidateSelf();
    }
    
    @t0({ t0.a.H })
    public void a() {
        this.invalidateSelf();
    }
    
    public void c() {
        this.N.J = -1;
        this.invalidateSelf();
    }
    
    public void draw(@j0 final Canvas canvas) {
        if (!this.getBounds().isEmpty() && this.getAlpha() != 0) {
            if (this.isVisible()) {
                this.H.draw(canvas);
                if (this.v()) {
                    this.h(canvas);
                }
            }
        }
    }
    
    public int getAlpha() {
        return this.N.I;
    }
    
    public int getIntrinsicHeight() {
        return this.J.height();
    }
    
    public int getIntrinsicWidth() {
        return this.J.width();
    }
    
    public int getOpacity() {
        return -3;
    }
    
    int i() {
        return this.N.S;
    }
    
    public boolean isStateful() {
        return false;
    }
    
    int j() {
        return this.N.T;
    }
    
    @l
    public int k() {
        return this.H.y().getDefaultColor();
    }
    
    public int l() {
        return this.N.O;
    }
    
    @l
    public int n() {
        return this.I.e().getColor();
    }
    
    @k0
    public CharSequence o() {
        if (!this.isVisible()) {
            return null;
        }
        if (!this.v()) {
            return this.N.L;
        }
        if (this.N.M <= 0) {
            return null;
        }
        final Context context = this.G.get();
        if (context == null) {
            return null;
        }
        if (this.s() <= this.Q) {
            return context.getResources().getQuantityString(this.N.M, this.s(), new Object[] { this.s() });
        }
        return context.getString(this.N.N, new Object[] { this.Q });
    }
    
    public boolean onStateChange(final int[] array) {
        return super.onStateChange(array);
    }
    
    @k0
    public FrameLayout p() {
        final WeakReference<FrameLayout> v = this.V;
        FrameLayout frameLayout;
        if (v != null) {
            frameLayout = v.get();
        }
        else {
            frameLayout = null;
        }
        return frameLayout;
    }
    
    public int q() {
        return this.N.Q;
    }
    
    public int r() {
        return this.N.K;
    }
    
    public int s() {
        if (!this.v()) {
            return 0;
        }
        return this.N.J;
    }
    
    public void setAlpha(final int alpha) {
        this.N.I = alpha;
        this.I.e().setAlpha(alpha);
        this.invalidateSelf();
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
    }
    
    @j0
    public c t() {
        return this.N;
    }
    
    public int u() {
        return this.N.R;
    }
    
    public boolean v() {
        return this.N.J != -1;
    }
    
    void z(final int n) {
        this.N.S = n;
        this.T();
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }
    
    @t0({ t0.a.H })
    public static final class c implements Parcelable
    {
        public static final Parcelable$Creator<c> CREATOR;
        @l
        private int G;
        @l
        private int H;
        private int I;
        private int J;
        private int K;
        @k0
        private CharSequence L;
        @m0
        private int M;
        @w0
        private int N;
        private int O;
        private boolean P;
        @androidx.annotation.q(unit = 1)
        private int Q;
        @androidx.annotation.q(unit = 1)
        private int R;
        @androidx.annotation.q(unit = 1)
        private int S;
        @androidx.annotation.q(unit = 1)
        private int T;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<c>() {
                @j0
                public c a(@j0 final Parcel parcel) {
                    return new c(parcel);
                }
                
                @j0
                public c[] b(final int n) {
                    return new c[n];
                }
            };
        }
        
        public c(@j0 final Context context) {
            this.I = 255;
            this.J = -1;
            this.H = new d(context, o2.a.n.f6).a.getDefaultColor();
            this.L = context.getString(o2.a.m.k0);
            this.M = o2.a.l.a;
            this.N = o2.a.m.m0;
            this.P = true;
        }
        
        protected c(@j0 final Parcel parcel) {
            this.I = 255;
            this.J = -1;
            this.G = parcel.readInt();
            this.H = parcel.readInt();
            this.I = parcel.readInt();
            this.J = parcel.readInt();
            this.K = parcel.readInt();
            this.L = parcel.readString();
            this.M = parcel.readInt();
            this.O = parcel.readInt();
            this.Q = parcel.readInt();
            this.R = parcel.readInt();
            this.S = parcel.readInt();
            this.T = parcel.readInt();
            this.P = (parcel.readInt() != 0);
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(@j0 final Parcel parcel, final int n) {
            parcel.writeInt(this.G);
            parcel.writeInt(this.H);
            parcel.writeInt(this.I);
            parcel.writeInt(this.J);
            parcel.writeInt(this.K);
            parcel.writeString(this.L.toString());
            parcel.writeInt(this.M);
            parcel.writeInt(this.O);
            parcel.writeInt(this.Q);
            parcel.writeInt(this.R);
            parcel.writeInt(this.S);
            parcel.writeInt(this.T);
            parcel.writeInt((int)(this.P ? 1 : 0));
        }
    }
}
