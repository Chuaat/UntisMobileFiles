// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.persistence;

import java.util.Objects;
import com.google.android.datatransport.runtime.o;

final class b extends i
{
    private final long a;
    private final o b;
    private final com.google.android.datatransport.runtime.i c;
    
    b(final long a, final o o, final com.google.android.datatransport.runtime.i i) {
        this.a = a;
        Objects.requireNonNull(o, "Null transportContext");
        this.b = o;
        Objects.requireNonNull(i, "Null event");
        this.c = i;
    }
    
    @Override
    public com.google.android.datatransport.runtime.i b() {
        return this.c;
    }
    
    @Override
    public long c() {
        return this.a;
    }
    
    @Override
    public o d() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof i) {
            final i i = (i)o;
            if (this.a != i.c() || !this.b.equals(i.d()) || !this.c.equals(i.b())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long a = this.a;
        return this.c.hashCode() ^ (((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PersistedEvent{id=");
        sb.append(this.a);
        sb.append(", transportContext=");
        sb.append(this.b);
        sb.append(", event=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
