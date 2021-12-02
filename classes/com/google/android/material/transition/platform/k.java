// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition.platform;

import androidx.annotation.j0;
import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.p0;
import android.transition.PathMotion;

@p0(21)
public final class k extends PathMotion
{
    private static PointF a(final float n, final float n2, final float n3, final float n4) {
        if (n2 > n4) {
            return new PointF(n3, n2);
        }
        return new PointF(n, n4);
    }
    
    @j0
    public Path getPath(final float n, final float n2, final float n3, final float n4) {
        final Path path = new Path();
        path.moveTo(n, n2);
        final PointF a = a(n, n2, n3, n4);
        path.quadTo(a.x, a.y, n3, n4);
        return path;
    }
}
