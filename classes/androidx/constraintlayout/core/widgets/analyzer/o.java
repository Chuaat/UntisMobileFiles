// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets.analyzer;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.b;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.e;
import java.util.ArrayList;

public class o
{
    private static final boolean g = false;
    static int h;
    ArrayList<e> a;
    int b;
    boolean c;
    int d;
    ArrayList<a> e;
    private int f;
    
    public o(final int d) {
        this.a = new ArrayList<e>();
        this.b = -1;
        this.c = false;
        this.d = 0;
        this.e = null;
        this.f = -1;
        final int h = o.h;
        o.h = h + 1;
        this.b = h;
        this.d = d;
    }
    
    private boolean e(final e o) {
        return this.a.contains(o);
    }
    
    private String h() {
        final int d = this.d;
        if (d == 0) {
            return "Horizontal";
        }
        if (d == 1) {
            return "Vertical";
        }
        if (d == 2) {
            return "Both";
        }
        return "Unknown";
    }
    
    private int k(int n, final e e) {
        final e.b z = e.z(n);
        if (z != androidx.constraintlayout.core.widgets.e.b.H && z != androidx.constraintlayout.core.widgets.e.b.J && z != androidx.constraintlayout.core.widgets.e.b.G) {
            return -1;
        }
        if (n == 0) {
            n = e.j0();
        }
        else {
            n = e.D();
        }
        return n;
    }
    
    private int q(final androidx.constraintlayout.core.e e, final ArrayList<e> list, int n) {
        final int n2 = 0;
        final f f = (f)list.get(0).U();
        e.Y();
        f.g(e, false);
        for (int i = 0; i < list.size(); ++i) {
            list.get(i).g(e, false);
        }
        if (n == 0 && f.L1 > 0) {
            androidx.constraintlayout.core.widgets.b.b(f, e, list, 0);
        }
        if (n == 1 && f.M1 > 0) {
            androidx.constraintlayout.core.widgets.b.b(f, e, list, 1);
        }
        try {
            e.T();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        this.e = new ArrayList<a>();
        for (int j = n2; j < list.size(); ++j) {
            this.e.add(new a(list.get(j), e, n));
        }
        d d;
        if (n == 0) {
            n = e.O(f.Q);
            d = f.S;
        }
        else {
            n = e.O(f.R);
            d = f.T;
        }
        final int o = e.O(d);
        e.Y();
        return o - n;
    }
    
    public boolean a(final e e) {
        if (this.a.contains(e)) {
            return false;
        }
        this.a.add(e);
        return true;
    }
    
    public void b() {
        if (this.e == null) {
            return;
        }
        if (!this.c) {
            return;
        }
        for (int i = 0; i < this.e.size(); ++i) {
            this.e.get(i).a();
        }
    }
    
    public void c(final ArrayList<o> list) {
        final int size = this.a.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < list.size(); ++i) {
                final o o = list.get(i);
                if (this.f == o.b) {
                    this.m(this.d, o);
                }
            }
        }
        if (size == 0) {
            list.remove(this);
        }
    }
    
    public void d() {
        this.a.clear();
    }
    
    public int f() {
        return this.b;
    }
    
    public int g() {
        return this.d;
    }
    
    public boolean i(final o o) {
        for (int i = 0; i < this.a.size(); ++i) {
            if (o.e(this.a.get(i))) {
                return true;
            }
        }
        return false;
    }
    
    public boolean j() {
        return this.c;
    }
    
    public int l(final androidx.constraintlayout.core.e e, final int n) {
        if (this.a.size() == 0) {
            return 0;
        }
        return this.q(e, this.a, n);
    }
    
    public void m(final int n, final o o) {
        for (final e e : this.a) {
            o.a(e);
            final int f = o.f();
            if (n == 0) {
                e.R0 = f;
            }
            else {
                e.S0 = f;
            }
        }
        this.f = o.b;
    }
    
    public void n(final boolean c) {
        this.c = c;
    }
    
    public void o(final int d) {
        this.d = d;
    }
    
    public int p() {
        return this.a.size();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.h());
        sb.append(" [");
        sb.append(this.b);
        sb.append("] <");
        String s = sb.toString();
        for (final e e : this.a) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s);
            sb2.append(" ");
            sb2.append(e.y());
            s = sb2.toString();
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(s);
        sb3.append(" >");
        return sb3.toString();
    }
    
    class a
    {
        WeakReference<e> a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        
        public a(final e referent, final androidx.constraintlayout.core.e e, final int g) {
            this.a = new WeakReference<e>(referent);
            this.b = e.O(referent.Q);
            this.c = e.O(referent.R);
            this.d = e.O(referent.S);
            this.e = e.O(referent.T);
            this.f = e.O(referent.U);
            this.g = g;
        }
        
        public void a() {
            final e e = this.a.get();
            if (e != null) {
                e.j1(this.b, this.c, this.d, this.e, this.f, this.g);
            }
        }
    }
}
