// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

class x<T> extends Property<T, Float>
{
    private final Property<T, PointF> a;
    private final PathMeasure b;
    private final float c;
    private final float[] d;
    private final PointF e;
    private float f;
    
    x(final Property<T, PointF> a, final Path path) {
        super((Class)Float.class, a.getName());
        this.d = new float[2];
        this.e = new PointF();
        this.a = a;
        final PathMeasure b = new PathMeasure(path, false);
        this.b = b;
        this.c = b.getLength();
    }
    
    public Float a(final T t) {
        return this.f;
    }
    
    public void b(final T t, final Float n) {
        this.f = n;
        this.b.getPosTan(this.c * n, this.d, (float[])null);
        final PointF e = this.e;
        final float[] d = this.d;
        e.x = d[0];
        e.y = d[1];
        this.a.set((Object)t, (Object)e);
    }
}
