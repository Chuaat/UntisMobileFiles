// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Collection;

final class da extends fa
{
    private da() {
        super(null);
    }
    
    @Override
    final void a(final Object o, final long n) {
        ((r9)fc.k(o, n)).zzb();
    }
    
    @Override
    final <E> void b(final Object o, final Object o2, final long n) {
        final r9 r9 = (r9)fc.k(o, n);
        final r9 r10 = (r9)fc.k(o2, n);
        final int size = r9.size();
        final int size2 = r10.size();
        r9 s0 = r9;
        if (size > 0) {
            s0 = r9;
            if (size2 > 0) {
                s0 = r9;
                if (!r9.a()) {
                    s0 = r9.s0(size2 + size);
                }
                s0.addAll(r10);
            }
        }
        if (size <= 0) {
            s0 = r10;
        }
        fc.x(o, n, s0);
    }
}
