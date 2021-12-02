// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.key;

import java.util.HashSet;
import androidx.constraintlayout.core.motion.utils.o;
import java.util.Iterator;
import java.util.Locale;
import androidx.constraintlayout.core.motion.f;
import java.lang.reflect.Method;
import java.util.HashMap;
import androidx.constraintlayout.core.motion.utils.e;

public class g extends b
{
    private static final String S = "KeyTrigger";
    public static final String T = "viewTransitionOnCross";
    public static final String U = "viewTransitionOnPositiveCross";
    public static final String V = "viewTransitionOnNegativeCross";
    public static final String W = "postLayout";
    public static final String X = "triggerSlack";
    public static final String Y = "triggerCollisionView";
    public static final String Z = "triggerCollisionId";
    public static final String a0 = "triggerID";
    public static final String b0 = "positiveCross";
    public static final String c0 = "negativeCross";
    public static final String d0 = "triggerReceiver";
    public static final String e0 = "CROSS";
    public static final int f0 = 301;
    public static final int g0 = 302;
    public static final int h0 = 303;
    public static final int i0 = 304;
    public static final int j0 = 305;
    public static final int k0 = 306;
    public static final int l0 = 307;
    public static final int m0 = 308;
    public static final int n0 = 309;
    public static final int o0 = 310;
    public static final int p0 = 311;
    public static final int q0 = 312;
    public static final int r0 = 5;
    private int A;
    private String B;
    private String C;
    private int D;
    private int E;
    float F;
    private boolean G;
    private boolean H;
    private boolean I;
    private float J;
    private float K;
    private boolean L;
    int M;
    int N;
    int O;
    androidx.constraintlayout.core.motion.utils.e P;
    androidx.constraintlayout.core.motion.utils.e Q;
    HashMap<String, Method> R;
    private int y;
    private String z;
    
    public g() {
        this.y = -1;
        this.z = null;
        final int m = b.m;
        this.A = m;
        this.B = null;
        this.C = null;
        this.D = m;
        this.E = m;
        this.F = 0.1f;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = Float.NaN;
        this.L = false;
        this.M = m;
        this.N = m;
        this.O = m;
        this.P = new androidx.constraintlayout.core.motion.utils.e();
        this.Q = new androidx.constraintlayout.core.motion.utils.e();
        this.R = new HashMap<String, Method>();
        super.k = 5;
        super.l = new HashMap<String, androidx.constraintlayout.core.motion.b>();
    }
    
    private void x(final String s, final androidx.constraintlayout.core.motion.f f) {
        final boolean b = s.length() == 1;
        String lowerCase = s;
        if (!b) {
            lowerCase = s.substring(1).toLowerCase(Locale.ROOT);
        }
        for (final String key : super.l.keySet()) {
            final String lowerCase2 = key.toLowerCase(Locale.ROOT);
            if (b || lowerCase2.matches(lowerCase)) {
                final androidx.constraintlayout.core.motion.b b2 = super.l.get(key);
                if (b2 == null) {
                    continue;
                }
                b2.a(f);
            }
        }
    }
    
    @Override
    public void a(final HashMap<String, o> hashMap) {
    }
    
    @Override
    public boolean b(final int n, final int n2) {
        if (n != 307) {
            if (n != 308) {
                if (n != 311) {
                    switch (n) {
                        default: {
                            return super.b(n, n2);
                        }
                        case 303: {
                            this.M = n2;
                            break;
                        }
                        case 302: {
                            this.N = n2;
                            break;
                        }
                        case 301: {
                            this.O = n2;
                            break;
                        }
                    }
                }
                else {
                    this.A = n2;
                }
            }
            else {
                this.D = this.u(n2);
            }
        }
        else {
            this.E = n2;
        }
        return true;
    }
    
    @Override
    public boolean c(final int n, final float f) {
        if (n != 305) {
            return super.c(n, f);
        }
        this.F = f;
        return true;
    }
    
    @Override
    public boolean d(final int n, final String c) {
        if (n != 309) {
            if (n != 310) {
                if (n != 312) {
                    return super.d(n, c);
                }
                this.z = c;
            }
            else {
                this.B = c;
            }
        }
        else {
            this.C = c;
        }
        return true;
    }
    
    @Override
    public boolean e(final int n, final boolean l) {
        if (n != 304) {
            return super.e(n, l);
        }
        this.L = l;
        return true;
    }
    
    @Override
    public int f(final String s) {
        s.hashCode();
        int n = 0;
        Label_0302: {
            switch (s) {
                case "triggerReceiver": {
                    n = 10;
                    break Label_0302;
                }
                case "postLayout": {
                    n = 9;
                    break Label_0302;
                }
                case "viewTransitionOnCross": {
                    n = 8;
                    break Label_0302;
                }
                case "triggerSlack": {
                    n = 7;
                    break Label_0302;
                }
                case "viewTransitionOnNegativeCross": {
                    n = 6;
                    break Label_0302;
                }
                case "triggerCollisionView": {
                    n = 5;
                    break Label_0302;
                }
                case "negativeCross": {
                    n = 4;
                    break Label_0302;
                }
                case "triggerID": {
                    n = 3;
                    break Label_0302;
                }
                case "triggerCollisionId": {
                    n = 2;
                    break Label_0302;
                }
                case "viewTransitionOnPositiveCross": {
                    n = 1;
                    break Label_0302;
                }
                case "positiveCross": {
                    n = 0;
                    break Label_0302;
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
            case 10: {
                return 311;
            }
            case 9: {
                return 304;
            }
            case 8: {
                return 301;
            }
            case 7: {
                return 305;
            }
            case 6: {
                return 303;
            }
            case 5: {
                return 306;
            }
            case 4: {
                return 310;
            }
            case 3: {
                return 308;
            }
            case 2: {
                return 307;
            }
            case 1: {
                return 302;
            }
            case 0: {
                return 309;
            }
        }
    }
    
    @Override
    public b g() {
        return new g().w(this);
    }
    
    @Override
    public void i(final HashSet<String> set) {
    }
    
    public void v(final float n, final androidx.constraintlayout.core.motion.f f) {
    }
    
    public g w(final b b) {
        super.h(b);
        final g g = (g)b;
        this.y = g.y;
        this.z = g.z;
        this.A = g.A;
        this.B = g.B;
        this.C = g.C;
        this.D = g.D;
        this.E = g.E;
        this.F = g.F;
        this.G = g.G;
        this.H = g.H;
        this.I = g.I;
        this.J = g.J;
        this.K = g.K;
        this.L = g.L;
        this.P = g.P;
        this.Q = g.Q;
        this.R = g.R;
        return this;
    }
}
