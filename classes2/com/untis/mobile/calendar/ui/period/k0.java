// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period;

import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodVideoCall;
import com.untis.mobile.persistence.models.classbook.homework.HomeWorkStatus;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomAvailability;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomDetail;
import java.net.ConnectException;
import kotlin.text.s;
import org.joda.time.n0;
import org.joda.time.t;
import kotlinx.coroutines.i1;
import androidx.lifecycle.LiveData;
import java.util.Set;
import org.joda.time.l0;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import android.util.Log;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.u0;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import kotlin.jvm.internal.m0;
import n6.l;
import kotlinx.coroutines.h;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import rx.g;
import com.untis.mobile.persistence.models.EntityType;
import java.util.ArrayList;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.b;
import kotlin.j2;
import kotlin.coroutines.d;
import com.untis.mobile.persistence.models.timetable.period.Period;
import java.util.Iterator;
import com.untis.mobile.persistence.models.timetable.period.PeriodRight;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodPermission;
import java.util.Collection;
import kotlin.collections.v;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import org.joda.time.c;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.calendar.network.model.CalendarTeachingContentsResponse;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomDepartment;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomBuilding;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomResponse;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import com.untis.mobile.calendar.network.model.period.CalendarPeriodContext;
import java.util.List;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.calendar.service.a;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u00d2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0011\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001JC\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\nH\u0002J)\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\t\u001a\u00020\u0004H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\nH\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0017J\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001bJ\u0016\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u000eJ\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001bJ\u0014\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e0\u001bJ\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bJ\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u001bJS\u0010-\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b-\u0010.J\u000e\u00100\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u0004J\u001f\u00102\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\b\u00101\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b2\u00103J\u000e\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040\u001bJ\u000e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060\u001bJ\u000e\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u001bJ\u0016\u0010:\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u00101\u001a\u00020\u0004J$\u0010=\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u00101\u001a\u00020\u00042\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\n0;J,\u0010?\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u0010>\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\n0;J\u0010\u0010A\u001a\u00020\"2\b\u0010@\u001a\u0004\u0018\u000106J\u0010\u0010C\u001a\u00020\"2\b\u0010B\u001a\u0004\u0018\u000108J\u0016\u0010F\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u0010E\u001a\u00020DJ\u0016\u0010H\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u0010G\u001a\u00020DJ\u0016\u0010J\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u0010I\u001a\u00020DJ\u0016\u0010M\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u0010L\u001a\u00020KJ$\u0010N\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\n0;J$\u0010O\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\n0;J\u000e\u0010Q\u001a\u00020\"2\u0006\u0010P\u001a\u00020\u0006J!\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u0006\u0010T\u001a\u00020\"J \u0010X\u001a\u00020V2\u0006\u0010U\u001a\u00020)2\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010W\u001a\u00020VJ\u0016\u0010[\u001a\u00020Y2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020YJ\u0016\u0010]\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\\\u001a\u00020YJ\u0006\u0010^\u001a\u00020\"J\b\u0010_\u001a\u00020VH\u0007J\u000e\u0010`\u001a\u00020Y2\u0006\u0010!\u001a\u00020 R\u001e\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001e\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010cR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0016\u0010r\u001a\u00020o8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bp\u0010qR\u001c\u0010u\u001a\b\u0012\u0004\u0012\u00020$0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u001e\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010cR$\u0010y\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e0a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010cR\u001c\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00060a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010cR\u0016\u0010\u007f\u001a\u00020|8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b}\u0010~R\u001a\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010\u0085\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0a8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010cR\u0018\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R \u0010\u008b\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0a8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010cR \u0010\u008d\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060a8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0090\u0001" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/k0;", "Landroidx/lifecycle/w0;", "Lcom/untis/mobile/persistence/models/EntityType;", "timetableEntityType", "", "timetableEntityId", "Lorg/joda/time/c;", "start", "end", "selectedPeriodId", "Lkotlin/j2;", "F", "(Lcom/untis/mobile/persistence/models/EntityType;Ljava/lang/Long;Lorg/joda/time/c;Lorg/joda/time/c;JLkotlin/coroutines/d;)Ljava/lang/Object;", "A0", "", "periodIds", "E", "(Ljava/util/List;JLkotlin/coroutines/d;)Ljava/lang/Object;", "C0", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homework", "m0", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "t0", "d0", "Landroidx/lifecycle/LiveData;", "Lcom/untis/mobile/calendar/network/model/CalendarTeachingContentsResponse;", "l0", "Landroid/content/Context;", "context", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "period", "Lkotlinx/coroutines/k2;", "k0", "Lcom/untis/mobile/calendar/network/model/period/CalendarPeriodContext;", "S", "Z", "Y", "W", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "V", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "errorHandler", "i0", "(Lkotlinx/coroutines/CoroutineExceptionHandler;Lcom/untis/mobile/persistence/models/EntityType;Ljava/lang/Long;Ljava/util/List;JLorg/joda/time/c;Lorg/joda/time/c;)Lkotlinx/coroutines/k2;", "id", "o0", "roomId", "j0", "(Lkotlinx/coroutines/CoroutineExceptionHandler;Ljava/lang/Long;)Lkotlinx/coroutines/k2;", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomResponse;", "c0", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;", "a0", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "b0", "g0", "Lkotlin/Function0;", "onSuccess", "f0", "originalRoomId", "h0", "building", "p0", "department", "q0", "", "notesAll", "w0", "content", "v0", "notesTeacher", "x0", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodVideoCall;", "onlineLesson", "y0", "D", "u0", "date", "r0", "X", "(Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;Lkotlin/coroutines/d;)Ljava/lang/Object;", "B0", "classbook", "", "max", "Q", "", "readOnly", "e0", "checked", "n0", "z0", "T", "C", "Landroidx/lifecycle/k0;", "h", "Landroidx/lifecycle/k0;", "periodLiveData", "k", "periodRoomDepartmentLiveData", "Lcom/untis/mobile/services/masterdata/a;", "f", "Lcom/untis/mobile/services/masterdata/a;", "U", "()Lcom/untis/mobile/services/masterdata/a;", "s0", "(Lcom/untis/mobile/services/masterdata/a;)V", "masterDataService", "Lcom/untis/mobile/services/classbook/a;", "d", "Lcom/untis/mobile/services/classbook/a;", "classBookService", "g", "Ljava/util/List;", "calendarPeriodContext", "i", "periodRoomLiveData", "m", "periodHomeworkLiveData", "n", "periodHomeworkDueDateData", "Lcom/untis/mobile/calendar/service/a;", "c", "Lcom/untis/mobile/calendar/service/a;", "calendarService", "Lcom/untis/mobile/services/timetable/placeholder/k;", "e", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timetableService", "o", "periodClassbookData", "a", "Landroid/content/Context;", "b", "Lcom/untis/mobile/persistence/models/profile/Profile;", "l", "mPreviousLessonContents", "j", "periodRoomBuildingLiveData", "<init>", "(Landroid/content/Context;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class k0 extends w0
{
    @e
    private final Context a;
    private Profile b;
    private a c;
    private com.untis.mobile.services.classbook.a d;
    private k e;
    public com.untis.mobile.services.masterdata.a f;
    @e
    private List<CalendarPeriodContext> g;
    @e
    private final androidx.lifecycle.k0<CalendarPeriod> h;
    @e
    private final androidx.lifecycle.k0<CalendarPeriodRoomResponse> i;
    @e
    private final androidx.lifecycle.k0<CalendarPeriodRoomBuilding> j;
    @e
    private final androidx.lifecycle.k0<CalendarPeriodRoomDepartment> k;
    @e
    private final androidx.lifecycle.k0<CalendarTeachingContentsResponse> l;
    @e
    private final androidx.lifecycle.k0<List<HomeWork>> m;
    @e
    private final androidx.lifecycle.k0<c> n;
    @e
    private final androidx.lifecycle.k0<Classbook> o;
    
    public k0(@e final Context a) {
        kotlin.jvm.internal.k0.p(a, "context");
        this.a = a;
        this.g = v.E();
        this.h = (androidx.lifecycle.k0<CalendarPeriod>)new androidx.lifecycle.k0();
        this.i = (androidx.lifecycle.k0<CalendarPeriodRoomResponse>)new androidx.lifecycle.k0((Object)null);
        this.j = (androidx.lifecycle.k0<CalendarPeriodRoomBuilding>)new androidx.lifecycle.k0((Object)null);
        this.k = (androidx.lifecycle.k0<CalendarPeriodRoomDepartment>)new androidx.lifecycle.k0((Object)null);
        this.l = (androidx.lifecycle.k0<CalendarTeachingContentsResponse>)new androidx.lifecycle.k0((Object)null);
        this.m = (androidx.lifecycle.k0<List<HomeWork>>)new androidx.lifecycle.k0((Object)null);
        this.n = (androidx.lifecycle.k0<c>)new androidx.lifecycle.k0();
        this.o = (androidx.lifecycle.k0<Classbook>)new androidx.lifecycle.k0();
    }
    
    private final void A0() {
        for (final CalendarPeriodContext calendarPeriodContext : this.g) {
            final k e = this.e;
            if (e == null) {
                kotlin.jvm.internal.k0.S("timetableService");
                throw null;
            }
            final Period l = e.l(calendarPeriodContext.getPeriod().getId());
            if (l == null) {
                continue;
            }
            final List<Object> l2 = v.L5((Collection<?>)calendarPeriodContext.getPeriod().getPermissions());
            final CalendarPeriodPermission readStudentAbsence = CalendarPeriodPermission.ReadStudentAbsence;
            l2.remove(readStudentAbsence);
            if (l.getRights().contains(PeriodRight.READ_STUD_ABSENCE)) {
                l2.add(readStudentAbsence);
            }
            final CalendarPeriodPermission writeStudentAbsence = CalendarPeriodPermission.WriteStudentAbsence;
            l2.remove(writeStudentAbsence);
            if (l.getRights().contains(PeriodRight.WRITE_STUD_ABSENCE)) {
                l2.add(writeStudentAbsence);
            }
            final CalendarPeriodPermission writeHomework = CalendarPeriodPermission.WriteHomework;
            l2.remove(writeHomework);
            if (l.getRights().contains(PeriodRight.WRITE_HOMEWORK)) {
                l2.add(writeHomework);
            }
            final CalendarPeriodPermission readHomework = CalendarPeriodPermission.ReadHomework;
            l2.remove(readHomework);
            if (l.getRights().contains(PeriodRight.READ_HOMEWORK)) {
                l2.add(readHomework);
            }
            calendarPeriodContext.getPeriod().setPermissions((List<? extends CalendarPeriodPermission>)l2);
        }
    }
    
    private final Object C0(final d<? super j2> d) {
        final k e = this.e;
        Long g = null;
        if (e == null) {
            kotlin.jvm.internal.k0.S("timetableService");
            throw null;
        }
        final CalendarPeriod calendarPeriod = (CalendarPeriod)((LiveData)this.h).f();
        if (calendarPeriod != null) {
            g = kotlin.coroutines.jvm.internal.b.g(calendarPeriod.getId());
        }
        if (g == null) {
            return j2.a;
        }
        final Object s = e.s(v.k(kotlin.coroutines.jvm.internal.b.g(g)), d);
        if (s == kotlin.coroutines.intrinsics.b.h()) {
            return s;
        }
        return j2.a;
    }
    
    private final Object E(final List<Long> list, long i, final d<? super j2> d) throws Exception {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0061: {
            if (d instanceof k0$b) {
                final kotlin.coroutines.jvm.internal.d d2 = (k0$b)d;
                final int l = d2.L;
                if ((l & Integer.MIN_VALUE) != 0x0) {
                    d2.L = l + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0061;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                Object G;
                Object H;
                long I;
                /* synthetic */ Object J;
                int L;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object j) {
                    this.J = j;
                    this.L |= Integer.MIN_VALUE;
                    return k0.this.E(null, 0L, this);
                }
            };
        }
        Object o = d3.J;
        final Object h = kotlin.coroutines.intrinsics.b.h();
        final int j = d3.L;
        final CalendarPeriodContext calendarPeriodContext = null;
        k0 k2;
        k0 k3;
        if (j != 0) {
            if (j != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = d3.I;
            final k0 k0 = (k0)d3.H;
            k2 = (k0)d3.G;
            c1.n(o);
            k3 = k0;
        }
        else {
            c1.n(o);
            final a c = this.c;
            if (c == null) {
                kotlin.jvm.internal.k0.S("calendarService");
                throw null;
            }
            d3.G = this;
            d3.H = this;
            d3.I = i;
            d3.L = 1;
            o = c.b(list, d3);
            if (o == h) {
                return h;
            }
            k3 = this;
            k2 = this;
        }
        final Iterable<? extends T> iterable = (Iterable<? extends T>)o;
        final ArrayList g = new ArrayList<CalendarPeriodContext>(v.Y((Iterable<?>)iterable, 10));
        for (final CalendarPeriod calendarPeriod : iterable) {
            final com.untis.mobile.services.classbook.a d4 = k2.d;
            if (d4 == null) {
                kotlin.jvm.internal.k0.S("classBookService");
                throw null;
            }
            final List<Comparable> d5 = v.d5((Iterable<? extends Comparable>)d4.b0(calendarPeriod.getId()));
            final com.untis.mobile.services.classbook.a d6 = k2.d;
            if (d6 == null) {
                kotlin.jvm.internal.k0.S("classBookService");
                throw null;
            }
            g.add(new CalendarPeriodContext(calendarPeriod, (List<HomeWork>)d5, d6.S(calendarPeriod.getId())));
        }
        k3.g = (List<CalendarPeriodContext>)g;
        final Iterator<Object> iterator2 = k2.g.iterator();
        CalendarPeriodContext next;
        do {
            next = calendarPeriodContext;
            if (!iterator2.hasNext()) {
                break;
            }
            next = iterator2.next();
        } while (!kotlin.coroutines.jvm.internal.b.a(next.getPeriod().getId() == i));
        final CalendarPeriodContext calendarPeriodContext2 = next;
        if (calendarPeriodContext2 != null) {
            k2.h.q((Object)calendarPeriodContext2.getPeriod());
            k2.m.q((Object)calendarPeriodContext2.getHomework());
            k2.o.q((Object)calendarPeriodContext2.getClassbook());
            return j2.a;
        }
        throw new Exception("no data available");
    }
    
    private final Object F(final EntityType entityType, final Long n, final c c, final c c2, long n2, final d<? super j2> d) throws RuntimeException {
        kotlin.coroutines.jvm.internal.d d2 = null;
        Label_0057: {
            if (d instanceof k0$c) {
                d2 = (k0$c)d;
                final int k = d2.K;
                if ((k & Integer.MIN_VALUE) != 0x0) {
                    d2.K = k + Integer.MIN_VALUE;
                    break Label_0057;
                }
            }
            d2 = new kotlin.coroutines.jvm.internal.d(d) {
                Object G;
                long H;
                /* synthetic */ Object I;
                int K;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object i) {
                    this.I = i;
                    this.K |= Integer.MIN_VALUE;
                    return k0.this.F(null, null, null, null, 0L, this);
                }
            };
        }
        Object o = d2.I;
        final Object h = kotlin.coroutines.intrinsics.b.h();
        final int i = d2.K;
        Object g = null;
        g g2 = null;
        Object o2 = null;
        Label_0401: {
            k0 k2 = null;
            Label_0357: {
                k0 k3;
                if (i != 0) {
                    if (i == 1) {
                        n2 = d2.H;
                        k2 = (k0)d2.G;
                        c1.n(o);
                        break Label_0357;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n2 = d2.H;
                    k3 = (k0)d2.G;
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    if (entityType != null && n != null && c != null && c2 != null) {
                        final a c3 = this.c;
                        if (c3 == null) {
                            kotlin.jvm.internal.k0.S("calendarService");
                            throw null;
                        }
                        final long longValue = n;
                        d2.G = this;
                        d2.H = n2;
                        d2.K = 2;
                        o = c3.n(entityType, longValue, c, c2, d2);
                        if (o == h) {
                            return h;
                        }
                        k3 = this;
                    }
                    else {
                        final a c4 = this.c;
                        if (c4 == null) {
                            kotlin.jvm.internal.k0.S("calendarService");
                            throw null;
                        }
                        d2.G = this;
                        d2.H = n2;
                        d2.K = 1;
                        o = c4.a(n2, d2);
                        if (o == h) {
                            return h;
                        }
                        k2 = this;
                        break Label_0357;
                    }
                }
                final List list = (List)o;
                final com.untis.mobile.services.classbook.a d3 = k3.d;
                if (d3 != null) {
                    final g<Boolean> j = d3.I();
                    final b0 b0 = new b0(k3, list, n2);
                    g = g0.G;
                    g2 = j;
                    o2 = b0;
                    break Label_0401;
                }
                kotlin.jvm.internal.k0.S("classBookService");
                throw null;
            }
            final CalendarPeriod calendarPeriod = (CalendarPeriod)o;
            final com.untis.mobile.services.classbook.a d4 = k2.d;
            if (d4 == null) {
                kotlin.jvm.internal.k0.S("classBookService");
                throw null;
            }
            final g<Boolean> l = d4.I();
            o2 = new a0(k2, n2, calendarPeriod);
            final f0 g3 = f0.G;
            g2 = l;
            g = g3;
        }
        g2.C5((rx.functions.b)o2, (rx.functions.b)g);
        return j2.a;
    }
    
    private static final void G(final k0 k0, final List list, final long n, final Boolean b) {
        kotlin.jvm.internal.k0.p(k0, "this$0");
        kotlin.jvm.internal.k0.p(list, "$periods");
        final com.untis.mobile.services.classbook.a d = k0.d;
        if (d != null) {
            final ArrayList list2 = new ArrayList<Long>(v.Y((Iterable<?>)list, 10));
            final Iterator<CalendarPeriod> iterator = (Iterator<CalendarPeriod>)list.iterator();
            while (iterator.hasNext()) {
                list2.add(Long.valueOf(iterator.next().getId()));
            }
            d.e((List<Long>)list2).D5((rx.functions.b)d0.G, (rx.functions.b)e0.G, (rx.functions.a)new z(k0, list, n));
            return;
        }
        kotlin.jvm.internal.k0.S("classBookService");
        throw null;
    }
    
    private static final void H(final k0 k0, final List list, final long n) {
        kotlin.jvm.internal.k0.p(k0, "this$0");
        kotlin.jvm.internal.k0.p(list, "$periods");
        final ArrayList<CalendarPeriodContext> g = new ArrayList<CalendarPeriodContext>(v.Y((Iterable<?>)list, 10));
        for (final CalendarPeriod calendarPeriod : list) {
            final com.untis.mobile.services.classbook.a d = k0.d;
            if (d == null) {
                kotlin.jvm.internal.k0.S("classBookService");
                throw null;
            }
            final List<Comparable> d2 = v.d5((Iterable<? extends Comparable>)d.b0(calendarPeriod.getId()));
            final com.untis.mobile.services.classbook.a d3 = k0.d;
            if (d3 == null) {
                kotlin.jvm.internal.k0.S("classBookService");
                throw null;
            }
            g.add(new CalendarPeriodContext(calendarPeriod, (List<HomeWork>)d2, d3.S(calendarPeriod.getId())));
        }
        k0.g = g;
        k0.A0();
        while (true) {
            for (final CalendarPeriodContext next : k0.g) {
                if (next.getPeriod().getId() == n) {
                    final CalendarPeriodContext calendarPeriodContext = next;
                    if (calendarPeriodContext == null) {
                        return;
                    }
                    k0.h.q((Object)calendarPeriodContext.getPeriod());
                    k0.m.q((Object)calendarPeriodContext.getHomework());
                    k0.o.q((Object)calendarPeriodContext.getClassbook());
                    h.h((kotlin.coroutines.g)null, (p)new p<r0, d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ k0 H;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                int G;
                                final /* synthetic */ k0 H = this.H;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                            return ((k0$d)this.create(r0, d)).invokeSuspend(j2.a);
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
                                final k0 h2 = this.H;
                                this.G = 1;
                                if (h2.C0(this) == h) {
                                    return h;
                                }
                            }
                            return j2.a;
                        }
                    }, 1, (Object)null);
                    return;
                }
            }
            CalendarPeriodContext next = null;
            continue;
        }
    }
    
    private static final void I(final Boolean b) {
    }
    
    private static final void J(final Throwable t) {
        timber.log.b.g(t, "could not fetch classbook data", new Object[0]);
    }
    
    private static final void K(final Throwable t) {
        timber.log.b.g(t, "could not fetch classbook data", new Object[0]);
        kotlin.jvm.internal.k0.o(t, "it");
        throw t;
    }
    
    private static final void L(final k0 k0, final long l, final CalendarPeriod calendarPeriod, final Boolean b) {
        kotlin.jvm.internal.k0.p(k0, "this$0");
        kotlin.jvm.internal.k0.p(calendarPeriod, "$period");
        final com.untis.mobile.services.classbook.a d = k0.d;
        if (d != null) {
            d.e(v.k(l)).D5((rx.functions.b)c0.G, (rx.functions.b)h0.G, (rx.functions.a)new y(k0, calendarPeriod));
            return;
        }
        kotlin.jvm.internal.k0.S("classBookService");
        throw null;
    }
    
    private static final void M(final Boolean b) {
    }
    
    private static final void N(final Throwable t) {
        timber.log.b.g(t, "could not load period data", new Object[0]);
        kotlin.jvm.internal.k0.o(t, "it");
        throw t;
    }
    
    private static final void O(final k0 k0, final CalendarPeriod calendarPeriod) {
        kotlin.jvm.internal.k0.p(k0, "this$0");
        kotlin.jvm.internal.k0.p(calendarPeriod, "$period");
        final com.untis.mobile.services.classbook.a d = k0.d;
        if (d == null) {
            kotlin.jvm.internal.k0.S("classBookService");
            throw null;
        }
        final List<HomeWork> b0 = d.b0(calendarPeriod.getId());
        final com.untis.mobile.services.classbook.a d2 = k0.d;
        if (d2 == null) {
            kotlin.jvm.internal.k0.S("classBookService");
            throw null;
        }
        k0.g = v.k(new CalendarPeriodContext(calendarPeriod, b0, d2.S(calendarPeriod.getId())));
        k0.A0();
        final CalendarPeriodContext calendarPeriodContext = v.t2((List<? extends CalendarPeriodContext>)k0.g);
        if (calendarPeriodContext == null) {
            return;
        }
        k0.h.q((Object)calendarPeriodContext.getPeriod());
        k0.m.q((Object)calendarPeriodContext.getHomework());
        k0.o.q((Object)calendarPeriodContext.getClassbook());
    }
    
    private static final void P(final Throwable t) {
        timber.log.b.g(t, "could not sync period data", new Object[0]);
    }
    
    public static final /* synthetic */ List m(final k0 k0) {
        return k0.g;
    }
    
    private final void m0(final HomeWork homeWork) {
        final List list = (List)((LiveData)this.m).f();
        Object l5;
        if (list == null) {
            l5 = null;
        }
        else {
            l5 = v.L5((Collection<?>)list);
        }
        Object o = l5;
        if (l5 == null) {
            o = new ArrayList<HomeWork>();
        }
        boolean b = false;
        Label_0107: {
            if (!((Collection)o).isEmpty()) {
                final Iterator<HomeWork> iterator = ((Iterable<HomeWork>)o).iterator();
                while (iterator.hasNext()) {
                    if (iterator.next().getId() == homeWork.getId()) {
                        b = true;
                        break Label_0107;
                    }
                }
            }
            b = false;
        }
        if (b) {
            com.untis.mobile.utils.extension.c.c((List<? extends HomeWork>)o, homeWork, new l<HomeWork, Boolean>() {
                public final boolean a(@e final HomeWork homeWork) {
                    kotlin.jvm.internal.k0.p(homeWork, "it");
                    return homeWork.getId() == homeWork.getId();
                }
            });
        }
        else {
            ((List<HomeWork>)o).add(homeWork);
        }
        for (final CalendarPeriodContext calendarPeriodContext : this.g) {
            final long id = calendarPeriodContext.getPeriod().getId();
            final CalendarPeriod calendarPeriod = (CalendarPeriod)((LiveData)this.h).f();
            if (calendarPeriod != null && id == calendarPeriod.getId()) {
                Object o2;
                if ((o2 = calendarPeriodContext.getHomework()) == null) {
                    o2 = v.E();
                }
                boolean b2 = false;
                Label_0316: {
                    if (!(o2 instanceof Collection) || !((Collection)o2).isEmpty()) {
                        final Iterator<HomeWork> iterator3 = ((Iterable<HomeWork>)o2).iterator();
                        while (iterator3.hasNext()) {
                            if (iterator3.next().getId() == homeWork.getId()) {
                                b2 = true;
                                break Label_0316;
                            }
                        }
                    }
                    b2 = false;
                }
                if (b2) {
                    com.untis.mobile.utils.extension.c.c((List<? extends HomeWork>)o2, homeWork, new l<HomeWork, Boolean>() {
                        public final boolean a(@e final HomeWork homeWork) {
                            kotlin.jvm.internal.k0.p(homeWork, "it");
                            return homeWork.getId() == homeWork.getId();
                        }
                    });
                }
                else {
                    calendarPeriodContext.setHomework((List<HomeWork>)v.d5((Iterable<? extends Comparable>)v.r4((Collection<? extends HomeWork>)o2, homeWork)));
                }
            }
        }
        this.m.n((Object)v.d5((Iterable<? extends Comparable>)o));
    }
    
    public static final /* synthetic */ a n(final k0 k0) {
        return k0.c;
    }
    
    public static final /* synthetic */ com.untis.mobile.services.classbook.a o(final k0 k0) {
        return k0.d;
    }
    
    public static final /* synthetic */ Context p(final k0 k0) {
        return k0.a;
    }
    
    public static final /* synthetic */ androidx.lifecycle.k0 q(final k0 k0) {
        return k0.l;
    }
    
    public static final /* synthetic */ androidx.lifecycle.k0 r(final k0 k0) {
        return k0.o;
    }
    
    public static final /* synthetic */ androidx.lifecycle.k0 s(final k0 k0) {
        return k0.n;
    }
    
    public static final /* synthetic */ androidx.lifecycle.k0 t(final k0 k0) {
        return k0.m;
    }
    
    public static final /* synthetic */ androidx.lifecycle.k0 u(final k0 k0) {
        return k0.h;
    }
    
    public static final /* synthetic */ androidx.lifecycle.k0 v(final k0 k0) {
        return k0.j;
    }
    
    public static final /* synthetic */ androidx.lifecycle.k0 w(final k0 k0) {
        return k0.k;
    }
    
    public static final /* synthetic */ androidx.lifecycle.k0 x(final k0 k0) {
        return k0.i;
    }
    
    public static final /* synthetic */ Profile y(final k0 k0) {
        return k0.b;
    }
    
    public static final /* synthetic */ k z(final k0 k0) {
        return k0.e;
    }
    
    @e
    public final k2 B0() {
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$y)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1.n(o);
                final androidx.lifecycle.k0 r = k0.r(this.H);
                final com.untis.mobile.services.classbook.a o2 = k0.o(this.H);
                Long g = null;
                if (o2 == null) {
                    kotlin.jvm.internal.k0.S("classBookService");
                    throw null;
                }
                final CalendarPeriod calendarPeriod = (CalendarPeriod)((LiveData)k0.u(this.H)).f();
                if (calendarPeriod != null) {
                    g = kotlin.coroutines.jvm.internal.b.g(calendarPeriod.getId());
                }
                if (g == null) {
                    return j2.a;
                }
                r.q((Object)o2.S(g));
                return j2.a;
            }
        }, 3, (Object)null);
    }
    
    public final boolean C(@e final CalendarPeriod calendarPeriod) {
        kotlin.jvm.internal.k0.p(calendarPeriod, "period");
        return calendarPeriod.getPermissions().contains(CalendarPeriodPermission.WriteLessonContent);
    }
    
    @e
    public final k2 D(@e final CoroutineExceptionHandler coroutineExceptionHandler, @e final HomeWork homeWork, @e final n6.a<j2> a) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(homeWork, "homework");
        kotlin.jvm.internal.k0.p(a, "onSuccess");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>(null) {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ HomeWork I;
            final /* synthetic */ n6.a<j2> J;
            
            private static final void q(final n6.a a, final HomeWork homeWork) {
                a.invoke();
            }
            
            private static final void s(final Throwable t) {
                Log.e("untis_log_cal", "could not delete homework", t);
            }
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ HomeWork I = this.I;
                    final /* synthetic */ n6.a<j2> J = this.J;
                    
                    private static final void q(final n6.a a, final HomeWork homeWork) {
                        a.invoke();
                    }
                    
                    private static final void s(final Throwable t) {
                        Log.e("untis_log_cal", "could not delete homework", t);
                    }
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object homework) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0423: {
                    if (g != 0) {
                        if (g != 1) {
                            if (g == 2) {
                                c1.n(homework);
                                break Label_0423;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            c1.n(homework);
                        }
                    }
                    else {
                        c1.n(homework);
                        final com.untis.mobile.services.classbook.a o = k0.o(this.H);
                        if (o == null) {
                            kotlin.jvm.internal.k0.S("classBookService");
                            throw null;
                        }
                        final HomeWork i = this.I;
                        this.G = 1;
                        if (o.f0(i, this) == h) {
                            return h;
                        }
                    }
                    final List m = k0.m(this.H);
                    final HomeWork j = this.I;
                    for (final CalendarPeriodContext calendarPeriodContext : m) {
                        final List<HomeWork> homework2 = calendarPeriodContext.getHomework();
                        if (homework2 == null) {
                            homework = null;
                        }
                        else {
                            final Collection<Object> collection = new ArrayList<Object>();
                            final Iterator<Object> iterator2 = homework2.iterator();
                            while (true) {
                                homework = collection;
                                if (!iterator2.hasNext()) {
                                    break;
                                }
                                homework = iterator2.next();
                                if (!kotlin.coroutines.jvm.internal.b.a(((HomeWork)homework).getId() != j.getId())) {
                                    continue;
                                }
                                collection.add(homework);
                            }
                        }
                        calendarPeriodContext.setHomework((List<HomeWork>)homework);
                    }
                    final androidx.lifecycle.k0 t = k0.t(this.H);
                    final List list = (List)((LiveData)k0.t(this.H)).f();
                    if (list == null) {
                        homework = null;
                    }
                    else {
                        final HomeWork k = this.I;
                        final Collection<Object> collection2 = new ArrayList<Object>();
                        final Iterator<Object> iterator3 = list.iterator();
                        while (true) {
                            homework = collection2;
                            if (!iterator3.hasNext()) {
                                break;
                            }
                            homework = iterator3.next();
                            if (!kotlin.coroutines.jvm.internal.b.a(((HomeWork)homework).getId() != k.getId())) {
                                continue;
                            }
                            collection2.add(homework);
                        }
                    }
                    t.q(homework);
                    if (this.I.getLocal()) {
                        final k z = k0.z(this.H);
                        if (z == null) {
                            kotlin.jvm.internal.k0.S("timetableService");
                            throw null;
                        }
                        final HomeWork l = this.I;
                        this.G = 2;
                        if (z.z(l, true, this) == h) {
                            return h;
                        }
                    }
                    else {
                        this.I.setPeriodId(0L);
                        this.I.setSynced(false);
                        final com.untis.mobile.services.classbook.a o2 = k0.o(this.H);
                        if (o2 != null) {
                            o2.e0(this.I).Q3(rx.android.schedulers.a.c()).C5((rx.functions.b)new i0(this.J), (rx.functions.b)j0.G);
                            return j2.a;
                        }
                        kotlin.jvm.internal.k0.S("classBookService");
                        throw null;
                    }
                }
                this.J.invoke();
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    public final int Q(@e final Classbook classbook, @e final CalendarPeriod calendarPeriod, final int n) {
        kotlin.jvm.internal.k0.p(classbook, "classbook");
        kotlin.jvm.internal.k0.p(calendarPeriod, "period");
        final Set<Long> absences = classbook.getAbsences();
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        final Iterator<Number> iterator = absences.iterator();
        while (iterator.hasNext()) {
            final long longValue = iterator.next().longValue();
            final com.untis.mobile.services.classbook.a d = this.d;
            if (d == null) {
                kotlin.jvm.internal.k0.S("classBookService");
                throw null;
            }
            final StudentAbsence z = d.Z(longValue);
            if (z == null) {
                continue;
            }
            list.add(z);
        }
        final boolean empty = list.isEmpty();
        int n2 = 0;
        if (!empty) {
            final Iterator<Object> iterator2 = list.iterator();
            n2 = 0;
            while (iterator2.hasNext()) {
                final StudentAbsence studentAbsence = iterator2.next();
                if (!((org.joda.time.base.c)studentAbsence.getStart()).R((l0)calendarPeriod.getStart()) && !((org.joda.time.base.c)studentAbsence.getEnd()).C((l0)calendarPeriod.getEnd())) {
                    final int n3 = n2 + 1;
                    if ((n2 = n3) >= 0) {
                        continue;
                    }
                    v.V();
                    n2 = n3;
                }
            }
        }
        if (n2 > n) {
            return n;
        }
        return n2;
    }
    
    @e
    public final List<CalendarPeriodContext> S() {
        return this.g;
    }
    
    @androidx.annotation.e0
    public final int T() {
        final Profile b = this.b;
        if (b == null) {
            kotlin.jvm.internal.k0.S("profile");
            throw null;
        }
        if (b.hasAnyRole(EntityType.TEACHER)) {
            return 2131492991;
        }
        return 2131492974;
    }
    
    @e
    public final com.untis.mobile.services.masterdata.a U() {
        final com.untis.mobile.services.masterdata.a f = this.f;
        if (f != null) {
            return f;
        }
        kotlin.jvm.internal.k0.S("masterDataService");
        throw null;
    }
    
    @e
    public final LiveData<Classbook> V() {
        return (LiveData<Classbook>)this.o;
    }
    
    @e
    public final LiveData<c> W() {
        return (LiveData<c>)this.n;
    }
    
    @org.jetbrains.annotations.f
    public final Object X(@e final HomeWork homeWork, @e final d<? super List<c>> d) {
        return kotlinx.coroutines.h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, d<? super List<? extends c>>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ HomeWork I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends c>>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ HomeWork I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<c>> d) {
                return ((k0$e)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1.n(o);
                final k z = k0.z(this.H);
                if (z != null) {
                    final List<Period> v = z.v(this.I.getLessonId());
                    final ArrayList list = new ArrayList<org.joda.time.t>(kotlin.collections.v.Y((Iterable<?>)v, 10));
                    final Iterator<Object> iterator = v.iterator();
                    while (iterator.hasNext()) {
                        list.add(iterator.next().getStart().h1());
                    }
                    final HomeWork i = this.I;
                    final ArrayList<org.joda.time.t> list2 = new ArrayList<org.joda.time.t>();
                    for (final org.joda.time.t next : list) {
                        if (kotlin.coroutines.jvm.internal.b.a(((org.joda.time.base.e)next).m((n0)i.getStart().h1()))) {
                            list2.add(next);
                        }
                    }
                    final Set<Object> n5 = kotlin.collections.v.N5((Iterable<?>)list2);
                    o = new ArrayList(kotlin.collections.v.Y((Iterable<?>)n5, 10));
                    final Iterator<org.joda.time.t> iterator3 = n5.iterator();
                    while (iterator3.hasNext()) {
                        ((Collection<c>)o).add(iterator3.next().F0());
                    }
                    return kotlin.collections.v.d5((Iterable<? extends Comparable>)kotlin.collections.v.I5((Iterable<?>)o));
                }
                kotlin.jvm.internal.k0.S("timetableService");
                throw null;
            }
        }, (d)d);
    }
    
    @e
    public final LiveData<List<HomeWork>> Y() {
        return (LiveData<List<HomeWork>>)this.m;
    }
    
    @e
    public final LiveData<CalendarPeriod> Z() {
        return (LiveData<CalendarPeriod>)this.h;
    }
    
    @e
    public final LiveData<CalendarPeriodRoomBuilding> a0() {
        return (LiveData<CalendarPeriodRoomBuilding>)this.j;
    }
    
    @e
    public final LiveData<CalendarPeriodRoomDepartment> b0() {
        return (LiveData<CalendarPeriodRoomDepartment>)this.k;
    }
    
    @e
    public final LiveData<CalendarPeriodRoomResponse> c0() {
        return (LiveData<CalendarPeriodRoomResponse>)this.i;
    }
    
    @e
    public final Profile d0() {
        final Profile b = this.b;
        if (b != null) {
            return b;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    public final boolean e0(@e final HomeWork homeWork, final boolean b) {
        kotlin.jvm.internal.k0.p(homeWork, "homework");
        return !b || (s.U1((CharSequence)homeWork.getRemark()) ^ true);
    }
    
    @e
    public final k2 f0(@e final CoroutineExceptionHandler coroutineExceptionHandler, final long n, @e final n6.a<j2> a) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(a, "onSuccess");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>(null) {
            Object G;
            int H;
            final /* synthetic */ k0 I;
            final /* synthetic */ long J;
            final /* synthetic */ n6.a<j2> K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    Object G;
                    int H;
                    final /* synthetic */ k0 I = this.I;
                    final /* synthetic */ long J = this.J;
                    final /* synthetic */ n6.a<j2> K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$f)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object c) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                androidx.lifecycle.k0 u;
                if (h2 != 0) {
                    if (h2 != 1) {
                        if (h2 == 2) {
                            c1.n(c);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        u = (androidx.lifecycle.k0)this.G;
                        c1.n(c);
                    }
                }
                else {
                    c1.n(c);
                    final CalendarPeriod calendarPeriod = (CalendarPeriod)((LiveData)k0.u(this.I)).f();
                    if (calendarPeriod == null) {
                        return j2.a;
                    }
                    u = k0.u(this.I);
                    final com.untis.mobile.calendar.service.a n = k0.n(this.I);
                    if (n == null) {
                        kotlin.jvm.internal.k0.S("calendarService");
                        throw null;
                    }
                    final long j = this.J;
                    this.G = u;
                    this.H = 1;
                    if ((c = n.c(calendarPeriod, j, this)) == h) {
                        return h;
                    }
                }
                u.q(c);
                this.K.invoke();
                final k0 i = this.I;
                this.G = null;
                this.H = 2;
                if (i.C0(this) == h) {
                    return h;
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final k2 g0(@e final CoroutineExceptionHandler coroutineExceptionHandler, final long n) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ k0 I;
            final /* synthetic */ long J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ k0 I = this.I;
                    final /* synthetic */ long J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$g)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object k) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                androidx.lifecycle.k0 u;
                if (h2 != 0) {
                    if (h2 != 1) {
                        if (h2 == 2) {
                            c1.n(k);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        u = (androidx.lifecycle.k0)this.G;
                        c1.n(k);
                    }
                }
                else {
                    c1.n(k);
                    final CalendarPeriod calendarPeriod = (CalendarPeriod)((LiveData)k0.u(this.I)).f();
                    if (calendarPeriod == null) {
                        return j2.a;
                    }
                    u = k0.u(this.I);
                    final com.untis.mobile.calendar.service.a n = k0.n(this.I);
                    if (n == null) {
                        kotlin.jvm.internal.k0.S("calendarService");
                        throw null;
                    }
                    final long j = this.J;
                    this.G = u;
                    this.H = 1;
                    if ((k = n.k(calendarPeriod, j, this)) == h) {
                        return h;
                    }
                }
                u.q(k);
                final k0 i = this.I;
                this.G = null;
                this.H = 2;
                if (i.C0(this) == h) {
                    return h;
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final k2 h0(@e final CoroutineExceptionHandler coroutineExceptionHandler, final long n, final long n2, @e final n6.a<j2> a) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(a, "onSuccess");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>(a) {
            Object G;
            int H;
            final /* synthetic */ k0 I;
            final /* synthetic */ long J;
            final /* synthetic */ long K;
            final /* synthetic */ n6.a<j2> L;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ k0 I = this.I;
                    final /* synthetic */ long J = this.J;
                    final /* synthetic */ long K = this.K;
                    final /* synthetic */ n6.a<j2> L = this.L;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$h)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object l) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                androidx.lifecycle.k0 u;
                if (h2 != 0) {
                    if (h2 != 1) {
                        if (h2 == 2) {
                            c1.n(l);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        u = (androidx.lifecycle.k0)this.G;
                        c1.n(l);
                    }
                }
                else {
                    c1.n(l);
                    final CalendarPeriod calendarPeriod = (CalendarPeriod)((LiveData)k0.u(this.I)).f();
                    if (calendarPeriod == null) {
                        return j2.a;
                    }
                    u = k0.u(this.I);
                    final com.untis.mobile.calendar.service.a n = k0.n(this.I);
                    if (n == null) {
                        kotlin.jvm.internal.k0.S("calendarService");
                        throw null;
                    }
                    final long j = this.J;
                    final long k = this.K;
                    this.G = u;
                    this.H = 1;
                    if ((l = n.l(calendarPeriod, j, k, this)) == h) {
                        return h;
                    }
                }
                u.q(l);
                this.L.invoke();
                final k0 i = this.I;
                this.G = null;
                this.H = 2;
                if (i.C0(this) == h) {
                    return h;
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final k2 i0(@e final CoroutineExceptionHandler coroutineExceptionHandler, @org.jetbrains.annotations.f final EntityType entityType, @org.jetbrains.annotations.f final Long n, @e final List<Long> list, final long n2, @org.jetbrains.annotations.f final c c, @org.jetbrains.annotations.f final c c2) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(list, "periodIds");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>(c, null) {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ EntityType I;
            final /* synthetic */ Long J;
            final /* synthetic */ c K;
            final /* synthetic */ c L;
            final /* synthetic */ long M;
            final /* synthetic */ List<Long> N;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ EntityType I = this.I;
                    final /* synthetic */ Long J = this.J;
                    final /* synthetic */ c K = this.K;
                    final /* synthetic */ c L = this.L;
                    final /* synthetic */ long M = this.M;
                    final /* synthetic */ List<Long> N = this.N;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$i)this.create(r0, d)).invokeSuspend(j2.a);
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
                    if (com.untis.mobile.utils.extension.h.g(k0.p(this.H))) {
                        final k0 h2 = this.H;
                        final EntityType i = this.I;
                        final Long j = this.J;
                        final c k = this.K;
                        final c l = this.L;
                        final long m = this.M;
                        this.G = 1;
                        if (h2.F(i, j, k, l, m, this) == h) {
                            return h;
                        }
                    }
                    else {
                        final k0 h3 = this.H;
                        final List<Long> n = this.N;
                        final long m2 = this.M;
                        this.G = 2;
                        if (h3.E(n, m2, this) == h) {
                            return h;
                        }
                    }
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final k2 j0(@e final CoroutineExceptionHandler coroutineExceptionHandler, @org.jetbrains.annotations.f final Long n) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ Long I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ Long I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$j)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                final Object o2 = null;
                boolean b = true;
                Label_0146: {
                    if (g != 0) {
                        if (g == 1) {
                            c1.n(o);
                            break Label_0146;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        c1.n(o);
                        if (!com.untis.mobile.utils.extension.h.g(k0.p(this.H))) {
                            throw new ConnectException("no connection");
                        }
                        final CalendarPeriod calendarPeriod = (CalendarPeriod)((LiveData)k0.u(this.H)).f();
                        if (calendarPeriod == null) {
                            Log.e("untis_log_cal", "no valid period");
                        }
                        else {
                            final com.untis.mobile.calendar.service.a n = k0.n(this.H);
                            if (n == null) {
                                kotlin.jvm.internal.k0.S("calendarService");
                                throw null;
                            }
                            final c start = calendarPeriod.getStart();
                            final c end = calendarPeriod.getEnd();
                            this.G = 1;
                            if ((o = n.g(start, end, this)) == h) {
                                return h;
                            }
                            break Label_0146;
                        }
                    }
                    return j2.a;
                }
                final CalendarPeriodRoomResponse calendarPeriodRoomResponse = (CalendarPeriodRoomResponse)o;
                final List<CalendarPeriodRoomDetail> rooms = calendarPeriodRoomResponse.getRooms();
                final Long i = this.I;
                final Iterator<Object> iterator = rooms.iterator();
                while (true) {
                Label_0388_Outer:
                    while (iterator.hasNext()) {
                        o = iterator.next();
                        final long id = ((CalendarPeriodRoomDetail)o).getId();
                        boolean b2 = false;
                        Label_0224: {
                            if (i != null) {
                                if (id == i) {
                                    b2 = true;
                                    break Label_0224;
                                }
                            }
                            b2 = false;
                        }
                        if (kotlin.coroutines.jvm.internal.b.a(b2)) {
                            final CalendarPeriodRoomDetail calendarPeriodRoomDetail = (CalendarPeriodRoomDetail)o;
                            final androidx.lifecycle.k0 v = k0.v(this.H);
                            if (calendarPeriodRoomDetail != null) {
                                v.q((Object)calendarPeriodRoomDetail.getBuilding());
                                k0.w(this.H).q((Object)calendarPeriodRoomDetail.getDepartment());
                            }
                            else {
                                v.q((Object)null);
                            }
                            final List<CalendarPeriodRoomDepartment> departments = calendarPeriodRoomResponse.getDepartments();
                            final k0 h2 = this.H;
                            final Iterator<Object> iterator2 = departments.iterator();
                            while (true) {
                                long id2;
                                Profile y;
                                do {
                                    o = o2;
                                    if (!iterator2.hasNext()) {
                                        final CalendarPeriodRoomDepartment calendarPeriodRoomDepartment = (CalendarPeriodRoomDepartment)o;
                                        if (((LiveData)k0.w(this.H)).f() == null && calendarPeriodRoomDepartment != null) {
                                            final List<CalendarPeriodRoomDetail> rooms2 = calendarPeriodRoomResponse.getRooms();
                                            Label_0514: {
                                                if (!(rooms2 instanceof Collection) || !rooms2.isEmpty()) {
                                                    for (final CalendarPeriodRoomDetail calendarPeriodRoomDetail2 : rooms2) {
                                                        if (kotlin.coroutines.jvm.internal.b.a(calendarPeriodRoomDetail2.getAvailability() == CalendarPeriodRoomAvailability.Bookable || calendarPeriodRoomDetail2.getAvailability() == CalendarPeriodRoomAvailability.Reservable)) {
                                                            break Label_0514;
                                                        }
                                                    }
                                                }
                                                b = false;
                                            }
                                            if (b) {
                                                k0.w(this.H).q((Object)calendarPeriodRoomDepartment);
                                            }
                                        }
                                        k0.x(this.H).q((Object)calendarPeriodRoomResponse);
                                        return j2.a;
                                    }
                                    o = iterator2.next();
                                    id2 = ((CalendarPeriodRoomDepartment)o).getId();
                                    y = k0.y(h2);
                                    if (y != null) {
                                        continue Label_0388_Outer;
                                    }
                                    kotlin.jvm.internal.k0.S("profile");
                                    throw null;
                                } while (!kotlin.coroutines.jvm.internal.b.a(id2 == y.getUserDepartmentId()));
                                continue;
                            }
                        }
                    }
                    o = null;
                    continue;
                }
            }
        }, 2, (Object)null);
    }
    
    @e
    public final k2 k0(@e final Context context, @e final CalendarPeriod calendarPeriod) {
        kotlin.jvm.internal.k0.p(context, "context");
        kotlin.jvm.internal.k0.p(calendarPeriod, "period");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)i1.c(), (u0)null, (p)new p<r0, d<? super j2>, Object>(null) {
            int G;
            final /* synthetic */ Context H;
            final /* synthetic */ k0 I;
            final /* synthetic */ CalendarPeriod J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    int G;
                    final /* synthetic */ Context H = this.H;
                    final /* synthetic */ k0 I = this.I;
                    final /* synthetic */ CalendarPeriod J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$k)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object j) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(j);
                }
                else {
                    c1.n(j);
                    if (!com.untis.mobile.utils.g0.a(this.H)) {
                        return j2.a;
                    }
                    final com.untis.mobile.calendar.service.b b = new com.untis.mobile.calendar.service.b(this.H, this.I.d0());
                    final CalendarPeriod i = this.J;
                    this.G = 1;
                    if ((j = b.j(i, this)) == h) {
                        return h;
                    }
                }
                k0.q(this.I).n((Object)j);
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final LiveData<CalendarTeachingContentsResponse> l0() {
        return (LiveData<CalendarTeachingContentsResponse>)this.l;
    }
    
    public final void n0(@e final HomeWork homeWork, final boolean b) {
        kotlin.jvm.internal.k0.p(homeWork, "homework");
        HomeWorkStatus status;
        if (b == homeWork.getCompleted()) {
            status = HomeWorkStatus.NO_STATEMENT;
        }
        else if (b) {
            status = HomeWorkStatus.COMPLETED;
        }
        else {
            status = HomeWorkStatus.NOT_COMPLETED;
        }
        homeWork.setStatus(status);
        kotlinx.coroutines.h.h((kotlin.coroutines.g)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ HomeWork I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ HomeWork I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$n)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    final com.untis.mobile.services.classbook.a o2 = k0.o(this.H);
                    if (o2 == null) {
                        kotlin.jvm.internal.k0.S("classBookService");
                        throw null;
                    }
                    final HomeWork i = this.I;
                    this.G = 1;
                    if (a.a.h(o2, i, false, this, 2, null) == h) {
                        return h;
                    }
                }
                final k z = k0.z(this.H);
                if (z == null) {
                    kotlin.jvm.internal.k0.S("timetableService");
                    throw null;
                }
                final HomeWork j = this.I;
                this.G = 2;
                if (com.untis.mobile.services.timetable.placeholder.k.a.b(z, j, false, this, 2, null) == h) {
                    return h;
                }
                return j2.a;
            }
        }, 1, (Object)null);
        this.m0(homeWork);
    }
    
    @e
    public final k2 o0(final long n) {
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ long I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ long I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$o)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object next) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(next);
                    final List m = k0.m(this.H);
                    final long i = this.I;
                    final Iterator<Object> iterator = m.iterator();
                    while (true) {
                        while (iterator.hasNext()) {
                            next = iterator.next();
                            if (kotlin.coroutines.jvm.internal.b.a(((CalendarPeriodContext)next).getPeriod().getId() == i)) {
                                final CalendarPeriodContext calendarPeriodContext = (CalendarPeriodContext)next;
                                if (calendarPeriodContext == null) {
                                    return j2.a;
                                }
                                k0.u(this.H).q((Object)calendarPeriodContext.getPeriod());
                                k0.t(this.H).q((Object)calendarPeriodContext.getHomework());
                                k0.r(this.H).q((Object)calendarPeriodContext.getClassbook());
                                return j2.a;
                            }
                        }
                        next = null;
                        continue;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, 3, (Object)null);
    }
    
    @e
    public final k2 p0(@org.jetbrains.annotations.f final CalendarPeriodRoomBuilding calendarPeriodRoomBuilding) {
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ CalendarPeriodRoomBuilding I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ CalendarPeriodRoomBuilding I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$p)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.v(this.H).q((Object)this.I);
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, 3, (Object)null);
    }
    
    @e
    public final k2 q0(@org.jetbrains.annotations.f final CalendarPeriodRoomDepartment calendarPeriodRoomDepartment) {
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ CalendarPeriodRoomDepartment I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ CalendarPeriodRoomDepartment I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$q)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.w(this.H).q((Object)this.I);
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, 3, (Object)null);
    }
    
    @e
    public final k2 r0(@e final c c) {
        kotlin.jvm.internal.k0.p(c, "date");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            final /* synthetic */ c I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    final /* synthetic */ c I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$r)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    k0.s(this.H).q((Object)this.I);
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, 3, (Object)null);
    }
    
    public final void s0(@e final com.untis.mobile.services.masterdata.a f) {
        kotlin.jvm.internal.k0.p(f, "<set-?>");
        this.f = f;
    }
    
    public final void t0(@e final Profile b) {
        kotlin.jvm.internal.k0.p(b, "profile");
        this.b = b;
        this.c = new com.untis.mobile.calendar.service.b(this.a, b);
        this.d = b.getClassBookService();
        this.e = b.getTimeTableService();
        this.s0(b.getMasterDataService());
    }
    
    @e
    public final k2 u0(@e final CoroutineExceptionHandler coroutineExceptionHandler, @e final HomeWork homeWork, @e final n6.a<j2> a) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(homeWork, "homework");
        kotlin.jvm.internal.k0.p(a, "onSuccess");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>(null) {
            int G;
            final /* synthetic */ HomeWork H;
            final /* synthetic */ k0 I;
            final /* synthetic */ n6.a<j2> J;
            
            private static final void q(final k0 k0, final n6.a a, final HomeWork homeWork) {
                kotlin.jvm.internal.k0.o(homeWork, "hw");
                k0.m0(homeWork);
                a.invoke();
            }
            
            private static final void s(final Throwable t) {
                Log.e("untis_log_cal", "could not submit homework", t);
            }
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    int G;
                    final /* synthetic */ HomeWork H = this.H;
                    final /* synthetic */ k0 I = this.I;
                    final /* synthetic */ n6.a<j2> J = this.J;
                    
                    private static final void q(final k0 k0, final n6.a a, final HomeWork homeWork) {
                        kotlin.jvm.internal.k0.o(homeWork, "hw");
                        k0.m0(homeWork);
                        a.invoke();
                    }
                    
                    private static final void s(final Throwable t) {
                        Log.e("untis_log_cal", "could not submit homework", t);
                    }
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$s)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0139: {
                    if (g != 0) {
                        if (g != 1) {
                            if (g == 2) {
                                c1.n(o);
                                break Label_0139;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            c1.n(o);
                        }
                    }
                    else {
                        c1.n(o);
                        this.H.setSynced(false);
                        final com.untis.mobile.services.classbook.a o2 = k0.o(this.I);
                        if (o2 == null) {
                            kotlin.jvm.internal.k0.S("classBookService");
                            throw null;
                        }
                        final HomeWork h2 = this.H;
                        this.G = 1;
                        if (a.a.h(o2, h2, false, this, 2, null) == h) {
                            return h;
                        }
                    }
                    final k z = k0.z(this.I);
                    if (z == null) {
                        kotlin.jvm.internal.k0.S("timetableService");
                        throw null;
                    }
                    final HomeWork h3 = this.H;
                    this.G = 2;
                    if (com.untis.mobile.services.timetable.placeholder.k.a.b(z, h3, false, this, 2, null) == h) {
                        return h;
                    }
                }
                if (this.H.getLocal()) {
                    k0.this.m0(this.H);
                    this.J.invoke();
                }
                else {
                    final com.untis.mobile.services.classbook.a o3 = k0.o(this.I);
                    if (o3 == null) {
                        kotlin.jvm.internal.k0.S("classBookService");
                        throw null;
                    }
                    o3.e0(this.H).Q3(rx.android.schedulers.a.c()).C5((rx.functions.b)new com.untis.mobile.calendar.ui.period.l0(this.I, this.J), (rx.functions.b)com.untis.mobile.calendar.ui.period.m0.G);
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final k2 v0(@e final CoroutineExceptionHandler coroutineExceptionHandler, @e final String s) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(s, "content");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ k0 I;
            final /* synthetic */ String J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ k0 I = this.I;
                    final /* synthetic */ String J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$t)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                androidx.lifecycle.k0 k0;
                Object e;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k0 = (androidx.lifecycle.k0)this.G;
                    c1.n(o);
                    e = o;
                }
                else {
                    c1.n(o);
                    final CalendarPeriod calendarPeriod = (CalendarPeriod)((LiveData)com.untis.mobile.calendar.ui.period.k0.u(this.I)).f();
                    if (calendarPeriod == null) {
                        return j2.a;
                    }
                    final androidx.lifecycle.k0 u = com.untis.mobile.calendar.ui.period.k0.u(this.I);
                    final com.untis.mobile.calendar.service.a n = com.untis.mobile.calendar.ui.period.k0.n(this.I);
                    if (n == null) {
                        kotlin.jvm.internal.k0.S("calendarService");
                        throw null;
                    }
                    final String j = this.J;
                    this.G = u;
                    this.H = 1;
                    e = n.e(calendarPeriod, j, this);
                    if (e == h) {
                        return h;
                    }
                    k0 = u;
                }
                k0.q(e);
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final k2 w0(@e final CoroutineExceptionHandler coroutineExceptionHandler, @e final String s) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(s, "notesAll");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ k0 I;
            final /* synthetic */ String J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ k0 I = this.I;
                    final /* synthetic */ String J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$u)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object i) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                androidx.lifecycle.k0 u;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u = (androidx.lifecycle.k0)this.G;
                    c1.n(i);
                }
                else {
                    c1.n(i);
                    final CalendarPeriod calendarPeriod = (CalendarPeriod)((LiveData)k0.u(this.I)).f();
                    if (calendarPeriod == null) {
                        return j2.a;
                    }
                    u = k0.u(this.I);
                    final com.untis.mobile.calendar.service.a n = k0.n(this.I);
                    if (n == null) {
                        kotlin.jvm.internal.k0.S("calendarService");
                        throw null;
                    }
                    final String j = this.J;
                    this.G = u;
                    this.H = 1;
                    i = n.i(calendarPeriod, j, this);
                    if (i == h) {
                        return h;
                    }
                }
                u.q(i);
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final k2 x0(@e final CoroutineExceptionHandler coroutineExceptionHandler, @e final String s) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(s, "notesTeacher");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ k0 I;
            final /* synthetic */ String J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ k0 I = this.I;
                    final /* synthetic */ String J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$v)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object m) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                androidx.lifecycle.k0 u;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u = (androidx.lifecycle.k0)this.G;
                    c1.n(m);
                }
                else {
                    c1.n(m);
                    final CalendarPeriod calendarPeriod = (CalendarPeriod)((LiveData)k0.u(this.I)).f();
                    if (calendarPeriod == null) {
                        return j2.a;
                    }
                    u = k0.u(this.I);
                    final com.untis.mobile.calendar.service.a n = k0.n(this.I);
                    if (n == null) {
                        kotlin.jvm.internal.k0.S("calendarService");
                        throw null;
                    }
                    final String j = this.J;
                    this.G = u;
                    this.H = 1;
                    m = n.m(calendarPeriod, j, this);
                    if (m == h) {
                        return h;
                    }
                }
                u.q(m);
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final k2 y0(@e final CoroutineExceptionHandler coroutineExceptionHandler, @e final CalendarPeriodVideoCall calendarPeriodVideoCall) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(calendarPeriodVideoCall, "onlineLesson");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ k0 I;
            final /* synthetic */ CalendarPeriodVideoCall J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ k0 I = this.I;
                    final /* synthetic */ CalendarPeriodVideoCall J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$w)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object d) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                androidx.lifecycle.k0 u;
                if (h2 != 0) {
                    if (h2 != 1) {
                        if (h2 == 2) {
                            c1.n(d);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        u = (androidx.lifecycle.k0)this.G;
                        c1.n(d);
                    }
                }
                else {
                    c1.n(d);
                    final CalendarPeriod calendarPeriod = (CalendarPeriod)((LiveData)k0.u(this.I)).f();
                    if (calendarPeriod == null) {
                        return j2.a;
                    }
                    u = k0.u(this.I);
                    final com.untis.mobile.calendar.service.a n = k0.n(this.I);
                    if (n == null) {
                        kotlin.jvm.internal.k0.S("calendarService");
                        throw null;
                    }
                    final CalendarPeriodVideoCall j = this.J;
                    this.G = u;
                    this.H = 1;
                    if ((d = n.d(calendarPeriod, j, this)) == h) {
                        return h;
                    }
                }
                u.q(d);
                final k0 i = this.I;
                this.G = null;
                this.H = 2;
                if (i.C0(this) == h) {
                    return h;
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final k2 z0() {
        return kotlinx.coroutines.h.f(x0.a((w0)this), (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ k0 H;
            
            private static final void q(final Boolean b) {
            }
            
            private static final void s(final Throwable t) {
                timber.log.b.f(t);
            }
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ k0 H = this.H;
                    
                    private static final void q(final Boolean b) {
                    }
                    
                    private static final void s(final Throwable t) {
                        timber.log.b.f(t);
                    }
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((k0$x)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1.n(o);
                final com.untis.mobile.services.classbook.a o2 = k0.o(this.H);
                if (o2 != null) {
                    o2.I().C5((rx.functions.b)com.untis.mobile.calendar.ui.period.n0.G, (rx.functions.b)o0.G);
                    return j2.a;
                }
                kotlin.jvm.internal.k0.S("classBookService");
                throw null;
            }
        }, 3, (Object)null);
    }
}
