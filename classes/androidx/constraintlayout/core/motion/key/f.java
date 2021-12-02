// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.c0;
import androidx.constraintlayout.core.motion.utils.t;
import java.util.Iterator;
import java.util.HashSet;
import androidx.constraintlayout.core.motion.utils.y;
import androidx.constraintlayout.core.motion.utils.o;
import java.util.HashMap;

public class f extends b
{
    static final String Q = "KeyTimeCycle";
    private static final String R = "KeyTimeCycle";
    public static final int S = 3;
    private float A;
    private float B;
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
    private int M;
    private String N;
    private float O;
    private float P;
    private String y;
    private int z;
    
    public f() {
        this.z = -1;
        this.A = Float.NaN;
        this.B = Float.NaN;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = 0;
        this.N = null;
        this.O = Float.NaN;
        this.P = 0.0f;
        super.k = 3;
        super.l = new HashMap<String, androidx.constraintlayout.core.motion.b>();
    }
    
    @Override
    public void a(final HashMap<String, o> hashMap) {
    }
    
    @Override
    public boolean b(final int n, final int n2) {
        if (n != 100) {
            if (n != 421) {
                return super.b(n, n2);
            }
            this.M = n2;
        }
        else {
            super.h = n2;
        }
        return true;
    }
    
    @Override
    public boolean c(final int n, final float f) {
        if (n != 315) {
            if (n != 401) {
                if (n != 403) {
                    if (n != 416) {
                        if (n != 423) {
                            if (n != 424) {
                                switch (n) {
                                    default: {
                                        return super.c(n, f);
                                    }
                                    case 312: {
                                        this.H = this.t(f);
                                        break;
                                    }
                                    case 311: {
                                        this.G = this.t(f);
                                        break;
                                    }
                                    case 310: {
                                        this.C = this.t(f);
                                        break;
                                    }
                                    case 309: {
                                        this.E = this.t(f);
                                        break;
                                    }
                                    case 308: {
                                        this.D = this.t(f);
                                        break;
                                    }
                                    case 307: {
                                        this.B = this.t(f);
                                        break;
                                    }
                                    case 306: {
                                        this.K = this.t(f);
                                        break;
                                    }
                                    case 305: {
                                        this.J = this.t(f);
                                        break;
                                    }
                                    case 304: {
                                        this.I = this.t(f);
                                        break;
                                    }
                                }
                            }
                            else {
                                this.P = this.t(f);
                            }
                        }
                        else {
                            this.O = this.t(f);
                        }
                    }
                    else {
                        this.F = this.t(f);
                    }
                }
                else {
                    this.A = f;
                }
            }
            else {
                this.z = this.u(f);
            }
        }
        else {
            this.L = this.t(f);
        }
        return true;
    }
    
    @Override
    public boolean d(final int n, final String s) {
        if (n != 420) {
            if (n != 421) {
                return super.d(n, s);
            }
            this.M = 7;
            this.N = s;
        }
        else {
            this.y = s;
        }
        return true;
    }
    
    @Override
    public boolean e(final int n, final boolean b) {
        return super.e(n, b);
    }
    
    @Override
    public int f(final String s) {
        return androidx.constraintlayout.core.motion.utils.y.a(s);
    }
    
    @Override
    public b g() {
        return new f().w(this);
    }
    
    @Override
    public void i(final HashSet<String> set) {
        if (!Float.isNaN(this.A)) {
            set.add("alpha");
        }
        if (!Float.isNaN(this.B)) {
            set.add("elevation");
        }
        if (!Float.isNaN(this.C)) {
            set.add("rotationZ");
        }
        if (!Float.isNaN(this.D)) {
            set.add("rotationX");
        }
        if (!Float.isNaN(this.E)) {
            set.add("rotationY");
        }
        if (!Float.isNaN(this.G)) {
            set.add("scaleX");
        }
        if (!Float.isNaN(this.H)) {
            set.add("scaleY");
        }
        if (!Float.isNaN(this.F)) {
            set.add("pathRotate");
        }
        if (!Float.isNaN(this.I)) {
            set.add("translationX");
        }
        if (!Float.isNaN(this.J)) {
            set.add("translationY");
        }
        if (!Float.isNaN(this.K)) {
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
    
    public void v(final HashMap<String, t> hashMap) {
    Label_0600_Outer:
        for (final String s : hashMap.keySet()) {
            final t t = hashMap.get(s);
            if (t == null) {
                continue;
            }
            final boolean startsWith = s.startsWith("CUSTOM");
            int n = 7;
            if (!startsWith) {
                Label_0442: {
                    switch (s) {
                        case "pathRotate": {
                            n = 11;
                            break Label_0442;
                        }
                        case "alpha": {
                            n = 10;
                            break Label_0442;
                        }
                        case "elevation": {
                            n = 9;
                            break Label_0442;
                        }
                        case "scaleY": {
                            n = 8;
                            break Label_0442;
                        }
                        case "scaleX": {
                            break Label_0442;
                        }
                        case "progress": {
                            n = 6;
                            break Label_0442;
                        }
                        case "translationZ": {
                            n = 5;
                            break Label_0442;
                        }
                        case "translationY": {
                            n = 4;
                            break Label_0442;
                        }
                        case "translationX": {
                            n = 3;
                            break Label_0442;
                        }
                        case "rotationZ": {
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
                while (true) {
                    Label_0722: {
                        int n2 = 0;
                        float n3 = 0.0f;
                        switch (n) {
                            default: {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("UNKNOWN addValues \"");
                                sb.append(s);
                                sb.append("\"");
                                c0.f("KeyTimeCycles", sb.toString());
                                continue Label_0600_Outer;
                            }
                            case 11: {
                                if (!Float.isNaN(this.F)) {
                                    n2 = super.h;
                                    n3 = this.F;
                                    break;
                                }
                                continue Label_0600_Outer;
                            }
                            case 10: {
                                if (!Float.isNaN(this.A)) {
                                    n2 = super.h;
                                    n3 = this.A;
                                    break;
                                }
                                continue Label_0600_Outer;
                            }
                            case 9: {
                                if (!Float.isNaN(this.K)) {
                                    break Label_0722;
                                }
                                continue Label_0600_Outer;
                            }
                            case 8: {
                                if (!Float.isNaN(this.H)) {
                                    n2 = super.h;
                                    n3 = this.H;
                                    break;
                                }
                                continue Label_0600_Outer;
                            }
                            case 7: {
                                if (!Float.isNaN(this.G)) {
                                    n2 = super.h;
                                    n3 = this.G;
                                    break;
                                }
                                continue Label_0600_Outer;
                            }
                            case 6: {
                                if (!Float.isNaN(this.L)) {
                                    n2 = super.h;
                                    n3 = this.L;
                                    break;
                                }
                                continue Label_0600_Outer;
                            }
                            case 5: {
                                if (!Float.isNaN(this.K)) {
                                    break Label_0722;
                                }
                                continue Label_0600_Outer;
                            }
                            case 4: {
                                if (!Float.isNaN(this.J)) {
                                    n2 = super.h;
                                    n3 = this.J;
                                    break;
                                }
                                continue Label_0600_Outer;
                            }
                            case 3: {
                                if (!Float.isNaN(this.I)) {
                                    n2 = super.h;
                                    n3 = this.I;
                                    break;
                                }
                                continue Label_0600_Outer;
                            }
                            case 2: {
                                if (!Float.isNaN(this.C)) {
                                    n2 = super.h;
                                    n3 = this.C;
                                    break;
                                }
                                continue Label_0600_Outer;
                            }
                            case 1: {
                                if (!Float.isNaN(this.E)) {
                                    n2 = super.h;
                                    n3 = this.E;
                                    break;
                                }
                                continue Label_0600_Outer;
                            }
                            case 0: {
                                if (!Float.isNaN(this.D)) {
                                    n2 = super.h;
                                    n3 = this.D;
                                    break;
                                }
                                continue Label_0600_Outer;
                            }
                        }
                        t.c(n2, n3, this.O, this.M, this.P);
                        continue Label_0600_Outer;
                    }
                    int n2 = super.h;
                    float n3 = this.K;
                    continue;
                }
            }
            final androidx.constraintlayout.core.motion.b b = super.l.get(s.substring(7));
            if (b == null) {
                continue;
            }
            ((t.b)t).g(super.h, b, this.O, this.M, this.P);
        }
    }
    
    public f w(final b b) {
        super.h(b);
        final f f = (f)b;
        this.y = f.y;
        this.z = f.z;
        this.M = f.M;
        this.O = f.O;
        this.P = f.P;
        this.L = f.L;
        this.A = f.A;
        this.B = f.B;
        this.C = f.C;
        this.F = f.F;
        this.D = f.D;
        this.E = f.E;
        this.G = f.G;
        this.H = f.H;
        this.I = f.I;
        this.J = f.J;
        this.K = f.K;
        return this;
    }
}
