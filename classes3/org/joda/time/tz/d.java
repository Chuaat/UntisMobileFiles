// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.tz;

import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.joda.time.i;

public final class d extends i
{
    private static final long R = -3513011772763289092L;
    private final String O;
    private final int P;
    private final int Q;
    
    public d(final String s, final String o, final int p4, final int q) {
        super(s);
        this.O = o;
        this.P = p4;
        this.Q = q;
    }
    
    @Override
    public int D(final long n) {
        return this.Q;
    }
    
    @Override
    public boolean E() {
        return true;
    }
    
    @Override
    public long H(final long n) {
        return n;
    }
    
    @Override
    public long J(final long n) {
        return n;
    }
    
    @Override
    public TimeZone O() {
        final String q = this.q();
        if (q.length() == 6 && (q.startsWith("+") || q.startsWith("-"))) {
            final StringBuilder sb = new StringBuilder();
            sb.append("GMT");
            sb.append(this.q());
            return TimeZone.getTimeZone(sb.toString());
        }
        return new SimpleTimeZone(this.P, this.q());
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o instanceof d) {
            final d d = (d)o;
            if (!this.q().equals(d.q()) || this.Q != d.Q || this.P != d.P) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.q().hashCode() + this.Q * 37 + this.P * 31;
    }
    
    @Override
    public String u(final long n) {
        return this.O;
    }
    
    @Override
    public int w(final long n) {
        return this.P;
    }
    
    @Override
    public int y(final long n) {
        return this.P;
    }
}
