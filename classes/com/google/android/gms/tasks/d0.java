// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

import androidx.annotation.j0;
import d6.a;
import java.util.concurrent.Executor;

final class d0<TResult> implements i0<TResult>
{
    private final Executor a;
    private final Object b;
    @c6.h
    @a("mLock")
    private h<? super TResult> c;
    
    public d0(@j0 final Executor a, @j0 final h<? super TResult> c) {
        this.b = new Object();
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void b(@j0 final m<TResult> m) {
        if (m.v()) {
            synchronized (this.b) {
                if (this.c == null) {
                    return;
                }
                // monitorexit(this.b)
                this.a.execute(new e0(this, m));
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
