// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.database;

import androidx.sqlite.db.d$a;
import androidx.room.u2;
import java.util.Set;
import java.util.HashSet;
import androidx.room.util.h$a;
import androidx.room.u2$b;
import androidx.room.r2$b;
import androidx.room.u2$a;
import androidx.sqlite.db.d$b;
import androidx.room.n0;
import java.util.Map;
import java.util.HashMap;
import androidx.room.h1;
import com.untis.mobile.dashboard.persistence.dao.l;
import com.untis.mobile.dashboard.persistence.dao.j;
import com.untis.mobile.dashboard.persistence.dao.h;
import com.untis.mobile.dashboard.persistence.dao.f;
import com.untis.mobile.dashboard.persistence.dao.d;
import androidx.room.r2;
import com.untis.mobile.dashboard.persistence.dao.b;
import java.util.List;
import com.untis.mobile.dashboard.persistence.dao.k;
import com.untis.mobile.dashboard.persistence.dao.i;
import com.untis.mobile.dashboard.persistence.dao.g;
import com.untis.mobile.dashboard.persistence.dao.e;
import com.untis.mobile.dashboard.persistence.dao.c;
import com.untis.mobile.dashboard.persistence.dao.a;

public final class DashboardDatabase_Impl extends DashboardDatabase
{
    private volatile com.untis.mobile.dashboard.persistence.dao.a q;
    private volatile c r;
    private volatile e s;
    private volatile g t;
    private volatile i u;
    private volatile k v;
    
    static /* synthetic */ void Y(final DashboardDatabase_Impl dashboardDatabase_Impl, final androidx.sqlite.db.c c) {
        dashboardDatabase_Impl.y(c);
    }
    
    @Override
    public com.untis.mobile.dashboard.persistence.dao.a K() {
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new b(this);
            }
            return this.q;
        }
    }
    
    @Override
    public c L() {
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new d(this);
            }
            return this.r;
        }
    }
    
    @Override
    public e M() {
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            if (this.s == null) {
                this.s = new f(this);
            }
            return this.s;
        }
    }
    
    @Override
    public g N() {
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            if (this.t == null) {
                this.t = new h(this);
            }
            return this.t;
        }
    }
    
    @Override
    public i O() {
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            if (this.u == null) {
                this.u = new j(this);
            }
            return this.u;
        }
    }
    
    @Override
    public k P() {
        if (this.v != null) {
            return this.v;
        }
        synchronized (this) {
            if (this.v == null) {
                this.v = new l(this);
            }
            return this.v;
        }
    }
    
    public void f() {
        super.c();
        final androidx.sqlite.db.c t2 = super.o().T2();
        try {
            super.e();
            t2.J0("DELETE FROM `dashboard_classbook_event`");
            t2.J0("DELETE FROM `dashboard_contact_hour`");
            t2.J0("DELETE FROM `dashboard_exam`");
            t2.J0("DELETE FROM `dashboard_homework`");
            t2.J0("DELETE FROM `dashboard_parent_day`");
            t2.J0("DELETE FROM `dashboard_student_absence`");
            super.I();
        }
        finally {
            super.k();
            t2.W2("PRAGMA wal_checkpoint(FULL)").close();
            if (!t2.x4()) {
                t2.J0("VACUUM");
            }
        }
    }
    
    protected h1 i() {
        return new h1((r2)this, (Map)new HashMap(0), (Map)new HashMap(0), new String[] { "dashboard_classbook_event", "dashboard_contact_hour", "dashboard_exam", "dashboard_homework", "dashboard_parent_day", "dashboard_student_absence" });
    }
    
    protected androidx.sqlite.db.d j(final n0 n0) {
        return n0.a.a(d$b.a(n0.b).c(n0.c).b((d$a)new u2(n0, (u2$a)new u2$a(2) {
            public void a(final androidx.sqlite.db.c c) {
                c.J0("CREATE TABLE IF NOT EXISTS `dashboard_classbook_event` (`event_id` INTEGER NOT NULL, `entity_type` INTEGER NOT NULL, `entity_Id` INTEGER NOT NULL, `date_time` TEXT NOT NULL, `text` TEXT NOT NULL, `reason_id` INTEGER NOT NULL, `klassen_id` INTEGER, PRIMARY KEY(`event_id`))");
                c.J0("CREATE TABLE IF NOT EXISTS `dashboard_contact_hour` (`contact_hour_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `contact_hour_wu_id` INTEGER NOT NULL, `start` TEXT, `end` TEXT, `teacher_id` INTEGER NOT NULL, `email` TEXT DEFAULT '', `phone` TEXT DEFAULT '', `display_rooms` TEXT NOT NULL DEFAULT '', `display_teacher` TEXT NOT NULL DEFAULT '', `registration_possible` INTEGER NOT NULL, `registered` INTEGER NOT NULL, `text_user` TEXT, `text_teacher` TEXT, `slots` TEXT)");
                c.J0("CREATE TABLE IF NOT EXISTS `dashboard_exam` (`exam_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `exam_wu_id` INTEGER NOT NULL, `exam_type` TEXT NOT NULL, `start` TEXT NOT NULL, `end` TEXT NOT NULL, `department_id` INTEGER NOT NULL, `subject_id` INTEGER NOT NULL, `klassen_ids` TEXT NOT NULL, `room_ids` TEXT NOT NULL, `teacher_ids` TEXT NOT NULL, `invigilators` TEXT NOT NULL, `name` TEXT NOT NULL, `text` TEXT NOT NULL, `entity_type` INTEGER, `entity_id` INTEGER)");
                c.J0("CREATE TABLE IF NOT EXISTS `dashboard_homework` (`homework_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `homework_wu_id` INTEGER NOT NULL, `lesson_id` INTEGER NOT NULL, `start` TEXT NOT NULL, `end` TEXT NOT NULL, `text` TEXT NOT NULL, `remark` TEXT, `completed` INTEGER NOT NULL, `attachments` TEXT NOT NULL, `entity_type` INTEGER, `entity_id` INTEGER, `subject_id` INTEGER)");
                c.J0("CREATE TABLE IF NOT EXISTS `dashboard_parent_day` (`parent_day_id` INTEGER NOT NULL, `name` TEXT NOT NULL, `start` TEXT NOT NULL, `end` TEXT NOT NULL, `appointments` TEXT, PRIMARY KEY(`parent_day_id`))");
                c.J0("CREATE TABLE IF NOT EXISTS `dashboard_student_absence` (`absence_id` INTEGER NOT NULL, `student_id` INTEGER NOT NULL, `klassen_id` INTEGER NOT NULL, `start` TEXT NOT NULL, `end` TEXT NOT NULL, `owner` INTEGER NOT NULL, `excused` INTEGER NOT NULL, `excuse` TEXT, `reason_id` INTEGER NOT NULL, `reason_title` TEXT, `text` TEXT, PRIMARY KEY(`absence_id`))");
                c.J0("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c.J0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '64c872067a2fce3366d07dfe1f42db30')");
            }
            
            public void b(final androidx.sqlite.db.c c) {
                c.J0("DROP TABLE IF EXISTS `dashboard_classbook_event`");
                c.J0("DROP TABLE IF EXISTS `dashboard_contact_hour`");
                c.J0("DROP TABLE IF EXISTS `dashboard_exam`");
                c.J0("DROP TABLE IF EXISTS `dashboard_homework`");
                c.J0("DROP TABLE IF EXISTS `dashboard_parent_day`");
                c.J0("DROP TABLE IF EXISTS `dashboard_student_absence`");
                if (DashboardDatabase_Impl.this.h != null) {
                    for (int i = 0; i < DashboardDatabase_Impl.this.h.size(); ++i) {
                        ((r2$b)DashboardDatabase_Impl.this.h.get(i)).b(c);
                    }
                }
            }
            
            protected void c(final androidx.sqlite.db.c c) {
                if (DashboardDatabase_Impl.this.h != null) {
                    for (int i = 0; i < DashboardDatabase_Impl.this.h.size(); ++i) {
                        ((r2$b)DashboardDatabase_Impl.this.h.get(i)).a(c);
                    }
                }
            }
            
            public void d(final androidx.sqlite.db.c c) {
                DashboardDatabase_Impl.this.a = c;
                DashboardDatabase_Impl.Y(DashboardDatabase_Impl.this, c);
                if (DashboardDatabase_Impl.this.h != null) {
                    for (int i = 0; i < DashboardDatabase_Impl.this.h.size(); ++i) {
                        ((r2$b)DashboardDatabase_Impl.this.h.get(i)).c(c);
                    }
                }
            }
            
            public void e(final androidx.sqlite.db.c c) {
            }
            
            public void f(final androidx.sqlite.db.c c) {
                androidx.room.util.c.b(c);
            }
            
            protected u2$b g(final androidx.sqlite.db.c c) {
                final HashMap<String, h$a> hashMap = new HashMap<String, h$a>(7);
                hashMap.put("event_id", new h$a("event_id", "INTEGER", true, 1, (String)null, 1));
                hashMap.put("entity_type", new h$a("entity_type", "INTEGER", true, 0, (String)null, 1));
                hashMap.put("entity_Id", new h$a("entity_Id", "INTEGER", true, 0, (String)null, 1));
                hashMap.put("date_time", new h$a("date_time", "TEXT", true, 0, (String)null, 1));
                hashMap.put("text", new h$a("text", "TEXT", true, 0, (String)null, 1));
                hashMap.put("reason_id", new h$a("reason_id", "INTEGER", true, 0, (String)null, 1));
                hashMap.put("klassen_id", new h$a("klassen_id", "INTEGER", false, 0, (String)null, 1));
                final androidx.room.util.h obj = new androidx.room.util.h("dashboard_classbook_event", (Map)hashMap, (Set)new HashSet(0), (Set)new HashSet(0));
                final androidx.room.util.h a = androidx.room.util.h.a(c, "dashboard_classbook_event");
                if (!obj.equals((Object)a)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("dashboard_classbook_event(com.untis.mobile.dashboard.persistence.model.classlead.DashboardClassbookEvent).\n Expected:\n");
                    sb.append(obj);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    return new u2$b(false, sb.toString());
                }
                final HashMap<String, h$a> hashMap2 = new HashMap<String, h$a>(14);
                hashMap2.put("contact_hour_id", new h$a("contact_hour_id", "INTEGER", true, 1, (String)null, 1));
                hashMap2.put("contact_hour_wu_id", new h$a("contact_hour_wu_id", "INTEGER", true, 0, (String)null, 1));
                hashMap2.put("start", new h$a("start", "TEXT", false, 0, (String)null, 1));
                hashMap2.put("end", new h$a("end", "TEXT", false, 0, (String)null, 1));
                hashMap2.put("teacher_id", new h$a("teacher_id", "INTEGER", true, 0, (String)null, 1));
                hashMap2.put("email", new h$a("email", "TEXT", false, 0, "''", 1));
                hashMap2.put("phone", new h$a("phone", "TEXT", false, 0, "''", 1));
                hashMap2.put("display_rooms", new h$a("display_rooms", "TEXT", true, 0, "''", 1));
                hashMap2.put("display_teacher", new h$a("display_teacher", "TEXT", true, 0, "''", 1));
                hashMap2.put("registration_possible", new h$a("registration_possible", "INTEGER", true, 0, (String)null, 1));
                hashMap2.put("registered", new h$a("registered", "INTEGER", true, 0, (String)null, 1));
                hashMap2.put("text_user", new h$a("text_user", "TEXT", false, 0, (String)null, 1));
                hashMap2.put("text_teacher", new h$a("text_teacher", "TEXT", false, 0, (String)null, 1));
                hashMap2.put("slots", new h$a("slots", "TEXT", false, 0, (String)null, 1));
                final androidx.room.util.h obj2 = new androidx.room.util.h("dashboard_contact_hour", (Map)hashMap2, (Set)new HashSet(0), (Set)new HashSet(0));
                final androidx.room.util.h a2 = androidx.room.util.h.a(c, "dashboard_contact_hour");
                if (!obj2.equals((Object)a2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("dashboard_contact_hour(com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHour).\n Expected:\n");
                    sb2.append(obj2);
                    sb2.append("\n Found:\n");
                    sb2.append(a2);
                    return new u2$b(false, sb2.toString());
                }
                final HashMap<String, h$a> hashMap3 = new HashMap<String, h$a>(15);
                hashMap3.put("exam_id", new h$a("exam_id", "INTEGER", true, 1, (String)null, 1));
                hashMap3.put("exam_wu_id", new h$a("exam_wu_id", "INTEGER", true, 0, (String)null, 1));
                hashMap3.put("exam_type", new h$a("exam_type", "TEXT", true, 0, (String)null, 1));
                hashMap3.put("start", new h$a("start", "TEXT", true, 0, (String)null, 1));
                hashMap3.put("end", new h$a("end", "TEXT", true, 0, (String)null, 1));
                hashMap3.put("department_id", new h$a("department_id", "INTEGER", true, 0, (String)null, 1));
                hashMap3.put("subject_id", new h$a("subject_id", "INTEGER", true, 0, (String)null, 1));
                hashMap3.put("klassen_ids", new h$a("klassen_ids", "TEXT", true, 0, (String)null, 1));
                hashMap3.put("room_ids", new h$a("room_ids", "TEXT", true, 0, (String)null, 1));
                hashMap3.put("teacher_ids", new h$a("teacher_ids", "TEXT", true, 0, (String)null, 1));
                hashMap3.put("invigilators", new h$a("invigilators", "TEXT", true, 0, (String)null, 1));
                hashMap3.put("name", new h$a("name", "TEXT", true, 0, (String)null, 1));
                hashMap3.put("text", new h$a("text", "TEXT", true, 0, (String)null, 1));
                hashMap3.put("entity_type", new h$a("entity_type", "INTEGER", false, 0, (String)null, 1));
                hashMap3.put("entity_id", new h$a("entity_id", "INTEGER", false, 0, (String)null, 1));
                final androidx.room.util.h obj3 = new androidx.room.util.h("dashboard_exam", (Map)hashMap3, (Set)new HashSet(0), (Set)new HashSet(0));
                final androidx.room.util.h a3 = androidx.room.util.h.a(c, "dashboard_exam");
                if (!obj3.equals((Object)a3)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("dashboard_exam(com.untis.mobile.dashboard.persistence.model.event.exam.DashboardExam).\n Expected:\n");
                    sb3.append(obj3);
                    sb3.append("\n Found:\n");
                    sb3.append(a3);
                    return new u2$b(false, sb3.toString());
                }
                final HashMap<String, h$a> hashMap4 = new HashMap<String, h$a>(12);
                hashMap4.put("homework_id", new h$a("homework_id", "INTEGER", true, 1, (String)null, 1));
                hashMap4.put("homework_wu_id", new h$a("homework_wu_id", "INTEGER", true, 0, (String)null, 1));
                hashMap4.put("lesson_id", new h$a("lesson_id", "INTEGER", true, 0, (String)null, 1));
                hashMap4.put("start", new h$a("start", "TEXT", true, 0, (String)null, 1));
                hashMap4.put("end", new h$a("end", "TEXT", true, 0, (String)null, 1));
                hashMap4.put("text", new h$a("text", "TEXT", true, 0, (String)null, 1));
                hashMap4.put("remark", new h$a("remark", "TEXT", false, 0, (String)null, 1));
                hashMap4.put("completed", new h$a("completed", "INTEGER", true, 0, (String)null, 1));
                hashMap4.put("attachments", new h$a("attachments", "TEXT", true, 0, (String)null, 1));
                hashMap4.put("entity_type", new h$a("entity_type", "INTEGER", false, 0, (String)null, 1));
                hashMap4.put("entity_id", new h$a("entity_id", "INTEGER", false, 0, (String)null, 1));
                hashMap4.put("subject_id", new h$a("subject_id", "INTEGER", false, 0, (String)null, 1));
                final androidx.room.util.h obj4 = new androidx.room.util.h("dashboard_homework", (Map)hashMap4, (Set)new HashSet(0), (Set)new HashSet(0));
                final androidx.room.util.h a4 = androidx.room.util.h.a(c, "dashboard_homework");
                if (!obj4.equals((Object)a4)) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("dashboard_homework(com.untis.mobile.dashboard.persistence.model.event.homework.DashboardHomework).\n Expected:\n");
                    sb4.append(obj4);
                    sb4.append("\n Found:\n");
                    sb4.append(a4);
                    return new u2$b(false, sb4.toString());
                }
                final HashMap<String, h$a> hashMap5 = new HashMap<String, h$a>(5);
                hashMap5.put("parent_day_id", new h$a("parent_day_id", "INTEGER", true, 1, (String)null, 1));
                hashMap5.put("name", new h$a("name", "TEXT", true, 0, (String)null, 1));
                hashMap5.put("start", new h$a("start", "TEXT", true, 0, (String)null, 1));
                hashMap5.put("end", new h$a("end", "TEXT", true, 0, (String)null, 1));
                hashMap5.put("appointments", new h$a("appointments", "TEXT", false, 0, (String)null, 1));
                final androidx.room.util.h obj5 = new androidx.room.util.h("dashboard_parent_day", (Map)hashMap5, (Set)new HashSet(0), (Set)new HashSet(0));
                final androidx.room.util.h a5 = androidx.room.util.h.a(c, "dashboard_parent_day");
                if (!obj5.equals((Object)a5)) {
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append("dashboard_parent_day(com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDay).\n Expected:\n");
                    sb5.append(obj5);
                    sb5.append("\n Found:\n");
                    sb5.append(a5);
                    return new u2$b(false, sb5.toString());
                }
                final HashMap<String, h$a> hashMap6 = new HashMap<String, h$a>(11);
                hashMap6.put("absence_id", new h$a("absence_id", "INTEGER", true, 1, (String)null, 1));
                hashMap6.put("student_id", new h$a("student_id", "INTEGER", true, 0, (String)null, 1));
                hashMap6.put("klassen_id", new h$a("klassen_id", "INTEGER", true, 0, (String)null, 1));
                hashMap6.put("start", new h$a("start", "TEXT", true, 0, (String)null, 1));
                hashMap6.put("end", new h$a("end", "TEXT", true, 0, (String)null, 1));
                hashMap6.put("owner", new h$a("owner", "INTEGER", true, 0, (String)null, 1));
                hashMap6.put("excused", new h$a("excused", "INTEGER", true, 0, (String)null, 1));
                hashMap6.put("excuse", new h$a("excuse", "TEXT", false, 0, (String)null, 1));
                hashMap6.put("reason_id", new h$a("reason_id", "INTEGER", true, 0, (String)null, 1));
                hashMap6.put("reason_title", new h$a("reason_title", "TEXT", false, 0, (String)null, 1));
                hashMap6.put("text", new h$a("text", "TEXT", false, 0, (String)null, 1));
                final androidx.room.util.h obj6 = new androidx.room.util.h("dashboard_student_absence", (Map)hashMap6, (Set)new HashSet(0), (Set)new HashSet(0));
                final androidx.room.util.h a6 = androidx.room.util.h.a(c, "dashboard_student_absence");
                if (!obj6.equals((Object)a6)) {
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append("dashboard_student_absence(com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence).\n Expected:\n");
                    sb6.append(obj6);
                    sb6.append("\n Found:\n");
                    sb6.append(a6);
                    return new u2$b(false, sb6.toString());
                }
                return new u2$b(true, (String)null);
            }
        }, "64c872067a2fce3366d07dfe1f42db30", "9b078fea7fed9f212c582ae734a37f10")).a());
    }
    
    protected Map<Class<?>, List<Class<?>>> q() {
        final HashMap<Class<com.untis.mobile.dashboard.persistence.dao.a>, List<Class<?>>> hashMap = (HashMap<Class<com.untis.mobile.dashboard.persistence.dao.a>, List<Class<?>>>)new HashMap<Class<?>, List<Class<?>>>();
        hashMap.put(com.untis.mobile.dashboard.persistence.dao.a.class, b.h());
        hashMap.put((Class<com.untis.mobile.dashboard.persistence.dao.a>)c.class, d.j());
        hashMap.put((Class<com.untis.mobile.dashboard.persistence.dao.a>)e.class, f.j());
        hashMap.put((Class<com.untis.mobile.dashboard.persistence.dao.a>)g.class, h.i());
        hashMap.put((Class<com.untis.mobile.dashboard.persistence.dao.a>)i.class, j.h());
        hashMap.put((Class<com.untis.mobile.dashboard.persistence.dao.a>)k.class, l.k());
        return (Map<Class<?>, List<Class<?>>>)hashMap;
    }
}
