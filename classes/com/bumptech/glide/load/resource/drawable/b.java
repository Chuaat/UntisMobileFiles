// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.drawable;

import androidx.annotation.j0;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.gif.c;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.util.k;
import com.bumptech.glide.load.engine.r;
import com.bumptech.glide.load.engine.v;
import android.graphics.drawable.Drawable;

public abstract class b<T extends Drawable> implements v<T>, r
{
    protected final T G;
    
    public b(final T t) {
        this.G = k.d(t);
    }
    
    @Override
    public void b() {
        final Drawable g = this.G;
        Bitmap bitmap;
        if (g instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable)g).getBitmap();
        }
        else {
            if (!(g instanceof c)) {
                return;
            }
            bitmap = ((c)g).h();
        }
        bitmap.prepareToDraw();
    }
    
    @j0
    public final T c() {
        final Drawable$ConstantState constantState = this.G.getConstantState();
        if (constantState == null) {
            return this.G;
        }
        return (T)constantState.newDrawable();
    }
}
