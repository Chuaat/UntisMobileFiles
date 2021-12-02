// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.service;

import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHourSlot;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderType;
import com.untis.mobile.dashboard.persistence.model.event.DashboardEvent;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.j2;
import com.untis.mobile.dashboard.persistence.model.reminder.Reminder;
import com.untis.mobile.dashboard.persistence.model.classlead.DashboardClassLead;
import x3.m;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import y3.c;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHour;
import org.joda.time.t;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.error.JsonRpcError;
import org.jetbrains.annotations.e;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDay;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\bH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b!\u0010\"J#\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\bH¦@\u00f8\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u00020&2\u0006\u0010*\u001a\u00020)H¦@\u00f8\u0001\u0000¢\u0006\u0004\b+\u0010,J#\u0010-\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\bH¦@\u00f8\u0001\u0000¢\u0006\u0004\b-\u0010(J)\u0010.\u001a\b\u0012\u0004\u0012\u00020)0\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\bH¦@\u00f8\u0001\u0000¢\u0006\u0004\b.\u0010(J\u0019\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b0\u0010\u0005J)\u00101\u001a\b\u0012\u0004\u0012\u00020/0\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H¦@\u00f8\u0001\u0000¢\u0006\u0004\b1\u0010\u001dJ\u001b\u00104\u001a\u0002032\u0006\u00102\u001a\u00020/H¦@\u00f8\u0001\u0000¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\b\u0012\u0004\u0012\u0002060\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b7\u0010\u0005J\u0019\u00108\u001a\b\u0012\u0004\u0012\u0002060\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b8\u0010\u0005J\u001b\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b:\u0010\u0005J)\u0010;\u001a\b\u0012\u0004\u0012\u0002090\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H¦@\u00f8\u0001\u0000¢\u0006\u0004\b;\u0010\u001dJ#\u0010>\u001a\u00020/2\u0006\u0010<\u001a\u00020/2\u0006\u0010=\u001a\u00020\bH¦@\u00f8\u0001\u0000¢\u0006\u0004\b>\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@" }, d2 = { "Lcom/untis/mobile/dashboard/service/a;", "", "", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;", "i", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lorg/joda/time/t;", "start", "", "klassenId", "b", "(Lorg/joda/time/t;JLkotlin/coroutines/d;)Ljava/lang/Object;", "webUntisId", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHourSlot;", "s", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "teacherId", "f", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "contactHour", "", "position", "d", "(Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;ILkotlin/coroutines/d;)Ljava/lang/Object;", "c", "(Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;Lkotlin/coroutines/d;)Ljava/lang/Object;", "end", "Lcom/untis/mobile/dashboard/persistence/model/event/DashboardEvent;", "o", "(Lorg/joda/time/t;Lorg/joda/time/t;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "entityIds", "l", "(Lorg/joda/time/t;Lorg/joda/time/t;Lcom/untis/mobile/persistence/models/EntityType;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;", "eventType", "eventId", "Lkotlin/j2;", "t", "(Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/dashboard/persistence/model/reminder/Reminder;", "reminder", "k", "(Lcom/untis/mobile/dashboard/persistence/model/reminder/Reminder;Lkotlin/coroutines/d;)Ljava/lang/Object;", "m", "q", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "j", "g", "studentAbsence", "Lx3/m;", "e", "(Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDay;", "p", "a", "Lcom/untis/mobile/dashboard/persistence/model/classlead/DashboardClassLead;", "h", "r", "absence", "excuseStatusId", "n", "(Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;JLkotlin/coroutines/d;)Ljava/lang/Object;", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    @f
    Object a(@e final d<? super List<DashboardParentDay>> p0) throws JsonRpcError;
    
    @f
    Object b(@e final t p0, final long p1, @e final d<? super List<DashboardContactHour>> p2) throws JsonRpcError;
    
    @f
    Object c(@e final DashboardContactHour p0, @e final d<? super DashboardContactHour> p1) throws JsonRpcError;
    
    @f
    Object d(@e final DashboardContactHour p0, final int p1, @e final d<? super DashboardContactHour> p2) throws c, JsonRpcError;
    
    @f
    Object e(@e final DashboardStudentAbsence p0, @e final d<? super m> p1) throws c, JsonRpcError;
    
    @f
    Object f(final long p0, final long p1, @e final d<? super DashboardContactHour> p2) throws JsonRpcError;
    
    @f
    Object g(@e final t p0, @e final t p1, @e final d<? super List<DashboardStudentAbsence>> p2) throws JsonRpcError;
    
    @f
    Object h(@e final d<? super List<DashboardClassLead>> p0);
    
    @f
    Object i(@e final d<? super List<DashboardContactHour>> p0);
    
    @f
    Object j(@e final d<? super List<DashboardStudentAbsence>> p0);
    
    @f
    Object k(@e final Reminder p0, @e final d<? super j2> p1);
    
    @f
    Object l(@e final t p0, @e final t p1, @e final EntityType p2, @e final List<Long> p3, @e final d<? super List<DashboardEvent>> p4) throws JsonRpcError;
    
    @f
    Object m(@e final ReminderType p0, final long p1, @e final d<? super j2> p2);
    
    @f
    Object n(@e final DashboardStudentAbsence p0, final long p1, @e final d<? super DashboardStudentAbsence> p2) throws c, JsonRpcError;
    
    @f
    Object o(@e final t p0, @e final t p1, @e final d<? super List<DashboardEvent>> p2);
    
    @f
    Object p(@e final d<? super List<DashboardParentDay>> p0);
    
    @f
    Object q(@e final ReminderType p0, final long p1, @e final d<? super List<Reminder>> p2);
    
    @f
    Object r(@e final t p0, @e final t p1, @e final d<? super List<DashboardClassLead>> p2) throws JsonRpcError;
    
    @f
    Object s(final long p0, @e final d<? super List<DashboardContactHourSlot>> p1);
    
    @f
    Object t(@e final ReminderType p0, final long p1, @e final d<? super j2> p2);
}
