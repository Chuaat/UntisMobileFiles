// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Build$VERSION;
import android.content.Intent;
import androidx.annotation.j0;
import android.content.Context;
import androidx.work.q;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class a extends c<Boolean>
{
    private static final String i;
    
    static {
        i = q.f("BatteryChrgTracker");
    }
    
    public a(@j0 final Context context, @j0 final androidx.work.impl.utils.taskexecutor.a a) {
        super(context, a);
    }
    
    private boolean j(final Intent intent) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b = true;
        if (sdk_INT >= 23) {
            final int intExtra = intent.getIntExtra("status", -1);
            boolean b2 = b;
            if (intExtra == 2) {
                return b2;
            }
            if (intExtra == 5) {
                b2 = b;
                return b2;
            }
        }
        else if (intent.getIntExtra("plugged", 0) != 0) {
            return b;
        }
        return false;
    }
    
    @Override
    public IntentFilter g() {
        final IntentFilter intentFilter = new IntentFilter();
        String s;
        if (Build$VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            s = "android.os.action.DISCHARGING";
        }
        else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            s = "android.intent.action.ACTION_POWER_DISCONNECTED";
        }
        intentFilter.addAction(s);
        return intentFilter;
    }
    
    @Override
    public void h(final Context context, @j0 final Intent intent) {
        final String action = intent.getAction();
        if (action == null) {
            return;
        }
        final q c = q.c();
        final String i = a.i;
        int n = 1;
        c.a(i, String.format("Received %s", action), new Throwable[0]);
        Label_0157: {
            switch (action) {
                case "android.intent.action.ACTION_POWER_CONNECTED": {
                    n = 3;
                    break Label_0157;
                }
                case "android.os.action.CHARGING": {
                    n = 2;
                    break Label_0157;
                }
                case "android.os.action.DISCHARGING": {
                    break Label_0157;
                }
                case "android.intent.action.ACTION_POWER_DISCONNECTED": {
                    n = 0;
                    break Label_0157;
                }
                default:
                    break;
            }
            n = -1;
        }
        Boolean b = null;
        switch (n) {
            default: {
                return;
            }
            case 2:
            case 3: {
                b = Boolean.TRUE;
                break;
            }
            case 0:
            case 1: {
                b = Boolean.FALSE;
                break;
            }
        }
        this.d(b);
    }
    
    public Boolean i() {
        final Intent registerReceiver = super.b.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            q.c().b(a.i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        return this.j(registerReceiver);
    }
}
