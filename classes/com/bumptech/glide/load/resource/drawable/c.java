// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.drawable;

import androidx.annotation.j0;
import com.bumptech.glide.request.transition.g;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.m;

public final class c extends m<c, Drawable>
{
    @j0
    public static c q(@j0 final g<Drawable> g) {
        return ((m<c, Object>)new c()).g(g);
    }
    
    @j0
    public static c r() {
        return new c().j();
    }
    
    @j0
    public static c s(final int n) {
        return new c().l(n);
    }
    
    @j0
    public static c t(@j0 final com.bumptech.glide.request.transition.c.a a) {
        return new c().m(a);
    }
    
    @j0
    public static c u(@j0 final com.bumptech.glide.request.transition.c c) {
        return new c().n(c);
    }
    
    @j0
    public c j() {
        return this.m(new com.bumptech.glide.request.transition.c.a());
    }
    
    @j0
    public c l(final int n) {
        return this.m(new com.bumptech.glide.request.transition.c.a(n));
    }
    
    @j0
    public c m(@j0 final com.bumptech.glide.request.transition.c.a a) {
        return this.n(a.a());
    }
    
    @j0
    public c n(@j0 final com.bumptech.glide.request.transition.c c) {
        return ((m<c, Object>)this).g(c);
    }
}
