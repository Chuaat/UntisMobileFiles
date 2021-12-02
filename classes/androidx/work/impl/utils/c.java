// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import androidx.work.impl.model.d;
import android.content.SharedPreferences;
import android.content.Context;
import androidx.annotation.j0;
import androidx.work.impl.WorkDatabase;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class c
{
    public static final int b = 0;
    public static final String c = "androidx.work.util.id";
    public static final String d = "next_job_scheduler_id";
    public static final String e = "next_alarm_manager_id";
    private final WorkDatabase a;
    
    public c(@j0 final WorkDatabase a) {
        this.a = a;
    }
    
    public static void a(@j0 final Context context, @j0 final androidx.sqlite.db.c c) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (!sharedPreferences.contains("next_job_scheduler_id") && !sharedPreferences.contains("next_job_scheduler_id")) {
            return;
        }
        final int int1 = sharedPreferences.getInt("next_job_scheduler_id", 0);
        final int int2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
        c.beginTransaction();
        try {
            c.s2("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "next_job_scheduler_id", int1 });
            c.s2("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "next_alarm_manager_id", int2 });
            sharedPreferences.edit().clear().apply();
            c.n2();
        }
        finally {
            c.p3();
        }
    }
    
    private int c(final String s) {
        this.a.e();
        try {
            final Long b = this.a.P().b(s);
            int n = 0;
            int intValue;
            if (b != null) {
                intValue = b.intValue();
            }
            else {
                intValue = 0;
            }
            if (intValue != Integer.MAX_VALUE) {
                n = intValue + 1;
            }
            this.e(s, n);
            this.a.I();
            return intValue;
        }
        finally {
            this.a.k();
        }
    }
    
    private void e(final String s, final int n) {
        this.a.P().c(new d(s, n));
    }
    
    public int b() {
        synchronized (c.class) {
            return this.c("next_alarm_manager_id");
        }
    }
    
    public int d(int n, final int n2) {
        synchronized (c.class) {
            final int c = this.c("next_job_scheduler_id");
            if (c >= n && c <= n2) {
                n = c;
            }
            else {
                this.e("next_job_scheduler_id", n + 1);
            }
            return n;
        }
    }
}
