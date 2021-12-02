// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.base;

import org.joda.convert.ToString;
import org.joda.time.g;
import java.util.GregorianCalendar;
import java.util.Calendar;
import org.joda.time.l0;
import java.util.Locale;
import org.joda.time.j0;

public abstract class a extends c implements j0
{
    protected a() {
    }
    
    @Override
    public String A2(final String s, final Locale locale) throws IllegalArgumentException {
        if (s == null) {
            return this.toString();
        }
        return org.joda.time.format.a.f(s).P(locale).v(this);
    }
    
    @Override
    public int C3() {
        return this.t().i().g(this.n());
    }
    
    @Override
    public int E1() {
        return this.t().H().g(this.n());
    }
    
    @Override
    public int E5() {
        return this.t().B().g(this.n());
    }
    
    @Override
    public int M5() {
        return this.t().U().g(this.n());
    }
    
    public Calendar O(final Locale locale) {
        Locale default1 = locale;
        if (locale == null) {
            default1 = Locale.getDefault();
        }
        final Calendar instance = Calendar.getInstance(this.K2().O(), default1);
        instance.setTime(this.s());
        return instance;
    }
    
    public GregorianCalendar P() {
        final GregorianCalendar gregorianCalendar = new GregorianCalendar(this.K2().O());
        gregorianCalendar.setTime(this.s());
        return gregorianCalendar;
    }
    
    @Override
    public int R4() {
        return this.t().O().g(this.n());
    }
    
    @Override
    public int X3() {
        return this.t().g().g(this.n());
    }
    
    @Override
    public int Z2() {
        return this.t().M().g(this.n());
    }
    
    @Override
    public int f3() {
        return this.t().F().g(this.n());
    }
    
    @Override
    public String g4(final String s) {
        if (s == null) {
            return this.toString();
        }
        return org.joda.time.format.a.f(s).v(this);
    }
    
    @Override
    public int g5() {
        return this.t().V().g(this.n());
    }
    
    @Override
    public int h4() {
        return this.t().k().g(this.n());
    }
    
    @Override
    public int j0(final g g) {
        if (g != null) {
            return g.G(this.t()).g(this.n());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }
    
    @Override
    public int k1() {
        return this.t().z().g(this.n());
    }
    
    @Override
    public int k2() {
        return this.t().T().g(this.n());
    }
    
    @Override
    public int k5() {
        return this.t().D().g(this.n());
    }
    
    @Override
    public int l5() {
        return this.t().I().g(this.n());
    }
    
    @Override
    public int p1() {
        return this.t().C().g(this.n());
    }
    
    @Override
    public int p2() {
        return this.t().h().g(this.n());
    }
    
    @Override
    public int s4() {
        return this.t().v().g(this.n());
    }
    
    @ToString
    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public int w0() {
        return this.t().d().g(this.n());
    }
}
