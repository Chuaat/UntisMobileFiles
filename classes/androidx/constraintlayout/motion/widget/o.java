// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import java.util.Collection;
import java.util.Arrays;
import android.util.SparseArray;
import java.util.HashSet;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View$MeasureSpec;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.core.motion.utils.g;
import androidx.constraintlayout.core.motion.utils.h;
import androidx.constraintlayout.core.motion.utils.d0;
import android.graphics.RectF;
import android.view.animation.OvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.content.Context;
import android.util.Log;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import androidx.constraintlayout.core.motion.utils.d;
import java.util.ArrayList;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import android.view.View;
import androidx.constraintlayout.motion.utils.b;
import androidx.constraintlayout.motion.utils.c;
import androidx.constraintlayout.motion.utils.e;
import java.util.HashMap;

public class o
{
    public static final int M = 0;
    public static final int N = 1;
    public static final int O = 2;
    public static final int P = 3;
    public static final int Q = 4;
    public static final int R = 5;
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 2;
    public static final int V = 3;
    public static final int W = 4;
    public static final int X = 5;
    public static final int Y = 6;
    public static final int Z = 1;
    public static final int a0 = 2;
    private static final String b0 = "MotionController";
    private static final boolean c0 = false;
    private static final boolean d0 = false;
    static final int e0 = 0;
    static final int f0 = 1;
    static final int g0 = 2;
    static final int h0 = 3;
    static final int i0 = 4;
    static final int j0 = 5;
    private static final int k0 = -1;
    private static final int l0 = -2;
    private static final int m0 = -3;
    private HashMap<String, e> A;
    private HashMap<String, c> B;
    private HashMap<String, b> C;
    private m[] D;
    private int E;
    private int F;
    private View G;
    private int H;
    private float I;
    private Interpolator J;
    private boolean K;
    String[] L;
    Rect a;
    View b;
    int c;
    String d;
    private int e;
    private t f;
    private t g;
    private n h;
    private n i;
    private androidx.constraintlayout.core.motion.utils.b[] j;
    private androidx.constraintlayout.core.motion.utils.b k;
    float l;
    float m;
    float n;
    float o;
    float p;
    private int[] q;
    private double[] r;
    private double[] s;
    private String[] t;
    private int[] u;
    private int v;
    private float[] w;
    private ArrayList<t> x;
    private float[] y;
    private ArrayList<f> z;
    
    o(final View view) {
        this.a = new Rect();
        this.e = -1;
        this.f = new t();
        this.g = new t();
        this.h = new n();
        this.i = new n();
        this.l = Float.NaN;
        this.m = 0.0f;
        this.n = 1.0f;
        this.v = 4;
        this.w = new float[4];
        this.x = new ArrayList<t>();
        this.y = new float[1];
        this.z = new ArrayList<f>();
        final int f = androidx.constraintlayout.motion.widget.f.f;
        this.E = f;
        this.F = f;
        this.G = null;
        this.H = f;
        this.I = Float.NaN;
        this.J = null;
        this.K = false;
        this.Y(view);
    }
    
    private float D() {
        final float[] array = new float[2];
        final float n = 1.0f / 99;
        double n3;
        double n2 = n3 = 0.0;
        float n4 = 0.0f;
        for (int i = 0; i < 100; ++i) {
            final float n5 = i * n;
            double n6 = n5;
            d g = this.f.G;
            final Iterator<t> iterator = this.x.iterator();
            float n7 = Float.NaN;
            float n8 = 0.0f;
            while (iterator.hasNext()) {
                final t t = iterator.next();
                final d g2 = t.G;
                d d = g;
                float j = n7;
                float k = n8;
                if (g2 != null) {
                    k = t.I;
                    if (k < n5) {
                        d = g2;
                        j = n7;
                    }
                    else {
                        d = g;
                        j = n7;
                        k = n8;
                        if (Float.isNaN(n7)) {
                            j = t.I;
                            k = n8;
                            d = g;
                        }
                    }
                }
                g = d;
                n7 = j;
                n8 = k;
            }
            if (g != null) {
                float n9 = n7;
                if (Float.isNaN(n7)) {
                    n9 = 1.0f;
                }
                final float n10 = n9 - n8;
                n6 = (float)g.a((n5 - n8) / n10) * n10 + n8;
            }
            this.j[0].d(n6, this.r);
            this.f.k(n6, this.q, this.r, array, 0);
            if (i > 0) {
                n4 += (float)Math.hypot(n3 - array[1], n2 - array[0]);
            }
            n2 = array[0];
            n3 = array[1];
        }
        return n4;
    }
    
    private void K(final t t) {
        final int binarySearch = Collections.binarySearch(this.x, t);
        if (binarySearch == 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append(" KeyPath position \"");
            sb.append(t.J);
            sb.append("\" outside of range");
            Log.e("MotionController", sb.toString());
        }
        this.x.add(-binarySearch - 1, t);
    }
    
    private void O(final t t) {
        t.B((float)(int)this.b.getX(), (float)(int)this.b.getY(), (float)this.b.getWidth(), (float)this.b.getHeight());
    }
    
    private float j(float i, final float[] array) {
        final float n = 0.0f;
        final float n2 = 1.0f;
        float min;
        if (array != null) {
            array[0] = 1.0f;
            min = i;
        }
        else {
            final float n3 = this.n;
            min = i;
            if (n3 != 1.0) {
                final float m = this.m;
                float n4 = i;
                if (i < m) {
                    n4 = 0.0f;
                }
                min = n4;
                if (n4 > m) {
                    min = n4;
                    if (n4 < 1.0) {
                        min = Math.min((n4 - m) * n3, 1.0f);
                    }
                }
            }
        }
        d g = this.f.G;
        i = Float.NaN;
        final Iterator<t> iterator = this.x.iterator();
        float n5 = n;
        while (iterator.hasNext()) {
            final t t = iterator.next();
            final d g2 = t.G;
            if (g2 != null) {
                final float j = t.I;
                if (j < min) {
                    g = g2;
                    n5 = j;
                }
                else {
                    if (!Float.isNaN(i)) {
                        continue;
                    }
                    i = t.I;
                }
            }
        }
        float n6 = min;
        if (g != null) {
            if (Float.isNaN(i)) {
                i = n2;
            }
            i -= n5;
            final double n7 = (min - n5) / i;
            i = (n6 = (float)g.a(n7) * i + n5);
            if (array != null) {
                array[0] = (float)g.b(n7);
                n6 = i;
            }
        }
        return n6;
    }
    
    private static Interpolator v(final Context context, final int n, final String s, final int n2) {
        if (n == -2) {
            return AnimationUtils.loadInterpolator(context, n2);
        }
        if (n == -1) {
            return (Interpolator)new Interpolator() {
                final /* synthetic */ d a = androidx.constraintlayout.core.motion.utils.d.c(s);
                
                public float getInterpolation(final float n) {
                    return (float)this.a.a(n);
                }
            };
        }
        if (n == 0) {
            return (Interpolator)new AccelerateDecelerateInterpolator();
        }
        if (n == 1) {
            return (Interpolator)new AccelerateInterpolator();
        }
        if (n == 2) {
            return (Interpolator)new DecelerateInterpolator();
        }
        if (n == 4) {
            return (Interpolator)new BounceInterpolator();
        }
        if (n != 5) {
            return null;
        }
        return (Interpolator)new OvershootInterpolator();
    }
    
    double[] A(final double n) {
        this.j[0].d(n, this.r);
        final androidx.constraintlayout.core.motion.utils.b k = this.k;
        if (k != null) {
            final double[] r = this.r;
            if (r.length > 0) {
                k.d(n, r);
            }
        }
        return this.r;
    }
    
    k B(final int n, final int n2, final float n3, final float n4) {
        final RectF rectF = new RectF();
        final t f = this.f;
        final float k = f.K;
        rectF.left = k;
        final float l = f.L;
        rectF.top = l;
        rectF.right = k + f.M;
        rectF.bottom = l + f.N;
        final RectF rectF2 = new RectF();
        final t g = this.g;
        final float i = g.K;
        rectF2.left = i;
        final float j = g.L;
        rectF2.top = j;
        rectF2.right = i + g.M;
        rectF2.bottom = j + g.N;
        for (final f f2 : this.z) {
            if (f2 instanceof k) {
                final k m = (k)f2;
                if (m.r(n, n2, rectF, rectF2, n3, n4)) {
                    return m;
                }
                continue;
            }
        }
        return null;
    }
    
    void C(float n, final int n2, final int n3, final float n4, final float n5, final float[] array) {
        n = this.j(n, this.y);
        final HashMap<String, c> b = this.B;
        h h = null;
        androidx.constraintlayout.core.motion.utils.o o;
        if (b == null) {
            o = null;
        }
        else {
            o = b.get("translationX");
        }
        final HashMap<String, c> b2 = this.B;
        androidx.constraintlayout.core.motion.utils.o o2;
        if (b2 == null) {
            o2 = null;
        }
        else {
            o2 = b2.get("translationY");
        }
        final HashMap<String, c> b3 = this.B;
        androidx.constraintlayout.core.motion.utils.o o3;
        if (b3 == null) {
            o3 = null;
        }
        else {
            o3 = b3.get("rotation");
        }
        final HashMap<String, c> b4 = this.B;
        androidx.constraintlayout.core.motion.utils.o o4;
        if (b4 == null) {
            o4 = null;
        }
        else {
            o4 = b4.get("scaleX");
        }
        final HashMap<String, c> b5 = this.B;
        androidx.constraintlayout.core.motion.utils.o o5;
        if (b5 == null) {
            o5 = null;
        }
        else {
            o5 = b5.get("scaleY");
        }
        final HashMap<String, b> c = this.C;
        h h2;
        if (c == null) {
            h2 = null;
        }
        else {
            h2 = c.get("translationX");
        }
        final HashMap<String, b> c2 = this.C;
        h h3;
        if (c2 == null) {
            h3 = null;
        }
        else {
            h3 = c2.get("translationY");
        }
        final HashMap<String, b> c3 = this.C;
        h h4;
        if (c3 == null) {
            h4 = null;
        }
        else {
            h4 = c3.get("rotation");
        }
        final HashMap<String, b> c4 = this.C;
        h h5;
        if (c4 == null) {
            h5 = null;
        }
        else {
            h5 = c4.get("scaleX");
        }
        final HashMap<String, b> c5 = this.C;
        if (c5 != null) {
            h = c5.get("scaleY");
        }
        final d0 d0 = new d0();
        d0.b();
        d0.d(o3, n);
        d0.h(o, o2, n);
        d0.f(o4, o5, n);
        d0.c(h4, n);
        d0.g(h2, h3, n);
        d0.e(h5, h, n);
        final androidx.constraintlayout.core.motion.utils.b k = this.k;
        if (k != null) {
            final double[] r = this.r;
            if (r.length > 0) {
                final double n6 = n;
                k.d(n6, r);
                this.k.g(n6, this.s);
                this.f.E(n4, n5, array, this.q, this.s, this.r);
            }
            d0.a(n4, n5, n2, n3, array);
            return;
        }
        final androidx.constraintlayout.core.motion.utils.b[] j = this.j;
        int n7 = 0;
        if (j != null) {
            n = this.j(n, this.y);
            final androidx.constraintlayout.core.motion.utils.b b6 = this.j[0];
            final double n8 = n;
            b6.g(n8, this.s);
            this.j[0].d(n8, this.r);
            n = this.y[0];
            double[] s;
            while (true) {
                s = this.s;
                if (n7 >= s.length) {
                    break;
                }
                s[n7] *= n;
                ++n7;
            }
            this.f.E(n4, n5, array, this.q, s, this.r);
            d0.a(n4, n5, n2, n3, array);
            return;
        }
        final t g = this.g;
        final float i = g.K;
        final t f = this.f;
        final float n9 = i - f.K;
        final float n10 = g.L - f.L;
        final float m = g.M;
        final float l = f.M;
        final float n11 = g.N;
        final float n12 = f.N;
        array[0] = n9 * (1.0f - n4) + (m - l + n9) * n4;
        array[1] = n10 * (1.0f - n5) + (n11 - n12 + n10) * n5;
        d0.b();
        d0.d(o3, n);
        d0.h(o, o2, n);
        d0.f(o4, o5, n);
        d0.c(h4, n);
        d0.g(h2, h3, n);
        d0.e(h5, h, n);
        d0.a(n4, n5, n2, n3, array);
    }
    
    public float E() {
        return this.f.N;
    }
    
    public float F() {
        return this.f.M;
    }
    
    public float G() {
        return this.f.K;
    }
    
    public float H() {
        return this.f.L;
    }
    
    public int I() {
        return this.F;
    }
    
    public View J() {
        return this.b;
    }
    
    boolean L(final View view, float interpolation, final long n, final g g) {
        final float j = this.j(interpolation, null);
        final int h = this.H;
        interpolation = j;
        if (h != androidx.constraintlayout.motion.widget.f.f) {
            final float n2 = 1.0f / h;
            final float n3 = (float)Math.floor(j / n2);
            final float n4 = interpolation = j % n2 / n2;
            if (!Float.isNaN(this.I)) {
                interpolation = (n4 + this.I) % 1.0f;
            }
            final Interpolator i = this.J;
            if (i != null) {
                interpolation = i.getInterpolation(interpolation);
            }
            else if (interpolation > 0.5) {
                interpolation = 1.0f;
            }
            else {
                interpolation = 0.0f;
            }
            interpolation = interpolation * n2 + n3 * n2;
        }
        final HashMap<String, c> b = this.B;
        if (b != null) {
            final Iterator<c> iterator = b.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().m(view, interpolation);
            }
        }
        final HashMap<String, e> a = this.A;
        e e;
        int n5;
        if (a != null) {
            final Iterator<e> iterator2 = a.values().iterator();
            e = null;
            n5 = 0;
            while (iterator2.hasNext()) {
                final e e2 = iterator2.next();
                if (e2 instanceof e.d) {
                    e = e2;
                }
                else {
                    n5 |= (e2.j(view, interpolation, n, g) ? 1 : 0);
                }
            }
        }
        else {
            e = null;
            n5 = (false ? 1 : 0);
        }
        final androidx.constraintlayout.core.motion.utils.b[] k = this.j;
        boolean b4;
        if (k != null) {
            final androidx.constraintlayout.core.motion.utils.b b2 = k[0];
            final double n6 = interpolation;
            b2.d(n6, this.r);
            this.j[0].g(n6, this.s);
            final androidx.constraintlayout.core.motion.utils.b l = this.k;
            if (l != null) {
                final double[] r = this.r;
                if (r.length > 0) {
                    l.d(n6, r);
                    this.k.g(n6, this.s);
                }
            }
            if (!this.K) {
                this.f.G(interpolation, view, this.q, this.r, this.s, null);
            }
            if (this.F != androidx.constraintlayout.motion.widget.f.f) {
                if (this.G == null) {
                    this.G = ((View)view.getParent()).findViewById(this.F);
                }
                final View g2 = this.G;
                if (g2 != null) {
                    final float n7 = (g2.getTop() + this.G.getBottom()) / 2.0f;
                    final float n8 = (this.G.getLeft() + this.G.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        final float n9 = (float)view.getLeft();
                        final float n10 = (float)view.getTop();
                        view.setPivotX(n8 - n9);
                        view.setPivotY(n7 - n10);
                    }
                }
            }
            final HashMap<String, c> b3 = this.B;
            if (b3 != null) {
                for (final c c : b3.values()) {
                    if (c instanceof c.d) {
                        final double[] s = this.s;
                        if (s.length <= 1) {
                            continue;
                        }
                        ((c.d)c).n(view, interpolation, s[0], s[1]);
                    }
                }
            }
            if (e != null) {
                final double[] s2 = this.s;
                n5 |= (((e.d)e).k(view, g, interpolation, n, s2[0], s2[1]) ? 1 : 0);
            }
            int n11 = 1;
            while (true) {
                final androidx.constraintlayout.core.motion.utils.b[] m = this.j;
                if (n11 >= m.length) {
                    break;
                }
                m[n11].e(n6, this.w);
                this.f.U.get(this.t[n11 - 1]).o(view, this.w);
                ++n11;
            }
            n n12 = this.h;
            Label_0796: {
                if (n12.H == 0) {
                    if (interpolation > 0.0f) {
                        if (interpolation >= 1.0f) {
                            n12 = this.i;
                        }
                        else {
                            if (this.i.I != n12.I) {
                                view.setVisibility(0);
                            }
                            break Label_0796;
                        }
                    }
                    view.setVisibility(n12.I);
                }
            }
            b4 = (n5 != 0);
            if (this.D != null) {
                int n13 = 0;
                while (true) {
                    final m[] d = this.D;
                    b4 = (n5 != 0);
                    if (n13 >= d.length) {
                        break;
                    }
                    d[n13].A(interpolation, view);
                    ++n13;
                }
            }
        }
        else {
            final t f = this.f;
            final float k2 = f.K;
            final t g3 = this.g;
            final float k3 = g3.K;
            final float l2 = f.L;
            final float l3 = g3.L;
            final float m2 = f.M;
            final float m3 = g3.M;
            final float n14 = f.N;
            final float n15 = g3.N;
            final float n16 = k2 + (k3 - k2) * interpolation + 0.5f;
            final int n17 = (int)n16;
            final float n18 = l2 + (l3 - l2) * interpolation + 0.5f;
            final int n19 = (int)n18;
            final int n20 = (int)(n16 + ((m3 - m2) * interpolation + m2));
            final int n21 = (int)(n18 + ((n15 - n14) * interpolation + n14));
            if (m3 != m2 || n15 != n14) {
                view.measure(View$MeasureSpec.makeMeasureSpec(n20 - n17, 1073741824), View$MeasureSpec.makeMeasureSpec(n21 - n19, 1073741824));
            }
            view.layout(n17, n19, n20, n21);
            b4 = (n5 != 0);
        }
        final HashMap<String, b> c2 = this.C;
        if (c2 != null) {
            for (final b b5 : c2.values()) {
                if (b5 instanceof b.d) {
                    final b.d d2 = (b.d)b5;
                    final double[] s3 = this.s;
                    d2.n(view, interpolation, s3[0], s3[1]);
                }
                else {
                    b5.m(view, interpolation);
                }
            }
        }
        return b4;
    }
    
    String M() {
        return this.b.getContext().getResources().getResourceEntryName(this.b.getId());
    }
    
    void N(final View view, final k k, final float n, final float n2, final String[] array, final float[] array2) {
        final RectF rectF = new RectF();
        final t f = this.f;
        final float i = f.K;
        rectF.left = i;
        final float l = f.L;
        rectF.top = l;
        rectF.right = i + f.M;
        rectF.bottom = l + f.N;
        final RectF rectF2 = new RectF();
        final t g = this.g;
        final float j = g.K;
        rectF2.left = j;
        final float m = g.L;
        rectF2.top = m;
        rectF2.right = j + g.M;
        rectF2.bottom = m + g.N;
        k.s(view, rectF, rectF2, n, n2, array, array2);
    }
    
    void P(final Rect rect, final Rect rect2, int left, int n, int n2) {
        Label_0184: {
            Label_0163: {
                if (left != 1) {
                    int n3;
                    if (left != 2) {
                        if (left == 3) {
                            n = rect.left + rect.right;
                            left = rect.height() / 2 + rect.top - n / 2;
                            break Label_0163;
                        }
                        if (left != 4) {
                            return;
                        }
                        n2 = rect.left + rect.right;
                        left = rect.bottom;
                        n3 = rect.top;
                    }
                    else {
                        n2 = rect.left + rect.right;
                        left = rect.top;
                        n3 = rect.bottom;
                    }
                    rect2.left = n - (left + n3 + rect.width()) / 2;
                    rect2.top = (n2 - rect.height()) / 2;
                    break Label_0184;
                }
                n = rect.left + rect.right;
                left = (rect.top + rect.bottom - rect.width()) / 2;
            }
            rect2.left = left;
            rect2.top = n2 - (n + rect.height()) / 2;
        }
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }
    
    void Q(final View view) {
        final t f = this.f;
        f.I = 0.0f;
        f.J = 0.0f;
        this.K = true;
        f.B(view.getX(), view.getY(), (float)view.getWidth(), (float)view.getHeight());
        this.g.B(view.getX(), view.getY(), (float)view.getWidth(), (float)view.getHeight());
        this.h.v(view);
        this.i.v(view);
    }
    
    public void R(final int h) {
        this.f.H = h;
    }
    
    void S(final Rect rect, final androidx.constraintlayout.widget.e e, final int n, final int n2) {
        final int d = e.d;
        Rect a = rect;
        if (d != 0) {
            this.P(rect, this.a, d, n, n2);
            a = this.a;
        }
        final t g = this.g;
        g.I = 1.0f;
        g.J = 1.0f;
        this.O(g);
        this.g.B((float)a.left, (float)a.top, (float)a.width(), (float)a.height());
        this.g.b(e.q0(this.c));
        this.i.u(a, e, d, this.c);
    }
    
    public void T(final int e) {
        this.E = e;
    }
    
    void U(final View view) {
        final t f = this.f;
        f.I = 0.0f;
        f.J = 0.0f;
        f.B(view.getX(), view.getY(), (float)view.getWidth(), (float)view.getHeight());
        this.h.v(view);
    }
    
    void V(final Rect rect, final androidx.constraintlayout.widget.e e, final int n, final int n2) {
        final int d = e.d;
        if (d != 0) {
            this.P(rect, this.a, d, n, n2);
        }
        final t f = this.f;
        f.I = 0.0f;
        f.J = 0.0f;
        this.O(f);
        this.f.B((float)rect.left, (float)rect.top, (float)rect.width(), (float)rect.height());
        final androidx.constraintlayout.widget.e.a q0 = e.q0(this.c);
        this.f.b(q0);
        this.l = q0.d.g;
        this.h.u(rect, e, d, this.c);
        this.F = q0.f.i;
        final androidx.constraintlayout.widget.e.c d2 = q0.d;
        this.H = d2.k;
        this.I = d2.j;
        final Context context = this.b.getContext();
        final androidx.constraintlayout.widget.e.c d3 = q0.d;
        this.J = v(context, d3.m, d3.l, d3.n);
    }
    
    public void W(final androidx.constraintlayout.motion.utils.d d, final View view, final int n, int d2, int b) {
        final t f = this.f;
        f.I = 0.0f;
        f.J = 0.0f;
        final Rect rect = new Rect();
        Label_0180: {
            if (n != 1) {
                if (n != 2) {
                    break Label_0180;
                }
                final int b2 = d.b;
                d2 = d.d;
                rect.left = b - (d.c + d.e + d.c()) / 2;
                d2 = (b2 + d2 - d.b()) / 2;
            }
            else {
                b = d.b;
                final int d3 = d.d;
                rect.left = (d.c + d.e - d.c()) / 2;
                d2 -= (b + d3 + d.b()) / 2;
            }
            rect.top = d2;
            rect.right = rect.left + d.c();
            rect.bottom = rect.top + d.b();
        }
        this.f.B((float)rect.left, (float)rect.top, (float)rect.width(), (float)rect.height());
        this.h.s(rect, view, n, d.a);
    }
    
    public void X(final int f) {
        this.F = f;
        this.G = null;
    }
    
    public void Y(final View b) {
        this.b = b;
        this.c = b.getId();
        final ViewGroup$LayoutParams layoutParams = b.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.d = ((ConstraintLayout.b)layoutParams).a();
        }
    }
    
    public void Z(int i, int j, float d, final long n) {
        new HashSet();
        final HashSet<String> set = new HashSet<String>();
        final HashSet<String> set2 = new HashSet<String>();
        final HashSet<String> set3 = new HashSet<String>();
        final HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        final int e = this.E;
        if (e != androidx.constraintlayout.motion.widget.f.f) {
            this.f.Q = e;
        }
        this.h.i(this.i, set2);
        final ArrayList<f> z = this.z;
        ArrayList<m> list2;
        if (z != null) {
            final Iterator<f> iterator = z.iterator();
            ArrayList<m> list = null;
            while (true) {
                list2 = list;
                if (!iterator.hasNext()) {
                    break;
                }
                final f f = iterator.next();
                if (f instanceof j) {
                    final j k = (j)f;
                    this.K(new t(i, j, k, this.f, this.g));
                    final int d2 = k.D;
                    if (d2 == androidx.constraintlayout.motion.widget.f.f) {
                        continue;
                    }
                    this.e = d2;
                }
                else if (f instanceof androidx.constraintlayout.motion.widget.h) {
                    f.d(set3);
                }
                else if (f instanceof l) {
                    f.d(set);
                }
                else if (f instanceof m) {
                    ArrayList<m> list3;
                    if ((list3 = list) == null) {
                        list3 = new ArrayList<m>();
                    }
                    list3.add((m)f);
                    list = list3;
                }
                else {
                    f.i(hashMap);
                    f.d(set2);
                }
            }
        }
        else {
            list2 = null;
        }
        if (list2 != null) {
            this.D = list2.toArray(new m[0]);
        }
        if (!set2.isEmpty()) {
            this.B = new HashMap<String, c>();
            for (final String key : set2) {
                c value;
                if (key.startsWith("CUSTOM,")) {
                    final SparseArray sparseArray = new SparseArray();
                    final String key2 = key.split(",")[1];
                    for (final f f2 : this.z) {
                        final HashMap<String, a> e2 = f2.e;
                        if (e2 == null) {
                            continue;
                        }
                        final a a = e2.get(key2);
                        if (a == null) {
                            continue;
                        }
                        sparseArray.append(f2.a, (Object)a);
                    }
                    value = androidx.constraintlayout.motion.utils.c.k(key, (SparseArray<a>)sparseArray);
                }
                else {
                    value = androidx.constraintlayout.motion.utils.c.l(key);
                }
                if (value == null) {
                    continue;
                }
                value.i(key);
                this.B.put(key, value);
            }
            final ArrayList<f> z2 = this.z;
            if (z2 != null) {
                for (final f f3 : z2) {
                    if (f3 instanceof androidx.constraintlayout.motion.widget.g) {
                        f3.a(this.B);
                    }
                }
            }
            this.h.b(this.B, 0);
            this.i.b(this.B, 100);
            for (final String key3 : this.B.keySet()) {
                Label_0676: {
                    if (hashMap.containsKey(key3)) {
                        final Integer n2 = hashMap.get(key3);
                        if (n2 != null) {
                            i = n2;
                            break Label_0676;
                        }
                    }
                    i = 0;
                }
                final c c = this.B.get(key3);
                if (c != null) {
                    c.j(i);
                }
            }
        }
        if (!set.isEmpty()) {
            if (this.A == null) {
                this.A = new HashMap<String, e>();
            }
            for (final String s : set) {
                if (this.A.containsKey(s)) {
                    continue;
                }
                e value2;
                if (s.startsWith("CUSTOM,")) {
                    final SparseArray sparseArray2 = new SparseArray();
                    final String key4 = s.split(",")[1];
                    for (final f f4 : this.z) {
                        final HashMap<String, a> e3 = f4.e;
                        if (e3 == null) {
                            continue;
                        }
                        final a a2 = e3.get(key4);
                        if (a2 == null) {
                            continue;
                        }
                        sparseArray2.append(f4.a, (Object)a2);
                    }
                    value2 = androidx.constraintlayout.motion.utils.e.h(s, (SparseArray<a>)sparseArray2);
                }
                else {
                    value2 = androidx.constraintlayout.motion.utils.e.i(s, n);
                }
                if (value2 == null) {
                    continue;
                }
                value2.e(s);
                this.A.put(s, value2);
            }
            final ArrayList<f> z3 = this.z;
            if (z3 != null) {
                for (final f f5 : z3) {
                    if (f5 instanceof l) {
                        ((l)f5).W(this.A);
                    }
                }
            }
            for (final String key5 : this.A.keySet()) {
                if (hashMap.containsKey(key5)) {
                    i = hashMap.get(key5);
                }
                else {
                    i = 0;
                }
                this.A.get(key5).f(i);
            }
        }
        final int n3 = this.x.size() + 2;
        final t[] array = new t[n3];
        array[0] = this.f;
        array[n3 - 1] = this.g;
        if (this.x.size() > 0 && this.e == -1) {
            this.e = 0;
        }
        final Iterator<t> iterator10 = this.x.iterator();
        i = 1;
        while (iterator10.hasNext()) {
            array[i] = iterator10.next();
            ++i;
        }
        final HashSet<String> set4 = new HashSet<String>();
        for (final String e4 : this.g.U.keySet()) {
            if (this.f.U.containsKey(e4)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("CUSTOM,");
                sb.append(e4);
                if (set2.contains(sb.toString())) {
                    continue;
                }
                set4.add(e4);
            }
        }
        final String[] t = set4.toArray(new String[0]);
        this.t = t;
        this.u = new int[t.length];
        i = 0;
        String[] t2;
        while (true) {
            t2 = this.t;
            if (i >= t2.length) {
                break;
            }
            final String s2 = t2[i];
            this.u[i] = 0;
            a a3;
            int[] u;
            for (j = 0; j < n3; ++j) {
                if (array[j].U.containsKey(s2)) {
                    a3 = array[j].U.get(s2);
                    if (a3 != null) {
                        u = this.u;
                        u[i] += a3.i();
                        break;
                    }
                }
            }
            ++i;
        }
        final boolean b = array[0].Q != androidx.constraintlayout.motion.widget.f.f;
        final int n4 = 18 + t2.length;
        final boolean[] array2 = new boolean[n4];
        for (i = 1; i < n3; ++i) {
            array[i].h(array[i - 1], array2, this.t, b);
        }
        int l = 1;
        i = 0;
        while (l < n4) {
            j = i;
            if (array2[l]) {
                j = i + 1;
            }
            ++l;
            i = j;
        }
        this.q = new int[i];
        i = Math.max(2, i);
        this.r = new double[i];
        this.s = new double[i];
        j = 1;
        int n5 = 0;
        while (j < n4) {
            i = n5;
            if (array2[j]) {
                this.q[n5] = j;
                i = n5 + 1;
            }
            ++j;
            n5 = i;
        }
        final double[][] array3 = new double[n3][this.q.length];
        final double[] array4 = new double[n3];
        for (i = 0; i < n3; ++i) {
            array[i].i(array3[i], this.q);
            array4[i] = array[i].I;
        }
        i = 0;
        while (true) {
            final int[] q = this.q;
            if (i >= q.length) {
                break;
            }
            if (q[i] < androidx.constraintlayout.motion.widget.t.l0.length) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(androidx.constraintlayout.motion.widget.t.l0[this.q[i]]);
                sb2.append(" [");
                String str = sb2.toString();
                StringBuilder sb3;
                for (j = 0; j < n3; ++j) {
                    sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(array3[j][i]);
                    str = sb3.toString();
                }
            }
            ++i;
        }
        this.j = new androidx.constraintlayout.core.motion.utils.b[this.t.length + 1];
        i = 0;
        while (true) {
            final String[] t3 = this.t;
            if (i >= t3.length) {
                break;
            }
            final String s3 = t3[i];
            j = 0;
            double[] original = null;
            int n6 = 0;
            double[][] original2 = null;
            while (j < n3) {
                double[] array5 = original;
                int n7 = n6;
                double[][] array6 = original2;
                if (array[j].u(s3)) {
                    array5 = original;
                    double[][] array7;
                    if ((array7 = original2) == null) {
                        array5 = new double[n3];
                        array7 = new double[n3][array[j].p(s3)];
                    }
                    array5[n6] = array[j].I;
                    array[j].o(s3, array7[n6], 0);
                    n7 = n6 + 1;
                    array6 = array7;
                }
                ++j;
                original = array5;
                n6 = n7;
                original2 = array6;
            }
            final double[] copy = Arrays.copyOf(original, n6);
            final double[][] array8 = Arrays.copyOf(original2, n6);
            final androidx.constraintlayout.core.motion.utils.b[] m = this.j;
            ++i;
            m[i] = androidx.constraintlayout.core.motion.utils.b.a(this.e, copy, array8);
        }
        this.j[0] = androidx.constraintlayout.core.motion.utils.b.a(this.e, array4, array3);
        if (array[0].Q != androidx.constraintlayout.motion.widget.f.f) {
            final int[] array9 = new int[n3];
            final double[] array10 = new double[n3];
            final double[][] array11 = new double[n3][2];
            for (i = 0; i < n3; ++i) {
                array9[i] = array[i].Q;
                array10[i] = array[i].I;
                array11[i][0] = array[i].K;
                array11[i][1] = array[i].L;
            }
            this.k = androidx.constraintlayout.core.motion.utils.b.b(array9, array10, array11);
        }
        float v = Float.NaN;
        this.C = new HashMap<String, b>();
        if (this.z != null) {
            for (final String key6 : set3) {
                final b l2 = androidx.constraintlayout.motion.utils.b.l(key6);
                if (l2 == null) {
                    continue;
                }
                d = v;
                if (l2.k()) {
                    d = v;
                    if (Float.isNaN(v)) {
                        d = this.D();
                    }
                }
                l2.i(key6);
                this.C.put(key6, l2);
                v = d;
            }
            for (final f f6 : this.z) {
                if (f6 instanceof androidx.constraintlayout.motion.widget.h) {
                    ((androidx.constraintlayout.motion.widget.h)f6).a0(this.C);
                }
            }
            final Iterator<b> iterator14 = this.C.values().iterator();
            while (iterator14.hasNext()) {
                iterator14.next().j(v);
            }
        }
    }
    
    public void a(final f e) {
        this.z.add(e);
    }
    
    public void a0(final o o) {
        this.f.I(o, o.f);
        this.g.I(o, o.g);
    }
    
    void b(final ArrayList<f> c) {
        this.z.addAll(c);
    }
    
    void c(final float[] array, final int n) {
        final float n2 = 1.0f / (n - 1);
        final HashMap<String, c> b = this.B;
        if (b != null) {
            final c c = b.get("translationX");
        }
        final HashMap<String, c> b2 = this.B;
        if (b2 != null) {
            final c c2 = b2.get("translationY");
        }
        final HashMap<String, b> c3 = this.C;
        if (c3 != null) {
            final b b3 = c3.get("translationX");
        }
        final HashMap<String, b> c4 = this.C;
        if (c4 != null) {
            final b b4 = c4.get("translationY");
        }
        for (int i = 0; i < n; ++i) {
            final float n3 = i * n2;
            final float n4 = this.n;
            final float n5 = 0.0f;
            float min = n3;
            if (n4 != 1.0f) {
                final float m = this.m;
                float n6 = n3;
                if (n3 < m) {
                    n6 = 0.0f;
                }
                min = n6;
                if (n6 > m) {
                    min = n6;
                    if (n6 < 1.0) {
                        min = Math.min((n6 - m) * n4, 1.0f);
                    }
                }
            }
            double n7 = min;
            d g = this.f.G;
            float j = Float.NaN;
            final Iterator<t> iterator = this.x.iterator();
            float n8 = n5;
            while (iterator.hasNext()) {
                final t t = iterator.next();
                final d g2 = t.G;
                if (g2 != null) {
                    final float k = t.I;
                    if (k < min) {
                        g = g2;
                        n8 = k;
                    }
                    else {
                        if (!Float.isNaN(j)) {
                            continue;
                        }
                        j = t.I;
                    }
                }
            }
            if (g != null) {
                float n9 = j;
                if (Float.isNaN(j)) {
                    n9 = 1.0f;
                }
                final float n10 = n9 - n8;
                n7 = (float)g.a((min - n8) / n10) * n10 + n8;
            }
            this.j[0].d(n7, this.r);
            final androidx.constraintlayout.core.motion.utils.b l = this.k;
            if (l != null) {
                final double[] r = this.r;
                if (r.length > 0) {
                    l.d(n7, r);
                }
            }
            this.f.j(this.q, this.r, array, i * 2);
        }
    }
    
    int d(final float[] array, final int[] array2) {
        if (array != null) {
            final double[] h = this.j[0].h();
            if (array2 != null) {
                final Iterator<t> iterator = this.x.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    array2[n] = iterator.next().V;
                    ++n;
                }
            }
            int i = 0;
            int n2 = 0;
            while (i < h.length) {
                this.j[0].d(h[i], this.r);
                this.f.j(this.q, this.r, array, n2);
                n2 += 2;
                ++i;
            }
            return n2 / 2;
        }
        return 0;
    }
    
    int e(final float[] array, final int[] array2) {
        if (array != null) {
            final double[] h = this.j[0].h();
            if (array2 != null) {
                final Iterator<t> iterator = this.x.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    array2[n] = iterator.next().V;
                    ++n;
                }
            }
            int i = 0;
            int n2 = 0;
            while (i < h.length) {
                this.j[0].d(h[i], this.r);
                this.f.k(h[i], this.q, this.r, array, n2);
                n2 += 2;
                ++i;
            }
            return n2 / 2;
        }
        return 0;
    }
    
    void f(final float[] array, final int n) {
        final float n2 = 1.0f / (n - 1);
        final HashMap<String, c> b = this.B;
        h h = null;
        androidx.constraintlayout.core.motion.utils.o o;
        if (b == null) {
            o = null;
        }
        else {
            o = b.get("translationX");
        }
        final HashMap<String, c> b2 = this.B;
        androidx.constraintlayout.core.motion.utils.o o2;
        if (b2 == null) {
            o2 = null;
        }
        else {
            o2 = b2.get("translationY");
        }
        final HashMap<String, b> c = this.C;
        h h2;
        if (c == null) {
            h2 = null;
        }
        else {
            h2 = c.get("translationX");
        }
        final HashMap<String, b> c2 = this.C;
        if (c2 != null) {
            h = c2.get("translationY");
        }
        for (int i = 0; i < n; ++i) {
            final float n3 = i * n2;
            final float n4 = this.n;
            float min = n3;
            if (n4 != 1.0f) {
                final float m = this.m;
                float n5 = n3;
                if (n3 < m) {
                    n5 = 0.0f;
                }
                min = n5;
                if (n5 > m) {
                    min = n5;
                    if (n5 < 1.0) {
                        min = Math.min((n5 - m) * n4, 1.0f);
                    }
                }
            }
            double n6 = min;
            d g = this.f.G;
            float n7 = Float.NaN;
            final Iterator<t> iterator = this.x.iterator();
            float n8 = 0.0f;
            while (iterator.hasNext()) {
                final t t = iterator.next();
                final d g2 = t.G;
                d d = g;
                float j = n7;
                float k = n8;
                if (g2 != null) {
                    k = t.I;
                    if (k < min) {
                        d = g2;
                        j = n7;
                    }
                    else {
                        d = g;
                        j = n7;
                        k = n8;
                        if (Float.isNaN(n7)) {
                            j = t.I;
                            k = n8;
                            d = g;
                        }
                    }
                }
                g = d;
                n7 = j;
                n8 = k;
            }
            if (g != null) {
                float n9 = n7;
                if (Float.isNaN(n7)) {
                    n9 = 1.0f;
                }
                final float n10 = n9 - n8;
                n6 = (float)g.a((min - n8) / n10) * n10 + n8;
            }
            this.j[0].d(n6, this.r);
            final androidx.constraintlayout.core.motion.utils.b l = this.k;
            if (l != null) {
                final double[] r = this.r;
                if (r.length > 0) {
                    l.d(n6, r);
                }
            }
            final t f = this.f;
            final int[] q = this.q;
            final double[] r2 = this.r;
            int n11 = i * 2;
            f.k(n6, q, r2, array, n11);
            if (h2 != null) {
                array[n11] += h2.a(min);
            }
            else if (o != null) {
                array[n11] += o.a(min);
            }
            if (h != null) {
                ++n11;
                array[n11] += h.a(min);
            }
            else if (o2 != null) {
                ++n11;
                array[n11] += o2.a(min);
            }
        }
    }
    
    void g(float j, final float[] array, final int n) {
        j = this.j(j, null);
        this.j[0].d(j, this.r);
        this.f.s(this.q, this.r, array, n);
    }
    
    void h(final float[] array, final int n) {
        final float n2 = 1.0f / (n - 1);
        for (int i = 0; i < n; ++i) {
            this.j[0].d(this.j(i * n2, null), this.r);
            this.f.s(this.q, this.r, array, i * 8);
        }
    }
    
    void i(final boolean b) {
        if ("button".equals(androidx.constraintlayout.motion.widget.c.k(this.b)) && this.D != null) {
            int n = 0;
            while (true) {
                final m[] d = this.D;
                if (n >= d.length) {
                    break;
                }
                final m m = d[n];
                float n2;
                if (b) {
                    n2 = -100.0f;
                }
                else {
                    n2 = 100.0f;
                }
                m.A(n2, this.b);
                ++n;
            }
        }
    }
    
    public int k() {
        return this.f.R;
    }
    
    int l(final String key, final float[] array, int i) {
        final c c = this.B.get(key);
        if (c == null) {
            return -1;
        }
        for (i = 0; i < array.length; ++i) {
            array[i] = c.a((float)(i / (array.length - 1)));
        }
        return array.length;
    }
    
    public void m(final double n, final float[] array, final float[] a) {
        final double[] array2 = new double[4];
        final double[] array3 = new double[4];
        this.j[0].d(n, array2);
        this.j[0].g(n, array3);
        Arrays.fill(a, 0.0f);
        this.f.l(n, this.q, array2, array, array3, a);
    }
    
    public float n() {
        return this.o;
    }
    
    public float o() {
        return this.p;
    }
    
    void p(float n, final float n2, final float n3, final float[] array) {
        n = this.j(n, this.y);
        final androidx.constraintlayout.core.motion.utils.b[] j = this.j;
        int n4 = 0;
        if (j == null) {
            final t g = this.g;
            n = g.K;
            final t f = this.f;
            final float n5 = n - f.K;
            final float n6 = g.L - f.L;
            final float m = g.M;
            final float i = f.M;
            n = g.N;
            final float n7 = f.N;
            array[0] = n5 * (1.0f - n2) + (m - i + n5) * n2;
            array[1] = n6 * (1.0f - n3) + (n - n7 + n6) * n3;
            return;
        }
        final androidx.constraintlayout.core.motion.utils.b b = j[0];
        final double n8 = n;
        b.g(n8, this.s);
        this.j[0].d(n8, this.r);
        n = this.y[0];
        double[] s;
        while (true) {
            s = this.s;
            if (n4 >= s.length) {
                break;
            }
            s[n4] *= n;
            ++n4;
        }
        final androidx.constraintlayout.core.motion.utils.b k = this.k;
        if (k != null) {
            final double[] r = this.r;
            if (r.length > 0) {
                k.d(n8, r);
                this.k.g(n8, this.s);
                this.f.E(n2, n3, array, this.q, this.s, this.r);
            }
            return;
        }
        this.f.E(n2, n3, array, this.q, s, this.r);
    }
    
    public int q() {
        int n = this.f.H;
        final Iterator<t> iterator = this.x.iterator();
        while (iterator.hasNext()) {
            n = Math.max(n, iterator.next().H);
        }
        return Math.max(n, this.g.H);
    }
    
    public float r() {
        return this.g.N;
    }
    
    public float s() {
        return this.g.M;
    }
    
    public float t() {
        return this.g.K;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" start: x: ");
        sb.append(this.f.K);
        sb.append(" y: ");
        sb.append(this.f.L);
        sb.append(" end: x: ");
        sb.append(this.g.K);
        sb.append(" y: ");
        sb.append(this.g.L);
        return sb.toString();
    }
    
    public float u() {
        return this.g.L;
    }
    
    t w(final int index) {
        return this.x.get(index);
    }
    
    public int x(final int n, final int[] array) {
        final float[] array2 = new float[2];
        final Iterator<f> iterator = this.z.iterator();
        int n2 = 0;
        int n3 = 0;
        while (iterator.hasNext()) {
            final f f = iterator.next();
            final int d = f.d;
            if (d != n && n == -1) {
                continue;
            }
            array[n3] = 0;
            final int n4 = n3 + 1;
            array[n4] = d;
            int n5 = n4 + 1;
            final int a = f.a;
            array[n5] = a;
            final float n6 = a / 100.0f;
            final androidx.constraintlayout.core.motion.utils.b b = this.j[0];
            final double n7 = n6;
            b.d(n7, this.r);
            this.f.k(n7, this.q, this.r, array2, 0);
            ++n5;
            array[n5] = Float.floatToIntBits(array2[0]);
            final int n8 = n5 + 1;
            array[n8] = Float.floatToIntBits(array2[1]);
            int n9 = n8;
            if (f instanceof j) {
                final j j = (j)f;
                n9 = n8 + 1;
                array[n9] = j.O;
                ++n9;
                array[n9] = Float.floatToIntBits(j.K);
                ++n9;
                array[n9] = Float.floatToIntBits(j.L);
            }
            ++n9;
            array[n3] = n9 - n3;
            ++n2;
            n3 = n9;
        }
        return n2;
    }
    
    float y(final int n, float n2, float n3) {
        final t g = this.g;
        final float k = g.K;
        final t f = this.f;
        final float i = f.K;
        final float n4 = k - i;
        final float l = g.L;
        final float j = f.L;
        final float n5 = l - j;
        final float n6 = f.M / 2.0f;
        final float n7 = f.N / 2.0f;
        final float n8 = (float)Math.hypot(n4, n5);
        if (n8 < 1.0E-7) {
            return Float.NaN;
        }
        n2 -= i + n6;
        n3 -= j + n7;
        if ((float)Math.hypot(n2, n3) == 0.0f) {
            return 0.0f;
        }
        final float n9 = n2 * n4 + n3 * n5;
        if (n == 0) {
            return n9 / n8;
        }
        if (n == 1) {
            return (float)Math.sqrt(n8 * n8 - n9 * n9);
        }
        if (n == 2) {
            return n2 / n4;
        }
        if (n == 3) {
            return n3 / n4;
        }
        if (n == 4) {
            return n2 / n5;
        }
        if (n != 5) {
            return 0.0f;
        }
        return n3 / n5;
    }
    
    public int z(final int[] array, final float[] array2) {
        final Iterator<f> iterator = this.z.iterator();
        int n = 0;
        int n2 = 0;
        while (iterator.hasNext()) {
            final f f = iterator.next();
            final int a = f.a;
            array[n] = f.d * 1000 + a;
            final float n3 = a / 100.0f;
            final androidx.constraintlayout.core.motion.utils.b b = this.j[0];
            final double n4 = n3;
            b.d(n4, this.r);
            this.f.k(n4, this.q, this.r, array2, n2);
            n2 += 2;
            ++n;
        }
        return n;
    }
}
