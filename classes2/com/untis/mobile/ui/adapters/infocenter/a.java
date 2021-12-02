// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters.infocenter;

import kotlin.text.s;
import com.untis.mobile.utils.d0;
import org.joda.time.l0;
import org.joda.time.r;
import com.untis.mobile.utils.v;
import android.content.Context;
import kotlin.jvm.internal.k0;
import kotlin.h0;
import org.joda.time.t;
import m6.k;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0013\u0010\f\u001a\u00020\t8F@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0012\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0014\u001a\u00020\t8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bj\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e" }, d2 = { "Lcom/untis/mobile/ui/adapters/infocenter/a;", "", "Landroid/content/Context;", "context", "", "l", "k", "j", "i", "Lorg/joda/time/t;", "g", "()Lorg/joda/time/t;", "start", "", "G", "I", "h", "()I", "value", "f", "end", "<init>", "(Ljava/lang/String;II)V", "H", "a", "WEEK", "WEEK_2", "MONTH", "MONTH_3", "YEAR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum a
{
    @e
    public static final a H;
    
    I(0), 
    J(1), 
    K(2), 
    L(3), 
    M(4);
    
    private final int G;
    
    static {
        N = b();
        H = new a(null);
    }
    
    private a(final int g) {
        this.G = g;
    }
    
    private static final /* synthetic */ a[] b() {
        return new a[] { a.I, a.J, a.K, a.L, a.M };
    }
    
    @k
    @e
    public static final a d(final int n) {
        return a.H.a(n);
    }
    
    @e
    public final t f() {
        final t b = a.b();
        final int n = com.untis.mobile.ui.adapters.infocenter.a.b.a[this.ordinal()];
        t t;
        String s;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            throw new h0();
                        }
                        t = b.q0(1);
                        s = "today.plusYears(1)";
                    }
                    else {
                        t = b.l0(90);
                        s = "today.plusDays(90)";
                    }
                }
                else {
                    t = b.l0(30);
                    s = "today.plusDays(30)";
                }
            }
            else {
                t = b.o0(2);
                s = "today.plusWeeks(2)";
            }
        }
        else {
            t = b.o0(1);
            s = "today.plusWeeks(1)";
        }
        k0.o(t, s);
        return t;
    }
    
    @e
    public final t g() {
        final t b = a.b();
        final int n = com.untis.mobile.ui.adapters.infocenter.a.b.a[this.ordinal()];
        t t;
        String s;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            throw new h0();
                        }
                        t = b.T(1);
                        s = "today.minusYears(1)";
                    }
                    else {
                        t = b.O(90);
                        s = "today.minusDays(90)";
                    }
                }
                else {
                    t = b.O(30);
                    s = "today.minusDays(30)";
                }
            }
            else {
                t = b.Q(2);
                s = "today.minusWeeks(2)";
            }
        }
        else {
            t = b.Q(1);
            s = "today.minusWeeks(1)";
        }
        k0.o(t, s);
        return t;
    }
    
    public final int h() {
        return this.G;
    }
    
    @e
    public final String i(@e final Context context) {
        k0.p(context, "context");
        String s;
        if (a.M == this) {
            s = context.getString(2131886330);
            k0.o(s, "{\n            context.getString(R.string.infocenter_showCurrentYear_text)\n        }");
        }
        else {
            s = d0.n(new r((l0)v.a.a(), (l0)this.f().F0()));
        }
        return s;
    }
    
    @e
    public final String j(@e final Context context) {
        k0.p(context, "context");
        String s;
        if (a.M == this) {
            s = context.getString(2131886330);
            k0.o(s, "{\n            context.getString(R.string.infocenter_showCurrentYear_text)\n        }");
        }
        else {
            s = d0.n(new r((l0)this.g().F0(), (l0)v.a.a().W0(1)));
        }
        return s;
    }
    
    @e
    public final String k(@e final Context context) {
        k0.p(context, "context");
        final String string = context.getResources().getString(2131886332);
        k0.o(string, "context.resources.getString(R.string.infocenter_showNextXDays_text)");
        final int n = b.a[this.ordinal()];
        String s2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n == 5) {
                            final String s = context.getString(2131886330);
                            k0.o(s, "context.getString(R.string.infocenter_showCurrentYear_text)");
                            return s;
                        }
                        throw new h0();
                    }
                    else {
                        s2 = "90";
                    }
                }
                else {
                    s2 = "30";
                }
            }
            else {
                s2 = "14";
            }
        }
        else {
            s2 = "7";
        }
        return s.k2(string, "{0}", s2, false, 4, (Object)null);
    }
    
    @e
    public final String l(@e final Context context) {
        k0.p(context, "context");
        final String string = context.getResources().getString(2131886331);
        k0.o(string, "context.resources.getString(R.string.infocenter_showLastXDays_text)");
        final int n = b.a[this.ordinal()];
        String s2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n == 5) {
                            final String s = context.getString(2131886330);
                            k0.o(s, "context.getString(R.string.infocenter_showCurrentYear_text)");
                            return s;
                        }
                        throw new h0();
                    }
                    else {
                        s2 = "90";
                    }
                }
                else {
                    s2 = "30";
                }
            }
            else {
                s2 = "14";
            }
        }
        else {
            s2 = "7";
        }
        return s.k2(string, "{0}", s2, false, 4, (Object)null);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "com/untis/mobile/ui/adapters/infocenter/a$a", "", "", "value", "Lcom/untis/mobile/ui/adapters/infocenter/a;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final com.untis.mobile.ui.adapters.infocenter.a a(final int n) {
            while (true) {
                for (final com.untis.mobile.ui.adapters.infocenter.a a : com.untis.mobile.ui.adapters.infocenter.a.values()) {
                    if (a.h() == n) {
                        com.untis.mobile.ui.adapters.infocenter.a j = a;
                        if (a == null) {
                            j = com.untis.mobile.ui.adapters.infocenter.a.I;
                        }
                        return j;
                    }
                }
                com.untis.mobile.ui.adapters.infocenter.a a = null;
                continue;
            }
        }
    }
}
