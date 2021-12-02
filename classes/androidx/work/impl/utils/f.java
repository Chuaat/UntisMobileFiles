// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import androidx.work.impl.model.d;
import androidx.lifecycle.u0;
import g.a;
import androidx.lifecycle.LiveData;
import android.content.SharedPreferences;
import androidx.sqlite.db.c;
import android.content.Context;
import androidx.annotation.j0;
import androidx.work.impl.WorkDatabase;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class f
{
    public static final String b = "androidx.work.util.preferences";
    public static final String c = "last_cancel_all_time_ms";
    public static final String d = "reschedule_needed";
    private final WorkDatabase a;
    
    public f(@j0 final WorkDatabase a) {
        this.a = a;
    }
    
    public static void d(@j0 final Context context, @j0 final c c) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (!sharedPreferences.contains("reschedule_needed") && !sharedPreferences.contains("last_cancel_all_time_ms")) {
            return;
        }
        long l = 0L;
        final long long1 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
        if (sharedPreferences.getBoolean("reschedule_needed", false)) {
            l = 1L;
        }
        c.beginTransaction();
        try {
            c.s2("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "last_cancel_all_time_ms", long1 });
            c.s2("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "reschedule_needed", l });
            sharedPreferences.edit().clear().apply();
            c.n2();
        }
        finally {
            c.p3();
        }
    }
    
    public long a() {
        final Long b = this.a.P().b("last_cancel_all_time_ms");
        long longValue;
        if (b != null) {
            longValue = b;
        }
        else {
            longValue = 0L;
        }
        return longValue;
    }
    
    @j0
    public LiveData<Long> b() {
        return u0.b(this.a.P().a("last_cancel_all_time_ms"), (a<Long, Long>)new a<Long, Long>() {
            public Long a(final Long n) {
                long longValue;
                if (n != null) {
                    longValue = n;
                }
                else {
                    longValue = 0L;
                }
                return longValue;
            }
        });
    }
    
    public boolean c() {
        final Long b = this.a.P().b("reschedule_needed");
        return b != null && b == 1L;
    }
    
    public void e(final long n) {
        this.a.P().c(new d("last_cancel_all_time_ms", n));
    }
    
    public void f(final boolean b) {
        this.a.P().c(new d("reschedule_needed", b));
    }
}
