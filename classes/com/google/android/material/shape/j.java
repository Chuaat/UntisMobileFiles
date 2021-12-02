// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.shape;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.b0;
import android.annotation.TargetApi;
import android.graphics.Outline;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.ColorFilter;
import androidx.annotation.l;
import androidx.annotation.t0;
import android.util.Log;
import android.graphics.Rect;
import android.graphics.Region$Op;
import android.os.Build$VERSION;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.content.res.ColorStateList;
import u2.a;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint$Style;
import android.os.Looper;
import androidx.annotation.x0;
import androidx.annotation.f;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.k0;
import android.graphics.PorterDuffColorFilter;
import androidx.annotation.j0;
import com.google.android.material.shadow.b;
import android.graphics.Region;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Matrix;
import java.util.BitSet;
import android.graphics.Paint;
import androidx.core.graphics.drawable.i;
import android.graphics.drawable.Drawable;

public class j extends Drawable implements i, s
{
    private static final String c0;
    private static final float d0 = 0.75f;
    private static final float e0 = 0.25f;
    public static final int f0 = 0;
    public static final int g0 = 1;
    public static final int h0 = 2;
    private static final Paint i0;
    private d G;
    private final q.i[] H;
    private final q.i[] I;
    private final BitSet J;
    private boolean K;
    private final Matrix L;
    private final Path M;
    private final Path N;
    private final RectF O;
    private final RectF P;
    private final Region Q;
    private final Region R;
    private o S;
    private final Paint T;
    private final Paint U;
    private final b V;
    @j0
    private final p.b W;
    private final p X;
    @k0
    private PorterDuffColorFilter Y;
    @k0
    private PorterDuffColorFilter Z;
    @j0
    private final RectF a0;
    private boolean b0;
    
    static {
        c0 = j.class.getSimpleName();
        i0 = new Paint(1);
    }
    
    public j() {
        this(new o());
    }
    
    public j(@j0 final Context context, @k0 final AttributeSet set, @f final int n, @x0 final int n2) {
        this(o.e(context, set, n, n2).m());
    }
    
    private j(@j0 final d g) {
        this.H = new q.i[4];
        this.I = new q.i[4];
        this.J = new BitSet(8);
        this.L = new Matrix();
        this.M = new Path();
        this.N = new Path();
        this.O = new RectF();
        this.P = new RectF();
        this.Q = new Region();
        this.R = new Region();
        final Paint t = new Paint(1);
        this.T = t;
        final Paint u = new Paint(1);
        this.U = u;
        this.V = new b();
        p k;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            k = p.k();
        }
        else {
            k = new p();
        }
        this.X = k;
        this.a0 = new RectF();
        this.b0 = true;
        this.G = g;
        u.setStyle(Paint$Style.STROKE);
        t.setStyle(Paint$Style.FILL);
        final Paint i0 = j.i0;
        i0.setColor(-1);
        i0.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
        this.M0();
        this.L0(this.getState());
        this.W = new p.b() {
            @Override
            public void a(@j0 final q q, final Matrix matrix, final int bitIndex) {
                j.this.J.set(bitIndex, q.e());
                j.this.H[bitIndex] = q.f(matrix);
            }
            
            @Override
            public void b(@j0 final q q, final Matrix matrix, final int n) {
                j.this.J.set(n + 4, q.e());
                j.this.I[n] = q.f(matrix);
            }
        };
    }
    
    public j(@j0 final o o) {
        this(new d(o, null));
    }
    
    @Deprecated
    public j(@j0 final r r) {
        this((o)r);
    }
    
    private boolean L0(final int[] array) {
        final ColorStateList d = this.G.d;
        final boolean b = true;
        boolean b2 = false;
        Label_0063: {
            if (d != null) {
                final int color = this.T.getColor();
                final int colorForState = this.G.d.getColorForState(array, color);
                if (color != colorForState) {
                    this.T.setColor(colorForState);
                    b2 = true;
                    break Label_0063;
                }
            }
            b2 = false;
        }
        if (this.G.e != null) {
            final int color2 = this.U.getColor();
            final int colorForState2 = this.G.e.getColorForState(array, color2);
            if (color2 != colorForState2) {
                this.U.setColor(colorForState2);
                b2 = b;
            }
        }
        return b2;
    }
    
    private boolean M0() {
        final PorterDuffColorFilter y = this.Y;
        final PorterDuffColorFilter z = this.Z;
        final d g = this.G;
        final ColorStateList g2 = g.g;
        final PorterDuff$Mode h = g.h;
        final Paint t = this.T;
        final boolean b = true;
        this.Y = this.k(g2, h, t, true);
        final d g3 = this.G;
        this.Z = this.k(g3.f, g3.h, this.U, false);
        final d g4 = this.G;
        if (g4.u) {
            this.V.d(g4.g.getColorForState(this.getState(), 0));
        }
        boolean b2 = b;
        if (androidx.core.util.i.a(y, this.Y)) {
            b2 = (!androidx.core.util.i.a(z, this.Z) && b);
        }
        return b2;
    }
    
    private float N() {
        if (this.X()) {
            return this.U.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }
    
    private void N0() {
        final float u = this.U();
        this.G.r = (int)Math.ceil(0.75f * u);
        this.G.s = (int)Math.ceil(u * 0.25f);
        this.M0();
        this.Z();
    }
    
    private boolean V() {
        final d g = this.G;
        final int q = g.q;
        final boolean b = true;
        if (q != 1 && g.r > 0) {
            boolean b2 = b;
            if (q == 2) {
                return b2;
            }
            if (this.i0()) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    private boolean W() {
        final Paint$Style v = this.G.v;
        return v == Paint$Style.FILL_AND_STROKE || v == Paint$Style.FILL;
    }
    
    private boolean X() {
        final Paint$Style v = this.G.v;
        return (v == Paint$Style.FILL_AND_STROKE || v == Paint$Style.STROKE) && this.U.getStrokeWidth() > 0.0f;
    }
    
    private void Z() {
        super.invalidateSelf();
    }
    
    @k0
    private PorterDuffColorFilter f(@j0 final Paint paint, final boolean b) {
        if (b) {
            final int color = paint.getColor();
            final int l = this.l(color);
            if (l != color) {
                return new PorterDuffColorFilter(l, PorterDuff$Mode.SRC_IN);
            }
        }
        return null;
    }
    
    private void f0(@j0 final Canvas canvas) {
        if (!this.V()) {
            return;
        }
        canvas.save();
        this.h0(canvas);
        if (!this.b0) {
            this.o(canvas);
        }
        else {
            final int n = (int)(this.a0.width() - this.getBounds().width());
            final int n2 = (int)(this.a0.height() - this.getBounds().height());
            if (n < 0 || n2 < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            final Bitmap bitmap = Bitmap.createBitmap((int)this.a0.width() + this.G.r * 2 + n, (int)this.a0.height() + this.G.r * 2 + n2, Bitmap$Config.ARGB_8888);
            final Canvas canvas2 = new Canvas(bitmap);
            final float n3 = (float)(this.getBounds().left - this.G.r - n);
            final float n4 = (float)(this.getBounds().top - this.G.r - n2);
            canvas2.translate(-n3, -n4);
            this.o(canvas2);
            canvas.drawBitmap(bitmap, n3, n4, (Paint)null);
            bitmap.recycle();
        }
        canvas.restore();
    }
    
    private void g(@j0 final RectF rectF, @j0 final Path path) {
        this.h(rectF, path);
        if (this.G.j != 1.0f) {
            this.L.reset();
            final Matrix l = this.L;
            final float j = this.G.j;
            l.setScale(j, j, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.L);
        }
        path.computeBounds(this.a0, true);
    }
    
    private static int g0(final int n, final int n2) {
        return n * (n2 + (n2 >>> 7)) >>> 8;
    }
    
    private void h0(@j0 final Canvas canvas) {
        final int h = this.H();
        final int i = this.I();
        if (Build$VERSION.SDK_INT < 21 && this.b0) {
            final Rect clipBounds = canvas.getClipBounds();
            final int r = this.G.r;
            clipBounds.inset(-r, -r);
            clipBounds.offset(h, i);
            canvas.clipRect(clipBounds, Region$Op.REPLACE);
        }
        canvas.translate((float)h, (float)i);
    }
    
    private void i() {
        final o y = this.getShapeAppearanceModel().y((o.c)new o.c() {
            final /* synthetic */ float a = -j.this.N();
            
            @j0
            @Override
            public com.google.android.material.shape.d a(@j0 com.google.android.material.shape.d d) {
                if (!(d instanceof m)) {
                    d = new com.google.android.material.shape.b(this.a, d);
                }
                return d;
            }
        });
        this.S = y;
        this.X.d(y, this.G.k, this.w(), this.N);
    }
    
    @j0
    private PorterDuffColorFilter j(@j0 final ColorStateList list, @j0 final PorterDuff$Mode porterDuff$Mode, final boolean b) {
        int n = list.getColorForState(this.getState(), 0);
        if (b) {
            n = this.l(n);
        }
        return new PorterDuffColorFilter(n, porterDuff$Mode);
    }
    
    @j0
    private PorterDuffColorFilter k(@k0 final ColorStateList list, @k0 final PorterDuff$Mode porterDuff$Mode, @j0 final Paint paint, final boolean b) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (list != null && porterDuff$Mode != null) {
            porterDuffColorFilter = this.j(list, porterDuff$Mode, b);
        }
        else {
            porterDuffColorFilter = this.f(paint, b);
        }
        return porterDuffColorFilter;
    }
    
    @j0
    public static j m(final Context context) {
        return n(context, 0.0f);
    }
    
    @j0
    public static j n(final Context context, final float n) {
        final int c = s2.a.c(context, o2.a.c.P2, j.class.getSimpleName());
        final j j = new j();
        j.Y(context);
        j.n0(ColorStateList.valueOf(c));
        j.m0(n);
        return j;
    }
    
    private void o(@j0 final Canvas canvas) {
        if (this.J.cardinality() > 0) {
            Log.w(j.c0, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.G.s != 0) {
            canvas.drawPath(this.M, this.V.c());
        }
        for (int i = 0; i < 4; ++i) {
            this.H[i].b(this.V, this.G.r, canvas);
            this.I[i].b(this.V, this.G.r, canvas);
        }
        if (this.b0) {
            final int h = this.H();
            final int j = this.I();
            canvas.translate((float)(-h), (float)(-j));
            canvas.drawPath(this.M, com.google.android.material.shape.j.i0);
            canvas.translate((float)h, (float)j);
        }
    }
    
    private void p(@j0 final Canvas canvas) {
        this.r(canvas, this.T, this.M, this.G.a, this.v());
    }
    
    private void r(@j0 final Canvas canvas, @j0 final Paint paint, @j0 final Path path, @j0 final o o, @j0 final RectF rectF) {
        if (o.u(rectF)) {
            final float n = o.t().a(rectF) * this.G.k;
            canvas.drawRoundRect(rectF, n, n, paint);
        }
        else {
            canvas.drawPath(path, paint);
        }
    }
    
    private void s(@j0 final Canvas canvas) {
        this.r(canvas, this.U, this.N, this.S, this.w());
    }
    
    @j0
    private RectF w() {
        this.P.set(this.v());
        final float n = this.N();
        this.P.inset(n, n);
        return this.P;
    }
    
    public Paint$Style A() {
        return this.G.v;
    }
    
    @t0({ t0.a.H })
    public void A0(final int s) {
        final d g = this.G;
        if (g.s != s) {
            g.s = s;
            this.Z();
        }
    }
    
    public float B() {
        return this.G.n;
    }
    
    @Deprecated
    public void B0(@j0 final r shapeAppearanceModel) {
        this.setShapeAppearanceModel(shapeAppearanceModel);
    }
    
    @Deprecated
    public void C(final int n, final int n2, @j0 final Path path) {
        this.h(new RectF(0.0f, 0.0f, (float)n, (float)n2), path);
    }
    
    public void C0(final float n, @l final int n2) {
        this.H0(n);
        this.E0(ColorStateList.valueOf(n2));
    }
    
    public float D() {
        return this.G.j;
    }
    
    public void D0(final float n, @k0 final ColorStateList list) {
        this.H0(n);
        this.E0(list);
    }
    
    public int E() {
        return this.G.t;
    }
    
    public void E0(@k0 final ColorStateList e) {
        final d g = this.G;
        if (g.e != e) {
            g.e = e;
            this.onStateChange(this.getState());
        }
    }
    
    public int F() {
        return this.G.q;
    }
    
    public void F0(@l final int n) {
        this.G0(ColorStateList.valueOf(n));
    }
    
    @Deprecated
    public int G() {
        return (int)this.x();
    }
    
    public void G0(final ColorStateList f) {
        this.G.f = f;
        this.M0();
        this.Z();
    }
    
    public int H() {
        final d g = this.G;
        return (int)(g.s * Math.sin(Math.toRadians(g.t)));
    }
    
    public void H0(final float l) {
        this.G.l = l;
        this.invalidateSelf();
    }
    
    public int I() {
        final d g = this.G;
        return (int)(g.s * Math.cos(Math.toRadians(g.t)));
    }
    
    public void I0(final float p) {
        final d g = this.G;
        if (g.p != p) {
            g.p = p;
            this.N0();
        }
    }
    
    public int J() {
        return this.G.r;
    }
    
    public void J0(final boolean u) {
        final d g = this.G;
        if (g.u != u) {
            g.u = u;
            this.invalidateSelf();
        }
    }
    
    @t0({ t0.a.H })
    public int K() {
        return this.G.s;
    }
    
    public void K0(final float n) {
        this.I0(n - this.x());
    }
    
    @Deprecated
    @k0
    public r L() {
        final o shapeAppearanceModel = this.getShapeAppearanceModel();
        r r;
        if (shapeAppearanceModel instanceof r) {
            r = (r)shapeAppearanceModel;
        }
        else {
            r = null;
        }
        return r;
    }
    
    @k0
    public ColorStateList M() {
        return this.G.e;
    }
    
    @k0
    public ColorStateList O() {
        return this.G.f;
    }
    
    public float P() {
        return this.G.l;
    }
    
    @k0
    public ColorStateList Q() {
        return this.G.g;
    }
    
    public float R() {
        return this.G.a.r().a(this.v());
    }
    
    public float S() {
        return this.G.a.t().a(this.v());
    }
    
    public float T() {
        return this.G.p;
    }
    
    public float U() {
        return this.x() + this.T();
    }
    
    public void Y(final Context context) {
        this.G.b = new a(context);
        this.N0();
    }
    
    public boolean a0() {
        final a b = this.G.b;
        return b != null && b.l();
    }
    
    public boolean b0() {
        return this.G.b != null;
    }
    
    public boolean c0(final int n, final int n2) {
        return this.getTransparentRegion().contains(n, n2);
    }
    
    @t0({ t0.a.H })
    public boolean d0() {
        return this.G.a.u(this.v());
    }
    
    public void draw(@j0 final Canvas canvas) {
        this.T.setColorFilter((ColorFilter)this.Y);
        final int alpha = this.T.getAlpha();
        this.T.setAlpha(g0(alpha, this.G.m));
        this.U.setColorFilter((ColorFilter)this.Z);
        this.U.setStrokeWidth(this.G.l);
        final int alpha2 = this.U.getAlpha();
        this.U.setAlpha(g0(alpha2, this.G.m));
        if (this.K) {
            this.i();
            this.g(this.v(), this.M);
            this.K = false;
        }
        this.f0(canvas);
        if (this.W()) {
            this.p(canvas);
        }
        if (this.X()) {
            this.s(canvas);
        }
        this.T.setAlpha(alpha);
        this.U.setAlpha(alpha2);
    }
    
    @Deprecated
    public boolean e0() {
        final int q = this.G.q;
        return q == 0 || q == 2;
    }
    
    @k0
    public Drawable$ConstantState getConstantState() {
        return this.G;
    }
    
    public int getOpacity() {
        return -3;
    }
    
    @TargetApi(21)
    public void getOutline(@j0 final Outline outline) {
        if (this.G.q == 2) {
            return;
        }
        if (this.d0()) {
            outline.setRoundRect(this.getBounds(), this.R() * this.G.k);
            return;
        }
        this.g(this.v(), this.M);
        if (!this.M.isConvex()) {
            if (Build$VERSION.SDK_INT < 29) {
                return;
            }
        }
        try {
            outline.setConvexPath(this.M);
        }
        catch (IllegalArgumentException ex) {}
    }
    
    public boolean getPadding(@j0 final Rect rect) {
        final Rect i = this.G.i;
        if (i != null) {
            rect.set(i);
            return true;
        }
        return super.getPadding(rect);
    }
    
    @j0
    public o getShapeAppearanceModel() {
        return this.G.a;
    }
    
    public Region getTransparentRegion() {
        this.Q.set(this.getBounds());
        this.g(this.v(), this.M);
        this.R.setPath(this.M, this.Q);
        this.Q.op(this.R, Region$Op.DIFFERENCE);
        return this.Q;
    }
    
    @t0({ t0.a.H })
    protected final void h(@j0 final RectF rectF, @j0 final Path path) {
        final p x = this.X;
        final d g = this.G;
        x.e(g.a, g.k, rectF, this.W, path);
    }
    
    public boolean i0() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        return sdk_INT < 21 || (!this.d0() && !this.M.isConvex() && sdk_INT < 29);
    }
    
    public void invalidateSelf() {
        this.K = true;
        super.invalidateSelf();
    }
    
    public boolean isStateful() {
        if (!super.isStateful()) {
            final ColorStateList g = this.G.g;
            if (g == null || !g.isStateful()) {
                final ColorStateList f = this.G.f;
                if (f == null || !f.isStateful()) {
                    final ColorStateList e = this.G.e;
                    if (e == null || !e.isStateful()) {
                        final ColorStateList d = this.G.d;
                        if (d == null || !d.isStateful()) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    
    public void j0(final float n) {
        this.setShapeAppearanceModel(this.G.a.w(n));
    }
    
    public void k0(@j0 final com.google.android.material.shape.d d) {
        this.setShapeAppearanceModel(this.G.a.x(d));
    }
    
    @l
    @t0({ t0.a.H })
    protected int l(@l final int n) {
        final float u = this.U();
        final float b = this.B();
        final a b2 = this.G.b;
        int e = n;
        if (b2 != null) {
            e = b2.e(n, u + b);
        }
        return e;
    }
    
    @t0({ t0.a.H })
    public void l0(final boolean b) {
        this.X.n(b);
    }
    
    public void m0(final float o) {
        final d g = this.G;
        if (g.o != o) {
            g.o = o;
            this.N0();
        }
    }
    
    @j0
    public Drawable mutate() {
        this.G = new d(this.G);
        return this;
    }
    
    public void n0(@k0 final ColorStateList d) {
        final d g = this.G;
        if (g.d != d) {
            g.d = d;
            this.onStateChange(this.getState());
        }
    }
    
    public void o0(final float k) {
        final d g = this.G;
        if (g.k != k) {
            g.k = k;
            this.K = true;
            this.invalidateSelf();
        }
    }
    
    protected void onBoundsChange(final Rect rect) {
        this.K = true;
        super.onBoundsChange(rect);
    }
    
    protected boolean onStateChange(final int[] array) {
        final boolean l0 = this.L0(array);
        final boolean m0 = this.M0();
        final boolean b = l0 || m0;
        if (b) {
            this.invalidateSelf();
        }
        return b;
    }
    
    public void p0(final int n, final int n2, final int n3, final int n4) {
        final d g = this.G;
        if (g.i == null) {
            g.i = new Rect();
        }
        this.G.i.set(n, n2, n3, n4);
        this.invalidateSelf();
    }
    
    @t0({ t0.a.H })
    protected void q(@j0 final Canvas canvas, @j0 final Paint paint, @j0 final Path path, @j0 final RectF rectF) {
        this.r(canvas, paint, path, this.G.a, rectF);
    }
    
    public void q0(final Paint$Style v) {
        this.G.v = v;
        this.Z();
    }
    
    public void r0(final float n) {
        final d g = this.G;
        if (g.n != n) {
            g.n = n;
            this.N0();
        }
    }
    
    public void s0(final float j) {
        final d g = this.G;
        if (g.j != j) {
            g.j = j;
            this.invalidateSelf();
        }
    }
    
    public void setAlpha(@b0(from = 0L, to = 255L) final int m) {
        final d g = this.G;
        if (g.m != m) {
            g.m = m;
            this.Z();
        }
    }
    
    public void setColorFilter(@k0 final ColorFilter c) {
        this.G.c = c;
        this.Z();
    }
    
    public void setShapeAppearanceModel(@j0 final o a) {
        this.G.a = a;
        this.invalidateSelf();
    }
    
    public void setTint(@l final int n) {
        this.setTintList(ColorStateList.valueOf(n));
    }
    
    public void setTintList(@k0 final ColorStateList g) {
        this.G.g = g;
        this.M0();
        this.Z();
    }
    
    public void setTintMode(@k0 final PorterDuff$Mode h) {
        final d g = this.G;
        if (g.h != h) {
            g.h = h;
            this.M0();
            this.Z();
        }
    }
    
    public float t() {
        return this.G.a.j().a(this.v());
    }
    
    @t0({ t0.a.H })
    public void t0(final boolean b0) {
        this.b0 = b0;
    }
    
    public float u() {
        return this.G.a.l().a(this.v());
    }
    
    public void u0(final int n) {
        this.V.d(n);
        this.G.u = false;
        this.Z();
    }
    
    @j0
    protected RectF v() {
        this.O.set(this.getBounds());
        return this.O;
    }
    
    public void v0(final int t) {
        final d g = this.G;
        if (g.t != t) {
            g.t = t;
            this.Z();
        }
    }
    
    public void w0(final int q) {
        final d g = this.G;
        if (g.q != q) {
            g.q = q;
            this.Z();
        }
    }
    
    public float x() {
        return this.G.o;
    }
    
    @Deprecated
    public void x0(final int n) {
        this.m0((float)n);
    }
    
    @k0
    public ColorStateList y() {
        return this.G.d;
    }
    
    @Deprecated
    public void y0(final boolean b) {
        this.w0((b ^ true) ? 1 : 0);
    }
    
    public float z() {
        return this.G.k;
    }
    
    @Deprecated
    public void z0(final int r) {
        this.G.r = r;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }
    
    static final class d extends Drawable$ConstantState
    {
        @j0
        public o a;
        @k0
        public a b;
        @k0
        public ColorFilter c;
        @k0
        public ColorStateList d;
        @k0
        public ColorStateList e;
        @k0
        public ColorStateList f;
        @k0
        public ColorStateList g;
        @k0
        public PorterDuff$Mode h;
        @k0
        public Rect i;
        public float j;
        public float k;
        public float l;
        public int m;
        public float n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint$Style v;
        
        public d(@j0 final d d) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff$Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint$Style.FILL_AND_STROKE;
            this.a = d.a;
            this.b = d.b;
            this.l = d.l;
            this.c = d.c;
            this.d = d.d;
            this.e = d.e;
            this.h = d.h;
            this.g = d.g;
            this.m = d.m;
            this.j = d.j;
            this.s = d.s;
            this.q = d.q;
            this.u = d.u;
            this.k = d.k;
            this.n = d.n;
            this.o = d.o;
            this.p = d.p;
            this.r = d.r;
            this.t = d.t;
            this.f = d.f;
            this.v = d.v;
            if (d.i != null) {
                this.i = new Rect(d.i);
            }
        }
        
        public d(final o a, final a b) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff$Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint$Style.FILL_AND_STROKE;
            this.a = a;
            this.b = b;
        }
        
        public int getChangingConfigurations() {
            return 0;
        }
        
        @j0
        public Drawable newDrawable() {
            final j j = new j(this, null);
            j.K = true;
            return j;
        }
    }
}
