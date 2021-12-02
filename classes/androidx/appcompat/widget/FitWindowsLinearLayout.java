// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.graphics.Rect;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.t0;
import android.widget.LinearLayout;

@t0({ t0.a.I })
public class FitWindowsLinearLayout extends LinearLayout implements d0
{
    private a G;
    
    public FitWindowsLinearLayout(@j0 final Context context) {
        super(context);
    }
    
    public FitWindowsLinearLayout(@j0 final Context context, @k0 final AttributeSet set) {
        super(context, set);
    }
    
    protected boolean fitSystemWindows(final Rect rect) {
        final a g = this.G;
        if (g != null) {
            g.a(rect);
        }
        return super.fitSystemWindows(rect);
    }
    
    public void setOnFitSystemWindowsListener(final a g) {
        this.G = g;
    }
}
