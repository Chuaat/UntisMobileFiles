// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import androidx.annotation.k0;
import androidx.room.l1;
import androidx.room.i0;
import androidx.annotation.j0;
import androidx.room.s0;
import androidx.annotation.t0;

@t0({ t0.a.H })
@s0
public class d
{
    @j0
    @i0(name = "key")
    @l1
    public String a;
    @k0
    @i0(name = "long_value")
    public Long b;
    
    public d(@j0 final String a, final long l) {
        this.a = a;
        this.b = l;
    }
    
    public d(@j0 final String s, final boolean b) {
        long n;
        if (b) {
            n = 1L;
        }
        else {
            n = 0L;
        }
        this(s, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean equals = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        if (!this.a.equals(d.a)) {
            return false;
        }
        final Long b = this.b;
        final Long b2 = d.b;
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
        final Long b = this.b;
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
