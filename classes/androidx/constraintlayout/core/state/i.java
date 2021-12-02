// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.parser.d;
import androidx.constraintlayout.core.parser.f;
import androidx.constraintlayout.core.parser.c;
import java.io.PrintStream;
import java.util.Set;
import java.util.Iterator;
import androidx.constraintlayout.core.motion.b;
import java.util.HashMap;
import androidx.constraintlayout.core.widgets.e;

public class i
{
    private static final boolean u = true;
    public static float v = Float.NaN;
    public e a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    public final HashMap<String, b> s;
    public String t;
    
    public i() {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = 0;
        this.s = new HashMap<String, b>();
        this.t = null;
    }
    
    public i(final i i) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = 0;
        this.s = new HashMap<String, b>();
        this.t = null;
        this.a = i.a;
        this.b = i.b;
        this.c = i.c;
        this.d = i.d;
        this.e = i.e;
        this.A(i);
    }
    
    public i(final e a) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = 0;
        this.s = new HashMap<String, b>();
        this.t = null;
        this.a = a;
    }
    
    private static void a(final StringBuilder sb, final String str, final float n) {
        if (Float.isNaN(n)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(n);
        sb.append(",\n");
    }
    
    private static void b(final StringBuilder sb, final String str, final int i) {
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(",\n");
    }
    
    private static float l(float v, float v2, final float n, final float n2) {
        final boolean naN = Float.isNaN(v);
        final boolean naN2 = Float.isNaN(v2);
        if (naN && naN2) {
            return Float.NaN;
        }
        if (naN) {
            v = n;
        }
        if (naN2) {
            v2 = n;
        }
        return v + n2 * (v2 - v);
    }
    
    public static void m(int a, int c, final i i, final i j, final i k, final h h, final float n) {
        final float n2 = 100.0f * n;
        final int n3 = (int)n2;
        int b = j.b;
        int c2 = j.c;
        final int b2 = k.b;
        final int c3 = k.c;
        final int d = j.d;
        final int e = j.e;
        int n4 = k.d - b2;
        int n5 = k.e - c3;
        float p7 = j.p;
        final float p8 = k.p;
        int n6;
        int n7;
        if (j.r == 8) {
            b -= (int)(n4 / 2.0f);
            c2 -= (int)(n5 / 2.0f);
            if (Float.isNaN(p7)) {
                n6 = n5;
                n7 = n4;
                p7 = 0.0f;
            }
            else {
                n7 = n4;
                n6 = n5;
            }
        }
        else {
            n7 = d - b;
            n6 = e - c2;
        }
        float n8 = p8;
        int n9 = b2;
        int n10 = c3;
        if (k.r == 8) {
            final int n11 = (int)(b2 - n7 / 2.0f);
            final int n12 = (int)(c3 - n6 / 2.0f);
            final boolean naN = Float.isNaN(p8);
            final int n13 = n7;
            final int n14 = n6;
            n8 = p8;
            n9 = n11;
            n10 = n12;
            n5 = n14;
            n4 = n13;
            if (naN) {
                n8 = 0.0f;
                n4 = n13;
                n5 = n14;
                n10 = n12;
                n9 = n11;
            }
        }
        if (Float.isNaN(p7) && !Float.isNaN(n8)) {
            p7 = 1.0f;
        }
        float n15 = n8;
        if (!Float.isNaN(p7)) {
            n15 = n8;
            if (Float.isNaN(n8)) {
                n15 = 1.0f;
            }
        }
        float n16;
        if (i.a != null && h.w()) {
            final h.a l = h.k(i.a.o, n3);
            Object m;
            if (l == (m = h.j(i.a.o, n3))) {
                m = null;
            }
            int a2;
            if (l != null) {
                b = (int)(l.d * a);
                c2 = (int)(l.e * c);
                a2 = l.a;
            }
            else {
                a2 = 0;
            }
            if (m != null) {
                n9 = (int)(((h.a)m).d * a);
                n10 = (int)(((h.a)m).e * c);
                a = ((h.a)m).a;
            }
            else {
                a = 100;
            }
            n16 = (n2 - a2) / (a - a2);
            a = b;
        }
        else {
            n16 = n;
            a = b;
        }
        i.a = j.a;
        a += (int)((n9 - a) * n16);
        i.b = a;
        c = (int)(c2 + n16 * (n10 - c2));
        i.c = c;
        final float n17 = 1.0f - n;
        final int n18 = (int)(n7 * n17 + n4 * n);
        final int n19 = (int)(n17 * n6 + n5 * n);
        i.d = a + n18;
        i.e = c + n19;
        i.f = l(j.f, k.f, 0.5f, n);
        i.g = l(j.g, k.g, 0.5f, n);
        i.h = l(j.h, k.h, 0.0f, n);
        i.i = l(j.i, k.i, 0.0f, n);
        i.j = l(j.j, k.j, 0.0f, n);
        i.n = l(j.n, k.n, 1.0f, n);
        i.o = l(j.o, k.o, 1.0f, n);
        i.k = l(j.k, k.k, 0.0f, n);
        i.l = l(j.l, k.l, 0.0f, n);
        i.m = l(j.m, k.m, 0.0f, n);
        i.p = l(p7, n15, 1.0f, n);
    }
    
    public void A(final i i) {
        this.f = i.f;
        this.g = i.g;
        this.h = i.h;
        this.i = i.i;
        this.j = i.j;
        this.k = i.k;
        this.l = i.l;
        this.m = i.m;
        this.n = i.n;
        this.o = i.o;
        this.p = i.p;
        this.r = i.r;
        this.s.clear();
        for (final b b : i.s.values()) {
            this.s.put(b.k(), b.d());
        }
    }
    
    public int B() {
        return Math.max(0, this.d - this.b);
    }
    
    public void c(final String s, final int n) {
        this.u(s, 902, n);
    }
    
    public void d(final String s, final float n) {
        this.t(s, 901, n);
    }
    
    public float e() {
        final int b = this.b;
        return b + (this.d - b) / 2.0f;
    }
    
    public float f() {
        final int c = this.c;
        return c + (this.e - c) / 2.0f;
    }
    
    public b g(final String key) {
        return this.s.get(key);
    }
    
    public Set<String> h() {
        return this.s.keySet();
    }
    
    public int i(final String s) {
        if (this.s.containsKey(s)) {
            return this.s.get(s).g();
        }
        return -21880;
    }
    
    public float j(final String s) {
        if (this.s.containsKey(s)) {
            return this.s.get(s).h();
        }
        return Float.NaN;
    }
    
    public int k() {
        return Math.max(0, this.e - this.c);
    }
    
    public boolean n() {
        return Float.isNaN(this.h) && Float.isNaN(this.i) && Float.isNaN(this.j) && Float.isNaN(this.k) && Float.isNaN(this.l) && Float.isNaN(this.m) && Float.isNaN(this.n) && Float.isNaN(this.o) && Float.isNaN(this.p);
    }
    
    void o(final String str) {
        final StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        final StringBuilder sb = new StringBuilder();
        sb.append(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(") ");
        sb.append(stackTraceElement.getMethodName());
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(" ");
        sb2.append(this.hashCode() % 1000);
        final String string2 = sb2.toString();
        StringBuilder sb3;
        if (this.a != null) {
            sb3 = new StringBuilder();
            sb3.append(string2);
            sb3.append("/");
            sb3.append(this.a.hashCode() % 1000);
        }
        else {
            sb3 = new StringBuilder();
            sb3.append(string2);
            sb3.append("/NULL");
        }
        final String string3 = sb3.toString();
        final PrintStream out = System.out;
        final StringBuilder sb4 = new StringBuilder();
        sb4.append(string3);
        sb4.append(" ");
        sb4.append(str);
        out.println(sb4.toString());
    }
    
    void p(final c c) throws androidx.constraintlayout.core.parser.h {
        final f f = (f)c;
        for (int size = f.size(), i = 0; i < size; ++i) {
            final d d = (d)f.E(i);
            d.f();
            final c l0 = d.l0();
            final String f2 = l0.f();
            if (f2.matches("#[0-9a-fA-F]+")) {
                this.u(d.f(), 902, Integer.parseInt(f2.substring(1), 16));
            }
            else {
                final boolean b = l0 instanceof androidx.constraintlayout.core.parser.e;
                final String f3 = d.f();
                if (b) {
                    this.t(f3, 901, l0.l());
                }
                else {
                    this.v(f3, 903, f2);
                }
            }
        }
    }
    
    void q() {
        final StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        final StringBuilder sb = new StringBuilder();
        sb.append(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(") ");
        sb.append(stackTraceElement.getMethodName());
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(" ");
        sb2.append(this.hashCode() % 1000);
        final String string2 = sb2.toString();
        String str;
        if (this.a != null) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(string2);
            sb3.append("/");
            sb3.append(this.a.hashCode() % 1000);
            sb3.append(" ");
            str = sb3.toString();
        }
        else {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(string2);
            sb4.append("/NULL ");
            str = sb4.toString();
        }
        final HashMap<String, b> s = this.s;
        if (s != null) {
            for (final String key : s.keySet()) {
                final PrintStream out = System.out;
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(this.s.get(key).toString());
                out.println(sb5.toString());
            }
        }
    }
    
    public StringBuilder r(final StringBuilder sb) {
        return this.s(sb, false);
    }
    
    public StringBuilder s(final StringBuilder sb, final boolean b) {
        sb.append("{\n");
        b(sb, "left", this.b);
        b(sb, "top", this.c);
        b(sb, "right", this.d);
        b(sb, "bottom", this.e);
        a(sb, "pivotX", this.f);
        a(sb, "pivotY", this.g);
        a(sb, "rotationX", this.h);
        a(sb, "rotationY", this.i);
        a(sb, "rotationZ", this.j);
        a(sb, "translationX", this.k);
        a(sb, "translationY", this.l);
        a(sb, "translationZ", this.m);
        a(sb, "scaleX", this.n);
        a(sb, "scaleY", this.o);
        a(sb, "alpha", this.p);
        b(sb, "visibility", this.b);
        a(sb, "interpolatedPos", this.q);
        if (b) {
            a(sb, "phone_orientation", androidx.constraintlayout.core.state.i.v);
        }
        if (b) {
            a(sb, "phone_orientation", androidx.constraintlayout.core.state.i.v);
        }
        if (this.s.size() != 0) {
            sb.append("custom : {\n");
            for (final String s : this.s.keySet()) {
                final b b2 = this.s.get(s);
                sb.append(s);
                sb.append(": ");
                Label_0445: {
                    Label_0411: {
                        String str = null;
                        switch (b2.m()) {
                            default: {
                                continue;
                            }
                            case 904: {
                                sb.append("'");
                                sb.append(b2.f());
                                break Label_0411;
                            }
                            case 903: {
                                sb.append("'");
                                str = b2.l();
                                break;
                            }
                            case 902: {
                                sb.append("'");
                                str = b.c(b2.i());
                                break;
                            }
                            case 901:
                            case 905: {
                                sb.append(b2.h());
                                break Label_0445;
                            }
                            case 900: {
                                sb.append(b2.i());
                                break Label_0445;
                            }
                        }
                        sb.append(str);
                    }
                    sb.append("',\n");
                    continue;
                }
                sb.append(",\n");
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }
    
    public void t(final String key, final int n, final float n2) {
        if (this.s.containsKey(key)) {
            this.s.get(key).u(n2);
        }
        else {
            this.s.put(key, new b(key, n, n2));
        }
    }
    
    public void u(final String key, final int n, final int n2) {
        if (this.s.containsKey(key)) {
            this.s.get(key).v(n2);
        }
        else {
            this.s.put(key, new b(key, n, n2));
        }
    }
    
    public void v(final String key, final int n, final String s) {
        if (this.s.containsKey(key)) {
            this.s.get(key).x(s);
        }
        else {
            this.s.put(key, new b(key, n, s));
        }
    }
    
    public void w(final String key, final int n, final boolean b) {
        if (this.s.containsKey(key)) {
            this.s.get(key).t(b);
        }
        else {
            this.s.put(key, new b(key, n, b));
        }
    }
    
    public boolean x(final String s, final c c) throws androidx.constraintlayout.core.parser.h {
        s.hashCode();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 642850769: {
                if (!s.equals("interpolatedPos")) {
                    break;
                }
                n = 17;
                break;
            }
            case 108511772: {
                if (!s.equals("right")) {
                    break;
                }
                n = 16;
                break;
            }
            case 92909918: {
                if (!s.equals("alpha")) {
                    break;
                }
                n = 15;
                break;
            }
            case 3317767: {
                if (!s.equals("left")) {
                    break;
                }
                n = 14;
                break;
            }
            case 115029: {
                if (!s.equals("top")) {
                    break;
                }
                n = 13;
                break;
            }
            case -908189617: {
                if (!s.equals("scaleY")) {
                    break;
                }
                n = 12;
                break;
            }
            case -908189618: {
                if (!s.equals("scaleX")) {
                    break;
                }
                n = 11;
                break;
            }
            case -987906985: {
                if (!s.equals("pivotY")) {
                    break;
                }
                n = 10;
                break;
            }
            case -987906986: {
                if (!s.equals("pivotX")) {
                    break;
                }
                n = 9;
                break;
            }
            case -1225497655: {
                if (!s.equals("translationZ")) {
                    break;
                }
                n = 8;
                break;
            }
            case -1225497656: {
                if (!s.equals("translationY")) {
                    break;
                }
                n = 7;
                break;
            }
            case -1225497657: {
                if (!s.equals("translationX")) {
                    break;
                }
                n = 6;
                break;
            }
            case -1249320804: {
                if (!s.equals("rotationZ")) {
                    break;
                }
                n = 5;
                break;
            }
            case -1249320805: {
                if (!s.equals("rotationY")) {
                    break;
                }
                n = 4;
                break;
            }
            case -1249320806: {
                if (!s.equals("rotationX")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1349088399: {
                if (!s.equals("custom")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1383228885: {
                if (!s.equals("bottom")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1881940865: {
                if (!s.equals("phone_orientation")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return false;
            }
            case 17: {
                this.q = c.l();
                break;
            }
            case 16: {
                this.d = c.m();
                break;
            }
            case 15: {
                this.p = c.l();
                break;
            }
            case 14: {
                this.b = c.m();
                break;
            }
            case 13: {
                this.c = c.m();
                break;
            }
            case 12: {
                this.o = c.l();
                break;
            }
            case 11: {
                this.n = c.l();
                break;
            }
            case 10: {
                this.g = c.l();
                break;
            }
            case 9: {
                this.f = c.l();
                break;
            }
            case 8: {
                this.m = c.l();
                break;
            }
            case 7: {
                this.l = c.l();
                break;
            }
            case 6: {
                this.k = c.l();
                break;
            }
            case 5: {
                this.j = c.l();
                break;
            }
            case 4: {
                this.i = c.l();
                break;
            }
            case 3: {
                this.h = c.l();
                break;
            }
            case 2: {
                this.p(c);
                break;
            }
            case 1: {
                this.e = c.m();
                break;
            }
            case 0: {
                androidx.constraintlayout.core.state.i.v = c.l();
                break;
            }
        }
        return true;
    }
    
    public i y() {
        final e a = this.a;
        if (a != null) {
            this.b = a.L();
            this.c = this.a.b0();
            this.d = this.a.X();
            this.e = this.a.v();
            this.A(this.a.n);
        }
        return this;
    }
    
    public i z(final e a) {
        if (a == null) {
            return this;
        }
        this.a = a;
        this.y();
        return this;
    }
}
