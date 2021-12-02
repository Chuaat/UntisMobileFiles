// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import java.util.SimpleTimeZone;
import java.util.TimeZone;

final class r0 extends i
{
    static final i O;
    private static final long P = -3513011772763289092L;
    
    static {
        O = new r0();
    }
    
    public r0() {
        super("UTC");
    }
    
    @Override
    public int D(final long n) {
        return 0;
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
        return new SimpleTimeZone(0, this.q());
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof r0;
    }
    
    @Override
    public int hashCode() {
        return this.q().hashCode();
    }
    
    @Override
    public String u(final long n) {
        return "UTC";
    }
    
    @Override
    public int w(final long n) {
        return 0;
    }
    
    @Override
    public int y(final long n) {
        return 0;
    }
}
