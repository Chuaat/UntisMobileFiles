// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.systemNotifications;

import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.persistence.models.officehour.OfficeHour;
import org.joda.time.c;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.persistence.models.EntityType;
import java.util.List;
import com.untis.mobile.persistence.models.exam.Exam;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J&\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH&J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000bH&J8\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H&J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u000bH&J \u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H&J \u0010&\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!H&J \u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!H&J \u0010(\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H&J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH&J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H&J\u0018\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H&J\u0010\u0010.\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001a\u00100\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020!H&¨\u00061" }, d2 = { "Lcom/untis/mobile/systemNotifications/b;", "", "Lkotlin/j2;", "start", "", "profileId", "Lcom/untis/mobile/systemNotifications/a;", "systemNotification", "n", "stop", "p", "", "homeworkId", "", "systemNotifications", "i", "g", "periodId", "c", "Lcom/untis/mobile/persistence/models/EntityType;", "timetableEntityType", "timetableEntityId", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "text", "Lorg/joda/time/c;", "target", "e", "k", "examId", "o", "Lcom/untis/mobile/persistence/models/exam/Exam;", "exam", "", "days", "d", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homeWork", "m", "h", "b", "q", "j", "Lcom/untis/mobile/persistence/models/officehour/OfficeHour;", "officeHour", "f", "l", "id", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface b
{
    @f
    a a(@e final String p0, final int p1);
    
    void b(@e final String p0, @e final Exam p1, final int p2);
    
    @e
    List<a> c(@e final String p0, final long p1);
    
    @e
    a d(@e final String p0, @e final Exam p1, final int p2);
    
    @e
    a e(@e final String p0, @e final EntityType p1, final long p2, @e final Period p3, @e final String p4, @e final c p5);
    
    @e
    a f(@e final String p0, @e final OfficeHour p1);
    
    void g(@e final a p0);
    
    @e
    a h(@e final String p0, @e final HomeWork p1, final int p2);
    
    void i(@e final String p0, final long p1, @e final List<a> p2);
    
    void j(@e final String p0, @e final HomeWork p1);
    
    @e
    List<a> k(@e final String p0, final long p1);
    
    void l(@e final String p0);
    
    void m(@e final String p0, @e final HomeWork p1, final int p2);
    
    void n(@e final String p0, @e final a p1);
    
    @e
    List<a> o(@e final String p0, final long p1);
    
    void p(@e final a p0);
    
    void q(@e final String p0, @e final Exam p1);
    
    void start();
    
    void stop();
}
