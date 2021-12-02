// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Set;

public abstract class q2<E> extends i2<E> implements Set<E>
{
    @NullableDecl
    private transient l2<E> H;
    
    q2() {
    }
    
    static int n(int a) {
        final int max = Math.max(a, 2);
        boolean b = true;
        if (max < 751619276) {
            for (a = Integer.highestOneBit(max - 1) << 1; a * 0.7 < max; a <<= 1) {}
            return a;
        }
        if (max >= 1073741824) {
            b = false;
        }
        k1.f(b, "collection too large");
        return 1073741824;
    }
    
    @Override
    public boolean equals(@NullableDecl final Object o) {
        return o == this || ((!(o instanceof q2) || !this.o() || !((q2)o).o() || this.hashCode() == o.hashCode()) && f3.b(this, o));
    }
    
    @Override
    public int hashCode() {
        return f3.a(this);
    }
    
    @Override
    public l2<E> l() {
        l2<E> h;
        if ((h = this.H) == null) {
            h = this.p();
            this.H = h;
        }
        return h;
    }
    
    boolean o() {
        return false;
    }
    
    l2<E> p() {
        return l2.p(this.toArray());
    }
}
