// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class c3<E> extends q2<E>
{
    static final c3<Object> N;
    private final transient Object[] I;
    private final transient Object[] J;
    private final transient int K;
    private final transient int L;
    private final transient int M;
    
    static {
        N = new c3<Object>(new Object[0], 0, null, 0, 0);
    }
    
    c3(final Object[] i, final int l, final Object[] j, final int k, final int m) {
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
    }
    
    @Override
    final int b(final Object[] array, final int n) {
        System.arraycopy(this.I, 0, array, n, this.M);
        return n + this.M;
    }
    
    @Override
    public final boolean contains(@NullableDecl final Object obj) {
        final Object[] j = this.J;
        if (obj == null || j == null) {
            return false;
        }
        int b = j2.b(obj);
        while (true) {
            b &= this.K;
            final Object o = j[b];
            if (o == null) {
                return false;
            }
            if (o.equals(obj)) {
                return true;
            }
            ++b;
        }
    }
    
    @Override
    public final i3<E> f() {
        return (i3<E>)this.l().iterator();
    }
    
    @Override
    final Object[] h() {
        return this.I;
    }
    
    @Override
    public final int hashCode() {
        return this.L;
    }
    
    @Override
    final int i() {
        return 0;
    }
    
    @Override
    final int k() {
        return this.M;
    }
    
    @Override
    final boolean m() {
        return false;
    }
    
    @Override
    final boolean o() {
        return true;
    }
    
    @Override
    final l2<E> p() {
        return l2.q(this.I, this.M);
    }
    
    @Override
    public final int size() {
        return this.M;
    }
}
