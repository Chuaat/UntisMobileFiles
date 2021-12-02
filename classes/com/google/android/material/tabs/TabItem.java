// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.tabs;

import androidx.appcompat.widget.u0;
import o2.a;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

public class TabItem extends View
{
    public final CharSequence G;
    public final Drawable H;
    public final int I;
    
    public TabItem(final Context context) {
        this(context, null);
    }
    
    public TabItem(final Context context, final AttributeSet set) {
        super(context, set);
        final u0 f = u0.F(context, set, a.o.Cr);
        this.G = f.x(a.o.Fr);
        this.H = f.h(a.o.Dr);
        this.I = f.u(a.o.Er, 0);
        f.I();
    }
}
