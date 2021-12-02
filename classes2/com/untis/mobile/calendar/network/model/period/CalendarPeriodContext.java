// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network.model.period;

import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import java.util.List;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/calendar/network/model/period/CalendarPeriodContext;", "", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "classbook", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "getClassbook", "()Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "setClassbook", "(Lcom/untis/mobile/persistence/models/timetable/period/Classbook;)V", "", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homework", "Ljava/util/List;", "getHomework", "()Ljava/util/List;", "setHomework", "(Ljava/util/List;)V", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "period", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "getPeriod", "()Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "setPeriod", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)V", "<init>", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;Ljava/util/List;Lcom/untis/mobile/persistence/models/timetable/period/Classbook;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodContext
{
    @f
    private Classbook classbook;
    @f
    private List<HomeWork> homework;
    @e
    private CalendarPeriod period;
    
    public CalendarPeriodContext(@e final CalendarPeriod period, @f final List<HomeWork> homework, @f final Classbook classbook) {
        k0.p(period, "period");
        this.period = period;
        this.homework = homework;
        this.classbook = classbook;
    }
    
    @f
    public final Classbook getClassbook() {
        return this.classbook;
    }
    
    @f
    public final List<HomeWork> getHomework() {
        return this.homework;
    }
    
    @e
    public final CalendarPeriod getPeriod() {
        return this.period;
    }
    
    public final void setClassbook(@f final Classbook classbook) {
        this.classbook = classbook;
    }
    
    public final void setHomework(@f final List<HomeWork> homework) {
        this.homework = homework;
    }
    
    public final void setPeriod(@e final CalendarPeriod period) {
        k0.p(period, "<set-?>");
        this.period = period;
    }
}
