// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.Path;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import android.graphics.Canvas;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001a=\u0010\t\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001aG\u0010\r\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001aQ\u0010\u000e\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001a=\u0010\u000f\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001a3\u0010\u0012\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001a1\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001a1\u0010\u0017\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00162\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001aI\u0010\u001d\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001aI\u0010\u001e\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u001a1\u0010!\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\"" }, d2 = { "Landroid/graphics/Canvas;", "Lkotlin/Function1;", "Lkotlin/j2;", "Lkotlin/s;", "block", "j", "", "x", "y", "o", "degrees", "pivotX", "pivotY", "h", "k", "m", "Landroid/graphics/Matrix;", "matrix", "f", "Landroid/graphics/Rect;", "clipRect", "d", "Landroid/graphics/RectF;", "e", "", "left", "top", "right", "bottom", "b", "a", "Landroid/graphics/Path;", "clipPath", "c", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class f
{
    public static final void a(@e final Canvas canvas, final float n, final float n2, final float n3, final float n4, @e final l<? super Canvas, j2> l) {
        k0.p((Object)canvas, "<this>");
        k0.p((Object)l, "block");
        final int save = canvas.save();
        canvas.clipRect(n, n2, n3, n4);
        try {
            l.invoke((Object)canvas);
        }
        finally {
            h0.d(1);
            canvas.restoreToCount(save);
            h0.c(1);
        }
    }
    
    public static final void b(@e final Canvas canvas, final int n, final int n2, final int n3, final int n4, @e final l<? super Canvas, j2> l) {
        k0.p((Object)canvas, "<this>");
        k0.p((Object)l, "block");
        final int save = canvas.save();
        canvas.clipRect(n, n2, n3, n4);
        try {
            l.invoke((Object)canvas);
        }
        finally {
            h0.d(1);
            canvas.restoreToCount(save);
            h0.c(1);
        }
    }
    
    public static final void c(@e final Canvas canvas, @e final Path path, @e final l<? super Canvas, j2> l) {
        k0.p((Object)canvas, "<this>");
        k0.p((Object)path, "clipPath");
        k0.p((Object)l, "block");
        final int save = canvas.save();
        canvas.clipPath(path);
        try {
            l.invoke((Object)canvas);
        }
        finally {
            h0.d(1);
            canvas.restoreToCount(save);
            h0.c(1);
        }
    }
    
    public static final void d(@e final Canvas canvas, @e final Rect rect, @e final l<? super Canvas, j2> l) {
        k0.p((Object)canvas, "<this>");
        k0.p((Object)rect, "clipRect");
        k0.p((Object)l, "block");
        final int save = canvas.save();
        canvas.clipRect(rect);
        try {
            l.invoke((Object)canvas);
        }
        finally {
            h0.d(1);
            canvas.restoreToCount(save);
            h0.c(1);
        }
    }
    
    public static final void e(@e final Canvas canvas, @e final RectF rectF, @e final l<? super Canvas, j2> l) {
        k0.p((Object)canvas, "<this>");
        k0.p((Object)rectF, "clipRect");
        k0.p((Object)l, "block");
        final int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            l.invoke((Object)canvas);
        }
        finally {
            h0.d(1);
            canvas.restoreToCount(save);
            h0.c(1);
        }
    }
    
    public static final void f(@e final Canvas canvas, @e final Matrix matrix, @e final l<? super Canvas, j2> l) {
        k0.p((Object)canvas, "<this>");
        k0.p((Object)matrix, "matrix");
        k0.p((Object)l, "block");
        final int save = canvas.save();
        canvas.concat(matrix);
        try {
            l.invoke((Object)canvas);
        }
        finally {
            h0.d(1);
            canvas.restoreToCount(save);
            h0.c(1);
        }
    }
    
    public static final void h(@e final Canvas canvas, final float n, final float n2, final float n3, @e final l<? super Canvas, j2> l) {
        k0.p((Object)canvas, "<this>");
        k0.p((Object)l, "block");
        final int save = canvas.save();
        canvas.rotate(n, n2, n3);
        try {
            l.invoke((Object)canvas);
        }
        finally {
            h0.d(1);
            canvas.restoreToCount(save);
            h0.c(1);
        }
    }
    
    public static final void j(@e final Canvas canvas, @e final l<? super Canvas, j2> l) {
        k0.p((Object)canvas, "<this>");
        k0.p((Object)l, "block");
        final int save = canvas.save();
        try {
            l.invoke((Object)canvas);
        }
        finally {
            h0.d(1);
            canvas.restoreToCount(save);
            h0.c(1);
        }
    }
    
    public static final void k(@e final Canvas canvas, final float n, final float n2, final float n3, final float n4, @e final l<? super Canvas, j2> l) {
        k0.p((Object)canvas, "<this>");
        k0.p((Object)l, "block");
        final int save = canvas.save();
        canvas.scale(n, n2, n3, n4);
        try {
            l.invoke((Object)canvas);
        }
        finally {
            h0.d(1);
            canvas.restoreToCount(save);
            h0.c(1);
        }
    }
    
    public static final void m(@e final Canvas canvas, final float n, final float n2, @e final l<? super Canvas, j2> l) {
        k0.p((Object)canvas, "<this>");
        k0.p((Object)l, "block");
        final int save = canvas.save();
        canvas.skew(n, n2);
        try {
            l.invoke((Object)canvas);
        }
        finally {
            h0.d(1);
            canvas.restoreToCount(save);
            h0.c(1);
        }
    }
    
    public static final void o(@e final Canvas canvas, final float n, final float n2, @e final l<? super Canvas, j2> l) {
        k0.p((Object)canvas, "<this>");
        k0.p((Object)l, "block");
        final int save = canvas.save();
        canvas.translate(n, n2);
        try {
            l.invoke((Object)canvas);
        }
        finally {
            h0.d(1);
            canvas.restoreToCount(save);
            h0.c(1);
        }
    }
}
