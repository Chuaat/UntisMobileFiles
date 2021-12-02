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
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHour;
import java.util.List;
import androidx.room.l0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006H§@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000bH§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/dao/c;", "", "", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;", "findAll", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "webUntisId", "d", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "data", "Lkotlin/j2;", "a", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "dashboardContactHour", "c", "(Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@l0
public interface c
{
    @e1(onConflict = 1)
    @f
    Object a(@e final List<DashboardContactHour> p0, @e final d<? super j2> p1);
    
    @n1("DELETE FROM dashboard_contact_hour")
    @f
    Object b(@e final d<? super j2> p0);
    
    @e1(onConflict = 1)
    @f
    Object c(@e final DashboardContactHour p0, @e final d<? super j2> p1);
    
    @n1("SELECT * FROM dashboard_contact_hour WHERE contact_hour_wu_id = :webUntisId")
    @f
    Object d(final long p0, @e final d<? super DashboardContactHour> p1);
    
    @n1("SELECT * FROM dashboard_contact_hour")
    @f
    Object findAll(@e final d<? super List<DashboardContactHour>> p0);
}
