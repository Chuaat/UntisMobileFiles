// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.impl.utils.taskexecutor.a;
import androidx.annotation.j0;
import android.content.Context;
import androidx.work.q;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class b extends c<Boolean>
{
    private static final String i;
    static final float j = 0.15f;
    
    static {
        i = q.f("BatteryNotLowTracker");
    }
    
    public b(@j0 final Context context, @j0 final a a) {
        super(context, a);
    }
    
    @Override
    public IntentFilter g() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }
    
    @Override
    public void h(final Context context, @j0 final Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        q.c().a(b.i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        final String action = intent.getAction();
        action.hashCode();
        Boolean b;
        if (!action.equals("android.intent.action.BATTERY_OKAY")) {
            if (!action.equals("android.intent.action.BATTERY_LOW")) {
                return;
            }
            b = Boolean.FALSE;
        }
        else {
            b = Boolean.TRUE;
        }
        this.d(b);
    }
    
    public Boolean i() {
        final Intent registerReceiver = super.b.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean b = false;
        if (registerReceiver == null) {
            q.c().b(androidx.work.impl.constraints.trackers.b.i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        final int intExtra = registerReceiver.getIntExtra("status", -1);
        final float n = registerReceiver.getIntExtra("level", -1) / (float)registerReceiver.getIntExtra("scale", -1);
        if (intExtra == 1 || n > 0.15f) {
            b = true;
        }
        return b;
    }
}
