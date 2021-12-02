// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.textview;

import com.google.android.material.resources.c;
import androidx.annotation.y0;
import com.google.android.material.resources.b;
import android.content.res.TypedArray;
import android.content.res.Resources$Theme;
import com.google.android.material.theme.overlay.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;

public class MaterialTextView extends AppCompatTextView
{
    public MaterialTextView(@j0 final Context context) {
        this(context, null);
    }
    
    public MaterialTextView(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 16842884);
    }
    
    public MaterialTextView(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public MaterialTextView(@j0 final Context context, @k0 final AttributeSet set, int j, final int n) {
        super(com.google.android.material.theme.overlay.a.c(context, set, j, n), set, j);
        final Context context2 = this.getContext();
        if (i(context2)) {
            final Resources$Theme theme = context2.getTheme();
            if (!l(context2, theme, set, j, n)) {
                j = j(theme, set, j, n);
                if (j != -1) {
                    this.h(theme, j);
                }
            }
        }
    }
    
    private void h(@j0 final Resources$Theme resources$Theme, int k) {
        final TypedArray obtainStyledAttributes = resources$Theme.obtainStyledAttributes(k, o2.a.o.Kl);
        k = k(this.getContext(), obtainStyledAttributes, o2.a.o.Ml, o2.a.o.Nl);
        obtainStyledAttributes.recycle();
        if (k >= 0) {
            this.setLineHeight(k);
        }
    }
    
    private static boolean i(final Context context) {
        return com.google.android.material.resources.b.b(context, o2.a.c.re, true);
    }
    
    private static int j(@j0 final Resources$Theme resources$Theme, @k0 final AttributeSet set, int resourceId, final int n) {
        final TypedArray obtainStyledAttributes = resources$Theme.obtainStyledAttributes(set, o2.a.o.Ol, resourceId, n);
        resourceId = obtainStyledAttributes.getResourceId(o2.a.o.Pl, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
    
    private static int k(@j0 final Context context, @j0 final TypedArray typedArray, @j0 @y0 final int... array) {
        int n;
        int c;
        for (n = 0, c = -1; n < array.length && c < 0; c = com.google.android.material.resources.c.c(context, typedArray, array[n], -1), ++n) {}
        return c;
    }
    
    private static boolean l(@j0 final Context context, @j0 final Resources$Theme resources$Theme, @k0 final AttributeSet set, int n, final int n2) {
        final TypedArray obtainStyledAttributes = resources$Theme.obtainStyledAttributes(set, o2.a.o.Ol, n, n2);
        n = o2.a.o.Ql;
        boolean b = false;
        n = k(context, obtainStyledAttributes, n, o2.a.o.Rl);
        obtainStyledAttributes.recycle();
        if (n != -1) {
            b = true;
        }
        return b;
    }
    
    @Override
    public void setTextAppearance(@j0 final Context context, final int n) {
        super.setTextAppearance(context, n);
        if (i(context)) {
            this.h(context.getTheme(), n);
        }
    }
}
