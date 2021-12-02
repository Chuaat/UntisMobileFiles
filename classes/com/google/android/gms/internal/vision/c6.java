// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.List;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.util.Map;

final class c6 extends d6<p6.f>
{
    @Override
    final int a(final Map.Entry<?, ?> entry) {
        return ((p6.f)entry.getKey()).H;
    }
    
    @Override
    final h6<p6.f> b(final Object o) {
        return ((p6.c)o).zzc;
    }
    
    @Override
    final Object c(final b6 b6, final z7 z7, final int n) {
        return b6.b(z7, n);
    }
    
    @Override
    final <UT, UB> UB d(final t8 t8, Object e, final b6 b6, final h6<p6.f> h6, final UB ub, final k9<UT, UB> k9) throws IOException {
        final p6.e e2 = (p6.e)e;
        final p6.f d = e2.d;
        final int h7 = d.H;
        final boolean j = d.J;
        final ca i = d.I;
        final ca v = ca.V;
        final Object o = null;
        if (i != v) {
            final int[] a = f6.a;
            Object o2 = null;
            Label_0375: {
                long l = 0L;
                Label_0343: {
                    int m = 0;
                    switch (a[i.ordinal()]) {
                        default: {
                            o2 = o;
                            break Label_0375;
                        }
                        case 18: {
                            o2 = t8.N((Class<Object>)e2.c.getClass(), b6);
                            break Label_0375;
                        }
                        case 17: {
                            o2 = t8.J((Class<Object>)e2.c.getClass(), b6);
                            break Label_0375;
                        }
                        case 16: {
                            o2 = t8.p();
                            break Label_0375;
                        }
                        case 15: {
                            o2 = t8.s();
                            break Label_0375;
                        }
                        case 14: {
                            throw new IllegalStateException("Shouldn't reach here.");
                        }
                        case 13: {
                            l = t8.d();
                            break Label_0343;
                        }
                        case 12: {
                            m = t8.b();
                            break;
                        }
                        case 11: {
                            l = t8.l();
                            break Label_0343;
                        }
                        case 10: {
                            m = t8.n();
                            break;
                        }
                        case 9: {
                            m = t8.t();
                            break;
                        }
                        case 8: {
                            o2 = t8.i();
                            break Label_0375;
                        }
                        case 7: {
                            m = t8.r();
                            break;
                        }
                        case 6: {
                            l = t8.k();
                            break Label_0343;
                        }
                        case 5: {
                            m = t8.g();
                            break;
                        }
                        case 4: {
                            l = t8.o();
                            break Label_0343;
                        }
                        case 3: {
                            l = t8.m();
                            break Label_0343;
                        }
                        case 2: {
                            o2 = t8.e();
                            break Label_0375;
                        }
                        case 1: {
                            o2 = t8.c();
                            break Label_0375;
                        }
                    }
                    o2 = m;
                    break Label_0375;
                }
                o2 = l;
            }
            final p6.f d2 = e2.d;
            if (d2.J) {
                h6.k(d2, o2);
            }
            else {
                final int n = a[d2.I.ordinal()];
                if (n != 17 && n != 18) {
                    e = o2;
                }
                else {
                    final Object d3 = h6.d(e2.d);
                    e = o2;
                    if (d3 != null) {
                        e = t6.e(d3, o2);
                    }
                }
                h6.h(e2.d, e);
            }
            return ub;
        }
        t8.g();
        throw null;
    }
    
    @Override
    final void e(final f5 f5, final Object o, final b6 b6, final h6<p6.f> h6) throws IOException {
        final p6.e e = (p6.e)o;
        final z7 e2 = e.c.n().e();
        final int f6 = f5.f();
        byte[] c;
        if (f6 == 0) {
            c = t6.c;
        }
        else {
            final byte[] array = new byte[f6];
            f5.q(array, 0, 0, f6);
            c = array;
        }
        final ByteBuffer wrap = ByteBuffer.wrap(c);
        if (!wrap.hasArray()) {
            throw new IllegalArgumentException("Direct buffers not yet supported");
        }
        final a5 a5 = new a5(wrap, true);
        n8.a().c(e2).h(e2, a5, b6);
        h6.h(e.d, e2);
        if (a5.zza() == Integer.MAX_VALUE) {
            return;
        }
        throw y6.f();
    }
    
    @Override
    final void f(final t8 t8, final Object o, final b6 b6, final h6<p6.f> h6) throws IOException {
        final p6.e e = (p6.e)o;
        h6.h(e.d, t8.N((Class<Object>)e.c.getClass(), b6));
    }
    
    @Override
    final void g(final ia ia, final Map.Entry<?, ?> entry) throws IOException {
        final p6.f f = (p6.f)entry.getKey();
        if (f.J) {
            switch (f6.a[f.I.ordinal()]) {
                case 18: {
                    final List list = (List)entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        u8.k(f.H, (List<?>)entry.getValue(), ia, n8.a().b(list.get(0).getClass()));
                        break;
                    }
                    break;
                }
                case 17: {
                    final List list2 = (List)entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        u8.x(f.H, (List<?>)entry.getValue(), ia, n8.a().b(list2.get(0).getClass()));
                    }
                }
                case 16: {
                    u8.j(f.H, (List<String>)entry.getValue(), ia);
                }
                case 15: {
                    u8.w(f.H, (List<f5>)entry.getValue(), ia);
                }
                case 14: {
                    u8.T(f.H, (List<Integer>)entry.getValue(), ia, false);
                }
                case 13: {
                    u8.K(f.H, (List<Long>)entry.getValue(), ia, false);
                }
                case 12: {
                    u8.Z(f.H, (List<Integer>)entry.getValue(), ia, false);
                }
                case 11: {
                    u8.Q(f.H, (List<Long>)entry.getValue(), ia, false);
                }
                case 10: {
                    u8.b0(f.H, (List<Integer>)entry.getValue(), ia, false);
                }
                case 9: {
                    u8.W(f.H, (List<Integer>)entry.getValue(), ia, false);
                }
                case 8: {
                    u8.d0(f.H, (List<Boolean>)entry.getValue(), ia, false);
                }
                case 7: {
                    u8.a0(f.H, (List<Integer>)entry.getValue(), ia, false);
                }
                case 6: {
                    u8.N(f.H, (List<Long>)entry.getValue(), ia, false);
                }
                case 5: {
                    u8.T(f.H, (List<Integer>)entry.getValue(), ia, false);
                }
                case 4: {
                    u8.G(f.H, (List<Long>)entry.getValue(), ia, false);
                }
                case 3: {
                    u8.C(f.H, (List<Long>)entry.getValue(), ia, false);
                }
                case 2: {
                    u8.y(f.H, (List<Float>)entry.getValue(), ia, false);
                }
                case 1: {
                    u8.l(f.H, (List<Double>)entry.getValue(), ia, false);
                    break;
                }
            }
            return;
        }
        switch (f6.a[f.I.ordinal()]) {
            case 18: {
                ia.J(f.H, entry.getValue(), n8.a().b(entry.getValue().getClass()));
                break;
            }
            case 17: {
                ia.M(f.H, entry.getValue(), n8.a().b(entry.getValue().getClass()));
            }
            case 16: {
                ia.m(f.H, (String)entry.getValue());
            }
            case 15: {
                ia.F(f.H, (f5)entry.getValue());
            }
            case 14: {
                ia.g(f.H, (int)entry.getValue());
            }
            case 13: {
                ia.L(f.H, (long)entry.getValue());
            }
            case 12: {
                ia.u(f.H, (int)entry.getValue());
            }
            case 11: {
                ia.c(f.H, (long)entry.getValue());
            }
            case 10: {
                ia.a(f.H, (int)entry.getValue());
            }
            case 9: {
                ia.C(f.H, (int)entry.getValue());
            }
            case 8: {
                ia.E(f.H, (boolean)entry.getValue());
            }
            case 7: {
                ia.A(f.H, (int)entry.getValue());
            }
            case 6: {
                ia.K(f.H, (long)entry.getValue());
            }
            case 5: {
                ia.g(f.H, (int)entry.getValue());
            }
            case 4: {
                ia.h(f.H, (long)entry.getValue());
            }
            case 3: {
                ia.p(f.H, (long)entry.getValue());
            }
            case 2: {
                ia.r(f.H, (float)entry.getValue());
            }
            case 1: {
                ia.q(f.H, (double)entry.getValue());
                break;
            }
        }
    }
    
    @Override
    final boolean h(final z7 z7) {
        return z7 instanceof p6.c;
    }
    
    @Override
    final h6<p6.f> i(final Object o) {
        return (h6<p6.f>)((p6.c)o).F();
    }
    
    @Override
    final void j(final Object o) {
        this.b(o).j();
    }
}
