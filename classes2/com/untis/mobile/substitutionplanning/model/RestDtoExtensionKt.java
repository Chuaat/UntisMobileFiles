// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import com.untis.wu.rest.model.TeacherAbsenceUpdateDto;
import com.untis.wu.rest.model.TeacherAbsenceDto;
import android.text.style.StrikethroughSpan;
import kotlin.text.s;
import android.text.SpannableString;
import java.util.Collection;
import kotlin.collections.v;
import java.util.Iterator;
import java.util.List;
import com.untis.mobile.utils.extension.h;
import androidx.core.content.d;
import java.util.ArrayList;
import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.k0;
import android.text.Spannable;
import android.content.Context;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\b\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0005*\u00020\u0007\u001a\u0014\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t\u001a\n\u0010\u000b\u001a\u00020\u0005*\u00020\u0007\u001a\n\u0010\f\u001a\u00020\t*\u00020\u0000\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\r\u001a\n\u0010\u0011\u001a\u00020\r*\u00020\u0010¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/PeriodConflictDto;", "Landroid/content/Context;", "context", "", "getStatusColor", "Landroid/text/Spannable;", "getDisplayableClasses", "Lcom/untis/mobile/substitutionplanning/model/PeriodDto;", "getDisplayableRooms", "", "withOriginalTeacher", "getDisplayableTeacher", "publishAvailable", "Lcom/untis/wu/rest/model/TeacherAbsenceDto;", "Lcom/untis/wu/rest/model/TeacherAbsenceUpdateDto;", "toTeacherAbsenceUpdateDto", "Lcom/untis/mobile/substitutionplanning/model/TeacherAbsenceDto;", "toWuTeacherAbsenceDto", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class RestDtoExtensionKt
{
    @e
    public static final Spannable getDisplayableClasses(@e final PeriodConflictDto periodConflictDto, @e final Context context) {
        k0.p(periodConflictDto, "<this>");
        k0.p(context, "context");
        final List<KlasseRefDto> klassen = periodConflictDto.getKlassen();
        if (klassen == null) {
            return (Spannable)new SpannableStringBuilder((CharSequence)"");
        }
        if (klassen.isEmpty()) {
            return (Spannable)new SpannableStringBuilder((CharSequence)"");
        }
        final ArrayList<String> list = new ArrayList<String>();
        final Iterator<Object> iterator = klassen.iterator();
        while (iterator.hasNext()) {
            final String displayName = iterator.next().getDisplayName();
            if (displayName != null) {
                list.add(displayName);
            }
        }
        final Iterator<Object> iterator2 = list.iterator();
        if (iterator2.hasNext()) {
            String s = iterator2.next();
            while (iterator2.hasNext()) {
                final String s2 = iterator2.next();
                final String s3 = s;
                final boolean b = s3.length() > 0;
                String c = s3;
                if (b) {
                    c = k0.C(s3, " | ");
                }
                s = k0.C(c, s2);
            }
            return h.N(s, "|", d.f(context, 2131099943));
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
    
    @e
    public static final Spannable getDisplayableClasses(@e final PeriodDto periodDto, @e final Context context) {
        k0.p(periodDto, "<this>");
        k0.p(context, "context");
        final List<PeriodKlasseDto> klassen = periodDto.getKlassen();
        if (klassen.isEmpty()) {
            return (Spannable)new SpannableStringBuilder((CharSequence)"");
        }
        final ArrayList<String> list = new ArrayList<String>();
        final Iterator<Object> iterator = klassen.iterator();
        while (iterator.hasNext()) {
            final String displayName = iterator.next().getKlasse().getDisplayName();
            if (displayName != null) {
                list.add(displayName);
            }
        }
        final Iterator<Object> iterator2 = list.iterator();
        if (iterator2.hasNext()) {
            String s = iterator2.next();
            while (iterator2.hasNext()) {
                final String s2 = iterator2.next();
                final String s3 = s;
                final boolean b = s3.length() > 0;
                String c = s3;
                if (b) {
                    c = k0.C(s3, " | ");
                }
                s = k0.C(c, s2);
            }
            return h.N(s, "|", d.f(context, 2131099943));
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
    
    @e
    public static final Spannable getDisplayableRooms(@e final PeriodConflictDto periodConflictDto) {
        k0.p(periodConflictDto, "<this>");
        final List<RoomRefDto> rooms = periodConflictDto.getRooms();
        if (rooms == null) {
            return (Spannable)new SpannableStringBuilder((CharSequence)"");
        }
        if (rooms.isEmpty()) {
            return (Spannable)new SpannableStringBuilder((CharSequence)"");
        }
        final ArrayList<String> list = new ArrayList<String>();
        final Iterator<Object> iterator = rooms.iterator();
        while (iterator.hasNext()) {
            final String displayName = iterator.next().getDisplayName();
            if (displayName != null) {
                list.add(displayName);
            }
        }
        final Iterator<Object> iterator2 = list.iterator();
        if (iterator2.hasNext()) {
            String s = iterator2.next();
            while (iterator2.hasNext()) {
                final String s2 = iterator2.next();
                final String s3 = s;
                final boolean b = s3.length() > 0;
                String c = s3;
                if (b) {
                    c = k0.C(s3, ", ");
                }
                s = k0.C(c, s2);
            }
            return h.L(s);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
    
    @e
    public static final Spannable getDisplayableRooms(@e final PeriodDto periodDto) {
        k0.p(periodDto, "<this>");
        final List<PeriodRoomDto> rooms = periodDto.getRooms();
        if (rooms.isEmpty()) {
            return (Spannable)new SpannableStringBuilder((CharSequence)"");
        }
        final ArrayList<String> list = new ArrayList<String>();
        final Iterator<Object> iterator = rooms.iterator();
        while (iterator.hasNext()) {
            final RoomRefDto currentRoom = iterator.next().getCurrentRoom();
            String displayName;
            if (currentRoom == null) {
                displayName = null;
            }
            else {
                displayName = currentRoom.getDisplayName();
            }
            if (displayName != null) {
                list.add(displayName);
            }
        }
        final Iterator<Object> iterator2 = list.iterator();
        if (iterator2.hasNext()) {
            String s = iterator2.next();
            while (iterator2.hasNext()) {
                final String s2 = iterator2.next();
                final String s3 = s;
                final boolean b = s3.length() > 0;
                String c = s3;
                if (b) {
                    c = k0.C(s3, ", ");
                }
                s = k0.C(c, s2);
            }
            return h.L(s);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
    
    @e
    public static final Spannable getDisplayableTeacher(@e final PeriodConflictDto periodConflictDto, final boolean b) {
        k0.p(periodConflictDto, "<this>");
        final ArrayList<TeamTeacherDto> list = new ArrayList<TeamTeacherDto>();
        final TeacherRefDto originalTeacher = periodConflictDto.getOriginalTeacher();
        if (b && originalTeacher != null) {
            list.add(new TeamTeacherDto(originalTeacher, Boolean.TRUE));
        }
        List<? extends TeamTeacherDto> c;
        if ((c = periodConflictDto.getTeamTeachers()) == null) {
            c = (List<? extends TeamTeacherDto>)v.E();
        }
        if (c.isEmpty() ^ true) {
            list.addAll(c);
        }
        if (list.isEmpty()) {
            return (Spannable)new SpannableString((CharSequence)"");
        }
        final ArrayList<String> list2 = new ArrayList<String>();
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            final TeacherRefDto teacher = iterator.next().getTeacher();
            String displayName;
            if (teacher == null) {
                displayName = null;
            }
            else {
                displayName = teacher.getDisplayName();
            }
            if (displayName != null) {
                list2.add(displayName);
            }
        }
        final Iterator<Object> iterator2 = list2.iterator();
        if (iterator2.hasNext()) {
            String s = iterator2.next();
            while (iterator2.hasNext()) {
                final String s2 = iterator2.next();
                final String s3 = s;
                final boolean b2 = s3.length() > 0;
                String c2 = s3;
                if (b2) {
                    c2 = k0.C(s3, ", ");
                }
                s = k0.C(c2, s2);
            }
            final String s4 = s;
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)s4);
            for (final TeamTeacherDto teamTeacherDto : list) {
                if (k0.g(teamTeacherDto.isAbsent(), Boolean.TRUE)) {
                    final TeacherRefDto teacher2 = teamTeacherDto.getTeacher();
                    String displayName2;
                    if (teacher2 == null || (displayName2 = teacher2.getDisplayName()) == null) {
                        displayName2 = "";
                    }
                    final int r3 = kotlin.text.s.r3((CharSequence)s4, displayName2, 0, false, 6, (Object)null);
                    spannableStringBuilder.setSpan((Object)new StrikethroughSpan(), r3, displayName2.length() + r3, 256);
                }
            }
            return (Spannable)spannableStringBuilder;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
    
    @e
    public static final Spannable getDisplayableTeacher(@e final PeriodDto periodDto) {
        k0.p(periodDto, "<this>");
        final List<PeriodTeacherDto> teachers = periodDto.getTeachers();
        if (teachers.isEmpty()) {
            return (Spannable)new SpannableString((CharSequence)"");
        }
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (final PeriodTeacherDto periodTeacherDto : teachers) {
            if (((CharSequence)spannableStringBuilder).length() > 0) {
                spannableStringBuilder.append((CharSequence)", ");
            }
            final TeacherRefDto removedTeacher = periodTeacherDto.getRemovedTeacher();
            final CharSequence charSequence = null;
            CharSequence displayName = null;
            if (removedTeacher != null) {
                final int length = spannableStringBuilder.length();
                final TeacherRefDto removedTeacher2 = periodTeacherDto.getRemovedTeacher();
                if (removedTeacher2 != null) {
                    displayName = removedTeacher2.getDisplayName();
                }
                spannableStringBuilder.append(displayName);
                spannableStringBuilder.setSpan((Object)new StrikethroughSpan(), length, spannableStringBuilder.length(), 256);
            }
            else {
                if (periodTeacherDto.getCurrentTeacher() == null) {
                    continue;
                }
                final TeacherRefDto currentTeacher = periodTeacherDto.getCurrentTeacher();
                CharSequence displayName2;
                if (currentTeacher == null) {
                    displayName2 = charSequence;
                }
                else {
                    displayName2 = currentTeacher.getDisplayName();
                }
                spannableStringBuilder.append(displayName2);
            }
        }
        return (Spannable)spannableStringBuilder;
    }
    
    public static final int getStatusColor(@e final PeriodConflictDto periodConflictDto, @e final Context context) {
        k0.p(periodConflictDto, "<this>");
        k0.p(context, "context");
        int n;
        if (periodConflictDto.getSolution() != null) {
            final SolutionDto solution = periodConflictDto.getSolution();
            if (solution != null && k0.g(solution.isPublished(), Boolean.TRUE)) {
                n = 2131099950;
            }
            else {
                n = 2131099946;
            }
        }
        else {
            n = 2131099944;
        }
        return d.f(context, n);
    }
    
    public static final boolean publishAvailable(@e final PeriodConflictDto periodConflictDto) {
        k0.p(periodConflictDto, "<this>");
        if (periodConflictDto.getSolution() != null) {
            return false;
        }
        final SolutionDto solution = periodConflictDto.getSolution();
        return solution == null || !k0.g(solution.isPublished(), Boolean.TRUE);
    }
    
    @e
    public static final TeacherAbsenceUpdateDto toTeacherAbsenceUpdateDto(@e final TeacherAbsenceDto teacherAbsenceDto) {
        k0.p(teacherAbsenceDto, "<this>");
        final TeacherAbsenceUpdateDto teacherAbsenceUpdateDto = new TeacherAbsenceUpdateDto();
        teacherAbsenceUpdateDto.setStartDateTime(teacherAbsenceDto.getStartDateTime());
        teacherAbsenceUpdateDto.setEndDateTime(teacherAbsenceDto.getEndDateTime());
        teacherAbsenceUpdateDto.setNote(teacherAbsenceDto.getNote());
        teacherAbsenceUpdateDto.setReasonId(teacherAbsenceDto.getReasonId());
        return teacherAbsenceUpdateDto;
    }
    
    @e
    public static final TeacherAbsenceDto toWuTeacherAbsenceDto(@e final com.untis.mobile.substitutionplanning.model.TeacherAbsenceDto teacherAbsenceDto) {
        k0.p(teacherAbsenceDto, "<this>");
        final TeacherAbsenceDto teacherAbsenceDto2 = new TeacherAbsenceDto();
        teacherAbsenceDto2.setId(teacherAbsenceDto.getWuAbsenceId());
        teacherAbsenceDto2.setStartDateTime(teacherAbsenceDto.getStartDateTime());
        teacherAbsenceDto2.setEndDateTime(teacherAbsenceDto.getEndDateTime());
        final TeacherRefDto teacher = teacherAbsenceDto.getTeacher();
        final Long n = null;
        Long value;
        if (teacher == null) {
            value = null;
        }
        else {
            value = teacher.getId();
        }
        teacherAbsenceDto2.setTeacherId(value);
        final AbsenceReasonRefDto reason = teacherAbsenceDto.getReason();
        Long value2;
        if (reason == null) {
            value2 = n;
        }
        else {
            value2 = reason.getId();
        }
        teacherAbsenceDto2.setReasonId(value2);
        return teacherAbsenceDto2;
    }
}
