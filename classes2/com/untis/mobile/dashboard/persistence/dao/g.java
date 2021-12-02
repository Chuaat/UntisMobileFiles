// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.dao;

import androidx.room.n1;
import org.jetbrains.annotations.f;
import androidx.room.e1;
import kotlin.j2;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import com.untis.mobile.dashboard.persistence.model.event.homework.DashboardHomework;
import java.util.List;
import androidx.room.l0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0007H§@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/dao/g;", "", "", "Lcom/untis/mobile/dashboard/persistence/model/event/homework/DashboardHomework;", "findAll", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "data", "Lkotlin/j2;", "a", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "dashboardExam", "c", "(Lcom/untis/mobile/dashboard/persistence/model/event/homework/DashboardHomework;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@l0
public interface g
{
    @e1(onConflict = 1)
    @f
    Object a(@e final List<DashboardHomework> p0, @e final d<? super j2> p1);
    
    @n1("DELETE FROM dashboard_homework")
    @f
    Object b(@e final d<? super j2> p0);
    
    @e1(onConflict = 1)
    @f
    Object c(@e final DashboardHomework p0, @e final d<? super j2> p1);
    
    @n1("SELECT * FROM dashboard_homework")
    @f
    Object findAll(@e final d<? super List<DashboardHomework>> p0);
}
