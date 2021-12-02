// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics.drawable;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import androidx.annotation.l;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import androidx.annotation.k0;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;
import android.util.Log;
import android.graphics.ColorFilter;
import android.graphics.drawable.DrawableContainer$DrawableContainerState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build$VERSION;
import android.content.res.Resources$Theme;
import androidx.annotation.j0;
import android.graphics.drawable.Drawable;
import java.lang.reflect.Method;

public final class c
{
    private static final String a = "DrawableCompat";
    private static Method b;
    private static boolean c;
    private static Method d;
    private static boolean e;
    
    private c() {
    }
    
    public static void a(@j0 final Drawable drawable, @j0 final Resources$Theme resources$Theme) {
        if (Build$VERSION.SDK_INT >= 21) {
            drawable.applyTheme(resources$Theme);
        }
    }
    
    public static boolean b(@j0 final Drawable drawable) {
        return Build$VERSION.SDK_INT >= 21 && drawable.canApplyTheme();
    }
    
    public static void c(@j0 Drawable drawable) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 23 && sdk_INT >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                drawable = ((InsetDrawable)drawable).getDrawable();
            }
            else if (drawable instanceof j) {
                drawable = ((j)drawable).b();
            }
            else {
                if (!(drawable instanceof DrawableContainer)) {
                    return;
                }
                final DrawableContainer$DrawableContainerState drawableContainer$DrawableContainerState = (DrawableContainer$DrawableContainerState)((DrawableContainer)drawable).getConstantState();
                if (drawableContainer$DrawableContainerState != null) {
                    for (int i = 0; i < drawableContainer$DrawableContainerState.getChildCount(); ++i) {
                        drawable = drawableContainer$DrawableContainerState.getChild(i);
                        if (drawable != null) {
                            c(drawable);
                        }
                    }
                }
                return;
            }
            c(drawable);
        }
        else {
            drawable.clearColorFilter();
        }
    }
    
    public static int d(@j0 final Drawable drawable) {
        if (Build$VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }
    
    public static ColorFilter e(@j0 final Drawable drawable) {
        if (Build$VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }
    
    public static int f(@j0 final Drawable obj) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 23) {
            return obj.getLayoutDirection();
        }
        if (sdk_INT >= 17) {
            if (!androidx.core.graphics.drawable.c.e) {
                try {
                    (androidx.core.graphics.drawable.c.d = Drawable.class.getDeclaredMethod("getLayoutDirection", (Class<?>[])new Class[0])).setAccessible(true);
                }
                catch (NoSuchMethodException ex) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", (Throwable)ex);
                }
                androidx.core.graphics.drawable.c.e = true;
            }
            final Method d = androidx.core.graphics.drawable.c.d;
            if (d != null) {
                try {
                    return (int)d.invoke(obj, new Object[0]);
                }
                catch (Exception ex2) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", (Throwable)ex2);
                    androidx.core.graphics.drawable.c.d = null;
                }
            }
        }
        return 0;
    }
    
    public static void g(@j0 final Drawable drawable, @j0 final Resources resources, @j0 final XmlPullParser xmlPullParser, @j0 final AttributeSet set, @k0 final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        if (Build$VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, set, resources$Theme);
        }
        else {
            drawable.inflate(resources, xmlPullParser, set);
        }
    }
    
    public static boolean h(@j0 final Drawable drawable) {
        return Build$VERSION.SDK_INT >= 19 && drawable.isAutoMirrored();
    }
    
    @Deprecated
    public static void i(@j0 final Drawable drawable) {
        drawable.jumpToCurrentState();
    }
    
    public static void j(@j0 final Drawable drawable, final boolean autoMirrored) {
        if (Build$VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(autoMirrored);
        }
    }
    
    public static void k(@j0 final Drawable drawable, final float n, final float n2) {
        if (Build$VERSION.SDK_INT >= 21) {
            drawable.setHotspot(n, n2);
        }
    }
    
    public static void l(@j0 final Drawable drawable, final int n, final int n2, final int n3, final int n4) {
        if (Build$VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(n, n2, n3, n4);
        }
    }
    
    public static boolean m(@j0 final Drawable obj, final int n) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 23) {
            return obj.setLayoutDirection(n);
        }
        if (sdk_INT >= 17) {
            if (!androidx.core.graphics.drawable.c.c) {
                try {
                    (androidx.core.graphics.drawable.c.b = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE)).setAccessible(true);
                }
                catch (NoSuchMethodException ex) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", (Throwable)ex);
                }
                androidx.core.graphics.drawable.c.c = true;
            }
            final Method b = androidx.core.graphics.drawable.c.b;
            if (b != null) {
                try {
                    b.invoke(obj, n);
                    return true;
                }
                catch (Exception ex2) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", (Throwable)ex2);
                    androidx.core.graphics.drawable.c.b = null;
                }
            }
        }
        return false;
    }
    
    public static void n(@j0 final Drawable drawable, @l final int n) {
        if (Build$VERSION.SDK_INT >= 21) {
            drawable.setTint(n);
        }
        else if (drawable instanceof i) {
            ((i)drawable).setTint(n);
        }
    }
    
    public static void o(@j0 final Drawable drawable, @k0 final ColorStateList list) {
        if (Build$VERSION.SDK_INT >= 21) {
            drawable.setTintList(list);
        }
        else if (drawable instanceof i) {
            ((i)drawable).setTintList(list);
        }
    }
    
    public static void p(@j0 final Drawable drawable, @j0 final PorterDuff$Mode porterDuff$Mode) {
        if (Build$VERSION.SDK_INT >= 21) {
            drawable.setTintMode(porterDuff$Mode);
        }
        else if (drawable instanceof i) {
            ((i)drawable).setTintMode(porterDuff$Mode);
        }
    }
    
    public static <T extends Drawable> T q(@j0 final Drawable drawable) {
        Drawable b = drawable;
        if (drawable instanceof j) {
            b = ((j)drawable).b();
        }
        return (T)b;
    }
    
    public static Drawable r(@j0 final Drawable drawable) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 23) {
            return drawable;
        }
        if (sdk_INT >= 21) {
            if (!(drawable instanceof i)) {
                return new androidx.core.graphics.drawable.l(drawable);
            }
            return drawable;
        }
        else {
            if (!(drawable instanceof i)) {
                return new k(drawable);
            }
            return drawable;
        }
    }
}
