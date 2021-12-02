// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.heartbeatinfo;

import java.util.Objects;

final class a extends m
{
    private final String a;
    private final long b;
    private final k.a c;
    
    a(final String s, final long b, final k.a a) {
        Objects.requireNonNull(s, "Null sdkName");
        this.a = s;
        this.b = b;
        Objects.requireNonNull(a, "Null heartBeat");
        this.c = a;
    }
    
    @Override
    public k.a b() {
        return this.c;
    }
    
    @Override
    public long c() {
        return this.b;
    }
    
    @Override
    public String d() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof m) {
            final m m = (m)o;
            if (!this.a.equals(m.d()) || this.b != m.c() || !this.c.equals(m.b())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return ((hashCode ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("HeartBeatResult{sdkName=");
        sb.append(this.a);
        sb.append(", millis=");
        sb.append(this.b);
        sb.append(", heartBeat=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
