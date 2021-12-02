// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class a0 extends x
{
    protected a0() {
        super.a.add(n0.J);
        super.a.add(n0.S);
        super.a.add(n0.T);
        super.a.add(n0.U);
        super.a.add(n0.a0);
        super.a.add(n0.W);
        super.a.add(n0.b0);
        super.a.add(n0.g0);
        super.a.add(n0.w0);
        super.a.add(n0.J0);
        super.a.add(n0.M0);
        super.a.add(n0.P0);
        super.a.add(n0.Q0);
    }
    
    private static q c(final g5 g5, final List<q> list) {
        h6.i(n0.g0.name(), 2, list);
        final q b = g5.b(list.get(0));
        final q b2 = g5.b(list.get(1));
        if (b2 instanceof f) {
            final List<q> t = ((f)b2).t();
            List<q> subList = new ArrayList<q>();
            if (list.size() > 2) {
                subList = list.subList(2, list.size());
            }
            return new p(b.k(), t, subList, g5);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", ((f)b2).getClass().getCanonicalName()));
    }
    
    @Override
    public final q a(String s, final g5 g5, final List<q> list) {
        final n0 h = n0.H;
        final int ordinal = h6.e(s).ordinal();
        if (ordinal != 2) {
            if (ordinal == 15) {
                h6.h(n0.T.name(), 0, list);
                return q.h;
            }
            if (ordinal == 25) {
                return c(g5, list);
            }
            if (ordinal != 41) {
                if (ordinal == 54) {
                    return new f(list);
                }
                if (ordinal != 57) {
                    if (ordinal != 19) {
                        if (ordinal == 20) {
                            h6.i(n0.b0.name(), 2, list);
                            final q c = c(g5, list);
                            final j j = (j)c;
                            if (j.d() == null) {
                                s = "";
                            }
                            else {
                                s = j.d();
                            }
                            g5.g(s, c);
                            return c;
                        }
                        if (ordinal != 60) {
                            if (ordinal == 61) {
                                h6.h(n0.Q0.name(), 3, list);
                                q q;
                                if (g5.b(list.get(0)).m()) {
                                    q = list.get(1);
                                }
                                else {
                                    q = list.get(2);
                                }
                                return g5.b(q);
                            }
                            switch (ordinal) {
                                default: {
                                    return super.b(s);
                                }
                                case 12: {
                                    h6.h(n0.T.name(), 0, list);
                                    return q.i;
                                }
                                case 11: {
                                    return g5.a().c(new f(list));
                                }
                                case 13: {
                                    break;
                                }
                            }
                        }
                        else {
                            h6.h(n0.P0.name(), 3, list);
                            final q b = g5.b(list.get(0));
                            final q b2 = g5.b(list.get(1));
                            final q b3 = g5.b(list.get(2));
                            if (!(b2 instanceof f)) {
                                throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                            }
                            if (b3 instanceof f) {
                                final f f = (f)b2;
                                final f f2 = (f)b3;
                                int i = 0;
                                int n = 0;
                                while (i < f.n()) {
                                    if (n == 0 && !b.equals(g5.b(f.o(i)))) {
                                        n = 0;
                                    }
                                    else {
                                        final q b4 = g5.b(f2.o(i));
                                        if (b4 instanceof h) {
                                            final q q2 = b4;
                                            if (((h)b4).b().equals("break")) {
                                                return q.f;
                                            }
                                            return q2;
                                        }
                                        else {
                                            n = 1;
                                        }
                                    }
                                    ++i;
                                }
                                if (f.n() + 1 == f2.n()) {
                                    final q b5 = g5.b(f2.o(f.n()));
                                    if (b5 instanceof h) {
                                        final String b6 = ((h)b5).b();
                                        q q2 = b5;
                                        if (b6.equals("return")) {
                                            return q2;
                                        }
                                        q2 = b5;
                                        if (b6.equals("continue")) {
                                            return q2;
                                        }
                                    }
                                }
                                return q.f;
                            }
                            throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                        }
                    }
                    if (!list.isEmpty()) {
                        final q b7 = g5.b(list.get(0));
                        if (b7 instanceof f) {
                            return g5.c((f)b7);
                        }
                    }
                    return q.f;
                }
                q k;
                if (list.isEmpty()) {
                    k = q.j;
                }
                else {
                    h6.h(n0.M0.name(), 1, list);
                    k = new h("return", g5.b(list.get(0)));
                }
                return k;
            }
            else {
                h6.i(n0.w0.name(), 2, list);
                final q b8 = g5.b(list.get(0));
                final q b9 = g5.b(list.get(1));
                q b10;
                if (list.size() > 2) {
                    b10 = g5.b(list.get(2));
                }
                else {
                    b10 = null;
                }
                final q f3 = q.f;
                q q4;
                if (b8.m()) {
                    q4 = g5.c((f)b9);
                }
                else if (b10 != null) {
                    q4 = g5.c((f)b10);
                }
                else {
                    q4 = f3;
                }
                if (q4 instanceof h) {
                    return q4;
                }
                return f3;
            }
        }
        else {
            h6.h(n0.J.name(), 3, list);
            final q b11 = g5.b(list.get(0));
            s = g5.b(list.get(1)).k();
            final q b12 = g5.b(list.get(2));
            if (!(b12 instanceof f)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", ((f)b12).getClass().getCanonicalName()));
            }
            if (!s.isEmpty()) {
                return b11.i(s, g5, ((f)b12).t());
            }
            throw new IllegalArgumentException("Function name for apply is undefined");
        }
    }
}
