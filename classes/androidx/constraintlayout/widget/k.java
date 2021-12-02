// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.widget;

import android.view.ViewGroup$LayoutParams;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import androidx.constraintlayout.motion.widget.s;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

public class k extends View implements a
{
    private int G;
    private boolean H;
    private int I;
    private boolean J;
    
    public k(final Context context) {
        super(context);
        this.G = -1;
        this.H = false;
        this.I = 0;
        this.J = true;
        super.setVisibility(8);
        this.c(null);
    }
    
    public k(final Context context, final AttributeSet set) {
        super(context, set);
        this.G = -1;
        this.H = false;
        this.I = 0;
        this.J = true;
        super.setVisibility(8);
        this.c(set);
    }
    
    public k(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.G = -1;
        this.H = false;
        this.I = 0;
        this.J = true;
        super.setVisibility(8);
        this.c(set);
    }
    
    public k(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n);
        this.G = -1;
        this.H = false;
        this.I = 0;
        this.J = true;
        super.setVisibility(8);
        this.c(set);
    }
    
    private void b(final int n, final int n2, final s s, final int n3) {
        final e f0 = s.F0(n3);
        f0.d1(n2, n);
        s.p1(n3, f0);
    }
    
    private void c(final AttributeSet set) {
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, j.m.E8);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.I8) {
                    this.G = obtainStyledAttributes.getResourceId(index, this.G);
                }
                else if (index == j.m.F8) {
                    this.H = obtainStyledAttributes.getBoolean(index, this.H);
                }
                else if (index == j.m.H8) {
                    this.I = obtainStyledAttributes.getResourceId(index, this.I);
                }
                else if (index == j.m.G8) {
                    this.J = obtainStyledAttributes.getBoolean(index, this.J);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.G != -1) {
            ConstraintLayout.getSharedValues().a(this.G, (l.a)this);
        }
    }
    
    public void a(int i, final int guidelineBegin, int j) {
        this.setGuidelineBegin(guidelineBegin);
        final int id = this.getId();
        if (id <= 0) {
            return;
        }
        if (this.getParent() instanceof s) {
            final s s = (s)this.getParent();
            i = s.getCurrentState();
            j = this.I;
            if (j != 0) {
                i = j;
            }
            final boolean h = this.H;
            final int n = 0;
            j = 0;
            if (h) {
                if (this.J) {
                    for (int[] constraintSetIds = s.getConstraintSetIds(); j < constraintSetIds.length; ++j) {
                        final int n2 = constraintSetIds[j];
                        if (n2 != i) {
                            this.b(guidelineBegin, id, s, n2);
                        }
                    }
                }
                final e r0 = s.r0(i);
                r0.d1(id, guidelineBegin);
                s.q1(i, r0, 1000);
            }
            else if (this.J) {
                int[] constraintSetIds2;
                for (constraintSetIds2 = s.getConstraintSetIds(), i = n; i < constraintSetIds2.length; ++i) {
                    this.b(guidelineBegin, id, s, constraintSetIds2[i]);
                }
            }
            else {
                this.b(guidelineBegin, id, s, i);
            }
        }
    }
    
    public boolean d() {
        return this.H;
    }
    
    @SuppressLint({ "MissingSuperCall" })
    public void draw(final Canvas canvas) {
    }
    
    public int getApplyToConstraintSetId() {
        return this.I;
    }
    
    public int getAttributeId() {
        return this.G;
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(0, 0);
    }
    
    public void setAnimateChange(final boolean h) {
        this.H = h;
    }
    
    public void setApplyToConstraintSetId(final int i) {
        this.I = i;
    }
    
    public void setAttributeId(final int g) {
        final l sharedValues = ConstraintLayout.getSharedValues();
        final int g2 = this.G;
        if (g2 != -1) {
            sharedValues.e(g2, (l.a)this);
        }
        if ((this.G = g) != -1) {
            sharedValues.a(g, (l.a)this);
        }
    }
    
    public void setGuidelineBegin(final int a) {
        final ConstraintLayout.b layoutParams = (ConstraintLayout.b)this.getLayoutParams();
        layoutParams.a = a;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public void setGuidelineEnd(final int b) {
        final ConstraintLayout.b layoutParams = (ConstraintLayout.b)this.getLayoutParams();
        layoutParams.b = b;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public void setGuidelinePercent(final float c) {
        final ConstraintLayout.b layoutParams = (ConstraintLayout.b)this.getLayoutParams();
        layoutParams.c = c;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public void setVisibility(final int n) {
    }
}
