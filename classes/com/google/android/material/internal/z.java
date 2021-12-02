// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import androidx.annotation.j0;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.p0;

@p0(18)
class z implements a0
{
    private final ViewOverlay a;
    
    z(@j0 final View view) {
        this.a = view.getOverlay();
    }
    
    @Override
    public void a(@j0 final Drawable drawable) {
        this.a.add(drawable);
    }
    
    @Override
    public void b(@j0 final Drawable drawable) {
        this.a.remove(drawable);
    }
}
