// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import kotlin.jvm.internal.k0;
import kotlin.j2;
import android.graphics.Matrix;
import n6.l;
import org.jetbrains.annotations.e;
import android.graphics.Shader;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007" }, d2 = { "Landroid/graphics/Shader;", "Lkotlin/Function1;", "Landroid/graphics/Matrix;", "Lkotlin/j2;", "Lkotlin/s;", "block", "a", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class w
{
    public static final void a(@e final Shader shader, @e final l<? super Matrix, j2> l) {
        k0.p((Object)shader, "<this>");
        k0.p((Object)l, "block");
        final Matrix localMatrix = new Matrix();
        shader.getLocalMatrix(localMatrix);
        l.invoke((Object)localMatrix);
        shader.setLocalMatrix(localMatrix);
    }
}
