// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import androidx.annotation.k0;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class b
{
    @k0
    public static Activity a(Context baseContext) {
        while (baseContext instanceof ContextWrapper) {
            if (baseContext instanceof Activity) {
                return (Activity)baseContext;
            }
            baseContext = ((ContextWrapper)baseContext).getBaseContext();
        }
        return null;
    }
}
