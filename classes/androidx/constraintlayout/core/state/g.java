// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.h;
import java.io.PrintStream;
import androidx.constraintlayout.core.widgets.j;
import java.util.Iterator;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.state.helpers.f;
import java.util.ArrayList;
import java.util.HashMap;

public class g
{
    static final int f = -1;
    static final int g = 0;
    static final int h = 1;
    static final int i = 2;
    public static final Integer j;
    protected HashMap<Object, androidx.constraintlayout.core.state.d> a;
    protected HashMap<Object, androidx.constraintlayout.core.state.c> b;
    HashMap<String, ArrayList<String>> c;
    public final a d;
    private int e;
    
    static {
        j = 0;
    }
    
    public g() {
        this.a = new HashMap<Object, androidx.constraintlayout.core.state.d>();
        this.b = new HashMap<Object, androidx.constraintlayout.core.state.c>();
        this.c = new HashMap<String, ArrayList<String>>();
        final a a = new a(this);
        this.d = a;
        this.e = 0;
        this.a.put(androidx.constraintlayout.core.state.g.j, a);
    }
    
    private String h() {
        final StringBuilder sb = new StringBuilder();
        sb.append("__HELPER_KEY_");
        sb.append(this.e++);
        sb.append("__");
        return sb.toString();
    }
    
    public f A(final Object o) {
        return this.k(o, 1);
    }
    
    public g B(final androidx.constraintlayout.core.state.b b) {
        return this.x(b);
    }
    
    public void a(final androidx.constraintlayout.core.widgets.f f) {
        f.j2();
        this.d.S().j(this, f, 0);
        this.d.C().j(this, f, 1);
        for (final Object next : this.b.keySet()) {
            final j g0 = this.b.get(next).G0();
            if (g0 != null) {
                androidx.constraintlayout.core.state.d e;
                if ((e = this.a.get(next)) == null) {
                    e = this.e(next);
                }
                e.c(g0);
            }
        }
        for (final Object next2 : this.a.keySet()) {
            final androidx.constraintlayout.core.state.d d = this.a.get(next2);
            if (d != this.d && d.e() instanceof androidx.constraintlayout.core.state.c) {
                final j g2 = ((androidx.constraintlayout.core.state.c)d.e()).G0();
                if (g2 == null) {
                    continue;
                }
                androidx.constraintlayout.core.state.d e2;
                if ((e2 = this.a.get(next2)) == null) {
                    e2 = this.e(next2);
                }
                e2.c(g2);
            }
        }
        final Iterator<Object> iterator3 = this.a.keySet().iterator();
        while (iterator3.hasNext()) {
            final androidx.constraintlayout.core.state.d d2 = this.a.get(iterator3.next());
            if (d2 != this.d) {
                final androidx.constraintlayout.core.widgets.e b = d2.b();
                b.d1(d2.getKey().toString());
                b.M1(null);
                if (d2.e() instanceof f) {
                    d2.a();
                }
                f.b(b);
            }
            else {
                d2.c(f);
            }
        }
        final Iterator<Object> iterator4 = this.b.keySet().iterator();
        while (iterator4.hasNext()) {
            final androidx.constraintlayout.core.state.c c = this.b.get(iterator4.next());
            if (c.G0() != null) {
                final Iterator<Object> iterator5 = c.f0.iterator();
                while (iterator5.hasNext()) {
                    c.G0().b(this.a.get(iterator5.next()).b());
                }
            }
            c.a();
        }
        final Iterator<Object> iterator6 = this.a.keySet().iterator();
        while (iterator6.hasNext()) {
            final androidx.constraintlayout.core.state.d d3 = this.a.get(iterator6.next());
            if (d3 != this.d && d3.e() instanceof androidx.constraintlayout.core.state.c) {
                final androidx.constraintlayout.core.state.c c2 = (androidx.constraintlayout.core.state.c)d3.e();
                final j g3 = c2.G0();
                if (g3 == null) {
                    continue;
                }
                for (final androidx.constraintlayout.core.state.d next3 : c2.f0) {
                    final androidx.constraintlayout.core.state.d d4 = this.a.get(next3);
                    androidx.constraintlayout.core.widgets.e e3;
                    if (d4 != null) {
                        e3 = d4.b();
                    }
                    else {
                        if (!(next3 instanceof androidx.constraintlayout.core.state.d)) {
                            final PrintStream out = System.out;
                            final StringBuilder sb = new StringBuilder();
                            sb.append("couldn't find reference for ");
                            sb.append(next3);
                            out.println(sb.toString());
                            continue;
                        }
                        e3 = next3.b();
                    }
                    g3.b(e3);
                }
                d3.a();
            }
        }
        for (final String next4 : this.a.keySet()) {
            final androidx.constraintlayout.core.state.d d5 = this.a.get(next4);
            d5.a();
            final androidx.constraintlayout.core.widgets.e b2 = d5.b();
            if (b2 != null && next4 instanceof String) {
                b2.o = next4;
            }
        }
    }
    
    public androidx.constraintlayout.core.state.helpers.c b(final Object o, final d d) {
        final a e = this.e(o);
        if (e.e() == null || !(e.e() instanceof androidx.constraintlayout.core.state.helpers.c)) {
            final androidx.constraintlayout.core.state.helpers.c c = new androidx.constraintlayout.core.state.helpers.c(this);
            c.J0(d);
            e.l0(c);
        }
        return (androidx.constraintlayout.core.state.helpers.c)e.e();
    }
    
    public androidx.constraintlayout.core.state.helpers.a c(final Object... array) {
        final androidx.constraintlayout.core.state.helpers.a a = (androidx.constraintlayout.core.state.helpers.a)this.m(null, androidx.constraintlayout.core.state.g.e.I);
        a.F0(array);
        return a;
    }
    
    public androidx.constraintlayout.core.state.helpers.b d(final Object... array) {
        final androidx.constraintlayout.core.state.helpers.b b = (androidx.constraintlayout.core.state.helpers.b)this.m(null, androidx.constraintlayout.core.state.g.e.J);
        b.F0(array);
        return b;
    }
    
    public a e(final Object o) {
        androidx.constraintlayout.core.state.d g;
        if ((g = this.a.get(o)) == null) {
            g = this.g(o);
            this.a.put(o, g);
            g.d(o);
        }
        if (g instanceof a) {
            return (a)g;
        }
        return null;
    }
    
    public int f(final Object o) {
        if (o instanceof Float) {
            return ((Float)o).intValue();
        }
        if (o instanceof Integer) {
            return (int)o;
        }
        return 0;
    }
    
    public a g(final Object o) {
        return new a(this);
    }
    
    public void i() {
        for (final Object next : this.a.keySet()) {
            final a e = this.e(next);
            if (!(e instanceof a)) {
                continue;
            }
            e.q0(next);
        }
    }
    
    public ArrayList<String> j(final String s) {
        if (this.c.containsKey(s)) {
            return this.c.get(s);
        }
        return null;
    }
    
    public f k(final Object o, final int n) {
        final a e = this.e(o);
        if (e.e() == null || !(e.e() instanceof f)) {
            final f f = new f(this);
            f.i(n);
            f.d(o);
            e.l0(f);
        }
        return (f)e.e();
    }
    
    public g l(final androidx.constraintlayout.core.state.b b) {
        return this.v(b);
    }
    
    public androidx.constraintlayout.core.state.c m(Object value, final e e) {
        Object h = value;
        if (value == null) {
            h = this.h();
        }
        if ((value = this.b.get(h)) == null) {
            final int n = g$a.a[e.ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n != 5) {
                                value = new androidx.constraintlayout.core.state.c(this, e);
                            }
                            else {
                                value = new androidx.constraintlayout.core.state.helpers.c(this);
                            }
                        }
                        else {
                            value = new androidx.constraintlayout.core.state.helpers.b(this);
                        }
                    }
                    else {
                        value = new androidx.constraintlayout.core.state.helpers.a(this);
                    }
                }
                else {
                    value = new h(this);
                }
            }
            else {
                value = new androidx.constraintlayout.core.state.helpers.g(this);
            }
            this.b.put(h, (androidx.constraintlayout.core.state.c)value);
        }
        return (androidx.constraintlayout.core.state.c)value;
    }
    
    public androidx.constraintlayout.core.state.helpers.g n() {
        return (androidx.constraintlayout.core.state.helpers.g)this.m(null, androidx.constraintlayout.core.state.g.e.G);
    }
    
    public androidx.constraintlayout.core.state.helpers.g o(final Object... array) {
        final androidx.constraintlayout.core.state.helpers.g g = (androidx.constraintlayout.core.state.helpers.g)this.m(null, androidx.constraintlayout.core.state.g.e.G);
        g.F0(array);
        return g;
    }
    
    public f p(final Object o) {
        return this.k(o, 0);
    }
    
    public void q(final Object o, final Object o2) {
        final a e = this.e(o);
        if (e instanceof a) {
            e.q0(o2);
        }
    }
    
    androidx.constraintlayout.core.state.d r(final Object key) {
        return this.a.get(key);
    }
    
    public void s() {
        this.b.clear();
        this.c.clear();
    }
    
    public boolean t(final int n) {
        return this.d.C().k(n);
    }
    
    public boolean u(final int n) {
        return this.d.S().k(n);
    }
    
    public g v(final androidx.constraintlayout.core.state.b b) {
        this.d.m0(b);
        return this;
    }
    
    public void w(final String e, final String key) {
        final a e2 = this.e(e);
        if (e2 instanceof a) {
            e2.o0(key);
            ArrayList<String> list;
            if (!this.c.containsKey(key)) {
                final ArrayList<String> value = new ArrayList<String>();
                this.c.put(key, value);
                list = value;
            }
            else {
                list = this.c.get(key);
            }
            list.add(e);
        }
    }
    
    public g x(final androidx.constraintlayout.core.state.b b) {
        this.d.r0(b);
        return this;
    }
    
    public h y() {
        return (h)this.m(null, androidx.constraintlayout.core.state.g.e.H);
    }
    
    public h z(final Object... array) {
        final h h = (h)this.m(null, androidx.constraintlayout.core.state.g.e.H);
        h.F0(array);
        return h;
    }
    
    public enum b
    {
        G, 
        H, 
        I;
    }
    
    public enum c
    {
        G, 
        H, 
        I, 
        J, 
        K, 
        L, 
        M, 
        N, 
        O, 
        P, 
        Q, 
        R, 
        S, 
        T, 
        U, 
        V;
    }
    
    public enum d
    {
        G, 
        H, 
        I, 
        J, 
        K, 
        L;
    }
    
    public enum e
    {
        G, 
        H, 
        I, 
        J, 
        K, 
        L, 
        M;
    }
}
