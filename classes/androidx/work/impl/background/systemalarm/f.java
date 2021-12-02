// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.background.systemalarm;

import androidx.work.impl.model.r;
import androidx.annotation.j0;
import androidx.work.q;
import android.content.Context;
import androidx.annotation.t0;
import androidx.work.impl.e;

@t0({ t0.a.H })
public class f implements e
{
    private static final String H;
    private final Context G;
    
    static {
        H = q.f("SystemAlarmScheduler");
    }
    
    public f(@j0 final Context context) {
        this.G = context.getApplicationContext();
    }
    
    private void b(@j0 final r r) {
        q.c().a(f.H, String.format("Scheduling work with workSpecId %s", r.a), new Throwable[0]);
        this.G.startService(androidx.work.impl.background.systemalarm.b.f(this.G, r.a));
    }
    
    @Override
    public void a(@j0 final r... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            this.b(array[i]);
        }
    }
    
    @Override
    public boolean c() {
        return true;
    }
    
    @Override
    public void e(@j0 final String s) {
        this.G.startService(androidx.work.impl.background.systemalarm.b.g(this.G, s));
    }
}
