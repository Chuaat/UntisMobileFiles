// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.widget;

import org.koin.core.c$a;
import com.untis.mobile.receivers.MessageOfDayWidgetProvider;
import com.untis.mobile.receivers.ScheduleLinkWidgetProvider;
import com.untis.mobile.utils.g0;
import com.untis.mobile.services.profile.legacy.j0;
import android.util.Log;
import com.untis.mobile.api.common.UMTimetable;
import android.os.Bundle;
import java.util.Collection;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.utils.mapper.realmToModel.x;
import com.untis.mobile.services.timetable.placeholder.k;
import java.util.Map;
import com.untis.mobile.api.common.timetable.UMPeriod;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import com.untis.mobile.api.common.UMMasterData;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.b2;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.timetable.period.ui.HolidayModel;
import com.untis.mobile.services.timetable.placeholder.l;
import org.joda.time.n0;
import com.untis.mobile.utils.mapper.common.b;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.collections.m;
import kotlin.jvm.internal.k0;
import android.content.ComponentName;
import com.untis.mobile.receivers.ScheduleWidgetProvider;
import android.content.Context;
import android.appwidget.AppWidgetManager;
import kotlin.collections.v;
import java.util.List;
import com.untis.mobile.api.dto.GetTimetableResponse;
import org.joda.time.t;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.UntisMobileApplication;
import com.untis.mobile.persistence.models.widget.ScheduleWidgetContext;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import com.untis.mobile.api.ApiService;
import n6.a;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001c\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!" }, d2 = { "Lcom/untis/mobile/services/widget/c;", "Lcom/untis/mobile/services/widget/d;", "Lorg/koin/core/c;", "", "h", "Lcom/untis/mobile/persistence/models/widget/ScheduleWidgetContext;", "widgetContext", "i", "", "", "f", "", "lastUpdate", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "j", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "cls", "Lkotlin/j2;", "m", "c", "widgetId", "a", "b", "Lcom/untis/mobile/api/ApiService;", "H", "Lkotlin/b0;", "g", "()Lcom/untis/mobile/api/ApiService;", "apiService", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c implements d, org.koin.core.c
{
    @e
    public static final c G;
    @e
    private static final b0 H;
    
    static {
        H = d0.c((a<?>)new a<ApiService>() {
            final /* synthetic */ org.koin.core.scope.a G = ((org.koin.core.c)(G = new c())).getKoin().y();
            
            @Override
            public final ApiService invoke() {
                return (ApiService)this.G.t(k1.d(ApiService.class), null, null);
            }
        });
    }
    
    private c() {
    }
    
    private final List<Integer> f() {
        final UntisMobileApplication.a i = UntisMobileApplication.I;
        final UntisMobileApplication b = i.b();
        if (b == null) {
            return v.E();
        }
        final int[] appWidgetIds = AppWidgetManager.getInstance((Context)i.b()).getAppWidgetIds(new ComponentName((Context)b, (Class)ScheduleWidgetProvider.class));
        k0.o(appWidgetIds, "getInstance(UntisMobileApplication.application).getAppWidgetIds(ComponentName(context, ScheduleWidgetProvider::class.java))");
        return m.cy(appWidgetIds);
    }
    
    private final ApiService g() {
        return c.H.getValue();
    }
    
    private final boolean h() {
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        if (b == null) {
            return false;
        }
        final List<Integer> f = this.f();
        final ArrayList<ScheduleWidgetContext> list = new ArrayList<ScheduleWidgetContext>();
        final Iterator<Number> iterator = f.iterator();
        while (iterator.hasNext()) {
            final ScheduleWidgetContext b2 = com.untis.mobile.utils.settings.old.e.G.b((Context)b, iterator.next().intValue());
            if (b2 != null) {
                list.add(b2);
            }
        }
        final ArrayList<ScheduleWidgetContext> list2 = new ArrayList<ScheduleWidgetContext>();
        for (final ScheduleWidgetContext next : list) {
            if (((org.joda.time.base.c)new org.joda.time.c(next.lastUpdate).V0(35)).j()) {
                list2.add(next);
            }
        }
        final Iterator<Object> iterator3 = list2.iterator();
        if (iterator3.hasNext()) {
            final ScheduleWidgetContext scheduleWidgetContext = iterator3.next();
            return true;
        }
        return false;
    }
    
    private final boolean i(final ScheduleWidgetContext scheduleWidgetContext) {
        return ((org.joda.time.base.c)new org.joda.time.c(scheduleWidgetContext.lastUpdate).V0(10)).j();
    }
    
    private final List<TimeTableModel> j(final ScheduleWidgetContext scheduleWidgetContext, final long n) {
        final ArrayList<TimeTableModel> list = new ArrayList<TimeTableModel>();
        final t b = com.untis.mobile.utils.time.a.b();
        final t l0 = b.l0(8);
        final String isoStart = scheduleWidgetContext.isoStart;
        Object d = null;
        Object d2;
        if (isoStart != null) {
            d2 = com.untis.mobile.utils.mapper.common.b.d(isoStart);
        }
        else {
            d2 = null;
        }
        final String isoEnd = scheduleWidgetContext.isoEnd;
        t l2 = b;
        n0 n2 = (n0)l0;
        if (isoEnd != null) {
            d = com.untis.mobile.utils.mapper.common.b.d(isoEnd);
            n2 = (n0)l0;
            l2 = b;
        }
        while (((org.joda.time.base.e)l2).o(n2)) {
            TimeTableModel e = null;
            Label_0234: {
                Label_0192: {
                    if (d2 != null && d != null) {
                        if (((org.joda.time.base.e)l2).m((n0)d2) || ((org.joda.time.base.e)l2).p((n0)d2)) {
                            if (((org.joda.time.base.e)l2).o((n0)d)) {
                                break Label_0192;
                            }
                            if (((org.joda.time.base.e)l2).p((n0)d)) {
                                break Label_0192;
                            }
                        }
                        final EntityType entityType = scheduleWidgetContext.entityType;
                        k0.o(entityType, "widgetContext.entityType");
                        e = new TimeTableModel(null, entityType, scheduleWidgetContext.entityId, l2, 0L, null, null, null, false, 0L, null, 2017, null);
                        break Label_0234;
                    }
                }
                final EntityType entityType2 = scheduleWidgetContext.entityType;
                k0.o(entityType2, "widgetContext.entityType");
                e = new TimeTableModel(null, entityType2, scheduleWidgetContext.entityId, l2, n, null, null, null, false, 0L, null, 2017, null);
            }
            list.add(e);
            l2 = l2.l0(1);
            k0.o(l2, "date.plusDays(1)");
        }
        return list;
    }
    
    private static final void k(final Profile profile, final ScheduleWidgetContext scheduleWidgetContext, final long lastUpdate, final UntisMobileApplication untisMobileApplication, final t t, final t t2, final int n, final GetTimetableResponse getTimetableResponse) {
        k0.p(profile, "$profile");
        k0.p(scheduleWidgetContext, "$widgetContext");
        k0.p(untisMobileApplication, "$context");
        k0.p(t, "$start");
        final k timeTableService = profile.getTimeTableService();
        final b2 g = b2.G;
        h.f((r0)g, (g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(t2) {
            int G;
            final /* synthetic */ Profile H;
            final /* synthetic */ GetTimetableResponse I;
            final /* synthetic */ org.joda.time.t J;
            final /* synthetic */ org.joda.time.t K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ Profile H = this.H;
                    final /* synthetic */ GetTimetableResponse I = this.I;
                    final /* synthetic */ org.joda.time.t J = this.J;
                    final /* synthetic */ org.joda.time.t K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((c$b)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final com.untis.mobile.services.masterdata.a masterDataService = this.H.getMasterDataService();
                    final UMMasterData masterData = this.I.masterData;
                    k0.o(masterData, "response.masterData");
                    final org.joda.time.t j = this.J;
                    final org.joda.time.t k = this.K;
                    k0.o(k, "end");
                    this.G = 1;
                    if (masterDataService.j(masterData, j, k, false, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 3, (Object)null);
        final UMTimetable timetable = getTimetableResponse.timetable;
        if (timetable != null) {
            final List<UMPeriod> periods = timetable.periods;
            if (periods != null) {
                k0.o(periods, "response.timetable.periods");
                final Map<Long, List<UMPeriod>> a = timeTableService.a(periods);
                h.h((g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    Object H;
                    int I;
                    final /* synthetic */ Map<Long, List<UMPeriod>> J;
                    final /* synthetic */ k K;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            Object G;
                            Object H;
                            int I;
                            final /* synthetic */ Map<Long, List<UMPeriod>> J = this.J;
                            final /* synthetic */ k K = this.K;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((c$c)this.create(r0, d)).invokeSuspend(j2.a);
                    }
                    
                    @org.jetbrains.annotations.f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                        final Object h = kotlin.coroutines.intrinsics.b.h();
                        final int i = this.I;
                        Iterator<Period> iterator;
                        k j;
                        if (i != 0) {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            iterator = (Iterator<Period>)this.H;
                            final k k = (k)this.G;
                            c1.n(o);
                            j = k;
                        }
                        else {
                            c1.n(o);
                            final Map<Long, List<UMPeriod>> l = this.J;
                            final ArrayList<com.untis.mobile.persistence.realm.period.c> list = new ArrayList<com.untis.mobile.persistence.realm.period.c>();
                            for (final Map.Entry<Long, List<UMPeriod>> entry : l.entrySet()) {
                                final com.untis.mobile.persistence.realm.period.c h2 = x.a.h(entry.getValue().get(0), entry.getValue());
                                if (h2 != null) {
                                    list.add(h2);
                                }
                            }
                            final ArrayList list2 = new ArrayList<Period>(v.Y((Iterable<?>)list, 10));
                            final Iterator<Object> iterator3 = list.iterator();
                            while (iterator3.hasNext()) {
                                list2.add(x.a.g(iterator3.next()));
                            }
                            j = this.K;
                            iterator = list2.iterator();
                        }
                        while (iterator.hasNext()) {
                            final Period period = iterator.next();
                            this.G = j;
                            this.H = iterator;
                            this.I = 1;
                            if (j.q(period, this) == h) {
                                return h;
                            }
                        }
                        return j2.a;
                    }
                }, 1, (Object)null);
                scheduleWidgetContext.periodIds.clear();
                scheduleWidgetContext.periodIds.addAll(a.keySet());
                scheduleWidgetContext.lastUpdate = getTimetableResponse.masterData.timeStamp;
                String isoStart;
                if ((isoStart = getTimetableResponse.timetable.displayableStartDate) == null) {
                    isoStart = t.toString();
                }
                scheduleWidgetContext.isoStart = isoStart;
                String isoEnd;
                if ((isoEnd = getTimetableResponse.timetable.displayableEndDate) == null) {
                    isoEnd = t2.toString();
                }
                scheduleWidgetContext.isoEnd = isoEnd;
                com.untis.mobile.utils.settings.old.e.G.a((Context)untisMobileApplication, scheduleWidgetContext);
                h.f((r0)g, (g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ Profile H;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ Profile H = this.H;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((c$d)this.create(r0, d)).invokeSuspend(j2.a);
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
                            final com.untis.mobile.services.classbook.a classBookService = this.H.getClassBookService();
                            this.G = 1;
                            if (classBookService.t(this) == h) {
                                return h;
                            }
                        }
                        return j2.a;
                    }
                }, 3, (Object)null);
                AppWidgetManager.getInstance((Context)UntisMobileApplication.I.b()).updateAppWidgetOptions(n, new Bundle());
                return;
            }
        }
        scheduleWidgetContext.lastUpdate = lastUpdate;
        com.untis.mobile.utils.settings.old.e.G.a((Context)untisMobileApplication, scheduleWidgetContext);
    }
    
    private static final void l(final int i, final ScheduleWidgetContext scheduleWidgetContext, final long lastUpdate, final UntisMobileApplication untisMobileApplication, final Throwable t) {
        k0.p(scheduleWidgetContext, "$widgetContext");
        k0.p(untisMobileApplication, "$context");
        Log.e("untis_log", k0.C("error while loading timetable for widget ", i), t);
        scheduleWidgetContext.lastUpdate = lastUpdate;
        com.untis.mobile.utils.settings.old.e.G.a((Context)untisMobileApplication, scheduleWidgetContext);
    }
    
    private final void m(final Context context, final Class<?> clazz) {
        final AppWidgetManager instance = AppWidgetManager.getInstance(context);
        final int[] appWidgetIds = instance.getAppWidgetIds(new ComponentName(context, (Class)clazz));
        final int n = appWidgetIds.length - 1;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                final int n3 = n2 + 1;
                instance.updateAppWidgetOptions(appWidgetIds[n2], new Bundle());
                if (n3 > n) {
                    break;
                }
                n2 = n3;
            }
        }
    }
    
    @Override
    public void a(final int n) {
        final UntisMobileApplication.a i = UntisMobileApplication.I;
        final UntisMobileApplication b = i.b();
        if (b == null) {
            return;
        }
        final com.untis.mobile.utils.settings.old.e g = com.untis.mobile.utils.settings.old.e.G;
        final ScheduleWidgetContext b2 = g.b((Context)b, n);
        if (b2 == null) {
            return;
        }
        final j0 g2 = j0.G;
        final String profileId = b2.profileId;
        k0.o(profileId, "widgetContext.profileId");
        final Profile l = g2.l(profileId);
        if (l == null) {
            return;
        }
        if (this.i(b2)) {
            if (g0.a((Context)i.b())) {
                final long lastUpdate = b2.lastUpdate;
                b2.lastUpdate = com.untis.mobile.utils.time.a.d();
                g.a((Context)b, b2);
                final t b3 = com.untis.mobile.utils.time.a.b();
                this.g().getTimeTable(l, b2.entityType, b2.entityId, this.j(b2, lastUpdate)).C5((rx.functions.b)new com.untis.mobile.services.widget.b(l, b2, lastUpdate, b, b3, b3.l0(7), n), (rx.functions.b)new com.untis.mobile.services.widget.a(n, b2, lastUpdate, b));
            }
        }
    }
    
    @Override
    public void b(@e final Context context) {
        k0.p(context, "context");
        this.m(context, ScheduleWidgetProvider.class);
        this.m(context, ScheduleLinkWidgetProvider.class);
        this.m(context, MessageOfDayWidgetProvider.class);
    }
    
    @Override
    public void c() {
        Log.d("untis_log", "UmWidgetService.update");
        if (this.h() && g0.a((Context)UntisMobileApplication.I.b())) {
            final List<Integer> f = this.f();
            final ArrayList<Number> list = new ArrayList<Number>();
            for (final Number next : f) {
                if (next.intValue() != 0) {
                    list.add(next);
                }
            }
            final Iterator<Object> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                c.G.a(iterator2.next().intValue());
            }
        }
    }
    
    @e
    public org.koin.core.a getKoin() {
        return org.koin.core.c$a.a((org.koin.core.c)this);
    }
}
