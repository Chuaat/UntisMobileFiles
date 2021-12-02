// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.timepicker;

import android.view.View;
import android.content.Context;
import androidx.core.view.accessibility.d;

class a extends androidx.core.view.a
{
    private final d.a d;
    
    public a(final Context context, final int n) {
        this.d = new d.a(16, context.getString(n));
    }
    
    @Override
    public void g(final View view, final d d) {
        super.g(view, d);
        d.b(this.d);
    }
}
