// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.rx;

import c6.h;
import io.realm.w;
import io.realm.n0;

public class b<E extends n0>
{
    private final E a;
    private final w b;
    
    public b(final E a, @h final w b) {
        this.a = a;
        this.b = b;
    }
    
    @h
    public w a() {
        return this.b;
    }
    
    public E b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean equals = true;
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final b b = (b)o;
        if (!this.a.equals(b.a)) {
            return false;
        }
        final w b2 = this.b;
        final w b3 = b.b;
        if (b2 != null) {
            equals = b2.equals(b3);
        }
        else if (b3 != null) {
            equals = false;
        }
        return equals;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final w b = this.b;
        int hashCode2;
        if (b != null) {
            hashCode2 = b.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ObjectChange{object=");
        sb.append(this.a);
        sb.append(", changeset=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
