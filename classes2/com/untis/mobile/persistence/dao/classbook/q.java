// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.classbook;

import java.util.List;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\bH&J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\bH&J\u001e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\bH&J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004H&¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/persistence/dao/classbook/q;", "", "", "profileId", "", "id", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "a", "", "b", "ids", "f", "studentAbsences", "Lkotlin/j2;", "c", "e", "studentAbsenceId", "d", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface q
{
    @f
    StudentAbsence a(@e final String p0, final long p1);
    
    @e
    List<StudentAbsence> b(@e final String p0);
    
    void c(@e final String p0, @e final List<StudentAbsence> p1);
    
    void d(@e final String p0, final long p1);
    
    void e(@e final String p0, @e final List<StudentAbsence> p1);
    
    @e
    List<StudentAbsence> f(@e final String p0, @e final List<Long> p1);
}
