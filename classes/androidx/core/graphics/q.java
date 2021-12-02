// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import android.graphics.PointF;
import java.util.ArrayList;
import androidx.annotation.t;
import androidx.annotation.p0;
import java.util.Collection;
import androidx.annotation.j0;
import android.graphics.Path;

public final class q
{
    private q() {
    }
    
    @j0
    @p0(26)
    public static Collection<p> a(@j0 final Path path) {
        return b(path, 0.5f);
    }
    
    @j0
    @p0(26)
    public static Collection<p> b(@j0 final Path path, @t(from = 0.0) float n) {
        final float[] approximate = path.approximate(n);
        final int initialCapacity = approximate.length / 3;
        final ArrayList list = new ArrayList<p>(initialCapacity);
        for (int i = 1; i < initialCapacity; ++i) {
            final int n2 = i * 3;
            final int n3 = (i - 1) * 3;
            final float n4 = approximate[n2];
            final float n5 = approximate[n2 + 1];
            final float n6 = approximate[n2 + 2];
            final float n7 = approximate[n3];
            final float n8 = approximate[n3 + 1];
            n = approximate[n3 + 2];
            if (n4 != n7 && (n5 != n8 || n6 != n)) {
                list.add(new p(new PointF(n8, n), n7, new PointF(n5, n6), n4));
            }
        }
        return (Collection<p>)list;
    }
}
