// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.widget;

import android.util.AttributeSet;
import android.content.Context;

public class h extends b
{
    public h(final Context context) {
        super(context);
    }
    
    public h(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public h(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    @Override
    public void D(final ConstraintLayout constraintLayout) {
        final ConstraintLayout.b b = (ConstraintLayout.b)this.getLayoutParams();
        b.u0.W1(0);
        b.u0.s1(0);
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p();
    }
    
    @Override
    protected void r(final ConstraintLayout constraintLayout) {
        this.q(constraintLayout);
    }
    
    public void setElevation(final float elevation) {
        super.setElevation(elevation);
        this.p();
    }
    
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        this.p();
    }
    
    @Override
    protected void y(final AttributeSet set) {
        super.y(set);
        super.K = false;
    }
}
