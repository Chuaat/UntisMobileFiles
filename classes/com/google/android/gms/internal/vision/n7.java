// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Collection;
import java.util.List;

final class n7 extends i7
{
    private n7() {
        super(null);
    }
    
    private static <E> z6<E> f(final Object o, final long n) {
        return (z6<E>)r9.F(o, n);
    }
    
    @Override
    final <L> List<L> b(final Object o, final long n) {
        z6<L> z7;
        final z6<L> z6 = z7 = f(o, n);
        if (!z6.zza()) {
            final int size = z6.size();
            int n2;
            if (size == 0) {
                n2 = 10;
            }
            else {
                n2 = size << 1;
            }
            z7 = z6.d(n2);
            r9.j(o, n, z7);
        }
        return z7;
    }
    
    @Override
    final <E> void c(final Object o, final Object o2, final long n) {
        final z6<Object> f = f(o, n);
        final z6<Object> f2 = f(o2, n);
        final int size = f.size();
        final int size2 = f2.size();
        z6<Object> d = f;
        if (size > 0) {
            d = f;
            if (size2 > 0) {
                d = f;
                if (!f.zza()) {
                    d = f.d(size2 + size);
                }
                d.addAll(f2);
            }
        }
        z6<Object> z6 = f2;
        if (size > 0) {
            z6 = d;
        }
        r9.j(o, n, z6);
    }
    
    @Override
    final void e(final Object o, final long n) {
        f(o, n).zzb();
    }
}
