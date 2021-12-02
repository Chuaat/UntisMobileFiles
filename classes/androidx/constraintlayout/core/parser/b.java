// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.parser;

import java.util.Iterator;
import java.io.PrintStream;
import java.util.ArrayList;

public class b extends c
{
    ArrayList<c> N;
    
    public b(final char[] array) {
        super(array);
        this.N = new ArrayList<c>();
    }
    
    public static c D(final char[] array) {
        return new b(array);
    }
    
    public void C(final c c) {
        this.N.add(c);
        if (g.d) {
            final PrintStream out = System.out;
            final StringBuilder sb = new StringBuilder();
            sb.append("added element ");
            sb.append(c);
            sb.append(" to ");
            sb.append(this);
            out.println(sb.toString());
        }
    }
    
    public c E(final int n) throws h {
        if (n >= 0 && n < this.N.size()) {
            return this.N.get(n);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("no element at index ");
        sb.append(n);
        throw new h(sb.toString(), this);
    }
    
    public c F(final String s) throws h {
        for (final d d : this.N) {
            if (d.f().equals(s)) {
                return d.l0();
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("no element for key <");
        sb.append(s);
        sb.append(">");
        throw new h(sb.toString(), this);
    }
    
    public a G(final int i) throws h {
        final c e = this.E(i);
        if (e instanceof a) {
            return (a)e;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("no array at index ");
        sb.append(i);
        throw new h(sb.toString(), this);
    }
    
    public a H(final String str) throws h {
        final c f = this.F(str);
        if (f instanceof a) {
            return (a)f;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("no array found for key <");
        sb.append(str);
        sb.append(">, found [");
        sb.append(f.p());
        sb.append("] : ");
        sb.append(f);
        throw new h(sb.toString(), this);
    }
    
    public a I(final String s) {
        final c x = this.X(s);
        if (x instanceof a) {
            return (a)x;
        }
        return null;
    }
    
    public boolean J(final int i) throws h {
        final c e = this.E(i);
        if (e instanceof j) {
            return ((j)e).D();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("no boolean at index ");
        sb.append(i);
        throw new h(sb.toString(), this);
    }
    
    public boolean K(final String str) throws h {
        final c f = this.F(str);
        if (f instanceof j) {
            return ((j)f).D();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("no boolean found for key <");
        sb.append(str);
        sb.append(">, found [");
        sb.append(f.p());
        sb.append("] : ");
        sb.append(f);
        throw new h(sb.toString(), this);
    }
    
    public float L(final int i) throws h {
        final c e = this.E(i);
        if (e != null) {
            return e.l();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("no float at index ");
        sb.append(i);
        throw new h(sb.toString(), this);
    }
    
    public float M(final String str) throws h {
        final c f = this.F(str);
        if (f != null) {
            return f.l();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("no float found for key <");
        sb.append(str);
        sb.append(">, found [");
        sb.append(f.p());
        sb.append("] : ");
        sb.append(f);
        throw new h(sb.toString(), this);
    }
    
    public float N(final String s) {
        final c x = this.X(s);
        if (x instanceof e) {
            return x.l();
        }
        return Float.NaN;
    }
    
    public int O(final int i) throws h {
        final c e = this.E(i);
        if (e != null) {
            return e.m();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("no int at index ");
        sb.append(i);
        throw new h(sb.toString(), this);
    }
    
    public int P(final String str) throws h {
        final c f = this.F(str);
        if (f != null) {
            return f.m();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("no int found for key <");
        sb.append(str);
        sb.append(">, found [");
        sb.append(f.p());
        sb.append("] : ");
        sb.append(f);
        throw new h(sb.toString(), this);
    }
    
    public f R(final int i) throws h {
        final c e = this.E(i);
        if (e instanceof f) {
            return (f)e;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("no object at index ");
        sb.append(i);
        throw new h(sb.toString(), this);
    }
    
    public f S(final String str) throws h {
        final c f = this.F(str);
        if (f instanceof f) {
            return (f)f;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("no object found for key <");
        sb.append(str);
        sb.append(">, found [");
        sb.append(f.p());
        sb.append("] : ");
        sb.append(f);
        throw new h(sb.toString(), this);
    }
    
    public f U(final String s) {
        final c x = this.X(s);
        if (x instanceof f) {
            return (f)x;
        }
        return null;
    }
    
    public c W(final int index) {
        if (index >= 0 && index < this.N.size()) {
            return this.N.get(index);
        }
        return null;
    }
    
    public c X(final String anObject) {
        for (final d d : this.N) {
            if (d.f().equals(anObject)) {
                return d.l0();
            }
        }
        return null;
    }
    
    public String Y(final int i) throws h {
        final c e = this.E(i);
        if (e instanceof i) {
            return e.f();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("no string at index ");
        sb.append(i);
        throw new h(sb.toString(), this);
    }
    
    public String Z(final String str) throws h {
        final c f = this.F(str);
        if (f instanceof i) {
            return f.f();
        }
        String p = null;
        if (f != null) {
            p = f.p();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("no string found for key <");
        sb.append(str);
        sb.append(">, found [");
        sb.append(p);
        sb.append("] : ");
        sb.append(f);
        throw new h(sb.toString(), this);
    }
    
    public String b0(final int n) {
        final c w = this.W(n);
        if (w instanceof i) {
            return w.f();
        }
        return null;
    }
    
    public String c0(final String s) {
        final c x = this.X(s);
        if (x instanceof i) {
            return x.f();
        }
        return null;
    }
    
    public boolean d0(final String anObject) {
        for (final c c : this.N) {
            if (c instanceof d && ((d)c).f().equals(anObject)) {
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<String> e0() {
        final ArrayList<String> list = new ArrayList<String>();
        for (final c c : this.N) {
            if (c instanceof d) {
                list.add(((d)c).f());
            }
        }
        return list;
    }
    
    public void f0(final String anObject, final c c) {
        for (final d d : this.N) {
            if (d.f().equals(anObject)) {
                d.m0(c);
                return;
            }
        }
        this.N.add(d.j0(anObject, c));
    }
    
    public void g0(final String s, final float n) {
        this.f0(s, new e(n));
    }
    
    public void h0(final String anObject) {
        final ArrayList<d> list = new ArrayList<d>();
        for (final c e : this.N) {
            if (((d)e).f().equals(anObject)) {
                list.add((d)e);
            }
        }
        final Iterator<d> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            this.N.remove(iterator2.next());
        }
    }
    
    public int size() {
        return this.N.size();
    }
    
    @Override
    public String toString() {
        final StringBuilder obj = new StringBuilder();
        for (final c obj2 : this.N) {
            if (obj.length() > 0) {
                obj.append("; ");
            }
            obj.append(obj2);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" = <");
        sb.append((Object)obj);
        sb.append(" >");
        return sb.toString();
    }
}
