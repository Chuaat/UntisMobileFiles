// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.util.Iterator;
import com.google.android.gms.internal.measurement.y4;
import androidx.collection.a;
import com.google.android.gms.internal.measurement.q3;
import java.util.HashSet;
import android.util.Log;
import com.google.android.gms.internal.measurement.td;
import com.google.android.gms.internal.measurement.u4;
import com.google.android.gms.internal.measurement.o3;

final class ua extends va
{
    private final o3 g;
    final /* synthetic */ xa h;
    
    ua(final xa h, final String s, final int n, final o3 g) {
        this.h = h;
        super(s, n);
        this.g = g;
    }
    
    @Override
    final int a() {
        return this.g.w();
    }
    
    @Override
    final boolean b() {
        return this.g.J();
    }
    
    @Override
    final boolean c() {
        return false;
    }
    
    final boolean k(Long e, Long f, final u4 u4, long e2, final q q, final boolean b) {
        td.b();
        final boolean y = this.h.a.w().y(super.a, a3.a0);
        if (this.g.I()) {
            e2 = q.e;
        }
        final boolean loggable = Log.isLoggable(this.h.a.c().z(), 2);
        final String s = null;
        final Object o = null;
        final Object o2 = null;
        if (loggable) {
            final l3 s2 = this.h.a.c().s();
            final int b2 = super.b;
            Integer value;
            if (this.g.K()) {
                value = this.g.w();
            }
            else {
                value = null;
            }
            s2.d("Evaluating filter. audience, filter, event", b2, value, this.h.a.A().n(this.g.C()));
            this.h.a.c().s().b("Filter definition", this.h.b.f0().C(this.g));
        }
        if (!this.g.K() || this.g.w() > 256) {
            final l3 t = this.h.a.c().t();
            final Object w = n3.w(super.a);
            Object value2 = o;
            if (this.g.K()) {
                value2 = this.g.w();
            }
            t.c("Invalid event filter ID. appId, id", w, String.valueOf(value2));
            return false;
        }
        final boolean g = this.g.G();
        final boolean h = this.g.H();
        final boolean i = this.g.I();
        final boolean b3 = g || h || i;
        if (b && !b3) {
            final l3 s3 = this.h.a.c().s();
            final int b4 = super.b;
            Object value3 = o2;
            if (this.g.K()) {
                value3 = this.g.w();
            }
            s3.c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", b4, value3);
            return true;
        }
        final o3 g2 = this.g;
        final String d = u4.D();
        Boolean b5 = null;
        Label_1480: {
            Boolean h2;
            HashSet<String> set;
            l3 l3;
            String s4;
            String s5;
            a<Object, String> a;
            String s6 = null;
            Constable constable = null;
            String s7;
            l3 l4;
            String s8;
            String s9;
            String s10;
            boolean b6;
            String a2;
            Object value4;
            Boolean h3;
            Boolean g3;
            Boolean b7;
            String s11;
            n3 c;
            Label_0397:Label_0495_Outer:
            while (true) {
                Label_0405: {
                    if (!g2.J()) {
                        break Label_0405;
                    }
                    h2 = va.h(e2, g2.B());
                    if (h2 == null) {
                        b5 = (Boolean)s;
                        break Label_1480;
                    }
                    if (h2) {
                        break Label_0405;
                    }
                    b5 = Boolean.FALSE;
                    break Label_1480;
                }
                set = new HashSet<String>();
            Label_0495:
                while (true) {
                    for (final q3 q2 : g2.D()) {
                        if (q2.A().isEmpty()) {
                            l3 = this.h.a.c().t();
                            s4 = this.h.a.A().n(d);
                            s5 = "null or empty param name in filter. event";
                            l3.b(s5, s4);
                            b5 = (Boolean)s;
                            break Label_1480;
                        }
                        set.add(q2.A());
                    }
                    a = new a<Object, String>();
                Label_0772:
                    while (true) {
                        for (final y4 y2 : u4.E()) {
                            if (set.contains(y2.C())) {
                                Label_0700: {
                                    if (y2.R()) {
                                        s6 = y2.C();
                                        if (y2.R()) {
                                            constable = y2.z();
                                            s6 = s6;
                                            break Label_0700;
                                        }
                                    }
                                    else if (y2.P()) {
                                        s7 = (s6 = y2.C());
                                        if (y2.P()) {
                                            constable = y2.v();
                                            s6 = s7;
                                            break Label_0700;
                                        }
                                    }
                                    else {
                                        if (y2.T()) {
                                            s6 = y2.C();
                                            constable = y2.D();
                                            break Label_0700;
                                        }
                                        l4 = this.h.a.c().t();
                                        s8 = this.h.a.A().n(d);
                                        s9 = this.h.a.A().o(y2.C());
                                        s10 = "Unknown value for param. event, param";
                                        l4.c(s10, s8, s9);
                                        b5 = (Boolean)s;
                                        break Label_1480;
                                    }
                                    constable = null;
                                }
                                a.put(s6, (String)constable);
                            }
                        }
                        for (final q3 q3 : g2.D()) {
                            b6 = (q3.D() && q3.C());
                            a2 = q3.A();
                            if (a2.isEmpty()) {
                                l3 = this.h.a.c().t();
                                s4 = this.h.a.A().n(d);
                                s5 = "Event has empty param name. event";
                                continue Label_0495;
                            }
                            value4 = a.get(a2);
                            if (value4 instanceof Long) {
                                if (!q3.E()) {
                                    l4 = this.h.a.c().t();
                                    s8 = this.h.a.A().n(d);
                                    s9 = this.h.a.A().o(a2);
                                    s10 = "No number filter for long param. event, param";
                                    continue Label_0772;
                                }
                                h3 = va.h((long)value4, q3.x());
                                if (h3 == null) {
                                    b5 = (Boolean)s;
                                    break Label_1480;
                                }
                                if (h3 == b6) {
                                    continue Label_0397;
                                }
                                continue Label_0495_Outer;
                            }
                            else if (value4 instanceof Double) {
                                if (!q3.E()) {
                                    l4 = this.h.a.c().t();
                                    s8 = this.h.a.A().n(d);
                                    s9 = this.h.a.A().o(a2);
                                    s10 = "No number filter for double param. event, param";
                                    continue Label_0772;
                                }
                                g3 = va.g((double)value4, q3.x());
                                if (g3 == null) {
                                    b5 = (Boolean)s;
                                    break Label_1480;
                                }
                                if (g3 == b6) {
                                    continue Label_0397;
                                }
                                continue Label_0495_Outer;
                            }
                            else if (value4 instanceof String) {
                                if (q3.G()) {
                                    b7 = va.f((String)value4, q3.z(), this.h.a.c());
                                }
                                else {
                                    if (!q3.E()) {
                                        l4 = this.h.a.c().t();
                                        s8 = this.h.a.A().n(d);
                                        s9 = this.h.a.A().o(a2);
                                        s10 = "No filter for String param. event, param";
                                        continue Label_0772;
                                    }
                                    s11 = (String)value4;
                                    if (!ba.O(s11)) {
                                        l4 = this.h.a.c().t();
                                        s8 = this.h.a.A().n(d);
                                        s9 = this.h.a.A().o(a2);
                                        s10 = "Invalid param value for number filter. event, param";
                                        continue Label_0772;
                                    }
                                    b7 = va.i(s11, q3.x());
                                }
                                if (b7 == null) {
                                    b5 = (Boolean)s;
                                    break Label_1480;
                                }
                                if (b7 == b6) {
                                    continue Label_0397;
                                }
                                continue Label_0495_Outer;
                            }
                            else {
                                c = this.h.a.c();
                                if (value4 == null) {
                                    c.s().c("Missing param for filter. event, param", this.h.a.A().n(d), this.h.a.A().o(a2));
                                    continue Label_0397;
                                }
                                l4 = c.t();
                                s8 = this.h.a.A().n(d);
                                s9 = this.h.a.A().o(a2);
                                s10 = "Unknown param type. event, param";
                                continue Label_0772;
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            b5 = Boolean.TRUE;
        }
        final l3 s12 = this.h.a.c().s();
        Serializable s13;
        if (b5 == null) {
            s13 = "null";
        }
        else {
            s13 = b5;
        }
        s12.b("Event filter result", s13);
        if (b5 == null) {
            return false;
        }
        final Boolean true = Boolean.TRUE;
        super.c = true;
        if (!b5) {
            return true;
        }
        super.d = true;
        if (b3 && u4.P()) {
            final Long value5 = u4.z();
            if (this.g.H()) {
                f = value5;
                if (y) {
                    if (!this.g.J()) {
                        f = value5;
                    }
                    else {
                        f = e;
                    }
                }
                super.f = f;
            }
            else {
                e = value5;
                if (y) {
                    e = value5;
                    if (this.g.J()) {
                        e = f;
                    }
                }
                super.e = e;
            }
        }
        return true;
    }
}
