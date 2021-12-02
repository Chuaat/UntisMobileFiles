// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.timetable;

import java.util.List;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.timetable.period.Period;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H&J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0005H&J\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H&J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0007H&J\u001e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0014" }, d2 = { "Lcom/untis/mobile/persistence/dao/timetable/a;", "", "", "profileId", "", "", "ids", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "f", "lessonId", "b", "id", "a", "periods", "Lkotlin/j2;", "c", "period", "d", "e", "g", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    @f
    Period a(@e final String p0, final long p1);
    
    @e
    List<Period> b(@e final String p0, final long p1);
    
    void c(@e final String p0, @e final List<Period> p1);
    
    void d(@e final String p0, @e final Period p1);
    
    void e(@e final String p0, @e final List<Long> p1);
    
    @e
    List<Period> f(@e final String p0, @e final List<Long> p1);
    
    void g(@e final String p0);
}
