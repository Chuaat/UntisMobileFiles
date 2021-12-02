// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import java.util.Collection;
import androidx.annotation.p0;
import android.graphics.Path$Op;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.graphics.Path;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f\u001a\u0015\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f¨\u0006\f" }, d2 = { "Landroid/graphics/Path;", "", "error", "", "Landroidx/core/graphics/p;", "b", "p", "f", "d", "e", "a", "g", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class n
{
    @p0(19)
    @e
    public static final Path a(@e final Path path, @e final Path path2) {
        k0.p((Object)path, "<this>");
        k0.p((Object)path2, "p");
        final Path path3 = new Path();
        path3.op(path, path2, Path$Op.INTERSECT);
        return path3;
    }
    
    @p0(26)
    @e
    public static final Iterable<p> b(@e final Path path, final float n) {
        k0.p((Object)path, "<this>");
        final Collection<p> b = q.b(path, n);
        k0.o((Object)b, "flatten(this, error)");
        return b;
    }
    
    @p0(19)
    @e
    public static final Path d(@e Path path, @e final Path path2) {
        k0.p((Object)path, "<this>");
        k0.p((Object)path2, "p");
        path = new Path(path);
        path.op(path2, Path$Op.DIFFERENCE);
        return path;
    }
    
    @p0(19)
    @e
    public static final Path e(@e Path path, @e final Path path2) {
        k0.p((Object)path, "<this>");
        k0.p((Object)path2, "p");
        path = new Path(path);
        path.op(path2, Path$Op.UNION);
        return path;
    }
    
    @p0(19)
    @e
    public static final Path f(@e Path path, @e final Path path2) {
        k0.p((Object)path, "<this>");
        k0.p((Object)path2, "p");
        path = new Path(path);
        path.op(path2, Path$Op.UNION);
        return path;
    }
    
    @p0(19)
    @e
    public static final Path g(@e Path path, @e final Path path2) {
        k0.p((Object)path, "<this>");
        k0.p((Object)path2, "p");
        path = new Path(path);
        path.op(path2, Path$Op.XOR);
        return path;
    }
}
