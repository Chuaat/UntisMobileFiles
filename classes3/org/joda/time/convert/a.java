// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.convert;

import org.joda.time.format.b;
import org.joda.time.n0;
import org.joda.time.e0;
import org.joda.time.chrono.x;
import org.joda.time.i;
import org.joda.time.h;

public abstract class a implements c
{
    protected a() {
    }
    
    public org.joda.time.a a(final Object o, final org.joda.time.a a) {
        return h.e(a);
    }
    
    public org.joda.time.a b(final Object o, final i i) {
        return x.d0(i);
    }
    
    public boolean c(final Object o, final org.joda.time.a a) {
        return false;
    }
    
    public long d(final Object o, final org.joda.time.a a) {
        return h.c();
    }
    
    public e0 h(final Object o) {
        return e0.q();
    }
    
    public int[] i(final n0 n0, final Object o, final org.joda.time.a a, final b b) {
        return this.j(n0, o, a);
    }
    
    public int[] j(final n0 n0, final Object o, final org.joda.time.a a) {
        return a.m(n0, this.d(o, a));
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Converter[");
        String name;
        if (this.g() == null) {
            name = "null";
        }
        else {
            name = this.g().getName();
        }
        sb.append(name);
        sb.append("]");
        return sb.toString();
    }
}
