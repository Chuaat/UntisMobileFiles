// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.images;

import com.google.android.gms.common.internal.v;
import com.google.android.gms.internal.base.e;
import com.google.android.gms.internal.base.k;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

public final class f extends d
{
    private WeakReference<ImageView> h;
    
    public f(final ImageView referent, final int n) {
        super(Uri.EMPTY, n);
        com.google.android.gms.common.internal.d.c(referent);
        this.h = new WeakReference<ImageView>(referent);
    }
    
    public f(final ImageView referent, final Uri uri) {
        super(uri, 0);
        com.google.android.gms.common.internal.d.c(referent);
        this.h = new WeakReference<ImageView>(referent);
    }
    
    @Override
    protected final void d(@k0 final Drawable drawable, final boolean b, final boolean b2, final boolean b3) {
        final ImageView imageView = this.h.get();
        if (imageView != null) {
            int c = 0;
            final boolean b4 = !b2 && !b3;
            if (b4 && imageView instanceof k) {
                final k k = (k)imageView;
                final int a = com.google.android.gms.internal.base.k.a();
                final int c2 = super.c;
                if (c2 != 0 && a == c2) {
                    return;
                }
            }
            final boolean e = this.e(b, b2);
            Drawable imageDrawable = drawable;
            if (e) {
                final Drawable drawable2 = imageView.getDrawable();
                Drawable a2;
                if (drawable2 != null) {
                    a2 = drawable2;
                    if (drawable2 instanceof e) {
                        a2 = ((e)drawable2).a();
                    }
                }
                else {
                    a2 = null;
                }
                imageDrawable = new e(a2, drawable);
            }
            imageView.setImageDrawable(imageDrawable);
            if (imageView instanceof k) {
                final k i = (k)imageView;
                Uri uri;
                if (b3) {
                    uri = super.a.a;
                }
                else {
                    uri = Uri.EMPTY;
                }
                k.c(uri);
                if (b4) {
                    c = super.c;
                }
                k.b(c);
            }
            if (imageDrawable != null && e) {
                ((e)imageDrawable).b(250);
            }
        }
    }
    
    @Override
    public final boolean equals(@k0 final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        final ImageView imageView = this.h.get();
        final ImageView imageView2 = f.h.get();
        return imageView2 != null && imageView != null && v.b(imageView2, imageView);
    }
    
    @Override
    public final int hashCode() {
        return 0;
    }
}
