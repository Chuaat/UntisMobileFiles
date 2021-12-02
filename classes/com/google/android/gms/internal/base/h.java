// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable$ConstantState;

final class h extends Drawable$ConstantState
{
    int a;
    int b;
    
    h(@k0 final h h) {
        if (h != null) {
            this.a = h.a;
            this.b = h.b;
        }
    }
    
    public final int getChangingConfigurations() {
        return this.a;
    }
    
    public final Drawable newDrawable() {
        return new e(this);
    }
}
