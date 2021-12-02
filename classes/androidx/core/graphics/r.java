// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import android.graphics.Canvas;
import n6.l;
import org.jetbrains.annotations.e;
import android.graphics.Picture;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n" }, d2 = { "Landroid/graphics/Picture;", "", "width", "height", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Lkotlin/j2;", "Lkotlin/s;", "block", "a", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class r
{
    @e
    public static final Picture a(@e final Picture picture, final int n, final int n2, @e final l<? super Canvas, j2> l) {
        k0.p((Object)picture, "<this>");
        k0.p((Object)l, "block");
        final Canvas beginRecording = picture.beginRecording(n, n2);
        k0.o((Object)beginRecording, "beginRecording(width, height)");
        try {
            l.invoke((Object)beginRecording);
            return picture;
        }
        finally {
            h0.d(1);
            picture.endRecording();
            h0.c(1);
        }
    }
}
