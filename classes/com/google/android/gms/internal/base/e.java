// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.base;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$ConstantState;
import android.os.SystemClock;
import android.graphics.Canvas;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

public final class e extends Drawable implements Drawable$Callback
{
    private int G;
    private long H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private boolean N;
    private boolean O;
    private h P;
    private Drawable Q;
    private Drawable R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    
    public e(@k0 Drawable a, @k0 final Drawable drawable) {
        this(null);
        Drawable a2 = a;
        if (a == null) {
            a2 = f.a;
        }
        (this.Q = a2).setCallback((Drawable$Callback)this);
        final h p2 = this.P;
        p2.b |= a2.getChangingConfigurations();
        if ((a = drawable) == null) {
            a = f.a;
        }
        (this.R = a).setCallback((Drawable$Callback)this);
        final h p3 = this.P;
        p3.b |= a.getChangingConfigurations();
    }
    
    e(@k0 final h h) {
        this.G = 0;
        this.K = 255;
        this.M = 0;
        this.N = true;
        this.P = new h(h);
    }
    
    private final boolean c() {
        if (!this.S) {
            this.T = (this.Q.getConstantState() != null && this.R.getConstantState() != null);
            this.S = true;
        }
        return this.T;
    }
    
    public final Drawable a() {
        return this.R;
    }
    
    public final void b(final int n) {
        this.I = 0;
        this.J = this.K;
        this.M = 0;
        this.L = 250;
        this.G = 1;
        this.invalidateSelf();
    }
    
    public final void draw(final Canvas canvas) {
        final int g = this.G;
        final int n = 0;
        int n2 = 1;
        Label_0119: {
            if (g != 1) {
                if (g == 2) {
                    if (this.H >= 0L) {
                        final float a = (SystemClock.uptimeMillis() - this.H) / (float)this.L;
                        if (a < 1.0f) {
                            n2 = 0;
                        }
                        if (n2 != 0) {
                            this.G = 0;
                        }
                        this.M = (int)(this.J * Math.min(a, 1.0f) + 0.0f);
                        break Label_0119;
                    }
                }
                n2 = 1;
            }
            else {
                this.H = SystemClock.uptimeMillis();
                this.G = 2;
                n2 = n;
            }
        }
        final int m = this.M;
        final boolean n3 = this.N;
        final Drawable q = this.Q;
        final Drawable r = this.R;
        if (n2 != 0) {
            if (!n3 || m == 0) {
                q.draw(canvas);
            }
            final int k = this.K;
            if (m == k) {
                r.setAlpha(k);
                r.draw(canvas);
            }
            return;
        }
        if (n3) {
            q.setAlpha(this.K - m);
        }
        q.draw(canvas);
        if (n3) {
            q.setAlpha(this.K);
        }
        if (m > 0) {
            r.setAlpha(m);
            r.draw(canvas);
            r.setAlpha(this.K);
        }
        this.invalidateSelf();
    }
    
    public final int getChangingConfigurations() {
        final int changingConfigurations = super.getChangingConfigurations();
        final h p = this.P;
        return changingConfigurations | p.a | p.b;
    }
    
    @k0
    public final Drawable$ConstantState getConstantState() {
        if (this.c()) {
            this.P.a = this.getChangingConfigurations();
            return this.P;
        }
        return null;
    }
    
    public final int getIntrinsicHeight() {
        return Math.max(this.Q.getIntrinsicHeight(), this.R.getIntrinsicHeight());
    }
    
    public final int getIntrinsicWidth() {
        return Math.max(this.Q.getIntrinsicWidth(), this.R.getIntrinsicWidth());
    }
    
    public final int getOpacity() {
        if (!this.U) {
            this.V = Drawable.resolveOpacity(this.Q.getOpacity(), this.R.getOpacity());
            this.U = true;
        }
        return this.V;
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        final Drawable$Callback callback = this.getCallback();
        if (callback != null) {
            callback.invalidateDrawable((Drawable)this);
        }
    }
    
    public final Drawable mutate() {
        if (!this.O && super.mutate() == this) {
            if (!this.c()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.Q.mutate();
            this.R.mutate();
            this.O = true;
        }
        return this;
    }
    
    protected final void onBoundsChange(final Rect rect) {
        this.Q.setBounds(rect);
        this.R.setBounds(rect);
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        final Drawable$Callback callback = this.getCallback();
        if (callback != null) {
            callback.scheduleDrawable((Drawable)this, runnable, n);
        }
    }
    
    public final void setAlpha(final int n) {
        if (this.M == this.K) {
            this.M = n;
        }
        this.K = n;
        this.invalidateSelf();
    }
    
    public final void setColorFilter(@k0 final ColorFilter colorFilter) {
        this.Q.setColorFilter(colorFilter);
        this.R.setColorFilter(colorFilter);
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        final Drawable$Callback callback = this.getCallback();
        if (callback != null) {
            callback.unscheduleDrawable((Drawable)this, runnable);
        }
    }
}
