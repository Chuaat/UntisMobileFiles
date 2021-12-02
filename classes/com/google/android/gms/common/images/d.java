// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.images;

import androidx.annotation.k0;
import com.google.android.gms.internal.base.j;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.content.Context;
import android.net.Uri;

public abstract class d
{
    final c a;
    private int b;
    protected int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    
    public d(final Uri uri, final int c) {
        this.b = 0;
        this.c = 0;
        this.d = false;
        this.e = true;
        this.f = false;
        this.g = true;
        this.a = new c(uri);
        this.c = c;
    }
    
    final void a(final Context context, final Bitmap bitmap, final boolean b) {
        com.google.android.gms.common.internal.d.c(bitmap);
        this.d((Drawable)new BitmapDrawable(context.getResources(), bitmap), b, false, true);
    }
    
    final void b(final Context context, final j j) {
        if (this.g) {
            this.d(null, false, true, false);
        }
    }
    
    final void c(final Context context, final j j, final boolean b) {
        final int c = this.c;
        Drawable drawable;
        if (c != 0) {
            drawable = context.getResources().getDrawable(c);
        }
        else {
            drawable = null;
        }
        this.d(drawable, b, false, false);
    }
    
    protected abstract void d(@k0 final Drawable p0, final boolean p1, final boolean p2, final boolean p3);
    
    protected final boolean e(final boolean b, final boolean b2) {
        return this.e && !b2 && !b;
    }
}
