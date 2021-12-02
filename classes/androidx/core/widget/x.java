// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.widget;

import android.graphics.PorterDuff$Mode;
import androidx.annotation.k0;
import android.content.res.ColorStateList;
import androidx.annotation.t0;

@t0({ t0.a.I })
public interface x
{
    @k0
    ColorStateList getSupportImageTintList();
    
    @k0
    PorterDuff$Mode getSupportImageTintMode();
    
    void setSupportImageTintList(@k0 final ColorStateList p0);
    
    void setSupportImageTintMode(@k0 final PorterDuff$Mode p0);
}
