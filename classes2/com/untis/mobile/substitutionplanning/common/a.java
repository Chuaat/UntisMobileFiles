// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.common;

import com.untis.mobile.substitutionplanning.model.SubstitutionRequestDtoStateEnum;
import com.untis.mobile.substitutionplanning.model.PeriodConflictDto;
import org.joda.time.l0;
import com.untis.mobile.utils.d0;
import org.joda.time.r;
import com.untis.mobile.substitutionplanning.model.TeacherAbsenceDto;
import com.untis.mobile.substitutionplanning.model.OverbookingDto;
import kotlin.text.s;
import org.joda.time.c;
import com.untis.wu.rest.model.TeacherAbsenceViewDto;
import java.util.Iterator;
import com.untis.mobile.substitutionplanning.model.PeriodDto;
import java.util.ArrayList;
import kotlin.collections.v;
import com.untis.mobile.substitutionplanning.model.PeriodTeacherDto;
import com.untis.mobile.substitutionplanning.model.TeacherRefDto;
import java.util.List;
import com.untis.mobile.substitutionplanning.model.SubstitutionRequestDto;
import androidx.core.content.d;
import android.graphics.drawable.Drawable;
import org.jetbrains.annotations.f;
import kotlin.h0;
import java.util.Objects;
import com.untis.mobile.utils.extension.h;
import kotlin.jvm.internal.k0;
import android.content.Context;
import org.jetbrains.annotations.e;
import com.untis.mobile.substitutionplanning.model.SolutionDto;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0003\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0005\u001a\u0012\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b*\u00020\u0007\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u000b\u001a\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e\u001a\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e\u001a\u0012\u0010\u0015\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e\u001a\u0012\u0010\u0016\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e\u001a\f\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u0017\u001a\f\u0010\u001a\u001a\u0004\u0018\u00010\u0018*\u00020\u0017¨\u0006\u001b" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/TeacherAbsenceDto;", "Lorg/joda/time/r;", "l", "Lcom/untis/mobile/substitutionplanning/model/PeriodConflictDto;", "j", "Lcom/untis/mobile/substitutionplanning/model/PeriodDto;", "k", "Lcom/untis/mobile/substitutionplanning/model/SubstitutionRequestDto;", "", "Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "d", "Lcom/untis/mobile/substitutionplanning/model/OverbookingDto;", "i", "Lcom/untis/mobile/substitutionplanning/model/SolutionDto$SolutionEnum;", "Landroid/content/Context;", "context", "", "b", "a", "Landroid/graphics/drawable/Drawable;", "c", "h", "g", "Lcom/untis/wu/rest/model/TeacherAbsenceViewDto;", "Lorg/joda/time/c;", "f", "e", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class a
{
    @f
    public static final String a(@e final SolutionDto.SolutionEnum solutionEnum, @e final Context context) {
        k0.p(solutionEnum, "<this>");
        k0.p(context, "context");
        final int n = a.b[solutionEnum.ordinal()];
        String upperCase;
        if (n != 1) {
            String obj = null;
            Label_0112: {
                String s;
                if (n != 2) {
                    if (n == 3) {
                        obj = h.V(2131886822, context);
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                        break Label_0112;
                    }
                    if (n != 4) {
                        if (n != 5) {
                            throw new h0();
                        }
                        obj = context.getString(2131886814);
                        s = "context.getString(R.string.substitutionPlanning_askTeacherSolution_text)";
                    }
                    else {
                        obj = context.getString(2131886827);
                        s = "context.getString(R.string.substitutionPlanning_shiftPeriodSolution_text)";
                    }
                }
                else {
                    obj = context.getString(2131886815);
                    s = "context.getString(R.string.substitutionPlanning_cancelLessonSolution_text)";
                }
                k0.o(obj, s);
            }
            upperCase = obj.toUpperCase();
            k0.o(upperCase, "(this as java.lang.String).toUpperCase()");
        }
        else {
            upperCase = null;
        }
        return upperCase;
    }
    
    @f
    public static final String b(@e final SolutionDto.SolutionEnum solutionEnum, @e final Context context) {
        k0.p(solutionEnum, "<this>");
        k0.p(context, "context");
        final int n = a.b[solutionEnum.ordinal()];
        String v = null;
        if (n != 1) {
            int n2;
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n == 5) {
                            v = v;
                            return v;
                        }
                        throw new h0();
                    }
                    else {
                        n2 = 2131886827;
                    }
                }
                else {
                    n2 = 2131886822;
                }
            }
            else {
                n2 = 2131886676;
            }
            v = h.V(n2, context);
        }
        return v;
    }
    
    @f
    public static final Drawable c(@e final SolutionDto.SolutionEnum solutionEnum, @e final Context context) {
        k0.p(solutionEnum, "<this>");
        k0.p(context, "context");
        final int n = a.b[solutionEnum.ordinal()];
        Drawable mutate;
        final Drawable drawable = mutate = null;
        if (n != 1) {
            Drawable drawable2;
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            throw new h0();
                        }
                        if ((drawable2 = d.i(context, 2131230941)) == null) {
                            mutate = drawable;
                            return mutate;
                        }
                    }
                    else if ((drawable2 = d.i(context, 2131230946)) == null) {
                        mutate = drawable;
                        return mutate;
                    }
                }
                else if ((drawable2 = d.i(context, 2131230943)) == null) {
                    mutate = drawable;
                    return mutate;
                }
            }
            else if ((drawable2 = d.i(context, 2131230942)) == null) {
                mutate = drawable;
                return mutate;
            }
            mutate = drawable2.mutate();
        }
        return mutate;
    }
    
    @f
    public static final List<TeacherRefDto> d(@e final SubstitutionRequestDto substitutionRequestDto) {
        k0.p(substitutionRequestDto, "<this>");
        final int n = a.a[substitutionRequestDto.getState().ordinal()];
        List<TeacherRefDto> list2;
        final List<TeacherRefDto> list = list2 = null;
        switch (n) {
            default: {
                throw new h0();
            }
            case 4:
            case 5: {
                final PeriodDto period = substitutionRequestDto.getPeriod();
                PeriodTeacherDto periodTeacherDto = null;
                Label_0106: {
                    if (period != null) {
                        final List<PeriodTeacherDto> teachers = period.getTeachers();
                        if (teachers != null) {
                            periodTeacherDto = v.t2((List<? extends PeriodTeacherDto>)teachers);
                            break Label_0106;
                        }
                    }
                    periodTeacherDto = null;
                }
                if (periodTeacherDto == null) {
                    return null;
                }
                final boolean published = periodTeacherDto.isPublished();
                final PeriodDto period2 = substitutionRequestDto.getPeriod();
                if (published) {
                    if (period2 == null) {
                        list2 = list;
                        return list2;
                    }
                    final List<PeriodTeacherDto> teachers2 = period2.getTeachers();
                    if (teachers2 == null) {
                        list2 = list;
                        return list2;
                    }
                    final ArrayList<TeacherRefDto> list3 = new ArrayList<TeacherRefDto>();
                    final Iterator<Object> iterator = teachers2.iterator();
                    while (true) {
                        list2 = list3;
                        if (!iterator.hasNext()) {
                            return list2;
                        }
                        final TeacherRefDto removedTeacher = iterator.next().getRemovedTeacher();
                        if (removedTeacher == null) {
                            continue;
                        }
                        list3.add(removedTeacher);
                    }
                }
                else {
                    if (period2 == null) {
                        list2 = list;
                        return list2;
                    }
                    final List<PeriodTeacherDto> teachers3 = period2.getTeachers();
                    if (teachers3 == null) {
                        list2 = list;
                        return list2;
                    }
                    final ArrayList<TeacherRefDto> list4 = new ArrayList<TeacherRefDto>();
                    final Iterator<Object> iterator2 = teachers3.iterator();
                    while (true) {
                        list2 = list4;
                        if (!iterator2.hasNext()) {
                            return list2;
                        }
                        final TeacherRefDto currentTeacher = iterator2.next().getCurrentTeacher();
                        if (currentTeacher == null) {
                            continue;
                        }
                        list4.add(currentTeacher);
                    }
                }
                break;
            }
            case 2:
            case 3: {
                final PeriodDto period3 = substitutionRequestDto.getPeriod();
                if (period3 == null) {
                    list2 = list;
                    return list2;
                }
                final List<PeriodTeacherDto> teachers4 = period3.getTeachers();
                if (teachers4 == null) {
                    list2 = list;
                    return list2;
                }
                final ArrayList<TeacherRefDto> list5 = new ArrayList<TeacherRefDto>();
                final Iterator<Object> iterator3 = teachers4.iterator();
                while (true) {
                    list2 = list5;
                    if (!iterator3.hasNext()) {
                        return list2;
                    }
                    final TeacherRefDto removedTeacher2 = iterator3.next().getRemovedTeacher();
                    if (removedTeacher2 == null) {
                        continue;
                    }
                    list5.add(removedTeacher2);
                }
                break;
            }
            case 1: {
                final PeriodDto period4 = substitutionRequestDto.getPeriod();
                if (period4 == null) {
                    list2 = list;
                    return list2;
                }
                final List<PeriodTeacherDto> teachers5 = period4.getTeachers();
                if (teachers5 == null) {
                    list2 = list;
                    return list2;
                }
                final ArrayList<TeacherRefDto> list6 = new ArrayList<TeacherRefDto>();
                final Iterator<Object> iterator4 = teachers5.iterator();
                while (true) {
                    list2 = list6;
                    if (!iterator4.hasNext()) {
                        return list2;
                    }
                    final TeacherRefDto currentTeacher2 = iterator4.next().getCurrentTeacher();
                    if (currentTeacher2 == null) {
                        continue;
                    }
                    list6.add(currentTeacher2);
                }
                break;
            }
            case 6: {
                return list2;
            }
        }
    }
    
    @f
    public static final c e(@e final TeacherAbsenceViewDto teacherAbsenceViewDto) {
        k0.p(teacherAbsenceViewDto, "<this>");
        final c c = null;
        try {
            final String endDateTime = teacherAbsenceViewDto.getEndDateTime();
            String k2;
            if (endDateTime == null) {
                k2 = null;
            }
            else {
                k2 = s.k2(endDateTime, "Z", "", false, 4, (Object)null);
            }
            return org.joda.time.c.K0(k2);
        }
        catch (Exception ex) {
            return c;
        }
    }
    
    @f
    public static final c f(@e final TeacherAbsenceViewDto teacherAbsenceViewDto) {
        k0.p(teacherAbsenceViewDto, "<this>");
        final c c = null;
        try {
            final String startDateTime = teacherAbsenceViewDto.getStartDateTime();
            String k2;
            if (startDateTime == null) {
                k2 = null;
            }
            else {
                k2 = s.k2(startDateTime, "Z", "", false, 4, (Object)null);
            }
            return org.joda.time.c.K0(k2);
        }
        catch (Exception ex) {
            return c;
        }
    }
    
    @e
    public static final String g(@e final OverbookingDto overbookingDto, @e final Context context) {
        k0.p(overbookingDto, "<this>");
        k0.p(context, "context");
        final int missedPeriods = overbookingDto.getMissedPeriods();
        String s;
        if (missedPeriods != 0) {
            if (missedPeriods != 1) {
                final String string = context.getString(2131886733);
                k0.o(string, "context.getString(R.string.shared_multiplePeriodsAffected_text)");
                s = kotlin.text.s.k2(string, "{0}", String.valueOf(overbookingDto.getMissedPeriods()), false, 4, (Object)null);
            }
            else {
                final String string2 = context.getString(2131886753);
                k0.o(string2, "context.getString(R.string.shared_onePeriodAffected_text)");
                s = kotlin.text.s.k2(string2, "{0}", "1", false, 4, (Object)null);
            }
        }
        else {
            s = context.getString(2131886738);
            k0.o(s, "context.getString(R.string.shared_noPeriodsAffected_text)");
        }
        return s;
    }
    
    @e
    public static final String h(@e final TeacherAbsenceDto teacherAbsenceDto, @e final Context context) {
        k0.p(teacherAbsenceDto, "<this>");
        k0.p(context, "context");
        final int missedPeriods = teacherAbsenceDto.getMissedPeriods();
        String s;
        if (missedPeriods != 0) {
            if (missedPeriods != 1) {
                final String string = context.getString(2131886733);
                k0.o(string, "context.getString(R.string.shared_multiplePeriodsAffected_text)");
                s = kotlin.text.s.k2(string, "{0}", String.valueOf(teacherAbsenceDto.getMissedPeriods()), false, 4, (Object)null);
            }
            else {
                final String string2 = context.getString(2131886753);
                k0.o(string2, "context.getString(R.string.shared_onePeriodAffected_text)");
                s = kotlin.text.s.k2(string2, "{0}", "1", false, 4, (Object)null);
            }
        }
        else {
            s = context.getString(2131886738);
            k0.o(s, "context.getString(R.string.shared_noPeriodsAffected_text)");
        }
        return s;
    }
    
    @e
    public static final r i(@e final OverbookingDto overbookingDto) {
        k0.p(overbookingDto, "<this>");
        return new r((l0)d0.j(overbookingDto.getStartDateTime()), (l0)d0.j(overbookingDto.getEndDateTime()));
    }
    
    @f
    public static final r j(@e final PeriodConflictDto periodConflictDto) {
        k0.p(periodConflictDto, "<this>");
        final String startDateTime = periodConflictDto.getStartDateTime();
        if (startDateTime == null) {
            return null;
        }
        final c c = new c((Object)startDateTime);
        final String endDateTime = periodConflictDto.getEndDateTime();
        if (endDateTime == null) {
            return null;
        }
        return new r((l0)c, (l0)new c((Object)endDateTime));
    }
    
    @f
    public static final r k(@e final PeriodDto periodDto) {
        k0.p(periodDto, "<this>");
        return new r((l0)new c((Object)periodDto.getStartDateTime()), (l0)new c((Object)periodDto.getEndDateTime()));
    }
    
    @f
    public static final r l(@e final TeacherAbsenceDto teacherAbsenceDto) {
        k0.p(teacherAbsenceDto, "<this>");
        final String startDateTime = teacherAbsenceDto.getStartDateTime();
        if (startDateTime == null) {
            return null;
        }
        final c c = new c((Object)startDateTime);
        final String endDateTime = teacherAbsenceDto.getEndDateTime();
        if (endDateTime == null) {
            return null;
        }
        return new r((l0)c, (l0)new c((Object)endDateTime));
    }
}
