// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.absences;

import java.util.Collection;
import com.untis.mobile.substitutionplanning.model.TeacherRefDto;
import kotlin.text.s;
import com.untis.mobile.substitutionplanning.model.SubjectRefDto;
import com.untis.mobile.substitutionplanning.model.RoomRefDto;
import com.untis.mobile.substitutionplanning.model.PeriodRoomDto;
import java.util.Iterator;
import com.untis.mobile.utils.extension.p;
import com.untis.mobile.substitutionplanning.model.PeriodKlasseDto;
import java.util.ArrayList;
import com.untis.mobile.utils.extension.h;
import android.text.Spannable;
import com.untis.mobile.utils.d0;
import org.joda.time.l0;
import org.joda.time.r;
import org.joda.time.c;
import kotlin.h0;
import android.graphics.drawable.Drawable;
import android.content.Context;
import org.jetbrains.annotations.f;
import java.util.List;
import kotlin.collections.v;
import com.untis.mobile.substitutionplanning.model.PeriodTeacherDto;
import com.untis.mobile.substitutionplanning.model.ConflictType;
import com.untis.mobile.substitutionplanning.model.PeriodDto;
import com.untis.mobile.substitutionplanning.model.AbsenceReasonRefDto;
import com.untis.mobile.substitutionplanning.model.TeacherAbsenceDto;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.substitutionplanning.model.PeriodGroupDto;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0000\u001a\u0014\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u000b\u001a\u0004\u0018\u00010\u0003*\u00020\u0007\u001a\u0014\u0010\f\u001a\u0004\u0018\u00010\b*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\u0007\u001a\f\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u0007\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0003*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0007¨\u0006\u0016" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/PeriodGroupDto;", "Landroid/content/Context;", "context", "", "j", "e", "a", "Lcom/untis/mobile/substitutionplanning/model/PeriodDto;", "Landroid/text/Spannable;", "f", "g", "i", "h", "", "l", "Lcom/untis/mobile/substitutionplanning/model/TeacherRefDto;", "k", "Landroid/graphics/drawable/Drawable;", "c", "d", "Lcom/untis/mobile/substitutionplanning/model/ConflictType;", "b", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class d
{
    @e
    public static final String a(@e final PeriodGroupDto periodGroupDto) {
        k0.p(periodGroupDto, "<this>");
        final TeacherAbsenceDto absence = periodGroupDto.getGroup().getAbsence();
        String s = "";
        if (absence != null) {
            final AbsenceReasonRefDto reason = absence.getReason();
            if (reason != null) {
                final String displayName = reason.getDisplayName();
                if (displayName != null) {
                    s = displayName;
                }
            }
        }
        return s;
    }
    
    @f
    public static final ConflictType b(@e final PeriodDto periodDto) {
        k0.p(periodDto, "<this>");
        final PeriodTeacherDto periodTeacherDto = v.t2((List<? extends PeriodTeacherDto>)periodDto.getTeachers());
        ConflictType conflictState;
        if (periodTeacherDto == null) {
            conflictState = null;
        }
        else {
            conflictState = periodTeacherDto.getConflictState();
        }
        return conflictState;
    }
    
    @f
    public static final Drawable c(@e final PeriodDto periodDto, @e final Context context) {
        k0.p(periodDto, "<this>");
        k0.p(context, "context");
        final ConflictType b = b(periodDto);
        Drawable i = null;
        if (b == null) {
            return null;
        }
        int n = 0;
        switch (a.a[b.ordinal()]) {
            default: {
                throw new h0();
            }
            case 7: {
                n = 2131230941;
                break;
            }
            case 6: {
                n = 2131230943;
                break;
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: {
                return i;
            }
        }
        i = androidx.core.content.d.i(context, n);
        return i;
    }
    
    @f
    public static final String d(@e final PeriodDto periodDto, @e final Context context) {
        k0.p(periodDto, "<this>");
        k0.p(context, "context");
        final ConflictType b = b(periodDto);
        String string = null;
        if (b == null) {
            return null;
        }
        switch (a.a[b.ordinal()]) {
            default: {
                throw new h0();
            }
            case 6: {
                string = context.getString(2131886822);
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7: {
                return string;
            }
        }
    }
    
    @e
    public static final String e(@e final PeriodGroupDto periodGroupDto) {
        k0.p(periodGroupDto, "<this>");
        try {
            final TeacherAbsenceDto absence = periodGroupDto.getGroup().getAbsence();
            if (absence != null) {
                return d0.n(new r((l0)c.K0(absence.getStartDateTime()), (l0)c.K0(absence.getEndDateTime())));
            }
            return "";
        }
        catch (Exception ex) {
            return "";
        }
    }
    
    @f
    public static final Spannable f(@e final PeriodDto periodDto, @e final Context context) {
        k0.p(periodDto, "<this>");
        k0.p(context, "context");
        Spannable l;
        try {
            final r r = new r((l0)c.K0(periodDto.getStartDateTime()), (l0)c.K0(periodDto.getEndDateTime()));
            final StringBuilder sb = new StringBuilder();
            sb.append(d0.n(r));
            sb.append(" | ");
            sb.append(d0.s(r));
            l = h.L(sb.toString());
        }
        catch (Exception ex) {
            l = null;
        }
        return l;
    }
    
    @f
    public static final Spannable g(@e final PeriodDto periodDto, @e final Context context) {
        k0.p(periodDto, "<this>");
        k0.p(context, "context");
        final List<PeriodKlasseDto> klassen = periodDto.getKlassen();
        if (klassen.isEmpty()) {
            return null;
        }
        final ArrayList<String> list = new ArrayList<String>();
        final Iterator<Object> iterator = klassen.iterator();
        while (iterator.hasNext()) {
            final String displayName = iterator.next().getKlasse().getDisplayName();
            if (displayName != null) {
                list.add(displayName);
            }
        }
        return h.N(p.b(list, null, 1, null), "|", androidx.core.content.d.f(context, 2131100044));
    }
    
    @f
    public static final Spannable h(@e final PeriodDto periodDto, @e final Context context) {
        k0.p(periodDto, "<this>");
        k0.p(context, "context");
        final List<PeriodRoomDto> rooms = periodDto.getRooms();
        if (rooms.isEmpty()) {
            return null;
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
        return h.N(p.b(list, null, 1, null), "|", androidx.core.content.d.f(context, 2131100044));
    }
    
    @f
    public static final String i(@e final PeriodDto periodDto) {
        k0.p(periodDto, "<this>");
        final SubjectRefDto subject = periodDto.getSubject();
        String displayName;
        if (subject == null) {
            displayName = null;
        }
        else {
            displayName = subject.getDisplayName();
        }
        return displayName;
    }
    
    @e
    public static final String j(@e final PeriodGroupDto periodGroupDto, @e final Context context) {
        k0.p(periodGroupDto, "<this>");
        k0.p(context, "context");
        final TeacherAbsenceDto absence = periodGroupDto.getGroup().getAbsence();
        int missedPeriods;
        if (absence != null) {
            missedPeriods = absence.getMissedPeriods();
        }
        else {
            missedPeriods = 0;
        }
        String s;
        if (missedPeriods != 0) {
            if (missedPeriods != 1) {
                final String string = context.getString(2131886733);
                k0.o(string, "context.getString(R.string.shared_multiplePeriodsAffected_text)");
                s = kotlin.text.s.k2(string, "{0}", String.valueOf(missedPeriods), false, 4, (Object)null);
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
    
    @f
    public static final TeacherRefDto k(@e final PeriodDto periodDto) {
        k0.p(periodDto, "<this>");
        final Iterator<Object> iterator = periodDto.getTeachers().iterator();
        while (true) {
            PeriodTeacherDto next;
            do {
                final boolean hasNext = iterator.hasNext();
                final TeacherRefDto teacherRefDto = null;
                if (!hasNext) {
                    next = null;
                    final PeriodTeacherDto periodTeacherDto = next;
                    TeacherRefDto currentTeacher;
                    if (periodTeacherDto == null) {
                        currentTeacher = teacherRefDto;
                    }
                    else {
                        currentTeacher = periodTeacherDto.getCurrentTeacher();
                    }
                    return currentTeacher;
                }
                next = iterator.next();
            } while (next.getConflictState() != ConflictType.SUBSTITUTION);
            continue;
        }
    }
    
    public static final boolean l(@e final PeriodDto periodDto) {
        k0.p(periodDto, "<this>");
        final List<PeriodTeacherDto> teachers = periodDto.getTeachers();
        final boolean b = teachers instanceof Collection;
        boolean b2 = true;
        if (!b || !teachers.isEmpty()) {
            final Iterator<Object> iterator = teachers.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getConflictState() == ConflictType.SUBSTITUTION) {
                    return b2;
                }
            }
        }
        b2 = false;
        return b2;
    }
}
