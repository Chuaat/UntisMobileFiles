// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.shape;

import androidx.annotation.j0;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import android.widget.ScrollView;
import android.view.View;

public class h
{
    private View a;
    private j b;
    private ScrollView c;
    private final int[] d;
    private final int[] e;
    private final ViewTreeObserver$OnScrollChangedListener f;
    
    public h(final View a, final j b, final ScrollView c) {
        this.d = new int[2];
        this.e = new int[2];
        this.f = (ViewTreeObserver$OnScrollChangedListener)new ViewTreeObserver$OnScrollChangedListener() {
            public void onScrollChanged() {
                h.this.e();
            }
        };
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void a(final ScrollView c) {
        this.c = c;
    }
    
    public void b(final j b) {
        this.b = b;
    }
    
    public void c(@j0 final ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f);
    }
    
    public void d(@j0 final ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f);
    }
    
    public void e() {
        final ScrollView c = this.c;
        if (c == null) {
            return;
        }
        if (c.getChildCount() != 0) {
            this.c.getLocationInWindow(this.d);
            this.c.getChildAt(0).getLocationInWindow(this.e);
            final int n = this.a.getTop() - this.d[1] + this.e[1];
            final int height = this.a.getHeight();
            final int height2 = this.c.getHeight();
            Label_0114: {
                j j;
                float b;
                if (n < 0) {
                    j = this.b;
                    b = n / (float)height + 1.0f;
                }
                else {
                    final int n2 = n + height;
                    if (n2 > height2) {
                        j = this.b;
                        b = 1.0f - (n2 - height2) / (float)height;
                    }
                    else {
                        if (this.b.z() != 1.0f) {
                            this.b.o0(1.0f);
                            break Label_0114;
                        }
                        return;
                    }
                }
                j.o0(Math.max(0.0f, Math.min(1.0f, b)));
            }
            this.a.invalidate();
            return;
        }
        throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
    }
}
