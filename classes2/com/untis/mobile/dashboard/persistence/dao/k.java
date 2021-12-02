// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.dao;

import androidx.room.q0;
import androidx.room.n1;
import org.jetbrains.annotations.f;
import androidx.room.e1;
import kotlin.j2;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import java.util.List;
import androidx.room.l0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006H§@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH§@\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005J\u001b\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H§@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/dao/k;", "", "", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "findAll", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "absenceId", "findBy", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/j2;", "b", "dashboardStudentAbsence", "d", "(Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;Lkotlin/coroutines/d;)Ljava/lang/Object;", "absences", "a", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@l0
public interface k
{
    @e1(onConflict = 1)
    @f
    Object a(@e final List<DashboardStudentAbsence> p0, @e final d<? super j2> p1);
    
    @n1("DELETE FROM dashboard_student_absence")
    @f
    Object b(@e final d<? super j2> p0);
    
    @e1(onConflict = 1)
    @f
    Object c(@e final DashboardStudentAbsence p0, @e final d<? super j2> p1);
    
    @q0
    @f
    Object d(@e final DashboardStudentAbsence p0, @e final d<? super j2> p1);
    
    @n1("SELECT * FROM dashboard_student_absence")
    @f
    Object findAll(@e final d<? super List<DashboardStudentAbsence>> p0);
    
    @n1("SELECT * FROM dashboard_student_absence WHERE absence_id = :absenceId")
    @f
    Object findBy(final long p0, @e final d<? super DashboardStudentAbsence> p1);
}
