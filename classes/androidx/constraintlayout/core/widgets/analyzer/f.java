// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets.analyzer;

import java.lang.constant.Constable;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class f implements d
{
    public d a;
    public boolean b;
    public boolean c;
    p d;
    a e;
    int f;
    public int g;
    int h;
    g i;
    public boolean j;
    List<d> k;
    List<f> l;
    
    public f(final p d) {
        this.a = null;
        this.b = false;
        this.c = false;
        this.e = androidx.constraintlayout.core.widgets.analyzer.f.a.G;
        this.h = 1;
        this.i = null;
        this.j = false;
        this.k = new ArrayList<d>();
        this.l = new ArrayList<f>();
        this.d = d;
    }
    
    @Override
    public void a(d d) {
        final Iterator<f> iterator = this.l.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().j) {
                return;
            }
        }
        this.c = true;
        d = this.a;
        if (d != null) {
            d.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        f f = null;
        int n = 0;
        for (final f f2 : this.l) {
            if (f2 instanceof g) {
                continue;
            }
            ++n;
            f = f2;
        }
        if (f != null && n == 1 && f.j) {
            final g i = this.i;
            if (i != null) {
                if (!i.j) {
                    return;
                }
                this.f = this.h * i.g;
            }
            this.e(f.g + this.f);
        }
        d = this.a;
        if (d != null) {
            d.a(this);
        }
    }
    
    public void b(final d d) {
        this.k.add(d);
        if (this.j) {
            d.a(d);
        }
    }
    
    public void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }
    
    public String d() {
        final String y = this.d.b.y();
        final a e = this.e;
        StringBuilder sb;
        String str;
        if (e != androidx.constraintlayout.core.widgets.analyzer.f.a.J && e != androidx.constraintlayout.core.widgets.analyzer.f.a.K) {
            sb = new StringBuilder();
            sb.append(y);
            str = "_VERTICAL";
        }
        else {
            sb = new StringBuilder();
            sb.append(y);
            str = "_HORIZONTAL";
        }
        sb.append(str);
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(":");
        sb2.append(this.e.name());
        return sb2.toString();
    }
    
    public void e(final int g) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = g;
        for (final d d : this.k) {
            d.a(d);
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.y());
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        Constable value;
        if (this.j) {
            value = this.g;
        }
        else {
            value = "unresolved";
        }
        sb.append(value);
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
    
    enum a
    {
        G, 
        H, 
        I, 
        J, 
        K, 
        L, 
        M, 
        N;
    }
}
