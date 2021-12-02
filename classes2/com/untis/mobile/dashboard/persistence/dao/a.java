// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.dao;

import androidx.room.q0;
import androidx.room.e1;
import org.jetbrains.annotations.e;
import androidx.room.n1;
import com.untis.mobile.dashboard.persistence.model.classlead.DashboardClassbookEvent;
import java.util.List;
import androidx.room.l0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H'J\b\u0010\u000b\u001a\u00020\u0006H'J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H'¨\u0006\r" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/dao/a;", "", "", "Lcom/untis/mobile/dashboard/persistence/model/classlead/DashboardClassbookEvent;", "a", "events", "Lkotlin/j2;", "b", "event", "", "c", "e", "d", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@l0
public interface a
{
    @n1("SELECT * FROM dashboard_classbook_event")
    @e
    List<DashboardClassbookEvent> a();
    
    @e1(onConflict = 1)
    void b(@e final List<DashboardClassbookEvent> p0);
    
    @e1(onConflict = 1)
    long c(@e final DashboardClassbookEvent p0);
    
    @q0
    void d(@e final DashboardClassbookEvent p0);
    
    @n1("DELETE FROM dashboard_classbook_event")
    void e();
}
