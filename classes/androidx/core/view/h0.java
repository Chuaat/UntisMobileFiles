// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.graphics.PorterDuff$Mode;
import androidx.annotation.k0;
import android.content.res.ColorStateList;

public interface h0
{
    @k0
    ColorStateList getSupportBackgroundTintList();
    
    @k0
    PorterDuff$Mode getSupportBackgroundTintMode();
    
    void setSupportBackgroundTintList(@k0 final ColorStateList p0);
    
    void setSupportBackgroundTintMode(@k0 final PorterDuff$Mode p0);
}
