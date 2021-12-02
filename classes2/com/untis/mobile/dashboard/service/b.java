// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.service;

import kotlin.jvm.internal.j1;
import x3.j;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderType;
import com.untis.mobile.dashboard.persistence.model.event.exam.DashboardExam;
import com.untis.mobile.dashboard.persistence.model.reminder.Reminder;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardExcuse;
import java.util.Set;
import android.util.LongSparseArray;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReason;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import com.untis.mobile.persistence.models.Entity;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import com.untis.mobile.dashboard.persistence.model.classlead.DashboardClassbookEvent;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.dashboard.persistence.model.classlead.DashboardClassLead;
import org.koin.core.c$a;
import x3.n;
import x3.m;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHourSlotState;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHourSlot;
import java.util.Comparator;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHour;
import com.untis.mobile.api.error.JsonRpcError;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import com.untis.mobile.persistence.models.masterdata.Student;
import kotlin.c1;
import kotlin.j2;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.i1;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDay;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDayAppointmentKt;
import com.untis.mobile.dashboard.persistence.model.event.homework.DashboardHomework;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import java.util.ArrayList;
import org.joda.time.t;
import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.v;
import com.untis.mobile.dashboard.persistence.model.event.DashboardEvent;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDayAppointment;
import java.util.List;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.services.profile.legacy.j0;
import com.untis.mobile.services.timetable.placeholder.p;
import com.untis.mobile.persistence.dao.classbook.l;
import com.untis.mobile.dashboard.persistence.database.DashboardDatabase;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import com.untis.mobile.persistence.realm.d;
import kotlin.jvm.internal.k0;
import com.untis.mobile.dashboard.persistence.dao.i;
import com.untis.mobile.dashboard.persistence.dao.k;
import com.untis.mobile.dashboard.persistence.dao.g;
import kotlin.b0;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import org.koin.core.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010c\u001a\u00020`\u0012\b\u0010\u0086\u0001\u001a\u00030\u0083\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0012\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006H\u0002J\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J#\u0010\"\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b)\u0010*J+\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b+\u0010,J?\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010.\u001a\u00020-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b0\u00101J#\u00105\u001a\u00020\u00112\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b5\u00106J\u001b\u00109\u001a\u00020\u00112\u0006\u00108\u001a\u000207H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b9\u0010:J#\u0010;\u001a\u00020\u00112\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b;\u00106J)\u0010<\u001a\b\u0012\u0004\u0012\u0002070\u00062\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b<\u00106J\u0019\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u0006H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b>\u0010\u0018J)\u0010?\u001a\b\u0012\u0004\u0012\u00020=0\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b?\u0010,J\u001b\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u00020=H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u0019\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u0006H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bE\u0010\u0018J\u0019\u0010F\u001a\b\u0012\u0004\u0012\u00020D0\u0006H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bF\u0010\u0018J\u001b\u0010H\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010\u0006H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bH\u0010\u0018J)\u0010I\u001a\b\u0012\u0004\u0012\u00020G0\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bI\u0010,J#\u0010L\u001a\u00020=2\u0006\u0010J\u001a\u00020=2\u0006\u0010K\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\bL\u0010MR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001d\u0010W\u001a\u00020R8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001d\u0010\\\u001a\u00020X8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010T\u001a\u0004\bZ\u0010[R\u0016\u0010_\u001a\u00020]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010^R\u0016\u0010c\u001a\u00020`8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010f\u001a\u00020d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010eR\u0016\u0010i\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010k\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010hR\u0016\u0010o\u001a\u00020l8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010s\u001a\u00020p8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010v\u001a\u00020t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010uR\u0016\u0010z\u001a\u00020w8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010}\u001a\u00020{8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010|R\u0016\u0010\u007f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010hR\u0019\u0010\u0082\u0001\u001a\u00030\u0080\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010\u0081\u0001R\u001a\u0010\u0086\u0001\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0089\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bU\u0010\u0088\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u008c\u0001" }, d2 = { "Lcom/untis/mobile/dashboard/service/b;", "Lcom/untis/mobile/dashboard/service/a;", "Lorg/koin/core/c;", "Lorg/joda/time/t;", "start", "end", "", "Lcom/untis/mobile/dashboard/persistence/model/event/DashboardEvent;", "O", "Lcom/untis/mobile/dashboard/persistence/model/event/homework/DashboardHomework;", "dashboardHomework", "", "P", "(Lcom/untis/mobile/dashboard/persistence/model/event/homework/DashboardHomework;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "events", "event", "Lkotlin/j2;", "N", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDayAppointment;", "appointments", "S", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;", "i", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "klassenId", "b", "(Lorg/joda/time/t;JLkotlin/coroutines/d;)Ljava/lang/Object;", "webUntisId", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHourSlot;", "s", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "teacherId", "f", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "contactHour", "", "position", "d", "(Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;ILkotlin/coroutines/d;)Ljava/lang/Object;", "c", "(Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;Lkotlin/coroutines/d;)Ljava/lang/Object;", "o", "(Lorg/joda/time/t;Lorg/joda/time/t;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "entityIds", "l", "(Lorg/joda/time/t;Lorg/joda/time/t;Lcom/untis/mobile/persistence/models/EntityType;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;", "eventType", "eventId", "t", "(Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/dashboard/persistence/model/reminder/Reminder;", "reminder", "k", "(Lcom/untis/mobile/dashboard/persistence/model/reminder/Reminder;Lkotlin/coroutines/d;)Ljava/lang/Object;", "m", "q", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "j", "g", "studentAbsence", "Lx3/m;", "e", "(Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDay;", "p", "a", "Lcom/untis/mobile/dashboard/persistence/model/classlead/DashboardClassLead;", "h", "r", "absence", "excuseStatusId", "n", "(Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/dashboard/persistence/dao/e;", "M", "Lcom/untis/mobile/dashboard/persistence/dao/e;", "examDao", "Lcom/untis/mobile/core/service/a;", "J", "Lkotlin/b0;", "R", "()Lcom/untis/mobile/core/service/a;", "reminderService", "Lcom/untis/mobile/persistence/realm/d;", "I", "Q", "()Lcom/untis/mobile/persistence/realm/d;", "realmService", "Lcom/untis/mobile/dashboard/persistence/dao/i;", "Lcom/untis/mobile/dashboard/persistence/dao/i;", "parentDayDao", "Landroid/content/Context;", "G", "Landroid/content/Context;", "context", "Lcom/untis/mobile/dashboard/persistence/dao/a;", "Lcom/untis/mobile/dashboard/persistence/dao/a;", "classbookEventDao", "W", "Z", "isUpcomingHomeworkAllowed", "V", "isUpcomingExamsAllowed", "Lcom/untis/mobile/dashboard/network/c;", "K", "Lcom/untis/mobile/dashboard/network/c;", "requests", "Lcom/untis/mobile/dashboard/persistence/dao/c;", "L", "Lcom/untis/mobile/dashboard/persistence/dao/c;", "contactHourDao", "Lcom/untis/mobile/services/timetable/placeholder/k;", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timetableService", "Lcom/untis/mobile/persistence/dao/classbook/k;", "T", "Lcom/untis/mobile/persistence/dao/classbook/k;", "legacyHomeworkDao", "Lcom/untis/mobile/dashboard/persistence/dao/k;", "Lcom/untis/mobile/dashboard/persistence/dao/k;", "studentAbsenceDao", "U", "isParentOrStudent", "Lcom/untis/mobile/dashboard/persistence/dao/g;", "Lcom/untis/mobile/dashboard/persistence/dao/g;", "homeworkDao", "", "H", "Ljava/lang/String;", "profileId", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b implements a, c
{
    @e
    private final Context G;
    @e
    private final String H;
    @e
    private final b0 I;
    @e
    private final b0 J;
    @e
    private final com.untis.mobile.dashboard.network.c K;
    @e
    private final com.untis.mobile.dashboard.persistence.dao.c L;
    @e
    private final com.untis.mobile.dashboard.persistence.dao.e M;
    @e
    private final g N;
    @e
    private final k O;
    @e
    private final i P;
    @e
    private final com.untis.mobile.dashboard.persistence.dao.a Q;
    @e
    private final com.untis.mobile.services.masterdata.a R;
    @e
    private final com.untis.mobile.services.timetable.placeholder.k S;
    @e
    private final com.untis.mobile.persistence.dao.classbook.k T;
    private final boolean U;
    private final boolean V;
    private final boolean W;
    
    public b(@e final Context g, @e final String h) {
        k0.p(g, "context");
        k0.p(h, "profileId");
        this.G = g;
        this.H = h;
        final org.koin.core.scope.a y = ((c)this).getKoin().y();
        final Boolean b = null;
        this.I = d0.c((n6.a<?>)new n6.a<d>() {
            @Override
            public final d invoke() {
                return (d)y.t(k1.d(d.class), null, null);
            }
        });
        this.J = d0.c((n6.a<?>)new n6.a<com.untis.mobile.core.service.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.core.service.a invoke() {
                return (com.untis.mobile.core.service.a)this.G.t(k1.d(com.untis.mobile.core.service.a.class), null, null);
            }
        });
        this.K = new com.untis.mobile.dashboard.network.d(h);
        final DashboardDatabase a = DashboardDatabase.p.a(g, h);
        this.L = a.L();
        this.M = a.M();
        this.N = a.N();
        this.O = a.P();
        this.P = a.O();
        this.Q = a.K();
        this.T = new l(this.Q());
        this.R = com.untis.mobile.services.masterdata.b.Z.a(h);
        this.S = p.Y.a(h);
        final Profile l = j0.G.l(h);
        Boolean value;
        if (l == null) {
            value = b;
        }
        else {
            final EntityType entityType = l.getEntityType();
            if (entityType == null) {
                value = b;
            }
            else {
                value = entityType.isParentRole();
            }
        }
        boolean u = false;
        if (value == null) {
            if (l != null) {
                final EntityType entityType2 = l.getEntityType();
                if (entityType2 != null) {
                    u = entityType2.isStudentRole();
                }
            }
        }
        else {
            u = value;
        }
        this.U = u;
        this.V = com.untis.mobile.utils.a.a(g).I(l);
        this.W = com.untis.mobile.utils.a.a(g).J(l);
    }
    
    public static final /* synthetic */ com.untis.mobile.dashboard.persistence.dao.e A(final b b) {
        return b.M;
    }
    
    public static final /* synthetic */ g B(final b b) {
        return b.N;
    }
    
    public static final /* synthetic */ com.untis.mobile.services.masterdata.a C(final b b) {
        return b.R;
    }
    
    public static final /* synthetic */ i D(final b b) {
        return b.P;
    }
    
    public static final /* synthetic */ String E(final b b) {
        return b.H;
    }
    
    public static final /* synthetic */ com.untis.mobile.dashboard.network.c G(final b b) {
        return b.K;
    }
    
    public static final /* synthetic */ k H(final b b) {
        return b.O;
    }
    
    public static final /* synthetic */ com.untis.mobile.services.timetable.placeholder.k I(final b b) {
        return b.S;
    }
    
    public static final /* synthetic */ boolean J(final b b) {
        return b.U;
    }
    
    public static final /* synthetic */ boolean K(final b b) {
        return b.V;
    }
    
    public static final /* synthetic */ boolean L(final b b) {
        return b.W;
    }
    
    private final void N(final List<DashboardEvent> list, final DashboardEvent dashboardEvent) {
        final Iterator<DashboardEvent> iterator = list.iterator();
        int n = 0;
        while (true) {
            while (iterator.hasNext()) {
                final DashboardEvent dashboardEvent2 = iterator.next();
                if (dashboardEvent2.getEventType() == dashboardEvent.getEventType() && dashboardEvent2.getEventId() == dashboardEvent.getEventId()) {
                    if (n >= 0) {
                        final DashboardEvent dashboardEvent3 = list.get(n);
                        dashboardEvent3.setEntityIds((List<Long>)v.q4((Collection<?>)dashboardEvent3.getEntityIds(), (Iterable<?>)dashboardEvent.getEntityIds()));
                        final StringBuilder sb = new StringBuilder();
                        sb.append(dashboardEvent3.getEntityTitle());
                        sb.append(" | ");
                        sb.append(dashboardEvent.getEntityTitle());
                        dashboardEvent3.setEntityTitle(sb.toString());
                    }
                    else {
                        list.add(dashboardEvent);
                    }
                    return;
                }
                ++n;
            }
            n = -1;
            continue;
        }
    }
    
    private final List<DashboardEvent> O(final t t, final t t2) {
        final List<HomeWork> b = this.T.b(this.H);
        final ArrayList<HomeWork> list = new ArrayList<HomeWork>();
        for (final HomeWork next : b) {
            final HomeWork homeWork = next;
            boolean b2 = false;
            Label_0125: {
                if (homeWork.getLocal()) {
                    final t h1 = homeWork.getEnd().h1();
                    k0.o(h1, "it.end.toLocalDate()");
                    if (com.untis.mobile.utils.d0.e(t, h1)) {
                        final t h2 = homeWork.getStart().h1();
                        k0.o(h2, "it.start.toLocalDate()");
                        if (com.untis.mobile.utils.d0.d(t2, h2)) {
                            b2 = true;
                            break Label_0125;
                        }
                    }
                }
                b2 = false;
            }
            if (b2) {
                list.add(next);
            }
        }
        final ArrayList list2 = new ArrayList<DashboardEvent>(v.Y((Iterable<?>)list, 10));
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            list2.add(iterator2.next().toDashboardEvent(this.H, this.G, this.R, this.S));
        }
        return (List<DashboardEvent>)list2;
    }
    
    private final Object P(final DashboardHomework dashboardHomework, final kotlin.coroutines.d<? super Boolean> d) {
        final HomeWork a = this.T.a(this.H, dashboardHomework.getWuId());
        boolean b;
        if (a == null) {
            b = dashboardHomework.getCompleted();
        }
        else {
            b = a.getCompletedStatus();
        }
        return kotlin.coroutines.jvm.internal.b.a(b);
    }
    
    private final d Q() {
        return this.I.getValue();
    }
    
    private final com.untis.mobile.core.service.a R() {
        return this.J.getValue();
    }
    
    private final List<DashboardParentDayAppointment> S(final List<DashboardParentDayAppointment> list) {
        final ArrayList<DashboardParentDayAppointment> list2 = new ArrayList<DashboardParentDayAppointment>();
    Label_0015:
        for (final DashboardParentDayAppointment e : list) {
            final Iterator<Object> iterator2 = list2.iterator();
            int index = 0;
            while (true) {
                while (iterator2.hasNext()) {
                    final DashboardParentDayAppointment dashboardParentDayAppointment = iterator2.next();
                    if (k0.g(dashboardParentDayAppointment.getEnd(), e.getStart()) && DashboardParentDayAppointmentKt.isEqual(dashboardParentDayAppointment, e)) {
                        if (index >= 0) {
                            list2.get(index).setEnd(new org.joda.time.c((Object)e.getEnd()));
                            continue Label_0015;
                        }
                        list2.add(e);
                        continue Label_0015;
                    }
                    else {
                        ++index;
                    }
                }
                index = -1;
                continue;
            }
        }
        return list2;
    }
    
    public static final /* synthetic */ com.untis.mobile.dashboard.persistence.dao.a w(final b b) {
        return b.Q;
    }
    
    public static final /* synthetic */ com.untis.mobile.dashboard.persistence.dao.c y(final b b) {
        return b.L;
    }
    
    public static final /* synthetic */ Context z(final b b) {
        return b.G;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object a(@e final kotlin.coroutines.d<? super List<DashboardParentDay>> d) throws JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super List<? extends DashboardParentDay>>, Object>() {
            int G;
            private /* synthetic */ Object H;
            final /* synthetic */ b I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object h, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                final p<r0, kotlin.coroutines.d<? super List<? extends DashboardParentDay>>, Object> p2 = new p<r0, kotlin.coroutines.d<? super List<? extends DashboardParentDay>>, Object>() {
                    int G;
                    private /* synthetic */ Object H;
                    final /* synthetic */ b I = this.I;
                };
                p2.H = h;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<DashboardParentDay>> d) {
                return ((b$h)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object a) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                r0 h2;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h2 = (r0)this.H;
                    c1.n(a);
                }
                else {
                    c1.n(a);
                    h2 = (r0)this.H;
                    final com.untis.mobile.dashboard.network.c g2 = b.G(this.I);
                    this.H = h2;
                    this.G = 1;
                    a = g2.a(this);
                    if (a == h) {
                        return h;
                    }
                }
                final x3.g g3 = (x3.g)a;
                final List<DashboardParentDay> b = g3.b();
                final b i = this.I;
                final Iterator<Object> iterator = b.iterator();
                while (true) {
                    final boolean hasNext = iterator.hasNext();
                    a = null;
                    if (!hasNext) {
                        break;
                    }
                    final DashboardParentDay dashboardParentDay = iterator.next();
                    final List<DashboardParentDayAppointment> list = g3.a().get(kotlin.coroutines.jvm.internal.b.g(dashboardParentDay.getId()));
                    if (list != null) {
                        final Collection<DashboardParentDayAppointment> collection = new ArrayList<DashboardParentDayAppointment>();
                        final Iterator<Object> iterator2 = list.iterator();
                        while (true) {
                            a = collection;
                            if (!iterator2.hasNext()) {
                                break;
                            }
                            final DashboardParentDayAppointment dashboardParentDayAppointment = iterator2.next();
                            if (dashboardParentDayAppointment == null) {
                                continue;
                            }
                            collection.add(dashboardParentDayAppointment);
                        }
                    }
                    Object e;
                    if ((e = a) == null) {
                        e = v.E();
                    }
                    dashboardParentDay.setAppointments(i.S((List)e));
                }
                kotlinx.coroutines.h.f(h2, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H;
                    final /* synthetic */ x3.g I;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ b H = this.H;
                            final /* synthetic */ x3.g I = this.I;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((b$h$a)this.create(r0, d)).invokeSuspend(j2.a);
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
                            final com.untis.mobile.services.masterdata.a c = b.C(this.H);
                            final List<Student> c2 = this.I.c();
                            this.G = 1;
                            if (c.l(c2, this) == h) {
                                return h;
                            }
                        }
                        return j2.a;
                    }
                }, 3, (Object)null);
                kotlinx.coroutines.h.f(h2, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H;
                    final /* synthetic */ List<DashboardParentDay> I;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ b H = this.H;
                            final /* synthetic */ List<DashboardParentDay> I = this.I;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((b$h$b)this.create(r0, d)).invokeSuspend(j2.a);
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
                            final i d = b.D(this.H);
                            this.G = 1;
                            if (d.b(this) == h) {
                                return h;
                            }
                        }
                        final i d2 = b.D(this.H);
                        final List<DashboardParentDay> i = this.I;
                        this.G = 2;
                        if (d2.a(i, this) == h) {
                            return h;
                        }
                        return j2.a;
                    }
                }, 3, (Object)null);
                return b;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object b(@e final t t, final long n, @e final kotlin.coroutines.d<? super List<DashboardContactHour>> d) throws JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super List<? extends DashboardContactHour>>, Object>(null) {
            int G;
            private /* synthetic */ Object H;
            final /* synthetic */ b I;
            final /* synthetic */ org.joda.time.t J;
            final /* synthetic */ long K;
            
            private static final int p(final b b, final DashboardContactHour dashboardContactHour, final DashboardContactHour dashboardContactHour2) {
                final Teacher k = b.C(b).k(dashboardContactHour.getTeacherId());
                final String s = "";
                String lastName;
                if (k == null || (lastName = k.getLastName()) == null) {
                    lastName = "";
                }
                final Teacher i = b.C(b).k(dashboardContactHour2.getTeacherId());
                String lastName2;
                if (i == null) {
                    lastName2 = s;
                }
                else {
                    lastName2 = i.getLastName();
                    if (lastName2 == null) {
                        lastName2 = s;
                    }
                }
                return com.untis.mobile.utils.comparator.b.G.b(lastName, lastName2);
            }
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object h, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                final p<r0, kotlin.coroutines.d<? super List<? extends DashboardContactHour>>, Object> p2 = new p<r0, kotlin.coroutines.d<? super List<? extends DashboardContactHour>>, Object>(d) {
                    int G;
                    private /* synthetic */ Object H;
                    final /* synthetic */ b I = this.I;
                    final /* synthetic */ org.joda.time.t J = this.J;
                    final /* synthetic */ long K = this.K;
                    
                    private static final int p(final b b, final DashboardContactHour dashboardContactHour, final DashboardContactHour dashboardContactHour2) {
                        final Teacher k = b.C(b).k(dashboardContactHour.getTeacherId());
                        final String s = "";
                        String lastName;
                        if (k == null || (lastName = k.getLastName()) == null) {
                            lastName = "";
                        }
                        final Teacher i = b.C(b).k(dashboardContactHour2.getTeacherId());
                        String lastName2;
                        if (i == null) {
                            lastName2 = s;
                        }
                        else {
                            lastName2 = i.getLastName();
                            if (lastName2 == null) {
                                lastName2 = s;
                            }
                        }
                        return com.untis.mobile.utils.comparator.b.G.b(lastName, lastName2);
                    }
                };
                p2.H = h;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<DashboardContactHour>> d) {
                return ((b$f)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object b) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                r0 h2;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h2 = (r0)this.H;
                    c1.n(b);
                }
                else {
                    c1.n(b);
                    h2 = (r0)this.H;
                    final com.untis.mobile.dashboard.network.c g2 = b.G(this.I);
                    final org.joda.time.t j = this.J;
                    final long k = this.K;
                    this.H = h2;
                    this.G = 1;
                    b = g2.b(j, k, this);
                    if (b == h) {
                        return h;
                    }
                }
                final List<DashboardContactHour> h3 = v.h5((Iterable<? extends DashboardContactHour>)((x3.d)b).a(), (Comparator<? super DashboardContactHour>)new com.untis.mobile.dashboard.service.c(this.I));
                kotlinx.coroutines.h.f(h2, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H;
                    final /* synthetic */ List<DashboardContactHour> I;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ b H = this.H;
                            final /* synthetic */ List<DashboardContactHour> I = this.I;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((b$f$a)this.create(r0, d)).invokeSuspend(j2.a);
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
                            final com.untis.mobile.dashboard.persistence.dao.c y = b.y(this.H);
                            this.G = 1;
                            if (y.b(this) == h) {
                                return h;
                            }
                        }
                        final com.untis.mobile.dashboard.persistence.dao.c y2 = b.y(this.H);
                        final List<DashboardContactHour> i = this.I;
                        this.G = 2;
                        if (y2.a(i, this) == h) {
                            return h;
                        }
                        return j2.a;
                    }
                }, 3, (Object)null);
                return h3;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object c(@e final DashboardContactHour dashboardContactHour, @e final kotlin.coroutines.d<? super DashboardContactHour> d) throws JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super DashboardContactHour>, Object>() {
            int G;
            private /* synthetic */ Object H;
            final /* synthetic */ b I;
            final /* synthetic */ DashboardContactHour J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object h, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                final p<r0, kotlin.coroutines.d<? super DashboardContactHour>, Object> p2 = new p<r0, kotlin.coroutines.d<? super DashboardContactHour>, Object>() {
                    int G;
                    private /* synthetic */ Object H;
                    final /* synthetic */ b I = this.I;
                    final /* synthetic */ DashboardContactHour J = this.J;
                };
                p2.H = h;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super DashboardContactHour> d) {
                return ((b$b)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                r0 h2;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final r0 r0 = (r0)this.H;
                    c1.n(o);
                    h2 = r0;
                }
                else {
                    c1.n(o);
                    h2 = (r0)this.H;
                    final com.untis.mobile.dashboard.network.c g2 = b.G(this.I);
                    final DashboardContactHour j = this.J;
                    this.H = h2;
                    this.G = 1;
                    if (g2.c(j, this) == h) {
                        return h;
                    }
                }
                this.J.setRegistered(false);
                final List<DashboardContactHourSlot> slots = this.J.getSlots();
                if (slots != null) {
                    for (final DashboardContactHourSlot dashboardContactHourSlot : slots) {
                        if (dashboardContactHourSlot.getState() == DashboardContactHourSlotState.Registered) {
                            dashboardContactHourSlot.setState(DashboardContactHourSlotState.Free);
                        }
                    }
                }
                kotlinx.coroutines.h.f(h2, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H;
                    final /* synthetic */ DashboardContactHour I;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ b H = this.H;
                            final /* synthetic */ DashboardContactHour I = this.I;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((b$b$a)this.create(r0, d)).invokeSuspend(j2.a);
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
                            final com.untis.mobile.dashboard.persistence.dao.c y = b.y(this.H);
                            final DashboardContactHour i = this.I;
                            this.G = 1;
                            if (y.c(i, this) == h) {
                                return h;
                            }
                        }
                        return j2.a;
                    }
                }, 3, (Object)null);
                return this.J;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object d(@e final DashboardContactHour dashboardContactHour, final int n, @e final kotlin.coroutines.d<? super DashboardContactHour> d) throws y3.c, JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super DashboardContactHour>, Object>(null) {
            int G;
            private /* synthetic */ Object H;
            final /* synthetic */ b I;
            final /* synthetic */ DashboardContactHour J;
            final /* synthetic */ int K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object h, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                final p<r0, kotlin.coroutines.d<? super DashboardContactHour>, Object> p2 = new p<r0, kotlin.coroutines.d<? super DashboardContactHour>, Object>(d) {
                    int G;
                    private /* synthetic */ Object H;
                    final /* synthetic */ b I = this.I;
                    final /* synthetic */ DashboardContactHour J = this.J;
                    final /* synthetic */ int K = this.K;
                };
                p2.H = h;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super DashboardContactHour> d) {
                return ((b$t)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object d) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                final boolean b = true;
                r0 h2;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h2 = (r0)this.H;
                    c1.n(d);
                }
                else {
                    c1.n(d);
                    h2 = (r0)this.H;
                    final com.untis.mobile.dashboard.network.c g2 = com.untis.mobile.dashboard.service.b.G(this.I);
                    final DashboardContactHour j = this.J;
                    final int k = this.K;
                    this.H = h2;
                    this.G = 1;
                    d = g2.d(j, k, this);
                    if (d == h) {
                        return h;
                    }
                }
                final x3.k i = (x3.k)d;
                final List<y3.a> a = i.a();
                final boolean b2 = false;
                if (a == null || a.isEmpty()) {
                    final DashboardContactHour l = this.J;
                    final List<DashboardContactHourSlot> b3 = i.b();
                    boolean booleanValue;
                    if (b3 == null) {
                        booleanValue = b2;
                    }
                    else {
                        boolean b4 = false;
                        Label_0249: {
                            if (!b3.isEmpty()) {
                                final Iterator<Object> iterator = b3.iterator();
                                while (iterator.hasNext()) {
                                    if (kotlin.coroutines.jvm.internal.b.a(iterator.next().getState() == DashboardContactHourSlotState.Registered)) {
                                        b4 = b;
                                        break Label_0249;
                                    }
                                }
                            }
                            b4 = false;
                        }
                        final Boolean a2 = kotlin.coroutines.jvm.internal.b.a(b4);
                        if (a2 == null) {
                            booleanValue = b2;
                        }
                        else {
                            booleanValue = a2;
                        }
                    }
                    l.setRegistered(booleanValue);
                    this.J.setSlots(i.b());
                    kotlinx.coroutines.h.f(h2, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ b H;
                        final /* synthetic */ DashboardContactHour I;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                int G;
                                final /* synthetic */ b H = this.H;
                                final /* synthetic */ DashboardContactHour I = this.I;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                            return ((b$t$a)this.create(r0, d)).invokeSuspend(j2.a);
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
                                final com.untis.mobile.dashboard.persistence.dao.c y = b.y(this.H);
                                final DashboardContactHour i = this.I;
                                this.G = 1;
                                if (y.c(i, this) == h) {
                                    return h;
                                }
                            }
                            return j2.a;
                        }
                    }, 3, (Object)null);
                    return this.J;
                }
                throw x3.l.a(i);
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object e(@e final DashboardStudentAbsence dashboardStudentAbsence, @e final kotlin.coroutines.d<? super m> d) throws y3.c, JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super m>, Object>() {
            int G;
            private /* synthetic */ Object H;
            final /* synthetic */ b I;
            final /* synthetic */ DashboardStudentAbsence J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object h, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                final p<r0, kotlin.coroutines.d<? super m>, Object> p2 = new p<r0, kotlin.coroutines.d<? super m>, Object>() {
                    int G;
                    private /* synthetic */ Object H;
                    final /* synthetic */ b I = this.I;
                    final /* synthetic */ DashboardStudentAbsence J = this.J;
                };
                p2.H = h;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super m> d) {
                return ((b$u)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object e) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                final boolean b = true;
                r0 h2;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h2 = (r0)this.H;
                    c1.n(e);
                }
                else {
                    c1.n(e);
                    h2 = (r0)this.H;
                    final com.untis.mobile.dashboard.network.c g2 = com.untis.mobile.dashboard.service.b.G(this.I);
                    final DashboardStudentAbsence j = this.J;
                    this.H = h2;
                    this.G = 1;
                    e = g2.e(j, this);
                    if (e == h) {
                        return h;
                    }
                }
                final m m = (m)e;
                final List<y3.a> b2 = m.b();
                int n = b ? 1 : 0;
                if (b2 != null) {
                    if (b2.isEmpty()) {
                        n = (b ? 1 : 0);
                    }
                    else {
                        n = 0;
                    }
                }
                if (n != 0) {
                    final DashboardStudentAbsence a = m.a();
                    if (a != null) {
                        kotlinx.coroutines.h.f(h2, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ b H;
                            final /* synthetic */ DashboardStudentAbsence I;
                            
                            @org.jetbrains.annotations.e
                            @Override
                            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                    int G;
                                    final /* synthetic */ b H = this.H;
                                    final /* synthetic */ DashboardStudentAbsence I = this.I;
                                };
                            }
                            
                            @org.jetbrains.annotations.f
                            @Override
                            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                                return ((b$u$a)this.create(r0, d)).invokeSuspend(j2.a);
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
                                    final k h2 = b.H(this.H);
                                    final DashboardStudentAbsence i = this.I;
                                    this.G = 1;
                                    if (h2.c(i, this) == h) {
                                        return h;
                                    }
                                }
                                return j2.a;
                            }
                        }, 3, (Object)null);
                    }
                    return m;
                }
                throw x3.n.a(m);
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object f(final long n, final long n2, @e final kotlin.coroutines.d<? super DashboardContactHour> d) throws JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super DashboardContactHour>, Object>(null) {
            Object G;
            int H;
            private /* synthetic */ Object I;
            final /* synthetic */ b J;
            final /* synthetic */ long K;
            final /* synthetic */ long L;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object i, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                final p<r0, kotlin.coroutines.d<? super DashboardContactHour>, Object> p2 = new p<r0, kotlin.coroutines.d<? super DashboardContactHour>, Object>(d) {
                    Object G;
                    int H;
                    private /* synthetic */ Object I;
                    final /* synthetic */ b J = this.J;
                    final /* synthetic */ long K = this.K;
                    final /* synthetic */ long L = this.L;
                };
                p2.I = i;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super DashboardContactHour> d) {
                return ((b$e)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object f) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                x3.c c = null;
                r0 r0 = null;
                Object d = null;
                Label_0197: {
                    if (h2 != 0) {
                        if (h2 != 1) {
                            if (h2 == 2) {
                                c = (x3.c)this.G;
                                r0 = (r0)this.I;
                                c1.n(f);
                                d = f;
                                break Label_0197;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            r0 = (r0)this.I;
                            c1.n(f);
                        }
                    }
                    else {
                        c1.n(f);
                        r0 = (r0)this.I;
                        final com.untis.mobile.dashboard.network.c g = b.G(this.J);
                        final long k = this.K;
                        final long l = this.L;
                        this.I = r0;
                        this.H = 1;
                        f = g.f(k, l, this);
                        if (f == h) {
                            return h;
                        }
                    }
                    final x3.c g2 = (x3.c)f;
                    final com.untis.mobile.dashboard.persistence.dao.c y = b.y(this.J);
                    final long i = this.K;
                    this.I = r0;
                    this.G = g2;
                    this.H = 2;
                    d = y.d(i, this);
                    if (d == h) {
                        return h;
                    }
                    c = g2;
                }
                if (d != null) {
                    final DashboardContactHour dashboardContactHour = (DashboardContactHour)d;
                    dashboardContactHour.setSlots(c.a());
                    dashboardContactHour.setUserText(c.c());
                    dashboardContactHour.setTeacherText(c.b());
                    kotlinx.coroutines.h.f(r0, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ b H;
                        final /* synthetic */ DashboardContactHour I;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                int G;
                                final /* synthetic */ b H = this.H;
                                final /* synthetic */ DashboardContactHour I = this.I;
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
                                final com.untis.mobile.dashboard.persistence.dao.c y = b.y(this.H);
                                final DashboardContactHour i = this.I;
                                this.G = 1;
                                if (y.c(i, this) == h) {
                                    return h;
                                }
                            }
                            return j2.a;
                        }
                    }, 3, (Object)null);
                    return dashboardContactHour;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object g(@e final t t, @e final t t2, @e final kotlin.coroutines.d<? super List<DashboardStudentAbsence>> d) throws JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super List<? extends DashboardStudentAbsence>>, Object>(null) {
            int G;
            private /* synthetic */ Object H;
            final /* synthetic */ b I;
            final /* synthetic */ org.joda.time.t J;
            final /* synthetic */ org.joda.time.t K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object h, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                final p<r0, kotlin.coroutines.d<? super List<? extends DashboardStudentAbsence>>, Object> p2 = new p<r0, kotlin.coroutines.d<? super List<? extends DashboardStudentAbsence>>, Object>(d) {
                    int G;
                    private /* synthetic */ Object H;
                    final /* synthetic */ b I = this.I;
                    final /* synthetic */ org.joda.time.t J = this.J;
                    final /* synthetic */ org.joda.time.t K = this.K;
                };
                p2.H = h;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<DashboardStudentAbsence>> d) {
                return ((b$i)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object g) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g2 = this.G;
                r0 h2;
                if (g2 != 0) {
                    if (g2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h2 = (r0)this.H;
                    c1.n(g);
                }
                else {
                    c1.n(g);
                    h2 = (r0)this.H;
                    final com.untis.mobile.dashboard.network.c g3 = b.G(this.I);
                    final org.joda.time.t j = this.J;
                    final org.joda.time.t k = this.K;
                    this.H = h2;
                    this.G = 1;
                    g = g3.g(j, k, this);
                    if (g == h) {
                        return h;
                    }
                }
                final List list = (List)g;
                kotlinx.coroutines.h.f(h2, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H;
                    final /* synthetic */ List<DashboardStudentAbsence> I;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ b H = this.H;
                            final /* synthetic */ List<DashboardStudentAbsence> I = this.I;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((b$i$a)this.create(r0, d)).invokeSuspend(j2.a);
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
                            final k h2 = b.H(this.H);
                            this.G = 1;
                            if (h2.b(this) == h) {
                                return h;
                            }
                        }
                        final k h3 = b.H(this.H);
                        final List<DashboardStudentAbsence> i = this.I;
                        this.G = 2;
                        if (h3.a(i, this) == h) {
                            return h;
                        }
                        return j2.a;
                    }
                }, 3, (Object)null);
                return list;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object h(@e final kotlin.coroutines.d<? super List<DashboardClassLead>> d) {
        return h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super ArrayList<DashboardClassLead>>, Object>() {
            Object G;
            Object H;
            int I;
            final /* synthetic */ b J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super ArrayList<DashboardClassLead>>, Object>() {
                    Object G;
                    Object H;
                    int I;
                    final /* synthetic */ b J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super ArrayList<DashboardClassLead>> d) {
                return ((b$k)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int i = this.I;
                ArrayList g;
                Object all;
                List<DashboardClassbookEvent> a;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final List list = (List)this.H;
                    g = (ArrayList)this.G;
                    c1.n(o);
                    all = o;
                    a = (List<DashboardClassbookEvent>)list;
                }
                else {
                    c1.n(o);
                    g = new ArrayList();
                    a = b.w(this.J).a();
                    final k h2 = b.H(this.J);
                    this.G = g;
                    this.H = a;
                    this.I = 1;
                    all = h2.findAll(this);
                    if (all == h) {
                        return h;
                    }
                }
                final List<Object> list2 = (List<Object>)all;
                if (a.isEmpty() && list2.isEmpty()) {
                    return g;
                }
                final Profile l = j0.G.l(b.E(this.J));
                if (l == null) {
                    return g;
                }
                final Set<Long> userClasses = l.getUserClasses();
                final b j = this.J;
                final ArrayList<Klasse> list3 = new ArrayList<Klasse>();
                final Iterator<Number> iterator = userClasses.iterator();
                while (iterator.hasNext()) {
                    final Klasse n = b.C(j).N(iterator.next().longValue());
                    if (n != null) {
                        list3.add(n);
                    }
                }
                final b k = this.J;
                final ArrayList list4 = new ArrayList<DashboardClassLead>(v.Y((Iterable<?>)list3, 10));
                for (final Klasse klasse : list3) {
                    final ArrayList<DashboardClassbookEvent> list5 = new ArrayList<DashboardClassbookEvent>();
                    for (final DashboardClassbookEvent next : a) {
                        final Long klassenId = next.getKlassenId();
                        final long id = klasse.getId();
                        boolean b = false;
                        Label_0396: {
                            if (klassenId != null) {
                                if (klassenId == id) {
                                    b = true;
                                    break Label_0396;
                                }
                            }
                            b = false;
                        }
                        if (kotlin.coroutines.jvm.internal.b.a(b)) {
                            list5.add(next);
                        }
                    }
                    final List<Comparable> d5 = v.d5((Iterable<? extends Comparable>)list5);
                    final ArrayList<DashboardStudentAbsence> list6 = new ArrayList<DashboardStudentAbsence>();
                    for (final DashboardStudentAbsence next2 : list2) {
                        if (kotlin.coroutines.jvm.internal.b.a(next2.getKlassenId() == klasse.getId())) {
                            list6.add(next2);
                        }
                    }
                    final List<Comparable> d6 = v.d5((Iterable<? extends Comparable>)list6);
                    final ArrayList<Number> list7 = new ArrayList<Number>();
                    final Iterator<DashboardStudentAbsence> iterator5 = list2.iterator();
                    while (iterator5.hasNext()) {
                        final DashboardExcuse excuse = iterator5.next().getExcuse();
                        Number g2;
                        if (excuse == null) {
                            g2 = null;
                        }
                        else {
                            g2 = kotlin.coroutines.jvm.internal.b.g(excuse.getStatusId());
                        }
                        if (g2 != null) {
                            list7.add(g2);
                        }
                    }
                    final List<Object> n2 = v.N1((Iterable<?>)list7);
                    final ArrayList<ExcuseStatus> list8 = new ArrayList<ExcuseStatus>();
                    final Iterator<Number> iterator6 = n2.iterator();
                    final List<Comparable> list9 = d6;
                    while (iterator6.hasNext()) {
                        final ExcuseStatus c = b.C(k).c(iterator6.next().longValue());
                        if (c != null) {
                            list8.add(c);
                        }
                    }
                    final android.util.LongSparseArray<Entity> e = com.untis.mobile.utils.extension.c.e((List<? extends Entity>)list8);
                    final ArrayList list10 = new ArrayList<Long>(v.Y((Iterable<?>)list2, 10));
                    final Iterator<DashboardStudentAbsence> iterator7 = list2.iterator();
                    while (iterator7.hasNext()) {
                        list10.add(kotlin.coroutines.jvm.internal.b.g(iterator7.next().getReasonId()));
                    }
                    final List<Object> n3 = v.N1((Iterable<?>)list10);
                    final ArrayList<AbsenceReason> list11 = new ArrayList<AbsenceReason>();
                    final Iterator<Number> iterator8 = n3.iterator();
                    while (iterator8.hasNext()) {
                        final AbsenceReason h3 = b.C(k).H(iterator8.next().longValue());
                        if (h3 != null) {
                            list11.add(h3);
                        }
                    }
                    final android.util.LongSparseArray<Entity> e2 = com.untis.mobile.utils.extension.c.e((List<? extends Entity>)list11);
                    final ArrayList list12 = new ArrayList<Long>(v.Y((Iterable<?>)a, 10));
                    final Iterator<Object> iterator9 = a.iterator();
                    while (iterator9.hasNext()) {
                        list12.add(kotlin.coroutines.jvm.internal.b.g(iterator9.next().getReasonId()));
                    }
                    final List<Object> n4 = v.N1((Iterable<?>)list12);
                    final ArrayList<EventReason> list13 = new ArrayList<EventReason>();
                    final Iterator<Number> iterator10 = n4.iterator();
                    while (iterator10.hasNext()) {
                        final EventReason w = b.C(k).w(iterator10.next().longValue());
                        if (w != null) {
                            list13.add(w);
                        }
                    }
                    final android.util.LongSparseArray<Entity> e3 = com.untis.mobile.utils.extension.c.e((List<? extends Entity>)list13);
                    final ArrayList<DashboardClassbookEvent> list14 = new ArrayList<DashboardClassbookEvent>();
                    for (final DashboardClassbookEvent next3 : a) {
                        if (kotlin.coroutines.jvm.internal.b.a(next3.getEntityType() == EntityType.STUDENT)) {
                            list14.add(next3);
                        }
                    }
                    final ArrayList list15 = new ArrayList<Long>(v.Y((Iterable<?>)list14, 10));
                    final Iterator<Object> iterator12 = list14.iterator();
                    while (iterator12.hasNext()) {
                        list15.add(kotlin.coroutines.jvm.internal.b.g(iterator12.next().getEntityId()));
                    }
                    final ArrayList list16 = new ArrayList<Object>(v.Y((Iterable<?>)list2, 10));
                    final Iterator<DashboardStudentAbsence> iterator13 = list2.iterator();
                    while (iterator13.hasNext()) {
                        list16.add((T)kotlin.coroutines.jvm.internal.b.g(iterator13.next().getStudentId()));
                    }
                    final List<Object> n5 = v.N1((Iterable<?>)v.q4((Collection<?>)list15, (Iterable<?>)list16));
                    final ArrayList<Student> list17 = new ArrayList<Student>();
                    final Iterator<Number> iterator14 = n5.iterator();
                    while (iterator14.hasNext()) {
                        final Student v = b.C(k).V(iterator14.next().longValue());
                        if (v != null) {
                            list17.add(v);
                        }
                    }
                    final android.util.LongSparseArray<Entity> e4 = com.untis.mobile.utils.extension.c.e((List<? extends Entity>)list17);
                    final ArrayList<DashboardClassbookEvent> list18 = new ArrayList<DashboardClassbookEvent>();
                    for (final DashboardClassbookEvent next4 : a) {
                        if (kotlin.coroutines.jvm.internal.b.a(next4.getEntityType() == EntityType.CLASS)) {
                            list18.add(next4);
                        }
                    }
                    final ArrayList list19 = new ArrayList<Long>(v.Y((Iterable<?>)list18, 10));
                    final Iterator<Object> iterator16 = list18.iterator();
                    while (iterator16.hasNext()) {
                        list19.add(kotlin.coroutines.jvm.internal.b.g(iterator16.next().getEntityId()));
                    }
                    final ArrayList list20 = new ArrayList<Object>(v.Y((Iterable<?>)list2, 10));
                    final Iterator<DashboardStudentAbsence> iterator17 = list2.iterator();
                    while (iterator17.hasNext()) {
                        list20.add((T)kotlin.coroutines.jvm.internal.b.g(iterator17.next().getKlassenId()));
                    }
                    final List<Object> n6 = v.N1((Iterable<?>)v.q4((Collection<?>)list19, (Iterable<?>)list20));
                    final ArrayList<Klasse> list21 = new ArrayList<Klasse>();
                    final Iterator<Number> iterator18 = n6.iterator();
                    while (iterator18.hasNext()) {
                        final Klasse n7 = b.C(k).N(iterator18.next().longValue());
                        if (n7 != null) {
                            list21.add(n7);
                        }
                    }
                    list4.add(new DashboardClassLead(klasse, (List<DashboardClassbookEvent>)d5, (List<DashboardStudentAbsence>)list9, (LongSparseArray<AbsenceReason>)e2, (LongSparseArray<EventReason>)e3, (LongSparseArray<ExcuseStatus>)e, (LongSparseArray<Student>)e4, (LongSparseArray<Klasse>)com.untis.mobile.utils.extension.c.e((List<? extends Entity>)list21)));
                }
                return g;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object i(@e final kotlin.coroutines.d<? super List<DashboardContactHour>> d) {
        return h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super List<? extends DashboardContactHour>>, Object>() {
            int G;
            final /* synthetic */ b H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends DashboardContactHour>>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<DashboardContactHour>> d) {
                return ((b$m)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object all) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(all);
                }
                else {
                    c1.n(all);
                    final com.untis.mobile.dashboard.persistence.dao.c y = b.y(this.H);
                    this.G = 1;
                    if ((all = y.findAll(this)) == h) {
                        return h;
                    }
                }
                return all;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object j(@e final kotlin.coroutines.d<? super List<DashboardStudentAbsence>> d) {
        return h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super List<? extends DashboardStudentAbsence>>, Object>() {
            int G;
            final /* synthetic */ b H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends DashboardStudentAbsence>>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<DashboardStudentAbsence>> d) {
                return ((b$p)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object all) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(all);
                }
                else {
                    c1.n(all);
                    final k h2 = b.H(this.H);
                    this.G = 1;
                    if ((all = h2.findAll(this)) == h) {
                        return h;
                    }
                }
                return all;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object k(@e final Reminder reminder, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ Reminder I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ Reminder I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$v)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final com.untis.mobile.core.service.a f = b.this.R();
                    final Reminder i = this.I;
                    this.G = 1;
                    if (f.d(i, this) == h) {
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
    public Object l(@e final t t, @e final t t2, @e final EntityType entityType, @e final List<Long> list, @e final kotlin.coroutines.d<? super List<DashboardEvent>> d) throws JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super ArrayList<DashboardEvent>>, Object>(t2) {
            Object G;
            Object H;
            Object I;
            Object J;
            Object K;
            Object L;
            Object M;
            Object N;
            Object O;
            Object P;
            Object Q;
            Object R;
            long S;
            int T;
            private /* synthetic */ Object U;
            final /* synthetic */ List<Long> V;
            final /* synthetic */ b W;
            final /* synthetic */ org.joda.time.t X;
            final /* synthetic */ org.joda.time.t Y;
            final /* synthetic */ EntityType Z;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object u, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                final p<r0, kotlin.coroutines.d<? super ArrayList<DashboardEvent>>, Object> p2 = new p<r0, kotlin.coroutines.d<? super ArrayList<DashboardEvent>>, Object>() {
                    Object G;
                    Object H;
                    Object I;
                    Object J;
                    Object K;
                    Object L;
                    Object M;
                    Object N;
                    Object O;
                    Object P;
                    Object Q;
                    Object R;
                    long S;
                    int T;
                    private /* synthetic */ Object U;
                    final /* synthetic */ List<Long> V = this.V;
                    final /* synthetic */ b W = this.W;
                    final /* synthetic */ org.joda.time.t X = this.X;
                    final /* synthetic */ org.joda.time.t Y = this.Y;
                    final /* synthetic */ EntityType Z = this.Z;
                };
                p2.U = u;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super ArrayList<DashboardEvent>> d) {
                return ((b$g)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int t = this.T;
                while (true) {
                    DashboardHomework r4 = null;
                    Iterable<? extends T> iterable2 = null;
                    Iterator<Number> iterator4 = null;
                    org.joda.time.t t5 = null;
                    b b2 = null;
                    ArrayList<DashboardHomework> list7 = null;
                    ArrayList<? extends T> list9 = null;
                    Boolean b3 = null;
                    Object o6 = null;
                    org.joda.time.t t7 = null;
                    Label_1359: {
                        long s = 0L;
                        p<r0, kotlin.coroutines.d<? super ArrayList<DashboardEvent>>, Object> p2 = null;
                        Iterable<DashboardExam> o5 = null;
                        Iterator<Number> n = null;
                        b k = null;
                        EntityType entityType3 = null;
                        r0 u3 = null;
                        Object e2 = null;
                        ArrayList<DashboardExam> list17 = null;
                        Label_1053: {
                            ArrayList<DashboardHomework> list4 = null;
                            ArrayList<DashboardExam> list5 = null;
                            ArrayList<? extends T> list6 = null;
                            r0 r3 = null;
                            Object l = null;
                            org.joda.time.t m = null;
                            Label_1004: {
                                ArrayList<? extends T> g = null;
                                ArrayList<DashboardHomework> i = null;
                                org.joda.time.t t3 = null;
                                ArrayList<DashboardExam> h2 = null;
                                Label_0778: {
                                    EntityType entityType = null;
                                    org.joda.time.t t2 = null;
                                    b b = null;
                                    ArrayList<DashboardHomework> list3 = null;
                                    r0 r2 = null;
                                    Object o3 = null;
                                    Iterator<Number> iterator3 = null;
                                    Object o4 = null;
                                    Label_0725: {
                                        org.joda.time.t x = null;
                                        org.joda.time.t y = null;
                                        EntityType z = null;
                                        Iterator<Number> iterator = null;
                                        ArrayList<DashboardExam> list2 = null;
                                        b j = null;
                                        p<r0, kotlin.coroutines.d<? super ArrayList<DashboardEvent>>, Object> p = null;
                                        r0 u = null;
                                        Label_0506: {
                                            if (t == 0) {
                                                c1.n(o);
                                                final r0 r0 = (r0)this.U;
                                                g = (ArrayList<? extends T>)new ArrayList<Comparable<? super T>>();
                                                final ArrayList<DashboardExam> list = new ArrayList<DashboardExam>();
                                                i = new ArrayList<DashboardHomework>();
                                                final List<Long> v = this.V;
                                                final b w = this.W;
                                                x = this.X;
                                                y = this.Y;
                                                z = this.Z;
                                                iterator = v.iterator();
                                                o = h;
                                                list2 = list;
                                                j = w;
                                                p = this;
                                                u = r0;
                                                break Label_0506;
                                            }
                                            if (t == 1) {
                                                final Object o2 = h;
                                                s = this.S;
                                                final Iterator iterator2 = (Iterator)this.N;
                                                entityType = (EntityType)this.M;
                                                t2 = (org.joda.time.t)this.L;
                                                t3 = (org.joda.time.t)this.K;
                                                b = (b)this.J;
                                                list3 = (ArrayList<DashboardHomework>)this.I;
                                                h2 = (ArrayList<DashboardExam>)this.H;
                                                g = (ArrayList<? extends T>)this.G;
                                                r2 = (r0)this.U;
                                                c1.n(o);
                                                o3 = o;
                                                iterator3 = (Iterator<Number>)iterator2;
                                                p2 = this;
                                                o4 = o2;
                                                break Label_0725;
                                            }
                                            if (t == 2) {
                                                s = this.S;
                                                o5 = (Iterable<DashboardExam>)this.O;
                                                n = (Iterator<Number>)this.N;
                                                final EntityType entityType2 = (EntityType)this.M;
                                                final org.joda.time.t t4 = (org.joda.time.t)this.L;
                                                t3 = (org.joda.time.t)this.K;
                                                k = (b)this.J;
                                                list4 = (ArrayList<DashboardHomework>)this.I;
                                                list5 = (ArrayList<DashboardExam>)this.H;
                                                list6 = (ArrayList<? extends T>)this.G;
                                                r3 = (r0)this.U;
                                                c1.n(o);
                                                l = o;
                                                p2 = this;
                                                o = h;
                                                entityType3 = entityType2;
                                                m = t4;
                                                break Label_1004;
                                            }
                                            if (t == 3) {
                                                s = this.S;
                                                r4 = (DashboardHomework)this.R;
                                                final Iterator<DashboardHomework> q = (Iterator<DashboardHomework>)this.Q;
                                                final Iterable<DashboardHomework> iterable = (Iterable<DashboardHomework>)this.P;
                                                iterable2 = (Iterable<? extends T>)this.O;
                                                iterator4 = (Iterator<Number>)this.N;
                                                final EntityType entityType4 = (EntityType)this.M;
                                                t5 = (org.joda.time.t)this.L;
                                                final org.joda.time.t t6 = (org.joda.time.t)this.K;
                                                b2 = (b)this.J;
                                                list7 = (ArrayList<DashboardHomework>)this.I;
                                                final ArrayList list8 = (ArrayList)this.H;
                                                list9 = (ArrayList<? extends T>)this.G;
                                                b3 = (Boolean)h;
                                                final r0 u2 = (r0)this.U;
                                                c1.n(o);
                                                o6 = o;
                                                final p<r0, kotlin.coroutines.d<? super ArrayList<DashboardEvent>>, Object> p3 = this;
                                                list2 = (ArrayList<DashboardExam>)list8;
                                                t7 = t6;
                                                break Label_1359;
                                            }
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            Iterator<DashboardHomework> q = null;
                                            Iterable<DashboardHomework> iterable = null;
                                            EntityType entityType4 = null;
                                            r0 u2 = null;
                                            p<r0, kotlin.coroutines.d<? super ArrayList<DashboardEvent>>, Object> p3 = null;
                                            final b j2;
                                            final org.joda.time.t l2;
                                            final Object o7;
                                            final Object o8;
                                            while (q.hasNext()) {
                                                r4 = q.next();
                                                r4.setEntityType(entityType4);
                                                r4.setEntityId(kotlin.coroutines.jvm.internal.b.g(s));
                                                if (com.untis.mobile.dashboard.service.b.J(j2)) {
                                                    p3.U = u2;
                                                    p3.G = g;
                                                    p3.H = list2;
                                                    p3.I = i;
                                                    p3.J = j2;
                                                    p3.K = t3;
                                                    p3.L = l2;
                                                    p3.M = entityType4;
                                                    p3.N = iterator;
                                                    p3.O = o7;
                                                    p3.P = iterable;
                                                    p3.Q = q;
                                                    p3.R = r4;
                                                    p3.S = s;
                                                    p3.T = 3;
                                                    final Object x2 = j2.P(r4, p3);
                                                    if (x2 == o8) {
                                                        return o8;
                                                    }
                                                    final Iterator<Number> iterator5 = iterator;
                                                    iterable2 = (Iterable<? extends T>)o7;
                                                    final ArrayList<DashboardHomework> list10 = i;
                                                    t5 = l2;
                                                    final ArrayList<? extends T> list11 = g;
                                                    b3 = (Boolean)o8;
                                                    t7 = t3;
                                                    b2 = j2;
                                                    iterator4 = iterator5;
                                                    list9 = list11;
                                                    list7 = list10;
                                                    o6 = x2;
                                                    break Label_1359;
                                                }
                                            }
                                            list2.addAll((Collection<? extends DashboardExam>)o7);
                                            i.addAll((Collection<? extends DashboardHomework>)iterable);
                                            final ArrayList list12 = new ArrayList<DashboardEvent>(v.Y((Iterable<?>)o7, 10));
                                            final Iterator<? extends T> iterator6 = ((Iterable<? extends T>)o7).iterator();
                                            while (iterator6.hasNext()) {
                                                list12.add(((DashboardExam)iterator6.next()).toDashboardEvent(com.untis.mobile.dashboard.service.b.E(j2), com.untis.mobile.dashboard.service.b.C(j2)));
                                            }
                                            final Iterator<DashboardEvent> iterator7 = (Iterator<DashboardEvent>)list12.iterator();
                                            while (iterator7.hasNext()) {
                                                j2.N(g, iterator7.next());
                                            }
                                            final ArrayList list13 = new ArrayList<DashboardEvent>(v.Y((Iterable<?>)iterable, 10));
                                            final Iterator<DashboardHomework> iterator8 = iterable.iterator();
                                            while (iterator8.hasNext()) {
                                                list13.add(iterator8.next().toDashboardEvent(com.untis.mobile.dashboard.service.b.E(j2), com.untis.mobile.dashboard.service.b.z(j2), com.untis.mobile.dashboard.service.b.C(j2), com.untis.mobile.dashboard.service.b.I(j2)));
                                            }
                                            final Iterator<DashboardEvent> iterator9 = (Iterator<DashboardEvent>)list13.iterator();
                                            while (iterator9.hasNext()) {
                                                j2.N(g, iterator9.next());
                                            }
                                            final Object o9 = o8;
                                            u = u2;
                                            final EntityType entityType5 = entityType4;
                                            final p<r0, kotlin.coroutines.d<? super ArrayList<DashboardEvent>>, Object> p4 = p3;
                                            y = l2;
                                            o = o9;
                                            z = entityType5;
                                            p = p4;
                                            x = t3;
                                            j = j2;
                                        }
                                        if (!iterator.hasNext()) {
                                            kotlinx.coroutines.h.f(u, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(null) {
                                                int G;
                                                final /* synthetic */ b H;
                                                final /* synthetic */ ArrayList<DashboardExam> I;
                                                final /* synthetic */ ArrayList<DashboardHomework> J;
                                                
                                                @org.jetbrains.annotations.e
                                                @Override
                                                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                                                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                                                        int G;
                                                        final /* synthetic */ b H = this.H;
                                                        final /* synthetic */ ArrayList<DashboardExam> I = this.I;
                                                        final /* synthetic */ ArrayList<DashboardHomework> J = this.J;
                                                    };
                                                }
                                                
                                                @org.jetbrains.annotations.f
                                                @Override
                                                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                                                    return ((b$g$a)this.create(r0, d)).invokeSuspend(j2.a);
                                                }
                                                
                                                @org.jetbrains.annotations.f
                                                public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                                                    final Object h = kotlin.coroutines.intrinsics.b.h();
                                                    Label_0417: {
                                                        Label_0383: {
                                                            Label_0271: {
                                                                Label_0160: {
                                                                    switch (this.G) {
                                                                        default: {
                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                        }
                                                                        case 6: {
                                                                            c1.n(o);
                                                                            return j2.a;
                                                                        }
                                                                        case 5: {
                                                                            c1.n(o);
                                                                            break Label_0417;
                                                                        }
                                                                        case 4: {
                                                                            c1.n(o);
                                                                            break Label_0383;
                                                                        }
                                                                        case 3: {
                                                                            c1.n(o);
                                                                            break Label_0271;
                                                                        }
                                                                        case 2: {
                                                                            c1.n(o);
                                                                            break Label_0160;
                                                                        }
                                                                        case 1: {
                                                                            c1.n(o);
                                                                            break;
                                                                        }
                                                                        case 0: {
                                                                            c1.n(o);
                                                                            final com.untis.mobile.dashboard.persistence.dao.e a = b.A(this.H);
                                                                            this.G = 1;
                                                                            if (a.b(this) == h) {
                                                                                return h;
                                                                            }
                                                                            break;
                                                                        }
                                                                    }
                                                                    final g b = com.untis.mobile.dashboard.service.b.B(this.H);
                                                                    this.G = 2;
                                                                    if (b.b(this) == h) {
                                                                        return h;
                                                                    }
                                                                }
                                                                final com.untis.mobile.core.service.a f = this.H.R();
                                                                final String e = b.E(this.H);
                                                                final ReminderType dashboardUpcomingExam = ReminderType.DashboardUpcomingExam;
                                                                final ArrayList<DashboardExam> i = this.I;
                                                                o = new ArrayList(v.Y((Iterable<?>)i, 10));
                                                                final Iterator<Object> iterator = i.iterator();
                                                                while (iterator.hasNext()) {
                                                                    ((Collection<Long>)o).add(kotlin.coroutines.jvm.internal.b.g(iterator.next().getId()));
                                                                }
                                                                this.G = 3;
                                                                if (f.a(e, dashboardUpcomingExam, (List<Long>)o, this) == h) {
                                                                    return h;
                                                                }
                                                            }
                                                            final com.untis.mobile.core.service.a f2 = this.H.R();
                                                            final String e2 = b.E(this.H);
                                                            final ReminderType dashboardUpcomingHomework = ReminderType.DashboardUpcomingHomework;
                                                            final ArrayList<DashboardHomework> j = this.J;
                                                            final ArrayList list = new ArrayList<Long>(v.Y((Iterable<?>)j, 10));
                                                            final Iterator<Object> iterator2 = j.iterator();
                                                            while (iterator2.hasNext()) {
                                                                list.add(kotlin.coroutines.jvm.internal.b.g(iterator2.next().getId()));
                                                            }
                                                            this.G = 4;
                                                            if (f2.a(e2, dashboardUpcomingHomework, (List<Long>)list, this) == h) {
                                                                return h;
                                                            }
                                                        }
                                                        final com.untis.mobile.dashboard.persistence.dao.e a2 = b.A(this.H);
                                                        final ArrayList<DashboardExam> k = this.I;
                                                        this.G = 5;
                                                        if (a2.a(k, this) == h) {
                                                            return h;
                                                        }
                                                    }
                                                    final g b2 = b.B(this.H);
                                                    final ArrayList<DashboardHomework> l = this.J;
                                                    this.G = 6;
                                                    if (b2.a(l, this) == h) {
                                                        return h;
                                                    }
                                                    return j2.a;
                                                }
                                            }, 3, (Object)null);
                                            final List v2 = com.untis.mobile.dashboard.service.b.this.O(p.X, p.Y);
                                            g.addAll(v2);
                                            kotlinx.coroutines.h.f(u, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                                int G;
                                                final /* synthetic */ b H;
                                                final /* synthetic */ List<DashboardEvent> I;
                                                
                                                @org.jetbrains.annotations.e
                                                @Override
                                                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                                                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                                        int G;
                                                        final /* synthetic */ b H = this.H;
                                                        final /* synthetic */ List<DashboardEvent> I = this.I;
                                                    };
                                                }
                                                
                                                @org.jetbrains.annotations.f
                                                @Override
                                                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                                                    return ((b$g$b)this.create(r0, d)).invokeSuspend(j2.a);
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
                                                        final com.untis.mobile.core.service.a f = this.H.R();
                                                        final String e = b.E(this.H);
                                                        final ReminderType dashboardUpcomingLocalHomework = ReminderType.DashboardUpcomingLocalHomework;
                                                        final List<DashboardEvent> i = this.I;
                                                        final ArrayList list = new ArrayList<Long>(v.Y((Iterable<?>)i, 10));
                                                        final Iterator<Object> iterator = i.iterator();
                                                        while (iterator.hasNext()) {
                                                            list.add(kotlin.coroutines.jvm.internal.b.g(iterator.next().getEventId()));
                                                        }
                                                        this.G = 1;
                                                        if (f.a(e, dashboardUpcomingLocalHomework, (List<Long>)list, this) == h) {
                                                            return h;
                                                        }
                                                    }
                                                    return j2.a;
                                                }
                                            }, 3, (Object)null);
                                            v.d5((Iterable<? extends Comparable>)g);
                                            return g;
                                        }
                                        s = iterator.next().longValue();
                                        if (!com.untis.mobile.dashboard.service.b.K(j)) {
                                            final List<Object> e = v.E();
                                            final EntityType entityType6 = z;
                                            final org.joda.time.t t8 = y;
                                            final org.joda.time.t t9 = x;
                                            final b b4 = j;
                                            final ArrayList<DashboardExam> list14 = list2;
                                            u3 = u;
                                            n = iterator;
                                            o5 = (Iterable<DashboardExam>)e;
                                            entityType3 = entityType6;
                                            m = t8;
                                            t3 = t9;
                                            k = b4;
                                            p2 = p;
                                            h2 = list14;
                                            break Label_0778;
                                        }
                                        final com.untis.mobile.dashboard.network.c g2 = com.untis.mobile.dashboard.service.b.G(j);
                                        p.U = u;
                                        p.G = g;
                                        p.H = list2;
                                        p.I = i;
                                        p.J = j;
                                        p.K = x;
                                        p.L = y;
                                        p.M = z;
                                        p.N = iterator;
                                        p.O = null;
                                        p.P = null;
                                        p.Q = null;
                                        p.R = null;
                                        p.S = s;
                                        p.T = 1;
                                        final Object k2 = g2.k(x, y, z, s, p);
                                        if (k2 == o) {
                                            return o;
                                        }
                                        final p<r0, kotlin.coroutines.d<? super ArrayList<DashboardEvent>>, Object> p5 = p;
                                        final EntityType entityType7 = z;
                                        final org.joda.time.t t10 = y;
                                        final org.joda.time.t t11 = x;
                                        r2 = u;
                                        o4 = o;
                                        h2 = list2;
                                        p2 = p5;
                                        list3 = i;
                                        b = j;
                                        t3 = t11;
                                        t2 = t10;
                                        o3 = k2;
                                        iterator3 = iterator;
                                        entityType = entityType7;
                                    }
                                    final List<DashboardExam> list15 = (List<DashboardExam>)o3;
                                    final ArrayList<DashboardHomework> list16 = list3;
                                    final r0 r5 = r2;
                                    k = b;
                                    final org.joda.time.t t12 = t2;
                                    final EntityType entityType8 = entityType;
                                    final Object o10 = o4;
                                    i = list16;
                                    u3 = r5;
                                    m = t12;
                                    entityType3 = entityType8;
                                    o5 = list15;
                                    n = iterator3;
                                    o = o10;
                                }
                                if (!b.L(k)) {
                                    e2 = v.E();
                                    list17 = h2;
                                    final org.joda.time.t l2 = m;
                                    break Label_1053;
                                }
                                final com.untis.mobile.dashboard.network.c g3 = b.G(k);
                                p2.U = u3;
                                p2.G = g;
                                p2.H = h2;
                                p2.I = i;
                                p2.J = k;
                                p2.K = t3;
                                p2.L = m;
                                p2.M = entityType3;
                                p2.N = n;
                                p2.O = o5;
                                p2.P = null;
                                p2.Q = null;
                                p2.R = null;
                                p2.S = s;
                                p2.T = 2;
                                l = g3.i(t3, m, entityType3, s, p2);
                                if (l == o) {
                                    return o;
                                }
                                final ArrayList<DashboardHomework> list18 = i;
                                r3 = u3;
                                final ArrayList<? extends T> list19 = g;
                                list5 = h2;
                                list6 = list19;
                                list4 = list18;
                            }
                            final List<DashboardHomework> list20 = (List<DashboardHomework>)l;
                            final ArrayList<DashboardHomework> list21 = list4;
                            list17 = list5;
                            ArrayList<? extends T> g = list6;
                            final org.joda.time.t l2 = m;
                            u3 = r3;
                            ArrayList<DashboardHomework> i = list21;
                            e2 = list20;
                        }
                        for (final DashboardExam dashboardExam : o5) {
                            dashboardExam.setEntityType(entityType3);
                            dashboardExam.setEntityId(kotlin.coroutines.jvm.internal.b.g(s));
                        }
                        final Iterator<DashboardHomework> iterator11 = ((Iterable<DashboardHomework>)e2).iterator();
                        final b b5 = k;
                        final p<r0, kotlin.coroutines.d<? super ArrayList<DashboardEvent>>, Object> p6 = p2;
                        final Iterable<DashboardExam> iterable3 = o5;
                        final Iterator<Number> iterator12 = n;
                        ArrayList<DashboardExam> list2 = list17;
                        final b j2 = b5;
                        final r0 u2 = u3;
                        final Iterable<DashboardHomework> iterable = (Iterable<DashboardHomework>)e2;
                        final Iterator<DashboardHomework> q = iterator11;
                        final Object o7 = iterable3;
                        Iterator<Number> iterator = iterator12;
                        final EntityType entityType4 = entityType3;
                        final Object o8 = o;
                        final p<r0, kotlin.coroutines.d<? super ArrayList<DashboardEvent>>, Object> p3 = p6;
                        continue;
                    }
                    r4.setCompleted((boolean)o6);
                    final Boolean b6 = b3;
                    final ArrayList<DashboardHomework> list22 = list7;
                    final Object o7 = iterable2;
                    ArrayList<? extends T> g = list9;
                    org.joda.time.t t3 = t7;
                    final Object o8 = b6;
                    Iterator<Number> iterator = iterator4;
                    final org.joda.time.t l2 = t5;
                    final b j2 = b2;
                    ArrayList<DashboardHomework> i = list22;
                    continue;
                }
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object m(@e final ReminderType reminderType, final long n, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>(null) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ ReminderType I;
            final /* synthetic */ long J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ ReminderType I = this.I;
                    final /* synthetic */ long J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$c)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final com.untis.mobile.core.service.a f = b.this.R();
                    final String e = b.E(this.H);
                    final ReminderType i = this.I;
                    final long j = this.J;
                    this.G = 1;
                    if (f.delete(e, i, j, this) == h) {
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
    public Object n(@e final DashboardStudentAbsence dashboardStudentAbsence, final long n, @e final kotlin.coroutines.d<? super DashboardStudentAbsence> d) throws y3.c, JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super DashboardStudentAbsence>, Object>(null) {
            int G;
            private /* synthetic */ Object H;
            final /* synthetic */ b I;
            final /* synthetic */ DashboardStudentAbsence J;
            final /* synthetic */ long K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object h, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                final p<r0, kotlin.coroutines.d<? super DashboardStudentAbsence>, Object> p2 = new p<r0, kotlin.coroutines.d<? super DashboardStudentAbsence>, Object>(d) {
                    int G;
                    private /* synthetic */ Object H;
                    final /* synthetic */ b I = this.I;
                    final /* synthetic */ DashboardStudentAbsence J = this.J;
                    final /* synthetic */ long K = this.K;
                };
                p2.H = h;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super DashboardStudentAbsence> d) {
                return ((b$s)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object h) {
                final Object h2 = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                final boolean b = true;
                r0 h3;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h3 = (r0)this.H;
                    c1.n(h);
                }
                else {
                    c1.n(h);
                    h3 = (r0)this.H;
                    final com.untis.mobile.dashboard.network.c g2 = com.untis.mobile.dashboard.service.b.G(this.I);
                    final long id = this.J.getId();
                    final long k = this.K;
                    this.H = h3;
                    this.G = 1;
                    h = g2.h(id, k, this);
                    if (h == h2) {
                        return h2;
                    }
                }
                final x3.i i = (x3.i)h;
                final List<y3.a> b2 = i.b();
                int n = b ? 1 : 0;
                if (b2 != null) {
                    if (b2.isEmpty()) {
                        n = (b ? 1 : 0);
                    }
                    else {
                        n = 0;
                    }
                }
                if (n != 0) {
                    final DashboardStudentAbsence a = i.a();
                    a.setKlassenId(this.J.getKlassenId());
                    h.f(h3, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ b H;
                        final /* synthetic */ DashboardStudentAbsence I;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                int G;
                                final /* synthetic */ b H = this.H;
                                final /* synthetic */ DashboardStudentAbsence I = this.I;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                            return ((b$s$a)this.create(r0, d)).invokeSuspend(j2.a);
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
                                final k h2 = b.H(this.H);
                                final DashboardStudentAbsence i = this.I;
                                this.G = 1;
                                if (h2.c(i, this) == h) {
                                    return h;
                                }
                            }
                            return j2.a;
                        }
                    }, 3, (Object)null);
                    return a;
                }
                throw j.a(i);
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object o(@e final t t, @e final t t2, @e final kotlin.coroutines.d<? super List<DashboardEvent>> d) {
        return h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super List<DashboardEvent>>, Object>(null) {
            Object G;
            int H;
            final /* synthetic */ b I;
            final /* synthetic */ org.joda.time.t J;
            final /* synthetic */ org.joda.time.t K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<DashboardEvent>>, Object>(d) {
                    Object G;
                    int H;
                    final /* synthetic */ b I = this.I;
                    final /* synthetic */ org.joda.time.t J = this.J;
                    final /* synthetic */ org.joda.time.t K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<DashboardEvent>> d) {
                return ((b$n)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                j1.h h3 = null;
                Label_0410: {
                    if (h2 != 0) {
                        if (h2 != 1) {
                            if (h2 == 2) {
                                h3 = (j1.h)this.G;
                                c1.n(o);
                                break Label_0410;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            h3 = (j1.h)this.G;
                            c1.n(o);
                        }
                    }
                    else {
                        c1.n(o);
                        h3 = new j1.h();
                        h3.G = (T)new ArrayList();
                        final g b = com.untis.mobile.dashboard.service.b.B(this.I);
                        this.G = h3;
                        this.H = 1;
                        o = b.findAll(this);
                        if (o == h) {
                            return h;
                        }
                    }
                    final Iterable iterable = (Iterable)o;
                    final org.joda.time.t j = this.J;
                    final org.joda.time.t k = this.K;
                    o = new ArrayList();
                    for (final DashboardHomework next : iterable) {
                        final DashboardHomework dashboardHomework = next;
                        if (kotlin.coroutines.jvm.internal.b.a(com.untis.mobile.utils.d0.e(j, dashboardHomework.getEnd()) && com.untis.mobile.utils.d0.d(k, dashboardHomework.getStart()))) {
                            ((Collection<DashboardHomework>)o).add(next);
                        }
                    }
                    final b i = this.I;
                    final ArrayList<DashboardEvent> list = new ArrayList<DashboardEvent>(v.Y((Iterable<?>)o, 10));
                    final Iterator<DashboardHomework> iterator2 = (Iterator<DashboardHomework>)((Iterable<Object>)o).iterator();
                    while (iterator2.hasNext()) {
                        list.add(iterator2.next().toDashboardEvent(b.E(i), b.z(i), b.C(i), b.I(i)));
                    }
                    final b l = this.I;
                    final Iterator<Object> iterator3 = list.iterator();
                    while (iterator3.hasNext()) {
                        l.N((List)h3.G, iterator3.next());
                    }
                    final com.untis.mobile.dashboard.persistence.dao.e a = b.A(this.I);
                    this.G = h3;
                    this.H = 2;
                    o = a.findAll(this);
                    if (o == h) {
                        return h;
                    }
                }
                final Iterable iterable2 = (Iterable)o;
                final org.joda.time.t m = this.J;
                final org.joda.time.t k2 = this.K;
                o = new ArrayList();
                for (final DashboardExam next2 : iterable2) {
                    final DashboardExam dashboardExam = next2;
                    final org.joda.time.t h4 = dashboardExam.getEnd().h1();
                    k0.o(h4, "it.end.toLocalDate()");
                    boolean b2 = false;
                    Label_0532: {
                        if (com.untis.mobile.utils.d0.e(m, h4)) {
                            final org.joda.time.t h5 = dashboardExam.getStart().h1();
                            k0.o(h5, "it.start.toLocalDate()");
                            if (com.untis.mobile.utils.d0.d(k2, h5)) {
                                b2 = true;
                                break Label_0532;
                            }
                        }
                        b2 = false;
                    }
                    if (kotlin.coroutines.jvm.internal.b.a(b2)) {
                        ((Collection<DashboardExam>)o).add(next2);
                    }
                }
                final b i2 = this.I;
                final ArrayList<DashboardEvent> list2 = new ArrayList<DashboardEvent>(v.Y((Iterable<?>)o, 10));
                final Iterator<DashboardExam> iterator5 = (Iterator<DashboardExam>)((Iterable<Object>)o).iterator();
                while (iterator5.hasNext()) {
                    list2.add(iterator5.next().toDashboardEvent(b.E(i2), b.C(i2)));
                }
                final b i3 = this.I;
                final Iterator<Object> iterator6 = list2.iterator();
                while (iterator6.hasNext()) {
                    i3.N((List)h3.G, iterator6.next());
                }
                ((List)h3.G).addAll(b.this.O(this.J, this.K));
                v.d5((Iterable<? extends Comparable>)h3.G);
                return h3.G;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object p(@e final kotlin.coroutines.d<? super List<DashboardParentDay>> d) {
        return h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super List<? extends DashboardParentDay>>, Object>() {
            int G;
            final /* synthetic */ b H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends DashboardParentDay>>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<DashboardParentDay>> d) {
                return ((b$o)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object all) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(all);
                }
                else {
                    c1.n(all);
                    final i d = b.D(this.H);
                    this.G = 1;
                    if ((all = d.findAll(this)) == h) {
                        return h;
                    }
                }
                return all;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object q(@e final ReminderType reminderType, final long n, @e final kotlin.coroutines.d<? super List<Reminder>> d) {
        return h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super List<? extends Reminder>>, Object>(null) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ ReminderType I;
            final /* synthetic */ long J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends Reminder>>, Object>(d) {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ ReminderType I = this.I;
                    final /* synthetic */ long J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<Reminder>> d) {
                return ((b$j)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object b) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(b);
                }
                else {
                    c1.n(b);
                    final com.untis.mobile.core.service.a f = b.this.R();
                    final String e = b.E(this.H);
                    final ReminderType i = this.I;
                    final long j = this.J;
                    this.G = 1;
                    if ((b = f.b(e, i, j, this)) == h) {
                        return h;
                    }
                }
                return b;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object r(@e final t t, @e final t t2, @e final kotlin.coroutines.d<? super List<DashboardClassLead>> d) throws JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super ArrayList<DashboardClassLead>>, Object>(null) {
            Object G;
            Object H;
            Object I;
            Object J;
            Object K;
            Object L;
            Object M;
            Object N;
            int O;
            private /* synthetic */ Object P;
            final /* synthetic */ b Q;
            final /* synthetic */ org.joda.time.t R;
            final /* synthetic */ org.joda.time.t S;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object p2, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                final p<r0, kotlin.coroutines.d<? super ArrayList<DashboardClassLead>>, Object> p3 = new p<r0, kotlin.coroutines.d<? super ArrayList<DashboardClassLead>>, Object>(d) {
                    Object G;
                    Object H;
                    Object I;
                    Object J;
                    Object K;
                    Object L;
                    Object M;
                    Object N;
                    int O;
                    private /* synthetic */ Object P;
                    final /* synthetic */ b Q = this.Q;
                    final /* synthetic */ org.joda.time.t R = this.R;
                    final /* synthetic */ org.joda.time.t S = this.S;
                };
                p3.P = p2;
                return (kotlin.coroutines.d<j2>)p3;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super ArrayList<DashboardClassLead>> d) {
                return ((b$d)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                Object h = kotlin.coroutines.intrinsics.b.h();
                final int o2 = this.O;
                while (true) {
                    Klasse klasse = null;
                    Collection<DashboardClassLead> collection2 = null;
                    x3.b b2 = null;
                    Iterator<Klasse> iterator = null;
                    org.joda.time.t t2 = null;
                    b q = null;
                    p<r0, kotlin.coroutines.d<? super ArrayList<DashboardClassLead>>, Object> p4 = null;
                    Label_0890: {
                        Iterator<Klasse> k = null;
                        org.joda.time.t i = null;
                        b h2 = null;
                        ArrayList<DashboardClassLead> g = null;
                        r0 p = null;
                        p<r0, kotlin.coroutines.d<? super ArrayList<DashboardClassLead>>, Object> p2 = null;
                        Object o3 = null;
                        x3.b b = null;
                        Collection<DashboardClassLead> n = null;
                        org.joda.time.t j = null;
                        Label_0554: {
                            org.joda.time.t r;
                            r0 p3;
                            org.joda.time.t s;
                            Object iterator3;
                            p<r0, kotlin.coroutines.d<? super ArrayList<DashboardClassLead>>, Object> p5;
                            if (o2 != 0) {
                                if (o2 == 1) {
                                    final Collection collection = (Collection)this.M;
                                    klasse = (Klasse)this.L;
                                    k = (Iterator<Klasse>)this.K;
                                    final org.joda.time.t t = (org.joda.time.t)this.J;
                                    i = (org.joda.time.t)this.I;
                                    h2 = (b)this.H;
                                    g = (ArrayList<DashboardClassLead>)this.G;
                                    p = (r0)this.P;
                                    c1.n(o);
                                    p2 = this;
                                    o3 = o;
                                    b = (x3.b)h;
                                    n = (Collection<DashboardClassLead>)collection;
                                    j = t;
                                    break Label_0554;
                                }
                                if (o2 == 2) {
                                    collection2 = (Collection<DashboardClassLead>)this.N;
                                    b2 = (x3.b)this.M;
                                    klasse = (Klasse)this.L;
                                    iterator = (Iterator<Klasse>)this.K;
                                    t2 = (org.joda.time.t)this.J;
                                    r = (org.joda.time.t)this.I;
                                    q = (b)this.H;
                                    final ArrayList list = (ArrayList)this.G;
                                    p3 = (r0)this.P;
                                    c1.n(o);
                                    n = (Collection<DashboardClassLead>)list;
                                    p4 = this;
                                    break Label_0890;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                c1.n(o);
                                p3 = (r0)this.P;
                                n = new ArrayList<DashboardClassLead>();
                                final Profile l = j0.G.l(com.untis.mobile.dashboard.service.b.E(this.Q));
                                if (l == null) {
                                    return n;
                                }
                                final Set<Long> userClasses = l.getUserClasses();
                                final b q2 = this.Q;
                                final ArrayList<Klasse> list2 = new ArrayList<Klasse>();
                                final Iterator<Number> iterator2 = userClasses.iterator();
                                while (iterator2.hasNext()) {
                                    final Klasse n2 = com.untis.mobile.dashboard.service.b.C(q2).N(iterator2.next().longValue());
                                    if (n2 != null) {
                                        list2.add(n2);
                                    }
                                }
                                q = this.Q;
                                r = this.R;
                                s = this.S;
                                iterator3 = list2.iterator();
                                p5 = this;
                                b = (x3.b)h;
                            }
                            if (!((Iterator)iterator3).hasNext()) {
                                kotlinx.coroutines.h.f(p3, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                    Object G;
                                    Object H;
                                    Object I;
                                    int J;
                                    final /* synthetic */ b K;
                                    final /* synthetic */ ArrayList<DashboardClassLead> L;
                                    
                                    @org.jetbrains.annotations.e
                                    @Override
                                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                            Object G;
                                            Object H;
                                            Object I;
                                            int J;
                                            final /* synthetic */ b K = this.K;
                                            final /* synthetic */ ArrayList<DashboardClassLead> L = this.L;
                                        };
                                    }
                                    
                                    @org.jetbrains.annotations.f
                                    @Override
                                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                                        return ((b$d$a)this.create(r0, d)).invokeSuspend(j2.a);
                                    }
                                    
                                    @org.jetbrains.annotations.f
                                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                                        final Object h = kotlin.coroutines.intrinsics.b.h();
                                        final int j = this.J;
                                        while (true) {
                                            b k = null;
                                            p<r0, kotlin.coroutines.d<? super j2>, Object> p = null;
                                            DashboardClassLead i = null;
                                            Label_0225: {
                                                if (j != 0) {
                                                    if (j != 1) {
                                                        if (j == 2) {
                                                            final DashboardClassLead dashboardClassLead = (DashboardClassLead)this.I;
                                                            final Iterator<Object> iterator = (Iterator<Object>)this.H;
                                                            k = (b)this.G;
                                                            c1.n(o);
                                                            p = this;
                                                            i = dashboardClassLead;
                                                            break Label_0225;
                                                        }
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    else {
                                                        c1.n(o);
                                                    }
                                                }
                                                else {
                                                    c1.n(o);
                                                    final k h2 = b.H(this.K);
                                                    this.J = 1;
                                                    if (h2.b(this) == h) {
                                                        return h;
                                                    }
                                                }
                                                b.w(this.K).e();
                                                final ArrayList<DashboardClassLead> l = this.L;
                                                k = this.K;
                                                final Iterator<Object> iterator = l.iterator();
                                                final p<r0, kotlin.coroutines.d<? super j2>, Object> p2 = this;
                                                if (!iterator.hasNext()) {
                                                    return j2.a;
                                                }
                                                i = iterator.next();
                                                final k h3 = b.H(k);
                                                final List<DashboardStudentAbsence> absences = i.getAbsences();
                                                p2.G = k;
                                                p2.H = iterator;
                                                p2.I = i;
                                                p2.J = 2;
                                                p = p2;
                                                if (h3.a(absences, p2) == h) {
                                                    return h;
                                                }
                                            }
                                            b.w(k).b(i.getEvents());
                                            final p<r0, kotlin.coroutines.d<? super j2>, Object> p2 = p;
                                            continue;
                                        }
                                    }
                                }, 3, (Object)null);
                                return n;
                            }
                            klasse = ((Iterator<Klasse>)iterator3).next();
                            final com.untis.mobile.dashboard.network.c g2 = com.untis.mobile.dashboard.service.b.G(q);
                            final long id = klasse.getId();
                            p5.P = p3;
                            p5.G = n;
                            p5.H = q;
                            p5.I = r;
                            p5.J = s;
                            p5.K = iterator3;
                            p5.L = klasse;
                            p5.M = n;
                            p5.N = null;
                            p5.O = 1;
                            final Object m = g2.j(id, r, s, p5);
                            if (m == b) {
                                return b;
                            }
                            final ArrayList<DashboardClassLead> list3 = (ArrayList<DashboardClassLead>)n;
                            final b b3 = q;
                            final org.joda.time.t t3 = r;
                            j = s;
                            p = p3;
                            k = (Iterator<Klasse>)iterator3;
                            g = list3;
                            p2 = p5;
                            h2 = b3;
                            i = t3;
                            o3 = m;
                        }
                        final x3.b m2 = (x3.b)o3;
                        final Iterator<Object> iterator4 = m2.a().iterator();
                        while (iterator4.hasNext()) {
                            iterator4.next().setKlassenId(klasse.getId());
                        }
                        final Iterator<Object> iterator5 = m2.b().iterator();
                        while (iterator5.hasNext()) {
                            iterator5.next().setKlassenId(kotlin.coroutines.jvm.internal.b.g(klasse.getId()));
                        }
                        final com.untis.mobile.services.masterdata.a c = com.untis.mobile.dashboard.service.b.C(h2);
                        final List<Student> c2 = m2.c();
                        final ArrayList list4 = new ArrayList<Student>(v.Y((Iterable<?>)c2, 10));
                        for (final Student student : c2) {
                            student.setBirthday(new org.joda.time.t(0L));
                            student.setKlasse(kotlin.coroutines.jvm.internal.b.g(klasse.getId()));
                            list4.add(student);
                        }
                        p2.P = p;
                        p2.G = g;
                        p2.H = h2;
                        p2.I = i;
                        p2.J = j;
                        p2.K = k;
                        p2.L = klasse;
                        p2.M = m2;
                        p2.N = n;
                        p2.O = 2;
                        if (c.l((List<Student>)list4, p2) == b) {
                            return b;
                        }
                        final x3.b b4 = b;
                        final p<r0, kotlin.coroutines.d<? super ArrayList<DashboardClassLead>>, Object> p6 = p2;
                        final org.joda.time.t t4 = j;
                        final ArrayList<DashboardClassLead> list5 = g;
                        final Iterator<Klasse> iterator7 = k;
                        org.joda.time.t r = i;
                        r0 p3 = p;
                        t2 = t4;
                        p4 = p6;
                        iterator = iterator7;
                        q = h2;
                        b2 = m2;
                        collection2 = n;
                        n = list5;
                        h = b4;
                    }
                    final List<Comparable> d5 = v.d5((Iterable<? extends Comparable>)b2.a());
                    final List<Comparable> d6 = v.d5((Iterable<? extends Comparable>)b2.b());
                    final List<DashboardClassbookEvent> b5 = b2.b();
                    final ArrayList list6 = new ArrayList<Long>(v.Y((Iterable<?>)b5, 10));
                    final Iterator<Object> iterator8 = b5.iterator();
                    while (iterator8.hasNext()) {
                        list6.add(kotlin.coroutines.jvm.internal.b.g(iterator8.next().getReasonId()));
                    }
                    final List<Object> n3 = v.N1((Iterable<?>)list6);
                    final ArrayList<EventReason> list7 = new ArrayList<EventReason>();
                    final Iterator<Number> iterator9 = n3.iterator();
                    while (iterator9.hasNext()) {
                        final EventReason w = b.C(q).w(iterator9.next().longValue());
                        if (w != null) {
                            list7.add(w);
                        }
                    }
                    final android.util.LongSparseArray<Entity> e = com.untis.mobile.utils.extension.c.e((List<? extends Entity>)list7);
                    final List<DashboardStudentAbsence> a = b2.a();
                    final ArrayList list8 = new ArrayList<Long>(v.Y((Iterable<?>)a, 10));
                    final Iterator<Object> iterator10 = a.iterator();
                    while (iterator10.hasNext()) {
                        list8.add(kotlin.coroutines.jvm.internal.b.g(iterator10.next().getReasonId()));
                    }
                    final List<Object> n4 = v.N1((Iterable<?>)list8);
                    final ArrayList<AbsenceReason> list9 = new ArrayList<AbsenceReason>();
                    final Iterator<Number> iterator11 = n4.iterator();
                    while (iterator11.hasNext()) {
                        final AbsenceReason h3 = b.C(q).H(iterator11.next().longValue());
                        if (h3 != null) {
                            list9.add(h3);
                        }
                    }
                    final android.util.LongSparseArray<Entity> e2 = com.untis.mobile.utils.extension.c.e((List<? extends Entity>)list9);
                    final List<DashboardStudentAbsence> a2 = b2.a();
                    final ArrayList<Number> list10 = new ArrayList<Number>();
                    final Iterator<Object> iterator12 = a2.iterator();
                    while (iterator12.hasNext()) {
                        final DashboardExcuse excuse = iterator12.next().getExcuse();
                        Number g3;
                        if (excuse == null) {
                            g3 = null;
                        }
                        else {
                            g3 = kotlin.coroutines.jvm.internal.b.g(excuse.getStatusId());
                        }
                        if (g3 != null) {
                            list10.add(g3);
                        }
                    }
                    final List<Object> n5 = v.N1((Iterable<?>)list10);
                    final ArrayList<ExcuseStatus> list11 = new ArrayList<ExcuseStatus>();
                    final Iterator<Number> iterator13 = n5.iterator();
                    while (iterator13.hasNext()) {
                        final ExcuseStatus c3 = b.C(q).c(iterator13.next().longValue());
                        if (c3 != null) {
                            list11.add(c3);
                        }
                    }
                    final android.util.LongSparseArray<Entity> e3 = com.untis.mobile.utils.extension.c.e((List<? extends Entity>)list11);
                    final List<DashboardClassbookEvent> b6 = b2.b();
                    final ArrayList<DashboardClassbookEvent> list12 = new ArrayList<DashboardClassbookEvent>();
                    final Iterator<Object> iterator14 = b6.iterator();
                    while (true) {
                        final boolean hasNext = iterator14.hasNext();
                        boolean b7 = false;
                        if (!hasNext) {
                            break;
                        }
                        final DashboardClassbookEvent next = iterator14.next();
                        if (next.getEntityType() == EntityType.STUDENT) {
                            b7 = true;
                        }
                        if (!kotlin.coroutines.jvm.internal.b.a(b7)) {
                            continue;
                        }
                        list12.add(next);
                    }
                    final ArrayList list13 = new ArrayList<Long>(v.Y((Iterable<?>)list12, 10));
                    final Iterator<Object> iterator15 = list12.iterator();
                    while (iterator15.hasNext()) {
                        list13.add(kotlin.coroutines.jvm.internal.b.g(iterator15.next().getEntityId()));
                    }
                    final List<DashboardStudentAbsence> a3 = b2.a();
                    final ArrayList list14 = new ArrayList<Object>(v.Y((Iterable<?>)a3, 10));
                    final Iterator<Object> iterator16 = a3.iterator();
                    while (iterator16.hasNext()) {
                        list14.add((T)kotlin.coroutines.jvm.internal.b.g(iterator16.next().getStudentId()));
                    }
                    final List<Object> n6 = v.N1((Iterable<?>)v.q4((Collection<?>)list13, (Iterable<?>)list14));
                    final ArrayList<Student> list15 = new ArrayList<Student>();
                    final Iterator<Number> iterator17 = n6.iterator();
                    while (iterator17.hasNext()) {
                        final Student v = b.C(q).V(iterator17.next().longValue());
                        if (v != null) {
                            list15.add(v);
                        }
                    }
                    final android.util.LongSparseArray<Entity> e4 = com.untis.mobile.utils.extension.c.e((List<? extends Entity>)list15);
                    final List<DashboardClassbookEvent> b8 = b2.b();
                    final ArrayList<DashboardClassbookEvent> list16 = new ArrayList<DashboardClassbookEvent>();
                    for (final DashboardClassbookEvent next2 : b8) {
                        if (kotlin.coroutines.jvm.internal.b.a(next2.getEntityType() == EntityType.CLASS)) {
                            list16.add(next2);
                        }
                    }
                    final ArrayList list17 = new ArrayList<Long>(v.Y((Iterable<?>)list16, 10));
                    final Iterator<Object> iterator19 = list16.iterator();
                    while (iterator19.hasNext()) {
                        list17.add(kotlin.coroutines.jvm.internal.b.g(iterator19.next().getEntityId()));
                    }
                    final List<DashboardStudentAbsence> a4 = b2.a();
                    final ArrayList list18 = new ArrayList<Object>(v.Y((Iterable<?>)a4, 10));
                    final Iterator<Object> iterator20 = a4.iterator();
                    while (iterator20.hasNext()) {
                        list18.add((T)kotlin.coroutines.jvm.internal.b.g(iterator20.next().getKlassenId()));
                    }
                    final List<Object> n7 = v.N1((Iterable<?>)v.q4((Collection<?>)list17, (Iterable<?>)list18));
                    final ArrayList<Klasse> list19 = new ArrayList<Klasse>();
                    final Iterator<Number> iterator21 = n7.iterator();
                    while (iterator21.hasNext()) {
                        final Klasse n8 = b.C(q).N(iterator21.next().longValue());
                        if (n8 != null) {
                            list19.add(n8);
                        }
                    }
                    collection2.add(new DashboardClassLead(klasse, (List<DashboardClassbookEvent>)d6, (List<DashboardStudentAbsence>)d5, (LongSparseArray<AbsenceReason>)e2, (LongSparseArray<EventReason>)e, (LongSparseArray<ExcuseStatus>)e3, (LongSparseArray<Student>)e4, (LongSparseArray<Klasse>)com.untis.mobile.utils.extension.c.e((List<? extends Entity>)list19)));
                    final Iterator<Klasse> iterator22 = iterator;
                    x3.b b = (x3.b)h;
                    p<r0, kotlin.coroutines.d<? super ArrayList<DashboardClassLead>>, Object> p5 = p4;
                    org.joda.time.t s = t2;
                    Object iterator3 = iterator22;
                    continue;
                }
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object s(final long n, @e final kotlin.coroutines.d<? super List<DashboardContactHourSlot>> d) {
        return h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super List<? extends DashboardContactHourSlot>>, Object>() {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ long I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends DashboardContactHourSlot>>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ long I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<DashboardContactHourSlot>> d) {
                return ((b$l)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object d) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(d);
                }
                else {
                    c1.n(d);
                    final com.untis.mobile.dashboard.persistence.dao.c y = b.y(this.H);
                    final long i = this.I;
                    this.G = 1;
                    if ((d = y.d(i, this)) == h) {
                        return h;
                    }
                }
                final DashboardContactHour dashboardContactHour = (DashboardContactHour)d;
                Object slots;
                if (dashboardContactHour == null) {
                    slots = null;
                }
                else {
                    slots = dashboardContactHour.getSlots();
                }
                return slots;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object t(@e final ReminderType reminderType, final long n, @e final kotlin.coroutines.d<? super j2> d) {
        final Object i = h.i((kotlin.coroutines.g)i1.c(), (n6.p)new n6.p<r0, kotlin.coroutines.d<? super j2>, Object>(null) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ ReminderType I;
            final /* synthetic */ long J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ ReminderType I = this.I;
                    final /* synthetic */ long J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$a)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final com.untis.mobile.core.service.a f = b.this.R();
                    final String e = b.E(this.H);
                    final ReminderType i = this.I;
                    final long j = this.J;
                    this.G = 1;
                    if (f.delete(e, i, j, this) == h) {
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
}
