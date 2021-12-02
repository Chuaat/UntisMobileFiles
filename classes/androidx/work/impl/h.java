// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl;

import androidx.work.impl.utils.f;
import android.content.Context;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import e1.c;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class h
{
    @j0
    public static c A;
    @j0
    public static c B;
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;
    public static final int h = 8;
    public static final int i = 9;
    public static final int j = 10;
    public static final int k = 11;
    private static final String l = "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";
    private static final String m = "INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo";
    private static final String n = "UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0";
    private static final String o = "DROP TABLE IF EXISTS alarmInfo";
    private static final String p = "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1";
    private static final String q = "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1";
    private static final String r = "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";
    private static final String s = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)";
    private static final String t = "ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0";
    public static final String u = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";
    private static final String v = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))";
    @j0
    public static c w;
    @j0
    public static c x;
    @j0
    public static c y;
    @j0
    public static c z;
    
    static {
        androidx.work.impl.h.w = new c(2) {
            @Override
            public void a(@j0 final androidx.sqlite.db.c c) {
                c.J0("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c.J0("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
                c.J0("DROP TABLE IF EXISTS alarmInfo");
                c.J0("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
            }
        };
        androidx.work.impl.h.x = new c(4) {
            @Override
            public void a(@j0 final androidx.sqlite.db.c c) {
                if (Build$VERSION.SDK_INT >= 23) {
                    c.J0("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
                }
            }
        };
        androidx.work.impl.h.y = new c(5) {
            @Override
            public void a(@j0 final androidx.sqlite.db.c c) {
                c.J0("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                c.J0("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
            }
        };
        androidx.work.impl.h.z = new c(7) {
            @Override
            public void a(@j0 final androidx.sqlite.db.c c) {
                c.J0("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            }
        };
        androidx.work.impl.h.A = new c(8) {
            @Override
            public void a(@j0 final androidx.sqlite.db.c c) {
                c.J0("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
            }
        };
        androidx.work.impl.h.B = new c(9) {
            @Override
            public void a(@j0 final androidx.sqlite.db.c c) {
                c.J0("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
            }
        };
    }
    
    private h() {
    }
    
    public static class g extends c
    {
        final Context c;
        
        public g(@j0 final Context c, final int n, final int n2) {
            super(n, n2);
            this.c = c;
        }
        
        @Override
        public void a(@j0 final androidx.sqlite.db.c c) {
            if (super.b >= 10) {
                c.s2("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "reschedule_needed", 1 });
            }
            else {
                this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }
    
    public static class h extends c
    {
        final Context c;
        
        public h(@j0 final Context c) {
            super(9, 10);
            this.c = c;
        }
        
        @Override
        public void a(@j0 final androidx.sqlite.db.c c) {
            c.J0("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            androidx.work.impl.utils.f.d(this.c, c);
            androidx.work.impl.utils.c.a(this.c, c);
        }
    }
}
