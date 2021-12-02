// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.network;

import com.untis.mobile.dashboard.persistence.model.event.exam.DashboardExam;
import x3.b;
import com.untis.mobile.dashboard.persistence.model.event.homework.DashboardHomework;
import com.untis.mobile.persistence.models.EntityType;
import x3.i;
import java.util.List;
import x3.m;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import x3.k;
import x3.a;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHour;
import org.joda.time.t;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.error.JsonRpcError;
import org.jetbrains.annotations.e;
import x3.g;
import kotlin.coroutines.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000eH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b!\u0010\u001fJ)\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\"H¦@\u00f8\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0013\u0010*\u001a\u00020)H¦@\u00f8\u0001\u0000¢\u0006\u0004\b*\u0010+J+\u0010-\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b-\u0010.J#\u00102\u001a\u0002012\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b2\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063" }, d2 = { "Lcom/untis/mobile/dashboard/network/c;", "", "Lorg/joda/time/t;", "start", "", "klassenId", "Lx3/d;", "b", "(Lorg/joda/time/t;JLkotlin/coroutines/d;)Ljava/lang/Object;", "contactHourId", "teacherId", "Lx3/c;", "f", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;", "contactHour", "", "position", "Lx3/k;", "d", "(Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;ILkotlin/coroutines/d;)Ljava/lang/Object;", "Lx3/a;", "c", "(Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;Lkotlin/coroutines/d;)Ljava/lang/Object;", "end", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "entityId", "", "Lcom/untis/mobile/dashboard/persistence/model/event/homework/DashboardHomework;", "i", "(Lorg/joda/time/t;Lorg/joda/time/t;Lcom/untis/mobile/persistence/models/EntityType;JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/dashboard/persistence/model/event/exam/DashboardExam;", "k", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "g", "(Lorg/joda/time/t;Lorg/joda/time/t;Lkotlin/coroutines/d;)Ljava/lang/Object;", "studentAbsence", "Lx3/m;", "e", "(Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lx3/g;", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lx3/b;", "j", "(JLorg/joda/time/t;Lorg/joda/time/t;Lkotlin/coroutines/d;)Ljava/lang/Object;", "absenceId", "excuseStatusId", "Lx3/i;", "h", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface c
{
    @f
    Object a(@e final d<? super g> p0) throws JsonRpcError;
    
    @f
    Object b(@e final t p0, final long p1, @e final d<? super x3.d> p2) throws JsonRpcError;
    
    @f
    Object c(@e final DashboardContactHour p0, @e final d<? super a> p1) throws JsonRpcError;
    
    @f
    Object d(@e final DashboardContactHour p0, final int p1, @e final d<? super k> p2) throws JsonRpcError;
    
    @f
    Object e(@e final DashboardStudentAbsence p0, @e final d<? super m> p1) throws JsonRpcError;
    
    @f
    Object f(final long p0, final long p1, @e final d<? super x3.c> p2) throws JsonRpcError;
    
    @f
    Object g(@e final t p0, @e final t p1, @e final d<? super List<DashboardStudentAbsence>> p2) throws JsonRpcError;
    
    @f
    Object h(final long p0, final long p1, @e final d<? super i> p2) throws JsonRpcError;
    
    @f
    Object i(@e final t p0, @e final t p1, @e final EntityType p2, final long p3, @e final d<? super List<DashboardHomework>> p4) throws JsonRpcError;
    
    @f
    Object j(final long p0, @e final t p1, @e final t p2, @e final d<? super b> p3) throws JsonRpcError;
    
    @f
    Object k(@e final t p0, @e final t p1, @e final EntityType p2, final long p3, @e final d<? super List<DashboardExam>> p4) throws JsonRpcError;
}
