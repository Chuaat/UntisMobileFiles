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
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDay;
import java.util.List;
import androidx.room.l0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J!\u0010\t\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/dao/i;", "", "", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDay;", "findAll", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/j2;", "b", "parentDays", "a", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@l0
public interface i
{
    @e1(onConflict = 1)
    @f
    Object a(@e final List<DashboardParentDay> p0, @e final d<? super j2> p1);
    
    @n1("DELETE FROM dashboard_parent_day")
    @f
    Object b(@e final d<? super j2> p0);
    
    @n1("SELECT * FROM dashboard_parent_day")
    @f
    Object findAll(@e final d<? super List<DashboardParentDay>> p0);
}
