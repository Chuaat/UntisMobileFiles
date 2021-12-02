// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import android.os.Build$VERSION;
import android.content.res.TypedArray;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.j;
import android.util.AttributeSet;
import android.content.Context;
import java.util.HashSet;
import androidx.constraintlayout.motion.utils.c;
import java.util.Iterator;
import android.util.Log;
import androidx.constraintlayout.motion.utils.e;
import androidx.constraintlayout.widget.a;
import java.util.HashMap;

public class l extends f
{
    static final String V = "KeyTimeCycle";
    private static final String W = "KeyTimeCycle";
    public static final String X = "wavePeriod";
    public static final String Y = "waveOffset";
    public static final String Z = "waveShape";
    public static final int a0 = 0;
    public static final int b0 = 1;
    public static final int c0 = 2;
    public static final int d0 = 3;
    public static final int e0 = 4;
    public static final int f0 = 5;
    public static final int g0 = 6;
    public static final int h0 = 3;
    private String D;
    private int E;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private float L;
    private float M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private int R;
    private String S;
    private float T;
    private float U;
    
    public l() {
        this.E = -1;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = Float.NaN;
        this.N = Float.NaN;
        this.O = Float.NaN;
        this.P = Float.NaN;
        this.Q = Float.NaN;
        this.R = 0;
        this.S = null;
        this.T = Float.NaN;
        this.U = 0.0f;
        super.d = 3;
        super.e = new HashMap<String, androidx.constraintlayout.widget.a>();
    }
    
    public void W(final HashMap<String, e> hashMap) {
        for (final String s : hashMap.keySet()) {
            final e e = hashMap.get(s);
            if (e == null) {
                continue;
            }
            final boolean startsWith = s.startsWith("CUSTOM");
            int n = 7;
            if (startsWith) {
                final androidx.constraintlayout.widget.a a = super.e.get(s.substring(7));
                if (a == null) {
                    continue;
                }
                ((e.b)e).k(super.a, a, this.T, this.R, this.U);
            }
            else {
                Label_0442: {
                    switch (s) {
                        case "alpha": {
                            n = 11;
                            break Label_0442;
                        }
                        case "transitionPathRotate": {
                            n = 10;
                            break Label_0442;
                        }
                        case "elevation": {
                            n = 9;
                            break Label_0442;
                        }
                        case "rotation": {
                            n = 8;
                            break Label_0442;
                        }
                        case "scaleY": {
                            break Label_0442;
                        }
                        case "scaleX": {
                            n = 6;
                            break Label_0442;
                        }
                        case "progress": {
                            n = 5;
                            break Label_0442;
                        }
                        case "translationZ": {
                            n = 4;
                            break Label_0442;
                        }
                        case "translationY": {
                            n = 3;
                            break Label_0442;
                        }
                        case "translationX": {
                            n = 2;
                            break Label_0442;
                        }
                        case "rotationY": {
                            n = 1;
                            break Label_0442;
                        }
                        case "rotationX": {
                            n = 0;
                            break Label_0442;
                        }
                        default:
                            break;
                    }
                    n = -1;
                }
                int n2 = 0;
                float n3 = 0.0f;
                switch (n) {
                    default: {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("UNKNOWN addValues \"");
                        sb.append(s);
                        sb.append("\"");
                        Log.e("KeyTimeCycles", sb.toString());
                        continue;
                    }
                    case 11: {
                        if (!Float.isNaN(this.F)) {
                            n2 = super.a;
                            n3 = this.F;
                            break;
                        }
                        continue;
                    }
                    case 10: {
                        if (!Float.isNaN(this.K)) {
                            n2 = super.a;
                            n3 = this.K;
                            break;
                        }
                        continue;
                    }
                    case 9: {
                        if (!Float.isNaN(this.G)) {
                            n2 = super.a;
                            n3 = this.G;
                            break;
                        }
                        continue;
                    }
                    case 8: {
                        if (!Float.isNaN(this.H)) {
                            n2 = super.a;
                            n3 = this.H;
                            break;
                        }
                        continue;
                    }
                    case 7: {
                        if (!Float.isNaN(this.M)) {
                            n2 = super.a;
                            n3 = this.M;
                            break;
                        }
                        continue;
                    }
                    case 6: {
                        if (!Float.isNaN(this.L)) {
                            n2 = super.a;
                            n3 = this.L;
                            break;
                        }
                        continue;
                    }
                    case 5: {
                        if (!Float.isNaN(this.Q)) {
                            n2 = super.a;
                            n3 = this.Q;
                            break;
                        }
                        continue;
                    }
                    case 4: {
                        if (!Float.isNaN(this.P)) {
                            n2 = super.a;
                            n3 = this.P;
                            break;
                        }
                        continue;
                    }
                    case 3: {
                        if (!Float.isNaN(this.O)) {
                            n2 = super.a;
                            n3 = this.O;
                            break;
                        }
                        continue;
                    }
                    case 2: {
                        if (!Float.isNaN(this.N)) {
                            n2 = super.a;
                            n3 = this.N;
                            break;
                        }
                        continue;
                    }
                    case 1: {
                        if (!Float.isNaN(this.J)) {
                            n2 = super.a;
                            n3 = this.J;
                            break;
                        }
                        continue;
                    }
                    case 0: {
                        if (!Float.isNaN(this.I)) {
                            n2 = super.a;
                            n3 = this.I;
                            break;
                        }
                        continue;
                    }
                }
                e.c(n2, n3, this.T, this.R, this.U);
            }
        }
    }
    
    @Override
    public void a(final HashMap<String, c> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }
    
    @Override
    public f b() {
        return new l().c(this);
    }
    
    @Override
    public f c(final f f) {
        super.c(f);
        final l l = (l)f;
        this.D = l.D;
        this.E = l.E;
        this.R = l.R;
        this.T = l.T;
        this.U = l.U;
        this.Q = l.Q;
        this.F = l.F;
        this.G = l.G;
        this.H = l.H;
        this.K = l.K;
        this.I = l.I;
        this.J = l.J;
        this.L = l.L;
        this.M = l.M;
        this.N = l.N;
        this.O = l.O;
        this.P = l.P;
        return this;
    }
    
    public void d(final HashSet<String> set) {
        if (!Float.isNaN(this.F)) {
            set.add("alpha");
        }
        if (!Float.isNaN(this.G)) {
            set.add("elevation");
        }
        if (!Float.isNaN(this.H)) {
            set.add("rotation");
        }
        if (!Float.isNaN(this.I)) {
            set.add("rotationX");
        }
        if (!Float.isNaN(this.J)) {
            set.add("rotationY");
        }
        if (!Float.isNaN(this.N)) {
            set.add("translationX");
        }
        if (!Float.isNaN(this.O)) {
            set.add("translationY");
        }
        if (!Float.isNaN(this.P)) {
            set.add("translationZ");
        }
        if (!Float.isNaN(this.K)) {
            set.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.L)) {
            set.add("scaleX");
        }
        if (!Float.isNaN(this.M)) {
            set.add("scaleY");
        }
        if (!Float.isNaN(this.Q)) {
            set.add("progress");
        }
        if (super.e.size() > 0) {
            for (final String str : super.e.keySet()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("CUSTOM,");
                sb.append(str);
                set.add(sb.toString());
            }
        }
    }
    
    public void f(final Context context, final AttributeSet set) {
        a.a(this, context.obtainStyledAttributes(set, androidx.constraintlayout.widget.j.m.Hf));
    }
    
    @Override
    public void i(final HashMap<String, Integer> hashMap) {
        if (this.E == -1) {
            return;
        }
        if (!Float.isNaN(this.F)) {
            hashMap.put("alpha", this.E);
        }
        if (!Float.isNaN(this.G)) {
            hashMap.put("elevation", this.E);
        }
        if (!Float.isNaN(this.H)) {
            hashMap.put("rotation", this.E);
        }
        if (!Float.isNaN(this.I)) {
            hashMap.put("rotationX", this.E);
        }
        if (!Float.isNaN(this.J)) {
            hashMap.put("rotationY", this.E);
        }
        if (!Float.isNaN(this.N)) {
            hashMap.put("translationX", this.E);
        }
        if (!Float.isNaN(this.O)) {
            hashMap.put("translationY", this.E);
        }
        if (!Float.isNaN(this.P)) {
            hashMap.put("translationZ", this.E);
        }
        if (!Float.isNaN(this.K)) {
            hashMap.put("transitionPathRotate", this.E);
        }
        if (!Float.isNaN(this.L)) {
            hashMap.put("scaleX", this.E);
        }
        if (!Float.isNaN(this.L)) {
            hashMap.put("scaleY", this.E);
        }
        if (!Float.isNaN(this.Q)) {
            hashMap.put("progress", this.E);
        }
        if (super.e.size() > 0) {
            for (final String str : super.e.keySet()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("CUSTOM,");
                sb.append(str);
                hashMap.put(sb.toString(), this.E);
            }
        }
    }
    
    @Override
    public void j(final String s, final Object o) {
        s.hashCode();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1532805160: {
                if (!s.equals("waveShape")) {
                    break;
                }
                n = 16;
                break;
            }
            case 579057826: {
                if (!s.equals("curveFit")) {
                    break;
                }
                n = 15;
                break;
            }
            case 184161818: {
                if (!s.equals("wavePeriod")) {
                    break;
                }
                n = 14;
                break;
            }
            case 156108012: {
                if (!s.equals("waveOffset")) {
                    break;
                }
                n = 13;
                break;
            }
            case 92909918: {
                if (!s.equals("alpha")) {
                    break;
                }
                n = 12;
                break;
            }
            case 37232917: {
                if (!s.equals("transitionPathRotate")) {
                    break;
                }
                n = 11;
                break;
            }
            case -4379043: {
                if (!s.equals("elevation")) {
                    break;
                }
                n = 10;
                break;
            }
            case -40300674: {
                if (!s.equals("rotation")) {
                    break;
                }
                n = 9;
                break;
            }
            case -908189617: {
                if (!s.equals("scaleY")) {
                    break;
                }
                n = 8;
                break;
            }
            case -908189618: {
                if (!s.equals("scaleX")) {
                    break;
                }
                n = 7;
                break;
            }
            case -1225497655: {
                if (!s.equals("translationZ")) {
                    break;
                }
                n = 6;
                break;
            }
            case -1225497656: {
                if (!s.equals("translationY")) {
                    break;
                }
                n = 5;
                break;
            }
            case -1225497657: {
                if (!s.equals("translationX")) {
                    break;
                }
                n = 4;
                break;
            }
            case -1249320805: {
                if (!s.equals("rotationY")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1249320806: {
                if (!s.equals("rotationX")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1812823328: {
                if (!s.equals("transitionEasing")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1913008125: {
                if (!s.equals("motionProgress")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            case 16: {
                if (o instanceof Integer) {
                    this.R = this.n(o);
                    break;
                }
                this.R = 7;
                this.S = o.toString();
                break;
            }
            case 15: {
                this.E = this.n(o);
                break;
            }
            case 14: {
                this.T = this.m(o);
                break;
            }
            case 13: {
                this.U = this.m(o);
                break;
            }
            case 12: {
                this.F = this.m(o);
                break;
            }
            case 11: {
                this.K = this.m(o);
                break;
            }
            case 10: {
                this.G = this.m(o);
                break;
            }
            case 9: {
                this.H = this.m(o);
                break;
            }
            case 8: {
                this.M = this.m(o);
                break;
            }
            case 7: {
                this.L = this.m(o);
                break;
            }
            case 6: {
                this.P = this.m(o);
                break;
            }
            case 5: {
                this.O = this.m(o);
                break;
            }
            case 4: {
                this.N = this.m(o);
                break;
            }
            case 3: {
                this.J = this.m(o);
                break;
            }
            case 2: {
                this.I = this.m(o);
                break;
            }
            case 1: {
                this.D = o.toString();
                break;
            }
            case 0: {
                this.Q = this.m(o);
                break;
            }
        }
    }
    
    private static class a
    {
        private static final int a = 1;
        private static final int b = 2;
        private static final int c = 4;
        private static final int d = 5;
        private static final int e = 6;
        private static final int f = 8;
        private static final int g = 7;
        private static final int h = 9;
        private static final int i = 10;
        private static final int j = 12;
        private static final int k = 13;
        private static final int l = 14;
        private static final int m = 15;
        private static final int n = 16;
        private static final int o = 17;
        private static final int p = 18;
        private static final int q = 19;
        private static final int r = 20;
        private static final int s = 21;
        private static SparseIntArray t;
        
        static {
            (androidx.constraintlayout.motion.widget.l.a.t = new SparseIntArray()).append(androidx.constraintlayout.widget.j.m.If, 1);
            androidx.constraintlayout.motion.widget.l.a.t.append(androidx.constraintlayout.widget.j.m.Rf, 2);
            androidx.constraintlayout.motion.widget.l.a.t.append(androidx.constraintlayout.widget.j.m.Nf, 4);
            androidx.constraintlayout.motion.widget.l.a.t.append(androidx.constraintlayout.widget.j.m.Of, 5);
            androidx.constraintlayout.motion.widget.l.a.t.append(androidx.constraintlayout.widget.j.m.Pf, 6);
            androidx.constraintlayout.motion.widget.l.a.t.append(androidx.constraintlayout.widget.j.m.Lf, 7);
            androidx.constraintlayout.motion.widget.l.a.t.append(androidx.constraintlayout.widget.j.m.Xf, 8);
            androidx.constraintlayout.motion.widget.l.a.t.append(androidx.constraintlayout.widget.j.m.Wf, 9);
            androidx.constraintlayout.motion.widget.l.a.t.append(androidx.constraintlayout.widget.j.m.Vf, 10);
            androidx.constraintlayout.motion.widget.l.a.t.append(androidx.constraintlayout.widget.j.m.Tf, 12);
            androidx.constraintlayout.motion.widget.l.a.t.append(androidx.constraintlayout.widget.j.m.Sf, 13);
            androidx.constraintlayout.motion.widget.l.a.t.append(androidx.constraintlayout.widget.j.m.Mf, 14);
            androidx.constraintlayout.motion.widget.l.a.t.append(androidx.constraintlayout.widget.j.m.Jf, 15);
            androidx.constraintlayout.motion.widget.l.a.t.append(androidx.constraintlayout.widget.j.m.Kf, 16);
            androidx.constraintlayout.motion.widget.l.a.t.append(androidx.constraintlayout.widget.j.m.Qf, 17);
            androidx.constraintlayout.motion.widget.l.a.t.append(androidx.constraintlayout.widget.j.m.Uf, 18);
            androidx.constraintlayout.motion.widget.l.a.t.append(androidx.constraintlayout.widget.j.m.ag, 20);
            androidx.constraintlayout.motion.widget.l.a.t.append(androidx.constraintlayout.widget.j.m.Zf, 21);
            androidx.constraintlayout.motion.widget.l.a.t.append(androidx.constraintlayout.widget.j.m.cg, 19);
        }
        
        public static void a(final l l, final TypedArray typedArray) {
            for (int indexCount = typedArray.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = typedArray.getIndex(i);
                switch (androidx.constraintlayout.motion.widget.l.a.t.get(index)) {
                    default: {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(androidx.constraintlayout.motion.widget.l.a.t.get(index));
                        Log.e("KeyTimeCycle", sb.toString());
                        break;
                    }
                    case 21: {
                        float n;
                        if (typedArray.peekValue(index).type == 5) {
                            n = typedArray.getDimension(index, l.U);
                        }
                        else {
                            n = typedArray.getFloat(index, l.U);
                        }
                        l.U = n;
                        break;
                    }
                    case 20: {
                        l.T = typedArray.getFloat(index, l.T);
                        break;
                    }
                    case 19: {
                        int int1;
                        if (typedArray.peekValue(index).type == 3) {
                            l.S = typedArray.getString(index);
                            int1 = 7;
                        }
                        else {
                            int1 = typedArray.getInt(index, l.R);
                        }
                        l.R = int1;
                        break;
                    }
                    case 18: {
                        l.Q = typedArray.getFloat(index, l.Q);
                        break;
                    }
                    case 17: {
                        if (Build$VERSION.SDK_INT >= 21) {
                            l.P = typedArray.getDimension(index, l.P);
                            break;
                        }
                        break;
                    }
                    case 16: {
                        l.O = typedArray.getDimension(index, l.O);
                        break;
                    }
                    case 15: {
                        l.N = typedArray.getDimension(index, l.N);
                        break;
                    }
                    case 14: {
                        l.M = typedArray.getFloat(index, l.M);
                        break;
                    }
                    case 13: {
                        l.E = typedArray.getInteger(index, l.E);
                        break;
                    }
                    case 12: {
                        l.a = typedArray.getInt(index, l.a);
                        break;
                    }
                    case 10: {
                        if (androidx.constraintlayout.motion.widget.s.c2) {
                            if ((l.b = typedArray.getResourceId(index, l.b)) != -1) {
                                break;
                            }
                        }
                        else if (typedArray.peekValue(index).type != 3) {
                            l.b = typedArray.getResourceId(index, l.b);
                            break;
                        }
                        l.c = typedArray.getString(index);
                        break;
                    }
                    case 9: {
                        l.D = typedArray.getString(index);
                        break;
                    }
                    case 8: {
                        l.K = typedArray.getFloat(index, l.K);
                        break;
                    }
                    case 7: {
                        l.L = typedArray.getFloat(index, l.L);
                        break;
                    }
                    case 6: {
                        l.J = typedArray.getFloat(index, l.J);
                        break;
                    }
                    case 5: {
                        l.I = typedArray.getFloat(index, l.I);
                        break;
                    }
                    case 4: {
                        l.H = typedArray.getFloat(index, l.H);
                        break;
                    }
                    case 2: {
                        l.G = typedArray.getDimension(index, l.G);
                        break;
                    }
                    case 1: {
                        l.F = typedArray.getFloat(index, l.F);
                        break;
                    }
                }
            }
        }
    }
}
