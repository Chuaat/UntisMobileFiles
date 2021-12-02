// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Collection;

final class f2 extends b2
{
    private f2() {
        super(null);
    }
    
    private static <E> q1<E> e(final Object o, final long n) {
        return (q1<E>)j4.M(o, n);
    }
    
    @Override
    final void a(final Object o, final long n) {
        e(o, n).V();
    }
    
    @Override
    final <E> void b(final Object o, final Object o2, final long n) {
        final q1<Object> e = e(o, n);
        final q1<Object> e2 = e(o2, n);
        final int size = e.size();
        final int size2 = e2.size();
        q1<Object> j3 = e;
        if (size > 0) {
            j3 = e;
            if (size2 > 0) {
                j3 = e;
                if (!e.Q()) {
                    j3 = e.J3(size2 + size);
                }
                j3.addAll(e2);
            }
        }
        q1<Object> q1 = e2;
        if (size > 0) {
            q1 = j3;
        }
        j4.i(o, n, q1);
    }
}
