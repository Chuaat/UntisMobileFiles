// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.engine.prefill;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class c
{
    private final Map<d, Integer> a;
    private final List<d> b;
    private int c;
    private int d;
    
    public c(final Map<d, Integer> a) {
        this.a = a;
        this.b = new ArrayList<d>(a.keySet());
        final Iterator<Integer> iterator = a.values().iterator();
        while (iterator.hasNext()) {
            this.c += iterator.next();
        }
    }
    
    public int a() {
        return this.c;
    }
    
    public boolean b() {
        return this.c == 0;
    }
    
    public d c() {
        final d d = this.b.get(this.d);
        final Integer n = this.a.get(d);
        if (n == 1) {
            this.a.remove(d);
            this.b.remove(this.d);
        }
        else {
            this.a.put(d, n - 1);
        }
        --this.c;
        int d2;
        if (this.b.isEmpty()) {
            d2 = 0;
        }
        else {
            d2 = (this.d + 1) % this.b.size();
        }
        this.d = d2;
        return d;
    }
}
