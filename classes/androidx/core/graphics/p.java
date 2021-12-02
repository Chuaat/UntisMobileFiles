// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import androidx.core.util.n;
import androidx.annotation.j0;
import android.graphics.PointF;

public final class p
{
    private final PointF a;
    private final float b;
    private final PointF c;
    private final float d;
    
    public p(@j0 final PointF pointF, final float b, @j0 final PointF pointF2, final float d) {
        this.a = n.h(pointF, "start == null");
        this.b = b;
        this.c = n.h(pointF2, "end == null");
        this.d = d;
    }
    
    @j0
    public PointF a() {
        return this.c;
    }
    
    public float b() {
        return this.d;
    }
    
    @j0
    public PointF c() {
        return this.a;
    }
    
    public float d() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof p)) {
            return false;
        }
        final p p = (p)o;
        if (Float.compare(this.b, p.b) != 0 || Float.compare(this.d, p.d) != 0 || !this.a.equals((Object)p.a) || !this.c.equals((Object)p.c)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final float b = this.b;
        int floatToIntBits = 0;
        int floatToIntBits2;
        if (b != 0.0f) {
            floatToIntBits2 = Float.floatToIntBits(b);
        }
        else {
            floatToIntBits2 = 0;
        }
        final int hashCode2 = this.c.hashCode();
        final float d = this.d;
        if (d != 0.0f) {
            floatToIntBits = Float.floatToIntBits(d);
        }
        return ((hashCode * 31 + floatToIntBits2) * 31 + hashCode2) * 31 + floatToIntBits;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PathSegment{start=");
        sb.append(this.a);
        sb.append(", startFraction=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", endFraction=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}
