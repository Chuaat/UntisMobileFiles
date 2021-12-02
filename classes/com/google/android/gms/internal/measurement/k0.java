// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class k0 extends x
{
    protected k0() {
        super.a.add(n0.H);
        super.a.add(n0.c0);
        super.a.add(n0.z0);
        super.a.add(n0.A0);
        super.a.add(n0.B0);
        super.a.add(n0.H0);
        super.a.add(n0.I0);
        super.a.add(n0.K0);
        super.a.add(n0.L0);
        super.a.add(n0.O0);
    }
    
    @Override
    public final q a(String original, final g5 g5, final List<q> list) {
        final n0 h = n0.H;
        final int ordinal = h6.e(original).ordinal();
        if (ordinal == 0) {
            h6.h(h.name(), 2, list);
            final q b = g5.b(list.get(0));
            final q b2 = g5.b(list.get(1));
            q q;
            if (!(b instanceof m) && !(b instanceof u) && !(b2 instanceof m) && !(b2 instanceof u)) {
                q = new i(b.g() + b2.g());
            }
            else {
                original = String.valueOf(b.k());
                final String value = String.valueOf(b2.k());
                if (value.length() != 0) {
                    original = original.concat(value);
                }
                else {
                    original = new String(original);
                }
                q = new u(original);
            }
            return q;
        }
        if (ordinal == 21) {
            h6.h(n0.c0.name(), 2, list);
            return new i(g5.b(list.get(0)).g() / g5.b(list.get(1)).g());
        }
        if (ordinal == 59) {
            h6.h(n0.O0.name(), 2, list);
            return new i(g5.b(list.get(0)).g() + new i(-g5.b(list.get(1)).g()).g());
        }
        if (ordinal == 52 || ordinal == 53) {
            h6.h(original, 2, list);
            final q b3 = g5.b(list.get(0));
            g5.b(list.get(1));
            return b3;
        }
        if (ordinal == 55 || ordinal == 56) {
            h6.h(original, 1, list);
            return g5.b(list.get(0));
        }
        switch (ordinal) {
            default: {
                return super.b(original);
            }
            case 46: {
                h6.h(n0.B0.name(), 1, list);
                return new i(-g5.b(list.get(0)).g());
            }
            case 45: {
                h6.h(n0.A0.name(), 2, list);
                return new i(g5.b(list.get(0)).g() * g5.b(list.get(1)).g());
            }
            case 44: {
                h6.h(n0.z0.name(), 2, list);
                return new i(g5.b(list.get(0)).g() % g5.b(list.get(1)).g());
            }
        }
    }
}
