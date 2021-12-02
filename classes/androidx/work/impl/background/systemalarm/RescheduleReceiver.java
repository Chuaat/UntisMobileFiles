// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.background.systemalarm;

import androidx.work.impl.j;
import android.os.Build$VERSION;
import android.content.Intent;
import android.content.Context;
import androidx.work.q;
import android.content.BroadcastReceiver;

public class RescheduleReceiver extends BroadcastReceiver
{
    private static final String a;
    
    static {
        a = q.f("RescheduleReceiver");
    }
    
    public void onReceive(final Context context, final Intent intent) {
        q.c().a(RescheduleReceiver.a, String.format("Received intent %s", intent), new Throwable[0]);
        if (Build$VERSION.SDK_INT >= 23) {
            try {
                j.H(context).T(this.goAsync());
            }
            catch (IllegalStateException ex) {
                q.c().b(RescheduleReceiver.a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", ex);
            }
        }
        else {
            context.startService(b.e(context));
        }
    }
}
