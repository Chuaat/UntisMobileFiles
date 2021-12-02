// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import java.util.Objects;
import com.google.firebase.crashlytics.internal.model.a0;

final class b extends p
{
    private final a0 a;
    private final String b;
    
    b(final a0 a0, final String s) {
        Objects.requireNonNull(a0, "Null report");
        this.a = a0;
        Objects.requireNonNull(s, "Null sessionId");
        this.b = s;
    }
    
    @Override
    public a0 b() {
        return this.a;
    }
    
    @Override
    public String c() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof p) {
            final p p = (p)o;
            if (!this.a.equals(p.b()) || !this.b.equals(p.c())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CrashlyticsReportWithSessionId{report=");
        sb.append(this.a);
        sb.append(", sessionId=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
