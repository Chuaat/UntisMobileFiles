// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.work.impl.utils.o;
import androidx.annotation.g0;
import android.content.Context;
import androidx.work.q;
import androidx.annotation.t0;
import androidx.lifecycle.c0;

@t0({ t0.a.H })
public class SystemAlarmService extends c0 implements c
{
    private static final String J;
    private e H;
    private boolean I;
    
    static {
        J = q.f("SystemAlarmService");
    }
    
    @g0
    private void e() {
        (this.H = new e((Context)this)).m((e.c)this);
    }
    
    @g0
    @Override
    public void a() {
        this.I = true;
        q.c().a(SystemAlarmService.J, "All commands completed in dispatcher", new Throwable[0]);
        o.a();
        this.stopSelf();
    }
    
    @Override
    public void onCreate() {
        super.onCreate();
        this.e();
        this.I = false;
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        this.I = true;
        this.H.j();
    }
    
    @Override
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        super.onStartCommand(intent, n, n2);
        if (this.I) {
            q.c().d(SystemAlarmService.J, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.H.j();
            this.e();
            this.I = false;
        }
        if (intent != null) {
            this.H.a(intent, n2);
        }
        return 3;
    }
}
