// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network;

import com.google.gson.Gson;
import com.untis.mobile.services.profile.legacy.j0;
import com.untis.mobile.injection.component.b;
import retrofit2.f$a;
import retrofit2.u$b;
import com.google.gson.GsonBuilder;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.profile.Profile;
import android.content.Context;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomResponse;
import com.untis.mobile.calendar.network.model.period.CalendarPeriodDetailResponse;
import p7.n;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import com.untis.mobile.calendar.network.model.period.update.CalendarPeriodUpdate;
import com.untis.mobile.calendar.network.model.CalendarTeachingContentsResponse;
import kotlin.coroutines.d;
import org.jetbrains.annotations.f;
import p7.t;
import p7.s;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bJ\u001d\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\tH§@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\tH§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0018H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d" }, d2 = { "Lcom/untis/mobile/calendar/network/a;", "", "", "id", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "e", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "entityTypeId", "entityId", "", "startIso", "endIso", "Lcom/untis/mobile/calendar/network/model/period/CalendarPeriodDetailResponse;", "c", "(JJLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "start", "end", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomResponse;", "d", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdate;", "body", "b", "(JLcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodUpdate;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "count", "Lcom/untis/mobile/calendar/network/model/CalendarTeachingContentsResponse;", "a", "(JLjava/lang/Integer;Lkotlin/coroutines/d;)Ljava/lang/Object;", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    @e
    public static final a a = com.untis.mobile.calendar.network.a.a.a;
    
    @p7.f("view/calendar-entry/{id}/recent-teaching-contents")
    @f
    Object a(@s("id") final long p0, @t("cnt") @f final Integer p1, @e final d<? super CalendarTeachingContentsResponse> p2);
    
    @n("view/v1/calendar-entry/{id}/block")
    @f
    Object b(@s("id") final long p0, @a @e final CalendarPeriodUpdate p1, @e final d<? super CalendarPeriod> p2);
    
    @p7.f("view/v1/calendar-entry/detail")
    @f
    Object c(@t("elementType") final long p0, @t("elementId") final long p1, @t("startDateTime") @e final String p2, @t("endDateTime") @e final String p3, @e final d<? super CalendarPeriodDetailResponse> p4);
    
    @p7.f("view/v1/calendar-entry/rooms/form")
    @f
    Object d(@t("startDateTime") @e final String p0, @t("endDateTime") @e final String p1, @e final d<? super CalendarPeriodRoomResponse> p2);
    
    @p7.f("view/v1/calendar-entry/{id}/detail")
    @f
    Object e(@s("id") final long p0, @e final d<? super CalendarPeriod> p1);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n" }, d2 = { "com/untis/mobile/calendar/network/a$a", "", "Landroid/content/Context;", "context", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/calendar/network/a;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        static final /* synthetic */ a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
        
        @e
        public final com.untis.mobile.calendar.network.a a(@e final Context context, @e final Profile profile) {
            k0.p(context, "context");
            k0.p(profile, "profile");
            final Gson create = new GsonBuilder().create();
            final u$b b = new u$b().c(Profile.getWuRestApiUrl$default(profile, null, 1, null)).b((f$a)retrofit2.converter.gson.a.g(create));
            final com.untis.mobile.injection.component.b a = com.untis.mobile.injection.component.b.a;
            k0.o(create, "gson");
            final Object g = b.j(a.e(context, profile, create, j0.G)).f().g((Class)com.untis.mobile.calendar.network.a.class);
            k0.o(g, "Builder()\n                .baseUrl(profile.getWuRestApiUrl())\n                .addConverterFactory(GsonConverterFactory.create(gson))\n                .client(\n                    OkHttpClientComponent.createCalendarApiClient(\n                        context,\n                        profile,\n                        gson,\n                        UmProfileService\n                    )\n                )\n                .build()\n                .create(CalendarApi::class.java)");
            return (com.untis.mobile.calendar.network.a)g;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class b
    {
    }
}
