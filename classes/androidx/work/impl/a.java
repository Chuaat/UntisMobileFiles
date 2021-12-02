// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl;

import androidx.annotation.b1;
import androidx.annotation.j0;
import androidx.core.os.g;
import android.os.Looper;
import android.os.Handler;
import androidx.annotation.t0;
import androidx.work.a0;

@t0({ t0.a.H })
public class a implements a0
{
    private final Handler a;
    
    public a() {
        this.a = g.a(Looper.getMainLooper());
    }
    
    @b1
    public a(@j0 final Handler a) {
        this.a = a;
    }
    
    @Override
    public void a(final long n, @j0 final Runnable runnable) {
        this.a.postDelayed(runnable, n);
    }
    
    @Override
    public void b(@j0 final Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }
    
    @j0
    public Handler c() {
        return this.a;
    }
}
