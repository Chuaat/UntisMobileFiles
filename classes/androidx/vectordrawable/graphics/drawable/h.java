// 
// Decompiled by Procyon v0.5.36
// 

package androidx.vectordrawable.graphics.drawable;

import android.graphics.PorterDuff$Mode;
import android.graphics.Region;
import android.graphics.Rect;
import androidx.core.graphics.drawable.c;
import android.content.res.Resources$Theme;
import androidx.core.graphics.drawable.i;
import android.graphics.drawable.Drawable;

abstract class h extends Drawable implements i
{
    Drawable G;
    
    public void applyTheme(final Resources$Theme resources$Theme) {
        final Drawable g = this.G;
        if (g != null) {
            c.a(g, resources$Theme);
        }
    }
    
    public void clearColorFilter() {
        final Drawable g = this.G;
        if (g != null) {
            g.clearColorFilter();
            return;
        }
        super.clearColorFilter();
    }
    
    public Drawable getCurrent() {
        final Drawable g = this.G;
        if (g != null) {
            return g.getCurrent();
        }
        return super.getCurrent();
    }
    
    public int getMinimumHeight() {
        final Drawable g = this.G;
        if (g != null) {
            return g.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }
    
    public int getMinimumWidth() {
        final Drawable g = this.G;
        if (g != null) {
            return g.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }
    
    public boolean getPadding(final Rect rect) {
        final Drawable g = this.G;
        if (g != null) {
            return g.getPadding(rect);
        }
        return super.getPadding(rect);
    }
    
    public int[] getState() {
        final Drawable g = this.G;
        if (g != null) {
            return g.getState();
        }
        return super.getState();
    }
    
    public Region getTransparentRegion() {
        final Drawable g = this.G;
        if (g != null) {
            return g.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }
    
    public void jumpToCurrentState() {
        final Drawable g = this.G;
        if (g != null) {
            c.i(g);
        }
    }
    
    protected void onBoundsChange(final Rect bounds) {
        final Drawable g = this.G;
        if (g != null) {
            g.setBounds(bounds);
            return;
        }
        super.onBoundsChange(bounds);
    }
    
    protected boolean onLevelChange(final int level) {
        final Drawable g = this.G;
        if (g != null) {
            return g.setLevel(level);
        }
        return super.onLevelChange(level);
    }
    
    public void setChangingConfigurations(final int n) {
        final Drawable g = this.G;
        if (g != null) {
            g.setChangingConfigurations(n);
            return;
        }
        super.setChangingConfigurations(n);
    }
    
    public void setColorFilter(final int n, final PorterDuff$Mode porterDuff$Mode) {
        final Drawable g = this.G;
        if (g != null) {
            g.setColorFilter(n, porterDuff$Mode);
            return;
        }
        super.setColorFilter(n, porterDuff$Mode);
    }
    
    public void setFilterBitmap(final boolean filterBitmap) {
        final Drawable g = this.G;
        if (g != null) {
            g.setFilterBitmap(filterBitmap);
        }
    }
    
    public void setHotspot(final float n, final float n2) {
        final Drawable g = this.G;
        if (g != null) {
            c.k(g, n, n2);
        }
    }
    
    public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        final Drawable g = this.G;
        if (g != null) {
            c.l(g, n, n2, n3, n4);
        }
    }
    
    public boolean setState(final int[] array) {
        final Drawable g = this.G;
        if (g != null) {
            return g.setState(array);
        }
        return super.setState(array);
    }
}
