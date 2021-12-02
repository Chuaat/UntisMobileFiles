// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics.drawable;

import androidx.annotation.j0;
import android.graphics.Outline;
import android.view.Gravity;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.content.res.Resources;
import androidx.annotation.p0;

@p0(21)
class f extends g
{
    protected f(final Resources resources, final Bitmap bitmap) {
        super(resources, bitmap);
    }
    
    @Override
    void f(final int n, final int n2, final int n3, final Rect rect, final Rect rect2) {
        Gravity.apply(n, n2, n3, rect, rect2, 0);
    }
    
    public void getOutline(@j0 final Outline outline) {
        this.t();
        outline.setRoundRect(super.h, this.c());
    }
    
    @Override
    public boolean h() {
        final Bitmap a = super.a;
        return a != null && a.hasMipMap();
    }
    
    @Override
    public void o(final boolean hasMipMap) {
        final Bitmap a = super.a;
        if (a != null) {
            a.setHasMipMap(hasMipMap);
            this.invalidateSelf();
        }
    }
}
