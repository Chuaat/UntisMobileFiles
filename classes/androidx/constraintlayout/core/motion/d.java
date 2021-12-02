// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.m;
import java.util.HashSet;
import java.util.Iterator;
import androidx.constraintlayout.core.motion.utils.c0;
import androidx.constraintlayout.core.motion.utils.o;
import java.util.HashMap;
import java.util.LinkedHashMap;

class d implements Comparable<d>
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
    private androidx.constraintlayout.core.motion.utils.d V;
    private int W;
    private float X;
    private float Y;
    private float Z;
    private float a0;
    private float b0;
    private float c0;
    private float d0;
    private int e0;
    LinkedHashMap<String, b> f0;
    int g0;
    double[] h0;
    double[] i0;
    
    static {
        d.n0 = new String[] { "position", "x", "y", "width", "height", "pathRotate" };
    }
    
    public d() {
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
        this.f0 = new LinkedHashMap<String, b>();
        this.g0 = 0;
        this.h0 = new double[18];
        this.i0 = new double[18];
    }
    
    private boolean g(final float n, final float n2) {
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
    
    public void b(final HashMap<String, o> hashMap, final int i) {
        for (final String str : hashMap.keySet()) {
            final o obj = hashMap.get(str);
            str.hashCode();
            int n = -1;
            switch (str) {
                case "pathRotate": {
                    n = 12;
                    break;
                }
                case "alpha": {
                    n = 11;
                    break;
                }
                case "scaleY": {
                    n = 10;
                    break;
                }
                case "scaleX": {
                    n = 9;
                    break;
                }
                case "pivotY": {
                    n = 8;
                    break;
                }
                case "pivotX": {
                    n = 7;
                    break;
                }
                case "progress": {
                    n = 6;
                    break;
                }
                case "translationZ": {
                    n = 5;
                    break;
                }
                case "translationY": {
                    n = 4;
                    break;
                }
                case "translationX": {
                    n = 3;
                    break;
                }
                case "rotationZ": {
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
            Label_0936: {
                float n4 = 0.0f;
                switch (n) {
                    default: {
                        String s2;
                        if (str.startsWith("CUSTOM")) {
                            final String s = str.split(",")[1];
                            if (!this.f0.containsKey(s)) {
                                continue;
                            }
                            final b b = this.f0.get(s);
                            if (obj instanceof o.c) {
                                ((o.c)obj).k(i, b);
                                continue;
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(" ViewSpline not a CustomSet frame = ");
                            sb.append(i);
                            sb.append(", value");
                            sb.append(b.n());
                            sb.append(obj);
                            s2 = sb.toString();
                        }
                        else {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("UNKNOWN spline ");
                            sb2.append(str);
                            s2 = sb2.toString();
                        }
                        androidx.constraintlayout.core.motion.utils.c0.f("MotionPaths", s2);
                        continue;
                    }
                    case 12: {
                        if (Float.isNaN(this.c0)) {
                            break Label_0936;
                        }
                        n3 = this.c0;
                        break Label_0936;
                    }
                    case 11: {
                        if (Float.isNaN(this.G)) {
                            n4 = n2;
                            break;
                        }
                        n4 = this.G;
                        break;
                    }
                    case 10: {
                        if (Float.isNaN(this.P)) {
                            n4 = n2;
                            break;
                        }
                        n4 = this.P;
                        break;
                    }
                    case 9: {
                        if (Float.isNaN(this.O)) {
                            n4 = n2;
                            break;
                        }
                        n4 = this.O;
                        break;
                    }
                    case 8: {
                        if (Float.isNaN(this.R)) {
                            break Label_0936;
                        }
                        n3 = this.R;
                        break Label_0936;
                    }
                    case 7: {
                        if (Float.isNaN(this.Q)) {
                            break Label_0936;
                        }
                        n3 = this.Q;
                        break Label_0936;
                    }
                    case 6: {
                        if (Float.isNaN(this.d0)) {
                            break Label_0936;
                        }
                        n3 = this.d0;
                        break Label_0936;
                    }
                    case 5: {
                        if (Float.isNaN(this.U)) {
                            break Label_0936;
                        }
                        n3 = this.U;
                        break Label_0936;
                    }
                    case 4: {
                        if (Float.isNaN(this.T)) {
                            break Label_0936;
                        }
                        n3 = this.T;
                        break Label_0936;
                    }
                    case 3: {
                        if (Float.isNaN(this.S)) {
                            break Label_0936;
                        }
                        n3 = this.S;
                        break Label_0936;
                    }
                    case 2: {
                        if (Float.isNaN(this.L)) {
                            break Label_0936;
                        }
                        n3 = this.L;
                        break Label_0936;
                    }
                    case 1: {
                        if (Float.isNaN(this.N)) {
                            break Label_0936;
                        }
                        n3 = this.N;
                        break Label_0936;
                    }
                    case 0: {
                        if (Float.isNaN(this.M)) {
                            break Label_0936;
                        }
                        n3 = this.M;
                        break Label_0936;
                    }
                }
                obj.g(i, n4);
                continue;
            }
            obj.g(i, n3);
        }
    }
    
    public void d(final f f) {
        this.I = f.B();
        float g;
        if (f.B() != 4) {
            g = 0.0f;
        }
        else {
            g = f.g();
        }
        this.G = g;
        this.J = false;
        this.L = f.t();
        this.M = f.r();
        this.N = f.s();
        this.O = f.u();
        this.P = f.v();
        this.Q = f.o();
        this.R = f.p();
        this.S = f.x();
        this.T = f.y();
        this.U = f.z();
        for (final String key : f.j()) {
            final b i = f.i(key);
            if (i != null && i.q()) {
                this.f0.put(key, i);
            }
        }
    }
    
    public int f(final d d) {
        return Float.compare(this.X, d.X);
    }
    
    void h(final d d, final HashSet<String> set) {
        if (this.g(this.G, d.G)) {
            set.add("alpha");
        }
        if (this.g(this.K, d.K)) {
            set.add("translationZ");
        }
        final int i = this.I;
        final int j = d.I;
        if (i != j && this.H == 0 && (i == 4 || j == 4)) {
            set.add("alpha");
        }
        if (this.g(this.L, d.L)) {
            set.add("rotationZ");
        }
        if (!Float.isNaN(this.c0) || !Float.isNaN(d.c0)) {
            set.add("pathRotate");
        }
        if (!Float.isNaN(this.d0) || !Float.isNaN(d.d0)) {
            set.add("progress");
        }
        if (this.g(this.M, d.M)) {
            set.add("rotationX");
        }
        if (this.g(this.N, d.N)) {
            set.add("rotationY");
        }
        if (this.g(this.Q, d.Q)) {
            set.add("pivotX");
        }
        if (this.g(this.R, d.R)) {
            set.add("pivotY");
        }
        if (this.g(this.O, d.O)) {
            set.add("scaleX");
        }
        if (this.g(this.P, d.P)) {
            set.add("scaleY");
        }
        if (this.g(this.S, d.S)) {
            set.add("translationX");
        }
        if (this.g(this.T, d.T)) {
            set.add("translationY");
        }
        if (this.g(this.U, d.U)) {
            set.add("translationZ");
        }
        if (this.g(this.K, d.K)) {
            set.add("elevation");
        }
    }
    
    void i(final d d, final boolean[] array, final String[] array2) {
        array[0] |= this.g(this.X, d.X);
        array[1] |= this.g(this.Y, d.Y);
        array[2] |= this.g(this.Z, d.Z);
        array[3] |= this.g(this.a0, d.a0);
        array[4] |= this.g(this.b0, d.b0);
    }
    
    void j(final double[] array, final int[] array2) {
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
    
    int k(final String key, final double[] array, int n) {
        final b b = this.f0.get(key);
        if (b.r() == 1) {
            array[n] = b.n();
            return 1;
        }
        final int r = b.r();
        final float[] array2 = new float[r];
        b.o(array2);
        for (int i = 0; i < r; ++i, ++n) {
            array[n] = array2[i];
        }
        return r;
    }
    
    int l(final String key) {
        return this.f0.get(key).r();
    }
    
    boolean m(final String key) {
        return this.f0.containsKey(key);
    }
    
    void o(final float y, final float z, final float a0, final float b0) {
        this.Y = y;
        this.Z = z;
        this.a0 = a0;
        this.b0 = b0;
    }
    
    public void p(final f f) {
        this.o((float)f.E(), (float)f.F(), (float)f.D(), (float)f.k());
        this.d(f);
    }
    
    public void s(final m m, final f f, final int n, float l) {
        this.o((float)m.b, (float)m.d, (float)m.b(), (float)m.a());
        this.d(f);
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
}
