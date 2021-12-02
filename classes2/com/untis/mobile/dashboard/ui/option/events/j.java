// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.events;

import com.untis.mobile.services.profile.legacy.j0;
import java.net.ConnectException;
import androidx.lifecycle.LiveData;
import java.util.Collection;
import kotlinx.coroutines.u0;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.profile.Child;
import java.util.ArrayList;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.h;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.i1;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import org.joda.time.c;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderType;
import kotlin.jvm.internal.w;
import com.untis.mobile.dashboard.persistence.model.event.DashboardEventKt;
import com.untis.mobile.utils.v;
import kotlin.j2;
import kotlin.coroutines.d;
import com.untis.mobile.dashboard.persistence.model.reminder.Reminder;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderSubtype;
import com.untis.mobile.dashboard.persistence.model.event.DashboardEvent;
import java.util.List;
import org.joda.time.t;
import java.util.Map;
import androidx.lifecycle.k0;
import com.untis.mobile.dashboard.service.a;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.utils.settings.g;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010=\u001a\u00020:¢\u0006\u0004\bE\u0010FJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J(\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0006\u0010\u0011\u001a\u00020\u0002J \u0010\u0013\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\t0\u0012J\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0006J\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u001cJ\u0016\u0010$\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"J\u000e\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%J\u0016\u0010)\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u0007J\u001e\u0010*\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rJ!\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0+2\u0006\u0010\f\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0006\u0010/\u001a\u00020.R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R0\u0010D\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\t0A8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006G" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/events/j;", "Landroidx/lifecycle/w0;", "Lkotlin/j2;", "m", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "l", "", "Lcom/untis/mobile/dashboard/persistence/model/event/DashboardEvent;", "events", "", "Lorg/joda/time/t;", "z", "event", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;", "type", "Lcom/untis/mobile/dashboard/persistence/model/reminder/Reminder;", "j", "x", "Landroidx/lifecycle/LiveData;", "q", "Lcom/untis/mobile/persistence/models/profile/Child;", "n", "Lcom/untis/mobile/persistence/models/profile/Profile;", "r", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "errorHandler", "Lkotlinx/coroutines/k2;", "v", "Lcom/untis/mobile/ui/adapters/infocenter/a;", "dateRange", "w", "p", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;", "eventType", "", "eventId", "o", "Landroid/content/Context;", "context", "", "t", "k", "y", "", "s", "(Lcom/untis/mobile/dashboard/persistence/model/event/DashboardEvent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/EntityType;", "u", "a", "Landroid/content/Context;", "Lcom/untis/mobile/dashboard/service/a;", "d", "Lcom/untis/mobile/dashboard/service/a;", "dashboardService", "Lcom/untis/mobile/services/masterdata/a;", "e", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/utils/settings/g;", "b", "Lcom/untis/mobile/utils/settings/g;", "settings", "c", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Landroidx/lifecycle/k0;", "f", "Landroidx/lifecycle/k0;", "eventsLiveData", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/utils/settings/g;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class j extends w0
{
    @e
    private final Context a;
    @e
    private final g b;
    private Profile c;
    private a d;
    private com.untis.mobile.services.masterdata.a e;
    @e
    private final k0<Map<t, List<DashboardEvent>>> f;
    
    public j(@e final Context a, @e final g b) {
        kotlin.jvm.internal.k0.p(a, "context");
        kotlin.jvm.internal.k0.p(b, "settings");
        this.a = a;
        this.b = b;
        this.f = (k0<Map<t, List<DashboardEvent>>>)new k0((Object)null);
    }
    
    public static final /* synthetic */ Context d(final j j) {
        return j.a;
    }
    
    public static final /* synthetic */ a e(final j j) {
        return j.d;
    }
    
    public static final /* synthetic */ com.untis.mobile.services.masterdata.a f(final j j) {
        return j.e;
    }
    
    public static final /* synthetic */ Profile g(final j j) {
        return j.c;
    }
    
    public static final /* synthetic */ g h(final j j) {
        return j.b;
    }
    
    private final Reminder j(final DashboardEvent dashboardEvent, final ReminderSubtype reminderSubtype) {
        final Profile c = this.c;
        if (c != null) {
            final String uniqueId = c.getUniqueId();
            final ReminderType eventType = dashboardEvent.getEventType();
            final long eventId = dashboardEvent.getEventId();
            final c x0 = v.a.a().X0(5);
            final String reminderTitle = DashboardEventKt.toReminderTitle(dashboardEvent, this.a, reminderSubtype);
            final String reminderDescription = DashboardEventKt.toReminderDescription(dashboardEvent);
            kotlin.jvm.internal.k0.o(x0, "plusSeconds(5)");
            return new Reminder(0L, uniqueId, eventType, eventId, reminderTitle, reminderDescription, x0, reminderSubtype, 1, null);
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    private final Object l(final d<? super j2> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0047: {
            if (d instanceof j$b) {
                final kotlin.coroutines.jvm.internal.d d2 = (j$b)d;
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
                    return j.this.l(this);
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
            final k0<Map<t, List<DashboardEvent>>> f = this.f;
            final m0 c = i1.c();
            final p<r0, d<? super Map<t, ? extends List<? extends DashboardEvent>>>, Object> p = new p<r0, d<? super Map<t, ? extends List<? extends DashboardEvent>>>, Object>() {
                Object G;
                int H;
                final /* synthetic */ j I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super Map<org.joda.time.t, ? extends List<? extends DashboardEvent>>>, Object>() {
                        Object G;
                        int H;
                        final /* synthetic */ j I = this.I;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super Map<org.joda.time.t, ? extends List<DashboardEvent>>> d) {
                    return ((j$c)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int h2 = this.H;
                    j i;
                    if (h2 != 0) {
                        if (h2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i = (j)this.G;
                        c1.n(o);
                    }
                    else {
                        c1.n(o);
                        final org.joda.time.t h3 = com.untis.mobile.utils.settings.c.h(j.h(this.I));
                        final g h4 = j.h(this.I);
                        final Profile g = j.g(this.I);
                        if (g == null) {
                            kotlin.jvm.internal.k0.S("profile");
                            throw null;
                        }
                        final long id = g.getId();
                        final com.untis.mobile.services.masterdata.a f = j.f(this.I);
                        if (f == null) {
                            kotlin.jvm.internal.k0.S("masterDataService");
                            throw null;
                        }
                        final org.joda.time.t g2 = com.untis.mobile.utils.settings.c.g(h4, id, f);
                        i = this.I;
                        final com.untis.mobile.dashboard.service.a e = j.e(i);
                        if (e == null) {
                            kotlin.jvm.internal.k0.S("dashboardService");
                            throw null;
                        }
                        this.G = i;
                        this.H = 1;
                        o = e.o(h3, g2, this);
                        if (o == h) {
                            return h;
                        }
                    }
                    final List list = (List)o;
                    if (list == null) {
                        return null;
                    }
                    return i.z(list);
                }
            };
            d3.G = f;
            d3.J = 1;
            final Object l = kotlinx.coroutines.h.i((kotlin.coroutines.g)c, (p)p, (d)d3);
            if (l == h2) {
                return h2;
            }
            k0 = f;
            h = l;
        }
        k0.q(h);
        return j2.a;
    }
    
    private final Object m(final d<? super j2> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0047: {
            if (d instanceof j$d) {
                final kotlin.coroutines.jvm.internal.d d2 = (j$d)d;
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
                    return j.this.m(this);
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
            final k0<Map<t, List<DashboardEvent>>> f = this.f;
            final m0 c = i1.c();
            final p<r0, d<? super Map<t, ? extends List<? extends DashboardEvent>>>, Object> p = new p<r0, d<? super Map<t, ? extends List<? extends DashboardEvent>>>, Object>() {
                Object G;
                int H;
                final /* synthetic */ j I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super Map<org.joda.time.t, ? extends List<? extends DashboardEvent>>>, Object>() {
                        Object G;
                        int H;
                        final /* synthetic */ j I = this.I;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super Map<org.joda.time.t, ? extends List<DashboardEvent>>> d) {
                    return ((j$e)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e Object l) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int h2 = this.H;
                    j j;
                    if (h2 != 0) {
                        if (h2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = (j)this.G;
                        c1.n(l);
                    }
                    else {
                        c1.n(l);
                        final org.joda.time.t h3 = com.untis.mobile.utils.settings.c.h(com.untis.mobile.dashboard.ui.option.events.j.h(this.I));
                        final g h4 = com.untis.mobile.dashboard.ui.option.events.j.h(this.I);
                        final Profile g = com.untis.mobile.dashboard.ui.option.events.j.g(this.I);
                        if (g == null) {
                            kotlin.jvm.internal.k0.S("profile");
                            throw null;
                        }
                        final long id = g.getId();
                        final com.untis.mobile.services.masterdata.a f = com.untis.mobile.dashboard.ui.option.events.j.f(this.I);
                        if (f == null) {
                            kotlin.jvm.internal.k0.S("masterDataService");
                            throw null;
                        }
                        final org.joda.time.t g2 = com.untis.mobile.utils.settings.c.g(h4, id, f);
                        final Profile g3 = com.untis.mobile.dashboard.ui.option.events.j.g(this.I);
                        if (g3 == null) {
                            kotlin.jvm.internal.k0.S("profile");
                            throw null;
                        }
                        final EntityType entityType = g3.getEntityType();
                        List<Long> k;
                        if (entityType.isParentRole()) {
                            final Profile g4 = com.untis.mobile.dashboard.ui.option.events.j.g(this.I);
                            if (g4 == null) {
                                kotlin.jvm.internal.k0.S("profile");
                                throw null;
                            }
                            final Set<Child> userChildren = g4.getUserChildren();
                            k = new ArrayList<Long>(kotlin.collections.v.Y((Iterable<?>)userChildren, 10));
                            final Iterator<Object> iterator = userChildren.iterator();
                            while (iterator.hasNext()) {
                                k.add(kotlin.coroutines.jvm.internal.b.g(iterator.next().getId()));
                            }
                        }
                        else {
                            final Profile g5 = com.untis.mobile.dashboard.ui.option.events.j.g(this.I);
                            if (g5 == null) {
                                kotlin.jvm.internal.k0.S("profile");
                                throw null;
                            }
                            k = kotlin.collections.v.k(kotlin.coroutines.jvm.internal.b.g(g5.getEntityId()));
                        }
                        EntityType student = entityType;
                        if (entityType.isParentRole()) {
                            student = EntityType.STUDENT;
                        }
                        final j i = this.I;
                        final com.untis.mobile.dashboard.service.a e = com.untis.mobile.dashboard.ui.option.events.j.e(i);
                        if (e == null) {
                            kotlin.jvm.internal.k0.S("dashboardService");
                            throw null;
                        }
                        this.G = i;
                        this.H = 1;
                        l = e.l(h3, g2, student, k, this);
                        if (l == h) {
                            return h;
                        }
                        j = i;
                    }
                    return j.z((List)l);
                }
            };
            d3.G = f;
            d3.J = 1;
            final Object l = kotlinx.coroutines.h.i((kotlin.coroutines.g)c, (p)p, (d)d3);
            if (l == h2) {
                return h2;
            }
            k0 = f;
            h = l;
        }
        k0.q(h);
        return j2.a;
    }
    
    private final Map<t, List<DashboardEvent>> z(final List<DashboardEvent> list) {
        final HashMap<t, List<DashboardEvent>> hashMap = new HashMap<t, List<DashboardEvent>>();
        for (final DashboardEvent dashboardEvent : kotlin.collections.v.d5((Iterable<? extends Comparable>)list)) {
            final t sectionLocalDate = dashboardEvent.sectionLocalDate();
            final List<DashboardEvent> list2 = hashMap.get(sectionLocalDate);
            if (list2 == null) {
                hashMap.put(sectionLocalDate, kotlin.collections.v.P(dashboardEvent));
            }
            else {
                list2.add(dashboardEvent);
            }
        }
        return hashMap;
    }
    
    @e
    public final k2 k(@e final CoroutineExceptionHandler coroutineExceptionHandler, @e final DashboardEvent dashboardEvent) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(dashboardEvent, "event");
        return h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ j H;
            final /* synthetic */ DashboardEvent I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ j H = this.H;
                    final /* synthetic */ DashboardEvent I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((j$a)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final com.untis.mobile.dashboard.service.a e = j.e(this.H);
                    if (e == null) {
                        kotlin.jvm.internal.k0.S("dashboardService");
                        throw null;
                    }
                    final ReminderType eventType = this.I.getEventType();
                    final long eventId = this.I.getEventId();
                    this.G = 1;
                    if (e.t(eventType, eventId, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final List<Child> n() {
        final ArrayList<Object> list = (ArrayList<Object>)new ArrayList<Child>();
        list.add(null);
        final Profile c = this.c;
        if (c != null) {
            list.addAll(c.getUserChildren());
            return (List<Child>)list;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @e
    public final DashboardEvent o(@e final ReminderType reminderType, final long n) {
        kotlin.jvm.internal.k0.p(reminderType, "eventType");
        final Map map = (Map)((LiveData)this.f).f();
        if (map != null) {
            final Set<t> keySet = map.keySet();
            final ArrayList<List<? extends T>> list = new ArrayList<List<? extends T>>();
            final Iterator<Object> iterator = keySet.iterator();
            while (iterator.hasNext()) {
                final List<? extends T> list2 = map.get(iterator.next());
                if (list2 != null) {
                    list.add(list2);
                }
            }
            while (true) {
                for (final DashboardEvent next : kotlin.collections.v.c0((Iterable<? extends Iterable<?>>)list)) {
                    final DashboardEvent dashboardEvent = next;
                    if (dashboardEvent.getEventType() == reminderType && dashboardEvent.getEventId() == n) {
                        final DashboardEvent dashboardEvent2 = next;
                        final DashboardEvent dashboardEvent3 = dashboardEvent2;
                        if (dashboardEvent3 != null) {
                            return dashboardEvent3;
                        }
                        throw new IllegalStateException("no valid event");
                    }
                }
                final DashboardEvent dashboardEvent2 = null;
                continue;
            }
        }
        throw new IllegalStateException("no valid data");
    }
    
    @e
    public final com.untis.mobile.ui.adapters.infocenter.a p() {
        final g b = this.b;
        final Profile c = this.c;
        if (c != null) {
            return com.untis.mobile.utils.settings.c.f(b, c.getId());
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @e
    public final LiveData<Map<t, List<DashboardEvent>>> q() {
        return (LiveData<Map<t, List<DashboardEvent>>>)this.f;
    }
    
    @e
    public final Profile r() {
        final Profile c = this.c;
        if (c != null) {
            return c;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @org.jetbrains.annotations.f
    public final Object s(@e final DashboardEvent dashboardEvent, @e final d<? super List<ReminderSubtype>> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0050: {
            if (d instanceof j$f) {
                final kotlin.coroutines.jvm.internal.d d2 = (j$f)d;
                final int i = d2.I;
                if ((i & Integer.MIN_VALUE) != 0x0) {
                    d2.I = i + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0050;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                final /* synthetic */ j H;
                int I;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object g) {
                    this.G = g;
                    this.I |= Integer.MIN_VALUE;
                    return this.H.s(null, this);
                }
            };
        }
        final Object g = d3.G;
        final Object h = kotlin.coroutines.intrinsics.b.h();
        final int j = d3.I;
        Object q;
        if (j != 0) {
            if (j != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1.n(g);
            q = g;
        }
        else {
            c1.n(g);
            final a d4 = this.d;
            if (d4 == null) {
                kotlin.jvm.internal.k0.S("dashboardService");
                throw null;
            }
            final ReminderType eventType = dashboardEvent.getEventType();
            final long eventId = dashboardEvent.getEventId();
            d3.I = 1;
            if ((q = d4.q(eventType, eventId, d3)) == h) {
                return h;
            }
        }
        final Iterable<? extends T> iterable = (Iterable<? extends T>)q;
        final ArrayList list = new ArrayList<ReminderSubtype>(kotlin.collections.v.Y((Iterable<?>)iterable, 10));
        final Iterator<? extends T> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            list.add(((Reminder)iterator.next()).getSourceSubType());
        }
        return kotlin.collections.v.L5((Collection<?>)list);
    }
    
    @e
    public final String t(@e final Context context) {
        kotlin.jvm.internal.k0.p(context, "context");
        return this.p().i(context);
    }
    
    @e
    public final EntityType u() {
        final Profile c = this.c;
        if (c != null) {
            return c.getEntityType();
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @e
    public final k2 v(@e final CoroutineExceptionHandler coroutineExceptionHandler) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        return h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ j H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ j H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((j$g)this.create(r0, d)).invokeSuspend(j2.a);
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
                    if (com.untis.mobile.utils.extension.h.g(j.d(this.H))) {
                        final j h2 = this.H;
                        this.G = 1;
                        if (h2.m(this) == h) {
                            return h;
                        }
                    }
                    else {
                        final j h3 = this.H;
                        this.G = 2;
                        if (h3.l(this) == h) {
                            return h;
                        }
                    }
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    public final void w(@e final CoroutineExceptionHandler coroutineExceptionHandler, @e final com.untis.mobile.ui.adapters.infocenter.a a) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(a, "dateRange");
        final g b = this.b;
        final Profile c = this.c;
        if (c != null) {
            com.untis.mobile.utils.settings.c.p(b, a, c.getId());
            h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ j H;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ j H = this.H;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((j$h)this.create(r0, d)).invokeSuspend(j2.a);
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
                        if (!com.untis.mobile.utils.extension.h.g(j.d(this.H))) {
                            throw new ConnectException();
                        }
                        final j h2 = this.H;
                        this.G = 1;
                        if (h2.m(this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 2, (Object)null);
            return;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    public final void x() {
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
    public final k2 y(@e final CoroutineExceptionHandler coroutineExceptionHandler, @e final DashboardEvent dashboardEvent, @e final ReminderSubtype reminderSubtype) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(dashboardEvent, "event");
        kotlin.jvm.internal.k0.p(reminderSubtype, "type");
        return h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>(null) {
            int G;
            final /* synthetic */ j H;
            final /* synthetic */ DashboardEvent I;
            final /* synthetic */ ReminderSubtype J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    int G;
                    final /* synthetic */ j H = this.H;
                    final /* synthetic */ DashboardEvent I = this.I;
                    final /* synthetic */ ReminderSubtype J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((j$i)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final com.untis.mobile.dashboard.service.a e = j.e(this.H);
                    if (e == null) {
                        kotlin.jvm.internal.k0.S("dashboardService");
                        throw null;
                    }
                    final Reminder a = j.this.j(this.I, this.J);
                    this.G = 1;
                    if (e.k(a, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
}
