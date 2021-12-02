// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.graphics.PorterDuff$Mode;
import java.lang.reflect.Field;
import android.graphics.Insets;
import android.util.Log;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.DrawableContainer$DrawableContainerState;
import android.graphics.drawable.ScaleDrawable;
import androidx.appcompat.graphics.drawable.c;
import androidx.core.graphics.drawable.j;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import androidx.annotation.j0;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.graphics.Rect;
import androidx.annotation.t0;
import android.annotation.SuppressLint;

@SuppressLint({ "RestrictedAPI" })
@t0({ t0.a.I })
public class b0
{
    private static final int[] a;
    private static final int[] b;
    private static final String c = "DrawableUtils";
    public static final Rect d;
    private static Class<?> e;
    private static final String f = "android.graphics.drawable.VectorDrawable";
    
    static {
        a = new int[] { 16842912 };
        b = new int[0];
        d = new Rect();
        if (Build$VERSION.SDK_INT < 18) {
            return;
        }
        try {
            b0.e = Class.forName("android.graphics.Insets");
        }
        catch (ClassNotFoundException ex) {}
    }
    
    private b0() {
    }
    
    public static boolean a(@j0 Drawable drawable) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 15 && drawable instanceof InsetDrawable) {
            return false;
        }
        if (sdk_INT < 15 && drawable instanceof GradientDrawable) {
            return false;
        }
        if (sdk_INT < 17 && drawable instanceof LayerDrawable) {
            return false;
        }
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof j) {
                drawable = ((j)drawable).b();
            }
            else if (drawable instanceof c) {
                drawable = ((c)drawable).a();
            }
            else {
                if (!(drawable instanceof ScaleDrawable)) {
                    return true;
                }
                drawable = ((ScaleDrawable)drawable).getDrawable();
            }
            return a(drawable);
        }
        final Drawable$ConstantState constantState = drawable.getConstantState();
        if (constantState instanceof DrawableContainer$DrawableContainerState) {
            final Drawable[] children = ((DrawableContainer$DrawableContainerState)constantState).getChildren();
            for (int length = children.length, i = 0; i < length; ++i) {
                if (!a(children[i])) {
                    return false;
                }
            }
        }
        return true;
    }
    
    static void b(@j0 final Drawable drawable) {
        if (Build$VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            c(drawable);
        }
    }
    
    private static void c(final Drawable drawable) {
        final int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(b0.b);
        }
        else {
            drawable.setState(b0.a);
        }
        drawable.setState(state);
    }
    
    public static Rect d(Drawable q) {
        if (Build$VERSION.SDK_INT >= 29) {
            final Insets opticalInsets = q.getOpticalInsets();
            final Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (b0.e != null) {
            try {
                q = androidx.core.graphics.drawable.c.q(q);
                final Object invoke = q.getClass().getMethod("getOpticalInsets", (Class<?>[])new Class[0]).invoke(q, new Object[0]);
                if (invoke != null) {
                    final Rect rect2 = new Rect();
                    for (final Field field : b0.e.getFields()) {
                        final String name = field.getName();
                        int n = -1;
                        switch (name.hashCode()) {
                            case 108511772: {
                                if (name.equals("right")) {
                                    n = 2;
                                    break;
                                }
                                break;
                            }
                            case 3317767: {
                                if (name.equals("left")) {
                                    n = 0;
                                    break;
                                }
                                break;
                            }
                            case 115029: {
                                if (name.equals("top")) {
                                    n = 1;
                                    break;
                                }
                                break;
                            }
                            case -1383228885: {
                                if (name.equals("bottom")) {
                                    n = 3;
                                    break;
                                }
                                break;
                            }
                        }
                        if (n != 0) {
                            if (n != 1) {
                                if (n != 2) {
                                    if (n == 3) {
                                        rect2.bottom = field.getInt(invoke);
                                    }
                                }
                                else {
                                    rect2.right = field.getInt(invoke);
                                }
                            }
                            else {
                                rect2.top = field.getInt(invoke);
                            }
                        }
                        else {
                            rect2.left = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            }
            catch (Exception ex) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return b0.d;
    }
    
    public static PorterDuff$Mode e(final int n, final PorterDuff$Mode porterDuff$Mode) {
        if (n == 3) {
            return PorterDuff$Mode.SRC_OVER;
        }
        if (n == 5) {
            return PorterDuff$Mode.SRC_IN;
        }
        if (n == 9) {
            return PorterDuff$Mode.SRC_ATOP;
        }
        switch (n) {
            default: {
                return porterDuff$Mode;
            }
            case 16: {
                return PorterDuff$Mode.ADD;
            }
            case 15: {
                return PorterDuff$Mode.SCREEN;
            }
            case 14: {
                return PorterDuff$Mode.MULTIPLY;
            }
        }
    }
}
