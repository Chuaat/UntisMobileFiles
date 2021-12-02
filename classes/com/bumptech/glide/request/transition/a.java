// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.transition;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public abstract class a<R> implements g<R>
{
    private final g<Drawable> a;
    
    public a(final g<Drawable> a) {
        this.a = a;
    }
    
    @Override
    public f<R> a(final a a, final boolean b) {
        return new a(this.a.a(a, b));
    }
    
    protected abstract Bitmap b(final R p0);
    
    private final class a implements f<R>
    {
        private final f<Drawable> a;
        
        a(final f<Drawable> a) {
            this.a = a;
        }
        
        @Override
        public boolean a(final R r, final f.a a) {
            return this.a.a((Drawable)new BitmapDrawable(a.g().getResources(), a.this.b(r)), a);
        }
    }
}
