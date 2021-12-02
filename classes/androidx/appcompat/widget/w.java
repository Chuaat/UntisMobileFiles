// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.annotation.SuppressLint;
import androidx.core.widget.r;
import java.util.Locale;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.util.AttributeSet;
import android.graphics.PorterDuff$Mode;
import androidx.annotation.k0;
import androidx.annotation.t0;
import androidx.core.widget.b;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$NotFoundException;
import androidx.core.content.res.g;
import java.lang.ref.WeakReference;
import android.os.Build$VERSION;
import c.a;
import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.j0;
import android.widget.TextView;

class w
{
    private static final int n = -1;
    private static final int o = 1;
    private static final int p = 2;
    private static final int q = 3;
    @j0
    private final TextView a;
    private s0 b;
    private s0 c;
    private s0 d;
    private s0 e;
    private s0 f;
    private s0 g;
    private s0 h;
    @j0
    private final x i;
    private int j;
    private int k;
    private Typeface l;
    private boolean m;
    
    w(@j0 final TextView a) {
        this.j = 0;
        this.k = -1;
        this.a = a;
        this.i = new x(a);
    }
    
    private void B(final int n, final float n2) {
        this.i.y(n, n2);
    }
    
    private void C(final Context context, final u0 u0) {
        this.j = u0.o(c.a.n.c7, this.j);
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b = false;
        if (sdk_INT >= 28 && (this.k = u0.o(c.a.n.l7, -1)) != -1) {
            this.j = ((this.j & 0x2) | 0x0);
        }
        int k7 = c.a.n.k7;
        if (!u0.C(k7) && !u0.C(c.a.n.m7)) {
            final int b2 = c.a.n.b7;
            if (u0.C(b2)) {
                this.m = false;
                final int o = u0.o(b2, 1);
                Typeface l;
                if (o != 1) {
                    if (o != 2) {
                        if (o != 3) {
                            return;
                        }
                        l = Typeface.MONOSPACE;
                    }
                    else {
                        l = Typeface.SERIF;
                    }
                }
                else {
                    l = Typeface.SANS_SERIF;
                }
                this.l = l;
            }
            return;
        }
        this.l = null;
        final int m7 = c.a.n.m7;
        if (u0.C(m7)) {
            k7 = m7;
        }
        final int i = this.k;
        final int j = this.j;
        if (!context.isRestricted()) {
            final g.c c = new g.c() {
                final /* synthetic */ WeakReference c = new WeakReference((T)w.this.a);
                
                @Override
                public void d(final int n) {
                }
                
                @Override
                public void e(@j0 final Typeface typeface) {
                    Typeface create = typeface;
                    if (Build$VERSION.SDK_INT >= 28) {
                        final int a = i;
                        create = typeface;
                        if (a != -1) {
                            create = Typeface.create(typeface, a, (j & 0x2) != 0x0);
                        }
                    }
                    w.this.n(this.c, create);
                }
            };
            try {
                final Typeface k8 = u0.k(k7, this.j, c);
                if (k8 != null) {
                    Typeface create = k8;
                    if (sdk_INT >= 28) {
                        create = k8;
                        if (this.k != -1) {
                            create = Typeface.create(Typeface.create(k8, 0), this.k, (this.j & 0x2) != 0x0);
                        }
                    }
                    this.l = create;
                }
                this.m = (this.l == null);
            }
            catch (UnsupportedOperationException ex) {}
            catch (Resources$NotFoundException ex2) {}
        }
        if (this.l == null) {
            final String w = u0.w(k7);
            if (w != null) {
                Typeface l2;
                if (Build$VERSION.SDK_INT >= 28 && this.k != -1) {
                    final Typeface create2 = Typeface.create(w, 0);
                    final int k9 = this.k;
                    boolean b3 = b;
                    if ((this.j & 0x2) != 0x0) {
                        b3 = true;
                    }
                    l2 = Typeface.create(create2, k9, b3);
                }
                else {
                    l2 = Typeface.create(w, this.j);
                }
                this.l = l2;
            }
        }
    }
    
    private void a(final Drawable drawable, final s0 s0) {
        if (drawable != null && s0 != null) {
            androidx.appcompat.widget.j.j(drawable, s0, this.a.getDrawableState());
        }
    }
    
    private static s0 d(final Context context, final j j, final int n) {
        final ColorStateList f = j.f(context, n);
        if (f != null) {
            final s0 s0 = new s0();
            s0.d = true;
            s0.a = f;
            return s0;
        }
        return null;
    }
    
    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            final Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            final TextView a = this.a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        }
        else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (sdk_INT >= 17) {
                final Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
                if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                    final TextView a2 = this.a;
                    drawable3 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    drawable6 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    a2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable3, drawable2, drawable6, drawable4);
                    return;
                }
            }
            final Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            final TextView a3 = this.a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            a3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }
    
    private void z() {
        final s0 h = this.h;
        this.b = h;
        this.c = h;
        this.d = h;
        this.e = h;
        this.f = h;
        this.g = h;
    }
    
    @t0({ t0.a.I })
    void A(final int n, final float n2) {
        if (!androidx.core.widget.b.a && !this.l()) {
            this.B(n, n2);
        }
    }
    
    void b() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            final Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            this.a(compoundDrawables[0], this.b);
            this.a(compoundDrawables[1], this.c);
            this.a(compoundDrawables[2], this.d);
            this.a(compoundDrawables[3], this.e);
        }
        if (Build$VERSION.SDK_INT >= 17 && (this.f != null || this.g != null)) {
            final Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            this.a(compoundDrawablesRelative[0], this.f);
            this.a(compoundDrawablesRelative[2], this.g);
        }
    }
    
    @t0({ t0.a.I })
    void c() {
        this.i.b();
    }
    
    int e() {
        return this.i.j();
    }
    
    int f() {
        return this.i.k();
    }
    
    int g() {
        return this.i.l();
    }
    
    int[] h() {
        return this.i.m();
    }
    
    int i() {
        return this.i.n();
    }
    
    @k0
    ColorStateList j() {
        final s0 h = this.h;
        ColorStateList a;
        if (h != null) {
            a = h.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    @k0
    PorterDuff$Mode k() {
        final s0 h = this.h;
        PorterDuff$Mode b;
        if (h != null) {
            b = h.b;
        }
        else {
            b = null;
        }
        return b;
    }
    
    @t0({ t0.a.I })
    boolean l() {
        return this.i.s();
    }
    
    @SuppressLint({ "NewApi" })
    void m(@k0 final AttributeSet set, int n) {
        final Context context = this.a.getContext();
        final j b = androidx.appcompat.widget.j.b();
        final int[] b2 = c.a.n.B0;
        final u0 g = u0.G(context, set, b2, n, 0);
        final TextView a = this.a;
        androidx.core.view.j0.x1((View)a, a.getContext(), b2, set, g.B(), n, 0);
        final int u = g.u(c.a.n.C0, -1);
        final int f0 = c.a.n.F0;
        if (g.C(f0)) {
            this.b = d(context, b, g.u(f0, 0));
        }
        final int d0 = c.a.n.D0;
        if (g.C(d0)) {
            this.c = d(context, b, g.u(d0, 0));
        }
        final int g2 = c.a.n.G0;
        if (g.C(g2)) {
            this.d = d(context, b, g.u(g2, 0));
        }
        final int e0 = c.a.n.E0;
        if (g.C(e0)) {
            this.e = d(context, b, g.u(e0, 0));
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 17) {
            final int h0 = c.a.n.H0;
            if (g.C(h0)) {
                this.f = d(context, b, g.u(h0, 0));
            }
            final int i0 = c.a.n.I0;
            if (g.C(i0)) {
                this.g = d(context, b, g.u(i0, 0));
            }
        }
        g.I();
        final boolean b3 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean b4;
        boolean b5;
        ColorStateList d5;
        ColorStateList d6;
        String w2;
        ColorStateList d7;
        String w3;
        if (u != -1) {
            final u0 e2 = u0.E(context, u, c.a.n.Z6);
            Label_0352: {
                if (!b3) {
                    final int o7 = c.a.n.o7;
                    if (e2.C(o7)) {
                        b4 = e2.a(o7, false);
                        b5 = true;
                        break Label_0352;
                    }
                }
                b4 = false;
                b5 = false;
            }
            this.C(context, e2);
            ColorStateList list = null;
            Label_0482: {
                ColorStateList list2;
                if (sdk_INT < 23) {
                    final int d2 = c.a.n.d7;
                    ColorStateList d3;
                    if (e2.C(d2)) {
                        d3 = e2.d(d2);
                    }
                    else {
                        d3 = null;
                    }
                    final int e3 = c.a.n.e7;
                    ColorStateList d4;
                    if (e2.C(e3)) {
                        d4 = e2.d(e3);
                    }
                    else {
                        d4 = null;
                    }
                    final int f2 = c.a.n.f7;
                    list = d3;
                    list2 = d4;
                    if (e2.C(f2)) {
                        d5 = e2.d(f2);
                        list = d3;
                        d6 = d4;
                        break Label_0482;
                    }
                }
                else {
                    list = null;
                    list2 = null;
                }
                d5 = null;
                d6 = list2;
            }
            final int p2 = c.a.n.p7;
            String w;
            if (e2.C(p2)) {
                w = e2.w(p2);
            }
            else {
                w = null;
            }
            Label_0549: {
                if (sdk_INT >= 26) {
                    final int n2 = c.a.n.n7;
                    if (e2.C(n2)) {
                        w2 = e2.w(n2);
                        break Label_0549;
                    }
                }
                w2 = null;
            }
            e2.I();
            d7 = list;
            w3 = w;
        }
        else {
            w2 = null;
            d7 = null;
            w3 = null;
            b4 = false;
            d6 = null;
            d5 = null;
            b5 = false;
        }
        final u0 g3 = u0.G(context, set, c.a.n.Z6, n, 0);
        if (!b3) {
            final int o8 = c.a.n.o7;
            if (g3.C(o8)) {
                b4 = g3.a(o8, false);
                b5 = true;
            }
        }
        ColorStateList textColor = d7;
        ColorStateList hintTextColor = d6;
        ColorStateList d8 = d5;
        if (sdk_INT < 23) {
            final int d9 = c.a.n.d7;
            if (g3.C(d9)) {
                d7 = g3.d(d9);
            }
            final int e4 = c.a.n.e7;
            if (g3.C(e4)) {
                d6 = g3.d(e4);
            }
            final int f3 = c.a.n.f7;
            textColor = d7;
            hintTextColor = d6;
            d8 = d5;
            if (g3.C(f3)) {
                d8 = g3.d(f3);
                hintTextColor = d6;
                textColor = d7;
            }
        }
        final int p3 = c.a.n.p7;
        if (g3.C(p3)) {
            w3 = g3.w(p3);
        }
        String w4 = null;
        Label_0807: {
            if (sdk_INT >= 26) {
                final int n3 = c.a.n.n7;
                if (g3.C(n3)) {
                    w4 = g3.w(n3);
                    break Label_0807;
                }
            }
            w4 = w2;
        }
        if (sdk_INT >= 28) {
            final int a2 = c.a.n.a7;
            if (g3.C(a2) && g3.g(a2, -1) == 0) {
                this.a.setTextSize(0, 0.0f);
            }
        }
        this.C(context, g3);
        g3.I();
        if (textColor != null) {
            this.a.setTextColor(textColor);
        }
        if (hintTextColor != null) {
            this.a.setHintTextColor(hintTextColor);
        }
        if (d8 != null) {
            this.a.setLinkTextColor(d8);
        }
        if (!b3 && b5) {
            this.s(b4);
        }
        final Typeface l = this.l;
        if (l != null) {
            if (this.k == -1) {
                this.a.setTypeface(l, this.j);
            }
            else {
                this.a.setTypeface(l);
            }
        }
        if (w4 != null) {
            this.a.setFontVariationSettings(w4);
        }
        if (w3 != null) {
            if (sdk_INT >= 24) {
                this.a.setTextLocales(LocaleList.forLanguageTags(w3));
            }
            else if (sdk_INT >= 21) {
                this.a.setTextLocale(Locale.forLanguageTag(w3.substring(0, w3.indexOf(44))));
            }
        }
        this.i.t(set, n);
        if (androidx.core.widget.b.a && this.i.n() != 0) {
            final int[] m = this.i.m();
            if (m.length > 0) {
                if (this.a.getAutoSizeStepGranularity() != -1.0f) {
                    this.a.setAutoSizeTextTypeUniformWithConfiguration(this.i.k(), this.i.j(), this.i.l(), 0);
                }
                else {
                    this.a.setAutoSizeTextTypeUniformWithPresetSizes(m, 0);
                }
            }
        }
        final u0 f4 = u0.F(context, set, c.a.n.J0);
        n = f4.u(c.a.n.S0, -1);
        Drawable c;
        if (n != -1) {
            c = b.c(context, n);
        }
        else {
            c = null;
        }
        n = f4.u(c.a.n.X0, -1);
        Drawable c2;
        if (n != -1) {
            c2 = b.c(context, n);
        }
        else {
            c2 = null;
        }
        n = f4.u(c.a.n.T0, -1);
        Drawable c3;
        if (n != -1) {
            c3 = b.c(context, n);
        }
        else {
            c3 = null;
        }
        n = f4.u(c.a.n.Q0, -1);
        Drawable c4;
        if (n != -1) {
            c4 = b.c(context, n);
        }
        else {
            c4 = null;
        }
        n = f4.u(c.a.n.U0, -1);
        Drawable c5;
        if (n != -1) {
            c5 = b.c(context, n);
        }
        else {
            c5 = null;
        }
        n = f4.u(c.a.n.R0, -1);
        Drawable c6;
        if (n != -1) {
            c6 = b.c(context, n);
        }
        else {
            c6 = null;
        }
        this.y(c, c2, c3, c4, c5, c6);
        n = c.a.n.V0;
        if (f4.C(n)) {
            r.u(this.a, f4.d(n));
        }
        n = c.a.n.W0;
        if (f4.C(n)) {
            r.v(this.a, b0.e(f4.o(n, -1), null));
        }
        final int g4 = f4.g(c.a.n.Y0, -1);
        final int g5 = f4.g(c.a.n.b1, -1);
        n = f4.g(c.a.n.c1, -1);
        f4.I();
        if (g4 != -1) {
            r.A(this.a, g4);
        }
        if (g5 != -1) {
            r.B(this.a, g5);
        }
        if (n != -1) {
            r.C(this.a, n);
        }
    }
    
    void n(final WeakReference<TextView> weakReference, final Typeface l) {
        if (this.m) {
            this.l = l;
            final TextView textView = weakReference.get();
            if (textView != null) {
                if (androidx.core.view.j0.N0((View)textView)) {
                    textView.post((Runnable)new Runnable() {
                        final /* synthetic */ int I = w.this.j;
                        
                        @Override
                        public void run() {
                            textView.setTypeface(l, this.I);
                        }
                    });
                }
                else {
                    textView.setTypeface(l, this.j);
                }
            }
        }
    }
    
    @t0({ t0.a.I })
    void o(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (!b.a) {
            this.c();
        }
    }
    
    void p() {
        this.b();
    }
    
    void q(final Context context, int n) {
        final u0 e = u0.E(context, n, c.a.n.Z6);
        n = c.a.n.o7;
        if (e.C(n)) {
            this.s(e.a(n, false));
        }
        n = Build$VERSION.SDK_INT;
        if (n < 23) {
            final int d7 = c.a.n.d7;
            if (e.C(d7)) {
                final ColorStateList d8 = e.d(d7);
                if (d8 != null) {
                    this.a.setTextColor(d8);
                }
            }
            final int f7 = c.a.n.f7;
            if (e.C(f7)) {
                final ColorStateList d9 = e.d(f7);
                if (d9 != null) {
                    this.a.setLinkTextColor(d9);
                }
            }
            final int e2 = c.a.n.e7;
            if (e.C(e2)) {
                final ColorStateList d10 = e.d(e2);
                if (d10 != null) {
                    this.a.setHintTextColor(d10);
                }
            }
        }
        final int a7 = c.a.n.a7;
        if (e.C(a7) && e.g(a7, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        this.C(context, e);
        if (n >= 26) {
            n = c.a.n.n7;
            if (e.C(n)) {
                final String w = e.w(n);
                if (w != null) {
                    this.a.setFontVariationSettings(w);
                }
            }
        }
        e.I();
        final Typeface l = this.l;
        if (l != null) {
            this.a.setTypeface(l, this.j);
        }
    }
    
    void r(@j0 final TextView textView, @k0 final InputConnection inputConnection, @j0 final EditorInfo editorInfo) {
        if (Build$VERSION.SDK_INT < 30 && inputConnection != null) {
            androidx.core.view.inputmethod.a.j(editorInfo, textView.getText());
        }
    }
    
    void s(final boolean allCaps) {
        this.a.setAllCaps(allCaps);
    }
    
    void t(final int n, final int n2, final int n3, final int n4) throws IllegalArgumentException {
        this.i.u(n, n2, n3, n4);
    }
    
    void u(@j0 final int[] array, final int n) throws IllegalArgumentException {
        this.i.v(array, n);
    }
    
    void v(final int n) {
        this.i.w(n);
    }
    
    void w(@k0 final ColorStateList a) {
        if (this.h == null) {
            this.h = new s0();
        }
        final s0 h = this.h;
        h.a = a;
        h.d = (a != null);
        this.z();
    }
    
    void x(@k0 final PorterDuff$Mode b) {
        if (this.h == null) {
            this.h = new s0();
        }
        final s0 h = this.h;
        h.b = b;
        h.c = (b != null);
        this.z();
    }
}
