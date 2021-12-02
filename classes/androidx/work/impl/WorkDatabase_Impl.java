// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl;

import java.util.Arrays;
import java.util.HashSet;
import androidx.room.u2;
import androidx.sqlite.db.d;
import androidx.room.n0;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import androidx.room.h1;
import android.os.Build$VERSION;
import androidx.work.impl.model.w;
import androidx.work.impl.model.t;
import androidx.work.impl.model.q;
import androidx.work.impl.model.n;
import androidx.work.impl.model.k;
import androidx.work.impl.model.h;
import androidx.work.impl.model.f;
import androidx.room.r2;
import androidx.sqlite.db.c;
import java.util.List;
import androidx.work.impl.model.g;
import androidx.work.impl.model.e;
import androidx.work.impl.model.p;
import androidx.work.impl.model.m;
import androidx.work.impl.model.j;
import androidx.work.impl.model.v;
import androidx.work.impl.model.b;
import androidx.work.impl.model.s;

public final class WorkDatabase_Impl extends WorkDatabase
{
    private volatile s s;
    private volatile androidx.work.impl.model.b t;
    private volatile v u;
    private volatile j v;
    private volatile m w;
    private volatile p x;
    private volatile androidx.work.impl.model.e y;
    private volatile g z;
    
    @Override
    public androidx.work.impl.model.b L() {
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            if (this.t == null) {
                this.t = new androidx.work.impl.model.c(this);
            }
            return this.t;
        }
    }
    
    @Override
    public androidx.work.impl.model.e P() {
        if (this.y != null) {
            return this.y;
        }
        synchronized (this) {
            if (this.y == null) {
                this.y = new androidx.work.impl.model.f(this);
            }
            return this.y;
        }
    }
    
    @Override
    public g Q() {
        if (this.z != null) {
            return this.z;
        }
        synchronized (this) {
            if (this.z == null) {
                this.z = new h(this);
            }
            return this.z;
        }
    }
    
    @Override
    public j R() {
        if (this.v != null) {
            return this.v;
        }
        synchronized (this) {
            if (this.v == null) {
                this.v = new k(this);
            }
            return this.v;
        }
    }
    
    @Override
    public m S() {
        if (this.w != null) {
            return this.w;
        }
        synchronized (this) {
            if (this.w == null) {
                this.w = new n(this);
            }
            return this.w;
        }
    }
    
    @Override
    public p T() {
        if (this.x != null) {
            return this.x;
        }
        synchronized (this) {
            if (this.x == null) {
                this.x = new q(this);
            }
            return this.x;
        }
    }
    
    @Override
    public s U() {
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            if (this.s == null) {
                this.s = new t(this);
            }
            return this.s;
        }
    }
    
    @Override
    public v V() {
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            if (this.u == null) {
                this.u = new w(this);
            }
            return this.u;
        }
    }
    
    @Override
    public void f() {
        super.c();
        final androidx.sqlite.db.c t2 = super.o().T2();
        final boolean b = Build$VERSION.SDK_INT >= 21;
        Label_0041: {
            if (b) {
                break Label_0041;
            }
            try {
                t2.J0("PRAGMA foreign_keys = FALSE");
                super.e();
                if (b) {
                    t2.J0("PRAGMA defer_foreign_keys = TRUE");
                }
                t2.J0("DELETE FROM `Dependency`");
                t2.J0("DELETE FROM `WorkSpec`");
                t2.J0("DELETE FROM `WorkTag`");
                t2.J0("DELETE FROM `SystemIdInfo`");
                t2.J0("DELETE FROM `WorkName`");
                t2.J0("DELETE FROM `WorkProgress`");
                t2.J0("DELETE FROM `Preference`");
                super.I();
            }
            finally {
                super.k();
                if (!b) {
                    t2.J0("PRAGMA foreign_keys = TRUE");
                }
                t2.W2("PRAGMA wal_checkpoint(FULL)").close();
                if (!t2.x4()) {
                    t2.J0("VACUUM");
                }
            }
        }
    }
    
    @Override
    protected h1 i() {
        return new h1(this, new HashMap<String, String>(0), new HashMap<String, Set<String>>(0), new String[] { "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference" });
    }
    
    @Override
    protected androidx.sqlite.db.d j(final n0 n0) {
        return n0.a.a(androidx.sqlite.db.d.b.a(n0.b).c(n0.c).b(new u2(n0, (u2.a)new u2.a(11) {
            public void a(final c c) {
                c.J0("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c.J0("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                c.J0("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                c.J0("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
                c.J0("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                c.J0("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                c.J0("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c.J0("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                c.J0("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c.J0("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c.J0("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                c.J0("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c.J0("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                c.J0("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c.J0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf029002fffdcadf079e8d0a1c9a70ac')");
            }
            
            public void b(final c c) {
                c.J0("DROP TABLE IF EXISTS `Dependency`");
                c.J0("DROP TABLE IF EXISTS `WorkSpec`");
                c.J0("DROP TABLE IF EXISTS `WorkTag`");
                c.J0("DROP TABLE IF EXISTS `SystemIdInfo`");
                c.J0("DROP TABLE IF EXISTS `WorkName`");
                c.J0("DROP TABLE IF EXISTS `WorkProgress`");
                c.J0("DROP TABLE IF EXISTS `Preference`");
                if (WorkDatabase_Impl.this.h != null) {
                    for (int i = 0; i < WorkDatabase_Impl.this.h.size(); ++i) {
                        ((r2.b)WorkDatabase_Impl.this.h.get(i)).b(c);
                    }
                }
            }
            
            @Override
            protected void c(final c c) {
                if (WorkDatabase_Impl.this.h != null) {
                    for (int i = 0; i < WorkDatabase_Impl.this.h.size(); ++i) {
                        ((r2.b)WorkDatabase_Impl.this.h.get(i)).a(c);
                    }
                }
            }
            
            public void d(final c c) {
                WorkDatabase_Impl.this.a = c;
                c.J0("PRAGMA foreign_keys = ON");
                r2.this.y(c);
                if (WorkDatabase_Impl.this.h != null) {
                    for (int i = 0; i < WorkDatabase_Impl.this.h.size(); ++i) {
                        ((r2.b)WorkDatabase_Impl.this.h.get(i)).c(c);
                    }
                }
            }
            
            public void e(final c c) {
            }
            
            public void f(final c c) {
                androidx.room.util.c.b(c);
            }
            
            @Override
            protected u2.b g(final c c) {
                final HashMap<String, androidx.room.util.h.a> hashMap = new HashMap<String, androidx.room.util.h.a>(2);
                hashMap.put("work_spec_id", new androidx.room.util.h.a("work_spec_id", "TEXT", true, 1, null, 1));
                hashMap.put("prerequisite_id", new androidx.room.util.h.a("prerequisite_id", "TEXT", true, 2, null, 1));
                final HashSet<androidx.room.util.h.b> set = new HashSet<androidx.room.util.h.b>(2);
                set.add(new androidx.room.util.h.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                set.add(new androidx.room.util.h.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
                final HashSet<androidx.room.util.h.d> set2 = new HashSet<androidx.room.util.h.d>(2);
                set2.add(new androidx.room.util.h.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
                set2.add(new androidx.room.util.h.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
                final androidx.room.util.h obj = new androidx.room.util.h("Dependency", hashMap, set, set2);
                final androidx.room.util.h a = androidx.room.util.h.a(c, "Dependency");
                if (!obj.equals(a)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
                    sb.append(obj);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    return new u2.b(false, sb.toString());
                }
                final HashMap<String, androidx.room.util.h.a> hashMap2 = new HashMap<String, androidx.room.util.h.a>(24);
                hashMap2.put("id", new androidx.room.util.h.a("id", "TEXT", true, 1, null, 1));
                hashMap2.put("state", new androidx.room.util.h.a("state", "INTEGER", true, 0, null, 1));
                hashMap2.put("worker_class_name", new androidx.room.util.h.a("worker_class_name", "TEXT", true, 0, null, 1));
                hashMap2.put("input_merger_class_name", new androidx.room.util.h.a("input_merger_class_name", "TEXT", false, 0, null, 1));
                hashMap2.put("input", new androidx.room.util.h.a("input", "BLOB", true, 0, null, 1));
                hashMap2.put("output", new androidx.room.util.h.a("output", "BLOB", true, 0, null, 1));
                hashMap2.put("initial_delay", new androidx.room.util.h.a("initial_delay", "INTEGER", true, 0, null, 1));
                hashMap2.put("interval_duration", new androidx.room.util.h.a("interval_duration", "INTEGER", true, 0, null, 1));
                hashMap2.put("flex_duration", new androidx.room.util.h.a("flex_duration", "INTEGER", true, 0, null, 1));
                hashMap2.put("run_attempt_count", new androidx.room.util.h.a("run_attempt_count", "INTEGER", true, 0, null, 1));
                hashMap2.put("backoff_policy", new androidx.room.util.h.a("backoff_policy", "INTEGER", true, 0, null, 1));
                hashMap2.put("backoff_delay_duration", new androidx.room.util.h.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
                hashMap2.put("period_start_time", new androidx.room.util.h.a("period_start_time", "INTEGER", true, 0, null, 1));
                hashMap2.put("minimum_retention_duration", new androidx.room.util.h.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
                hashMap2.put("schedule_requested_at", new androidx.room.util.h.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
                hashMap2.put("run_in_foreground", new androidx.room.util.h.a("run_in_foreground", "INTEGER", true, 0, null, 1));
                hashMap2.put("required_network_type", new androidx.room.util.h.a("required_network_type", "INTEGER", false, 0, null, 1));
                hashMap2.put("requires_charging", new androidx.room.util.h.a("requires_charging", "INTEGER", true, 0, null, 1));
                hashMap2.put("requires_device_idle", new androidx.room.util.h.a("requires_device_idle", "INTEGER", true, 0, null, 1));
                hashMap2.put("requires_battery_not_low", new androidx.room.util.h.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
                hashMap2.put("requires_storage_not_low", new androidx.room.util.h.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
                hashMap2.put("trigger_content_update_delay", new androidx.room.util.h.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
                hashMap2.put("trigger_max_content_delay", new androidx.room.util.h.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
                hashMap2.put("content_uri_triggers", new androidx.room.util.h.a("content_uri_triggers", "BLOB", false, 0, null, 1));
                final HashSet<androidx.room.util.h.b> set3 = new HashSet<androidx.room.util.h.b>(0);
                final HashSet<androidx.room.util.h.d> set4 = new HashSet<androidx.room.util.h.d>(2);
                set4.add(new androidx.room.util.h.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
                set4.add(new androidx.room.util.h.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
                final androidx.room.util.h obj2 = new androidx.room.util.h("WorkSpec", hashMap2, set3, set4);
                final androidx.room.util.h a2 = androidx.room.util.h.a(c, "WorkSpec");
                if (!obj2.equals(a2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
                    sb2.append(obj2);
                    sb2.append("\n Found:\n");
                    sb2.append(a2);
                    return new u2.b(false, sb2.toString());
                }
                final HashMap<String, androidx.room.util.h.a> hashMap3 = new HashMap<String, androidx.room.util.h.a>(2);
                hashMap3.put("tag", new androidx.room.util.h.a("tag", "TEXT", true, 1, null, 1));
                hashMap3.put("work_spec_id", new androidx.room.util.h.a("work_spec_id", "TEXT", true, 2, null, 1));
                final HashSet<androidx.room.util.h.b> set5 = new HashSet<androidx.room.util.h.b>(1);
                set5.add(new androidx.room.util.h.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                final HashSet<androidx.room.util.h.d> set6 = new HashSet<androidx.room.util.h.d>(1);
                set6.add(new androidx.room.util.h.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
                final androidx.room.util.h obj3 = new androidx.room.util.h("WorkTag", hashMap3, set5, set6);
                final androidx.room.util.h a3 = androidx.room.util.h.a(c, "WorkTag");
                if (!obj3.equals(a3)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
                    sb3.append(obj3);
                    sb3.append("\n Found:\n");
                    sb3.append(a3);
                    return new u2.b(false, sb3.toString());
                }
                final HashMap<String, androidx.room.util.h.a> hashMap4 = new HashMap<String, androidx.room.util.h.a>(2);
                hashMap4.put("work_spec_id", new androidx.room.util.h.a("work_spec_id", "TEXT", true, 1, null, 1));
                hashMap4.put("system_id", new androidx.room.util.h.a("system_id", "INTEGER", true, 0, null, 1));
                final HashSet<androidx.room.util.h.b> set7 = new HashSet<androidx.room.util.h.b>(1);
                set7.add(new androidx.room.util.h.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                final androidx.room.util.h obj4 = new androidx.room.util.h("SystemIdInfo", hashMap4, set7, new HashSet<androidx.room.util.h.d>(0));
                final androidx.room.util.h a4 = androidx.room.util.h.a(c, "SystemIdInfo");
                if (!obj4.equals(a4)) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
                    sb4.append(obj4);
                    sb4.append("\n Found:\n");
                    sb4.append(a4);
                    return new u2.b(false, sb4.toString());
                }
                final HashMap<String, androidx.room.util.h.a> hashMap5 = new HashMap<String, androidx.room.util.h.a>(2);
                hashMap5.put("name", new androidx.room.util.h.a("name", "TEXT", true, 1, null, 1));
                hashMap5.put("work_spec_id", new androidx.room.util.h.a("work_spec_id", "TEXT", true, 2, null, 1));
                final HashSet<androidx.room.util.h.b> set8 = new HashSet<androidx.room.util.h.b>(1);
                set8.add(new androidx.room.util.h.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                final HashSet<androidx.room.util.h.d> set9 = new HashSet<androidx.room.util.h.d>(1);
                set9.add(new androidx.room.util.h.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
                final androidx.room.util.h obj5 = new androidx.room.util.h("WorkName", hashMap5, set8, set9);
                final androidx.room.util.h a5 = androidx.room.util.h.a(c, "WorkName");
                if (!obj5.equals(a5)) {
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
                    sb5.append(obj5);
                    sb5.append("\n Found:\n");
                    sb5.append(a5);
                    return new u2.b(false, sb5.toString());
                }
                final HashMap<String, androidx.room.util.h.a> hashMap6 = new HashMap<String, androidx.room.util.h.a>(2);
                hashMap6.put("work_spec_id", new androidx.room.util.h.a("work_spec_id", "TEXT", true, 1, null, 1));
                hashMap6.put("progress", new androidx.room.util.h.a("progress", "BLOB", true, 0, null, 1));
                final HashSet<androidx.room.util.h.b> set10 = new HashSet<androidx.room.util.h.b>(1);
                set10.add(new androidx.room.util.h.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                final androidx.room.util.h obj6 = new androidx.room.util.h("WorkProgress", hashMap6, set10, new HashSet<androidx.room.util.h.d>(0));
                final androidx.room.util.h a6 = androidx.room.util.h.a(c, "WorkProgress");
                if (!obj6.equals(a6)) {
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
                    sb6.append(obj6);
                    sb6.append("\n Found:\n");
                    sb6.append(a6);
                    return new u2.b(false, sb6.toString());
                }
                final HashMap<String, androidx.room.util.h.a> hashMap7 = new HashMap<String, androidx.room.util.h.a>(2);
                hashMap7.put("key", new androidx.room.util.h.a("key", "TEXT", true, 1, null, 1));
                hashMap7.put("long_value", new androidx.room.util.h.a("long_value", "INTEGER", false, 0, null, 1));
                final androidx.room.util.h obj7 = new androidx.room.util.h("Preference", hashMap7, new HashSet<androidx.room.util.h.b>(0), new HashSet<androidx.room.util.h.d>(0));
                final androidx.room.util.h a7 = androidx.room.util.h.a(c, "Preference");
                if (!obj7.equals(a7)) {
                    final StringBuilder sb7 = new StringBuilder();
                    sb7.append("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
                    sb7.append(obj7);
                    sb7.append("\n Found:\n");
                    sb7.append(a7);
                    return new u2.b(false, sb7.toString());
                }
                return new u2.b(true, null);
            }
        }, "cf029002fffdcadf079e8d0a1c9a70ac", "8aff2efc47fafe870c738f727dfcfc6e")).a());
    }
}
