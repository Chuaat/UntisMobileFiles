// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.dialog;

import android.os.Build$VERSION;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.graphics.Rect;
import androidx.annotation.j0;
import android.app.Dialog;
import androidx.annotation.t0;
import android.view.View$OnTouchListener;

@t0({ t0.a.H })
public class a implements View$OnTouchListener
{
    @j0
    private final Dialog G;
    private final int H;
    private final int I;
    private final int J;
    
    public a(@j0 final Dialog g, @j0 final Rect rect) {
        this.G = g;
        this.H = rect.left;
        this.I = rect.top;
        this.J = ViewConfiguration.get(g.getContext()).getScaledWindowTouchSlop();
    }
    
    public boolean onTouch(@j0 final View view, @j0 final MotionEvent motionEvent) {
        final View viewById = view.findViewById(16908290);
        final int n = this.H + viewById.getLeft();
        final int width = viewById.getWidth();
        final int n2 = this.I + viewById.getTop();
        if (new RectF((float)n, (float)n2, (float)(width + n), (float)(viewById.getHeight() + n2)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        final MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build$VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            final int j = this.J;
            obtain.setLocation((float)(-j - 1), (float)(-j - 1));
        }
        view.performClick();
        return this.G.onTouchEvent(obtain);
    }
}
