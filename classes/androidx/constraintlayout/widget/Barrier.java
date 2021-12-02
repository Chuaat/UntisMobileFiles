// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.widget;

import androidx.constraintlayout.core.widgets.f;
import android.util.SparseArray;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import androidx.constraintlayout.core.widgets.e;
import android.util.AttributeSet;
import android.content.Context;
import androidx.constraintlayout.core.widgets.a;

public class Barrier extends b
{
    public static final int S = 0;
    public static final int T = 2;
    public static final int U = 1;
    public static final int V = 3;
    public static final int W = 5;
    public static final int a0 = 6;
    private int P;
    private int Q;
    private a R;
    
    public Barrier(final Context context) {
        super(context);
        super.setVisibility(8);
    }
    
    public Barrier(final Context context, final AttributeSet set) {
        super(context, set);
        super.setVisibility(8);
    }
    
    public Barrier(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        super.setVisibility(8);
    }
    
    private void K(final e e, int q, final boolean b) {
        this.Q = q;
        Label_0088: {
            Label_0037: {
                if (Build$VERSION.SDK_INT < 17) {
                    q = this.P;
                    if (q != 5) {
                        if (q == 6) {
                            break Label_0037;
                        }
                        break Label_0088;
                    }
                }
                else {
                    q = this.P;
                    if (b) {
                        if (q == 5) {
                            break Label_0037;
                        }
                        if (q != 6) {
                            break Label_0088;
                        }
                    }
                    else if (q != 5) {
                        if (q == 6) {
                            break Label_0037;
                        }
                        break Label_0088;
                    }
                }
                this.Q = 0;
                break Label_0088;
            }
            this.Q = 1;
        }
        if (e instanceof a) {
            ((a)e).o2(this.Q);
        }
    }
    
    @Override
    public void B(final e e, final boolean b) {
        this.K(e, this.P, b);
    }
    
    @Deprecated
    public boolean J() {
        return this.R.i2();
    }
    
    public boolean getAllowsGoneWidget() {
        return this.R.i2();
    }
    
    public int getMargin() {
        return this.R.k2();
    }
    
    public int getType() {
        return this.P;
    }
    
    public void setAllowsGoneWidget(final boolean b) {
        this.R.n2(b);
    }
    
    public void setDpMargin(int n) {
        n = (int)(n * this.getResources().getDisplayMetrics().density + 0.5f);
        this.R.p2(n);
    }
    
    public void setMargin(final int n) {
        this.R.p2(n);
    }
    
    public void setType(final int p) {
        this.P = p;
    }
    
    @Override
    protected void y(final AttributeSet set) {
        super.y(set);
        this.R = new a();
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, j.m.t6);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.U6) {
                    this.setType(obtainStyledAttributes.getInt(index, 0));
                }
                else if (index == j.m.T6) {
                    this.R.n2(obtainStyledAttributes.getBoolean(index, true));
                }
                else if (index == j.m.V6) {
                    this.R.p2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
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
        if (j instanceof a) {
            final a a2 = (a)j;
            this.K(a2, a.e.g0, ((f)j.U()).I2());
            a2.n2(a.e.o0);
            a2.p2(a.e.h0);
        }
    }
}
