// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.t0;
import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({ "AppCompatCustomView" })
@t0({ t0.a.H })
public class c0 extends ImageButton
{
    private int G;
    
    public c0(final Context context) {
        this(context, null);
    }
    
    public c0(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public c0(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.G = this.getVisibility();
    }
    
    public final void c(final int n, final boolean b) {
        super.setVisibility(n);
        if (b) {
            this.G = n;
        }
    }
    
    public final int getUserSetVisibility() {
        return this.G;
    }
    
    public void setVisibility(final int n) {
        this.c(n, true);
    }
}
