// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import com.google.android.material.resources.f;
import com.google.android.material.resources.d;
import androidx.annotation.p0;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import androidx.core.util.n;
import android.util.Log;
import android.text.Layout$Alignment;
import androidx.annotation.t;
import androidx.core.view.i;
import android.text.TextUtils;
import android.text.TextUtils$TruncateAt;
import android.graphics.Color;
import androidx.core.text.l;
import androidx.core.text.m;
import android.os.Build$VERSION;
import android.graphics.Typeface;
import android.graphics.RectF;
import android.graphics.Rect;
import android.text.StaticLayout;
import android.view.View;
import android.content.res.ColorStateList;
import android.animation.TimeInterpolator;
import android.text.TextPaint;
import android.graphics.Bitmap;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.graphics.Paint;
import androidx.annotation.t0;

@t0({ t0.a.H })
public final class a
{
    private static final boolean j0;
    private static final String k0 = "CollapsingTextHelper";
    private static final String l0 = "\u2026";
    private static final float m0 = 0.5f;
    private static final boolean n0 = false;
    @j0
    private static final Paint o0;
    private com.google.android.material.resources.a A;
    @k0
    private CharSequence B;
    @k0
    private CharSequence C;
    private boolean D;
    private boolean E;
    private boolean F;
    @k0
    private Bitmap G;
    private Paint H;
    private float I;
    private float J;
    private int[] K;
    private boolean L;
    @j0
    private final TextPaint M;
    @j0
    private final TextPaint N;
    private TimeInterpolator O;
    private TimeInterpolator P;
    private float Q;
    private float R;
    private float S;
    private ColorStateList T;
    private float U;
    private float V;
    private float W;
    private ColorStateList X;
    private float Y;
    private float Z;
    private final View a;
    private StaticLayout a0;
    private boolean b;
    private float b0;
    private float c;
    private float c0;
    private boolean d;
    private float d0;
    private float e;
    private CharSequence e0;
    private float f;
    private int f0;
    private int g;
    private float g0;
    @j0
    private final Rect h;
    private float h0;
    @j0
    private final Rect i;
    private int i0;
    @j0
    private final RectF j;
    private int k;
    private int l;
    private float m;
    private float n;
    private ColorStateList o;
    private ColorStateList p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private Typeface w;
    private Typeface x;
    private Typeface y;
    private com.google.android.material.resources.a z;
    
    static {
        j0 = (Build$VERSION.SDK_INT < 18);
        o0 = null;
    }
    
    public a(final View a) {
        this.k = 16;
        this.l = 16;
        this.m = 15.0f;
        this.n = 15.0f;
        this.E = true;
        this.f0 = 1;
        this.g0 = 0.0f;
        this.h0 = 1.0f;
        this.i0 = com.google.android.material.internal.p.n;
        this.a = a;
        final TextPaint m = new TextPaint(129);
        this.M = m;
        this.N = new TextPaint((Paint)m);
        this.i = new Rect();
        this.h = new Rect();
        this.j = new RectF();
        this.f = this.f();
    }
    
    private boolean I0() {
        final int f0 = this.f0;
        boolean b = true;
        if (f0 <= 1 || (this.D && !this.d) || this.F) {
            b = false;
        }
        return b;
    }
    
    private void O(@j0 final TextPaint textPaint) {
        textPaint.setTextSize(this.n);
        textPaint.setTypeface(this.w);
        if (Build$VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.Y);
        }
    }
    
    private void P(@j0 final TextPaint textPaint) {
        textPaint.setTextSize(this.m);
        textPaint.setTypeface(this.x);
        if (Build$VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.Z);
        }
    }
    
    private void Q(final float n) {
        if (this.d) {
            final RectF j = this.j;
            Rect rect;
            if (n < this.f) {
                rect = this.h;
            }
            else {
                rect = this.i;
            }
            j.set(rect);
        }
        else {
            this.j.left = W((float)this.h.left, (float)this.i.left, n, this.O);
            this.j.top = W(this.q, this.r, n, this.O);
            this.j.right = W((float)this.h.right, (float)this.i.right, n, this.O);
            this.j.bottom = W((float)this.h.bottom, (float)this.i.bottom, n, this.O);
        }
    }
    
    private static boolean R(final float n, final float n2) {
        return Math.abs(n - n2) < 0.001f;
    }
    
    private boolean S() {
        final int x = androidx.core.view.j0.X(this.a);
        boolean b = true;
        if (x != 1) {
            b = false;
        }
        return b;
    }
    
    private boolean V(@j0 final CharSequence charSequence, final boolean b) {
        l l;
        if (b) {
            l = androidx.core.text.m.d;
        }
        else {
            l = androidx.core.text.m.c;
        }
        return l.b(charSequence, 0, charSequence.length());
    }
    
    private static float W(final float n, final float n2, final float n3, @k0 final TimeInterpolator timeInterpolator) {
        float interpolation = n3;
        if (timeInterpolator != null) {
            interpolation = timeInterpolator.getInterpolation(n3);
        }
        return com.google.android.material.animation.a.a(n, n2, interpolation);
    }
    
    private static int a(final int n, final int n2, final float n3) {
        final float n4 = 1.0f - n3;
        return Color.argb((int)(Color.alpha(n) * n4 + Color.alpha(n2) * n3), (int)(Color.red(n) * n4 + Color.red(n2) * n3), (int)(Color.green(n) * n4 + Color.green(n2) * n3), (int)(Color.blue(n) * n4 + Color.blue(n2) * n3));
    }
    
    private static boolean a0(@j0 final Rect rect, final int n, final int n2, final int n3, final int n4) {
        return rect.left == n && rect.top == n2 && rect.right == n3 && rect.bottom == n4;
    }
    
    private void b(final boolean b) {
        final float j = this.J;
        this.j(this.n, b);
        final CharSequence c = this.C;
        if (c != null) {
            final StaticLayout a0 = this.a0;
            if (a0 != null) {
                this.e0 = TextUtils.ellipsize(c, this.M, (float)a0.getWidth(), TextUtils$TruncateAt.END);
            }
        }
        final CharSequence e0 = this.e0;
        final float n = 0.0f;
        float measureText;
        if (e0 != null) {
            measureText = this.M.measureText(e0, 0, e0.length());
        }
        else {
            measureText = 0.0f;
        }
        final int d = androidx.core.view.i.d(this.l, this.D ? 1 : 0);
        final int n2 = d & 0x70;
        Label_0198: {
            float r;
            if (n2 != 48) {
                if (n2 != 80) {
                    this.r = this.i.centerY() - (this.M.descent() - this.M.ascent()) / 2.0f;
                    break Label_0198;
                }
                r = this.i.bottom + this.M.ascent();
            }
            else {
                r = (float)this.i.top;
            }
            this.r = r;
        }
        final int n3 = d & 0x800007;
        Label_0271: {
            float n4;
            if (n3 != 1) {
                if (n3 != 5) {
                    this.t = (float)this.i.left;
                    break Label_0271;
                }
                n4 = (float)this.i.right;
            }
            else {
                n4 = (float)this.i.centerX();
                measureText /= 2.0f;
            }
            this.t = n4 - measureText;
        }
        this.j(this.m, b);
        final StaticLayout a2 = this.a0;
        float n5;
        if (a2 != null) {
            n5 = (float)a2.getHeight();
        }
        else {
            n5 = 0.0f;
        }
        final CharSequence c2 = this.C;
        float measureText2;
        if (c2 != null) {
            measureText2 = this.M.measureText(c2, 0, c2.length());
        }
        else {
            measureText2 = 0.0f;
        }
        final StaticLayout a3 = this.a0;
        float n6 = measureText2;
        if (a3 != null) {
            n6 = measureText2;
            if (this.f0 > 1) {
                n6 = (float)a3.getWidth();
            }
        }
        final StaticLayout a4 = this.a0;
        float lineLeft = n;
        if (a4 != null) {
            if (this.f0 > 1) {
                lineLeft = (float)a4.getLineStart(0);
            }
            else {
                lineLeft = a4.getLineLeft(0);
            }
        }
        this.d0 = lineLeft;
        final int d2 = androidx.core.view.i.d(this.k, this.D ? 1 : 0);
        final int n7 = d2 & 0x70;
        if (n7 != 48) {
            float q;
            if (n7 != 80) {
                q = this.h.centerY() - n5 / 2.0f;
            }
            else {
                q = this.h.bottom - n5 + this.M.descent();
            }
            this.q = q;
        }
        else {
            this.q = (float)this.h.top;
        }
        final int n8 = d2 & 0x800007;
        float s = 0.0f;
        Label_0578: {
            float n9;
            if (n8 != 1) {
                if (n8 != 5) {
                    s = (float)this.h.left;
                    break Label_0578;
                }
                n9 = (float)this.h.right;
            }
            else {
                n9 = (float)this.h.centerX();
                n6 /= 2.0f;
            }
            s = n9 - n6;
        }
        this.s = s;
        this.k();
        this.y0(j);
    }
    
    private void d() {
        this.h(this.c);
    }
    
    private float e(@t(from = 0.0, to = 1.0) final float n) {
        final float f = this.f;
        if (n <= f) {
            return com.google.android.material.animation.a.b(1.0f, 0.0f, this.e, f, n);
        }
        return com.google.android.material.animation.a.b(0.0f, 1.0f, f, 1.0f, n);
    }
    
    private void e0(final float b0) {
        this.b0 = b0;
        androidx.core.view.j0.l1(this.a);
    }
    
    private float f() {
        final float e = this.e;
        return e + (1.0f - e) * 0.5f;
    }
    
    private boolean g(@j0 final CharSequence charSequence) {
        boolean b = this.S();
        if (this.E) {
            b = this.V(charSequence, b);
        }
        return b;
    }
    
    private void h(final float n) {
        this.Q(n);
        float n2;
        if (this.d) {
            if (n < this.f) {
                this.u = this.s;
                this.v = this.q;
                this.y0(this.m);
                n2 = 0.0f;
            }
            else {
                this.u = this.t;
                this.v = this.r - Math.max(0, this.g);
                this.y0(this.n);
                n2 = 1.0f;
            }
        }
        else {
            this.u = W(this.s, this.t, n, this.O);
            this.v = W(this.q, this.r, n, this.O);
            this.y0(W(this.m, this.n, n, this.P));
            n2 = n;
        }
        final TimeInterpolator b = com.google.android.material.animation.a.b;
        this.e0(1.0f - W(0.0f, 1.0f, 1.0f - n, b));
        this.o0(W(1.0f, 0.0f, n, b));
        if (this.p != this.o) {
            this.M.setColor(a(this.z(), this.x(), n2));
        }
        else {
            this.M.setColor(this.x());
        }
        if (Build$VERSION.SDK_INT >= 21) {
            final float y = this.Y;
            final float z = this.Z;
            if (y != z) {
                this.M.setLetterSpacing(W(z, y, n, b));
            }
            else {
                this.M.setLetterSpacing(y);
            }
        }
        this.M.setShadowLayer(W(this.U, this.Q, n, null), W(this.V, this.R, n, null), W(this.W, this.S, n, null), a(this.y(this.X), this.y(this.T), n));
        if (this.d) {
            this.M.setAlpha((int)(this.e(n) * 255.0f));
        }
        androidx.core.view.j0.l1(this.a);
    }
    
    private void i(final float n) {
        this.j(n, false);
    }
    
    private void j(float min, final boolean b) {
        if (this.B == null) {
            return;
        }
        final float n = (float)this.i.width();
        final float b2 = (float)this.h.width();
        final boolean r = R(min, this.n);
        final boolean b3 = false;
        final int n2 = 1;
        float j;
        int n3;
        if (r) {
            j = this.n;
            this.I = 1.0f;
            final Typeface y = this.y;
            final Typeface w = this.w;
            if (y != w) {
                this.y = w;
                n3 = 1;
                min = n;
            }
            else {
                n3 = 0;
                min = n;
            }
        }
        else {
            j = this.m;
            final Typeface y2 = this.y;
            final Typeface x = this.x;
            if (y2 != x) {
                this.y = x;
                n3 = 1;
            }
            else {
                n3 = 0;
            }
            if (R(min, j)) {
                this.I = 1.0f;
            }
            else {
                this.I = min / this.m;
            }
            min = this.n / this.m;
            if (!b && b2 * min > n) {
                min = Math.min(n / min, b2);
            }
            else {
                min = b2;
            }
        }
        int n4 = n3;
        if (min > 0.0f) {
            final boolean b4 = this.J != j || this.L || n3 != 0;
            this.J = j;
            this.L = false;
            n4 = (b4 ? 1 : 0);
        }
        if (this.C == null || n4 != 0) {
            this.M.setTextSize(this.J);
            this.M.setTypeface(this.y);
            final TextPaint m = this.M;
            boolean linearText = b3;
            if (this.I != 1.0f) {
                linearText = true;
            }
            m.setLinearText(linearText);
            this.D = this.g(this.B);
            int f0 = n2;
            if (this.I0()) {
                f0 = this.f0;
            }
            final StaticLayout l = this.l(f0, min, this.D);
            this.a0 = l;
            this.C = l.getText();
        }
    }
    
    private boolean j0(final Typeface w) {
        final com.google.android.material.resources.a a = this.A;
        if (a != null) {
            a.c();
        }
        if (this.w != w) {
            this.w = w;
            return true;
        }
        return false;
    }
    
    private void k() {
        final Bitmap g = this.G;
        if (g != null) {
            g.recycle();
            this.G = null;
        }
    }
    
    private StaticLayout l(final int n, final float n2, final boolean b) {
        StaticLayout a;
        try {
            a = com.google.android.material.internal.p.c(this.B, this.M, (int)n2).e(TextUtils$TruncateAt.END).i(b).d(Layout$Alignment.ALIGN_NORMAL).h(false).k(n).j(this.g0, this.h0).g(this.i0).a();
        }
        catch (p.a a2) {
            Log.e("CollapsingTextHelper", a2.getCause().getMessage(), (Throwable)a2);
            a = null;
        }
        return n.g(a);
    }
    
    private void n(@j0 final Canvas canvas, float c0, float n) {
        final int alpha = this.M.getAlpha();
        canvas.translate(c0, n);
        final TextPaint m = this.M;
        c0 = this.c0;
        n = (float)alpha;
        m.setAlpha((int)(c0 * n));
        this.a0.draw(canvas);
        this.M.setAlpha((int)(this.b0 * n));
        final int lineBaseline = this.a0.getLineBaseline(0);
        final CharSequence e0 = this.e0;
        final int length = e0.length();
        c0 = (float)lineBaseline;
        canvas.drawText(e0, 0, length, 0.0f, c0, (Paint)this.M);
        if (!this.d) {
            String s2;
            final String s = s2 = this.e0.toString().trim();
            if (s.endsWith("\u2026")) {
                s2 = s.substring(0, s.length() - 1);
            }
            this.M.setAlpha(alpha);
            canvas.drawText(s2, 0, Math.min(this.a0.getLineEnd(0), s2.length()), 0.0f, c0, (Paint)this.M);
        }
    }
    
    private void o() {
        if (this.G == null && !this.h.isEmpty()) {
            if (!TextUtils.isEmpty(this.C)) {
                this.h(0.0f);
                final int width = this.a0.getWidth();
                final int height = this.a0.getHeight();
                if (width > 0) {
                    if (height > 0) {
                        this.G = Bitmap.createBitmap(width, height, Bitmap$Config.ARGB_8888);
                        this.a0.draw(new Canvas(this.G));
                        if (this.H == null) {
                            this.H = new Paint(3);
                        }
                    }
                }
            }
        }
    }
    
    private void o0(final float c0) {
        this.c0 = c0;
        androidx.core.view.j0.l1(this.a);
    }
    
    private float t(final int n, final int n2) {
        if (n2 == 17 || (n2 & 0x7) == 0x1) {
            return n / 2.0f - this.c() / 2.0f;
        }
        if ((n2 & 0x800005) != 0x800005 && (n2 & 0x5) != 0x5) {
            float n3;
            if (this.D) {
                n3 = this.i.right - this.c();
            }
            else {
                n3 = (float)this.i.left;
            }
            return n3;
        }
        float n4;
        if (this.D) {
            n4 = (float)this.i.left;
        }
        else {
            n4 = this.i.right - this.c();
        }
        return n4;
    }
    
    private boolean t0(final Typeface x) {
        final com.google.android.material.resources.a z = this.z;
        if (z != null) {
            z.c();
        }
        if (this.x != x) {
            this.x = x;
            return true;
        }
        return false;
    }
    
    private float u(@j0 final RectF rectF, final int n, final int n2) {
        if (n2 == 17 || (n2 & 0x7) == 0x1) {
            return n / 2.0f + this.c() / 2.0f;
        }
        if ((n2 & 0x800005) != 0x800005 && (n2 & 0x5) != 0x5) {
            float n3;
            if (this.D) {
                n3 = (float)this.i.right;
            }
            else {
                n3 = rectF.left + this.c();
            }
            return n3;
        }
        float n4;
        if (this.D) {
            n4 = rectF.left + this.c();
        }
        else {
            n4 = (float)this.i.right;
        }
        return n4;
    }
    
    @androidx.annotation.l
    private int y(@k0 final ColorStateList list) {
        if (list == null) {
            return 0;
        }
        final int[] k = this.K;
        if (k != null) {
            return list.getColorForState(k, 0);
        }
        return list.getDefaultColor();
    }
    
    private void y0(final float n) {
        this.i(n);
        final boolean f = com.google.android.material.internal.a.j0 && this.I != 1.0f;
        this.F = f;
        if (f) {
            this.o();
        }
        androidx.core.view.j0.l1(this.a);
    }
    
    @androidx.annotation.l
    private int z() {
        return this.y(this.o);
    }
    
    public ColorStateList A() {
        return this.o;
    }
    
    @p0(23)
    public void A0(@t(from = 0.0) final float h0) {
        this.h0 = h0;
    }
    
    public float B() {
        this.P(this.N);
        return -this.N.ascent() + this.N.descent();
    }
    
    public void B0(final int f0) {
        if (f0 != this.f0) {
            this.f0 = f0;
            this.k();
            this.Y();
        }
    }
    
    public int C() {
        return this.k;
    }
    
    public void C0(final TimeInterpolator o) {
        this.O = o;
        this.Y();
    }
    
    public float D() {
        this.P(this.N);
        return -this.N.ascent();
    }
    
    public void D0(final boolean e) {
        this.E = e;
    }
    
    public float E() {
        return this.m;
    }
    
    public final boolean E0(final int[] k) {
        this.K = k;
        if (this.U()) {
            this.Y();
            return true;
        }
        return false;
    }
    
    public Typeface F() {
        Typeface typeface = this.x;
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return typeface;
    }
    
    public void F0(@k0 final CharSequence b) {
        if (b == null || !TextUtils.equals(this.B, b)) {
            this.B = b;
            this.C = null;
            this.k();
            this.Y();
        }
    }
    
    public float G() {
        return this.c;
    }
    
    public void G0(final TimeInterpolator p) {
        this.P = p;
        this.Y();
    }
    
    public float H() {
        return this.f;
    }
    
    public void H0(final Typeface typeface) {
        final boolean j0 = this.j0(typeface);
        final boolean t0 = this.t0(typeface);
        if (j0 || t0) {
            this.Y();
        }
    }
    
    @p0(23)
    public int I() {
        return this.i0;
    }
    
    public int J() {
        final StaticLayout a0 = this.a0;
        int lineCount;
        if (a0 != null) {
            lineCount = a0.getLineCount();
        }
        else {
            lineCount = 0;
        }
        return lineCount;
    }
    
    @p0(23)
    public float K() {
        return this.a0.getSpacingAdd();
    }
    
    @p0(23)
    public float L() {
        return this.a0.getSpacingMultiplier();
    }
    
    public int M() {
        return this.f0;
    }
    
    @k0
    public CharSequence N() {
        return this.B;
    }
    
    public boolean T() {
        return this.E;
    }
    
    public final boolean U() {
        final ColorStateList p = this.p;
        if (p == null || !p.isStateful()) {
            final ColorStateList o = this.o;
            if (o == null || !o.isStateful()) {
                return false;
            }
        }
        return true;
    }
    
    void X() {
        this.b = (this.i.width() > 0 && this.i.height() > 0 && this.h.width() > 0 && this.h.height() > 0);
    }
    
    public void Y() {
        this.Z(false);
    }
    
    public void Z(final boolean b) {
        if ((this.a.getHeight() > 0 && this.a.getWidth() > 0) || b) {
            this.b(b);
            this.d();
        }
    }
    
    public void b0(final int n, final int n2, final int n3, final int n4) {
        if (!a0(this.i, n, n2, n3, n4)) {
            this.i.set(n, n2, n3, n4);
            this.L = true;
            this.X();
        }
    }
    
    public float c() {
        if (this.B == null) {
            return 0.0f;
        }
        this.O(this.N);
        final TextPaint n = this.N;
        final CharSequence b = this.B;
        return n.measureText(b, 0, b.length());
    }
    
    public void c0(@j0 final Rect rect) {
        this.b0(rect.left, rect.top, rect.right, rect.bottom);
    }
    
    public void d0(final int n) {
        final d d = new d(this.a.getContext(), n);
        final ColorStateList a = d.a;
        if (a != null) {
            this.p = a;
        }
        final float n2 = d.n;
        if (n2 != 0.0f) {
            this.n = n2;
        }
        final ColorStateList d2 = d.d;
        if (d2 != null) {
            this.T = d2;
        }
        this.R = d.i;
        this.S = d.j;
        this.Q = d.k;
        this.Y = d.m;
        final com.google.android.material.resources.a a2 = this.A;
        if (a2 != null) {
            a2.c();
        }
        this.A = new com.google.android.material.resources.a((com.google.android.material.resources.a.a)new com.google.android.material.resources.a.a() {
            @Override
            public void a(final Typeface typeface) {
                com.google.android.material.internal.a.this.i0(typeface);
            }
        }, d.e());
        d.h(this.a.getContext(), this.A);
        this.Y();
    }
    
    public void f0(final ColorStateList p) {
        if (this.p != p) {
            this.p = p;
            this.Y();
        }
    }
    
    public void g0(final int l) {
        if (this.l != l) {
            this.l = l;
            this.Y();
        }
    }
    
    public void h0(final float n) {
        if (this.n != n) {
            this.n = n;
            this.Y();
        }
    }
    
    public void i0(final Typeface typeface) {
        if (this.j0(typeface)) {
            this.Y();
        }
    }
    
    public void k0(final int g) {
        this.g = g;
    }
    
    public void l0(final int n, final int n2, final int n3, final int n4) {
        if (!a0(this.h, n, n2, n3, n4)) {
            this.h.set(n, n2, n3, n4);
            this.L = true;
            this.X();
        }
    }
    
    public void m(@j0 final Canvas canvas) {
        final int save = canvas.save();
        if (this.C != null && this.b) {
            final int f0 = this.f0;
            boolean b = true;
            float lineLeft;
            if (f0 > 1) {
                lineLeft = (float)this.a0.getLineStart(0);
            }
            else {
                lineLeft = this.a0.getLineLeft(0);
            }
            final float u = this.u;
            final float d0 = this.d0;
            this.M.setTextSize(this.J);
            final float u2 = this.u;
            final float v = this.v;
            if (!this.F || this.G == null) {
                b = false;
            }
            final float i = this.I;
            if (i != 1.0f && !this.d) {
                canvas.scale(i, i, u2, v);
            }
            if (b) {
                canvas.drawBitmap(this.G, u2, v, this.H);
                canvas.restoreToCount(save);
                return;
            }
            if (this.I0() && (!this.d || this.c > this.f)) {
                this.n(canvas, u + lineLeft - d0 * 2.0f, v);
            }
            else {
                canvas.translate(u2, v);
                this.a0.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }
    
    public void m0(@j0 final Rect rect) {
        this.l0(rect.left, rect.top, rect.right, rect.bottom);
    }
    
    public void n0(final int n) {
        final d d = new d(this.a.getContext(), n);
        final ColorStateList a = d.a;
        if (a != null) {
            this.o = a;
        }
        final float n2 = d.n;
        if (n2 != 0.0f) {
            this.m = n2;
        }
        final ColorStateList d2 = d.d;
        if (d2 != null) {
            this.X = d2;
        }
        this.V = d.i;
        this.W = d.j;
        this.U = d.k;
        this.Z = d.m;
        final com.google.android.material.resources.a z = this.z;
        if (z != null) {
            z.c();
        }
        this.z = new com.google.android.material.resources.a((com.google.android.material.resources.a.a)new com.google.android.material.resources.a.a() {
            @Override
            public void a(final Typeface typeface) {
                com.google.android.material.internal.a.this.s0(typeface);
            }
        }, d.e());
        d.h(this.a.getContext(), this.z);
        this.Y();
    }
    
    public void p(@j0 final RectF rectF, final int n, final int n2) {
        this.D = this.g(this.B);
        rectF.left = this.t(n, n2);
        rectF.top = (float)this.i.top;
        rectF.right = this.u(rectF, n, n2);
        rectF.bottom = this.i.top + this.s();
    }
    
    public void p0(final ColorStateList o) {
        if (this.o != o) {
            this.o = o;
            this.Y();
        }
    }
    
    public ColorStateList q() {
        return this.p;
    }
    
    public void q0(final int k) {
        if (this.k != k) {
            this.k = k;
            this.Y();
        }
    }
    
    public int r() {
        return this.l;
    }
    
    public void r0(final float m) {
        if (this.m != m) {
            this.m = m;
            this.Y();
        }
    }
    
    public float s() {
        this.O(this.N);
        return -this.N.ascent();
    }
    
    public void s0(final Typeface typeface) {
        if (this.t0(typeface)) {
            this.Y();
        }
    }
    
    public void u0(float b) {
        b = q.a.b(b, 0.0f, 1.0f);
        if (b != this.c) {
            this.c = b;
            this.d();
        }
    }
    
    public float v() {
        return this.n;
    }
    
    public void v0(final boolean d) {
        this.d = d;
    }
    
    public Typeface w() {
        Typeface typeface = this.w;
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return typeface;
    }
    
    public void w0(final float e) {
        this.e = e;
        this.f = this.f();
    }
    
    @androidx.annotation.l
    public int x() {
        return this.y(this.p);
    }
    
    @p0(23)
    public void x0(final int i0) {
        this.i0 = i0;
    }
    
    @p0(23)
    public void z0(final float g0) {
        this.g0 = g0;
    }
}
