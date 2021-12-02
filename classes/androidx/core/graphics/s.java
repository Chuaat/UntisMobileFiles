// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import android.graphics.Point;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.graphics.PointF;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0086\n\u001a\r\u0010\u0007\u001a\u00020\u0005*\u00020\u0004H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\n\u001a\r\u0010\u0012\u001a\u00020\u0000*\u00020\u0000H\u0086\n\u001a\r\u0010\b\u001a\u00020\u0004*\u00020\u0004H\u0086\n\u001a\r\u0010\u0013\u001a\u00020\u0004*\u00020\u0000H\u0086\b\u001a\r\u0010\u0014\u001a\u00020\u0000*\u00020\u0004H\u0086\b¨\u0006\u0015" }, d2 = { "Landroid/graphics/Point;", "", "b", "d", "Landroid/graphics/PointF;", "", "a", "c", "p", "j", "l", "xy", "i", "k", "f", "h", "e", "g", "o", "n", "m", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class s
{
    public static final float a(@e final PointF pointF) {
        k0.p((Object)pointF, "<this>");
        return pointF.x;
    }
    
    public static final int b(@e final Point point) {
        k0.p((Object)point, "<this>");
        return point.x;
    }
    
    public static final float c(@e final PointF pointF) {
        k0.p((Object)pointF, "<this>");
        return pointF.y;
    }
    
    public static final int d(@e final Point point) {
        k0.p((Object)point, "<this>");
        return point.y;
    }
    
    @e
    public static final Point e(@e Point point, int n) {
        k0.p((Object)point, "<this>");
        point = new Point(point.x, point.y);
        n = -n;
        point.offset(n, n);
        return point;
    }
    
    @e
    public static final Point f(@e Point point, @e final Point point2) {
        k0.p((Object)point, "<this>");
        k0.p((Object)point2, "p");
        point = new Point(point.x, point.y);
        point.offset(-point2.x, -point2.y);
        return point;
    }
    
    @e
    public static final PointF g(@e PointF pointF, float n) {
        k0.p((Object)pointF, "<this>");
        pointF = new PointF(pointF.x, pointF.y);
        n = -n;
        pointF.offset(n, n);
        return pointF;
    }
    
    @e
    public static final PointF h(@e PointF pointF, @e final PointF pointF2) {
        k0.p((Object)pointF, "<this>");
        k0.p((Object)pointF2, "p");
        pointF = new PointF(pointF.x, pointF.y);
        pointF.offset(-pointF2.x, -pointF2.y);
        return pointF;
    }
    
    @e
    public static final Point i(@e Point point, final int n) {
        k0.p((Object)point, "<this>");
        point = new Point(point.x, point.y);
        point.offset(n, n);
        return point;
    }
    
    @e
    public static final Point j(@e Point point, @e final Point point2) {
        k0.p((Object)point, "<this>");
        k0.p((Object)point2, "p");
        point = new Point(point.x, point.y);
        point.offset(point2.x, point2.y);
        return point;
    }
    
    @e
    public static final PointF k(@e PointF pointF, final float n) {
        k0.p((Object)pointF, "<this>");
        pointF = new PointF(pointF.x, pointF.y);
        pointF.offset(n, n);
        return pointF;
    }
    
    @e
    public static final PointF l(@e PointF pointF, @e final PointF pointF2) {
        k0.p((Object)pointF, "<this>");
        k0.p((Object)pointF2, "p");
        pointF = new PointF(pointF.x, pointF.y);
        pointF.offset(pointF2.x, pointF2.y);
        return pointF;
    }
    
    @e
    public static final Point m(@e final PointF pointF) {
        k0.p((Object)pointF, "<this>");
        return new Point((int)pointF.x, (int)pointF.y);
    }
    
    @e
    public static final PointF n(@e final Point point) {
        k0.p((Object)point, "<this>");
        return new PointF(point);
    }
    
    @e
    public static final Point o(@e final Point point) {
        k0.p((Object)point, "<this>");
        return new Point(-point.x, -point.y);
    }
    
    @e
    public static final PointF p(@e final PointF pointF) {
        k0.p((Object)pointF, "<this>");
        return new PointF(-pointF.x, -pointF.y);
    }
}
