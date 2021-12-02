// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.core.persistence;

import androidx.sqlite.db.d$a;
import androidx.room.u2;
import java.util.Set;
import androidx.room.util.h;
import java.util.Arrays;
import androidx.room.util.h$d;
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
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderDao_Impl;
import androidx.sqlite.db.c;
import java.util.List;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderDao;

public final class ProfileDatabase_Impl extends ProfileDatabase
{
    private volatile ReminderDao q;
    
    static /* synthetic */ void T(final ProfileDatabase_Impl profileDatabase_Impl, final c c) {
        profileDatabase_Impl.y(c);
    }
    
    @Override
    public ReminderDao K() {
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new ReminderDao_Impl(this);
            }
            return this.q;
        }
    }
    
    public void f() {
        super.c();
        final c t2 = super.o().T2();
        try {
            super.e();
            t2.J0("DELETE FROM `reminder`");
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
        return new h1((r2)this, (Map)new HashMap(0), (Map)new HashMap(0), new String[] { "reminder" });
    }
    
    protected d j(final n0 n0) {
        return n0.a.a(d$b.a(n0.b).c(n0.c).b((d$a)new u2(n0, (u2$a)new u2$a(1) {
            public void a(final c c) {
                c.J0("CREATE TABLE IF NOT EXISTS `reminder` (`reminder_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `profile_id` TEXT NOT NULL, `source_type` INTEGER NOT NULL, `source_id` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `date_time` TEXT NOT NULL, `subtype` INTEGER NOT NULL)");
                c.J0("CREATE INDEX IF NOT EXISTS `index_reminder_01` ON `reminder` (`profile_id`, `source_type`, `source_id`)");
                c.J0("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c.J0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5ba4fbe4c071211b898dc41549f7f777')");
            }
            
            public void b(final c c) {
                c.J0("DROP TABLE IF EXISTS `reminder`");
                if (ProfileDatabase_Impl.this.h != null) {
                    for (int i = 0; i < ProfileDatabase_Impl.this.h.size(); ++i) {
                        ((r2$b)ProfileDatabase_Impl.this.h.get(i)).b(c);
                    }
                }
            }
            
            protected void c(final c c) {
                if (ProfileDatabase_Impl.this.h != null) {
                    for (int i = 0; i < ProfileDatabase_Impl.this.h.size(); ++i) {
                        ((r2$b)ProfileDatabase_Impl.this.h.get(i)).a(c);
                    }
                }
            }
            
            public void d(final c c) {
                ProfileDatabase_Impl.this.a = c;
                ProfileDatabase_Impl.T(ProfileDatabase_Impl.this, c);
                if (ProfileDatabase_Impl.this.h != null) {
                    for (int i = 0; i < ProfileDatabase_Impl.this.h.size(); ++i) {
                        ((r2$b)ProfileDatabase_Impl.this.h.get(i)).c(c);
                    }
                }
            }
            
            public void e(final c c) {
            }
            
            public void f(final c c) {
                androidx.room.util.c.b(c);
            }
            
            protected u2$b g(final c c) {
                final HashMap<String, h$a> hashMap = new HashMap<String, h$a>(8);
                hashMap.put("reminder_id", new h$a("reminder_id", "INTEGER", true, 1, (String)null, 1));
                hashMap.put("profile_id", new h$a("profile_id", "TEXT", true, 0, (String)null, 1));
                hashMap.put("source_type", new h$a("source_type", "INTEGER", true, 0, (String)null, 1));
                hashMap.put("source_id", new h$a("source_id", "INTEGER", true, 0, (String)null, 1));
                hashMap.put("title", new h$a("title", "TEXT", true, 0, (String)null, 1));
                hashMap.put("description", new h$a("description", "TEXT", true, 0, (String)null, 1));
                hashMap.put("date_time", new h$a("date_time", "TEXT", true, 0, (String)null, 1));
                hashMap.put("subtype", new h$a("subtype", "INTEGER", true, 0, (String)null, 1));
                final HashSet set = new HashSet(0);
                final HashSet<h$d> set2 = new HashSet<h$d>(1);
                set2.add(new h$d("index_reminder_01", false, (List)Arrays.asList("profile_id", "source_type", "source_id")));
                final h obj = new h("reminder", (Map)hashMap, (Set)set, (Set)set2);
                final h a = h.a(c, "reminder");
                if (!obj.equals((Object)a)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("reminder(com.untis.mobile.dashboard.persistence.model.reminder.Reminder).\n Expected:\n");
                    sb.append(obj);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    return new u2$b(false, sb.toString());
                }
                return new u2$b(true, (String)null);
            }
        }, "5ba4fbe4c071211b898dc41549f7f777", "ccb04c4fa85b0f8c9ba0ef7e49741213")).a());
    }
    
    protected Map<Class<?>, List<Class<?>>> q() {
        final HashMap<Class<ReminderDao>, List<Class<?>>> hashMap = (HashMap<Class<ReminderDao>, List<Class<?>>>)new HashMap<Class<?>, List<Class<?>>>();
        hashMap.put(ReminderDao.class, ReminderDao_Impl.getRequiredConverters());
        return (Map<Class<?>, List<Class<?>>>)hashMap;
    }
}
