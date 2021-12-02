// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import android.os.Build$VERSION;
import android.util.Log;
import android.content.res.TypedArray;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.j;
import android.util.AttributeSet;
import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import androidx.constraintlayout.motion.utils.c;
import androidx.constraintlayout.widget.a;
import java.util.HashMap;

public class g extends f
{
    static final String U = "KeyAttribute";
    private static final String V = "KeyAttributes";
    private static final boolean W = false;
    public static final int X = 1;
    private String D;
    private int E;
    private boolean F;
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
    private float R;
    private float S;
    private float T;
    
    public g() {
        this.E = -1;
        this.F = false;
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
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        super.d = 1;
        super.e = new HashMap<String, androidx.constraintlayout.widget.a>();
    }
    
    int T() {
        return this.E;
    }
    
    @Override
    public void a(final HashMap<String, c> hashMap) {
        for (final String key : hashMap.keySet()) {
            final c c = hashMap.get(key);
            if (c == null) {
                continue;
            }
            final boolean startsWith = key.startsWith("CUSTOM");
            int n = 7;
            if (startsWith) {
                final androidx.constraintlayout.widget.a a = super.e.get(key.substring(7));
                if (a == null) {
                    continue;
                }
                ((c.b)c).n(super.a, a);
            }
            else {
                Label_0484: {
                    switch (key) {
                        case "alpha": {
                            n = 13;
                            break Label_0484;
                        }
                        case "transitionPathRotate": {
                            n = 12;
                            break Label_0484;
                        }
                        case "elevation": {
                            n = 11;
                            break Label_0484;
                        }
                        case "rotation": {
                            n = 10;
                            break Label_0484;
                        }
                        case "transformPivotY": {
                            n = 9;
                            break Label_0484;
                        }
                        case "transformPivotX": {
                            n = 8;
                            break Label_0484;
                        }
                        case "scaleY": {
                            break Label_0484;
                        }
                        case "scaleX": {
                            n = 6;
                            break Label_0484;
                        }
                        case "progress": {
                            n = 5;
                            break Label_0484;
                        }
                        case "translationZ": {
                            n = 4;
                            break Label_0484;
                        }
                        case "translationY": {
                            n = 3;
                            break Label_0484;
                        }
                        case "translationX": {
                            n = 2;
                            break Label_0484;
                        }
                        case "rotationY": {
                            n = 1;
                            break Label_0484;
                        }
                        case "rotationX": {
                            n = 0;
                            break Label_0484;
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
                        continue;
                    }
                    case 13: {
                        if (!Float.isNaN(this.G)) {
                            n2 = super.a;
                            n3 = this.G;
                            break;
                        }
                        continue;
                    }
                    case 12: {
                        if (!Float.isNaN(this.N)) {
                            n2 = super.a;
                            n3 = this.N;
                            break;
                        }
                        continue;
                    }
                    case 11: {
                        if (!Float.isNaN(this.H)) {
                            n2 = super.a;
                            n3 = this.H;
                            break;
                        }
                        continue;
                    }
                    case 10: {
                        if (!Float.isNaN(this.I)) {
                            n2 = super.a;
                            n3 = this.I;
                            break;
                        }
                        continue;
                    }
                    case 9: {
                        if (!Float.isNaN(this.K)) {
                            n2 = super.a;
                            n3 = this.M;
                            break;
                        }
                        continue;
                    }
                    case 8: {
                        if (!Float.isNaN(this.J)) {
                            n2 = super.a;
                            n3 = this.L;
                            break;
                        }
                        continue;
                    }
                    case 7: {
                        if (!Float.isNaN(this.P)) {
                            n2 = super.a;
                            n3 = this.P;
                            break;
                        }
                        continue;
                    }
                    case 6: {
                        if (!Float.isNaN(this.O)) {
                            n2 = super.a;
                            n3 = this.O;
                            break;
                        }
                        continue;
                    }
                    case 5: {
                        if (!Float.isNaN(this.T)) {
                            n2 = super.a;
                            n3 = this.T;
                            break;
                        }
                        continue;
                    }
                    case 4: {
                        if (!Float.isNaN(this.S)) {
                            n2 = super.a;
                            n3 = this.S;
                            break;
                        }
                        continue;
                    }
                    case 3: {
                        if (!Float.isNaN(this.R)) {
                            n2 = super.a;
                            n3 = this.R;
                            break;
                        }
                        continue;
                    }
                    case 2: {
                        if (!Float.isNaN(this.Q)) {
                            n2 = super.a;
                            n3 = this.Q;
                            break;
                        }
                        continue;
                    }
                    case 1: {
                        if (!Float.isNaN(this.K)) {
                            n2 = super.a;
                            n3 = this.K;
                            break;
                        }
                        continue;
                    }
                    case 0: {
                        if (!Float.isNaN(this.J)) {
                            n2 = super.a;
                            n3 = this.J;
                            break;
                        }
                        continue;
                    }
                }
                c.g(n2, n3);
            }
        }
    }
    
    @Override
    public f b() {
        return new g().c(this);
    }
    
    @Override
    public f c(final f f) {
        super.c(f);
        final g g = (g)f;
        this.E = g.E;
        this.F = g.F;
        this.G = g.G;
        this.H = g.H;
        this.I = g.I;
        this.J = g.J;
        this.K = g.K;
        this.L = g.L;
        this.M = g.M;
        this.N = g.N;
        this.O = g.O;
        this.P = g.P;
        this.Q = g.Q;
        this.R = g.R;
        this.S = g.S;
        this.T = g.T;
        return this;
    }
    
    public void d(final HashSet<String> set) {
        if (!Float.isNaN(this.G)) {
            set.add("alpha");
        }
        if (!Float.isNaN(this.H)) {
            set.add("elevation");
        }
        if (!Float.isNaN(this.I)) {
            set.add("rotation");
        }
        if (!Float.isNaN(this.J)) {
            set.add("rotationX");
        }
        if (!Float.isNaN(this.K)) {
            set.add("rotationY");
        }
        if (!Float.isNaN(this.L)) {
            set.add("transformPivotX");
        }
        if (!Float.isNaN(this.M)) {
            set.add("transformPivotY");
        }
        if (!Float.isNaN(this.Q)) {
            set.add("translationX");
        }
        if (!Float.isNaN(this.R)) {
            set.add("translationY");
        }
        if (!Float.isNaN(this.S)) {
            set.add("translationZ");
        }
        if (!Float.isNaN(this.N)) {
            set.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.O)) {
            set.add("scaleX");
        }
        if (!Float.isNaN(this.P)) {
            set.add("scaleY");
        }
        if (!Float.isNaN(this.T)) {
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
        a.a(this, context.obtainStyledAttributes(set, androidx.constraintlayout.widget.j.m.Be));
    }
    
    @Override
    public void i(final HashMap<String, Integer> hashMap) {
        if (this.E == -1) {
            return;
        }
        if (!Float.isNaN(this.G)) {
            hashMap.put("alpha", this.E);
        }
        if (!Float.isNaN(this.H)) {
            hashMap.put("elevation", this.E);
        }
        if (!Float.isNaN(this.I)) {
            hashMap.put("rotation", this.E);
        }
        if (!Float.isNaN(this.J)) {
            hashMap.put("rotationX", this.E);
        }
        if (!Float.isNaN(this.K)) {
            hashMap.put("rotationY", this.E);
        }
        if (!Float.isNaN(this.L)) {
            hashMap.put("transformPivotX", this.E);
        }
        if (!Float.isNaN(this.M)) {
            hashMap.put("transformPivotY", this.E);
        }
        if (!Float.isNaN(this.Q)) {
            hashMap.put("translationX", this.E);
        }
        if (!Float.isNaN(this.R)) {
            hashMap.put("translationY", this.E);
        }
        if (!Float.isNaN(this.S)) {
            hashMap.put("translationZ", this.E);
        }
        if (!Float.isNaN(this.N)) {
            hashMap.put("transitionPathRotate", this.E);
        }
        if (!Float.isNaN(this.O)) {
            hashMap.put("scaleX", this.E);
        }
        if (!Float.isNaN(this.P)) {
            hashMap.put("scaleY", this.E);
        }
        if (!Float.isNaN(this.T)) {
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
            case 1941332754: {
                if (!s.equals("visibility")) {
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
            case 92909918: {
                if (!s.equals("alpha")) {
                    break;
                }
                n = 14;
                break;
            }
            case 37232917: {
                if (!s.equals("transitionPathRotate")) {
                    break;
                }
                n = 13;
                break;
            }
            case -4379043: {
                if (!s.equals("elevation")) {
                    break;
                }
                n = 12;
                break;
            }
            case -40300674: {
                if (!s.equals("rotation")) {
                    break;
                }
                n = 11;
                break;
            }
            case -760884509: {
                if (!s.equals("transformPivotY")) {
                    break;
                }
                n = 10;
                break;
            }
            case -760884510: {
                if (!s.equals("transformPivotX")) {
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
                this.F = this.l(o);
                break;
            }
            case 15: {
                this.E = this.n(o);
                break;
            }
            case 14: {
                this.G = this.m(o);
                break;
            }
            case 13: {
                this.N = this.m(o);
                break;
            }
            case 12: {
                this.H = this.m(o);
                break;
            }
            case 11: {
                this.I = this.m(o);
                break;
            }
            case 10: {
                this.M = this.m(o);
                break;
            }
            case 9: {
                this.L = this.m(o);
                break;
            }
            case 8: {
                this.P = this.m(o);
                break;
            }
            case 7: {
                this.O = this.m(o);
                break;
            }
            case 6: {
                this.S = this.m(o);
                break;
            }
            case 5: {
                this.R = this.m(o);
                break;
            }
            case 4: {
                this.Q = this.m(o);
                break;
            }
            case 3: {
                this.K = this.m(o);
                break;
            }
            case 2: {
                this.J = this.m(o);
                break;
            }
            case 1: {
                this.D = o.toString();
                break;
            }
            case 0: {
                this.T = this.m(o);
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
        private static SparseIntArray s;
        
        static {
            (androidx.constraintlayout.motion.widget.g.a.s = new SparseIntArray()).append(androidx.constraintlayout.widget.j.m.Ce, 1);
            androidx.constraintlayout.motion.widget.g.a.s.append(androidx.constraintlayout.widget.j.m.Ne, 2);
            androidx.constraintlayout.motion.widget.g.a.s.append(androidx.constraintlayout.widget.j.m.Je, 4);
            androidx.constraintlayout.motion.widget.g.a.s.append(androidx.constraintlayout.widget.j.m.Ke, 5);
            androidx.constraintlayout.motion.widget.g.a.s.append(androidx.constraintlayout.widget.j.m.Le, 6);
            androidx.constraintlayout.motion.widget.g.a.s.append(androidx.constraintlayout.widget.j.m.De, 19);
            androidx.constraintlayout.motion.widget.g.a.s.append(androidx.constraintlayout.widget.j.m.Ee, 20);
            androidx.constraintlayout.motion.widget.g.a.s.append(androidx.constraintlayout.widget.j.m.He, 7);
            androidx.constraintlayout.motion.widget.g.a.s.append(androidx.constraintlayout.widget.j.m.Ue, 8);
            androidx.constraintlayout.motion.widget.g.a.s.append(androidx.constraintlayout.widget.j.m.Te, 9);
            androidx.constraintlayout.motion.widget.g.a.s.append(androidx.constraintlayout.widget.j.m.Re, 10);
            androidx.constraintlayout.motion.widget.g.a.s.append(androidx.constraintlayout.widget.j.m.Pe, 12);
            androidx.constraintlayout.motion.widget.g.a.s.append(androidx.constraintlayout.widget.j.m.Oe, 13);
            androidx.constraintlayout.motion.widget.g.a.s.append(androidx.constraintlayout.widget.j.m.Ie, 14);
            androidx.constraintlayout.motion.widget.g.a.s.append(androidx.constraintlayout.widget.j.m.Fe, 15);
            androidx.constraintlayout.motion.widget.g.a.s.append(androidx.constraintlayout.widget.j.m.Ge, 16);
            androidx.constraintlayout.motion.widget.g.a.s.append(androidx.constraintlayout.widget.j.m.Me, 17);
            androidx.constraintlayout.motion.widget.g.a.s.append(androidx.constraintlayout.widget.j.m.Qe, 18);
        }
        
        public static void a(final g g, final TypedArray typedArray) {
            for (int indexCount = typedArray.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = typedArray.getIndex(i);
                switch (androidx.constraintlayout.motion.widget.g.a.s.get(index)) {
                    default: {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(androidx.constraintlayout.motion.widget.g.a.s.get(index));
                        Log.e("KeyAttribute", sb.toString());
                        break;
                    }
                    case 20: {
                        g.M = typedArray.getDimension(index, g.M);
                        break;
                    }
                    case 19: {
                        g.L = typedArray.getDimension(index, g.L);
                        break;
                    }
                    case 18: {
                        g.T = typedArray.getFloat(index, g.T);
                        break;
                    }
                    case 17: {
                        if (Build$VERSION.SDK_INT >= 21) {
                            g.S = typedArray.getDimension(index, g.S);
                            break;
                        }
                        break;
                    }
                    case 16: {
                        g.R = typedArray.getDimension(index, g.R);
                        break;
                    }
                    case 15: {
                        g.Q = typedArray.getDimension(index, g.Q);
                        break;
                    }
                    case 14: {
                        g.P = typedArray.getFloat(index, g.P);
                        break;
                    }
                    case 13: {
                        g.E = typedArray.getInteger(index, g.E);
                        break;
                    }
                    case 12: {
                        g.a = typedArray.getInt(index, g.a);
                        break;
                    }
                    case 10: {
                        if (androidx.constraintlayout.motion.widget.s.c2) {
                            if ((g.b = typedArray.getResourceId(index, g.b)) != -1) {
                                break;
                            }
                        }
                        else if (typedArray.peekValue(index).type != 3) {
                            g.b = typedArray.getResourceId(index, g.b);
                            break;
                        }
                        g.c = typedArray.getString(index);
                        break;
                    }
                    case 9: {
                        g.D = typedArray.getString(index);
                        break;
                    }
                    case 8: {
                        g.N = typedArray.getFloat(index, g.N);
                        break;
                    }
                    case 7: {
                        g.O = typedArray.getFloat(index, g.O);
                        break;
                    }
                    case 6: {
                        g.K = typedArray.getFloat(index, g.K);
                        break;
                    }
                    case 5: {
                        g.J = typedArray.getFloat(index, g.J);
                        break;
                    }
                    case 4: {
                        g.I = typedArray.getFloat(index, g.I);
                        break;
                    }
                    case 2: {
                        g.H = typedArray.getDimension(index, g.H);
                        break;
                    }
                    case 1: {
                        g.G = typedArray.getFloat(index, g.G);
                        break;
                    }
                }
            }
        }
    }
}
