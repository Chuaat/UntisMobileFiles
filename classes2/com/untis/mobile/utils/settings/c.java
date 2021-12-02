// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.settings;

import kotlin.h0;
import com.untis.mobile.persistence.models.masterdata.Schoolyear;
import org.joda.time.n0;
import com.untis.mobile.utils.v;
import org.joda.time.t;
import kotlin.jvm.internal.k0;
import com.untis.mobile.ui.adapters.infocenter.a;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\r\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u000e\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u000f\u001a\u00020\u0003*\u00020\u0000\u001a\u001a\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010\u001a\u0012\u0010\u0013\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\u0014\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\u0015\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010\u001a\u0012\u0010\u0016\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010\u001a\u0012\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\u001a\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u001b\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\u001c\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\u001d\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010\u001a\u0012\u0010\u001e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¨\u0006\u001f" }, d2 = { "Lcom/untis/mobile/utils/settings/g;", "", "userId", "Lorg/joda/time/t;", "e", "start", "Lkotlin/j2;", "o", "d", "klassenId", "n", "Lcom/untis/mobile/ui/adapters/infocenter/a;", "dateRange", "p", "f", "h", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "g", "i", "q", "l", "j", "", "k", "show", "r", "a", "m", "c", "b", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class c
{
    @e
    public static final com.untis.mobile.ui.adapters.infocenter.a a(@e final g g, final long n) {
        k0.p(g, "<this>");
        return com.untis.mobile.ui.adapters.infocenter.a.H.a((int)g.h(g.a.a(), n));
    }
    
    @e
    public static final t b(@e final g g, @e final com.untis.mobile.services.masterdata.a a) {
        k0.p(g, "<this>");
        k0.p(a, "masterDataService");
        final t g2 = v.a.g();
        final Schoolyear m = a.M(g2);
        Object end;
        if (m == null) {
            end = null;
        }
        else {
            end = m.getEnd();
        }
        final t n0 = g2.n0(1);
        if (end == null) {
            k0.o(n0, "end");
            return n0;
        }
        if (((org.joda.time.base.e)end).m((n0)n0)) {
            k0.o(n0, "end");
            return n0;
        }
        return (t)end;
    }
    
    @e
    public static final t c(@e final g g, final long n, @e final com.untis.mobile.services.masterdata.a a) {
        k0.p(g, "<this>");
        k0.p(a, "masterDataService");
        final t g2 = v.a.g();
        final int n2 = c.a.a[a(g, n).ordinal()];
        t t;
        String s;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 5) {
                            throw new h0();
                        }
                        final Schoolyear m = a.M(g2);
                        t start;
                        if (m == null) {
                            start = null;
                        }
                        else {
                            start = m.getStart();
                        }
                        t = start;
                        if (start == null) {
                            t = g2.T(1);
                        }
                        s = "masterDataService.schoolyear(today)?.start ?: today.minusYears(1)";
                    }
                    else {
                        t = g2.P(3);
                        s = "today.minusMonths(3)";
                    }
                }
                else {
                    t = g2.P(1);
                    s = "today.minusMonths(1)";
                }
            }
            else {
                t = g2.Q(2);
                s = "today.minusWeeks(2)";
            }
        }
        else {
            t = g2.Q(1);
            s = "today.minusWeeks(1)";
        }
        k0.o(t, s);
        return t;
    }
    
    public static final long d(@e final g g, final long n) {
        k0.p(g, "<this>");
        return g.h(g.a.b(), n);
    }
    
    @e
    public static final t e(@e final g g, final long n) {
        k0.p(g, "<this>");
        final t g2 = v.a.g();
        try {
            t c0;
            if (((org.joda.time.base.e)(c0 = t.c0(g.k(g.a.c(), n)))).o((n0)g2)) {
                c0 = g2;
            }
            k0.o(c0, "{\n        val date = LocalDate.parse(get(Settings.DashboardContactHourStart, userId))\n\n        if (date.isBefore(today)) {\n            today\n        } else {\n            date\n        }\n    }");
            return c0;
        }
        catch (Exception ex) {
            return g2;
        }
    }
    
    @e
    public static final com.untis.mobile.ui.adapters.infocenter.a f(@e final g g, final long n) {
        k0.p(g, "<this>");
        return com.untis.mobile.ui.adapters.infocenter.a.H.a((int)g.h(g.a.f(), n));
    }
    
    @e
    public static final t g(@e final g g, final long n, @e final com.untis.mobile.services.masterdata.a a) {
        k0.p(g, "<this>");
        k0.p(a, "masterDataService");
        final t h = h(g);
        final int n2 = c.a.a[f(g, n).ordinal()];
        t t;
        String s;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 5) {
                            throw new h0();
                        }
                        final Schoolyear m = a.M(h);
                        t end;
                        if (m == null) {
                            end = null;
                        }
                        else {
                            end = m.getEnd();
                        }
                        t = end;
                        if (end == null) {
                            t = h.q0(1);
                        }
                        s = "{\n            masterDataService.schoolyear(start)?.end\n                    ?: start.plusYears(1)\n        }";
                    }
                    else {
                        t = h.n0(3);
                        s = "start.plusMonths(3)";
                    }
                }
                else {
                    t = h.n0(1);
                    s = "start.plusMonths(1)";
                }
            }
            else {
                t = h.o0(2);
                s = "start.plusWeeks(2)";
            }
        }
        else {
            t = h.o0(1);
            s = "start.plusWeeks(1)";
        }
        k0.o(t, s);
        return t;
    }
    
    @e
    public static final t h(@e final g g) {
        k0.p(g, "<this>");
        return v.a.g();
    }
    
    @e
    public static final com.untis.mobile.ui.adapters.infocenter.a i(@e final g g, final long n) {
        k0.p(g, "<this>");
        return com.untis.mobile.ui.adapters.infocenter.a.H.a((int)g.h(g.a.d(), n));
    }
    
    @e
    public static final t j(@e final g g, @e final com.untis.mobile.services.masterdata.a a) {
        k0.p(g, "<this>");
        k0.p(a, "masterDataService");
        final t g2 = v.a.g();
        final Schoolyear m = a.M(g2);
        Object end;
        if (m == null) {
            end = null;
        }
        else {
            end = m.getEnd();
        }
        final t n0 = g2.n0(1);
        if (end == null) {
            k0.o(n0, "end");
            return n0;
        }
        if (((org.joda.time.base.e)end).m((n0)n0)) {
            k0.o(n0, "end");
            return n0;
        }
        return (t)end;
    }
    
    public static final boolean k(@e final g g, final long n) {
        k0.p(g, "<this>");
        return g.d(g.a.e(), n);
    }
    
    @e
    public static final t l(@e final g g, final long n, @e final com.untis.mobile.services.masterdata.a a) {
        k0.p(g, "<this>");
        k0.p(a, "masterDataService");
        final t g2 = v.a.g();
        final int n2 = c.a.a[i(g, n).ordinal()];
        t t;
        String s;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 5) {
                            throw new h0();
                        }
                        final Schoolyear m = a.M(g2);
                        t start;
                        if (m == null) {
                            start = null;
                        }
                        else {
                            start = m.getStart();
                        }
                        t = start;
                        if (start == null) {
                            t = g2.T(1);
                        }
                        s = "masterDataService.schoolyear(today)?.start ?: today.minusYears(1)";
                    }
                    else {
                        t = g2.P(3);
                        s = "today.minusMonths(3)";
                    }
                }
                else {
                    t = g2.P(1);
                    s = "today.minusMonths(1)";
                }
            }
            else {
                t = g2.Q(2);
                s = "today.minusWeeks(2)";
            }
        }
        else {
            t = g2.Q(1);
            s = "today.minusWeeks(1)";
        }
        k0.o(t, s);
        return t;
    }
    
    public static final void m(@e final g g, @e final com.untis.mobile.ui.adapters.infocenter.a a, final long n) {
        k0.p(g, "<this>");
        k0.p(a, "dateRange");
        g.j(g.a.a(), a.h(), n);
    }
    
    public static final void n(@e final g g, final long n, final long n2) {
        k0.p(g, "<this>");
        g.j(g.a.b(), n, n2);
    }
    
    public static final void o(@e final g g, @e final t t, final long n) {
        k0.p(g, "<this>");
        k0.p(t, "start");
        final i c = g.a.c();
        final String string = t.toString();
        k0.o(string, "start.toString()");
        g.b(c, string, n);
    }
    
    public static final void p(@e final g g, @e final com.untis.mobile.ui.adapters.infocenter.a a, final long n) {
        k0.p(g, "<this>");
        k0.p(a, "dateRange");
        g.j(g.a.f(), a.h(), n);
    }
    
    public static final void q(@e final g g, @e final com.untis.mobile.ui.adapters.infocenter.a a, final long n) {
        k0.p(g, "<this>");
        k0.p(a, "dateRange");
        g.j(g.a.d(), a.h(), n);
    }
    
    public static final void r(@e final g g, final boolean b, final long n) {
        k0.p(g, "<this>");
        g.a(g.a.e(), b, n);
    }
}
