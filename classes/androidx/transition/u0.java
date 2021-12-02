// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.animation.Animator;
import androidx.annotation.j0;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import android.animation.LayoutTransition;

class u0
{
    private static final String a = "ViewGroupUtilsApi14";
    private static final int b = 4;
    private static LayoutTransition c;
    private static Field d;
    private static boolean e;
    private static Method f;
    private static boolean g;
    
    private u0() {
    }
    
    private static void a(final LayoutTransition obj) {
        if (!u0.g) {
            try {
                (u0.f = LayoutTransition.class.getDeclaredMethod("cancel", (Class<?>[])new Class[0])).setAccessible(true);
            }
            catch (NoSuchMethodException ex) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            u0.g = true;
        }
        final Method f = u0.f;
        if (f != null) {
            try {
                f.invoke(obj, new Object[0]);
            }
            catch (InvocationTargetException ex2) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
            catch (IllegalAccessException ex3) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
        }
    }
    
    static void b(@j0 final ViewGroup viewGroup, boolean boolean1) {
        final LayoutTransition c = u0.c;
        final boolean b = false;
        final boolean b2 = false;
        if (c == null) {
            (u0.c = new LayoutTransition() {
                public boolean isChangingLayout() {
                    return true;
                }
            }).setAnimator(2, (Animator)null);
            u0.c.setAnimator(0, (Animator)null);
            u0.c.setAnimator(1, (Animator)null);
            u0.c.setAnimator(3, (Animator)null);
            u0.c.setAnimator(4, (Animator)null);
        }
        if (boolean1) {
            final LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    a(layoutTransition);
                }
                if (layoutTransition != u0.c) {
                    viewGroup.setTag(a0.g.S1, (Object)layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(u0.c);
            return;
        }
        viewGroup.setLayoutTransition((LayoutTransition)null);
        if (!u0.e) {
            try {
                (u0.d = ViewGroup.class.getDeclaredField("mLayoutSuppressed")).setAccessible(true);
            }
            catch (NoSuchFieldException ex) {
                Log.i("ViewGroupUtilsApi14", "Failed to access mLayoutSuppressed field by reflection");
            }
            u0.e = true;
        }
        final Field d = u0.d;
        boolean1 = b;
        Label_0191: {
            if (d == null) {
                break Label_0191;
            }
            while (true) {
                try {
                    boolean1 = d.getBoolean(viewGroup);
                    if (boolean1) {
                        try {
                            u0.d.setBoolean(viewGroup, false);
                        }
                        catch (IllegalAccessException ex2) {
                            break Label_0194;
                        }
                        break Label_0191;
                        Log.i("ViewGroupUtilsApi14", "Failed to get mLayoutSuppressed field by reflection");
                    }
                    if (boolean1) {
                        viewGroup.requestLayout();
                    }
                    final int s1 = a0.g.S1;
                    final LayoutTransition layoutTransition2 = (LayoutTransition)viewGroup.getTag(s1);
                    if (layoutTransition2 != null) {
                        viewGroup.setTag(s1, (Object)null);
                        viewGroup.setLayoutTransition(layoutTransition2);
                    }
                }
                catch (IllegalAccessException ex3) {
                    boolean1 = b2;
                    continue;
                }
                break;
            }
        }
    }
}
