// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import android.text.TextUtils;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import android.widget.ImageButton;
import androidx.annotation.k0;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.annotation.y;
import androidx.annotation.j0;
import androidx.appcompat.widget.Toolbar;
import androidx.annotation.t0;

@t0({ t0.a.G })
public class u
{
    private u() {
    }
    
    @k0
    public static ActionMenuItemView a(@j0 final Toolbar toolbar, @y final int n) {
        final ActionMenuView b = b(toolbar);
        if (b != null) {
            for (int i = 0; i < b.getChildCount(); ++i) {
                final View child = b.getChildAt(i);
                if (child instanceof ActionMenuItemView) {
                    final ActionMenuItemView actionMenuItemView = (ActionMenuItemView)child;
                    if (actionMenuItemView.getItemData().getItemId() == n) {
                        return actionMenuItemView;
                    }
                }
            }
        }
        return null;
    }
    
    @k0
    public static ActionMenuView b(@j0 final Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); ++i) {
            final View child = toolbar.getChildAt(i);
            if (child instanceof ActionMenuView) {
                return (ActionMenuView)child;
            }
        }
        return null;
    }
    
    @k0
    public static ImageButton c(@j0 final Toolbar toolbar) {
        final Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); ++i) {
            final View child = toolbar.getChildAt(i);
            if (child instanceof ImageButton) {
                final ImageButton imageButton = (ImageButton)child;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }
    
    @k0
    public static View d(@j0 final Toolbar toolbar) {
        final ActionMenuView b = b(toolbar);
        if (b != null && b.getChildCount() > 1) {
            return b.getChildAt(0);
        }
        return null;
    }
    
    @k0
    public static TextView e(@j0 final Toolbar toolbar) {
        return f(toolbar, toolbar.getSubtitle());
    }
    
    @k0
    private static TextView f(@j0 final Toolbar toolbar, final CharSequence charSequence) {
        for (int i = 0; i < toolbar.getChildCount(); ++i) {
            final View child = toolbar.getChildAt(i);
            if (child instanceof TextView) {
                final TextView textView = (TextView)child;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }
    
    @k0
    public static TextView g(@j0 final Toolbar toolbar) {
        return f(toolbar, toolbar.getTitle());
    }
}
