// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.persistence.dao;

import org.jetbrains.annotations.f;
import androidx.room.e1;
import org.joda.time.c;
import org.jetbrains.annotations.e;
import androidx.room.n1;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import java.util.List;
import androidx.room.l0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H'J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H'J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H'J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH'¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/calendar/persistence/dao/a;", "", "", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "a", "", "id", "e", "ids", "d", "periods", "Lkotlin/j2;", "c", "period", "f", "Lorg/joda/time/c;", "dateTime", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@l0
public interface a
{
    @n1("SELECT * FROM calendar_period")
    @e
    List<CalendarPeriod> a();
    
    @n1("DELETE FROM calendar_period WHERE start <= :dateTime")
    void b(@e final c p0);
    
    @e1(onConflict = 1)
    void c(@e final List<CalendarPeriod> p0);
    
    @n1("SELECT * FROM calendar_period WHERE period_id IN (:ids)")
    @e
    List<CalendarPeriod> d(@e final List<Long> p0);
    
    @n1("SELECT * FROM calendar_period WHERE period_id = :id")
    @f
    CalendarPeriod e(final long p0);
    
    @e1(onConflict = 1)
    void f(@e final CalendarPeriod p0);
}
