// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Map;

final class x0 extends w0<j1.e>
{
    @Override
    final int a(final Map.Entry<?, ?> entry) {
        return ((j1.e)entry.getKey()).H;
    }
    
    @Override
    final a1<j1.e> b(final Object o) {
        return ((j1.d)o).zzjv;
    }
    
    @Override
    final void c(final x4 x4, final Map.Entry<?, ?> entry) throws IOException {
        final j1.e e = (j1.e)entry.getKey();
        switch (y0.a[e.I.ordinal()]) {
            case 18: {
                x4.M(e.H, entry.getValue(), f3.a().b(entry.getValue().getClass()));
                break;
            }
            case 17: {
                x4.O(e.H, entry.getValue(), f3.a().b(entry.getValue().getClass()));
            }
            case 16: {
                x4.m(e.H, (String)entry.getValue());
            }
            case 15: {
                x4.L(e.H, (d0)entry.getValue());
            }
            case 14: {
                x4.g(e.H, (int)entry.getValue());
            }
            case 13: {
                x4.c(e.H, (long)entry.getValue());
            }
            case 12: {
                x4.C(e.H, (int)entry.getValue());
            }
            case 11: {
                x4.E(e.H, (long)entry.getValue());
            }
            case 10: {
                x4.R(e.H, (int)entry.getValue());
            }
            case 9: {
                x4.A(e.H, (int)entry.getValue());
            }
            case 8: {
                x4.G(e.H, (boolean)entry.getValue());
            }
            case 7: {
                x4.u(e.H, (int)entry.getValue());
            }
            case 6: {
                x4.h(e.H, (long)entry.getValue());
            }
            case 5: {
                x4.g(e.H, (int)entry.getValue());
            }
            case 4: {
                x4.p(e.H, (long)entry.getValue());
            }
            case 3: {
                x4.J(e.H, (long)entry.getValue());
            }
            case 2: {
                x4.r(e.H, (float)entry.getValue());
            }
            case 1: {
                x4.q(e.H, (double)entry.getValue());
                break;
            }
        }
    }
    
    @Override
    final void d(final Object o, final a1<j1.e> zzjv) {
        ((j1.d)o).zzjv = zzjv;
    }
    
    @Override
    final a1<j1.e> e(final Object o) {
        a1<j1.e> b;
        final a1<j1.e> a1 = b = this.b(o);
        if (a1.c()) {
            b = (a1<j1.e>)a1.clone();
            this.d(o, b);
        }
        return b;
    }
    
    @Override
    final void f(final Object o) {
        this.b(o).u();
    }
    
    @Override
    final boolean g(final s2 s2) {
        return s2 instanceof j1.d;
    }
}
