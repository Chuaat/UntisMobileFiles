// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetable;

import org.joda.time.t;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/ui/activities/timetable/a;", "", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "j", "Lorg/joda/time/t;", "q", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "timeTableModel", "Lkotlin/j2;", "o", "c", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    void c(@e final TimeTableModel p0);
    
    @e
    TimeTableEntity j();
    
    void o(@f final TimeTableModel p0);
    
    @e
    t q();
}
