// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.background.systemalarm;

import androidx.work.impl.utils.e;
import android.content.BroadcastReceiver$PendingResult;
import androidx.work.impl.j;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.content.ComponentName;
import android.content.Intent;
import android.content.Context;
import androidx.work.q;
import android.content.BroadcastReceiver;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver
{
    static final String a;
    static final String b = "androidx.work.impl.background.systemalarm.UpdateProxies";
    static final String c = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED";
    static final String d = "KEY_BATTERY_CHARGING_PROXY_ENABLED";
    static final String e = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED";
    static final String f = "KEY_NETWORK_STATE_PROXY_ENABLED";
    
    static {
        a = q.f("ConstrntProxyUpdtRecvr");
    }
    
    public static Intent a(final Context context, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        final Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class)ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", b).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", b2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", b3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", b4);
        return intent;
    }
    
    public void onReceive(@j0 final Context context, @k0 final Intent intent) {
        String action;
        if (intent != null) {
            action = intent.getAction();
        }
        else {
            action = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            q.c().a(ConstraintProxyUpdateReceiver.a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
        else {
            j.H(context).O().c(new Runnable() {
                final /* synthetic */ BroadcastReceiver$PendingResult I = this.goAsync();
                
                @Override
                public void run() {
                    try {
                        final boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                        final boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                        final boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                        final boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                        q.c().a(ConstraintProxyUpdateReceiver.a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", booleanExtra, booleanExtra2, booleanExtra3, booleanExtra4), new Throwable[0]);
                        androidx.work.impl.utils.e.c(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                        androidx.work.impl.utils.e.c(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                        androidx.work.impl.utils.e.c(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                        androidx.work.impl.utils.e.c(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
                    }
                    finally {
                        this.I.finish();
                    }
                }
            });
        }
    }
}
