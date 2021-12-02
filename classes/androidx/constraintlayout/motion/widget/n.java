// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import java.util.HashSet;
import androidx.constraintlayout.widget.e;
import android.os.Build$VERSION;
import android.view.View;
import java.util.Iterator;
import android.util.Log;
import androidx.constraintlayout.motion.utils.c;
import java.util.HashMap;
import androidx.constraintlayout.widget.a;
import java.util.LinkedHashMap;
import androidx.constraintlayout.core.motion.utils.d;

class n implements Comparable<n>
{
    public static final String j0 = "MotionPaths";
    public static final boolean k0 = false;
    static final int l0 = 1;
    static final int m0 = 2;
    static String[] n0;
    private float G;
    int H;
    int I;
    private boolean J;
    private float K;
    private float L;
    private float M;
    public float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private float S;
    private float T;
    private float U;
    private d V;
    private int W;
    private float X;
    private float Y;
    private float Z;
    private float a0;
    private float b0;
    private float c0;
    private float d0;
    private int e0;
    LinkedHashMap<String, a> f0;
    int g0;
    double[] h0;
    double[] i0;
    
    static {
        n.n0 = new String[] { "position", "x", "y", "width", "height", "pathRotate" };
    }
    
    public n() {
        this.G = 1.0f;
        this.H = 0;
        this.J = false;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = 1.0f;
        this.P = 1.0f;
        this.Q = Float.NaN;
        this.R = Float.NaN;
        this.S = 0.0f;
        this.T = 0.0f;
        this.U = 0.0f;
        this.W = 0;
        this.c0 = Float.NaN;
        this.d0 = Float.NaN;
        this.e0 = -1;
        this.f0 = new LinkedHashMap<String, a>();
        this.g0 = 0;
        this.h0 = new double[18];
        this.i0 = new double[18];
    }
    
    private boolean h(final float n, final float n2) {
        final boolean naN = Float.isNaN(n);
        final boolean b = true;
        boolean b2 = true;
        if (!naN && !Float.isNaN(n2)) {
            if (Math.abs(n - n2) <= 1.0E-6f) {
                b2 = false;
            }
            return b2;
        }
        return Float.isNaN(n) != Float.isNaN(n2) && b;
    }
    
    public void b(final HashMap<String, c> hashMap, final int i) {
        for (final String str : hashMap.keySet()) {
            final c obj = hashMap.get(str);
            str.hashCode();
            int n = -1;
            switch (str) {
                case "alpha": {
                    n = 13;
                    break;
                }
                case "transitionPathRotate": {
                    n = 12;
                    break;
                }
                case "elevation": {
                    n = 11;
                    break;
                }
                case "rotation": {
                    n = 10;
                    break;
                }
                case "transformPivotY": {
                    n = 9;
                    break;
                }
                case "transformPivotX": {
                    n = 8;
                    break;
                }
                case "scaleY": {
                    n = 7;
                    break;
                }
                case "scaleX": {
                    n = 6;
                    break;
                }
                case "progress": {
                    n = 5;
                    break;
                }
                case "translationZ": {
                    n = 4;
                    break;
                }
                case "translationY": {
                    n = 3;
                    break;
                }
                case "translationX": {
                    n = 2;
                    break;
                }
                case "rotationY": {
                    n = 1;
                    break;
                }
                case "rotationX": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            final float n2 = 1.0f;
            float n3 = 0.0f;
            Label_0785: {
                float n4 = 0.0f;
                switch (n) {
                    default: {
                        String s2;
                        if (str.startsWith("CUSTOM")) {
                            final String s = str.split(",")[1];
                            if (!this.f0.containsKey(s)) {
                                continue;
                            }
                            final a a = this.f0.get(s);
                            if (obj instanceof c.b) {
                                ((c.b)obj).n(i, a);
                                continue;
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(" ViewSpline not a CustomSet frame = ");
                            sb.append(i);
                            sb.append(", value");
                            sb.append(a.f());
                            sb.append(obj);
                            s2 = sb.toString();
                        }
                        else {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("UNKNOWN spline ");
                            sb2.append(str);
                            s2 = sb2.toString();
                        }
                        Log.e("MotionPaths", s2);
                        continue;
                    }
                    case 13: {
                        if (Float.isNaN(this.G)) {
                            n4 = n2;
                            break;
                        }
                        n4 = this.G;
                        break;
                    }
                    case 12: {
                        if (Float.isNaN(this.c0)) {
                            break Label_0785;
                        }
                        n3 = this.c0;
                        break Label_0785;
                    }
                    case 11: {
                        if (Float.isNaN(this.K)) {
                            break Label_0785;
                        }
                        n3 = this.K;
                        break Label_0785;
                    }
                    case 10: {
                        if (Float.isNaN(this.L)) {
                            break Label_0785;
                        }
                        n3 = this.L;
                        break Label_0785;
                    }
                    case 9: {
                        if (Float.isNaN(this.R)) {
                            break Label_0785;
                        }
                        n3 = this.R;
                        break Label_0785;
                    }
                    case 8: {
                        if (Float.isNaN(this.Q)) {
                            break Label_0785;
                        }
                        n3 = this.Q;
                        break Label_0785;
                    }
                    case 7: {
                        if (Float.isNaN(this.P)) {
                            n4 = n2;
                            break;
                        }
                        n4 = this.P;
                        break;
                    }
                    case 6: {
                        if (Float.isNaN(this.O)) {
                            n4 = n2;
                            break;
                        }
                        n4 = this.O;
                        break;
                    }
                    case 5: {
                        if (Float.isNaN(this.d0)) {
                            break Label_0785;
                        }
                        n3 = this.d0;
                        break Label_0785;
                    }
                    case 4: {
                        if (Float.isNaN(this.U)) {
                            break Label_0785;
                        }
                        n3 = this.U;
                        break Label_0785;
                    }
                    case 3: {
                        if (Float.isNaN(this.T)) {
                            break Label_0785;
                        }
                        n3 = this.T;
                        break Label_0785;
                    }
                    case 2: {
                        if (Float.isNaN(this.S)) {
                            break Label_0785;
                        }
                        n3 = this.S;
                        break Label_0785;
                    }
                    case 1: {
                        if (Float.isNaN(this.N)) {
                            break Label_0785;
                        }
                        n3 = this.N;
                        break Label_0785;
                    }
                    case 0: {
                        if (Float.isNaN(this.M)) {
                            break Label_0785;
                        }
                        n3 = this.M;
                        break Label_0785;
                    }
                }
                obj.g(i, n4);
                continue;
            }
            obj.g(i, n3);
        }
    }
    
    public void d(final View view) {
        this.I = view.getVisibility();
        float alpha;
        if (view.getVisibility() != 0) {
            alpha = 0.0f;
        }
        else {
            alpha = view.getAlpha();
        }
        this.G = alpha;
        this.J = false;
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 21) {
            this.K = view.getElevation();
        }
        this.L = view.getRotation();
        this.M = view.getRotationX();
        this.N = view.getRotationY();
        this.O = view.getScaleX();
        this.P = view.getScaleY();
        this.Q = view.getPivotX();
        this.R = view.getPivotY();
        this.S = view.getTranslationX();
        this.T = view.getTranslationY();
        if (sdk_INT >= 21) {
            this.U = view.getTranslationZ();
        }
    }
    
    public void f(final e.a a) {
        final e.d c = a.c;
        final int c2 = c.c;
        this.H = c2;
        final int b = c.b;
        this.I = b;
        float d;
        if (b != 0 && c2 == 0) {
            d = 0.0f;
        }
        else {
            d = c.d;
        }
        this.G = d;
        final e.e f = a.f;
        this.J = f.m;
        this.K = f.n;
        this.L = f.b;
        this.M = f.c;
        this.N = f.d;
        this.O = f.e;
        this.P = f.f;
        this.Q = f.g;
        this.R = f.h;
        this.S = f.j;
        this.T = f.k;
        this.U = f.l;
        this.V = androidx.constraintlayout.core.motion.utils.d.c(a.d.d);
        final e.c d2 = a.d;
        this.c0 = d2.i;
        this.W = d2.f;
        this.e0 = d2.b;
        this.d0 = a.c.e;
        for (final String s : a.g.keySet()) {
            final a value = a.g.get(s);
            if (value.h()) {
                this.f0.put(s, value);
            }
        }
    }
    
    public int g(final n n) {
        return Float.compare(this.X, n.X);
    }
    
    void i(final n n, final HashSet<String> set) {
        if (this.h(this.G, n.G)) {
            set.add("alpha");
        }
        if (this.h(this.K, n.K)) {
            set.add("elevation");
        }
        final int i = this.I;
        final int j = n.I;
        if (i != j && this.H == 0 && (i == 0 || j == 0)) {
            set.add("alpha");
        }
        if (this.h(this.L, n.L)) {
            set.add("rotation");
        }
        if (!Float.isNaN(this.c0) || !Float.isNaN(n.c0)) {
            set.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.d0) || !Float.isNaN(n.d0)) {
            set.add("progress");
        }
        if (this.h(this.M, n.M)) {
            set.add("rotationX");
        }
        if (this.h(this.N, n.N)) {
            set.add("rotationY");
        }
        if (this.h(this.Q, n.Q)) {
            set.add("transformPivotX");
        }
        if (this.h(this.R, n.R)) {
            set.add("transformPivotY");
        }
        if (this.h(this.O, n.O)) {
            set.add("scaleX");
        }
        if (this.h(this.P, n.P)) {
            set.add("scaleY");
        }
        if (this.h(this.S, n.S)) {
            set.add("translationX");
        }
        if (this.h(this.T, n.T)) {
            set.add("translationY");
        }
        if (this.h(this.U, n.U)) {
            set.add("translationZ");
        }
    }
    
    void j(final n n, final boolean[] array, final String[] array2) {
        array[0] |= this.h(this.X, n.X);
        array[1] |= this.h(this.Y, n.Y);
        array[2] |= this.h(this.Z, n.Z);
        array[3] |= this.h(this.a0, n.a0);
        array[4] |= this.h(this.b0, n.b0);
    }
    
    void k(final double[] array, final int[] array2) {
        final float x = this.X;
        int i = 0;
        final float y = this.Y;
        final float z = this.Z;
        final float a0 = this.a0;
        final float b0 = this.b0;
        final float g = this.G;
        final float k = this.K;
        final float l = this.L;
        final float m = this.M;
        final float n = this.N;
        final float o = this.O;
        final float p2 = this.P;
        final float q = this.Q;
        final float r = this.R;
        final float s = this.S;
        final float t = this.T;
        final float u = this.U;
        final float c0 = this.c0;
        int n2 = 0;
        while (i < array2.length) {
            int n3 = n2;
            if (array2[i] < 18) {
                array[n2] = (new float[] { x, y, z, a0, b0, g, k, l, m, n, o, p2, q, r, s, t, u, c0 })[array2[i]];
                n3 = n2 + 1;
            }
            ++i;
            n2 = n3;
        }
    }
    
    int l(final String key, final double[] array, int n) {
        final a a = this.f0.get(key);
        if (a.i() == 1) {
            array[n] = a.f();
            return 1;
        }
        final int i = a.i();
        final float[] array2 = new float[i];
        a.g(array2);
        for (int j = 0; j < i; ++j, ++n) {
            array[n] = array2[j];
        }
        return i;
    }
    
    int m(final String key) {
        return this.f0.get(key).i();
    }
    
    boolean o(final String key) {
        return this.f0.containsKey(key);
    }
    
    void p(final float y, final float z, final float a0, final float b0) {
        this.Y = y;
        this.Z = z;
        this.a0 = a0;
        this.b0 = b0;
    }
    
    public void s(final Rect rect, final View view, final int n, float l) {
        this.p((float)rect.left, (float)rect.top, (float)rect.width(), (float)rect.height());
        this.d(view);
        this.Q = Float.NaN;
        this.R = Float.NaN;
        if (n != 1) {
            if (n != 2) {
                return;
            }
            l += 90.0f;
        }
        else {
            l -= 90.0f;
        }
        this.L = l;
    }
    
    public void u(final Rect rect, final e e, final int n, final int n2) {
        this.p((float)rect.left, (float)rect.top, (float)rect.width(), (float)rect.height());
        this.f(e.q0(n2));
        float n3 = 90.0f;
        float l = 0.0f;
        Label_0101: {
            Label_0095: {
                if (n != 1) {
                    if (n != 2) {
                        if (n == 3) {
                            break Label_0095;
                        }
                        if (n != 4) {
                            return;
                        }
                    }
                    l = this.L + 90.0f;
                    this.L = l;
                    if (l > 180.0f) {
                        n3 = 360.0f;
                        break Label_0101;
                    }
                    return;
                }
            }
            l = this.L;
        }
        this.L = l - n3;
    }
    
    public void v(final View view) {
        this.p(view.getX(), view.getY(), (float)view.getWidth(), (float)view.getHeight());
        this.d(view);
    }
}
