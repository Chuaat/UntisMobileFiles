// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.graphics.drawable.Drawable;
import com.google.android.gms.common.util.l;
import android.text.method.TransformationMethod;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import androidx.core.graphics.drawable.c;
import e2.a;
import android.graphics.Typeface;
import android.content.res.Resources;
import androidx.annotation.k0;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Button;

public final class c1 extends Button
{
    public c1(final Context context) {
        this(context, null);
    }
    
    private c1(final Context context, @k0 final AttributeSet set) {
        super(context, (AttributeSet)null, 16842824);
    }
    
    private static int a(final int i, final int n, final int n2, final int n3) {
        if (i == 0) {
            return n;
        }
        if (i == 1) {
            return n2;
        }
        if (i == 2) {
            return n3;
        }
        final StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown color scheme: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
    
    public final void b(final Resources resources, int n, final int n2) {
        this.setTypeface(Typeface.DEFAULT_BOLD);
        this.setTextSize(14.0f);
        final int n3 = (int)(resources.getDisplayMetrics().density * 48.0f + 0.5f);
        this.setMinHeight(n3);
        this.setMinWidth(n3);
        final int b = a.c.b;
        final int g = a.c.g;
        int a = a(n2, b, g, g);
        final int k = e2.a.c.k;
        final int p3 = e2.a.c.p;
        final int a2 = a(n2, k, p3, p3);
        if (n != 0 && n != 1) {
            if (n != 2) {
                final StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown button size: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
        }
        else {
            a = a2;
        }
        final Drawable r = c.r(resources.getDrawable(a));
        c.o(r, resources.getColorStateList(e2.a.b.k));
        c.p(r, PorterDuff$Mode.SRC_ATOP);
        this.setBackgroundDrawable(r);
        final int a3 = e2.a.b.a;
        final int f = e2.a.b.f;
        this.setTextColor((ColorStateList)x.k(resources.getColorStateList(a(n2, a3, f, f))));
        Label_0289: {
            if (n != 0) {
                if (n != 1) {
                    if (n == 2) {
                        this.setText((CharSequence)null);
                        break Label_0289;
                    }
                    final StringBuilder sb2 = new StringBuilder(32);
                    sb2.append("Unknown button size: ");
                    sb2.append(n);
                    throw new IllegalStateException(sb2.toString());
                }
                else {
                    n = e2.a.e.q;
                }
            }
            else {
                n = e2.a.e.p;
            }
            this.setText((CharSequence)resources.getString(n));
        }
        this.setTransformationMethod((TransformationMethod)null);
        if (l.j(this.getContext())) {
            this.setGravity(19);
        }
    }
}
