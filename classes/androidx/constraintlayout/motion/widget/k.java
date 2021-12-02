// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.graphics.RectF;
import java.util.HashSet;

abstract class k extends f
{
    protected static final float E = 20.0f;
    int D;
    
    k() {
        this.D = androidx.constraintlayout.motion.widget.f.f;
    }
    
    @Override
    void d(final HashSet<String> set) {
    }
    
    abstract void o(final int p0, final int p1, final float p2, final float p3, final float p4, final float p5);
    
    abstract float p();
    
    abstract float q();
    
    public abstract boolean r(final int p0, final int p1, final RectF p2, final RectF p3, final float p4, final float p5);
    
    abstract void s(final View p0, final RectF p1, final RectF p2, final float p3, final float p4, final String[] p5, final float[] p6);
}
