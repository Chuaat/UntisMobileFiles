// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

import java.util.Collection;
import java.util.Properties;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.io.Serializable;

public class c implements Serializable
{
    private static final long I = 1L;
    private List G;
    private List H;
    
    c() {
        this.G = new LinkedList();
        this.H = new ArrayList();
    }
    
    private j s(final String s) {
        final String b = u.b(s);
        for (final j j : this.H) {
            if (b.equals(j.n())) {
                return j;
            }
            if (b.equals(j.m())) {
                return j;
            }
        }
        return null;
    }
    
    void a(final String s) {
        this.G.add(s);
    }
    
    void b(final j j) {
        this.H.add(j);
    }
    
    public List c() {
        return this.G;
    }
    
    public String[] d() {
        final String[] array = new String[this.G.size()];
        this.G.toArray(array);
        return array;
    }
    
    public Object e(final char c) {
        return this.f(String.valueOf(c));
    }
    
    public Object f(final String str) {
        try {
            return this.o(str);
        }
        catch (o o) {
            final PrintStream err = System.err;
            final StringBuffer sb = new StringBuffer();
            sb.append("Exception found converting ");
            sb.append(str);
            sb.append(" to desired type: ");
            sb.append(o.getMessage());
            err.println(sb.toString());
            return null;
        }
    }
    
    public Properties g(final String s) {
        final Properties properties = new Properties();
        for (final j j : this.H) {
            if (s.equals(j.n()) || s.equals(j.m())) {
                final List w = j.w();
                if (w.size() >= 2) {
                    properties.put(w.get(0), w.get(1));
                }
                else {
                    if (w.size() != 1) {
                        continue;
                    }
                    properties.put(w.get(0), "true");
                }
            }
        }
        return properties;
    }
    
    public String h(final char c) {
        return this.j(String.valueOf(c));
    }
    
    public String i(final char c, final String s) {
        return this.k(String.valueOf(c), s);
    }
    
    public String j(String s) {
        final String[] m = this.m(s);
        if (m == null) {
            s = null;
        }
        else {
            s = m[0];
        }
        return s;
    }
    
    public String k(String j, String s) {
        j = this.j(j);
        if (j != null) {
            s = j;
        }
        return s;
    }
    
    public String[] l(final char c) {
        return this.m(String.valueOf(c));
    }
    
    public String[] m(final String s) {
        final ArrayList list = new ArrayList();
        for (final j j : this.H) {
            if (s.equals(j.n()) || s.equals(j.m())) {
                list.addAll(j.w());
            }
        }
        String[] array;
        if (list.isEmpty()) {
            array = null;
        }
        else {
            array = (String[])list.toArray(new String[list.size()]);
        }
        return array;
    }
    
    public j[] n() {
        final List h = this.H;
        return (j[])h.toArray(new j[h.size()]);
    }
    
    public Object o(final String s) throws o {
        final String j = this.j(s);
        final j s2 = this.s(s);
        Object i = null;
        if (s2 == null) {
            return null;
        }
        final Object q = s2.q();
        if (j != null) {
            i = s.i(j, q);
        }
        return i;
    }
    
    public boolean p(final char c) {
        return this.q(String.valueOf(c));
    }
    
    public boolean q(final String s) {
        return this.H.contains(this.s(s));
    }
    
    public Iterator r() {
        return this.H.iterator();
    }
}
