// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.core;

import com.untis.mobile.services.billing.i;
import android.app.Activity;
import com.untis.mobile.utils.extension.n;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDay;
import com.untis.mobile.persistence.models.MessageOfDay;
import kotlin.n1;
import kotlin.s0;
import com.untis.mobile.utils.g0;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.m0;
import org.joda.time.t;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHour;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import org.joda.time.n0;
import com.untis.mobile.persistence.models.officehour.OfficeHour;
import java.util.Collection;
import com.untis.mobile.ui.activities.timetable.v;
import androidx.lifecycle.LiveData;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.j2;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.i1;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.profile.Right;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.jvm.internal.w;
import androidx.lifecycle.k0;
import com.untis.mobile.analytics.base.b;
import com.untis.mobile.messages.data.repository.inbox.MessagesRepository;
import com.untis.mobile.services.profile.legacy.a;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u00014B/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010.\u001a\u00020+¢\u0006\u0004\bC\u0010DJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J#\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J+\u0010\u0017\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bJ\u0013\u0010\u001f\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010#\u001a\u00020\u0004J\u0006\u0010$\u001a\u00020\fJ\u0006\u0010%\u001a\u00020\u0004J\u0016\u0010&\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010'\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bJ\u0016\u0010(\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bR\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00150?8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006E" }, d2 = { "Lcom/untis/mobile/ui/core/d;", "Landroidx/lifecycle/w0;", "", "profileId", "Lkotlin/j2;", "r", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "s", "(Lcom/untis/mobile/persistence/models/EntityType;Ljava/lang/Long;)V", "", "messagesVisible", "", "h", "(ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "j", "Landroidx/lifecycle/LiveData;", "Lcom/untis/mobile/ui/core/c;", "g", "q", "(Ljava/lang/String;Lcom/untis/mobile/persistence/models/EntityType;Ljava/lang/Long;)V", "Landroid/content/Context;", "context", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "errorHandler", "Lkotlinx/coroutines/k2;", "l", "i", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "o", "u", "t", "p", "v", "k", "m", "n", "J", "backPressedTimestamp", "Lcom/untis/mobile/firebase/b;", "e", "Lcom/untis/mobile/firebase/b;", "firebaseHelper", "Lcom/untis/mobile/utils/a;", "b", "Lcom/untis/mobile/utils/a;", "appSettings", "Lcom/untis/mobile/services/profile/legacy/a;", "a", "Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "Lcom/untis/mobile/analytics/base/b;", "d", "Lcom/untis/mobile/analytics/base/b;", "analyticsTracker", "Lcom/untis/mobile/messages/data/repository/inbox/MessagesRepository;", "c", "Lcom/untis/mobile/messages/data/repository/inbox/MessagesRepository;", "messagesRepository", "Landroidx/lifecycle/k0;", "f", "Landroidx/lifecycle/k0;", "mBottomNavigationLiveData", "<init>", "(Lcom/untis/mobile/services/profile/legacy/a;Lcom/untis/mobile/utils/a;Lcom/untis/mobile/messages/data/repository/inbox/MessagesRepository;Lcom/untis/mobile/analytics/base/b;Lcom/untis/mobile/firebase/b;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d extends w0
{
    @e
    public static final a h;
    private static final long i = 3000L;
    @e
    private final com.untis.mobile.services.profile.legacy.a a;
    @e
    private final com.untis.mobile.utils.a b;
    @e
    private final MessagesRepository c;
    @e
    private final b d;
    @e
    private final com.untis.mobile.firebase.b e;
    @e
    private final k0<c> f;
    private long g;
    
    static {
        h = new a(null);
    }
    
    public d(@e final com.untis.mobile.services.profile.legacy.a a, @e final com.untis.mobile.utils.a b, @e final MessagesRepository c, @e final b d, @e final com.untis.mobile.firebase.b e) {
        kotlin.jvm.internal.k0.p(a, "profileService");
        kotlin.jvm.internal.k0.p(b, "appSettings");
        kotlin.jvm.internal.k0.p(c, "messagesRepository");
        kotlin.jvm.internal.k0.p(d, "analyticsTracker");
        kotlin.jvm.internal.k0.p(e, "firebaseHelper");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = (k0<c>)new k0();
    }
    
    public static final /* synthetic */ b a(final d d) {
        return d.d;
    }
    
    public static final /* synthetic */ com.untis.mobile.firebase.b b(final d d) {
        return d.e;
    }
    
    public static final /* synthetic */ k0 c(final d d) {
        return d.f;
    }
    
    public static final /* synthetic */ com.untis.mobile.services.profile.legacy.a e(final d d) {
        return d.a;
    }
    
    private final Object h(final boolean b, final kotlin.coroutines.d<? super Integer> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0050: {
            if (d instanceof d$b) {
                final kotlin.coroutines.jvm.internal.d d2 = (d$b)d;
                final int i = d2.I;
                if ((i & Integer.MIN_VALUE) != 0x0) {
                    d2.I = i + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0050;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int I;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object g) {
                    this.G = g;
                    this.I |= Integer.MIN_VALUE;
                    return d.this.h(false, this);
                }
            };
        }
        final Object g = d3.G;
        final Object h = kotlin.coroutines.intrinsics.b.h();
        final int j = d3.I;
        int intValue = 0;
        Label_0099: {
            if (j == 0) {
                break Label_0099;
            }
            Label_0089: {
                if (j != 1) {
                    break Label_0089;
                }
                try {
                    c1.n(g);
                    final Object unreadMessagesCount = g;
                    Label_0141: {
                        intValue = ((Number)unreadMessagesCount).intValue();
                    }
                    return kotlin.coroutines.jvm.internal.b.f(intValue);
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    c1.n(g);
                    // iftrue(Label_0112:, b)
                    return kotlin.coroutines.jvm.internal.b.f(0);
                    Label_0112:
                    final MessagesRepository c = this.c;
                    d3.I = 1;
                    // iftrue(Label_0141:, unreadMessagesCount = c.getUnreadMessagesCount((d<? super Integer>)d3) != h)
                    return h;
                }
                catch (Exception ex) {
                    return kotlin.coroutines.jvm.internal.b.f(intValue);
                }
            }
        }
    }
    
    private final boolean j(final Profile profile) {
        final boolean i = this.b.I(profile);
        final boolean b = true;
        if (i) {
            return true;
        }
        if (profile.hasAnyRight(Right.READ_OFFICE_HOUR)) {
            return true;
        }
        if (profile.hasAnyRight(Right.SUBSTITUTION_PLANNING, Right.SUBSTITUTION_ASK_TEACHER_READ, Right.SUBSTITUTION_ASK_TEACHER)) {
            return true;
        }
        if ((profile.getEntityType().isParentRole() || profile.getEntityType().isStudentRole()) && profile.hasAnyRight(Right.READ_MY_ABSENCES, Right.WRITE_OWN_ABSENCE)) {
            return true;
        }
        final EntityType teacher = EntityType.TEACHER;
        if ((profile.hasAnyRole(teacher) || profile.getEntityType().isParentRole() || profile.getEntityType().isStudentRole()) && profile.hasAnyRight(Right.READ_PARENTSDAY)) {
            boolean b2 = b;
            if (!i) {
                b2 = (profile.hasAnyRole(teacher) && b);
            }
            return b2;
        }
        return profile.hasAnyRole(teacher) && profile.hasAnyRight(Right.CLASSREGISTER);
    }
    
    private final void r(final String s) {
        if (s != null) {
            final Profile l = this.a.l(s);
            if (l != null) {
                kotlinx.coroutines.h.g((g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super Profile>, Object>() {
                    int G;
                    final /* synthetic */ d H;
                    final /* synthetic */ Profile I;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                        return (d<j2>)new p<r0, d<? super Profile>, Object>() {
                            int G;
                            final /* synthetic */ d H = this.H;
                            final /* synthetic */ Profile I = this.I;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super Profile> d) {
                        return ((d$h)this.create(r0, d)).invokeSuspend(j2.a);
                    }
                    
                    @org.jetbrains.annotations.f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                        kotlin.coroutines.intrinsics.b.h();
                        if (this.G == 0) {
                            c1.n(o);
                            return d.e(this.H).h(this.I);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                });
            }
        }
    }
    
    private final void s(final EntityType entityType, final Long n) {
        final Profile n2 = this.a.n();
        if (n2 == null) {
            return;
        }
        TimeTableEntity timeTableEntity;
        if (entityType != null && n != null) {
            if ((timeTableEntity = n2.getTimeTableService().w(entityType, n)) == null) {
                timeTableEntity = new TimeTableEntity(entityType, n, false, 0, 0L, null, 60, null);
            }
        }
        else {
            timeTableEntity = n2.createTimeTableEntity();
        }
        n2.setLastViewedEntityId(timeTableEntity.getEntityId());
        n2.setLastViewedEntityType(timeTableEntity.getEntityType());
        this.a.b(n2);
        kotlinx.coroutines.h.g((g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super TimeTableEntity>, Object>() {
            int G;
            final /* synthetic */ Profile H;
            final /* synthetic */ TimeTableEntity I;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                return (d<j2>)new p<r0, d<? super TimeTableEntity>, Object>() {
                    int G;
                    final /* synthetic */ Profile H = this.H;
                    final /* synthetic */ TimeTableEntity I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super TimeTableEntity> d) {
                return ((d$i)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object i) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(i);
                }
                else {
                    c1.n(i);
                    final k timeTableService = this.H.getTimeTableService();
                    final EntityType entityType = this.I.getEntityType();
                    final long entityId = this.I.getEntityId();
                    this.G = 1;
                    if ((i = timeTableService.I(entityType, entityId, this)) == h) {
                        return h;
                    }
                }
                return i;
            }
        });
    }
    
    @e
    public final LiveData<c> g() {
        return (LiveData<c>)this.f;
    }
    
    @org.jetbrains.annotations.f
    public final Object i(@e final kotlin.coroutines.d<? super Integer> d) {
        final v.a b0 = v.b0;
        final int size = new com.untis.mobile.services.messages.e(b0.h()).l(true).size();
        int n = 0;
        final com.untis.mobile.services.infocenter.w w = new com.untis.mobile.services.infocenter.w(b0.h());
        final org.joda.time.c f0 = com.untis.mobile.utils.v.a.g().F0();
        kotlin.jvm.internal.k0.o(f0, "Date.today().toDateTimeAtStartOfDay()");
        final List<OfficeHour> h = w.h(f0);
        if (!(h instanceof Collection) || !h.isEmpty()) {
            final Iterator<Object> iterator = h.iterator();
            n = 0;
            while (iterator.hasNext()) {
                final OfficeHour officeHour = iterator.next();
                if (kotlin.coroutines.jvm.internal.b.a(officeHour.getRegistered() && ((org.joda.time.base.e)officeHour.getStart().h1()).p((n0)com.untis.mobile.utils.v.a.g()))) {
                    final int n2 = n + 1;
                    if ((n = n2) >= 0) {
                        continue;
                    }
                    kotlin.collections.v.V();
                    n = n2;
                }
            }
        }
        return kotlin.coroutines.jvm.internal.b.f(size + 0 + n);
    }
    
    @e
    public final k2 k(@e final Context context, @e final CoroutineExceptionHandler coroutineExceptionHandler) {
        kotlin.jvm.internal.k0.p(context, "context");
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (g)coroutineExceptionHandler, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ d H;
            final /* synthetic */ Context I;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                return (d<j2>)new p<r0, d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ d H = this.H;
                    final /* synthetic */ Context I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super j2> d) {
                return ((d$c)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final m0 c = i1.c();
                    final p<r0, d<? super j2>, Object> p = new p<r0, d<? super j2>, Object>() {
                        Object G;
                        int H;
                        final /* synthetic */ d I;
                        final /* synthetic */ Context J;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                            return (d<j2>)new p<r0, d<? super j2>, Object>() {
                                Object G;
                                int H;
                                final /* synthetic */ d I = this.I;
                                final /* synthetic */ Context J = this.J;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super j2> d) {
                            return ((d$c$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @org.jetbrains.annotations.f
                        public final Object invokeSuspend(@org.jetbrains.annotations.e Object n) {
                            Object h = kotlin.coroutines.intrinsics.b.h();
                            final int h2 = this.H;
                            Label_0045: {
                                if (h2 == 0) {
                                    break Label_0045;
                                }
                                Label_0035: {
                                    if (h2 != 1) {
                                        break Label_0035;
                                    }
                                    h = this.G;
                                    while (true) {
                                        try {
                                            c1.n(n);
                                            n = h;
                                            // iftrue(Label_0070:, n != null)
                                            // iftrue(Label_0091:, n.hasAnyRight(new Right[] { Right.READ_OFFICE_HOUR }))
                                            // iftrue(Label_0117:, !new org.joda.time.c(n.getOfficeHourTimestamp()).T0(23).g())
                                            while (true) {
                                                ((Profile)n).setOfficeHourTimestamp(((org.joda.time.base.g)com.untis.mobile.utils.v.a.e()).n());
                                                d.e(this.I).d((Profile)n);
                                                return j2.a;
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                c1.n(n);
                                                n = d.e(this.I).n();
                                                return j2.a;
                                                timber.log.b.e("could not fetch contact hours", new Object[0]);
                                                continue;
                                                Label_0070: {
                                                    return j2.a;
                                                }
                                                Label_0091:
                                                return j2.a;
                                                Label_0117:
                                                final com.untis.mobile.dashboard.service.b b = new com.untis.mobile.dashboard.service.b(this.J, ((Profile)n).getUniqueId());
                                                try {
                                                    final org.joda.time.t g = com.untis.mobile.utils.v.a.g();
                                                    this.G = n;
                                                    this.H = 1;
                                                    if (b.b(g, -1L, this) == h) {
                                                        return h;
                                                    }
                                                    continue;
                                                }
                                                catch (Exception ex) {}
                                                break;
                                            }
                                            continue;
                                        }
                                        catch (Exception ex2) {
                                            n = h;
                                            continue;
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    };
                    this.G = 1;
                    if (kotlinx.coroutines.h.i((g)c, (p)p, (d)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final k2 l(@e final Context context, @e final CoroutineExceptionHandler coroutineExceptionHandler) {
        kotlin.jvm.internal.k0.p(context, "context");
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (g)coroutineExceptionHandler, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ d H;
            final /* synthetic */ Context I;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                return (d<j2>)new p<r0, d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ d H = this.H;
                    final /* synthetic */ Context I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super j2> d) {
                return ((d$d)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final m0 c = i1.c();
                    final p<r0, d<? super j2>, Object> p = new p<r0, d<? super j2>, Object>() {
                        Object G;
                        boolean H;
                        boolean I;
                        int J;
                        int K;
                        final /* synthetic */ d L;
                        final /* synthetic */ Context M;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                            return (d<j2>)new p<r0, d<? super j2>, Object>() {
                                Object G;
                                boolean H;
                                boolean I;
                                int J;
                                int K;
                                final /* synthetic */ d L = this.L;
                                final /* synthetic */ Context M = this.M;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super j2> d) {
                            return ((d$d$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @org.jetbrains.annotations.f
                        public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                            final Object h = kotlin.coroutines.intrinsics.b.h();
                            final int k = this.K;
                            int j = 0;
                            boolean i = false;
                            boolean h2 = false;
                            Profile n = null;
                            Label_0258: {
                                boolean b;
                                boolean b2;
                                if (k != 0) {
                                    if (k != 1) {
                                        if (k == 2) {
                                            j = this.J;
                                            i = this.I;
                                            h2 = this.H;
                                            n = (Profile)this.G;
                                            c1.n(o);
                                            break Label_0258;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    else {
                                        b = this.I;
                                        b2 = this.H;
                                        n = (Profile)this.G;
                                        c1.n(o);
                                    }
                                }
                                else {
                                    c1.n(o);
                                    n = d.e(this.L).n();
                                    if (n == null) {
                                        return j2.a;
                                    }
                                    b2 = this.L.j(n);
                                    b = n.hasAnyRight(Right.MESSAGES);
                                    final d l = this.L;
                                    this.G = n;
                                    this.H = b2;
                                    this.I = b;
                                    this.K = 1;
                                    o = l.h(b, this);
                                    if (o == h) {
                                        return h;
                                    }
                                }
                                j = ((Number)o).intValue();
                                final d m = this.L;
                                this.G = n;
                                this.H = b2;
                                this.I = b;
                                this.J = j;
                                this.K = 2;
                                o = m.i(this);
                                if (o == h) {
                                    return h;
                                }
                                final boolean b3 = b2;
                                i = b;
                                h2 = b3;
                            }
                            d.c(this.L).n((Object)new c(n, h2, i, j, ((Number)o).intValue()));
                            if (g0.a(this.M)) {
                                d.a(this.L).c(com.untis.mobile.analytics.base.c.e.H);
                            }
                            else {
                                d.a(this.L).d(com.untis.mobile.analytics.base.c.e.H, androidx.core.os.b.a(new s0[] { n1.a(com.untis.mobile.analytics.base.c.b.H.d(), kotlin.coroutines.jvm.internal.b.a(true)) }));
                            }
                            return j2.a;
                        }
                    };
                    this.G = 1;
                    if (kotlinx.coroutines.h.i((g)c, (p)p, (d)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final k2 m(@e final CoroutineExceptionHandler coroutineExceptionHandler) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (g)coroutineExceptionHandler, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ d H;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                return (d<j2>)new p<r0, d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ d H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super j2> d) {
                return ((d$e)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final m0 c = i1.c();
                    final p<r0, d<? super j2>, Object> p = new p<r0, d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ d H;
                        
                        private static final void q(final com.untis.mobile.services.messages.e e, final List list) {
                            kotlin.jvm.internal.k0.o(list, "messages");
                            final Iterator<MessageOfDay> iterator = list.iterator();
                            while (iterator.hasNext()) {
                                e.m(iterator.next());
                            }
                        }
                        
                        private static final void s(final Throwable t) {
                            timber.log.b.g(t, "could not loading messages of day", new Object[0]);
                        }
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                            return (d<j2>)new p<r0, d<? super j2>, Object>() {
                                int G;
                                final /* synthetic */ d H = this.H;
                                
                                private static final void q(final com.untis.mobile.services.messages.e e, final List list) {
                                    kotlin.jvm.internal.k0.o(list, "messages");
                                    final Iterator<MessageOfDay> iterator = list.iterator();
                                    while (iterator.hasNext()) {
                                        e.m(iterator.next());
                                    }
                                }
                                
                                private static final void s(final Throwable t) {
                                    timber.log.b.g(t, "could not loading messages of day", new Object[0]);
                                }
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super j2> d) {
                            return ((d$e$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @org.jetbrains.annotations.f
                        public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                            kotlin.coroutines.intrinsics.b.h();
                            if (this.G != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1.n(o);
                            final Profile n = d.e(this.H).n();
                            if (n == null) {
                                return j2.a;
                            }
                            final com.untis.mobile.services.messages.e e = new com.untis.mobile.services.messages.e(n.getUniqueId());
                            e.k().C5((rx.functions.b)new com.untis.mobile.ui.core.e(e), (rx.functions.b)com.untis.mobile.ui.core.f.G);
                            return j2.a;
                        }
                    };
                    this.G = 1;
                    if (kotlinx.coroutines.h.i((g)c, (p)p, (d)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final k2 n(@e final Context context, @e final CoroutineExceptionHandler coroutineExceptionHandler) {
        kotlin.jvm.internal.k0.p(context, "context");
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (g)coroutineExceptionHandler, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ d H;
            final /* synthetic */ Context I;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                return (d<j2>)new p<r0, d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ d H = this.H;
                    final /* synthetic */ Context I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super j2> d) {
                return ((d$f)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final m0 c = i1.c();
                    final p<r0, d<? super j2>, Object> p = new p<r0, d<? super j2>, Object>() {
                        Object G;
                        int H;
                        final /* synthetic */ d I;
                        final /* synthetic */ Context J;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                            return (d<j2>)new p<r0, d<? super j2>, Object>() {
                                Object G;
                                int H;
                                final /* synthetic */ d I = this.I;
                                final /* synthetic */ Context J = this.J;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super j2> d) {
                            return ((d$f$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @org.jetbrains.annotations.f
                        public final Object invokeSuspend(@org.jetbrains.annotations.e Object n) {
                            Object h = kotlin.coroutines.intrinsics.b.h();
                            final int h2 = this.H;
                            Label_0045: {
                                if (h2 == 0) {
                                    break Label_0045;
                                }
                                Label_0035: {
                                    if (h2 != 1) {
                                        break Label_0035;
                                    }
                                    h = this.G;
                                    while (true) {
                                        try {
                                            c1.n(n);
                                            n = h;
                                            // iftrue(Label_0070:, n != null)
                                            while (true) {
                                                ((Profile)n).setParentDayTimestamp(((org.joda.time.base.g)com.untis.mobile.utils.v.a.e()).n());
                                                d.e(this.I).d((Profile)n);
                                                return j2.a;
                                                c1.n(n);
                                                n = d.e(this.I).n();
                                                return j2.a;
                                                timber.log.b.e("could not fetch parent day", new Object[0]);
                                                continue;
                                                final com.untis.mobile.dashboard.service.b b;
                                                Label_0117: {
                                                    b = new com.untis.mobile.dashboard.service.b(this.J, ((Profile)n).getUniqueId());
                                                }
                                                try {
                                                    this.G = n;
                                                    this.H = 1;
                                                    if (b.a(this) == h) {
                                                        return h;
                                                    }
                                                    continue;
                                                }
                                                catch (Exception ex) {}
                                                break;
                                            }
                                            continue;
                                            Label_0070: {
                                                return j2.a;
                                            }
                                            // iftrue(Label_0091:, n.hasAnyRight(new Right[] { Right.READ_PARENTSDAY }))
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            Label_0091: {
                                                return j2.a;
                                            }
                                        }
                                        // iftrue(Label_0117:, !new org.joda.time.c(n.getParentDayTimestamp()).T0(23).g())
                                        catch (Exception ex2) {
                                            n = h;
                                            continue;
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    };
                    this.G = 1;
                    if (kotlinx.coroutines.h.i((g)c, (p)p, (d)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final k2 o(@e final Context context, @e final CoroutineExceptionHandler coroutineExceptionHandler) {
        kotlin.jvm.internal.k0.p(context, "context");
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (g)coroutineExceptionHandler, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ Context H;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                return (d<j2>)new p<r0, d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ Context H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super j2> d) {
                return ((d$g)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final m0 c = i1.c();
                    final p<r0, d<? super j2>, Object> p = new p<r0, d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ Context H;
                        
                        private static final void p(final Context context, final com.untis.mobile.services.billing.b b) {
                            com.untis.mobile.utils.extension.n.c(b, context);
                        }
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                            return (d<j2>)new p<r0, d<? super j2>, Object>() {
                                int G;
                                final /* synthetic */ Context H = this.H;
                                
                                private static final void p(final Context context, final com.untis.mobile.services.billing.b b) {
                                    com.untis.mobile.utils.extension.n.c(b, context);
                                }
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super j2> d) {
                            return ((d$g$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @org.jetbrains.annotations.f
                        public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                            kotlin.coroutines.intrinsics.b.h();
                            if (this.G != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1.n(o);
                            final Context h = this.H;
                            Activity activity;
                            if (h instanceof Activity) {
                                activity = (Activity)h;
                            }
                            else {
                                activity = null;
                            }
                            if (activity == null) {
                                return j2.a;
                            }
                            new i(activity, (i.b)new com.untis.mobile.ui.core.g(this.H));
                            return j2.a;
                        }
                    };
                    this.G = 1;
                    if (kotlinx.coroutines.h.i((g)c, (p)p, (d)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    public final boolean p() {
        final long n = ((org.joda.time.base.g)com.untis.mobile.utils.v.a.e()).n();
        if (this.g + 3000L > n) {
            return true;
        }
        this.g = n;
        return false;
    }
    
    public final void q(@org.jetbrains.annotations.f final String s, @org.jetbrains.annotations.f final EntityType entityType, @org.jetbrains.annotations.f final Long n) throws IllegalStateException {
        this.r(s);
        this.s(entityType, n);
    }
    
    public final void t() {
    }
    
    @e
    public final k2 u(@e final Context context) {
        kotlin.jvm.internal.k0.p(context, "context");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (g)i1.c(), (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ Context H;
            final /* synthetic */ d I;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                return (d<j2>)new p<r0, d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ Context H = this.H;
                    final /* synthetic */ d I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super j2> d) {
                return ((d$j)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    com.untis.mobile.services.widget.c.G.b(this.H);
                    d.b(this.I).c();
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, 2, (Object)null);
    }
    
    public final void v() {
        final c c = (c)((LiveData)this.f).f();
        if (c == null) {
            return;
        }
        if (c.j() <= 0) {
            return;
        }
        this.f.n((Object)com.untis.mobile.ui.core.c.g(c, null, false, false, c.j() - 1, 0, 23, null));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "com/untis/mobile/ui/core/d$a", "", "", "BACK_PRESSED_THRESHOLD", "J", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
