// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Collections;
import java.util.TreeMap;

public final class og
{
    final TreeMap<Integer, p> a;
    final TreeMap<Integer, p> b;
    
    public og() {
        this.a = new TreeMap<Integer, p>();
        this.b = new TreeMap<Integer, p>();
    }
    
    private static final int c(final g5 g5, final p p3, final q o) {
        final q a = p3.a(g5, Collections.singletonList(o));
        if (a instanceof i) {
            return h6.b(a.g());
        }
        return -1;
    }
    
    public final void a(String s, final int i, final p value, final String obj) {
        TreeMap<Integer, p> treeMap;
        if ("create".equals(obj)) {
            treeMap = this.b;
        }
        else {
            if (!"edit".equals(obj)) {
                s = String.valueOf(obj);
                if (s.length() != 0) {
                    s = "Unknown callback type: ".concat(s);
                }
                else {
                    s = new String("Unknown callback type: ");
                }
                throw new IllegalStateException(s);
            }
            treeMap = this.a;
        }
        int j = i;
        if (treeMap.containsKey(i)) {
            j = treeMap.lastKey() + 1;
        }
        treeMap.put(j, value);
    }
    
    public final void b(final g5 g5, final c c) {
        final la la = new la(c);
        for (final Integer key : this.a.keySet()) {
            final b b = c.b().b();
            final int c2 = c(g5, this.a.get(key), la);
            if (c2 == 2 || c2 == -1) {
                c.f(b);
            }
        }
        final Iterator<Integer> iterator2 = this.b.keySet().iterator();
        while (iterator2.hasNext()) {
            c(g5, this.b.get(iterator2.next()), la);
        }
    }
}
