// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.helper.widget;

import android.content.res.TypedArray;
import androidx.constraintlayout.widget.j;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;

public class e extends b
{
    private static final String k0 = "Layer";
    private float P;
    private float Q;
    private float R;
    ConstraintLayout S;
    private float T;
    private float U;
    protected float V;
    protected float W;
    protected float a0;
    protected float b0;
    protected float c0;
    protected float d0;
    boolean e0;
    View[] f0;
    private float g0;
    private float h0;
    private boolean i0;
    private boolean j0;
    
    public e(final Context context) {
        super(context);
        this.P = Float.NaN;
        this.Q = Float.NaN;
        this.R = Float.NaN;
        this.T = 1.0f;
        this.U = 1.0f;
        this.V = Float.NaN;
        this.W = Float.NaN;
        this.a0 = Float.NaN;
        this.b0 = Float.NaN;
        this.c0 = Float.NaN;
        this.d0 = Float.NaN;
        this.e0 = true;
        this.f0 = null;
        this.g0 = 0.0f;
        this.h0 = 0.0f;
    }
    
    public e(final Context context, final AttributeSet set) {
        super(context, set);
        this.P = Float.NaN;
        this.Q = Float.NaN;
        this.R = Float.NaN;
        this.T = 1.0f;
        this.U = 1.0f;
        this.V = Float.NaN;
        this.W = Float.NaN;
        this.a0 = Float.NaN;
        this.b0 = Float.NaN;
        this.c0 = Float.NaN;
        this.d0 = Float.NaN;
        this.e0 = true;
        this.f0 = null;
        this.g0 = 0.0f;
        this.h0 = 0.0f;
    }
    
    public e(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.P = Float.NaN;
        this.Q = Float.NaN;
        this.R = Float.NaN;
        this.T = 1.0f;
        this.U = 1.0f;
        this.V = Float.NaN;
        this.W = Float.NaN;
        this.a0 = Float.NaN;
        this.b0 = Float.NaN;
        this.c0 = Float.NaN;
        this.d0 = Float.NaN;
        this.e0 = true;
        this.f0 = null;
        this.g0 = 0.0f;
        this.h0 = 0.0f;
    }
    
    private void K() {
        if (this.S == null) {
            return;
        }
        final int h = super.H;
        if (h == 0) {
            return;
        }
        final View[] f0 = this.f0;
        if (f0 == null || f0.length != h) {
            this.f0 = new View[h];
        }
        for (int i = 0; i < super.H; ++i) {
            this.f0[i] = this.S.n(super.G[i]);
        }
    }
    
    private void L() {
        if (this.S == null) {
            return;
        }
        if (this.f0 == null) {
            this.K();
        }
        this.J();
        double radians;
        if (Float.isNaN(this.R)) {
            radians = 0.0;
        }
        else {
            radians = Math.toRadians(this.R);
        }
        final float n = (float)Math.sin(radians);
        final float n2 = (float)Math.cos(radians);
        final float t = this.T;
        final float u = this.U;
        final float n3 = -u;
        for (int i = 0; i < super.H; ++i) {
            final View view = this.f0[i];
            final int n4 = (view.getLeft() + view.getRight()) / 2;
            final int n5 = (view.getTop() + view.getBottom()) / 2;
            final float n6 = n4 - this.V;
            final float n7 = n5 - this.W;
            final float g0 = this.g0;
            final float h0 = this.h0;
            view.setTranslationX(t * n2 * n6 + n3 * n * n7 - n6 + g0);
            view.setTranslationY(n6 * (t * n) + u * n2 * n7 - n7 + h0);
            view.setScaleY(this.U);
            view.setScaleX(this.T);
            if (!Float.isNaN(this.R)) {
                view.setRotation(this.R);
            }
        }
    }
    
    @Override
    public void D(final ConstraintLayout constraintLayout) {
        this.K();
        this.V = Float.NaN;
        this.W = Float.NaN;
        final androidx.constraintlayout.core.widgets.e b = ((ConstraintLayout.b)this.getLayoutParams()).b();
        b.W1(0);
        b.s1(0);
        this.J();
        this.layout((int)this.c0 - this.getPaddingLeft(), (int)this.d0 - this.getPaddingTop(), (int)this.a0 + this.getPaddingRight(), (int)this.b0 + this.getPaddingBottom());
        this.L();
    }
    
    @Override
    public void F(final ConstraintLayout s) {
        this.S = s;
        final float rotation = this.getRotation();
        if (rotation != 0.0f || !Float.isNaN(this.R)) {
            this.R = rotation;
        }
    }
    
    protected void J() {
        if (this.S == null) {
            return;
        }
        if (!this.e0 && !Float.isNaN(this.V) && !Float.isNaN(this.W)) {
            return;
        }
        if (!Float.isNaN(this.P) && !Float.isNaN(this.Q)) {
            this.W = this.Q;
            this.V = this.P;
        }
        else {
            final View[] w = this.w(this.S);
            int i = 0;
            int a = w[0].getLeft();
            int a2 = w[0].getTop();
            int a3 = w[0].getRight();
            int a4 = w[0].getBottom();
            while (i < super.H) {
                final View view = w[i];
                a = Math.min(a, view.getLeft());
                a2 = Math.min(a2, view.getTop());
                a3 = Math.max(a3, view.getRight());
                a4 = Math.max(a4, view.getBottom());
                ++i;
            }
            this.a0 = (float)a3;
            this.b0 = (float)a4;
            this.c0 = (float)a;
            this.d0 = (float)a2;
            float p;
            if (Float.isNaN(this.P)) {
                p = (float)((a + a3) / 2);
            }
            else {
                p = this.P;
            }
            this.V = p;
            float q;
            if (Float.isNaN(this.Q)) {
                q = (float)((a2 + a4) / 2);
            }
            else {
                q = this.Q;
            }
            this.W = q;
        }
    }
    
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = (ConstraintLayout)this.getParent();
        if (this.i0 || this.j0) {
            final int visibility = this.getVisibility();
            float elevation;
            if (Build$VERSION.SDK_INT >= 21) {
                elevation = this.getElevation();
            }
            else {
                elevation = 0.0f;
            }
            for (int i = 0; i < super.H; ++i) {
                final View n = this.S.n(super.G[i]);
                if (n != null) {
                    if (this.i0) {
                        n.setVisibility(visibility);
                    }
                    if (this.j0 && elevation > 0.0f && Build$VERSION.SDK_INT >= 21) {
                        n.setTranslationZ(n.getTranslationZ() + elevation);
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
    
    public void setPivotX(final float p) {
        this.P = p;
        this.L();
    }
    
    public void setPivotY(final float q) {
        this.Q = q;
        this.L();
    }
    
    public void setRotation(final float r) {
        this.R = r;
        this.L();
    }
    
    public void setScaleX(final float t) {
        this.T = t;
        this.L();
    }
    
    public void setScaleY(final float u) {
        this.U = u;
        this.L();
    }
    
    public void setTranslationX(final float g0) {
        this.g0 = g0;
        this.L();
    }
    
    public void setTranslationY(final float h0) {
        this.h0 = h0;
        this.L();
    }
    
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        this.p();
    }
    
    @Override
    protected void y(final AttributeSet set) {
        super.y(set);
        int i = 0;
        super.K = false;
        if (set != null) {
            TypedArray obtainStyledAttributes;
            for (obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, j.m.t6); i < obtainStyledAttributes.getIndexCount(); ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.A6) {
                    this.i0 = true;
                }
                else if (index == j.m.Q6) {
                    this.j0 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
