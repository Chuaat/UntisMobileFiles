// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.gif;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable$ConstantState;
import java.nio.ByteBuffer;
import android.view.Gravity;
import android.graphics.Canvas;
import java.util.ArrayList;
import androidx.annotation.j0;
import android.graphics.drawable.Drawable$Callback;
import androidx.annotation.b1;
import com.bumptech.glide.util.k;
import android.graphics.Bitmap;
import com.bumptech.glide.load.n;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.gifdecoder.a;
import android.content.Context;
import java.util.List;
import android.graphics.Rect;
import android.graphics.Paint;
import androidx.vectordrawable.graphics.drawable.b;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

public class c extends Drawable implements g.b, Animatable, b
{
    public static final int R = -1;
    public static final int S = 0;
    private static final int T = 119;
    private final a G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private int L;
    private int M;
    private boolean N;
    private Paint O;
    private Rect P;
    private List<androidx.vectordrawable.graphics.drawable.b.a> Q;
    
    @Deprecated
    public c(final Context context, final com.bumptech.glide.gifdecoder.a a, final e e, final n<Bitmap> n, final int n2, final int n3, final Bitmap bitmap) {
        this(context, a, n, n2, n3, bitmap);
    }
    
    public c(final Context context, final com.bumptech.glide.gifdecoder.a a, final n<Bitmap> n, final int n2, final int n3, final Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.d(context), a, n2, n3, n, bitmap)));
    }
    
    c(final a a) {
        this.K = true;
        this.M = -1;
        this.G = com.bumptech.glide.util.k.d(a);
    }
    
    @b1
    c(final g g, final Paint o) {
        this(new a(g));
        this.O = o;
    }
    
    private Drawable$Callback e() {
        Drawable$Callback drawable$Callback;
        for (drawable$Callback = this.getCallback(); drawable$Callback instanceof Drawable; drawable$Callback = ((Drawable)drawable$Callback).getCallback()) {}
        return drawable$Callback;
    }
    
    private Rect g() {
        if (this.P == null) {
            this.P = new Rect();
        }
        return this.P;
    }
    
    private Paint l() {
        if (this.O == null) {
            this.O = new Paint(2);
        }
        return this.O;
    }
    
    private void o() {
        final List<androidx.vectordrawable.graphics.drawable.b.a> q = this.Q;
        if (q != null) {
            for (int i = 0; i < q.size(); ++i) {
                this.Q.get(i).b(this);
            }
        }
    }
    
    private void q() {
        this.L = 0;
    }
    
    private void v() {
        com.bumptech.glide.util.k.a(this.J ^ true, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.G.a.f() != 1) {
            if (this.H) {
                return;
            }
            this.H = true;
            this.G.a.v((g.b)this);
        }
        this.invalidateSelf();
    }
    
    private void w() {
        this.H = false;
        this.G.a.w((g.b)this);
    }
    
    public void a() {
        if (this.e() == null) {
            this.stop();
            this.invalidateSelf();
            return;
        }
        this.invalidateSelf();
        if (this.j() == this.i() - 1) {
            ++this.L;
        }
        final int m = this.M;
        if (m != -1 && this.L >= m) {
            this.o();
            this.stop();
        }
    }
    
    public void b(@j0 final androidx.vectordrawable.graphics.drawable.b.a a) {
        if (a == null) {
            return;
        }
        if (this.Q == null) {
            this.Q = new ArrayList<androidx.vectordrawable.graphics.drawable.b.a>();
        }
        this.Q.add(a);
    }
    
    public void c() {
        final List<androidx.vectordrawable.graphics.drawable.b.a> q = this.Q;
        if (q != null) {
            q.clear();
        }
    }
    
    public boolean d(@j0 final androidx.vectordrawable.graphics.drawable.b.a a) {
        final List<androidx.vectordrawable.graphics.drawable.b.a> q = this.Q;
        return q != null && a != null && q.remove(a);
    }
    
    public void draw(@j0 final Canvas canvas) {
        if (this.J) {
            return;
        }
        if (this.N) {
            Gravity.apply(119, this.getIntrinsicWidth(), this.getIntrinsicHeight(), this.getBounds(), this.g());
            this.N = false;
        }
        canvas.drawBitmap(this.G.a.c(), (Rect)null, this.g(), this.l());
    }
    
    public ByteBuffer f() {
        return this.G.a.b();
    }
    
    public Drawable$ConstantState getConstantState() {
        return this.G;
    }
    
    public int getIntrinsicHeight() {
        return this.G.a.i();
    }
    
    public int getIntrinsicWidth() {
        return this.G.a.m();
    }
    
    public int getOpacity() {
        return -2;
    }
    
    public Bitmap h() {
        return this.G.a.e();
    }
    
    public int i() {
        return this.G.a.f();
    }
    
    public boolean isRunning() {
        return this.H;
    }
    
    public int j() {
        return this.G.a.d();
    }
    
    public n<Bitmap> k() {
        return this.G.a.h();
    }
    
    public int m() {
        return this.G.a.l();
    }
    
    boolean n() {
        return this.J;
    }
    
    protected void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        this.N = true;
    }
    
    public void p() {
        this.J = true;
        this.G.a.a();
    }
    
    public void r(final n<Bitmap> n, final Bitmap bitmap) {
        this.G.a.q(n, bitmap);
    }
    
    void s(final boolean h) {
        this.H = h;
    }
    
    public void setAlpha(final int alpha) {
        this.l().setAlpha(alpha);
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.l().setColorFilter(colorFilter);
    }
    
    public boolean setVisible(final boolean k, final boolean b) {
        k.a(this.J ^ true, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        if (!(this.K = k)) {
            this.w();
        }
        else if (this.I) {
            this.v();
        }
        return super.setVisible(k, b);
    }
    
    public void start() {
        this.I = true;
        this.q();
        if (this.K) {
            this.v();
        }
    }
    
    public void stop() {
        this.I = false;
        this.w();
    }
    
    public void t(int j) {
        final int n = -1;
        if (j <= 0 && j != -1 && j != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (j == 0) {
            j = this.G.a.j();
            if (j == 0) {
                j = n;
            }
            this.M = j;
        }
        else {
            this.M = j;
        }
    }
    
    public void u() {
        com.bumptech.glide.util.k.a(this.H ^ true, "You cannot restart a currently running animation.");
        this.G.a.r();
        this.start();
    }
    
    static final class a extends Drawable$ConstantState
    {
        @b1
        final g a;
        
        a(final g a) {
            this.a = a;
        }
        
        public int getChangingConfigurations() {
            return 0;
        }
        
        @j0
        public Drawable newDrawable() {
            return new c(this);
        }
        
        @j0
        public Drawable newDrawable(final Resources resources) {
            return this.newDrawable();
        }
    }
}
