// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.heartbeatinfo;

import java.util.Objects;

final class b extends n
{
    private final String G;
    private final long H;
    
    b(final String s, final long h) {
        Objects.requireNonNull(s, "Null sdkName");
        this.G = s;
        this.H = h;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof n) {
            final n n = (n)o;
            if (!this.G.equals(n.f()) || this.H != n.n()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public String f() {
        return this.G;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.G.hashCode();
        final long h = this.H;
        return (hashCode ^ 0xF4243) * 1000003 ^ (int)(h ^ h >>> 32);
    }
    
    @Override
    public long n() {
        return this.H;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SdkHeartBeatResult{sdkName=");
        sb.append(this.G);
        sb.append(", millis=");
        sb.append(this.H);
        sb.append("}");
        return sb.toString();
    }
}
