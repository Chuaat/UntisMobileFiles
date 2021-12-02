// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.graphics.Matrix;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a\u0015\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\n\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u001a\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005\u001a\"\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005¨\u0006\u0010" }, d2 = { "Landroid/graphics/Matrix;", "m", "e", "", "h", "", "tx", "ty", "f", "sx", "sy", "c", "degrees", "px", "py", "a", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class k
{
    @e
    public static final Matrix a(final float n, final float n2, final float n3) {
        final Matrix matrix = new Matrix();
        matrix.setRotate(n, n2, n3);
        return matrix;
    }
    
    @e
    public static final Matrix c(final float n, final float n2) {
        final Matrix matrix = new Matrix();
        matrix.setScale(n, n2);
        return matrix;
    }
    
    @e
    public static final Matrix e(@e Matrix matrix, @e final Matrix matrix2) {
        k0.p((Object)matrix, "<this>");
        k0.p((Object)matrix2, "m");
        matrix = new Matrix(matrix);
        matrix.preConcat(matrix2);
        return matrix;
    }
    
    @e
    public static final Matrix f(final float n, final float n2) {
        final Matrix matrix = new Matrix();
        matrix.setTranslate(n, n2);
        return matrix;
    }
    
    @e
    public static final float[] h(@e final Matrix matrix) {
        k0.p((Object)matrix, "<this>");
        final float[] array = new float[9];
        matrix.getValues(array);
        return array;
    }
}
