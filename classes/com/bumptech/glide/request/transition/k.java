// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.transition;

import android.view.animation.Animation;
import android.content.Context;
import android.view.View;

public class k<R> implements f<R>
{
    private final a a;
    
    k(final a a) {
        this.a = a;
    }
    
    @Override
    public boolean a(final R r, final f.a a) {
        final View g = a.g();
        if (g != null) {
            g.clearAnimation();
            g.startAnimation(this.a.a(g.getContext()));
        }
        return false;
    }
    
    interface a
    {
        Animation a(final Context p0);
    }
}
