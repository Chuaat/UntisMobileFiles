// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Iterator;

public final class j0 extends x
{
    protected j0() {
        super.a.add(n0.h0);
        super.a.add(n0.i0);
        super.a.add(n0.j0);
        super.a.add(n0.k0);
        super.a.add(n0.l0);
        super.a.add(n0.m0);
        super.a.add(n0.n0);
        super.a.add(n0.U0);
    }
    
    private static q c(final h0 h0, final Iterator<q> iterator, final q q) {
        if (iterator != null) {
            while (iterator.hasNext()) {
                final q c = h0.a(iterator.next()).c((f)q);
                if (c instanceof h) {
                    final h h2 = (h)c;
                    if ("break".equals(h2.b())) {
                        return q.f;
                    }
                    if ("return".equals(h2.b())) {
                        return h2;
                    }
                    continue;
                }
            }
        }
        return q.f;
    }
    
    private static q d(final h0 h0, final q q, final q q2) {
        return c(h0, q.p(), q2);
    }
    
    private static q e(final h0 h0, final q q, final q q2) {
        if (q instanceof Iterable) {
            return c(h0, ((Iterable)q).iterator(), q2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }
    
    @Override
    public final q a(String s, final g5 g5, final List<q> list) {
        final n0 h = n0.H;
        final int ordinal = h6.e(s).ordinal();
        if (ordinal == 65) {
            h6.h(n0.U0.name(), 4, list);
            final q q = list.get(0);
            final q q2 = list.get(1);
            final q q3 = list.get(2);
            final q b = g5.b(list.get(3));
            if (g5.b(q3).m()) {
                final q c = g5.c((f)b);
                if (c instanceof h) {
                    final q f = c;
                    if ("break".equals(((h)f).b())) {
                        return com.google.android.gms.internal.measurement.q.f;
                    }
                    if ("return".equals(((h)f).b())) {
                        return f;
                    }
                }
            }
            while (g5.b(q).m()) {
                final q c2 = g5.c((f)b);
                if (c2 instanceof h) {
                    final q f = c2;
                    if ("break".equals(((h)f).b())) {
                        break;
                    }
                    if ("return".equals(((h)f).b())) {
                        return f;
                    }
                }
                g5.b(q2);
            }
            return com.google.android.gms.internal.measurement.q.f;
        }
        switch (ordinal) {
            default: {
                return super.b(s);
            }
            case 32: {
                h6.h(n0.n0.name(), 3, list);
                if (list.get(0) instanceof u) {
                    return e(new g0(g5, list.get(0).k()), g5.b(list.get(1)), g5.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
            }
            case 31: {
                h6.h(n0.m0.name(), 3, list);
                if (list.get(0) instanceof u) {
                    s = list.get(0).k();
                    return e(new f0(g5, s), g5.b(list.get(1)), g5.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
            }
            case 30: {
                h6.h(n0.l0.name(), 3, list);
                if (list.get(0) instanceof u) {
                    return e(new i0(g5, list.get(0).k()), g5.b(list.get(1)), g5.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
            }
            case 29: {
                h6.h(n0.k0.name(), 4, list);
                final q b2 = g5.b(list.get(0));
                if (b2 instanceof f) {
                    final f f2 = (f)b2;
                    final q q4 = list.get(1);
                    final q q5 = list.get(2);
                    final q b3 = g5.b(list.get(3));
                    final g5 a = g5.a();
                    int n = 0;
                    g5 g6;
                    while (true) {
                        g6 = a;
                        if (n >= f2.n()) {
                            break;
                        }
                        s = f2.o(n).k();
                        a.g(s, g5.d(s));
                        ++n;
                    }
                    while (g5.b(q4).m()) {
                        final q c3 = g5.c((f)b3);
                        if (c3 instanceof h) {
                            final h h2 = (h)c3;
                            if ("break".equals(h2.b())) {
                                break;
                            }
                            if ("return".equals(h2.b())) {
                                return h2;
                            }
                        }
                        final g5 a2 = g5.a();
                        for (int i = 0; i < f2.n(); ++i) {
                            final String k = f2.o(i).k();
                            a2.g(k, g6.d(k));
                        }
                        a2.b(q5);
                        g6 = a2;
                    }
                    return q.f;
                }
                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
            }
            case 28: {
                h6.h(n0.j0.name(), 3, list);
                if (list.get(0) instanceof u) {
                    return d(new g0(g5, list.get(0).k()), g5.b(list.get(1)), g5.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
            }
            case 27: {
                h6.h(n0.i0.name(), 3, list);
                if (list.get(0) instanceof u) {
                    s = list.get(0).k();
                    return d(new f0(g5, s), g5.b(list.get(1)), g5.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
            }
            case 26: {
                h6.h(n0.h0.name(), 3, list);
                if (list.get(0) instanceof u) {
                    return d(new i0(g5, list.get(0).k()), g5.b(list.get(1)), g5.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
            }
        }
    }
}
