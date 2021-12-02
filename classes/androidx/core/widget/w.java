// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.widget;

import android.graphics.PorterDuff$Mode;
import androidx.annotation.k0;
import android.content.res.ColorStateList;

public interface w
{
    @k0
    ColorStateList getSupportCompoundDrawablesTintList();
    
    @k0
    PorterDuff$Mode getSupportCompoundDrawablesTintMode();
    
    void setSupportCompoundDrawablesTintList(@k0 final ColorStateList p0);
    
    void setSupportCompoundDrawablesTintMode(@k0 final PorterDuff$Mode p0);
}
