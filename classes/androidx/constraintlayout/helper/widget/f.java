// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.helper.widget;

import androidx.constraintlayout.motion.widget.g;
import android.util.Log;
import androidx.constraintlayout.motion.widget.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.motion.widget.o;
import android.view.View;
import java.util.HashMap;
import androidx.constraintlayout.motion.widget.s;
import android.content.res.TypedArray;
import androidx.constraintlayout.widget.j;
import android.util.AttributeSet;
import android.content.Context;
import androidx.constraintlayout.motion.widget.p;

public class f extends p
{
    public static final String e0 = "FadeMove";
    public static final int f0 = -1;
    public static final int g0 = 0;
    public static final int h0 = 1;
    public static final int i0 = 2;
    public static final int j0 = 3;
    private static final int k0 = -1;
    private float T;
    private int U;
    private int V;
    private int W;
    private int a0;
    private boolean b0;
    private int c0;
    private int d0;
    
    public f(final Context context) {
        super(context);
        this.T = 0.1f;
        this.U = 49;
        this.V = 50;
        this.W = 0;
        this.a0 = 0;
        this.b0 = true;
        this.c0 = -1;
        this.d0 = -1;
    }
    
    public f(final Context context, final AttributeSet set) {
        super(context, set);
        this.T = 0.1f;
        this.U = 49;
        this.V = 50;
        this.W = 0;
        this.a0 = 0;
        this.b0 = true;
        this.c0 = -1;
        this.d0 = -1;
        this.K(context, set);
    }
    
    public f(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.T = 0.1f;
        this.U = 49;
        this.V = 50;
        this.W = 0;
        this.a0 = 0;
        this.b0 = true;
        this.c0 = -1;
        this.d0 = -1;
        this.K(context, set);
    }
    
    private void K(final Context context, final AttributeSet set) {
        if (set != null) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, androidx.constraintlayout.widget.j.m.oj);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.j.m.sj) {
                    final int int1 = obtainStyledAttributes.getInt(index, this.U);
                    this.U = int1;
                    this.U = Math.max(Math.min(int1, 99), 0);
                }
                else if (index == androidx.constraintlayout.widget.j.m.qj) {
                    final int int2 = obtainStyledAttributes.getInt(index, this.V);
                    this.V = int2;
                    this.V = Math.max(Math.min(int2, 99), 0);
                }
                else if (index == androidx.constraintlayout.widget.j.m.uj) {
                    this.W = obtainStyledAttributes.getDimensionPixelOffset(index, this.W);
                }
                else if (index == androidx.constraintlayout.widget.j.m.vj) {
                    this.a0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.a0);
                }
                else if (index == androidx.constraintlayout.widget.j.m.pj) {
                    this.T = obtainStyledAttributes.getFloat(index, this.T);
                }
                else if (index == androidx.constraintlayout.widget.j.m.rj) {
                    this.d0 = obtainStyledAttributes.getInt(index, this.d0);
                }
                else if (index == androidx.constraintlayout.widget.j.m.tj) {
                    this.b0 = obtainStyledAttributes.getBoolean(index, this.b0);
                }
                else if (index == androidx.constraintlayout.widget.j.m.wj) {
                    this.c0 = obtainStyledAttributes.getResourceId(index, this.c0);
                }
            }
            final int u = this.U;
            final int v = this.V;
            if (u == v) {
                if (u > 0) {
                    this.U = u - 1;
                }
                else {
                    this.V = v + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
    
    @Override
    public void g(final s s, final HashMap<View, o> hashMap) {
        final View[] w = this.w((ConstraintLayout)this.getParent());
        if (w == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(androidx.constraintlayout.motion.widget.c.f());
            sb.append(" views = null");
            Log.v("FadeMove", sb.toString());
            return;
        }
        final androidx.constraintlayout.motion.widget.g g = new androidx.constraintlayout.motion.widget.g();
        final androidx.constraintlayout.motion.widget.g g2 = new androidx.constraintlayout.motion.widget.g();
        g.j("alpha", this.T);
        g2.j("alpha", this.T);
        g.h(this.U);
        g2.h(this.V);
        final androidx.constraintlayout.motion.widget.j j = new androidx.constraintlayout.motion.widget.j();
        j.h(this.U);
        j.z(0);
        j.j("percentX", 0);
        j.j("percentY", 0);
        final androidx.constraintlayout.motion.widget.j i = new androidx.constraintlayout.motion.widget.j();
        i.h(this.V);
        i.z(0);
        i.j("percentX", 1);
        i.j("percentY", 1);
        final int w2 = this.W;
        androidx.constraintlayout.motion.widget.g g3 = null;
        androidx.constraintlayout.motion.widget.g g4;
        androidx.constraintlayout.motion.widget.g g5;
        if (w2 > 0) {
            g4 = new androidx.constraintlayout.motion.widget.g();
            g5 = new androidx.constraintlayout.motion.widget.g();
            g4.j("translationX", this.W);
            g4.h(this.V);
            g5.j("translationX", 0);
            g5.h(this.V - 1);
        }
        else {
            g4 = (g5 = null);
        }
        androidx.constraintlayout.motion.widget.g g6;
        if (this.a0 > 0) {
            g3 = new androidx.constraintlayout.motion.widget.g();
            g6 = new androidx.constraintlayout.motion.widget.g();
            g3.j("translationY", this.a0);
            g3.h(this.V);
            g6.j("translationY", 0);
            g6.h(this.V - 1);
        }
        else {
            g6 = null;
        }
        int d0;
        if ((d0 = this.d0) == -1) {
            final int[] array = new int[4];
            for (int k = 0; k < w.length; ++k) {
                final o o = hashMap.get(w[k]);
                if (o != null) {
                    final float n = o.t() - o.G();
                    final float n2 = o.u() - o.H();
                    if (n2 < 0.0f) {
                        ++array[1];
                    }
                    if (n2 > 0.0f) {
                        ++array[0];
                    }
                    if (n > 0.0f) {
                        ++array[3];
                    }
                    if (n < 0.0f) {
                        ++array[2];
                    }
                }
            }
            int n3 = array[0];
            int n4 = 1;
            int n5 = 0;
            while (true) {
                d0 = n5;
                if (n4 >= 4) {
                    break;
                }
                int n6;
                if ((n6 = n3) < array[n4]) {
                    n6 = array[n4];
                    n5 = n4;
                }
                ++n4;
                n3 = n6;
            }
        }
        for (int l = 0; l < w.length; ++l) {
            final o o2 = hashMap.get(w[l]);
            if (o2 != null) {
                final float n7 = o2.t() - o2.G();
                final float n8 = o2.u() - o2.H();
                boolean b = false;
                Label_0763: {
                    Label_0667: {
                        if (d0 == 0) {
                            if (n8 <= 0.0f || (this.b0 && n7 != 0.0f)) {
                                break Label_0667;
                            }
                        }
                        else if (d0 == 1) {
                            if (n8 >= 0.0f) {
                                break Label_0667;
                            }
                            if (this.b0) {
                                if (n7 != 0.0f) {
                                    break Label_0667;
                                }
                            }
                        }
                        else if (d0 == 2) {
                            if (n7 >= 0.0f) {
                                break Label_0667;
                            }
                            if (this.b0) {
                                if (n8 != 0.0f) {
                                    break Label_0667;
                                }
                            }
                        }
                        else {
                            if (d0 != 3 || n7 <= 0.0f) {
                                break Label_0667;
                            }
                            if (this.b0) {
                                if (n8 != 0.0f) {
                                    break Label_0667;
                                }
                            }
                        }
                        b = false;
                        break Label_0763;
                    }
                    b = true;
                }
                if (b) {
                    final int c0 = this.c0;
                    if (c0 == -1) {
                        o2.a(g);
                        o2.a(g2);
                        o2.a(j);
                        o2.a(i);
                        if (this.W > 0) {
                            o2.a(g4);
                            o2.a(g5);
                        }
                        if (this.a0 > 0) {
                            o2.a(g3);
                            o2.a(g6);
                        }
                    }
                    else {
                        s.m0(c0, o2);
                    }
                }
            }
        }
    }
    
    @Override
    public boolean j() {
        return true;
    }
}
