// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.helper.widget;

import android.content.res.TypedArray;
import androidx.constraintlayout.widget.j;
import androidx.constraintlayout.widget.e;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.util.Log;
import java.util.Arrays;
import android.util.AttributeSet;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.n;

public class c extends n
{
    private static final String e0 = "CircularFlow";
    private static int f0;
    private static float g0;
    ConstraintLayout R;
    int S;
    private float[] T;
    private int[] U;
    private int V;
    private int W;
    private String a0;
    private String b0;
    private Float c0;
    private Integer d0;
    
    public c(final Context context) {
        super(context);
    }
    
    public c(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public c(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    private void K(final String s) {
        if (s != null) {
            if (s.length() != 0) {
                if (super.I == null) {
                    return;
                }
                final float[] t = this.T;
                if (t == null) {
                    return;
                }
                if (this.W + 1 > t.length) {
                    this.T = Arrays.copyOf(t, t.length + 1);
                }
                this.T[this.W] = (float)Integer.parseInt(s);
                ++this.W;
            }
        }
    }
    
    private void L(final String s) {
        if (s != null) {
            if (s.length() != 0) {
                if (super.I == null) {
                    return;
                }
                final int[] u = this.U;
                if (u == null) {
                    return;
                }
                if (this.V + 1 > u.length) {
                    this.U = Arrays.copyOf(u, u.length + 1);
                }
                this.U[this.V] = (int)(Integer.parseInt(s) * super.I.getResources().getDisplayMetrics().density);
                ++this.V;
            }
        }
    }
    
    private void N() {
        this.R = (ConstraintLayout)this.getParent();
        for (int i = 0; i < super.H; ++i) {
            final View n = this.R.n(super.G[i]);
            if (n != null) {
                int f0 = c.f0;
                float g0 = c.g0;
                final int[] u = this.U;
                if (u != null && i < u.length) {
                    f0 = u[i];
                }
                else {
                    final Integer d0 = this.d0;
                    if (d0 != null && d0 != -1) {
                        ++this.V;
                        if (this.U == null) {
                            this.U = new int[1];
                        }
                        (this.U = this.getRadius())[this.V - 1] = f0;
                    }
                    else {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Added radius to view with id: ");
                        sb.append(super.O.get(n.getId()));
                        Log.e("CircularFlow", sb.toString());
                    }
                }
                final float[] t = this.T;
                if (t != null && i < t.length) {
                    g0 = t[i];
                }
                else {
                    final Float c0 = this.c0;
                    if (c0 != null && c0 != -1.0f) {
                        ++this.W;
                        if (this.T == null) {
                            this.T = new float[1];
                        }
                        (this.T = this.getAngles())[this.W - 1] = g0;
                    }
                    else {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Added angle to view with id: ");
                        sb2.append(super.O.get(n.getId()));
                        Log.e("CircularFlow", sb2.toString());
                    }
                }
                final ConstraintLayout.b layoutParams = (ConstraintLayout.b)n.getLayoutParams();
                layoutParams.q = g0;
                layoutParams.o = this.S;
                layoutParams.p = f0;
                n.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            }
        }
        this.p();
    }
    
    private float[] P(final float[] array, final int n) {
        float[] q = array;
        if (array != null) {
            q = array;
            if (n >= 0) {
                if (n >= this.W) {
                    q = array;
                }
                else {
                    q = Q(array, n);
                }
            }
        }
        return q;
    }
    
    public static float[] Q(final float[] array, final int n) {
        final float[] array2 = new float[array.length - 1];
        int i = 0;
        int n2 = 0;
        while (i < array.length) {
            if (i != n) {
                array2[n2] = array[i];
                ++n2;
            }
            ++i;
        }
        return array2;
    }
    
    public static int[] R(final int[] array, final int n) {
        final int[] array2 = new int[array.length - 1];
        int i = 0;
        int n2 = 0;
        while (i < array.length) {
            if (i != n) {
                array2[n2] = array[i];
                ++n2;
            }
            ++i;
        }
        return array2;
    }
    
    private int[] S(final int[] array, final int n) {
        int[] r = array;
        if (array != null) {
            r = array;
            if (n >= 0) {
                if (n >= this.V) {
                    r = array;
                }
                else {
                    r = R(array, n);
                }
            }
        }
        return r;
    }
    
    private void setAngles(final String s) {
        if (s == null) {
            return;
        }
        int beginIndex = 0;
        this.W = 0;
        while (true) {
            final int index = s.indexOf(44, beginIndex);
            if (index == -1) {
                break;
            }
            this.K(s.substring(beginIndex, index).trim());
            beginIndex = index + 1;
        }
        this.K(s.substring(beginIndex).trim());
    }
    
    private void setRadius(final String s) {
        if (s == null) {
            return;
        }
        int beginIndex = 0;
        this.V = 0;
        while (true) {
            final int index = s.indexOf(44, beginIndex);
            if (index == -1) {
                break;
            }
            this.L(s.substring(beginIndex, index).trim());
            beginIndex = index + 1;
        }
        this.L(s.substring(beginIndex).trim());
    }
    
    @Override
    public int A(final View view) {
        final int a = super.A(view);
        if (a == -1) {
            return a;
        }
        final e e = new e();
        e.H(this.R);
        e.F(view.getId(), 8);
        e.r(this.R);
        final float[] t = this.T;
        if (a < t.length) {
            this.T = this.P(t, a);
            --this.W;
        }
        final int[] u = this.U;
        if (a < u.length) {
            this.U = this.S(u, a);
            --this.V;
        }
        this.N();
        return a;
    }
    
    public void M(final View view, final int n, final float n2) {
        if (this.s(view.getId())) {
            return;
        }
        this.o(view);
        ++this.W;
        (this.T = this.getAngles())[this.W - 1] = n2;
        ++this.V;
        (this.U = this.getRadius())[this.V - 1] = (int)(n * super.I.getResources().getDisplayMetrics().density);
        this.N();
    }
    
    public boolean O(final View view) {
        final boolean s = this.s(view.getId());
        boolean b = false;
        if (!s) {
            return false;
        }
        if (this.x(view.getId()) != -1) {
            b = true;
        }
        return b;
    }
    
    public void T(final View view, final float n) {
        if (!this.O(view)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("It was not possible to update angle to view with id: ");
            sb.append(view.getId());
            Log.e("CircularFlow", sb.toString());
            return;
        }
        final int x = this.x(view.getId());
        if (x > this.T.length) {
            return;
        }
        (this.T = this.getAngles())[x] = n;
        this.N();
    }
    
    public void U(final View view, final int n) {
        if (!this.O(view)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("It was not possible to update radius to view with id: ");
            sb.append(view.getId());
            Log.e("CircularFlow", sb.toString());
            return;
        }
        final int x = this.x(view.getId());
        if (x > this.U.length) {
            return;
        }
        (this.U = this.getRadius())[x] = (int)(n * super.I.getResources().getDisplayMetrics().density);
        this.N();
    }
    
    public void V(final View view, final int n, final float n2) {
        if (!this.O(view)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("It was not possible to update radius and angle to view with id: ");
            sb.append(view.getId());
            Log.e("CircularFlow", sb.toString());
            return;
        }
        final int x = this.x(view.getId());
        if (this.getAngles().length > x) {
            (this.T = this.getAngles())[x] = n2;
        }
        if (this.getRadius().length > x) {
            (this.U = this.getRadius())[x] = (int)(n * super.I.getResources().getDisplayMetrics().density);
        }
        this.N();
    }
    
    public float[] getAngles() {
        return Arrays.copyOf(this.T, this.W);
    }
    
    public int[] getRadius() {
        return Arrays.copyOf(this.U, this.V);
    }
    
    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final String a0 = this.a0;
        if (a0 != null) {
            this.T = new float[1];
            this.setAngles(a0);
        }
        final String b0 = this.b0;
        if (b0 != null) {
            this.U = new int[1];
            this.setRadius(b0);
        }
        final Float c0 = this.c0;
        if (c0 != null) {
            this.setDefaultAngle(c0);
        }
        final Integer d0 = this.d0;
        if (d0 != null) {
            this.setDefaultRadius(d0);
        }
        this.N();
    }
    
    public void setDefaultAngle(final float g0) {
        c.g0 = g0;
    }
    
    public void setDefaultRadius(final int f0) {
        c.f0 = f0;
    }
    
    @Override
    protected void y(final AttributeSet set) {
        super.y(set);
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, j.m.t6);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.b7) {
                    this.S = obtainStyledAttributes.getResourceId(index, 0);
                }
                else if (index == j.m.X6) {
                    this.setAngles(this.a0 = obtainStyledAttributes.getString(index));
                }
                else if (index == j.m.a7) {
                    this.setRadius(this.b0 = obtainStyledAttributes.getString(index));
                }
                else if (index == j.m.Y6) {
                    final Float value = obtainStyledAttributes.getFloat(index, c.g0);
                    this.c0 = value;
                    this.setDefaultAngle(value);
                }
                else if (index == j.m.Z6) {
                    final Integer value2 = obtainStyledAttributes.getDimensionPixelSize(index, c.f0);
                    this.d0 = value2;
                    this.setDefaultRadius(value2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
