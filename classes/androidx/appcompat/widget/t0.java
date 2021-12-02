// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.content.res.Resources$NotFoundException;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import androidx.annotation.j0;
import android.content.Context;
import java.lang.ref.WeakReference;

class t0 extends k0
{
    private final WeakReference<Context> b;
    
    public t0(@j0 final Context referent, @j0 final Resources resources) {
        super(resources);
        this.b = new WeakReference<Context>(referent);
    }
    
    @Override
    public Drawable getDrawable(final int n) throws Resources$NotFoundException {
        final Drawable drawable = super.getDrawable(n);
        final Context context = this.b.get();
        if (drawable != null && context != null) {
            androidx.appcompat.widget.j0.h().x(context, n, drawable);
        }
        return drawable;
    }
}
