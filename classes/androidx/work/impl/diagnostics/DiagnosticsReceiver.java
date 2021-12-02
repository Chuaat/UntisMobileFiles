// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.diagnostics;

import androidx.work.f0;
import androidx.work.ListenableWorker;
import androidx.work.s;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.d0;
import androidx.annotation.k0;
import android.content.Intent;
import androidx.annotation.j0;
import android.content.Context;
import androidx.work.q;
import android.content.BroadcastReceiver;

public class DiagnosticsReceiver extends BroadcastReceiver
{
    private static final String a;
    
    static {
        a = q.f("DiagnosticsRcvr");
    }
    
    public void onReceive(@j0 final Context context, @k0 final Intent intent) {
        if (intent == null) {
            return;
        }
        q.c().a(DiagnosticsReceiver.a, "Requesting diagnostics", new Throwable[0]);
        try {
            d0.p(context).j(s.e(DiagnosticsWorker.class));
        }
        catch (IllegalStateException ex) {
            q.c().b(DiagnosticsReceiver.a, "WorkManager is not initialized", ex);
        }
    }
}
