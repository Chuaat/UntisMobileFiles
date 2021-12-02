// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android;

import android.view.ViewParent;
import com.facebook.stetho.common.android.AccessibilityUtil;
import android.view.ViewGroup;
import android.widget.EditText;
import android.text.TextUtils;
import androidx.annotation.k0;
import java.util.Iterator;
import androidx.core.view.j0;
import androidx.core.view.accessibility.d;
import android.view.View;

public final class AccessibilityNodeInfoWrapper
{
    public static d createNodeInfoFromView(final View view) {
        final d b0 = d.B0();
        j0.g1(view, b0);
        return b0;
    }
    
    @k0
    public static String getActions(final View view) {
        final d nodeInfoFromView = createNodeInfoFromView(view);
        try {
            final StringBuilder sb = new StringBuilder();
            for (final d.a a : nodeInfoFromView.n()) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                final int b = a.b();
                String str = null;
                if (b != 1) {
                    if (b != 2) {
                        switch (b) {
                            default: {
                                final CharSequence c = a.c();
                                if (c != null) {
                                    sb.append(c);
                                    continue;
                                }
                                str = "unknown";
                                break;
                            }
                            case 131072: {
                                str = "set-selection";
                                break;
                            }
                            case 65536: {
                                str = "cut";
                                break;
                            }
                            case 32768: {
                                str = "paste";
                                break;
                            }
                            case 16384: {
                                str = "copy";
                                break;
                            }
                            case 8192: {
                                str = "scroll-backward";
                                break;
                            }
                            case 4096: {
                                str = "scroll-forward";
                                break;
                            }
                            case 2048: {
                                str = "previous-html-element";
                                break;
                            }
                            case 1024: {
                                str = "next-html-element";
                                break;
                            }
                            case 512: {
                                str = "previous-at-movement-granularity";
                                break;
                            }
                            case 256: {
                                str = "next-at-movement-granularity";
                                break;
                            }
                            case 128: {
                                str = "clear-accessibility-focus";
                                break;
                            }
                            case 64: {
                                str = "accessibility-focus";
                                break;
                            }
                            case 32: {
                                str = "long-click";
                                break;
                            }
                            case 16: {
                                str = "click";
                                break;
                            }
                            case 8: {
                                str = "clear-selection";
                                break;
                            }
                            case 4: {
                                str = "select";
                                break;
                            }
                        }
                    }
                    else {
                        str = "clear-focus";
                    }
                }
                else {
                    str = "focus";
                }
                sb.append(str);
            }
            String string;
            if (sb.length() > 0) {
                string = sb.toString();
            }
            else {
                string = null;
            }
            return string;
        }
        finally {
            nodeInfoFromView.H0();
        }
    }
    
    @k0
    public static CharSequence getDescription(View child) {
        final d nodeInfoFromView = createNodeInfoFromView(child);
        try {
            final CharSequence z = nodeInfoFromView.z();
            final CharSequence t = nodeInfoFromView.T();
            final boolean empty = TextUtils.isEmpty(t);
            final int n = 0;
            final boolean b = !empty;
            final boolean b2 = child instanceof EditText;
            if (!TextUtils.isEmpty(z) && (!b2 || !b)) {
                return z;
            }
            if (b) {
                return t;
            }
            final boolean b3 = child instanceof ViewGroup;
            final CharSequence charSequence = null;
            if (b3) {
                final StringBuilder sb = new StringBuilder();
                final ViewGroup viewGroup = (ViewGroup)child;
                for (int childCount = viewGroup.getChildCount(), i = n; i < childCount; ++i) {
                    child = viewGroup.getChildAt(i);
                    final d b4 = d.B0();
                    j0.g1(child, b4);
                    CharSequence description;
                    if (AccessibilityUtil.isSpeakingNode(b4, child) && !AccessibilityUtil.isAccessibilityFocusable(b4, child)) {
                        description = getDescription(child);
                    }
                    else {
                        description = null;
                    }
                    if (!TextUtils.isEmpty(description)) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(description);
                    }
                    b4.H0();
                }
                CharSequence string = charSequence;
                if (sb.length() > 0) {
                    string = sb.toString();
                }
                return string;
            }
            return null;
        }
        finally {
            nodeInfoFromView.H0();
        }
    }
    
    @k0
    public static String getFocusableReasons(final View view) {
        final d nodeInfoFromView = createNodeInfoFromView(view);
        try {
            final boolean hasText = AccessibilityUtil.hasText(nodeInfoFromView);
            final boolean g0 = nodeInfoFromView.g0();
            final boolean hasNonActionableSpeakingDescendants = AccessibilityUtil.hasNonActionableSpeakingDescendants(nodeInfoFromView, view);
            if (AccessibilityUtil.isActionableForAccessibility(nodeInfoFromView)) {
                if (nodeInfoFromView.u() <= 0) {
                    return "View is actionable and has no children.";
                }
                if (hasText) {
                    return "View is actionable and has a description.";
                }
                if (g0) {
                    return "View is actionable and checkable.";
                }
                if (hasNonActionableSpeakingDescendants) {
                    return "View is actionable and has non-actionable descendants with descriptions.";
                }
            }
            if (AccessibilityUtil.isTopLevelScrollItem(nodeInfoFromView, view)) {
                if (hasText) {
                    return "View is a direct child of a scrollable container and has a description.";
                }
                if (g0) {
                    return "View is a direct child of a scrollable container and is checkable.";
                }
                if (hasNonActionableSpeakingDescendants) {
                    return "View is a direct child of a scrollable container and has non-actionable descendants with descriptions.";
                }
            }
            if (hasText) {
                return "View has a description and is not actionable, but has no actionable ancestor.";
            }
            return null;
        }
        finally {
            nodeInfoFromView.H0();
        }
    }
    
    public static boolean getIgnored(final View view) {
        final int t = j0.T(view);
        if (t != 2) {
            if (t != 4) {
                for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
                    if (j0.T((View)viewParent) == 4) {
                        return true;
                    }
                }
                final d nodeInfoFromView = createNodeInfoFromView(view);
                try {
                    if (!nodeInfoFromView.A0()) {
                        return true;
                    }
                    if (!AccessibilityUtil.isAccessibilityFocusable(nodeInfoFromView, view)) {
                        return AccessibilityUtil.hasFocusableAncestor(nodeInfoFromView, view) || !AccessibilityUtil.hasText(nodeInfoFromView);
                    }
                    if (nodeInfoFromView.u() <= 0) {
                        return false;
                    }
                    final boolean speakingNode = AccessibilityUtil.isSpeakingNode(nodeInfoFromView, view);
                    nodeInfoFromView.H0();
                    return !speakingNode;
                }
                finally {
                    nodeInfoFromView.H0();
                }
            }
        }
        return true;
    }
    
    public static String getIgnoredReasons(final View view) {
        final int t = j0.T(view);
        if (t == 2) {
            return "View has importantForAccessibility set to 'NO'.";
        }
        if (t == 4) {
            return "View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
        }
        for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
            if (j0.T((View)viewParent) == 4) {
                return "An ancestor View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
            }
        }
        final d nodeInfoFromView = createNodeInfoFromView(view);
        try {
            if (!nodeInfoFromView.A0()) {
                return "View is not visible.";
            }
            if (AccessibilityUtil.isAccessibilityFocusable(nodeInfoFromView, view)) {
                return "View is actionable, but has no description.";
            }
            if (AccessibilityUtil.hasText(nodeInfoFromView)) {
                return "View is not actionable, and an ancestor View has co-opted its description.";
            }
            return "View is not actionable and has no description.";
        }
        finally {
            nodeInfoFromView.H0();
        }
    }
    
    public static boolean getIsAccessibilityFocused(final View view) {
        final d nodeInfoFromView = createNodeInfoFromView(view);
        final boolean f0 = nodeInfoFromView.f0();
        nodeInfoFromView.H0();
        return f0;
    }
}
