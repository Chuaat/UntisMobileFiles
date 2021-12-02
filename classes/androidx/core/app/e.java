// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import android.app.AlarmManager$AlarmClockInfo;
import android.os.Build$VERSION;
import android.app.PendingIntent;
import androidx.annotation.j0;
import android.app.AlarmManager;

public final class e
{
    private e() {
    }
    
    public static void a(@j0 final AlarmManager alarmManager, final long n, @j0 final PendingIntent pendingIntent, @j0 final PendingIntent pendingIntent2) {
        if (Build$VERSION.SDK_INT >= 21) {
            alarmManager.setAlarmClock(new AlarmManager$AlarmClockInfo(n, pendingIntent), pendingIntent2);
        }
        else {
            c(alarmManager, 0, n, pendingIntent2);
        }
    }
    
    public static void b(@j0 final AlarmManager alarmManager, final int n, final long n2, @j0 final PendingIntent pendingIntent) {
        if (Build$VERSION.SDK_INT >= 23) {
            alarmManager.setAndAllowWhileIdle(n, n2, pendingIntent);
        }
        else {
            alarmManager.set(n, n2, pendingIntent);
        }
    }
    
    public static void c(@j0 final AlarmManager alarmManager, final int n, final long n2, @j0 final PendingIntent pendingIntent) {
        if (Build$VERSION.SDK_INT >= 19) {
            alarmManager.setExact(n, n2, pendingIntent);
        }
        else {
            alarmManager.set(n, n2, pendingIntent);
        }
    }
    
    public static void d(@j0 final AlarmManager alarmManager, final int n, final long n2, @j0 final PendingIntent pendingIntent) {
        if (Build$VERSION.SDK_INT >= 23) {
            alarmManager.setExactAndAllowWhileIdle(n, n2, pendingIntent);
        }
        else {
            c(alarmManager, n, n2, pendingIntent);
        }
    }
}
