// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.rx;

import c6.h;
import io.realm.y;
import io.realm.OrderedRealmCollection;

public class a<E extends OrderedRealmCollection>
{
    private final E a;
    private final y b;
    
    public a(final E a, @h final y b) {
        this.a = a;
        this.b = b;
    }
    
    @h
    public y a() {
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
        final a a = (a)o;
        if (!this.a.equals(a.a)) {
            return false;
        }
        final y b = this.b;
        final y b2 = a.b;
        if (b != null) {
            equals = b.equals(b2);
        }
        else if (b2 != null) {
            equals = false;
        }
        return equals;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final y b = this.b;
        int hashCode2;
        if (b != null) {
            hashCode2 = b.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return hashCode * 31 + hashCode2;
    }
}
