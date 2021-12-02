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
public class f extends c<Boolean>
{
    private static final String i;
    
    static {
        i = q.f("StorageNotLowTracker");
    }
    
    public f(@j0 final Context context, @j0 final a a) {
        super(context, a);
    }
    
    @Override
    public IntentFilter g() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }
    
    @Override
    public void h(final Context context, @j0 final Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        q.c().a(f.i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        final String action = intent.getAction();
        action.hashCode();
        Boolean b;
        if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                return;
            }
            b = Boolean.TRUE;
        }
        else {
            b = Boolean.FALSE;
        }
        this.d(b);
    }
    
    public Boolean i() {
        final Intent registerReceiver = super.b.registerReceiver((BroadcastReceiver)null, this.g());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        final String action = registerReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return null;
        }
        return Boolean.TRUE;
    }
}
