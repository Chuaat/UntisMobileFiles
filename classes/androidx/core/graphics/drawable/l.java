// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics.drawable;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import androidx.annotation.j0;
import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build$VERSION;
import android.util.Log;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.reflect.Method;
import androidx.annotation.p0;

@p0(21)
class l extends k
{
    private static final String N = "WrappedDrawableApi21";
    private static Method O;
    
    l(final Drawable drawable) {
        super(drawable);
        this.g();
    }
    
    l(final m m, final Resources resources) {
        super(m, resources);
        this.g();
    }
    
    private void g() {
        if (l.O == null) {
            try {
                l.O = Drawable.class.getDeclaredMethod("isProjected", (Class<?>[])new Class[0]);
            }
            catch (Exception ex) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", (Throwable)ex);
            }
        }
    }
    
    @Override
    protected boolean c() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = false;
        if (sdk_INT == 21) {
            final Drawable l = super.L;
            if (!(l instanceof GradientDrawable) && !(l instanceof DrawableContainer) && !(l instanceof InsetDrawable)) {
                b = b;
                if (!(l instanceof RippleDrawable)) {
                    return b;
                }
            }
            b = true;
        }
        return b;
    }
    
    @j0
    public Rect getDirtyBounds() {
        return super.L.getDirtyBounds();
    }
    
    public void getOutline(@j0 final Outline outline) {
        super.L.getOutline(outline);
    }
    
    public boolean isProjected() {
        final Drawable l = super.L;
        if (l != null) {
            final Method o = androidx.core.graphics.drawable.l.O;
            if (o != null) {
                try {
                    return (boolean)o.invoke(l, new Object[0]);
                }
                catch (Exception ex) {
                    Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", (Throwable)ex);
                }
            }
        }
        return false;
    }
    
    public void setHotspot(final float n, final float n2) {
        super.L.setHotspot(n, n2);
    }
    
    public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        super.L.setHotspotBounds(n, n2, n3, n4);
    }
    
    @Override
    public boolean setState(@j0 final int[] state) {
        if (super.setState(state)) {
            this.invalidateSelf();
            return true;
        }
        return false;
    }
    
    @Override
    public void setTint(final int n) {
        if (this.c()) {
            super.setTint(n);
        }
        else {
            super.L.setTint(n);
        }
    }
    
    @Override
    public void setTintList(final ColorStateList list) {
        if (this.c()) {
            super.setTintList(list);
        }
        else {
            super.L.setTintList(list);
        }
    }
    
    @Override
    public void setTintMode(@j0 final PorterDuff$Mode porterDuff$Mode) {
        if (this.c()) {
            super.setTintMode(porterDuff$Mode);
        }
        else {
            super.L.setTintMode(porterDuff$Mode);
        }
    }
}
