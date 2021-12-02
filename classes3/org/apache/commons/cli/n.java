// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

import java.util.Collections;
import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

public class n implements Serializable
{
    private static final long K = 1L;
    private Map G;
    private Map H;
    private List I;
    private Map J;
    
    public n() {
        this.G = new HashMap();
        this.H = new HashMap();
        this.I = new ArrayList();
        this.J = new HashMap();
    }
    
    public n a(final String s, final String s2, final boolean b, final String s3) {
        this.c(new j(s, s2, b, s3));
        return this;
    }
    
    public n b(final String s, final boolean b, final String s2) {
        this.a(s, null, b, s2);
        return this;
    }
    
    public n c(final j j) {
        final String l = j.l();
        if (j.B()) {
            this.H.put(j.m(), j);
        }
        if (j.F()) {
            if (this.I.contains(l)) {
                final List i = this.I;
                i.remove(i.indexOf(l));
            }
            this.I.add(l);
        }
        this.G.put(l, j);
        return this;
    }
    
    public n d(final l l) {
        final Iterator<j> iterator = l.c().iterator();
        if (l.e()) {
            this.I.add(l);
        }
        while (iterator.hasNext()) {
            final j j = iterator.next();
            j.P(false);
            this.c(j);
            this.J.put(j.l(), l);
        }
        return this;
    }
    
    public j e(final String s) {
        final String b = u.b(s);
        Map map;
        if (this.G.containsKey(b)) {
            map = this.G;
        }
        else {
            map = this.H;
        }
        return map.get(b);
    }
    
    public l f(final j j) {
        return this.J.get(j.l());
    }
    
    Collection g() {
        return new HashSet(this.J.values());
    }
    
    public Collection h() {
        return Collections.unmodifiableCollection((Collection<?>)this.k());
    }
    
    public List i() {
        return this.I;
    }
    
    public boolean j(String b) {
        b = u.b(b);
        return this.G.containsKey(b) || this.H.containsKey(b);
    }
    
    List k() {
        return new ArrayList(this.G.values());
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("[ Options: [ short ");
        sb.append(this.G.toString());
        sb.append(" ] [ long ");
        sb.append(this.H);
        sb.append(" ]");
        return sb.toString();
    }
}
