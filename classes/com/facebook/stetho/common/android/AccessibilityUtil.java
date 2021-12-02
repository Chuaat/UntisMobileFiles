// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.common.android;

import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.AdapterView;
import android.widget.Spinner;
import java.util.List;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.j0;
import android.view.View;
import androidx.annotation.k0;
import androidx.core.view.accessibility.d;

public final class AccessibilityUtil
{
    private AccessibilityUtil() {
    }
    
    public static boolean hasFocusableAncestor(@k0 d b0, @k0 final View view) {
        if (b0 != null) {
            if (view != null) {
                final ViewParent k0 = j0.k0(view);
                if (!(k0 instanceof View)) {
                    return false;
                }
                b0 = d.B0();
                try {
                    j0.g1((View)k0, b0);
                    if (b0 == null) {
                        return false;
                    }
                    if (isAccessibilityFocusable(b0, (View)k0)) {
                        return true;
                    }
                    final boolean hasFocusableAncestor = hasFocusableAncestor(b0, (View)k0);
                    b0.H0();
                    return hasFocusableAncestor;
                }
                finally {
                    b0.H0();
                }
            }
        }
        return false;
    }
    
    public static boolean hasNonActionableSpeakingDescendants(@k0 d b0, @k0 View child) {
        if (b0 != null && child != null) {
            if (child instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)child;
                final int childCount = viewGroup.getChildCount();
                int i = 0;
                while (i < childCount) {
                    child = viewGroup.getChildAt(i);
                    Label_0097: {
                        if (child == null) {
                            break Label_0097;
                        }
                        b0 = d.B0();
                        try {
                            j0.g1(child, b0);
                            if (!isAccessibilityFocusable(b0, child) && isSpeakingNode(b0, child)) {
                                return true;
                            }
                            b0.H0();
                            ++i;
                            continue;
                        }
                        finally {
                            b0.H0();
                        }
                    }
                    break;
                }
            }
        }
        return false;
    }
    
    public static boolean hasText(@k0 final d d) {
        boolean b = false;
        if (d == null) {
            return false;
        }
        if (!TextUtils.isEmpty(d.T()) || !TextUtils.isEmpty(d.z())) {
            b = true;
        }
        return b;
    }
    
    public static boolean isAccessibilityFocusable(@k0 final d d, @k0 final View view) {
        boolean b2;
        final boolean b = b2 = false;
        if (d != null) {
            if (view == null) {
                b2 = b;
            }
            else {
                if (!d.A0()) {
                    return false;
                }
                if (isActionableForAccessibility(d)) {
                    return true;
                }
                b2 = b;
                if (isTopLevelScrollItem(d, view)) {
                    b2 = b;
                    if (isSpeakingNode(d, view)) {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public static boolean isActionableForAccessibility(@k0 final d d) {
        boolean b = false;
        if (d == null) {
            return false;
        }
        if (!d.i0() && !d.s0() && !d.o0()) {
            final List<d.a> n = d.n();
            if (n.contains(16) || n.contains(32) || n.contains(1)) {
                b = true;
            }
            return b;
        }
        return true;
    }
    
    public static boolean isSpeakingNode(@k0 final d d, @k0 final View view) {
        boolean b2;
        final boolean b = b2 = false;
        if (d != null) {
            if (view == null) {
                b2 = b;
            }
            else {
                if (!d.A0()) {
                    return false;
                }
                final int t = j0.T(view);
                b2 = b;
                if (t != 4) {
                    if (t == 2 && d.u() <= 0) {
                        b2 = b;
                    }
                    else {
                        if (!d.g0() && !hasText(d)) {
                            b2 = b;
                            if (!hasNonActionableSpeakingDescendants(d, view)) {
                                return b2;
                            }
                        }
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public static boolean isTopLevelScrollItem(@k0 final d d, @k0 View view) {
        boolean b = false;
        if (d == null || view == null) {
            return false;
        }
        view = (View)j0.k0(view);
        if (view == null) {
            return false;
        }
        if (d.w0()) {
            return true;
        }
        final List<d.a> n = d.n();
        if (n.contains(4096) || n.contains(8192)) {
            return true;
        }
        if (view instanceof Spinner) {
            return false;
        }
        if (view instanceof AdapterView || view instanceof ScrollView || view instanceof HorizontalScrollView) {
            b = true;
        }
        return b;
    }
}
