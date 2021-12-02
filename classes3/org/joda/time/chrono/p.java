// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.chrono;

import org.joda.time.q;
import org.joda.time.i;

class p
{
    private final i a;
    private final q b;
    private final int c;
    
    p(final i a, final q b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof p)) {
            return false;
        }
        final p p = (p)o;
        final q b = this.b;
        if (b == null) {
            if (p.b != null) {
                return false;
            }
        }
        else if (!b.equals(p.b)) {
            return false;
        }
        if (this.c != p.c) {
            return false;
        }
        final i a = this.a;
        final i a2 = p.a;
        if (a == null) {
            if (a2 != null) {
                return false;
            }
        }
        else if (!a.equals(a2)) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final q b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final int c = this.c;
        final i a = this.a;
        if (a != null) {
            hashCode = a.hashCode();
        }
        return ((hashCode2 + 31) * 31 + c) * 31 + hashCode;
    }
}
