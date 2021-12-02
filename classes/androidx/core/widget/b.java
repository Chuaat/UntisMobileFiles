// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.widget;

import androidx.annotation.j0;
import android.os.Build$VERSION;
import androidx.annotation.t0;

@t0({ t0.a.I })
public interface b
{
    @t0({ t0.a.I })
    public static final boolean a = Build$VERSION.SDK_INT >= 27;
    
    int getAutoSizeMaxTextSize();
    
    int getAutoSizeMinTextSize();
    
    int getAutoSizeStepGranularity();
    
    int[] getAutoSizeTextAvailableSizes();
    
    int getAutoSizeTextType();
    
    void setAutoSizeTextTypeUniformWithConfiguration(final int p0, final int p1, final int p2, final int p3) throws IllegalArgumentException;
    
    void setAutoSizeTextTypeUniformWithPresetSizes(@j0 final int[] p0, final int p1) throws IllegalArgumentException;
    
    void setAutoSizeTextTypeWithDefaults(final int p0);
}
