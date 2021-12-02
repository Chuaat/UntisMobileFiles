// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import androidx.annotation.s;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.p;
import androidx.core.graphics.h;
import androidx.annotation.l;
import android.content.res.ColorStateList;
import android.content.Context;
import c.a;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import androidx.annotation.t0;

@t0({ t0.a.I })
public final class j
{
    private static final String b = "AppCompatDrawableManag";
    private static final boolean c = false;
    private static final PorterDuff$Mode d;
    private static j e;
    private j0 a;
    
    static {
        d = PorterDuff$Mode.SRC_IN;
    }
    
    public static j b() {
        synchronized (j.class) {
            if (j.e == null) {
                i();
            }
            return j.e;
        }
    }
    
    public static PorterDuffColorFilter e(final int n, final PorterDuff$Mode porterDuff$Mode) {
        synchronized (j.class) {
            return j0.l(n, porterDuff$Mode);
        }
    }
    
    public static void i() {
        synchronized (j.class) {
            if (j.e == null) {
                (j.e = new j()).a = j0.h();
                j.e.a.u((j0.f)new j0.f() {
                    private final int[] a = { c.a.g.y0, c.a.g.w0, c.a.g.a };
                    private final int[] b = { c.a.g.y, c.a.g.h0, c.a.g.F, c.a.g.A, c.a.g.B, c.a.g.E, c.a.g.D };
                    private final int[] c = { c.a.g.v0, c.a.g.x0, c.a.g.r, c.a.g.r0, c.a.g.s0, c.a.g.t0, c.a.g.u0 };
                    private final int[] d = { c.a.g.X, c.a.g.p, c.a.g.W };
                    private final int[] e = { c.a.g.p0, c.a.g.z0 };
                    private final int[] f = { c.a.g.d, c.a.g.j, c.a.g.e, c.a.g.k };
                    
                    private boolean f(final int[] array, final int n) {
                        for (int length = array.length, i = 0; i < length; ++i) {
                            if (array[i] == n) {
                                return true;
                            }
                        }
                        return false;
                    }
                    
                    private ColorStateList g(@androidx.annotation.j0 final Context context) {
                        return this.h(context, 0);
                    }
                    
                    private ColorStateList h(@androidx.annotation.j0 final Context context, @l final int n) {
                        final int d = p0.d(context, c.a.c.E0);
                        return new ColorStateList(new int[][] { p0.c, p0.f, p0.d, p0.j }, new int[] { p0.c(context, c.a.c.C0), androidx.core.graphics.h.t(d, n), androidx.core.graphics.h.t(d, n), n });
                    }
                    
                    private ColorStateList i(@androidx.annotation.j0 final Context context) {
                        return this.h(context, p0.d(context, c.a.c.A0));
                    }
                    
                    private ColorStateList j(@androidx.annotation.j0 final Context context) {
                        return this.h(context, p0.d(context, c.a.c.C0));
                    }
                    
                    private ColorStateList k(final Context context) {
                        final int[][] array = new int[3][];
                        final int[] array2 = new int[3];
                        final int j0 = c.a.c.J0;
                        final ColorStateList f = p0.f(context, j0);
                        if (f != null && f.isStateful()) {
                            array[0] = p0.c;
                            array2[0] = f.getColorForState(array[0], 0);
                            array[1] = p0.g;
                            array2[1] = p0.d(context, c.a.c.D0);
                            array[2] = p0.j;
                            array2[2] = f.getDefaultColor();
                        }
                        else {
                            array[0] = p0.c;
                            array2[0] = p0.c(context, j0);
                            array[1] = p0.g;
                            array2[1] = p0.d(context, c.a.c.D0);
                            array[2] = p0.j;
                            array2[2] = p0.d(context, j0);
                        }
                        return new ColorStateList(array, array2);
                    }
                    
                    private LayerDrawable l(@androidx.annotation.j0 final j0 j0, @androidx.annotation.j0 final Context context, @p int dimensionPixelSize) {
                        dimensionPixelSize = context.getResources().getDimensionPixelSize(dimensionPixelSize);
                        final Drawable i = j0.j(context, c.a.g.l0);
                        final Drawable k = j0.j(context, c.a.g.m0);
                        BitmapDrawable bitmapDrawable;
                        BitmapDrawable bitmapDrawable2;
                        if (i instanceof BitmapDrawable && i.getIntrinsicWidth() == dimensionPixelSize && i.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable = (BitmapDrawable)i;
                            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                        }
                        else {
                            final Bitmap bitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap$Config.ARGB_8888);
                            final Canvas canvas = new Canvas(bitmap);
                            i.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            i.draw(canvas);
                            bitmapDrawable = new BitmapDrawable(bitmap);
                            bitmapDrawable2 = new BitmapDrawable(bitmap);
                        }
                        bitmapDrawable2.setTileModeX(Shader$TileMode.REPEAT);
                        BitmapDrawable bitmapDrawable3;
                        if (k instanceof BitmapDrawable && k.getIntrinsicWidth() == dimensionPixelSize && k.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable3 = (BitmapDrawable)k;
                        }
                        else {
                            final Bitmap bitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap$Config.ARGB_8888);
                            final Canvas canvas2 = new Canvas(bitmap2);
                            k.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            k.draw(canvas2);
                            bitmapDrawable3 = new BitmapDrawable(bitmap2);
                        }
                        final LayerDrawable layerDrawable = new LayerDrawable(new Drawable[] { (Drawable)bitmapDrawable, (Drawable)bitmapDrawable3, (Drawable)bitmapDrawable2 });
                        layerDrawable.setId(0, 16908288);
                        layerDrawable.setId(1, 16908303);
                        layerDrawable.setId(2, 16908301);
                        return layerDrawable;
                    }
                    
                    private void m(final Drawable drawable, final int n, final PorterDuff$Mode porterDuff$Mode) {
                        Drawable mutate = drawable;
                        if (b0.a(drawable)) {
                            mutate = drawable.mutate();
                        }
                        PorterDuff$Mode a;
                        if ((a = porterDuff$Mode) == null) {
                            a = j.d;
                        }
                        mutate.setColorFilter((ColorFilter)j.e(n, a));
                    }
                    
                    @Override
                    public boolean a(@androidx.annotation.j0 final Context context, int n, @androidx.annotation.j0 final Drawable drawable) {
                        PorterDuff$Mode porterDuff$Mode = j.d;
                        final boolean f = this.f(this.a, n);
                        final int n2 = 16842801;
                        int round = 0;
                        boolean b = false;
                        Label_0124: {
                            Label_0033: {
                                if (f) {
                                    n = c.a.c.F0;
                                }
                                else if (this.f(this.c, n)) {
                                    n = c.a.c.D0;
                                }
                                else if (this.f(this.d, n)) {
                                    porterDuff$Mode = PorterDuff$Mode.MULTIPLY;
                                    n = n2;
                                }
                                else {
                                    if (n == c.a.g.L) {
                                        n = 16842800;
                                        round = Math.round(40.8f);
                                        break Label_0033;
                                    }
                                    if (n != c.a.g.t) {
                                        round = -1;
                                        b = false;
                                        n = 0;
                                        break Label_0124;
                                    }
                                    n = n2;
                                }
                                round = -1;
                            }
                            b = true;
                        }
                        if (b) {
                            Drawable mutate = drawable;
                            if (b0.a(drawable)) {
                                mutate = drawable.mutate();
                            }
                            mutate.setColorFilter((ColorFilter)j.e(p0.d(context, n), porterDuff$Mode));
                            if (round != -1) {
                                mutate.setAlpha(round);
                            }
                            return true;
                        }
                        return false;
                    }
                    
                    @Override
                    public PorterDuff$Mode b(final int n) {
                        PorterDuff$Mode multiply;
                        if (n == c.a.g.n0) {
                            multiply = PorterDuff$Mode.MULTIPLY;
                        }
                        else {
                            multiply = null;
                        }
                        return multiply;
                    }
                    
                    @Override
                    public Drawable c(@androidx.annotation.j0 final j0 j0, @androidx.annotation.j0 final Context context, int n) {
                        if (n == c.a.g.q) {
                            return (Drawable)new LayerDrawable(new Drawable[] { j0.j(context, c.a.g.p), j0.j(context, c.a.g.r) });
                        }
                        if (n == c.a.g.Z) {
                            n = c.a.f.h0;
                        }
                        else if (n == c.a.g.Y) {
                            n = c.a.f.i0;
                        }
                        else {
                            if (n != c.a.g.a0) {
                                return null;
                            }
                            n = c.a.f.j0;
                        }
                        return (Drawable)this.l(j0, context, n);
                    }
                    
                    @Override
                    public ColorStateList d(@androidx.annotation.j0 final Context context, final int n) {
                        if (n == c.a.g.u) {
                            return androidx.appcompat.content.res.a.c(context, c.a.e.v);
                        }
                        if (n == c.a.g.o0) {
                            return androidx.appcompat.content.res.a.c(context, c.a.e.y);
                        }
                        if (n == c.a.g.n0) {
                            return this.k(context);
                        }
                        if (n == c.a.g.i) {
                            return this.j(context);
                        }
                        if (n == c.a.g.c) {
                            return this.g(context);
                        }
                        if (n == c.a.g.h) {
                            return this.i(context);
                        }
                        if (n == c.a.g.j0 || n == c.a.g.k0) {
                            return androidx.appcompat.content.res.a.c(context, c.a.e.x);
                        }
                        if (this.f(this.b, n)) {
                            return p0.f(context, c.a.c.F0);
                        }
                        if (this.f(this.e, n)) {
                            return androidx.appcompat.content.res.a.c(context, c.a.e.u);
                        }
                        if (this.f(this.f, n)) {
                            return androidx.appcompat.content.res.a.c(context, c.a.e.t);
                        }
                        if (n == c.a.g.g0) {
                            return androidx.appcompat.content.res.a.c(context, c.a.e.w);
                        }
                        return null;
                    }
                    
                    @Override
                    public boolean e(@androidx.annotation.j0 final Context context, int n, @androidx.annotation.j0 Drawable drawable) {
                        Drawable drawable2;
                        if (n == c.a.g.i0) {
                            final LayerDrawable layerDrawable = (LayerDrawable)drawable;
                            final Drawable drawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                            n = c.a.c.F0;
                            this.m(drawableByLayerId, p0.d(context, n), j.d);
                            this.m(layerDrawable.findDrawableByLayerId(16908303), p0.d(context, n), j.d);
                            drawable = layerDrawable.findDrawableByLayerId(16908301);
                            n = p0.d(context, c.a.c.D0);
                            drawable2 = drawable;
                        }
                        else {
                            if (n != c.a.g.Z && n != c.a.g.Y && n != c.a.g.a0) {
                                return false;
                            }
                            final LayerDrawable layerDrawable2 = (LayerDrawable)drawable;
                            this.m(layerDrawable2.findDrawableByLayerId(16908288), p0.c(context, c.a.c.F0), j.d);
                            drawable = layerDrawable2.findDrawableByLayerId(16908303);
                            n = c.a.c.D0;
                            this.m(drawable, p0.d(context, n), j.d);
                            drawable = layerDrawable2.findDrawableByLayerId(16908301);
                            n = p0.d(context, n);
                            drawable2 = drawable;
                        }
                        this.m(drawable2, n, j.d);
                        return true;
                    }
                });
            }
        }
    }
    
    static void j(final Drawable drawable, final s0 s0, final int[] array) {
        j0.w(drawable, s0, array);
    }
    
    public Drawable c(@androidx.annotation.j0 final Context context, @s final int n) {
        synchronized (this) {
            return this.a.j(context, n);
        }
    }
    
    Drawable d(@androidx.annotation.j0 final Context context, @s final int n, final boolean b) {
        synchronized (this) {
            return this.a.k(context, n, b);
        }
    }
    
    ColorStateList f(@androidx.annotation.j0 final Context context, @s final int n) {
        synchronized (this) {
            return this.a.m(context, n);
        }
    }
    
    public void g(@androidx.annotation.j0 final Context context) {
        synchronized (this) {
            this.a.s(context);
        }
    }
    
    Drawable h(@androidx.annotation.j0 final Context context, @androidx.annotation.j0 final z0 z0, @s final int n) {
        synchronized (this) {
            return this.a.t(context, z0, n);
        }
    }
    
    boolean k(@androidx.annotation.j0 final Context context, @s final int n, @androidx.annotation.j0 final Drawable drawable) {
        return this.a.x(context, n, drawable);
    }
}
