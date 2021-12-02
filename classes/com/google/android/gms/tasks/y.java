// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

import androidx.annotation.j0;
import d6.a;
import c6.h;
import java.util.concurrent.Executor;

final class y<TResult> implements i0<TResult>
{
    private final Executor a;
    private final Object b;
    @h
    @a("mLock")
    private e c;
    
    public y(@j0 final Executor a, @j0 final e c) {
        this.b = new Object();
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void b(@j0 final m<TResult> m) {
        if (m.t()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                // monitorexit(this.b)
                this.a.execute(new x(this));
            }
        }
    }
    
    @Override
    public final void zza() {
        synchronized (this.b) {
            this.c = null;
        }
    }
}
