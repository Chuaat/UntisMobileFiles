// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.widget;

import android.graphics.PorterDuff$Mode;
import androidx.annotation.k0;
import android.content.res.ColorStateList;

public interface v
{
    @k0
    ColorStateList getSupportButtonTintList();
    
    @k0
    PorterDuff$Mode getSupportButtonTintMode();
    
    void setSupportButtonTintList(@k0 final ColorStateList p0);
    
    void setSupportButtonTintMode(@k0 final PorterDuff$Mode p0);
}
