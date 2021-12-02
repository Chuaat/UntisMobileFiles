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
import androidx.constraintlayout.motion.utils.b;
import java.util.Iterator;
import android.util.Log;
import androidx.constraintlayout.motion.utils.c;
import androidx.constraintlayout.widget.a;
import java.util.HashMap;

public class h extends f
{
    private static final String X = "KeyCycle";
    static final String Y = "KeyCycle";
    public static final String Z = "wavePeriod";
    public static final String a0 = "waveOffset";
    public static final String b0 = "wavePhase";
    public static final String c0 = "waveShape";
    public static final int d0 = 0;
    public static final int e0 = 1;
    public static final int f0 = 2;
    public static final int g0 = 3;
    public static final int h0 = 4;
    public static final int i0 = 5;
    public static final int j0 = 6;
    public static final int k0 = 4;
    private String D;
    private int E;
    private int F;
    private String G;
    private float H;
    private float I;
    private float J;
    private float K;
    private int L;
    private float M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private float S;
    private float T;
    private float U;
    private float V;
    private float W;
    
    public h() {
        this.D = null;
        this.E = 0;
        this.F = -1;
        this.G = null;
        this.H = Float.NaN;
        this.I = 0.0f;
        this.J = 0.0f;
        this.K = Float.NaN;
        this.L = -1;
        this.M = Float.NaN;
        this.N = Float.NaN;
        this.O = Float.NaN;
        this.P = Float.NaN;
        this.Q = Float.NaN;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        super.d = 4;
        super.e = new HashMap<String, androidx.constraintlayout.widget.a>();
    }
    
    @Override
    public void a(final HashMap<String, c> hashMap) {
        final StringBuilder sb = new StringBuilder();
        sb.append("add ");
        sb.append(hashMap.size());
        sb.append(" values");
        androidx.constraintlayout.motion.widget.c.n("KeyCycle", sb.toString(), 2);
        for (final String s : hashMap.keySet()) {
            final c c = hashMap.get(s);
            if (c == null) {
                continue;
            }
            s.hashCode();
            int n = -1;
            switch (s) {
                case "wavePhase": {
                    n = 13;
                    break;
                }
                case "waveOffset": {
                    n = 12;
                    break;
                }
                case "alpha": {
                    n = 11;
                    break;
                }
                case "transitionPathRotate": {
                    n = 10;
                    break;
                }
                case "elevation": {
                    n = 9;
                    break;
                }
                case "rotation": {
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
            int n2 = 0;
            float n3 = 0.0f;
            switch (n) {
                default: {
                    if (!s.startsWith("CUSTOM")) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("  UNKNOWN  ");
                        sb2.append(s);
                        Log.v("WARNING KeyCycle", sb2.toString());
                        continue;
                    }
                    continue;
                }
                case 13: {
                    n2 = super.a;
                    n3 = this.J;
                    break;
                }
                case 12: {
                    n2 = super.a;
                    n3 = this.I;
                    break;
                }
                case 11: {
                    n2 = super.a;
                    n3 = this.M;
                    break;
                }
                case 10: {
                    n2 = super.a;
                    n3 = this.P;
                    break;
                }
                case 9: {
                    n2 = super.a;
                    n3 = this.N;
                    break;
                }
                case 8: {
                    n2 = super.a;
                    n3 = this.O;
                    break;
                }
                case 7: {
                    n2 = super.a;
                    n3 = this.T;
                    break;
                }
                case 6: {
                    n2 = super.a;
                    n3 = this.S;
                    break;
                }
                case 5: {
                    n2 = super.a;
                    n3 = this.K;
                    break;
                }
                case 4: {
                    n2 = super.a;
                    n3 = this.W;
                    break;
                }
                case 3: {
                    n2 = super.a;
                    n3 = this.V;
                    break;
                }
                case 2: {
                    n2 = super.a;
                    n3 = this.U;
                    break;
                }
                case 1: {
                    n2 = super.a;
                    n3 = this.R;
                    break;
                }
                case 0: {
                    n2 = super.a;
                    n3 = this.Q;
                    break;
                }
            }
            c.g(n2, n3);
        }
    }
    
    public void a0(final HashMap<String, b> hashMap) {
        for (final String s : hashMap.keySet()) {
            if (s.startsWith("CUSTOM")) {
                final androidx.constraintlayout.widget.a a = super.e.get(s.substring(7));
                if (a == null) {
                    continue;
                }
                if (a.e() != androidx.constraintlayout.widget.a.b.H) {
                    continue;
                }
                final b b = hashMap.get(s);
                if (b == null) {
                    continue;
                }
                b.g(super.a, this.F, this.G, this.L, this.H, this.I, this.J, a.f(), a);
            }
            else {
                final float b2 = this.b0(s);
                if (Float.isNaN(b2)) {
                    continue;
                }
                final b b3 = hashMap.get(s);
                if (b3 == null) {
                    continue;
                }
                b3.f(super.a, this.F, this.G, this.L, this.H, this.I, this.J, b2);
            }
        }
    }
    
    @Override
    public f b() {
        return new h().c(this);
    }
    
    public float b0(final String str) {
        str.hashCode();
        final int hashCode = str.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1530034690: {
                if (!str.equals("wavePhase")) {
                    break;
                }
                n = 13;
                break;
            }
            case 156108012: {
                if (!str.equals("waveOffset")) {
                    break;
                }
                n = 12;
                break;
            }
            case 92909918: {
                if (!str.equals("alpha")) {
                    break;
                }
                n = 11;
                break;
            }
            case 37232917: {
                if (!str.equals("transitionPathRotate")) {
                    break;
                }
                n = 10;
                break;
            }
            case -4379043: {
                if (!str.equals("elevation")) {
                    break;
                }
                n = 9;
                break;
            }
            case -40300674: {
                if (!str.equals("rotation")) {
                    break;
                }
                n = 8;
                break;
            }
            case -908189617: {
                if (!str.equals("scaleY")) {
                    break;
                }
                n = 7;
                break;
            }
            case -908189618: {
                if (!str.equals("scaleX")) {
                    break;
                }
                n = 6;
                break;
            }
            case -1001078227: {
                if (!str.equals("progress")) {
                    break;
                }
                n = 5;
                break;
            }
            case -1225497655: {
                if (!str.equals("translationZ")) {
                    break;
                }
                n = 4;
                break;
            }
            case -1225497656: {
                if (!str.equals("translationY")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1225497657: {
                if (!str.equals("translationX")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1249320805: {
                if (!str.equals("rotationY")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1249320806: {
                if (!str.equals("rotationX")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                if (!str.startsWith("CUSTOM")) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("  UNKNOWN  ");
                    sb.append(str);
                    Log.v("WARNING! KeyCycle", sb.toString());
                }
                return Float.NaN;
            }
            case 13: {
                return this.J;
            }
            case 12: {
                return this.I;
            }
            case 11: {
                return this.M;
            }
            case 10: {
                return this.P;
            }
            case 9: {
                return this.N;
            }
            case 8: {
                return this.O;
            }
            case 7: {
                return this.T;
            }
            case 6: {
                return this.S;
            }
            case 5: {
                return this.K;
            }
            case 4: {
                return this.W;
            }
            case 3: {
                return this.V;
            }
            case 2: {
                return this.U;
            }
            case 1: {
                return this.R;
            }
            case 0: {
                return this.Q;
            }
        }
    }
    
    @Override
    public f c(final f f) {
        super.c(f);
        final h h = (h)f;
        this.D = h.D;
        this.E = h.E;
        this.F = h.F;
        this.G = h.G;
        this.H = h.H;
        this.I = h.I;
        this.J = h.J;
        this.K = h.K;
        this.L = h.L;
        this.M = h.M;
        this.N = h.N;
        this.O = h.O;
        this.P = h.P;
        this.Q = h.Q;
        this.R = h.R;
        this.S = h.S;
        this.T = h.T;
        this.U = h.U;
        this.V = h.V;
        this.W = h.W;
        return this;
    }
    
    public void d(final HashSet<String> set) {
        if (!Float.isNaN(this.M)) {
            set.add("alpha");
        }
        if (!Float.isNaN(this.N)) {
            set.add("elevation");
        }
        if (!Float.isNaN(this.O)) {
            set.add("rotation");
        }
        if (!Float.isNaN(this.Q)) {
            set.add("rotationX");
        }
        if (!Float.isNaN(this.R)) {
            set.add("rotationY");
        }
        if (!Float.isNaN(this.S)) {
            set.add("scaleX");
        }
        if (!Float.isNaN(this.T)) {
            set.add("scaleY");
        }
        if (!Float.isNaN(this.P)) {
            set.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.U)) {
            set.add("translationX");
        }
        if (!Float.isNaN(this.V)) {
            set.add("translationY");
        }
        if (!Float.isNaN(this.W)) {
            set.add("translationZ");
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
        b(this, context.obtainStyledAttributes(set, androidx.constraintlayout.widget.j.m.Ve));
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
                n = 17;
                break;
            }
            case 1530034690: {
                if (!s.equals("wavePhase")) {
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
            case 17: {
                if (o instanceof Integer) {
                    this.F = this.n(o);
                    break;
                }
                this.F = 7;
                this.G = o.toString();
                break;
            }
            case 16: {
                this.J = this.m(o);
                break;
            }
            case 15: {
                this.E = this.n(o);
                break;
            }
            case 14: {
                this.H = this.m(o);
                break;
            }
            case 13: {
                this.I = this.m(o);
                break;
            }
            case 12: {
                this.M = this.m(o);
                break;
            }
            case 11: {
                this.P = this.m(o);
                break;
            }
            case 10: {
                this.N = this.m(o);
                break;
            }
            case 9: {
                this.O = this.m(o);
                break;
            }
            case 8: {
                this.T = this.m(o);
                break;
            }
            case 7: {
                this.S = this.m(o);
                break;
            }
            case 6: {
                this.W = this.m(o);
                break;
            }
            case 5: {
                this.V = this.m(o);
                break;
            }
            case 4: {
                this.U = this.m(o);
                break;
            }
            case 3: {
                this.R = this.m(o);
                break;
            }
            case 2: {
                this.Q = this.m(o);
                break;
            }
            case 1: {
                this.D = o.toString();
                break;
            }
            case 0: {
                this.K = this.m(o);
                break;
            }
        }
    }
    
    private static class a
    {
        private static final int a = 1;
        private static final int b = 2;
        private static final int c = 3;
        private static final int d = 4;
        private static final int e = 5;
        private static final int f = 6;
        private static final int g = 7;
        private static final int h = 8;
        private static final int i = 9;
        private static final int j = 10;
        private static final int k = 11;
        private static final int l = 12;
        private static final int m = 13;
        private static final int n = 14;
        private static final int o = 15;
        private static final int p = 16;
        private static final int q = 17;
        private static final int r = 18;
        private static final int s = 19;
        private static final int t = 20;
        private static final int u = 21;
        private static SparseIntArray v;
        
        static {
            (androidx.constraintlayout.motion.widget.h.a.v = new SparseIntArray()).append(androidx.constraintlayout.widget.j.m.jf, 1);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.hf, 2);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.kf, 3);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.gf, 4);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.pf, 5);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.nf, 6);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.mf, 7);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.qf, 8);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.We, 9);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.ff, 10);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.bf, 11);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.cf, 12);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.df, 13);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.lf, 14);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.Ze, 15);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.af, 16);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.Xe, 17);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.Ye, 18);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.ef, 19);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.if, 20);
            androidx.constraintlayout.motion.widget.h.a.v.append(androidx.constraintlayout.widget.j.m.of, 21);
        }
        
        private static void b(final h h, final TypedArray typedArray) {
            for (int indexCount = typedArray.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = typedArray.getIndex(i);
                switch (androidx.constraintlayout.motion.widget.h.a.v.get(index)) {
                    default: {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(androidx.constraintlayout.motion.widget.h.a.v.get(index));
                        Log.e("KeyCycle", sb.toString());
                        break;
                    }
                    case 21: {
                        h.J = typedArray.getFloat(index, h.J) / 360.0f;
                        break;
                    }
                    case 20: {
                        h.K = typedArray.getFloat(index, h.K);
                        break;
                    }
                    case 19: {
                        if (Build$VERSION.SDK_INT >= 21) {
                            h.W = typedArray.getDimension(index, h.W);
                            break;
                        }
                        break;
                    }
                    case 18: {
                        h.V = typedArray.getDimension(index, h.V);
                        break;
                    }
                    case 17: {
                        h.U = typedArray.getDimension(index, h.U);
                        break;
                    }
                    case 16: {
                        h.T = typedArray.getFloat(index, h.T);
                        break;
                    }
                    case 15: {
                        h.S = typedArray.getFloat(index, h.S);
                        break;
                    }
                    case 14: {
                        h.P = typedArray.getFloat(index, h.P);
                        break;
                    }
                    case 13: {
                        h.R = typedArray.getFloat(index, h.R);
                        break;
                    }
                    case 12: {
                        h.Q = typedArray.getFloat(index, h.Q);
                        break;
                    }
                    case 11: {
                        h.O = typedArray.getFloat(index, h.O);
                        break;
                    }
                    case 10: {
                        h.N = typedArray.getDimension(index, h.N);
                        break;
                    }
                    case 9: {
                        h.M = typedArray.getFloat(index, h.M);
                        break;
                    }
                    case 8: {
                        h.L = typedArray.getInt(index, h.L);
                        break;
                    }
                    case 7: {
                        float n;
                        if (typedArray.peekValue(index).type == 5) {
                            n = typedArray.getDimension(index, h.I);
                        }
                        else {
                            n = typedArray.getFloat(index, h.I);
                        }
                        h.I = n;
                        break;
                    }
                    case 6: {
                        h.H = typedArray.getFloat(index, h.H);
                        break;
                    }
                    case 5: {
                        int int1;
                        if (typedArray.peekValue(index).type == 3) {
                            h.G = typedArray.getString(index);
                            int1 = 7;
                        }
                        else {
                            int1 = typedArray.getInt(index, h.F);
                        }
                        h.F = int1;
                        break;
                    }
                    case 4: {
                        h.E = typedArray.getInteger(index, h.E);
                        break;
                    }
                    case 3: {
                        h.D = typedArray.getString(index);
                        break;
                    }
                    case 2: {
                        h.a = typedArray.getInt(index, h.a);
                        break;
                    }
                    case 1: {
                        if (androidx.constraintlayout.motion.widget.s.c2) {
                            if ((h.b = typedArray.getResourceId(index, h.b)) != -1) {
                                break;
                            }
                        }
                        else if (typedArray.peekValue(index).type != 3) {
                            h.b = typedArray.getResourceId(index, h.b);
                            break;
                        }
                        h.c = typedArray.getString(index);
                        break;
                    }
                }
            }
        }
    }
}
