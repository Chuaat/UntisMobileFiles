// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.graphics.drawable;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Region;
import android.graphics.Rect;
import android.graphics.Canvas;
import androidx.annotation.t0;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

@t0({ t0.a.I })
public class c extends Drawable implements Drawable$Callback
{
    private Drawable G;
    
    public c(final Drawable drawable) {
        this.b(drawable);
    }
    
    public Drawable a() {
        return this.G;
    }
    
    public void b(final Drawable g) {
        final Drawable g2 = this.G;
        if (g2 != null) {
            g2.setCallback((Drawable$Callback)null);
        }
        if ((this.G = g) != null) {
            g.setCallback((Drawable$Callback)this);
        }
    }
    
    public void draw(final Canvas canvas) {
        this.G.draw(canvas);
    }
    
    public int getChangingConfigurations() {
        return this.G.getChangingConfigurations();
    }
    
    public Drawable getCurrent() {
        return this.G.getCurrent();
    }
    
    public int getIntrinsicHeight() {
        return this.G.getIntrinsicHeight();
    }
    
    public int getIntrinsicWidth() {
        return this.G.getIntrinsicWidth();
    }
    
    public int getMinimumHeight() {
        return this.G.getMinimumHeight();
    }
    
    public int getMinimumWidth() {
        return this.G.getMinimumWidth();
    }
    
    public int getOpacity() {
        return this.G.getOpacity();
    }
    
    public boolean getPadding(final Rect rect) {
        return this.G.getPadding(rect);
    }
    
    public int[] getState() {
        return this.G.getState();
    }
    
    public Region getTransparentRegion() {
        return this.G.getTransparentRegion();
    }
    
    public void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public boolean isAutoMirrored() {
        return androidx.core.graphics.drawable.c.h(this.G);
    }
    
    public boolean isStateful() {
        return this.G.isStateful();
    }
    
    public void jumpToCurrentState() {
        this.G.jumpToCurrentState();
    }
    
    protected void onBoundsChange(final Rect bounds) {
        this.G.setBounds(bounds);
    }
    
    protected boolean onLevelChange(final int level) {
        return this.G.setLevel(level);
    }
    
    public void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public void setAlpha(final int alpha) {
        this.G.setAlpha(alpha);
    }
    
    public void setAutoMirrored(final boolean b) {
        androidx.core.graphics.drawable.c.j(this.G, b);
    }
    
    public void setChangingConfigurations(final int changingConfigurations) {
        this.G.setChangingConfigurations(changingConfigurations);
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.G.setColorFilter(colorFilter);
    }
    
    public void setDither(final boolean dither) {
        this.G.setDither(dither);
    }
    
    public void setFilterBitmap(final boolean filterBitmap) {
        this.G.setFilterBitmap(filterBitmap);
    }
    
    public void setHotspot(final float n, final float n2) {
        androidx.core.graphics.drawable.c.k(this.G, n, n2);
    }
    
    public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        androidx.core.graphics.drawable.c.l(this.G, n, n2, n3, n4);
    }
    
    public boolean setState(final int[] state) {
        return this.G.setState(state);
    }
    
    public void setTint(final int n) {
        androidx.core.graphics.drawable.c.n(this.G, n);
    }
    
    public void setTintList(final ColorStateList list) {
        androidx.core.graphics.drawable.c.o(this.G, list);
    }
    
    public void setTintMode(final PorterDuff$Mode porterDuff$Mode) {
        androidx.core.graphics.drawable.c.p(this.G, porterDuff$Mode);
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        return super.setVisible(b, b2) || this.G.setVisible(b, b2);
    }
    
    public void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
