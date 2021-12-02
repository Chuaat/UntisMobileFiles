// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import androidx.annotation.k0;
import androidx.annotation.i;
import android.os.IBinder;
import android.content.Intent;
import androidx.annotation.j0;
import android.app.Service;

public class c0 extends Service implements y
{
    private final t0 G;
    
    public c0() {
        this.G = new t0(this);
    }
    
    @j0
    public s getLifecycle() {
        return this.G.a();
    }
    
    @i
    @k0
    public IBinder onBind(@j0 final Intent intent) {
        this.G.b();
        return null;
    }
    
    @i
    public void onCreate() {
        this.G.c();
        super.onCreate();
    }
    
    @i
    public void onDestroy() {
        this.G.d();
        super.onDestroy();
    }
    
    @i
    public void onStart(@k0 final Intent intent, final int n) {
        this.G.e();
        super.onStart(intent, n);
    }
    
    @i
    public int onStartCommand(@k0 final Intent intent, final int n, final int n2) {
        return super.onStartCommand(intent, n, n2);
    }
}
