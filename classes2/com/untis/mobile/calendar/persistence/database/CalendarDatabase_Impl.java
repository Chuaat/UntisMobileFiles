// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.persistence.database;

import androidx.sqlite.db.d$a;
import androidx.room.u2;
import java.util.Set;
import androidx.room.util.h;
import java.util.HashSet;
import androidx.room.util.h$a;
import androidx.room.u2$b;
import androidx.room.r2$b;
import androidx.room.u2$a;
import androidx.sqlite.db.d$b;
import androidx.sqlite.db.d;
import androidx.room.n0;
import java.util.Map;
import java.util.HashMap;
import androidx.room.h1;
import androidx.room.r2;
import com.untis.mobile.calendar.persistence.dao.b;
import androidx.sqlite.db.c;
import java.util.List;
import com.untis.mobile.calendar.persistence.dao.a;

public final class CalendarDatabase_Impl extends CalendarDatabase
{
    private volatile com.untis.mobile.calendar.persistence.dao.a q;
    
    static /* synthetic */ void T(final CalendarDatabase_Impl calendarDatabase_Impl, final c c) {
        calendarDatabase_Impl.y(c);
    }
    
    @Override
    public com.untis.mobile.calendar.persistence.dao.a K() {
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
    
    public void f() {
        super.c();
        final c t2 = super.o().T2();
        try {
            super.e();
            t2.J0("DELETE FROM `calendar_period`");
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
        return new h1((r2)this, (Map)new HashMap(0), (Map)new HashMap(0), new String[] { "calendar_period" });
    }
    
    protected d j(final n0 n0) {
        return n0.a.a(d$b.a(n0.b).c(n0.c).b((d$a)new u2(n0, (u2$a)new u2$a(5) {
            public void a(final c c) {
                c.J0("CREATE TABLE IF NOT EXISTS `calendar_period` (`period_id` INTEGER NOT NULL, `absence_reason_id` INTEGER, `booking` TEXT, `color` INTEGER, `end` INTEGER NOT NULL, `exam` TEXT, `klassen` TEXT NOT NULL, `lesson` TEXT, `student_group` TEXT, `messenger_channel` TEXT, `notes_all` TEXT, `notes_all_files` TEXT NOT NULL, `notes_staff` TEXT, `notes_staff_files` TEXT NOT NULL, `original_period` TEXT, `resources` TEXT NOT NULL, `rooms` TEXT NOT NULL, `start` INTEGER NOT NULL, `status` TEXT NOT NULL, `students` TEXT NOT NULL, `type_sub` TEXT, `subject` TEXT, `substitution_text` TEXT, `teachers` TEXT NOT NULL, `teaching_content` TEXT, `teaching_content_files` TEXT, `type` TEXT NOT NULL, `permissions` TEXT NOT NULL, `block_periods` TEXT, `video_call` TEXT, `lesson_info` TEXT, PRIMARY KEY(`period_id`))");
                c.J0("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c.J0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'af872cce6eeb71dd3aadbb5267d59b41')");
            }
            
            public void b(final c c) {
                c.J0("DROP TABLE IF EXISTS `calendar_period`");
                if (CalendarDatabase_Impl.this.h != null) {
                    for (int i = 0; i < CalendarDatabase_Impl.this.h.size(); ++i) {
                        ((r2$b)CalendarDatabase_Impl.this.h.get(i)).b(c);
                    }
                }
            }
            
            protected void c(final c c) {
                if (CalendarDatabase_Impl.this.h != null) {
                    for (int i = 0; i < CalendarDatabase_Impl.this.h.size(); ++i) {
                        ((r2$b)CalendarDatabase_Impl.this.h.get(i)).a(c);
                    }
                }
            }
            
            public void d(final c c) {
                CalendarDatabase_Impl.this.a = c;
                CalendarDatabase_Impl.T(CalendarDatabase_Impl.this, c);
                if (CalendarDatabase_Impl.this.h != null) {
                    for (int i = 0; i < CalendarDatabase_Impl.this.h.size(); ++i) {
                        ((r2$b)CalendarDatabase_Impl.this.h.get(i)).c(c);
                    }
                }
            }
            
            public void e(final c c) {
            }
            
            public void f(final c c) {
                androidx.room.util.c.b(c);
            }
            
            protected u2$b g(final c c) {
                final HashMap<String, h$a> hashMap = new HashMap<String, h$a>(31);
                hashMap.put("period_id", new h$a("period_id", "INTEGER", true, 1, (String)null, 1));
                hashMap.put("absence_reason_id", new h$a("absence_reason_id", "INTEGER", false, 0, (String)null, 1));
                hashMap.put("booking", new h$a("booking", "TEXT", false, 0, (String)null, 1));
                hashMap.put("color", new h$a("color", "INTEGER", false, 0, (String)null, 1));
                hashMap.put("end", new h$a("end", "INTEGER", true, 0, (String)null, 1));
                hashMap.put("exam", new h$a("exam", "TEXT", false, 0, (String)null, 1));
                hashMap.put("klassen", new h$a("klassen", "TEXT", true, 0, (String)null, 1));
                hashMap.put("lesson", new h$a("lesson", "TEXT", false, 0, (String)null, 1));
                hashMap.put("student_group", new h$a("student_group", "TEXT", false, 0, (String)null, 1));
                hashMap.put("messenger_channel", new h$a("messenger_channel", "TEXT", false, 0, (String)null, 1));
                hashMap.put("notes_all", new h$a("notes_all", "TEXT", false, 0, (String)null, 1));
                hashMap.put("notes_all_files", new h$a("notes_all_files", "TEXT", true, 0, (String)null, 1));
                hashMap.put("notes_staff", new h$a("notes_staff", "TEXT", false, 0, (String)null, 1));
                hashMap.put("notes_staff_files", new h$a("notes_staff_files", "TEXT", true, 0, (String)null, 1));
                hashMap.put("original_period", new h$a("original_period", "TEXT", false, 0, (String)null, 1));
                hashMap.put("resources", new h$a("resources", "TEXT", true, 0, (String)null, 1));
                hashMap.put("rooms", new h$a("rooms", "TEXT", true, 0, (String)null, 1));
                hashMap.put("start", new h$a("start", "INTEGER", true, 0, (String)null, 1));
                hashMap.put("status", new h$a("status", "TEXT", true, 0, (String)null, 1));
                hashMap.put("students", new h$a("students", "TEXT", true, 0, (String)null, 1));
                hashMap.put("type_sub", new h$a("type_sub", "TEXT", false, 0, (String)null, 1));
                hashMap.put("subject", new h$a("subject", "TEXT", false, 0, (String)null, 1));
                hashMap.put("substitution_text", new h$a("substitution_text", "TEXT", false, 0, (String)null, 1));
                hashMap.put("teachers", new h$a("teachers", "TEXT", true, 0, (String)null, 1));
                hashMap.put("teaching_content", new h$a("teaching_content", "TEXT", false, 0, (String)null, 1));
                hashMap.put("teaching_content_files", new h$a("teaching_content_files", "TEXT", false, 0, (String)null, 1));
                hashMap.put("type", new h$a("type", "TEXT", true, 0, (String)null, 1));
                hashMap.put("permissions", new h$a("permissions", "TEXT", true, 0, (String)null, 1));
                hashMap.put("block_periods", new h$a("block_periods", "TEXT", false, 0, (String)null, 1));
                hashMap.put("video_call", new h$a("video_call", "TEXT", false, 0, (String)null, 1));
                hashMap.put("lesson_info", new h$a("lesson_info", "TEXT", false, 0, (String)null, 1));
                final h obj = new h("calendar_period", (Map)hashMap, (Set)new HashSet(0), (Set)new HashSet(0));
                final h a = h.a(c, "calendar_period");
                if (!obj.equals((Object)a)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("calendar_period(com.untis.mobile.calendar.persistence.model.CalendarPeriod).\n Expected:\n");
                    sb.append(obj);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    return new u2$b(false, sb.toString());
                }
                return new u2$b(true, (String)null);
            }
        }, "af872cce6eeb71dd3aadbb5267d59b41", "6110151f4718f8e4e865e6982df5f24b")).a());
    }
    
    protected Map<Class<?>, List<Class<?>>> q() {
        final HashMap<Class<com.untis.mobile.calendar.persistence.dao.a>, List<Class<?>>> hashMap = (HashMap<Class<com.untis.mobile.calendar.persistence.dao.a>, List<Class<?>>>)new HashMap<Class<?>, List<Class<?>>>();
        hashMap.put(com.untis.mobile.calendar.persistence.dao.a.class, b.h());
        return (Map<Class<?>, List<Class<?>>>)hashMap;
    }
}
