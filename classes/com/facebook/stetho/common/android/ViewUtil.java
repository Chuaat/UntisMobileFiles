// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.common.android;

import android.view.ViewParent;
import android.view.View;
import c6.h;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.Context;

final class ViewUtil
{
    private ViewUtil() {
    }
    
    @h
    private static Activity tryGetActivity(Context baseContext) {
        while (baseContext != null) {
            if (baseContext instanceof Activity) {
                return (Activity)baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
            baseContext = ((ContextWrapper)baseContext).getBaseContext();
        }
        return null;
    }
    
    @h
    static Activity tryGetActivity(final View view) {
        if (view == null) {
            return null;
        }
        final Activity tryGetActivity = tryGetActivity(view.getContext());
        if (tryGetActivity != null) {
            return tryGetActivity;
        }
        final ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return tryGetActivity((View)parent);
        }
        return null;
    }
}
