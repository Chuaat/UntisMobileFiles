// 
// Decompiled by Procyon v0.5.36
// 

package androidx.arch.core.executor;

import androidx.annotation.j0;
import androidx.annotation.t0;

@t0({ t0.a.I })
public abstract class c
{
    public abstract void a(@j0 final Runnable p0);
    
    public void b(@j0 final Runnable runnable) {
        if (this.c()) {
            runnable.run();
        }
        else {
            this.d(runnable);
        }
    }
    
    public abstract boolean c();
    
    public abstract void d(@j0 final Runnable p0);
}
