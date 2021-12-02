// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.types;

import java.util.Date;
import java.io.Serializable;

public final class a implements Comparable<a>, Serializable
{
    private static final long I = -3268482672267936464L;
    private final int G;
    private final Date H;
    
    public a() {
        this.G = 0;
        this.H = null;
    }
    
    public a(final int n, final int g) {
        this.H = new Date(n * 1000L);
        this.G = g;
    }
    
    public int b(final a a) {
        int n;
        int n2;
        if (this.f() != a.f()) {
            n = this.f();
            n2 = a.f();
        }
        else {
            n = this.d();
            n2 = a.d();
        }
        return n - n2;
    }
    
    public int d() {
        return this.G;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof a) {
            final a a = (a)o;
            if (this.f() != a.f() || this.d() != a.d()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public int f() {
        final Date h = this.H;
        if (h == null) {
            return 0;
        }
        return (int)(h.getTime() / 1000L);
    }
    
    @Override
    public int hashCode() {
        return (this.G + 31) * 31 + this.f();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TS time:");
        sb.append(this.H);
        sb.append(" inc:");
        sb.append(this.G);
        return sb.toString();
    }
}
