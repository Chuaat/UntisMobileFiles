// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.os.Build$VERSION;
import android.view.ViewGroup$MarginLayoutParams;

public final class n
{
    private n() {
    }
    
    public static int a(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final int n = 0;
        int layoutDirection;
        if (sdk_INT >= 17) {
            layoutDirection = viewGroup$MarginLayoutParams.getLayoutDirection();
        }
        else {
            layoutDirection = 0;
        }
        if (layoutDirection != 0 && layoutDirection != 1) {
            layoutDirection = n;
        }
        return layoutDirection;
    }
    
    public static int b(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
        if (Build$VERSION.SDK_INT >= 17) {
            return viewGroup$MarginLayoutParams.getMarginEnd();
        }
        return viewGroup$MarginLayoutParams.rightMargin;
    }
    
    public static int c(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
        if (Build$VERSION.SDK_INT >= 17) {
            return viewGroup$MarginLayoutParams.getMarginStart();
        }
        return viewGroup$MarginLayoutParams.leftMargin;
    }
    
    public static boolean d(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
        return Build$VERSION.SDK_INT >= 17 && viewGroup$MarginLayoutParams.isMarginRelative();
    }
    
    public static void e(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams, final int n) {
        if (Build$VERSION.SDK_INT >= 17) {
            viewGroup$MarginLayoutParams.resolveLayoutDirection(n);
        }
    }
    
    public static void f(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams, final int layoutDirection) {
        if (Build$VERSION.SDK_INT >= 17) {
            viewGroup$MarginLayoutParams.setLayoutDirection(layoutDirection);
        }
    }
    
    public static void g(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams, final int n) {
        if (Build$VERSION.SDK_INT >= 17) {
            viewGroup$MarginLayoutParams.setMarginEnd(n);
        }
        else {
            viewGroup$MarginLayoutParams.rightMargin = n;
        }
    }
    
    public static void h(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams, final int n) {
        if (Build$VERSION.SDK_INT >= 17) {
            viewGroup$MarginLayoutParams.setMarginStart(n);
        }
        else {
            viewGroup$MarginLayoutParams.leftMargin = n;
        }
    }
}
