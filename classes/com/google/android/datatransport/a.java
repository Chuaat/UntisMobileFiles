// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport;

import java.util.Objects;
import androidx.annotation.k0;

final class a<T> extends d<T>
{
    private final Integer a;
    private final T b;
    private final e c;
    
    a(@k0 final Integer a, final T t, final e e) {
        this.a = a;
        Objects.requireNonNull(t, "Null payload");
        this.b = t;
        Objects.requireNonNull(e, "Null priority");
        this.c = e;
    }
    
    @k0
    @Override
    public Integer a() {
        return this.a;
    }
    
    @Override
    public T b() {
        return this.b;
    }
    
    @Override
    public e c() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof d) {
            final d d = (d)o;
            final Integer a = this.a;
            if (a == null) {
                if (d.a() != null) {
                    return false;
                }
            }
            else if (!a.equals(d.a())) {
                return false;
            }
            if (this.b.equals(d.b()) && this.c.equals(d.c())) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Integer a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Event{code=");
        sb.append(this.a);
        sb.append(", payload=");
        sb.append(this.b);
        sb.append(", priority=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
