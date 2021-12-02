// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.convert;

import org.joda.time.chrono.q;
import org.joda.time.chrono.a0;
import org.joda.time.chrono.w;
import org.joda.time.chrono.x;
import java.util.GregorianCalendar;
import org.joda.time.chrono.m;
import org.joda.time.i;
import java.util.Calendar;

final class b extends a implements h, l
{
    static final b a;
    
    static {
        a = new b();
    }
    
    protected b() {
    }
    
    @Override
    public org.joda.time.a a(final Object o, org.joda.time.a a) {
        if (a != null) {
            return a;
        }
        a = (org.joda.time.a)o;
        i i;
        try {
            i = org.joda.time.i.k(((Calendar)a).getTimeZone());
        }
        catch (IllegalArgumentException ex) {
            i = org.joda.time.i.n();
        }
        return this.b(a, i);
    }
    
    @Override
    public org.joda.time.a b(final Object o, final i i) {
        if (o.getClass().getName().endsWith(".BuddhistCalendar")) {
            return m.d0(i);
        }
        if (!(o instanceof GregorianCalendar)) {
            return x.d0(i);
        }
        final long time = ((GregorianCalendar)o).getGregorianChange().getTime();
        if (time == Long.MIN_VALUE) {
            return w.W0(i);
        }
        if (time == Long.MAX_VALUE) {
            return a0.X0(i);
        }
        return q.j0(i, time, 4);
    }
    
    @Override
    public long d(final Object o, final org.joda.time.a a) {
        return ((Calendar)o).getTime().getTime();
    }
    
    @Override
    public Class<?> g() {
        return Calendar.class;
    }
}
