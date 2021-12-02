// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.x;
import androidx.annotation.w;
import java.util.concurrent.BlockingQueue;

final class v4 extends Thread
{
    private final Object G;
    private final BlockingQueue<u4<?>> H;
    @w("threadLifeCycleLock")
    private boolean I;
    final /* synthetic */ w4 J;
    
    public v4(final w4 j, final String name, final BlockingQueue<u4<?>> h) {
        this.J = j;
        this.I = false;
        x.k(name);
        x.k(h);
        this.G = new Object();
        this.H = h;
        this.setName(name);
    }
    
    private final void b() {
        synchronized (w4.n(this.J)) {
            if (!this.I) {
                w4.r(this.J).release();
                w4.n(this.J).notifyAll();
                if (this == w4.m(this.J)) {
                    w4.u(this.J, (v4)null);
                }
                else if (this == w4.l(this.J)) {
                    w4.t(this.J, (v4)null);
                }
                else {
                    this.J.a.c().o().a("Current scheduler thread is neither worker nor network");
                }
                this.I = true;
            }
        }
    }
    
    private final void c(final InterruptedException ex) {
        this.J.a.c().t().b(String.valueOf(this.getName()).concat(" was interrupted"), ex);
    }
    
    public final void a() {
        synchronized (this.G) {
            this.G.notifyAll();
        }
    }
    
    @Override
    public final void run() {
        int i = 0;
        while (i == 0) {
            try {
                w4.r(this.J).acquire();
                i = 1;
            }
            catch (InterruptedException ex) {
                this.c(ex);
            }
        }
        try {
            final int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                final u4 u4 = this.H.poll();
                if (u4 != null) {
                    int threadPriority2;
                    if (!u4.H) {
                        threadPriority2 = 10;
                    }
                    else {
                        threadPriority2 = threadPriority;
                    }
                    Process.setThreadPriority(threadPriority2);
                    u4.run();
                }
                else {
                    synchronized (this.G) {
                        if (this.H.peek() == null) {
                            w4.y(this.J);
                            try {
                                this.G.wait(30000L);
                            }
                            catch (InterruptedException ex2) {
                                this.c(ex2);
                            }
                        }
                        // monitorexit(this.G)
                        synchronized (w4.n(this.J)) {
                            if (this.H.peek() == null) {
                                if (this.J.a.w().y(null, a3.m0)) {
                                    this.b();
                                }
                                return;
                            }
                            continue;
                        }
                    }
                }
            }
        }
        finally {
            this.b();
        }
    }
}
