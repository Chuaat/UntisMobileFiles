// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.classlead;

import kotlin.jvm.internal.m0;
import n6.l;
import com.untis.mobile.services.profile.legacy.j0;
import java.net.ConnectException;
import kotlinx.coroutines.u0;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.h;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.utils.d0;
import org.joda.time.l0;
import org.joda.time.r;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.i1;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import androidx.lifecycle.LiveData;
import java.util.Iterator;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsenceKt;
import kotlin.text.s;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import java.util.ArrayList;
import kotlin.collections.v;
import com.untis.mobile.utils.settings.c;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import org.joda.time.t;
import kotlin.j2;
import kotlin.coroutines.d;
import com.untis.mobile.dashboard.persistence.model.classlead.DashboardClassLead;
import java.util.List;
import androidx.lifecycle.k0;
import com.untis.mobile.dashboard.service.a;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.utils.settings.g;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b9\u0010:J\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0014\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\nJ\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u0013\u0010\u0013\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0004J\u0014\u0010\u0015\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0014\u0010\u0016\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0016\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0017J\u001e\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0019\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u000bH\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b \u0010\u0004R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R$\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/classlead/b;", "Landroidx/lifecycle/w0;", "Lkotlin/j2;", "l", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "k", "Lorg/joda/time/t;", "s", "p", "w", "Landroidx/lifecycle/LiveData;", "", "Lcom/untis/mobile/dashboard/persistence/model/classlead/DashboardClassLead;", "o", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "errorHandler", "Lkotlinx/coroutines/k2;", "u", "", "t", "leads", "m", "q", "Lcom/untis/mobile/ui/adapters/infocenter/a;", "dateRange", "v", "n", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "absence", "Lcom/untis/mobile/persistence/models/classbook/absence/ExcuseStatus;", "excuseStatus", "x", "r", "Lcom/untis/mobile/utils/settings/g;", "b", "Lcom/untis/mobile/utils/settings/g;", "settings", "Lcom/untis/mobile/dashboard/service/a;", "d", "Lcom/untis/mobile/dashboard/service/a;", "dashboardService", "Lcom/untis/mobile/services/masterdata/a;", "e", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "Landroidx/lifecycle/k0;", "f", "Landroidx/lifecycle/k0;", "dashboardClassLeadLiveData", "Lcom/untis/mobile/persistence/models/profile/Profile;", "c", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/utils/settings/g;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends w0
{
    @e
    private final Context a;
    @e
    private final g b;
    private Profile c;
    private a d;
    private com.untis.mobile.services.masterdata.a e;
    @e
    private final k0<List<DashboardClassLead>> f;
    
    public b(@e final Context a, @e final g b) {
        kotlin.jvm.internal.k0.p(a, "context");
        kotlin.jvm.internal.k0.p(b, "settings");
        this.a = a;
        this.b = b;
        this.f = (k0<List<DashboardClassLead>>)new k0((Object)null);
    }
    
    public static final /* synthetic */ Context c(final b b) {
        return b.a;
    }
    
    public static final /* synthetic */ k0 d(final b b) {
        return b.f;
    }
    
    public static final /* synthetic */ a e(final b b) {
        return b.d;
    }
    
    public static final /* synthetic */ com.untis.mobile.services.masterdata.a g(final b b) {
        return b.e;
    }
    
    public static final /* synthetic */ Profile h(final b b) {
        return b.c;
    }
    
    public static final /* synthetic */ g i(final b b) {
        return b.b;
    }
    
    private final Object k(final d<? super j2> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0047: {
            if (d instanceof b$a) {
                final kotlin.coroutines.jvm.internal.d d2 = (b$a)d;
                final int j = d2.J;
                if ((j & Integer.MIN_VALUE) != 0x0) {
                    d2.J = j + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0047;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                Object G;
                /* synthetic */ Object H;
                int J;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object h) {
                    this.H = h;
                    this.J |= Integer.MIN_VALUE;
                    return com.untis.mobile.dashboard.ui.option.classlead.b.this.k(this);
                }
            };
        }
        Object h = d3.H;
        final Object h2 = kotlin.coroutines.intrinsics.b.h();
        final int i = d3.J;
        k0 k0;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0 = (k0)d3.G;
            c1.n(h);
        }
        else {
            c1.n(h);
            final k0<List<DashboardClassLead>> f = this.f;
            final a d4 = this.d;
            if (d4 == null) {
                kotlin.jvm.internal.k0.S("dashboardService");
                throw null;
            }
            d3.G = f;
            d3.J = 1;
            final Object h3 = d4.h(d3);
            if (h3 == h2) {
                return h2;
            }
            k0 = f;
            h = h3;
        }
        k0.q(h);
        return j2.a;
    }
    
    private final Object l(final d<? super j2> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0047: {
            if (d instanceof b$b) {
                final kotlin.coroutines.jvm.internal.d d2 = (b$b)d;
                final int j = d2.J;
                if ((j & Integer.MIN_VALUE) != 0x0) {
                    d2.J = j + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0047;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                Object G;
                /* synthetic */ Object H;
                int J;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object h) {
                    this.H = h;
                    this.J |= Integer.MIN_VALUE;
                    return com.untis.mobile.dashboard.ui.option.classlead.b.this.l(this);
                }
            };
        }
        Object h = d3.H;
        final Object h2 = kotlin.coroutines.intrinsics.b.h();
        final int i = d3.J;
        k0 k0;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0 = (k0)d3.G;
            c1.n(h);
        }
        else {
            c1.n(h);
            final k0<List<DashboardClassLead>> f = this.f;
            final a d4 = this.d;
            if (d4 == null) {
                kotlin.jvm.internal.k0.S("dashboardService");
                throw null;
            }
            final t s = this.s();
            final t p = this.p();
            d3.G = f;
            d3.J = 1;
            final Object r = d4.r(s, p, d3);
            if (r == h2) {
                return h2;
            }
            k0 = f;
            h = r;
        }
        k0.q(h);
        return j2.a;
    }
    
    private final t p() {
        final g b = this.b;
        final com.untis.mobile.services.masterdata.a e = this.e;
        if (e != null) {
            return com.untis.mobile.utils.settings.c.b(b, e);
        }
        kotlin.jvm.internal.k0.S("masterDataService");
        throw null;
    }
    
    private final t s() {
        final g b = this.b;
        final Profile c = this.c;
        if (c == null) {
            kotlin.jvm.internal.k0.S("profile");
            throw null;
        }
        final long id = c.getId();
        final com.untis.mobile.services.masterdata.a e = this.e;
        if (e != null) {
            return com.untis.mobile.utils.settings.c.c(b, id, e);
        }
        kotlin.jvm.internal.k0.S("masterDataService");
        throw null;
    }
    
    @e
    public final String m(@e final List<DashboardClassLead> list) {
        kotlin.jvm.internal.k0.p(list, "leads");
        final ArrayList<List<DashboardStudentAbsence>> list2 = new ArrayList<List<DashboardStudentAbsence>>(v.Y((Iterable<?>)list, 10));
        final Iterator<? extends T> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((DashboardClassLead)iterator.next()).getAbsences());
        }
        final List<Object> c0 = v.c0((Iterable<? extends Iterable<?>>)list2);
        String s;
        if (c0.size() == 0) {
            s = this.a.getString(2131886127);
            kotlin.jvm.internal.k0.o(s, "context.getString(R.string.absences_noAbsencesState_text)");
        }
        else {
            final String string = this.a.getString(2131886336);
            kotlin.jvm.internal.k0.o(string, "context.getString(R.string.infocenter_xAbsencesWithYUnexcusedHint_text)");
            final String k2 = kotlin.text.s.k2(string, "{absenceAmount}", String.valueOf(c0.size()), false, 4, (Object)null);
            final boolean empty = c0.isEmpty();
            int i = 0;
            int n = 0;
            if (!empty) {
                final Iterator<DashboardStudentAbsence> iterator2 = c0.iterator();
                while (true) {
                    i = n;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    final DashboardStudentAbsence dashboardStudentAbsence = iterator2.next();
                    final com.untis.mobile.services.masterdata.a e = this.e;
                    if (e == null) {
                        kotlin.jvm.internal.k0.S("masterDataService");
                        throw null;
                    }
                    if (!(DashboardStudentAbsenceKt.isExcused(dashboardStudentAbsence, e) ^ true)) {
                        continue;
                    }
                    final int n2 = n + 1;
                    if ((n = n2) >= 0) {
                        continue;
                    }
                    v.V();
                    n = n2;
                }
            }
            s = kotlin.text.s.k2(k2, "{unexcusedAmount}", String.valueOf(i), false, 4, (Object)null);
        }
        return s;
    }
    
    @e
    public final com.untis.mobile.ui.adapters.infocenter.a n() {
        final g b = this.b;
        final Profile c = this.c;
        if (c != null) {
            return com.untis.mobile.utils.settings.c.a(b, c.getId());
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @e
    public final LiveData<List<DashboardClassLead>> o() {
        return (LiveData<List<DashboardClassLead>>)this.f;
    }
    
    @e
    public final String q(@e final List<DashboardClassLead> list) {
        kotlin.jvm.internal.k0.p(list, "leads");
        final ArrayList<Iterable<? extends T>> list2 = new ArrayList<Iterable<? extends T>>(v.Y((Iterable<?>)list, 10));
        final Iterator<? extends T> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((DashboardClassLead)iterator.next()).getEvents());
        }
        final List<Object> c0 = v.c0((Iterable<? extends Iterable<?>>)list2);
        final int size = c0.size();
        String s;
        String s2;
        if (size != 0) {
            if (size != 1) {
                final String string = this.a.getString(2131886208);
                kotlin.jvm.internal.k0.o(string, "context.getString(R.string.classbookEntries_classbookEntriesState_text)");
                s = kotlin.text.s.k2(string, "{0}", String.valueOf(c0.size()), false, 4, (Object)null);
                return s;
            }
            s = this.a.getString(2131886212);
            s2 = "context.getString(R.string.classbookEntries_oneClassbookEntriesState_text)";
        }
        else {
            s = this.a.getString(2131886211);
            s2 = "context.getString(R.string.classbookEntries_noClassbookEntriesState_text)";
        }
        kotlin.jvm.internal.k0.o(s, s2);
        return s;
    }
    
    @org.jetbrains.annotations.f
    public final Object r(@e final d<? super List<ExcuseStatus>> d) {
        final com.untis.mobile.services.masterdata.a e = this.e;
        if (e != null) {
            return e.X();
        }
        kotlin.jvm.internal.k0.S("masterDataService");
        throw null;
    }
    
    @org.jetbrains.annotations.f
    public final Object t(@e final d<? super String> d) {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, d<? super String>, Object>() {
            int G;
            final /* synthetic */ b H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super String>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super String> d) {
                return ((b$c)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1.n(o);
                final g i = com.untis.mobile.dashboard.ui.option.classlead.b.i(this.H);
                final Profile h = com.untis.mobile.dashboard.ui.option.classlead.b.h(this.H);
                if (h == null) {
                    kotlin.jvm.internal.k0.S("profile");
                    throw null;
                }
                String str;
                if (com.untis.mobile.utils.settings.c.a(i, h.getId()) != com.untis.mobile.ui.adapters.infocenter.a.M) {
                    str = com.untis.mobile.utils.d0.n(new r((l0)com.untis.mobile.dashboard.ui.option.classlead.b.this.s().F0(), (l0)com.untis.mobile.dashboard.ui.option.classlead.b.this.p().F0()));
                }
                else {
                    str = com.untis.mobile.dashboard.ui.option.classlead.b.c(this.H).getString(2131886772);
                    kotlin.jvm.internal.k0.o(str, "{\n            context.getString(R.string.shared_schoolyear_text)\n        }");
                }
                final Profile h2 = com.untis.mobile.dashboard.ui.option.classlead.b.h(this.H);
                if (h2 != null) {
                    String string = str;
                    if (h2.getUserClasses().size() == 1) {
                        final com.untis.mobile.services.masterdata.a g = com.untis.mobile.dashboard.ui.option.classlead.b.g(this.H);
                        if (g == null) {
                            kotlin.jvm.internal.k0.S("masterDataService");
                            throw null;
                        }
                        final Profile h3 = com.untis.mobile.dashboard.ui.option.classlead.b.h(this.H);
                        if (h3 == null) {
                            kotlin.jvm.internal.k0.S("profile");
                            throw null;
                        }
                        final Klasse n = g.N(v.m2((Iterable<? extends Number>)h3.getUserClasses()).longValue());
                        String str2 = "";
                        if (n != null) {
                            final String displayableTitle = n.getDisplayableTitle();
                            if (displayableTitle != null) {
                                str2 = displayableTitle;
                            }
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(" | ");
                        sb.append(str);
                        string = sb.toString();
                    }
                    return string;
                }
                kotlin.jvm.internal.k0.S("profile");
                throw null;
            }
        }, (d)d);
    }
    
    @e
    public final k2 u(@e final CoroutineExceptionHandler coroutineExceptionHandler) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        return h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ b H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$d)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1 && g != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    if (com.untis.mobile.utils.extension.h.g(com.untis.mobile.dashboard.ui.option.classlead.b.c(this.H))) {
                        final b h2 = this.H;
                        this.G = 1;
                        if (h2.l(this) == h) {
                            return h;
                        }
                    }
                    else {
                        final b h3 = this.H;
                        this.G = 2;
                        if (h3.k(this) == h) {
                            return h;
                        }
                    }
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final k2 v(@e final CoroutineExceptionHandler coroutineExceptionHandler, @e final com.untis.mobile.ui.adapters.infocenter.a a) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(a, "dateRange");
        return h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>(null) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ com.untis.mobile.ui.adapters.infocenter.a I;
            final /* synthetic */ CoroutineExceptionHandler J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ com.untis.mobile.ui.adapters.infocenter.a I = this.I;
                    final /* synthetic */ CoroutineExceptionHandler J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$e)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1.n(o);
                final g i = com.untis.mobile.dashboard.ui.option.classlead.b.i(this.H);
                final com.untis.mobile.ui.adapters.infocenter.a j = this.I;
                final Profile h = com.untis.mobile.dashboard.ui.option.classlead.b.h(this.H);
                if (h != null) {
                    com.untis.mobile.utils.settings.c.m(i, j, h.getId());
                    kotlinx.coroutines.h.f(x0.a((w0)this.H), (kotlin.coroutines.g)this.J, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ b H;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                int G;
                                final /* synthetic */ b H = this.H;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                            return ((b$e$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @org.jetbrains.annotations.f
                        public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                            final Object h = kotlin.coroutines.intrinsics.b.h();
                            final int g = this.G;
                            if (g != 0) {
                                if (g != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c1.n(o);
                            }
                            else {
                                c1.n(o);
                                if (!com.untis.mobile.utils.extension.h.g(com.untis.mobile.dashboard.ui.option.classlead.b.c(this.H))) {
                                    throw new ConnectException();
                                }
                                final b h2 = this.H;
                                this.G = 1;
                                if (h2.l(this) == h) {
                                    return h;
                                }
                            }
                            return j2.a;
                        }
                    }, 2, (Object)null);
                    return j2.a;
                }
                kotlin.jvm.internal.k0.S("profile");
                throw null;
            }
        }, 2, (Object)null);
    }
    
    public final void w() {
        final Profile n = j0.G.n();
        if (n == null) {
            throw new IllegalStateException("no profile");
        }
        this.c = n;
        final Context a = this.a;
        final Profile c = this.c;
        if (c == null) {
            kotlin.jvm.internal.k0.S("profile");
            throw null;
        }
        this.d = new com.untis.mobile.dashboard.service.b(a, c.getUniqueId());
        final com.untis.mobile.services.masterdata.b.a z = com.untis.mobile.services.masterdata.b.Z;
        final Profile c2 = this.c;
        if (c2 != null) {
            this.e = z.a(c2.getUniqueId());
            return;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @e
    public final k2 x(@e final CoroutineExceptionHandler coroutineExceptionHandler, @e final DashboardStudentAbsence dashboardStudentAbsence, @e final ExcuseStatus excuseStatus) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(dashboardStudentAbsence, "absence");
        kotlin.jvm.internal.k0.p(excuseStatus, "excuseStatus");
        return h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>(null) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ DashboardStudentAbsence I;
            final /* synthetic */ ExcuseStatus J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ DashboardStudentAbsence I = this.I;
                    final /* synthetic */ ExcuseStatus J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$f)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    final kotlinx.coroutines.m0 c = i1.c();
                    final p<r0, kotlin.coroutines.d<? super j2>, Object> p = new p<r0, kotlin.coroutines.d<? super j2>, Object>(null) {
                        int G;
                        final /* synthetic */ b H;
                        final /* synthetic */ DashboardStudentAbsence I;
                        final /* synthetic */ ExcuseStatus J;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                                int G;
                                final /* synthetic */ b H = this.H;
                                final /* synthetic */ DashboardStudentAbsence I = this.I;
                                final /* synthetic */ ExcuseStatus J = this.J;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                            return ((b$f$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @org.jetbrains.annotations.f
                        public final Object invokeSuspend(@org.jetbrains.annotations.e Object n) {
                            final Object h = kotlin.coroutines.intrinsics.b.h();
                            final int g = this.G;
                            if (g != 0) {
                                if (g != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c1.n(n);
                            }
                            else {
                                c1.n(n);
                                final com.untis.mobile.dashboard.service.a e = com.untis.mobile.dashboard.ui.option.classlead.b.e(this.H);
                                if (e == null) {
                                    kotlin.jvm.internal.k0.S("dashboardService");
                                    throw null;
                                }
                                final DashboardStudentAbsence i = this.I;
                                final long id = this.J.getId();
                                this.G = 1;
                                if ((n = e.n(i, id, this)) == h) {
                                    return h;
                                }
                            }
                            final DashboardStudentAbsence dashboardStudentAbsence = (DashboardStudentAbsence)n;
                            List<Object> e2;
                            if ((e2 = (List<Object>)((LiveData)com.untis.mobile.dashboard.ui.option.classlead.b.d(this.H)).f()) == null) {
                                e2 = v.E();
                            }
                            final k0 d = com.untis.mobile.dashboard.ui.option.classlead.b.d(this.H);
                            final ExcuseStatus j = this.J;
                            final DashboardStudentAbsence k = this.I;
                            final ArrayList list = new ArrayList<DashboardClassLead>(v.Y((Iterable<?>)e2, 10));
                            for (final DashboardClassLead dashboardClassLead : e2) {
                                dashboardClassLead.getReferencedExcuseStates().put(j.getId(), (Object)j);
                                dashboardClassLead.setAbsences(com.untis.mobile.utils.extension.c.c(dashboardClassLead.getAbsences(), dashboardStudentAbsence, new l<DashboardStudentAbsence, Boolean>() {
                                    public final boolean a(@org.jetbrains.annotations.e final DashboardStudentAbsence dashboardStudentAbsence) {
                                        kotlin.jvm.internal.k0.p(dashboardStudentAbsence, "it");
                                        return dashboardStudentAbsence.getId() == k.getId();
                                    }
                                }));
                                list.add(dashboardClassLead);
                            }
                            d.n((Object)list);
                            return j2.a;
                        }
                    };
                    this.G = 1;
                    if (kotlinx.coroutines.h.i((kotlin.coroutines.g)c, (p)p, (kotlin.coroutines.d)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
}
