// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.billing;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class e
{
    Map<String, h> a;
    Map<String, f> b;
    
    e() {
        this.a = new HashMap<String, h>();
        this.b = new HashMap<String, f>();
    }
    
    void a(final f f) {
        this.b.put(f.i(), f);
    }
    
    void b(final h h) {
        this.a.put(h.e(), h);
    }
    
    public void c(final String s) {
        if (this.b.containsKey(s)) {
            this.b.remove(s);
        }
    }
    
    List<String> d() {
        return new ArrayList<String>(this.b.keySet());
    }
    
    List<String> e(final String anObject) {
        final ArrayList<String> list = new ArrayList<String>();
        for (final f f : this.b.values()) {
            if (f.b().equals(anObject)) {
                list.add(f.i());
            }
        }
        return list;
    }
    
    List<f> f() {
        return new ArrayList<f>(this.b.values());
    }
    
    public f g(final String s) {
        return this.b.get(s);
    }
    
    public h h(final String s) {
        return this.a.get(s);
    }
    
    public boolean i(final String s) {
        return this.a.containsKey(s);
    }
    
    public boolean j(final String s) {
        return this.b.containsKey(s);
    }
}
