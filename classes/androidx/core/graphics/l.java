// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import android.graphics.PorterDuff$Mode;
import android.graphics.BlendMode;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import androidx.annotation.k0;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.core.util.j;

public final class l
{
    private static final String a = "\udb3f\udffd";
    private static final String b = "m";
    private static final ThreadLocal<j<Rect, Rect>> c;
    
    static {
        c = new ThreadLocal<j<Rect, Rect>>();
    }
    
    private l() {
    }
    
    public static boolean a(@j0 final Paint paint, @j0 final String s) {
        if (Build$VERSION.SDK_INT >= 23) {
            return paint.hasGlyph(s);
        }
        final int length = s.length();
        if (length == 1 && Character.isWhitespace(s.charAt(0))) {
            return true;
        }
        final float measureText = paint.measureText("\udb3f\udffd");
        final float measureText2 = paint.measureText("m");
        final float measureText3 = paint.measureText(s);
        float n = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (s.codePointCount(0, s.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int n2;
            for (int i = 0; i < length; i = n2) {
                n2 = Character.charCount(s.codePointAt(i)) + i;
                n += paint.measureText(s, i, n2);
            }
            if (measureText3 >= n) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        final j<Rect, Rect> b = b();
        paint.getTextBounds("\udb3f\udffd", 0, 2, (Rect)b.a);
        paint.getTextBounds(s, 0, length, (Rect)b.b);
        return b.a.equals((Object)b.b) ^ true;
    }
    
    private static j<Rect, Rect> b() {
        final ThreadLocal<j<Rect, Rect>> c = l.c;
        j<Rect, Rect> value = c.get();
        if (value == null) {
            value = new j<Rect, Rect>(new Rect(), new Rect());
            c.set(value);
        }
        else {
            value.a.setEmpty();
            value.b.setEmpty();
        }
        return value;
    }
    
    public static boolean c(@j0 final Paint paint, @k0 final d d) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = true;
        final Xfermode xfermode = null;
        final BlendMode blendMode = null;
        if (sdk_INT >= 29) {
            BlendMode a = blendMode;
            if (d != null) {
                a = e.a(d);
            }
            paint.setBlendMode(a);
            return true;
        }
        if (d != null) {
            final PorterDuff$Mode b2 = e.b(d);
            Object xfermode2 = xfermode;
            if (b2 != null) {
                xfermode2 = new PorterDuffXfermode(b2);
            }
            paint.setXfermode((Xfermode)xfermode2);
            if (b2 == null) {
                b = false;
            }
            return b;
        }
        paint.setXfermode((Xfermode)null);
        return true;
    }
}
