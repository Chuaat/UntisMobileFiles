// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.widget;

import androidx.annotation.p0;
import android.util.Log;
import java.lang.reflect.Field;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import androidx.annotation.k0;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import androidx.annotation.j0;
import android.widget.CheckedTextView;

public final class c
{
    private static final String a = "CheckedTextViewCompat";
    
    private c() {
    }
    
    @k0
    public static Drawable a(@j0 final CheckedTextView checkedTextView) {
        if (Build$VERSION.SDK_INT >= 16) {
            return b.a(checkedTextView);
        }
        return androidx.core.widget.c.a.a(checkedTextView);
    }
    
    @k0
    public static ColorStateList b(@j0 final CheckedTextView checkedTextView) {
        if (Build$VERSION.SDK_INT >= 21) {
            return c.a(checkedTextView);
        }
        if (checkedTextView instanceof u) {
            return ((u)checkedTextView).c();
        }
        return null;
    }
    
    @k0
    public static PorterDuff$Mode c(@j0 final CheckedTextView checkedTextView) {
        if (Build$VERSION.SDK_INT >= 21) {
            return c.b(checkedTextView);
        }
        if (checkedTextView instanceof u) {
            return ((u)checkedTextView).b();
        }
        return null;
    }
    
    public static void d(@j0 final CheckedTextView checkedTextView, @k0 final ColorStateList list) {
        if (Build$VERSION.SDK_INT >= 21) {
            c.c(checkedTextView, list);
        }
        else if (checkedTextView instanceof u) {
            ((u)checkedTextView).d(list);
        }
    }
    
    public static void e(@j0 final CheckedTextView checkedTextView, @k0 final PorterDuff$Mode porterDuff$Mode) {
        if (Build$VERSION.SDK_INT >= 21) {
            c.d(checkedTextView, porterDuff$Mode);
        }
        else if (checkedTextView instanceof u) {
            ((u)checkedTextView).a(porterDuff$Mode);
        }
    }
    
    private static class a
    {
        private static Field a;
        private static boolean b;
        
        @k0
        static Drawable a(@j0 final CheckedTextView obj) {
            if (!androidx.core.widget.c.a.b) {
                try {
                    (androidx.core.widget.c.a.a = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable")).setAccessible(true);
                }
                catch (NoSuchFieldException ex) {
                    Log.i("CheckedTextViewCompat", "Failed to retrieve mCheckMarkDrawable field", (Throwable)ex);
                }
                androidx.core.widget.c.a.b = true;
            }
            final Field a = androidx.core.widget.c.a.a;
            if (a != null) {
                try {
                    return (Drawable)a.get(obj);
                }
                catch (IllegalAccessException ex2) {
                    Log.i("CheckedTextViewCompat", "Failed to get check mark drawable via reflection", (Throwable)ex2);
                    androidx.core.widget.c.a.a = null;
                }
            }
            return null;
        }
    }
    
    @p0(16)
    private static class b
    {
        @k0
        static Drawable a(@j0 final CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }
    
    @p0(21)
    private static class c
    {
        @k0
        static ColorStateList a(@j0 final CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }
        
        @k0
        static PorterDuff$Mode b(@j0 final CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }
        
        static void c(@j0 final CheckedTextView checkedTextView, @k0 final ColorStateList checkMarkTintList) {
            checkedTextView.setCheckMarkTintList(checkMarkTintList);
        }
        
        static void d(@j0 final CheckedTextView checkedTextView, @k0 final PorterDuff$Mode checkMarkTintMode) {
            checkedTextView.setCheckMarkTintMode(checkMarkTintMode);
        }
    }
}
