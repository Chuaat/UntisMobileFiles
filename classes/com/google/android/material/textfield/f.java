// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.textfield;

import androidx.annotation.l;
import android.widget.EditText;
import com.google.android.material.resources.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import androidx.core.widget.r;
import androidx.annotation.x0;
import android.os.Build$VERSION;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.annotation.p;
import android.animation.ObjectAnimator;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.animation.b;
import java.util.List;
import java.util.ArrayList;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.text.TextUtils;
import o2.a;
import android.graphics.Typeface;
import android.content.res.ColorStateList;
import android.widget.TextView;
import androidx.annotation.k0;
import android.animation.Animator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.j0;
import android.content.Context;

final class f
{
    private static final int A = 0;
    private static final int B = 1;
    private static final int C = 2;
    private static final int v = 217;
    private static final int w = 167;
    static final int x = 0;
    static final int y = 1;
    static final int z = 2;
    private final Context a;
    @j0
    private final TextInputLayout b;
    private LinearLayout c;
    private int d;
    private FrameLayout e;
    @k0
    private Animator f;
    private final float g;
    private int h;
    private int i;
    @k0
    private CharSequence j;
    private boolean k;
    @k0
    private TextView l;
    @k0
    private CharSequence m;
    private int n;
    @k0
    private ColorStateList o;
    private CharSequence p;
    private boolean q;
    @k0
    private TextView r;
    private int s;
    @k0
    private ColorStateList t;
    private Typeface u;
    
    public f(@j0 final TextInputLayout b) {
        final Context context = b.getContext();
        this.a = context;
        this.b = b;
        this.g = (float)context.getResources().getDimensionPixelSize(o2.a.f.I1);
    }
    
    private boolean A(final int n) {
        return n == 2 && this.r != null && !TextUtils.isEmpty(this.p);
    }
    
    private void F(final int n, final int h) {
        if (n == h) {
            return;
        }
        if (h != 0) {
            final TextView m = this.m(h);
            if (m != null) {
                m.setVisibility(0);
                m.setAlpha(1.0f);
            }
        }
        if (n != 0) {
            final TextView i = this.m(n);
            if (i != null) {
                i.setVisibility(4);
                if (n == 1) {
                    i.setText((CharSequence)null);
                }
            }
        }
        this.h = h;
    }
    
    private void N(@k0 final TextView textView, final Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }
    
    private void P(@j0 final ViewGroup viewGroup, final int n) {
        if (n == 0) {
            viewGroup.setVisibility(8);
        }
    }
    
    private boolean Q(@k0 final TextView textView, @k0 final CharSequence charSequence) {
        return androidx.core.view.j0.T0((View)this.b) && this.b.isEnabled() && (this.i != this.h || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }
    
    private void T(final int n, final int n2, final boolean b) {
        if (n == n2) {
            return;
        }
        if (b) {
            final AnimatorSet f = new AnimatorSet();
            this.f = (Animator)f;
            final ArrayList<Animator> list = new ArrayList<Animator>();
            this.h(list, this.q, this.r, 2, n, n2);
            this.h(list, this.k, this.l, 1, n, n2);
            b.a(f, list);
            f.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                final /* synthetic */ TextView b = com.google.android.material.textfield.f.this.m(n);
                final /* synthetic */ TextView d = com.google.android.material.textfield.f.this.m(n2);
                
                public void onAnimationEnd(final Animator animator) {
                    com.google.android.material.textfield.f.this.h = n2;
                    com.google.android.material.textfield.f.this.f = null;
                    final TextView b = this.b;
                    if (b != null) {
                        b.setVisibility(4);
                        if (n == 1 && com.google.android.material.textfield.f.this.l != null) {
                            com.google.android.material.textfield.f.this.l.setText((CharSequence)null);
                        }
                    }
                    final TextView d = this.d;
                    if (d != null) {
                        d.setTranslationY(0.0f);
                        this.d.setAlpha(1.0f);
                    }
                }
                
                public void onAnimationStart(final Animator animator) {
                    final TextView d = this.d;
                    if (d != null) {
                        d.setVisibility(0);
                    }
                }
            });
            f.start();
        }
        else {
            this.F(n, n2);
        }
        this.b.J0();
        this.b.M0(b);
        this.b.W0();
    }
    
    private boolean f() {
        return this.c != null && this.b.getEditText() != null;
    }
    
    private void h(@j0 final List<Animator> list, final boolean b, @k0 final TextView textView, final int n, final int n2, final int n3) {
        if (textView != null) {
            if (b) {
                if (n == n3 || n == n2) {
                    list.add((Animator)this.i(textView, n3 == n));
                    if (n3 == n) {
                        list.add((Animator)this.j(textView));
                    }
                }
            }
        }
    }
    
    private ObjectAnimator i(final TextView textView, final boolean b) {
        float n;
        if (b) {
            n = 1.0f;
        }
        else {
            n = 0.0f;
        }
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)textView, View.ALPHA, new float[] { n });
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(com.google.android.material.animation.a.a);
        return ofFloat;
    }
    
    private ObjectAnimator j(final TextView textView) {
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)textView, View.TRANSLATION_Y, new float[] { -this.g, 0.0f });
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(com.google.android.material.animation.a.d);
        return ofFloat;
    }
    
    @k0
    private TextView m(final int n) {
        if (n == 1) {
            return this.l;
        }
        if (n != 2) {
            return null;
        }
        return this.r;
    }
    
    private int u(final boolean b, @p final int n, int dimensionPixelSize) {
        if (b) {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(n);
        }
        return dimensionPixelSize;
    }
    
    private boolean z(final int n) {
        boolean b = true;
        if (n != 1 || this.l == null || TextUtils.isEmpty(this.j)) {
            b = false;
        }
        return b;
    }
    
    boolean B(final int n) {
        boolean b = true;
        if (n != 0) {
            b = (n == 1 && b);
        }
        return b;
    }
    
    boolean C() {
        return this.k;
    }
    
    boolean D() {
        return this.q;
    }
    
    void E(final TextView textView, int d) {
        if (this.c == null) {
            return;
        }
        Label_0041: {
            if (this.B(d)) {
                final FrameLayout e = this.e;
                if (e != null) {
                    e.removeView((View)textView);
                    break Label_0041;
                }
            }
            this.c.removeView((View)textView);
        }
        d = this.d - 1;
        this.d = d;
        this.P((ViewGroup)this.c, d);
    }
    
    void G(@k0 final CharSequence charSequence) {
        this.m = charSequence;
        final TextView l = this.l;
        if (l != null) {
            l.setContentDescription(charSequence);
        }
    }
    
    void H(final boolean k) {
        if (this.k == k) {
            return;
        }
        this.g();
        if (k) {
            (this.l = new AppCompatTextView(this.a)).setId(o2.a.h.w5);
            if (Build$VERSION.SDK_INT >= 17) {
                this.l.setTextAlignment(5);
            }
            final Typeface u = this.u;
            if (u != null) {
                this.l.setTypeface(u);
            }
            this.I(this.n);
            this.J(this.o);
            this.G(this.m);
            this.l.setVisibility(4);
            androidx.core.view.j0.B1((View)this.l, 1);
            this.d(this.l, 0);
        }
        else {
            this.x();
            this.E(this.l, 0);
            this.l = null;
            this.b.J0();
            this.b.W0();
        }
        this.k = k;
    }
    
    void I(@x0 final int n) {
        this.n = n;
        final TextView l = this.l;
        if (l != null) {
            this.b.v0(l, n);
        }
    }
    
    void J(@k0 final ColorStateList list) {
        this.o = list;
        final TextView l = this.l;
        if (l != null && list != null) {
            l.setTextColor(list);
        }
    }
    
    void K(@x0 final int s) {
        this.s = s;
        final TextView r = this.r;
        if (r != null) {
            androidx.core.widget.r.E(r, s);
        }
    }
    
    void L(final boolean q) {
        if (this.q == q) {
            return;
        }
        this.g();
        if (q) {
            (this.r = new AppCompatTextView(this.a)).setId(o2.a.h.x5);
            if (Build$VERSION.SDK_INT >= 17) {
                this.r.setTextAlignment(5);
            }
            final Typeface u = this.u;
            if (u != null) {
                this.r.setTypeface(u);
            }
            this.r.setVisibility(4);
            androidx.core.view.j0.B1((View)this.r, 1);
            this.K(this.s);
            this.M(this.t);
            this.d(this.r, 1);
        }
        else {
            this.y();
            this.E(this.r, 1);
            this.r = null;
            this.b.J0();
            this.b.W0();
        }
        this.q = q;
    }
    
    void M(@k0 final ColorStateList list) {
        this.t = list;
        final TextView r = this.r;
        if (r != null && list != null) {
            r.setTextColor(list);
        }
    }
    
    void O(final Typeface u) {
        if (u != this.u) {
            this.u = u;
            this.N(this.l, u);
            this.N(this.r, u);
        }
    }
    
    void R(final CharSequence charSequence) {
        this.g();
        this.j = charSequence;
        this.l.setText(charSequence);
        final int h = this.h;
        if (h != 1) {
            this.i = 1;
        }
        this.T(h, this.i, this.Q(this.l, charSequence));
    }
    
    void S(final CharSequence charSequence) {
        this.g();
        this.p = charSequence;
        this.r.setText(charSequence);
        final int h = this.h;
        if (h != 2) {
            this.i = 2;
        }
        this.T(h, this.i, this.Q(this.r, charSequence));
    }
    
    void d(final TextView textView, final int n) {
        if (this.c == null && this.e == null) {
            (this.c = new LinearLayout(this.a)).setOrientation(0);
            this.b.addView((View)this.c, -1, -2);
            this.e = new FrameLayout(this.a);
            this.c.addView((View)this.e, (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(0, -2, 1.0f));
            if (this.b.getEditText() != null) {
                this.e();
            }
        }
        if (this.B(n)) {
            this.e.setVisibility(0);
            this.e.addView((View)textView);
        }
        else {
            this.c.addView((View)textView, (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-2, -2));
        }
        this.c.setVisibility(0);
        ++this.d;
    }
    
    void e() {
        if (this.f()) {
            final EditText editText = this.b.getEditText();
            final boolean g = com.google.android.material.resources.c.g(this.a);
            final LinearLayout c = this.c;
            final int w2 = o2.a.f.w2;
            androidx.core.view.j0.b2((View)c, this.u(g, w2, androidx.core.view.j0.j0((View)editText)), this.u(g, o2.a.f.x2, this.a.getResources().getDimensionPixelSize(o2.a.f.v2)), this.u(g, w2, androidx.core.view.j0.i0((View)editText)), 0);
        }
    }
    
    void g() {
        final Animator f = this.f;
        if (f != null) {
            f.cancel();
        }
    }
    
    boolean k() {
        return this.z(this.h);
    }
    
    boolean l() {
        return this.z(this.i);
    }
    
    @k0
    CharSequence n() {
        return this.m;
    }
    
    @k0
    CharSequence o() {
        return this.j;
    }
    
    @l
    int p() {
        final TextView l = this.l;
        int currentTextColor;
        if (l != null) {
            currentTextColor = l.getCurrentTextColor();
        }
        else {
            currentTextColor = -1;
        }
        return currentTextColor;
    }
    
    @k0
    ColorStateList q() {
        final TextView l = this.l;
        ColorStateList textColors;
        if (l != null) {
            textColors = l.getTextColors();
        }
        else {
            textColors = null;
        }
        return textColors;
    }
    
    CharSequence r() {
        return this.p;
    }
    
    @k0
    ColorStateList s() {
        final TextView r = this.r;
        ColorStateList textColors;
        if (r != null) {
            textColors = r.getTextColors();
        }
        else {
            textColors = null;
        }
        return textColors;
    }
    
    @l
    int t() {
        final TextView r = this.r;
        int currentTextColor;
        if (r != null) {
            currentTextColor = r.getCurrentTextColor();
        }
        else {
            currentTextColor = -1;
        }
        return currentTextColor;
    }
    
    boolean v() {
        return this.A(this.h);
    }
    
    boolean w() {
        return this.A(this.i);
    }
    
    void x() {
        this.j = null;
        this.g();
        if (this.h == 1) {
            int i;
            if (this.q && !TextUtils.isEmpty(this.p)) {
                i = 2;
            }
            else {
                i = 0;
            }
            this.i = i;
        }
        this.T(this.h, this.i, this.Q(this.l, null));
    }
    
    void y() {
        this.g();
        final int h = this.h;
        if (h == 2) {
            this.i = 0;
        }
        this.T(h, this.i, this.Q(this.r, null));
    }
}
