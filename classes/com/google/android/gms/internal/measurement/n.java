// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class n implements q, m
{
    final Map<String, q> G;
    
    public n() {
        this.G = new HashMap<String, q>();
    }
    
    public final List<String> a() {
        return new ArrayList<String>(this.G.keySet());
    }
    
    @Override
    public final boolean b(final String s) {
        return this.G.containsKey(s);
    }
    
    @Override
    public final q c() {
        final n n = new n();
        for (final Map.Entry<String, q> entry : this.G.entrySet()) {
            Map<String, q> map;
            String s;
            q c;
            if (entry.getValue() instanceof m) {
                map = n.G;
                s = entry.getKey();
                c = entry.getValue();
            }
            else {
                map = n.G;
                s = entry.getKey();
                c = entry.getValue().c();
            }
            map.put(s, c);
        }
        return n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof n && this.G.equals(((n)o).G));
    }
    
    @Override
    public final void f(final String s, final q q) {
        if (q == null) {
            this.G.remove(s);
            return;
        }
        this.G.put(s, q);
    }
    
    @Override
    public final Double g() {
        return Double.NaN;
    }
    
    @Override
    public final q h(final String s) {
        if (this.G.containsKey(s)) {
            return this.G.get(s);
        }
        return q.f;
    }
    
    @Override
    public final int hashCode() {
        return this.G.hashCode();
    }
    
    @Override
    public q i(final String anObject, final g5 g5, final List<q> list) {
        if ("toString".equals(anObject)) {
            return new u(this.toString());
        }
        return com.google.android.gms.internal.measurement.k.a(this, new u(anObject), g5, list);
    }
    
    @Override
    public final String k() {
        return "[object Object]";
    }
    
    @Override
    public final Boolean m() {
        return Boolean.TRUE;
    }
    
    @Override
    public final Iterator<q> p() {
        return com.google.android.gms.internal.measurement.k.b(this.G);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("{");
        if (!this.G.isEmpty()) {
            for (final String s : this.G.keySet()) {
                sb.append(String.format("%s: %s,", s, this.G.get(s)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
