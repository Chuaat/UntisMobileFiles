// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class z extends x
{
    public z() {
        super.a.add(n0.e0);
        super.a.add(n0.s0);
        super.a.add(n0.t0);
        super.a.add(n0.u0);
        super.a.add(n0.v0);
        super.a.add(n0.x0);
        super.a.add(n0.y0);
        super.a.add(n0.D0);
    }
    
    private static boolean c(final q q, final q q2) {
        if (q.getClass().equals(q2.getClass())) {
            if (q instanceof v || q instanceof o) {
                return true;
            }
            if (q instanceof i) {
                return !Double.isNaN(q.g()) && !Double.isNaN(q2.g()) && q.g().equals(q2.g());
            }
            if (q instanceof u) {
                return q.k().equals(q2.k());
            }
            if (q instanceof g) {
                return q.m().equals(q2.m());
            }
            return q == q2;
        }
        else {
            if ((q instanceof v || q instanceof o) && (q2 instanceof v || q2 instanceof o)) {
                return true;
            }
            final boolean b = q instanceof i;
            if (b && q2 instanceof u) {
                return c(q, new i(q2.g()));
            }
            final boolean b2 = q instanceof u;
            if (b2 && q2 instanceof i) {
                return c(new i(q.g()), q2);
            }
            if (q instanceof g) {
                return c(new i(q.g()), q2);
            }
            if (q2 instanceof g) {
                return c(q, new i(q2.g()));
            }
            if ((!b2 && !b) || !(q2 instanceof m)) {
                return q instanceof m && (q2 instanceof u || q2 instanceof i) && c(new u(q.k()), q2);
            }
            final u u = new u(q2.k());
            try {
                return c(q, u);
            }
            finally {}
        }
    }
    
    private static boolean d(q o, final q q) {
        Object o2 = o;
        if (o instanceof m) {
            o2 = new u(((q)o).k());
        }
        o = q;
        if (q instanceof m) {
            o = new u(q.k());
        }
        if (o2 instanceof u && o instanceof u) {
            return ((q)o2).k().compareTo(((q)o).k()) < 0;
        }
        final double doubleValue = ((q)o2).g();
        final double doubleValue2 = ((q)o).g();
        if (!Double.isNaN(doubleValue)) {
            if (!Double.isNaN(doubleValue2)) {
                if (Double.compare(doubleValue, doubleValue2) < 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean e(q o, final q q) {
        Object o2 = o;
        if (o instanceof m) {
            o2 = new u(((q)o).k());
        }
        o = q;
        if (q instanceof m) {
            o = new u(q.k());
        }
        return ((o2 instanceof u && o instanceof u) || (!Double.isNaN(((q)o2).g()) && !Double.isNaN(((q)o).g()))) && !d((q)o, (q)o2);
    }
    
    @Override
    public final q a(final String s, final g5 g5, final List<q> list) {
        h6.h(h6.e(s).name(), 2, list);
        final q b = g5.b(list.get(0));
        final q b2 = g5.b(list.get(1));
        final int ordinal = h6.e(s).ordinal();
        boolean b3 = false;
        Label_0209: {
            if (ordinal != 23) {
                boolean b4 = false;
                if (ordinal != 48) {
                    if (ordinal == 42) {
                        b3 = d(b, b2);
                        break Label_0209;
                    }
                    if (ordinal == 43) {
                        b3 = e(b, b2);
                        break Label_0209;
                    }
                    switch (ordinal) {
                        default: {
                            return super.b(s);
                        }
                        case 40: {
                            b4 = h6.l(b, b2);
                            break;
                        }
                        case 39: {
                            b3 = h6.l(b, b2);
                            break Label_0209;
                        }
                        case 38: {
                            b3 = e(b2, b);
                            break Label_0209;
                        }
                        case 37: {
                            b3 = d(b2, b);
                            break Label_0209;
                        }
                    }
                }
                else {
                    b4 = c(b, b2);
                }
                b3 = (b4 ^ true);
            }
            else {
                b3 = c(b, b2);
            }
        }
        q q;
        if (b3) {
            q = com.google.android.gms.internal.measurement.q.k;
        }
        else {
            q = com.google.android.gms.internal.measurement.q.l;
        }
        return q;
    }
}
