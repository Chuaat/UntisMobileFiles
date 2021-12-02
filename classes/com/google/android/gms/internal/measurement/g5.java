// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public final class g5
{
    public final g5 a;
    final y b;
    final Map<String, q> c;
    final Map<String, Boolean> d;
    
    public g5(final g5 a, final y b) {
        this.c = new HashMap<String, q>();
        this.d = new HashMap<String, Boolean>();
        this.a = a;
        this.b = b;
    }
    
    public final g5 a() {
        return new g5(this, this.b);
    }
    
    public final q b(final q q) {
        return this.b.a(this, q);
    }
    
    public final q c(final f f) {
        q q = com.google.android.gms.internal.measurement.q.f;
        final Iterator<Integer> r = f.r();
        while (r.hasNext()) {
            final q q2 = q = this.b.a(this, f.o(r.next()));
            if (q2 instanceof h) {
                q = q2;
                break;
            }
        }
        return q;
    }
    
    public final q d(final String s) {
        if (this.c.containsKey(s)) {
            return this.c.get(s);
        }
        final g5 a = this.a;
        if (a != null) {
            return a.d(s);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", s));
    }
    
    public final void e(final String s, final q q) {
        if (this.d.containsKey(s)) {
            return;
        }
        if (q == null) {
            this.c.remove(s);
            return;
        }
        this.c.put(s, q);
    }
    
    public final void f(final String s, final q q) {
        this.e(s, q);
        this.d.put(s, Boolean.TRUE);
    }
    
    public final void g(final String s, final q q) {
        if (!this.c.containsKey(s)) {
            final g5 a = this.a;
            if (a != null) {
                if (a.h(s)) {
                    this.a.g(s, q);
                    return;
                }
            }
        }
        if (this.d.containsKey(s)) {
            return;
        }
        if (q == null) {
            this.c.remove(s);
            return;
        }
        this.c.put(s, q);
    }
    
    public final boolean h(final String s) {
        if (this.c.containsKey(s)) {
            return true;
        }
        final g5 a = this.a;
        return a != null && a.h(s);
    }
}
