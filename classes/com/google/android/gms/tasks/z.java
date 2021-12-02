// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

import androidx.annotation.j0;
import d6.a;
import c6.h;
import java.util.concurrent.Executor;

final class z<TResult> implements i0<TResult>
{
    private final Executor a;
    private final Object b;
    @h
    @a("mLock")
    private f<TResult> c;
    
    public z(@j0 final Executor a, @j0 final f<TResult> c) {
        this.b = new Object();
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void b(@j0 final m<TResult> m) {
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            // monitorexit(this.b)
            this.a.execute(new a0(this, m));
        }
    }
    
    @Override
    public final void zza() {
        synchronized (this.b) {
            this.c = null;
        }
    }
}
