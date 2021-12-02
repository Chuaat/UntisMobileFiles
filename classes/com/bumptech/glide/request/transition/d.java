// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.transition;

import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

public class d implements f<Drawable>
{
    private final int a;
    private final boolean b;
    
    public d(final int a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public boolean b(final Drawable drawable, final a a) {
        Object i;
        if ((i = a.i()) == null) {
            i = new ColorDrawable(0);
        }
        final TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[] { (Drawable)i, drawable });
        transitionDrawable.setCrossFadeEnabled(this.b);
        transitionDrawable.startTransition(this.a);
        a.d((Drawable)transitionDrawable);
        return true;
    }
}
