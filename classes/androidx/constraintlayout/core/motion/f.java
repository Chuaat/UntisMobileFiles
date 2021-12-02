// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion;

import java.util.Set;
import androidx.constraintlayout.core.motion.utils.z;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.state.i;
import androidx.constraintlayout.core.motion.utils.w;

public class f implements w
{
    public static final int A = 0;
    public static final int B = 0;
    public static final int C = -1;
    public static final int D = -1;
    public static final int E = -2;
    public static final int F = Integer.MIN_VALUE;
    public static final int G = 1;
    public static final int m = 0;
    public static final int n = 1;
    private static final int o = -1;
    private static final int p = -2;
    public static final int q = 0;
    public static final int r = 4;
    private static final int s = -3;
    private static final int t = -4;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    public static final int x = 3;
    public static final int y = 4;
    public static final int z = -1;
    i h;
    a i;
    b j;
    private float k;
    float l;
    
    public f() {
        this.h = new i();
        this.i = new a();
        this.j = new b();
    }
    
    public f(final i h) {
        this.h = new i();
        this.i = new a();
        this.j = new b();
        this.h = h;
    }
    
    public float A(final int n) {
        switch (n) {
            default: {
                return Float.NaN;
            }
            case 316: {
                return this.l;
            }
            case 315: {
                return this.k;
            }
            case 314: {
                return this.h.g;
            }
            case 313: {
                return this.h.f;
            }
            case 312: {
                return this.h.o;
            }
            case 311: {
                return this.h.n;
            }
            case 310: {
                return this.h.j;
            }
            case 309: {
                return this.h.i;
            }
            case 308: {
                return this.h.h;
            }
            case 306: {
                return this.h.m;
            }
            case 305: {
                return this.h.l;
            }
            case 304: {
                return this.h.k;
            }
            case 303: {
                return this.h.p;
            }
        }
    }
    
    public int B() {
        return this.j.a;
    }
    
    public i C() {
        return this.h;
    }
    
    public int D() {
        final i h = this.h;
        return h.d - h.b;
    }
    
    public int E() {
        return this.h.b;
    }
    
    public int F() {
        return this.h.c;
    }
    
    public void G(final int n, final int n2, final int n3, final int n4) {
        this.H(n, n2, n3, n4);
    }
    
    public void H(final int b, final int c, final int d, final int e) {
        if (this.h == null) {
            this.h = new i((androidx.constraintlayout.core.widgets.e)null);
        }
        final i h = this.h;
        h.c = c;
        h.b = b;
        h.d = d;
        h.e = e;
    }
    
    public void I(final String s, final int n, final float n2) {
        this.h.t(s, n, n2);
    }
    
    public void J(final String s, final int n, final int n2) {
        this.h.u(s, n, n2);
    }
    
    public void K(final String s, final int n, final String s2) {
        this.h.v(s, n, s2);
    }
    
    public void L(final String s, final int n, final boolean b) {
        this.h.w(s, n, b);
    }
    
    public void M(final float f) {
        this.h.f = f;
    }
    
    public void N(final float g) {
        this.h.g = g;
    }
    
    public void O(final float h) {
        this.h.h = h;
    }
    
    public void P(final float i) {
        this.h.i = i;
    }
    
    public void Q(final float j) {
        this.h.j = j;
    }
    
    public void R(final float n) {
        this.h.n = n;
    }
    
    public void S(final float o) {
        this.h.o = o;
    }
    
    public void T(final float k) {
        this.h.k = k;
    }
    
    public void U(final float l) {
        this.h.l = l;
    }
    
    public void V(final float m) {
        this.h.m = m;
    }
    
    public boolean W(final int n, final float p2) {
        switch (n) {
            default: {
                return false;
            }
            case 316: {
                this.l = p2;
                break;
            }
            case 315: {
                this.k = p2;
                break;
            }
            case 314: {
                this.h.g = p2;
                break;
            }
            case 313: {
                this.h.f = p2;
                break;
            }
            case 312: {
                this.h.o = p2;
                break;
            }
            case 311: {
                this.h.n = p2;
                break;
            }
            case 310: {
                this.h.j = p2;
                break;
            }
            case 309: {
                this.h.i = p2;
                break;
            }
            case 308: {
                this.h.h = p2;
                break;
            }
            case 306: {
                this.h.m = p2;
                break;
            }
            case 305: {
                this.h.l = p2;
                break;
            }
            case 304: {
                this.h.k = p2;
                break;
            }
            case 303: {
                this.h.p = p2;
                break;
            }
        }
        return true;
    }
    
    public boolean X(final int n, final float f) {
        switch (n) {
            default: {
                return false;
            }
            case 602: {
                this.i.i = f;
                break;
            }
            case 601: {
                this.i.h = f;
                break;
            }
            case 600: {
                this.i.f = f;
                break;
            }
        }
        return true;
    }
    
    public boolean Y(final int n, final int n2) {
        switch (n) {
            default: {
                return false;
            }
            case 612: {
                this.i.m = n2;
                break;
            }
            case 611: {
                this.i.l = n2;
                break;
            }
            case 610: {
                this.i.j = n2;
                break;
            }
            case 609: {
                this.i.g = n2;
                break;
            }
            case 608: {
                this.i.e = n2;
                break;
            }
            case 607: {
                this.i.d = n2;
                break;
            }
            case 606: {
                this.i.b = n2;
                break;
            }
            case 605: {
                this.i.a = n2;
                break;
            }
        }
        return true;
    }
    
    public boolean Z(final int n, final String s) {
        if (n != 603) {
            if (n != 604) {
                return false;
            }
            this.i.k = s;
        }
        else {
            this.i.c = s;
        }
        return true;
    }
    
    public f a(final int n) {
        return null;
    }
    
    public void a0(final int a) {
        this.j.a = a;
    }
    
    @Override
    public boolean b(final int n, final int n2) {
        return this.W(n, (float)n2);
    }
    
    @Override
    public boolean c(final int n, final float n2) {
        return this.W(n, n2) || this.X(n, n2);
    }
    
    @Override
    public boolean d(final int n, final String s) {
        return this.Z(n, s);
    }
    
    @Override
    public boolean e(final int n, final boolean b) {
        return false;
    }
    
    @Override
    public int f(final String s) {
        final int a = androidx.constraintlayout.core.motion.utils.v.a(s);
        if (a != -1) {
            return a;
        }
        return androidx.constraintlayout.core.motion.utils.z.a(s);
    }
    
    public float g() {
        return this.j.c;
    }
    
    public int h() {
        return this.h.e;
    }
    
    public androidx.constraintlayout.core.motion.b i(final String s) {
        return this.h.g(s);
    }
    
    public Set<String> j() {
        return this.h.h();
    }
    
    public int k() {
        final i h = this.h;
        return h.e - h.c;
    }
    
    public int l() {
        return this.h.b;
    }
    
    public String m() {
        return this.getClass().getSimpleName();
    }
    
    public f n() {
        return null;
    }
    
    public float o() {
        return this.h.f;
    }
    
    public float p() {
        return this.h.g;
    }
    
    public int q() {
        return this.h.d;
    }
    
    public float r() {
        return this.h.h;
    }
    
    public float s() {
        return this.h.i;
    }
    
    public float t() {
        return this.h.j;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.h.b);
        sb.append(", ");
        sb.append(this.h.c);
        sb.append(", ");
        sb.append(this.h.d);
        sb.append(", ");
        sb.append(this.h.e);
        return sb.toString();
    }
    
    public float u() {
        return this.h.n;
    }
    
    public float v() {
        return this.h.o;
    }
    
    public int w() {
        return this.h.c;
    }
    
    public float x() {
        return this.h.k;
    }
    
    public float y() {
        return this.h.l;
    }
    
    public float z() {
        return this.h.m;
    }
    
    public static class a
    {
        private static final int n = -2;
        private static final int o = -1;
        private static final int p = -3;
        public int a;
        public int b;
        public String c;
        public int d;
        public int e;
        public float f;
        public int g;
        public float h;
        public float i;
        public int j;
        public String k;
        public int l;
        public int m;
        
        public a() {
            this.a = -1;
            this.b = 0;
            this.c = null;
            this.d = -1;
            this.e = 0;
            this.f = Float.NaN;
            this.g = -1;
            this.h = Float.NaN;
            this.i = Float.NaN;
            this.j = -1;
            this.k = null;
            this.l = -3;
            this.m = -1;
        }
    }
    
    public static class b
    {
        public int a;
        public int b;
        public float c;
        public float d;
        
        public b() {
            this.a = 4;
            this.b = 0;
            this.c = 1.0f;
            this.d = Float.NaN;
        }
    }
}
