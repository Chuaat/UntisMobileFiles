// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.persistence.dao;

import androidx.sqlite.db.e;
import java.util.Iterator;
import androidx.room.util.g;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodVideoCall;
import com.untis.mobile.calendar.persistence.model.CalendarBlockPeriod;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodType;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodTeacher;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodSubject;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodSubType;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodStudent;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodStatus;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodRoom;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodResource;
import com.untis.mobile.calendar.persistence.model.common.CalendarOriginalPeriod;
import com.untis.mobile.calendar.network.model.period.update.CalendarPeriodAttachment;
import com.untis.mobile.calendar.persistence.model.common.CalendarMessengerChannel;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodLesson;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodKlasse;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodExam;
import com.untis.mobile.calendar.persistence.model.common.CalendarBooking;
import android.database.Cursor;
import java.util.ArrayList;
import android.os.CancellationSignal;
import androidx.sqlite.db.f;
import androidx.room.util.c;
import androidx.room.v2;
import java.util.Collections;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodPermission;
import java.util.List;
import androidx.sqlite.db.h;
import androidx.room.a3;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import androidx.room.u0;
import androidx.room.r2;

public final class b implements a
{
    private final r2 a;
    private final u0<CalendarPeriod> b;
    private final com.untis.mobile.utils.roomadapter.a c;
    private final a3 d;
    
    public b(final r2 a) {
        this.c = new com.untis.mobile.utils.roomadapter.a();
        this.a = a;
        this.b = new u0<CalendarPeriod>(a) {
            public void a(final h h, final CalendarPeriod calendarPeriod) {
                ((e)h).l2(1, calendarPeriod.getId());
                if (calendarPeriod.getAbsenceReasonId() == null) {
                    ((e)h).c4(2);
                }
                else {
                    ((e)h).l2(2, (long)calendarPeriod.getAbsenceReasonId());
                }
                final String e = com.untis.mobile.calendar.persistence.dao.b.this.c.e(calendarPeriod.getBooking());
                if (e == null) {
                    ((e)h).c4(3);
                }
                else {
                    ((e)h).K0(3, e);
                }
                if (calendarPeriod.getColor() == null) {
                    ((e)h).c4(4);
                }
                else {
                    ((e)h).l2(4, (long)calendarPeriod.getColor());
                }
                final Long t = com.untis.mobile.calendar.persistence.dao.b.this.c.t(calendarPeriod.getEnd());
                if (t == null) {
                    ((e)h).c4(5);
                }
                else {
                    ((e)h).l2(5, (long)t);
                }
                final String f = com.untis.mobile.calendar.persistence.dao.b.this.c.f(calendarPeriod.getExam());
                if (f == null) {
                    ((e)h).c4(6);
                }
                else {
                    ((e)h).K0(6, f);
                }
                final String s = com.untis.mobile.calendar.persistence.dao.b.this.c.s(calendarPeriod.getKlassen());
                if (s == null) {
                    ((e)h).c4(7);
                }
                else {
                    ((e)h).K0(7, s);
                }
                final String g = com.untis.mobile.calendar.persistence.dao.b.this.c.g(calendarPeriod.getLesson());
                if (g == null) {
                    ((e)h).c4(8);
                }
                else {
                    ((e)h).K0(8, g);
                }
                final String g2 = com.untis.mobile.calendar.persistence.dao.b.this.c.g(calendarPeriod.getMainStudentGroup());
                if (g2 == null) {
                    ((e)h).c4(9);
                }
                else {
                    ((e)h).K0(9, g2);
                }
                final String b = com.untis.mobile.calendar.persistence.dao.b.this.c.b(calendarPeriod.getMessengerChannel());
                if (b == null) {
                    ((e)h).c4(10);
                }
                else {
                    ((e)h).K0(10, b);
                }
                if (calendarPeriod.getNotesAll() == null) {
                    ((e)h).c4(11);
                }
                else {
                    ((e)h).K0(11, calendarPeriod.getNotesAll());
                }
                final String d = com.untis.mobile.calendar.persistence.dao.b.this.c.d(calendarPeriod.getNotesAllFiles());
                if (d == null) {
                    ((e)h).c4(12);
                }
                else {
                    ((e)h).K0(12, d);
                }
                if (calendarPeriod.getNotesStaff() == null) {
                    ((e)h).c4(13);
                }
                else {
                    ((e)h).K0(13, calendarPeriod.getNotesStaff());
                }
                final String d2 = com.untis.mobile.calendar.persistence.dao.b.this.c.d(calendarPeriod.getNotesStaffFiles());
                if (d2 == null) {
                    ((e)h).c4(14);
                }
                else {
                    ((e)h).K0(14, d2);
                }
                final String c = com.untis.mobile.calendar.persistence.dao.b.this.c.c(calendarPeriod.getOriginalCalendarPeriod());
                if (c == null) {
                    ((e)h).c4(15);
                }
                else {
                    ((e)h).K0(15, c);
                }
                final String i = com.untis.mobile.calendar.persistence.dao.b.this.c.i(calendarPeriod.getResources());
                if (i == null) {
                    ((e)h).c4(16);
                }
                else {
                    ((e)h).K0(16, i);
                }
                final String j = com.untis.mobile.calendar.persistence.dao.b.this.c.j(calendarPeriod.getRooms());
                if (j == null) {
                    ((e)h).c4(17);
                }
                else {
                    ((e)h).K0(17, j);
                }
                final Long t2 = com.untis.mobile.calendar.persistence.dao.b.this.c.t(calendarPeriod.getStart());
                if (t2 == null) {
                    ((e)h).c4(18);
                }
                else {
                    ((e)h).l2(18, (long)t2);
                }
                final String k = com.untis.mobile.calendar.persistence.dao.b.this.c.k(calendarPeriod.getStatus());
                if (k == null) {
                    ((e)h).c4(19);
                }
                else {
                    ((e)h).K0(19, k);
                }
                final String m = com.untis.mobile.calendar.persistence.dao.b.this.c.m(calendarPeriod.getStudents());
                if (m == null) {
                    ((e)h).c4(20);
                }
                else {
                    ((e)h).K0(20, m);
                }
                final String n = com.untis.mobile.calendar.persistence.dao.b.this.c.n(calendarPeriod.getSubType());
                if (n == null) {
                    ((e)h).c4(21);
                }
                else {
                    ((e)h).K0(21, n);
                }
                final String o = com.untis.mobile.calendar.persistence.dao.b.this.c.o(calendarPeriod.getSubject());
                if (o == null) {
                    ((e)h).c4(22);
                }
                else {
                    ((e)h).K0(22, o);
                }
                if (calendarPeriod.getSubstitutionText() == null) {
                    ((e)h).c4(23);
                }
                else {
                    ((e)h).K0(23, calendarPeriod.getSubstitutionText());
                }
                final String p2 = com.untis.mobile.calendar.persistence.dao.b.this.c.p(calendarPeriod.getTeachers());
                if (p2 == null) {
                    ((e)h).c4(24);
                }
                else {
                    ((e)h).K0(24, p2);
                }
                if (calendarPeriod.getTeachingContent() == null) {
                    ((e)h).c4(25);
                }
                else {
                    ((e)h).K0(25, calendarPeriod.getTeachingContent());
                }
                final String d3 = com.untis.mobile.calendar.persistence.dao.b.this.c.d(calendarPeriod.getTeachingContentFiles());
                if (d3 == null) {
                    ((e)h).c4(26);
                }
                else {
                    ((e)h).K0(26, d3);
                }
                final String q = com.untis.mobile.calendar.persistence.dao.b.this.c.q(calendarPeriod.getType());
                if (q == null) {
                    ((e)h).c4(27);
                }
                else {
                    ((e)h).K0(27, q);
                }
                final String h2 = com.untis.mobile.calendar.persistence.dao.b.this.c.h(calendarPeriod.getPermissions());
                if (h2 == null) {
                    ((e)h).c4(28);
                }
                else {
                    ((e)h).K0(28, h2);
                }
                final String a = com.untis.mobile.calendar.persistence.dao.b.this.c.a(calendarPeriod.getBlockPeriods());
                if (a == null) {
                    ((e)h).c4(29);
                }
                else {
                    ((e)h).K0(29, a);
                }
                final String r = com.untis.mobile.calendar.persistence.dao.b.this.c.r(calendarPeriod.getVideoCall());
                if (r == null) {
                    ((e)h).c4(30);
                }
                else {
                    ((e)h).K0(30, r);
                }
                if (calendarPeriod.getLessonInfo() == null) {
                    ((e)h).c4(31);
                }
                else {
                    ((e)h).K0(31, calendarPeriod.getLessonInfo());
                }
            }
            
            public String createQuery() {
                return "INSERT OR REPLACE INTO `calendar_period` (`period_id`,`absence_reason_id`,`booking`,`color`,`end`,`exam`,`klassen`,`lesson`,`student_group`,`messenger_channel`,`notes_all`,`notes_all_files`,`notes_staff`,`notes_staff_files`,`original_period`,`resources`,`rooms`,`start`,`status`,`students`,`type_sub`,`subject`,`substitution_text`,`teachers`,`teaching_content`,`teaching_content_files`,`type`,`permissions`,`block_periods`,`video_call`,`lesson_info`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.d = new a3(a) {
            public String createQuery() {
                return "DELETE FROM calendar_period WHERE start <= ?";
            }
        };
    }
    
    public static List<Class<?>> h() {
        return Collections.emptyList();
    }
    
    @Override
    public List<CalendarPeriod> a() {
        final v2 d = v2.d("SELECT * FROM calendar_period", 0);
        this.a.d();
        final Cursor d2 = androidx.room.util.c.d(this.a, (f)d, false, (CancellationSignal)null);
        try {
            final int e = androidx.room.util.b.e(d2, "period_id");
            final int e2 = androidx.room.util.b.e(d2, "absence_reason_id");
            final int e3 = androidx.room.util.b.e(d2, "booking");
            final int e4 = androidx.room.util.b.e(d2, "color");
            final int e5 = androidx.room.util.b.e(d2, "end");
            final int e6 = androidx.room.util.b.e(d2, "exam");
            final int e7 = androidx.room.util.b.e(d2, "klassen");
            final int e8 = androidx.room.util.b.e(d2, "lesson");
            final int e9 = androidx.room.util.b.e(d2, "student_group");
            final int e10 = androidx.room.util.b.e(d2, "messenger_channel");
            final int e11 = androidx.room.util.b.e(d2, "notes_all");
            final int e12 = androidx.room.util.b.e(d2, "notes_all_files");
            final int e13 = androidx.room.util.b.e(d2, "notes_staff");
            try {
                final int e14 = androidx.room.util.b.e(d2, "notes_staff_files");
                final int e15 = androidx.room.util.b.e(d2, "original_period");
                final int e16 = androidx.room.util.b.e(d2, "resources");
                final int e17 = androidx.room.util.b.e(d2, "rooms");
                final int e18 = androidx.room.util.b.e(d2, "start");
                final int e19 = androidx.room.util.b.e(d2, "status");
                final int e20 = androidx.room.util.b.e(d2, "students");
                final int e21 = androidx.room.util.b.e(d2, "type_sub");
                final int e22 = androidx.room.util.b.e(d2, "subject");
                final int e23 = androidx.room.util.b.e(d2, "substitution_text");
                final int e24 = androidx.room.util.b.e(d2, "teachers");
                final int e25 = androidx.room.util.b.e(d2, "teaching_content");
                final int e26 = androidx.room.util.b.e(d2, "teaching_content_files");
                final int e27 = androidx.room.util.b.e(d2, "type");
                final int e28 = androidx.room.util.b.e(d2, "permissions");
                final int e29 = androidx.room.util.b.e(d2, "block_periods");
                final int e30 = androidx.room.util.b.e(d2, "video_call");
                final int e31 = androidx.room.util.b.e(d2, "lesson_info");
                final ArrayList list = new ArrayList<CalendarPeriod>(d2.getCount());
                while (d2.moveToNext()) {
                    final long long1 = d2.getLong(e);
                    Long value;
                    if (d2.isNull(e2)) {
                        value = null;
                    }
                    else {
                        value = d2.getLong(e2);
                    }
                    String string;
                    if (d2.isNull(e3)) {
                        string = null;
                    }
                    else {
                        string = d2.getString(e3);
                    }
                    final CalendarBooking z = this.c.z(string);
                    Integer value2;
                    if (d2.isNull(e4)) {
                        value2 = null;
                    }
                    else {
                        value2 = d2.getInt(e4);
                    }
                    Long value3;
                    if (d2.isNull(e5)) {
                        value3 = null;
                    }
                    else {
                        value3 = d2.getLong(e5);
                    }
                    final org.joda.time.c p = this.c.P(value3);
                    String string2;
                    if (d2.isNull(e6)) {
                        string2 = null;
                    }
                    else {
                        string2 = d2.getString(e6);
                    }
                    final CalendarPeriodExam a = this.c.A(string2);
                    String string3;
                    if (d2.isNull(e7)) {
                        string3 = null;
                    }
                    else {
                        string3 = d2.getString(e7);
                    }
                    final List<CalendarPeriodKlasse> b = this.c.B(string3);
                    String string4;
                    if (d2.isNull(e8)) {
                        string4 = null;
                    }
                    else {
                        string4 = d2.getString(e8);
                    }
                    final CalendarPeriodLesson c = this.c.C(string4);
                    String string5;
                    if (d2.isNull(e9)) {
                        string5 = null;
                    }
                    else {
                        string5 = d2.getString(e9);
                    }
                    final CalendarPeriodLesson c2 = this.c.C(string5);
                    String string6;
                    if (d2.isNull(e10)) {
                        string6 = null;
                    }
                    else {
                        string6 = d2.getString(e10);
                    }
                    final CalendarMessengerChannel w = this.c.w(string6);
                    String string7;
                    if (d2.isNull(e11)) {
                        string7 = null;
                    }
                    else {
                        string7 = d2.getString(e11);
                    }
                    String string8;
                    if (d2.isNull(e12)) {
                        string8 = null;
                    }
                    else {
                        string8 = d2.getString(e12);
                    }
                    final List<CalendarPeriodAttachment> y = this.c.y(string8);
                    String string9;
                    if (d2.isNull(e13)) {
                        string9 = null;
                    }
                    else {
                        string9 = d2.getString(e13);
                    }
                    String string10;
                    if (d2.isNull(e14)) {
                        string10 = null;
                    }
                    else {
                        string10 = d2.getString(e14);
                    }
                    final List<CalendarPeriodAttachment> y2 = this.c.y(string10);
                    String string11;
                    if (d2.isNull(e15)) {
                        string11 = null;
                    }
                    else {
                        string11 = d2.getString(e15);
                    }
                    final CalendarOriginalPeriod x = this.c.x(string11);
                    String string12;
                    if (d2.isNull(e16)) {
                        string12 = null;
                    }
                    else {
                        string12 = d2.getString(e16);
                    }
                    final List<CalendarPeriodResource> e32 = this.c.E(string12);
                    String string13;
                    if (d2.isNull(e17)) {
                        string13 = null;
                    }
                    else {
                        string13 = d2.getString(e17);
                    }
                    final List<CalendarPeriodRoom> f = this.c.F(string13);
                    Long value4;
                    if (d2.isNull(e18)) {
                        value4 = null;
                    }
                    else {
                        value4 = d2.getLong(e18);
                    }
                    final org.joda.time.c p2 = this.c.P(value4);
                    String string14;
                    if (d2.isNull(e19)) {
                        string14 = null;
                    }
                    else {
                        string14 = d2.getString(e19);
                    }
                    final CalendarPeriodStatus n = this.c.N(string14);
                    String string15;
                    if (d2.isNull(e20)) {
                        string15 = null;
                    }
                    else {
                        string15 = d2.getString(e20);
                    }
                    final List<CalendarPeriodStudent> h = this.c.H(string15);
                    String string16;
                    if (d2.isNull(e21)) {
                        string16 = null;
                    }
                    else {
                        string16 = d2.getString(e21);
                    }
                    final CalendarPeriodSubType i = this.c.I(string16);
                    String string17;
                    if (d2.isNull(e22)) {
                        string17 = null;
                    }
                    else {
                        string17 = d2.getString(e22);
                    }
                    final CalendarPeriodSubject j = this.c.J(string17);
                    String string18;
                    if (d2.isNull(e23)) {
                        string18 = null;
                    }
                    else {
                        string18 = d2.getString(e23);
                    }
                    String string19;
                    if (d2.isNull(e24)) {
                        string19 = null;
                    }
                    else {
                        string19 = d2.getString(e24);
                    }
                    final List<CalendarPeriodTeacher> k = this.c.K(string19);
                    String string20;
                    if (d2.isNull(e25)) {
                        string20 = null;
                    }
                    else {
                        string20 = d2.getString(e25);
                    }
                    String string21;
                    if (d2.isNull(e26)) {
                        string21 = null;
                    }
                    else {
                        string21 = d2.getString(e26);
                    }
                    final List<CalendarPeriodAttachment> y3 = this.c.y(string21);
                    String string22;
                    if (d2.isNull(e27)) {
                        string22 = null;
                    }
                    else {
                        string22 = d2.getString(e27);
                    }
                    final CalendarPeriodType o = this.c.O(string22);
                    String string23;
                    if (d2.isNull(e28)) {
                        string23 = null;
                    }
                    else {
                        string23 = d2.getString(e28);
                    }
                    final List<CalendarPeriodPermission> d3 = this.c.D(string23);
                    String string24;
                    if (d2.isNull(e29)) {
                        string24 = null;
                    }
                    else {
                        string24 = d2.getString(e29);
                    }
                    final List<CalendarBlockPeriod> v = this.c.v(string24);
                    String string25;
                    if (d2.isNull(e30)) {
                        string25 = null;
                    }
                    else {
                        string25 = d2.getString(e30);
                    }
                    final CalendarPeriodVideoCall l = this.c.L(string25);
                    String string26;
                    if (d2.isNull(e31)) {
                        string26 = null;
                    }
                    else {
                        string26 = d2.getString(e31);
                    }
                    list.add(new CalendarPeriod(long1, value, z, value2, p, a, b, c, c2, w, string7, y, string9, y2, x, e32, f, p2, n, h, i, j, string18, k, string20, y3, o, d3, v, l, string26));
                }
                d2.close();
                d.release();
                return (List<CalendarPeriod>)list;
            }
            finally {}
        }
        finally {}
        d2.close();
        d.release();
    }
    
    @Override
    public void b(final org.joda.time.c c) {
        this.a.d();
        final h acquire = this.d.acquire();
        final Long t = this.c.t(c);
        if (t == null) {
            ((e)acquire).c4(1);
        }
        else {
            ((e)acquire).l2(1, (long)t);
        }
        this.a.e();
        try {
            acquire.c1();
            this.a.I();
        }
        finally {
            this.a.k();
            this.d.release(acquire);
        }
    }
    
    @Override
    public void c(final List<CalendarPeriod> list) {
        this.a.d();
        this.a.e();
        try {
            this.b.insert((Iterable)list);
            this.a.I();
        }
        finally {
            this.a.k();
        }
    }
    
    @Override
    public List<CalendarPeriod> d(final List<Long> list) {
        final StringBuilder c = g.c();
        c.append("SELECT * FROM calendar_period WHERE period_id IN (");
        final int size = list.size();
        g.a(c, size);
        c.append(")");
        final v2 d = v2.d(c.toString(), size + 0);
        final Iterator<Long> iterator = list.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final Long n2 = iterator.next();
            if (n2 == null) {
                d.c4(n);
            }
            else {
                d.l2(n, (long)n2);
            }
            ++n;
        }
        this.a.d();
        final Cursor d2 = androidx.room.util.c.d(this.a, (f)d, false, (CancellationSignal)null);
        try {
            final int e = androidx.room.util.b.e(d2, "period_id");
            final int e2 = androidx.room.util.b.e(d2, "absence_reason_id");
            final int e3 = androidx.room.util.b.e(d2, "booking");
            final int e4 = androidx.room.util.b.e(d2, "color");
            final int e5 = androidx.room.util.b.e(d2, "end");
            final int e6 = androidx.room.util.b.e(d2, "exam");
            final int e7 = androidx.room.util.b.e(d2, "klassen");
            final int e8 = androidx.room.util.b.e(d2, "lesson");
            final int e9 = androidx.room.util.b.e(d2, "student_group");
            final int e10 = androidx.room.util.b.e(d2, "messenger_channel");
            final int e11 = androidx.room.util.b.e(d2, "notes_all");
            final int e12 = androidx.room.util.b.e(d2, "notes_all_files");
            final int e13 = androidx.room.util.b.e(d2, "notes_staff");
            try {
                final int e14 = androidx.room.util.b.e(d2, "notes_staff_files");
                final int e15 = androidx.room.util.b.e(d2, "original_period");
                final int e16 = androidx.room.util.b.e(d2, "resources");
                final int e17 = androidx.room.util.b.e(d2, "rooms");
                final int e18 = androidx.room.util.b.e(d2, "start");
                final int e19 = androidx.room.util.b.e(d2, "status");
                final int e20 = androidx.room.util.b.e(d2, "students");
                final int e21 = androidx.room.util.b.e(d2, "type_sub");
                final int e22 = androidx.room.util.b.e(d2, "subject");
                final int e23 = androidx.room.util.b.e(d2, "substitution_text");
                final int e24 = androidx.room.util.b.e(d2, "teachers");
                final int e25 = androidx.room.util.b.e(d2, "teaching_content");
                final int e26 = androidx.room.util.b.e(d2, "teaching_content_files");
                final int e27 = androidx.room.util.b.e(d2, "type");
                final int e28 = androidx.room.util.b.e(d2, "permissions");
                final int e29 = androidx.room.util.b.e(d2, "block_periods");
                final int e30 = androidx.room.util.b.e(d2, "video_call");
                final int e31 = androidx.room.util.b.e(d2, "lesson_info");
                final ArrayList list2 = new ArrayList<CalendarPeriod>(d2.getCount());
                while (d2.moveToNext()) {
                    final long long1 = d2.getLong(e);
                    Long value;
                    if (d2.isNull(e2)) {
                        value = null;
                    }
                    else {
                        value = d2.getLong(e2);
                    }
                    String string;
                    if (d2.isNull(e3)) {
                        string = null;
                    }
                    else {
                        string = d2.getString(e3);
                    }
                    final CalendarBooking z = this.c.z(string);
                    Integer value2;
                    if (d2.isNull(e4)) {
                        value2 = null;
                    }
                    else {
                        value2 = d2.getInt(e4);
                    }
                    Long value3;
                    if (d2.isNull(e5)) {
                        value3 = null;
                    }
                    else {
                        value3 = d2.getLong(e5);
                    }
                    final org.joda.time.c p = this.c.P(value3);
                    String string2;
                    if (d2.isNull(e6)) {
                        string2 = null;
                    }
                    else {
                        string2 = d2.getString(e6);
                    }
                    final CalendarPeriodExam a = this.c.A(string2);
                    String string3;
                    if (d2.isNull(e7)) {
                        string3 = null;
                    }
                    else {
                        string3 = d2.getString(e7);
                    }
                    final List<CalendarPeriodKlasse> b = this.c.B(string3);
                    String string4;
                    if (d2.isNull(e8)) {
                        string4 = null;
                    }
                    else {
                        string4 = d2.getString(e8);
                    }
                    final CalendarPeriodLesson c2 = this.c.C(string4);
                    String string5;
                    if (d2.isNull(e9)) {
                        string5 = null;
                    }
                    else {
                        string5 = d2.getString(e9);
                    }
                    final CalendarPeriodLesson c3 = this.c.C(string5);
                    String string6;
                    if (d2.isNull(e10)) {
                        string6 = null;
                    }
                    else {
                        string6 = d2.getString(e10);
                    }
                    final CalendarMessengerChannel w = this.c.w(string6);
                    String string7;
                    if (d2.isNull(e11)) {
                        string7 = null;
                    }
                    else {
                        string7 = d2.getString(e11);
                    }
                    String string8;
                    if (d2.isNull(e12)) {
                        string8 = null;
                    }
                    else {
                        string8 = d2.getString(e12);
                    }
                    final List<CalendarPeriodAttachment> y = this.c.y(string8);
                    String string9;
                    if (d2.isNull(e13)) {
                        string9 = null;
                    }
                    else {
                        string9 = d2.getString(e13);
                    }
                    String string10;
                    if (d2.isNull(e14)) {
                        string10 = null;
                    }
                    else {
                        string10 = d2.getString(e14);
                    }
                    final List<CalendarPeriodAttachment> y2 = this.c.y(string10);
                    String string11;
                    if (d2.isNull(e15)) {
                        string11 = null;
                    }
                    else {
                        string11 = d2.getString(e15);
                    }
                    final CalendarOriginalPeriod x = this.c.x(string11);
                    String string12;
                    if (d2.isNull(e16)) {
                        string12 = null;
                    }
                    else {
                        string12 = d2.getString(e16);
                    }
                    final List<CalendarPeriodResource> e32 = this.c.E(string12);
                    String string13;
                    if (d2.isNull(e17)) {
                        string13 = null;
                    }
                    else {
                        string13 = d2.getString(e17);
                    }
                    final List<CalendarPeriodRoom> f = this.c.F(string13);
                    Long value4;
                    if (d2.isNull(e18)) {
                        value4 = null;
                    }
                    else {
                        value4 = d2.getLong(e18);
                    }
                    final org.joda.time.c p2 = this.c.P(value4);
                    String string14;
                    if (d2.isNull(e19)) {
                        string14 = null;
                    }
                    else {
                        string14 = d2.getString(e19);
                    }
                    final CalendarPeriodStatus n3 = this.c.N(string14);
                    String string15;
                    if (d2.isNull(e20)) {
                        string15 = null;
                    }
                    else {
                        string15 = d2.getString(e20);
                    }
                    final List<CalendarPeriodStudent> h = this.c.H(string15);
                    String string16;
                    if (d2.isNull(e21)) {
                        string16 = null;
                    }
                    else {
                        string16 = d2.getString(e21);
                    }
                    final CalendarPeriodSubType i = this.c.I(string16);
                    String string17;
                    if (d2.isNull(e22)) {
                        string17 = null;
                    }
                    else {
                        string17 = d2.getString(e22);
                    }
                    final CalendarPeriodSubject j = this.c.J(string17);
                    String string18;
                    if (d2.isNull(e23)) {
                        string18 = null;
                    }
                    else {
                        string18 = d2.getString(e23);
                    }
                    String string19;
                    if (d2.isNull(e24)) {
                        string19 = null;
                    }
                    else {
                        string19 = d2.getString(e24);
                    }
                    final List<CalendarPeriodTeacher> k = this.c.K(string19);
                    String string20;
                    if (d2.isNull(e25)) {
                        string20 = null;
                    }
                    else {
                        string20 = d2.getString(e25);
                    }
                    String string21;
                    if (d2.isNull(e26)) {
                        string21 = null;
                    }
                    else {
                        string21 = d2.getString(e26);
                    }
                    final List<CalendarPeriodAttachment> y3 = this.c.y(string21);
                    String string22;
                    if (d2.isNull(e27)) {
                        string22 = null;
                    }
                    else {
                        string22 = d2.getString(e27);
                    }
                    final CalendarPeriodType o = this.c.O(string22);
                    String string23;
                    if (d2.isNull(e28)) {
                        string23 = null;
                    }
                    else {
                        string23 = d2.getString(e28);
                    }
                    final List<CalendarPeriodPermission> d3 = this.c.D(string23);
                    String string24;
                    if (d2.isNull(e29)) {
                        string24 = null;
                    }
                    else {
                        string24 = d2.getString(e29);
                    }
                    final List<CalendarBlockPeriod> v = this.c.v(string24);
                    String string25;
                    if (d2.isNull(e30)) {
                        string25 = null;
                    }
                    else {
                        string25 = d2.getString(e30);
                    }
                    final CalendarPeriodVideoCall l = this.c.L(string25);
                    String string26;
                    if (d2.isNull(e31)) {
                        string26 = null;
                    }
                    else {
                        string26 = d2.getString(e31);
                    }
                    list2.add(new CalendarPeriod(long1, value, z, value2, p, a, b, c2, c3, w, string7, y, string9, y2, x, e32, f, p2, n3, h, i, j, string18, k, string20, y3, o, d3, v, l, string26));
                }
                d2.close();
                d.release();
                return (List<CalendarPeriod>)list2;
            }
            finally {}
        }
        finally {}
        d2.close();
        d.release();
    }
    
    @Override
    public CalendarPeriod e(long long1) {
        final v2 d = v2.d("SELECT * FROM calendar_period WHERE period_id = ?", 1);
        d.l2(1, long1);
        this.a.d();
        final Cursor d2 = androidx.room.util.c.d(this.a, (f)d, false, (CancellationSignal)null);
        try {
            final int e = androidx.room.util.b.e(d2, "period_id");
            final int e2 = androidx.room.util.b.e(d2, "absence_reason_id");
            final int e3 = androidx.room.util.b.e(d2, "booking");
            final int e4 = androidx.room.util.b.e(d2, "color");
            final int e5 = androidx.room.util.b.e(d2, "end");
            final int e6 = androidx.room.util.b.e(d2, "exam");
            final int e7 = androidx.room.util.b.e(d2, "klassen");
            final int e8 = androidx.room.util.b.e(d2, "lesson");
            final int e9 = androidx.room.util.b.e(d2, "student_group");
            final int e10 = androidx.room.util.b.e(d2, "messenger_channel");
            final int e11 = androidx.room.util.b.e(d2, "notes_all");
            final int e12 = androidx.room.util.b.e(d2, "notes_all_files");
            final int e13 = androidx.room.util.b.e(d2, "notes_staff");
            try {
                final int e14 = androidx.room.util.b.e(d2, "notes_staff_files");
                final int e15 = androidx.room.util.b.e(d2, "original_period");
                final int e16 = androidx.room.util.b.e(d2, "resources");
                final int e17 = androidx.room.util.b.e(d2, "rooms");
                final int e18 = androidx.room.util.b.e(d2, "start");
                final int e19 = androidx.room.util.b.e(d2, "status");
                final int e20 = androidx.room.util.b.e(d2, "students");
                final int e21 = androidx.room.util.b.e(d2, "type_sub");
                final int e22 = androidx.room.util.b.e(d2, "subject");
                final int e23 = androidx.room.util.b.e(d2, "substitution_text");
                final int e24 = androidx.room.util.b.e(d2, "teachers");
                final int e25 = androidx.room.util.b.e(d2, "teaching_content");
                final int e26 = androidx.room.util.b.e(d2, "teaching_content_files");
                final int e27 = androidx.room.util.b.e(d2, "type");
                final int e28 = androidx.room.util.b.e(d2, "permissions");
                final int e29 = androidx.room.util.b.e(d2, "block_periods");
                final int e30 = androidx.room.util.b.e(d2, "video_call");
                final int e31 = androidx.room.util.b.e(d2, "lesson_info");
                CalendarPeriod calendarPeriod;
                if (d2.moveToFirst()) {
                    long1 = d2.getLong(e);
                    Long value;
                    if (d2.isNull(e2)) {
                        value = null;
                    }
                    else {
                        value = d2.getLong(e2);
                    }
                    String string;
                    if (d2.isNull(e3)) {
                        string = null;
                    }
                    else {
                        string = d2.getString(e3);
                    }
                    final CalendarBooking z = this.c.z(string);
                    Integer value2;
                    if (d2.isNull(e4)) {
                        value2 = null;
                    }
                    else {
                        value2 = d2.getInt(e4);
                    }
                    Long value3;
                    if (d2.isNull(e5)) {
                        value3 = null;
                    }
                    else {
                        value3 = d2.getLong(e5);
                    }
                    final org.joda.time.c p = this.c.P(value3);
                    String string2;
                    if (d2.isNull(e6)) {
                        string2 = null;
                    }
                    else {
                        string2 = d2.getString(e6);
                    }
                    final CalendarPeriodExam a = this.c.A(string2);
                    String string3;
                    if (d2.isNull(e7)) {
                        string3 = null;
                    }
                    else {
                        string3 = d2.getString(e7);
                    }
                    final List<CalendarPeriodKlasse> b = this.c.B(string3);
                    String string4;
                    if (d2.isNull(e8)) {
                        string4 = null;
                    }
                    else {
                        string4 = d2.getString(e8);
                    }
                    final CalendarPeriodLesson c = this.c.C(string4);
                    String string5;
                    if (d2.isNull(e9)) {
                        string5 = null;
                    }
                    else {
                        string5 = d2.getString(e9);
                    }
                    final CalendarPeriodLesson c2 = this.c.C(string5);
                    String string6;
                    if (d2.isNull(e10)) {
                        string6 = null;
                    }
                    else {
                        string6 = d2.getString(e10);
                    }
                    final CalendarMessengerChannel w = this.c.w(string6);
                    String string7;
                    if (d2.isNull(e11)) {
                        string7 = null;
                    }
                    else {
                        string7 = d2.getString(e11);
                    }
                    String string8;
                    if (d2.isNull(e12)) {
                        string8 = null;
                    }
                    else {
                        string8 = d2.getString(e12);
                    }
                    final List<CalendarPeriodAttachment> y = this.c.y(string8);
                    String string9;
                    if (d2.isNull(e13)) {
                        string9 = null;
                    }
                    else {
                        string9 = d2.getString(e13);
                    }
                    String string10;
                    if (d2.isNull(e14)) {
                        string10 = null;
                    }
                    else {
                        string10 = d2.getString(e14);
                    }
                    final List<CalendarPeriodAttachment> y2 = this.c.y(string10);
                    String string11;
                    if (d2.isNull(e15)) {
                        string11 = null;
                    }
                    else {
                        string11 = d2.getString(e15);
                    }
                    final CalendarOriginalPeriod x = this.c.x(string11);
                    String string12;
                    if (d2.isNull(e16)) {
                        string12 = null;
                    }
                    else {
                        string12 = d2.getString(e16);
                    }
                    final List<CalendarPeriodResource> e32 = this.c.E(string12);
                    String string13;
                    if (d2.isNull(e17)) {
                        string13 = null;
                    }
                    else {
                        string13 = d2.getString(e17);
                    }
                    final List<CalendarPeriodRoom> f = this.c.F(string13);
                    Long value4;
                    if (d2.isNull(e18)) {
                        value4 = null;
                    }
                    else {
                        value4 = d2.getLong(e18);
                    }
                    final org.joda.time.c p2 = this.c.P(value4);
                    String string14;
                    if (d2.isNull(e19)) {
                        string14 = null;
                    }
                    else {
                        string14 = d2.getString(e19);
                    }
                    final CalendarPeriodStatus n = this.c.N(string14);
                    String string15;
                    if (d2.isNull(e20)) {
                        string15 = null;
                    }
                    else {
                        string15 = d2.getString(e20);
                    }
                    final List<CalendarPeriodStudent> h = this.c.H(string15);
                    String string16;
                    if (d2.isNull(e21)) {
                        string16 = null;
                    }
                    else {
                        string16 = d2.getString(e21);
                    }
                    final CalendarPeriodSubType i = this.c.I(string16);
                    String string17;
                    if (d2.isNull(e22)) {
                        string17 = null;
                    }
                    else {
                        string17 = d2.getString(e22);
                    }
                    final CalendarPeriodSubject j = this.c.J(string17);
                    String string18;
                    if (d2.isNull(e23)) {
                        string18 = null;
                    }
                    else {
                        string18 = d2.getString(e23);
                    }
                    String string19;
                    if (d2.isNull(e24)) {
                        string19 = null;
                    }
                    else {
                        string19 = d2.getString(e24);
                    }
                    final List<CalendarPeriodTeacher> k = this.c.K(string19);
                    String string20;
                    if (d2.isNull(e25)) {
                        string20 = null;
                    }
                    else {
                        string20 = d2.getString(e25);
                    }
                    String string21;
                    if (d2.isNull(e26)) {
                        string21 = null;
                    }
                    else {
                        string21 = d2.getString(e26);
                    }
                    final List<CalendarPeriodAttachment> y3 = this.c.y(string21);
                    String string22;
                    if (d2.isNull(e27)) {
                        string22 = null;
                    }
                    else {
                        string22 = d2.getString(e27);
                    }
                    final CalendarPeriodType o = this.c.O(string22);
                    String string23;
                    if (d2.isNull(e28)) {
                        string23 = null;
                    }
                    else {
                        string23 = d2.getString(e28);
                    }
                    final List<CalendarPeriodPermission> d3 = this.c.D(string23);
                    String string24;
                    if (d2.isNull(e29)) {
                        string24 = null;
                    }
                    else {
                        string24 = d2.getString(e29);
                    }
                    final List<CalendarBlockPeriod> v = this.c.v(string24);
                    String string25;
                    if (d2.isNull(e30)) {
                        string25 = null;
                    }
                    else {
                        string25 = d2.getString(e30);
                    }
                    final CalendarPeriodVideoCall l = this.c.L(string25);
                    String string26;
                    if (d2.isNull(e31)) {
                        string26 = null;
                    }
                    else {
                        string26 = d2.getString(e31);
                    }
                    calendarPeriod = new CalendarPeriod(long1, value, z, value2, p, a, b, c, c2, w, string7, y, string9, y2, x, e32, f, p2, n, h, i, j, string18, k, string20, y3, o, d3, v, l, string26);
                }
                else {
                    calendarPeriod = null;
                }
                d2.close();
                d.release();
                return calendarPeriod;
            }
            finally {}
        }
        finally {}
        d2.close();
        d.release();
    }
    
    @Override
    public void f(final CalendarPeriod calendarPeriod) {
        this.a.d();
        this.a.e();
        try {
            this.b.insert((Object)calendarPeriod);
            this.a.I();
        }
        finally {
            this.a.k();
        }
    }
}
