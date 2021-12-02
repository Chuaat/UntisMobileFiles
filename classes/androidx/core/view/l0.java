// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import k.a;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.view.ViewGroup;

public final class l0
{
    public static final int a = 0;
    public static final int b = 1;
    
    private l0() {
    }
    
    public static int a(@j0 final ViewGroup viewGroup) {
        if (Build$VERSION.SDK_INT >= 18) {
            return viewGroup.getLayoutMode();
        }
        return 0;
    }
    
    public static int b(@j0 final ViewGroup viewGroup) {
        if (Build$VERSION.SDK_INT >= 21) {
            return viewGroup.getNestedScrollAxes();
        }
        if (viewGroup instanceof y) {
            return ((y)viewGroup).getNestedScrollAxes();
        }
        return 0;
    }
    
    public static boolean c(@j0 final ViewGroup viewGroup) {
        if (Build$VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        final Boolean b = (Boolean)viewGroup.getTag(k.a.e.m0);
        return (b != null && b) || viewGroup.getBackground() != null || androidx.core.view.j0.w0((View)viewGroup) != null;
    }
    
    @Deprecated
    public static boolean d(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }
    
    public static void e(@j0 final ViewGroup viewGroup, final int layoutMode) {
        if (Build$VERSION.SDK_INT >= 18) {
            viewGroup.setLayoutMode(layoutMode);
        }
    }
    
    @Deprecated
    public static void f(final ViewGroup viewGroup, final boolean motionEventSplittingEnabled) {
        viewGroup.setMotionEventSplittingEnabled(motionEventSplittingEnabled);
    }
    
    public static void g(@j0 final ViewGroup viewGroup, final boolean b) {
        if (Build$VERSION.SDK_INT >= 21) {
            viewGroup.setTransitionGroup(b);
        }
        else {
            viewGroup.setTag(k.a.e.m0, (Object)b);
        }
    }
}
