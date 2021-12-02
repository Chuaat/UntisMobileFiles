// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class e0 extends x
{
    protected e0() {
        super.a.add(n0.I);
        super.a.add(n0.C0);
        super.a.add(n0.F0);
    }
    
    @Override
    public final q a(final String s, final g5 g5, final List<q> list) {
        final n0 h = n0.H;
        final int ordinal = h6.e(s).ordinal();
        if (ordinal != 1) {
            if (ordinal == 47) {
                h6.h(n0.C0.name(), 1, list);
                return new g(g5.b(list.get(0)).m() ^ true);
            }
            if (ordinal != 50) {
                return super.b(s);
            }
            h6.h(n0.F0.name(), 2, list);
            final q b = g5.b(list.get(0));
            if (b.m()) {
                return b;
            }
        }
        else {
            h6.h(n0.I.name(), 2, list);
            final q b2 = g5.b(list.get(0));
            if (!b2.m()) {
                return b2;
            }
        }
        return g5.b(list.get(1));
    }
}
