// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition;

import androidx.annotation.j0;
import android.graphics.Path;
import android.graphics.PointF;
import androidx.transition.w;

public final class k extends w
{
    private static PointF b(final float n, final float n2, final float n3, final float n4) {
        if (n2 > n4) {
            return new PointF(n3, n2);
        }
        return new PointF(n, n4);
    }
    
    @j0
    @Override
    public Path a(final float n, final float n2, final float n3, final float n4) {
        final Path path = new Path();
        path.moveTo(n, n2);
        final PointF b = b(n, n2, n3, n4);
        path.quadTo(b.x, b.y, n3, n4);
        return path;
    }
}
