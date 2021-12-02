// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.images;

import com.google.android.gms.common.internal.v;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.lang.ref.WeakReference;

public final class e extends d
{
    private WeakReference<ImageManager.a> h;
    
    public e(final ImageManager.a referent, final Uri uri) {
        super(uri, 0);
        com.google.android.gms.common.internal.d.c(referent);
        this.h = new WeakReference<ImageManager.a>(referent);
    }
    
    @Override
    protected final void d(@k0 final Drawable drawable, final boolean b, final boolean b2, final boolean b3) {
        if (!b2) {
            final ImageManager.a a = this.h.get();
            if (a != null) {
                a.a(super.a.a, drawable, b3);
            }
        }
    }
    
    @Override
    public final boolean equals(@k0 final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        final ImageManager.a a = this.h.get();
        final ImageManager.a a2 = e.h.get();
        return a2 != null && a != null && v.b(a2, a) && v.b(e.a, super.a);
    }
    
    @Override
    public final int hashCode() {
        return v.c(super.a);
    }
}
