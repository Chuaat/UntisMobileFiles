// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.app;

import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import android.widget.ImageView;
import android.app.ActionBar;
import android.util.Log;
import android.os.Build$VERSION;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.app.Activity;

class c
{
    private static final String a = "ActionBarDrawerToggleHC";
    private static final int[] b;
    
    static {
        b = new int[] { 16843531 };
    }
    
    private c() {
    }
    
    public static Drawable a(final Activity activity) {
        final TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(c.b);
        final Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }
    
    public static a b(final a a, final Activity activity, final int i) {
        a a2 = a;
        if (a == null) {
            a2 = new a(activity);
        }
        if (a2.a != null) {
            try {
                final ActionBar actionBar = activity.getActionBar();
                a2.b.invoke(actionBar, i);
                if (Build$VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            }
            catch (Exception ex) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set content description via JB-MR2 API", (Throwable)ex);
            }
        }
        return a2;
    }
    
    public static a c(final Activity activity, final Drawable imageDrawable, final int i) {
        final a a = new a(activity);
        if (a.a != null) {
            try {
                final ActionBar actionBar = activity.getActionBar();
                a.a.invoke(actionBar, imageDrawable);
                a.b.invoke(actionBar, i);
            }
            catch (Exception ex) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator via JB-MR2 API", (Throwable)ex);
            }
        }
        else {
            final ImageView c = a.c;
            if (c != null) {
                c.setImageDrawable(imageDrawable);
            }
            else {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator");
            }
        }
        return a;
    }
    
    static class a
    {
        public Method a;
        public Method b;
        public ImageView c;
        
        a(final Activity activity) {
            try {
                this.a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            }
            catch (NoSuchMethodException ex) {
                final View viewById = activity.findViewById(16908332);
                if (viewById == null) {
                    return;
                }
                final ViewGroup viewGroup = (ViewGroup)viewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                final View child = viewGroup.getChildAt(0);
                final View child2 = viewGroup.getChildAt(1);
                Object o = child;
                if (child.getId() == 16908332) {
                    o = child2;
                }
                if (o instanceof ImageView) {
                    this.c = (ImageView)o;
                }
            }
        }
    }
}
