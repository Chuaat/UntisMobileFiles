// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

import java.util.Iterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;

public class l implements Serializable
{
    private static final long J = 1L;
    private Map G;
    private String H;
    private boolean I;
    
    public l() {
        this.G = new HashMap();
    }
    
    public l a(final j j) {
        this.G.put(j.l(), j);
        return this;
    }
    
    public Collection b() {
        return this.G.keySet();
    }
    
    public Collection c() {
        return this.G.values();
    }
    
    public String d() {
        return this.H;
    }
    
    public boolean e() {
        return this.I;
    }
    
    public void f(final boolean i) {
        this.I = i;
    }
    
    public void g(final j j) throws a {
        final String h = this.H;
        if (h != null && !h.equals(j.n())) {
            throw new a(this, j);
        }
        this.H = j.n();
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        final Iterator iterator = this.c().iterator();
        String str = "[";
    Label_0021:
        while (true) {
            sb.append(str);
            while (iterator.hasNext()) {
                final j j = iterator.next();
                String str2;
                if (j.n() != null) {
                    sb.append("-");
                    str2 = j.n();
                }
                else {
                    sb.append("--");
                    str2 = j.m();
                }
                sb.append(str2);
                sb.append(" ");
                sb.append(j.i());
                if (iterator.hasNext()) {
                    str = ", ";
                    continue Label_0021;
                }
            }
            break;
        }
        sb.append("]");
        return sb.toString();
    }
}
