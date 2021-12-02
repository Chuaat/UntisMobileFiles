// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Objects;
import com.google.android.datatransport.e;
import java.util.Map;
import com.google.android.datatransport.runtime.time.a;

final class c extends g
{
    private final a e;
    private final Map<e, b> f;
    
    c(final a a, final Map<e, b> map) {
        Objects.requireNonNull(a, "Null clock");
        this.e = a;
        Objects.requireNonNull(map, "Null values");
        this.f = map;
    }
    
    @Override
    a e() {
        return this.e;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof g) {
            final g g = (g)o;
            if (!this.e.equals(g.e()) || !this.f.equals(g.i())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (this.e.hashCode() ^ 0xF4243) * 1000003 ^ this.f.hashCode();
    }
    
    @Override
    Map<e, b> i() {
        return this.f;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SchedulerConfig{clock=");
        sb.append(this.e);
        sb.append(", values=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
