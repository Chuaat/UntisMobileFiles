// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import o6.a;
import java.util.Iterator;
import android.graphics.RegionIterator;
import kotlin.j2;
import n6.l;
import android.graphics.Point;
import android.graphics.Region$Op;
import kotlin.jvm.internal.k0;
import android.graphics.Rect;
import org.jetbrains.annotations.e;
import android.graphics.Region;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\n\u001a\r\u0010\u000b\u001a\u00020\u0000*\u00020\u0000H\u0086\n\u001a\r\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\f\u001a\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\f\u001a\u0015\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\f\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\f\u001a\u0015\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\f\u001a\u0015\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\f\u001a3\u0010\u0019\u001a\u00020\u0017*\u00020\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0013H\u0086\b\u00f8\u0001\u0000\u001a\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a*\u00020\u0000H\u0086\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c" }, d2 = { "Landroid/graphics/Region;", "Landroid/graphics/Point;", "p", "", "c", "Landroid/graphics/Rect;", "r", "k", "l", "f", "g", "m", "h", "i", "j", "a", "b", "n", "o", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "rect", "Lkotlin/j2;", "action", "d", "", "e", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class v
{
    @e
    public static final Region a(@e Region region, @e final Rect rect) {
        k0.p((Object)region, "<this>");
        k0.p((Object)rect, "r");
        region = new Region(region);
        region.op(rect, Region$Op.INTERSECT);
        return region;
    }
    
    @e
    public static final Region b(@e Region region, @e final Region region2) {
        k0.p((Object)region, "<this>");
        k0.p((Object)region2, "r");
        region = new Region(region);
        region.op(region2, Region$Op.INTERSECT);
        return region;
    }
    
    public static final boolean c(@e final Region region, @e final Point point) {
        k0.p((Object)region, "<this>");
        k0.p((Object)point, "p");
        return region.contains(point.x, point.y);
    }
    
    public static final void d(@e final Region region, @e final l<? super Rect, j2> l) {
        k0.p((Object)region, "<this>");
        k0.p((Object)l, "action");
        final RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            final Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                break;
            }
            l.invoke((Object)rect);
        }
    }
    
    @e
    public static final Iterator<Rect> e(@e final Region region) {
        k0.p((Object)region, "<this>");
        return new Iterator<Rect>() {
            @e
            private final RegionIterator G;
            @e
            private final Rect H;
            private boolean I;
            
            {
                final RegionIterator g = new RegionIterator(j);
                this.G = g;
                final Rect h = new Rect();
                this.H = h;
                this.I = g.next(h);
            }
            
            @e
            public Rect a() {
                if (this.I) {
                    final Rect rect = new Rect(this.H);
                    this.I = this.G.next(this.H);
                    return rect;
                }
                throw new IndexOutOfBoundsException();
            }
            
            @Override
            public boolean hasNext() {
                return this.I;
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
    
    @e
    public static final Region f(@e Region region, @e final Rect rect) {
        k0.p((Object)region, "<this>");
        k0.p((Object)rect, "r");
        region = new Region(region);
        region.op(rect, Region$Op.DIFFERENCE);
        return region;
    }
    
    @e
    public static final Region g(@e Region region, @e final Region region2) {
        k0.p((Object)region, "<this>");
        k0.p((Object)region2, "r");
        region = new Region(region);
        region.op(region2, Region$Op.DIFFERENCE);
        return region;
    }
    
    @e
    public static final Region h(@e final Region region) {
        k0.p((Object)region, "<this>");
        final Region region2 = new Region(region.getBounds());
        region2.op(region, Region$Op.DIFFERENCE);
        return region2;
    }
    
    @e
    public static final Region i(@e Region region, @e final Rect rect) {
        k0.p((Object)region, "<this>");
        k0.p((Object)rect, "r");
        region = new Region(region);
        region.union(rect);
        return region;
    }
    
    @e
    public static final Region j(@e Region region, @e final Region region2) {
        k0.p((Object)region, "<this>");
        k0.p((Object)region2, "r");
        region = new Region(region);
        region.op(region2, Region$Op.UNION);
        return region;
    }
    
    @e
    public static final Region k(@e Region region, @e final Rect rect) {
        k0.p((Object)region, "<this>");
        k0.p((Object)rect, "r");
        region = new Region(region);
        region.union(rect);
        return region;
    }
    
    @e
    public static final Region l(@e Region region, @e final Region region2) {
        k0.p((Object)region, "<this>");
        k0.p((Object)region2, "r");
        region = new Region(region);
        region.op(region2, Region$Op.UNION);
        return region;
    }
    
    @e
    public static final Region m(@e final Region region) {
        k0.p((Object)region, "<this>");
        final Region region2 = new Region(region.getBounds());
        region2.op(region, Region$Op.DIFFERENCE);
        return region2;
    }
    
    @e
    public static final Region n(@e Region region, @e final Rect rect) {
        k0.p((Object)region, "<this>");
        k0.p((Object)rect, "r");
        region = new Region(region);
        region.op(rect, Region$Op.XOR);
        return region;
    }
    
    @e
    public static final Region o(@e Region region, @e final Region region2) {
        k0.p((Object)region, "<this>");
        k0.p((Object)region2, "r");
        region = new Region(region);
        region.op(region2, Region$Op.XOR);
        return region;
    }
}
