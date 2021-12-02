// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.types;

import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import org.bson.i;
import java.util.ArrayList;

public class b extends ArrayList<Object> implements i
{
    private static final long G = -4415279469780082174L;
    
    @Override
    public Object b(final String s, final Object o) {
        return this.t(this.l(s), o);
    }
    
    @Override
    public boolean f(final String s) {
        final boolean b = false;
        final int m = this.m(s, false);
        if (m < 0) {
            return false;
        }
        boolean b2 = b;
        if (m >= 0) {
            b2 = b;
            if (m < this.size()) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public Map i() {
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        for (final String next : this.keySet()) {
            hashMap.put(next, this.j(String.valueOf(next)));
        }
        return hashMap;
    }
    
    @Override
    public Object j(final String s) {
        final int l = this.l(s);
        if (l < 0) {
            return null;
        }
        if (l >= this.size()) {
            return null;
        }
        return this.get(l);
    }
    
    @Override
    public Set<String> keySet() {
        return new org.bson.types.i(this.size());
    }
    
    int l(final String s) {
        return this.m(s, true);
    }
    
    int m(final String s, final boolean b) {
        try {
            return Integer.parseInt(s);
        }
        catch (Exception ex) {
            if (!b) {
                return -1;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("BasicBSONList can only work with numeric keys, not: [");
            sb.append(s);
            sb.append("]");
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    @Override
    public void n(final i i) {
        for (final String s : i.keySet()) {
            this.b(s, i.j(s));
        }
    }
    
    @Override
    public void putAll(final Map map) {
        for (final Map.Entry<Object, V> entry : map.entrySet()) {
            this.b(entry.getKey().toString(), entry.getValue());
        }
    }
    
    @Deprecated
    @Override
    public boolean q(final String s) {
        return this.f(s);
    }
    
    @Override
    public Object r(final String s) {
        final int l = this.l(s);
        if (l < 0) {
            return null;
        }
        if (l >= this.size()) {
            return null;
        }
        return this.remove(l);
    }
    
    public Object t(final int i, final Object element) {
        while (i >= this.size()) {
            this.add(null);
        }
        this.set(i, element);
        return element;
    }
}
