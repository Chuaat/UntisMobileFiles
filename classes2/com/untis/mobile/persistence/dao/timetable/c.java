// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.timetable;

import org.jetbrains.annotations.f;
import org.joda.time.t;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\nH&¨\u0006\u000f" }, d2 = { "Lcom/untis/mobile/persistence/dao/timetable/c;", "", "", "profileId", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "Lorg/joda/time/t;", "date", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "b", "timeTableModel", "Lkotlin/j2;", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface c
{
    void a(@e final String p0, @e final TimeTableModel p1);
    
    @f
    TimeTableModel b(@e final String p0, @e final EntityType p1, final long p2, @e final t p3);
}
