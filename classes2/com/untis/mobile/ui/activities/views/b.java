// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.views;

import androidx.core.content.d;
import android.graphics.Canvas;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.content.Context;
import androidx.annotation.j0;
import android.graphics.Paint;
import com.untis.mobile.ui.activities.help.j;
import android.view.View;

public class b extends View
{
    private j G;
    @j0
    private final Paint H;
    
    public b(@j0 final Context context, final j g) {
        super(context);
        this.G = g;
        final Paint h = new Paint(1);
        (this.H = h).setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
        h.setColor(0);
    }
    
    protected void onDraw(@j0 final Canvas canvas) {
        canvas.drawColor(0, PorterDuff$Mode.CLEAR);
        canvas.drawColor(d.f(this.getContext(), 2131099690));
        final j g = this.G;
        if (g != null) {
            g.a(canvas, this.H);
        }
    }
}
