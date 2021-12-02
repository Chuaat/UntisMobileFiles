// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import androidx.annotation.j0;
import d6.a;
import java.util.Queue;

final class h0<TResult>
{
    private final Object a;
    @a("mLock")
    private Queue<i0<TResult>> b;
    @a("mLock")
    private boolean c;
    
    h0() {
        this.a = new Object();
    }
    
    public final void a(@j0 final m<TResult> m) {
        synchronized (this.a) {
            if (this.b != null) {
                if (!this.c) {
                    this.c = true;
                    // monitorexit(this.a)
                    while (true) {
                        final Object a = this.a;
                        synchronized (this.a) {
                            final i0<TResult> i0 = this.b.poll();
                            if (i0 == null) {
                                this.c = false;
                                return;
                            }
                            // monitorexit(this.a)
                            i0.b(m);
                            continue;
                        }
                        break;
                    }
                }
            }
        }
    }
    
    public final void b(@j0 final i0<TResult> i0) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque<i0<TResult>>();
            }
            this.b.add(i0);
        }
    }
}
