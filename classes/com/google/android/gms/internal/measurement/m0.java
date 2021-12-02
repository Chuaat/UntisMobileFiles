// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class m0 extends x
{
    protected m0() {
        super.a.add(n0.K);
        super.a.add(n0.V);
        super.a.add(n0.Y);
        super.a.add(n0.Z);
        super.a.add(n0.f0);
        super.a.add(n0.o0);
        super.a.add(n0.q0);
        super.a.add(n0.r0);
        super.a.add(n0.E0);
        super.a.add(n0.N0);
        super.a.add(n0.R0);
        super.a.add(n0.S0);
        super.a.add(n0.T0);
    }
    
    @Override
    public final q a(String s, final g5 g5, final List<q> list) {
        final n0 h = n0.H;
        final int ordinal = h6.e(s).ordinal();
        final int n = 0;
        final int n2 = 0;
        int n3 = 0;
        if (ordinal != 3) {
            if (ordinal != 14) {
                if (ordinal == 24) {
                    h6.i(n0.f0.name(), 1, list);
                    q q = com.google.android.gms.internal.measurement.q.f;
                    for (int i = n2; i < list.size(); ++i) {
                        q = g5.b(list.get(i));
                        if (q instanceof h) {
                            throw new IllegalStateException("ControlValue cannot be in an expression list");
                        }
                    }
                    return q;
                }
                if (ordinal != 33) {
                    if (ordinal == 49) {
                        h6.h(n0.E0.name(), 0, list);
                        return q.g;
                    }
                    if (ordinal != 58) {
                        if (ordinal == 17) {
                            f f;
                            if (list.isEmpty()) {
                                f = new f();
                            }
                            else {
                                final f f2 = new f();
                                final Iterator<q> iterator = list.iterator();
                                int n4 = n;
                                while (true) {
                                    f = f2;
                                    if (!iterator.hasNext()) {
                                        break;
                                    }
                                    final q b = g5.b(iterator.next());
                                    if (b instanceof h) {
                                        throw new IllegalStateException("Failed to evaluate array element");
                                    }
                                    f2.z(n4, b);
                                    ++n4;
                                }
                            }
                            return f;
                        }
                        if (ordinal == 18) {
                            n n5;
                            if (list.isEmpty()) {
                                n5 = new n();
                            }
                            else {
                                if (list.size() % 2 != 0) {
                                    throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", list.size()));
                                }
                                final n n6 = new n();
                                while (true) {
                                    n5 = n6;
                                    if (n3 >= list.size() - 1) {
                                        break;
                                    }
                                    final q b2 = g5.b(list.get(n3));
                                    final q b3 = g5.b(list.get(n3 + 1));
                                    if (b2 instanceof h || b3 instanceof h) {
                                        throw new IllegalStateException("Failed to evaluate map entry");
                                    }
                                    n6.f(b2.k(), b3);
                                    n3 += 2;
                                }
                            }
                            return n5;
                        }
                        if (ordinal == 35 || ordinal == 36) {
                            h6.h(n0.r0.name(), 2, list);
                            final q b4 = g5.b(list.get(0));
                            final q b5 = g5.b(list.get(1));
                            q q2;
                            if (b4 instanceof f && h6.k(b5)) {
                                q2 = ((f)b4).o(b5.g().intValue());
                            }
                            else if (b4 instanceof m) {
                                q2 = ((f)b4).h(b5.k());
                            }
                            else {
                                if (b4 instanceof u) {
                                    if ("length".equals(b5.k())) {
                                        q2 = new i((double)b4.k().length());
                                        return q2;
                                    }
                                    if (h6.k(b5) && b5.g() < b4.k().length()) {
                                        q2 = new u(String.valueOf(b4.k().charAt(b5.g().intValue())));
                                        return q2;
                                    }
                                }
                                q2 = q.f;
                            }
                            return q2;
                        }
                        switch (ordinal) {
                            default: {
                                return super.b(s);
                            }
                            case 64: {
                                h6.i(n0.T0.name(), 1, list);
                                final Iterator<q> iterator2 = list.iterator();
                                while (iterator2.hasNext()) {
                                    final q b6 = g5.b(iterator2.next());
                                    if (!(b6 instanceof u)) {
                                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b6.getClass().getCanonicalName()));
                                    }
                                    g5.e(b6.k(), q.f);
                                }
                                return q.f;
                            }
                            case 63: {
                                h6.h(n0.S0.name(), 0, list);
                                return q.f;
                            }
                            case 62: {
                                h6.h(n0.R0.name(), 1, list);
                                final q b7 = g5.b(list.get(0));
                                if (b7 instanceof v) {
                                    s = "undefined";
                                }
                                else if (b7 instanceof g) {
                                    s = "boolean";
                                }
                                else if (b7 instanceof i) {
                                    s = "number";
                                }
                                else if (b7 instanceof u) {
                                    s = "string";
                                }
                                else if (b7 instanceof p) {
                                    s = "function";
                                }
                                else {
                                    if (b7 instanceof r || b7 instanceof h) {
                                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b7));
                                    }
                                    s = "object";
                                }
                                return new u(s);
                            }
                        }
                    }
                    else {
                        h6.h(n0.N0.name(), 3, list);
                        final q b8 = g5.b(list.get(0));
                        final q b9 = g5.b(list.get(1));
                        final q b10 = g5.b(list.get(2));
                        if (b8 != q.f && b8 != q.g) {
                            if (b8 instanceof f && b9 instanceof i) {
                                ((f)b8).z(b9.g().intValue(), b10);
                            }
                            else if (b8 instanceof m) {
                                ((f)b8).f(b9.k(), b10);
                            }
                            return b10;
                        }
                        throw new IllegalStateException(String.format("Can't set property %s of %s", b9.k(), b8.k()));
                    }
                }
                else {
                    h6.h(n0.o0.name(), 1, list);
                    final q b11 = g5.b(list.get(0));
                    if (b11 instanceof u) {
                        return g5.d(b11.k());
                    }
                    throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b11.getClass().getCanonicalName()));
                }
            }
            else {
                h6.i(n0.V.name(), 2, list);
                if (list.size() % 2 == 0) {
                    for (int j = 0; j < list.size() - 1; j += 2) {
                        final q b12 = g5.b(list.get(j));
                        if (!(b12 instanceof u)) {
                            throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b12.getClass().getCanonicalName()));
                        }
                        g5.f(b12.k(), g5.b(list.get(j + 1)));
                    }
                    return q.f;
                }
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", list.size()));
            }
        }
        else {
            h6.h(n0.K.name(), 2, list);
            final q b13 = g5.b(list.get(0));
            if (!(b13 instanceof u)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b13.getClass().getCanonicalName()));
            }
            if (g5.h(b13.k())) {
                final q b14 = g5.b(list.get(1));
                g5.g(b13.k(), b14);
                return b14;
            }
            throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b13.k()));
        }
    }
}
