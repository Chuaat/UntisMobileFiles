// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.schedulers;

import io.reactivex.internal.functions.b;
import io.reactivex.annotations.f;
import java.util.concurrent.TimeUnit;

public final class d<T>
{
    final T a;
    final long b;
    final TimeUnit c;
    
    public d(@f final T a, final long b, @f final TimeUnit timeUnit) {
        this.a = a;
        this.b = b;
        this.c = io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
    }
    
    public long a() {
        return this.b;
    }
    
    public long b(@f final TimeUnit timeUnit) {
        return timeUnit.convert(this.b, this.c);
    }
    
    @f
    public TimeUnit c() {
        return this.c;
    }
    
    @f
    public T d() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof d;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final d d = (d)o;
            b3 = b2;
            if (io.reactivex.internal.functions.b.c(this.a, d.a)) {
                b3 = b2;
                if (this.b == d.b) {
                    b3 = b2;
                    if (io.reactivex.internal.functions.b.c(this.c, d.c)) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public int hashCode() {
        final T a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        final long b = this.b;
        return (hashCode * 31 + (int)(b ^ b >>> 31)) * 31 + this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Timed[time=");
        sb.append(this.b);
        sb.append(", unit=");
        sb.append(this.c);
        sb.append(", value=");
        sb.append(this.a);
        sb.append("]");
        return sb.toString();
    }
}
