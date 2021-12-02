// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.helper.widget;

import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import androidx.constraintlayout.widget.j;
import android.annotation.SuppressLint;
import android.view.View$MeasureSpec;
import androidx.constraintlayout.core.widgets.m;
import androidx.constraintlayout.core.widgets.e;
import android.util.AttributeSet;
import android.content.Context;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.widget.n;

public class d extends n
{
    private static final String S = "Flow";
    public static final int T = 0;
    public static final int U = 1;
    public static final int V = 0;
    public static final int W = 1;
    public static final int a0 = 2;
    public static final int b0 = 0;
    public static final int c0 = 1;
    public static final int d0 = 2;
    public static final int e0 = 0;
    public static final int f0 = 1;
    public static final int g0 = 2;
    public static final int h0 = 0;
    public static final int i0 = 1;
    public static final int j0 = 2;
    public static final int k0 = 3;
    private g R;
    
    public d(final Context context) {
        super(context);
    }
    
    public d(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public d(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    @Override
    public void B(final e e, final boolean b) {
        this.R.g2(b);
    }
    
    @Override
    public void J(final m m, int mode, int size) {
        final int mode2 = View$MeasureSpec.getMode(mode);
        final int size2 = View$MeasureSpec.getSize(mode);
        mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        if (m != null) {
            m.p2(mode2, size2, mode, size);
            this.setMeasuredDimension(m.k2(), m.j2());
        }
        else {
            this.setMeasuredDimension(0, 0);
        }
    }
    
    @SuppressLint({ "WrongCall" })
    @Override
    protected void onMeasure(final int n, final int n2) {
        this.J(this.R, n, n2);
    }
    
    public void setFirstHorizontalBias(final float n) {
        this.R.c3(n);
        this.requestLayout();
    }
    
    public void setFirstHorizontalStyle(final int n) {
        this.R.d3(n);
        this.requestLayout();
    }
    
    public void setFirstVerticalBias(final float n) {
        this.R.e3(n);
        this.requestLayout();
    }
    
    public void setFirstVerticalStyle(final int n) {
        this.R.f3(n);
        this.requestLayout();
    }
    
    public void setHorizontalAlign(final int n) {
        this.R.g3(n);
        this.requestLayout();
    }
    
    public void setHorizontalBias(final float n) {
        this.R.h3(n);
        this.requestLayout();
    }
    
    public void setHorizontalGap(final int n) {
        this.R.i3(n);
        this.requestLayout();
    }
    
    public void setHorizontalStyle(final int n) {
        this.R.j3(n);
        this.requestLayout();
    }
    
    public void setMaxElementsWrap(final int n) {
        this.R.o3(n);
        this.requestLayout();
    }
    
    public void setOrientation(final int n) {
        this.R.p3(n);
        this.requestLayout();
    }
    
    public void setPadding(final int n) {
        this.R.v2(n);
        this.requestLayout();
    }
    
    public void setPaddingBottom(final int n) {
        this.R.w2(n);
        this.requestLayout();
    }
    
    public void setPaddingLeft(final int n) {
        this.R.y2(n);
        this.requestLayout();
    }
    
    public void setPaddingRight(final int n) {
        this.R.z2(n);
        this.requestLayout();
    }
    
    public void setPaddingTop(final int n) {
        this.R.B2(n);
        this.requestLayout();
    }
    
    public void setVerticalAlign(final int n) {
        this.R.q3(n);
        this.requestLayout();
    }
    
    public void setVerticalBias(final float n) {
        this.R.r3(n);
        this.requestLayout();
    }
    
    public void setVerticalGap(final int n) {
        this.R.s3(n);
        this.requestLayout();
    }
    
    public void setVerticalStyle(final int n) {
        this.R.t3(n);
        this.requestLayout();
    }
    
    public void setWrapMode(final int n) {
        this.R.u3(n);
        this.requestLayout();
    }
    
    @Override
    protected void y(final AttributeSet set) {
        super.y(set);
        this.R = new g();
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, j.m.t6);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.u6) {
                    this.R.p3(obtainStyledAttributes.getInt(index, 0));
                }
                else if (index == j.m.v6) {
                    this.R.v2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
                else if (index == j.m.M6) {
                    if (Build$VERSION.SDK_INT >= 17) {
                        this.R.A2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                    }
                }
                else if (index == j.m.N6) {
                    if (Build$VERSION.SDK_INT >= 17) {
                        this.R.x2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                    }
                }
                else if (index == j.m.w6) {
                    this.R.y2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
                else if (index == j.m.x6) {
                    this.R.B2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
                else if (index == j.m.y6) {
                    this.R.z2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
                else if (index == j.m.z6) {
                    this.R.w2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
                else if (index == j.m.w7) {
                    this.R.u3(obtainStyledAttributes.getInt(index, 0));
                }
                else if (index == j.m.m7) {
                    this.R.j3(obtainStyledAttributes.getInt(index, 0));
                }
                else if (index == j.m.v7) {
                    this.R.t3(obtainStyledAttributes.getInt(index, 0));
                }
                else if (index == j.m.g7) {
                    this.R.d3(obtainStyledAttributes.getInt(index, 0));
                }
                else if (index == j.m.o7) {
                    this.R.l3(obtainStyledAttributes.getInt(index, 0));
                }
                else if (index == j.m.i7) {
                    this.R.f3(obtainStyledAttributes.getInt(index, 0));
                }
                else if (index == j.m.q7) {
                    this.R.n3(obtainStyledAttributes.getInt(index, 0));
                }
                else if (index == j.m.k7) {
                    this.R.h3(obtainStyledAttributes.getFloat(index, 0.5f));
                }
                else if (index == j.m.f7) {
                    this.R.c3(obtainStyledAttributes.getFloat(index, 0.5f));
                }
                else if (index == j.m.n7) {
                    this.R.k3(obtainStyledAttributes.getFloat(index, 0.5f));
                }
                else if (index == j.m.h7) {
                    this.R.e3(obtainStyledAttributes.getFloat(index, 0.5f));
                }
                else if (index == j.m.p7) {
                    this.R.m3(obtainStyledAttributes.getFloat(index, 0.5f));
                }
                else if (index == j.m.t7) {
                    this.R.r3(obtainStyledAttributes.getFloat(index, 0.5f));
                }
                else if (index == j.m.j7) {
                    this.R.g3(obtainStyledAttributes.getInt(index, 2));
                }
                else if (index == j.m.s7) {
                    this.R.q3(obtainStyledAttributes.getInt(index, 2));
                }
                else if (index == j.m.l7) {
                    this.R.i3(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
                else if (index == j.m.u7) {
                    this.R.s3(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
                else if (index == j.m.r7) {
                    this.R.o3(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        super.J = this.R;
        this.I();
    }
    
    @Override
    public void z(final androidx.constraintlayout.widget.e.a a, final androidx.constraintlayout.core.widgets.j j, final ConstraintLayout.b b, final SparseArray<e> sparseArray) {
        super.z(a, j, b, sparseArray);
        if (j instanceof g) {
            final g g = (g)j;
            final int y = b.Y;
            if (y != -1) {
                g.p3(y);
            }
        }
    }
}
