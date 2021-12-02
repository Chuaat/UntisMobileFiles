// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;

final class w extends c0
{
    private final a a;
    private final c b;
    private final b c;
    
    w(final a a, final c c, final b b) {
        Objects.requireNonNull(a, "Null appData");
        this.a = a;
        Objects.requireNonNull(c, "Null osData");
        this.b = c;
        Objects.requireNonNull(b, "Null deviceData");
        this.c = b;
    }
    
    @Override
    public a a() {
        return this.a;
    }
    
    @Override
    public b c() {
        return this.c;
    }
    
    @Override
    public c d() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof c0) {
            final c0 c0 = (c0)o;
            if (!this.a.equals(c0.a()) || !this.b.equals(c0.d()) || !this.c.equals(c0.c())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("StaticSessionData{appData=");
        sb.append(this.a);
        sb.append(", osData=");
        sb.append(this.b);
        sb.append(", deviceData=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
