// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.infocenter;

import io.realm.RealmQuery;
import com.untis.mobile.persistence.models.profile.Right;
import io.realm.p0;
import io.realm.q;
import org.koin.core.c$a;
import java.util.concurrent.Callable;
import com.untis.mobile.persistence.models.profile.Child;
import android.content.Context;
import com.untis.mobile.utils.g0;
import com.untis.mobile.UntisMobileApplication;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import com.untis.mobile.persistence.models.timetable.period.PeriodState;
import com.untis.mobile.persistence.models.timetable.period.Period;
import org.joda.time.n0;
import kotlinx.coroutines.i1;
import java.util.Set;
import com.untis.mobile.api.common.classreg.UMClassRegEvent;
import com.untis.mobile.api.common.masterdata.UMStudent;
import com.untis.mobile.api.common.timetable.UMOfficeHour;
import com.untis.mobile.api.common.classreg.UMHomeWork;
import com.untis.mobile.api.common.classreg.UMInvigilator;
import com.untis.mobile.api.common.classreg.UMExam;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.services.profile.legacy.j0;
import com.untis.mobile.api.error.JsonRpcError;
import com.untis.mobile.api.common.JsonRpcErrorType;
import com.untis.mobile.api.dto.GetClassregDataResponse;
import com.untis.mobile.api.dto.DeleteOfficeHourRegistrationResponse;
import com.untis.mobile.api.dto.GetHomeWorkResponse;
import com.untis.mobile.api.dto.GetOfficeHoursResponse;
import com.untis.mobile.api.dto.GetExamsResponse;
import com.untis.mobile.api.dto.GetOfficeHourRegistrationsResponse;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.api.dto.GetStudentAbsencesResponse;
import kotlin.jvm.internal.j1;
import com.untis.mobile.api.dto.SubmitOwnAbsenceResponse;
import com.untis.mobile.api.common.absence.UMStudentAbsence;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import com.untis.mobile.api.common.masterdata.UMExcuse;
import com.untis.mobile.persistence.models.classbook.absence.Excuse;
import com.untis.mobile.api.dto.SubmitExcuseResponse;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import com.untis.mobile.api.enumeration.UMOfficeHourRegistrationTimeSlotState;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import com.untis.mobile.api.common.timetable.UMOfficeHourRegistrationTimeSlot;
import com.untis.mobile.api.common.error.UMError;
import com.untis.mobile.persistence.models.booking.ValidationError;
import com.untis.mobile.api.dto.SubmitOfficeHourRegistrationResponse;
import com.untis.mobile.persistence.models.officehour.OfficeHourRegistration;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.masterdata.Department;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.persistence.models.EntityType;
import org.joda.time.t;
import com.untis.mobile.persistence.models.exam.Invigilator;
import java.util.List;
import com.untis.mobile.persistence.models.exam.Exam;
import io.realm.l0;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import w4.i;
import java.util.Iterator;
import io.realm.s0;
import io.realm.f0;
import java.io.Closeable;
import kotlin.j2;
import java.util.Collection;
import com.untis.mobile.persistence.models.officehour.OfficeHourTimeSlotState;
import com.untis.mobile.persistence.models.officehour.OfficeHourTimeSlot;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.HashMap;
import com.untis.mobile.persistence.models.officehour.OfficeHour;
import java.util.Map;
import com.untis.mobile.services.timetable.placeholder.p;
import com.untis.mobile.services.masterdata.b;
import com.untis.mobile.api.ApiService;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import com.untis.mobile.persistence.realm.d;
import kotlin.jvm.internal.k0;
import com.untis.mobile.services.timetable.placeholder.k;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import org.koin.core.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010D\u001a\u00020A¢\u0006\u0004\bk\u0010lJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J!\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0011J\u001b\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u001c\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0#2\u0006\u0010\"\u001a\u00020!H\u0016J,\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e0#2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010&\u001a\u00020!H\u0016J,\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000e0#2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010&\u001a\u00020!H\u0016J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170#2\u0006\u0010)\u001a\u00020\u001bH\u0016J$\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0#2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!H\u0016J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0#2\u0006\u0010\n\u001a\u00020\tH\u0016J,\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e0#2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010&\u001a\u00020!H\u0016J,\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000e0#2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010&\u001a\u00020!H\u0016J&\u00100\u001a\b\u0012\u0004\u0012\u00020\u00170#2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010&\u001a\u00020!H\u0016J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\t0#2\u0006\u00102\u001a\u000201H\u0016J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\t0#2\u0006\u00102\u001a\u000201H\u0016J\u0016\u00107\u001a\b\u0012\u0004\u0012\u0002050#2\u0006\u00106\u001a\u000205H\u0016J\u0016\u00108\u001a\b\u0012\u0004\u0012\u0002050#2\u0006\u00106\u001a\u000205H\u0016J\u001b\u00109\u001a\u00020\u000b2\u0006\u00106\u001a\u000205H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b9\u0010:J!\u0010<\u001a\u00020\u000b2\f\u0010;\u001a\b\u0012\u0004\u0012\u0002050\u000eH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b<\u0010\u0011J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u0002050\u000eH\u0016J$\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u000e0#2\u0006\u0010\"\u001a\u00020!2\u0006\u0010&\u001a\u00020!H\u0016J&\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010&\u001a\u00020!H\u0016J$\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u000e0#2\u0006\u0010\"\u001a\u00020!2\u0006\u0010&\u001a\u00020!H\u0016R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR)\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170E8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001d\u0010S\u001a\u00020O8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010G\u001a\u0004\bQ\u0010RR\u0016\u0010W\u001a\u00020T8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001d\u0010`\u001a\u00020\\8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010G\u001a\u0004\b^\u0010_R)\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0E8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010G\u001a\u0004\bb\u0010IR\u0016\u0010g\u001a\u00020d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR)\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00140E8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010G\u001a\u0004\bi\u0010I\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006m" }, d2 = { "Lcom/untis/mobile/services/infocenter/w;", "Lcom/untis/mobile/services/infocenter/a;", "Lorg/koin/core/c;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "i0", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homeWork", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "d", "Lcom/untis/mobile/persistence/models/officehour/OfficeHour;", "officeHour", "Lkotlin/j2;", "y", "(Lcom/untis/mobile/persistence/models/officehour/OfficeHour;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "officeHours", "b", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "homeWorks", "e", "Lcom/untis/mobile/persistence/models/exam/Exam;", "exams", "j", "Lcom/untis/mobile/services/classbook/b;", "data", "i", "(Lcom/untis/mobile/services/classbook/b;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "id", "A", "Lorg/joda/time/c;", "startDateTime", "h", "Lorg/joda/time/t;", "start", "Lrx/g;", "z", "profile", "end", "g", "w", "klasseId", "p", "klassenId", "n", "r", "u", "f", "t", "Lcom/untis/mobile/persistence/models/officehour/OfficeHourRegistration;", "officeHourRegistration", "q", "l", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "studentAbsence", "x", "k", "a", "(Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;Lkotlin/coroutines/d;)Ljava/lang/Object;", "absences", "s", "o", "m", "c", "v", "", "G", "Ljava/lang/String;", "profileId", "", "P", "Lkotlin/b0;", "k0", "()Ljava/util/Map;", "teacherClassRegDataCache", "Lcom/untis/mobile/services/masterdata/a;", "J", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/api/ApiService;", "I", "f0", "()Lcom/untis/mobile/api/ApiService;", "apiService", "Lcom/untis/mobile/services/classbook/a;", "K", "Lcom/untis/mobile/services/classbook/a;", "classBookService", "Lcom/untis/mobile/utils/mapper/apiToModel/c;", "M", "Lcom/untis/mobile/utils/mapper/apiToModel/c;", "officeHourMapper", "Lcom/untis/mobile/persistence/realm/d;", "H", "j0", "()Lcom/untis/mobile/persistence/realm/d;", "realmService", "N", "h0", "officeHourCache", "Lcom/untis/mobile/services/timetable/placeholder/k;", "L", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timetableService", "O", "g0", "examsCache", "<init>", "(Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class w implements a, c
{
    @e
    private final String G;
    @e
    private final b0 H;
    @e
    private final b0 I;
    @e
    private final com.untis.mobile.services.masterdata.a J;
    @e
    private final com.untis.mobile.services.classbook.a K;
    @e
    private final k L;
    @e
    private final com.untis.mobile.utils.mapper.apiToModel.c M;
    @e
    private final b0 N;
    @e
    private final b0 O;
    @e
    private final b0 P;
    
    public w(@e final String g) {
        k0.p(g, "profileId");
        this.G = g;
        this.H = d0.c((n6.a<?>)new n6.a<d>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final d invoke() {
                return (d)this.G.t(k1.d(d.class), null, null);
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
        this.K = com.untis.mobile.services.classbook.k0.a0.a(g);
        this.L = p.Y.a(g);
        this.M = new com.untis.mobile.utils.mapper.apiToModel.c(g);
        this.N = d0.c((n6.a<?>)new n6.a<Map<Long, OfficeHour>>() {
            final /* synthetic */ w G;
            
            @e
            public final Map<Long, OfficeHour> a() {
                final HashMap<Long, OfficeHour> hashMap = new HashMap<Long, OfficeHour>();
                final f0 a = w.this.j0().a(w.this.i0());
                final w g = this.G;
                try {
                    final s0<y4.a> b0 = a.f3(y4.a.class).b0();
                    k0.o(b0, "realm.where(RealmOfficeHour::class.java)\n                            .findAll()");
                    for (final y4.a a2 : b0) {
                        final long w8 = a2.w8();
                        final long w9 = a2.w8();
                        final org.joda.time.c c = new org.joda.time.c(a2.B8());
                        final org.joda.time.c c2 = new org.joda.time.c(a2.v8());
                        final com.untis.mobile.services.masterdata.a y = w.Y(g);
                        final i c3 = a2.C8();
                        long x8;
                        if (c3 == null) {
                            x8 = 0L;
                        }
                        else {
                            x8 = c3.x8();
                        }
                        final Teacher k = y.k(x8);
                        final long x9 = a2.x8();
                        final String u8 = a2.u8();
                        final String y2 = a2.y8();
                        final String s8 = a2.s8();
                        final String t8 = a2.t8();
                        final boolean a3 = a2.A8();
                        final boolean z8 = a2.z8();
                        final l0<y4.b> e8 = a2.E8();
                        final ArrayList list = new ArrayList<OfficeHourTimeSlot>(v.Y((Iterable<?>)e8, 10));
                        for (final y4.b b2 : e8) {
                            list.add(new OfficeHourTimeSlot(new org.joda.time.c(b2.t8()), new org.joda.time.c(b2.s8()), OfficeHourTimeSlotState.Companion.fromValue(b2.u8())));
                        }
                        hashMap.put(w8, new OfficeHour(w9, c, c2, k, x9, u8, y2, s8, t8, a3, z8, v.L5((Collection<? extends OfficeHourTimeSlot>)list), a2.F8(), a2.D8()));
                    }
                    final j2 a4 = j2.a;
                    kotlin.io.c.a(a, null);
                    return hashMap;
                }
                finally {
                    try {}
                    finally {
                        final Throwable t9;
                        kotlin.io.c.a(a, t9);
                    }
                }
            }
        });
        this.O = d0.c((n6.a<?>)new n6.a<Map<Long, Exam>>() {
            final /* synthetic */ w G;
            
            @e
            public final Map<Long, Exam> a() {
                final HashMap<Long, Exam> hashMap = new HashMap<Long, Exam>();
                Object a = w.this.j0().a(w.this.i0());
                final w g = this.G;
                Object o = a;
                try {
                    final s0<p4.a> b0 = ((f0)a).f3(p4.a.class).b0();
                    o = a;
                    k0.o(b0, "realm.where(RealmInfoCenterExam::class.java)\n                            .findAll()");
                    o = a;
                    final Iterator<Object> iterator = b0.iterator();
                    while (true) {
                        o = a;
                        if (iterator.hasNext()) {
                            o = a;
                            final p4.a a2 = iterator.next();
                            o = a;
                            final long y8 = a2.y8();
                            o = a;
                            final long y9 = a2.y8();
                            o = a;
                            final String x8 = a2.x8();
                            o = a;
                            o = a;
                            final org.joda.time.c c = new org.joda.time.c(a2.D8());
                            o = a;
                            o = a;
                            final org.joda.time.c c2 = new org.joda.time.c(a2.u8());
                            o = a;
                            final Department g2 = w.Y(g).g(a2.t8());
                            o = a;
                            final Subject u = w.Y(g).U(a2.E8());
                            o = a;
                            final com.untis.mobile.services.masterdata.a y10 = w.Y(g);
                            o = a;
                            final l0<com.untis.mobile.persistence.realm.b> s8 = a2.s8();
                            o = a;
                            try {
                                final ArrayList list = new ArrayList<Long>(v.Y((Iterable<?>)s8, 10));
                                o = s8.iterator();
                                while (((Iterator)o).hasNext()) {
                                    list.add(Long.valueOf(((Iterator<com.untis.mobile.persistence.realm.b>)o).next().s8()));
                                }
                                o = y10.D((List<Long>)list);
                                final com.untis.mobile.services.masterdata.a y11 = w.Y(g);
                                final l0<com.untis.mobile.persistence.realm.b> c3 = a2.C8();
                                final ArrayList list2 = new ArrayList<Long>(v.Y((Iterable<?>)c3, 10));
                                final Iterator<Object> iterator2 = c3.iterator();
                                while (iterator2.hasNext()) {
                                    list2.add(Long.valueOf(iterator2.next().s8()));
                                }
                                final List<Room> r = y11.R((List<Long>)list2);
                                final com.untis.mobile.services.masterdata.a y12 = w.Y(g);
                                final l0<com.untis.mobile.persistence.realm.b> f8 = a2.F8();
                                final ArrayList list3 = new ArrayList<Long>(v.Y((Iterable<?>)f8, 10));
                                final Iterator<Object> iterator3 = f8.iterator();
                                while (iterator3.hasNext()) {
                                    list3.add(Long.valueOf(iterator3.next().s8()));
                                }
                                final List<Teacher> q = y12.Q((List<Long>)list3);
                                final l0<p4.b> z8 = a2.z8();
                                final ArrayList list4 = new ArrayList<Invigilator>(v.Y((Iterable<?>)z8, 10));
                                for (final p4.b b2 : z8) {
                                    Teacher k;
                                    if ((k = w.Y(g).k(b2.u8())) == null) {
                                        k = new Teacher(0L, null, null, null, null, null, 0, 0, false, false, 1023, null);
                                    }
                                    list4.add(new Invigilator(k, new org.joda.time.v(b2.t8()), new org.joda.time.v(b2.s8())));
                                }
                                hashMap.put(y8, new Exam(y9, x8, c, c2, g2, u, (List<Klasse>)o, r, q, (List<Invigilator>)list4, a2.B8(), a2.G8(), EntityType.Companion.findBy(a2.w8()), a2.v8()));
                                continue;
                            }
                            finally {
                                o = a;
                                a = g;
                            }
                            break;
                        }
                        break;
                    }
                    try {
                        final j2 a3 = j2.a;
                        kotlin.io.c.a((Closeable)a, null);
                        return hashMap;
                    }
                    finally {
                        o = a;
                    }
                }
                finally {
                    try {}
                    finally {
                        final Throwable t;
                        kotlin.io.c.a((Closeable)o, t);
                    }
                }
            }
        });
        this.P = d0.c((n6.a<?>)new n6.a<Map<Long, com.untis.mobile.services.classbook.b>>() {
            final /* synthetic */ w G;
            
            @e
            public final Map<Long, com.untis.mobile.services.classbook.b> a() {
                final HashMap<Long, com.untis.mobile.services.classbook.b> hashMap = new HashMap<Long, com.untis.mobile.services.classbook.b>();
                final f0 a = w.this.j0().a(w.this.i0());
                final w g = this.G;
                try {
                    final s0<i4.d> b0 = a.f3(i4.d.class).b0();
                    k0.o(b0, "realm.where(RealmTeacherClassRegData::class.java)\n                            .findAll()");
                    for (final i4.d d : b0) {
                        final long u8 = d.u8();
                        Klasse n;
                        if ((n = w.Y(g).N(d.u8())) == null) {
                            n = new Klasse(0L, null, null, null, null, 0, 0, false, false, 511, null);
                        }
                        final com.untis.mobile.services.masterdata.a y = w.Y(g);
                        final l0<com.untis.mobile.persistence.realm.b> v8 = d.v8();
                        final ArrayList list = new ArrayList<Long>(v.Y((Iterable<?>)v8, 10));
                        final Iterator<Object> iterator2 = v8.iterator();
                        while (iterator2.hasNext()) {
                            list.add(Long.valueOf(iterator2.next().s8()));
                        }
                        final List<Student> e = y.e((List<Long>)list);
                        final com.untis.mobile.services.classbook.a w = com.untis.mobile.services.infocenter.w.W(g);
                        final l0<com.untis.mobile.persistence.realm.b> t8 = d.t8();
                        final ArrayList list2 = new ArrayList<Long>(v.Y((Iterable<?>)t8, 10));
                        final Iterator<Object> iterator3 = t8.iterator();
                        while (iterator3.hasNext()) {
                            list2.add(Long.valueOf(iterator3.next().s8()));
                        }
                        final List<Event> e2 = w.E((Collection<Long>)list2);
                        final com.untis.mobile.services.classbook.a w2 = com.untis.mobile.services.infocenter.w.W(g);
                        final l0<com.untis.mobile.persistence.realm.b> s8 = d.s8();
                        final ArrayList list3 = new ArrayList<Long>(v.Y((Iterable<?>)s8, 10));
                        final Iterator<Object> iterator4 = s8.iterator();
                        while (iterator4.hasNext()) {
                            list3.add(Long.valueOf(iterator4.next().s8()));
                        }
                        hashMap.put(u8, new com.untis.mobile.services.classbook.b(n, e, e2, w2.u((Collection<Long>)list3)));
                    }
                    final j2 a2 = j2.a;
                    kotlin.io.c.a(a, null);
                    return hashMap;
                }
                finally {
                    try {}
                    finally {
                        final Throwable t9;
                        kotlin.io.c.a(a, t9);
                    }
                }
            }
        });
    }
    
    private static final OfficeHour A0(final w w, final OfficeHourRegistration officeHourRegistration, final SubmitOfficeHourRegistrationResponse submitOfficeHourRegistrationResponse) {
        k0.p(w, "this$0");
        k0.p(officeHourRegistration, "$officeHourRegistration");
        final OfficeHour a = w.A(officeHourRegistration.getOfficeHourId());
        if (a != null) {
            final List<UMError> errors = submitOfficeHourRegistrationResponse.errors;
            if (errors != null) {
                k0.o(errors, "response.errors");
                if (errors.isEmpty() ^ true) {
                    final List<UMError> errors2 = submitOfficeHourRegistrationResponse.errors;
                    k0.o(errors2, "response.errors");
                    final ArrayList list = new ArrayList<ValidationError>(v.Y((Iterable<?>)errors2, 10));
                    final Iterator<Object> iterator = errors2.iterator();
                    while (iterator.hasNext()) {
                        list.add(com.untis.mobile.utils.mapper.api.c.j().i(iterator.next()));
                    }
                    throw new f5.a((List<ValidationError>)list);
                }
            }
            final List<UMOfficeHourRegistrationTimeSlot> timeSlots = submitOfficeHourRegistrationResponse.timeSlots;
            k0.o(timeSlots, "response.timeSlots");
            final ArrayList list2 = new ArrayList<OfficeHourTimeSlot>(v.Y((Iterable<?>)timeSlots, 10));
            for (final UMOfficeHourRegistrationTimeSlot umOfficeHourRegistrationTimeSlot : timeSlots) {
                final org.joda.time.c c = com.untis.mobile.utils.mapper.common.b.c(umOfficeHourRegistrationTimeSlot.startTime);
                k0.o(c, "isoStringToDateTime(umTimeSlot.startTime)");
                final org.joda.time.c c2 = com.untis.mobile.utils.mapper.common.b.c(umOfficeHourRegistrationTimeSlot.endTime);
                k0.o(c2, "isoStringToDateTime(umTimeSlot.endTime)");
                final OfficeHourTimeSlotState.Companion companion = OfficeHourTimeSlotState.Companion;
                final UMOfficeHourRegistrationTimeSlotState state = umOfficeHourRegistrationTimeSlot.state;
                k0.o(state, "umTimeSlot.state");
                list2.add(new OfficeHourTimeSlot(c, c2, companion.fromUmOfficeHourTimeSlotState(state)));
            }
            a.setTimeSlots(v.L5((Collection<? extends OfficeHourTimeSlot>)list2));
            final List<OfficeHourTimeSlot> timeSlots2 = a.getTimeSlots();
            final boolean b = timeSlots2 instanceof Collection;
            final boolean b2 = false;
            boolean registered = false;
            Label_0367: {
                if (b && timeSlots2.isEmpty()) {
                    registered = b2;
                }
                else {
                    final Iterator<Object> iterator3 = timeSlots2.iterator();
                    do {
                        registered = b2;
                        if (iterator3.hasNext()) {
                            continue;
                        }
                        break Label_0367;
                    } while (iterator3.next().getState() != OfficeHourTimeSlotState.SELF);
                    registered = true;
                }
            }
            a.setRegistered(registered);
            h.h((g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                int G;
                final /* synthetic */ w H;
                final /* synthetic */ OfficeHour I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ w H = this.H;
                        final /* synthetic */ OfficeHour I = this.I;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((w$s)this.create(r0, d)).invokeSuspend(j2.a);
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
                        final w h2 = this.H;
                        final OfficeHour i = this.I;
                        this.G = 1;
                        if (h2.y(i, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
            return a;
        }
        throw new IllegalArgumentException("no valid office hour found");
    }
    
    private static final StudentAbsence B0(final w w, final StudentAbsence studentAbsence, final SubmitExcuseResponse submitExcuseResponse) {
        k0.p(w, "this$0");
        k0.p(studentAbsence, "$studentAbsence");
        final List<UMError> errors = submitExcuseResponse.errors;
        if (errors != null) {
            k0.o(errors, "response.errors");
            if (errors.isEmpty() ^ true) {
                final List<UMError> errors2 = submitExcuseResponse.errors;
                k0.o(errors2, "response.errors");
                final ArrayList list = new ArrayList<ValidationError>(v.Y((Iterable<?>)errors2, 10));
                final Iterator<Object> iterator = errors2.iterator();
                while (iterator.hasNext()) {
                    list.add(com.untis.mobile.utils.mapper.api.c.j().i(iterator.next()));
                }
                throw new f5.a((List<ValidationError>)list);
            }
        }
        Excuse excuse = null;
        if (submitExcuseResponse.absence.excuse != null) {
            final UMExcuse excuse2 = submitExcuseResponse.absence.excuse;
            final long id = excuse2.id;
            final ExcuseStatus c = w.J.c(excuse2.excuseStatusId);
            final String text = submitExcuseResponse.absence.excuse.text;
            k0.o(text, "response.absence.excuse.text");
            final UMExcuse excuse3 = submitExcuseResponse.absence.excuse;
            final long number = excuse3.number;
            final t d = com.untis.mobile.utils.mapper.common.b.d(excuse3.date);
            k0.o(d, "isoStringToLocalDate(response.absence.excuse.date)");
            excuse = new Excuse(id, c, text, number, d);
        }
        final long id2 = studentAbsence.getId();
        final long periodId = studentAbsence.getPeriodId();
        final Student student = studentAbsence.getStudent();
        final Klasse klasse = studentAbsence.getKlasse();
        final org.joda.time.c start = studentAbsence.getStart();
        final org.joda.time.c end = studentAbsence.getEnd();
        final boolean excused = submitExcuseResponse.absence.excused;
        final AbsenceReason absenceReason = studentAbsence.getAbsenceReason();
        final UMStudentAbsence absence = submitExcuseResponse.absence;
        final boolean owner = absence.owner;
        final String text2 = absence.text;
        k0.o(text2, "response.absence.text");
        return new StudentAbsence(id2, periodId, student, klasse, start, end, excused, absenceReason, owner, text2, excuse, true);
    }
    
    private static final StudentAbsence C0(final w w, final SubmitOwnAbsenceResponse submitOwnAbsenceResponse) {
        k0.p(w, "this$0");
        final List<UMError> errors = submitOwnAbsenceResponse.errors;
        k0.o(errors, "response.errors");
        if (errors.isEmpty() ^ true) {
            final List<UMError> errors2 = submitOwnAbsenceResponse.errors;
            k0.o(errors2, "response.errors");
            final ArrayList<ValidationError> list = new ArrayList<ValidationError>();
            final Iterator<Object> iterator = errors2.iterator();
            while (iterator.hasNext()) {
                final ValidationError i = com.untis.mobile.utils.mapper.api.c.j().i(iterator.next());
                if (i != null) {
                    list.add(i);
                }
            }
            throw new f5.a(list);
        }
        final j1.h h = new j1.h();
        final UMExcuse excuse = submitOwnAbsenceResponse.absence.excuse;
        if (excuse != null) {
            final long id = excuse.id;
            final ExcuseStatus c = w.J.c(excuse.excuseStatusId);
            String text;
            if ((text = excuse.text) == null) {
                text = "";
            }
            final long number = excuse.number;
            final t d = com.untis.mobile.utils.mapper.common.b.d(excuse.date);
            k0.o(d, "isoStringToLocalDate(umExcuse.date)");
            h.G = (T)new Excuse(id, c, text, number, d);
        }
        return (StudentAbsence)kotlinx.coroutines.h.h((g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super StudentAbsence>, Object>(null) {
            int G;
            final /* synthetic */ w H;
            final /* synthetic */ SubmitOwnAbsenceResponse I;
            final /* synthetic */ j1.h<Excuse> J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super StudentAbsence>, Object>(d) {
                    int G;
                    final /* synthetic */ w H = this.H;
                    final /* synthetic */ SubmitOwnAbsenceResponse I = this.I;
                    final /* synthetic */ j1.h<Excuse> J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super StudentAbsence> d) {
                return ((w$t)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object a) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(a);
                }
                else {
                    c1.n(a);
                    final com.untis.mobile.services.classbook.a w = com.untis.mobile.services.infocenter.w.W(this.H);
                    final long id = this.I.absence.id;
                    Student v;
                    if ((v = com.untis.mobile.services.infocenter.w.Y(this.H).V(this.I.absence.studentId)) == null) {
                        v = new Student(this.I.absence.studentId, null, null, null, null, 30, null);
                    }
                    final Klasse n = com.untis.mobile.services.infocenter.w.Y(this.H).N(this.I.absence.klasseId);
                    final org.joda.time.c c = com.untis.mobile.utils.mapper.common.b.c(this.I.absence.startDateTime);
                    k0.o(c, "isoStringToDateTime(response.absence.startDateTime)");
                    final org.joda.time.c c2 = com.untis.mobile.utils.mapper.common.b.c(this.I.absence.endDateTime);
                    k0.o(c2, "isoStringToDateTime(response.absence.endDateTime)");
                    final boolean excused = this.I.absence.excused;
                    final AbsenceReason h2 = com.untis.mobile.services.infocenter.w.Y(this.H).H(this.I.absence.absenceReasonId);
                    final UMStudentAbsence absence = this.I.absence;
                    final boolean owner = absence.owner;
                    String text;
                    if ((text = absence.text) == null) {
                        text = "";
                    }
                    a = new StudentAbsence(id, 0L, v, n, c, c2, excused, h2, owner, text, this.J.G, true);
                    this.G = 1;
                    if ((a = w.a((StudentAbsence)a, this)) == h) {
                        return h;
                    }
                }
                return a;
            }
        }, 1, (Object)null);
    }
    
    private static final com.untis.mobile.services.classbook.b D0(final w w, final long l) {
        k0.p(w, "this$0");
        com.untis.mobile.services.classbook.b b;
        if ((b = w.k0().get(l)) == null) {
            b = new com.untis.mobile.services.classbook.b(null, null, null, null, 15, null);
        }
        return b;
    }
    
    public static final /* synthetic */ com.untis.mobile.services.classbook.a W(final w w) {
        return w.K;
    }
    
    public static final /* synthetic */ com.untis.mobile.services.masterdata.a Y(final w w) {
        return w.J;
    }
    
    private static final OfficeHour d0(final w w, final OfficeHourRegistration officeHourRegistration, final DeleteOfficeHourRegistrationResponse deleteOfficeHourRegistrationResponse) {
        k0.p(w, "this$0");
        k0.p(officeHourRegistration, "$officeHourRegistration");
        final List<UMError> errors = deleteOfficeHourRegistrationResponse.errors;
        if (errors != null) {
            k0.o(errors, "result.errors");
            if (errors.isEmpty() ^ true) {
                final List<UMError> errors2 = deleteOfficeHourRegistrationResponse.errors;
                k0.o(errors2, "result.errors");
                final ArrayList<ValidationError> list = new ArrayList<ValidationError>();
                final Iterator<Object> iterator = errors2.iterator();
                while (iterator.hasNext()) {
                    final ValidationError i = com.untis.mobile.utils.mapper.api.c.j().i(iterator.next());
                    if (i != null) {
                        list.add(i);
                    }
                }
                throw new f5.a(list);
            }
        }
        final OfficeHour a = w.A(officeHourRegistration.getOfficeHourId());
        if (a != null) {
            for (final OfficeHourTimeSlot officeHourTimeSlot : a.getTimeSlots()) {
                if (((org.joda.time.base.c)officeHourTimeSlot.getStart()).X4((org.joda.time.l0)officeHourRegistration.getStart()) && ((org.joda.time.base.c)officeHourTimeSlot.getEnd()).X4((org.joda.time.l0)officeHourRegistration.getEnd())) {
                    officeHourTimeSlot.setState(OfficeHourTimeSlotState.FREE);
                }
            }
            final List<OfficeHourTimeSlot> timeSlots = a.getTimeSlots();
            final boolean b = timeSlots instanceof Collection;
            final boolean b2 = false;
            boolean registered = false;
            Label_0293: {
                if (b && timeSlots.isEmpty()) {
                    registered = b2;
                }
                else {
                    final Iterator<Object> iterator3 = timeSlots.iterator();
                    do {
                        registered = b2;
                        if (iterator3.hasNext()) {
                            continue;
                        }
                        break Label_0293;
                    } while (iterator3.next().getState() != OfficeHourTimeSlotState.SELF);
                    registered = true;
                }
            }
            a.setRegistered(registered);
            h.h((g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                int G;
                final /* synthetic */ w H;
                final /* synthetic */ OfficeHour I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ w H = this.H;
                        final /* synthetic */ OfficeHour I = this.I;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((w$a)this.create(r0, d)).invokeSuspend(j2.a);
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
                        final w h2 = this.H;
                        final OfficeHour i = this.I;
                        this.G = 1;
                        if (h2.y(i, this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
            return a;
        }
        throw new RuntimeException("no contactHour", new JsonRpcError(JsonRpcErrorType.NoSuccess));
    }
    
    private static final List e0(final w w, final org.joda.time.c c, final org.joda.time.c c2, final ArrayList list) {
        k0.p(w, "this$0");
        k0.p(list, "$studentIds");
        final Collection<Exam> values = w.g0().values();
        final ArrayList<Exam> list2 = new ArrayList<Exam>();
        for (final Exam next : values) {
            final Exam exam = next;
            final boolean c3 = ((org.joda.time.base.c)c).C((org.joda.time.l0)exam.getStart());
            boolean b = false;
            if (!c3 || !((org.joda.time.base.c)c2).C((org.joda.time.l0)exam.getEnd())) {
                if (exam.getEntityType() == EntityType.STUDENT) {
                    if (list.contains(exam.getEntityId())) {
                        b = true;
                    }
                }
            }
            if (b) {
                list2.add(next);
            }
        }
        return list2;
    }
    
    private final ApiService f0() {
        return this.I.getValue();
    }
    
    private final Map<Long, Exam> g0() {
        return this.O.getValue();
    }
    
    private final Map<Long, OfficeHour> h0() {
        return this.N.getValue();
    }
    
    private final Profile i0() {
        final Profile l = j0.G.l(this.G);
        k0.m(l);
        return l;
    }
    
    private final d j0() {
        return this.H.getValue();
    }
    
    private final Map<Long, com.untis.mobile.services.classbook.b> k0() {
        return this.P.getValue();
    }
    
    private static final List l0(final w w, final org.joda.time.c c, final org.joda.time.c c2, final ArrayList list) {
        k0.p(w, "this$0");
        k0.p(list, "$studentIds");
        final List f = a.a.f(w.K, null, 1, null);
        final ArrayList<HomeWork> list2 = new ArrayList<HomeWork>();
        for (final HomeWork next : f) {
            final HomeWork homeWork = next;
            final boolean c3 = ((org.joda.time.base.c)c).C((org.joda.time.l0)homeWork.getStart());
            boolean b = false;
            Label_0145: {
                if (!c3 || !((org.joda.time.base.c)c2).C((org.joda.time.l0)homeWork.getEnd())) {
                    if (!list.isEmpty()) {
                        if (homeWork.getEntityType() != EntityType.STUDENT) {
                            break Label_0145;
                        }
                        if (!list.contains(homeWork.getEntityId())) {
                            break Label_0145;
                        }
                    }
                    b = true;
                }
            }
            if (b) {
                list2.add(next);
            }
        }
        return list2;
    }
    
    private static final List m0(final w w, final t t) {
        k0.p(w, "this$0");
        k0.p(t, "$start");
        final Collection<OfficeHour> values = w.h0().values();
        final ArrayList<OfficeHour> list = new ArrayList<OfficeHour>();
        for (final OfficeHour next : values) {
            if (((org.joda.time.base.c)next.getStart()).R((org.joda.time.l0)t.F0())) {
                list.add(next);
            }
        }
        return list;
    }
    
    private static final List n0(final w w, final EntityType entityType, final long n, final GetExamsResponse getExamsResponse) {
        k0.p(w, "this$0");
        k0.p(entityType, "$entityType");
        final List<UMExam> exams = getExamsResponse.exams;
        k0.o(exams, "response.exams");
        final ArrayList list = new ArrayList<Exam>(v.Y((Iterable<?>)exams, 10));
        for (final UMExam umExam : exams) {
            final long id = umExam.id;
            String examType;
            if ((examType = umExam.examType) == null) {
                examType = "";
            }
            final org.joda.time.c c = com.untis.mobile.utils.mapper.common.b.c(umExam.startDateTime);
            k0.o(c, "isoStringToDateTime(umExam.startDateTime)");
            final org.joda.time.c c2 = com.untis.mobile.utils.mapper.common.b.c(umExam.endDateTime);
            k0.o(c2, "isoStringToDateTime(umExam.endDateTime)");
            final Department g = w.J.g(umExam.departmentId);
            final Subject u = w.J.U(umExam.subjectId);
            final com.untis.mobile.services.masterdata.a j = w.J;
            final List<Long> klasseIds = umExam.klasseIds;
            k0.o(klasseIds, "umExam.klasseIds");
            final List<Klasse> d = j.D(klasseIds);
            final com.untis.mobile.services.masterdata.a i = w.J;
            final List<Long> roomIds = umExam.roomIds;
            k0.o(roomIds, "umExam.roomIds");
            final List<Room> r = i.R(roomIds);
            final com.untis.mobile.services.masterdata.a k = w.J;
            final List<Long> teacherIds = umExam.teacherIds;
            k0.o(teacherIds, "umExam.teacherIds");
            final List<Teacher> q = k.Q(teacherIds);
            final List<UMInvigilator> invigilators = umExam.invigilators;
            k0.o(invigilators, "umExam.invigilators");
            final ArrayList list2 = new ArrayList<Invigilator>(v.Y((Iterable<?>)invigilators, 10));
            for (final UMInvigilator umInvigilator : invigilators) {
                Teacher l;
                if ((l = w.J.k(umInvigilator.id)) == null) {
                    l = new Teacher(0L, null, null, null, null, null, 0, 0, false, false, 1023, null);
                }
                final org.joda.time.v e = com.untis.mobile.utils.mapper.common.b.e(umInvigilator.startTime);
                k0.o(e, "isoStringToLocalTime(umInvigilator.startTime)");
                final org.joda.time.v e2 = com.untis.mobile.utils.mapper.common.b.e(umInvigilator.endTime);
                k0.o(e2, "isoStringToLocalTime(umInvigilator.endTime)");
                list2.add(new Invigilator(l, e, e2));
            }
            String name = umExam.name;
            if (name == null) {
                name = "";
            }
            String text = umExam.text;
            if (text == null) {
                text = "";
            }
            list.add(new Exam(id, examType, c, c2, g, u, d, r, q, (List<Invigilator>)list2, name, text, entityType, n));
        }
        return list;
    }
    
    private static final rx.g o0(final w w, final Profile profile, final t t, final t t2, final Long n) {
        k0.p(w, "this$0");
        k0.p(profile, "$profile");
        k0.p(t, "$start");
        k0.p(t2, "$end");
        final ApiService f0 = w.f0();
        final EntityType student = EntityType.STUDENT;
        k0.o(n, "entityId");
        return f0.getExams(profile, student, n, t, t2).k3((rx.functions.p)new j(w, n));
    }
    
    private static final List p0(final w w, final Long n, final GetExamsResponse getExamsResponse) {
        k0.p(w, "this$0");
        final List<UMExam> exams = getExamsResponse.exams;
        k0.o(exams, "response.exams");
        final ArrayList list = new ArrayList<Exam>(v.Y((Iterable<?>)exams, 10));
        for (final UMExam umExam : exams) {
            final long id = umExam.id;
            String examType = umExam.examType;
            if (examType == null) {
                examType = "";
            }
            final org.joda.time.c c = com.untis.mobile.utils.mapper.common.b.c(umExam.startDateTime);
            k0.o(c, "isoStringToDateTime(umExam.startDateTime)");
            final org.joda.time.c c2 = com.untis.mobile.utils.mapper.common.b.c(umExam.endDateTime);
            k0.o(c2, "isoStringToDateTime(umExam.endDateTime)");
            final Department g = w.J.g(umExam.departmentId);
            final Subject u = w.J.U(umExam.subjectId);
            final com.untis.mobile.services.masterdata.a j = w.J;
            final List<Long> klasseIds = umExam.klasseIds;
            k0.o(klasseIds, "umExam.klasseIds");
            final List<Klasse> d = j.D(klasseIds);
            final com.untis.mobile.services.masterdata.a i = w.J;
            final List<Long> roomIds = umExam.roomIds;
            k0.o(roomIds, "umExam.roomIds");
            final List<Room> r = i.R(roomIds);
            final com.untis.mobile.services.masterdata.a k = w.J;
            final List<Long> teacherIds = umExam.teacherIds;
            k0.o(teacherIds, "umExam.teacherIds");
            final List<Teacher> q = k.Q(teacherIds);
            final List<UMInvigilator> invigilators = umExam.invigilators;
            k0.o(invigilators, "umExam.invigilators");
            final ArrayList list2 = new ArrayList<Invigilator>(v.Y((Iterable<?>)invigilators, 10));
            for (final UMInvigilator umInvigilator : invigilators) {
                Teacher l;
                if ((l = w.J.k(umInvigilator.id)) == null) {
                    l = new Teacher(0L, null, null, null, null, null, 0, 0, false, false, 1023, null);
                }
                final org.joda.time.v e = com.untis.mobile.utils.mapper.common.b.e(umInvigilator.startTime);
                k0.o(e, "isoStringToLocalTime(umInvigilator.startTime)");
                final org.joda.time.v e2 = com.untis.mobile.utils.mapper.common.b.e(umInvigilator.endTime);
                k0.o(e2, "isoStringToLocalTime(umInvigilator.endTime)");
                list2.add(new Invigilator(l, e, e2));
            }
            String name;
            if ((name = umExam.name) == null) {
                name = "";
            }
            String text;
            if ((text = umExam.text) == null) {
                text = "";
            }
            final EntityType student = EntityType.STUDENT;
            k0.o(n, "entityId");
            list.add(new Exam(id, examType, c, c2, g, u, d, r, q, (List<Invigilator>)list2, name, text, student, n));
        }
        return list;
    }
    
    private static final List q0(final w w, final EntityType entityType, final long n, final GetHomeWorkResponse getHomeWorkResponse) {
        k0.p(w, "this$0");
        k0.p(entityType, "$entityType");
        final List<UMHomeWork> homeWorks = getHomeWorkResponse.homeWorks;
        k0.o(homeWorks, "response.homeWorks");
        final ArrayList list = new ArrayList<HomeWork>(v.Y((Iterable<?>)homeWorks, 10));
        final Iterator<Object> iterator = homeWorks.iterator();
        while (iterator.hasNext()) {
            list.add((HomeWork)h.h((g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super HomeWork>, Object>(n) {
                int G;
                final /* synthetic */ w H;
                final /* synthetic */ UMHomeWork I;
                final /* synthetic */ EntityType J;
                final /* synthetic */ long K;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super HomeWork>, Object>() {
                        int G;
                        final /* synthetic */ w H = this.H;
                        final /* synthetic */ UMHomeWork I = this.I;
                        final /* synthetic */ EntityType J = this.J;
                        final /* synthetic */ long K = this.K;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super HomeWork> d) {
                    return ((w$d)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e Object h) {
                    final Object h2 = kotlin.coroutines.intrinsics.b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(h);
                    }
                    else {
                        c1.n(h);
                        final com.untis.mobile.services.classbook.a w = com.untis.mobile.services.infocenter.w.W(this.H);
                        final com.untis.mobile.utils.mapper.realmToModel.p a = com.untis.mobile.utils.mapper.realmToModel.p.a;
                        final UMHomeWork i = this.I;
                        k0.o(i, "umHomeWork");
                        final HomeWork a2 = a.a(0L, i, this.J, this.K);
                        this.G = 1;
                        if ((h = com.untis.mobile.services.classbook.a.a.h(w, a2, false, this, 2, null)) == h2) {
                            return h2;
                        }
                    }
                    return h;
                }
            }, 1, (Object)null));
        }
        return list;
    }
    
    private static final rx.g r0(final Throwable t) {
        k0.p(t, "throwable");
        if (com.untis.mobile.utils.extension.f.d(t)) {
            return com.untis.mobile.utils.l0.a(v.E());
        }
        throw t;
    }
    
    private static final rx.g s0(final w w, final Profile profile, final t t, final t t2, final Long n) {
        k0.p(w, "this$0");
        k0.p(profile, "$profile");
        k0.p(t, "$start");
        k0.p(t2, "$end");
        final ApiService f0 = w.f0();
        final EntityType student = EntityType.STUDENT;
        k0.o(n, "entityId");
        return f0.getHomeWorks(profile, student, n, t, t2).d4((rx.functions.p)n.G).k3((rx.functions.p)new com.untis.mobile.services.infocenter.k(w, n));
    }
    
    private static final rx.g t0(final Throwable t) {
        return rx.g.U2((Object)null);
    }
    
    private static final List u0(final w w, final Long n, final GetHomeWorkResponse getHomeWorkResponse) {
        k0.p(w, "this$0");
        if (getHomeWorkResponse == null) {
            return new ArrayList();
        }
        final List<UMHomeWork> homeWorks = getHomeWorkResponse.homeWorks;
        k0.o(homeWorks, "response.homeWorks");
        final ArrayList list = new ArrayList<HomeWork>(v.Y((Iterable<?>)homeWorks, 10));
        final Iterator<Object> iterator = homeWorks.iterator();
        while (iterator.hasNext()) {
            list.add((HomeWork)h.h((g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super HomeWork>, Object>(null) {
                int G;
                final /* synthetic */ w H;
                final /* synthetic */ UMHomeWork I;
                final /* synthetic */ Long J;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super HomeWork>, Object>(d) {
                        int G;
                        final /* synthetic */ w H = this.H;
                        final /* synthetic */ UMHomeWork I = this.I;
                        final /* synthetic */ Long J = this.J;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super HomeWork> d) {
                    return ((w$e)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e Object h) {
                    final Object h2 = kotlin.coroutines.intrinsics.b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(h);
                    }
                    else {
                        c1.n(h);
                        final com.untis.mobile.services.classbook.a w = com.untis.mobile.services.infocenter.w.W(this.H);
                        final com.untis.mobile.utils.mapper.realmToModel.p a = com.untis.mobile.utils.mapper.realmToModel.p.a;
                        final UMHomeWork i = this.I;
                        k0.o(i, "umHomeWork");
                        final EntityType student = EntityType.STUDENT;
                        final Long j = this.J;
                        k0.o(j, "entityId");
                        final HomeWork a2 = a.a(0L, i, student, j.longValue());
                        this.G = 1;
                        if ((h = com.untis.mobile.services.classbook.a.a.h(w, a2, false, this, 2, null)) == h2) {
                            return h2;
                        }
                    }
                    return h;
                }
            }, 1, (Object)null));
        }
        return list;
    }
    
    private static final OfficeHour v0(final OfficeHour officeHour, final w w, final GetOfficeHourRegistrationsResponse getOfficeHourRegistrationsResponse) {
        k0.p(officeHour, "$officeHour");
        k0.p(w, "this$0");
        final String userText = getOfficeHourRegistrationsResponse.userText;
        final String s = "";
        String userText2 = userText;
        if (userText == null) {
            userText2 = "";
        }
        officeHour.setUserText(userText2);
        String teacherText = getOfficeHourRegistrationsResponse.teacherText;
        if (teacherText == null) {
            teacherText = s;
        }
        officeHour.setTeacherText(teacherText);
        final List<UMOfficeHourRegistrationTimeSlot> timeSlots = getOfficeHourRegistrationsResponse.timeSlots;
        k0.o(timeSlots, "result.timeSlots");
        final ArrayList list = new ArrayList<OfficeHourTimeSlot>(v.Y((Iterable<?>)timeSlots, 10));
        for (final UMOfficeHourRegistrationTimeSlot umOfficeHourRegistrationTimeSlot : timeSlots) {
            final org.joda.time.c v4 = ((org.joda.time.base.e)com.untis.mobile.utils.mapper.common.b.e(umOfficeHourRegistrationTimeSlot.startTime)).V4((org.joda.time.l0)officeHour.getStart());
            k0.o(v4, "isoStringToLocalTime(umOfficeHourTimeSlot.startTime).toDateTime(officeHour.start)");
            final org.joda.time.c v5 = ((org.joda.time.base.e)com.untis.mobile.utils.mapper.common.b.e(umOfficeHourRegistrationTimeSlot.endTime)).V4((org.joda.time.l0)officeHour.getStart());
            k0.o(v5, "isoStringToLocalTime(umOfficeHourTimeSlot.endTime).toDateTime(officeHour.start)");
            final OfficeHourTimeSlotState.Companion companion = OfficeHourTimeSlotState.Companion;
            final UMOfficeHourRegistrationTimeSlotState state = umOfficeHourRegistrationTimeSlot.state;
            k0.o(state, "umOfficeHourTimeSlot.state");
            list.add(new OfficeHourTimeSlot(v4, v5, companion.fromUmOfficeHourTimeSlotState(state)));
        }
        officeHour.setTimeSlots(v.L5((Collection<? extends OfficeHourTimeSlot>)list));
        h.h((g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ w H;
            final /* synthetic */ OfficeHour I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ w H = this.H;
                    final /* synthetic */ OfficeHour I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((w$f)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final w h2 = this.H;
                    final OfficeHour i = this.I;
                    this.G = 1;
                    if (h2.y(i, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 1, (Object)null);
        return officeHour;
    }
    
    private static final List w0(final w w, final GetOfficeHoursResponse getOfficeHoursResponse) {
        k0.p(w, "this$0");
        final List<UMOfficeHour> officeHours = getOfficeHoursResponse.officeHours;
        k0.o(officeHours, "response.officeHours");
        final ArrayList list = new ArrayList<OfficeHour>(v.Y((Iterable<?>)officeHours, 10));
        for (final UMOfficeHour umOfficeHour : officeHours) {
            final com.untis.mobile.utils.mapper.apiToModel.c m = w.M;
            k0.o(umOfficeHour, "it");
            list.add(m.a(umOfficeHour));
        }
        return list;
    }
    
    private static final List x0(final w w, final List list) {
        k0.p(w, "this$0");
        h.h((g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ List<OfficeHour> I;
            final /* synthetic */ w J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ List<OfficeHour> I = this.I;
                    final /* synthetic */ w J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((w$g)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                Iterator<OfficeHour> iterator2;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final Iterator iterator = (Iterator)this.G;
                    c1.n(o);
                    iterator2 = (Iterator<OfficeHour>)iterator;
                }
                else {
                    c1.n(o);
                    iterator2 = this.I.iterator();
                }
                while (iterator2.hasNext()) {
                    final OfficeHour officeHour = iterator2.next();
                    final w j = this.J;
                    this.G = iterator2;
                    this.H = 1;
                    if (j.y(officeHour, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 1, (Object)null);
        return list;
    }
    
    private static final List y0(final w w, final GetStudentAbsencesResponse getStudentAbsencesResponse) {
        k0.p(w, "this$0");
        final List<UMStudentAbsence> absences = getStudentAbsencesResponse.absences;
        k0.o(absences, "response.absences");
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        final Iterator<Object> iterator = absences.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            Excuse excuse = null;
            if (!hasNext) {
                break;
            }
            final UMStudentAbsence umStudentAbsence = iterator.next();
            if (umStudentAbsence.excuse != null) {
                final UMExcuse excuse2 = umStudentAbsence.excuse;
                final long id = excuse2.id;
                final ExcuseStatus c = w.J.c(excuse2.excuseStatusId);
                final String text = umStudentAbsence.excuse.text;
                k0.o(text, "umAbsence.excuse.text");
                final UMExcuse excuse3 = umStudentAbsence.excuse;
                final long number = excuse3.number;
                final t d = com.untis.mobile.utils.mapper.common.b.d(excuse3.date);
                k0.o(d, "isoStringToLocalDate(umAbsence.excuse.date)");
                excuse = new Excuse(id, c, text, number, d);
            }
            final long id2 = umStudentAbsence.id;
            Student v;
            if ((v = w.J.V(umStudentAbsence.studentId)) == null) {
                v = new Student(umStudentAbsence.studentId, null, null, null, null, 30, null);
            }
            final Klasse n = w.J.N(umStudentAbsence.klasseId);
            final org.joda.time.c c2 = com.untis.mobile.utils.mapper.common.b.c(umStudentAbsence.startDateTime);
            k0.o(c2, "isoStringToDateTime(umAbsence.startDateTime)");
            final org.joda.time.c c3 = com.untis.mobile.utils.mapper.common.b.c(umStudentAbsence.endDateTime);
            k0.o(c3, "isoStringToDateTime(umAbsence.endDateTime)");
            final boolean excused = umStudentAbsence.excused;
            final AbsenceReason h = w.J.H(umStudentAbsence.absenceReasonId);
            final boolean owner = umStudentAbsence.owner;
            final String text2 = umStudentAbsence.text;
            k0.o(text2, "umAbsence.text");
            list.add(new StudentAbsence(id2, 0L, v, n, c2, c3, excused, h, owner, text2, excuse, true));
        }
        h.h((g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ w H;
            final /* synthetic */ List<StudentAbsence> I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ w H = this.H;
                    final /* synthetic */ List<StudentAbsence> I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((w$h)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final w h2 = this.H;
                    final List<StudentAbsence> i = this.I;
                    this.G = 1;
                    if (h2.s(i, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 1, (Object)null);
        return list;
    }
    
    private static final com.untis.mobile.services.classbook.b z0(final w w, final long n, final GetClassregDataResponse getClassregDataResponse) {
        k0.p(w, "this$0");
        return (com.untis.mobile.services.classbook.b)h.h((g)null, (n6.p)new n6.p<r0, kotlin.coroutines.d<? super com.untis.mobile.services.classbook.b>, Object>(new com.untis.mobile.utils.mapper.realmToModel.j(w.G)) {
            Object G;
            Object H;
            Object I;
            Object J;
            Object K;
            Object L;
            Object M;
            Object N;
            int O;
            final /* synthetic */ w P;
            final /* synthetic */ GetClassregDataResponse Q;
            final /* synthetic */ long R;
            final /* synthetic */ com.untis.mobile.utils.mapper.realmToModel.j S;
            final /* synthetic */ com.untis.mobile.utils.mapper.apiToModel.d T;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super com.untis.mobile.services.classbook.b>, Object>() {
                    Object G;
                    Object H;
                    Object I;
                    Object J;
                    Object K;
                    Object L;
                    Object M;
                    Object N;
                    int O;
                    final /* synthetic */ w P = this.P;
                    final /* synthetic */ GetClassregDataResponse Q = this.Q;
                    final /* synthetic */ long R = this.R;
                    final /* synthetic */ com.untis.mobile.utils.mapper.realmToModel.j S = this.S;
                    final /* synthetic */ com.untis.mobile.utils.mapper.apiToModel.d T = this.T;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super com.untis.mobile.services.classbook.b> d) {
                return ((w$i)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int o2 = this.O;
            Label_0738:
                while (true) {
                    Object o5 = null;
                    Object o6 = null;
                    p<r0, kotlin.coroutines.d<? super com.untis.mobile.services.classbook.b>, Object> p2 = null;
                    StudentAbsence studentAbsence = null;
                    Object o8 = null;
                    com.untis.mobile.utils.mapper.apiToModel.d d2 = null;
                    w w5 = null;
                    Label_0889: {
                        List<Event> m;
                        List<Student> i;
                        Klasse j;
                        Iterator<Object> iterator2;
                        p<r0, kotlin.coroutines.d<? super com.untis.mobile.services.classbook.b>, Object> p6;
                        w g;
                        com.untis.mobile.utils.mapper.apiToModel.d h2;
                        Object o10;
                        while (true) {
                            Collection<Event> collection2 = null;
                            Object o3 = null;
                            w w2 = null;
                            Object o4 = null;
                            p<r0, kotlin.coroutines.d<? super com.untis.mobile.services.classbook.b>, Object> p = null;
                            Collection<Event> collection3 = null;
                            Label_0618: {
                                if (o2 != 0) {
                                    if (o2 != 1) {
                                        if (o2 == 2) {
                                            final Collection collection = (Collection)this.M;
                                            final List l = (List)this.L;
                                            final Klasse k = (Klasse)this.K;
                                            final Iterator<? extends T> iterator = (Iterator<? extends T>)this.J;
                                            collection2 = (Collection<Event>)this.I;
                                            final com.untis.mobile.utils.mapper.realmToModel.j s = (com.untis.mobile.utils.mapper.realmToModel.j)this.H;
                                            final w w = (w)this.G;
                                            c1.n(o);
                                            o3 = o;
                                            w2 = w;
                                            o4 = h;
                                            p = this;
                                            collection3 = (Collection<Event>)collection;
                                            break Label_0618;
                                        }
                                        if (o2 == 3) {
                                            o5 = this.N;
                                            m = (List<Event>)this.M;
                                            i = (List<Student>)this.L;
                                            j = (Klasse)this.K;
                                            iterator2 = (Iterator<Object>)this.J;
                                            o6 = this.I;
                                            final com.untis.mobile.utils.mapper.apiToModel.d d = (com.untis.mobile.utils.mapper.apiToModel.d)this.H;
                                            final w w3 = (w)this.G;
                                            c1.n(o);
                                            final Object o7 = o;
                                            final w w4 = w3;
                                            p2 = this;
                                            studentAbsence = (StudentAbsence)h;
                                            o8 = o7;
                                            d2 = d;
                                            w5 = w4;
                                            break Label_0889;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    else {
                                        c1.n(o);
                                    }
                                }
                                else {
                                    c1.n(o);
                                    final com.untis.mobile.services.masterdata.a y = w.Y(this.P);
                                    final Set<UMStudent> referencedStudents = this.Q.referencedStudents;
                                    k0.o(referencedStudents, "response.referencedStudents");
                                    this.O = 1;
                                    if (a.a.i(y, referencedStudents, false, this, 2, null) == h) {
                                        return h;
                                    }
                                }
                                Klasse n;
                                if ((n = w.Y(this.P).N(this.R)) == null) {
                                    n = new Klasse(0L, null, null, null, null, 0, 0, false, false, 511, null);
                                }
                                final Set<UMStudent> referencedStudents2 = this.Q.referencedStudents;
                                k0.o(referencedStudents2, "response.referencedStudents");
                                final com.untis.mobile.utils.mapper.realmToModel.f0 a = com.untis.mobile.utils.mapper.realmToModel.f0.a;
                                final List l = new ArrayList<Student>(v.Y((Iterable<?>)referencedStudents2, 10));
                                final Iterator<Object> iterator3 = referencedStudents2.iterator();
                                while (iterator3.hasNext()) {
                                    l.add(a.d(iterator3.next()));
                                }
                                final List<UMClassRegEvent> classRegEvents = this.Q.classRegEvents;
                                k0.o(classRegEvents, "response.classRegEvents");
                                final w p3 = this.P;
                                final com.untis.mobile.utils.mapper.realmToModel.j s = this.S;
                                final ArrayList list = new ArrayList<Event>(v.Y((Iterable<?>)classRegEvents, 10));
                                final Iterator<? extends T> iterator = classRegEvents.iterator();
                                final Klasse k = n;
                                final p<r0, kotlin.coroutines.d<? super com.untis.mobile.services.classbook.b>, Object> p4 = this;
                                o = h;
                                collection3 = (Collection<Event>)list;
                                if (!iterator.hasNext()) {
                                    m = (List<Event>)collection3;
                                    final List<UMStudentAbsence> absences = p4.Q.absences;
                                    k0.o(absences, "response.absences");
                                    final w p5 = p4.P;
                                    final com.untis.mobile.utils.mapper.apiToModel.d t = p4.T;
                                    final Object o9 = new ArrayList(v.Y((Iterable<?>)absences, 10));
                                    iterator2 = absences.iterator();
                                    p6 = p4;
                                    j = k;
                                    i = (List<Student>)l;
                                    g = p5;
                                    h2 = t;
                                    o10 = o;
                                    o = o9;
                                    break Label_0738;
                                }
                                final UMClassRegEvent umClassRegEvent = (UMClassRegEvent)iterator.next();
                                final com.untis.mobile.services.classbook.a w6 = w.W(p3);
                                k0.o(umClassRegEvent, "it");
                                final Event a2 = s.a(0L, umClassRegEvent);
                                p4.G = p3;
                                p4.H = s;
                                p4.I = collection3;
                                p4.J = iterator;
                                p4.K = k;
                                p4.L = l;
                                p4.M = collection3;
                                p4.O = 2;
                                final Object q = w6.q(a2, p4);
                                if (q == o) {
                                    return o;
                                }
                                final w w7 = p3;
                                final Object o11 = o;
                                p = p4;
                                collection2 = collection3;
                                w2 = w7;
                                o3 = q;
                                o4 = o11;
                            }
                            collection3.add((Event)o3);
                            collection3 = collection2;
                            final p<r0, kotlin.coroutines.d<? super com.untis.mobile.services.classbook.b>, Object> p7 = p;
                            final Object o12 = o4;
                            final w p3 = w2;
                            final p<r0, kotlin.coroutines.d<? super com.untis.mobile.services.classbook.b>, Object> p4 = p7;
                            o = o12;
                            continue;
                        }
                        if (!iterator2.hasNext()) {
                            return new com.untis.mobile.services.classbook.b(j, i, m, (List<StudentAbsence>)o);
                        }
                        final UMStudentAbsence umStudentAbsence = iterator2.next();
                        final com.untis.mobile.services.classbook.a w8 = w.W(g);
                        k0.o(umStudentAbsence, "it");
                        final StudentAbsence g2 = h2.g(0L, umStudentAbsence);
                        p6.G = g;
                        p6.H = h2;
                        p6.I = o;
                        p6.J = iterator2;
                        p6.K = j;
                        p6.L = i;
                        p6.M = m;
                        p6.N = o;
                        p6.O = 3;
                        final Object a3 = w8.a(g2, p6);
                        if (a3 == o10) {
                            return o10;
                        }
                        final w w9 = g;
                        final com.untis.mobile.utils.mapper.apiToModel.d d3 = h2;
                        studentAbsence = (StudentAbsence)o10;
                        p2 = p6;
                        o6 = o;
                        w5 = w9;
                        d2 = d3;
                        o8 = a3;
                        o5 = o;
                    }
                    ((Collection<StudentAbsence>)o5).add((StudentAbsence)o8);
                    o = o6;
                    final p<r0, kotlin.coroutines.d<? super com.untis.mobile.services.classbook.b>, Object> p8 = p2;
                    final StudentAbsence studentAbsence2 = studentAbsence;
                    com.untis.mobile.utils.mapper.apiToModel.d h2 = d2;
                    w g = w5;
                    p<r0, kotlin.coroutines.d<? super com.untis.mobile.services.classbook.b>, Object> p6 = p8;
                    Object o10 = studentAbsence2;
                    continue Label_0738;
                }
            }
        }, 1, (Object)null);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public OfficeHour A(final long l) {
        return this.h0().get(l);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object a(@e final StudentAbsence studentAbsence, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ w H;
            final /* synthetic */ StudentAbsence I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ w H = this.H;
                    final /* synthetic */ StudentAbsence I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((w$k)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final com.untis.mobile.services.classbook.a w = com.untis.mobile.services.infocenter.w.W(this.H);
                    final StudentAbsence i = this.I;
                    this.G = 1;
                    if (w.a(i, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, (kotlin.coroutines.d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object b(@e final List<OfficeHour> list, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            Object H;
            int I;
            final /* synthetic */ List<OfficeHour> J;
            final /* synthetic */ w K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    Object H;
                    int I;
                    final /* synthetic */ List<OfficeHour> J = this.J;
                    final /* synthetic */ w K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((w$n)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int i = this.I;
                w k;
                Iterator<Object> iterator2;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final Iterator iterator = (Iterator)this.H;
                    k = (w)this.G;
                    c1.n(o);
                    iterator2 = (Iterator<Object>)iterator;
                }
                else {
                    c1.n(o);
                    final List<OfficeHour> j = this.J;
                    k = this.K;
                    iterator2 = j.iterator();
                }
                while (iterator2.hasNext()) {
                    final OfficeHour officeHour = iterator2.next();
                    this.G = k;
                    this.H = iterator2;
                    this.I = 1;
                    if (k.y(officeHour, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, (kotlin.coroutines.d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @e
    @Override
    public List<HomeWork> c(@e final Profile profile, @e final t t, @e final t t2) {
        k0.p(profile, "profile");
        k0.p(t, "start");
        k0.p(t2, "end");
        final List<HomeWork> j = this.K.J();
        final ArrayList<HomeWork> list = new ArrayList<HomeWork>();
        for (final HomeWork next : j) {
            if (((org.joda.time.base.e)next.getEnd().h1()).o((n0)t) ^ true) {
                list.add(next);
            }
        }
        return list;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Subject d(@e final HomeWork homeWork) {
        k0.p(homeWork, "homeWork");
        final com.untis.mobile.services.masterdata.a j = this.J;
        while (true) {
            for (final Period next : this.L.v(homeWork.getLessonId())) {
                if (next.getStates().contains(PeriodState.REGULAR)) {
                    final Period period = next;
                    long currentId = 0L;
                    if (period != null) {
                        final PeriodElement subject = period.getSubject();
                        if (subject != null) {
                            currentId = subject.getCurrentId();
                        }
                    }
                    return j.U(currentId);
                }
            }
            Period next = null;
            continue;
        }
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object e(@e final List<HomeWork> list, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            Object H;
            int I;
            final /* synthetic */ List<HomeWork> J;
            final /* synthetic */ w K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    Object H;
                    int I;
                    final /* synthetic */ List<HomeWork> J = this.J;
                    final /* synthetic */ w K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((w$m)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int i = this.I;
                Iterator<Object> iterator;
                w k;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iterator = (Iterator<Object>)this.H;
                    final w w = (w)this.G;
                    c1.n(o);
                    k = w;
                }
                else {
                    c1.n(o);
                    final List<HomeWork> j = this.J;
                    k = this.K;
                    iterator = j.iterator();
                }
                while (iterator.hasNext()) {
                    final HomeWork homeWork = iterator.next();
                    final com.untis.mobile.services.classbook.a w2 = w.W(k);
                    this.G = k;
                    this.H = iterator;
                    this.I = 1;
                    if (a.a.h(w2, homeWork, false, this, 2, null) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, (kotlin.coroutines.d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @e
    @Override
    public rx.g<List<Exam>> f(@e final Profile profile, @e final t t, @e final t t2) {
        k0.p(profile, "profile");
        k0.p(t, "start");
        k0.p(t2, "end");
        final ArrayList<Long> list = new ArrayList<Long>();
        if (!g0.a((Context)UntisMobileApplication.I.b())) {
            return this.w(profile, t, t2);
        }
        rx.g g;
        String s;
        if (profile.getEntityType().isParentRole() && profile.getEntityType().isStudentRole()) {
            if (profile.getEntityType().isStudentRole()) {
                list.add(profile.getEntityId());
            }
            if (profile.getEntityType().isParentRole()) {
                final Set<Child> userChildren = profile.getUserChildren();
                final ArrayList c = new ArrayList<Long>(v.Y((Iterable<?>)userChildren, 10));
                final Iterator<Object> iterator = userChildren.iterator();
                while (iterator.hasNext()) {
                    c.add(Long.valueOf(iterator.next().getId()));
                }
                list.addAll((Collection<? extends Long>)c);
            }
            g = rx.g.C2((Iterable)list).j2((rx.functions.p)new com.untis.mobile.services.infocenter.i(this, profile, t, t2));
            s = "from(studentIds)\n                .flatMap { entityId ->\n                    apiService\n                            .getExams(profile, EntityType.STUDENT, entityId, start, end)\n                            .map { response ->\n                                return@map response.exams.map { umExam ->\n                                    Exam(\n                                            id = umExam.id,\n                                            examType = umExam.examType ?: \"\",\n                                            start = Mapper.isoStringToDateTime(umExam.startDateTime),\n                                            end = Mapper.isoStringToDateTime(umExam.endDateTime),\n                                            department = masterDataService.department(umExam.departmentId),\n                                            subject = masterDataService.subject(umExam.subjectId),\n                                            klasses = masterDataService.klassen(umExam.klasseIds),\n                                            rooms = masterDataService.rooms(umExam.roomIds),\n                                            teachers = masterDataService.teachers(umExam.teacherIds),\n                                            invigilators = umExam.invigilators.map { umInvigilator ->\n                                                Invigilator(\n                                                        teacher = masterDataService.teacher(umInvigilator.id)\n                                                                ?: Teacher(),\n                                                        start = Mapper.isoStringToLocalTime(umInvigilator.startTime),\n                                                        end = Mapper.isoStringToLocalTime(umInvigilator.endTime)\n                                                )\n                                            },\n                                            name = umExam.name ?: \"\",\n                                            text = umExam.text ?: \"\",\n                                            entityType = EntityType.STUDENT,\n                                            entityId = entityId\n                                    )\n                                }\n                            }\n                }";
        }
        else {
            final EntityType entityType = profile.getEntityType();
            final long entityId = profile.getEntityId();
            g = this.f0().getExams(profile, entityType, entityId, t, t2).k3((rx.functions.p)new com.untis.mobile.services.infocenter.c(this, entityType, entityId));
            s = "apiService\n                    .getExams(profile, entityType, entityId, start, end)\n                    .map { response ->\n                        return@map response.exams.map { umExam ->\n                            Exam(\n                                    id = umExam.id,\n                                    examType = umExam.examType ?: \"\",\n                                    start = Mapper.isoStringToDateTime(umExam.startDateTime),\n                                    end = Mapper.isoStringToDateTime(umExam.endDateTime),\n                                    department = masterDataService.department(umExam.departmentId),\n                                    subject = masterDataService.subject(umExam.subjectId),\n                                    klasses = masterDataService.klassen(umExam.klasseIds),\n                                    rooms = masterDataService.rooms(umExam.roomIds),\n                                    teachers = masterDataService.teachers(umExam.teacherIds),\n                                    invigilators = umExam.invigilators.map { umInvigilator ->\n                                        Invigilator(\n                                                teacher = masterDataService.teacher(umInvigilator.id)\n                                                        ?: Teacher(),\n                                                start = Mapper.isoStringToLocalTime(umInvigilator.startTime),\n                                                end = Mapper.isoStringToLocalTime(umInvigilator.endTime)\n                                        )\n                                    },\n                                    name = umExam.name ?: \"\",\n                                    text = umExam.text ?: \"\",\n                                    entityType = entityType,\n                                    entityId = entityId\n                            )\n                        }\n                    }";
        }
        k0.o(g, s);
        return (rx.g<List<Exam>>)g;
    }
    
    @e
    @Override
    public rx.g<List<HomeWork>> g(@e final Profile profile, @e final t t, @e final t t2) {
        k0.p(profile, "profile");
        k0.p(t, "start");
        k0.p(t2, "end");
        final org.joda.time.c f0 = t.F0();
        final org.joda.time.c v0 = t2.F0().S0(1).v0(1);
        final ArrayList<Long> list = new ArrayList<Long>();
        if (profile.getEntityType().isStudentRole()) {
            list.add(profile.getEntityId());
        }
        if (profile.getEntityType().isParentRole()) {
            final Set<Child> userChildren = profile.getUserChildren();
            final ArrayList c = new ArrayList<Long>(v.Y((Iterable<?>)userChildren, 10));
            final Iterator<Object> iterator = userChildren.iterator();
            while (iterator.hasNext()) {
                c.add(Long.valueOf(iterator.next().getId()));
            }
            list.addAll((Collection<? extends Long>)c);
        }
        final rx.g h2 = rx.g.H2((Callable)new m(this, v0, f0, list));
        k0.o(h2, "fromCallable {\n            val homeWorks = classBookService.homeWorks()\n\n            homeWorks\n                    .filter { homeWork ->\n                        if (finalEnd.isBefore(homeWork.start) && finalStart.isBefore(homeWork.end)) {\n                            return@filter false\n                        }\n\n                        if (studentIds.isEmpty()) {\n                            return@filter true\n                        }\n\n                        if (homeWork.entityType != EntityType.STUDENT) {\n                            return@filter false\n                        }\n\n                        if (!studentIds.contains(homeWork.entityId)) {\n                            return@filter false\n                        }\n\n                        return@filter true\n                    }\n        }");
        return (rx.g<List<HomeWork>>)h2;
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @e
    @Override
    public List<OfficeHour> h(@e final org.joda.time.c c) {
        k0.p(c, "startDateTime");
        final Collection<OfficeHour> values = this.h0().values();
        final ArrayList<OfficeHour> list = new ArrayList<OfficeHour>();
        for (final OfficeHour next : values) {
            if (((org.joda.time.base.c)next.getStart()).R((org.joda.time.l0)c)) {
                list.add(next);
            }
        }
        return list;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object i(@e final com.untis.mobile.services.classbook.b b, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ w H;
            final /* synthetic */ com.untis.mobile.services.classbook.b I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ w H = this.H;
                    final /* synthetic */ com.untis.mobile.services.classbook.b I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((w$p)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object a) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(a);
                    w.this.k0().put(kotlin.coroutines.jvm.internal.b.g(this.I.c().getId()), this.I);
                    a = w.this.j0().a(w.this.i0());
                    final com.untis.mobile.services.classbook.b i = this.I;
                    try {
                        ((f0)a).beginTransaction();
                        final long id = i.c().getId();
                        final List<Student> d = i.d();
                        final ArrayList list = new ArrayList<com.untis.mobile.persistence.realm.b>(v.Y((Iterable<?>)d, 10));
                        final Iterator<Object> iterator = d.iterator();
                        while (iterator.hasNext()) {
                            list.add(new com.untis.mobile.persistence.realm.b(iterator.next().getId()));
                        }
                        final l0<com.untis.mobile.persistence.realm.b> h = com.untis.mobile.utils.mapper.common.b.h((List<com.untis.mobile.persistence.realm.b>)list);
                        k0.o(h, "toRealmList(data.students.map { student -> RealmLong(value = student.id) })");
                        final List<Event> b = i.b();
                        final ArrayList list2 = new ArrayList<com.untis.mobile.persistence.realm.b>(v.Y((Iterable<?>)b, 10));
                        final Iterator<Object> iterator2 = b.iterator();
                        while (iterator2.hasNext()) {
                            list2.add(new com.untis.mobile.persistence.realm.b(iterator2.next().getId()));
                        }
                        final l0<com.untis.mobile.persistence.realm.b> h2 = com.untis.mobile.utils.mapper.common.b.h((List<com.untis.mobile.persistence.realm.b>)list2);
                        k0.o(h2, "toRealmList(data.events.map { event -> RealmLong(value = event.id) })");
                        final List<StudentAbsence> a2 = i.a();
                        final ArrayList list3 = new ArrayList<com.untis.mobile.persistence.realm.b>(v.Y((Iterable<?>)a2, 10));
                        final Iterator<Object> iterator3 = a2.iterator();
                        while (iterator3.hasNext()) {
                            list3.add(new com.untis.mobile.persistence.realm.b(iterator3.next().getId()));
                        }
                        final l0<com.untis.mobile.persistence.realm.b> h3 = com.untis.mobile.utils.mapper.common.b.h((List<com.untis.mobile.persistence.realm.b>)list3);
                        k0.o(h3, "toRealmList(data.absences.map { absence -> RealmLong(value = absence.id) })");
                        ((f0)a).G0(new i4.d(id, h, h2, h3), new q[0]);
                        ((f0)a).n();
                        final j2 a3 = j2.a;
                        kotlin.io.c.a((Closeable)a, null);
                        return a3;
                    }
                    finally {
                        try {}
                        finally {
                            final Throwable t;
                            kotlin.io.c.a((Closeable)a, t);
                        }
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object j(@e final List<Exam> list, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ List<Exam> H;
            final /* synthetic */ w I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ List<Exam> H = this.H;
                    final /* synthetic */ w I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((w$l)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    final List<Exam> h = this.H;
                    final w i = this.I;
                    for (final Exam exam : h) {
                        i.g0().put(kotlin.coroutines.jvm.internal.b.g(exam.getId()), exam);
                    }
                    final f0 a = w.this.j0().a(w.this.i0());
                    final List<Exam> h2 = this.H;
                    try {
                        a.beginTransaction();
                        o = new ArrayList(v.Y((Iterable<?>)h2, 10));
                        for (final Exam exam2 : h2) {
                            final long id = exam2.getId();
                            final String examType = exam2.getExamType();
                            final long n = ((org.joda.time.base.g)exam2.getStart()).n();
                            final long n2 = ((org.joda.time.base.g)exam2.getEnd()).n();
                            final Department department = exam2.getDepartment();
                            long longValue = 0L;
                            long longValue2 = 0L;
                            Label_0218: {
                                if (department != null) {
                                    final Long g = kotlin.coroutines.jvm.internal.b.g(department.getId());
                                    if (g != null) {
                                        longValue2 = g;
                                        break Label_0218;
                                    }
                                }
                                longValue2 = 0L;
                            }
                            final String name = exam2.getName();
                            final String text = exam2.getText();
                            final int webuntisId = exam2.getEntityType().getWebuntisId();
                            final long entityId = exam2.getEntityId();
                            final Subject subject = exam2.getSubject();
                            if (subject != null) {
                                final Long g2 = kotlin.coroutines.jvm.internal.b.g(subject.getId());
                                if (g2 != null) {
                                    longValue = g2;
                                }
                            }
                            final List<Klasse> klasses = exam2.getKlasses();
                            final ArrayList list = new ArrayList<p0>(v.Y((Iterable<?>)klasses, 10));
                            final Iterator<Object> iterator3 = klasses.iterator();
                            while (iterator3.hasNext()) {
                                list.add(new com.untis.mobile.persistence.realm.b(iterator3.next().getId()));
                            }
                            final l0<p0> h3 = com.untis.mobile.utils.mapper.common.b.h((List<p0>)list);
                            k0.o(h3, "toRealmList(exam.klasses.map { klasse -> RealmLong(value = klasse.id) })");
                            final List<Room> rooms = exam2.getRooms();
                            final ArrayList list2 = new ArrayList<p0>(v.Y((Iterable<?>)rooms, 10));
                            final Iterator<Object> iterator4 = rooms.iterator();
                            while (iterator4.hasNext()) {
                                list2.add(new com.untis.mobile.persistence.realm.b(iterator4.next().getId()));
                            }
                            final l0<p0> h4 = com.untis.mobile.utils.mapper.common.b.h((List<p0>)list2);
                            k0.o(h4, "toRealmList(exam.rooms.map { room -> RealmLong(value = room.id) })");
                            final List<Teacher> teachers = exam2.getTeachers();
                            final ArrayList list3 = new ArrayList<p0>(v.Y((Iterable<?>)teachers, 10));
                            final Iterator<Object> iterator5 = teachers.iterator();
                            while (iterator5.hasNext()) {
                                list3.add(new com.untis.mobile.persistence.realm.b(iterator5.next().getId()));
                            }
                            final l0<p0> h5 = com.untis.mobile.utils.mapper.common.b.h((List<p0>)list3);
                            k0.o(h5, "toRealmList(exam.teachers.map { teacher -> RealmLong(value = teacher.id) })");
                            final List<Invigilator> invigilators = exam2.getInvigilators();
                            final ArrayList list4 = new ArrayList<p0>(v.Y((Iterable<?>)invigilators, 10));
                            for (final Invigilator invigilator : invigilators) {
                                list4.add(new p4.b(invigilator.getTeacher().getId(), invigilator.getStart().k1(), invigilator.getEnd().k1()));
                            }
                            final l0<p0> h6 = com.untis.mobile.utils.mapper.common.b.h((List<p0>)list4);
                            k0.o(h6, "toRealmList(exam.invigilators.map { invigilator ->\n                                    RealmInvigilator(\n                                            teacherId = invigilator.teacher.id,\n                                            start = invigilator.start.millisOfDay.toLong(),\n                                            end = invigilator.end.millisOfDay.toLong()\n                                    )\n                                })");
                            ((Collection<p4.a>)o).add(new p4.a(0L, id, examType, n, n2, longValue2, name, text, webuntisId, entityId, longValue, h3, h4, h5, h6, 1, null));
                        }
                        a.H0((Iterable<io.realm.n0>)o, new q[0]);
                        a.n();
                        final j2 a2 = j2.a;
                        kotlin.io.c.a(a, null);
                        return a2;
                    }
                    finally {
                        try {}
                        finally {
                            final Throwable t;
                            kotlin.io.c.a(a, t);
                        }
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @e
    @Override
    public rx.g<StudentAbsence> k(@e final StudentAbsence studentAbsence) {
        k0.p(studentAbsence, "studentAbsence");
        final rx.g k3 = this.f0().submitOwnAbsence(this.i0(), studentAbsence.getId(), studentAbsence.getStudent(), studentAbsence.getStart(), studentAbsence.getEnd(), studentAbsence.getText(), studentAbsence.getAbsenceReason()).k3((rx.functions.p)new com.untis.mobile.services.infocenter.t(this));
        k0.o(k3, "apiService\n                .submitOwnAbsence(getProfile(), studentAbsence.id, studentAbsence.student, studentAbsence.start, studentAbsence.end, studentAbsence.text, studentAbsence.absenceReason)\n                .map { response ->\n                    if (response.errors.isNotEmpty()) {\n                        throw ValidationException(response.errors.mapNotNull { UmErrorToValidationErrorMapper.umErrorToValidationError().map(it) })\n                    }\n\n                    var excuse: Excuse? = null\n                    val umExcuse = response.absence.excuse\n                    if (umExcuse != null) {\n                        excuse = Excuse(\n                                id = umExcuse.id,\n                                excuseStatus = masterDataService.excuseStatus(umExcuse.excuseStatusId),\n                                text = umExcuse.text ?: \"\",\n                                number = umExcuse.number,\n                                date = Mapper.isoStringToLocalDate(umExcuse.date)\n                        )\n                    }\n\n                    return@map runBlocking {\n                        classBookService.save(StudentAbsence(\n                                id = response.absence.id,\n                                periodId = 0,\n                                student = masterDataService.student(response.absence.studentId)\n                                        ?: Student(id = response.absence.studentId),\n                                klasse = masterDataService.klasse(response.absence.klasseId),\n                                start = Mapper.isoStringToDateTime(response.absence.startDateTime),\n                                end = Mapper.isoStringToDateTime(response.absence.endDateTime),\n                                excused = response.absence.excused,\n                                absenceReason = masterDataService.absenceReason(response.absence.absenceReasonId),\n                                owner = response.absence.owner,\n                                text = response.absence.text ?: \"\",\n                                excuse = excuse,\n                                synced = true\n                        ))\n                    }\n                }");
        return (rx.g<StudentAbsence>)k3;
    }
    
    @e
    @Override
    public rx.g<OfficeHour> l(@e final OfficeHourRegistration officeHourRegistration) {
        k0.p(officeHourRegistration, "officeHourRegistration");
        final rx.g k3 = this.f0().deleteOfficeHourRegistration(this.i0(), officeHourRegistration).k3((rx.functions.p)new com.untis.mobile.services.infocenter.f(this, officeHourRegistration));
        k0.o(k3, "apiService\n                .deleteOfficeHourRegistration(getProfile(), officeHourRegistration)\n                .map { result ->\n                    if (result.errors != null && result.errors.isNotEmpty()) {\n                        throw ValidationException(result.errors.mapNotNull { UmErrorToValidationErrorMapper.umErrorToValidationError().map(it) })\n                    }\n\n                    val officeHour = officeHour(officeHourRegistration.officeHourId)\n                            ?: throw RuntimeException(\"no contactHour\", JsonRpcError(JsonRpcErrorType.NoSuccess))\n\n                    officeHour.timeSlots\n                            .forEach { timeSlot ->\n                                if (timeSlot.start.isEqual(officeHourRegistration.start) && timeSlot.end.isEqual(officeHourRegistration.end)) {\n                                    timeSlot.state = OfficeHourTimeSlotState.FREE\n                                }\n                            }\n\n                    officeHour.registered = officeHour.timeSlots.any { it.state == OfficeHourTimeSlotState.SELF }\n\n//                    val iterator = officeHour.timeSlots.iterator()\n\n//                    while (iterator.hasNext()) {\n//                        val next = iterator.next()\n//                        if (next.start.isEqual(officeHourRegistration.start) && next.end.isEqual(officeHourRegistration.end)) {\n//                            iterator.remove()\n//                        }\n//                    }\n\n                    runBlocking {\n                        save(officeHour)\n                    }\n\n                    return@map officeHour\n                }");
        return (rx.g<OfficeHour>)k3;
    }
    
    @e
    @Override
    public rx.g<List<StudentAbsence>> m(@e final t t, @e final t t2) {
        k0.p(t, "start");
        k0.p(t2, "end");
        final List<StudentAbsence> o = this.o();
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        for (final StudentAbsence next : o) {
            final StudentAbsence studentAbsence = next;
            final boolean o2 = ((org.joda.time.base.e)studentAbsence.getEnd().h1()).o((n0)t);
            boolean b = false;
            if (!o2) {
                if (!((org.joda.time.base.e)studentAbsence.getStart().h1()).m((n0)t2)) {
                    b = true;
                }
            }
            if (b) {
                list.add(next);
            }
        }
        final rx.g u2 = rx.g.U2((Object)list);
        k0.o(u2, "just(studentabsences)");
        return (rx.g<List<StudentAbsence>>)u2;
    }
    
    @e
    @Override
    public rx.g<List<OfficeHour>> n(final long n, @e final t t) {
        k0.p(t, "start");
        rx.g g;
        String s;
        if (this.i0().hasAnyRight(Right.READ_OFFICE_HOUR)) {
            if (!g0.a((Context)UntisMobileApplication.I.b())) {
                return this.z(t);
            }
            g = this.f0().getContactHours(this.i0(), n, t).Q3(rx.schedulers.c.f()).k3((rx.functions.p)new r(this)).k3((rx.functions.p)new u(this)).Q3(rx.android.schedulers.a.c());
            s = "apiService\n                    .getContactHours(getProfile(), klassenId, start)\n                    .observeOn(Schedulers.newThread())\n                    .map { response ->\n                        return@map response.officeHours.map { officeHourMapper.toOfficeHour(it) }\n                    }\n                    .map { officehours ->\n\n                        runBlocking {\n                            for (officehour in officehours) {\n                                save(officehour)\n                            }\n                        }\n\n                        officehours\n                    }\n                    .observeOn(AndroidSchedulers.mainThread())";
        }
        else {
            g = rx.g.U2((Object)new ArrayList());
            s = "just(ArrayList())";
        }
        k0.o(g, s);
        return (rx.g<List<OfficeHour>>)g;
    }
    
    @e
    @Override
    public List<StudentAbsence> o() {
        final Profile i0 = this.i0();
        final boolean studentRole = i0.getEntityType().isStudentRole();
        final boolean b = i0.getEntityType().isParentRole() && (i0.getUserChildren().isEmpty() ^ true);
        if (!studentRole && !b) {
            return v.E();
        }
        final List<StudentAbsence> k = this.K.k();
        final ArrayList<StudentAbsence> list = new ArrayList<StudentAbsence>();
        for (final StudentAbsence next : k) {
            final StudentAbsence studentAbsence = next;
            if ((studentRole && studentAbsence.getStudent().getId() == i0.getEntityId()) || (b && i0.hasChild(studentAbsence.getStudent().getId()))) {
                list.add(next);
            }
        }
        return list;
    }
    
    @e
    @Override
    public rx.g<com.untis.mobile.services.classbook.b> p(final long n) {
        final rx.g h2 = rx.g.H2((Callable)new com.untis.mobile.services.infocenter.b(this, n));
        k0.o(h2, "fromCallable {\n            teacherClassRegDataCache[klasseId] ?: TeacherClassRegData()\n        }");
        return (rx.g<com.untis.mobile.services.classbook.b>)h2;
    }
    
    @e
    @Override
    public rx.g<OfficeHour> q(@e final OfficeHourRegistration officeHourRegistration) {
        k0.p(officeHourRegistration, "officeHourRegistration");
        final rx.g k3 = this.f0().submitOfficeHourRegistration(this.i0(), officeHourRegistration).k3((rx.functions.p)new com.untis.mobile.services.infocenter.g(this, officeHourRegistration));
        k0.o(k3, "apiService\n                .submitOfficeHourRegistration(getProfile(), officeHourRegistration)\n                .map { response ->\n                    val officeHour = officeHour(officeHourRegistration.officeHourId)\n                            ?: throw IllegalArgumentException(\"no valid office hour found\")\n\n                    if (response.errors != null && response.errors.isNotEmpty()) {\n                        throw ValidationException(response.errors.map { umError -> UmErrorToValidationErrorMapper.umErrorToValidationError().map(umError) })\n                    }\n\n                    officeHour.timeSlots = response.timeSlots\n                            .map { umTimeSlot ->\n                                OfficeHourTimeSlot(\n                                        start = Mapper.isoStringToDateTime(umTimeSlot.startTime),\n                                        end = Mapper.isoStringToDateTime(umTimeSlot.endTime),\n                                        state = OfficeHourTimeSlotState.fromUmOfficeHourTimeSlotState(umTimeSlot.state)\n                                )\n                            }\n                            .toMutableList()\n\n                    officeHour.registered = officeHour.timeSlots.any { it.state == OfficeHourTimeSlotState.SELF }\n\n                    runBlocking {\n                        save(officeHour)\n                    }\n\n                    return@map officeHour\n                }");
        return (rx.g<OfficeHour>)k3;
    }
    
    @e
    @Override
    public rx.g<OfficeHour> r(@e final OfficeHour officeHour) {
        k0.p(officeHour, "officeHour");
        final ApiService f0 = this.f0();
        final Profile i0 = this.i0();
        final long id = officeHour.getId();
        final Teacher teacher = officeHour.getTeacher();
        long id2;
        if (teacher == null) {
            id2 = 0L;
        }
        else {
            id2 = teacher.getId();
        }
        final rx.g k3 = f0.getOfficeHourRegistration(i0, id, id2).k3((rx.functions.p)new com.untis.mobile.services.infocenter.q(officeHour, this));
        k0.o(k3, "apiService\n                .getOfficeHourRegistration(getProfile(), officeHour.id, officeHour.teacher?.id\n                        ?: 0L)\n                .map { result ->\n\n                    officeHour.userText = result.userText ?: \"\"\n                    officeHour.teacherText = result.teacherText ?: \"\"\n                    officeHour.timeSlots = result.timeSlots\n                            .map { umOfficeHourTimeSlot ->\n                                OfficeHourTimeSlot(\n                                        start = Mapper.isoStringToLocalTime(umOfficeHourTimeSlot.startTime).toDateTime(officeHour.start),\n                                        end = Mapper.isoStringToLocalTime(umOfficeHourTimeSlot.endTime).toDateTime(officeHour.start),\n                                        state = OfficeHourTimeSlotState.fromUmOfficeHourTimeSlotState(umOfficeHourTimeSlot.state)\n                                )\n                            }\n                            .toMutableList()\n\n                    runBlocking {\n                        save(officeHour)\n                    }\n\n                    return@map officeHour\n                }");
        return (rx.g<OfficeHour>)k3;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object s(@e final List<StudentAbsence> list, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            Object H;
            int I;
            final /* synthetic */ List<StudentAbsence> J;
            final /* synthetic */ w K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    Object H;
                    int I;
                    final /* synthetic */ List<StudentAbsence> J = this.J;
                    final /* synthetic */ w K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((w$o)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int i = this.I;
                Iterator<Object> iterator;
                w k;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iterator = (Iterator<Object>)this.H;
                    final w w = (w)this.G;
                    c1.n(o);
                    k = w;
                }
                else {
                    c1.n(o);
                    final List<StudentAbsence> j = this.J;
                    k = this.K;
                    iterator = j.iterator();
                }
                while (iterator.hasNext()) {
                    final StudentAbsence studentAbsence = iterator.next();
                    final com.untis.mobile.services.classbook.a w2 = w.W(k);
                    this.G = k;
                    this.H = iterator;
                    this.I = 1;
                    if (w2.a(studentAbsence, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, (kotlin.coroutines.d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @e
    @Override
    public rx.g<com.untis.mobile.services.classbook.b> t(final long n, @e final t t, @e final t t2) {
        k0.p(t, "start");
        k0.p(t2, "end");
        final rx.g k3 = this.f0().getClassregData(this.i0(), n, t, t2).k3((rx.functions.p)new com.untis.mobile.services.infocenter.v(this, n));
        k0.o(k3, "apiService\n                .getClassregData(getProfile(), klassenId, start, end)\n                .map { response ->\n                    val studentAbsenceMapper = StudentAbsenceMapper(profileId)\n                    val eventMapper = EventMapper(profileId)\n\n                    return@map runBlocking {\n                        masterDataService.save(umStudents = response.referencedStudents)\n                        return@runBlocking TeacherClassRegData(\n                                klasse = masterDataService.klasse(klassenId) ?: Klasse(),\n                                students = response.referencedStudents.map(StudentMapper::toStudent),\n                                events = response.classRegEvents.map { classBookService.save(eventMapper.toEvent(0, it)) },\n                                absences = response.absences.map { classBookService.save(studentAbsenceMapper.toStudentAbsence(0, it)) }\n                        )\n                    }\n\n                }");
        return (rx.g<com.untis.mobile.services.classbook.b>)k3;
    }
    
    @e
    @Override
    public rx.g<List<HomeWork>> u(@e final Profile profile, @e final t t, @e final t t2) {
        k0.p(profile, "profile");
        k0.p(t, "start");
        k0.p(t2, "end");
        if (!g0.a((Context)UntisMobileApplication.I.b())) {
            return this.g(profile, t, t2);
        }
        rx.g g;
        String s;
        if (profile.getEntityType().isParentRole() && profile.getEntityType().isStudentRole()) {
            final ArrayList<Long> list = new ArrayList<Long>();
            if (profile.getEntityType().isStudentRole()) {
                list.add(profile.getEntityId());
            }
            if (profile.getEntityType().isParentRole()) {
                final Set<Child> userChildren = profile.getUserChildren();
                final ArrayList c = new ArrayList<Long>(v.Y((Iterable<?>)userChildren, 10));
                final Iterator<Object> iterator = userChildren.iterator();
                while (iterator.hasNext()) {
                    c.add(Long.valueOf(iterator.next().getId()));
                }
                list.addAll((Collection<? extends Long>)c);
            }
            g = rx.g.C2((Iterable)list).j2((rx.functions.p)new com.untis.mobile.services.infocenter.h(this, profile, t, t2));
            s = "from(studentIds)\n                .flatMap { entityId ->\n                    apiService\n                            .getHomeWorks(profile, EntityType.STUDENT, entityId, start, end)\n                            .onErrorResumeNext { Observable.just(null) }\n                            .map { response ->\n                                if (response == null) {\n                                    return@map ArrayList<HomeWork>()\n                                }\n                                return@map response.homeWorks.map { umHomeWork ->\n                                    runBlocking {\n                                        classBookService.save(HomeWorkMapper.toHomeWork(\n                                                periodId = 0,\n                                                umHomeWork = umHomeWork,\n                                                entityType = EntityType.STUDENT,\n                                                entityId = entityId\n                                        ))\n                                    }\n                                }\n                            }\n                }";
        }
        else {
            final EntityType entityType = profile.getEntityType();
            final long entityId = profile.getEntityId();
            g = this.f0().getHomeWorks(profile, entityType, entityId, t, t2).k3((rx.functions.p)new com.untis.mobile.services.infocenter.d(this, entityType, entityId)).d4((rx.functions.p)l.G);
            s = "apiService\n                    .getHomeWorks(profile, entityType, entityId, start, end)\n                    .map { response ->\n                        return@map response.homeWorks.map { umHomeWork ->\n                            runBlocking {\n                                classBookService.save(HomeWorkMapper.toHomeWork(\n                                        periodId = 0,\n                                        umHomeWork = umHomeWork,\n                                        entityType = entityType,\n                                        entityId = entityId\n                                ))\n                            }\n                        }\n                    }.onErrorResumeNext { throwable: Throwable ->\n                        // THIS IS UGLY BUT WU IS SENDING US THE WRONG RIGHT AND WE CANNOT CHECK THIS OTHERWISE ATM\n                        if (throwable.isNoRightException()) {\n                            return@onErrorResumeNext observable(emptyList())\n                        }\n\n                        throw throwable\n                    }";
        }
        k0.o(g, s);
        return (rx.g<List<HomeWork>>)g;
    }
    
    @e
    @Override
    public rx.g<List<StudentAbsence>> v(@e final t t, @e final t t2) {
        k0.p(t, "start");
        k0.p(t2, "end");
        if (!g0.a((Context)UntisMobileApplication.I.b())) {
            return this.m(t, t2);
        }
        final rx.g k3 = this.f0().getStudentAbsence(this.i0(), t, t2).k3((rx.functions.p)new s(this));
        k0.o(k3, "apiService\n                .getStudentAbsence(getProfile(), start, end)\n                .map { response ->\n                    val absences = response.absences.mapNotNull { umAbsence ->\n                        var excuse: Excuse? = null\n\n                        if (umAbsence.excuse != null) {\n                            excuse = Excuse(\n                                    id = umAbsence.excuse.id,\n                                    excuseStatus = masterDataService.excuseStatus(umAbsence.excuse.excuseStatusId),\n                                    text = umAbsence.excuse.text,\n                                    number = umAbsence.excuse.number,\n                                    date = Mapper.isoStringToLocalDate(umAbsence.excuse.date)\n                            )\n                        }\n\n                        StudentAbsence(\n                                id = umAbsence.id,\n                                periodId = 0L,\n                                student = masterDataService.student(umAbsence.studentId)\n                                        ?: Student(umAbsence.studentId),\n                                klasse = masterDataService.klasse(umAbsence.klasseId),\n                                start = Mapper.isoStringToDateTime(umAbsence.startDateTime),\n                                end = Mapper.isoStringToDateTime(umAbsence.endDateTime),\n                                excused = umAbsence.excused,\n                                absenceReason = masterDataService.absenceReason(umAbsence.absenceReasonId),\n                                owner = umAbsence.owner,\n                                text = umAbsence.text,\n                                excuse = excuse,\n                                synced = true\n                        )\n                    }\n\n                    runBlocking {\n                        saveStudentAbsences(absences)\n                    }\n\n                    absences\n                }");
        return (rx.g<List<StudentAbsence>>)k3;
    }
    
    @e
    @Override
    public rx.g<List<Exam>> w(@e final Profile profile, @e final t t, @e final t t2) {
        k0.p(profile, "profile");
        k0.p(t, "start");
        k0.p(t2, "end");
        final ArrayList<Long> list = new ArrayList<Long>();
        if (profile.getEntityType().isStudentRole()) {
            list.add(profile.getEntityId());
        }
        if (profile.getEntityType().isParentRole()) {
            final Set<Child> userChildren = profile.getUserChildren();
            final ArrayList c = new ArrayList<Long>(v.Y((Iterable<?>)userChildren, 10));
            final Iterator<Object> iterator = userChildren.iterator();
            while (iterator.hasNext()) {
                c.add(Long.valueOf(iterator.next().getId()));
            }
            list.addAll((Collection<? extends Long>)c);
        }
        final rx.g h2 = rx.g.H2((Callable)new com.untis.mobile.services.infocenter.o(this, t2.F0().S0(1).v0(1), t.F0(), list));
        k0.o(h2, "fromCallable {\n            examsCache.values.filter { exam ->\n                if (finalEnd.isBefore(exam.start) && finalStart.isBefore(exam.end)) {\n                    return@filter false\n                }\n\n                if (exam.entityType != EntityType.STUDENT) {\n                    return@filter false\n                }\n\n                if (!studentIds.contains(exam.entityId)) {\n                    return@filter false\n                }\n\n                return@filter true\n            }\n        }");
        return (rx.g<List<Exam>>)h2;
    }
    
    @e
    @Override
    public rx.g<StudentAbsence> x(@e final StudentAbsence studentAbsence) {
        k0.p(studentAbsence, "studentAbsence");
        final ApiService f0 = this.f0();
        final Profile i0 = this.i0();
        final long id = studentAbsence.getId();
        final Excuse excuse = studentAbsence.getExcuse();
        long id2 = 0L;
        if (excuse != null) {
            final ExcuseStatus excuseStatus = excuse.getExcuseStatus();
            if (excuseStatus != null) {
                id2 = excuseStatus.getId();
            }
        }
        final Excuse excuse2 = studentAbsence.getExcuse();
        String s = "";
        if (excuse2 != null) {
            final String text = excuse2.getText();
            if (text != null) {
                s = text;
            }
        }
        final rx.g k3 = f0.submitExcuse(i0, id, id2, s).k3((rx.functions.p)new com.untis.mobile.services.infocenter.e(this, studentAbsence));
        k0.o(k3, "apiService\n                .submitExcuse(getProfile(), studentAbsence.id, studentAbsence.excuse?.excuseStatus?.id\n                        ?: 0, studentAbsence.excuse?.text ?: \"\")\n                .map { response ->\n                    if (response.errors != null && response.errors.isNotEmpty()) {\n                        throw ValidationException(response.errors.map { umError -> UmErrorToValidationErrorMapper.umErrorToValidationError().map(umError) })\n                    }\n\n                    var excuse: Excuse? = null\n\n                    if (response.absence.excuse != null) {\n                        excuse = Excuse(\n                                id = response.absence.excuse.id,\n                                excuseStatus = masterDataService.excuseStatus(response.absence.excuse.excuseStatusId),\n                                text = response.absence.excuse.text,\n                                number = response.absence.excuse.number,\n                                date = Mapper.isoStringToLocalDate(response.absence.excuse.date)\n                        )\n                    }\n\n                    return@map StudentAbsence(\n                            id = studentAbsence.id,\n                            periodId = studentAbsence.periodId,\n                            student = studentAbsence.student,\n                            klasse = studentAbsence.klasse,\n                            start = studentAbsence.start,\n                            end = studentAbsence.end,\n                            excused = response.absence.excused,\n                            absenceReason = studentAbsence.absenceReason,\n                            owner = response.absence.owner,\n                            text = response.absence.text,\n                            excuse = excuse,\n                            synced = true\n                    )\n                }");
        return (rx.g<StudentAbsence>)k3;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object y(@e final OfficeHour officeHour, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ w H;
            final /* synthetic */ OfficeHour I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ w H = this.H;
                    final /* synthetic */ OfficeHour I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((w$j)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object a) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(a);
                    a = w.this.j0().a(w.this.i0());
                    final OfficeHour i = this.I;
                    final w h = this.H;
                    try {
                        ((f0)a).beginTransaction();
                        final long id = i.getId();
                        final long n = 0L;
                        if (id < 1L) {
                            final Number j1 = ((f0)a).f3(y4.a.class).j1("id");
                            long longValue = 0L;
                            Label_0114: {
                                if (j1 != null) {
                                    final Long g = kotlin.coroutines.jvm.internal.b.g(j1.longValue());
                                    if (g != null) {
                                        longValue = g;
                                        break Label_0114;
                                    }
                                }
                                longValue = 0L;
                            }
                            i.setId(longValue);
                        }
                        final long id2 = i.getId();
                        final long n2 = ((org.joda.time.base.g)i.getStart()).n();
                        final long n3 = ((org.joda.time.base.g)i.getEnd()).n();
                        final RealmQuery<i> f3 = ((f0)a).f3(i.class);
                        final Teacher teacher = i.getTeacher();
                        long longValue2;
                        if (teacher == null) {
                            longValue2 = n;
                        }
                        else {
                            final Long g2 = kotlin.coroutines.jvm.internal.b.g(teacher.getId());
                            if (g2 == null) {
                                longValue2 = n;
                            }
                            else {
                                longValue2 = g2;
                            }
                        }
                        final i k = f3.I("id", kotlin.coroutines.jvm.internal.b.g(longValue2)).d0();
                        final long imageId = i.getImageId();
                        final String email = i.getEmail();
                        final String phone = i.getPhone();
                        final String displayNameRooms = i.getDisplayNameRooms();
                        final String displayNameTeacher = i.getDisplayNameTeacher();
                        final boolean registrationPossible = i.getRegistrationPossible();
                        final boolean registered = i.getRegistered();
                        final List<OfficeHourTimeSlot> timeSlots = i.getTimeSlots();
                        final ArrayList list = new ArrayList<y4.b>(v.Y((Iterable<?>)timeSlots, 10));
                        for (final OfficeHourTimeSlot officeHourTimeSlot : timeSlots) {
                            list.add(new y4.b(((org.joda.time.base.g)officeHourTimeSlot.getStart()).n(), ((org.joda.time.base.g)officeHourTimeSlot.getEnd()).n(), officeHourTimeSlot.getState().getValue()));
                        }
                        final l0<y4.b> h2 = com.untis.mobile.utils.mapper.common.b.h((List<y4.b>)list);
                        k0.o(h2, "toRealmList(officeHour.timeSlots.map { officeHourTimeSlot ->\n                                RealmOfficeHourTimeSlot(\n                                        start = officeHourTimeSlot.start.millis,\n                                        end = officeHourTimeSlot.end.millis,\n                                        state = officeHourTimeSlot.state.value\n                                )\n                            })");
                        ((f0)a).G0(new y4.a(id2, n2, n3, k, imageId, email, phone, displayNameRooms, displayNameTeacher, registrationPossible, registered, h2, i.getUserText(), i.getTeacherText()), new q[0]);
                        ((f0)a).n();
                        h.h0().put(kotlin.coroutines.jvm.internal.b.g(i.getId()), i);
                        final j2 a2 = j2.a;
                        kotlin.io.c.a((Closeable)a, null);
                        return a2;
                    }
                    finally {
                        try {}
                        finally {
                            final Throwable t;
                            kotlin.io.c.a((Closeable)a, t);
                        }
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (kotlin.coroutines.d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @e
    @Override
    public rx.g<List<OfficeHour>> z(@e final t t) {
        k0.p(t, "start");
        final rx.g h2 = rx.g.H2((Callable)new com.untis.mobile.services.infocenter.p(this, t));
        k0.o(h2, "fromCallable {\n        return@fromCallable officeHourCache.values\n                .filter { it.start.isAfter(start.toDateTimeAtStartOfDay()) }\n    }");
        return (rx.g<List<OfficeHour>>)h2;
    }
}
