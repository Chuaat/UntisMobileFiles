// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.motion.utils.c0;
import java.io.PrintStream;
import androidx.constraintlayout.core.motion.utils.h;
import java.util.Iterator;
import java.util.HashSet;
import androidx.constraintlayout.core.motion.utils.o;
import java.util.HashMap;

public class d extends b
{
    private static final String R = "KeyCycle";
    static final String S = "KeyCycle";
    public static final String T = "wavePeriod";
    public static final String U = "waveOffset";
    public static final String V = "wavePhase";
    public static final String W = "waveShape";
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    public static final int a0 = 3;
    public static final int b0 = 4;
    public static final int c0 = 5;
    public static final int d0 = 6;
    public static final int e0 = 4;
    private int A;
    private String B;
    private float C;
    private float D;
    private float E;
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
    private String y;
    private int z;
    
    public d() {
        this.y = null;
        this.z = 0;
        this.A = -1;
        this.B = null;
        this.C = Float.NaN;
        this.D = 0.0f;
        this.E = 0.0f;
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
        super.k = 4;
        super.l = new HashMap<String, androidx.constraintlayout.core.motion.b>();
    }
    
    @Override
    public void a(final HashMap<String, o> hashMap) {
    }
    
    @Override
    public boolean b(final int n, final int n2) {
        if (n == 401) {
            this.z = n2;
            return true;
        }
        if (n != 421) {
            return this.c(n, (float)n2) || super.b(n, n2);
        }
        this.A = n2;
        return true;
    }
    
    @Override
    public boolean c(final int n, final float f) {
        Label_0224: {
            if (n != 315) {
                if (n != 403) {
                    if (n != 416) {
                        switch (n) {
                            default: {
                                switch (n) {
                                    default: {
                                        return super.c(n, f);
                                    }
                                    case 425: {
                                        this.E = f;
                                        break Label_0224;
                                    }
                                    case 424: {
                                        this.D = f;
                                        break Label_0224;
                                    }
                                    case 423: {
                                        this.C = f;
                                        break Label_0224;
                                    }
                                }
                                break;
                            }
                            case 312: {
                                this.N = f;
                                break;
                            }
                            case 311: {
                                this.M = f;
                                break;
                            }
                            case 310: {
                                this.I = f;
                                break;
                            }
                            case 309: {
                                this.L = f;
                                break;
                            }
                            case 308: {
                                this.K = f;
                                break;
                            }
                            case 307: {
                                this.H = f;
                                break;
                            }
                            case 306: {
                                this.Q = f;
                                break;
                            }
                            case 305: {
                                this.P = f;
                                break;
                            }
                            case 304: {
                                this.O = f;
                                break;
                            }
                        }
                    }
                    else {
                        this.J = f;
                    }
                }
                else {
                    this.G = f;
                }
            }
            else {
                this.F = f;
            }
        }
        return true;
    }
    
    @Override
    public boolean d(final int n, final String s) {
        if (n == 420) {
            this.y = s;
            return true;
        }
        if (n != 422) {
            return super.d(n, s);
        }
        this.B = s;
        return true;
    }
    
    @Override
    public int f(final String s) {
        s.hashCode();
        int n = 0;
        Label_0562: {
            switch (s) {
                case "visibility": {
                    n = 20;
                    break Label_0562;
                }
                case "waveShape": {
                    n = 19;
                    break Label_0562;
                }
                case "pathRotate": {
                    n = 18;
                    break Label_0562;
                }
                case "curveFit": {
                    n = 17;
                    break Label_0562;
                }
                case "phase": {
                    n = 16;
                    break Label_0562;
                }
                case "alpha": {
                    n = 15;
                    break Label_0562;
                }
                case "scaleY": {
                    n = 14;
                    break Label_0562;
                }
                case "scaleX": {
                    n = 13;
                    break Label_0562;
                }
                case "pivotY": {
                    n = 12;
                    break Label_0562;
                }
                case "pivotX": {
                    n = 11;
                    break Label_0562;
                }
                case "period": {
                    n = 10;
                    break Label_0562;
                }
                case "progress": {
                    n = 9;
                    break Label_0562;
                }
                case "offset": {
                    n = 8;
                    break Label_0562;
                }
                case "translationZ": {
                    n = 7;
                    break Label_0562;
                }
                case "translationY": {
                    n = 6;
                    break Label_0562;
                }
                case "translationX": {
                    n = 5;
                    break Label_0562;
                }
                case "rotationZ": {
                    n = 4;
                    break Label_0562;
                }
                case "rotationY": {
                    n = 3;
                    break Label_0562;
                }
                case "rotationX": {
                    n = 2;
                    break Label_0562;
                }
                case "easing": {
                    n = 1;
                    break Label_0562;
                }
                case "customWave": {
                    n = 0;
                    break Label_0562;
                }
                default:
                    break;
            }
            n = -1;
        }
        switch (n) {
            default: {
                return -1;
            }
            case 20: {
                return 402;
            }
            case 19: {
                return 421;
            }
            case 18: {
                return 416;
            }
            case 17: {
                return 401;
            }
            case 16: {
                return 425;
            }
            case 15: {
                return 403;
            }
            case 14: {
                return 312;
            }
            case 13: {
                return 311;
            }
            case 12: {
                return 314;
            }
            case 11: {
                return 313;
            }
            case 10: {
                return 423;
            }
            case 9: {
                return 315;
            }
            case 8: {
                return 424;
            }
            case 7: {
                return 306;
            }
            case 6: {
                return 305;
            }
            case 5: {
                return 304;
            }
            case 4: {
                return 310;
            }
            case 3: {
                return 309;
            }
            case 2: {
                return 308;
            }
            case 1: {
                return 420;
            }
            case 0: {
                return 422;
            }
        }
    }
    
    @Override
    public b g() {
        return null;
    }
    
    @Override
    public void i(final HashSet<String> set) {
        if (!Float.isNaN(this.G)) {
            set.add("alpha");
        }
        if (!Float.isNaN(this.H)) {
            set.add("elevation");
        }
        if (!Float.isNaN(this.I)) {
            set.add("rotationZ");
        }
        if (!Float.isNaN(this.K)) {
            set.add("rotationX");
        }
        if (!Float.isNaN(this.L)) {
            set.add("rotationY");
        }
        if (!Float.isNaN(this.M)) {
            set.add("scaleX");
        }
        if (!Float.isNaN(this.N)) {
            set.add("scaleY");
        }
        if (!Float.isNaN(this.J)) {
            set.add("pathRotate");
        }
        if (!Float.isNaN(this.O)) {
            set.add("translationX");
        }
        if (!Float.isNaN(this.P)) {
            set.add("translationY");
        }
        if (!Float.isNaN(this.Q)) {
            set.add("translationZ");
        }
        if (super.l.size() > 0) {
            for (final String str : super.l.keySet()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("CUSTOM,");
                sb.append(str);
                set.add(sb.toString());
            }
        }
    }
    
    public void v(final HashMap<String, h> hashMap) {
        for (final String s : hashMap.keySet()) {
            if (s.startsWith("CUSTOM")) {
                final androidx.constraintlayout.core.motion.b b = super.l.get(s.substring(7));
                if (b == null) {
                    continue;
                }
                if (b.m() != 901) {
                    continue;
                }
                final h h = hashMap.get(s);
                if (h == null) {
                    continue;
                }
                h.g(super.h, this.A, this.B, -1, this.C, this.D, this.E, b.n(), b);
            }
            else {
                final float x = this.x(s);
                if (Float.isNaN(x)) {
                    continue;
                }
                final h h2 = hashMap.get(s);
                if (h2 == null) {
                    continue;
                }
                h2.f(super.h, this.A, this.B, -1, this.C, this.D, this.E, x);
            }
        }
    }
    
    public void w() {
        final PrintStream out = System.out;
        final StringBuilder sb = new StringBuilder();
        sb.append("MotionKeyCycle{mWaveShape=");
        sb.append(this.A);
        sb.append(", mWavePeriod=");
        sb.append(this.C);
        sb.append(", mWaveOffset=");
        sb.append(this.D);
        sb.append(", mWavePhase=");
        sb.append(this.E);
        sb.append(", mRotation=");
        sb.append(this.I);
        sb.append('}');
        out.println(sb.toString());
    }
    
    public float x(final String s) {
        s.hashCode();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 803192288: {
                if (!s.equals("pathRotate")) {
                    break;
                }
                n = 13;
                break;
            }
            case 106629499: {
                if (!s.equals("phase")) {
                    break;
                }
                n = 12;
                break;
            }
            case 92909918: {
                if (!s.equals("alpha")) {
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
            case -908189617: {
                if (!s.equals("scaleY")) {
                    break;
                }
                n = 9;
                break;
            }
            case -908189618: {
                if (!s.equals("scaleX")) {
                    break;
                }
                n = 8;
                break;
            }
            case -1001078227: {
                if (!s.equals("progress")) {
                    break;
                }
                n = 7;
                break;
            }
            case -1019779949: {
                if (!s.equals("offset")) {
                    break;
                }
                n = 6;
                break;
            }
            case -1225497655: {
                if (!s.equals("translationZ")) {
                    break;
                }
                n = 5;
                break;
            }
            case -1225497656: {
                if (!s.equals("translationY")) {
                    break;
                }
                n = 4;
                break;
            }
            case -1225497657: {
                if (!s.equals("translationX")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1249320804: {
                if (!s.equals("rotationZ")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1249320805: {
                if (!s.equals("rotationY")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1249320806: {
                if (!s.equals("rotationX")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return Float.NaN;
            }
            case 13: {
                return this.J;
            }
            case 12: {
                return this.E;
            }
            case 11: {
                return this.G;
            }
            case 10: {
                return this.H;
            }
            case 9: {
                return this.N;
            }
            case 8: {
                return this.M;
            }
            case 7: {
                return this.F;
            }
            case 6: {
                return this.D;
            }
            case 5: {
                return this.Q;
            }
            case 4: {
                return this.P;
            }
            case 3: {
                return this.O;
            }
            case 2: {
                return this.I;
            }
            case 1: {
                return this.L;
            }
            case 0: {
                return this.K;
            }
        }
    }
    
    public void y() {
        final HashSet<String> set = new HashSet<String>();
        this.i(set);
        final StringBuilder sb = new StringBuilder();
        sb.append(" ------------- ");
        sb.append(super.h);
        sb.append(" -------------");
        androidx.constraintlayout.core.motion.utils.c0.c(sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("MotionKeyCycle{Shape=");
        sb2.append(this.A);
        sb2.append(", Period=");
        sb2.append(this.C);
        sb2.append(", Offset=");
        sb2.append(this.D);
        sb2.append(", Phase=");
        sb2.append(this.E);
        sb2.append('}');
        androidx.constraintlayout.core.motion.utils.c0.c(sb2.toString());
        int i = 0;
        for (String[] array = set.toArray(new String[0]); i < array.length; ++i) {
            androidx.constraintlayout.core.motion.utils.v.a(array[i]);
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(array[i]);
            sb3.append(":");
            sb3.append(this.x(array[i]));
            androidx.constraintlayout.core.motion.utils.c0.c(sb3.toString());
        }
    }
}
