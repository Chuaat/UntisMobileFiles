// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period;

import com.untis.mobile.messenger.a;
import org.joda.time.n0;
import java.util.Collection;
import org.joda.time.t;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.utils.d0;
import org.joda.time.l0;
import org.joda.time.r;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodKlasse;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodPermission;
import android.content.Intent;
import android.net.Uri;
import com.untis.mobile.calendar.network.model.period.update.CalendarPeriodAttachment;
import com.untis.mobile.calendar.persistence.model.common.CalendarMessengerChannel;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodTeacherStatus;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodTeacher;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodSubject;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodType;
import java.util.Iterator;
import java.util.List;
import com.untis.mobile.utils.extension.c;
import kotlin.collections.v;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodRoomStatus;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodRoom;
import java.util.ArrayList;
import org.jetbrains.annotations.f;
import kotlin.h0;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import android.content.Context;
import org.jetbrains.annotations.e;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\u0010\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\u00020\u0000\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\u00020\u0000\u001a\u0014\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00020\b\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u001a\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00020\b\u001a\n\u0010\u0011\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u0012\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u0013\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u0014\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u0015\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u0016\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u0017\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u0019\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u001a\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u001b\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u001c\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u001d\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u001e\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u001f\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010 \u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010!\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\"\u001a\u00020\u000b*\u00020\u0000\u001a\u0012\u0010#\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00020\b\u001a\u0012\u0010$\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00020\b\u001a\u0012\u0010'\u001a\u00020&*\u00020%2\u0006\u0010\t\u001a\u00020\b\u001a&\u0010-\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020(0\u00052\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u001a\u0014\u0010/\u001a\u00020\u0001*\u00020.2\b\b\u0002\u0010*\u001a\u00020)\u001a\u0012\u00100\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¨\u00061" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "", "w", "v", "s", "", "u", "t", "Landroid/content/Context;", "context", "F", "", "withRemovedRooms", "D", "withRemovedTeachers", "G", "C", "f", "J", "l", "d", "o", "g", "j", "b", "k", "c", "p", "h", "n", "m", "a", "e", "i", "I", "A", "B", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodAttachment;", "Lkotlin/j2;", "K", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "", "max", "Lorg/joda/time/t;", "dueDate", "x", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "q", "z", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class x
{
    @e
    public static final String A(@e final CalendarPeriod calendarPeriod, @e final Context context) {
        k0.p(calendarPeriod, "<this>");
        k0.p(context, "context");
        final String notesAll = calendarPeriod.getNotesAll();
        if (notesAll != null) {
            return notesAll;
        }
        if (calendarPeriod.getNotesAllFiles().size() == 1) {
            final String string = context.getString(2131886196);
            k0.o(string, "context.getString(R.string.calendarPeriod_oneAttachment_text)");
            return string;
        }
        if (calendarPeriod.getNotesAllFiles().size() > 1) {
            final String string2 = context.getString(2131886198);
            k0.o(string2, "context.getString(R.string.calendarPeriod_xAttachments_text)");
            return s.k2(string2, "{0}", String.valueOf(calendarPeriod.getNotesAllFiles().size()), false, 4, (Object)null);
        }
        return "";
    }
    
    @e
    public static final String B(@e final CalendarPeriod calendarPeriod, @e final Context context) {
        k0.p(calendarPeriod, "<this>");
        k0.p(context, "context");
        final String notesStaff = calendarPeriod.getNotesStaff();
        if (notesStaff != null) {
            return notesStaff;
        }
        if (calendarPeriod.getNotesStaffFiles().size() == 1) {
            final String string = context.getString(2131886196);
            k0.o(string, "context.getString(R.string.calendarPeriod_oneAttachment_text)");
            return string;
        }
        if (calendarPeriod.getNotesStaffFiles().size() > 1) {
            final String string2 = context.getString(2131886198);
            k0.o(string2, "context.getString(R.string.calendarPeriod_xAttachments_text)");
            return s.k2(string2, "{0}", String.valueOf(calendarPeriod.getNotesStaffFiles().size()), false, 4, (Object)null);
        }
        return "";
    }
    
    @f
    public static final String C(@e final CalendarPeriod calendarPeriod, @e final Context context) {
        k0.p(calendarPeriod, "<this>");
        k0.p(context, "context");
        final int n = a.a[calendarPeriod.getType().ordinal()];
        String string = null;
        int n2 = 0;
        switch (n) {
            default: {
                throw new h0();
            }
            case 7: {
                n2 = 2131886271;
                break;
            }
            case 6: {
                n2 = 2131886192;
                break;
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 9: {
                return string;
            }
        }
        string = context.getString(n2);
        return string;
    }
    
    @e
    public static final String D(@e final CalendarPeriod calendarPeriod, final boolean b) {
        k0.p(calendarPeriod, "<this>");
        final List<CalendarPeriodRoom> rooms = calendarPeriod.getRooms();
        List<CalendarPeriodRoom> list;
        if (b) {
            list = rooms;
        }
        else {
            list = new ArrayList<CalendarPeriodRoom>();
            for (final T next : rooms) {
                if (((CalendarPeriodRoom)next).getStatus() != CalendarPeriodRoomStatus.Removed) {
                    list.add((CalendarPeriodRoom)next);
                }
            }
        }
        if (list.isEmpty()) {
            return "";
        }
        final ArrayList list2 = new ArrayList<String>(v.Y((Iterable<?>)list, 10));
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            list2.add(iterator2.next().getDisplayName());
        }
        return c.b(list2, null, 1, null);
    }
    
    @f
    public static final String F(@e final CalendarPeriod calendarPeriod, @e final Context context) {
        k0.p(calendarPeriod, "<this>");
        k0.p(context, "context");
        int n;
        if (calendarPeriod.getType() == CalendarPeriodType.ContactHour) {
            n = 2131886194;
        }
        else {
            if (calendarPeriod.getType() != CalendarPeriodType.BreakSupervision) {
                final CalendarPeriodSubject subject = calendarPeriod.getSubject();
                String displayName;
                if (subject == null) {
                    displayName = null;
                }
                else {
                    displayName = subject.getDisplayName();
                }
                return displayName;
            }
            n = 2131886673;
        }
        return context.getString(n);
    }
    
    @e
    public static final String G(@e final CalendarPeriod calendarPeriod, final boolean b) {
        k0.p(calendarPeriod, "<this>");
        final List<CalendarPeriodTeacher> teachers = calendarPeriod.getTeachers();
        List<CalendarPeriodTeacher> list;
        if (b) {
            list = teachers;
        }
        else {
            list = new ArrayList<CalendarPeriodTeacher>();
            for (final T next : teachers) {
                if (((CalendarPeriodTeacher)next).getStatus() != CalendarPeriodTeacherStatus.Removed) {
                    list.add((CalendarPeriodTeacher)next);
                }
            }
        }
        if (list.isEmpty()) {
            return "";
        }
        final ArrayList list2 = new ArrayList<String>(v.Y((Iterable<?>)list, 10));
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            list2.add(iterator2.next().getDisplayName());
        }
        return c.b(list2, null, 1, null);
    }
    
    public static final boolean I(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        final CalendarMessengerChannel messengerChannel = calendarPeriod.getMessengerChannel();
        CharSequence id;
        if (messengerChannel == null) {
            id = null;
        }
        else {
            id = messengerChannel.getId();
        }
        return (id == null || s.U1(id)) ^ true;
    }
    
    public static final boolean J(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        final String teachingContent = calendarPeriod.getTeachingContent();
        return (teachingContent == null || s.U1((CharSequence)teachingContent)) ^ true;
    }
    
    public static final void K(@e final CalendarPeriodAttachment calendarPeriodAttachment, @e final Context context) {
        k0.p(calendarPeriodAttachment, "<this>");
        k0.p(context, "context");
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(calendarPeriodAttachment.getDownloadUrl())));
    }
    
    public static final boolean a(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        return calendarPeriod.getPermissions().contains(CalendarPeriodPermission.CreateMessengerGroup);
    }
    
    public static final boolean b(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        return calendarPeriod.getPermissions().contains(CalendarPeriodPermission.WriteClassRegisterEntries);
    }
    
    public static final boolean c(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        return calendarPeriod.getPermissions().contains(CalendarPeriodPermission.WriteHomework);
    }
    
    public static final boolean d(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        return calendarPeriod.getPermissions().contains(CalendarPeriodPermission.WriteLessonContent);
    }
    
    public static final boolean e(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        return calendarPeriod.getPermissions().contains(CalendarPeriodPermission.WriteNotesAll);
    }
    
    public static final boolean f(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        return calendarPeriod.getPermissions().contains(CalendarPeriodPermission.EditRoom);
    }
    
    public static final boolean g(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        return calendarPeriod.getPermissions().contains(CalendarPeriodPermission.WriteStudentAbsence);
    }
    
    public static final boolean h(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        return calendarPeriod.getPermissions().contains(CalendarPeriodPermission.WriteNotesStaff);
    }
    
    public static final boolean i(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        return calendarPeriod.getPermissions().contains(CalendarPeriodPermission.WriteVideoCall);
    }
    
    public static final boolean j(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        return calendarPeriod.getPermissions().contains(CalendarPeriodPermission.ReadClassRegisterEntries) || calendarPeriod.getPermissions().contains(CalendarPeriodPermission.WriteClassRegisterEntries);
    }
    
    public static final boolean k(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        return calendarPeriod.getPermissions().contains(CalendarPeriodPermission.ReadHomework) || calendarPeriod.getPermissions().contains(CalendarPeriodPermission.WriteHomework);
    }
    
    public static final boolean l(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        return calendarPeriod.getPermissions().contains(CalendarPeriodPermission.WriteLessonContent) || J(calendarPeriod);
    }
    
    public static final boolean m(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        return calendarPeriod.getPermissions().contains(CalendarPeriodPermission.ReadMessengerGroup) || calendarPeriod.getPermissions().contains(CalendarPeriodPermission.CreateMessengerGroup);
    }
    
    public static final boolean n(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        final String notesAll = calendarPeriod.getNotesAll();
        final int n = 0;
        if (notesAll == null || s.U1((CharSequence)notesAll)) {
            final List<CalendarPeriodAttachment> notesAllFiles = calendarPeriod.getNotesAllFiles();
            int n2 = 0;
            Label_0060: {
                if (notesAllFiles != null) {
                    n2 = n;
                    if (!notesAllFiles.isEmpty()) {
                        break Label_0060;
                    }
                }
                n2 = 1;
            }
            if (n2 != 0) {
                return calendarPeriod.getPermissions().contains(CalendarPeriodPermission.WriteNotesAll);
            }
        }
        return true;
    }
    
    public static final boolean o(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        return calendarPeriod.getPermissions().contains(CalendarPeriodPermission.ReadStudentAbsence) || calendarPeriod.getPermissions().contains(CalendarPeriodPermission.WriteStudentAbsence);
    }
    
    public static final boolean p(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        final String notesStaff = calendarPeriod.getNotesStaff();
        return (notesStaff != null && !s.U1((CharSequence)notesStaff)) || calendarPeriod.getPermissions().contains(CalendarPeriodPermission.WriteNotesStaff);
    }
    
    @e
    public static final String q(@e final Classbook classbook, final int i) {
        k0.p(classbook, "<this>");
        final int size = classbook.getEvents().size();
        if (size > i) {
            final StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('+');
            return sb.toString();
        }
        return String.valueOf(size);
    }
    
    @e
    public static final String s(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        if (calendarPeriod.getType() == CalendarPeriodType.BreakSupervision || calendarPeriod.getType() == CalendarPeriodType.ContactHour) {
            return "";
        }
        if (calendarPeriod.getKlassen().isEmpty()) {
            return "";
        }
        final List<CalendarPeriodKlasse> klassen = calendarPeriod.getKlassen();
        final ArrayList list = new ArrayList<String>(v.Y((Iterable<?>)klassen, 10));
        final Iterator<Object> iterator = klassen.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().getDisplayName());
        }
        return c.b(list, null, 1, null);
    }
    
    @e
    public static final List<String> t(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        final List<CalendarPeriodRoom> rooms = calendarPeriod.getRooms();
        final ArrayList<CalendarPeriodRoom> list = new ArrayList<CalendarPeriodRoom>();
        for (final CalendarPeriodRoom next : rooms) {
            if (next.getStatus() == CalendarPeriodRoomStatus.Removed) {
                list.add(next);
            }
        }
        final ArrayList list2 = new ArrayList<String>(v.Y((Iterable<?>)list, 10));
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            list2.add(iterator2.next().getDisplayName());
        }
        return (List<String>)list2;
    }
    
    @e
    public static final List<String> u(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        final List<CalendarPeriodTeacher> teachers = calendarPeriod.getTeachers();
        final ArrayList<CalendarPeriodTeacher> list = new ArrayList<CalendarPeriodTeacher>();
        for (final CalendarPeriodTeacher next : teachers) {
            if (next.getStatus() == CalendarPeriodTeacherStatus.Removed) {
                list.add(next);
            }
        }
        final ArrayList list2 = new ArrayList<String>(v.Y((Iterable<?>)list, 10));
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            list2.add(iterator2.next().getDisplayName());
        }
        return (List<String>)list2;
    }
    
    @e
    public static final String v(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        return d0.s(new r((l0)calendarPeriod.getStart(), (l0)calendarPeriod.getEnd()));
    }
    
    @e
    public static final String w(@e final CalendarPeriod calendarPeriod) {
        k0.p(calendarPeriod, "<this>");
        final String g4 = ((org.joda.time.base.a)calendarPeriod.getStart()).g4("E '|' dd.MM.yy");
        k0.o(g4, "start.toString(\"E '|' dd.MM.yy\")");
        return g4;
    }
    
    @e
    public static final String x(@e final List<HomeWork> list, final int i, @f final t t) {
        k0.p(list, "<this>");
        int size = 0;
        int n = 0;
        if (t != null) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                final Iterator<HomeWork> iterator = (Iterator<HomeWork>)list.iterator();
                while (true) {
                    size = n;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    if (!((org.joda.time.base.e)iterator.next().getEnd().h1()).p((n0)t)) {
                        continue;
                    }
                    final int n2 = n + 1;
                    if ((n = n2) >= 0) {
                        continue;
                    }
                    v.V();
                    n = n2;
                }
            }
        }
        else {
            size = list.size();
        }
        if (size > i) {
            final StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('+');
            return sb.toString();
        }
        return String.valueOf(size);
    }
    
    @e
    public static final String z(@e final CalendarPeriod calendarPeriod, @e final Context context) {
        k0.p(calendarPeriod, "<this>");
        k0.p(context, "context");
        String s;
        String s2;
        if (!com.untis.mobile.messenger.a.a.h(context)) {
            s = context.getString(2131886436);
            s2 = "context.getString(R.string.messenger_download_text)";
        }
        else {
            final CalendarMessengerChannel messengerChannel = calendarPeriod.getMessengerChannel();
            CharSequence id;
            if (messengerChannel == null) {
                id = null;
            }
            else {
                id = messengerChannel.getId();
            }
            if (id == null || kotlin.text.s.U1(id)) {
                s = context.getString(2131886435);
                s2 = "context.getString(R.string.messenger_createGroup_text)";
            }
            else {
                s = context.getString(2131886441);
                s2 = "context.getString(R.string.messenger_openGroup_text)";
            }
        }
        k0.o(s, s2);
        return s;
    }
}
