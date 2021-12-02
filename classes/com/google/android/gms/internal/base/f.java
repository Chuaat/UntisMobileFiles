// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.base;

import androidx.annotation.k0;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

final class f extends Drawable
{
    private static final f a;
    private static final i b;
    
    static {
        a = new f();
        b = new i(null);
    }
    
    private f() {
    }
    
    public final void draw(final Canvas canvas) {
    }
    
    public final Drawable$ConstantState getConstantState() {
        return f.b;
    }
    
    public final int getOpacity() {
        return -2;
    }
    
    public final void setAlpha(final int n) {
    }
    
    public final void setColorFilter(@k0 final ColorFilter colorFilter) {
    }
}
