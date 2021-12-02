// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.widget;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import androidx.annotation.k0;
import android.util.Log;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import androidx.annotation.j0;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

public final class d
{
    private static final String a = "CompoundButtonCompat";
    private static Field b;
    private static boolean c;
    
    private d() {
    }
    
    @k0
    public static Drawable a(@j0 final CompoundButton obj) {
        if (Build$VERSION.SDK_INT >= 23) {
            return obj.getButtonDrawable();
        }
        if (!d.c) {
            try {
                (d.b = CompoundButton.class.getDeclaredField("mButtonDrawable")).setAccessible(true);
            }
            catch (NoSuchFieldException ex) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", (Throwable)ex);
            }
            d.c = true;
        }
        final Field b = d.b;
        if (b != null) {
            try {
                return (Drawable)b.get(obj);
            }
            catch (IllegalAccessException ex2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", (Throwable)ex2);
                d.b = null;
            }
        }
        return null;
    }
    
    @k0
    public static ColorStateList b(@j0 final CompoundButton compoundButton) {
        if (Build$VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintList();
        }
        if (compoundButton instanceof v) {
            return ((v)compoundButton).getSupportButtonTintList();
        }
        return null;
    }
    
    @k0
    public static PorterDuff$Mode c(@j0 final CompoundButton compoundButton) {
        if (Build$VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintMode();
        }
        if (compoundButton instanceof v) {
            return ((v)compoundButton).getSupportButtonTintMode();
        }
        return null;
    }
    
    public static void d(@j0 final CompoundButton compoundButton, @k0 final ColorStateList list) {
        if (Build$VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(list);
        }
        else if (compoundButton instanceof v) {
            ((v)compoundButton).setSupportButtonTintList(list);
        }
    }
    
    public static void e(@j0 final CompoundButton compoundButton, @k0 final PorterDuff$Mode porterDuff$Mode) {
        if (Build$VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(porterDuff$Mode);
        }
        else if (compoundButton instanceof v) {
            ((v)compoundButton).setSupportButtonTintMode(porterDuff$Mode);
        }
    }
}
