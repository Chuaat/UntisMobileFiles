// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.request.transition.b;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.transition.c;
import androidx.annotation.j0;
import com.bumptech.glide.request.transition.g;
import android.graphics.Bitmap;
import com.bumptech.glide.m;

public final class i extends m<i, Bitmap>
{
    @j0
    public static i r(@j0 final g<Bitmap> g) {
        return ((m<i, Object>)new i()).g(g);
    }
    
    @j0
    public static i s() {
        return new i().j();
    }
    
    @j0
    public static i t(final int n) {
        return new i().l(n);
    }
    
    @j0
    public static i u(@j0 final c.a a) {
        return new i().m(a);
    }
    
    @j0
    public static i v(@j0 final c c) {
        return new i().n(c);
    }
    
    @j0
    public static i w(@j0 final g<Drawable> g) {
        return new i().q(g);
    }
    
    @j0
    public i j() {
        return this.m(new c.a());
    }
    
    @j0
    public i l(final int n) {
        return this.m(new c.a(n));
    }
    
    @j0
    public i m(@j0 final c.a a) {
        return this.q(a.a());
    }
    
    @j0
    public i n(@j0 final c c) {
        return this.q(c);
    }
    
    @j0
    public i q(@j0 final g<Drawable> g) {
        return ((m<i, Object>)this).g(new b(g));
    }
}
