// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics.drawable;

import android.graphics.ColorFilter;
import android.graphics.Region;
import android.graphics.Rect;
import androidx.annotation.p0;
import android.graphics.Canvas;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable$ConstantState;
import android.content.res.Resources;
import androidx.annotation.j0;
import androidx.annotation.k0;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

class k extends Drawable implements Drawable$Callback, j, i
{
    static final PorterDuff$Mode M;
    private int G;
    private PorterDuff$Mode H;
    private boolean I;
    m J;
    private boolean K;
    Drawable L;
    
    static {
        M = PorterDuff$Mode.SRC_IN;
    }
    
    k(@k0 final Drawable drawable) {
        this.J = this.d();
        this.a(drawable);
    }
    
    k(@j0 final m j, @k0 final Resources resources) {
        this.J = j;
        this.e(resources);
    }
    
    @j0
    private m d() {
        return new m(this.J);
    }
    
    private void e(@k0 final Resources resources) {
        final m j = this.J;
        if (j != null) {
            final Drawable$ConstantState b = j.b;
            if (b != null) {
                this.a(b.newDrawable(resources));
            }
        }
    }
    
    private boolean f(final int[] array) {
        if (!this.c()) {
            return false;
        }
        final m j = this.J;
        final ColorStateList c = j.c;
        final PorterDuff$Mode d = j.d;
        if (c != null && d != null) {
            final int colorForState = c.getColorForState(array, c.getDefaultColor());
            if (!this.I || colorForState != this.G || d != this.H) {
                this.setColorFilter(colorForState, d);
                this.G = colorForState;
                this.H = d;
                return this.I = true;
            }
        }
        else {
            this.I = false;
            this.clearColorFilter();
        }
        return false;
    }
    
    public final void a(final Drawable l) {
        final Drawable i = this.L;
        if (i != null) {
            i.setCallback((Drawable$Callback)null);
        }
        if ((this.L = l) != null) {
            l.setCallback((Drawable$Callback)this);
            this.setVisible(l.isVisible(), true);
            this.setState(l.getState());
            this.setLevel(l.getLevel());
            this.setBounds(l.getBounds());
            final m j = this.J;
            if (j != null) {
                j.b = l.getConstantState();
            }
        }
        this.invalidateSelf();
    }
    
    public final Drawable b() {
        return this.L;
    }
    
    protected boolean c() {
        return true;
    }
    
    public void draw(@j0 final Canvas canvas) {
        this.L.draw(canvas);
    }
    
    public int getChangingConfigurations() {
        final int changingConfigurations = super.getChangingConfigurations();
        final m j = this.J;
        int changingConfigurations2;
        if (j != null) {
            changingConfigurations2 = j.getChangingConfigurations();
        }
        else {
            changingConfigurations2 = 0;
        }
        return changingConfigurations | changingConfigurations2 | this.L.getChangingConfigurations();
    }
    
    @k0
    public Drawable$ConstantState getConstantState() {
        final m j = this.J;
        if (j != null && j.a()) {
            this.J.a = this.getChangingConfigurations();
            return this.J;
        }
        return null;
    }
    
    @j0
    public Drawable getCurrent() {
        return this.L.getCurrent();
    }
    
    public int getIntrinsicHeight() {
        return this.L.getIntrinsicHeight();
    }
    
    public int getIntrinsicWidth() {
        return this.L.getIntrinsicWidth();
    }
    
    @p0(23)
    public int getLayoutDirection() {
        return c.f(this.L);
    }
    
    public int getMinimumHeight() {
        return this.L.getMinimumHeight();
    }
    
    public int getMinimumWidth() {
        return this.L.getMinimumWidth();
    }
    
    public int getOpacity() {
        return this.L.getOpacity();
    }
    
    public boolean getPadding(@j0 final Rect rect) {
        return this.L.getPadding(rect);
    }
    
    @j0
    public int[] getState() {
        return this.L.getState();
    }
    
    public Region getTransparentRegion() {
        return this.L.getTransparentRegion();
    }
    
    public void invalidateDrawable(@j0 final Drawable drawable) {
        this.invalidateSelf();
    }
    
    @p0(19)
    public boolean isAutoMirrored() {
        return c.h(this.L);
    }
    
    public boolean isStateful() {
        if (this.c()) {
            final m j = this.J;
            if (j != null) {
                final ColorStateList c = j.c;
                return (c != null && c.isStateful()) || this.L.isStateful();
            }
        }
        final ColorStateList c = null;
        return (c != null && c.isStateful()) || this.L.isStateful();
    }
    
    public void jumpToCurrentState() {
        this.L.jumpToCurrentState();
    }
    
    @j0
    public Drawable mutate() {
        if (!this.K && super.mutate() == this) {
            this.J = this.d();
            final Drawable l = this.L;
            if (l != null) {
                l.mutate();
            }
            final m j = this.J;
            if (j != null) {
                final Drawable i = this.L;
                Drawable$ConstantState constantState;
                if (i != null) {
                    constantState = i.getConstantState();
                }
                else {
                    constantState = null;
                }
                j.b = constantState;
            }
            this.K = true;
        }
        return this;
    }
    
    protected void onBoundsChange(final Rect bounds) {
        final Drawable l = this.L;
        if (l != null) {
            l.setBounds(bounds);
        }
    }
    
    @p0(23)
    public boolean onLayoutDirectionChanged(final int n) {
        return c.m(this.L, n);
    }
    
    protected boolean onLevelChange(final int level) {
        return this.L.setLevel(level);
    }
    
    public void scheduleDrawable(@j0 final Drawable drawable, @j0 final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public void setAlpha(final int alpha) {
        this.L.setAlpha(alpha);
    }
    
    @p0(19)
    public void setAutoMirrored(final boolean b) {
        c.j(this.L, b);
    }
    
    public void setChangingConfigurations(final int changingConfigurations) {
        this.L.setChangingConfigurations(changingConfigurations);
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.L.setColorFilter(colorFilter);
    }
    
    public void setDither(final boolean dither) {
        this.L.setDither(dither);
    }
    
    public void setFilterBitmap(final boolean filterBitmap) {
        this.L.setFilterBitmap(filterBitmap);
    }
    
    public boolean setState(@j0 final int[] state) {
        final boolean setState = this.L.setState(state);
        return this.f(state) || setState;
    }
    
    public void setTint(final int n) {
        this.setTintList(ColorStateList.valueOf(n));
    }
    
    public void setTintList(final ColorStateList c) {
        this.J.c = c;
        this.f(this.getState());
    }
    
    public void setTintMode(@j0 final PorterDuff$Mode d) {
        this.J.d = d;
        this.f(this.getState());
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        return super.setVisible(b, b2) || this.L.setVisible(b, b2);
    }
    
    public void unscheduleDrawable(@j0 final Drawable drawable, @j0 final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
