// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.constraints.trackers;

import android.content.IntentFilter;
import android.content.Intent;
import androidx.work.impl.utils.taskexecutor.a;
import androidx.annotation.j0;
import android.content.Context;
import androidx.work.q;
import android.content.BroadcastReceiver;
import androidx.annotation.t0;

@t0({ t0.a.H })
public abstract class c<T> extends d<T>
{
    private static final String h;
    private final BroadcastReceiver g;
    
    static {
        h = q.f("BrdcstRcvrCnstrntTrckr");
    }
    
    public c(@j0 final Context context, @j0 final a a) {
        super(context, a);
        this.g = new BroadcastReceiver() {
            public void onReceive(final Context context, final Intent intent) {
                if (intent != null) {
                    c.this.h(context, intent);
                }
            }
        };
    }
    
    @Override
    public void e() {
        q.c().a(c.h, String.format("%s: registering receiver", this.getClass().getSimpleName()), new Throwable[0]);
        super.b.registerReceiver(this.g, this.g());
    }
    
    @Override
    public void f() {
        q.c().a(c.h, String.format("%s: unregistering receiver", this.getClass().getSimpleName()), new Throwable[0]);
        super.b.unregisterReceiver(this.g);
    }
    
    public abstract IntentFilter g();
    
    public abstract void h(final Context p0, @j0 final Intent p1);
}
