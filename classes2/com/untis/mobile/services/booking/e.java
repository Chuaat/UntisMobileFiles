// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.booking;

import org.koin.core.c$a;
import com.untis.mobile.api.error.JsonRpcError;
import com.untis.mobile.api.common.JsonRpcErrorType;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import com.untis.mobile.api.enumeration.ElementType;
import kotlin.jvm.internal.w;
import org.joda.time.t;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.persistence.models.masterdata.Room;
import java.util.Iterator;
import com.untis.mobile.utils.mapper.realmToModel.x;
import com.untis.mobile.api.common.error.UMError;
import com.untis.mobile.persistence.models.booking.ValidationError;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import com.untis.mobile.api.common.timetable.UMPeriodElement;
import com.untis.mobile.api.common.timetable.UMPeriod;
import java.util.List;
import com.untis.mobile.api.dto.GetAvailableRoomsResponse;
import com.untis.mobile.persistence.models.booking.RoomChangeData;
import com.untis.mobile.api.dto.GetRoomChangeDataResponse;
import com.untis.mobile.persistence.models.booking.RoomChangeSuccessData;
import com.untis.mobile.api.dto.SubmitRoomChangeResponse;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.services.timetable.placeholder.p;
import com.untis.mobile.services.masterdata.b;
import com.untis.mobile.api.ApiService;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.k0;
import com.untis.mobile.services.timetable.placeholder.k;
import kotlin.b0;
import kotlin.Metadata;
import org.koin.core.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u00100\u001a\u00020-¢\u0006\u0004\b1\u00102J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0016R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010#\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010,\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063" }, d2 = { "Lcom/untis/mobile/services/booking/e;", "Lcom/untis/mobile/services/booking/a;", "Lorg/koin/core/c;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "m", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "", "Lcom/untis/mobile/api/common/timetable/UMPeriodElement;", "elements", "Lkotlin/j2;", "n", "Lorg/joda/time/c;", "start", "end", "Lrx/g;", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "c", "", "periodId", "Lcom/untis/mobile/persistence/models/booking/RoomChangeData;", "b", "newRoom", "originalRoom", "Lcom/untis/mobile/persistence/models/booking/RoomChangeSuccessData;", "a", "Lcom/untis/mobile/services/masterdata/a;", "J", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/persistence/dao/profile/a;", "H", "Lkotlin/b0;", "l", "()Lcom/untis/mobile/persistence/dao/profile/a;", "profileDao", "Lcom/untis/mobile/services/timetable/placeholder/k;", "K", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timetableService", "Lcom/untis/mobile/api/ApiService;", "I", "i", "()Lcom/untis/mobile/api/ApiService;", "apiService", "", "G", "Ljava/lang/String;", "profileId", "<init>", "(Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e implements a, c
{
    @org.jetbrains.annotations.e
    private final String G;
    @org.jetbrains.annotations.e
    private final b0 H;
    @org.jetbrains.annotations.e
    private final b0 I;
    @org.jetbrains.annotations.e
    private final com.untis.mobile.services.masterdata.a J;
    @org.jetbrains.annotations.e
    private final k K;
    
    public e(@org.jetbrains.annotations.e final String g) {
        k0.p(g, "profileId");
        this.G = g;
        this.H = d0.c((n6.a<?>)new n6.a<com.untis.mobile.persistence.dao.profile.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.persistence.dao.profile.a invoke() {
                return (com.untis.mobile.persistence.dao.profile.a)this.G.t(k1.d(com.untis.mobile.persistence.dao.profile.a.class), null, null);
            }
        });
        this.I = d0.c((n6.a<?>)new n6.a<ApiService>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final ApiService invoke() {
                return (ApiService)this.G.t(k1.d(ApiService.class), null, null);
            }
        });
        this.J = b.Z.a(g);
        this.K = p.Y.a(g);
    }
    
    public static final /* synthetic */ k g(final e e) {
        return e.K;
    }
    
    private static final RoomChangeSuccessData h(final e e, final Period period, final SubmitRoomChangeResponse submitRoomChangeResponse) {
        k0.p(e, "this$0");
        k0.p(period, "$period");
        final RoomChangeSuccessData roomChangeSuccessData = new RoomChangeSuccessData();
        final List<UMError> errors = submitRoomChangeResponse.errors;
        if (errors == null || errors.isEmpty()) {
            final List<UMPeriod> periods = submitRoomChangeResponse.periods;
            if (periods != null) {
                k0.o(periods, "response.periods");
                if (periods.isEmpty() ^ true) {
                    final List<UMPeriodElement> elements = submitRoomChangeResponse.periods.get(0).elements;
                    k0.o(elements, "response.periods[0].elements");
                    e.n(period, elements);
                    h.h((g)null, (n6.p)new n6.p<r0, d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ e H;
                        final /* synthetic */ Period I;
                        
                        @e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                int G;
                                final /* synthetic */ e H = this.H;
                                final /* synthetic */ Period I = this.I;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                            return ((e$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @org.jetbrains.annotations.f
                        public final Object invokeSuspend(@e final Object o) {
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
                                final k g2 = e.g(this.H);
                                final Period i = this.I;
                                this.G = 1;
                                if (g2.q(i, this) == h) {
                                    return h;
                                }
                            }
                            return j2.a;
                        }
                    }, 1, (Object)null);
                }
            }
        }
        final List<UMError> errors2 = submitRoomChangeResponse.errors;
        if (errors2 != null) {
            k0.o(errors2, "response.errors");
            final ArrayList validationErrors = new ArrayList<ValidationError>(v.Y((Iterable<?>)errors2, 10));
            final Iterator<Object> iterator = errors2.iterator();
            while (iterator.hasNext()) {
                validationErrors.add(com.untis.mobile.utils.mapper.api.c.j().i(iterator.next()));
            }
            roomChangeSuccessData.setValidationErrors((List<ValidationError>)validationErrors);
        }
        final List<UMPeriod> periods2 = submitRoomChangeResponse.periods;
        if (periods2 != null) {
            k0.o(periods2, "response.periods");
            final ArrayList periods3 = new ArrayList<Period>(v.Y((Iterable<?>)periods2, 10));
            for (final UMPeriod umPeriod : periods2) {
                final x a = x.a;
                k0.o(umPeriod, "it");
                periods3.add(a.e(umPeriod));
            }
            roomChangeSuccessData.setPeriods((List<Period>)periods3);
        }
        return roomChangeSuccessData;
    }
    
    private final ApiService i() {
        return this.I.getValue();
    }
    
    private static final List j(final e e, final GetAvailableRoomsResponse getAvailableRoomsResponse) {
        k0.p(e, "this$0");
        final List<Long> roomIds = getAvailableRoomsResponse.roomIds;
        k0.o(roomIds, "response.roomIds");
        final ArrayList<Room> list = new ArrayList<Room>();
        for (final Long n : roomIds) {
            final com.untis.mobile.services.masterdata.a j = e.J;
            k0.o(n, "it");
            final Room p2 = j.P(n);
            if (p2 != null) {
                list.add(p2);
            }
        }
        return list;
    }
    
    private static final RoomChangeData k(final e e, final GetRoomChangeDataResponse getRoomChangeDataResponse) {
        k0.p(e, "this$0");
        if (getRoomChangeDataResponse == null) {
            return new RoomChangeData();
        }
        final RoomChangeData roomChangeData = new RoomChangeData();
        final List<UMError> errors = getRoomChangeDataResponse.errors;
        if (errors != null) {
            k0.o(errors, "response.errors");
            final ArrayList<ValidationError> validationErrors = new ArrayList<ValidationError>();
            final Iterator<Object> iterator = errors.iterator();
            while (iterator.hasNext()) {
                final ValidationError i = com.untis.mobile.utils.mapper.api.c.j().i(iterator.next());
                if (i != null) {
                    validationErrors.add(i);
                }
            }
            roomChangeData.setValidationErrors(validationErrors);
        }
        final List<Long> availableRoomIds = getRoomChangeDataResponse.availableRoomIds;
        if (availableRoomIds != null) {
            k0.o(availableRoomIds, "response.availableRoomIds");
            final ArrayList<Room> availableRooms = new ArrayList<Room>();
            for (final Long n : availableRoomIds) {
                final com.untis.mobile.services.masterdata.a j = e.J;
                k0.o(n, "it");
                final Room p2 = j.P(n);
                if (p2 != null) {
                    availableRooms.add(p2);
                }
            }
            roomChangeData.setAvailableRooms(availableRooms);
        }
        return roomChangeData;
    }
    
    private final com.untis.mobile.persistence.dao.profile.a l() {
        return this.H.getValue();
    }
    
    private final Profile m() {
        Profile g;
        if ((g = this.l().g(this.G)) == null) {
            g = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
        }
        return g;
    }
    
    private final void n(final Period period, final List<? extends UMPeriodElement> list) {
        final ArrayList<UMPeriodElement> list2 = new ArrayList<UMPeriodElement>();
        for (final UMPeriodElement next : list) {
            if (next.type == ElementType.ROOM) {
                list2.add(next);
            }
        }
        final ArrayList rooms = new ArrayList<PeriodElement>(v.Y((Iterable<?>)list2, 10));
        for (final UMPeriodElement umPeriodElement : list2) {
            rooms.add(new PeriodElement(EntityType.ROOM, umPeriodElement.orgId, umPeriodElement.id));
        }
        period.setRooms((List<PeriodElement>)rooms);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public rx.g<RoomChangeSuccessData> a(long id, @org.jetbrains.annotations.f final Room room, @org.jetbrains.annotations.f final Room room2) {
        final Period l = this.K.l(id);
        rx.g g;
        String s;
        if (l == null) {
            g = rx.g.b2((Throwable)new JsonRpcError(JsonRpcErrorType.NoPeriod));
            s = "error(JsonRpcError(JsonRpcErrorType.NoPeriod))";
        }
        else {
            final Set<Object> m5 = v.M5((Iterable<?>)l.getBlockIds());
            m5.add(id);
            final ApiService i = this.i();
            final Profile j = this.m();
            long id2 = 0L;
            if (room2 == null) {
                id = 0L;
            }
            else {
                id = room2.getId();
            }
            if (room != null) {
                id2 = room.getId();
            }
            g = i.submitRoomChange(j, (Set<Long>)m5, id, id2).k3((rx.functions.p)new com.untis.mobile.services.booking.d(this, l));
            s = "apiService\n                .submitRoomChange(profile(), blockIds, originalRoom?.id ?: 0L, newRoom?.id\n                        ?: 0L)\n                .map { response ->\n                    val roomChangeSuccessData = RoomChangeSuccessData()\n\n                    if ((response.errors == null || response.errors.isEmpty()) && response.periods != null && response.periods.isNotEmpty()) {\n                        updatePeriodWithNewRooms(period, response.periods[0].elements)\n                        runBlocking {\n                            timetableService.save(period)\n                        }\n                    }\n\n                    if (response.errors != null) {\n                        roomChangeSuccessData.validationErrors = response.errors.map { UmErrorToValidationErrorMapper.umErrorToValidationError().map(it) }\n                    }\n\n                    if (response.periods != null) {\n                        roomChangeSuccessData.periods = response.periods.map { PeriodMapper.toPeriod(it) }\n                    }\n\n                    roomChangeSuccessData\n                }";
        }
        k0.o(g, s);
        return (rx.g<RoomChangeSuccessData>)g;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public rx.g<RoomChangeData> b(final long l) {
        final Period i = this.K.l(l);
        rx.g g;
        String s;
        if (i == null) {
            g = rx.g.b2((Throwable)new JsonRpcError(JsonRpcErrorType.NoPeriod));
            s = "error(JsonRpcError(JsonRpcErrorType.NoPeriod))";
        }
        else {
            final Set<Object> m5 = v.M5((Iterable<?>)i.getBlockIds());
            m5.add(l);
            g = this.i().getRoomChangeData(this.m(), (Set<Long>)m5).k3((rx.functions.p)new com.untis.mobile.services.booking.c(this));
            s = "apiService\n                .getRoomChangeData(profile(), blockIds)\n//                .onErrorResumeNext({ throwable ->\n//                    Log.e(Constant.LOG, \"error\", throwable)\n//                    val cause = throwable.cause\n//                    if (cause != null && cause is JsonRpcError && cause.isAnyOf(JsonRpcErrorType.NoRight)) {\n//                        return@onErrorResumeNext Observable\n//                                .just(null)\n//                    }\n//\n//                    throw throwable\n//                })\n                .map { response ->\n                    if (response == null) {\n                        return@map RoomChangeData()\n                    }\n\n                    val roomChangeData = RoomChangeData()\n\n                    if (response.errors != null) {\n                        roomChangeData.validationErrors = response.errors.mapNotNull { UmErrorToValidationErrorMapper.umErrorToValidationError().map(it) }\n                    }\n\n                    if (response.availableRoomIds != null) {\n                        roomChangeData.availableRooms = response.availableRoomIds.mapNotNull { masterDataService.room(it) }\n                    }\n\n                    roomChangeData\n                }";
        }
        k0.o(g, s);
        return (rx.g<RoomChangeData>)g;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public rx.g<List<Room>> c(@org.jetbrains.annotations.e final org.joda.time.c c, @org.jetbrains.annotations.e final org.joda.time.c c2) {
        k0.p(c, "start");
        k0.p(c2, "end");
        final rx.g k3 = this.i().getAvailableRooms(this.m(), c, c2).k3((rx.functions.p)new com.untis.mobile.services.booking.b(this));
        k0.o(k3, "apiService\n                .getAvailableRooms(profile(), start, end)\n                .map { response ->\n                    response.roomIds.mapNotNull { masterDataService.room(it) }\n                }");
        return (rx.g<List<Room>>)k3;
    }
    
    @org.jetbrains.annotations.e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
}
