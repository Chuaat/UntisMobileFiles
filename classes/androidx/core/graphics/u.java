// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import android.graphics.PointF;
import android.graphics.Point;
import android.annotation.SuppressLint;
import android.graphics.Region$Op;
import android.graphics.Matrix;
import android.graphics.Region;
import android.graphics.RectF;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.graphics.Rect;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0086\n\u001a\r\u0010\t\u001a\u00020\u0007*\u00020\u0006H\u0086\n\u001a\r\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0086\n\u001a\r\u0010\u000b\u001a\u00020\u0007*\u00020\u0006H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\u000e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0011\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0012H\u0086\n\u001a\u0015\u0010\u0015\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0014H\u0086\n\u001a\u0015\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\f\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0019\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\n\u001a\u0015\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0012H\u0086\n\u001a\u0015\u0010\u001b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0014H\u0086\n\u001a\u0015\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u001e\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u001f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0007H\u0086\n\u001a\u0015\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\f\u001a\u0015\u0010!\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0086\f\u001a\u0015\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0087\f\u001a\u0015\u0010#\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0087\f\u001a\u0015\u0010$\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\f\u001a\u0015\u0010%\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0086\f\u001a\u0015\u0010'\u001a\u00020&*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0012H\u0086\n\u001a\u0015\u0010(\u001a\u00020&*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0014H\u0086\n\u001a\r\u0010)\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a\r\u0010*\u001a\u00020\u0000*\u00020\u0006H\u0086\b\u001a\r\u0010+\u001a\u00020\u0016*\u00020\u0000H\u0086\b\u001a\r\u0010,\u001a\u00020\u0016*\u00020\u0006H\u0086\b\u001a\u0015\u0010.\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0018\u001a\u00020-H\u0086\b¨\u0006/" }, d2 = { "Landroid/graphics/Rect;", "", "d", "f", "h", "j", "Landroid/graphics/RectF;", "", "c", "e", "g", "i", "r", "w", "z", "xy", "u", "x", "Landroid/graphics/Point;", "v", "Landroid/graphics/PointF;", "y", "Landroid/graphics/Region;", "q", "m", "o", "n", "p", "factor", "A", "C", "B", "s", "t", "a", "b", "I", "J", "", "k", "l", "E", "D", "F", "G", "Landroid/graphics/Matrix;", "H", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class u
{
    @e
    public static final Rect A(@e Rect rect, final int n) {
        k0.p((Object)rect, "<this>");
        rect = new Rect(rect);
        rect.top *= n;
        rect.left *= n;
        rect.right *= n;
        rect.bottom *= n;
        return rect;
    }
    
    @e
    public static final RectF B(@e RectF rectF, final float n) {
        k0.p((Object)rectF, "<this>");
        rectF = new RectF(rectF);
        rectF.top *= n;
        rectF.left *= n;
        rectF.right *= n;
        rectF.bottom *= n;
        return rectF;
    }
    
    @e
    public static final RectF C(@e RectF rectF, final int n) {
        k0.p((Object)rectF, "<this>");
        final float n2 = (float)n;
        rectF = new RectF(rectF);
        rectF.top *= n2;
        rectF.left *= n2;
        rectF.right *= n2;
        rectF.bottom *= n2;
        return rectF;
    }
    
    @e
    public static final Rect D(@e final RectF rectF) {
        k0.p((Object)rectF, "<this>");
        final Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }
    
    @e
    public static final RectF E(@e final Rect rect) {
        k0.p((Object)rect, "<this>");
        return new RectF(rect);
    }
    
    @e
    public static final Region F(@e final Rect rect) {
        k0.p((Object)rect, "<this>");
        return new Region(rect);
    }
    
    @e
    public static final Region G(@e final RectF rectF) {
        k0.p((Object)rectF, "<this>");
        final Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }
    
    @e
    public static final RectF H(@e final RectF rectF, @e final Matrix matrix) {
        k0.p((Object)rectF, "<this>");
        k0.p((Object)matrix, "m");
        matrix.mapRect(rectF);
        return rectF;
    }
    
    @e
    public static final Region I(@e final Rect rect, @e final Rect rect2) {
        k0.p((Object)rect, "<this>");
        k0.p((Object)rect2, "r");
        final Region region = new Region(rect);
        region.op(rect2, Region$Op.XOR);
        return region;
    }
    
    @e
    public static final Region J(@e final RectF rectF, @e final RectF rectF2) {
        k0.p((Object)rectF, "<this>");
        k0.p((Object)rectF2, "r");
        final Rect rect = new Rect();
        rectF.roundOut(rect);
        final Region region = new Region(rect);
        final Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region$Op.XOR);
        return region;
    }
    
    @SuppressLint({ "CheckResult" })
    @e
    public static final Rect a(@e Rect rect, @e final Rect rect2) {
        k0.p((Object)rect, "<this>");
        k0.p((Object)rect2, "r");
        rect = new Rect(rect);
        rect.intersect(rect2);
        return rect;
    }
    
    @SuppressLint({ "CheckResult" })
    @e
    public static final RectF b(@e RectF rectF, @e final RectF rectF2) {
        k0.p((Object)rectF, "<this>");
        k0.p((Object)rectF2, "r");
        rectF = new RectF(rectF);
        rectF.intersect(rectF2);
        return rectF;
    }
    
    public static final float c(@e final RectF rectF) {
        k0.p((Object)rectF, "<this>");
        return rectF.left;
    }
    
    public static final int d(@e final Rect rect) {
        k0.p((Object)rect, "<this>");
        return rect.left;
    }
    
    public static final float e(@e final RectF rectF) {
        k0.p((Object)rectF, "<this>");
        return rectF.top;
    }
    
    public static final int f(@e final Rect rect) {
        k0.p((Object)rect, "<this>");
        return rect.top;
    }
    
    public static final float g(@e final RectF rectF) {
        k0.p((Object)rectF, "<this>");
        return rectF.right;
    }
    
    public static final int h(@e final Rect rect) {
        k0.p((Object)rect, "<this>");
        return rect.right;
    }
    
    public static final float i(@e final RectF rectF) {
        k0.p((Object)rectF, "<this>");
        return rectF.bottom;
    }
    
    public static final int j(@e final Rect rect) {
        k0.p((Object)rect, "<this>");
        return rect.bottom;
    }
    
    public static final boolean k(@e final Rect rect, @e final Point point) {
        k0.p((Object)rect, "<this>");
        k0.p((Object)point, "p");
        return rect.contains(point.x, point.y);
    }
    
    public static final boolean l(@e final RectF rectF, @e final PointF pointF) {
        k0.p((Object)rectF, "<this>");
        k0.p((Object)pointF, "p");
        return rectF.contains(pointF.x, pointF.y);
    }
    
    @e
    public static final Rect m(@e Rect rect, int n) {
        k0.p((Object)rect, "<this>");
        rect = new Rect(rect);
        n = -n;
        rect.offset(n, n);
        return rect;
    }
    
    @e
    public static final Rect n(@e Rect rect, @e final Point point) {
        k0.p((Object)rect, "<this>");
        k0.p((Object)point, "xy");
        rect = new Rect(rect);
        rect.offset(-point.x, -point.y);
        return rect;
    }
    
    @e
    public static final RectF o(@e RectF rectF, float n) {
        k0.p((Object)rectF, "<this>");
        rectF = new RectF(rectF);
        n = -n;
        rectF.offset(n, n);
        return rectF;
    }
    
    @e
    public static final RectF p(@e RectF rectF, @e final PointF pointF) {
        k0.p((Object)rectF, "<this>");
        k0.p((Object)pointF, "xy");
        rectF = new RectF(rectF);
        rectF.offset(-pointF.x, -pointF.y);
        return rectF;
    }
    
    @e
    public static final Region q(@e final Rect rect, @e final Rect rect2) {
        k0.p((Object)rect, "<this>");
        k0.p((Object)rect2, "r");
        final Region region = new Region(rect);
        region.op(rect2, Region$Op.DIFFERENCE);
        return region;
    }
    
    @e
    public static final Region r(@e final RectF rectF, @e final RectF rectF2) {
        k0.p((Object)rectF, "<this>");
        k0.p((Object)rectF2, "r");
        final Rect rect = new Rect();
        rectF.roundOut(rect);
        final Region region = new Region(rect);
        final Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region$Op.DIFFERENCE);
        return region;
    }
    
    @e
    public static final Rect s(@e Rect rect, @e final Rect rect2) {
        k0.p((Object)rect, "<this>");
        k0.p((Object)rect2, "r");
        rect = new Rect(rect);
        rect.union(rect2);
        return rect;
    }
    
    @e
    public static final RectF t(@e RectF rectF, @e final RectF rectF2) {
        k0.p((Object)rectF, "<this>");
        k0.p((Object)rectF2, "r");
        rectF = new RectF(rectF);
        rectF.union(rectF2);
        return rectF;
    }
    
    @e
    public static final Rect u(@e Rect rect, final int n) {
        k0.p((Object)rect, "<this>");
        rect = new Rect(rect);
        rect.offset(n, n);
        return rect;
    }
    
    @e
    public static final Rect v(@e Rect rect, @e final Point point) {
        k0.p((Object)rect, "<this>");
        k0.p((Object)point, "xy");
        rect = new Rect(rect);
        rect.offset(point.x, point.y);
        return rect;
    }
    
    @e
    public static final Rect w(@e Rect rect, @e final Rect rect2) {
        k0.p((Object)rect, "<this>");
        k0.p((Object)rect2, "r");
        rect = new Rect(rect);
        rect.union(rect2);
        return rect;
    }
    
    @e
    public static final RectF x(@e RectF rectF, final float n) {
        k0.p((Object)rectF, "<this>");
        rectF = new RectF(rectF);
        rectF.offset(n, n);
        return rectF;
    }
    
    @e
    public static final RectF y(@e RectF rectF, @e final PointF pointF) {
        k0.p((Object)rectF, "<this>");
        k0.p((Object)pointF, "xy");
        rectF = new RectF(rectF);
        rectF.offset(pointF.x, pointF.y);
        return rectF;
    }
    
    @e
    public static final RectF z(@e RectF rectF, @e final RectF rectF2) {
        k0.p((Object)rectF, "<this>");
        k0.p((Object)rectF2, "r");
        rectF = new RectF(rectF);
        rectF.union(rectF2);
        return rectF;
    }
}
