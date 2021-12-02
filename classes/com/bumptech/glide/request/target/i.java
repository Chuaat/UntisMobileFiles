// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable$Callback;
import androidx.annotation.p0;
import androidx.annotation.j0;
import android.graphics.Canvas;
import android.graphics.Matrix$ScaleToFit;
import com.bumptech.glide.util.k;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;

public class i extends Drawable
{
    private final Matrix a;
    private final RectF b;
    private final RectF c;
    private Drawable d;
    private a e;
    private boolean f;
    
    public i(final Drawable drawable, final int n, final int n2) {
        this(new a(drawable.getConstantState(), n, n2), drawable);
    }
    
    i(final a a, final Drawable drawable) {
        this.e = k.d(a);
        this.d = k.d(drawable);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.a = new Matrix();
        this.b = new RectF(0.0f, 0.0f, (float)drawable.getIntrinsicWidth(), (float)drawable.getIntrinsicHeight());
        this.c = new RectF();
    }
    
    private void a() {
        this.a.setRectToRect(this.b, this.c, Matrix$ScaleToFit.CENTER);
    }
    
    public void clearColorFilter() {
        this.d.clearColorFilter();
    }
    
    public void draw(@j0 final Canvas canvas) {
        canvas.save();
        canvas.concat(this.a);
        this.d.draw(canvas);
        canvas.restore();
    }
    
    @p0(19)
    public int getAlpha() {
        return this.d.getAlpha();
    }
    
    public Drawable$Callback getCallback() {
        return this.d.getCallback();
    }
    
    public int getChangingConfigurations() {
        return this.d.getChangingConfigurations();
    }
    
    public Drawable$ConstantState getConstantState() {
        return this.e;
    }
    
    @j0
    public Drawable getCurrent() {
        return this.d.getCurrent();
    }
    
    public int getIntrinsicHeight() {
        return this.e.c;
    }
    
    public int getIntrinsicWidth() {
        return this.e.b;
    }
    
    public int getMinimumHeight() {
        return this.d.getMinimumHeight();
    }
    
    public int getMinimumWidth() {
        return this.d.getMinimumWidth();
    }
    
    public int getOpacity() {
        return this.d.getOpacity();
    }
    
    public boolean getPadding(@j0 final Rect rect) {
        return this.d.getPadding(rect);
    }
    
    public void invalidateSelf() {
        super.invalidateSelf();
        this.d.invalidateSelf();
    }
    
    @j0
    public Drawable mutate() {
        if (!this.f && super.mutate() == this) {
            this.d = this.d.mutate();
            this.e = new a(this.e);
            this.f = true;
        }
        return this;
    }
    
    public void scheduleSelf(@j0 final Runnable runnable, final long n) {
        super.scheduleSelf(runnable, n);
        this.d.scheduleSelf(runnable, n);
    }
    
    public void setAlpha(final int alpha) {
        this.d.setAlpha(alpha);
    }
    
    public void setBounds(final int n, final int n2, final int n3, final int n4) {
        super.setBounds(n, n2, n3, n4);
        this.c.set((float)n, (float)n2, (float)n3, (float)n4);
        this.a();
    }
    
    public void setBounds(@j0 final Rect bounds) {
        super.setBounds(bounds);
        this.c.set(bounds);
        this.a();
    }
    
    public void setChangingConfigurations(final int changingConfigurations) {
        this.d.setChangingConfigurations(changingConfigurations);
    }
    
    public void setColorFilter(final int n, @j0 final PorterDuff$Mode porterDuff$Mode) {
        this.d.setColorFilter(n, porterDuff$Mode);
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
    
    @Deprecated
    public void setDither(final boolean dither) {
        this.d.setDither(dither);
    }
    
    public void setFilterBitmap(final boolean filterBitmap) {
        this.d.setFilterBitmap(filterBitmap);
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        return this.d.setVisible(b, b2);
    }
    
    public void unscheduleSelf(@j0 final Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.d.unscheduleSelf(runnable);
    }
    
    static final class a extends Drawable$ConstantState
    {
        private final Drawable$ConstantState a;
        final int b;
        final int c;
        
        a(final Drawable$ConstantState a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        a(final a a) {
            this(a.a, a.b, a.c);
        }
        
        public int getChangingConfigurations() {
            return 0;
        }
        
        @j0
        public Drawable newDrawable() {
            return new i(this, this.a.newDrawable());
        }
        
        @j0
        public Drawable newDrawable(final Resources resources) {
            return new i(this, this.a.newDrawable(resources));
        }
    }
}
