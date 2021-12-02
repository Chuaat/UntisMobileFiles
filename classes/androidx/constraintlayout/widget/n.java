// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewParent;
import android.os.Build$VERSION;
import androidx.constraintlayout.core.widgets.m;
import android.util.AttributeSet;
import android.content.Context;

public abstract class n extends b
{
    private boolean P;
    private boolean Q;
    
    public n(final Context context) {
        super(context);
    }
    
    public n(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public n(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public void J(final m m, final int n, final int n2) {
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.P || this.Q) {
            final ViewParent parent = this.getParent();
            if (parent instanceof ConstraintLayout) {
                final ConstraintLayout constraintLayout = (ConstraintLayout)parent;
                final int visibility = this.getVisibility();
                float elevation;
                if (Build$VERSION.SDK_INT >= 21) {
                    elevation = this.getElevation();
                }
                else {
                    elevation = 0.0f;
                }
                for (int i = 0; i < super.H; ++i) {
                    final View n = constraintLayout.n(super.G[i]);
                    if (n != null) {
                        if (this.P) {
                            n.setVisibility(visibility);
                        }
                        if (this.Q && elevation > 0.0f && Build$VERSION.SDK_INT >= 21) {
                            n.setTranslationZ(n.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
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
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, j.m.t6);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.A6) {
                    this.P = true;
                }
                else if (index == j.m.Q6) {
                    this.Q = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
