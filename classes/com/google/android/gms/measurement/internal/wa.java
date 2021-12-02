// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.io.Serializable;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.td;
import com.google.android.gms.internal.measurement.o5;
import com.google.android.gms.internal.measurement.x3;

final class wa extends va
{
    private final x3 g;
    final /* synthetic */ xa h;
    
    wa(final xa h, final String s, final int n, final x3 g) {
        this.h = h;
        super(s, n);
        this.g = g;
    }
    
    @Override
    final int a() {
        return this.g.v();
    }
    
    @Override
    final boolean b() {
        return false;
    }
    
    @Override
    final boolean c() {
        return true;
    }
    
    final boolean k(final Long n, final Long n2, final o5 o5, final boolean b) {
        td.b();
        final boolean y = this.h.a.w().y(super.a, a3.Y);
        final boolean c = this.g.C();
        final boolean d = this.g.D();
        final boolean e = this.g.E();
        final boolean b2 = c || d || e;
        final String s = null;
        final Object o6 = null;
        if (b && !b2) {
            final l3 s2 = this.h.a.c().s();
            final int b3 = super.b;
            Object value = o6;
            if (this.g.F()) {
                value = this.g.v();
            }
            s2.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", b3, value);
            return true;
        }
        final q3 w = this.g.w();
        final boolean c2 = w.C();
        Serializable j = null;
        Label_0543: {
            Boolean b4 = null;
            Label_0253: {
                l3 l3;
                String s3;
                String s4;
                if (o5.M()) {
                    if (w.E()) {
                        b4 = va.h(o5.w(), w.x());
                        break Label_0253;
                    }
                    l3 = this.h.a.c().t();
                    s3 = this.h.a.A().p(o5.B());
                    s4 = "No number filter for long property. property";
                }
                else if (o5.L()) {
                    if (w.E()) {
                        b4 = va.g(o5.v(), w.x());
                        break Label_0253;
                    }
                    l3 = this.h.a.c().t();
                    s3 = this.h.a.A().p(o5.B());
                    s4 = "No number filter for double property. property";
                }
                else if (o5.O()) {
                    if (w.G()) {
                        b4 = va.f(o5.C(), w.z(), this.h.a.c());
                        break Label_0253;
                    }
                    if (!w.E()) {
                        l3 = this.h.a.c().t();
                        s3 = this.h.a.A().p(o5.B());
                        s4 = "No string or number filter defined. property";
                    }
                    else {
                        if (ba.O(o5.C())) {
                            b4 = va.i(o5.C(), w.x());
                            break Label_0253;
                        }
                        this.h.a.c().t().c("Invalid user property value for Numeric number filter. property, value", this.h.a.A().p(o5.B()), o5.C());
                        j = s;
                        break Label_0543;
                    }
                }
                else {
                    l3 = this.h.a.c().t();
                    s3 = this.h.a.A().p(o5.B());
                    s4 = "User property has no value, property";
                }
                l3.b(s4, s3);
                j = s;
                break Label_0543;
            }
            j = va.j(b4, c2);
        }
        final l3 s5 = this.h.a.c().s();
        Serializable s6;
        if (j == null) {
            s6 = "null";
        }
        else {
            s6 = j;
        }
        s5.b("Property filter result", s6);
        if (j == null) {
            return false;
        }
        super.c = Boolean.TRUE;
        if (e && !(boolean)j) {
            return true;
        }
        if (!b || this.g.C()) {
            super.d = (Boolean)j;
        }
        if ((boolean)j && b2 && o5.N()) {
            long n3 = o5.x();
            if (n != null) {
                n3 = n;
            }
            long longValue = n3;
            if (y) {
                longValue = n3;
                if (this.g.C()) {
                    longValue = n3;
                    if (!this.g.D()) {
                        longValue = n3;
                        if (n2 != null) {
                            longValue = n2;
                        }
                    }
                }
            }
            if (this.g.D()) {
                super.f = longValue;
            }
            else {
                super.e = longValue;
            }
        }
        return true;
    }
}
