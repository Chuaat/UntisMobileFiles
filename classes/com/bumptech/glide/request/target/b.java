// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.k0;
import com.bumptech.glide.request.d;

@Deprecated
public abstract class b<Z> implements p<Z>
{
    private d G;
    
    @Override
    public void a() {
    }
    
    @Override
    public void e(@k0 final d g) {
        this.G = g;
    }
    
    @Override
    public void f() {
    }
    
    @Override
    public void h(@k0 final Drawable drawable) {
    }
    
    @Override
    public void k(@k0 final Drawable drawable) {
    }
    
    @k0
    @Override
    public d o() {
        return this.G;
    }
    
    @Override
    public void onDestroy() {
    }
    
    @Override
    public void p(@k0 final Drawable drawable) {
    }
}
