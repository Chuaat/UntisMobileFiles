// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.parentday;

import io.realm.f0;
import org.koin.core.c$a;
import java.util.concurrent.Callable;
import com.untis.mobile.utils.g0;
import io.realm.q;
import kotlin.collections.v;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import com.untis.mobile.api.common.masterdata.UMStudent;
import java.util.Collection;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.b2;
import rx.functions.p;
import rx.g;
import java.io.Closeable;
import kotlin.j2;
import java.util.Iterator;
import com.untis.mobile.utils.mapper.realmToModel.u;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.parentday.ParentDay;
import com.untis.mobile.api.common.parentsday.UMPDayAppointment;
import java.util.Map;
import com.untis.mobile.api.common.parentsday.UMPDay;
import java.util.Set;
import java.util.List;
import com.untis.mobile.api.dto.parentsday.GetPDayAppointmentsResponse;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import com.untis.mobile.api.ApiService;
import kotlin.jvm.internal.k0;
import kotlin.b0;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import org.koin.core.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b(\u0010)J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\u000fH\u0002J)\u0010\u0015\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010'\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&¨\u0006*" }, d2 = { "Lcom/untis/mobile/services/parentday/d;", "Lcom/untis/mobile/services/parentday/a;", "Lorg/koin/core/c;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lrx/g;", "", "Lcom/untis/mobile/persistence/models/parentday/ParentDay;", "h", "parentDays", "Lkotlin/j2;", "l", "", "Lcom/untis/mobile/api/common/parentsday/UMPDay;", "referencedPDays", "", "", "Lcom/untis/mobile/api/common/parentsday/UMPDayAppointment;", "appointments", "e", "id", "k", "(Ljava/util/Set;Ljava/lang/Long;)Lcom/untis/mobile/api/common/parentsday/UMPDay;", "a", "b", "Landroid/content/Context;", "G", "Landroid/content/Context;", "context", "Lcom/untis/mobile/persistence/realm/d;", "I", "Lkotlin/b0;", "j", "()Lcom/untis/mobile/persistence/realm/d;", "realmService", "Lcom/untis/mobile/api/ApiService;", "H", "f", "()Lcom/untis/mobile/api/ApiService;", "apiService", "<init>", "(Landroid/content/Context;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d implements a, c
{
    @e
    private final Context G;
    @e
    private final b0 H;
    @e
    private final b0 I;
    
    public d(@e final Context g) {
        k0.p(g, "context");
        this.G = g;
        this.H = d0.c((n6.a<?>)new n6.a<ApiService>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final ApiService invoke() {
                return (ApiService)this.G.t(k1.d(ApiService.class), null, null);
            }
        });
        this.I = d0.c((n6.a<?>)new n6.a<com.untis.mobile.persistence.realm.d>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.persistence.realm.d invoke() {
                return (com.untis.mobile.persistence.realm.d)this.G.t(k1.d(com.untis.mobile.persistence.realm.d.class), null, null);
            }
        });
    }
    
    private final List<ParentDay> e(final Set<? extends UMPDay> set, final Map<Long, ? extends List<? extends UMPDayAppointment>> map) {
        final ArrayList<ParentDay> list = new ArrayList<ParentDay>();
        final u a = u.a;
        for (final Map.Entry<Long, ? extends List<? extends UMPDayAppointment>> entry : map.entrySet()) {
            final long longValue = entry.getKey().longValue();
            final List list2 = (List)entry.getValue();
            final UMPDay k = this.k(set, longValue);
            if (k == null) {
                continue;
            }
            list.add(a.a(k, list2));
        }
        return list;
    }
    
    private final ApiService f() {
        return this.H.getValue();
    }
    
    private static final List g(d a, final Profile profile) {
        k0.p(a, "this$0");
        k0.p(profile, "$profile");
        final ArrayList<ParentDay> list = new ArrayList<ParentDay>();
        final u a2 = u.a;
        a = (d)a.j().a(profile);
        try {
            for (final u4.a a3 : ((f0)a).f3(u4.a.class).b0()) {
                k0.o(a3, "realmParentDay");
                list.add(a2.b(a3));
            }
            final j2 a4 = j2.a;
            kotlin.io.c.a((Closeable)a, null);
            return list;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                kotlin.io.c.a((Closeable)a, t);
            }
        }
    }
    
    private final g<List<ParentDay>> h(final Profile profile) {
        final g q3 = this.f().getPDayAppointments(profile).Q3(rx.schedulers.c.e()).k3((p)new com.untis.mobile.services.parentday.c(this, profile, profile.getMasterDataService())).Q3(rx.android.schedulers.a.c());
        k0.o(q3, "apiService\n                .getPDayAppointments(profile)\n                .observeOn(Schedulers.io())\n                .map { response ->\n                    val parentDays = ArrayList<ParentDay>()\n\n                    if (response == null) {\n                        return@map parentDays\n                    }\n\n                    if (response.referencedStudents != null) {\n                        GlobalScope.launch {\n                            masterDataService.save(response.referencedStudents, false)\n                        }\n                    }\n\n                    if (response.appointments != null && response.referencedPDays != null) {\n                        parentDays.addAll(createParentDaysFrom(response.referencedPDays, response.appointments))\n                    }\n\n                    persistParentDays(profile, parentDays)\n\n                    return@map parentDays.toList()\n                }\n                .observeOn(AndroidSchedulers.mainThread())");
        return (g<List<ParentDay>>)q3;
    }
    
    private static final List i(final d d, final Profile profile, final com.untis.mobile.services.masterdata.a a, final GetPDayAppointmentsResponse getPDayAppointmentsResponse) {
        k0.p(d, "this$0");
        k0.p(profile, "$profile");
        k0.p(a, "$masterDataService");
        final ArrayList<ParentDay> list = new ArrayList<ParentDay>();
        if (getPDayAppointmentsResponse == null) {
            return list;
        }
        if (getPDayAppointmentsResponse.referencedStudents != null) {
            h.f((r0)b2.G, (kotlin.coroutines.g)null, (u0)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                int G;
                final /* synthetic */ com.untis.mobile.services.masterdata.a H;
                final /* synthetic */ GetPDayAppointmentsResponse I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ com.untis.mobile.services.masterdata.a H = this.H;
                        final /* synthetic */ GetPDayAppointmentsResponse I = this.I;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((d$a)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(o);
                    }
                    else {
                        c1.n(o);
                        final com.untis.mobile.services.masterdata.a h2 = this.H;
                        final Set<UMStudent> referencedStudents = this.I.referencedStudents;
                        k0.o(referencedStudents, "response.referencedStudents");
                        this.G = 1;
                        if (h2.o(referencedStudents, false, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 3, (Object)null);
        }
        if (getPDayAppointmentsResponse.appointments != null) {
            final Set<UMPDay> referencedPDays = getPDayAppointmentsResponse.referencedPDays;
            if (referencedPDays != null) {
                k0.o(referencedPDays, "response.referencedPDays");
                final Map<Long, List<UMPDayAppointment>> appointments = getPDayAppointmentsResponse.appointments;
                k0.o(appointments, "response.appointments");
                list.addAll(d.e(referencedPDays, appointments));
            }
        }
        d.l(profile, list);
        return v.I5((Iterable<?>)list);
    }
    
    private final com.untis.mobile.persistence.realm.d j() {
        return this.I.getValue();
    }
    
    private final UMPDay k(final Set<? extends UMPDay> set, final Long n) {
        for (final UMPDay umpDay : set) {
            final long id = umpDay.id;
            if (n == null) {
                continue;
            }
            if (id == n) {
                return umpDay;
            }
        }
        return null;
    }
    
    private final void l(Profile a, final List<ParentDay> list) {
        a = (Profile)this.j().a(a);
        try {
            ((f0)a).beginTransaction();
            ((f0)a).f3(u4.a.class).b0().T3();
            ((f0)a).f3(u4.b.class).b0().T3();
            ((f0)a).f3(u4.c.class).b0().T3();
            final u a2 = u.a;
            final Iterator<ParentDay> iterator = list.iterator();
            while (iterator.hasNext()) {
                ((f0)a).G0(a2.d(iterator.next()), new q[0]);
            }
            ((f0)a).n();
            final j2 a3 = j2.a;
            kotlin.io.c.a((Closeable)a, null);
        }
        finally {
            try {}
            finally {
                final Throwable t;
                kotlin.io.c.a((Closeable)a, t);
            }
        }
    }
    
    @e
    @Override
    public g<List<ParentDay>> a(@e final Profile profile) {
        k0.p(profile, "profile");
        g<List<ParentDay>> g;
        if (!g0.a(this.G)) {
            g = this.b(profile);
        }
        else {
            g = this.h(profile);
        }
        return g;
    }
    
    @e
    @Override
    public g<List<ParentDay>> b(@e final Profile profile) {
        k0.p(profile, "profile");
        final g q3 = g.H2((Callable)new com.untis.mobile.services.parentday.b(this, profile)).E5(rx.schedulers.c.e()).Q3(rx.android.schedulers.a.c());
        k0.o(q3, "fromCallable<List<ParentDay>> {\n                    val parentDays = ArrayList<ParentDay>()\n                    val mapper = ParentDayMapper\n\n                    realmService.getRealm(profile)\n                            .use { realm ->\n                                for (realmParentDay in realm.where(RealmParentDay::class.java).findAll()) {\n                                    parentDays.add(mapper.toParentDay(realmParentDay))\n                                }\n                            }\n\n                    parentDays\n                }\n                .subscribeOn(Schedulers.io())\n                .observeOn(AndroidSchedulers.mainThread())");
        return (g<List<ParentDay>>)q3;
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
}
