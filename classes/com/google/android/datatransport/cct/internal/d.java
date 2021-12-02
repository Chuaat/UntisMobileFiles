// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.cct.internal;

import androidx.annotation.j0;
import h3.a$a;
import java.util.Objects;
import java.util.List;

final class d extends j
{
    private final List<m> a;
    
    d(final List<m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.a = list;
    }
    
    @a$a(name = "logRequest")
    @j0
    @Override
    public List<m> c() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof j && this.a.equals(((j)o).c()));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BatchedLogRequest{logRequests=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
