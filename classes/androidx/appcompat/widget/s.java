// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.view.View;
import c.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.SeekBar;

public class s extends SeekBar
{
    private final t G;
    
    public s(@j0 final Context context) {
        this(context, null);
    }
    
    public s(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, a.c.V2);
    }
    
    public s(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        p0.a((View)this, this.getContext());
        (this.G = new t(this)).c(set, n);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.G.h();
    }
    
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.G.l();
    }
    
    protected void onDraw(final Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            this.G.g(canvas);
        }
    }
}
