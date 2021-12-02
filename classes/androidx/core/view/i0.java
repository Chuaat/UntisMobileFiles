// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.view.VelocityTracker;

@Deprecated
public final class i0
{
    private i0() {
    }
    
    @Deprecated
    public static float a(final VelocityTracker velocityTracker, final int n) {
        return velocityTracker.getXVelocity(n);
    }
    
    @Deprecated
    public static float b(final VelocityTracker velocityTracker, final int n) {
        return velocityTracker.getYVelocity(n);
    }
}
