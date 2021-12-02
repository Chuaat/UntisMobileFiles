// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.a;
import java.util.Collection;
import java.util.HashSet;
import androidx.constraintlayout.core.widgets.h;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.constraintlayout.core.widgets.f;

public class e
{
    private static final boolean j = true;
    private f a;
    private boolean b;
    private boolean c;
    private f d;
    private ArrayList<p> e;
    private ArrayList<m> f;
    private b.b g;
    private b.a h;
    ArrayList<m> i;
    
    public e(final f f) {
        this.b = true;
        this.c = true;
        this.e = new ArrayList<p>();
        this.f = new ArrayList<m>();
        this.g = null;
        this.h = new b.a();
        this.i = new ArrayList<m>();
        this.a = f;
        this.d = f;
    }
    
    private void a(final androidx.constraintlayout.core.widgets.analyzer.f f, final int n, final int n2, final androidx.constraintlayout.core.widgets.analyzer.f f2, final ArrayList<m> list, m m) {
        final p d = f.d;
        if (d.c != null) {
            return;
        }
        final f a = this.a;
        if (d == a.e) {
            return;
        }
        if (d == a.f) {
            return;
        }
        m i;
        if ((i = m) == null) {
            i = new m(d, n2);
            list.add(i);
        }
        (d.c = i).a(d);
        for (final d d2 : d.h.k) {
            if (d2 instanceof androidx.constraintlayout.core.widgets.analyzer.f) {
                this.a((androidx.constraintlayout.core.widgets.analyzer.f)d2, n, 0, f2, list, i);
            }
        }
        for (final d d3 : d.i.k) {
            if (d3 instanceof androidx.constraintlayout.core.widgets.analyzer.f) {
                this.a((androidx.constraintlayout.core.widgets.analyzer.f)d3, n, 1, f2, list, i);
            }
        }
        if (n == 1 && d instanceof n) {
            for (final d d4 : ((n)d).k.k) {
                if (d4 instanceof androidx.constraintlayout.core.widgets.analyzer.f) {
                    this.a((androidx.constraintlayout.core.widgets.analyzer.f)d4, n, 2, f2, list, i);
                }
            }
        }
        m = (m)d.h.l.iterator();
        while (((Iterator)m).hasNext()) {
            final androidx.constraintlayout.core.widgets.analyzer.f f3 = ((Iterator<androidx.constraintlayout.core.widgets.analyzer.f>)m).next();
            if (f3 == f2) {
                i.b = true;
            }
            this.a(f3, n, 0, f2, list, i);
        }
        final Iterator<androidx.constraintlayout.core.widgets.analyzer.f> iterator4 = d.i.l.iterator();
        while (iterator4.hasNext()) {
            m = (m)iterator4.next();
            if (m == f2) {
                i.b = true;
            }
            this.a((androidx.constraintlayout.core.widgets.analyzer.f)m, n, 1, f2, list, i);
        }
        if (n != 1 || !(d instanceof n)) {
            return;
        }
        m = (m)((n)d).k.l.iterator();
        while (true) {
            if (!((Iterator)m).hasNext()) {
                return;
            }
            final androidx.constraintlayout.core.widgets.analyzer.f f4 = ((Iterator<androidx.constraintlayout.core.widgets.analyzer.f>)m).next();
            try {
                this.a(f4, n, 2, f2, list, i);
                continue;
            }
            finally {}
            break;
        }
    }
    
    private boolean b(final f f) {
        androidx.constraintlayout.core.widgets.e.b[] b0;
        androidx.constraintlayout.core.widgets.e.b b2;
        androidx.constraintlayout.core.widgets.e.b b3;
        androidx.constraintlayout.core.widgets.e.b i;
        androidx.constraintlayout.core.widgets.e.b j;
        Enum<androidx.constraintlayout.core.widgets.e.b> h = null;
        Enum<androidx.constraintlayout.core.widgets.e.b> h2 = null;
        l e2;
        int w;
        n f2;
        int x;
        androidx.constraintlayout.core.widgets.e.b k;
        int n = 0;
        int j2;
        int g;
        int g2;
        Enum<androidx.constraintlayout.core.widgets.e.b> g3;
        int n2 = 0;
        int d;
        int g4;
        int g5;
        Enum<androidx.constraintlayout.core.widgets.e.b> enum1 = null;
        Enum<androidx.constraintlayout.core.widgets.e.b> enum2 = null;
        androidx.constraintlayout.core.widgets.e.b h3;
        g g6;
        int m;
        androidx.constraintlayout.core.widgets.e.b[] b4;
        androidx.constraintlayout.core.widgets.e.b b5;
        androidx.constraintlayout.core.widgets.e.b g7;
        androidx.constraintlayout.core.widgets.e.b b6;
        androidx.constraintlayout.core.widgets.d[] y;
        androidx.constraintlayout.core.widgets.e.b b7;
        androidx.constraintlayout.core.widgets.e.b h4;
        float f3;
        androidx.constraintlayout.core.widgets.e.b[] b8;
        androidx.constraintlayout.core.widgets.e.b b9;
        androidx.constraintlayout.core.widgets.e.b g8;
        float e3;
        androidx.constraintlayout.core.widgets.d[] y2;
        androidx.constraintlayout.core.widgets.e.b h5;
        androidx.constraintlayout.core.widgets.e.b[] b10;
        androidx.constraintlayout.core.widgets.e.b b11;
        float b12;
        float e4;
        Label_0548_Outer:Label_0509_Outer:
        for (final androidx.constraintlayout.core.widgets.e e : f.z1) {
            b0 = e.b0;
            b2 = b0[0];
            b3 = b0[1];
            if (e.i0() != 8) {
                if (e.B < 1.0f && b2 == androidx.constraintlayout.core.widgets.e.b.I) {
                    e.w = 2;
                }
                if (e.E < 1.0f && b3 == androidx.constraintlayout.core.widgets.e.b.I) {
                    e.x = 2;
                }
                Label_0218: {
                    if (e.A() > 0.0f) {
                        i = androidx.constraintlayout.core.widgets.e.b.I;
                        if (b2 == i && (b3 == androidx.constraintlayout.core.widgets.e.b.H || b3 == androidx.constraintlayout.core.widgets.e.b.G)) {
                            e.w = 3;
                        }
                        else {
                            if (b3 != i || (b2 != androidx.constraintlayout.core.widgets.e.b.H && b2 != androidx.constraintlayout.core.widgets.e.b.G)) {
                                if (b2 != i || b3 != i) {
                                    break Label_0218;
                                }
                                if (e.w == 0) {
                                    e.w = 3;
                                }
                                if (e.x != 0) {
                                    break Label_0218;
                                }
                            }
                            e.x = 3;
                        }
                    }
                }
                j = androidx.constraintlayout.core.widgets.e.b.I;
                Label_0275: {
                    if ((h = b2) == j) {
                        h = b2;
                        if (e.w == 1) {
                            if (e.Q.f != null) {
                                h = b2;
                                if (e.S.f != null) {
                                    break Label_0275;
                                }
                            }
                            h = androidx.constraintlayout.core.widgets.e.b.H;
                        }
                    }
                }
                Label_0327: {
                    if ((h2 = b3) == j) {
                        h2 = b3;
                        if (e.x == 1) {
                            if (e.R.f != null) {
                                h2 = b3;
                                if (e.T.f != null) {
                                    break Label_0327;
                                }
                            }
                            h2 = androidx.constraintlayout.core.widgets.e.b.H;
                        }
                    }
                }
                e2 = e.e;
                e2.d = (androidx.constraintlayout.core.widgets.e.b)h;
                w = e.w;
                e2.a = w;
                f2 = e.f;
                f2.d = (androidx.constraintlayout.core.widgets.e.b)h2;
                x = e.x;
                f2.a = x;
                k = androidx.constraintlayout.core.widgets.e.b.J;
                Label_1195: {
                    if ((h == k || h == androidx.constraintlayout.core.widgets.e.b.G || h == androidx.constraintlayout.core.widgets.e.b.H) && (h2 == k || h2 == androidx.constraintlayout.core.widgets.e.b.G || h2 == androidx.constraintlayout.core.widgets.e.b.H)) {
                        n = e.j0();
                        if (h == k) {
                            j2 = f.j0();
                            g = e.Q.g;
                            g2 = e.S.g;
                            g3 = androidx.constraintlayout.core.widgets.e.b.G;
                            n = j2 - g - g2;
                        }
                        else {
                            g3 = h;
                        }
                        n2 = e.D();
                        if (h2 == k) {
                            d = f.D();
                            g4 = e.R.g;
                            g5 = e.T.g;
                            enum1 = androidx.constraintlayout.core.widgets.e.b.G;
                            n2 = d - g4 - g5;
                        }
                        else {
                            enum1 = h2;
                        }
                        enum2 = g3;
                    }
                    else {
                    Label_0790_Outer:
                        while (true) {
                            while (true) {
                            Label_0662_Outer:
                                while (true) {
                                Label_0504_Outer:
                                    while (true) {
                                        while (true) {
                                            Label_0677: {
                                                if (h != j) {
                                                    break Label_0677;
                                                }
                                                h3 = androidx.constraintlayout.core.widgets.e.b.H;
                                                if (h2 != h3 && h2 != androidx.constraintlayout.core.widgets.e.b.G) {
                                                    break Label_0677;
                                                }
                                                if (w == 3) {
                                                    if (h2 == h3) {
                                                        this.r(e, h3, 0, h3, 0);
                                                    }
                                                    n2 = e.D();
                                                    n = (int)(n2 * e.f0 + 0.5f);
                                                }
                                                else {
                                                    if (w == 1) {
                                                        this.r(e, h3, 0, (androidx.constraintlayout.core.widgets.e.b)h2, 0);
                                                        g6 = e.e.e;
                                                        m = e.j0();
                                                        break Label_0548;
                                                    }
                                                    if (w == 2) {
                                                        b4 = f.b0;
                                                        b5 = b4[0];
                                                        g7 = androidx.constraintlayout.core.widgets.e.b.G;
                                                        if (b5 == g7 || b4[0] == k) {
                                                            n = (int)(e.B * f.j0() + 0.5f);
                                                            n2 = e.D();
                                                            b6 = g7;
                                                            break Label_0662;
                                                        }
                                                        break Label_0677;
                                                    }
                                                    else {
                                                        y = e.Y;
                                                        if (y[0].f == null || y[1].f == null) {
                                                            n = 0;
                                                            n2 = 0;
                                                            b6 = h3;
                                                            break Label_0662;
                                                        }
                                                        break Label_0677;
                                                    }
                                                }
                                                enum1 = androidx.constraintlayout.core.widgets.e.b.G;
                                                enum2 = enum1;
                                                break Label_1195;
                                                g6.m = m;
                                                continue Label_0548_Outer;
                                                b7 = (androidx.constraintlayout.core.widgets.e.b)h2;
                                                enum2 = b6;
                                                enum1 = b7;
                                                break Label_1195;
                                            }
                                            if (h2 != j) {
                                                break Label_0662_Outer;
                                            }
                                            h4 = androidx.constraintlayout.core.widgets.e.b.H;
                                            if (h != h4 && h != androidx.constraintlayout.core.widgets.e.b.G) {
                                                break Label_0662_Outer;
                                            }
                                            if (x == 3) {
                                                if (h == h4) {
                                                    this.r(e, h4, 0, h4, 0);
                                                }
                                                n = e.j0();
                                                f3 = e.f0;
                                                if (e.B() == -1) {
                                                    f3 = 1.0f / f3;
                                                }
                                                n2 = (int)(n * f3 + 0.5f);
                                                continue Label_0509_Outer;
                                            }
                                            break;
                                        }
                                        if (x == 1) {
                                            this.r(e, (androidx.constraintlayout.core.widgets.e.b)h, 0, h4, 0);
                                        }
                                        else if (x == 2) {
                                            b8 = f.b0;
                                            b9 = b8[1];
                                            g8 = androidx.constraintlayout.core.widgets.e.b.G;
                                            if (b9 == g8 || b8[1] == k) {
                                                e3 = e.E;
                                                n = e.j0();
                                                n2 = (int)(e3 * f.D() + 0.5f);
                                                enum2 = h;
                                                enum1 = g8;
                                                break Label_1195;
                                            }
                                            break Label_0662_Outer;
                                        }
                                        else {
                                            y2 = e.Y;
                                            if (y2[2].f == null || y2[3].f == null) {
                                                n = 0;
                                                n2 = 0;
                                                b6 = h4;
                                                continue Label_0504_Outer;
                                            }
                                            break Label_0662_Outer;
                                        }
                                        break;
                                    }
                                    g6 = e.f.e;
                                    m = e.D();
                                    continue Label_0662_Outer;
                                }
                                if (h != j || h2 != j) {
                                    continue Label_0548_Outer;
                                }
                                if (w == 1 || x == 1) {
                                    h5 = androidx.constraintlayout.core.widgets.e.b.H;
                                    this.r(e, h5, 0, h5, 0);
                                    e.e.e.m = e.j0();
                                    continue;
                                }
                                break;
                            }
                            if (x != 2 || w != 2) {
                                continue Label_0548_Outer;
                            }
                            b10 = f.b0;
                            b11 = b10[0];
                            enum1 = androidx.constraintlayout.core.widgets.e.b.G;
                            if (b11 == enum1 && b10[1] == enum1) {
                                b12 = e.B;
                                e4 = e.E;
                                n = (int)(b12 * f.j0() + 0.5f);
                                n2 = (int)(e4 * f.D() + 0.5f);
                                continue Label_0790_Outer;
                            }
                            break;
                        }
                        continue Label_0548_Outer;
                    }
                }
                this.r(e, (androidx.constraintlayout.core.widgets.e.b)enum2, n, (androidx.constraintlayout.core.widgets.e.b)enum1, n2);
                e.e.e.e(e.j0());
                e.f.e.e(e.D());
            }
            e.a = true;
        }
        return false;
    }
    
    private int e(final f f, final int n) {
        final int size = this.i.size();
        long max = 0L;
        for (int i = 0; i < size; ++i) {
            max = Math.max(max, this.i.get(i).b(f, n));
        }
        return (int)max;
    }
    
    private void j() {
        final Iterator<p> iterator = this.e.iterator();
        String m = "digraph {\n";
        while (iterator.hasNext()) {
            m = this.m(iterator.next(), m);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(m);
        sb.append("\n}\n");
        final String string = sb.toString();
        final PrintStream out = System.out;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("content:<<\n");
        sb2.append(string);
        sb2.append("\n>>");
        out.println(sb2.toString());
    }
    
    private void k(final p p3, final int n, final ArrayList<m> list) {
        for (final d d : p3.h.k) {
            if (d instanceof androidx.constraintlayout.core.widgets.analyzer.f) {
                this.a((androidx.constraintlayout.core.widgets.analyzer.f)d, n, 0, p3.i, list, null);
            }
            else {
                if (!(d instanceof p)) {
                    continue;
                }
                this.a(((p)d).h, n, 0, p3.i, list, null);
            }
        }
        for (final d d2 : p3.i.k) {
            if (d2 instanceof androidx.constraintlayout.core.widgets.analyzer.f) {
                this.a((androidx.constraintlayout.core.widgets.analyzer.f)d2, n, 1, p3.h, list, null);
            }
            else {
                if (!(d2 instanceof p)) {
                    continue;
                }
                this.a(((p)d2).i, n, 1, p3.h, list, null);
            }
        }
        if (n == 1) {
            for (final d d3 : ((n)p3).k.k) {
                if (d3 instanceof androidx.constraintlayout.core.widgets.analyzer.f) {
                    this.a((androidx.constraintlayout.core.widgets.analyzer.f)d3, n, 2, null, list, null);
                }
            }
        }
    }
    
    private String l(final c c, final String str) {
        final int f = c.f;
        final StringBuilder obj = new StringBuilder("subgraph ");
        obj.append("cluster_");
        obj.append(c.b.y());
        String str2;
        if (f == 0) {
            str2 = "_h";
        }
        else {
            str2 = "_v";
        }
        obj.append(str2);
        obj.append(" {\n");
        final Iterator<p> iterator = c.k.iterator();
        String m = "";
        while (iterator.hasNext()) {
            final p p2 = iterator.next();
            obj.append(p2.b.y());
            String str3;
            if (f == 0) {
                str3 = "_HORIZONTAL";
            }
            else {
                str3 = "_VERTICAL";
            }
            obj.append(str3);
            obj.append(";\n");
            m = this.m(p2, m);
        }
        obj.append("}\n");
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(m);
        sb.append((Object)obj);
        return sb.toString();
    }
    
    private String m(final p p2, String n) {
        final androidx.constraintlayout.core.widgets.analyzer.f h = p2.h;
        final androidx.constraintlayout.core.widgets.analyzer.f i = p2.i;
        final StringBuilder sb = new StringBuilder(n);
        if (!(p2 instanceof k) && h.k.isEmpty() && (i.k.isEmpty() & h.l.isEmpty()) && i.l.isEmpty()) {
            return n;
        }
        sb.append(this.t(p2));
        final boolean q = this.q(h, i);
        final String n2 = this.n(i, q, this.n(h, q, n));
        final boolean b = p2 instanceof n;
        n = n2;
        if (b) {
            n = this.n(((n)p2).k, q, n2);
        }
    Label_0411_Outer:
        while (true) {
        Label_0295_Outer:
            while (true) {
                while (true) {
                    Label_0449: {
                        if (p2 instanceof l) {
                            break Label_0449;
                        }
                        final boolean b2 = p2 instanceof c;
                        if (b2 && ((c)p2).f == 0) {
                            break Label_0449;
                        }
                        if (!b && (!b2 || ((c)p2).f != 1)) {
                            break Label_0411_Outer;
                        }
                        final androidx.constraintlayout.core.widgets.e.b g0 = p2.b.g0();
                        String str;
                        if (g0 != androidx.constraintlayout.core.widgets.e.b.G && g0 != androidx.constraintlayout.core.widgets.e.b.H) {
                            if (g0 != androidx.constraintlayout.core.widgets.e.b.I || p2.b.A() <= 0.0f) {
                                break Label_0411_Outer;
                            }
                            sb.append("\n");
                            sb.append(p2.b.y());
                            sb.append("_VERTICAL -> ");
                            sb.append(p2.b.y());
                            str = "_HORIZONTAL;\n";
                        }
                        else {
                            if (!h.l.isEmpty() && i.l.isEmpty()) {
                                break Label_0331;
                            }
                            if (h.l.isEmpty() && !i.l.isEmpty()) {
                                break Label_0411;
                            }
                            break Label_0411_Outer;
                        }
                        sb.append(str);
                        break Label_0411_Outer;
                        sb.append("\n");
                        sb.append(i.d());
                        sb.append(" -> ");
                        String str2 = h.d();
                        while (true) {
                            sb.append(str2);
                            sb.append("\n");
                            break Label_0411_Outer;
                            sb.append("\n");
                            sb.append(h.d());
                            sb.append(" -> ");
                            str2 = i.d();
                            continue;
                        }
                    }
                    final androidx.constraintlayout.core.widgets.e.b h2 = p2.b.H();
                    if (h2 != androidx.constraintlayout.core.widgets.e.b.G && h2 != androidx.constraintlayout.core.widgets.e.b.H) {
                        if (h2 == androidx.constraintlayout.core.widgets.e.b.I && p2.b.A() > 0.0f) {
                            sb.append("\n");
                            sb.append(p2.b.y());
                            sb.append("_HORIZONTAL -> ");
                            sb.append(p2.b.y());
                            final String str = "_VERTICAL;\n";
                            continue;
                        }
                    }
                    else {
                        if (!h.l.isEmpty() && i.l.isEmpty()) {
                            continue Label_0411_Outer;
                        }
                        if (h.l.isEmpty() && !i.l.isEmpty()) {
                            continue Label_0295_Outer;
                        }
                    }
                    break;
                }
                break;
            }
            break;
        }
        if (p2 instanceof c) {
            return this.l((c)p2, n);
        }
        return sb.toString();
    }
    
    private String n(final androidx.constraintlayout.core.widgets.analyzer.f f, final boolean b, String s) {
        final StringBuilder sb = new StringBuilder(s);
        for (final androidx.constraintlayout.core.widgets.analyzer.f f2 : f.l) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("\n");
            sb2.append(f.d());
            final String string = sb2.toString();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append(" -> ");
            sb3.append(f2.d());
            final String string2 = sb3.toString();
            Label_0375: {
                if (f.f <= 0 && !b) {
                    s = string2;
                    if (!(f.d instanceof k)) {
                        break Label_0375;
                    }
                }
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string2);
                sb4.append("[");
                final String str = s = sb4.toString();
                if (f.f > 0) {
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append(str);
                    sb5.append("label=\"");
                    sb5.append(f.f);
                    sb5.append("\"");
                    final String str2 = s = sb5.toString();
                    if (b) {
                        final StringBuilder sb6 = new StringBuilder();
                        sb6.append(str2);
                        sb6.append(",");
                        s = sb6.toString();
                    }
                }
                String string3 = s;
                if (b) {
                    final StringBuilder sb7 = new StringBuilder();
                    sb7.append(s);
                    sb7.append(" style=dashed ");
                    string3 = sb7.toString();
                }
                s = string3;
                if (f.d instanceof k) {
                    final StringBuilder sb8 = new StringBuilder();
                    sb8.append(string3);
                    sb8.append(" style=bold,color=gray ");
                    s = sb8.toString();
                }
                final StringBuilder sb9 = new StringBuilder();
                sb9.append(s);
                sb9.append("]");
                s = sb9.toString();
            }
            final StringBuilder sb10 = new StringBuilder();
            sb10.append(s);
            sb10.append("\n");
            sb.append(sb10.toString());
        }
        return sb.toString();
    }
    
    private boolean q(final androidx.constraintlayout.core.widgets.analyzer.f f, final androidx.constraintlayout.core.widgets.analyzer.f f2) {
        final Iterator<androidx.constraintlayout.core.widgets.analyzer.f> iterator = f.l.iterator();
        final boolean b = false;
        int n = 0;
        while (iterator.hasNext()) {
            if (iterator.next() != f2) {
                ++n;
            }
        }
        final Iterator<androidx.constraintlayout.core.widgets.analyzer.f> iterator2 = f2.l.iterator();
        int n2 = 0;
        while (iterator2.hasNext()) {
            if (iterator2.next() != f) {
                ++n2;
            }
        }
        boolean b2 = b;
        if (n > 0) {
            b2 = b;
            if (n2 > 0) {
                b2 = true;
            }
        }
        return b2;
    }
    
    private void r(final androidx.constraintlayout.core.widgets.e e, final androidx.constraintlayout.core.widgets.e.b a, final int c, final androidx.constraintlayout.core.widgets.e.b b, final int d) {
        final b.a h = this.h;
        h.a = a;
        h.b = b;
        h.c = c;
        h.d = d;
        this.g.b(e, h);
        e.W1(this.h.e);
        e.s1(this.h.f);
        e.r1(this.h.h);
        e.a1(this.h.g);
    }
    
    private String t(final p p) {
        final boolean b = p instanceof n;
        final String y = p.b.y();
        final StringBuilder sb = new StringBuilder(y);
        final androidx.constraintlayout.core.widgets.e b2 = p.b;
        androidx.constraintlayout.core.widgets.e.b b3;
        if (!b) {
            b3 = b2.H();
        }
        else {
            b3 = b2.g0();
        }
        final m c = p.c;
        String str;
        if (!b) {
            str = "_HORIZONTAL";
        }
        else {
            str = "_VERTICAL";
        }
        sb.append(str);
        sb.append(" [shape=none, label=<");
        sb.append("<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">");
        sb.append("  <TR>");
        sb.append("    <TD ");
        final boolean j = p.h.j;
        String str2;
        if (!b) {
            if (j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            str2 = " PORT=\"LEFT\" BORDER=\"1\">L</TD>";
        }
        else {
            if (j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            str2 = " PORT=\"TOP\" BORDER=\"1\">T</TD>";
        }
        sb.append(str2);
        sb.append("    <TD BORDER=\"1\" ");
        final boolean i = p.e.j;
        Label_0259: {
            String str3;
            if (i && !p.b.a) {
                str3 = " BGCOLOR=\"green\" ";
            }
            else if (i) {
                str3 = " BGCOLOR=\"lightgray\" ";
            }
            else {
                if (!p.b.a) {
                    break Label_0259;
                }
                str3 = " BGCOLOR=\"yellow\" ";
            }
            sb.append(str3);
        }
        if (b3 == androidx.constraintlayout.core.widgets.e.b.I) {
            sb.append("style=\"dashed\"");
        }
        sb.append(">");
        sb.append(y);
        if (c != null) {
            sb.append(" [");
            sb.append(c.f + 1);
            sb.append("/");
            sb.append(m.k);
            sb.append("]");
        }
        sb.append(" </TD>");
        sb.append("    <TD ");
        String str4;
        if (!b) {
            if (p.i.j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            str4 = " PORT=\"RIGHT\" BORDER=\"1\">R</TD>";
        }
        else {
            if (((n)p).k.j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BASELINE\" BORDER=\"1\">b</TD>");
            sb.append("    <TD ");
            if (p.i.j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            str4 = " PORT=\"BOTTOM\" BORDER=\"1\">B</TD>";
        }
        sb.append(str4);
        sb.append("  </TR></TABLE>");
        sb.append(">];\n");
        return sb.toString();
    }
    
    public void c() {
        this.d(this.e);
        this.i.clear();
        m.k = 0;
        this.k(this.a.e, 0, this.i);
        this.k(this.a.f, 1, this.i);
        this.b = false;
    }
    
    public void d(final ArrayList<p> list) {
        list.clear();
        this.d.e.f();
        this.d.f.f();
        list.add(this.d.e);
        list.add(this.d.f);
        final Iterator<androidx.constraintlayout.core.widgets.e> iterator = this.d.z1.iterator();
        Collection<? extends l> c = null;
        while (iterator.hasNext()) {
            final androidx.constraintlayout.core.widgets.e e = iterator.next();
            p e2;
            if (e instanceof h) {
                e2 = new j(e);
            }
            else {
                if (e.x0()) {
                    if (e.c == null) {
                        e.c = new c(e, 0);
                    }
                    HashSet<? extends l> set;
                    if ((set = (HashSet<? extends l>)c) == null) {
                        set = new HashSet<l>();
                    }
                    set.add((l)e.c);
                    c = set;
                }
                else {
                    list.add(e.e);
                }
                HashSet<? extends l> set2;
                if (e.z0()) {
                    if (e.d == null) {
                        e.d = new c(e, 1);
                    }
                    if ((set2 = (HashSet<? extends l>)c) == null) {
                        set2 = new HashSet<l>();
                    }
                    set2.add((l)e.d);
                }
                else {
                    list.add(e.f);
                    set2 = (HashSet<? extends l>)c;
                }
                c = set2;
                if (!(e instanceof androidx.constraintlayout.core.widgets.j)) {
                    continue;
                }
                final k k = new k(e);
                c = set2;
                e2 = k;
            }
            list.add(e2);
        }
        if (c != null) {
            list.addAll(c);
        }
        final Iterator<l> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().f();
        }
        for (final l l : list) {
            if (l.b == this.d) {
                continue;
            }
            l.d();
        }
    }
    
    public void f(final androidx.constraintlayout.core.widgets.e.b b, final androidx.constraintlayout.core.widgets.e.b b2) {
        if (this.b) {
            this.c();
            final Iterator<androidx.constraintlayout.core.widgets.e> iterator = this.a.z1.iterator();
            boolean b3 = false;
            while (iterator.hasNext()) {
                final androidx.constraintlayout.core.widgets.e e = iterator.next();
                final boolean[] g = e.g;
                g[1] = (g[0] = true);
                if (e instanceof a) {
                    b3 = true;
                }
            }
            if (!b3) {
                for (final m m : this.i) {
                    final androidx.constraintlayout.core.widgets.e.b h = androidx.constraintlayout.core.widgets.e.b.H;
                    m.d(b == h, b2 == h);
                }
            }
        }
    }
    
    public boolean g(final boolean b) {
        final boolean b2 = true;
        final boolean b3 = b & true;
        if (this.b || this.c) {
            for (final androidx.constraintlayout.core.widgets.e e : this.a.z1) {
                e.q();
                e.a = false;
                e.e.n();
                e.f.n();
            }
            this.a.q();
            final f a = this.a;
            a.a = false;
            a.e.n();
            this.a.f.n();
            this.c = false;
        }
        if (this.b(this.d)) {
            return false;
        }
        this.a.Z1(0);
        this.a.a2(0);
        final androidx.constraintlayout.core.widgets.e.b z = this.a.z(0);
        final androidx.constraintlayout.core.widgets.e.b z2 = this.a.z(1);
        if (this.b) {
            this.c();
        }
        final int l0 = this.a.l0();
        final int m0 = this.a.m0();
        this.a.e.h.e(l0);
        this.a.f.h.e(m0);
        this.s();
        final androidx.constraintlayout.core.widgets.e.b h = androidx.constraintlayout.core.widgets.e.b.H;
        if (z == h || z2 == h) {
            boolean b4 = false;
            Label_0305: {
                if (b4 = b3) {
                    final Iterator<p> iterator2 = this.e.iterator();
                    do {
                        b4 = b3;
                        if (iterator2.hasNext()) {
                            continue;
                        }
                        break Label_0305;
                    } while (iterator2.next().p());
                    b4 = false;
                }
            }
            if (b4 && z == androidx.constraintlayout.core.widgets.e.b.H) {
                this.a.x1(androidx.constraintlayout.core.widgets.e.b.G);
                final f a2 = this.a;
                a2.W1(this.e(a2, 0));
                final f a3 = this.a;
                a3.e.e.e(a3.j0());
            }
            if (b4 && z2 == androidx.constraintlayout.core.widgets.e.b.H) {
                this.a.S1(androidx.constraintlayout.core.widgets.e.b.G);
                final f a4 = this.a;
                a4.s1(this.e(a4, 1));
                final f a5 = this.a;
                a5.f.e.e(a5.D());
            }
        }
        final f a6 = this.a;
        final androidx.constraintlayout.core.widgets.e.b[] b5 = a6.b0;
        final androidx.constraintlayout.core.widgets.e.b b6 = b5[0];
        final androidx.constraintlayout.core.widgets.e.b g = androidx.constraintlayout.core.widgets.e.b.G;
        boolean b7;
        if (b6 != g && b5[0] != androidx.constraintlayout.core.widgets.e.b.J) {
            b7 = false;
        }
        else {
            final int n = a6.j0() + l0;
            this.a.e.i.e(n);
            this.a.e.e.e(n - l0);
            this.s();
            final f a7 = this.a;
            final androidx.constraintlayout.core.widgets.e.b[] b8 = a7.b0;
            if (b8[1] == g || b8[1] == androidx.constraintlayout.core.widgets.e.b.J) {
                final int n2 = a7.D() + m0;
                this.a.f.i.e(n2);
                this.a.f.e.e(n2 - m0);
            }
            this.s();
            b7 = true;
        }
        for (final p p : this.e) {
            if (p.b == this.a && !p.g) {
                continue;
            }
            p.e();
        }
        final Iterator<p> iterator4 = this.e.iterator();
        boolean b9 = false;
        Label_0793: {
            while (true) {
                b9 = b2;
                if (!iterator4.hasNext()) {
                    break Label_0793;
                }
                final p p2 = iterator4.next();
                if (!b7 && p2.b == this.a) {
                    continue;
                }
                if (!p2.h.j) {
                    break;
                }
                if (!p2.i.j && !(p2 instanceof j)) {
                    break;
                }
                if (!p2.e.j && !(p2 instanceof c) && !(p2 instanceof j)) {
                    break;
                }
            }
            b9 = false;
        }
        this.a.x1(z);
        this.a.S1(z2);
        return b9;
    }
    
    public boolean h(final boolean b) {
        if (this.b) {
            for (final androidx.constraintlayout.core.widgets.e e : this.a.z1) {
                e.q();
                e.a = false;
                final l e2 = e.e;
                e2.e.j = false;
                e2.g = false;
                e2.n();
                final n f = e.f;
                f.e.j = false;
                f.g = false;
                f.n();
            }
            this.a.q();
            final f a = this.a;
            a.a = false;
            final l e3 = a.e;
            e3.e.j = false;
            e3.g = false;
            e3.n();
            final n f2 = this.a.f;
            f2.e.j = false;
            f2.g = false;
            f2.n();
            this.c();
        }
        if (this.b(this.d)) {
            return false;
        }
        this.a.Z1(0);
        this.a.a2(0);
        this.a.e.h.e(0);
        this.a.f.h.e(0);
        return true;
    }
    
    public boolean i(final boolean b, final int n) {
        final boolean b2 = true;
        final boolean b3 = b & true;
        final androidx.constraintlayout.core.widgets.e.b z = this.a.z(0);
        final androidx.constraintlayout.core.widgets.e.b z2 = this.a.z(1);
        final int l0 = this.a.l0();
        final int m0 = this.a.m0();
        Label_0266: {
            if (b3) {
                final androidx.constraintlayout.core.widgets.e.b h = androidx.constraintlayout.core.widgets.e.b.H;
                if (z == h || z2 == h) {
                    final Iterator<p> iterator = this.e.iterator();
                    while (true) {
                        p p2;
                        do {
                            final boolean b4 = b3;
                            if (!iterator.hasNext()) {
                                g g;
                                int n2;
                                if (n == 0) {
                                    if (!b4 || z != androidx.constraintlayout.core.widgets.e.b.H) {
                                        break Label_0266;
                                    }
                                    this.a.x1(androidx.constraintlayout.core.widgets.e.b.G);
                                    final f a = this.a;
                                    a.W1(this.e(a, 0));
                                    final f a2 = this.a;
                                    g = a2.e.e;
                                    n2 = a2.j0();
                                }
                                else {
                                    if (!b4 || z2 != androidx.constraintlayout.core.widgets.e.b.H) {
                                        break Label_0266;
                                    }
                                    this.a.S1(androidx.constraintlayout.core.widgets.e.b.G);
                                    final f a3 = this.a;
                                    a3.s1(this.e(a3, 1));
                                    final f a4 = this.a;
                                    g = a4.f.e;
                                    n2 = a4.D();
                                }
                                g.e(n2);
                                break Label_0266;
                            }
                            p2 = iterator.next();
                        } while (p2.f != n || p2.p());
                        final boolean b4 = false;
                        continue;
                    }
                }
            }
        }
        final f a5 = this.a;
        boolean b7 = false;
        Label_0431: {
            Label_0428: {
                if (n == 0) {
                    final androidx.constraintlayout.core.widgets.e.b[] b5 = a5.b0;
                    if (b5[0] == androidx.constraintlayout.core.widgets.e.b.G || b5[0] == androidx.constraintlayout.core.widgets.e.b.J) {
                        final int n3 = a5.j0() + l0;
                        this.a.e.i.e(n3);
                        this.a.e.e.e(n3 - l0);
                        break Label_0428;
                    }
                }
                else {
                    final androidx.constraintlayout.core.widgets.e.b[] b6 = a5.b0;
                    if (b6[1] == androidx.constraintlayout.core.widgets.e.b.G || b6[1] == androidx.constraintlayout.core.widgets.e.b.J) {
                        final int n4 = a5.D() + m0;
                        this.a.f.i.e(n4);
                        this.a.f.e.e(n4 - m0);
                        break Label_0428;
                    }
                }
                b7 = false;
                break Label_0431;
            }
            b7 = true;
        }
        this.s();
        for (final p p3 : this.e) {
            if (p3.f != n) {
                continue;
            }
            if (p3.b == this.a && !p3.g) {
                continue;
            }
            p3.e();
        }
        final Iterator<p> iterator3 = this.e.iterator();
        boolean b8 = false;
        Label_0626: {
            while (true) {
                b8 = b2;
                if (!iterator3.hasNext()) {
                    break Label_0626;
                }
                final p p4 = iterator3.next();
                if (p4.f != n) {
                    continue;
                }
                if (!b7 && p4.b == this.a) {
                    continue;
                }
                if (!p4.h.j) {
                    break;
                }
                if (!p4.i.j) {
                    break;
                }
                if (!(p4 instanceof c) && !p4.e.j) {
                    break;
                }
            }
            b8 = false;
        }
        this.a.x1(z);
        this.a.S1(z2);
        return b8;
    }
    
    public void o() {
        this.b = true;
    }
    
    public void p() {
        this.c = true;
    }
    
    public void s() {
        for (final androidx.constraintlayout.core.widgets.e e : this.a.z1) {
            if (e.a) {
                continue;
            }
            final androidx.constraintlayout.core.widgets.e.b[] b0 = e.b0;
            final int n = 0;
            final androidx.constraintlayout.core.widgets.e.b b2 = b0[0];
            final androidx.constraintlayout.core.widgets.e.b b3 = b0[1];
            final int w = e.w;
            final int x = e.x;
            final androidx.constraintlayout.core.widgets.e.b h = androidx.constraintlayout.core.widgets.e.b.H;
            final boolean b4 = b2 == h || (b2 == androidx.constraintlayout.core.widgets.e.b.I && w == 1);
            int n2 = 0;
            Label_0140: {
                if (b3 != h) {
                    n2 = n;
                    if (b3 != androidx.constraintlayout.core.widgets.e.b.I) {
                        break Label_0140;
                    }
                    n2 = n;
                    if (x != 1) {
                        break Label_0140;
                    }
                }
                n2 = 1;
            }
            final g e2 = e.e.e;
            final boolean j = e2.j;
            final g e3 = e.f.e;
            final boolean i = e3.j;
            Label_0365: {
                if (j && i) {
                    final androidx.constraintlayout.core.widgets.e.b g = androidx.constraintlayout.core.widgets.e.b.G;
                    this.r(e, g, e2.g, g, e3.g);
                }
                else {
                    g g2 = null;
                    int n3 = 0;
                    Label_0285: {
                        g g3;
                        int m;
                        if (j && n2 != 0) {
                            this.r(e, androidx.constraintlayout.core.widgets.e.b.G, e2.g, h, e3.g);
                            if (b3 != androidx.constraintlayout.core.widgets.e.b.I) {
                                g2 = e.f.e;
                                n3 = e.D();
                                break Label_0285;
                            }
                            g3 = e.f.e;
                            m = e.D();
                        }
                        else {
                            if (!i || !b4) {
                                break Label_0365;
                            }
                            this.r(e, h, e2.g, androidx.constraintlayout.core.widgets.e.b.G, e3.g);
                            if (b2 != androidx.constraintlayout.core.widgets.e.b.I) {
                                g2 = e.e.e;
                                n3 = e.j0();
                                break Label_0285;
                            }
                            g3 = e.e.e;
                            m = e.j0();
                        }
                        g3.m = m;
                        break Label_0365;
                    }
                    g2.e(n3);
                }
                e.a = true;
            }
            if (!e.a) {
                continue;
            }
            final g l = e.f.l;
            if (l == null) {
                continue;
            }
            l.e(e.t());
        }
    }
    
    public void u(final b.b g) {
        this.g = g;
    }
}
