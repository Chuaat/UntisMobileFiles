// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class w extends x
{
    public w() {
        super.a.add(n0.L);
        super.a.add(n0.M);
        super.a.add(n0.N);
        super.a.add(n0.O);
        super.a.add(n0.P);
        super.a.add(n0.Q);
        super.a.add(n0.R);
    }
    
    @Override
    public final q a(final String s, final g5 g5, final List<q> list) {
        final n0 h = n0.H;
        switch (h6.e(s).ordinal()) {
            default: {
                return super.b(s);
            }
            case 10: {
                h6.h(n0.R.name(), 2, list);
                return new i((double)(h6.b(g5.b(list.get(0)).g()) ^ h6.b(g5.b(list.get(1)).g())));
            }
            case 9: {
                h6.h(n0.Q.name(), 2, list);
                return new i(Double.valueOf(h6.d(g5.b(list.get(0)).g()) >>> (int)(h6.d(g5.b(list.get(1)).g()) & 0x1FL)));
            }
            case 8: {
                h6.h(n0.P.name(), 2, list);
                return new i((double)(h6.b(g5.b(list.get(0)).g()) >> (int)(h6.d(g5.b(list.get(1)).g()) & 0x1FL)));
            }
            case 7: {
                h6.h(n0.O.name(), 2, list);
                return new i((double)(h6.b(g5.b(list.get(0)).g()) | h6.b(g5.b(list.get(1)).g())));
            }
            case 6: {
                h6.h(n0.N.name(), 1, list);
                return new i((double)~h6.b(g5.b(list.get(0)).g()));
            }
            case 5: {
                h6.h(n0.M.name(), 2, list);
                return new i((double)(h6.b(g5.b(list.get(0)).g()) << (int)(h6.d(g5.b(list.get(1)).g()) & 0x1FL)));
            }
            case 4: {
                h6.h(n0.L.name(), 2, list);
                return new i((double)(h6.b(g5.b(list.get(0)).g()) & h6.b(g5.b(list.get(1)).g())));
            }
        }
    }
}
