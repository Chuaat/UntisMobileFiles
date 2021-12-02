// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.transition;

import android.view.animation.AnimationUtils;
import android.content.Context;
import com.bumptech.glide.load.a;
import android.view.animation.Animation;

public class h<R> implements g<R>
{
    private final k.a a;
    private f<R> b;
    
    public h(final int n) {
        this(new b(n));
    }
    
    public h(final Animation animation) {
        this(new a(animation));
    }
    
    h(final k.a a) {
        this.a = a;
    }
    
    @Override
    public f<R> a(final com.bumptech.glide.load.a a, final boolean b) {
        if (a != a.K && b) {
            if (this.b == null) {
                this.b = new k<R>(this.a);
            }
            return this.b;
        }
        return e.b();
    }
    
    private static class a implements k.a
    {
        private final Animation a;
        
        a(final Animation a) {
            this.a = a;
        }
        
        @Override
        public Animation a(final Context context) {
            return this.a;
        }
    }
    
    private static class b implements k.a
    {
        private final int a;
        
        b(final int a) {
            this.a = a;
        }
        
        @Override
        public Animation a(final Context context) {
            return AnimationUtils.loadAnimation(context, this.a);
        }
    }
}
